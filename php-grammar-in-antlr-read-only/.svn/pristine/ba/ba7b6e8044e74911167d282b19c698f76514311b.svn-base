package org.eclipse.php.internal.core.compiler.ast.parser;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.*;


public class SLAST extends CommonTree {
	
	public SLAST(Token t) { super(t); }
	
	public int startIndex;
	
	public int endIndex;
	
	public Set<Integer> indexSet;
	
	public void setIndexArray(Set<Integer> iSet) {
		indexSet = iSet;
	}
	
	public void setIndex(int sIndex, int eIndex) {
		startIndex = sIndex;
		endIndex = eIndex;
	}	
}