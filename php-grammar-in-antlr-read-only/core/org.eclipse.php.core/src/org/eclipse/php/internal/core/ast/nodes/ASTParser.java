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
package org.eclipse.php.internal.core.ast.nodes;

import java.io.*;

import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;
import java_cup.runtime.lr_parser;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.php.internal.core.CoreMessages;
import org.eclipse.php.internal.core.PHPVersion;
import org.eclipse.php.internal.core.project.ProjectOptions;

/**
* A PHP language parser for creating abstract syntax trees (ASTs).<p>
* Example: Create basic AST from source string
* <pre>
* String source = ...;
* Program program = ASTParser.parse(source);  
* </pre>
*/
public class ASTParser {

	// version tags
	private static final Reader EMPTY_STRING_READER = new StringReader("");

	/**
	* THREAD SAFE AST PARSER STARTS HERE
	*/
	private final AST ast;
	private final ISourceModule sourceModule;

	private ASTParser(Reader reader, PHPVersion phpVersion, boolean useASPTags) throws IOException {
		this(reader, phpVersion, useASPTags, null);
	}

	private ASTParser(Reader reader, PHPVersion phpVersion, boolean useASPTags, ISourceModule sourceModule) throws IOException {

		this.sourceModule = sourceModule;
		this.ast = new AST(reader, phpVersion, useASPTags);
		this.ast.setDefaultNodeFlag(ASTNode.ORIGINAL);

		// set resolve binding property and the binding resolver 
		if (sourceModule != null) {
			this.ast.setFlag(AST.RESOLVED_BINDINGS);
			// try {
			this.ast.setBindingResolver(new DefaultBindingResolver(sourceModule, sourceModule.getOwner()));
			// } catch (ModelException e) {
			// throw new IOException("ModelException " + e.getMessage());
			// }
		}
	}

	/**
	* Factory methods for ASTParser
	*/
	public static ASTParser newParser(PHPVersion version) {
		try {
			return new ASTParser(new StringReader(""), version, false);
		} catch (IOException e) {
			assert false;
			// Since we use empty reader we cannot have an IOException here
			return null;
		}
	}
	
	/**
	* Factory methods for ASTParser
	*/
	public static ASTParser newParser(ISourceModule sourceModule) {
		PHPVersion phpVersion = ProjectOptions.getPhpVersion(sourceModule.getScriptProject().getProject());
		return newParser(phpVersion, sourceModule);
	}

	public static ASTParser newParser(PHPVersion version, ISourceModule sourceModule) {
		if (sourceModule == null) {
			throw new IllegalStateException("ASTParser - Can't parser with null ISourceModule");  
		}
		try {
			final ASTParser parser = new ASTParser(new StringReader(""), version, false, sourceModule);
			parser.setSource(sourceModule.getSourceAsCharArray());
			return parser;
		} catch (IOException e) {
			return null;
		} catch (ModelException e) {
			return null;
		}
	}

	public static ASTParser newParser(Reader reader, PHPVersion version) throws IOException {
		return new ASTParser(reader, version, false);
	}

	public static ASTParser newParser(Reader reader, PHPVersion version, boolean useASPTags) throws IOException {
		return new ASTParser(reader, version, useASPTags);
	}

	public static ASTParser newParser(Reader reader, PHPVersion version, boolean useASPTags, ISourceModule sourceModule) throws IOException {
		return new ASTParser(reader, version, useASPTags, sourceModule);
	}

	/**
	* Set the raw source that will be used on parsing
	* @throws IOException 
	*/
	public void setSource(char[] source) throws IOException {
		final CharArrayReader charArrayReader = new CharArrayReader(source);
		setSource(charArrayReader);
	}

	/**
	* Set source of the parser
	* @throws IOException 
	*/
	public void setSource(Reader source) throws IOException {
		this.ast.setSource(source);
	}
	
	/**
	 * Set the source from source module
	 * @throws IOException
	 * @throws ModelException 
	 */
	public void setSource(ISourceModule sourceModule) throws IOException, ModelException {
		this.ast.setSource(new CharArrayReader(sourceModule.getSourceAsCharArray()));
	}

	/**
	* This operation creates an abstract syntax tree for the given AST Factory
	* 
	* @param progressMonitor
	* @return Program that represents the equivalent AST 
	* @throws Exception - for exception occurs on the parsing step
	*/
	public Program createAST(IProgressMonitor progressMonitor) throws Exception {
		if (progressMonitor == null) {
			progressMonitor = new NullProgressMonitor();
		}

		progressMonitor.beginTask("Creating Abstract Syntax Tree for source...", 3);
		final Scanner lexer = this.ast.lexer();
		final lr_parser phpParser = this.ast.parser();
		progressMonitor.worked(1);
		phpParser.setScanner(lexer);
		progressMonitor.worked(2);
		final Symbol symbol = phpParser.parse();
		progressMonitor.done();
		if (symbol == null || !(symbol.value instanceof Program)) {
			return null;
		}
		Program p = (Program) symbol.value;
		AST ast = p.getAST();

		p.setSourceModule(sourceModule);

		// now reset the ast default node flag back to differntate between original nodes 
		ast.setDefaultNodeFlag(0);
		// Set the original modification count to the count after the creation of the Program.
		// This is important to allow the AST rewriting. 
		ast.setOriginalModificationCount(ast.modificationCount());
		return p;
	}

