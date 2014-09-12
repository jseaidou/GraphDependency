// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g 2009-08-11 01:00:03

  package org.eclipse.php.internal.core.compiler.ast.parser.php53;
  
  import org.antlr.runtime.*;
  import org.antlr.runtime.tree.*;
  import org.antlr.runtime.BitSet;
  
  import java.util.*;
	import org.eclipse.dltk.ast.*;
	import org.eclipse.dltk.ast.declarations.*;
	import org.eclipse.dltk.ast.expressions.*;
	import org.eclipse.dltk.ast.references.*;
	import org.eclipse.dltk.ast.statements.*;
	import org.eclipse.php.internal.core.compiler.ast.nodes.*;
	import org.eclipse.php.internal.core.compiler.ast.parser.*;
	import org.eclipse.php.internal.core.ast.scanner.php5.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CompilerAstParser extends AbstractASTParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ModuleDeclaration", "ClassDeclaration", "PROG", "CLASS_BODY", "FIELD_DECL", "METHOD_DECL", "TYPE", "PARAMETER", "BLOCK", "VAR_DECL", "STATEMENT", "CONDITION", "LIST", "INDEX", "MEMBERACCESS", "CALL", "ELIST", "EXPR", "ASSIGN", "LIST_DECL", "SCALAR_ELEMENT", "SCALAR_VAR", "CAST", "LABEL", "ITERATE", "USE_DECL", "ARGU", "CALLED_OBJ", "PREFIX", "POSTFIX", "NAMESPACE", "EMPTYSTATEMENT", "SCALAR", "ARRAY_DECL", "PREFIX_EXPR", "POSTFIX_EXPR", "CAST_EXPR", "UNARY_EXPR", "VAR", "HASH_INDEX", "USE_PARETHESIS_T", "SOC_T", "SOC_PHP_T", "EOC_T", "NAMESPACE_T", "LEFT_PARETHESIS", "RIGHT_PARETHESIS", "SEMI_COLON", "CLASS_T", "IDENTIFIER", "EXTENDS_T", "IMPLEMENTS_T", "LEFT_BRACKET", "RIGHT_BRACKET", "INTERFACE_T", "FUNCTION_T", "REF_T", "CONST_T", "WHILE_T", "DO_T", "FOR_T", "SWITCH_T", "BREAK_T", "CONTINUE_T", "RETURN_T", "GLOBAL_T", "STATIC_T", "ECHO_T", "FOREACH_T", "AS_T", "ARROW_T", "DECLARE_T", "TRY_T", "THROW_T", "USE_T", "INCLUDE_T", "INCLUDE_ONCE_T", "REQUIRE_T", "REQUIRE_ONCE_T", "STRINGLITERAL", "QUOTE_STRING", "DOMAIN_T", "COMMA_T", "EQUAL_T", "IF_T", "ELSEIF_T", "ELSE_T", "COLON_T", "ENDIF_T", "ENDSWITCH_T", "CASE_T", "DEFAULT_T", "CATCH_T", "ENDFOR_T", "ENDWHILE_T", "ENDFOREACH_T", "ENDDECLARE_T", "OR_T", "XOR_T", "AND_T", "PLUS_EQ", "MINUS_EQ", "MUL_EQ", "DIV_EQ", "DOT_EQ", "PERCENT_EQ", "BIT_AND_EQ", "BIT_OR_EQ", "POWER_EQ", "LMOVE_EQ", "RMOVE_EQ", "QUESTION_T", "LOGICAL_OR_T", "LOGICAL_AND_T", "BIT_OR_T", "POWER_T", "DOT_T", "EQUAL_EQUAL_T", "NOT_EQUAL_T", "EQUAL_EQUAL_EQUAL_T", "NOT_EQUAL_EQUAL_T", "LT_T", "MT_T", "LE_T", "ME_T", "LSHIFT_T", "RSHIFT_T", "PLUS_T", "MINUS_T", "MUL_T", "DIV_T", "PERCENT_T", "UNSET_T", "CLONE_T", "TILDA_T", "EXC_NOT_T", "PLUS_PLUS_T", "MINUS_MINUS_T", "INSTANCEOF_T", "AT_T", "LIST_T", "NEW_T", "BACKTRICKLITERAL", "PRINT_T", "SINGLE_ARROW_T", "LEFT_OPEN_RECT", "RIGHT_OPEN_RECT", "DOLLAR_T", "INTLITERAL", "FLOATLITERAL", "DOUBLELITERRAL", "REALLITERAL", "HERE_DOC", "HEREDOC", "END_HEREDOC", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "STATIC", "NonIntegerNumber", "FloatSuffix", "DoubleSuffix", "Exponent", "EscapeSequence", "IdentifierStart", "IdentifierPart", "WS", "COMMENT", "LINE_COMMENT", "'__halt_compiler'", "'abstract'", "'final'", "'var'", "'public'", "'protected'", "'private'", "'bool'", "'boolean'", "'int'", "'float'", "'double'", "'real'", "'string'", "'object'", "'array'", "'__CLASS__'", "'__DIR__'", "'__FILE__'", "'__FUNCTION__'", "'__METHOD__'", "'__LINE__'", "'__NAMESPACE__'"
    };
    public static final int RIGHT_OPEN_RECT=150;
    public static final int ENDFOR_T=97;
    public static final int LOGICAL_OR_T=116;
    public static final int CONDITION=15;
    public static final int DOMAIN_T=85;
    public static final int EOF=-1;
    public static final int EQUAL_EQUAL_T=121;
    public static final int STATEMENT=14;
    public static final int TYPE=10;
    public static final int EOC_T=47;
    public static final int CAST_EXPR=40;
    public static final int NOT_EQUAL_EQUAL_T=124;
    public static final int AT_T=143;
    public static final int FloatSuffix=165;
    public static final int NonIntegerNumber=164;
    public static final int RIGHT_BRACKET=57;
    public static final int AND_T=103;
    public static final int ARGU=30;
    public static final int FOR_T=64;
    public static final int MINUS_MINUS_T=141;
    public static final int RMOVE_EQ=114;
    public static final int STATIC=163;
    public static final int WHILE_T=62;
    public static final int ARRAY_DECL=37;
    public static final int MUL_EQ=106;
    public static final int SEMI_COLON=51;
    public static final int INTERFACE_T=58;
    public static final int OR_T=101;
    public static final int INTLITERAL=152;
    public static final int PLUS_EQ=104;
    public static final int ENDDECLARE_T=100;
    public static final int PLUS_T=131;
    public static final int MINUS_EQ=105;
    public static final int LongSuffix=160;
    public static final int REQUIRE_T=81;
    public static final int ENDFOREACH_T=99;
    public static final int WS=171;
    public static final int DO_T=63;
    public static final int EQUAL_T=87;
    public static final int COLON_T=91;
    public static final int USE_T=78;
    public static final int SOC_PHP_T=46;
    public static final int MINUS_T=132;
    public static final int CALL=19;
    public static final int SCALAR_ELEMENT=24;
    public static final int POWER_EQ=112;
    public static final int INCLUDE_ONCE_T=80;
    public static final int BIT_AND_EQ=110;
    public static final int LEFT_BRACKET=56;
    public static final int DOUBLELITERRAL=154;
    public static final int UNARY_EXPR=41;
    public static final int CATCH_T=96;
    public static final int USE_PARETHESIS_T=44;
    public static final int IMPLEMENTS_T=55;
    public static final int HexDigit=162;
    public static final int DEFAULT_T=95;
    public static final int REQUIRE_ONCE_T=82;
    public static final int CONST_T=61;
    public static final int FUNCTION_T=59;
    public static final int MUL_T=133;
    public static final int BIT_OR_EQ=111;
    public static final int BIT_OR_T=118;
    public static final int FOREACH_T=72;
    public static final int PREFIX_EXPR=38;
    public static final int FIELD_DECL=8;
    public static final int CLASS_BODY=7;
    public static final int LIST_T=144;
    public static final int LIST_DECL=23;
    public static final int QUOTE_STRING=84;
    public static final int BACKTRICKLITERAL=146;
    public static final int ITERATE=28;
    public static final int RETURN_T=68;
    public static final int LEFT_PARETHESIS=49;
    public static final int DoubleSuffix=166;
    public static final int HEREDOC=157;
    public static final int ENDWHILE_T=98;
    public static final int STRINGLITERAL=83;
    public static final int BLOCK=12;
    public static final int CONTINUE_T=67;
    public static final int EXTENDS_T=54;
    public static final int PRINT_T=147;
    public static final int FLOATLITERAL=153;
    public static final int ENDSWITCH_T=93;
    public static final int CAST=26;
    public static final int PREFIX=32;
    public static final int TRY_T=76;
    public static final int XOR_T=102;
    public static final int POSTFIX=33;
    public static final int NAMESPACE_T=48;
    public static final int HASH_INDEX=43;
    public static final int PERCENT_EQ=109;
    public static final int INCLUDE_T=79;
    public static final int AS_T=73;
    public static final int VAR_DECL=13;
    public static final int DIV_T=134;
    public static final int COMMA_T=86;
    public static final int STATIC_T=70;
    public static final int REALLITERAL=155;
    public static final int DOT_T=120;
    public static final int ENDIF_T=92;
    public static final int POSTFIX_EXPR=39;
    public static final int CALLED_OBJ=31;
    public static final int DIV_EQ=107;
    public static final int ELIST=20;
    public static final int GLOBAL_T=69;
    public static final int IF_T=88;
    public static final int PARAMETER=11;
    public static final int MT_T=126;
    public static final int SCALAR=36;
    public static final int ELSE_T=90;
    public static final int SINGLE_ARROW_T=148;
    public static final int VAR=42;
    public static final int RSHIFT_T=130;
    public static final int COMMENT=172;
    public static final int HexPrefix=161;
    public static final int ARROW_T=74;
    public static final int LINE_COMMENT=173;
    public static final int EQUAL_EQUAL_EQUAL_T=123;
    public static final int CLONE_T=137;
    public static final int IdentifierStart=169;
    public static final int DECLARE_T=75;
    public static final int THROW_T=77;
    public static final int REF_T=60;
    public static final int LIST=16;
    public static final int NAMESPACE=34;
    public static final int EMPTYSTATEMENT=35;
    public static final int UNSET_T=136;
    public static final int NEW_T=145;
    public static final int MEMBERACCESS=18;
    public static final int PLUS_PLUS_T=140;
    public static final int EscapeSequence=168;
    public static final int CLASS_T=52;
    public static final int IntegerNumber=159;
    public static final int ECHO_T=71;
    public static final int DOLLAR_T=151;
    public static final int Exponent=167;
    public static final int SOC_T=45;
    public static final int METHOD_DECL=9;
    public static final int LE_T=127;
    public static final int PERCENT_T=135;
    public static final int INDEX=17;
    public static final int PROG=6;
    public static final int EXPR=21;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int USE_DECL=29;
    public static final int T__194=194;
    public static final int NOT_EQUAL_T=122;
    public static final int T__193=193;
    public static final int HERE_DOC=156;
    public static final int T__192=192;
    public static final int POWER_T=119;
    public static final int T__191=191;
    public static final int IDENTIFIER=53;
    public static final int T__190=190;
    public static final int LEFT_OPEN_RECT=149;
    public static final int LMOVE_EQ=113;
    public static final int SCALAR_VAR=25;
    public static final int IdentifierPart=170;
    public static final int TILDA_T=138;
    public static final int T__184=184;
    public static final int SWITCH_T=65;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int LOGICAL_AND_T=117;
    public static final int T__189=189;
    public static final int QUESTION_T=115;
    public static final int LSHIFT_T=129;
    public static final int T__180=180;
    public static final int INSTANCEOF_T=142;
    public static final int ELSEIF_T=89;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int END_HEREDOC=158;
    public static final int LT_T=125;
    public static final int ModuleDeclaration=4;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int ME_T=128;
    public static final int LABEL=27;
    public static final int RIGHT_PARETHESIS=50;
    public static final int ASSIGN=22;
    public static final int EXC_NOT_T=139;
    public static final int BREAK_T=66;
    public static final int CASE_T=94;
    public static final int DOT_EQ=108;
    public static final int ClassDeclaration=5;

    // delegates
    // delegators


        public CompilerAstParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CompilerAstParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CompilerAstParser.tokenNames; }
    public String getGrammarFileName() { return "/home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g"; }


        private IErrorReporter errorReporter = null;
        public void setErrorReporter(IErrorReporter errorReporter) {
            this.errorReporter = errorReporter;
        }
    //    public void emitErrorMessage(String msg) {
    //        errorReporter.reportError(msg);
    //    }
        
        private List errors = new LinkedList();
        public void displayRecognitionError(String[] tokenNames,
                                            RecognitionException e) {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            errors.add(hdr + " " + msg);
        }
        public List getErrors() {
            return errors;
        }


    public static class php_source_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "php_source"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:112:1: php_source : ( SOC_T | SOC_PHP_T ) ( top_statement_list )? EOC_T -> ^( ModuleDeclaration ( top_statement_list )? ) ;
    public final CompilerAstParser.php_source_return php_source() throws RecognitionException {
        CompilerAstParser.php_source_return retval = new CompilerAstParser.php_source_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token SOC_T1=null;
        Token SOC_PHP_T2=null;
        Token EOC_T4=null;
        CompilerAstParser.top_statement_list_return top_statement_list3 = null;


        SLAST SOC_T1_tree=null;
        SLAST SOC_PHP_T2_tree=null;
        SLAST EOC_T4_tree=null;
        RewriteRuleTokenStream stream_SOC_T=new RewriteRuleTokenStream(adaptor,"token SOC_T");
        RewriteRuleTokenStream stream_EOC_T=new RewriteRuleTokenStream(adaptor,"token EOC_T");
        RewriteRuleTokenStream stream_SOC_PHP_T=new RewriteRuleTokenStream(adaptor,"token SOC_PHP_T");
        RewriteRuleSubtreeStream stream_top_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule top_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:122:3: ( ( SOC_T | SOC_PHP_T ) ( top_statement_list )? EOC_T -> ^( ModuleDeclaration ( top_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:122:5: ( SOC_T | SOC_PHP_T ) ( top_statement_list )? EOC_T
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:122:5: ( SOC_T | SOC_PHP_T )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==SOC_T) ) {
                alt1=1;
            }
            else if ( (LA1_0==SOC_PHP_T) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:122:6: SOC_T
                    {
                    SOC_T1=(Token)match(input,SOC_T,FOLLOW_SOC_T_in_php_source275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SOC_T.add(SOC_T1);

                    if ( state.backtracking==0 ) {

                          token = (CommonToken)SOC_T1;
                          startIndex = token.getStartIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:127:5: SOC_PHP_T
                    {
                    SOC_PHP_T2=(Token)match(input,SOC_PHP_T,FOLLOW_SOC_PHP_T_in_php_source287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SOC_PHP_T.add(SOC_PHP_T2);

                    if ( state.backtracking==0 ) {

                          token = (CommonToken)SOC_PHP_T2;
                          startIndex = token.getStartIndex();
                        
                    }

                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:132:9: ( top_statement_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=NAMESPACE_T && LA2_0<=LEFT_PARETHESIS)||(LA2_0>=SEMI_COLON && LA2_0<=IDENTIFIER)||LA2_0==LEFT_BRACKET||(LA2_0>=INTERFACE_T && LA2_0<=REF_T)||(LA2_0>=WHILE_T && LA2_0<=FOREACH_T)||(LA2_0>=DECLARE_T && LA2_0<=STRINGLITERAL)||LA2_0==DOMAIN_T||LA2_0==IF_T||(LA2_0>=PLUS_T && LA2_0<=MINUS_T)||(LA2_0>=UNSET_T && LA2_0<=MINUS_MINUS_T)||(LA2_0>=AT_T && LA2_0<=PRINT_T)||(LA2_0>=DOLLAR_T && LA2_0<=HERE_DOC)||(LA2_0>=174 && LA2_0<=176)||(LA2_0>=189 && LA2_0<=196)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:132:9: top_statement_list
                    {
                    pushFollow(FOLLOW_top_statement_list_in_php_source302);
                    top_statement_list3=top_statement_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_top_statement_list.add(top_statement_list3.getTree());

                    }
                    break;

            }

            EOC_T4=(Token)match(input,EOC_T,FOLLOW_EOC_T_in_php_source311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EOC_T.add(EOC_T4);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)EOC_T4;
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: top_statement_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 138:5: -> ^( ModuleDeclaration ( top_statement_list )? )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:138:9: ^( ModuleDeclaration ( top_statement_list )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(ModuleDeclaration, "ModuleDeclaration"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:138:29: ( top_statement_list )?
                if ( stream_top_statement_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_top_statement_list.nextTree());

                }
                stream_top_statement_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST phpSourceToken = retval.tree;
                phpSourceToken.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "php_source"

    public static class top_statement_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "top_statement_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:142:1: top_statement_list : ( top_statement )+ ;
    public final CompilerAstParser.top_statement_list_return top_statement_list() throws RecognitionException {
        CompilerAstParser.top_statement_list_return retval = new CompilerAstParser.top_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.top_statement_return top_statement5 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:143:3: ( ( top_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:143:5: ( top_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:143:5: ( top_statement )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=NAMESPACE_T && LA3_0<=LEFT_PARETHESIS)||(LA3_0>=SEMI_COLON && LA3_0<=IDENTIFIER)||LA3_0==LEFT_BRACKET||(LA3_0>=INTERFACE_T && LA3_0<=REF_T)||(LA3_0>=WHILE_T && LA3_0<=FOREACH_T)||(LA3_0>=DECLARE_T && LA3_0<=STRINGLITERAL)||LA3_0==DOMAIN_T||LA3_0==IF_T||(LA3_0>=PLUS_T && LA3_0<=MINUS_T)||(LA3_0>=UNSET_T && LA3_0<=MINUS_MINUS_T)||(LA3_0>=AT_T && LA3_0<=PRINT_T)||(LA3_0>=DOLLAR_T && LA3_0<=HERE_DOC)||(LA3_0>=174 && LA3_0<=176)||(LA3_0>=189 && LA3_0<=196)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:143:5: top_statement
            	    {
            	    pushFollow(FOLLOW_top_statement_in_top_statement_list346);
            	    top_statement5=top_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, top_statement5.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "top_statement_list"

    public static class top_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "top_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:146:1: top_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement | NAMESPACE_T fully_qualified_class_name -> ^( NAMESPACE_T fully_qualified_class_name ) );
    public final CompilerAstParser.top_statement_return top_statement() throws RecognitionException {
        CompilerAstParser.top_statement_return retval = new CompilerAstParser.top_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token NAMESPACE_T10=null;
        CompilerAstParser.statement_return statement6 = null;

        CompilerAstParser.function_declaration_statement_return function_declaration_statement7 = null;

        CompilerAstParser.class_declaration_statement_return class_declaration_statement8 = null;

        CompilerAstParser.halt_compiler_statement_return halt_compiler_statement9 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name11 = null;


        SLAST NAMESPACE_T10_tree=null;
        RewriteRuleTokenStream stream_NAMESPACE_T=new RewriteRuleTokenStream(adaptor,"token NAMESPACE_T");
        RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:147:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement | NAMESPACE_T fully_qualified_class_name -> ^( NAMESPACE_T fully_qualified_class_name ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case LEFT_PARETHESIS:
            case SEMI_COLON:
            case IDENTIFIER:
            case LEFT_BRACKET:
            case REF_T:
            case WHILE_T:
            case DO_T:
            case FOR_T:
            case SWITCH_T:
            case BREAK_T:
            case CONTINUE_T:
            case RETURN_T:
            case GLOBAL_T:
            case STATIC_T:
            case ECHO_T:
            case FOREACH_T:
            case DECLARE_T:
            case TRY_T:
            case THROW_T:
            case USE_T:
            case INCLUDE_T:
            case INCLUDE_ONCE_T:
            case REQUIRE_T:
            case REQUIRE_ONCE_T:
            case STRINGLITERAL:
            case DOMAIN_T:
            case IF_T:
            case PLUS_T:
            case MINUS_T:
            case UNSET_T:
            case CLONE_T:
            case TILDA_T:
            case EXC_NOT_T:
            case PLUS_PLUS_T:
            case MINUS_MINUS_T:
            case AT_T:
            case LIST_T:
            case NEW_T:
            case BACKTRICKLITERAL:
            case PRINT_T:
            case DOLLAR_T:
            case INTLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERRAL:
            case REALLITERAL:
            case HERE_DOC:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
                {
                alt4=1;
                }
                break;
            case NAMESPACE_T:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==NAMESPACE_T||LA4_2==IDENTIFIER) ) {
                    alt4=5;
                }
                else if ( (LA4_2==DOMAIN_T) ) {
                    int LA4_7 = input.LA(3);

                    if ( (LA4_7==IDENTIFIER) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 7, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case FUNCTION_T:
                {
                alt4=2;
                }
                break;
            case CLASS_T:
            case INTERFACE_T:
            case 175:
            case 176:
                {
                alt4=3;
                }
                break;
            case 174:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:147:5: statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_top_statement360);
                    statement6=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement6.getTree());

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:148:5: function_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_function_declaration_statement_in_top_statement366);
                    function_declaration_statement7=function_declaration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_declaration_statement7.getTree());

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:149:5: class_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_class_declaration_statement_in_top_statement372);
                    class_declaration_statement8=class_declaration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_declaration_statement8.getTree());

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:150:5: halt_compiler_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_halt_compiler_statement_in_top_statement378);
                    halt_compiler_statement9=halt_compiler_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, halt_compiler_statement9.getTree());

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:151:5: NAMESPACE_T fully_qualified_class_name
                    {
                    NAMESPACE_T10=(Token)match(input,NAMESPACE_T,FOLLOW_NAMESPACE_T_in_top_statement384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NAMESPACE_T.add(NAMESPACE_T10);

                    pushFollow(FOLLOW_fully_qualified_class_name_in_top_statement386);
                    fully_qualified_class_name11=fully_qualified_class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name11.getTree());


                    // AST REWRITE
                    // elements: fully_qualified_class_name, NAMESPACE_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 151:45: -> ^( NAMESPACE_T fully_qualified_class_name )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:151:49: ^( NAMESPACE_T fully_qualified_class_name )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_NAMESPACE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "top_statement"

    public static class inner_statement_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inner_statement_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:156:1: inner_statement_list : ( inner_statement )+ ;
    public final CompilerAstParser.inner_statement_list_return inner_statement_list() throws RecognitionException {
        CompilerAstParser.inner_statement_list_return retval = new CompilerAstParser.inner_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.inner_statement_return inner_statement12 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:157:3: ( ( inner_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:157:5: ( inner_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:157:5: ( inner_statement )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=NAMESPACE_T && LA5_0<=LEFT_PARETHESIS)||(LA5_0>=SEMI_COLON && LA5_0<=IDENTIFIER)||LA5_0==LEFT_BRACKET||(LA5_0>=INTERFACE_T && LA5_0<=REF_T)||(LA5_0>=WHILE_T && LA5_0<=FOREACH_T)||(LA5_0>=DECLARE_T && LA5_0<=STRINGLITERAL)||LA5_0==DOMAIN_T||LA5_0==IF_T||(LA5_0>=PLUS_T && LA5_0<=MINUS_T)||(LA5_0>=UNSET_T && LA5_0<=MINUS_MINUS_T)||(LA5_0>=AT_T && LA5_0<=PRINT_T)||(LA5_0>=DOLLAR_T && LA5_0<=HERE_DOC)||(LA5_0>=174 && LA5_0<=176)||(LA5_0>=189 && LA5_0<=196)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:157:6: inner_statement
            	    {
            	    pushFollow(FOLLOW_inner_statement_in_inner_statement_list416);
            	    inner_statement12=inner_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inner_statement12.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inner_statement_list"

    public static class inner_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inner_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:160:1: inner_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement );
    public final CompilerAstParser.inner_statement_return inner_statement() throws RecognitionException {
        CompilerAstParser.inner_statement_return retval = new CompilerAstParser.inner_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.statement_return statement13 = null;

        CompilerAstParser.function_declaration_statement_return function_declaration_statement14 = null;

        CompilerAstParser.class_declaration_statement_return class_declaration_statement15 = null;

        CompilerAstParser.halt_compiler_statement_return halt_compiler_statement16 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:161:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement )
            int alt6=4;
            switch ( input.LA(1) ) {
            case NAMESPACE_T:
            case LEFT_PARETHESIS:
            case SEMI_COLON:
            case IDENTIFIER:
            case LEFT_BRACKET:
            case REF_T:
            case WHILE_T:
            case DO_T:
            case FOR_T:
            case SWITCH_T:
            case BREAK_T:
            case CONTINUE_T:
            case RETURN_T:
            case GLOBAL_T:
            case STATIC_T:
            case ECHO_T:
            case FOREACH_T:
            case DECLARE_T:
            case TRY_T:
            case THROW_T:
            case USE_T:
            case INCLUDE_T:
            case INCLUDE_ONCE_T:
            case REQUIRE_T:
            case REQUIRE_ONCE_T:
            case STRINGLITERAL:
            case DOMAIN_T:
            case IF_T:
            case PLUS_T:
            case MINUS_T:
            case UNSET_T:
            case CLONE_T:
            case TILDA_T:
            case EXC_NOT_T:
            case PLUS_PLUS_T:
            case MINUS_MINUS_T:
            case AT_T:
            case LIST_T:
            case NEW_T:
            case BACKTRICKLITERAL:
            case PRINT_T:
            case DOLLAR_T:
            case INTLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERRAL:
            case REALLITERAL:
            case HERE_DOC:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
                {
                alt6=1;
                }
                break;
            case FUNCTION_T:
                {
                alt6=2;
                }
                break;
            case CLASS_T:
            case INTERFACE_T:
            case 175:
            case 176:
                {
                alt6=3;
                }
                break;
            case 174:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:161:5: statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_inner_statement433);
                    statement13=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement13.getTree());

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:162:5: function_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_function_declaration_statement_in_inner_statement439);
                    function_declaration_statement14=function_declaration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_declaration_statement14.getTree());

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:163:5: class_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_class_declaration_statement_in_inner_statement445);
                    class_declaration_statement15=class_declaration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_declaration_statement15.getTree());

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:164:5: halt_compiler_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_halt_compiler_statement_in_inner_statement451);
                    halt_compiler_statement16=halt_compiler_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, halt_compiler_statement16.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inner_statement"

    public static class halt_compiler_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "halt_compiler_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:167:1: halt_compiler_statement : '__halt_compiler' LEFT_PARETHESIS RIGHT_PARETHESIS SEMI_COLON -> '__halt_compiler' ;
    public final CompilerAstParser.halt_compiler_statement_return halt_compiler_statement() throws RecognitionException {
        CompilerAstParser.halt_compiler_statement_return retval = new CompilerAstParser.halt_compiler_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token string_literal17=null;
        Token LEFT_PARETHESIS18=null;
        Token RIGHT_PARETHESIS19=null;
        Token SEMI_COLON20=null;

        SLAST string_literal17_tree=null;
        SLAST LEFT_PARETHESIS18_tree=null;
        SLAST RIGHT_PARETHESIS19_tree=null;
        SLAST SEMI_COLON20_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_174=new RewriteRuleTokenStream(adaptor,"token 174");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:168:3: ( '__halt_compiler' LEFT_PARETHESIS RIGHT_PARETHESIS SEMI_COLON -> '__halt_compiler' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:168:5: '__halt_compiler' LEFT_PARETHESIS RIGHT_PARETHESIS SEMI_COLON
            {
            string_literal17=(Token)match(input,174,FOLLOW_174_in_halt_compiler_statement466); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_174.add(string_literal17);

            LEFT_PARETHESIS18=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_halt_compiler_statement468); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS18);

            RIGHT_PARETHESIS19=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_halt_compiler_statement470); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS19);

            SEMI_COLON20=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_halt_compiler_statement472); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON20);



            // AST REWRITE
            // elements: 174
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 168:69: -> '__halt_compiler'
            {
                adaptor.addChild(root_0, stream_174.nextNode());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "halt_compiler_statement"

    public static class class_declaration_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_declaration_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:171:1: class_declaration_statement : ( ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) | ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) );
    public final CompilerAstParser.class_declaration_statement_return class_declaration_statement() throws RecognitionException {
        CompilerAstParser.class_declaration_statement_return retval = new CompilerAstParser.class_declaration_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token CLASS_T22=null;
        Token IDENTIFIER23=null;
        Token EXTENDS_T24=null;
        Token IMPLEMENTS_T26=null;
        Token LEFT_BRACKET28=null;
        Token RIGHT_BRACKET30=null;
        Token INTERFACE_T31=null;
        Token IDENTIFIER32=null;
        Token EXTENDS_T33=null;
        Token IMPLEMENTS_T35=null;
        Token LEFT_BRACKET37=null;
        Token RIGHT_BRACKET39=null;
        CompilerAstParser.class_entr_type_return class_entr_type21 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name25 = null;

        CompilerAstParser.fully_qualified_class_name_list_return fully_qualified_class_name_list27 = null;

        CompilerAstParser.class_statement_return class_statement29 = null;

        CompilerAstParser.fully_qualified_class_name_list_return fully_qualified_class_name_list34 = null;

        CompilerAstParser.fully_qualified_class_name_list_return fully_qualified_class_name_list36 = null;

        CompilerAstParser.class_statement_return class_statement38 = null;


        SLAST CLASS_T22_tree=null;
        SLAST IDENTIFIER23_tree=null;
        SLAST EXTENDS_T24_tree=null;
        SLAST IMPLEMENTS_T26_tree=null;
        SLAST LEFT_BRACKET28_tree=null;
        SLAST RIGHT_BRACKET30_tree=null;
        SLAST INTERFACE_T31_tree=null;
        SLAST IDENTIFIER32_tree=null;
        SLAST EXTENDS_T33_tree=null;
        SLAST IMPLEMENTS_T35_tree=null;
        SLAST LEFT_BRACKET37_tree=null;
        SLAST RIGHT_BRACKET39_tree=null;
        RewriteRuleTokenStream stream_EXTENDS_T=new RewriteRuleTokenStream(adaptor,"token EXTENDS_T");
        RewriteRuleTokenStream stream_INTERFACE_T=new RewriteRuleTokenStream(adaptor,"token INTERFACE_T");
        RewriteRuleTokenStream stream_CLASS_T=new RewriteRuleTokenStream(adaptor,"token CLASS_T");
        RewriteRuleTokenStream stream_IMPLEMENTS_T=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTS_T");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");
        RewriteRuleSubtreeStream stream_fully_qualified_class_name_list=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name_list");
        RewriteRuleSubtreeStream stream_class_entr_type=new RewriteRuleSubtreeStream(adaptor,"rule class_entr_type");
        RewriteRuleSubtreeStream stream_class_statement=new RewriteRuleSubtreeStream(adaptor,"rule class_statement");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:3: ( ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) | ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==CLASS_T||(LA14_0>=175 && LA14_0<=176)) ) {
                alt14=1;
            }
            else if ( (LA14_0==INTERFACE_T) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:5: ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:5: ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:7: ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:7: ( class_entr_type )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=175 && LA7_0<=176)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:7: class_entr_type
                            {
                            pushFollow(FOLLOW_class_entr_type_in_class_declaration_statement507);
                            class_entr_type21=class_entr_type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_class_entr_type.add(class_entr_type21.getTree());

                            }
                            break;

                    }

                    CLASS_T22=(Token)match(input,CLASS_T,FOLLOW_CLASS_T_in_class_declaration_statement510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS_T.add(CLASS_T22);

                    IDENTIFIER23=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER23);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:43: ( EXTENDS_T fully_qualified_class_name )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==EXTENDS_T) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:44: EXTENDS_T fully_qualified_class_name
                            {
                            EXTENDS_T24=(Token)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement515); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EXTENDS_T.add(EXTENDS_T24);

                            pushFollow(FOLLOW_fully_qualified_class_name_in_class_declaration_statement517);
                            fully_qualified_class_name25=fully_qualified_class_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name25.getTree());

                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:83: ( IMPLEMENTS_T fully_qualified_class_name_list )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==IMPLEMENTS_T) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:181:84: IMPLEMENTS_T fully_qualified_class_name_list
                            {
                            IMPLEMENTS_T26=(Token)match(input,IMPLEMENTS_T,FOLLOW_IMPLEMENTS_T_in_class_declaration_statement522); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IMPLEMENTS_T.add(IMPLEMENTS_T26);

                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement524);
                            fully_qualified_class_name_list27=fully_qualified_class_name_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list27.getTree());

                            }
                            break;

                    }

                    LEFT_BRACKET28=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_class_declaration_statement534); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET28);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:182:20: ( class_statement )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==FUNCTION_T||LA10_0==CONST_T||LA10_0==STATIC_T||(LA10_0>=175 && LA10_0<=180)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:182:20: class_statement
                    	    {
                    	    pushFollow(FOLLOW_class_statement_in_class_declaration_statement536);
                    	    class_statement29=class_statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_class_statement.add(class_statement29.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    RIGHT_BRACKET30=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_class_declaration_statement539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET30);

                    if ( state.backtracking==0 ) {

                            startIndex = ((CommonToken)CLASS_T22).getStartIndex();
                            if ((class_entr_type21!=null?input.toString(class_entr_type21.start,class_entr_type21.stop):null) != null) {
                                token = (CommonToken)(class_entr_type21!=null?((Token)class_entr_type21.start):null);
                                startIndex = token.getStartIndex();
                            } 
                            token = (CommonToken)RIGHT_BRACKET30;
                            endIndex = token.getStopIndex(); 
                          
                    }


                    // AST REWRITE
                    // elements: CLASS_T, IDENTIFIER, fully_qualified_class_name, class_entr_type, class_statement, fully_qualified_class_name_list, EXTENDS_T, IMPLEMENTS_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 192:5: -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:192:9: ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_CLASS_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:192:19: ( class_entr_type )?
                        if ( stream_class_entr_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_class_entr_type.nextTree());

                        }
                        stream_class_entr_type.reset();
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:192:47: ( ^( EXTENDS_T fully_qualified_class_name ) )?
                        if ( stream_fully_qualified_class_name.hasNext()||stream_EXTENDS_T.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:192:47: ^( EXTENDS_T fully_qualified_class_name )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_EXTENDS_T.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_fully_qualified_class_name.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_fully_qualified_class_name.reset();
                        stream_EXTENDS_T.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:192:88: ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )?
                        if ( stream_fully_qualified_class_name_list.hasNext()||stream_IMPLEMENTS_T.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:192:88: ^( IMPLEMENTS_T fully_qualified_class_name_list )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_IMPLEMENTS_T.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_fully_qualified_class_name_list.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_fully_qualified_class_name_list.reset();
                        stream_IMPLEMENTS_T.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:193:7: ( ^( CLASS_BODY ( class_statement )* ) )?
                        if ( stream_class_statement.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:193:7: ^( CLASS_BODY ( class_statement )* )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CLASS_BODY, "CLASS_BODY"), root_2);

                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:193:20: ( class_statement )*
                            while ( stream_class_statement.hasNext() ) {
                                adaptor.addChild(root_2, stream_class_statement.nextTree());

                            }
                            stream_class_statement.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_class_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:195:6: ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:195:6: ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:195:7: INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET
                    {
                    INTERFACE_T31=(Token)match(input,INTERFACE_T,FOLLOW_INTERFACE_T_in_class_declaration_statement601); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTERFACE_T.add(INTERFACE_T31);

                    IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER32);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:195:30: ( EXTENDS_T fully_qualified_class_name_list )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==EXTENDS_T) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:195:31: EXTENDS_T fully_qualified_class_name_list
                            {
                            EXTENDS_T33=(Token)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement606); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EXTENDS_T.add(EXTENDS_T33);

                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement608);
                            fully_qualified_class_name_list34=fully_qualified_class_name_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list34.getTree());

                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:195:75: ( IMPLEMENTS_T fully_qualified_class_name_list )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==IMPLEMENTS_T) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:195:76: IMPLEMENTS_T fully_qualified_class_name_list
                            {
                            IMPLEMENTS_T35=(Token)match(input,IMPLEMENTS_T,FOLLOW_IMPLEMENTS_T_in_class_declaration_statement613); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IMPLEMENTS_T.add(IMPLEMENTS_T35);

                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement615);
                            fully_qualified_class_name_list36=fully_qualified_class_name_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list36.getTree());

                            }
                            break;

                    }

                    LEFT_BRACKET37=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_class_declaration_statement625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET37);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:196:20: ( class_statement )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==FUNCTION_T||LA13_0==CONST_T||LA13_0==STATIC_T||(LA13_0>=175 && LA13_0<=180)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:196:20: class_statement
                    	    {
                    	    pushFollow(FOLLOW_class_statement_in_class_declaration_statement627);
                    	    class_statement38=class_statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_class_statement.add(class_statement38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    RIGHT_BRACKET39=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_class_declaration_statement630); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET39);

                    if ( state.backtracking==0 ) {

                            startIndex = ((CommonToken)INTERFACE_T31).getStartIndex();
                            endIndex = ((CommonToken)RIGHT_BRACKET39).getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: IDENTIFIER, EXTENDS_T, fully_qualified_class_name_list, class_statement, INTERFACE_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 202:5: -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:202:9: ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_INTERFACE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:202:34: ( ^( EXTENDS_T fully_qualified_class_name_list ) )?
                        if ( stream_EXTENDS_T.hasNext()||stream_fully_qualified_class_name_list.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:202:34: ^( EXTENDS_T fully_qualified_class_name_list )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_EXTENDS_T.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_fully_qualified_class_name_list.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_EXTENDS_T.reset();
                        stream_fully_qualified_class_name_list.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:203:7: ( ^( CLASS_BODY ( class_statement )* ) )?
                        if ( stream_class_statement.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:203:7: ^( CLASS_BODY ( class_statement )* )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CLASS_BODY, "CLASS_BODY"), root_2);

                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:203:20: ( class_statement )*
                            while ( stream_class_statement.hasNext() ) {
                                adaptor.addChild(root_2, stream_class_statement.nextTree());

                            }
                            stream_class_statement.reset();

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_class_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_declaration_statement"

    public static class class_entr_type_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_entr_type"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:207:1: class_entr_type : ( 'abstract' | 'final' );
    public final CompilerAstParser.class_entr_type_return class_entr_type() throws RecognitionException {
        CompilerAstParser.class_entr_type_return retval = new CompilerAstParser.class_entr_type_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set40=null;

        SLAST set40_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:208:3: ( 'abstract' | 'final' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set40=(Token)input.LT(1);
            if ( (input.LA(1)>=175 && input.LA(1)<=176) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set40));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_entr_type"

    public static class class_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:212:1: class_statement : ( variable_modifiers static_var_list SEMI_COLON -> ^( FIELD_DECL variable_modifiers static_var_list ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block ) | CONST_T directive SEMI_COLON -> ^( FIELD_DECL CONST_T directive ) );
    public final CompilerAstParser.class_statement_return class_statement() throws RecognitionException {
        CompilerAstParser.class_statement_return retval = new CompilerAstParser.class_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token SEMI_COLON43=null;
        Token FUNCTION_T45=null;
        Token REF_T46=null;
        Token IDENTIFIER47=null;
        Token LEFT_PARETHESIS48=null;
        Token RIGHT_PARETHESIS50=null;
        Token SEMI_COLON51=null;
        Token FUNCTION_T53=null;
        Token REF_T54=null;
        Token IDENTIFIER55=null;
        Token LEFT_PARETHESIS56=null;
        Token RIGHT_PARETHESIS58=null;
        Token CONST_T60=null;
        Token SEMI_COLON62=null;
        CompilerAstParser.variable_modifiers_return variable_modifiers41 = null;

        CompilerAstParser.static_var_list_return static_var_list42 = null;

        CompilerAstParser.modifier_return modifier44 = null;

        CompilerAstParser.parameter_list_return parameter_list49 = null;

        CompilerAstParser.modifier_return modifier52 = null;

        CompilerAstParser.parameter_list_return parameter_list57 = null;

        CompilerAstParser.block_return block59 = null;

        CompilerAstParser.directive_return directive61 = null;


        SLAST SEMI_COLON43_tree=null;
        SLAST FUNCTION_T45_tree=null;
        SLAST REF_T46_tree=null;
        SLAST IDENTIFIER47_tree=null;
        SLAST LEFT_PARETHESIS48_tree=null;
        SLAST RIGHT_PARETHESIS50_tree=null;
        SLAST SEMI_COLON51_tree=null;
        SLAST FUNCTION_T53_tree=null;
        SLAST REF_T54_tree=null;
        SLAST IDENTIFIER55_tree=null;
        SLAST LEFT_PARETHESIS56_tree=null;
        SLAST RIGHT_PARETHESIS58_tree=null;
        SLAST CONST_T60_tree=null;
        SLAST SEMI_COLON62_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_REF_T=new RewriteRuleTokenStream(adaptor,"token REF_T");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_CONST_T=new RewriteRuleTokenStream(adaptor,"token CONST_T");
        RewriteRuleTokenStream stream_FUNCTION_T=new RewriteRuleTokenStream(adaptor,"token FUNCTION_T");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_directive=new RewriteRuleSubtreeStream(adaptor,"rule directive");
        RewriteRuleSubtreeStream stream_static_var_list=new RewriteRuleSubtreeStream(adaptor,"rule static_var_list");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        RewriteRuleSubtreeStream stream_variable_modifiers=new RewriteRuleSubtreeStream(adaptor,"rule variable_modifiers");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:223:3: ( variable_modifiers static_var_list SEMI_COLON -> ^( FIELD_DECL variable_modifiers static_var_list ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block ) | CONST_T directive SEMI_COLON -> ^( FIELD_DECL CONST_T directive ) )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:223:5: variable_modifiers static_var_list SEMI_COLON
                    {
                    pushFollow(FOLLOW_variable_modifiers_in_class_statement729);
                    variable_modifiers41=variable_modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable_modifiers.add(variable_modifiers41.getTree());
                    pushFollow(FOLLOW_static_var_list_in_class_statement731);
                    static_var_list42=static_var_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_static_var_list.add(static_var_list42.getTree());
                    SEMI_COLON43=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_class_statement733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON43);

                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(variable_modifiers41!=null?((Token)variable_modifiers41.start):null);
                      	   startIndex = token.getStartIndex();
                      	   token = (CommonToken)SEMI_COLON43;
                           endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: static_var_list, variable_modifiers
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 230:7: -> ^( FIELD_DECL variable_modifiers static_var_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:230:11: ^( FIELD_DECL variable_modifiers static_var_list )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(FIELD_DECL, "FIELD_DECL"), root_1);

                        adaptor.addChild(root_1, stream_variable_modifiers.nextTree());
                        adaptor.addChild(root_1, stream_static_var_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:231:5: ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:231:5: ( modifier )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==STATIC_T||(LA15_0>=175 && LA15_0<=176)||(LA15_0>=178 && LA15_0<=180)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:231:5: modifier
                            {
                            pushFollow(FOLLOW_modifier_in_class_statement760);
                            modifier44=modifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_modifier.add(modifier44.getTree());

                            }
                            break;

                    }

                    FUNCTION_T45=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_class_statement763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T45);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:231:26: ( REF_T )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==REF_T) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:231:26: REF_T
                            {
                            REF_T46=(Token)match(input,REF_T,FOLLOW_REF_T_in_class_statement765); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_REF_T.add(REF_T46);


                            }
                            break;

                    }

                    IDENTIFIER47=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_statement768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER47);

                    LEFT_PARETHESIS48=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_class_statement770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS48);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:231:60: ( parameter_list )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==NAMESPACE_T||LA17_0==IDENTIFIER||(LA17_0>=REF_T && LA17_0<=CONST_T)||LA17_0==DOMAIN_T||(LA17_0>=UNSET_T && LA17_0<=CLONE_T)||LA17_0==DOLLAR_T||(LA17_0>=181 && LA17_0<=189)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:231:60: parameter_list
                            {
                            pushFollow(FOLLOW_parameter_list_in_class_statement772);
                            parameter_list49=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list49.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS50=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_class_statement775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS50);

                    SEMI_COLON51=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_class_statement777); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON51);

                    if ( state.backtracking==0 ) {

                           if ((modifier44!=null?input.toString(modifier44.start,modifier44.stop):null) != null) {
                             token = (CommonToken)(modifier44!=null?((Token)modifier44.start):null);
                           }
                           else {
                             token = (CommonToken)FUNCTION_T45;
                           }
                           startIndex = token.getStartIndex();
                           token = (CommonToken)SEMI_COLON51;
                           endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: parameter_list, REF_T, modifier, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 243:6: -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:243:10: ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:243:24: ( modifier )?
                        if ( stream_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_modifier.nextTree());

                        }
                        stream_modifier.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:243:34: ( REF_T )?
                        if ( stream_REF_T.hasNext() ) {
                            adaptor.addChild(root_1, stream_REF_T.nextNode());

                        }
                        stream_REF_T.reset();
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:243:52: ( parameter_list )?
                        if ( stream_parameter_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_parameter_list.nextTree());

                        }
                        stream_parameter_list.reset();
                        adaptor.addChild(root_1, (SLAST)adaptor.create(EMPTYSTATEMENT, "EMPTYSTATEMENT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:244:5: ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:244:5: ( modifier )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==STATIC_T||(LA18_0>=175 && LA18_0<=176)||(LA18_0>=178 && LA18_0<=180)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:244:5: modifier
                            {
                            pushFollow(FOLLOW_modifier_in_class_statement812);
                            modifier52=modifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_modifier.add(modifier52.getTree());

                            }
                            break;

                    }

                    FUNCTION_T53=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_class_statement815); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T53);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:244:26: ( REF_T )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==REF_T) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:244:26: REF_T
                            {
                            REF_T54=(Token)match(input,REF_T,FOLLOW_REF_T_in_class_statement817); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_REF_T.add(REF_T54);


                            }
                            break;

                    }

                    IDENTIFIER55=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_statement820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER55);

                    LEFT_PARETHESIS56=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_class_statement822); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS56);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:244:60: ( parameter_list )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==NAMESPACE_T||LA20_0==IDENTIFIER||(LA20_0>=REF_T && LA20_0<=CONST_T)||LA20_0==DOMAIN_T||(LA20_0>=UNSET_T && LA20_0<=CLONE_T)||LA20_0==DOLLAR_T||(LA20_0>=181 && LA20_0<=189)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:244:60: parameter_list
                            {
                            pushFollow(FOLLOW_parameter_list_in_class_statement824);
                            parameter_list57=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list57.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS58=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_class_statement827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS58);

                    pushFollow(FOLLOW_block_in_class_statement829);
                    block59=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block59.getTree());
                    if ( state.backtracking==0 ) {

                           if ((modifier52!=null?input.toString(modifier52.start,modifier52.stop):null) != null) {
                             token = (CommonToken)(modifier52!=null?((Token)modifier52.start):null);
                           }
                           else {
                             token = (CommonToken)FUNCTION_T53;
                           }
                           startIndex = token.getStartIndex();
                           token = (CommonToken)(block59!=null?((Token)block59.stop):null);
                           endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: block, IDENTIFIER, REF_T, parameter_list, modifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 256:6: -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:256:10: ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:256:24: ( modifier )?
                        if ( stream_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_modifier.nextTree());

                        }
                        stream_modifier.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:256:34: ( REF_T )?
                        if ( stream_REF_T.hasNext() ) {
                            adaptor.addChild(root_1, stream_REF_T.nextNode());

                        }
                        stream_REF_T.reset();
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:256:52: ( parameter_list )?
                        if ( stream_parameter_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_parameter_list.nextTree());

                        }
                        stream_parameter_list.reset();
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:257:5: CONST_T directive SEMI_COLON
                    {
                    CONST_T60=(Token)match(input,CONST_T,FOLLOW_CONST_T_in_class_statement864); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST_T.add(CONST_T60);

                    pushFollow(FOLLOW_directive_in_class_statement866);
                    directive61=directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_directive.add(directive61.getTree());
                    SEMI_COLON62=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_class_statement868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON62);

                    if ( state.backtracking==0 ) {

                           token = (CommonToken)CONST_T60;
                           startIndex = token.getStartIndex();
                           token = (CommonToken)SEMI_COLON62;
                           endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: CONST_T, directive
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 264:6: -> ^( FIELD_DECL CONST_T directive )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:264:10: ^( FIELD_DECL CONST_T directive )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(FIELD_DECL, "FIELD_DECL"), root_1);

                        adaptor.addChild(root_1, stream_CONST_T.nextNode());
                        adaptor.addChild(root_1, stream_directive.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("classstat:" + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_statement"

    public static class function_declaration_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:267:1: function_declaration_statement : FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) ;
    public final CompilerAstParser.function_declaration_statement_return function_declaration_statement() throws RecognitionException {
        CompilerAstParser.function_declaration_statement_return retval = new CompilerAstParser.function_declaration_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token FUNCTION_T63=null;
        Token REF_T64=null;
        Token IDENTIFIER65=null;
        Token LEFT_PARETHESIS66=null;
        Token RIGHT_PARETHESIS68=null;
        CompilerAstParser.parameter_list_return parameter_list67 = null;

        CompilerAstParser.block_return block69 = null;


        SLAST FUNCTION_T63_tree=null;
        SLAST REF_T64_tree=null;
        SLAST IDENTIFIER65_tree=null;
        SLAST LEFT_PARETHESIS66_tree=null;
        SLAST RIGHT_PARETHESIS68_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_REF_T=new RewriteRuleTokenStream(adaptor,"token REF_T");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_FUNCTION_T=new RewriteRuleTokenStream(adaptor,"token FUNCTION_T");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:277:3: ( FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:277:5: FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block
            {
            FUNCTION_T63=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_function_declaration_statement915); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T63);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:277:16: ( REF_T )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==REF_T) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:277:16: REF_T
                    {
                    REF_T64=(Token)match(input,REF_T,FOLLOW_REF_T_in_function_declaration_statement917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REF_T.add(REF_T64);


                    }
                    break;

            }

            IDENTIFIER65=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration_statement920); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER65);

            LEFT_PARETHESIS66=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_function_declaration_statement922); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS66);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:277:50: ( parameter_list )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==NAMESPACE_T||LA23_0==IDENTIFIER||(LA23_0>=REF_T && LA23_0<=CONST_T)||LA23_0==DOMAIN_T||(LA23_0>=UNSET_T && LA23_0<=CLONE_T)||LA23_0==DOLLAR_T||(LA23_0>=181 && LA23_0<=189)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:277:50: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function_declaration_statement924);
                    parameter_list67=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list67.getTree());

                    }
                    break;

            }

            RIGHT_PARETHESIS68=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_function_declaration_statement927); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS68);

            pushFollow(FOLLOW_block_in_function_declaration_statement934);
            block69=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block69.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)FUNCTION_T63;
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(block69!=null?((Token)block69.stop):null);
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: parameter_list, block, IDENTIFIER, REF_T
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 285:3: -> ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:285:6: ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:285:20: ( REF_T )?
                if ( stream_REF_T.hasNext() ) {
                    adaptor.addChild(root_1, stream_REF_T.nextNode());

                }
                stream_REF_T.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:285:38: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_declaration_statement"

    public static class block_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:288:1: block : LEFT_BRACKET ( inner_statement_list )? RIGHT_BRACKET -> ^( BLOCK ( inner_statement_list )? ) ;
    public final CompilerAstParser.block_return block() throws RecognitionException {
        CompilerAstParser.block_return retval = new CompilerAstParser.block_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_BRACKET70=null;
        Token RIGHT_BRACKET72=null;
        CompilerAstParser.inner_statement_list_return inner_statement_list71 = null;


        SLAST LEFT_BRACKET70_tree=null;
        SLAST RIGHT_BRACKET72_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:298:3: ( LEFT_BRACKET ( inner_statement_list )? RIGHT_BRACKET -> ^( BLOCK ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:298:5: LEFT_BRACKET ( inner_statement_list )? RIGHT_BRACKET
            {
            LEFT_BRACKET70=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_block980); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET70);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:298:18: ( inner_statement_list )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=NAMESPACE_T && LA24_0<=LEFT_PARETHESIS)||(LA24_0>=SEMI_COLON && LA24_0<=IDENTIFIER)||LA24_0==LEFT_BRACKET||(LA24_0>=INTERFACE_T && LA24_0<=REF_T)||(LA24_0>=WHILE_T && LA24_0<=FOREACH_T)||(LA24_0>=DECLARE_T && LA24_0<=STRINGLITERAL)||LA24_0==DOMAIN_T||LA24_0==IF_T||(LA24_0>=PLUS_T && LA24_0<=MINUS_T)||(LA24_0>=UNSET_T && LA24_0<=MINUS_MINUS_T)||(LA24_0>=AT_T && LA24_0<=PRINT_T)||(LA24_0>=DOLLAR_T && LA24_0<=HERE_DOC)||(LA24_0>=174 && LA24_0<=176)||(LA24_0>=189 && LA24_0<=196)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:298:18: inner_statement_list
                    {
                    pushFollow(FOLLOW_inner_statement_list_in_block982);
                    inner_statement_list71=inner_statement_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list71.getTree());

                    }
                    break;

            }

            RIGHT_BRACKET72=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_block985); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET72);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)LEFT_BRACKET70;
                  startIndex = token.getStartIndex();
                  token = (CommonToken)RIGHT_BRACKET72;
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: inner_statement_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 306:6: -> ^( BLOCK ( inner_statement_list )? )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:306:10: ^( BLOCK ( inner_statement_list )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:306:18: ( inner_statement_list )?
                if ( stream_inner_statement_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_inner_statement_list.nextTree());

                }
                stream_inner_statement_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:309:1: statement : topStatement -> ^( STATEMENT topStatement ) ;
    public final CompilerAstParser.statement_return statement() throws RecognitionException {
        CompilerAstParser.statement_return retval = new CompilerAstParser.statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.topStatement_return topStatement73 = null;


        RewriteRuleSubtreeStream stream_topStatement=new RewriteRuleSubtreeStream(adaptor,"rule topStatement");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:319:3: ( topStatement -> ^( STATEMENT topStatement ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:319:5: topStatement
            {
            pushFollow(FOLLOW_topStatement_in_statement1032);
            topStatement73=topStatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_topStatement.add(topStatement73.getTree());
            if ( state.backtracking==0 ) {

                    startIndex = (topStatement73!=null?((SLAST)topStatement73.tree):null).startIndex;
                    endIndex = (topStatement73!=null?((SLAST)topStatement73.tree):null).endIndex;
                
            }


            // AST REWRITE
            // elements: topStatement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 324:5: -> ^( STATEMENT topStatement )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:324:8: ^( STATEMENT topStatement )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(STATEMENT, "STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_topStatement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST exprToken = retval.tree;
                exprToken.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class topStatement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topStatement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:327:1: topStatement : ( block | if_stat | WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement -> ^( WHILE_T ^( CONDITION expression ) while_statement ) | DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( DO_T ^( CONDITION expression ) statement ) | FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? ) | SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list ) | BREAK_T ( expression )? SEMI_COLON -> ^( BREAK_T ( expression )? ) | CONTINUE_T ( expression )? SEMI_COLON -> ^( CONTINUE_T ( expression )? ) | RETURN_T ( expression )? SEMI_COLON -> ^( RETURN_T ( expression )? ) | GLOBAL_T variable_list SEMI_COLON -> ^( GLOBAL_T variable_list ) | STATIC_T static_var_list SEMI_COLON -> ^( STATIC_T static_var_list ) | ECHO_T expr_list SEMI_COLON -> ^( ECHO_T expr_list ) | expression SEMI_COLON | FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement ) | DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement -> ^( DECLARE_T directive ( declare_statement )? ) | SEMI_COLON -> ^( EMPTYSTATEMENT SEMI_COLON ) | TRY_T block ( catch_branch )+ -> ^( TRY_T block ( catch_branch )+ ) | THROW_T expression SEMI_COLON -> ^( THROW_T expression ) | USE_T scalar SEMI_COLON -> ^( USE_T scalar ) | USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON -> ^( USE_PARETHESIS_T scalar ) | INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_T expression ) | INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_ONCE_T expression ) | REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_T expression ) | REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_ONCE_T expression ) );
    public final CompilerAstParser.topStatement_return topStatement() throws RecognitionException {
        CompilerAstParser.topStatement_return retval = new CompilerAstParser.topStatement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token WHILE_T76=null;
        Token LEFT_PARETHESIS77=null;
        Token RIGHT_PARETHESIS79=null;
        Token DO_T81=null;
        Token WHILE_T83=null;
        Token LEFT_PARETHESIS84=null;
        Token RIGHT_PARETHESIS86=null;
        Token SEMI_COLON87=null;
        Token FOR_T88=null;
        Token LEFT_PARETHESIS89=null;
        Token SEMI_COLON90=null;
        Token SEMI_COLON91=null;
        Token RIGHT_PARETHESIS92=null;
        Token SWITCH_T94=null;
        Token LEFT_PARETHESIS95=null;
        Token RIGHT_PARETHESIS97=null;
        Token BREAK_T99=null;
        Token SEMI_COLON101=null;
        Token CONTINUE_T102=null;
        Token SEMI_COLON104=null;
        Token RETURN_T105=null;
        Token SEMI_COLON107=null;
        Token GLOBAL_T108=null;
        Token SEMI_COLON110=null;
        Token STATIC_T111=null;
        Token SEMI_COLON113=null;
        Token ECHO_T114=null;
        Token SEMI_COLON116=null;
        Token SEMI_COLON118=null;
        Token FOREACH_T119=null;
        Token LEFT_PARETHESIS120=null;
        Token AS_T122=null;
        Token ARROW_T124=null;
        Token RIGHT_PARETHESIS126=null;
        Token DECLARE_T128=null;
        Token LEFT_PARETHESIS129=null;
        Token RIGHT_PARETHESIS131=null;
        Token SEMI_COLON133=null;
        Token TRY_T134=null;
        Token THROW_T137=null;
        Token SEMI_COLON139=null;
        Token USE_T140=null;
        Token SEMI_COLON142=null;
        Token USE_T143=null;
        Token LEFT_PARETHESIS144=null;
        Token RIGHT_PARETHESIS146=null;
        Token SEMI_COLON147=null;
        Token INCLUDE_T148=null;
        Token LEFT_PARETHESIS149=null;
        Token RIGHT_PARETHESIS151=null;
        Token SEMI_COLON152=null;
        Token INCLUDE_ONCE_T153=null;
        Token LEFT_PARETHESIS154=null;
        Token RIGHT_PARETHESIS156=null;
        Token SEMI_COLON157=null;
        Token REQUIRE_T158=null;
        Token LEFT_PARETHESIS159=null;
        Token RIGHT_PARETHESIS161=null;
        Token SEMI_COLON162=null;
        Token REQUIRE_ONCE_T163=null;
        Token LEFT_PARETHESIS164=null;
        Token RIGHT_PARETHESIS166=null;
        Token SEMI_COLON167=null;
        CompilerAstParser.expr_list_return e1 = null;

        CompilerAstParser.expr_list_return e2 = null;

        CompilerAstParser.expr_list_return e3 = null;

        CompilerAstParser.block_return block74 = null;

        CompilerAstParser.if_stat_return if_stat75 = null;

        CompilerAstParser.expression_return expression78 = null;

        CompilerAstParser.while_statement_return while_statement80 = null;

        CompilerAstParser.statement_return statement82 = null;

        CompilerAstParser.expression_return expression85 = null;

        CompilerAstParser.for_statement_return for_statement93 = null;

        CompilerAstParser.expression_return expression96 = null;

        CompilerAstParser.switch_case_list_return switch_case_list98 = null;

        CompilerAstParser.expression_return expression100 = null;

        CompilerAstParser.expression_return expression103 = null;

        CompilerAstParser.expression_return expression106 = null;

        CompilerAstParser.variable_list_return variable_list109 = null;

        CompilerAstParser.static_var_list_return static_var_list112 = null;

        CompilerAstParser.expr_list_return expr_list115 = null;

        CompilerAstParser.expression_return expression117 = null;

        CompilerAstParser.expression_return expression121 = null;

        CompilerAstParser.foreach_variable_return foreach_variable123 = null;

        CompilerAstParser.foreach_variable_return foreach_variable125 = null;

        CompilerAstParser.foreach_statement_return foreach_statement127 = null;

        CompilerAstParser.directive_return directive130 = null;

        CompilerAstParser.declare_statement_return declare_statement132 = null;

        CompilerAstParser.block_return block135 = null;

        CompilerAstParser.catch_branch_return catch_branch136 = null;

        CompilerAstParser.expression_return expression138 = null;

        CompilerAstParser.scalar_return scalar141 = null;

        CompilerAstParser.scalar_return scalar145 = null;

        CompilerAstParser.expression_return expression150 = null;

        CompilerAstParser.expression_return expression155 = null;

        CompilerAstParser.expression_return expression160 = null;

        CompilerAstParser.expression_return expression165 = null;


        SLAST WHILE_T76_tree=null;
        SLAST LEFT_PARETHESIS77_tree=null;
        SLAST RIGHT_PARETHESIS79_tree=null;
        SLAST DO_T81_tree=null;
        SLAST WHILE_T83_tree=null;
        SLAST LEFT_PARETHESIS84_tree=null;
        SLAST RIGHT_PARETHESIS86_tree=null;
        SLAST SEMI_COLON87_tree=null;
        SLAST FOR_T88_tree=null;
        SLAST LEFT_PARETHESIS89_tree=null;
        SLAST SEMI_COLON90_tree=null;
        SLAST SEMI_COLON91_tree=null;
        SLAST RIGHT_PARETHESIS92_tree=null;
        SLAST SWITCH_T94_tree=null;
        SLAST LEFT_PARETHESIS95_tree=null;
        SLAST RIGHT_PARETHESIS97_tree=null;
        SLAST BREAK_T99_tree=null;
        SLAST SEMI_COLON101_tree=null;
        SLAST CONTINUE_T102_tree=null;
        SLAST SEMI_COLON104_tree=null;
        SLAST RETURN_T105_tree=null;
        SLAST SEMI_COLON107_tree=null;
        SLAST GLOBAL_T108_tree=null;
        SLAST SEMI_COLON110_tree=null;
        SLAST STATIC_T111_tree=null;
        SLAST SEMI_COLON113_tree=null;
        SLAST ECHO_T114_tree=null;
        SLAST SEMI_COLON116_tree=null;
        SLAST SEMI_COLON118_tree=null;
        SLAST FOREACH_T119_tree=null;
        SLAST LEFT_PARETHESIS120_tree=null;
        SLAST AS_T122_tree=null;
        SLAST ARROW_T124_tree=null;
        SLAST RIGHT_PARETHESIS126_tree=null;
        SLAST DECLARE_T128_tree=null;
        SLAST LEFT_PARETHESIS129_tree=null;
        SLAST RIGHT_PARETHESIS131_tree=null;
        SLAST SEMI_COLON133_tree=null;
        SLAST TRY_T134_tree=null;
        SLAST THROW_T137_tree=null;
        SLAST SEMI_COLON139_tree=null;
        SLAST USE_T140_tree=null;
        SLAST SEMI_COLON142_tree=null;
        SLAST USE_T143_tree=null;
        SLAST LEFT_PARETHESIS144_tree=null;
        SLAST RIGHT_PARETHESIS146_tree=null;
        SLAST SEMI_COLON147_tree=null;
        SLAST INCLUDE_T148_tree=null;
        SLAST LEFT_PARETHESIS149_tree=null;
        SLAST RIGHT_PARETHESIS151_tree=null;
        SLAST SEMI_COLON152_tree=null;
        SLAST INCLUDE_ONCE_T153_tree=null;
        SLAST LEFT_PARETHESIS154_tree=null;
        SLAST RIGHT_PARETHESIS156_tree=null;
        SLAST SEMI_COLON157_tree=null;
        SLAST REQUIRE_T158_tree=null;
        SLAST LEFT_PARETHESIS159_tree=null;
        SLAST RIGHT_PARETHESIS161_tree=null;
        SLAST SEMI_COLON162_tree=null;
        SLAST REQUIRE_ONCE_T163_tree=null;
        SLAST LEFT_PARETHESIS164_tree=null;
        SLAST RIGHT_PARETHESIS166_tree=null;
        SLAST SEMI_COLON167_tree=null;
        RewriteRuleTokenStream stream_REQUIRE_T=new RewriteRuleTokenStream(adaptor,"token REQUIRE_T");
        RewriteRuleTokenStream stream_SWITCH_T=new RewriteRuleTokenStream(adaptor,"token SWITCH_T");
        RewriteRuleTokenStream stream_ARROW_T=new RewriteRuleTokenStream(adaptor,"token ARROW_T");
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_RETURN_T=new RewriteRuleTokenStream(adaptor,"token RETURN_T");
        RewriteRuleTokenStream stream_TRY_T=new RewriteRuleTokenStream(adaptor,"token TRY_T");
        RewriteRuleTokenStream stream_DO_T=new RewriteRuleTokenStream(adaptor,"token DO_T");
        RewriteRuleTokenStream stream_GLOBAL_T=new RewriteRuleTokenStream(adaptor,"token GLOBAL_T");
        RewriteRuleTokenStream stream_ECHO_T=new RewriteRuleTokenStream(adaptor,"token ECHO_T");
        RewriteRuleTokenStream stream_USE_T=new RewriteRuleTokenStream(adaptor,"token USE_T");
        RewriteRuleTokenStream stream_FOREACH_T=new RewriteRuleTokenStream(adaptor,"token FOREACH_T");
        RewriteRuleTokenStream stream_WHILE_T=new RewriteRuleTokenStream(adaptor,"token WHILE_T");
        RewriteRuleTokenStream stream_INCLUDE_T=new RewriteRuleTokenStream(adaptor,"token INCLUDE_T");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleTokenStream stream_AS_T=new RewriteRuleTokenStream(adaptor,"token AS_T");
        RewriteRuleTokenStream stream_BREAK_T=new RewriteRuleTokenStream(adaptor,"token BREAK_T");
        RewriteRuleTokenStream stream_DECLARE_T=new RewriteRuleTokenStream(adaptor,"token DECLARE_T");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_FOR_T=new RewriteRuleTokenStream(adaptor,"token FOR_T");
        RewriteRuleTokenStream stream_CONTINUE_T=new RewriteRuleTokenStream(adaptor,"token CONTINUE_T");
        RewriteRuleTokenStream stream_THROW_T=new RewriteRuleTokenStream(adaptor,"token THROW_T");
        RewriteRuleTokenStream stream_REQUIRE_ONCE_T=new RewriteRuleTokenStream(adaptor,"token REQUIRE_ONCE_T");
        RewriteRuleTokenStream stream_INCLUDE_ONCE_T=new RewriteRuleTokenStream(adaptor,"token INCLUDE_ONCE_T");
        RewriteRuleTokenStream stream_STATIC_T=new RewriteRuleTokenStream(adaptor,"token STATIC_T");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_scalar=new RewriteRuleSubtreeStream(adaptor,"rule scalar");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_while_statement=new RewriteRuleSubtreeStream(adaptor,"rule while_statement");
        RewriteRuleSubtreeStream stream_static_var_list=new RewriteRuleSubtreeStream(adaptor,"rule static_var_list");
        RewriteRuleSubtreeStream stream_declare_statement=new RewriteRuleSubtreeStream(adaptor,"rule declare_statement");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_variable_list=new RewriteRuleSubtreeStream(adaptor,"rule variable_list");
        RewriteRuleSubtreeStream stream_catch_branch=new RewriteRuleSubtreeStream(adaptor,"rule catch_branch");
        RewriteRuleSubtreeStream stream_foreach_statement=new RewriteRuleSubtreeStream(adaptor,"rule foreach_statement");
        RewriteRuleSubtreeStream stream_for_statement=new RewriteRuleSubtreeStream(adaptor,"rule for_statement");
        RewriteRuleSubtreeStream stream_directive=new RewriteRuleSubtreeStream(adaptor,"rule directive");
        RewriteRuleSubtreeStream stream_foreach_variable=new RewriteRuleSubtreeStream(adaptor,"rule foreach_variable");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        RewriteRuleSubtreeStream stream_switch_case_list=new RewriteRuleSubtreeStream(adaptor,"rule switch_case_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:340:3: ( block | if_stat | WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement -> ^( WHILE_T ^( CONDITION expression ) while_statement ) | DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( DO_T ^( CONDITION expression ) statement ) | FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? ) | SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list ) | BREAK_T ( expression )? SEMI_COLON -> ^( BREAK_T ( expression )? ) | CONTINUE_T ( expression )? SEMI_COLON -> ^( CONTINUE_T ( expression )? ) | RETURN_T ( expression )? SEMI_COLON -> ^( RETURN_T ( expression )? ) | GLOBAL_T variable_list SEMI_COLON -> ^( GLOBAL_T variable_list ) | STATIC_T static_var_list SEMI_COLON -> ^( STATIC_T static_var_list ) | ECHO_T expr_list SEMI_COLON -> ^( ECHO_T expr_list ) | expression SEMI_COLON | FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement ) | DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement -> ^( DECLARE_T directive ( declare_statement )? ) | SEMI_COLON -> ^( EMPTYSTATEMENT SEMI_COLON ) | TRY_T block ( catch_branch )+ -> ^( TRY_T block ( catch_branch )+ ) | THROW_T expression SEMI_COLON -> ^( THROW_T expression ) | USE_T scalar SEMI_COLON -> ^( USE_T scalar ) | USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON -> ^( USE_PARETHESIS_T scalar ) | INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_T expression ) | INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_ONCE_T expression ) | REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_T expression ) | REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_ONCE_T expression ) )
            int alt33=24;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:340:5: block
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_block_in_topStatement1074);
                    block74=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block74.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(block74!=null?((Token)block74.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(block74!=null?((Token)block74.stop):null)).getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:345:5: if_stat
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_if_stat_in_topStatement1084);
                    if_stat75=if_stat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_stat75.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = (if_stat75!=null?((SLAST)if_stat75.tree):null).startIndex;
                          endIndex = (if_stat75!=null?((SLAST)if_stat75.tree):null).endIndex;
                        
                    }

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:350:5: WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement
                    {
                    WHILE_T76=(Token)match(input,WHILE_T,FOLLOW_WHILE_T_in_topStatement1094); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE_T.add(WHILE_T76);

                    LEFT_PARETHESIS77=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1096); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS77);

                    pushFollow(FOLLOW_expression_in_topStatement1098);
                    expression78=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression78.getTree());
                    RIGHT_PARETHESIS79=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1100); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS79);

                    pushFollow(FOLLOW_while_statement_in_topStatement1102);
                    while_statement80=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_while_statement.add(while_statement80.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)WHILE_T76).getStartIndex();
                          endIndex = ((CommonToken)(while_statement80!=null?((Token)while_statement80.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expression, while_statement, WHILE_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 355:5: -> ^( WHILE_T ^( CONDITION expression ) while_statement )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:355:9: ^( WHILE_T ^( CONDITION expression ) while_statement )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_WHILE_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:355:19: ^( CONDITION expression )
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_while_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:356:5: DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    DO_T81=(Token)match(input,DO_T,FOLLOW_DO_T_in_topStatement1135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO_T.add(DO_T81);

                    pushFollow(FOLLOW_statement_in_topStatement1137);
                    statement82=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement82.getTree());
                    WHILE_T83=(Token)match(input,WHILE_T,FOLLOW_WHILE_T_in_topStatement1139); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE_T.add(WHILE_T83);

                    LEFT_PARETHESIS84=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1141); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS84);

                    pushFollow(FOLLOW_expression_in_topStatement1143);
                    expression85=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression85.getTree());
                    RIGHT_PARETHESIS86=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1145); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS86);

                    SEMI_COLON87=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1147); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON87);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)DO_T81).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON87).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: statement, expression, DO_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 361:5: -> ^( DO_T ^( CONDITION expression ) statement )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:361:9: ^( DO_T ^( CONDITION expression ) statement )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_DO_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:361:16: ^( CONDITION expression )
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:362:5: FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement
                    {
                    FOR_T88=(Token)match(input,FOR_T,FOLLOW_FOR_T_in_topStatement1177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR_T.add(FOR_T88);

                    LEFT_PARETHESIS89=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1179); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS89);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:362:29: (e1= expr_list )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=NAMESPACE_T && LA25_0<=LEFT_PARETHESIS)||LA25_0==IDENTIFIER||LA25_0==REF_T||LA25_0==STRINGLITERAL||LA25_0==DOMAIN_T||(LA25_0>=PLUS_T && LA25_0<=MINUS_T)||(LA25_0>=UNSET_T && LA25_0<=MINUS_MINUS_T)||(LA25_0>=AT_T && LA25_0<=PRINT_T)||(LA25_0>=DOLLAR_T && LA25_0<=HERE_DOC)||(LA25_0>=189 && LA25_0<=196)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:362:29: e1= expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_topStatement1183);
                            e1=expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr_list.add(e1.getTree());

                            }
                            break;

                    }

                    SEMI_COLON90=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1186); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON90);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:362:54: (e2= expr_list )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=NAMESPACE_T && LA26_0<=LEFT_PARETHESIS)||LA26_0==IDENTIFIER||LA26_0==REF_T||LA26_0==STRINGLITERAL||LA26_0==DOMAIN_T||(LA26_0>=PLUS_T && LA26_0<=MINUS_T)||(LA26_0>=UNSET_T && LA26_0<=MINUS_MINUS_T)||(LA26_0>=AT_T && LA26_0<=PRINT_T)||(LA26_0>=DOLLAR_T && LA26_0<=HERE_DOC)||(LA26_0>=189 && LA26_0<=196)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:362:54: e2= expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_topStatement1190);
                            e2=expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr_list.add(e2.getTree());

                            }
                            break;

                    }

                    SEMI_COLON91=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1193); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON91);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:362:79: (e3= expr_list )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=NAMESPACE_T && LA27_0<=LEFT_PARETHESIS)||LA27_0==IDENTIFIER||LA27_0==REF_T||LA27_0==STRINGLITERAL||LA27_0==DOMAIN_T||(LA27_0>=PLUS_T && LA27_0<=MINUS_T)||(LA27_0>=UNSET_T && LA27_0<=MINUS_MINUS_T)||(LA27_0>=AT_T && LA27_0<=PRINT_T)||(LA27_0>=DOLLAR_T && LA27_0<=HERE_DOC)||(LA27_0>=189 && LA27_0<=196)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:362:79: e3= expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_topStatement1197);
                            e3=expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr_list.add(e3.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS92=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1200); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS92);

                    pushFollow(FOLLOW_for_statement_in_topStatement1202);
                    for_statement93=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_for_statement.add(for_statement93.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)FOR_T88).getStartIndex();
                          endIndex = ((CommonToken)RIGHT_PARETHESIS92).getStopIndex();
                          if ((for_statement93!=null?input.toString(for_statement93.start,for_statement93.stop):null) != null) {
                            endIndex = ((CommonToken)(for_statement93!=null?((Token)for_statement93.stop):null)).getStopIndex();
                          }
                        
                    }


                    // AST REWRITE
                    // elements: FOR_T, e2, for_statement, e1, e3
                    // token labels: 
                    // rule labels: e3, retval, e1, e2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.tree:null);
                    RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 370:5: -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:370:9: ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_FOR_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:370:17: ( $e1)?
                        if ( stream_e1.hasNext() ) {
                            adaptor.addChild(root_1, stream_e1.nextTree());

                        }
                        stream_e1.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:370:22: ^( CONDITION ( $e2)? )
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:370:34: ( $e2)?
                        if ( stream_e2.hasNext() ) {
                            adaptor.addChild(root_2, stream_e2.nextTree());

                        }
                        stream_e2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:370:40: ^( ITERATE ( $e3)? )
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(ITERATE, "ITERATE"), root_2);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:370:50: ( $e3)?
                        if ( stream_e3.hasNext() ) {
                            adaptor.addChild(root_2, stream_e3.nextTree());

                        }
                        stream_e3.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:370:56: ( for_statement )?
                        if ( stream_for_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_for_statement.nextTree());

                        }
                        stream_for_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:371:5: SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list
                    {
                    SWITCH_T94=(Token)match(input,SWITCH_T,FOLLOW_SWITCH_T_in_topStatement1246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH_T.add(SWITCH_T94);

                    LEFT_PARETHESIS95=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS95);

                    pushFollow(FOLLOW_expression_in_topStatement1250);
                    expression96=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression96.getTree());
                    RIGHT_PARETHESIS97=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1252); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS97);

                    pushFollow(FOLLOW_switch_case_list_in_topStatement1254);
                    switch_case_list98=switch_case_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_switch_case_list.add(switch_case_list98.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)SWITCH_T94).getStartIndex();
                          endIndex = ((CommonToken)(switch_case_list98!=null?((Token)switch_case_list98.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: switch_case_list, expression, SWITCH_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 376:5: -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:376:9: ^( SWITCH_T ^( CONDITION expression ) switch_case_list )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_SWITCH_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:376:20: ^( CONDITION expression )
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_switch_case_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:377:5: BREAK_T ( expression )? SEMI_COLON
                    {
                    BREAK_T99=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_topStatement1283); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK_T.add(BREAK_T99);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:377:13: ( expression )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=NAMESPACE_T && LA28_0<=LEFT_PARETHESIS)||LA28_0==IDENTIFIER||LA28_0==REF_T||LA28_0==STRINGLITERAL||LA28_0==DOMAIN_T||(LA28_0>=PLUS_T && LA28_0<=MINUS_T)||(LA28_0>=UNSET_T && LA28_0<=MINUS_MINUS_T)||(LA28_0>=AT_T && LA28_0<=PRINT_T)||(LA28_0>=DOLLAR_T && LA28_0<=HERE_DOC)||(LA28_0>=189 && LA28_0<=196)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:377:13: expression
                            {
                            pushFollow(FOLLOW_expression_in_topStatement1285);
                            expression100=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression100.getTree());

                            }
                            break;

                    }

                    SEMI_COLON101=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON101);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)BREAK_T99).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON101).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: BREAK_T, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 382:5: -> ^( BREAK_T ( expression )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:382:9: ^( BREAK_T ( expression )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_BREAK_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:382:19: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:383:5: CONTINUE_T ( expression )? SEMI_COLON
                    {
                    CONTINUE_T102=(Token)match(input,CONTINUE_T,FOLLOW_CONTINUE_T_in_topStatement1312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE_T.add(CONTINUE_T102);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:383:16: ( expression )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=NAMESPACE_T && LA29_0<=LEFT_PARETHESIS)||LA29_0==IDENTIFIER||LA29_0==REF_T||LA29_0==STRINGLITERAL||LA29_0==DOMAIN_T||(LA29_0>=PLUS_T && LA29_0<=MINUS_T)||(LA29_0>=UNSET_T && LA29_0<=MINUS_MINUS_T)||(LA29_0>=AT_T && LA29_0<=PRINT_T)||(LA29_0>=DOLLAR_T && LA29_0<=HERE_DOC)||(LA29_0>=189 && LA29_0<=196)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:383:16: expression
                            {
                            pushFollow(FOLLOW_expression_in_topStatement1314);
                            expression103=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression103.getTree());

                            }
                            break;

                    }

                    SEMI_COLON104=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1317); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON104);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)CONTINUE_T102).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON104).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expression, CONTINUE_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 388:5: -> ^( CONTINUE_T ( expression )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:388:9: ^( CONTINUE_T ( expression )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_CONTINUE_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:388:22: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:389:5: RETURN_T ( expression )? SEMI_COLON
                    {
                    RETURN_T105=(Token)match(input,RETURN_T,FOLLOW_RETURN_T_in_topStatement1353); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN_T.add(RETURN_T105);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:389:14: ( expression )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=NAMESPACE_T && LA30_0<=LEFT_PARETHESIS)||LA30_0==IDENTIFIER||LA30_0==REF_T||LA30_0==STRINGLITERAL||LA30_0==DOMAIN_T||(LA30_0>=PLUS_T && LA30_0<=MINUS_T)||(LA30_0>=UNSET_T && LA30_0<=MINUS_MINUS_T)||(LA30_0>=AT_T && LA30_0<=PRINT_T)||(LA30_0>=DOLLAR_T && LA30_0<=HERE_DOC)||(LA30_0>=189 && LA30_0<=196)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:389:14: expression
                            {
                            pushFollow(FOLLOW_expression_in_topStatement1355);
                            expression106=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());

                            }
                            break;

                    }

                    SEMI_COLON107=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON107);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)RETURN_T105).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON107).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: RETURN_T, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 394:5: -> ^( RETURN_T ( expression )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:394:9: ^( RETURN_T ( expression )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_RETURN_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:394:20: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:395:5: GLOBAL_T variable_list SEMI_COLON
                    {
                    GLOBAL_T108=(Token)match(input,GLOBAL_T,FOLLOW_GLOBAL_T_in_topStatement1397); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GLOBAL_T.add(GLOBAL_T108);

                    pushFollow(FOLLOW_variable_list_in_topStatement1399);
                    variable_list109=variable_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable_list.add(variable_list109.getTree());
                    SEMI_COLON110=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON110);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)GLOBAL_T108).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON110).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: variable_list, GLOBAL_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 400:5: -> ^( GLOBAL_T variable_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:400:9: ^( GLOBAL_T variable_list )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_GLOBAL_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_variable_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 11 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:401:5: STATIC_T static_var_list SEMI_COLON
                    {
                    STATIC_T111=(Token)match(input,STATIC_T,FOLLOW_STATIC_T_in_topStatement1439); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STATIC_T.add(STATIC_T111);

                    pushFollow(FOLLOW_static_var_list_in_topStatement1441);
                    static_var_list112=static_var_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_static_var_list.add(static_var_list112.getTree());
                    SEMI_COLON113=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON113);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)STATIC_T111).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON113).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: static_var_list, STATIC_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 406:5: -> ^( STATIC_T static_var_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:406:9: ^( STATIC_T static_var_list )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_STATIC_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_static_var_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 12 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:407:5: ECHO_T expr_list SEMI_COLON
                    {
                    ECHO_T114=(Token)match(input,ECHO_T,FOLLOW_ECHO_T_in_topStatement1478); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ECHO_T.add(ECHO_T114);

                    pushFollow(FOLLOW_expr_list_in_topStatement1480);
                    expr_list115=expr_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_list.add(expr_list115.getTree());
                    SEMI_COLON116=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1482); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON116);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)ECHO_T114).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON116).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: ECHO_T, expr_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 412:5: -> ^( ECHO_T expr_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:412:9: ^( ECHO_T expr_list )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_ECHO_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expr_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 13 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:413:5: expression SEMI_COLON
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_topStatement1505);
                    expression117=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression117.getTree());
                    SEMI_COLON118=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1507); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(expression117!=null?((Token)expression117.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(expression117!=null?((Token)expression117.stop):null)).getStopIndex();
                          if (((CommonToken)SEMI_COLON118).getStopIndex() != 0) {
                            endIndex = ((CommonToken)SEMI_COLON118).getStopIndex();
                          }    
                          System.out.println("weird:" + endIndex);
                        
                    }

                    }
                    break;
                case 14 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:422:5: FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement
                    {
                    FOREACH_T119=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_topStatement1518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOREACH_T.add(FOREACH_T119);

                    LEFT_PARETHESIS120=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1520); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS120);

                    pushFollow(FOLLOW_expression_in_topStatement1522);
                    expression121=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression121.getTree());
                    AS_T122=(Token)match(input,AS_T,FOLLOW_AS_T_in_topStatement1524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_T.add(AS_T122);

                    pushFollow(FOLLOW_foreach_variable_in_topStatement1526);
                    foreach_variable123=foreach_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_foreach_variable.add(foreach_variable123.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:422:64: ( ARROW_T foreach_variable )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==ARROW_T) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:422:65: ARROW_T foreach_variable
                            {
                            ARROW_T124=(Token)match(input,ARROW_T,FOLLOW_ARROW_T_in_topStatement1529); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ARROW_T.add(ARROW_T124);

                            pushFollow(FOLLOW_foreach_variable_in_topStatement1531);
                            foreach_variable125=foreach_variable();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_foreach_variable.add(foreach_variable125.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS126=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1535); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS126);

                    pushFollow(FOLLOW_foreach_statement_in_topStatement1545);
                    foreach_statement127=foreach_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_foreach_statement.add(foreach_statement127.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)FOREACH_T119).getStartIndex();
                          endIndex = ((CommonToken)(foreach_statement127!=null?((Token)foreach_statement127.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: AS_T, foreach_variable, foreach_variable, foreach_statement, expression, FOREACH_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 428:6: -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:428:9: ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_FOREACH_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:428:21: ^( AS_T expression foreach_variable ( foreach_variable )? )
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot(stream_AS_T.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());
                        adaptor.addChild(root_2, stream_foreach_variable.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:428:56: ( foreach_variable )?
                        if ( stream_foreach_variable.hasNext() ) {
                            adaptor.addChild(root_2, stream_foreach_variable.nextTree());

                        }
                        stream_foreach_variable.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_foreach_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 15 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:429:5: DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement
                    {
                    DECLARE_T128=(Token)match(input,DECLARE_T,FOLLOW_DECLARE_T_in_topStatement1580); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECLARE_T.add(DECLARE_T128);

                    LEFT_PARETHESIS129=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1582); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS129);

                    pushFollow(FOLLOW_directive_in_topStatement1584);
                    directive130=directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_directive.add(directive130.getTree());
                    RIGHT_PARETHESIS131=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS131);

                    pushFollow(FOLLOW_declare_statement_in_topStatement1588);
                    declare_statement132=declare_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declare_statement.add(declare_statement132.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)DECLARE_T128).getStartIndex();
                          endIndex = ((CommonToken)(declare_statement132!=null?((Token)declare_statement132.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: DECLARE_T, directive, declare_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 434:5: -> ^( DECLARE_T directive ( declare_statement )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:434:9: ^( DECLARE_T directive ( declare_statement )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_DECLARE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_directive.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:434:31: ( declare_statement )?
                        if ( stream_declare_statement.hasNext() ) {
                            adaptor.addChild(root_1, stream_declare_statement.nextTree());

                        }
                        stream_declare_statement.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 16 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:435:5: SEMI_COLON
                    {
                    SEMI_COLON133=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON133);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)SEMI_COLON133).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON133).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: SEMI_COLON
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 440:5: -> ^( EMPTYSTATEMENT SEMI_COLON )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:440:9: ^( EMPTYSTATEMENT SEMI_COLON )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(EMPTYSTATEMENT, "EMPTYSTATEMENT"), root_1);

                        adaptor.addChild(root_1, stream_SEMI_COLON.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 17 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:441:5: TRY_T block ( catch_branch )+
                    {
                    TRY_T134=(Token)match(input,TRY_T,FOLLOW_TRY_T_in_topStatement1637); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY_T.add(TRY_T134);

                    pushFollow(FOLLOW_block_in_topStatement1639);
                    block135=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block135.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:441:17: ( catch_branch )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==CATCH_T) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:441:17: catch_branch
                    	    {
                    	    pushFollow(FOLLOW_catch_branch_in_topStatement1641);
                    	    catch_branch136=catch_branch();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_catch_branch.add(catch_branch136.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)TRY_T134).getStartIndex();
                          endIndex = ((CommonToken)(catch_branch136!=null?((Token)catch_branch136.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: TRY_T, catch_branch, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 446:5: -> ^( TRY_T block ( catch_branch )+ )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:446:9: ^( TRY_T block ( catch_branch )+ )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_TRY_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_block.nextTree());
                        if ( !(stream_catch_branch.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_catch_branch.hasNext() ) {
                            adaptor.addChild(root_1, stream_catch_branch.nextTree());

                        }
                        stream_catch_branch.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 18 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:447:5: THROW_T expression SEMI_COLON
                    {
                    THROW_T137=(Token)match(input,THROW_T,FOLLOW_THROW_T_in_topStatement1668); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW_T.add(THROW_T137);

                    pushFollow(FOLLOW_expression_in_topStatement1670);
                    expression138=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression138.getTree());
                    SEMI_COLON139=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1672); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON139);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)THROW_T137).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON139).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: THROW_T, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 452:5: -> ^( THROW_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:452:9: ^( THROW_T expression )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_THROW_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 19 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:453:5: USE_T scalar SEMI_COLON
                    {
                    USE_T140=(Token)match(input,USE_T,FOLLOW_USE_T_in_topStatement1709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE_T.add(USE_T140);

                    pushFollow(FOLLOW_scalar_in_topStatement1711);
                    scalar141=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scalar.add(scalar141.getTree());
                    SEMI_COLON142=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON142);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)USE_T140).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON142).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: USE_T, scalar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 458:5: -> ^( USE_T scalar )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:458:9: ^( USE_T scalar )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_USE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_scalar.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 20 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:459:5: USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON
                    {
                    USE_T143=(Token)match(input,USE_T,FOLLOW_USE_T_in_topStatement1750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE_T.add(USE_T143);

                    LEFT_PARETHESIS144=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1752); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS144);

                    pushFollow(FOLLOW_scalar_in_topStatement1754);
                    scalar145=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scalar.add(scalar145.getTree());
                    RIGHT_PARETHESIS146=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1756); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS146);

                    SEMI_COLON147=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON147);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)USE_T143).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON147).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: scalar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 464:5: -> ^( USE_PARETHESIS_T scalar )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:464:9: ^( USE_PARETHESIS_T scalar )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(USE_PARETHESIS_T, "USE_PARETHESIS_T"), root_1);

                        adaptor.addChild(root_1, stream_scalar.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 21 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:465:5: INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    INCLUDE_T148=(Token)match(input,INCLUDE_T,FOLLOW_INCLUDE_T_in_topStatement1781); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCLUDE_T.add(INCLUDE_T148);

                    LEFT_PARETHESIS149=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS149);

                    pushFollow(FOLLOW_expression_in_topStatement1785);
                    expression150=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression150.getTree());
                    RIGHT_PARETHESIS151=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1787); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS151);

                    SEMI_COLON152=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1789); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON152);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)INCLUDE_T148).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON152).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expression, INCLUDE_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 470:5: -> ^( INCLUDE_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:470:9: ^( INCLUDE_T expression )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_INCLUDE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 22 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:471:5: INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    INCLUDE_ONCE_T153=(Token)match(input,INCLUDE_ONCE_T,FOLLOW_INCLUDE_ONCE_T_in_topStatement1812); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCLUDE_ONCE_T.add(INCLUDE_ONCE_T153);

                    LEFT_PARETHESIS154=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS154);

                    pushFollow(FOLLOW_expression_in_topStatement1816);
                    expression155=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression155.getTree());
                    RIGHT_PARETHESIS156=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1818); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS156);

                    SEMI_COLON157=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON157);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)INCLUDE_ONCE_T153).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON157).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expression, INCLUDE_ONCE_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 476:5: -> ^( INCLUDE_ONCE_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:476:9: ^( INCLUDE_ONCE_T expression )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_INCLUDE_ONCE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 23 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:477:5: REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    REQUIRE_T158=(Token)match(input,REQUIRE_T,FOLLOW_REQUIRE_T_in_topStatement1843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRE_T.add(REQUIRE_T158);

                    LEFT_PARETHESIS159=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS159);

                    pushFollow(FOLLOW_expression_in_topStatement1847);
                    expression160=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression160.getTree());
                    RIGHT_PARETHESIS161=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1849); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS161);

                    SEMI_COLON162=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1851); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON162);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)REQUIRE_T158).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON162).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expression, REQUIRE_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 482:5: -> ^( REQUIRE_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:482:9: ^( REQUIRE_T expression )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_REQUIRE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 24 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:483:5: REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    REQUIRE_ONCE_T163=(Token)match(input,REQUIRE_ONCE_T,FOLLOW_REQUIRE_ONCE_T_in_topStatement1874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRE_ONCE_T.add(REQUIRE_ONCE_T163);

                    LEFT_PARETHESIS164=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS164);

                    pushFollow(FOLLOW_expression_in_topStatement1878);
                    expression165=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression165.getTree());
                    RIGHT_PARETHESIS166=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1880); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS166);

                    SEMI_COLON167=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON167);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)REQUIRE_ONCE_T163).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON167).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: REQUIRE_ONCE_T, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 488:5: -> ^( REQUIRE_ONCE_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:488:9: ^( REQUIRE_ONCE_T expression )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_REQUIRE_ONCE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                if (ast != null) {
                  ast.setIndex(startIndex, endIndex);
                  System.out.println("statement " + startIndex + " " + endIndex);
                }

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "topStatement"

    public static class foreach_variable_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach_variable"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:495:1: foreach_variable : ( REF_T )? variable ;
    public final CompilerAstParser.foreach_variable_return foreach_variable() throws RecognitionException {
        CompilerAstParser.foreach_variable_return retval = new CompilerAstParser.foreach_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token REF_T168=null;
        CompilerAstParser.variable_return variable169 = null;


        SLAST REF_T168_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:498:3: ( ( REF_T )? variable )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:498:5: ( REF_T )? variable
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:498:5: ( REF_T )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==REF_T) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:498:5: REF_T
                    {
                    REF_T168=(Token)match(input,REF_T,FOLLOW_REF_T_in_foreach_variable1922); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REF_T168_tree = (SLAST)adaptor.create(REF_T168);
                    adaptor.addChild(root_0, REF_T168_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_variable_in_foreach_variable1925);
            variable169=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable169.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreach_variable"

    public static class use_filename_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "use_filename"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:501:1: use_filename : ( STRINGLITERAL | QUOTE_STRING | LEFT_PARETHESIS STRINGLITERAL RIGHT_PARETHESIS | LEFT_PARETHESIS QUOTE_STRING RIGHT_PARETHESIS );
    public final CompilerAstParser.use_filename_return use_filename() throws RecognitionException {
        CompilerAstParser.use_filename_return retval = new CompilerAstParser.use_filename_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token STRINGLITERAL170=null;
        Token QUOTE_STRING171=null;
        Token LEFT_PARETHESIS172=null;
        Token STRINGLITERAL173=null;
        Token RIGHT_PARETHESIS174=null;
        Token LEFT_PARETHESIS175=null;
        Token QUOTE_STRING176=null;
        Token RIGHT_PARETHESIS177=null;

        SLAST STRINGLITERAL170_tree=null;
        SLAST QUOTE_STRING171_tree=null;
        SLAST LEFT_PARETHESIS172_tree=null;
        SLAST STRINGLITERAL173_tree=null;
        SLAST RIGHT_PARETHESIS174_tree=null;
        SLAST LEFT_PARETHESIS175_tree=null;
        SLAST QUOTE_STRING176_tree=null;
        SLAST RIGHT_PARETHESIS177_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:502:3: ( STRINGLITERAL | QUOTE_STRING | LEFT_PARETHESIS STRINGLITERAL RIGHT_PARETHESIS | LEFT_PARETHESIS QUOTE_STRING RIGHT_PARETHESIS )
            int alt35=4;
            switch ( input.LA(1) ) {
            case STRINGLITERAL:
                {
                alt35=1;
                }
                break;
            case QUOTE_STRING:
                {
                alt35=2;
                }
                break;
            case LEFT_PARETHESIS:
                {
                int LA35_3 = input.LA(2);

                if ( (LA35_3==STRINGLITERAL) ) {
                    alt35=3;
                }
                else if ( (LA35_3==QUOTE_STRING) ) {
                    alt35=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:502:5: STRINGLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    STRINGLITERAL170=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_use_filename1940); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRINGLITERAL170_tree = (SLAST)adaptor.create(STRINGLITERAL170);
                    adaptor.addChild(root_0, STRINGLITERAL170_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:503:5: QUOTE_STRING
                    {
                    root_0 = (SLAST)adaptor.nil();

                    QUOTE_STRING171=(Token)match(input,QUOTE_STRING,FOLLOW_QUOTE_STRING_in_use_filename1946); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUOTE_STRING171_tree = (SLAST)adaptor.create(QUOTE_STRING171);
                    adaptor.addChild(root_0, QUOTE_STRING171_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:504:5: LEFT_PARETHESIS STRINGLITERAL RIGHT_PARETHESIS
                    {
                    root_0 = (SLAST)adaptor.nil();

                    LEFT_PARETHESIS172=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_use_filename1952); if (state.failed) return retval;
                    STRINGLITERAL173=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_use_filename1955); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRINGLITERAL173_tree = (SLAST)adaptor.create(STRINGLITERAL173);
                    adaptor.addChild(root_0, STRINGLITERAL173_tree);
                    }
                    RIGHT_PARETHESIS174=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_use_filename1957); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:505:5: LEFT_PARETHESIS QUOTE_STRING RIGHT_PARETHESIS
                    {
                    root_0 = (SLAST)adaptor.nil();

                    LEFT_PARETHESIS175=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_use_filename1964); if (state.failed) return retval;
                    QUOTE_STRING176=(Token)match(input,QUOTE_STRING,FOLLOW_QUOTE_STRING_in_use_filename1967); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUOTE_STRING176_tree = (SLAST)adaptor.create(QUOTE_STRING176);
                    adaptor.addChild(root_0, QUOTE_STRING176_tree);
                    }
                    RIGHT_PARETHESIS177=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_use_filename1969); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "use_filename"

    public static class fully_qualified_class_name_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fully_qualified_class_name_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:521:1: fully_qualified_class_name_list : fully_qualified_class_name ( ',' fully_qualified_class_name )* -> ( fully_qualified_class_name )+ ;
    public final CompilerAstParser.fully_qualified_class_name_list_return fully_qualified_class_name_list() throws RecognitionException {
        CompilerAstParser.fully_qualified_class_name_list_return retval = new CompilerAstParser.fully_qualified_class_name_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token char_literal179=null;
        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name178 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name180 = null;


        SLAST char_literal179_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:522:3: ( fully_qualified_class_name ( ',' fully_qualified_class_name )* -> ( fully_qualified_class_name )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:522:5: fully_qualified_class_name ( ',' fully_qualified_class_name )*
            {
            pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1998);
            fully_qualified_class_name178=fully_qualified_class_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name178.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:522:32: ( ',' fully_qualified_class_name )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COMMA_T) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:522:33: ',' fully_qualified_class_name
            	    {
            	    char_literal179=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_fully_qualified_class_name_list2001); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(char_literal179);

            	    pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list2003);
            	    fully_qualified_class_name180=fully_qualified_class_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name180.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);



            // AST REWRITE
            // elements: fully_qualified_class_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 522:69: -> ( fully_qualified_class_name )+
            {
                if ( !(stream_fully_qualified_class_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fully_qualified_class_name.hasNext() ) {
                    adaptor.addChild(root_0, stream_fully_qualified_class_name.nextTree());

                }
                stream_fully_qualified_class_name.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fully_qualified_class_name_list"

    public static class fully_qualified_class_name_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fully_qualified_class_name"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:525:1: fully_qualified_class_name : ( ( NAMESPACE_T )? DOMAIN_T )? id1= IDENTIFIER ( DOMAIN_T id2= IDENTIFIER )* (d2= DOMAIN_T )? ;
    public final CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name() throws RecognitionException {
        CompilerAstParser.fully_qualified_class_name_return retval = new CompilerAstParser.fully_qualified_class_name_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token id1=null;
        Token id2=null;
        Token d2=null;
        Token NAMESPACE_T181=null;
        Token DOMAIN_T182=null;
        Token DOMAIN_T183=null;

        SLAST id1_tree=null;
        SLAST id2_tree=null;
        SLAST d2_tree=null;
        SLAST NAMESPACE_T181_tree=null;
        SLAST DOMAIN_T182_tree=null;
        SLAST DOMAIN_T183_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:3: ( ( ( NAMESPACE_T )? DOMAIN_T )? id1= IDENTIFIER ( DOMAIN_T id2= IDENTIFIER )* (d2= DOMAIN_T )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:5: ( ( NAMESPACE_T )? DOMAIN_T )? id1= IDENTIFIER ( DOMAIN_T id2= IDENTIFIER )* (d2= DOMAIN_T )?
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:5: ( ( NAMESPACE_T )? DOMAIN_T )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==NAMESPACE_T||LA38_0==DOMAIN_T) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:6: ( NAMESPACE_T )? DOMAIN_T
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:6: ( NAMESPACE_T )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==NAMESPACE_T) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:6: NAMESPACE_T
                            {
                            NAMESPACE_T181=(Token)match(input,NAMESPACE_T,FOLLOW_NAMESPACE_T_in_fully_qualified_class_name2038); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            NAMESPACE_T181_tree = (SLAST)adaptor.create(NAMESPACE_T181);
                            adaptor.addChild(root_0, NAMESPACE_T181_tree);
                            }

                            }
                            break;

                    }

                    DOMAIN_T182=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name2041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOMAIN_T182_tree = (SLAST)adaptor.create(DOMAIN_T182);
                    adaptor.addChild(root_0, DOMAIN_T182_tree);
                    }

                    }
                    break;

            }

            id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name2047); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            id1_tree = (SLAST)adaptor.create(id1);
            adaptor.addChild(root_0, id1_tree);
            }
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:45: ( DOMAIN_T id2= IDENTIFIER )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==DOMAIN_T) ) {
                    int LA39_1 = input.LA(2);

                    if ( (LA39_1==IDENTIFIER) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:46: DOMAIN_T id2= IDENTIFIER
            	    {
            	    DOMAIN_T183=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name2050); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOMAIN_T183_tree = (SLAST)adaptor.create(DOMAIN_T183);
            	    root_0 = (SLAST)adaptor.becomeRoot(DOMAIN_T183_tree, root_0);
            	    }
            	    id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name2055); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    id2_tree = (SLAST)adaptor.create(id2);
            	    adaptor.addChild(root_0, id2_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:75: (d2= DOMAIN_T )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==DOMAIN_T) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:536:75: d2= DOMAIN_T
                    {
                    d2=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name2061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    d2_tree = (SLAST)adaptor.create(d2);
                    adaptor.addChild(root_0, d2_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)id1;
                  startIndex = token.getStartIndex();
                  endIndex = token.getStopIndex();
                  if ((d2!=null?d2.getText():null) != null) {
                    endIndex = ((CommonToken)d2).getStopIndex();
                  }
                  else if ((id2!=null?id2.getText():null) != null) {
                    endIndex = ((CommonToken)id2).getStopIndex();
                  }
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                System.out.println("domain:" + startIndex + " " + endIndex);
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fully_qualified_class_name"

    public static class static_var_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "static_var_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:558:1: static_var_list : static_var_element ( COMMA_T static_var_element )* -> ( static_var_element )+ ;
    public final CompilerAstParser.static_var_list_return static_var_list() throws RecognitionException {
        CompilerAstParser.static_var_list_return retval = new CompilerAstParser.static_var_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T185=null;
        CompilerAstParser.static_var_element_return static_var_element184 = null;

        CompilerAstParser.static_var_element_return static_var_element186 = null;


        SLAST COMMA_T185_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_static_var_element=new RewriteRuleSubtreeStream(adaptor,"rule static_var_element");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:559:3: ( static_var_element ( COMMA_T static_var_element )* -> ( static_var_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:559:5: static_var_element ( COMMA_T static_var_element )*
            {
            pushFollow(FOLLOW_static_var_element_in_static_var_list2092);
            static_var_element184=static_var_element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_static_var_element.add(static_var_element184.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:559:24: ( COMMA_T static_var_element )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA_T) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:559:25: COMMA_T static_var_element
            	    {
            	    COMMA_T185=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_static_var_list2095); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T185);

            	    pushFollow(FOLLOW_static_var_element_in_static_var_list2097);
            	    static_var_element186=static_var_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_static_var_element.add(static_var_element186.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);



            // AST REWRITE
            // elements: static_var_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 559:55: -> ( static_var_element )+
            {
                if ( !(stream_static_var_element.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_static_var_element.hasNext() ) {
                    adaptor.addChild(root_0, stream_static_var_element.nextTree());

                }
                stream_static_var_element.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "static_var_list"

    public static class static_var_element_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "static_var_element"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:562:1: static_var_element : pure_variable ( EQUAL_T scalar )? ;
    public final CompilerAstParser.static_var_element_return static_var_element() throws RecognitionException {
        CompilerAstParser.static_var_element_return retval = new CompilerAstParser.static_var_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token EQUAL_T188=null;
        CompilerAstParser.pure_variable_return pure_variable187 = null;

        CompilerAstParser.scalar_return scalar189 = null;


        SLAST EQUAL_T188_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:572:3: ( pure_variable ( EQUAL_T scalar )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:572:5: pure_variable ( EQUAL_T scalar )?
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_pure_variable_in_static_var_element2129);
            pure_variable187=pure_variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pure_variable187.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:572:19: ( EQUAL_T scalar )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==EQUAL_T) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:572:20: EQUAL_T scalar
                    {
                    EQUAL_T188=(Token)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_static_var_element2132); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUAL_T188_tree = (SLAST)adaptor.create(EQUAL_T188);
                    root_0 = (SLAST)adaptor.becomeRoot(EQUAL_T188_tree, root_0);
                    }
                    pushFollow(FOLLOW_scalar_in_static_var_element2135);
                    scalar189=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar189.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(pure_variable187!=null?((Token)pure_variable187.start):null);
                  startIndex = token.getStartIndex();
                  endIndex = token.getStopIndex();
                  if ((scalar189!=null?input.toString(scalar189.start,scalar189.stop):null) != null) {
                    endIndex = ((CommonToken)(scalar189!=null?((Token)scalar189.stop):null)).getStopIndex();
                  }
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "static_var_element"

    public static class if_stat_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_stat"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:583:1: if_stat : IF_T LEFT_PARETHESIS eIfCond= expression RIGHT_PARETHESIS (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) ) ;
    public final CompilerAstParser.if_stat_return if_stat() throws RecognitionException {
        CompilerAstParser.if_stat_return retval = new CompilerAstParser.if_stat_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token IF_T190=null;
        Token LEFT_PARETHESIS191=null;
        Token RIGHT_PARETHESIS192=null;
        Token ELSEIF_T193=null;
        Token LEFT_PARETHESIS194=null;
        Token RIGHT_PARETHESIS195=null;
        Token ELSE_T196=null;
        Token COLON_T197=null;
        Token ELSE_T200=null;
        Token COLON_T201=null;
        Token ENDIF_T202=null;
        Token SEMI_COLON203=null;
        CompilerAstParser.expression_return eIfCond = null;

        CompilerAstParser.statement_return s1 = null;

        CompilerAstParser.expression_return eElseCond = null;

        CompilerAstParser.statement_return s2 = null;

        CompilerAstParser.statement_return s3 = null;

        CompilerAstParser.statement_return s4 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list198 = null;

        CompilerAstParser.new_elseif_branch_return new_elseif_branch199 = null;


        SLAST IF_T190_tree=null;
        SLAST LEFT_PARETHESIS191_tree=null;
        SLAST RIGHT_PARETHESIS192_tree=null;
        SLAST ELSEIF_T193_tree=null;
        SLAST LEFT_PARETHESIS194_tree=null;
        SLAST RIGHT_PARETHESIS195_tree=null;
        SLAST ELSE_T196_tree=null;
        SLAST COLON_T197_tree=null;
        SLAST ELSE_T200_tree=null;
        SLAST COLON_T201_tree=null;
        SLAST ENDIF_T202_tree=null;
        SLAST SEMI_COLON203_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_IF_T=new RewriteRuleTokenStream(adaptor,"token IF_T");
        RewriteRuleTokenStream stream_ELSEIF_T=new RewriteRuleTokenStream(adaptor,"token ELSEIF_T");
        RewriteRuleTokenStream stream_ENDIF_T=new RewriteRuleTokenStream(adaptor,"token ENDIF_T");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleTokenStream stream_ELSE_T=new RewriteRuleTokenStream(adaptor,"token ELSE_T");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");
        RewriteRuleSubtreeStream stream_new_elseif_branch=new RewriteRuleSubtreeStream(adaptor,"rule new_elseif_branch");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:594:3: ( IF_T LEFT_PARETHESIS eIfCond= expression RIGHT_PARETHESIS (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:594:5: IF_T LEFT_PARETHESIS eIfCond= expression RIGHT_PARETHESIS (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) )
            {
            IF_T190=(Token)match(input,IF_T,FOLLOW_IF_T_in_if_stat2166); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF_T.add(IF_T190);

            LEFT_PARETHESIS191=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_if_stat2168); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS191);

            pushFollow(FOLLOW_expression_in_if_stat2172);
            eIfCond=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(eIfCond.getTree());
            RIGHT_PARETHESIS192=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_if_stat2174); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS192);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:595:5: (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=NAMESPACE_T && LA48_0<=LEFT_PARETHESIS)||LA48_0==SEMI_COLON||LA48_0==IDENTIFIER||LA48_0==LEFT_BRACKET||LA48_0==REF_T||(LA48_0>=WHILE_T && LA48_0<=FOREACH_T)||(LA48_0>=DECLARE_T && LA48_0<=STRINGLITERAL)||LA48_0==DOMAIN_T||LA48_0==IF_T||(LA48_0>=PLUS_T && LA48_0<=MINUS_T)||(LA48_0>=UNSET_T && LA48_0<=MINUS_MINUS_T)||(LA48_0>=AT_T && LA48_0<=PRINT_T)||(LA48_0>=DOLLAR_T && LA48_0<=HERE_DOC)||(LA48_0>=189 && LA48_0<=196)) ) {
                alt48=1;
            }
            else if ( (LA48_0==COLON_T) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:596:7: s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )?
                    {
                    pushFollow(FOLLOW_statement_in_if_stat2190);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s1.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:596:20: ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )*
                    loop43:
                    do {
                        int alt43=2;
                        alt43 = dfa43.predict(input);
                        switch (alt43) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:596:53: ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement
                    	    {
                    	    ELSEIF_T193=(Token)match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_if_stat2206); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSEIF_T.add(ELSEIF_T193);

                    	    LEFT_PARETHESIS194=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_if_stat2208); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS194);

                    	    pushFollow(FOLLOW_expression_in_if_stat2212);
                    	    eElseCond=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(eElseCond.getTree());
                    	    RIGHT_PARETHESIS195=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_if_stat2214); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS195);

                    	    pushFollow(FOLLOW_statement_in_if_stat2218);
                    	    s2=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(s2.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:597:9: ( options {k=1; backtrack=true; } : ELSE_T s3= statement )?
                    int alt44=2;
                    alt44 = dfa44.predict(input);
                    switch (alt44) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:597:42: ELSE_T s3= statement
                            {
                            ELSE_T196=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_if_stat2244); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE_T.add(ELSE_T196);

                            pushFollow(FOLLOW_statement_in_if_stat2248);
                            s3=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(s3.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                              startIndex = ((CommonToken)IF_T190).getStartIndex();
                              endIndex = ((CommonToken)(s1!=null?((Token)s1.stop):null)).getStopIndex();
                              if ((s2!=null?input.toString(s2.start,s2.stop):null) != null) {
                                endIndex = ((CommonToken)(s2!=null?((Token)s2.stop):null)).getStopIndex();
                              }
                              if ((s3!=null?input.toString(s3.start,s3.stop):null) != null) {
                                endIndex = ((CommonToken)(s3!=null?((Token)s3.stop):null)).getStopIndex();
                              }
                           
                    }


                    // AST REWRITE
                    // elements: s3, s2, ELSE_T, IF_T, eElseCond, eIfCond, ELSEIF_T, s1
                    // token labels: 
                    // rule labels: retval, s2, s1, eIfCond, eElseCond, s3
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);
                    RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);
                    RewriteRuleSubtreeStream stream_eIfCond=new RewriteRuleSubtreeStream(adaptor,"rule eIfCond",eIfCond!=null?eIfCond.tree:null);
                    RewriteRuleSubtreeStream stream_eElseCond=new RewriteRuleSubtreeStream(adaptor,"rule eElseCond",eElseCond!=null?eElseCond.tree:null);
                    RewriteRuleSubtreeStream stream_s3=new RewriteRuleSubtreeStream(adaptor,"rule s3",s3!=null?s3.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 608:7: -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:608:11: ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_IF_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:608:18: ^( CONDITION $eIfCond)
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_eIfCond.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_s1.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:608:45: ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )*
                        while ( stream_s2.hasNext()||stream_eElseCond.hasNext()||stream_ELSEIF_T.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:608:45: ^( ELSEIF_T ^( CONDITION $eElseCond) $s2)
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_ELSEIF_T.nextNode(), root_2);

                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:608:56: ^( CONDITION $eElseCond)
                            {
                            SLAST root_3 = (SLAST)adaptor.nil();
                            root_3 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_3);

                            adaptor.addChild(root_3, stream_eElseCond.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }
                            adaptor.addChild(root_2, stream_s2.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_s2.reset();
                        stream_eElseCond.reset();
                        stream_ELSEIF_T.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:608:86: ( ^( ELSE_T $s3) )?
                        if ( stream_s3.hasNext()||stream_ELSE_T.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:608:86: ^( ELSE_T $s3)
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_ELSE_T.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_s3.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_s3.reset();
                        stream_ELSE_T.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:609:9: COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON
                    {
                    COLON_T197=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_if_stat2314); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T197);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:609:17: ( inner_statement_list )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( ((LA45_0>=NAMESPACE_T && LA45_0<=LEFT_PARETHESIS)||(LA45_0>=SEMI_COLON && LA45_0<=IDENTIFIER)||LA45_0==LEFT_BRACKET||(LA45_0>=INTERFACE_T && LA45_0<=REF_T)||(LA45_0>=WHILE_T && LA45_0<=FOREACH_T)||(LA45_0>=DECLARE_T && LA45_0<=STRINGLITERAL)||LA45_0==DOMAIN_T||LA45_0==IF_T||(LA45_0>=PLUS_T && LA45_0<=MINUS_T)||(LA45_0>=UNSET_T && LA45_0<=MINUS_MINUS_T)||(LA45_0>=AT_T && LA45_0<=PRINT_T)||(LA45_0>=DOLLAR_T && LA45_0<=HERE_DOC)||(LA45_0>=174 && LA45_0<=176)||(LA45_0>=189 && LA45_0<=196)) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:609:17: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_if_stat2316);
                            inner_statement_list198=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list198.getTree());

                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:609:39: ( new_elseif_branch )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==ELSEIF_T) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:609:39: new_elseif_branch
                    	    {
                    	    pushFollow(FOLLOW_new_elseif_branch_in_if_stat2319);
                    	    new_elseif_branch199=new_elseif_branch();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_new_elseif_branch.add(new_elseif_branch199.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:609:58: ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==ELSE_T) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:609:91: ELSE_T COLON_T s4= statement
                            {
                            ELSE_T200=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_if_stat2336); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE_T.add(ELSE_T200);

                            COLON_T201=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_if_stat2338); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T201);

                            pushFollow(FOLLOW_statement_in_if_stat2342);
                            s4=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(s4.getTree());

                            }
                            break;

                    }

                    ENDIF_T202=(Token)match(input,ENDIF_T,FOLLOW_ENDIF_T_in_if_stat2346); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDIF_T.add(ENDIF_T202);

                    SEMI_COLON203=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_if_stat2348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON203);

                    if ( state.backtracking==0 ) {

                              startIndex = ((CommonToken)IF_T190).getStartIndex();
                              endIndex = ((CommonToken)ENDIF_T202).getStartIndex() -2;
                           
                    }


                    // AST REWRITE
                    // elements: inner_statement_list, s4, IF_T, eIfCond, new_elseif_branch, ELSE_T
                    // token labels: 
                    // rule labels: retval, eIfCond, s4
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_eIfCond=new RewriteRuleSubtreeStream(adaptor,"rule eIfCond",eIfCond!=null?eIfCond.tree:null);
                    RewriteRuleSubtreeStream stream_s4=new RewriteRuleSubtreeStream(adaptor,"rule s4",s4!=null?s4.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 614:7: -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:614:11: ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_IF_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:614:18: ^( CONDITION $eIfCond)
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_eIfCond.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:614:40: ( inner_statement_list )?
                        if ( stream_inner_statement_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_inner_statement_list.nextTree());

                        }
                        stream_inner_statement_list.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:614:62: ( new_elseif_branch )*
                        while ( stream_new_elseif_branch.hasNext() ) {
                            adaptor.addChild(root_1, stream_new_elseif_branch.nextTree());

                        }
                        stream_new_elseif_branch.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:614:81: ( ^( ELSE_T $s4) )?
                        if ( stream_s4.hasNext()||stream_ELSE_T.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:614:81: ^( ELSE_T $s4)
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_ELSE_T.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_s4.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_s4.reset();
                        stream_ELSE_T.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                System.out.println("setif " + startIndex + " " + endIndex);
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_stat"

    public static class new_elseif_branch_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "new_elseif_branch"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:618:1: new_elseif_branch : ELSEIF_T LEFT_PARETHESIS expression RIGHT_PARETHESIS COLON_T ( inner_statement_list )? -> ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) ;
    public final CompilerAstParser.new_elseif_branch_return new_elseif_branch() throws RecognitionException {
        CompilerAstParser.new_elseif_branch_return retval = new CompilerAstParser.new_elseif_branch_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token ELSEIF_T204=null;
        Token LEFT_PARETHESIS205=null;
        Token RIGHT_PARETHESIS207=null;
        Token COLON_T208=null;
        CompilerAstParser.expression_return expression206 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list209 = null;


        SLAST ELSEIF_T204_tree=null;
        SLAST LEFT_PARETHESIS205_tree=null;
        SLAST RIGHT_PARETHESIS207_tree=null;
        SLAST COLON_T208_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_ELSEIF_T=new RewriteRuleTokenStream(adaptor,"token ELSEIF_T");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:628:2: ( ELSEIF_T LEFT_PARETHESIS expression RIGHT_PARETHESIS COLON_T ( inner_statement_list )? -> ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:628:4: ELSEIF_T LEFT_PARETHESIS expression RIGHT_PARETHESIS COLON_T ( inner_statement_list )?
            {
            ELSEIF_T204=(Token)match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_new_elseif_branch2419); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSEIF_T.add(ELSEIF_T204);

            LEFT_PARETHESIS205=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_new_elseif_branch2421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS205);

            pushFollow(FOLLOW_expression_in_new_elseif_branch2423);
            expression206=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression206.getTree());
            RIGHT_PARETHESIS207=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_new_elseif_branch2425); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS207);

            COLON_T208=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_new_elseif_branch2427); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T208);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:628:65: ( inner_statement_list )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=NAMESPACE_T && LA49_0<=LEFT_PARETHESIS)||(LA49_0>=SEMI_COLON && LA49_0<=IDENTIFIER)||LA49_0==LEFT_BRACKET||(LA49_0>=INTERFACE_T && LA49_0<=REF_T)||(LA49_0>=WHILE_T && LA49_0<=FOREACH_T)||(LA49_0>=DECLARE_T && LA49_0<=STRINGLITERAL)||LA49_0==DOMAIN_T||LA49_0==IF_T||(LA49_0>=PLUS_T && LA49_0<=MINUS_T)||(LA49_0>=UNSET_T && LA49_0<=MINUS_MINUS_T)||(LA49_0>=AT_T && LA49_0<=PRINT_T)||(LA49_0>=DOLLAR_T && LA49_0<=HERE_DOC)||(LA49_0>=174 && LA49_0<=176)||(LA49_0>=189 && LA49_0<=196)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:628:65: inner_statement_list
                    {
                    pushFollow(FOLLOW_inner_statement_list_in_new_elseif_branch2429);
                    inner_statement_list209=inner_statement_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list209.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)ELSEIF_T204;
                  startIndex = token.getStartIndex();
                  token = (CommonToken)COLON_T208;
                  endIndex = token.getStopIndex();
                  if ((inner_statement_list209!=null?input.toString(inner_statement_list209.start,inner_statement_list209.stop):null) != null) {
                    endIndex = ((CommonToken)(inner_statement_list209!=null?((Token)inner_statement_list209.stop):null)).getStopIndex();
                  }
                
            }


            // AST REWRITE
            // elements: expression, inner_statement_list, ELSEIF_T
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 638:4: -> ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:638:8: ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot(stream_ELSEIF_T.nextNode(), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:638:19: ^( CONDITION expression )
                {
                SLAST root_2 = (SLAST)adaptor.nil();
                root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:638:43: ( inner_statement_list )?
                if ( stream_inner_statement_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_inner_statement_list.nextTree());

                }
                stream_inner_statement_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "new_elseif_branch"

    public static class switch_case_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switch_case_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:641:1: switch_case_list : ( LEFT_BRACKET ( SEMI_COLON )? ( case_list )+ RIGHT_BRACKET -> ( case_list )+ | COLON_T ( SEMI_COLON )? ( case_list )+ ENDSWITCH_T SEMI_COLON -> ( case_list )+ );
    public final CompilerAstParser.switch_case_list_return switch_case_list() throws RecognitionException {
        CompilerAstParser.switch_case_list_return retval = new CompilerAstParser.switch_case_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_BRACKET210=null;
        Token SEMI_COLON211=null;
        Token RIGHT_BRACKET213=null;
        Token COLON_T214=null;
        Token SEMI_COLON215=null;
        Token ENDSWITCH_T217=null;
        Token SEMI_COLON218=null;
        CompilerAstParser.case_list_return case_list212 = null;

        CompilerAstParser.case_list_return case_list216 = null;


        SLAST LEFT_BRACKET210_tree=null;
        SLAST SEMI_COLON211_tree=null;
        SLAST RIGHT_BRACKET213_tree=null;
        SLAST COLON_T214_tree=null;
        SLAST SEMI_COLON215_tree=null;
        SLAST ENDSWITCH_T217_tree=null;
        SLAST SEMI_COLON218_tree=null;
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_ENDSWITCH_T=new RewriteRuleTokenStream(adaptor,"token ENDSWITCH_T");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_case_list=new RewriteRuleSubtreeStream(adaptor,"rule case_list");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:642:3: ( LEFT_BRACKET ( SEMI_COLON )? ( case_list )+ RIGHT_BRACKET -> ( case_list )+ | COLON_T ( SEMI_COLON )? ( case_list )+ ENDSWITCH_T SEMI_COLON -> ( case_list )+ )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LEFT_BRACKET) ) {
                alt54=1;
            }
            else if ( (LA54_0==COLON_T) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:642:5: LEFT_BRACKET ( SEMI_COLON )? ( case_list )+ RIGHT_BRACKET
                    {
                    LEFT_BRACKET210=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_switch_case_list2467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET210);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:642:18: ( SEMI_COLON )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==SEMI_COLON) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:642:18: SEMI_COLON
                            {
                            SEMI_COLON211=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_switch_case_list2469); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON211);


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:642:30: ( case_list )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=CASE_T && LA51_0<=DEFAULT_T)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:642:30: case_list
                    	    {
                    	    pushFollow(FOLLOW_case_list_in_switch_case_list2472);
                    	    case_list212=case_list();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_case_list.add(case_list212.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);

                    RIGHT_BRACKET213=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_switch_case_list2475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET213);



                    // AST REWRITE
                    // elements: case_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 642:65: -> ( case_list )+
                    {
                        if ( !(stream_case_list.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_case_list.hasNext() ) {
                            adaptor.addChild(root_0, stream_case_list.nextTree());

                        }
                        stream_case_list.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:643:5: COLON_T ( SEMI_COLON )? ( case_list )+ ENDSWITCH_T SEMI_COLON
                    {
                    COLON_T214=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_switch_case_list2497); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T214);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:643:13: ( SEMI_COLON )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==SEMI_COLON) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:643:13: SEMI_COLON
                            {
                            SEMI_COLON215=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_switch_case_list2499); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON215);


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:643:25: ( case_list )+
                    int cnt53=0;
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>=CASE_T && LA53_0<=DEFAULT_T)) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:643:25: case_list
                    	    {
                    	    pushFollow(FOLLOW_case_list_in_switch_case_list2502);
                    	    case_list216=case_list();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_case_list.add(case_list216.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt53 >= 1 ) break loop53;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(53, input);
                                throw eee;
                        }
                        cnt53++;
                    } while (true);

                    ENDSWITCH_T217=(Token)match(input,ENDSWITCH_T,FOLLOW_ENDSWITCH_T_in_switch_case_list2505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDSWITCH_T.add(ENDSWITCH_T217);

                    SEMI_COLON218=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_switch_case_list2507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON218);



                    // AST REWRITE
                    // elements: case_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 643:63: -> ( case_list )+
                    {
                        if ( !(stream_case_list.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_case_list.hasNext() ) {
                            adaptor.addChild(root_0, stream_case_list.nextTree());

                        }
                        stream_case_list.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "switch_case_list"

    public static class case_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "case_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:646:1: case_list : ( CASE_T expression ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( CASE_T expression ( inner_statement_list )? ) | DEFAULT_T ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( DEFAULT_T ( inner_statement_list )? ) );
    public final CompilerAstParser.case_list_return case_list() throws RecognitionException {
        CompilerAstParser.case_list_return retval = new CompilerAstParser.case_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token CASE_T219=null;
        Token COLON_T221=null;
        Token SEMI_COLON222=null;
        Token DEFAULT_T224=null;
        Token COLON_T225=null;
        Token SEMI_COLON226=null;
        CompilerAstParser.expression_return expression220 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list223 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list227 = null;


        SLAST CASE_T219_tree=null;
        SLAST COLON_T221_tree=null;
        SLAST SEMI_COLON222_tree=null;
        SLAST DEFAULT_T224_tree=null;
        SLAST COLON_T225_tree=null;
        SLAST SEMI_COLON226_tree=null;
        RewriteRuleTokenStream stream_CASE_T=new RewriteRuleTokenStream(adaptor,"token CASE_T");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_DEFAULT_T=new RewriteRuleTokenStream(adaptor,"token DEFAULT_T");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:656:3: ( CASE_T expression ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( CASE_T expression ( inner_statement_list )? ) | DEFAULT_T ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( DEFAULT_T ( inner_statement_list )? ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==CASE_T) ) {
                alt59=1;
            }
            else if ( (LA59_0==DEFAULT_T) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:656:5: CASE_T expression ( COLON_T | SEMI_COLON ) ( inner_statement_list )?
                    {
                    CASE_T219=(Token)match(input,CASE_T,FOLLOW_CASE_T_in_case_list2540); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE_T.add(CASE_T219);

                    pushFollow(FOLLOW_expression_in_case_list2542);
                    expression220=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression220.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:656:23: ( COLON_T | SEMI_COLON )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==COLON_T) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==SEMI_COLON) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:656:24: COLON_T
                            {
                            COLON_T221=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_case_list2545); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T221);


                            }
                            break;
                        case 2 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:656:34: SEMI_COLON
                            {
                            SEMI_COLON222=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_case_list2549); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON222);


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:656:46: ( inner_statement_list )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( ((LA56_0>=NAMESPACE_T && LA56_0<=LEFT_PARETHESIS)||(LA56_0>=SEMI_COLON && LA56_0<=IDENTIFIER)||LA56_0==LEFT_BRACKET||(LA56_0>=INTERFACE_T && LA56_0<=REF_T)||(LA56_0>=WHILE_T && LA56_0<=FOREACH_T)||(LA56_0>=DECLARE_T && LA56_0<=STRINGLITERAL)||LA56_0==DOMAIN_T||LA56_0==IF_T||(LA56_0>=PLUS_T && LA56_0<=MINUS_T)||(LA56_0>=UNSET_T && LA56_0<=MINUS_MINUS_T)||(LA56_0>=AT_T && LA56_0<=PRINT_T)||(LA56_0>=DOLLAR_T && LA56_0<=HERE_DOC)||(LA56_0>=174 && LA56_0<=176)||(LA56_0>=189 && LA56_0<=196)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:656:46: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_case_list2552);
                            inner_statement_list223=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list223.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                          token = (CommonToken)CASE_T219;
                          startIndex = token.getStartIndex();
                          token = (CommonToken)COLON_T221;
                          if ((SEMI_COLON222!=null?SEMI_COLON222.getText():null) != null) {
                            token = (CommonToken)SEMI_COLON222;
                          }
                          endIndex = token.getStopIndex();
                          if ((inner_statement_list223!=null?input.toString(inner_statement_list223.start,inner_statement_list223.stop):null) != null) {
                            endIndex = ((CommonToken)(inner_statement_list223!=null?((Token)inner_statement_list223.stop):null)).getStopIndex();
                          }
                        
                    }


                    // AST REWRITE
                    // elements: expression, CASE_T, inner_statement_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 669:5: -> ^( CASE_T expression ( inner_statement_list )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:669:9: ^( CASE_T expression ( inner_statement_list )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_CASE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:669:29: ( inner_statement_list )?
                        if ( stream_inner_statement_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_inner_statement_list.nextTree());

                        }
                        stream_inner_statement_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:670:5: DEFAULT_T ( COLON_T | SEMI_COLON ) ( inner_statement_list )?
                    {
                    DEFAULT_T224=(Token)match(input,DEFAULT_T,FOLLOW_DEFAULT_T_in_case_list2584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT_T.add(DEFAULT_T224);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:670:15: ( COLON_T | SEMI_COLON )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==COLON_T) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==SEMI_COLON) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:670:16: COLON_T
                            {
                            COLON_T225=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_case_list2587); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T225);


                            }
                            break;
                        case 2 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:670:26: SEMI_COLON
                            {
                            SEMI_COLON226=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_case_list2591); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON226);


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:670:38: ( inner_statement_list )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( ((LA58_0>=NAMESPACE_T && LA58_0<=LEFT_PARETHESIS)||(LA58_0>=SEMI_COLON && LA58_0<=IDENTIFIER)||LA58_0==LEFT_BRACKET||(LA58_0>=INTERFACE_T && LA58_0<=REF_T)||(LA58_0>=WHILE_T && LA58_0<=FOREACH_T)||(LA58_0>=DECLARE_T && LA58_0<=STRINGLITERAL)||LA58_0==DOMAIN_T||LA58_0==IF_T||(LA58_0>=PLUS_T && LA58_0<=MINUS_T)||(LA58_0>=UNSET_T && LA58_0<=MINUS_MINUS_T)||(LA58_0>=AT_T && LA58_0<=PRINT_T)||(LA58_0>=DOLLAR_T && LA58_0<=HERE_DOC)||(LA58_0>=174 && LA58_0<=176)||(LA58_0>=189 && LA58_0<=196)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:670:38: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_case_list2594);
                            inner_statement_list227=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list227.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                          token = (CommonToken)DEFAULT_T224;
                          startIndex = token.getStartIndex();
                          token = (CommonToken)COLON_T225;
                          if ((SEMI_COLON226!=null?SEMI_COLON226.getText():null) != null) {
                            token = (CommonToken)SEMI_COLON226;
                          }
                          endIndex = token.getStopIndex();
                          if ((inner_statement_list227!=null?input.toString(inner_statement_list227.start,inner_statement_list227.stop):null) != null) {
                            endIndex = ((CommonToken)(inner_statement_list227!=null?((Token)inner_statement_list227.stop):null)).getStopIndex();
                          }
                        
                    }


                    // AST REWRITE
                    // elements: inner_statement_list, DEFAULT_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 683:5: -> ^( DEFAULT_T ( inner_statement_list )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:683:9: ^( DEFAULT_T ( inner_statement_list )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_DEFAULT_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:683:21: ( inner_statement_list )?
                        if ( stream_inner_statement_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_inner_statement_list.nextTree());

                        }
                        stream_inner_statement_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "case_list"

    public static class catch_branch_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_branch"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:686:1: catch_branch : CATCH_T LEFT_PARETHESIS fully_qualified_class_name variable RIGHT_PARETHESIS block -> ^( CATCH_T fully_qualified_class_name variable block ) ;
    public final CompilerAstParser.catch_branch_return catch_branch() throws RecognitionException {
        CompilerAstParser.catch_branch_return retval = new CompilerAstParser.catch_branch_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token CATCH_T228=null;
        Token LEFT_PARETHESIS229=null;
        Token RIGHT_PARETHESIS232=null;
        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name230 = null;

        CompilerAstParser.variable_return variable231 = null;

        CompilerAstParser.block_return block233 = null;


        SLAST CATCH_T228_tree=null;
        SLAST LEFT_PARETHESIS229_tree=null;
        SLAST RIGHT_PARETHESIS232_tree=null;
        RewriteRuleTokenStream stream_CATCH_T=new RewriteRuleTokenStream(adaptor,"token CATCH_T");
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:696:3: ( CATCH_T LEFT_PARETHESIS fully_qualified_class_name variable RIGHT_PARETHESIS block -> ^( CATCH_T fully_qualified_class_name variable block ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:696:5: CATCH_T LEFT_PARETHESIS fully_qualified_class_name variable RIGHT_PARETHESIS block
            {
            CATCH_T228=(Token)match(input,CATCH_T,FOLLOW_CATCH_T_in_catch_branch2643); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH_T.add(CATCH_T228);

            LEFT_PARETHESIS229=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_catch_branch2645); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS229);

            pushFollow(FOLLOW_fully_qualified_class_name_in_catch_branch2647);
            fully_qualified_class_name230=fully_qualified_class_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name230.getTree());
            pushFollow(FOLLOW_variable_in_catch_branch2649);
            variable231=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable231.getTree());
            RIGHT_PARETHESIS232=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_catch_branch2651); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS232);

            pushFollow(FOLLOW_block_in_catch_branch2659);
            block233=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block233.getTree());
            if ( state.backtracking==0 ) {

              	    token = (CommonToken)CATCH_T228;
              	    startIndex = token.getStartIndex();
              	    token = (CommonToken)(block233!=null?((Token)block233.stop):null);
              	    endIndex = token.getStopIndex();  
                  
            }


            // AST REWRITE
            // elements: fully_qualified_class_name, variable, CATCH_T, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 704:5: -> ^( CATCH_T fully_qualified_class_name variable block )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:704:9: ^( CATCH_T fully_qualified_class_name variable block )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot(stream_CATCH_T.nextNode(), root_1);

                adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());
                adaptor.addChild(root_1, stream_variable.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catch_branch"

    public static class for_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:707:1: for_statement : ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOR_T SEMI_COLON -> ( inner_statement_list )? );
    public final CompilerAstParser.for_statement_return for_statement() throws RecognitionException {
        CompilerAstParser.for_statement_return retval = new CompilerAstParser.for_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COLON_T235=null;
        Token ENDFOR_T237=null;
        Token SEMI_COLON238=null;
        CompilerAstParser.statement_return statement234 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list236 = null;


        SLAST COLON_T235_tree=null;
        SLAST ENDFOR_T237_tree=null;
        SLAST SEMI_COLON238_tree=null;
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_ENDFOR_T=new RewriteRuleTokenStream(adaptor,"token ENDFOR_T");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:717:2: ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOR_T SEMI_COLON -> ( inner_statement_list )? )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=NAMESPACE_T && LA61_0<=LEFT_PARETHESIS)||LA61_0==SEMI_COLON||LA61_0==IDENTIFIER||LA61_0==LEFT_BRACKET||LA61_0==REF_T||(LA61_0>=WHILE_T && LA61_0<=FOREACH_T)||(LA61_0>=DECLARE_T && LA61_0<=STRINGLITERAL)||LA61_0==DOMAIN_T||LA61_0==IF_T||(LA61_0>=PLUS_T && LA61_0<=MINUS_T)||(LA61_0>=UNSET_T && LA61_0<=MINUS_MINUS_T)||(LA61_0>=AT_T && LA61_0<=PRINT_T)||(LA61_0>=DOLLAR_T && LA61_0<=HERE_DOC)||(LA61_0>=189 && LA61_0<=196)) ) {
                alt61=1;
            }
            else if ( (LA61_0==COLON_T) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:717:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_for_statement2704);
                    statement234=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement234.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(statement234!=null?((Token)statement234.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(statement234!=null?((Token)statement234.stop):null)).getStopIndex();
                       
                    }


                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 722:4: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:723:4: COLON_T ( inner_statement_list )? ENDFOR_T SEMI_COLON
                    {
                    COLON_T235=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_for_statement2720); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T235);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:723:12: ( inner_statement_list )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=NAMESPACE_T && LA60_0<=LEFT_PARETHESIS)||(LA60_0>=SEMI_COLON && LA60_0<=IDENTIFIER)||LA60_0==LEFT_BRACKET||(LA60_0>=INTERFACE_T && LA60_0<=REF_T)||(LA60_0>=WHILE_T && LA60_0<=FOREACH_T)||(LA60_0>=DECLARE_T && LA60_0<=STRINGLITERAL)||LA60_0==DOMAIN_T||LA60_0==IF_T||(LA60_0>=PLUS_T && LA60_0<=MINUS_T)||(LA60_0>=UNSET_T && LA60_0<=MINUS_MINUS_T)||(LA60_0>=AT_T && LA60_0<=PRINT_T)||(LA60_0>=DOLLAR_T && LA60_0<=HERE_DOC)||(LA60_0>=174 && LA60_0<=176)||(LA60_0>=189 && LA60_0<=196)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:723:12: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_for_statement2722);
                            inner_statement_list236=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list236.getTree());

                            }
                            break;

                    }

                    ENDFOR_T237=(Token)match(input,ENDFOR_T,FOLLOW_ENDFOR_T_in_for_statement2725); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDFOR_T.add(ENDFOR_T237);

                    SEMI_COLON238=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_for_statement2727); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON238);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)COLON_T235).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON238).getStopIndex();
                       
                    }


                    // AST REWRITE
                    // elements: inner_statement_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 728:4: -> ( inner_statement_list )?
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:728:8: ( inner_statement_list )?
                        if ( stream_inner_statement_list.hasNext() ) {
                            adaptor.addChild(root_0, stream_inner_statement_list.nextTree());

                        }
                        stream_inner_statement_list.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_statement"

    public static class while_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:731:1: while_statement : ( statement -> statement | COLON_T ( inner_statement_list )? ENDWHILE_T SEMI_COLON -> ( inner_statement_list )? );
    public final CompilerAstParser.while_statement_return while_statement() throws RecognitionException {
        CompilerAstParser.while_statement_return retval = new CompilerAstParser.while_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COLON_T240=null;
        Token ENDWHILE_T242=null;
        Token SEMI_COLON243=null;
        CompilerAstParser.statement_return statement239 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list241 = null;


        SLAST COLON_T240_tree=null;
        SLAST ENDWHILE_T242_tree=null;
        SLAST SEMI_COLON243_tree=null;
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_ENDWHILE_T=new RewriteRuleTokenStream(adaptor,"token ENDWHILE_T");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:741:2: ( statement -> statement | COLON_T ( inner_statement_list )? ENDWHILE_T SEMI_COLON -> ( inner_statement_list )? )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=NAMESPACE_T && LA63_0<=LEFT_PARETHESIS)||LA63_0==SEMI_COLON||LA63_0==IDENTIFIER||LA63_0==LEFT_BRACKET||LA63_0==REF_T||(LA63_0>=WHILE_T && LA63_0<=FOREACH_T)||(LA63_0>=DECLARE_T && LA63_0<=STRINGLITERAL)||LA63_0==DOMAIN_T||LA63_0==IF_T||(LA63_0>=PLUS_T && LA63_0<=MINUS_T)||(LA63_0>=UNSET_T && LA63_0<=MINUS_MINUS_T)||(LA63_0>=AT_T && LA63_0<=PRINT_T)||(LA63_0>=DOLLAR_T && LA63_0<=HERE_DOC)||(LA63_0>=189 && LA63_0<=196)) ) {
                alt63=1;
            }
            else if ( (LA63_0==COLON_T) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:741:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_while_statement2761);
                    statement239=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement239.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(statement239!=null?((Token)statement239.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(statement239!=null?((Token)statement239.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 746:4: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:747:4: COLON_T ( inner_statement_list )? ENDWHILE_T SEMI_COLON
                    {
                    COLON_T240=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_while_statement2778); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T240);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:747:12: ( inner_statement_list )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( ((LA62_0>=NAMESPACE_T && LA62_0<=LEFT_PARETHESIS)||(LA62_0>=SEMI_COLON && LA62_0<=IDENTIFIER)||LA62_0==LEFT_BRACKET||(LA62_0>=INTERFACE_T && LA62_0<=REF_T)||(LA62_0>=WHILE_T && LA62_0<=FOREACH_T)||(LA62_0>=DECLARE_T && LA62_0<=STRINGLITERAL)||LA62_0==DOMAIN_T||LA62_0==IF_T||(LA62_0>=PLUS_T && LA62_0<=MINUS_T)||(LA62_0>=UNSET_T && LA62_0<=MINUS_MINUS_T)||(LA62_0>=AT_T && LA62_0<=PRINT_T)||(LA62_0>=DOLLAR_T && LA62_0<=HERE_DOC)||(LA62_0>=174 && LA62_0<=176)||(LA62_0>=189 && LA62_0<=196)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:747:12: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_while_statement2780);
                            inner_statement_list241=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list241.getTree());

                            }
                            break;

                    }

                    ENDWHILE_T242=(Token)match(input,ENDWHILE_T,FOLLOW_ENDWHILE_T_in_while_statement2783); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDWHILE_T.add(ENDWHILE_T242);

                    SEMI_COLON243=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_while_statement2785); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON243);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)COLON_T240).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON243).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: inner_statement_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 752:4: -> ( inner_statement_list )?
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:752:8: ( inner_statement_list )?
                        if ( stream_inner_statement_list.hasNext() ) {
                            adaptor.addChild(root_0, stream_inner_statement_list.nextTree());

                        }
                        stream_inner_statement_list.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_statement"

    public static class foreach_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:755:1: foreach_statement : ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOREACH_T SEMI_COLON -> ( inner_statement_list )? );
    public final CompilerAstParser.foreach_statement_return foreach_statement() throws RecognitionException {
        CompilerAstParser.foreach_statement_return retval = new CompilerAstParser.foreach_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COLON_T245=null;
        Token ENDFOREACH_T247=null;
        Token SEMI_COLON248=null;
        CompilerAstParser.statement_return statement244 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list246 = null;


        SLAST COLON_T245_tree=null;
        SLAST ENDFOREACH_T247_tree=null;
        SLAST SEMI_COLON248_tree=null;
        RewriteRuleTokenStream stream_ENDFOREACH_T=new RewriteRuleTokenStream(adaptor,"token ENDFOREACH_T");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:766:3: ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOREACH_T SEMI_COLON -> ( inner_statement_list )? )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=NAMESPACE_T && LA65_0<=LEFT_PARETHESIS)||LA65_0==SEMI_COLON||LA65_0==IDENTIFIER||LA65_0==LEFT_BRACKET||LA65_0==REF_T||(LA65_0>=WHILE_T && LA65_0<=FOREACH_T)||(LA65_0>=DECLARE_T && LA65_0<=STRINGLITERAL)||LA65_0==DOMAIN_T||LA65_0==IF_T||(LA65_0>=PLUS_T && LA65_0<=MINUS_T)||(LA65_0>=UNSET_T && LA65_0<=MINUS_MINUS_T)||(LA65_0>=AT_T && LA65_0<=PRINT_T)||(LA65_0>=DOLLAR_T && LA65_0<=HERE_DOC)||(LA65_0>=189 && LA65_0<=196)) ) {
                alt65=1;
            }
            else if ( (LA65_0==COLON_T) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:766:5: statement
                    {
                    pushFollow(FOLLOW_statement_in_foreach_statement2821);
                    statement244=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement244.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(statement244!=null?((Token)statement244.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(statement244!=null?((Token)statement244.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 771:4: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:772:5: COLON_T ( inner_statement_list )? ENDFOREACH_T SEMI_COLON
                    {
                    COLON_T245=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_foreach_statement2839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T245);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:772:13: ( inner_statement_list )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=NAMESPACE_T && LA64_0<=LEFT_PARETHESIS)||(LA64_0>=SEMI_COLON && LA64_0<=IDENTIFIER)||LA64_0==LEFT_BRACKET||(LA64_0>=INTERFACE_T && LA64_0<=REF_T)||(LA64_0>=WHILE_T && LA64_0<=FOREACH_T)||(LA64_0>=DECLARE_T && LA64_0<=STRINGLITERAL)||LA64_0==DOMAIN_T||LA64_0==IF_T||(LA64_0>=PLUS_T && LA64_0<=MINUS_T)||(LA64_0>=UNSET_T && LA64_0<=MINUS_MINUS_T)||(LA64_0>=AT_T && LA64_0<=PRINT_T)||(LA64_0>=DOLLAR_T && LA64_0<=HERE_DOC)||(LA64_0>=174 && LA64_0<=176)||(LA64_0>=189 && LA64_0<=196)) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:772:13: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_foreach_statement2841);
                            inner_statement_list246=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list246.getTree());

                            }
                            break;

                    }

                    ENDFOREACH_T247=(Token)match(input,ENDFOREACH_T,FOLLOW_ENDFOREACH_T_in_foreach_statement2844); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDFOREACH_T.add(ENDFOREACH_T247);

                    SEMI_COLON248=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_foreach_statement2846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON248);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)COLON_T245).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON248).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: inner_statement_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 777:4: -> ( inner_statement_list )?
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:777:8: ( inner_statement_list )?
                        if ( stream_inner_statement_list.hasNext() ) {
                            adaptor.addChild(root_0, stream_inner_statement_list.nextTree());

                        }
                        stream_inner_statement_list.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("foreach stat :" + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreach_statement"

    public static class declare_statement_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declare_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:780:1: declare_statement : ( statement -> ^( BLOCK statement ) | COLON_T ( inner_statement_list )? ENDDECLARE_T SEMI_COLON -> ^( BLOCK ( inner_statement_list )? ) );
    public final CompilerAstParser.declare_statement_return declare_statement() throws RecognitionException {
        CompilerAstParser.declare_statement_return retval = new CompilerAstParser.declare_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COLON_T250=null;
        Token ENDDECLARE_T252=null;
        Token SEMI_COLON253=null;
        CompilerAstParser.statement_return statement249 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list251 = null;


        SLAST COLON_T250_tree=null;
        SLAST ENDDECLARE_T252_tree=null;
        SLAST SEMI_COLON253_tree=null;
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_ENDDECLARE_T=new RewriteRuleTokenStream(adaptor,"token ENDDECLARE_T");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:793:3: ( statement -> ^( BLOCK statement ) | COLON_T ( inner_statement_list )? ENDDECLARE_T SEMI_COLON -> ^( BLOCK ( inner_statement_list )? ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=NAMESPACE_T && LA67_0<=LEFT_PARETHESIS)||LA67_0==SEMI_COLON||LA67_0==IDENTIFIER||LA67_0==LEFT_BRACKET||LA67_0==REF_T||(LA67_0>=WHILE_T && LA67_0<=FOREACH_T)||(LA67_0>=DECLARE_T && LA67_0<=STRINGLITERAL)||LA67_0==DOMAIN_T||LA67_0==IF_T||(LA67_0>=PLUS_T && LA67_0<=MINUS_T)||(LA67_0>=UNSET_T && LA67_0<=MINUS_MINUS_T)||(LA67_0>=AT_T && LA67_0<=PRINT_T)||(LA67_0>=DOLLAR_T && LA67_0<=HERE_DOC)||(LA67_0>=189 && LA67_0<=196)) ) {
                alt67=1;
            }
            else if ( (LA67_0==COLON_T) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:793:5: statement
                    {
                    pushFollow(FOLLOW_statement_in_declare_statement2884);
                    statement249=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement249.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(statement249!=null?((Token)statement249.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(statement249!=null?((Token)statement249.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 798:5: -> ^( BLOCK statement )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:798:9: ^( BLOCK statement )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:799:5: COLON_T ( inner_statement_list )? ENDDECLARE_T SEMI_COLON
                    {
                    COLON_T250=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_declare_statement2907); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T250);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:799:13: ( inner_statement_list )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( ((LA66_0>=NAMESPACE_T && LA66_0<=LEFT_PARETHESIS)||(LA66_0>=SEMI_COLON && LA66_0<=IDENTIFIER)||LA66_0==LEFT_BRACKET||(LA66_0>=INTERFACE_T && LA66_0<=REF_T)||(LA66_0>=WHILE_T && LA66_0<=FOREACH_T)||(LA66_0>=DECLARE_T && LA66_0<=STRINGLITERAL)||LA66_0==DOMAIN_T||LA66_0==IF_T||(LA66_0>=PLUS_T && LA66_0<=MINUS_T)||(LA66_0>=UNSET_T && LA66_0<=MINUS_MINUS_T)||(LA66_0>=AT_T && LA66_0<=PRINT_T)||(LA66_0>=DOLLAR_T && LA66_0<=HERE_DOC)||(LA66_0>=174 && LA66_0<=176)||(LA66_0>=189 && LA66_0<=196)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:799:13: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_declare_statement2909);
                            inner_statement_list251=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list251.getTree());

                            }
                            break;

                    }

                    ENDDECLARE_T252=(Token)match(input,ENDDECLARE_T,FOLLOW_ENDDECLARE_T_in_declare_statement2912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDDECLARE_T.add(ENDDECLARE_T252);

                    SEMI_COLON253=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_declare_statement2914); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON253);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)COLON_T250).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON253).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: inner_statement_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 804:5: -> ^( BLOCK ( inner_statement_list )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:804:9: ^( BLOCK ( inner_statement_list )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:804:17: ( inner_statement_list )?
                        if ( stream_inner_statement_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_inner_statement_list.nextTree());

                        }
                        stream_inner_statement_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                if (ast != null) {
              	  System.out.println("decl stat:" + startIndex + " " + endIndex);
              	  ast.setIndex(startIndex, endIndex);
                }

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declare_statement"

    public static class parameter_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:807:1: parameter_list : p1= parameter ( COMMA_T p2= parameter )* -> ( parameter )+ ;
    public final CompilerAstParser.parameter_list_return parameter_list() throws RecognitionException {
        CompilerAstParser.parameter_list_return retval = new CompilerAstParser.parameter_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T254=null;
        CompilerAstParser.parameter_return p1 = null;

        CompilerAstParser.parameter_return p2 = null;


        SLAST COMMA_T254_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:817:3: (p1= parameter ( COMMA_T p2= parameter )* -> ( parameter )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:817:5: p1= parameter ( COMMA_T p2= parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameter_list2960);
            p1=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(p1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:817:18: ( COMMA_T p2= parameter )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==COMMA_T) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:817:19: COMMA_T p2= parameter
            	    {
            	    COMMA_T254=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_parameter_list2963); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T254);

            	    pushFollow(FOLLOW_parameter_in_parameter_list2967);
            	    p2=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(p2.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(p1!=null?((Token)p1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(p1!=null?((Token)p1.stop):null);
                  if ((p2!=null?input.toString(p2.start,p2.stop):null) != null) {
                    token = (CommonToken)(p2!=null?((Token)p2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 827:5: -> ( parameter )+
            {
                if ( !(stream_parameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_0, stream_parameter.nextTree());

                }
                stream_parameter.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_list"

    public static class parameter_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:830:1: parameter : ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T scalar )? -> ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) ;
    public final CompilerAstParser.parameter_return parameter() throws RecognitionException {
        CompilerAstParser.parameter_return retval = new CompilerAstParser.parameter_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token CONST_T256=null;
        Token EQUAL_T258=null;
        CompilerAstParser.parameter_type_return parameter_type255 = null;

        CompilerAstParser.pure_variable_return pure_variable257 = null;

        CompilerAstParser.scalar_return scalar259 = null;


        SLAST CONST_T256_tree=null;
        SLAST EQUAL_T258_tree=null;
        RewriteRuleTokenStream stream_EQUAL_T=new RewriteRuleTokenStream(adaptor,"token EQUAL_T");
        RewriteRuleTokenStream stream_CONST_T=new RewriteRuleTokenStream(adaptor,"token CONST_T");
        RewriteRuleSubtreeStream stream_scalar=new RewriteRuleSubtreeStream(adaptor,"rule scalar");
        RewriteRuleSubtreeStream stream_parameter_type=new RewriteRuleSubtreeStream(adaptor,"rule parameter_type");
        RewriteRuleSubtreeStream stream_pure_variable=new RewriteRuleSubtreeStream(adaptor,"rule pure_variable");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:840:3: ( ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T scalar )? -> ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:840:5: ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T scalar )?
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:840:5: ( parameter_type )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==NAMESPACE_T||LA69_0==IDENTIFIER||LA69_0==DOMAIN_T||(LA69_0>=UNSET_T && LA69_0<=CLONE_T)||(LA69_0>=181 && LA69_0<=189)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:840:5: parameter_type
                    {
                    pushFollow(FOLLOW_parameter_type_in_parameter3017);
                    parameter_type255=parameter_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_type.add(parameter_type255.getTree());

                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:840:21: ( CONST_T )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==CONST_T) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:840:21: CONST_T
                    {
                    CONST_T256=(Token)match(input,CONST_T,FOLLOW_CONST_T_in_parameter3020); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST_T.add(CONST_T256);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_variable_in_parameter3023);
            pure_variable257=pure_variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_variable.add(pure_variable257.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:840:44: ( options {k=1; backtrack=true; } : EQUAL_T scalar )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==EQUAL_T) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:840:76: EQUAL_T scalar
                    {
                    EQUAL_T258=(Token)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_parameter3039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL_T.add(EQUAL_T258);

                    pushFollow(FOLLOW_scalar_in_parameter3041);
                    scalar259=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scalar.add(scalar259.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(pure_variable257!=null?((Token)pure_variable257.start):null);
                  if ((parameter_type255!=null?input.toString(parameter_type255.start,parameter_type255.stop):null) != null) {
                    token = (CommonToken)(parameter_type255!=null?((Token)parameter_type255.start):null);
                  }
                  else if ((CONST_T256!=null?CONST_T256.getText():null) != null) {
                    token = (CommonToken)CONST_T256;
                  }
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(pure_variable257!=null?((Token)pure_variable257.stop):null);
                  if ((scalar259!=null?input.toString(scalar259.start,scalar259.stop):null) != null) {
                    token = (CommonToken)(scalar259!=null?((Token)scalar259.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: CONST_T, parameter_type, scalar, pure_variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 857:3: -> ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:857:6: ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(PARAMETER, "PARAMETER"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:857:18: ( ^( TYPE parameter_type ) )?
                if ( stream_parameter_type.hasNext() ) {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:857:18: ^( TYPE parameter_type )
                    {
                    SLAST root_2 = (SLAST)adaptor.nil();
                    root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(TYPE, "TYPE"), root_2);

                    adaptor.addChild(root_2, stream_parameter_type.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_parameter_type.reset();
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:857:42: ( CONST_T )?
                if ( stream_CONST_T.hasNext() ) {
                    adaptor.addChild(root_1, stream_CONST_T.nextNode());

                }
                stream_CONST_T.reset();
                adaptor.addChild(root_1, stream_pure_variable.nextTree());
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:857:65: ( scalar )?
                if ( stream_scalar.hasNext() ) {
                    adaptor.addChild(root_1, stream_scalar.nextTree());

                }
                stream_scalar.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class parameter_type_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_type"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:860:1: parameter_type : ( fully_qualified_class_name | cast_option );
    public final CompilerAstParser.parameter_type_return parameter_type() throws RecognitionException {
        CompilerAstParser.parameter_type_return retval = new CompilerAstParser.parameter_type_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name260 = null;

        CompilerAstParser.cast_option_return cast_option261 = null;




          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:870:3: ( fully_qualified_class_name | cast_option )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==NAMESPACE_T||LA72_0==IDENTIFIER||LA72_0==DOMAIN_T) ) {
                alt72=1;
            }
            else if ( ((LA72_0>=UNSET_T && LA72_0<=CLONE_T)||(LA72_0>=181 && LA72_0<=189)) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:870:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_fully_qualified_class_name_in_parameter_type3100);
                    fully_qualified_class_name260=fully_qualified_class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fully_qualified_class_name260.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(fully_qualified_class_name260!=null?((Token)fully_qualified_class_name260.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(fully_qualified_class_name260!=null?((Token)fully_qualified_class_name260.stop):null)).getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:875:5: cast_option
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_cast_option_in_parameter_type3110);
                    cast_option261=cast_option();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_option261.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(cast_option261!=null?((Token)cast_option261.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(cast_option261!=null?((Token)cast_option261.stop):null)).getStopIndex();
                        
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_type"

    public static class variable_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:882:1: variable_list : v1= variable ( COMMA_T v2= variable )* -> ( variable )+ ;
    public final CompilerAstParser.variable_list_return variable_list() throws RecognitionException {
        CompilerAstParser.variable_list_return retval = new CompilerAstParser.variable_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T262=null;
        CompilerAstParser.variable_return v1 = null;

        CompilerAstParser.variable_return v2 = null;


        SLAST COMMA_T262_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:892:3: (v1= variable ( COMMA_T v2= variable )* -> ( variable )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:892:5: v1= variable ( COMMA_T v2= variable )*
            {
            pushFollow(FOLLOW_variable_in_variable_list3141);
            v1=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(v1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:892:17: ( COMMA_T v2= variable )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==COMMA_T) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:892:18: COMMA_T v2= variable
            	    {
            	    COMMA_T262=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_variable_list3144); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T262);

            	    pushFollow(FOLLOW_variable_in_variable_list3148);
            	    v2=variable();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variable.add(v2.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(v1!=null?((Token)v1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(v1!=null?((Token)v1.stop):null);
                  if ((v2!=null?input.toString(v2.start,v2.stop):null) != null) {
                    token = (CommonToken)(v2!=null?((Token)v2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 902:5: -> ( variable )+
            {
                if ( !(stream_variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variable.hasNext() ) {
                    adaptor.addChild(root_0, stream_variable.nextTree());

                }
                stream_variable.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_list"

    public static class variable_modifiers_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_modifiers"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:905:1: variable_modifiers : ( 'var' | modifier );
    public final CompilerAstParser.variable_modifiers_return variable_modifiers() throws RecognitionException {
        CompilerAstParser.variable_modifiers_return retval = new CompilerAstParser.variable_modifiers_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token string_literal263=null;
        CompilerAstParser.modifier_return modifier264 = null;


        SLAST string_literal263_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:906:3: ( 'var' | modifier )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==177) ) {
                alt74=1;
            }
            else if ( (LA74_0==STATIC_T||(LA74_0>=175 && LA74_0<=176)||(LA74_0>=178 && LA74_0<=180)) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:906:5: 'var'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    string_literal263=(Token)match(input,177,FOLLOW_177_in_variable_modifiers3179); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal263_tree = (SLAST)adaptor.create(string_literal263);
                    adaptor.addChild(root_0, string_literal263_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:907:5: modifier
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_modifier_in_variable_modifiers3185);
                    modifier264=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier264.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_modifiers"

    public static class modifier_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:910:1: modifier : ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+ ;
    public final CompilerAstParser.modifier_return modifier() throws RecognitionException {
        CompilerAstParser.modifier_return retval = new CompilerAstParser.modifier_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set265=null;

        SLAST set265_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:911:3: ( ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:911:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:911:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==STATIC_T||(LA75_0>=175 && LA75_0<=176)||(LA75_0>=178 && LA75_0<=180)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:
            	    {
            	    set265=(Token)input.LT(1);
            	    if ( input.LA(1)==STATIC_T||(input.LA(1)>=175 && input.LA(1)<=176)||(input.LA(1)>=178 && input.LA(1)<=180) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set265));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class directive_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:919:1: directive : d1= directive_element ( COMMA_T d2= directive_element )* -> ( directive_element )+ ;
    public final CompilerAstParser.directive_return directive() throws RecognitionException {
        CompilerAstParser.directive_return retval = new CompilerAstParser.directive_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T266=null;
        CompilerAstParser.directive_element_return d1 = null;

        CompilerAstParser.directive_element_return d2 = null;


        SLAST COMMA_T266_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_directive_element=new RewriteRuleSubtreeStream(adaptor,"rule directive_element");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:929:3: (d1= directive_element ( COMMA_T d2= directive_element )* -> ( directive_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:929:5: d1= directive_element ( COMMA_T d2= directive_element )*
            {
            pushFollow(FOLLOW_directive_element_in_directive3262);
            d1=directive_element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_directive_element.add(d1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:929:26: ( COMMA_T d2= directive_element )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==COMMA_T) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:929:27: COMMA_T d2= directive_element
            	    {
            	    COMMA_T266=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_directive3265); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T266);

            	    pushFollow(FOLLOW_directive_element_in_directive3269);
            	    d2=directive_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_directive_element.add(d2.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(d1!=null?((Token)d1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(d1!=null?((Token)d1.stop):null);
                  if ((d2!=null?input.toString(d2.start,d2.stop):null) != null) {
                    token = (CommonToken)(d2!=null?((Token)d2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: directive_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 939:4: -> ( directive_element )+
            {
                if ( !(stream_directive_element.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_directive_element.hasNext() ) {
                    adaptor.addChild(root_0, stream_directive_element.nextTree());

                }
                stream_directive_element.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "directive"

    public static class directive_element_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive_element"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:942:1: directive_element : IDENTIFIER EQUAL_T expression -> ^( EQUAL_T IDENTIFIER expression ) ;
    public final CompilerAstParser.directive_element_return directive_element() throws RecognitionException {
        CompilerAstParser.directive_element_return retval = new CompilerAstParser.directive_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token IDENTIFIER267=null;
        Token EQUAL_T268=null;
        CompilerAstParser.expression_return expression269 = null;


        SLAST IDENTIFIER267_tree=null;
        SLAST EQUAL_T268_tree=null;
        RewriteRuleTokenStream stream_EQUAL_T=new RewriteRuleTokenStream(adaptor,"token EQUAL_T");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:952:3: ( IDENTIFIER EQUAL_T expression -> ^( EQUAL_T IDENTIFIER expression ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:952:5: IDENTIFIER EQUAL_T expression
            {
            IDENTIFIER267=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_directive_element3312); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER267);

            EQUAL_T268=(Token)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_directive_element3314); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL_T.add(EQUAL_T268);

            pushFollow(FOLLOW_expression_in_directive_element3316);
            expression269=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression269.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)IDENTIFIER267;
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(expression269!=null?((Token)expression269.stop):null);
                  endIndex = token.getStopIndex();  
                
            }


            // AST REWRITE
            // elements: EQUAL_T, expression, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 959:5: -> ^( EQUAL_T IDENTIFIER expression )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:959:9: ^( EQUAL_T IDENTIFIER expression )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot(stream_EQUAL_T.nextNode(), root_1);

                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "directive_element"

    public static class expr_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:962:1: expr_list : e1= expression ( COMMA_T e2= expression )* -> ( expression )+ ;
    public final CompilerAstParser.expr_list_return expr_list() throws RecognitionException {
        CompilerAstParser.expr_list_return retval = new CompilerAstParser.expr_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T270=null;
        CompilerAstParser.expression_return e1 = null;

        CompilerAstParser.expression_return e2 = null;


        SLAST COMMA_T270_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:972:2: (e1= expression ( COMMA_T e2= expression )* -> ( expression )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:972:4: e1= expression ( COMMA_T e2= expression )*
            {
            pushFollow(FOLLOW_expression_in_expr_list3361);
            e1=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:972:18: ( COMMA_T e2= expression )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==COMMA_T) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:972:19: COMMA_T e2= expression
            	    {
            	    COMMA_T270=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_expr_list3364); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T270);

            	    pushFollow(FOLLOW_expression_in_expr_list3368);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 982:5: -> ( expression )+
            {
                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_0, stream_expression.nextTree());

                }
                stream_expression.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    public static class expression_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:985:1: expression : logical_text_or_expr -> ^( EXPR logical_text_or_expr ) ;
    public final CompilerAstParser.expression_return expression() throws RecognitionException {
        CompilerAstParser.expression_return retval = new CompilerAstParser.expression_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.logical_text_or_expr_return logical_text_or_expr271 = null;


        RewriteRuleSubtreeStream stream_logical_text_or_expr=new RewriteRuleSubtreeStream(adaptor,"rule logical_text_or_expr");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:996:3: ( logical_text_or_expr -> ^( EXPR logical_text_or_expr ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:996:5: logical_text_or_expr
            {
            pushFollow(FOLLOW_logical_text_or_expr_in_expression3409);
            logical_text_or_expr271=logical_text_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logical_text_or_expr.add(logical_text_or_expr271.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(logical_text_or_expr271!=null?((Token)logical_text_or_expr271.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(logical_text_or_expr271!=null?((Token)logical_text_or_expr271.stop):null);
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: logical_text_or_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 1003:5: -> ^( EXPR logical_text_or_expr )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1003:9: ^( EXPR logical_text_or_expr )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_logical_text_or_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("top expr:" + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class logical_text_or_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_text_or_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1006:1: logical_text_or_expr : e1= logical_text_xor_expr ( OR_T e2= logical_text_xor_expr )* ;
    public final CompilerAstParser.logical_text_or_expr_return logical_text_or_expr() throws RecognitionException {
        CompilerAstParser.logical_text_or_expr_return retval = new CompilerAstParser.logical_text_or_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token OR_T272=null;
        CompilerAstParser.logical_text_xor_expr_return e1 = null;

        CompilerAstParser.logical_text_xor_expr_return e2 = null;


        SLAST OR_T272_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1016:3: (e1= logical_text_xor_expr ( OR_T e2= logical_text_xor_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1016:5: e1= logical_text_xor_expr ( OR_T e2= logical_text_xor_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3452);
            e1=logical_text_xor_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1016:30: ( OR_T e2= logical_text_xor_expr )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==OR_T) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1016:31: OR_T e2= logical_text_xor_expr
            	    {
            	    OR_T272=(Token)match(input,OR_T,FOLLOW_OR_T_in_logical_text_or_expr3455); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR_T272_tree = (SLAST)adaptor.create(OR_T272);
            	    root_0 = (SLAST)adaptor.becomeRoot(OR_T272_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3460);
            	    e2=logical_text_xor_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_text_or_expr"

    public static class logical_text_xor_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_text_xor_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1028:1: logical_text_xor_expr : e1= logical_text_and_expr ( XOR_T e2= logical_text_and_expr )* ;
    public final CompilerAstParser.logical_text_xor_expr_return logical_text_xor_expr() throws RecognitionException {
        CompilerAstParser.logical_text_xor_expr_return retval = new CompilerAstParser.logical_text_xor_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token XOR_T273=null;
        CompilerAstParser.logical_text_and_expr_return e1 = null;

        CompilerAstParser.logical_text_and_expr_return e2 = null;


        SLAST XOR_T273_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1038:3: (e1= logical_text_and_expr ( XOR_T e2= logical_text_and_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1038:5: e1= logical_text_and_expr ( XOR_T e2= logical_text_and_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3491);
            e1=logical_text_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1038:30: ( XOR_T e2= logical_text_and_expr )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==XOR_T) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1038:31: XOR_T e2= logical_text_and_expr
            	    {
            	    XOR_T273=(Token)match(input,XOR_T,FOLLOW_XOR_T_in_logical_text_xor_expr3494); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    XOR_T273_tree = (SLAST)adaptor.create(XOR_T273);
            	    root_0 = (SLAST)adaptor.becomeRoot(XOR_T273_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3499);
            	    e2=logical_text_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_text_xor_expr"

    public static class logical_text_and_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_text_and_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1050:1: logical_text_and_expr : e1= assignment_expr ( AND_T e2= assignment_expr )* ;
    public final CompilerAstParser.logical_text_and_expr_return logical_text_and_expr() throws RecognitionException {
        CompilerAstParser.logical_text_and_expr_return retval = new CompilerAstParser.logical_text_and_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token AND_T274=null;
        CompilerAstParser.assignment_expr_return e1 = null;

        CompilerAstParser.assignment_expr_return e2 = null;


        SLAST AND_T274_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1060:3: (e1= assignment_expr ( AND_T e2= assignment_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1060:5: e1= assignment_expr ( AND_T e2= assignment_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_assignment_expr_in_logical_text_and_expr3530);
            e1=assignment_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1060:24: ( AND_T e2= assignment_expr )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==AND_T) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1060:25: AND_T e2= assignment_expr
            	    {
            	    AND_T274=(Token)match(input,AND_T,FOLLOW_AND_T_in_logical_text_and_expr3533); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND_T274_tree = (SLAST)adaptor.create(AND_T274);
            	    root_0 = (SLAST)adaptor.becomeRoot(AND_T274_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_assignment_expr_in_logical_text_and_expr3538);
            	    e2=assignment_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_text_and_expr"

    public static class assignment_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1072:1: assignment_expr : e1= conditional_expr ( assignment_operator e2= conditional_expr )* ;
    public final CompilerAstParser.assignment_expr_return assignment_expr() throws RecognitionException {
        CompilerAstParser.assignment_expr_return retval = new CompilerAstParser.assignment_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.conditional_expr_return e1 = null;

        CompilerAstParser.conditional_expr_return e2 = null;

        CompilerAstParser.assignment_operator_return assignment_operator275 = null;




          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1082:3: (e1= conditional_expr ( assignment_operator e2= conditional_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1082:5: e1= conditional_expr ( assignment_operator e2= conditional_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_conditional_expr_in_assignment_expr3569);
            e1=conditional_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1082:25: ( assignment_operator e2= conditional_expr )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==EQUAL_T||(LA81_0>=PLUS_EQ && LA81_0<=RMOVE_EQ)) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1082:26: assignment_operator e2= conditional_expr
            	    {
            	    pushFollow(FOLLOW_assignment_operator_in_assignment_expr3572);
            	    assignment_operator275=assignment_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot(assignment_operator275.getTree(), root_0);
            	    pushFollow(FOLLOW_conditional_expr_in_assignment_expr3577);
            	    e2=conditional_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment_expr"

    public static class assignment_operator_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_operator"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1094:1: assignment_operator : ( EQUAL_T | PLUS_EQ | MINUS_EQ | MUL_EQ | DIV_EQ | DOT_EQ | PERCENT_EQ | BIT_AND_EQ | BIT_OR_EQ | POWER_EQ | LMOVE_EQ | RMOVE_EQ );
    public final CompilerAstParser.assignment_operator_return assignment_operator() throws RecognitionException {
        CompilerAstParser.assignment_operator_return retval = new CompilerAstParser.assignment_operator_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set276=null;

        SLAST set276_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1095:3: ( EQUAL_T | PLUS_EQ | MINUS_EQ | MUL_EQ | DIV_EQ | DOT_EQ | PERCENT_EQ | BIT_AND_EQ | BIT_OR_EQ | POWER_EQ | LMOVE_EQ | RMOVE_EQ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set276=(Token)input.LT(1);
            if ( input.LA(1)==EQUAL_T||(input.LA(1)>=PLUS_EQ && input.LA(1)<=RMOVE_EQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set276));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment_operator"

    public static class conditional_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1109:1: conditional_expr : (ll= logical_or_expr -> $ll) ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )? ;
    public final CompilerAstParser.conditional_expr_return conditional_expr() throws RecognitionException {
        CompilerAstParser.conditional_expr_return retval = new CompilerAstParser.conditional_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token QUESTION_T277=null;
        Token COLON_T279=null;
        CompilerAstParser.logical_or_expr_return ll = null;

        CompilerAstParser.logical_or_expr_return lr = null;

        CompilerAstParser.expression_return expression278 = null;


        SLAST QUESTION_T277_tree=null;
        SLAST COLON_T279_tree=null;
        RewriteRuleTokenStream stream_QUESTION_T=new RewriteRuleTokenStream(adaptor,"token QUESTION_T");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_logical_or_expr=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expr");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1120:3: ( (ll= logical_or_expr -> $ll) ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1120:5: (ll= logical_or_expr -> $ll) ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )?
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1120:5: (ll= logical_or_expr -> $ll)
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1120:6: ll= logical_or_expr
            {
            pushFollow(FOLLOW_logical_or_expr_in_conditional_expr3713);
            ll=logical_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logical_or_expr.add(ll.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(ll!=null?((Token)ll.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(ll!=null?((Token)ll.stop):null);
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: ll
            // token labels: 
            // rule labels: retval, ll
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ll=new RewriteRuleSubtreeStream(adaptor,"rule ll",ll!=null?ll.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 1127:4: -> $ll
            {
                adaptor.addChild(root_0, stream_ll.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1128:4: ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==QUESTION_T) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1128:5: QUESTION_T ( expression )? COLON_T lr= logical_or_expr
                    {
                    QUESTION_T277=(Token)match(input,QUESTION_T,FOLLOW_QUESTION_T_in_conditional_expr3732); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_T.add(QUESTION_T277);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1128:16: ( expression )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( ((LA82_0>=NAMESPACE_T && LA82_0<=LEFT_PARETHESIS)||LA82_0==IDENTIFIER||LA82_0==REF_T||LA82_0==STRINGLITERAL||LA82_0==DOMAIN_T||(LA82_0>=PLUS_T && LA82_0<=MINUS_T)||(LA82_0>=UNSET_T && LA82_0<=MINUS_MINUS_T)||(LA82_0>=AT_T && LA82_0<=PRINT_T)||(LA82_0>=DOLLAR_T && LA82_0<=HERE_DOC)||(LA82_0>=189 && LA82_0<=196)) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1128:16: expression
                            {
                            pushFollow(FOLLOW_expression_in_conditional_expr3734);
                            expression278=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression278.getTree());

                            }
                            break;

                    }

                    COLON_T279=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_conditional_expr3737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T279);

                    pushFollow(FOLLOW_logical_or_expr_in_conditional_expr3741);
                    lr=logical_or_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_or_expr.add(lr.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(lr!=null?((Token)lr.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: COLON_T, lr, expression, QUESTION_T, ll
                    // token labels: 
                    // rule labels: retval, ll, lr
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ll=new RewriteRuleSubtreeStream(adaptor,"rule ll",ll!=null?ll.tree:null);
                    RewriteRuleSubtreeStream stream_lr=new RewriteRuleSubtreeStream(adaptor,"rule lr",lr!=null?lr.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1132:5: -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1132:8: ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_QUESTION_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ll.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1132:25: ^( COLON_T ( expression )? $lr)
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot(stream_COLON_T.nextNode(), root_2);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1132:35: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_2, stream_expression.nextTree());

                        }
                        stream_expression.reset();
                        adaptor.addChild(root_2, stream_lr.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("condition " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditional_expr"

    public static class logical_or_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_or_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1135:1: logical_or_expr : e1= logical_and_expr ( LOGICAL_OR_T e2= logical_and_expr )* ;
    public final CompilerAstParser.logical_or_expr_return logical_or_expr() throws RecognitionException {
        CompilerAstParser.logical_or_expr_return retval = new CompilerAstParser.logical_or_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LOGICAL_OR_T280=null;
        CompilerAstParser.logical_and_expr_return e1 = null;

        CompilerAstParser.logical_and_expr_return e2 = null;


        SLAST LOGICAL_OR_T280_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1145:3: (e1= logical_and_expr ( LOGICAL_OR_T e2= logical_and_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1145:5: e1= logical_and_expr ( LOGICAL_OR_T e2= logical_and_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr3791);
            e1=logical_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1145:25: ( LOGICAL_OR_T e2= logical_and_expr )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==LOGICAL_OR_T) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1145:26: LOGICAL_OR_T e2= logical_and_expr
            	    {
            	    LOGICAL_OR_T280=(Token)match(input,LOGICAL_OR_T,FOLLOW_LOGICAL_OR_T_in_logical_or_expr3794); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOGICAL_OR_T280_tree = (SLAST)adaptor.create(LOGICAL_OR_T280);
            	    root_0 = (SLAST)adaptor.becomeRoot(LOGICAL_OR_T280_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr3799);
            	    e2=logical_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_or_expr"

    public static class logical_and_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_and_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1157:1: logical_and_expr : e1= bitwise_or_expr ( LOGICAL_AND_T e2= bitwise_or_expr )* ;
    public final CompilerAstParser.logical_and_expr_return logical_and_expr() throws RecognitionException {
        CompilerAstParser.logical_and_expr_return retval = new CompilerAstParser.logical_and_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LOGICAL_AND_T281=null;
        CompilerAstParser.bitwise_or_expr_return e1 = null;

        CompilerAstParser.bitwise_or_expr_return e2 = null;


        SLAST LOGICAL_AND_T281_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1167:3: (e1= bitwise_or_expr ( LOGICAL_AND_T e2= bitwise_or_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1167:5: e1= bitwise_or_expr ( LOGICAL_AND_T e2= bitwise_or_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_bitwise_or_expr_in_logical_and_expr3830);
            e1=bitwise_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1167:24: ( LOGICAL_AND_T e2= bitwise_or_expr )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==LOGICAL_AND_T) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1167:25: LOGICAL_AND_T e2= bitwise_or_expr
            	    {
            	    LOGICAL_AND_T281=(Token)match(input,LOGICAL_AND_T,FOLLOW_LOGICAL_AND_T_in_logical_and_expr3833); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOGICAL_AND_T281_tree = (SLAST)adaptor.create(LOGICAL_AND_T281);
            	    root_0 = (SLAST)adaptor.becomeRoot(LOGICAL_AND_T281_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwise_or_expr_in_logical_and_expr3838);
            	    e2=bitwise_or_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_and_expr"

    public static class bitwise_or_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwise_or_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1179:1: bitwise_or_expr : e1= bitwise_xor_expr ( BIT_OR_T e2= bitwise_xor_expr )* ;
    public final CompilerAstParser.bitwise_or_expr_return bitwise_or_expr() throws RecognitionException {
        CompilerAstParser.bitwise_or_expr_return retval = new CompilerAstParser.bitwise_or_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token BIT_OR_T282=null;
        CompilerAstParser.bitwise_xor_expr_return e1 = null;

        CompilerAstParser.bitwise_xor_expr_return e2 = null;


        SLAST BIT_OR_T282_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1189:3: (e1= bitwise_xor_expr ( BIT_OR_T e2= bitwise_xor_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1189:5: e1= bitwise_xor_expr ( BIT_OR_T e2= bitwise_xor_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_bitwise_xor_expr_in_bitwise_or_expr3869);
            e1=bitwise_xor_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1189:25: ( BIT_OR_T e2= bitwise_xor_expr )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==BIT_OR_T) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1189:26: BIT_OR_T e2= bitwise_xor_expr
            	    {
            	    BIT_OR_T282=(Token)match(input,BIT_OR_T,FOLLOW_BIT_OR_T_in_bitwise_or_expr3872); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BIT_OR_T282_tree = (SLAST)adaptor.create(BIT_OR_T282);
            	    root_0 = (SLAST)adaptor.becomeRoot(BIT_OR_T282_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwise_xor_expr_in_bitwise_or_expr3877);
            	    e2=bitwise_xor_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwise_or_expr"

    public static class bitwise_xor_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwise_xor_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1201:1: bitwise_xor_expr : e1= bitwise_and_expr ( POWER_T e2= bitwise_and_expr )* ;
    public final CompilerAstParser.bitwise_xor_expr_return bitwise_xor_expr() throws RecognitionException {
        CompilerAstParser.bitwise_xor_expr_return retval = new CompilerAstParser.bitwise_xor_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token POWER_T283=null;
        CompilerAstParser.bitwise_and_expr_return e1 = null;

        CompilerAstParser.bitwise_and_expr_return e2 = null;


        SLAST POWER_T283_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1211:3: (e1= bitwise_and_expr ( POWER_T e2= bitwise_and_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1211:5: e1= bitwise_and_expr ( POWER_T e2= bitwise_and_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_bitwise_and_expr_in_bitwise_xor_expr3908);
            e1=bitwise_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1211:25: ( POWER_T e2= bitwise_and_expr )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==POWER_T) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1211:26: POWER_T e2= bitwise_and_expr
            	    {
            	    POWER_T283=(Token)match(input,POWER_T,FOLLOW_POWER_T_in_bitwise_xor_expr3911); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER_T283_tree = (SLAST)adaptor.create(POWER_T283);
            	    root_0 = (SLAST)adaptor.becomeRoot(POWER_T283_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwise_and_expr_in_bitwise_xor_expr3916);
            	    e2=bitwise_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwise_xor_expr"

    public static class bitwise_and_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwise_and_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1223:1: bitwise_and_expr : e1= concat_expr ( DOT_T e2= concat_expr )* ;
    public final CompilerAstParser.bitwise_and_expr_return bitwise_and_expr() throws RecognitionException {
        CompilerAstParser.bitwise_and_expr_return retval = new CompilerAstParser.bitwise_and_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token DOT_T284=null;
        CompilerAstParser.concat_expr_return e1 = null;

        CompilerAstParser.concat_expr_return e2 = null;


        SLAST DOT_T284_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1233:3: (e1= concat_expr ( DOT_T e2= concat_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1233:5: e1= concat_expr ( DOT_T e2= concat_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_concat_expr_in_bitwise_and_expr3947);
            e1=concat_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1233:20: ( DOT_T e2= concat_expr )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==DOT_T) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1233:21: DOT_T e2= concat_expr
            	    {
            	    DOT_T284=(Token)match(input,DOT_T,FOLLOW_DOT_T_in_bitwise_and_expr3950); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT_T284_tree = (SLAST)adaptor.create(DOT_T284);
            	    root_0 = (SLAST)adaptor.becomeRoot(DOT_T284_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_concat_expr_in_bitwise_and_expr3955);
            	    e2=concat_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bitwise_and_expr"

    public static class concat_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "concat_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1245:1: concat_expr : e1= equality_expr ( REF_T e2= equality_expr )* ;
    public final CompilerAstParser.concat_expr_return concat_expr() throws RecognitionException {
        CompilerAstParser.concat_expr_return retval = new CompilerAstParser.concat_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token REF_T285=null;
        CompilerAstParser.equality_expr_return e1 = null;

        CompilerAstParser.equality_expr_return e2 = null;


        SLAST REF_T285_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1255:3: (e1= equality_expr ( REF_T e2= equality_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1255:5: e1= equality_expr ( REF_T e2= equality_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_equality_expr_in_concat_expr3986);
            e1=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1255:22: ( REF_T e2= equality_expr )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==REF_T) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1255:23: REF_T e2= equality_expr
            	    {
            	    REF_T285=(Token)match(input,REF_T,FOLLOW_REF_T_in_concat_expr3989); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    REF_T285_tree = (SLAST)adaptor.create(REF_T285);
            	    root_0 = (SLAST)adaptor.becomeRoot(REF_T285_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expr_in_concat_expr3994);
            	    e2=equality_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "concat_expr"

    public static class equality_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1267:1: equality_expr : e1= relational_expr ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr )* ;
    public final CompilerAstParser.equality_expr_return equality_expr() throws RecognitionException {
        CompilerAstParser.equality_expr_return retval = new CompilerAstParser.equality_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set286=null;
        CompilerAstParser.relational_expr_return e1 = null;

        CompilerAstParser.relational_expr_return e2 = null;


        SLAST set286_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1278:3: (e1= relational_expr ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1278:5: e1= relational_expr ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_relational_expr_in_equality_expr4025);
            e1=relational_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1278:24: ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( ((LA90_0>=EQUAL_EQUAL_T && LA90_0<=NOT_EQUAL_EQUAL_T)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1278:25: ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr
            	    {
            	    set286=(Token)input.LT(1);
            	    set286=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQUAL_EQUAL_T && input.LA(1)<=NOT_EQUAL_EQUAL_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set286), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expr_in_equality_expr4047);
            	    e2=relational_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("euqa " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equality_expr"

    public static class relational_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1290:1: relational_expr : e1= shift_expr ( ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr )* ;
    public final CompilerAstParser.relational_expr_return relational_expr() throws RecognitionException {
        CompilerAstParser.relational_expr_return retval = new CompilerAstParser.relational_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set287=null;
        CompilerAstParser.shift_expr_return e1 = null;

        CompilerAstParser.shift_expr_return e2 = null;


        SLAST set287_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1301:3: (e1= shift_expr ( ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1301:5: e1= shift_expr ( ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_shift_expr_in_relational_expr4078);
            e1=shift_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1301:19: ( ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=LT_T && LA91_0<=ME_T)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1301:20: ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr
            	    {
            	    set287=(Token)input.LT(1);
            	    set287=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT_T && input.LA(1)<=ME_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set287), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shift_expr_in_relational_expr4100);
            	    e2=shift_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("rela " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relational_expr"

    public static class shift_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shift_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1313:1: shift_expr : e1= additive_expr ( ( LSHIFT_T | RSHIFT_T ) e2= additive_expr )* ;
    public final CompilerAstParser.shift_expr_return shift_expr() throws RecognitionException {
        CompilerAstParser.shift_expr_return retval = new CompilerAstParser.shift_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set288=null;
        CompilerAstParser.additive_expr_return e1 = null;

        CompilerAstParser.additive_expr_return e2 = null;


        SLAST set288_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1324:3: (e1= additive_expr ( ( LSHIFT_T | RSHIFT_T ) e2= additive_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1324:5: e1= additive_expr ( ( LSHIFT_T | RSHIFT_T ) e2= additive_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_additive_expr_in_shift_expr4131);
            e1=additive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1324:22: ( ( LSHIFT_T | RSHIFT_T ) e2= additive_expr )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=LSHIFT_T && LA92_0<=RSHIFT_T)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1324:23: ( LSHIFT_T | RSHIFT_T ) e2= additive_expr
            	    {
            	    set288=(Token)input.LT(1);
            	    set288=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LSHIFT_T && input.LA(1)<=RSHIFT_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set288), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expr_in_shift_expr4145);
            	    e2=additive_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop92;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("shift " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "shift_expr"

    public static class additive_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1336:1: additive_expr : e1= multiplicative_expr ( ( PLUS_T | MINUS_T ) e2= multiplicative_expr )* ;
    public final CompilerAstParser.additive_expr_return additive_expr() throws RecognitionException {
        CompilerAstParser.additive_expr_return retval = new CompilerAstParser.additive_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set289=null;
        CompilerAstParser.multiplicative_expr_return e1 = null;

        CompilerAstParser.multiplicative_expr_return e2 = null;


        SLAST set289_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1347:3: (e1= multiplicative_expr ( ( PLUS_T | MINUS_T ) e2= multiplicative_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1347:5: e1= multiplicative_expr ( ( PLUS_T | MINUS_T ) e2= multiplicative_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr4176);
            e1=multiplicative_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1347:28: ( ( PLUS_T | MINUS_T ) e2= multiplicative_expr )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( ((LA93_0>=PLUS_T && LA93_0<=MINUS_T)) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1347:29: ( PLUS_T | MINUS_T ) e2= multiplicative_expr
            	    {
            	    set289=(Token)input.LT(1);
            	    set289=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS_T && input.LA(1)<=MINUS_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set289), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr4190);
            	    e2=multiplicative_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("add " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additive_expr"

    public static class multiplicative_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1359:1: multiplicative_expr : e1= cast_expr ( ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr )* ;
    public final CompilerAstParser.multiplicative_expr_return multiplicative_expr() throws RecognitionException {
        CompilerAstParser.multiplicative_expr_return retval = new CompilerAstParser.multiplicative_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set290=null;
        CompilerAstParser.cast_expr_return e1 = null;

        CompilerAstParser.cast_expr_return e2 = null;


        SLAST set290_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1370:3: (e1= cast_expr ( ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1370:5: e1= cast_expr ( ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_cast_expr_in_multiplicative_expr4221);
            e1=cast_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1370:18: ( ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( ((LA94_0>=MUL_T && LA94_0<=PERCENT_T)) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1370:19: ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr
            	    {
            	    set290=(Token)input.LT(1);
            	    set290=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL_T && input.LA(1)<=PERCENT_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set290), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_cast_expr_in_multiplicative_expr4239);
            	    e2=cast_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("mult " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expr"

    public static class cast_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1382:1: cast_expr : ( unary_expr | ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+ unary_expr -> ^( CAST_EXPR ( cast_option )+ unary_expr ) );
    public final CompilerAstParser.cast_expr_return cast_expr() throws RecognitionException {
        CompilerAstParser.cast_expr_return retval = new CompilerAstParser.cast_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_PARETHESIS292=null;
        Token RIGHT_PARETHESIS294=null;
        CompilerAstParser.unary_expr_return unary_expr291 = null;

        CompilerAstParser.cast_option_return cast_option293 = null;

        CompilerAstParser.unary_expr_return unary_expr295 = null;


        SLAST LEFT_PARETHESIS292_tree=null;
        SLAST RIGHT_PARETHESIS294_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule unary_expr");
        RewriteRuleSubtreeStream stream_cast_option=new RewriteRuleSubtreeStream(adaptor,"rule cast_option");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1393:3: ( unary_expr | ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+ unary_expr -> ^( CAST_EXPR ( cast_option )+ unary_expr ) )
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==NAMESPACE_T||LA96_0==IDENTIFIER||LA96_0==REF_T||LA96_0==STRINGLITERAL||LA96_0==DOMAIN_T||(LA96_0>=PLUS_T && LA96_0<=MINUS_T)||(LA96_0>=UNSET_T && LA96_0<=MINUS_MINUS_T)||(LA96_0>=AT_T && LA96_0<=PRINT_T)||(LA96_0>=DOLLAR_T && LA96_0<=HERE_DOC)||(LA96_0>=189 && LA96_0<=196)) ) {
                alt96=1;
            }
            else if ( (LA96_0==LEFT_PARETHESIS) ) {
                switch ( input.LA(2) ) {
                case 189:
                    {
                    int LA96_3 = input.LA(3);

                    if ( (LA96_3==LEFT_PARETHESIS) ) {
                        alt96=1;
                    }
                    else if ( (LA96_3==RIGHT_PARETHESIS) ) {
                        alt96=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case NAMESPACE_T:
                case LEFT_PARETHESIS:
                case IDENTIFIER:
                case REF_T:
                case STRINGLITERAL:
                case DOMAIN_T:
                case PLUS_T:
                case MINUS_T:
                case TILDA_T:
                case EXC_NOT_T:
                case PLUS_PLUS_T:
                case MINUS_MINUS_T:
                case AT_T:
                case LIST_T:
                case NEW_T:
                case BACKTRICKLITERAL:
                case PRINT_T:
                case DOLLAR_T:
                case INTLITERAL:
                case FLOATLITERAL:
                case DOUBLELITERRAL:
                case REALLITERAL:
                case HERE_DOC:
                case 190:
                case 191:
                case 192:
                case 193:
                case 194:
                case 195:
                case 196:
                    {
                    alt96=1;
                    }
                    break;
                case CLONE_T:
                    {
                    int LA96_4 = input.LA(3);

                    if ( (LA96_4==NAMESPACE_T||LA96_4==IDENTIFIER||LA96_4==DOMAIN_T||LA96_4==DOLLAR_T) ) {
                        alt96=1;
                    }
                    else if ( (LA96_4==RIGHT_PARETHESIS) ) {
                        alt96=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case UNSET_T:
                    {
                    int LA96_5 = input.LA(3);

                    if ( (LA96_5==LEFT_PARETHESIS) ) {
                        alt96=1;
                    }
                    else if ( (LA96_5==RIGHT_PARETHESIS) ) {
                        alt96=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 96, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case 186:
                case 187:
                case 188:
                    {
                    alt96=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 96, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }
            switch (alt96) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1393:5: unary_expr
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_unary_expr_in_cast_expr4268);
                    unary_expr291=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr291.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(unary_expr291!=null?((Token)unary_expr291.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(unary_expr291!=null?((Token)unary_expr291.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1400:5: ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+ unary_expr
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1400:5: ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+
                    int cnt95=0;
                    loop95:
                    do {
                        int alt95=2;
                        int LA95_0 = input.LA(1);

                        if ( (LA95_0==LEFT_PARETHESIS) ) {
                            switch ( input.LA(2) ) {
                            case 189:
                                {
                                int LA95_3 = input.LA(3);

                                if ( (LA95_3==RIGHT_PARETHESIS) ) {
                                    alt95=1;
                                }


                                }
                                break;
                            case CLONE_T:
                                {
                                int LA95_4 = input.LA(3);

                                if ( (LA95_4==RIGHT_PARETHESIS) ) {
                                    alt95=1;
                                }


                                }
                                break;
                            case UNSET_T:
                                {
                                int LA95_5 = input.LA(3);

                                if ( (LA95_5==RIGHT_PARETHESIS) ) {
                                    alt95=1;
                                }


                                }
                                break;
                            case 181:
                            case 182:
                            case 183:
                            case 184:
                            case 185:
                            case 186:
                            case 187:
                            case 188:
                                {
                                alt95=1;
                                }
                                break;

                            }

                        }


                        switch (alt95) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1400:6: LEFT_PARETHESIS cast_option RIGHT_PARETHESIS
                    	    {
                    	    LEFT_PARETHESIS292=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_cast_expr4279); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS292);

                    	    pushFollow(FOLLOW_cast_option_in_cast_expr4281);
                    	    cast_option293=cast_option();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_cast_option.add(cast_option293.getTree());
                    	    RIGHT_PARETHESIS294=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_cast_expr4283); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS294);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt95 >= 1 ) break loop95;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(95, input);
                                throw eee;
                        }
                        cnt95++;
                    } while (true);

                    pushFollow(FOLLOW_unary_expr_in_cast_expr4287);
                    unary_expr295=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expr.add(unary_expr295.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)LEFT_PARETHESIS292;
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(unary_expr295!=null?((Token)unary_expr295.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: cast_option, unary_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1407:4: -> ^( CAST_EXPR ( cast_option )+ unary_expr )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1407:7: ^( CAST_EXPR ( cast_option )+ unary_expr )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CAST_EXPR, "CAST_EXPR"), root_1);

                        if ( !(stream_cast_option.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_cast_option.hasNext() ) {
                            adaptor.addChild(root_1, stream_cast_option.nextTree());

                        }
                        stream_cast_option.reset();
                        adaptor.addChild(root_1, stream_unary_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("cast " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cast_expr"

    public static class cast_option_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast_option"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1410:1: cast_option : ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'real' | 'string' | UNSET_T | CLONE_T | 'object' | 'array' );
    public final CompilerAstParser.cast_option_return cast_option() throws RecognitionException {
        CompilerAstParser.cast_option_return retval = new CompilerAstParser.cast_option_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set296=null;

        SLAST set296_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1411:3: ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'real' | 'string' | UNSET_T | CLONE_T | 'object' | 'array' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set296=(Token)input.LT(1);
            if ( (input.LA(1)>=UNSET_T && input.LA(1)<=CLONE_T)||(input.LA(1)>=181 && input.LA(1)<=189) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set296));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cast_option"

    public static class unary_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1424:1: unary_expr : ( unary_symbol_list prefix_inc_dec_expr -> ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr ) | prefix_inc_dec_expr );
    public final CompilerAstParser.unary_expr_return unary_expr() throws RecognitionException {
        CompilerAstParser.unary_expr_return retval = new CompilerAstParser.unary_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.unary_symbol_list_return unary_symbol_list297 = null;

        CompilerAstParser.prefix_inc_dec_expr_return prefix_inc_dec_expr298 = null;

        CompilerAstParser.prefix_inc_dec_expr_return prefix_inc_dec_expr299 = null;


        RewriteRuleSubtreeStream stream_prefix_inc_dec_expr=new RewriteRuleSubtreeStream(adaptor,"rule prefix_inc_dec_expr");
        RewriteRuleSubtreeStream stream_unary_symbol_list=new RewriteRuleSubtreeStream(adaptor,"rule unary_symbol_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1435:3: ( unary_symbol_list prefix_inc_dec_expr -> ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr ) | prefix_inc_dec_expr )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==REF_T||(LA97_0>=PLUS_T && LA97_0<=MINUS_T)||(LA97_0>=TILDA_T && LA97_0<=EXC_NOT_T)) ) {
                alt97=1;
            }
            else if ( ((LA97_0>=NAMESPACE_T && LA97_0<=LEFT_PARETHESIS)||LA97_0==IDENTIFIER||LA97_0==STRINGLITERAL||LA97_0==DOMAIN_T||(LA97_0>=UNSET_T && LA97_0<=CLONE_T)||(LA97_0>=PLUS_PLUS_T && LA97_0<=MINUS_MINUS_T)||(LA97_0>=AT_T && LA97_0<=PRINT_T)||(LA97_0>=DOLLAR_T && LA97_0<=HERE_DOC)||(LA97_0>=189 && LA97_0<=196)) ) {
                alt97=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1435:5: unary_symbol_list prefix_inc_dec_expr
                    {
                    pushFollow(FOLLOW_unary_symbol_list_in_unary_expr4407);
                    unary_symbol_list297=unary_symbol_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_symbol_list.add(unary_symbol_list297.getTree());
                    pushFollow(FOLLOW_prefix_inc_dec_expr_in_unary_expr4409);
                    prefix_inc_dec_expr298=prefix_inc_dec_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_inc_dec_expr.add(prefix_inc_dec_expr298.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(unary_symbol_list297!=null?((Token)unary_symbol_list297.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(prefix_inc_dec_expr298!=null?((Token)prefix_inc_dec_expr298.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: unary_symbol_list, prefix_inc_dec_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1442:5: -> ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1442:9: ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(UNARY_EXPR, "UNARY_EXPR"), root_1);

                        adaptor.addChild(root_1, stream_unary_symbol_list.nextTree());
                        adaptor.addChild(root_1, stream_prefix_inc_dec_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1443:5: prefix_inc_dec_expr
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_prefix_inc_dec_expr_in_unary_expr4434);
                    prefix_inc_dec_expr299=prefix_inc_dec_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefix_inc_dec_expr299.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(prefix_inc_dec_expr299!=null?((Token)prefix_inc_dec_expr299.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(prefix_inc_dec_expr299!=null?((Token)prefix_inc_dec_expr299.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("unary " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_expr"

    public static class unary_symbol_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_symbol_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1452:1: unary_symbol_list : ( unary_symbol )+ ;
    public final CompilerAstParser.unary_symbol_list_return unary_symbol_list() throws RecognitionException {
        CompilerAstParser.unary_symbol_list_return retval = new CompilerAstParser.unary_symbol_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.unary_symbol_return unary_symbol300 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1453:3: ( ( unary_symbol )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1453:5: ( unary_symbol )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1453:5: ( unary_symbol )+
            int cnt98=0;
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==REF_T||(LA98_0>=PLUS_T && LA98_0<=MINUS_T)||(LA98_0>=TILDA_T && LA98_0<=EXC_NOT_T)) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1453:5: unary_symbol
            	    {
            	    pushFollow(FOLLOW_unary_symbol_in_unary_symbol_list4451);
            	    unary_symbol300=unary_symbol();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_symbol300.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt98 >= 1 ) break loop98;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(98, input);
                        throw eee;
                }
                cnt98++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_symbol_list"

    public static class unary_symbol_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_symbol"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1456:1: unary_symbol : ( REF_T | PLUS_T | MINUS_T | TILDA_T | EXC_NOT_T );
    public final CompilerAstParser.unary_symbol_return unary_symbol() throws RecognitionException {
        CompilerAstParser.unary_symbol_return retval = new CompilerAstParser.unary_symbol_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set301=null;

        SLAST set301_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1457:3: ( REF_T | PLUS_T | MINUS_T | TILDA_T | EXC_NOT_T )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set301=(Token)input.LT(1);
            if ( input.LA(1)==REF_T||(input.LA(1)>=PLUS_T && input.LA(1)<=MINUS_T)||(input.LA(1)>=TILDA_T && input.LA(1)<=EXC_NOT_T) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set301));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_symbol"

    public static class prefix_inc_dec_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prefix_inc_dec_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1460:1: prefix_inc_dec_expr : ( post_inc_dec_expr | ( plus_minus )+ post_inc_dec_expr -> ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr ) );
    public final CompilerAstParser.prefix_inc_dec_expr_return prefix_inc_dec_expr() throws RecognitionException {
        CompilerAstParser.prefix_inc_dec_expr_return retval = new CompilerAstParser.prefix_inc_dec_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.post_inc_dec_expr_return post_inc_dec_expr302 = null;

        CompilerAstParser.plus_minus_return plus_minus303 = null;

        CompilerAstParser.post_inc_dec_expr_return post_inc_dec_expr304 = null;


        RewriteRuleSubtreeStream stream_plus_minus=new RewriteRuleSubtreeStream(adaptor,"rule plus_minus");
        RewriteRuleSubtreeStream stream_post_inc_dec_expr=new RewriteRuleSubtreeStream(adaptor,"rule post_inc_dec_expr");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1471:3: ( post_inc_dec_expr | ( plus_minus )+ post_inc_dec_expr -> ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=NAMESPACE_T && LA100_0<=LEFT_PARETHESIS)||LA100_0==IDENTIFIER||LA100_0==STRINGLITERAL||LA100_0==DOMAIN_T||(LA100_0>=UNSET_T && LA100_0<=CLONE_T)||(LA100_0>=AT_T && LA100_0<=PRINT_T)||(LA100_0>=DOLLAR_T && LA100_0<=HERE_DOC)||(LA100_0>=189 && LA100_0<=196)) ) {
                alt100=1;
            }
            else if ( ((LA100_0>=PLUS_PLUS_T && LA100_0<=MINUS_MINUS_T)) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1471:5: post_inc_dec_expr
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4508);
                    post_inc_dec_expr302=post_inc_dec_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, post_inc_dec_expr302.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(post_inc_dec_expr302!=null?((Token)post_inc_dec_expr302.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(post_inc_dec_expr302!=null?((Token)post_inc_dec_expr302.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1478:5: ( plus_minus )+ post_inc_dec_expr
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1478:5: ( plus_minus )+
                    int cnt99=0;
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( ((LA99_0>=PLUS_PLUS_T && LA99_0<=MINUS_MINUS_T)) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1478:6: plus_minus
                    	    {
                    	    pushFollow(FOLLOW_plus_minus_in_prefix_inc_dec_expr4519);
                    	    plus_minus303=plus_minus();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_plus_minus.add(plus_minus303.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt99 >= 1 ) break loop99;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(99, input);
                                throw eee;
                        }
                        cnt99++;
                    } while (true);

                    pushFollow(FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4523);
                    post_inc_dec_expr304=post_inc_dec_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_post_inc_dec_expr.add(post_inc_dec_expr304.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(plus_minus303!=null?((Token)plus_minus303.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(post_inc_dec_expr304!=null?((Token)post_inc_dec_expr304.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: plus_minus, post_inc_dec_expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1485:4: -> ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1485:8: ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(PREFIX_EXPR, "PREFIX_EXPR"), root_1);

                        if ( !(stream_plus_minus.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_plus_minus.hasNext() ) {
                            adaptor.addChild(root_1, stream_plus_minus.nextTree());

                        }
                        stream_plus_minus.reset();
                        adaptor.addChild(root_1, stream_post_inc_dec_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("prefix " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prefix_inc_dec_expr"

    public static class post_inc_dec_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "post_inc_dec_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1488:1: post_inc_dec_expr : ( instance_expr -> instance_expr ) ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )* ;
    public final CompilerAstParser.post_inc_dec_expr_return post_inc_dec_expr() throws RecognitionException {
        CompilerAstParser.post_inc_dec_expr_return retval = new CompilerAstParser.post_inc_dec_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.instance_expr_return instance_expr305 = null;

        CompilerAstParser.plus_minus_return plus_minus306 = null;


        RewriteRuleSubtreeStream stream_plus_minus=new RewriteRuleSubtreeStream(adaptor,"rule plus_minus");
        RewriteRuleSubtreeStream stream_instance_expr=new RewriteRuleSubtreeStream(adaptor,"rule instance_expr");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1499:3: ( ( instance_expr -> instance_expr ) ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1499:5: ( instance_expr -> instance_expr ) ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1499:5: ( instance_expr -> instance_expr )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1499:6: instance_expr
            {
            pushFollow(FOLLOW_instance_expr_in_post_inc_dec_expr4568);
            instance_expr305=instance_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_instance_expr.add(instance_expr305.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(instance_expr305!=null?((Token)instance_expr305.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(instance_expr305!=null?((Token)instance_expr305.stop):null);
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: instance_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 1506:4: -> instance_expr
            {
                adaptor.addChild(root_0, stream_instance_expr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1507:3: ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( ((LA101_0>=PLUS_PLUS_T && LA101_0<=MINUS_MINUS_T)) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1507:4: plus_minus
            	    {
            	    pushFollow(FOLLOW_plus_minus_in_post_inc_dec_expr4585);
            	    plus_minus306=plus_minus();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_plus_minus.add(plus_minus306.getTree());
            	    if ( state.backtracking==0 ) {

            	          token = (CommonToken)(plus_minus306!=null?((Token)plus_minus306.stop):null);
            	          endIndex = token.getStopIndex();
            	        
            	    }


            	    // AST REWRITE
            	    // elements: plus_minus, post_inc_dec_expr
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 1512:4: -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1512:7: ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(POSTFIX_EXPR, "POSTFIX_EXPR"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_plus_minus.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("post " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "post_inc_dec_expr"

    public static class plus_minus_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plus_minus"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1515:1: plus_minus : ( PLUS_PLUS_T | MINUS_MINUS_T );
    public final CompilerAstParser.plus_minus_return plus_minus() throws RecognitionException {
        CompilerAstParser.plus_minus_return retval = new CompilerAstParser.plus_minus_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set307=null;

        SLAST set307_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1516:3: ( PLUS_PLUS_T | MINUS_MINUS_T )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set307=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS_PLUS_T && input.LA(1)<=MINUS_MINUS_T) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set307));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "plus_minus"

    public static class instance_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instance_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1520:1: instance_expr : atom_expr ( INSTANCEOF_T class_name_reference )? ;
    public final CompilerAstParser.instance_expr_return instance_expr() throws RecognitionException {
        CompilerAstParser.instance_expr_return retval = new CompilerAstParser.instance_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token INSTANCEOF_T309=null;
        CompilerAstParser.atom_expr_return atom_expr308 = null;

        CompilerAstParser.class_name_reference_return class_name_reference310 = null;


        SLAST INSTANCEOF_T309_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1530:3: ( atom_expr ( INSTANCEOF_T class_name_reference )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1530:5: atom_expr ( INSTANCEOF_T class_name_reference )?
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_instance_expr4653);
            atom_expr308=atom_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atom_expr308.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1530:15: ( INSTANCEOF_T class_name_reference )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==INSTANCEOF_T) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1530:16: INSTANCEOF_T class_name_reference
                    {
                    INSTANCEOF_T309=(Token)match(input,INSTANCEOF_T,FOLLOW_INSTANCEOF_T_in_instance_expr4656); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF_T309_tree = (SLAST)adaptor.create(INSTANCEOF_T309);
                    root_0 = (SLAST)adaptor.becomeRoot(INSTANCEOF_T309_tree, root_0);
                    }
                    pushFollow(FOLLOW_class_name_reference_in_instance_expr4659);
                    class_name_reference310=class_name_reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_name_reference310.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(atom_expr308!=null?((Token)atom_expr308.start):null);
                  startIndex = token.getStartIndex();    
                  token = (CommonToken)(atom_expr308!=null?((Token)atom_expr308.stop):null);
                  if ((class_name_reference310!=null?input.toString(class_name_reference310.start,class_name_reference310.stop):null) != null) {
                    token = (CommonToken)(class_name_reference310!=null?((Token)class_name_reference310.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "instance_expr"

    public static class atom_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1542:1: atom_expr : ( ( AT_T )? variable | ( AT_T )? scalar | LEFT_PARETHESIS expression RIGHT_PARETHESIS | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) | 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS -> ^( ARRAY_DECL ( array_pair_list )? ) | NEW_T class_name_reference -> ^( NEW_T class_name_reference ) | CLONE_T variable -> ^( CLONE_T variable ) | UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS -> ^( UNSET_T variable_list ) | BACKTRICKLITERAL | PRINT_T expression -> ^( PRINT_T expression ) );
    public final CompilerAstParser.atom_expr_return atom_expr() throws RecognitionException {
        CompilerAstParser.atom_expr_return retval = new CompilerAstParser.atom_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token AT_T311=null;
        Token AT_T313=null;
        Token LEFT_PARETHESIS315=null;
        Token RIGHT_PARETHESIS317=null;
        Token LIST_T318=null;
        Token LEFT_PARETHESIS319=null;
        Token RIGHT_PARETHESIS321=null;
        Token string_literal322=null;
        Token LEFT_PARETHESIS323=null;
        Token RIGHT_PARETHESIS325=null;
        Token NEW_T326=null;
        Token CLONE_T328=null;
        Token UNSET_T330=null;
        Token LEFT_PARETHESIS331=null;
        Token RIGHT_PARETHESIS333=null;
        Token BACKTRICKLITERAL334=null;
        Token PRINT_T335=null;
        CompilerAstParser.variable_return variable312 = null;

        CompilerAstParser.scalar_return scalar314 = null;

        CompilerAstParser.expression_return expression316 = null;

        CompilerAstParser.assignment_list_return assignment_list320 = null;

        CompilerAstParser.array_pair_list_return array_pair_list324 = null;

        CompilerAstParser.class_name_reference_return class_name_reference327 = null;

        CompilerAstParser.variable_return variable329 = null;

        CompilerAstParser.variable_list_return variable_list332 = null;

        CompilerAstParser.expression_return expression336 = null;


        SLAST AT_T311_tree=null;
        SLAST AT_T313_tree=null;
        SLAST LEFT_PARETHESIS315_tree=null;
        SLAST RIGHT_PARETHESIS317_tree=null;
        SLAST LIST_T318_tree=null;
        SLAST LEFT_PARETHESIS319_tree=null;
        SLAST RIGHT_PARETHESIS321_tree=null;
        SLAST string_literal322_tree=null;
        SLAST LEFT_PARETHESIS323_tree=null;
        SLAST RIGHT_PARETHESIS325_tree=null;
        SLAST NEW_T326_tree=null;
        SLAST CLONE_T328_tree=null;
        SLAST UNSET_T330_tree=null;
        SLAST LEFT_PARETHESIS331_tree=null;
        SLAST RIGHT_PARETHESIS333_tree=null;
        SLAST BACKTRICKLITERAL334_tree=null;
        SLAST PRINT_T335_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_PRINT_T=new RewriteRuleTokenStream(adaptor,"token PRINT_T");
        RewriteRuleTokenStream stream_UNSET_T=new RewriteRuleTokenStream(adaptor,"token UNSET_T");
        RewriteRuleTokenStream stream_LIST_T=new RewriteRuleTokenStream(adaptor,"token LIST_T");
        RewriteRuleTokenStream stream_NEW_T=new RewriteRuleTokenStream(adaptor,"token NEW_T");
        RewriteRuleTokenStream stream_189=new RewriteRuleTokenStream(adaptor,"token 189");
        RewriteRuleTokenStream stream_CLONE_T=new RewriteRuleTokenStream(adaptor,"token CLONE_T");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variable_list=new RewriteRuleSubtreeStream(adaptor,"rule variable_list");
        RewriteRuleSubtreeStream stream_array_pair_list=new RewriteRuleSubtreeStream(adaptor,"rule array_pair_list");
        RewriteRuleSubtreeStream stream_class_name_reference=new RewriteRuleSubtreeStream(adaptor,"rule class_name_reference");
        RewriteRuleSubtreeStream stream_assignment_list=new RewriteRuleSubtreeStream(adaptor,"rule assignment_list");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1552:3: ( ( AT_T )? variable | ( AT_T )? scalar | LEFT_PARETHESIS expression RIGHT_PARETHESIS | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) | 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS -> ^( ARRAY_DECL ( array_pair_list )? ) | NEW_T class_name_reference -> ^( NEW_T class_name_reference ) | CLONE_T variable -> ^( CLONE_T variable ) | UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS -> ^( UNSET_T variable_list ) | BACKTRICKLITERAL | PRINT_T expression -> ^( PRINT_T expression ) )
            int alt106=10;
            alt106 = dfa106.predict(input);
            switch (alt106) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1552:6: ( AT_T )? variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1552:6: ( AT_T )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==AT_T) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1552:6: AT_T
                            {
                            AT_T311=(Token)match(input,AT_T,FOLLOW_AT_T_in_atom_expr4691); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT_T311_tree = (SLAST)adaptor.create(AT_T311);
                            adaptor.addChild(root_0, AT_T311_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_variable_in_atom_expr4694);
                    variable312=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable312.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)(variable312!=null?((Token)variable312.start):null);
                            if ((AT_T311!=null?AT_T311.getText():null) != null) {
                              token = (CommonToken)AT_T311;
                            }
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(variable312!=null?((Token)variable312.stop):null);
                            endIndex = token.getStopIndex();
                            System.out.println("i write here: " + startIndex + " " + endIndex);
                          
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1563:6: ( AT_T )? scalar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1563:6: ( AT_T )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==AT_T) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1563:6: AT_T
                            {
                            AT_T313=(Token)match(input,AT_T,FOLLOW_AT_T_in_atom_expr4707); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT_T313_tree = (SLAST)adaptor.create(AT_T313);
                            adaptor.addChild(root_0, AT_T313_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_scalar_in_atom_expr4710);
                    scalar314=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar314.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)(scalar314!=null?((Token)scalar314.start):null);
                            if ((AT_T313!=null?AT_T313.getText():null) != null) {
                              token = (CommonToken)AT_T313;
                            }
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(scalar314!=null?((Token)scalar314.stop):null);
                            endIndex = token.getStopIndex();
                          
                    }

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1573:6: LEFT_PARETHESIS expression RIGHT_PARETHESIS
                    {
                    root_0 = (SLAST)adaptor.nil();

                    LEFT_PARETHESIS315=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr4723); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LEFT_PARETHESIS315_tree = (SLAST)adaptor.create(LEFT_PARETHESIS315);
                    adaptor.addChild(root_0, LEFT_PARETHESIS315_tree);
                    }
                    pushFollow(FOLLOW_expression_in_atom_expr4725);
                    expression316=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression316.getTree());
                    RIGHT_PARETHESIS317=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr4727); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RIGHT_PARETHESIS317_tree = (SLAST)adaptor.create(RIGHT_PARETHESIS317);
                    adaptor.addChild(root_0, RIGHT_PARETHESIS317_tree);
                    }
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)LEFT_PARETHESIS315;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)RIGHT_PARETHESIS317;
                            endIndex = token.getStopIndex();
                          
                    }

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1580:6: LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS
                    {
                    LIST_T318=(Token)match(input,LIST_T,FOLLOW_LIST_T_in_atom_expr4740); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST_T.add(LIST_T318);

                    LEFT_PARETHESIS319=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr4742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS319);

                    pushFollow(FOLLOW_assignment_list_in_atom_expr4744);
                    assignment_list320=assignment_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list320.getTree());
                    RIGHT_PARETHESIS321=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr4746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS321);

                    if ( state.backtracking==0 ) {

                            token = (CommonToken)LIST_T318;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)RIGHT_PARETHESIS321;
                            endIndex = token.getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: assignment_list, LIST_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1587:6: -> ^( LIST_T assignment_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1587:10: ^( LIST_T assignment_list )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_LIST_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_assignment_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1588:6: 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS
                    {
                    string_literal322=(Token)match(input,189,FOLLOW_189_in_atom_expr4773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_189.add(string_literal322);

                    LEFT_PARETHESIS323=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr4775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS323);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1588:30: ( array_pair_list )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( ((LA105_0>=NAMESPACE_T && LA105_0<=LEFT_PARETHESIS)||LA105_0==IDENTIFIER||LA105_0==REF_T||LA105_0==STRINGLITERAL||LA105_0==DOMAIN_T||(LA105_0>=PLUS_T && LA105_0<=MINUS_T)||(LA105_0>=UNSET_T && LA105_0<=MINUS_MINUS_T)||(LA105_0>=AT_T && LA105_0<=PRINT_T)||(LA105_0>=DOLLAR_T && LA105_0<=HERE_DOC)||(LA105_0>=189 && LA105_0<=196)) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1588:30: array_pair_list
                            {
                            pushFollow(FOLLOW_array_pair_list_in_atom_expr4777);
                            array_pair_list324=array_pair_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_array_pair_list.add(array_pair_list324.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS325=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr4780); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS325);

                    if ( state.backtracking==0 ) {

                            token = (CommonToken)LEFT_PARETHESIS323;
                      	    startIndex = token.getStartIndex() - 5;
                      	    token = (CommonToken)RIGHT_PARETHESIS325;
                      	    endIndex = token.getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: array_pair_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1595:7: -> ^( ARRAY_DECL ( array_pair_list )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1595:11: ^( ARRAY_DECL ( array_pair_list )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(ARRAY_DECL, "ARRAY_DECL"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1595:24: ( array_pair_list )?
                        if ( stream_array_pair_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_array_pair_list.nextTree());

                        }
                        stream_array_pair_list.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1596:6: NEW_T class_name_reference
                    {
                    NEW_T326=(Token)match(input,NEW_T,FOLLOW_NEW_T_in_atom_expr4809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW_T.add(NEW_T326);

                    pushFollow(FOLLOW_class_name_reference_in_atom_expr4811);
                    class_name_reference327=class_name_reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_class_name_reference.add(class_name_reference327.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)NEW_T326;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(class_name_reference327!=null?((Token)class_name_reference327.stop):null);
                            endIndex = token.getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: class_name_reference, NEW_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1603:4: -> ^( NEW_T class_name_reference )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1603:8: ^( NEW_T class_name_reference )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_NEW_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_class_name_reference.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1604:6: CLONE_T variable
                    {
                    CLONE_T328=(Token)match(input,CLONE_T,FOLLOW_CLONE_T_in_atom_expr4838); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLONE_T.add(CLONE_T328);

                    pushFollow(FOLLOW_variable_in_atom_expr4840);
                    variable329=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable.add(variable329.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)CLONE_T328;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(variable329!=null?((Token)variable329.stop):null);
                            endIndex = token.getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: variable, CLONE_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1611:4: -> ^( CLONE_T variable )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1611:8: ^( CLONE_T variable )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_CLONE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_variable.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1623:6: UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS
                    {
                    UNSET_T330=(Token)match(input,UNSET_T,FOLLOW_UNSET_T_in_atom_expr4876); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNSET_T.add(UNSET_T330);

                    LEFT_PARETHESIS331=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr4878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS331);

                    pushFollow(FOLLOW_variable_list_in_atom_expr4880);
                    variable_list332=variable_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable_list.add(variable_list332.getTree());
                    RIGHT_PARETHESIS333=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr4882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS333);

                    if ( state.backtracking==0 ) {

                            token = (CommonToken)UNSET_T330;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)RIGHT_PARETHESIS333;
                            endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: variable_list, UNSET_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1630:5: -> ^( UNSET_T variable_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1630:9: ^( UNSET_T variable_list )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_UNSET_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_variable_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1631:6: BACKTRICKLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    BACKTRICKLITERAL334=(Token)match(input,BACKTRICKLITERAL,FOLLOW_BACKTRICKLITERAL_in_atom_expr4906); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BACKTRICKLITERAL334_tree = (SLAST)adaptor.create(BACKTRICKLITERAL334);
                    adaptor.addChild(root_0, BACKTRICKLITERAL334_tree);
                    }
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)BACKTRICKLITERAL334;
                            startIndex = token.getStartIndex();
                            endIndex = token.getStopIndex();
                          
                    }

                    }
                    break;
                case 10 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1637:6: PRINT_T expression
                    {
                    PRINT_T335=(Token)match(input,PRINT_T,FOLLOW_PRINT_T_in_atom_expr4919); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRINT_T.add(PRINT_T335);

                    pushFollow(FOLLOW_expression_in_atom_expr4921);
                    expression336=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression336.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)PRINT_T335;
                            startIndex = token.getStartIndex();
                            if ((expression336!=null?input.toString(expression336.start,expression336.stop):null) != null) {
                              token = (CommonToken)(expression336!=null?((Token)expression336.stop):null);
                            }
                            endIndex = token.getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: PRINT_T, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1646:4: -> ^( PRINT_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1646:7: ^( PRINT_T expression )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_PRINT_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom_expr"

    public static class class_name_reference_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_name_reference"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1656:1: class_name_reference : ( dynamic_name_reference | fully_qualified_class_name );
    public final CompilerAstParser.class_name_reference_return class_name_reference() throws RecognitionException {
        CompilerAstParser.class_name_reference_return retval = new CompilerAstParser.class_name_reference_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.dynamic_name_reference_return dynamic_name_reference337 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name338 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1657:3: ( dynamic_name_reference | fully_qualified_class_name )
            int alt107=2;
            alt107 = dfa107.predict(input);
            switch (alt107) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1657:5: dynamic_name_reference
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_dynamic_name_reference_in_class_name_reference4964);
                    dynamic_name_reference337=dynamic_name_reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dynamic_name_reference337.getTree());

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1658:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_fully_qualified_class_name_in_class_name_reference4970);
                    fully_qualified_class_name338=fully_qualified_class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fully_qualified_class_name338.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_name_reference"

    public static class dynamic_name_reference_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynamic_name_reference"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1661:1: dynamic_name_reference : ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )* ;
    public final CompilerAstParser.dynamic_name_reference_return dynamic_name_reference() throws RecognitionException {
        CompilerAstParser.dynamic_name_reference_return retval = new CompilerAstParser.dynamic_name_reference_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token SINGLE_ARROW_T340=null;
        CompilerAstParser.base_variable_with_function_calls_return base_variable_with_function_calls339 = null;

        CompilerAstParser.object_property_return object_property341 = null;

        CompilerAstParser.ctor_arguments_return ctor_arguments342 = null;


        SLAST SINGLE_ARROW_T340_tree=null;
        RewriteRuleTokenStream stream_SINGLE_ARROW_T=new RewriteRuleTokenStream(adaptor,"token SINGLE_ARROW_T");
        RewriteRuleSubtreeStream stream_ctor_arguments=new RewriteRuleSubtreeStream(adaptor,"rule ctor_arguments");
        RewriteRuleSubtreeStream stream_object_property=new RewriteRuleSubtreeStream(adaptor,"rule object_property");
        RewriteRuleSubtreeStream stream_base_variable_with_function_calls=new RewriteRuleSubtreeStream(adaptor,"rule base_variable_with_function_calls");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;
          ArrayList endIndexList = new ArrayList();
          ArrayList hasArgument = new ArrayList();
          ArrayList argumentStartIndex = new ArrayList();
          ArrayList argumentEndIndex = new ArrayList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1696:3: ( ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1696:5: ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1696:5: ( base_variable_with_function_calls -> base_variable_with_function_calls )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1696:6: base_variable_with_function_calls
            {
            pushFollow(FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference4998);
            base_variable_with_function_calls339=base_variable_with_function_calls();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_base_variable_with_function_calls.add(base_variable_with_function_calls339.getTree());
            if ( state.backtracking==0 ) {

                    token = (CommonToken)(base_variable_with_function_calls339!=null?((Token)base_variable_with_function_calls339.start):null);
                    startIndex = token.getStartIndex();
                    endIndex = token.getStopIndex();
                  
            }


            // AST REWRITE
            // elements: base_variable_with_function_calls
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 1702:7: -> base_variable_with_function_calls
            {
                adaptor.addChild(root_0, stream_base_variable_with_function_calls.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1703:5: ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==SINGLE_ARROW_T) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1703:6: SINGLE_ARROW_T object_property ( ctor_arguments )?
            	    {
            	    SINGLE_ARROW_T340=(Token)match(input,SINGLE_ARROW_T,FOLLOW_SINGLE_ARROW_T_in_dynamic_name_reference5023); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SINGLE_ARROW_T.add(SINGLE_ARROW_T340);

            	    pushFollow(FOLLOW_object_property_in_dynamic_name_reference5025);
            	    object_property341=object_property();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_object_property.add(object_property341.getTree());
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1703:37: ( ctor_arguments )?
            	    int alt108=2;
            	    int LA108_0 = input.LA(1);

            	    if ( (LA108_0==LEFT_PARETHESIS) ) {
            	        alt108=1;
            	    }
            	    switch (alt108) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1703:37: ctor_arguments
            	            {
            	            pushFollow(FOLLOW_ctor_arguments_in_dynamic_name_reference5027);
            	            ctor_arguments342=ctor_arguments();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments342.getTree());

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	            token = (CommonToken)(base_variable_with_function_calls339!=null?((Token)base_variable_with_function_calls339.start):null);
            	            startIndex = token.getStartIndex();
            	            token = (CommonToken)(object_property341!=null?((Token)object_property341.stop):null);
            	            endIndex = token.getStopIndex();
            	            endIndexList.add(0, endIndex);
            	            if ((ctor_arguments342!=null?input.toString(ctor_arguments342.start,ctor_arguments342.stop):null) != null) {
            	              endIndex = ((CommonToken)(ctor_arguments342!=null?((Token)ctor_arguments342.stop):null)).getStopIndex();
            	              int sid = (ctor_arguments342!=null?((SLAST)ctor_arguments342.tree):null).startIndex;
            	              int eid = (ctor_arguments342!=null?((SLAST)ctor_arguments342.tree):null).endIndex;
            	              hasArgument.add(0, true);
            	              argumentStartIndex.add(sid);
            	              argumentEndIndex.add(eid);
            	              endIndex = ((CommonToken)(ctor_arguments342!=null?((Token)ctor_arguments342.stop):null)).getStopIndex();
            	            }
            	            else {
            	              hasArgument.add(0, false);
            	            }
            	            
            	          
            	    }


            	    // AST REWRITE
            	    // elements: object_property, dynamic_name_reference, ctor_arguments
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 1724:5: -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1724:9: ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_object_property.nextTree());
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1724:56: ( ctor_arguments )?
            	        if ( stream_ctor_arguments.hasNext() ) {
            	            adaptor.addChild(root_1, stream_ctor_arguments.nextTree());

            	        }
            	        stream_ctor_arguments.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                
                Iterator iter = endIndexList.iterator(),
                        iterHasArgument = hasArgument.iterator(),
                        iterArguStart = argumentStartIndex.iterator(),
                        iterArguEnd = argumentEndIndex.iterator();
                
                int currentEndIndex = endIndex;
                boolean hasArgu = false;
                SLAST arguAst = null;
                while (iter.hasNext()) {
                  currentEndIndex = (Integer)iter.next();
                  ast.setIndex(startIndex, currentEndIndex);
                  hasArgu = (Boolean)iterHasArgument.next();
                  if (hasArgu) {
                    arguAst = (SLAST)ast.getChild(2);
                    arguAst.setIndex((Integer)iterArguStart.next(), (Integer)iterArguEnd.next());
                  }   
                  
                  ast = (SLAST)ast.getChild(0);
                }
                

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dynamic_name_reference"

    public static class assignment_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1727:1: assignment_list : ( assignment_element )? ( COMMA_T ( assignment_element )? )* -> ( assignment_element )* ;
    public final CompilerAstParser.assignment_list_return assignment_list() throws RecognitionException {
        CompilerAstParser.assignment_list_return retval = new CompilerAstParser.assignment_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T344=null;
        CompilerAstParser.assignment_element_return assignment_element343 = null;

        CompilerAstParser.assignment_element_return assignment_element345 = null;


        SLAST COMMA_T344_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_assignment_element=new RewriteRuleSubtreeStream(adaptor,"rule assignment_element");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1728:3: ( ( assignment_element )? ( COMMA_T ( assignment_element )? )* -> ( assignment_element )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1728:5: ( assignment_element )? ( COMMA_T ( assignment_element )? )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1728:5: ( assignment_element )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==NAMESPACE_T||LA110_0==IDENTIFIER||LA110_0==DOMAIN_T||LA110_0==LIST_T||LA110_0==DOLLAR_T) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1728:5: assignment_element
                    {
                    pushFollow(FOLLOW_assignment_element_in_assignment_list5078);
                    assignment_element343=assignment_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_element.add(assignment_element343.getTree());

                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1728:25: ( COMMA_T ( assignment_element )? )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==COMMA_T) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1728:26: COMMA_T ( assignment_element )?
            	    {
            	    COMMA_T344=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_assignment_list5082); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T344);

            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1728:34: ( assignment_element )?
            	    int alt111=2;
            	    int LA111_0 = input.LA(1);

            	    if ( (LA111_0==NAMESPACE_T||LA111_0==IDENTIFIER||LA111_0==DOMAIN_T||LA111_0==LIST_T||LA111_0==DOLLAR_T) ) {
            	        alt111=1;
            	    }
            	    switch (alt111) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1728:34: assignment_element
            	            {
            	            pushFollow(FOLLOW_assignment_element_in_assignment_list5084);
            	            assignment_element345=assignment_element();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignment_element.add(assignment_element345.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);



            // AST REWRITE
            // elements: assignment_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 1728:57: -> ( assignment_element )*
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1728:61: ( assignment_element )*
                while ( stream_assignment_element.hasNext() ) {
                    adaptor.addChild(root_0, stream_assignment_element.nextTree());

                }
                stream_assignment_element.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment_list"

    public static class assignment_element_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_element"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1731:1: assignment_element : ( variable | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) );
    public final CompilerAstParser.assignment_element_return assignment_element() throws RecognitionException {
        CompilerAstParser.assignment_element_return retval = new CompilerAstParser.assignment_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LIST_T347=null;
        Token LEFT_PARETHESIS348=null;
        Token RIGHT_PARETHESIS350=null;
        CompilerAstParser.variable_return variable346 = null;

        CompilerAstParser.assignment_list_return assignment_list349 = null;


        SLAST LIST_T347_tree=null;
        SLAST LEFT_PARETHESIS348_tree=null;
        SLAST RIGHT_PARETHESIS350_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_LIST_T=new RewriteRuleTokenStream(adaptor,"token LIST_T");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_assignment_list=new RewriteRuleSubtreeStream(adaptor,"rule assignment_list");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1732:3: ( variable | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==NAMESPACE_T||LA113_0==IDENTIFIER||LA113_0==DOMAIN_T||LA113_0==DOLLAR_T) ) {
                alt113=1;
            }
            else if ( (LA113_0==LIST_T) ) {
                alt113=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1732:5: variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_assignment_element5108);
                    variable346=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable346.getTree());

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1733:5: LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS
                    {
                    LIST_T347=(Token)match(input,LIST_T,FOLLOW_LIST_T_in_assignment_element5114); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST_T.add(LIST_T347);

                    LEFT_PARETHESIS348=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_assignment_element5116); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS348);

                    pushFollow(FOLLOW_assignment_list_in_assignment_element5118);
                    assignment_list349=assignment_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list349.getTree());
                    RIGHT_PARETHESIS350=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_assignment_element5120); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS350);



                    // AST REWRITE
                    // elements: LIST_T, assignment_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1733:62: -> ^( LIST_T assignment_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1733:66: ^( LIST_T assignment_list )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_LIST_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_assignment_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment_element"

    public static class array_pair_list_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_pair_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1736:1: array_pair_list : e1= array_pair_element ( COMMA_T e2= array_pair_element )* ( COMMA_T )? -> ( array_pair_element )+ ;
    public final CompilerAstParser.array_pair_list_return array_pair_list() throws RecognitionException {
        CompilerAstParser.array_pair_list_return retval = new CompilerAstParser.array_pair_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T351=null;
        Token COMMA_T352=null;
        CompilerAstParser.array_pair_element_return e1 = null;

        CompilerAstParser.array_pair_element_return e2 = null;


        SLAST COMMA_T351_tree=null;
        SLAST COMMA_T352_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_array_pair_element=new RewriteRuleSubtreeStream(adaptor,"rule array_pair_element");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1746:3: (e1= array_pair_element ( COMMA_T e2= array_pair_element )* ( COMMA_T )? -> ( array_pair_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1746:5: e1= array_pair_element ( COMMA_T e2= array_pair_element )* ( COMMA_T )?
            {
            pushFollow(FOLLOW_array_pair_element_in_array_pair_list5157);
            e1=array_pair_element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_array_pair_element.add(e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1746:27: ( COMMA_T e2= array_pair_element )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==COMMA_T) ) {
                    int LA114_1 = input.LA(2);

                    if ( ((LA114_1>=NAMESPACE_T && LA114_1<=LEFT_PARETHESIS)||LA114_1==IDENTIFIER||LA114_1==REF_T||LA114_1==STRINGLITERAL||LA114_1==DOMAIN_T||(LA114_1>=PLUS_T && LA114_1<=MINUS_T)||(LA114_1>=UNSET_T && LA114_1<=MINUS_MINUS_T)||(LA114_1>=AT_T && LA114_1<=PRINT_T)||(LA114_1>=DOLLAR_T && LA114_1<=HERE_DOC)||(LA114_1>=189 && LA114_1<=196)) ) {
                        alt114=1;
                    }


                }


                switch (alt114) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1746:28: COMMA_T e2= array_pair_element
            	    {
            	    COMMA_T351=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_array_pair_list5160); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T351);

            	    pushFollow(FOLLOW_array_pair_element_in_array_pair_list5164);
            	    e2=array_pair_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array_pair_element.add(e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1746:60: ( COMMA_T )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==COMMA_T) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1746:60: COMMA_T
                    {
                    COMMA_T352=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_array_pair_list5168); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T352);


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: array_pair_element
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 1756:6: -> ( array_pair_element )+
            {
                if ( !(stream_array_pair_element.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_array_pair_element.hasNext() ) {
                    adaptor.addChild(root_0, stream_array_pair_element.nextTree());

                }
                stream_array_pair_element.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "array_pair_list"

    public static class array_pair_element_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_pair_element"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1759:1: array_pair_element : e1= expression ( ARROW_T e2= expression )? ;
    public final CompilerAstParser.array_pair_element_return array_pair_element() throws RecognitionException {
        CompilerAstParser.array_pair_element_return retval = new CompilerAstParser.array_pair_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token ARROW_T353=null;
        CompilerAstParser.expression_return e1 = null;

        CompilerAstParser.expression_return e2 = null;


        SLAST ARROW_T353_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1769:3: (e1= expression ( ARROW_T e2= expression )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1769:5: e1= expression ( ARROW_T e2= expression )?
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_expression_in_array_pair_element5213);
            e1=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1769:19: ( ARROW_T e2= expression )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==ARROW_T) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1769:20: ARROW_T e2= expression
                    {
                    ARROW_T353=(Token)match(input,ARROW_T,FOLLOW_ARROW_T_in_array_pair_element5216); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ARROW_T353_tree = (SLAST)adaptor.create(ARROW_T353);
                    root_0 = (SLAST)adaptor.becomeRoot(ARROW_T353_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_array_pair_element5221);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(e1!=null?((Token)e1.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(e1!=null?((Token)e1.stop):null);
                  if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
                    token = (CommonToken)(e2!=null?((Token)e2.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "array_pair_element"

    public static class variable_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1781:1: variable : ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )* ;
    public final CompilerAstParser.variable_return variable() throws RecognitionException {
        CompilerAstParser.variable_return retval = new CompilerAstParser.variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token SINGLE_ARROW_T355=null;
        CompilerAstParser.base_variable_with_function_calls_return base_variable_with_function_calls354 = null;

        CompilerAstParser.object_property_return object_property356 = null;

        CompilerAstParser.ctor_arguments_return ctor_arguments357 = null;


        SLAST SINGLE_ARROW_T355_tree=null;
        RewriteRuleTokenStream stream_SINGLE_ARROW_T=new RewriteRuleTokenStream(adaptor,"token SINGLE_ARROW_T");
        RewriteRuleSubtreeStream stream_ctor_arguments=new RewriteRuleSubtreeStream(adaptor,"rule ctor_arguments");
        RewriteRuleSubtreeStream stream_object_property=new RewriteRuleSubtreeStream(adaptor,"rule object_property");
        RewriteRuleSubtreeStream stream_base_variable_with_function_calls=new RewriteRuleSubtreeStream(adaptor,"rule base_variable_with_function_calls");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;
          ArrayList endIndexList = new ArrayList();
          ArrayList hasArgument = new ArrayList();
          ArrayList argumentStartIndex = new ArrayList();
          ArrayList argumentEndIndex = new ArrayList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1816:3: ( ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1816:5: ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1816:5: ( base_variable_with_function_calls -> base_variable_with_function_calls )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1816:6: base_variable_with_function_calls
            {
            pushFollow(FOLLOW_base_variable_with_function_calls_in_variable5255);
            base_variable_with_function_calls354=base_variable_with_function_calls();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_base_variable_with_function_calls.add(base_variable_with_function_calls354.getTree());
            if ( state.backtracking==0 ) {

                    token = (CommonToken)(base_variable_with_function_calls354!=null?((Token)base_variable_with_function_calls354.start):null);
                    startIndex = token.getStartIndex();
                    endIndex = token.getStopIndex();
                  
            }


            // AST REWRITE
            // elements: base_variable_with_function_calls
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 1822:6: -> base_variable_with_function_calls
            {
                adaptor.addChild(root_0, stream_base_variable_with_function_calls.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1823:5: ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==SINGLE_ARROW_T) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1823:6: SINGLE_ARROW_T object_property ( ctor_arguments )?
            	    {
            	    SINGLE_ARROW_T355=(Token)match(input,SINGLE_ARROW_T,FOLLOW_SINGLE_ARROW_T_in_variable5278); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SINGLE_ARROW_T.add(SINGLE_ARROW_T355);

            	    pushFollow(FOLLOW_object_property_in_variable5280);
            	    object_property356=object_property();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_object_property.add(object_property356.getTree());
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1823:37: ( ctor_arguments )?
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==LEFT_PARETHESIS) ) {
            	        alt117=1;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1823:37: ctor_arguments
            	            {
            	            pushFollow(FOLLOW_ctor_arguments_in_variable5282);
            	            ctor_arguments357=ctor_arguments();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments357.getTree());

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	            token = (CommonToken)(base_variable_with_function_calls354!=null?((Token)base_variable_with_function_calls354.start):null);
            	            startIndex = token.getStartIndex();
            	            token = (CommonToken)(object_property356!=null?((Token)object_property356.stop):null);
            	            endIndex = token.getStopIndex();
            	            endIndexList.add(0, endIndex);
            	            
            	            if ((ctor_arguments357!=null?input.toString(ctor_arguments357.start,ctor_arguments357.stop):null) != null) {
            	              int sid = (ctor_arguments357!=null?((SLAST)ctor_arguments357.tree):null).startIndex;
            	              int eid = (ctor_arguments357!=null?((SLAST)ctor_arguments357.tree):null).endIndex;
            	              hasArgument.add(0, true);
            	              argumentStartIndex.add(sid);
            	              argumentEndIndex.add(eid);
            	              endIndex = ((CommonToken)(ctor_arguments357!=null?((Token)ctor_arguments357.stop):null)).getStopIndex();
            	            }
            	            else {
            	              hasArgument.add(0, false);
            	            }
            	          
            	    }


            	    // AST REWRITE
            	    // elements: object_property, ctor_arguments, variable
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 1843:5: -> ^( CALL $variable object_property ( ctor_arguments )? )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1843:9: ^( CALL $variable object_property ( ctor_arguments )? )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_object_property.nextTree());
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1843:42: ( ctor_arguments )?
            	        if ( stream_ctor_arguments.hasNext() ) {
            	            adaptor.addChild(root_1, stream_ctor_arguments.nextTree());

            	        }
            	        stream_ctor_arguments.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("variable:" + startIndex + " " + endIndex);
                
                Iterator iter = endIndexList.iterator(),
                        iterHasArgument = hasArgument.iterator(),
                        iterArguStart = argumentStartIndex.iterator(),
                        iterArguEnd = argumentEndIndex.iterator();
                
                int currentEndIndex = endIndex;
                boolean hasArgu = false;
                SLAST arguAst = null;
                while (iter.hasNext()) {
                  currentEndIndex = (Integer)iter.next();
                  ast.setIndex(startIndex, currentEndIndex);
                  hasArgu = (Boolean)iterHasArgument.next();
                  if (hasArgu) {
                    arguAst = (SLAST)ast.getChild(2);
                    arguAst.setIndex((Integer)iterArguStart.next(), (Integer)iterArguEnd.next());
                  }   
                  
                  ast = (SLAST)ast.getChild(0);
                }

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class base_variable_with_function_calls_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "base_variable_with_function_calls"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1846:1: base_variable_with_function_calls : ( ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? ) | fully_qualified_class_name ctor_arguments -> ^( CALL fully_qualified_class_name ctor_arguments ) );
    public final CompilerAstParser.base_variable_with_function_calls_return base_variable_with_function_calls() throws RecognitionException {
        CompilerAstParser.base_variable_with_function_calls_return retval = new CompilerAstParser.base_variable_with_function_calls_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name358 = null;

        CompilerAstParser.reference_variable_return reference_variable359 = null;

        CompilerAstParser.ctor_arguments_return ctor_arguments360 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name361 = null;

        CompilerAstParser.ctor_arguments_return ctor_arguments362 = null;


        RewriteRuleSubtreeStream stream_ctor_arguments=new RewriteRuleSubtreeStream(adaptor,"rule ctor_arguments");
        RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");
        RewriteRuleSubtreeStream stream_reference_variable=new RewriteRuleSubtreeStream(adaptor,"rule reference_variable");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1857:3: ( ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? ) | fully_qualified_class_name ctor_arguments -> ^( CALL fully_qualified_class_name ctor_arguments ) )
            int alt121=2;
            alt121 = dfa121.predict(input);
            switch (alt121) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1857:5: ( fully_qualified_class_name )? reference_variable ( ctor_arguments )?
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1857:5: ( fully_qualified_class_name )?
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==NAMESPACE_T||LA119_0==IDENTIFIER||LA119_0==DOMAIN_T) ) {
                        alt119=1;
                    }
                    switch (alt119) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1857:5: fully_qualified_class_name
                            {
                            pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5339);
                            fully_qualified_class_name358=fully_qualified_class_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name358.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_reference_variable_in_base_variable_with_function_calls5342);
                    reference_variable359=reference_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_reference_variable.add(reference_variable359.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1857:52: ( ctor_arguments )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==LEFT_PARETHESIS) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1857:52: ctor_arguments
                            {
                            pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls5344);
                            ctor_arguments360=ctor_arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments360.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                            token = (CommonToken)(reference_variable359!=null?((Token)reference_variable359.start):null);
                            if ((fully_qualified_class_name358!=null?input.toString(fully_qualified_class_name358.start,fully_qualified_class_name358.stop):null) != null) {
                              token = (CommonToken)(fully_qualified_class_name358!=null?((Token)fully_qualified_class_name358.start):null);
                            }
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(reference_variable359!=null?((Token)reference_variable359.stop):null);
                            if ((ctor_arguments360!=null?input.toString(ctor_arguments360.start,ctor_arguments360.stop):null) != null) {
                              token = (CommonToken)(ctor_arguments360!=null?((Token)ctor_arguments360.stop):null);
                            }
                            endIndex = token.getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: reference_variable, ctor_arguments, fully_qualified_class_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1870:7: -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1870:11: ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1870:22: ( fully_qualified_class_name )?
                        if ( stream_fully_qualified_class_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());

                        }
                        stream_fully_qualified_class_name.reset();
                        adaptor.addChild(root_1, stream_reference_variable.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1870:69: ( ctor_arguments )?
                        if ( stream_ctor_arguments.hasNext() ) {
                            adaptor.addChild(root_1, stream_ctor_arguments.nextTree());

                        }
                        stream_ctor_arguments.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1871:5: fully_qualified_class_name ctor_arguments
                    {
                    pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5378);
                    fully_qualified_class_name361=fully_qualified_class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name361.getTree());
                    pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls5380);
                    ctor_arguments362=ctor_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments362.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)(fully_qualified_class_name361!=null?((Token)fully_qualified_class_name361.start):null);
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(ctor_arguments362!=null?((Token)ctor_arguments362.stop):null);
                            endIndex = token.getStopIndex();
                            
                            System.out.println("ctor_ag::");
                          
                    }


                    // AST REWRITE
                    // elements: ctor_arguments, fully_qualified_class_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1880:7: -> ^( CALL fully_qualified_class_name ctor_arguments )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1880:11: ^( CALL fully_qualified_class_name ctor_arguments )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CALL, "CALL"), root_1);

                        adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());
                        adaptor.addChild(root_1, stream_ctor_arguments.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("base var: " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "base_variable_with_function_calls"

    public static class object_property_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object_property"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1885:1: object_property : ( reference_variable | reference_variable_without_dollar );
    public final CompilerAstParser.object_property_return object_property() throws RecognitionException {
        CompilerAstParser.object_property_return retval = new CompilerAstParser.object_property_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.reference_variable_return reference_variable363 = null;

        CompilerAstParser.reference_variable_without_dollar_return reference_variable_without_dollar364 = null;




          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1896:3: ( reference_variable | reference_variable_without_dollar )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==DOLLAR_T) ) {
                alt122=1;
            }
            else if ( (LA122_0==IDENTIFIER||LA122_0==LEFT_BRACKET) ) {
                alt122=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1896:5: reference_variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_reference_variable_in_object_property5433);
                    reference_variable363=reference_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reference_variable363.getTree());
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(reference_variable363!=null?((Token)reference_variable363.start):null);
                           startIndex = token.getStartIndex();
                           token = (CommonToken)(reference_variable363!=null?((Token)reference_variable363.stop):null);
                           endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1903:5: reference_variable_without_dollar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_reference_variable_without_dollar_in_object_property5443);
                    reference_variable_without_dollar364=reference_variable_without_dollar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reference_variable_without_dollar364.getTree());
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(reference_variable_without_dollar364!=null?((Token)reference_variable_without_dollar364.start):null);
                           startIndex = token.getStartIndex();
                           token = (CommonToken)(reference_variable_without_dollar364!=null?((Token)reference_variable_without_dollar364.stop):null);
                           endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("obj: " + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "object_property"

    public static class reference_variable_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reference_variable"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1912:1: reference_variable : ( compound_variable -> ^( VAR compound_variable ) ) ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )* ;
    public final CompilerAstParser.reference_variable_return reference_variable() throws RecognitionException {
        CompilerAstParser.reference_variable_return retval = new CompilerAstParser.reference_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_OPEN_RECT366=null;
        Token RIGHT_OPEN_RECT367=null;
        Token LEFT_BRACKET368=null;
        Token RIGHT_BRACKET369=null;
        CompilerAstParser.expression_return e = null;

        CompilerAstParser.compound_variable_return compound_variable365 = null;


        SLAST LEFT_OPEN_RECT366_tree=null;
        SLAST RIGHT_OPEN_RECT367_tree=null;
        SLAST LEFT_BRACKET368_tree=null;
        SLAST RIGHT_BRACKET369_tree=null;
        RewriteRuleTokenStream stream_RIGHT_OPEN_RECT=new RewriteRuleTokenStream(adaptor,"token RIGHT_OPEN_RECT");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_LEFT_OPEN_RECT=new RewriteRuleTokenStream(adaptor,"token LEFT_OPEN_RECT");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_compound_variable=new RewriteRuleSubtreeStream(adaptor,"rule compound_variable");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;  
          ArrayList endIndexList = new ArrayList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1932:3: ( ( compound_variable -> ^( VAR compound_variable ) ) ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1932:5: ( compound_variable -> ^( VAR compound_variable ) ) ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1932:5: ( compound_variable -> ^( VAR compound_variable ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1932:6: compound_variable
            {
            pushFollow(FOLLOW_compound_variable_in_reference_variable5473);
            compound_variable365=compound_variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_variable.add(compound_variable365.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(compound_variable365!=null?((Token)compound_variable365.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(compound_variable365!=null?((Token)compound_variable365.stop):null);
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: compound_variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 1939:5: -> ^( VAR compound_variable )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1939:8: ^( VAR compound_variable )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_compound_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1940:3: ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )*
            loop124:
            do {
                int alt124=3;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==LEFT_OPEN_RECT) ) {
                    alt124=1;
                }
                else if ( (LA124_0==LEFT_BRACKET) ) {
                    alt124=2;
                }


                switch (alt124) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1941:3: LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT
            	    {
            	    LEFT_OPEN_RECT366=(Token)match(input,LEFT_OPEN_RECT,FOLLOW_LEFT_OPEN_RECT_in_reference_variable5498); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LEFT_OPEN_RECT.add(LEFT_OPEN_RECT366);

            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1941:19: (e= expression )?
            	    int alt123=2;
            	    int LA123_0 = input.LA(1);

            	    if ( ((LA123_0>=NAMESPACE_T && LA123_0<=LEFT_PARETHESIS)||LA123_0==IDENTIFIER||LA123_0==REF_T||LA123_0==STRINGLITERAL||LA123_0==DOMAIN_T||(LA123_0>=PLUS_T && LA123_0<=MINUS_T)||(LA123_0>=UNSET_T && LA123_0<=MINUS_MINUS_T)||(LA123_0>=AT_T && LA123_0<=PRINT_T)||(LA123_0>=DOLLAR_T && LA123_0<=HERE_DOC)||(LA123_0>=189 && LA123_0<=196)) ) {
            	        alt123=1;
            	    }
            	    switch (alt123) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1941:19: e= expression
            	            {
            	            pushFollow(FOLLOW_expression_in_reference_variable5502);
            	            e=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expression.add(e.getTree());

            	            }
            	            break;

            	    }

            	    RIGHT_OPEN_RECT367=(Token)match(input,RIGHT_OPEN_RECT,FOLLOW_RIGHT_OPEN_RECT_in_reference_variable5505); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RIGHT_OPEN_RECT.add(RIGHT_OPEN_RECT367);

            	    if ( state.backtracking==0 ) {

            	          endIndex = ((CommonToken)RIGHT_OPEN_RECT367).getStopIndex();
            	          endIndexList.add(0, endIndex);
            	        
            	    }


            	    // AST REWRITE
            	    // elements: e, reference_variable
            	    // token labels: 
            	    // rule labels: retval, e
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 1946:5: -> ^( INDEX $reference_variable ( $e)? )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1946:9: ^( INDEX $reference_variable ( $e)? )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(INDEX, "INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1946:37: ( $e)?
            	        if ( stream_e.hasNext() ) {
            	            adaptor.addChild(root_1, stream_e.nextTree());

            	        }
            	        stream_e.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1948:3: LEFT_BRACKET e= expression RIGHT_BRACKET
            	    {
            	    LEFT_BRACKET368=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_reference_variable5535); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET368);

            	    pushFollow(FOLLOW_expression_in_reference_variable5539);
            	    e=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(e.getTree());
            	    RIGHT_BRACKET369=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_reference_variable5541); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET369);

            	    if ( state.backtracking==0 ) {

            	          endIndex = ((CommonToken)RIGHT_BRACKET369).getStopIndex();
            	          endIndexList.add(0, endIndex);
            	        
            	    }


            	    // AST REWRITE
            	    // elements: e, reference_variable
            	    // token labels: 
            	    // rule labels: retval, e
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 1953:5: -> ^( HASH_INDEX $reference_variable $e)
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1953:9: ^( HASH_INDEX $reference_variable $e)
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(HASH_INDEX, "HASH_INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_e.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("ref:" + startIndex + " " + endIndex);
                
                Iterator iter = endIndexList.iterator();
                int currentEndIndex = endIndex;
                while (iter.hasNext()) {
                  currentEndIndex = (Integer)iter.next();
                  ast.setIndex(startIndex, currentEndIndex);
                  ast = (SLAST)ast.getChild(0);
                }  

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reference_variable"

    public static class compound_variable_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compound_variable"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1957:1: compound_variable : ( dollars IDENTIFIER | dollars LEFT_BRACKET expression RIGHT_BRACKET );
    public final CompilerAstParser.compound_variable_return compound_variable() throws RecognitionException {
        CompilerAstParser.compound_variable_return retval = new CompilerAstParser.compound_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token IDENTIFIER371=null;
        Token LEFT_BRACKET373=null;
        Token RIGHT_BRACKET375=null;
        CompilerAstParser.dollars_return dollars370 = null;

        CompilerAstParser.dollars_return dollars372 = null;

        CompilerAstParser.expression_return expression374 = null;


        SLAST IDENTIFIER371_tree=null;
        SLAST LEFT_BRACKET373_tree=null;
        SLAST RIGHT_BRACKET375_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;  

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1968:3: ( dollars IDENTIFIER | dollars LEFT_BRACKET expression RIGHT_BRACKET )
            int alt125=2;
            alt125 = dfa125.predict(input);
            switch (alt125) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1968:5: dollars IDENTIFIER
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_dollars_in_compound_variable5592);
                    dollars370=dollars();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dollars370.getTree());
                    IDENTIFIER371=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compound_variable5594); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER371_tree = (SLAST)adaptor.create(IDENTIFIER371);
                    adaptor.addChild(root_0, IDENTIFIER371_tree);
                    }
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(dollars370!=null?((Token)dollars370.start):null);
                           startIndex = token.getStartIndex();
                           token = (CommonToken)IDENTIFIER371;
                           endIndex = token.getStopIndex();
                         
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1975:5: dollars LEFT_BRACKET expression RIGHT_BRACKET
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_dollars_in_compound_variable5606);
                    dollars372=dollars();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dollars372.getTree());
                    LEFT_BRACKET373=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_compound_variable5608); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_compound_variable5611);
                    expression374=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression374.getTree());
                    RIGHT_BRACKET375=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_compound_variable5613); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(dollars372!=null?((Token)dollars372.start):null);
                           startIndex = token.getStartIndex();
                           token = (CommonToken)RIGHT_BRACKET375;
                           endIndex = token.getStopIndex();
                         
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("com:" + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compound_variable"

    public static class dollars_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dollars"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1984:1: dollars : ( DOLLAR_T )+ ;
    public final CompilerAstParser.dollars_return dollars() throws RecognitionException {
        CompilerAstParser.dollars_return retval = new CompilerAstParser.dollars_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token DOLLAR_T376=null;

        SLAST DOLLAR_T376_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1985:3: ( ( DOLLAR_T )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1985:5: ( DOLLAR_T )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1985:5: ( DOLLAR_T )+
            int cnt126=0;
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==DOLLAR_T) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1985:5: DOLLAR_T
            	    {
            	    DOLLAR_T376=(Token)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_dollars5634); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOLLAR_T376_tree = (SLAST)adaptor.create(DOLLAR_T376);
            	    adaptor.addChild(root_0, DOLLAR_T376_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt126 >= 1 ) break loop126;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(126, input);
                        throw eee;
                }
                cnt126++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dollars"

    public static class reference_variable_without_dollar_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reference_variable_without_dollar"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:1988:1: reference_variable_without_dollar : ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) ) ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )* ;
    public final CompilerAstParser.reference_variable_without_dollar_return reference_variable_without_dollar() throws RecognitionException {
        CompilerAstParser.reference_variable_without_dollar_return retval = new CompilerAstParser.reference_variable_without_dollar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_OPEN_RECT378=null;
        Token RIGHT_OPEN_RECT380=null;
        Token LEFT_BRACKET381=null;
        Token RIGHT_BRACKET383=null;
        CompilerAstParser.compound_variable_without_dollar_return compound_variable_without_dollar377 = null;

        CompilerAstParser.expression_return expression379 = null;

        CompilerAstParser.expression_return expression382 = null;


        SLAST LEFT_OPEN_RECT378_tree=null;
        SLAST RIGHT_OPEN_RECT380_tree=null;
        SLAST LEFT_BRACKET381_tree=null;
        SLAST RIGHT_BRACKET383_tree=null;
        RewriteRuleTokenStream stream_RIGHT_OPEN_RECT=new RewriteRuleTokenStream(adaptor,"token RIGHT_OPEN_RECT");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_LEFT_OPEN_RECT=new RewriteRuleTokenStream(adaptor,"token LEFT_OPEN_RECT");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_compound_variable_without_dollar=new RewriteRuleSubtreeStream(adaptor,"rule compound_variable_without_dollar");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;
          ArrayList endIndexList = new ArrayList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2007:3: ( ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) ) ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2007:5: ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) ) ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2007:5: ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2007:6: compound_variable_without_dollar
            {
            pushFollow(FOLLOW_compound_variable_without_dollar_in_reference_variable_without_dollar5662);
            compound_variable_without_dollar377=compound_variable_without_dollar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_variable_without_dollar.add(compound_variable_without_dollar377.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(compound_variable_without_dollar377!=null?((Token)compound_variable_without_dollar377.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(compound_variable_without_dollar377!=null?((Token)compound_variable_without_dollar377.stop):null);
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: compound_variable_without_dollar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 2014:6: -> ^( VAR compound_variable_without_dollar )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2014:10: ^( VAR compound_variable_without_dollar )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_compound_variable_without_dollar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2015:3: ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )*
            loop128:
            do {
                int alt128=3;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==LEFT_OPEN_RECT) ) {
                    alt128=1;
                }
                else if ( (LA128_0==LEFT_BRACKET) ) {
                    alt128=2;
                }


                switch (alt128) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2016:3: LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT
            	    {
            	    LEFT_OPEN_RECT378=(Token)match(input,LEFT_OPEN_RECT,FOLLOW_LEFT_OPEN_RECT_in_reference_variable_without_dollar5691); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LEFT_OPEN_RECT.add(LEFT_OPEN_RECT378);

            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2016:18: ( expression )?
            	    int alt127=2;
            	    int LA127_0 = input.LA(1);

            	    if ( ((LA127_0>=NAMESPACE_T && LA127_0<=LEFT_PARETHESIS)||LA127_0==IDENTIFIER||LA127_0==REF_T||LA127_0==STRINGLITERAL||LA127_0==DOMAIN_T||(LA127_0>=PLUS_T && LA127_0<=MINUS_T)||(LA127_0>=UNSET_T && LA127_0<=MINUS_MINUS_T)||(LA127_0>=AT_T && LA127_0<=PRINT_T)||(LA127_0>=DOLLAR_T && LA127_0<=HERE_DOC)||(LA127_0>=189 && LA127_0<=196)) ) {
            	        alt127=1;
            	    }
            	    switch (alt127) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2016:18: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_reference_variable_without_dollar5693);
            	            expression379=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expression.add(expression379.getTree());

            	            }
            	            break;

            	    }

            	    RIGHT_OPEN_RECT380=(Token)match(input,RIGHT_OPEN_RECT,FOLLOW_RIGHT_OPEN_RECT_in_reference_variable_without_dollar5696); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RIGHT_OPEN_RECT.add(RIGHT_OPEN_RECT380);

            	    if ( state.backtracking==0 ) {

            	          endIndex = ((CommonToken)RIGHT_OPEN_RECT380).getStopIndex();
            	          endIndexList.add(0, endIndex);
            	        
            	    }


            	    // AST REWRITE
            	    // elements: expression, reference_variable_without_dollar
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 2021:6: -> ^( INDEX $reference_variable_without_dollar ( expression )? )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2021:10: ^( INDEX $reference_variable_without_dollar ( expression )? )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(INDEX, "INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2021:53: ( expression )?
            	        if ( stream_expression.hasNext() ) {
            	            adaptor.addChild(root_1, stream_expression.nextTree());

            	        }
            	        stream_expression.reset();

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2023:3: LEFT_BRACKET expression RIGHT_BRACKET
            	    {
            	    LEFT_BRACKET381=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_reference_variable_without_dollar5727); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET381);

            	    pushFollow(FOLLOW_expression_in_reference_variable_without_dollar5729);
            	    expression382=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression382.getTree());
            	    RIGHT_BRACKET383=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_reference_variable_without_dollar5731); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET383);

            	    if ( state.backtracking==0 ) {

            	          endIndex = ((CommonToken)RIGHT_BRACKET383).getStopIndex();
            	          endIndexList.add(0, endIndex);
            	        
            	    }


            	    // AST REWRITE
            	    // elements: expression, reference_variable_without_dollar
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 2028:6: -> ^( HASH_INDEX $reference_variable_without_dollar expression )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2028:10: ^( HASH_INDEX $reference_variable_without_dollar expression )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(HASH_INDEX, "HASH_INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expression.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                
                int currentEndIndex = endIndex;
                Iterator iter = endIndexList.iterator();
                while (iter.hasNext()) {
                  currentEndIndex = (Integer)iter.next();
                  ast.setIndex(startIndex, currentEndIndex);
                  ast = (SLAST)ast.getChild(0);
                }

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "reference_variable_without_dollar"

    public static class compound_variable_without_dollar_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compound_variable_without_dollar"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2032:1: compound_variable_without_dollar : ( IDENTIFIER | LEFT_BRACKET expression RIGHT_BRACKET );
    public final CompilerAstParser.compound_variable_without_dollar_return compound_variable_without_dollar() throws RecognitionException {
        CompilerAstParser.compound_variable_without_dollar_return retval = new CompilerAstParser.compound_variable_without_dollar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token IDENTIFIER384=null;
        Token LEFT_BRACKET385=null;
        Token RIGHT_BRACKET387=null;
        CompilerAstParser.expression_return expression386 = null;


        SLAST IDENTIFIER384_tree=null;
        SLAST LEFT_BRACKET385_tree=null;
        SLAST RIGHT_BRACKET387_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;  

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2043:3: ( IDENTIFIER | LEFT_BRACKET expression RIGHT_BRACKET )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==IDENTIFIER) ) {
                alt129=1;
            }
            else if ( (LA129_0==LEFT_BRACKET) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }
            switch (alt129) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2043:5: IDENTIFIER
                    {
                    root_0 = (SLAST)adaptor.nil();

                    IDENTIFIER384=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compound_variable_without_dollar5781); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER384_tree = (SLAST)adaptor.create(IDENTIFIER384);
                    adaptor.addChild(root_0, IDENTIFIER384_tree);
                    }
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)IDENTIFIER384;
                           startIndex = token.getStartIndex();
                           endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2049:5: LEFT_BRACKET expression RIGHT_BRACKET
                    {
                    root_0 = (SLAST)adaptor.nil();

                    LEFT_BRACKET385=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_compound_variable_without_dollar5791); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_compound_variable_without_dollar5794);
                    expression386=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression386.getTree());
                    RIGHT_BRACKET387=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_compound_variable_without_dollar5796); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)LEFT_BRACKET385;
                           startIndex = token.getStartIndex();
                           token = (CommonToken)RIGHT_BRACKET387;
                           endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("com:" + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compound_variable_without_dollar"

    public static class ctor_arguments_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctor_arguments"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2058:1: ctor_arguments : LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS -> ^( ARGU ( expr_list )? ) ;
    public final CompilerAstParser.ctor_arguments_return ctor_arguments() throws RecognitionException {
        CompilerAstParser.ctor_arguments_return retval = new CompilerAstParser.ctor_arguments_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_PARETHESIS388=null;
        Token RIGHT_PARETHESIS390=null;
        CompilerAstParser.expr_list_return expr_list389 = null;


        SLAST LEFT_PARETHESIS388_tree=null;
        SLAST RIGHT_PARETHESIS390_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2069:3: ( LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS -> ^( ARGU ( expr_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2069:6: LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS
            {
            LEFT_PARETHESIS388=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_ctor_arguments5827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS388);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2069:22: ( expr_list )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=NAMESPACE_T && LA130_0<=LEFT_PARETHESIS)||LA130_0==IDENTIFIER||LA130_0==REF_T||LA130_0==STRINGLITERAL||LA130_0==DOMAIN_T||(LA130_0>=PLUS_T && LA130_0<=MINUS_T)||(LA130_0>=UNSET_T && LA130_0<=MINUS_MINUS_T)||(LA130_0>=AT_T && LA130_0<=PRINT_T)||(LA130_0>=DOLLAR_T && LA130_0<=HERE_DOC)||(LA130_0>=189 && LA130_0<=196)) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2069:22: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_ctor_arguments5829);
                    expr_list389=expr_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_list.add(expr_list389.getTree());

                    }
                    break;

            }

            RIGHT_PARETHESIS390=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_ctor_arguments5832); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS390);

            if ( state.backtracking==0 ) {

                    token = (CommonToken)LEFT_PARETHESIS388;
                    startIndex = token.getStartIndex();
                    token = (CommonToken)RIGHT_PARETHESIS390;
                    endIndex = token.getStopIndex();
                  
            }


            // AST REWRITE
            // elements: expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 2076:6: -> ^( ARGU ( expr_list )? )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2076:10: ^( ARGU ( expr_list )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(ARGU, "ARGU"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2076:17: ( expr_list )?
                if ( stream_expr_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_list.nextTree());

                }
                stream_expr_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);
                System.out.println("argu:" + startIndex + " " + endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ctor_arguments"

    public static class pure_variable_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pure_variable"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2079:1: pure_variable : ( REF_T )? ( DOLLAR_T )+ IDENTIFIER -> ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) ;
    public final CompilerAstParser.pure_variable_return pure_variable() throws RecognitionException {
        CompilerAstParser.pure_variable_return retval = new CompilerAstParser.pure_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token REF_T391=null;
        Token DOLLAR_T392=null;
        Token IDENTIFIER393=null;

        SLAST REF_T391_tree=null;
        SLAST DOLLAR_T392_tree=null;
        SLAST IDENTIFIER393_tree=null;
        RewriteRuleTokenStream stream_REF_T=new RewriteRuleTokenStream(adaptor,"token REF_T");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_DOLLAR_T=new RewriteRuleTokenStream(adaptor,"token DOLLAR_T");


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2089:3: ( ( REF_T )? ( DOLLAR_T )+ IDENTIFIER -> ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2089:5: ( REF_T )? ( DOLLAR_T )+ IDENTIFIER
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2089:5: ( REF_T )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==REF_T) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2089:5: REF_T
                    {
                    REF_T391=(Token)match(input,REF_T,FOLLOW_REF_T_in_pure_variable5878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REF_T.add(REF_T391);


                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2089:12: ( DOLLAR_T )+
            int cnt132=0;
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==DOLLAR_T) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2089:12: DOLLAR_T
            	    {
            	    DOLLAR_T392=(Token)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_pure_variable5881); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOLLAR_T.add(DOLLAR_T392);


            	    }
            	    break;

            	default :
            	    if ( cnt132 >= 1 ) break loop132;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(132, input);
                        throw eee;
                }
                cnt132++;
            } while (true);

            IDENTIFIER393=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pure_variable5884); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER393);

            if ( state.backtracking==0 ) {

                    token = (CommonToken)DOLLAR_T392;
                    if ((REF_T391!=null?REF_T391.getText():null) != null) {
                      token = (CommonToken)REF_T391;
                    }
                    startIndex = token.getStartIndex();
                    token = (CommonToken)IDENTIFIER393;
                    endIndex = token.getStopIndex();
                  
            }


            // AST REWRITE
            // elements: DOLLAR_T, IDENTIFIER, REF_T
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 2099:5: -> ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2099:9: ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2099:20: ( REF_T )?
                if ( stream_REF_T.hasNext() ) {
                    adaptor.addChild(root_1, stream_REF_T.nextNode());

                }
                stream_REF_T.reset();
                if ( !(stream_DOLLAR_T.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_DOLLAR_T.hasNext() ) {
                    adaptor.addChild(root_1, stream_DOLLAR_T.nextNode());

                }
                stream_DOLLAR_T.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST ast = retval.tree;
                ast.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pure_variable"

    public static class scalar_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scalar"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2102:1: scalar : constant -> ^( SCALAR constant ) ;
    public final CompilerAstParser.scalar_return scalar() throws RecognitionException {
        CompilerAstParser.scalar_return retval = new CompilerAstParser.scalar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.constant_return constant394 = null;


        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2112:3: ( constant -> ^( SCALAR constant ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2112:5: constant
            {
            pushFollow(FOLLOW_constant_in_scalar5936);
            constant394=constant();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constant.add(constant394.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(constant394!=null?((Token)constant394.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(constant394!=null?((Token)constant394.stop):null);
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: constant
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 2119:5: -> ^( SCALAR constant )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2119:9: ^( SCALAR constant )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(SCALAR, "SCALAR"), root_1);

                adaptor.addChild(root_1, stream_constant.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST exprToken = retval.tree;
                exprToken.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scalar"

    public static class constant_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2122:1: constant : ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | DOUBLELITERRAL | REALLITERAL | common_scalar | fully_qualified_class_name | HERE_DOC );
    public final CompilerAstParser.constant_return constant() throws RecognitionException {
        CompilerAstParser.constant_return retval = new CompilerAstParser.constant_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token INTLITERAL395=null;
        Token FLOATLITERAL396=null;
        Token STRINGLITERAL397=null;
        Token DOUBLELITERRAL398=null;
        Token REALLITERAL399=null;
        Token HERE_DOC402=null;
        CompilerAstParser.common_scalar_return common_scalar400 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name401 = null;


        SLAST INTLITERAL395_tree=null;
        SLAST FLOATLITERAL396_tree=null;
        SLAST STRINGLITERAL397_tree=null;
        SLAST DOUBLELITERRAL398_tree=null;
        SLAST REALLITERAL399_tree=null;
        SLAST HERE_DOC402_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2132:3: ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | DOUBLELITERRAL | REALLITERAL | common_scalar | fully_qualified_class_name | HERE_DOC )
            int alt133=8;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt133=1;
                }
                break;
            case FLOATLITERAL:
                {
                alt133=2;
                }
                break;
            case STRINGLITERAL:
                {
                alt133=3;
                }
                break;
            case DOUBLELITERRAL:
                {
                alt133=4;
                }
                break;
            case REALLITERAL:
                {
                alt133=5;
                }
                break;
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
            case 196:
                {
                alt133=6;
                }
                break;
            case NAMESPACE_T:
            case IDENTIFIER:
            case DOMAIN_T:
                {
                alt133=7;
                }
                break;
            case HERE_DOC:
                {
                alt133=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2132:5: INTLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    INTLITERAL395=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_constant5981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL395_tree = (SLAST)adaptor.create(INTLITERAL395);
                    adaptor.addChild(root_0, INTLITERAL395_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2133:5: FLOATLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    FLOATLITERAL396=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_constant5990); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOATLITERAL396_tree = (SLAST)adaptor.create(FLOATLITERAL396);
                    adaptor.addChild(root_0, FLOATLITERAL396_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2134:5: STRINGLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    STRINGLITERAL397=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_constant5998); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRINGLITERAL397_tree = (SLAST)adaptor.create(STRINGLITERAL397);
                    adaptor.addChild(root_0, STRINGLITERAL397_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2136:5: DOUBLELITERRAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    DOUBLELITERRAL398=(Token)match(input,DOUBLELITERRAL,FOLLOW_DOUBLELITERRAL_in_constant6005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLELITERRAL398_tree = (SLAST)adaptor.create(DOUBLELITERRAL398);
                    adaptor.addChild(root_0, DOUBLELITERRAL398_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2137:5: REALLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    REALLITERAL399=(Token)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_constant6011); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REALLITERAL399_tree = (SLAST)adaptor.create(REALLITERAL399);
                    adaptor.addChild(root_0, REALLITERAL399_tree);
                    }

                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2138:5: common_scalar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_common_scalar_in_constant6017);
                    common_scalar400=common_scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, common_scalar400.getTree());

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2139:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_fully_qualified_class_name_in_constant6025);
                    fully_qualified_class_name401=fully_qualified_class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fully_qualified_class_name401.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(fully_qualified_class_name401!=null?((Token)fully_qualified_class_name401.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(fully_qualified_class_name401!=null?((Token)fully_qualified_class_name401.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2146:5: HERE_DOC
                    {
                    root_0 = (SLAST)adaptor.nil();

                    HERE_DOC402=(Token)match(input,HERE_DOC,FOLLOW_HERE_DOC_in_constant6035); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HERE_DOC402_tree = (SLAST)adaptor.create(HERE_DOC402);
                    adaptor.addChild(root_0, HERE_DOC402_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

                SLAST exprToken = retval.tree;
                exprToken.setIndex(startIndex, endIndex);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class common_scalar_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "common_scalar"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2149:1: common_scalar : ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' );
    public final CompilerAstParser.common_scalar_return common_scalar() throws RecognitionException {
        CompilerAstParser.common_scalar_return retval = new CompilerAstParser.common_scalar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set403=null;

        SLAST set403_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:2150:3: ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set403=(Token)input.LT(1);
            if ( (input.LA(1)>=190 && input.LA(1)<=196) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set403));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (SLAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "common_scalar"

    // $ANTLR start synpred1_CompilerAst
    public final void synpred1_CompilerAst_fragment() throws RecognitionException {   
        CompilerAstParser.expression_return eElseCond = null;

        CompilerAstParser.statement_return s2 = null;


        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:596:53: ( ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )
        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:596:53: ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement
        {
        match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_synpred1_CompilerAst2206); if (state.failed) return ;
        match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_synpred1_CompilerAst2208); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred1_CompilerAst2212);
        eElseCond=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_synpred1_CompilerAst2214); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred1_CompilerAst2218);
        s2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_CompilerAst

    // $ANTLR start synpred2_CompilerAst
    public final void synpred2_CompilerAst_fragment() throws RecognitionException {   
        CompilerAstParser.statement_return s3 = null;


        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:597:42: ( ELSE_T s3= statement )
        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/CompilerAst.g:597:42: ELSE_T s3= statement
        {
        match(input,ELSE_T,FOLLOW_ELSE_T_in_synpred2_CompilerAst2244); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred2_CompilerAst2248);
        s3=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_CompilerAst

    // Delegated rules

    public final boolean synpred2_CompilerAst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_CompilerAst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_CompilerAst() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_CompilerAst_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA107 dfa107 = new DFA107(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA125 dfa125 = new DFA125(this);
    static final String DFA21_eotS =
        "\72\uffff";
    static final String DFA21_eofS =
        "\72\uffff";
    static final String DFA21_minS =
        "\1\73\1\uffff\1\73\1\65\1\uffff\1\65\1\61\1\60\1\125\1\65\3\74\1"+
        "\u0097\1\65\1\63\1\65\1\62\2\uffff\1\74\2\60\6\62\1\125\1\65\2\62"+
        "\1\125\1\65\3\74\1\u0097\1\65\1\62\1\65\2\62\1\74\1\60\6\62\1\125"+
        "\1\65\4\62";
    static final String DFA21_maxS =
        "\1\u00b4\1\uffff\1\u00b4\1\74\1\uffff\1\65\1\61\1\u00bd\1\125\1"+
        "\65\5\u0097\1\70\1\u0097\1\127\2\uffff\1\u0097\1\u00c4\1\u00bd\6"+
        "\126\1\125\1\65\2\126\1\125\1\65\5\u0097\1\126\1\u0097\1\127\1\126"+
        "\1\u0097\1\u00c4\6\126\1\125\1\65\4\126";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\15\uffff\1\2\1\3\46\uffff";
    static final String DFA21_specialS =
        "\72\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\3\1\uffff\1\4\10\uffff\1\2\150\uffff\2\2\1\1\3\2",
            "",
            "\1\3\1\1\11\uffff\1\2\120\uffff\1\1\27\uffff\2\2\1\uffff\3"+
            "\2",
            "\1\6\6\uffff\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\10\1\uffff\1\17\2\uffff\1\12\6\uffff\1\15\1\14\27\uffff"+
            "\1\11\62\uffff\2\13\15\uffff\1\16\35\uffff\11\13",
            "\1\11",
            "\1\12",
            "\1\15\1\14\27\uffff\1\20\101\uffff\1\16",
            "\1\15\1\14\131\uffff\1\16",
            "\1\15\132\uffff\1\16",
            "\1\16",
            "\1\21\141\uffff\1\16",
            "\1\22\4\uffff\1\23",
            "\1\24\6\uffff\1\15\1\14\131\uffff\1\16",
            "\1\17\43\uffff\1\26\1\25",
            "",
            "",
            "\1\15\1\14\27\uffff\1\20\101\uffff\1\16",
            "\1\35\4\uffff\1\37\35\uffff\1\31\1\uffff\1\36\102\uffff\1\27"+
            "\1\30\1\32\1\33\1\40\41\uffff\7\34",
            "\1\41\4\uffff\1\43\6\uffff\1\46\1\45\27\uffff\1\42\62\uffff"+
            "\2\44\15\uffff\1\47\35\uffff\11\44",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\36",
            "\1\37",
            "\1\17\42\uffff\1\50\1\26",
            "\1\17\43\uffff\1\26",
            "\1\42",
            "\1\43",
            "\1\46\1\45\27\uffff\1\51\101\uffff\1\47",
            "\1\46\1\45\131\uffff\1\47",
            "\1\46\132\uffff\1\47",
            "\1\47",
            "\1\52\141\uffff\1\47",
            "\1\17\2\uffff\1\53\40\uffff\1\26",
            "\1\54\6\uffff\1\46\1\45\131\uffff\1\47",
            "\1\17\43\uffff\1\26\1\55",
            "\1\17\42\uffff\1\50\1\26",
            "\1\46\1\45\27\uffff\1\51\101\uffff\1\47",
            "\1\64\4\uffff\1\66\35\uffff\1\60\1\uffff\1\65\102\uffff\1\56"+
            "\1\57\1\61\1\62\1\67\41\uffff\7\63",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\17\43\uffff\1\26",
            "\1\65",
            "\1\66",
            "\1\17\42\uffff\1\70\1\26",
            "\1\17\43\uffff\1\26",
            "\1\17\2\uffff\1\71\40\uffff\1\26",
            "\1\17\42\uffff\1\70\1\26"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "212:1: class_statement : ( variable_modifiers static_var_list SEMI_COLON -> ^( FIELD_DECL variable_modifiers static_var_list ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block ) | CONST_T directive SEMI_COLON -> ^( FIELD_DECL CONST_T directive ) );";
        }
    }
    static final String DFA33_eotS =
        "\32\uffff";
    static final String DFA33_eofS =
        "\32\uffff";
    static final String DFA33_minS =
        "\1\60\22\uffff\1\60\6\uffff";
    static final String DFA33_maxS =
        "\1\u00c4\22\uffff\1\u00c4\6\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\uffff\1\25\1\26\1\27\1\30\1\24\1"+
        "\23";
    static final String DFA33_specialS =
        "\32\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\15\1\uffff\1\20\1\uffff\1\15\2\uffff\1\1\3\uffff\1\15\1\uffff"+
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\2\uffff\1"+
            "\17\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\15\1\uffff\1\15\2\uffff"+
            "\1\2\52\uffff\2\15\3\uffff\6\15\1\uffff\5\15\3\uffff\6\15\40"+
            "\uffff\10\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\30\3\uffff\1\31\35\uffff\1\31\1\uffff\1\31\102\uffff"+
            "\5\31\41\uffff\7\31",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "327:1: topStatement : ( block | if_stat | WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement -> ^( WHILE_T ^( CONDITION expression ) while_statement ) | DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( DO_T ^( CONDITION expression ) statement ) | FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? ) | SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list ) | BREAK_T ( expression )? SEMI_COLON -> ^( BREAK_T ( expression )? ) | CONTINUE_T ( expression )? SEMI_COLON -> ^( CONTINUE_T ( expression )? ) | RETURN_T ( expression )? SEMI_COLON -> ^( RETURN_T ( expression )? ) | GLOBAL_T variable_list SEMI_COLON -> ^( GLOBAL_T variable_list ) | STATIC_T static_var_list SEMI_COLON -> ^( STATIC_T static_var_list ) | ECHO_T expr_list SEMI_COLON -> ^( ECHO_T expr_list ) | expression SEMI_COLON | FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement ) | DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement -> ^( DECLARE_T directive ( declare_statement )? ) | SEMI_COLON -> ^( EMPTYSTATEMENT SEMI_COLON ) | TRY_T block ( catch_branch )+ -> ^( TRY_T block ( catch_branch )+ ) | THROW_T expression SEMI_COLON -> ^( THROW_T expression ) | USE_T scalar SEMI_COLON -> ^( USE_T scalar ) | USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON -> ^( USE_PARETHESIS_T scalar ) | INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_T expression ) | INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_ONCE_T expression ) | REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_T expression ) | REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_ONCE_T expression ) );";
        }
    }
    static final String DFA43_eotS =
        "\100\uffff";
    static final String DFA43_eofS =
        "\1\1\77\uffff";
    static final String DFA43_minS =
        "\1\57\64\uffff\1\0\12\uffff";
    static final String DFA43_maxS =
        "\1\u00c4\64\uffff\1\0\12\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\2\75\uffff\1\1";
    static final String DFA43_specialS =
        "\65\uffff\1\0\12\uffff}>";
    static final String[] DFA43_transitionS = {
            "\3\1\1\uffff\3\1\2\uffff\5\1\1\uffff\13\1\2\uffff\11\1\1\uffff"+
            "\1\1\2\uffff\1\1\1\65\1\1\1\uffff\4\1\1\uffff\4\1\36\uffff\2"+
            "\1\3\uffff\6\1\1\uffff\5\1\3\uffff\6\1\21\uffff\3\1\14\uffff"+
            "\10\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()* loopback of 596:20: ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_53 = input.LA(1);

                         
                        int index43_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_CompilerAst()) ) {s = 63;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_53);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA44_eotS =
        "\100\uffff";
    static final String DFA44_eofS =
        "\1\2\77\uffff";
    static final String DFA44_minS =
        "\1\57\1\0\76\uffff";
    static final String DFA44_maxS =
        "\1\u00c4\1\0\76\uffff";
    static final String DFA44_acceptS =
        "\2\uffff\1\2\74\uffff\1\1";
    static final String DFA44_specialS =
        "\1\uffff\1\0\76\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\2\1\uffff\3\2\2\uffff\5\2\1\uffff\13\2\2\uffff\11\2\1\uffff"+
            "\1\2\2\uffff\2\2\1\1\1\uffff\4\2\1\uffff\4\2\36\uffff\2\2\3"+
            "\uffff\6\2\1\uffff\5\2\3\uffff\6\2\21\uffff\3\2\14\uffff\10"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "597:9: ( options {k=1; backtrack=true; } : ELSE_T s3= statement )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA44_1 = input.LA(1);

                         
                        int index44_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_CompilerAst()) ) {s = 63;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index44_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 44, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA106_eotS =
        "\21\uffff";
    static final String DFA106_eofS =
        "\21\uffff";
    static final String DFA106_minS =
        "\2\60\1\125\1\65\1\61\12\uffff\2\61";
    static final String DFA106_maxS =
        "\2\u00c4\1\125\1\65\1\u0097\12\uffff\2\u0097";
    static final String DFA106_acceptS =
        "\5\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff";
    static final String DFA106_specialS =
        "\21\uffff}>";
    static final String[] DFA106_transitionS = {
            "\1\2\1\7\3\uffff\1\4\35\uffff\1\6\1\uffff\1\3\62\uffff\1\14"+
            "\1\13\5\uffff\1\1\1\10\1\12\1\15\1\16\3\uffff\1\5\5\6\40\uffff"+
            "\1\11\7\6",
            "\1\2\4\uffff\1\4\35\uffff\1\6\1\uffff\1\3\101\uffff\1\5\5\6"+
            "\41\uffff\7\6",
            "\1\3",
            "\1\4",
            "\1\5\2\6\5\uffff\1\6\2\uffff\1\6\14\uffff\2\6\12\uffff\1\17"+
            "\2\6\3\uffff\1\6\11\uffff\43\6\4\uffff\3\6\7\uffff\1\6\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\5\2\6\1\uffff\1\20\3\uffff\1\6\2\uffff\1\6\14\uffff\2\6"+
            "\13\uffff\2\6\3\uffff\1\6\11\uffff\43\6\4\uffff\3\6\7\uffff"+
            "\1\6\1\5",
            "\1\5\2\6\5\uffff\1\6\2\uffff\1\6\14\uffff\2\6\12\uffff\1\17"+
            "\2\6\3\uffff\1\6\11\uffff\43\6\4\uffff\3\6\7\uffff\1\6\1\5"
    };

    static final short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static final short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static final char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static final char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static final short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static final short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static final short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }
        public String getDescription() {
            return "1542:1: atom_expr : ( ( AT_T )? variable | ( AT_T )? scalar | LEFT_PARETHESIS expression RIGHT_PARETHESIS | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) | 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS -> ^( ARRAY_DECL ( array_pair_list )? ) | NEW_T class_name_reference -> ^( NEW_T class_name_reference ) | CLONE_T variable -> ^( CLONE_T variable ) | UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS -> ^( UNSET_T variable_list ) | BACKTRICKLITERAL | PRINT_T expression -> ^( PRINT_T expression ) );";
        }
    }
    static final String DFA107_eotS =
        "\10\uffff";
    static final String DFA107_eofS =
        "\10\uffff";
    static final String DFA107_minS =
        "\1\60\1\125\1\65\1\61\1\uffff\1\61\1\uffff\1\61";
    static final String DFA107_maxS =
        "\1\u0097\1\125\1\65\1\u0097\1\uffff\1\u0097\1\uffff\1\u0097";
    static final String DFA107_acceptS =
        "\4\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String DFA107_specialS =
        "\10\uffff}>";
    static final String[] DFA107_transitionS = {
            "\1\1\4\uffff\1\3\37\uffff\1\2\101\uffff\1\4",
            "\1\2",
            "\1\3",
            "\1\4\2\6\5\uffff\1\6\2\uffff\1\6\14\uffff\2\6\12\uffff\1\5"+
            "\2\6\3\uffff\1\6\11\uffff\43\6\4\uffff\3\6\7\uffff\1\6\1\4",
            "",
            "\1\4\2\6\1\uffff\1\7\3\uffff\1\6\2\uffff\1\6\14\uffff\2\6\13"+
            "\uffff\2\6\3\uffff\1\6\11\uffff\43\6\4\uffff\3\6\7\uffff\1\6"+
            "\1\4",
            "",
            "\1\4\2\6\5\uffff\1\6\2\uffff\1\6\14\uffff\2\6\12\uffff\1\5"+
            "\2\6\3\uffff\1\6\11\uffff\43\6\4\uffff\3\6\7\uffff\1\6\1\4"
    };

    static final short[] DFA107_eot = DFA.unpackEncodedString(DFA107_eotS);
    static final short[] DFA107_eof = DFA.unpackEncodedString(DFA107_eofS);
    static final char[] DFA107_min = DFA.unpackEncodedStringToUnsignedChars(DFA107_minS);
    static final char[] DFA107_max = DFA.unpackEncodedStringToUnsignedChars(DFA107_maxS);
    static final short[] DFA107_accept = DFA.unpackEncodedString(DFA107_acceptS);
    static final short[] DFA107_special = DFA.unpackEncodedString(DFA107_specialS);
    static final short[][] DFA107_transition;

    static {
        int numStates = DFA107_transitionS.length;
        DFA107_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA107_transition[i] = DFA.unpackEncodedString(DFA107_transitionS[i]);
        }
    }

    class DFA107 extends DFA {

        public DFA107(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 107;
            this.eot = DFA107_eot;
            this.eof = DFA107_eof;
            this.min = DFA107_min;
            this.max = DFA107_max;
            this.accept = DFA107_accept;
            this.special = DFA107_special;
            this.transition = DFA107_transition;
        }
        public String getDescription() {
            return "1656:1: class_name_reference : ( dynamic_name_reference | fully_qualified_class_name );";
        }
    }
    static final String DFA121_eotS =
        "\10\uffff";
    static final String DFA121_eofS =
        "\10\uffff";
    static final String DFA121_minS =
        "\1\60\1\125\1\65\1\61\1\uffff\1\61\1\uffff\1\61";
    static final String DFA121_maxS =
        "\1\u0097\1\125\1\65\1\u0097\1\uffff\1\u0097\1\uffff\1\u0097";
    static final String DFA121_acceptS =
        "\4\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String DFA121_specialS =
        "\10\uffff}>";
    static final String[] DFA121_transitionS = {
            "\1\1\4\uffff\1\3\37\uffff\1\2\101\uffff\1\4",
            "\1\2",
            "\1\3",
            "\1\6\43\uffff\1\5\101\uffff\1\4",
            "",
            "\1\6\3\uffff\1\7\141\uffff\1\4",
            "",
            "\1\6\43\uffff\1\5\101\uffff\1\4"
    };

    static final short[] DFA121_eot = DFA.unpackEncodedString(DFA121_eotS);
    static final short[] DFA121_eof = DFA.unpackEncodedString(DFA121_eofS);
    static final char[] DFA121_min = DFA.unpackEncodedStringToUnsignedChars(DFA121_minS);
    static final char[] DFA121_max = DFA.unpackEncodedStringToUnsignedChars(DFA121_maxS);
    static final short[] DFA121_accept = DFA.unpackEncodedString(DFA121_acceptS);
    static final short[] DFA121_special = DFA.unpackEncodedString(DFA121_specialS);
    static final short[][] DFA121_transition;

    static {
        int numStates = DFA121_transitionS.length;
        DFA121_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA121_transition[i] = DFA.unpackEncodedString(DFA121_transitionS[i]);
        }
    }

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = DFA121_eot;
            this.eof = DFA121_eof;
            this.min = DFA121_min;
            this.max = DFA121_max;
            this.accept = DFA121_accept;
            this.special = DFA121_special;
            this.transition = DFA121_transition;
        }
        public String getDescription() {
            return "1846:1: base_variable_with_function_calls : ( ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? ) | fully_qualified_class_name ctor_arguments -> ^( CALL fully_qualified_class_name ctor_arguments ) );";
        }
    }
    static final String DFA125_eotS =
        "\4\uffff";
    static final String DFA125_eofS =
        "\4\uffff";
    static final String DFA125_minS =
        "\1\u0097\1\65\2\uffff";
    static final String DFA125_maxS =
        "\2\u0097\2\uffff";
    static final String DFA125_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA125_specialS =
        "\4\uffff}>";
    static final String[] DFA125_transitionS = {
            "\1\1",
            "\1\3\2\uffff\1\2\136\uffff\1\1",
            "",
            ""
    };

    static final short[] DFA125_eot = DFA.unpackEncodedString(DFA125_eotS);
    static final short[] DFA125_eof = DFA.unpackEncodedString(DFA125_eofS);
    static final char[] DFA125_min = DFA.unpackEncodedStringToUnsignedChars(DFA125_minS);
    static final char[] DFA125_max = DFA.unpackEncodedStringToUnsignedChars(DFA125_maxS);
    static final short[] DFA125_accept = DFA.unpackEncodedString(DFA125_acceptS);
    static final short[] DFA125_special = DFA.unpackEncodedString(DFA125_specialS);
    static final short[][] DFA125_transition;

    static {
        int numStates = DFA125_transitionS.length;
        DFA125_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA125_transition[i] = DFA.unpackEncodedString(DFA125_transitionS[i]);
        }
    }

    class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = DFA125_eot;
            this.eof = DFA125_eof;
            this.min = DFA125_min;
            this.max = DFA125_max;
            this.accept = DFA125_accept;
            this.special = DFA125_special;
            this.transition = DFA125_transition;
        }
        public String getDescription() {
            return "1957:1: compound_variable : ( dollars IDENTIFIER | dollars LEFT_BRACKET expression RIGHT_BRACKET );";
        }
    }
 

    public static final BitSet FOLLOW_SOC_T_in_php_source275 = new BitSet(new long[]{0xDD3B800000000000L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_SOC_PHP_T_in_php_source287 = new BitSet(new long[]{0xDD3B800000000000L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_top_statement_list_in_php_source302 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_EOC_T_in_php_source311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_top_statement_in_top_statement_list346 = new BitSet(new long[]{0xDD3B000000000002L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_statement_in_top_statement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_statement_in_top_statement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_declaration_statement_in_top_statement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_halt_compiler_statement_in_top_statement378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_T_in_top_statement384 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_top_statement386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_statement_in_inner_statement_list416 = new BitSet(new long[]{0xDD3B000000000002L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_statement_in_inner_statement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_statement_in_inner_statement439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_declaration_statement_in_inner_statement445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_halt_compiler_statement_in_inner_statement451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_halt_compiler_statement466 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_halt_compiler_statement468 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_halt_compiler_statement470 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_halt_compiler_statement472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_entr_type_in_class_declaration_statement507 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_CLASS_T_in_class_declaration_statement510 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement512 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement515 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_class_declaration_statement517 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_T_in_class_declaration_statement522 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement524 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_class_declaration_statement534 = new BitSet(new long[]{0x2A00000000000000L,0x0000000000000040L,0x001F800000000000L});
    public static final BitSet FOLLOW_class_statement_in_class_declaration_statement536 = new BitSet(new long[]{0x2A00000000000000L,0x0000000000000040L,0x001F800000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_class_declaration_statement539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_T_in_class_declaration_statement601 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement603 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement606 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement608 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_T_in_class_declaration_statement613 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement615 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_class_declaration_statement625 = new BitSet(new long[]{0x2A00000000000000L,0x0000000000000040L,0x001F800000000000L});
    public static final BitSet FOLLOW_class_statement_in_class_declaration_statement627 = new BitSet(new long[]{0x2A00000000000000L,0x0000000000000040L,0x001F800000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_class_declaration_statement630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_class_entr_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_modifiers_in_class_statement729 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_static_var_list_in_class_statement731 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_class_statement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_class_statement760 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_FUNCTION_T_in_class_statement763 = new BitSet(new long[]{0x1020000000000000L});
    public static final BitSet FOLLOW_REF_T_in_class_statement765 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_statement768 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_class_statement770 = new BitSet(new long[]{0x3025000000000000L,0x0000000000200000L,0x3FE0000000800300L});
    public static final BitSet FOLLOW_parameter_list_in_class_statement772 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_class_statement775 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_class_statement777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_class_statement812 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_FUNCTION_T_in_class_statement815 = new BitSet(new long[]{0x1020000000000000L});
    public static final BitSet FOLLOW_REF_T_in_class_statement817 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_statement820 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_class_statement822 = new BitSet(new long[]{0x3025000000000000L,0x0000000000200000L,0x3FE0000000800300L});
    public static final BitSet FOLLOW_parameter_list_in_class_statement824 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_class_statement827 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_block_in_class_statement829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_T_in_class_statement864 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_directive_in_class_statement866 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_class_statement868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_T_in_function_declaration_statement915 = new BitSet(new long[]{0x1020000000000000L});
    public static final BitSet FOLLOW_REF_T_in_function_declaration_statement917 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration_statement920 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_function_declaration_statement922 = new BitSet(new long[]{0x3025000000000000L,0x0000000000200000L,0x3FE0000000800300L});
    public static final BitSet FOLLOW_parameter_list_in_function_declaration_statement924 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_function_declaration_statement927 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_block_in_function_declaration_statement934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_block980 = new BitSet(new long[]{0xDF3B000000000000L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_inner_statement_list_in_block982 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_block985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatement_in_statement1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_topStatement1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stat_in_topStatement1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_T_in_topStatement1094 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1096 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1098 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1100 = new BitSet(new long[]{0xD12B000000000000L,0x00000000092FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_while_statement_in_topStatement1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_T_in_topStatement1135 = new BitSet(new long[]{0xD12B000000000000L,0x00000000012FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_statement_in_topStatement1137 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_WHILE_T_in_topStatement1139 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1141 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1143 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1145 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_T_in_topStatement1177 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1179 = new BitSet(new long[]{0x102B000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_list_in_topStatement1183 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1186 = new BitSet(new long[]{0x102B000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_list_in_topStatement1190 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1193 = new BitSet(new long[]{0x1027000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_list_in_topStatement1197 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1200 = new BitSet(new long[]{0xD12B000000000000L,0x00000000092FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_for_statement_in_topStatement1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_T_in_topStatement1246 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1248 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1250 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1252 = new BitSet(new long[]{0x0100000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_switch_case_list_in_topStatement1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_topStatement1283 = new BitSet(new long[]{0x102B000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1285 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_T_in_topStatement1312 = new BitSet(new long[]{0x102B000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1314 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_T_in_topStatement1353 = new BitSet(new long[]{0x102B000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1355 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLOBAL_T_in_topStatement1397 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_variable_list_in_topStatement1399 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_T_in_topStatement1439 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_static_var_list_in_topStatement1441 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ECHO_T_in_topStatement1478 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_list_in_topStatement1480 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_topStatement1505 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_topStatement1518 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1520 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_AS_T_in_topStatement1524 = new BitSet(new long[]{0x1021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_foreach_variable_in_topStatement1526 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_T_in_topStatement1529 = new BitSet(new long[]{0x1021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_foreach_variable_in_topStatement1531 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1535 = new BitSet(new long[]{0xD12B000000000000L,0x00000000092FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_foreach_statement_in_topStatement1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_T_in_topStatement1580 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1582 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_directive_in_topStatement1584 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1586 = new BitSet(new long[]{0xD12B000000000000L,0x00000000092FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_declare_statement_in_topStatement1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_T_in_topStatement1637 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_block_in_topStatement1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_catch_branch_in_topStatement1641 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_THROW_T_in_topStatement1668 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1670 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_T_in_topStatement1709 = new BitSet(new long[]{0x0021000000000000L,0x0000000000280000L,0xC00000001F008000L,0x000000000000001FL});
    public static final BitSet FOLLOW_scalar_in_topStatement1711 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_T_in_topStatement1750 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1752 = new BitSet(new long[]{0x0021000000000000L,0x0000000000280000L,0xC00000001F008000L,0x000000000000001FL});
    public static final BitSet FOLLOW_scalar_in_topStatement1754 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1756 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_T_in_topStatement1781 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1783 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1785 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1787 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_ONCE_T_in_topStatement1812 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1814 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1816 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1818 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRE_T_in_topStatement1843 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1845 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1847 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1849 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRE_ONCE_T_in_topStatement1874 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1876 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_topStatement1878 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1880 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_T_in_foreach_variable1922 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_variable_in_foreach_variable1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_use_filename1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_STRING_in_use_filename1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_use_filename1952 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_use_filename1955 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_use_filename1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_use_filename1964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_QUOTE_STRING_in_use_filename1967 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_use_filename1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1998 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_T_in_fully_qualified_class_name_list2001 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list2003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_NAMESPACE_T_in_fully_qualified_class_name2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name2041 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name2047 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name2050 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name2055 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_var_element_in_static_var_list2092 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_T_in_static_var_list2095 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_static_var_element_in_static_var_list2097 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_pure_variable_in_static_var_element2129 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_EQUAL_T_in_static_var_element2132 = new BitSet(new long[]{0x0021000000000000L,0x0000000000280000L,0xC00000001F008000L,0x000000000000001FL});
    public static final BitSet FOLLOW_scalar_in_static_var_element2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_if_stat2166 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_if_stat2168 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_if_stat2172 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_if_stat2174 = new BitSet(new long[]{0xD12B000000000000L,0x00000000092FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_statement_in_if_stat2190 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ELSEIF_T_in_if_stat2206 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_if_stat2208 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_if_stat2212 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_if_stat2214 = new BitSet(new long[]{0xD12B000000000000L,0x00000000012FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_statement_in_if_stat2218 = new BitSet(new long[]{0x0000000000000002L,0x0000000006000000L});
    public static final BitSet FOLLOW_ELSE_T_in_if_stat2244 = new BitSet(new long[]{0xD12B000000000000L,0x00000000012FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_statement_in_if_stat2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_if_stat2314 = new BitSet(new long[]{0xDD3B000000000000L,0x00000000172FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_inner_statement_list_in_if_stat2316 = new BitSet(new long[]{0x0000000000000000L,0x0000000016000000L});
    public static final BitSet FOLLOW_new_elseif_branch_in_if_stat2319 = new BitSet(new long[]{0x0000000000000000L,0x0000000016000000L});
    public static final BitSet FOLLOW_ELSE_T_in_if_stat2336 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_T_in_if_stat2338 = new BitSet(new long[]{0xD12B000000000000L,0x00000000012FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_statement_in_if_stat2342 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ENDIF_T_in_if_stat2346 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_if_stat2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_T_in_new_elseif_branch2419 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_new_elseif_branch2421 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_new_elseif_branch2423 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_new_elseif_branch2425 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_T_in_new_elseif_branch2427 = new BitSet(new long[]{0xDD3B000000000002L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_inner_statement_list_in_new_elseif_branch2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_switch_case_list2467 = new BitSet(new long[]{0x0008000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_switch_case_list2469 = new BitSet(new long[]{0x0008000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_case_list_in_switch_case_list2472 = new BitSet(new long[]{0x0208000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_switch_case_list2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_switch_case_list2497 = new BitSet(new long[]{0x0008000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_switch_case_list2499 = new BitSet(new long[]{0x0008000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_case_list_in_switch_case_list2502 = new BitSet(new long[]{0x0008000000000000L,0x00000000E0000000L});
    public static final BitSet FOLLOW_ENDSWITCH_T_in_switch_case_list2505 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_switch_case_list2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_T_in_case_list2540 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_case_list2542 = new BitSet(new long[]{0x0008000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_T_in_case_list2545 = new BitSet(new long[]{0xDD3B000000000002L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_SEMI_COLON_in_case_list2549 = new BitSet(new long[]{0xDD3B000000000002L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_inner_statement_list_in_case_list2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_T_in_case_list2584 = new BitSet(new long[]{0x0008000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_T_in_case_list2587 = new BitSet(new long[]{0xDD3B000000000002L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_SEMI_COLON_in_case_list2591 = new BitSet(new long[]{0xDD3B000000000002L,0x00000000012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_inner_statement_list_in_case_list2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_T_in_catch_branch2643 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_catch_branch2645 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_catch_branch2647 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_variable_in_catch_branch2649 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_catch_branch2651 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_block_in_catch_branch2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_for_statement2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_for_statement2720 = new BitSet(new long[]{0xDD3B000000000000L,0x00000002012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_inner_statement_list_in_for_statement2722 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ENDFOR_T_in_for_statement2725 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_for_statement2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_while_statement2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_while_statement2778 = new BitSet(new long[]{0xDD3B000000000000L,0x00000004012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_inner_statement_list_in_while_statement2780 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ENDWHILE_T_in_while_statement2783 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_while_statement2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_foreach_statement2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_foreach_statement2839 = new BitSet(new long[]{0xDD3B000000000000L,0x00000008012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_inner_statement_list_in_foreach_statement2841 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ENDFOREACH_T_in_foreach_statement2844 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_foreach_statement2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_declare_statement2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_declare_statement2907 = new BitSet(new long[]{0xDD3B000000000000L,0x00000010012FF9FFL,0xE001C0001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_inner_statement_list_in_declare_statement2909 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ENDDECLARE_T_in_declare_statement2912 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_declare_statement2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameter_list2960 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_T_in_parameter_list2963 = new BitSet(new long[]{0x3021000000000000L,0x0000000000200000L,0x3FE0000000800300L});
    public static final BitSet FOLLOW_parameter_in_parameter_list2967 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_parameter_type_in_parameter3017 = new BitSet(new long[]{0x3000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_CONST_T_in_parameter3020 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_pure_variable_in_parameter3023 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_EQUAL_T_in_parameter3039 = new BitSet(new long[]{0x0021000000000000L,0x0000000000280000L,0xC00000001F008000L,0x000000000000001FL});
    public static final BitSet FOLLOW_scalar_in_parameter3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_parameter_type3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_option_in_parameter_type3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_list3141 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_T_in_variable_list3144 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_variable_in_variable_list3148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_177_in_variable_modifiers3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_variable_modifiers3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier3199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x001D800000000000L});
    public static final BitSet FOLLOW_directive_element_in_directive3262 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_T_in_directive3265 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_directive_element_in_directive3269 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_directive_element3312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_EQUAL_T_in_directive_element3314 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_directive_element3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expr_list3361 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_T_in_expr_list3364 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_expr_list3368 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_logical_text_or_expr_in_expression3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3452 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_OR_T_in_logical_text_or_expr3455 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3460 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3491 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_XOR_T_in_logical_text_xor_expr3494 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3499 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_assignment_expr_in_logical_text_and_expr3530 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_AND_T_in_logical_text_and_expr3533 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_assignment_expr_in_logical_text_and_expr3538 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr3569 = new BitSet(new long[]{0x0000000000000002L,0x0007FF0000800000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr3572 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr3577 = new BitSet(new long[]{0x0000000000000002L,0x0007FF0000800000L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expr_in_conditional_expr3713 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_QUESTION_T_in_conditional_expr3732 = new BitSet(new long[]{0x1023000000000000L,0x0000000008280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_conditional_expr3734 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_T_in_conditional_expr3737 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_logical_or_expr_in_conditional_expr3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr3791 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_LOGICAL_OR_T_in_logical_or_expr3794 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr3799 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_bitwise_or_expr_in_logical_and_expr3830 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_LOGICAL_AND_T_in_logical_and_expr3833 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_bitwise_or_expr_in_logical_and_expr3838 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_bitwise_xor_expr_in_bitwise_or_expr3869 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_BIT_OR_T_in_bitwise_or_expr3872 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_bitwise_xor_expr_in_bitwise_or_expr3877 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_bitwise_and_expr_in_bitwise_xor_expr3908 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_POWER_T_in_bitwise_xor_expr3911 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_bitwise_and_expr_in_bitwise_xor_expr3916 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_concat_expr_in_bitwise_and_expr3947 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_DOT_T_in_bitwise_and_expr3950 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_concat_expr_in_bitwise_and_expr3955 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_equality_expr_in_concat_expr3986 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_REF_T_in_concat_expr3989 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_equality_expr_in_concat_expr3994 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr4025 = new BitSet(new long[]{0x0000000000000002L,0x1E00000000000000L});
    public static final BitSet FOLLOW_set_in_equality_expr4028 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr4047 = new BitSet(new long[]{0x0000000000000002L,0x1E00000000000000L});
    public static final BitSet FOLLOW_shift_expr_in_relational_expr4078 = new BitSet(new long[]{0x0000000000000002L,0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_relational_expr4081 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_shift_expr_in_relational_expr4100 = new BitSet(new long[]{0x0000000000000002L,0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_additive_expr_in_shift_expr4131 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_set_in_shift_expr4134 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_additive_expr_in_shift_expr4145 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr4176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_set_in_additive_expr4179 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr4190 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_cast_expr_in_multiplicative_expr4221 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_set_in_multiplicative_expr4224 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_cast_expr_in_multiplicative_expr4239 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000000000E0L});
    public static final BitSet FOLLOW_unary_expr_in_cast_expr4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_cast_expr4279 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x3FE0000000000300L});
    public static final BitSet FOLLOW_cast_option_in_cast_expr4281 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_cast_expr4283 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_unary_expr_in_cast_expr4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cast_option0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_symbol_list_in_unary_expr4407 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_prefix_inc_dec_expr_in_unary_expr4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefix_inc_dec_expr_in_unary_expr4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_symbol_in_unary_symbol_list4451 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000000000C18L});
    public static final BitSet FOLLOW_set_in_unary_symbol0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plus_minus_in_prefix_inc_dec_expr4519 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_expr_in_post_inc_dec_expr4568 = new BitSet(new long[]{0x1023000000000002L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_plus_minus_in_post_inc_dec_expr4585 = new BitSet(new long[]{0x1023000000000002L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_set_in_plus_minus0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_instance_expr4653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_INSTANCEOF_T_in_instance_expr4656 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_class_name_reference_in_instance_expr4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_T_in_atom_expr4691 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_variable_in_atom_expr4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_T_in_atom_expr4707 = new BitSet(new long[]{0x0021000000000000L,0x0000000000280000L,0xC00000001F008000L,0x000000000000001FL});
    public static final BitSet FOLLOW_scalar_in_atom_expr4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr4723 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_atom_expr4725 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_T_in_atom_expr4740 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr4742 = new BitSet(new long[]{0x0025000000000000L,0x0000000000600000L,0x0000000000818000L});
    public static final BitSet FOLLOW_assignment_list_in_atom_expr4744 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_atom_expr4773 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr4775 = new BitSet(new long[]{0x1027000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_array_pair_list_in_atom_expr4777 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_T_in_atom_expr4809 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_class_name_reference_in_atom_expr4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLONE_T_in_atom_expr4838 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_variable_in_atom_expr4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSET_T_in_atom_expr4876 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr4878 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000808000L});
    public static final BitSet FOLLOW_variable_list_in_atom_expr4880 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKTRICKLITERAL_in_atom_expr4906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_T_in_atom_expr4919 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_atom_expr4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_name_reference_in_class_name_reference4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_class_name_reference4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference4998 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SINGLE_ARROW_T_in_dynamic_name_reference5023 = new BitSet(new long[]{0x0121000000000000L,0x0000000000200000L,0x0000000000800000L});
    public static final BitSet FOLLOW_object_property_in_dynamic_name_reference5025 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ctor_arguments_in_dynamic_name_reference5027 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_assignment_element_in_assignment_list5078 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_T_in_assignment_list5082 = new BitSet(new long[]{0x0021000000000002L,0x0000000000600000L,0x0000000000818000L});
    public static final BitSet FOLLOW_assignment_element_in_assignment_list5084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_variable_in_assignment_element5108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_T_in_assignment_element5114 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_assignment_element5116 = new BitSet(new long[]{0x0025000000000000L,0x0000000000600000L,0x0000000000818000L});
    public static final BitSet FOLLOW_assignment_list_in_assignment_element5118 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_assignment_element5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_pair_element_in_array_pair_list5157 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_T_in_array_pair_list5160 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_array_pair_element_in_array_pair_list5164 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_COMMA_T_in_array_pair_list5168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_array_pair_element5213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_ARROW_T_in_array_pair_element5216 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_array_pair_element5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_variable_with_function_calls_in_variable5255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SINGLE_ARROW_T_in_variable5278 = new BitSet(new long[]{0x0121000000000000L,0x0000000000200000L,0x0000000000800000L});
    public static final BitSet FOLLOW_object_property_in_variable5280 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ctor_arguments_in_variable5282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5339 = new BitSet(new long[]{0x0021000000000000L,0x0000000000200000L,0x0000000000800000L});
    public static final BitSet FOLLOW_reference_variable_in_base_variable_with_function_calls5342 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5378 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_variable_in_object_property5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_variable_without_dollar_in_object_property5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_variable_in_reference_variable5473 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LEFT_OPEN_RECT_in_reference_variable5498 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001FCFBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_reference_variable5502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RIGHT_OPEN_RECT_in_reference_variable5505 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_reference_variable5535 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_reference_variable5539 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_reference_variable5541 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_dollars_in_compound_variable5592 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compound_variable5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dollars_in_compound_variable5606 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_compound_variable5608 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_compound_variable5611 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_compound_variable5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_T_in_dollars5634 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_compound_variable_without_dollar_in_reference_variable_without_dollar5662 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LEFT_OPEN_RECT_in_reference_variable_without_dollar5691 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001FCFBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_reference_variable_without_dollar5693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_RIGHT_OPEN_RECT_in_reference_variable_without_dollar5696 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_reference_variable_without_dollar5727 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_reference_variable_without_dollar5729 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_reference_variable_without_dollar5731 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compound_variable_without_dollar5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_compound_variable_without_dollar5791 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_compound_variable_without_dollar5794 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_compound_variable_without_dollar5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_ctor_arguments5827 = new BitSet(new long[]{0x1027000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expr_list_in_ctor_arguments5829 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_ctor_arguments5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_T_in_pure_variable5878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_DOLLAR_T_in_pure_variable5881 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pure_variable5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_scalar5936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_constant5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_constant5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_constant5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERRAL_in_constant6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_constant6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_common_scalar_in_constant6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_constant6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HERE_DOC_in_constant6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_common_scalar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_T_in_synpred1_CompilerAst2206 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_synpred1_CompilerAst2208 = new BitSet(new long[]{0x1023000000000000L,0x0000000000280000L,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_expression_in_synpred1_CompilerAst2212 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_synpred1_CompilerAst2214 = new BitSet(new long[]{0xD12B000000000000L,0x00000000012FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_statement_in_synpred1_CompilerAst2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_T_in_synpred2_CompilerAst2244 = new BitSet(new long[]{0xD12B000000000000L,0x00000000012FF9FFL,0xE00000001F8FBF18L,0x000000000000001FL});
    public static final BitSet FOLLOW_statement_in_synpred2_CompilerAst2248 = new BitSet(new long[]{0x0000000000000002L});

}