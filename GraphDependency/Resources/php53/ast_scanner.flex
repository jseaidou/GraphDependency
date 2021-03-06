/*******************************************************************************
 * Copyright (c) 2006 Zend Corporation and IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Zend and IBM - Initial implementation
 *******************************************************************************/

package box.php;

import java.util.LinkedList;
import java.util.Stack;

import box.ast.lexer.IASTLexer;
import box.ast.nodes.Comment;
import box.ast.nodes.AST;

import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;
import java_cup.sym;

%%

%class PHPASTLexer
%public
%unicode
%line

/*%cup*/
%implements IASTLexer
%function next_token
%type java_cup.runtime.Symbol
%eofval{
    return createSymbol(sym.EOF);
%eofval}
%eofclose

%caseless

%standalone
%state ST_IN_SCRIPTING
%state ST_DOUBLE_QUOTES
%state ST_BACKQUOTE
%state ST_HEREDOC
%state ST_END_HEREDOC
%state ST_NOWDOC
%state ST_LOOKING_FOR_PROPERTY
%state ST_LOOKING_FOR_VARNAME
%state ST_VAR_OFFSET
%state ST_COMMENT
%state ST_DOCBLOCK
%state ST_ONE_LINE_COMMENT
%{
    private final LinkedList<Comment> commentList = new LinkedList<Comment>();
    private String heredoc = null;
    private boolean asp_tags = false;
    private boolean short_tags_allowed = true;
    private Stack<Integer> stack = new Stack<Integer>();
    private char yy_old_buffer[] = new char[ZZ_BUFFERSIZE];
    private int yy_old_pushbackPos;
    protected int commentStartPosition;

    private AST ast;

    public void setAST(AST ast) {
        this.ast = ast;
    }
    
    public void setInScriptingState() {
        yybegin(ST_IN_SCRIPTING);
    }

    public void resetCommentList() {
        commentList.clear();
    }
    
    public LinkedList<Comment> getCommentList() {
        return commentList;
    }    
    
    public boolean isEOF() {
       return zzAtEOF;
    }
    protected void addComment(int type) {
        int leftPosition = getTokenStartPosition();
        Comment comment = new Comment(commentStartPosition, leftPosition + getTokenLength(), ast, type);
        commentList.add(comment);
    }    
    
    public void setUseAspTagsAsPhp(boolean useAspTagsAsPhp) {
        asp_tags = useAspTagsAsPhp;
    }
    
    private void pushState(int state) {
        stack.push(zzLexicalState);
        yybegin(state);
    }

    private void popState() {
        yybegin(stack.pop().intValue());
    }

    public int getCurrentLine() {
        return yyline;
    }

    protected int getTokenStartPosition() {
        return zzStartRead - zzPushbackPos;
    }

    protected int getTokenLength() {
        return zzMarkedPos - zzStartRead;
    }

    public int getLength() {
        return zzEndRead - zzPushbackPos;
    }
    
    private void handleCommentStart() {
        commentStartPosition = getTokenStartPosition();
    }
    
    private void handleLineCommentEnd() {
         addComment(Comment.TYPE_SINGLE_LINE);
    }
    
    private void handleMultilineCommentEnd() {
        addComment(Comment.TYPE_MULTILINE);
    }

    private void handlePHPDocEnd() {
        addComment(Comment.TYPE_PHPDOC);
    }
    
    protected void handleVarComment() {
        commentStartPosition = zzStartRead;
        addComment(Comment.TYPE_MULTILINE);
    }
        
    private Symbol createFullSymbol(int symbolNumber) {
        Symbol symbol = createSymbol(symbolNumber);
        symbol.value = yytext();
        return symbol;
    }

    protected Symbol createSymbol(int symbolNumber) {
        int leftPosition = getTokenStartPosition();
        return new Symbol(symbolNumber, leftPosition, leftPosition + getTokenLength());
    }

    public int[] getParamenters(){
        return new int[]{zzMarkedPos, zzPushbackPos, zzCurrentPos, zzStartRead, zzEndRead, yyline};
    }
    
    private boolean parsePHPDoc(){
        return false;
    }
    
    /*protected boolean parsePHPDoc(){    
        final IDocumentorLexer documentorLexer = getDocumentorLexer(zzReader);
        if(documentorLexer == null){
            return false;
        }
        yypushback(zzMarkedPos - zzStartRead);
        int[] parameters = getParamenters();
        documentorLexer.reset(zzReader, zzBuffer, parameters);
        Object phpDocBlock = documentorLexer.parse();
        commentList.add(phpDocBlock);
        reset(zzReader, documentorLexer.getBuffer(), documentorLexer.getParamenters());
        return true;
    }
    
    
    protected IDocumentorLexer getDocumentorLexer(Reader  reader) {
        return null;
    }*/
    
    public void reset(java.io.Reader  reader, char[] buffer, int[] parameters){
        this.zzReader = reader;
        this.zzBuffer = buffer;
        this.zzMarkedPos = parameters[0];
        this.zzPushbackPos = parameters[1];
        this.zzCurrentPos = parameters[2];
        this.zzStartRead = parameters[3];
        this.zzEndRead = parameters[4];
        this.yyline = parameters[5];  
        this.yychar = this.zzStartRead - this.zzPushbackPos;
    }

%}