	/********************************************************************************
	* NOT THREAD SAFE IMPLEMENTATION STARTS HERE 
	*********************************************************************************/
	// php 5.3 analysis
	private static final org.eclipse.php.internal.core.ast.scanner.php53.PhpAstLexer PHP_AST_LEXER5_3 = new org.eclipse.php.internal.core.ast.scanner.php53.PhpAstLexer(ASTParser.EMPTY_STRING_READER);
	private static final org.eclipse.php.internal.core.ast.scanner.php53.PhpAstParser PHP_AST_PARSER5_3 = new org.eclipse.php.internal.core.ast.scanner.php53.PhpAstParser(PHP_AST_LEXER5_3);
	
	// php 5 analysis
	private static final org.eclipse.php.internal.core.ast.scanner.php5.PhpAstLexer PHP_AST_LEXER5 = new org.eclipse.php.internal.core.ast.scanner.php5.PhpAstLexer(ASTParser.EMPTY_STRING_READER);
	//private static final org.eclipse.php.internal.core.ast.scanner.php5.PhpAstParser PHP_AST_PARSER5 = new org.eclipse.php.internal.core.ast.scanner.php5.PhpAstParser(PHP_AST_LEXER5);

	// php 4 analysis 
	private static final org.eclipse.php.internal.core.ast.scanner.php4.PhpAstLexer PHP_AST_LEXER4 = new org.eclipse.php.internal.core.ast.scanner.php4.PhpAstLexer(ASTParser.EMPTY_STRING_READER);
	private static final org.eclipse.php.internal.core.ast.scanner.php4.PhpAstParser PHP_AST_PARSER4 = new org.eclipse.php.internal.core.ast.scanner.php4.PhpAstParser(PHP_AST_LEXER4);

	/**
	* @param phpCode String - represents the source code of the PHP program
	* @param aspTagsAsPhp boolean - true if % is used as PHP process intructor   
	* @return the {@link Program} node generated from the given source
	* @throws Exception
	* @deprecated use Thread-Safe ASTParser methods
	*/
	public static final Program parse(String phpCode, boolean aspTagsAsPhp) throws Exception {
		StringReader reader = new StringReader(phpCode);
		return parse(reader, aspTagsAsPhp, PHPVersion.PHP5);
	}

	/**
	* @param phpFile File - represents the source file of the PHP program
	* @param aspTagsAsPhp boolean - true if % is used as PHP process intructor   
	* @return the {@link Program} node generated from the given source PHP file
	* @throws Exception
	* @deprecated use Thread-Safe ASTParser methods
	*/
	public static final Program parse(File phpFile, boolean aspTagsAsPhp) throws Exception {
		final Reader reader = new FileReader(phpFile);
		return parse(reader, aspTagsAsPhp, PHPVersion.PHP5);
	}

	/**
	* @deprecated use Thread-Safe ASTParser methods
	*/
	public static final Program parse(final IDocument phpDocument, boolean aspTagsAsPhp, PHPVersion phpVersion) throws Exception {
		return parse(phpDocument, aspTagsAsPhp, phpVersion, 0, phpDocument.getLength());
	}

	/**
	* @deprecated use Thread-Safe ASTParser methods
	*/
	public static final Program parse(final IDocument phpDocument, boolean aspTagsAsPhp, PHPVersion phpVersion, final int offset, final int length) throws Exception {
		final Reader reader = new InputStreamReader(new InputStream() {
			private int index = offset;
			private final int size = offset + length;

			public int read() throws IOException {
				try {
					if (index < size) {
						return phpDocument.getChar(index++);
					}
					return -1;
				} catch (BadLocationException e) {
					throw new IOException(e.getMessage());
				}
			}
		});
		return parse(reader, aspTagsAsPhp, phpVersion);
	}

	/**
	* @deprecated use Thread-Safe ASTParser methods
	*/
	public static final Program parse(IDocument phpDocument, boolean aspTagsAsPhp) throws Exception {
		return parse(phpDocument, aspTagsAsPhp, PHPVersion.PHP5);
	}

	/**
	* @see #parse(String, boolean)
	* @deprecated use Thread-Safe ASTParser methods
	*/
	public static final Program parse(String phpCode) throws Exception {
		return parse(phpCode, true);
	}

	/**
	* @see #parse(File, boolean)
	* @deprecated use Thread-Safe ASTParser methods
	*/
	public static final Program parse(File phpFile) throws Exception {
		return parse(phpFile, true);
	}

