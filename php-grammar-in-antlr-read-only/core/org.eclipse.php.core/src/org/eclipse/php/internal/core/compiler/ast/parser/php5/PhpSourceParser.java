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
package org.eclipse.php.internal.core.compiler.ast.parser.php5;

import java.io.FileReader;
import java.io.Reader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.php.internal.core.compiler.ast.nodes.ExpressionStatement;
import org.eclipse.php.internal.core.compiler.ast.parser.AbstractPHPSourceParser;
import org.eclipse.php.internal.core.compiler.ast.parser.IErrorReporter;
import org.eclipse.php.internal.core.compiler.ast.parser.SLAST;
import org.eclipse.php.internal.core.compiler.ast.parser.StdErrReporter;

public class PhpSourceParser extends AbstractPHPSourceParser {

	public static TreeAdaptor tokenAdaptor = new CommonTreeAdaptor() {
		public Object create(Token token) {
			return new SLAST(token);
		}

		public Object dupNode(Object t) {
			if (t == null) {
				return null;
			}
			return create(((SLAST) t).token);
		}
	};

	public void printTree(CommonTree t, int indent) {
		if (t != null) {
			StringBuffer sb = new StringBuffer(indent);
			for (int i = 0; i < indent; i++)
				sb = sb.append("   ");
			for (int i = 0; i < t.getChildCount(); i++) {
				System.out.println(sb.toString() + t.getChild(i).toString());
				printTree((CommonTree) t.getChild(i), indent + 1);
			}
		}
	}

	public PhpSourceParser() {
		super();
	}

	public PhpSourceParser(String fileName) {
		super(fileName);
	}

	public ModuleDeclaration parse(Reader in, IProblemReporter reporter) throws Exception {

		ANTLRReaderStream input = new ANTLRReaderStream(in);
		//		CharStream input = new ANTLRInputStream(System.in);

		CompilerAstLexer lexer = new CompilerAstLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		CompilerAstParser parser = new CompilerAstParser(tokens);

		IErrorReporter errorReporter = new StdErrReporter();
		//CompilerAstLexer.setErrorReporter(errorReporter);
		//		parser.setErrorReporter(errorReporter);

		parser.setTreeAdaptor(tokenAdaptor);

		CompilerAstParser.php_source_return r = parser.php_source();

		//		Iterator iter = parser.getErrors().iterator();
		//		System.out.println("error");
		//		while (iter.hasNext()) {
		//			System.out.println(iter.next().toString());
		//		}
		//		System.out.println("over");

		SLAST t = (SLAST) r.getTree(); // get tree result

		CommonTreeNodeStream nodes = new CommonTreeNodeStream(tokenAdaptor, t);

		nodes.setTokenStream(tokens);

		TreePHP def = new TreePHP(nodes, parser);

		//			System.out.println("grammar over..");

		def.setTreeAdaptor(tokenAdaptor);

		TreePHP.php_source_return result = def.php_source();

		System.out.println("quote:" + def.getQuoteExpression());

		System.out.println("====================\nparser prog=============\n" + parser.getModuleDeclaration());

		return parse(parser);
	}
}
