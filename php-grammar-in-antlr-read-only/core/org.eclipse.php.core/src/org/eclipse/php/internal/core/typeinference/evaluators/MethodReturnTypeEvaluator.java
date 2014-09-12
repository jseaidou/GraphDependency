/*******************************************************************************
 * Copyright (c) 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Zend Technologies
 *******************************************************************************/
package org.eclipse.php.internal.core.typeinference.evaluators;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.ast.declarations.MethodDeclaration;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.core.*;
import org.eclipse.dltk.ti.GoalState;
import org.eclipse.dltk.ti.IContext;
import org.eclipse.dltk.ti.ISourceModuleContext;
import org.eclipse.dltk.ti.goals.ExpressionTypeGoal;
import org.eclipse.dltk.ti.goals.IGoal;
import org.eclipse.dltk.ti.types.IEvaluatedType;
import org.eclipse.php.internal.core.compiler.ast.nodes.PHPDocBlock;
import org.eclipse.php.internal.core.compiler.ast.nodes.PHPDocTag;
import org.eclipse.php.internal.core.compiler.ast.nodes.ReturnStatement;
import org.eclipse.php.internal.core.compiler.ast.parser.ASTUtils;
import org.eclipse.php.internal.core.typeinference.PHPClassType;
import org.eclipse.php.internal.core.typeinference.PHPModelUtils;
import org.eclipse.php.internal.core.typeinference.PHPSimpleTypes;
import org.eclipse.php.internal.core.typeinference.PHPTypeInferenceUtils;
import org.eclipse.php.internal.core.typeinference.goals.MethodElementReturnTypeGoal;

public class MethodReturnTypeEvaluator extends AbstractMethodReturnTypeEvaluator {

	private final List<IEvaluatedType> evaluated = new LinkedList<IEvaluatedType>();

	public MethodReturnTypeEvaluator(IGoal goal) {
		super(goal);
	}

	public IGoal[] init() {
		MethodElementReturnTypeGoal goal = (MethodElementReturnTypeGoal) getGoal();
		String methodName = goal.getMethodName();

		final List<IGoal> subGoals = new LinkedList<IGoal>();

		ISourceModule sourceModule = ((ISourceModuleContext) goal.getContext()).getSourceModule();
		ModuleDeclaration module = SourceParserUtil.getModuleDeclaration(sourceModule);

		for (IMethod method : getMethods()) {
			MethodDeclaration decl = null;
			try {
				decl = PHPModelUtils.getNodeByMethod(module, method);
			} catch (ModelException e) {
				if (DLTKCore.DEBUG) {
					e.printStackTrace();
				}
			}
			if (decl != null) {
				final IContext innerContext = ASTUtils.findContext(sourceModule, module, decl);

				ASTVisitor visitor = new ASTVisitor() {
					public boolean visitGeneral(ASTNode node) throws Exception {
						if (node instanceof ReturnStatement) {
							ReturnStatement statement = (ReturnStatement) node;
							Expression expr = statement.getExpr();
							if (expr == null) {
								evaluated.add(PHPSimpleTypes.VOID);
							} else {
								subGoals.add(new ExpressionTypeGoal(innerContext, expr));
							}
						}
						return super.visitGeneral(node);
					}
				};

				try {
					decl.traverse(visitor);
				} catch (Exception e) {
					if (DLTKCore.DEBUG) {
						e.printStackTrace();
					}
				}
			}
			if (method != null) {
				resolveMagicMethodDeclaration(method, methodName);
			}
		}

		return subGoals.toArray(new IGoal[subGoals.size()]);
	}

	/**
	 * Resolve magic methods defined by the @method tag
	 */
	private void resolveMagicMethodDeclaration(IMethod method, String methodName) {
		final IModelElement parent = method.getParent();
		if (parent.getElementType() != IModelElement.TYPE) {
			return;
		}

		IType type = (IType) parent;
		final PHPDocBlock docBlock = PHPModelUtils.getDocBlock(type);
		if (docBlock != null) {
			for (PHPDocTag tag : docBlock.getTags()) {
				final int tagKind = tag.getTagKind();
				if (tagKind == PHPDocTag.METHOD) {
					final String typeName = getTypeBinding(methodName, tag);
					if (typeName != null) {
						IEvaluatedType resolved = PHPSimpleTypes.fromString(typeName);
						if (resolved == null) {
							resolved = new PHPClassType(typeName);
						}
						evaluated.add(resolved);
					}
				}
			}
		}
	}

	/**
	 * Resolves the type from the @property tag
	 * @param variableName
	 * @param docTag
	 * @return the type of the given variable
	 */
	private String getTypeBinding(String methodName, PHPDocTag docTag) {
		final String[] split = docTag.getValue().trim().split("\\s+");
		if (split.length < 2) {
			return null;
		}
		if (split[1].equals(methodName)) {
			return split[0];
		} else if (split[1].length() > 2 && split[1].endsWith("()")) {
			final String substring = split[1].substring(0, split[1].length() - 2);
			return substring.equals(methodName) ? split[0] : null;
		}
		return null;
	}

	public IGoal[] subGoalDone(IGoal subgoal, Object result, GoalState state) {
		if (state != GoalState.RECURSIVE && result != null) {
			evaluated.add((IEvaluatedType) result);
		}
		return IGoal.NO_GOALS;
	}

	public Object produceResult() {
		return PHPTypeInferenceUtils.combineTypes(evaluated);
	}
}