	/**
	* @see #parse(Reader, boolean)
	* @deprecated use Thread-Safe ASTParser methods
	*/
	public static final Program parse(Reader reader) throws Exception {
		return parse(reader, true, PHPVersion.PHP5);
	}

	/**
	* @param reader
	* @return the {@link Program} node generated from the given {@link Reader}
	* @throws Exception
	* @deprecated use Thread-Safe ASTParser methods
	*/
	public synchronized static Program parse(Reader reader, boolean aspTagsAsPhp, PHPVersion phpVersion) throws Exception {
		AST ast = new AST(EMPTY_STRING_READER, phpVersion, false);
		final Scanner lexer = getLexer(ast, reader, phpVersion, aspTagsAsPhp);
		final lr_parser phpParser = getParser(phpVersion, ast);
		phpParser.setScanner(lexer);

		final Symbol symbol = phpParser.parse();
		return symbol == null ? null : (Program) symbol.value;
	}

	/**
	* Constructs a scanner from a given reader
	* @param ast2 
	* @param reader
	* @param phpVersion
	* @param aspTagsAsPhp
	* @return
	* @throws IOException
	*/
	private static Scanner getLexer(AST ast, Reader reader, PHPVersion phpVersion, boolean aspTagsAsPhp) throws IOException {
		if (PHPVersion.PHP4 == phpVersion) {
			final org.eclipse.php.internal.core.ast.scanner.php4.PhpAstLexer lexer4 = getLexer4(reader);
			lexer4.setUseAspTagsAsPhp(aspTagsAsPhp);
			lexer4.setAST(ast);
			return lexer4;
		} else if (PHPVersion.PHP5 == phpVersion) {
			final org.eclipse.php.internal.core.ast.scanner.php5.PhpAstLexer lexer5 = getLexer5(reader);
			lexer5.setUseAspTagsAsPhp(aspTagsAsPhp);
			lexer5.setAST(ast);
			return lexer5;
		} else if (PHPVersion.PHP5_3 == phpVersion) {
			final org.eclipse.php.internal.core.ast.scanner.php53.PhpAstLexer lexer53 = getLexer53(reader);
			lexer53.setUseAspTagsAsPhp(aspTagsAsPhp);
			lexer53.setAST(ast);
			return lexer53;
		} else {
			throw new IllegalArgumentException(CoreMessages.getString("ASTParser_1") + phpVersion);
		}
	}

	private static lr_parser getParser(PHPVersion phpVersion, AST ast) throws IOException {
		if (PHPVersion.PHP4 == phpVersion) {
			PHP_AST_PARSER4.setAST(ast);
			return PHP_AST_PARSER4;
		} else if (PHPVersion.PHP5 == phpVersion) {
//			PHP_AST_PARSER5.setAST(ast);
//			return PHP_AST_PARSER5;
			return null;
		} else if (PHPVersion.PHP5_3 == phpVersion) {
			PHP_AST_PARSER5_3.setAST(ast);
			return PHP_AST_PARSER5_3;
		} else {
			throw new IllegalArgumentException(CoreMessages.getString("ASTParser_1") + phpVersion);
		}

	}
	
	/**
	* @param reader
	* @return the singleton {@link org.eclipse.php.internal.core.ast.scanner.php53.PhpAstLexer}
	*/
	private static org.eclipse.php.internal.core.ast.scanner.php53.PhpAstLexer getLexer53(Reader reader) throws IOException {
		final org.eclipse.php.internal.core.ast.scanner.php53.PhpAstLexer phpAstLexer53 = ASTParser.PHP_AST_LEXER5_3;
		phpAstLexer53.yyreset(reader);
		phpAstLexer53.resetCommentList();
		return phpAstLexer53;
	}

	/**
	* @param reader
	* @return the singleton {@link org.eclipse.php.internal.core.ast.scanner.php5.PhpAstLexer}
	*/
	private static org.eclipse.php.internal.core.ast.scanner.php5.PhpAstLexer getLexer5(Reader reader) throws IOException {
		final org.eclipse.php.internal.core.ast.scanner.php5.PhpAstLexer phpAstLexer5 = ASTParser.PHP_AST_LEXER5;
		phpAstLexer5.yyreset(reader);
		phpAstLexer5.resetCommentList();
		return phpAstLexer5;
	}

	/**
	* @param reader
	* @return the singleton {@link org.eclipse.php.internal.core.ast.scanner.php4.PhpAstLexer}
	*/
	private static org.eclipse.php.internal.core.ast.scanner.php4.PhpAstLexer getLexer4(Reader reader) throws IOException {
		final org.eclipse.php.internal.core.ast.scanner.php4.PhpAstLexer phpAstLexer4 = ASTParser.PHP_AST_LEXER4;
		phpAstLexer4.yyreset(reader);
		phpAstLexer4.resetCommentList();
		return phpAstLexer4;
	}
}
