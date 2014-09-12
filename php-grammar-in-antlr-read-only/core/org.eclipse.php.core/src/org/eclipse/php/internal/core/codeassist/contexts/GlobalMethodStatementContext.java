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
package org.eclipse.php.internal.core.codeassist.contexts;

import org.eclipse.dltk.core.*;


/**
 * This context represents state when staying in a method top level statement.
 * <br/>Examples:
 * <pre>
 *  1. |
 *  2. pri|
 *  3. $v|
 *  etc...
 * </pre>
 * @author michael
 */
public final class GlobalMethodStatementContext extends AbstractGlobalStatementContext {
	
	private IMethod enclosingMethod;
	
	public boolean isValid(ISourceModule sourceModule, int offset, CompletionRequestor requestor) {
		if (!super.isValid(sourceModule, offset, requestor)) {
			return false;
		}
		
		// check whether enclosing element is a method
		try {
			IModelElement enclosingElement = sourceModule.getElementAt(offset);
			while (enclosingElement instanceof IField) {
				enclosingElement = enclosingElement.getParent();
			}
			if (!(enclosingElement instanceof IMethod)) {
				return false; 
			}
			enclosingMethod = (IMethod) enclosingElement;
		
		} catch (ModelException e) {
			if (DLTKCore.DEBUG_COMPLETION) {
				e.printStackTrace();
			}
		}
		return true;
	}

	public IMethod getEnclosingMethod() {
		return enclosingMethod;
	}
}