LNUM=[0-9]+
DNUM=([0-9]*"."[0-9]+)|([0-9]+"."[0-9]*)
EXPONENT_DNUM=(({LNUM}|{DNUM})[eE][+-]?{LNUM})
HNUM="0x"[0-9a-fA-F]+
LABEL=[a-zA-Z_\x7f-\xff][a-zA-Z0-9_\x7f-\xff]*
WHITESPACE=[ \n\r\t]+
TABS_AND_SPACES=[ \t]*
ANY_CHAR=[^]
NEWLINE=("\r"|"\n"|"\r\n")
DOUBLE_QUOTES_LITERAL_DOLLAR=("$"+([^a-zA-Z_\x7f-\xff$\"\\{]|("\\"{ANY_CHAR})))
BACKQUOTE_LITERAL_DOLLAR=("$"+([^a-zA-Z_\x7f-\xff$`\\{]|("\\"{ANY_CHAR})))
HEREDOC_LITERAL_DOLLAR=("$"+([^a-zA-Z_\x7f-\xff$\n\r\\{]|("\\"[^\n\r])))
HEREDOC_NEWLINE=((({LABEL}";"?((("{"+|"$"+)"\\"?)|"\\"))|(("{"*|"$"*)"\\"?)){NEWLINE})
HEREDOC_CURLY_OR_ESCAPE_OR_DOLLAR=(("{"+[^$\n\r\\{])|("{"*"\\"[^\n\r])|{HEREDOC_LITERAL_DOLLAR})
HEREDOC_NON_LABEL=([^a-zA-Z_\x7f-\xff$\n\r\\{]|{HEREDOC_CURLY_OR_ESCAPE_OR_DOLLAR})
HEREDOC_LABEL_NO_NEWLINE=({LABEL}([^a-zA-Z0-9_\x7f-\xff;$\n\r\\{]|(";"[^$\n\r\\{])|(";"?{HEREDOC_CURLY_OR_ESCAPE_OR_DOLLAR})))
DOUBLE_QUOTES_CHARS=("{"*([^$\"\\{]|("\\"{ANY_CHAR}))|{DOUBLE_QUOTES_LITERAL_DOLLAR})
BACKQUOTE_CHARS=("{"*([^$`\\{]|("\\"{ANY_CHAR}))|{BACKQUOTE_LITERAL_DOLLAR})
HEREDOC_CHARS=("{"*([^$\n\r\\{]|("\\"[^\n\r]))|{HEREDOC_LITERAL_DOLLAR}|({HEREDOC_NEWLINE}+({HEREDOC_NON_LABEL}|{HEREDOC_LABEL_NO_NEWLINE})))
NOWDOC_CHARS=([^\n\r]|{NEWLINE}+([^a-zA-Z_\x7f-\xff\n\r]|({LABEL}([^a-zA-Z0-9_\x7f-\xff;\n\r]|(";"[^\n\r])))))

%%

<ST_IN_SCRIPTING>"exit" {
    return createFullSymbol(PHPParserConstants.T_EXIT);
}

<ST_IN_SCRIPTING>"die" {
    return createFullSymbol(PHPParserConstants.T_EXIT);
}

<ST_IN_SCRIPTING>"function" {
    return createSymbol(PHPParserConstants.T_FUNCTION);
}

<ST_IN_SCRIPTING>"const" {
    return createSymbol(PHPParserConstants.T_CONST);
}

<ST_IN_SCRIPTING>"return" {
    return createSymbol(PHPParserConstants.T_RETURN);
}

<ST_IN_SCRIPTING>"try" {
    return createSymbol(PHPParserConstants.T_TRY);
}

<ST_IN_SCRIPTING>"catch" {
    return createSymbol(PHPParserConstants.T_CATCH);
}

<ST_IN_SCRIPTING>"throw" {
    return createSymbol(PHPParserConstants.T_THROW);
}

<ST_IN_SCRIPTING>"if" {
    return createSymbol(PHPParserConstants.T_IF);
}

<ST_IN_SCRIPTING>"elseif" {
    return createSymbol(PHPParserConstants.T_ELSEIF);
}

<ST_IN_SCRIPTING>"endif" {
    return createSymbol(PHPParserConstants.T_ENDIF);
}

<ST_IN_SCRIPTING>"else" {
    return createSymbol(PHPParserConstants.T_ELSE);
}

<ST_IN_SCRIPTING>"while" {
    return createSymbol(PHPParserConstants.T_WHILE);
}

<ST_IN_SCRIPTING>"endwhile" {
    return createSymbol(PHPParserConstants.T_ENDWHILE);
}

<ST_IN_SCRIPTING>"do" {
    return createSymbol(PHPParserConstants.T_DO);
}

<ST_IN_SCRIPTING>"for" {
    return createSymbol(PHPParserConstants.T_FOR);
}

<ST_IN_SCRIPTING>"endfor" {
    return createSymbol(PHPParserConstants.T_ENDFOR);
}

<ST_IN_SCRIPTING>"foreach" {
    return createSymbol(PHPParserConstants.T_FOREACH);
}

<ST_IN_SCRIPTING>"endforeach" {
    return createSymbol(PHPParserConstants.T_ENDFOREACH);
}

<ST_IN_SCRIPTING>"declare" {
    return createSymbol(PHPParserConstants.T_DECLARE);
}

<ST_IN_SCRIPTING>"enddeclare" {
    return createSymbol(PHPParserConstants.T_ENDDECLARE);
}

<ST_IN_SCRIPTING>"instanceof" {
    return createSymbol(PHPParserConstants.T_INSTANCEOF);
}

<ST_IN_SCRIPTING>"as" {
    return createSymbol(PHPParserConstants.T_AS);
}

<ST_IN_SCRIPTING>"switch" {
    return createSymbol(PHPParserConstants.T_SWITCH);
}

<ST_IN_SCRIPTING>"endswitch" {
    return createSymbol(PHPParserConstants.T_ENDSWITCH);
}

<ST_IN_SCRIPTING>"case" {
    return createSymbol(PHPParserConstants.T_CASE);
}

<ST_IN_SCRIPTING>"default" {
    return createSymbol(PHPParserConstants.T_DEFAULT);
}

<ST_IN_SCRIPTING>"break" {
    return createSymbol(PHPParserConstants.T_BREAK);
}

<ST_IN_SCRIPTING>"continue" {
    return createSymbol(PHPParserConstants.T_CONTINUE);
}

<ST_IN_SCRIPTING>"goto" {
     return createSymbol(PHPParserConstants.T_GOTO);
}

<ST_IN_SCRIPTING>"echo" {
    return createSymbol(PHPParserConstants.T_ECHO);
}

<ST_IN_SCRIPTING>"print" {
    return createSymbol(PHPParserConstants.T_PRINT);
}

<ST_IN_SCRIPTING>"class" {
    return createSymbol(PHPParserConstants.T_CLASS);
}

<ST_IN_SCRIPTING>"interface" {
    return createSymbol(PHPParserConstants.T_INTERFACE);
}

<ST_IN_SCRIPTING>"extends" {
    return createSymbol(PHPParserConstants.T_EXTENDS);
}

<ST_IN_SCRIPTING>"implements" {
    return createSymbol(PHPParserConstants.T_IMPLEMENTS);
}

<ST_IN_SCRIPTING>"->" {
    pushState(ST_LOOKING_FOR_PROPERTY);
    return createSymbol(PHPParserConstants.T_OBJECT_OPERATOR);
}

<ST_IN_SCRIPTING,ST_LOOKING_FOR_PROPERTY>{WHITESPACE}+ {
}

<ST_LOOKING_FOR_PROPERTY>"->" {
    return createSymbol(PHPParserConstants.T_OBJECT_OPERATOR);
}

<ST_LOOKING_FOR_PROPERTY>{LABEL} {
    popState();
    return createFullSymbol(PHPParserConstants.T_STRING);
}

<ST_LOOKING_FOR_PROPERTY>{ANY_CHAR} {
    yypushback(yylength());
    popState();
}

<ST_IN_SCRIPTING>"::" {
    return createSymbol(PHPParserConstants.T_PAAMAYIM_NEKUDOTAYIM);
}

<ST_IN_SCRIPTING>"\\" {
    return createSymbol(PHPParserConstants.T_NS_SEPARATOR);
}

<ST_IN_SCRIPTING>"new" {
    return createSymbol(PHPParserConstants.T_NEW);
}

<ST_IN_SCRIPTING>"clone" {
    return createSymbol(PHPParserConstants.T_CLONE);
}

<ST_IN_SCRIPTING>"var" {
    return createSymbol(PHPParserConstants.T_VAR);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("int"|"integer"){TABS_AND_SPACES}")" {
    return createSymbol(PHPParserConstants.T_INT_CAST);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("real"|"double"|"float"){TABS_AND_SPACES}")" {
    return createSymbol(PHPParserConstants.T_DOUBLE_CAST);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}"string"{TABS_AND_SPACES}")" {
    return createSymbol(PHPParserConstants.T_STRING_CAST);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}"binary"{TABS_AND_SPACES}")" {
    return createSymbol(PHPParserConstants.T_STRING_CAST);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}"array"{TABS_AND_SPACES}")" {
    return createSymbol(PHPParserConstants.T_ARRAY_CAST);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}"object"{TABS_AND_SPACES}")" {
    return createSymbol(PHPParserConstants.T_OBJECT_CAST);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("bool"|"boolean"){TABS_AND_SPACES}")" {
    return createSymbol(PHPParserConstants.T_BOOL_CAST);
}

<ST_IN_SCRIPTING>"("{TABS_AND_SPACES}("unset"){TABS_AND_SPACES}")" {
    return createSymbol(PHPParserConstants.T_UNSET_CAST);
}

<ST_IN_SCRIPTING>"eval" {
    return createSymbol(PHPParserConstants.T_EVAL);
}

<ST_IN_SCRIPTING>"include" {
    return createSymbol(PHPParserConstants.T_INCLUDE);
}

<ST_IN_SCRIPTING>"include_once" {
    return createSymbol(PHPParserConstants.T_INCLUDE_ONCE);
}

<ST_IN_SCRIPTING>"require" {
    return createSymbol(PHPParserConstants.T_REQUIRE);
}

<ST_IN_SCRIPTING>"require_once" {
    return createSymbol(PHPParserConstants.T_REQUIRE_ONCE);
}

<ST_IN_SCRIPTING>"namespace" {
     return createSymbol(PHPParserConstants.T_NAMESPACE);
}

<ST_IN_SCRIPTING>"use" {
    return createSymbol(PHPParserConstants.T_USE);
}

<ST_IN_SCRIPTING>"global" {
    return createSymbol(PHPParserConstants.T_GLOBAL);
}

<ST_IN_SCRIPTING>"isset" {
    return createSymbol(PHPParserConstants.T_ISSET);
}

<ST_IN_SCRIPTING>"empty" {
    return createSymbol(PHPParserConstants.T_EMPTY);
}

<ST_IN_SCRIPTING>"__halt_compiler" {
    return createSymbol(PHPParserConstants.T_HALT_COMPILER);
}
<ST_IN_SCRIPTING>"static" {
    return createSymbol(PHPParserConstants.T_STATIC);
}

<ST_IN_SCRIPTING>"abstract" {
    return createSymbol(PHPParserConstants.T_ABSTRACT);
}

<ST_IN_SCRIPTING>"final" {
    return createSymbol(PHPParserConstants.T_FINAL);
}

<ST_IN_SCRIPTING>"private" {
    return createSymbol(PHPParserConstants.T_PRIVATE);
}

<ST_IN_SCRIPTING>"protected" {
    return createSymbol(PHPParserConstants.T_PROTECTED);
}

<ST_IN_SCRIPTING>"public" {
    return createSymbol(PHPParserConstants.T_PUBLIC);
}

<ST_IN_SCRIPTING>"unset" {
    return createSymbol(PHPParserConstants.T_UNSET);
}

<ST_IN_SCRIPTING>"=>" {
    return createSymbol(PHPParserConstants.T_DOUBLE_ARROW);
}

<ST_IN_SCRIPTING>"list" {
    return createSymbol(PHPParserConstants.T_LIST);
}

<ST_IN_SCRIPTING>"array" {
    return createSymbol(PHPParserConstants.T_ARRAY);
}

<ST_IN_SCRIPTING>"++" {
    return createSymbol(PHPParserConstants.T_INC);
}

<ST_IN_SCRIPTING>"--" {
    return createSymbol(PHPParserConstants.T_DEC);
}

<ST_IN_SCRIPTING>"===" {
    return createSymbol(PHPParserConstants.T_IS_IDENTICAL);
}

<ST_IN_SCRIPTING>"!==" {
    return createSymbol(PHPParserConstants.T_IS_NOT_IDENTICAL);
}

<ST_IN_SCRIPTING>"==" {
    return createSymbol(PHPParserConstants.T_IS_EQUAL);
}

<ST_IN_SCRIPTING>"!="|"<>" {
    return createSymbol(PHPParserConstants.T_IS_NOT_EQUAL);
}

<ST_IN_SCRIPTING>"<=" {
    return createSymbol(PHPParserConstants.T_IS_SMALLER_OR_EQUAL);
}

<ST_IN_SCRIPTING>">=" {
    return createSymbol(PHPParserConstants.T_IS_GREATER_OR_EQUAL);
}

<ST_IN_SCRIPTING>"+=" {
    return createSymbol(PHPParserConstants.T_PLUS_EQUAL);
}

<ST_IN_SCRIPTING>"-=" {
    return createSymbol(PHPParserConstants.T_MINUS_EQUAL);
}

<ST_IN_SCRIPTING>"*=" {
    return createSymbol(PHPParserConstants.T_MUL_EQUAL);
}

<ST_IN_SCRIPTING>"/=" {
    return createSymbol(PHPParserConstants.T_DIV_EQUAL);
}

<ST_IN_SCRIPTING>".=" {
    return createSymbol(PHPParserConstants.T_CONCAT_EQUAL);
}

<ST_IN_SCRIPTING>"%=" {
    return createSymbol(PHPParserConstants.T_MOD_EQUAL);
}

<ST_IN_SCRIPTING>"<<=" {
    return createSymbol(PHPParserConstants.T_SL_EQUAL);
}

<ST_IN_SCRIPTING>">>=" {
    return createSymbol(PHPParserConstants.T_SR_EQUAL);
}

<ST_IN_SCRIPTING>"&=" {
    return createSymbol(PHPParserConstants.T_AND_EQUAL);
}

<ST_IN_SCRIPTING>"|=" {
    return createSymbol(PHPParserConstants.T_OR_EQUAL);
}

<ST_IN_SCRIPTING>"^=" {
    return createSymbol(PHPParserConstants.T_XOR_EQUAL);
}

<ST_IN_SCRIPTING>"||" {
    return createSymbol(PHPParserConstants.T_BOOLEAN_OR);
}

<ST_IN_SCRIPTING>"&&" {
    return createSymbol(PHPParserConstants.T_BOOLEAN_AND);
}

<ST_IN_SCRIPTING>"OR" {
    return createSymbol(PHPParserConstants.T_LOGICAL_OR);
}

<ST_IN_SCRIPTING>"AND" {
    return createSymbol(PHPParserConstants.T_LOGICAL_AND);
}

<ST_IN_SCRIPTING>"XOR" {
    return createSymbol(PHPParserConstants.T_LOGICAL_XOR);
}

<ST_IN_SCRIPTING>"<<" {
    return createSymbol(PHPParserConstants.T_SL);
}

<ST_IN_SCRIPTING>">>" {
    return createSymbol(PHPParserConstants.T_SR);
}

// TOKENS
<ST_IN_SCRIPTING> {
    ";"                     {return createSymbol(PHPParserConstants.T_SEMICOLON);}
    ":"                     {return createSymbol(PHPParserConstants.T_NEKUDOTAIM);}
    ","                     {return createSymbol(PHPParserConstants.T_COMMA);}
    "."                     {return createSymbol(PHPParserConstants.T_NEKUDA);}
    "["                     {return createSymbol(PHPParserConstants.T_OPEN_RECT);}
    "]"                     {return createSymbol(PHPParserConstants.T_CLOSE_RECT);}
    "("                     {return createSymbol(PHPParserConstants.T_OPEN_PARENTHESE);}
    ")"                     {return createSymbol(PHPParserConstants.T_CLOSE_PARENTHESE);}
    "|"                     {return createSymbol(PHPParserConstants.T_OR);}
    "^"                     {return createSymbol(PHPParserConstants.T_KOVA);}
    "&"                     {return createSymbol(PHPParserConstants.T_REFERENCE);}
    "+"                     {return createSymbol(PHPParserConstants.T_PLUS);}
    "-"                     {return createSymbol(PHPParserConstants.T_MINUS);}
    "/"                     {return createSymbol(PHPParserConstants.T_DIV);}
    "*"                     {return createSymbol(PHPParserConstants.T_TIMES);}
    "="                     {return createSymbol(PHPParserConstants.T_EQUAL);}
    "%"                     {return createSymbol(PHPParserConstants.T_PRECENT);}
    "!"                     {return createSymbol(PHPParserConstants.T_NOT);}
    "~"                     {return createSymbol(PHPParserConstants.T_TILDA);}
    "$"                     {return createSymbol(PHPParserConstants.T_DOLLAR);}
    "<"                     {return createSymbol(PHPParserConstants.T_RGREATER);}
    ">"                     {return createSymbol(PHPParserConstants.T_LGREATER);}
    "?"                     {return createSymbol(PHPParserConstants.T_QUESTION_MARK);}
    "@"                     {return createSymbol(PHPParserConstants.T_AT);}
}

<ST_IN_SCRIPTING>"{" {
    pushState(ST_IN_SCRIPTING);
    return createSymbol(PHPParserConstants.T_CURLY_OPEN);

}

<ST_DOUBLE_QUOTES,ST_BACKQUOTE,ST_HEREDOC>"${" {
    pushState(ST_LOOKING_FOR_VARNAME);
    return createSymbol(PHPParserConstants.T_DOLLAR_OPEN_CURLY_BRACES);
}

<ST_IN_SCRIPTING>"}" {
    /* This is a temporary fix which is dependant on flex and it's implementation */
    if (!stack.empty()) {
        popState();
    }
    return createSymbol(PHPParserConstants.T_CURLY_CLOSE);
}

<ST_LOOKING_FOR_VARNAME>{LABEL} {
    popState();
    pushState(ST_IN_SCRIPTING);
    return createFullSymbol(PHPParserConstants.T_STRING_VARNAME);
}

<ST_LOOKING_FOR_VARNAME>{ANY_CHAR} {
    yypushback(yylength());
    popState();
    pushState(ST_IN_SCRIPTING);
}

<ST_IN_SCRIPTING>{LNUM} {
    return createFullSymbol(PHPParserConstants.T_LNUMBER);
}

<ST_IN_SCRIPTING>{HNUM} {
    return createFullSymbol(PHPParserConstants.T_DNUMBER);
}

<ST_VAR_OFFSET>[0]|([1-9][0-9]*) { /* Offset could be treated as a long */
    return createFullSymbol(PHPParserConstants.T_NUM_STRING);
}

<ST_VAR_OFFSET>{LNUM}|{HNUM} { /* treat numbers (almost) as strings inside encapsulated strings */
    return createFullSymbol(PHPParserConstants.T_NUM_STRING);
}

<ST_IN_SCRIPTING>{DNUM}|{EXPONENT_DNUM} {
    return createFullSymbol(PHPParserConstants.T_DNUMBER);
}

<ST_IN_SCRIPTING>"__CLASS__" {
    return createSymbol(PHPParserConstants.T_CLASS_C);
}

<ST_IN_SCRIPTING>"__FUNCTION__" {
    return createSymbol(PHPParserConstants.T_FUNC_C);
}

<ST_IN_SCRIPTING>"__METHOD__" {
    return createSymbol(PHPParserConstants.T_METHOD_C);
}

<ST_IN_SCRIPTING>"__LINE__" {
    return createSymbol(PHPParserConstants.T_LINE);
}

<ST_IN_SCRIPTING>"__FILE__" {
    return createSymbol(PHPParserConstants.T_FILE);
}

<ST_IN_SCRIPTING>"__DIR__" {
     return createSymbol(PHPParserConstants.T_DIR);
}

<ST_IN_SCRIPTING>"__NAMESPACE__" {
    return createSymbol(PHPParserConstants.T_NS_C);
}

<YYINITIAL>(([^<]|"<"[^?%s<])+)|"<s"|"<" {
    return createSymbol(PHPParserConstants.T_INLINE_HTML);
}

<YYINITIAL>"<?"|"<script"{WHITESPACE}+"language"{WHITESPACE}*"="{WHITESPACE}*("php"|"\"php\""|"\'php\'"){WHITESPACE}*">" {
    if (short_tags_allowed || yylength()>2) { /* yyleng>2 means it's not <? but <script> */
        yybegin(ST_IN_SCRIPTING);
        //return T_OPEN_TAG;
    } else {
        return createSymbol(PHPParserConstants.T_INLINE_HTML);
    }
}

<YYINITIAL>"<%="|"<?=" {
    String text = yytext();
    if ((text.charAt(1)=='%' && asp_tags)
        || (text.charAt(1)=='?' && short_tags_allowed)) {
        yybegin(ST_IN_SCRIPTING);
        //return T_OPEN_TAG_WITH_ECHO;
    } else {
        return createSymbol(PHPParserConstants.T_INLINE_HTML);
    }
}

<YYINITIAL>"<%" {
    if (asp_tags) {
        yybegin(ST_IN_SCRIPTING);
        //return T_OPEN_TAG;
    } else {
        return createSymbol(PHPParserConstants.T_INLINE_HTML);
    }
}

<YYINITIAL>"<?php"([ \t]|{NEWLINE}) {
    yybegin(ST_IN_SCRIPTING);
    //return T_OPEN_TAG;
}

<ST_IN_SCRIPTING,ST_DOUBLE_QUOTES,ST_HEREDOC,ST_BACKQUOTE,ST_VAR_OFFSET>"$"{LABEL} {
    return createFullSymbol(PHPParserConstants.T_VARIABLE);
}

<ST_DOUBLE_QUOTES,ST_HEREDOC,ST_BACKQUOTE>"$"{LABEL}"->"[a-zA-Z_\x7f-\xff] {
    yypushback(3);
    pushState(ST_LOOKING_FOR_PROPERTY);
    return createFullSymbol(PHPParserConstants.T_VARIABLE);
}

<ST_DOUBLE_QUOTES,ST_HEREDOC,ST_BACKQUOTE>"$"{LABEL}"[" {
    yypushback(1);
    pushState(ST_VAR_OFFSET);
    return createFullSymbol(PHPParserConstants.T_VARIABLE);
}

<ST_VAR_OFFSET>"]" {
    popState();
    return createSymbol(PHPParserConstants.T_CLOSE_RECT);
}

//this is instead {TOKENS}|[{}"`]
<ST_VAR_OFFSET> {
    ";"                     {return createSymbol(PHPParserConstants.T_SEMICOLON);}
    ":"                     {return createSymbol(PHPParserConstants.T_NEKUDOTAIM);}
    ","                     {return createSymbol(PHPParserConstants.T_COMMA);}
    "."                     {return createSymbol(PHPParserConstants.T_NEKUDA);}
    "["                     {return createSymbol(PHPParserConstants.T_OPEN_RECT);}
//    "]"                     {return createSymbol(PHPParserConstants.T_CLOSE_RECT);} //we dont need this line because the rule before deals with it
    "("                     {return createSymbol(PHPParserConstants.T_OPEN_PARENTHESE);}
    ")"                     {return createSymbol(PHPParserConstants.T_CLOSE_PARENTHESE);}
    "|"                     {return createSymbol(PHPParserConstants.T_OR);}
    "^"                     {return createSymbol(PHPParserConstants.T_KOVA);}
    "&"                     {return createSymbol(PHPParserConstants.T_REFERENCE);}
    "+"                     {return createSymbol(PHPParserConstants.T_PLUS);}
    "-"                     {return createSymbol(PHPParserConstants.T_MINUS);}
    "/"                     {return createSymbol(PHPParserConstants.T_DIV);}
    "*"                     {return createSymbol(PHPParserConstants.T_TIMES);}
    "="                     {return createSymbol(PHPParserConstants.T_EQUAL);}
    "%"                     {return createSymbol(PHPParserConstants.T_PRECENT);}
    "!"                     {return createSymbol(PHPParserConstants.T_NOT);}
    "~"                     {return createSymbol(PHPParserConstants.T_TILDA);}
    "$"                     {return createSymbol(PHPParserConstants.T_DOLLAR);}
    "<"                     {return createSymbol(PHPParserConstants.T_RGREATER);}
    ">"                     {return createSymbol(PHPParserConstants.T_LGREATER);}
    "?"                     {return createSymbol(PHPParserConstants.T_QUESTION_MARK);}
    "@"                     {return createSymbol(PHPParserConstants.T_AT);}
    "{"                     {return createSymbol(PHPParserConstants.T_CURLY_OPEN);}
    "}"                     {return createSymbol(PHPParserConstants.T_CURLY_CLOSE);}
    "\""                     {return createSymbol(PHPParserConstants.T_QUATE);}
    "`"                     {return createSymbol(PHPParserConstants.T_BACKQUATE);}
}

<ST_VAR_OFFSET>[ \n\r\t\\'#] {
    yypushback(1);
    popState();
    return createSymbol(PHPParserConstants.T_ENCAPSED_AND_WHITESPACE);
}

<ST_IN_SCRIPTING>"define" {
    /* not a keyword, hust for recognize constans.*/
    return createFullSymbol(PHPParserConstants.T_DEFINE);
}

<ST_IN_SCRIPTING,ST_VAR_OFFSET>{LABEL} {
    return createFullSymbol(PHPParserConstants.T_STRING);
}

<ST_IN_SCRIPTING>{WHITESPACE} {
}

<ST_IN_SCRIPTING>"#"|"//" {
    handleCommentStart();
    yybegin(ST_ONE_LINE_COMMENT);
//    yymore();
}

<ST_ONE_LINE_COMMENT>"?"|"%"|">" {
    //    yymore();
}

<ST_ONE_LINE_COMMENT>[^\n\r?%>]*(.|{NEWLINE}) {
    String yytext = yytext();
    switch (yytext.charAt(yytext.length() - 1)) {
        case '?':
        case '%':
        case '>':
            yypushback(1);
            break;
        default:
            handleLineCommentEnd();
            yybegin(ST_IN_SCRIPTING);
    }
//    yymore();
}

<ST_ONE_LINE_COMMENT>"?>"|"%>" {
    if (asp_tags || yytext().charAt(0)!='%') { /* asp comment? */
        handleLineCommentEnd();
        yypushback(yylength());
        yybegin(ST_IN_SCRIPTING);
        //return T_COMMENT;
    } 
}

<ST_IN_SCRIPTING>"/*"{WHITESPACE}*"@var"{WHITESPACE}("$"?){LABEL}{WHITESPACE}{LABEL}{WHITESPACE}?"*/" {
    handleVarComment();
    return createFullSymbol(PHPParserConstants.T_VAR_COMMENT);
}

<ST_IN_SCRIPTING>"/**" {
if (!parsePHPDoc()) {
handleCommentStart();
yybegin(ST_DOCBLOCK);
}
}

<ST_DOCBLOCK>"*/" {
     handlePHPDocEnd();
     yybegin(ST_IN_SCRIPTING);
}

<ST_DOCBLOCK>{NEWLINE} {
}

<ST_DOCBLOCK>{ANY_CHAR} {
}

<ST_IN_SCRIPTING>"/**/" {
    handleCommentStart();
}

<ST_IN_SCRIPTING>"/*" {
    handleCommentStart();
    yybegin(ST_COMMENT);
}

<ST_COMMENT>[^*]+ {
}

<ST_COMMENT>"*/" {
    handleMultilineCommentEnd();
    yybegin(ST_IN_SCRIPTING);
}

<ST_COMMENT>"*" {
//    yymore();
}

<ST_IN_SCRIPTING>("?>"|"</script"{WHITESPACE}*">"){NEWLINE}? {
    yybegin(YYINITIAL);
    return createSymbol(PHPParserConstants.T_SEMICOLON);  /* implicit ';' at php-end tag */
}

<ST_IN_SCRIPTING>"%>"{NEWLINE}? {
    if (asp_tags) {
        yybegin(YYINITIAL);
        return createSymbol(PHPParserConstants.T_SEMICOLON);  /* implicit ';' at php-end tag */
    } else {
        return createSymbol(PHPParserConstants.T_INLINE_HTML);
    }
}

<ST_IN_SCRIPTING>(b?[\"]{DOUBLE_QUOTES_CHARS}*("{"*|"$"*)[\"]) {
    return createFullSymbol(PHPParserConstants.T_CONSTANT_ENCAPSED_STRING);
}

<ST_IN_SCRIPTING>(b?[']([^'\\]|("\\"{ANY_CHAR}))*[']) {
    return createFullSymbol(PHPParserConstants.T_CONSTANT_ENCAPSED_STRING);
}

<ST_IN_SCRIPTING>b?[\"] {
    yybegin(ST_DOUBLE_QUOTES);
    return createSymbol(PHPParserConstants.T_QUATE);
}

<ST_IN_SCRIPTING>b?"<<<"{TABS_AND_SPACES}({LABEL}|([']{LABEL}['])|([\"]{LABEL}[\"])){NEWLINE} {
    int removeChars = (yytext().charAt(0) == 'b') ? 4 : 3;
    heredoc = yytext().substring(removeChars).trim();    // for 'b<<<' or '<<<'
    int heredoc_len = heredoc.length();
    if (heredoc.charAt(0) == '\'') {
        heredoc = heredoc.substring(1, heredoc_len-1);
        heredoc_len -= 2;
        yybegin(ST_NOWDOC);
    }
    else if (heredoc.charAt(0) == '"') {
        heredoc = heredoc.substring(1, heredoc_len-1);
        heredoc_len -= 2;
        yybegin(ST_HEREDOC);
    } else {
        yybegin(ST_HEREDOC);
    }
    Symbol sym = createFullSymbol(PHPParserConstants.T_START_HEREDOC);
    sym.value = heredoc;
    return sym;
}

<ST_IN_SCRIPTING>[`] {
    yybegin(ST_BACKQUOTE);
    return createSymbol(PHPParserConstants.T_BACKQUATE);
}

<ST_HEREDOC>{LABEL}";"?[\n\r] {
    String text = yytext();
    int length = text.length() - 1;
    text = text.trim();
    
    yypushback(1);
    
    if (text.endsWith(";")) {
        text = text.substring(0, text.length() - 1);
        yypushback(1);
    }
    if (text.equals(heredoc)) {
        heredoc = null;
        yybegin(ST_IN_SCRIPTING);
        return createSymbol(PHPParserConstants.T_END_HEREDOC);
    } else {
        yybegin(ST_HEREDOC);
    }
}

<ST_HEREDOC>{HEREDOC_CHARS}*{HEREDOC_NEWLINE}+{LABEL}";"?[\n\r] {
    String text = yytext();

    if (text.charAt(text.length() - 2)== ';') {
        text = text.substring(0, text.length() - 2);
        yypushback(1);
    } else {
        text = text.substring(0, text.length() - 1);
    }
    
    int textLength = text.length();
    int heredocLength = heredoc.length();
    if (textLength > heredocLength && text.substring(textLength - heredocLength, textLength).equals(heredoc)) {
        yypushback(2);
        yybegin(ST_END_HEREDOC);
        // we need to remove the closing label from the symbol value.
        Symbol sym = createFullSymbol(PHPParserConstants.T_ENCAPSED_AND_WHITESPACE);
        String value = (String)sym.value;
        sym.value = value.substring(0, value.length() - heredocLength + 1);
           return sym;
    }
    yypushback(1);
    
}

<ST_END_HEREDOC>{ANY_CHAR} {
    heredoc = null;
    yybegin(ST_IN_SCRIPTING);
    return createSymbol(PHPParserConstants.T_END_HEREDOC);
}

<ST_NOWDOC>{LABEL}";"?[\n\r] {
    String text = yytext();
    int length = text.length() - 1;
    text = text.trim();
    
    yypushback(1);
    
    if (text.endsWith(";")) {
        text = text.substring(0, text.length() - 1);
        yypushback(1);
    }
    if (text.equals(heredoc)) {
        heredoc = null;
        yybegin(ST_IN_SCRIPTING);
        return createSymbol(PHPParserConstants.T_END_HEREDOC);
    } else {
        yybegin(ST_HEREDOC);
    }
}

<ST_NOWDOC>({NOWDOC_CHARS}+{NEWLINE}+|{NEWLINE}+){LABEL}";"?[\n\r] {
     String text = yytext();

     if (text.charAt(text.length() - 2)== ';') {
        text = text.substring(0, text.length() - 2);
        yypushback(1);
    } else {
        text = text.substring(0, text.length() - 1);
    }
 
     int textLength = text.length();
     int heredocLength = heredoc.length();
    if (textLength > heredocLength && text.substring(textLength - heredocLength, textLength).equals(heredoc)) {
        yypushback(2);
           yybegin(ST_END_HEREDOC);
           // we need to remove the closing label from the symbol value.
           Symbol sym = createFullSymbol(PHPParserConstants.T_ENCAPSED_AND_WHITESPACE);
           String value = (String)sym.value;
           sym.value = value.substring(0, value.length() - heredocLength + 1);
           return sym;
    }
    yypushback(1);
}

<ST_DOUBLE_QUOTES,ST_BACKQUOTE,ST_HEREDOC>"{$" {
    pushState(ST_IN_SCRIPTING);
    yypushback(yylength()-1);
    return createSymbol(PHPParserConstants.T_CURLY_OPEN_WITH_DOLAR);
}

<ST_DOUBLE_QUOTES>{DOUBLE_QUOTES_CHARS}+ {
    return createFullSymbol(PHPParserConstants.T_ENCAPSED_AND_WHITESPACE);
}

/*
The original parsing rule was {DOUBLE_QUOTES_CHARS}*("{"{2,}|"$"{2,}|(("{"+|"$"+)[\"]))
but jflex doesn't support a{n,} so we changed a{2,} to aa+
*/
<ST_DOUBLE_QUOTES>{DOUBLE_QUOTES_CHARS}*("{""{"+|"$""$"+|(("{"+|"$"+)[\"])) {
    yypushback(1);
    return createFullSymbol(PHPParserConstants.T_ENCAPSED_AND_WHITESPACE);
}

<ST_BACKQUOTE>{BACKQUOTE_CHARS}+ {
    return createFullSymbol(PHPParserConstants.T_ENCAPSED_AND_WHITESPACE);
}

/*
The original parsing rule was {BACKQUOTE_CHARS}*("{"{2,}|"$"{2,}|(("{"+|"$"+)[`]))
but jflex doesn't support a{n,} so we changed a{2,} to aa+
*/
<ST_BACKQUOTE>{BACKQUOTE_CHARS}*("{""{"+|"$""$"+|(("{"+|"$"+)[`])) {
    yypushback(1);
    return createFullSymbol(PHPParserConstants.T_ENCAPSED_AND_WHITESPACE);
}

<ST_HEREDOC>{HEREDOC_CHARS}*({HEREDOC_NEWLINE}+({LABEL}";"?)?)? {
    return createFullSymbol(PHPParserConstants.T_ENCAPSED_AND_WHITESPACE);
}

/*
The original parsing rule was {HEREDOC_CHARS}*({HEREDOC_NEWLINE}+({LABEL}";"?)?)?("{"{2,}|"$"{2,})
but jflex doesn't support a{n,} so we changed a{2,} to aa+
*/
<ST_HEREDOC>{HEREDOC_CHARS}*({HEREDOC_NEWLINE}+({LABEL}";"?)?)?("{""{"+|"$""$"+) {
    yypushback(1);
    return createFullSymbol(PHPParserConstants.T_ENCAPSED_AND_WHITESPACE);
}

<ST_DOUBLE_QUOTES>[\"] {
    yybegin(ST_IN_SCRIPTING);
    return createSymbol(PHPParserConstants.T_QUATE);
}

<ST_BACKQUOTE>[`] {
    yybegin(ST_IN_SCRIPTING);
    return createSymbol(PHPParserConstants.T_BACKQUATE);
}

<ST_IN_SCRIPTING,YYINITIAL,ST_DOUBLE_QUOTES,ST_BACKQUOTE,ST_HEREDOC,ST_END_HEREDOC,ST_NOWDOC,ST_VAR_OFFSET>{ANY_CHAR} {
    // do nothing
}