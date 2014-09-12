// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g 2009-08-09 20:30:33

  package org.eclipse.php.internal.core.compiler.ast.parser.php5;
  
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ModuleDeclaration", "ClassDeclaration", "PROG", "CLASS_BODY", "FIELD_DECL", "METHOD_DECL", "TYPE", "PARAMETER", "BLOCK", "VAR_DECL", "STATEMENT", "CONDITION", "LIST", "INDEX", "MEMBERACCESS", "CALL", "ELIST", "EXPR", "ASSIGN", "LIST_DECL", "SCALAR_ELEMENT", "SCALAR_VAR", "CAST", "LABEL", "ITERATE", "USE_DECL", "ARGU", "CALLED_OBJ", "PREFIX", "POSTFIX", "NAMESPACE", "EMPTYSTATEMENT", "SCALAR", "ARRAY_DECL", "PREFIX_EXPR", "POSTFIX_EXPR", "CAST_EXPR", "UNARY_EXPR", "VAR", "HASH_INDEX", "USE_PARETHESIS_T", "SOC_T", "SOC_PHP_T", "EOC_T", "LEFT_PARETHESIS", "RIGHT_PARETHESIS", "SEMI_COLON", "CLASS_T", "IDENTIFIER", "EXTENDS_T", "IMPLEMENTS_T", "LEFT_BRACKET", "RIGHT_BRACKET", "INTERFACE_T", "FUNCTION_T", "REF_T", "CONST_T", "WHILE_T", "DO_T", "FOR_T", "SWITCH_T", "BREAK_T", "CONTINUE_T", "RETURN_T", "GLOBAL_T", "STATIC_T", "ECHO_T", "FOREACH_T", "AS_T", "ARROW_T", "DECLARE_T", "TRY_T", "THROW_T", "USE_T", "INCLUDE_T", "INCLUDE_ONCE_T", "REQUIRE_T", "REQUIRE_ONCE_T", "STRINGLITERAL", "QUOTE_STRING", "DOMAIN_T", "COMMA_T", "EQUAL_T", "IF_T", "ELSEIF_T", "ELSE_T", "COLON_T", "ENDIF_T", "ENDSWITCH_T", "CASE_T", "DEFAULT_T", "CATCH_T", "ENDFOR_T", "ENDWHILE_T", "ENDFOREACH_T", "ENDDECLARE_T", "OR_T", "XOR_T", "AND_T", "PLUS_EQ", "MINUS_EQ", "MUL_EQ", "DIV_EQ", "DOT_EQ", "PERCENT_EQ", "BIT_AND_EQ", "BIT_OR_EQ", "POWER_EQ", "LMOVE_EQ", "RMOVE_EQ", "QUESTION_T", "LOGICAL_OR_T", "LOGICAL_AND_T", "BIT_OR_T", "POWER_T", "DOT_T", "EQUAL_EQUAL_T", "NOT_EQUAL_T", "EQUAL_EQUAL_EQUAL_T", "NOT_EQUAL_EQUAL_T", "LT_T", "MT_T", "LE_T", "ME_T", "LSHIFT_T", "RSHIFT_T", "PLUS_T", "MINUS_T", "MUL_T", "DIV_T", "PERCENT_T", "UNSET_T", "CLONE_T", "TILDA_T", "EXC_NOT_T", "PLUS_PLUS_T", "MINUS_MINUS_T", "INSTANCEOF_T", "AT_T", "LIST_T", "NEW_T", "BACKTRICKLITERAL", "PRINT_T", "SINGLE_ARROW_T", "LEFT_OPEN_RECT", "RIGHT_OPEN_RECT", "DOLLAR_T", "INTLITERAL", "FLOATLITERAL", "DOUBLELITERRAL", "REALLITERAL", "HERE_DOC", "HEREDOC", "END_HEREDOC", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "STATIC", "NonIntegerNumber", "FloatSuffix", "DoubleSuffix", "Exponent", "EscapeSequence", "IdentifierStart", "IdentifierPart", "WS", "COMMENT", "LINE_COMMENT", "'__halt_compiler'", "'abstract'", "'final'", "'var'", "'public'", "'protected'", "'private'", "'bool'", "'boolean'", "'int'", "'float'", "'double'", "'real'", "'string'", "'object'", "'array'", "'__CLASS__'", "'__DIR__'", "'__FILE__'", "'__FUNCTION__'", "'__METHOD__'", "'__LINE__'", "'__NAMESPACE__'"
    };
    public static final int RIGHT_OPEN_RECT=149;
    public static final int ENDFOR_T=96;
    public static final int LOGICAL_OR_T=115;
    public static final int CONDITION=15;
    public static final int DOMAIN_T=84;
    public static final int EOF=-1;
    public static final int EQUAL_EQUAL_T=120;
    public static final int STATEMENT=14;
    public static final int TYPE=10;
    public static final int EOC_T=47;
    public static final int CAST_EXPR=40;
    public static final int NOT_EQUAL_EQUAL_T=123;
    public static final int AT_T=142;
    public static final int NonIntegerNumber=163;
    public static final int FloatSuffix=164;
    public static final int RIGHT_BRACKET=56;
    public static final int AND_T=102;
    public static final int ARGU=30;
    public static final int FOR_T=63;
    public static final int MINUS_MINUS_T=140;
    public static final int RMOVE_EQ=113;
    public static final int STATIC=162;
    public static final int WHILE_T=61;
    public static final int ARRAY_DECL=37;
    public static final int MUL_EQ=105;
    public static final int SEMI_COLON=50;
    public static final int INTERFACE_T=57;
    public static final int OR_T=100;
    public static final int INTLITERAL=151;
    public static final int PLUS_EQ=103;
    public static final int ENDDECLARE_T=99;
    public static final int PLUS_T=130;
    public static final int MINUS_EQ=104;
    public static final int LongSuffix=159;
    public static final int REQUIRE_T=80;
    public static final int ENDFOREACH_T=98;
    public static final int WS=170;
    public static final int DO_T=62;
    public static final int EQUAL_T=86;
    public static final int COLON_T=90;
    public static final int USE_T=77;
    public static final int SOC_PHP_T=46;
    public static final int MINUS_T=131;
    public static final int CALL=19;
    public static final int SCALAR_ELEMENT=24;
    public static final int POWER_EQ=111;
    public static final int INCLUDE_ONCE_T=79;
    public static final int BIT_AND_EQ=109;
    public static final int LEFT_BRACKET=55;
    public static final int DOUBLELITERRAL=153;
    public static final int UNARY_EXPR=41;
    public static final int CATCH_T=95;
    public static final int USE_PARETHESIS_T=44;
    public static final int IMPLEMENTS_T=54;
    public static final int HexDigit=161;
    public static final int DEFAULT_T=94;
    public static final int REQUIRE_ONCE_T=81;
    public static final int CONST_T=60;
    public static final int FUNCTION_T=58;
    public static final int MUL_T=132;
    public static final int BIT_OR_EQ=110;
    public static final int BIT_OR_T=117;
    public static final int FOREACH_T=71;
    public static final int PREFIX_EXPR=38;
    public static final int FIELD_DECL=8;
    public static final int CLASS_BODY=7;
    public static final int LIST_T=143;
    public static final int LIST_DECL=23;
    public static final int QUOTE_STRING=83;
    public static final int BACKTRICKLITERAL=145;
    public static final int ITERATE=28;
    public static final int RETURN_T=67;
    public static final int LEFT_PARETHESIS=48;
    public static final int DoubleSuffix=165;
    public static final int HEREDOC=156;
    public static final int ENDWHILE_T=97;
    public static final int STRINGLITERAL=82;
    public static final int BLOCK=12;
    public static final int CONTINUE_T=66;
    public static final int EXTENDS_T=53;
    public static final int PRINT_T=146;
    public static final int FLOATLITERAL=152;
    public static final int ENDSWITCH_T=92;
    public static final int CAST=26;
    public static final int PREFIX=32;
    public static final int TRY_T=75;
    public static final int XOR_T=101;
    public static final int POSTFIX=33;
    public static final int HASH_INDEX=43;
    public static final int PERCENT_EQ=108;
    public static final int INCLUDE_T=78;
    public static final int AS_T=72;
    public static final int VAR_DECL=13;
    public static final int DIV_T=133;
    public static final int COMMA_T=85;
    public static final int STATIC_T=69;
    public static final int REALLITERAL=154;
    public static final int DOT_T=119;
    public static final int ENDIF_T=91;
    public static final int POSTFIX_EXPR=39;
    public static final int CALLED_OBJ=31;
    public static final int DIV_EQ=106;
    public static final int GLOBAL_T=68;
    public static final int ELIST=20;
    public static final int IF_T=87;
    public static final int PARAMETER=11;
    public static final int MT_T=125;
    public static final int SCALAR=36;
    public static final int ELSE_T=89;
    public static final int SINGLE_ARROW_T=147;
    public static final int VAR=42;
    public static final int RSHIFT_T=129;
    public static final int COMMENT=171;
    public static final int HexPrefix=160;
    public static final int ARROW_T=73;
    public static final int LINE_COMMENT=172;
    public static final int EQUAL_EQUAL_EQUAL_T=122;
    public static final int CLONE_T=136;
    public static final int IdentifierStart=168;
    public static final int DECLARE_T=74;
    public static final int THROW_T=76;
    public static final int REF_T=59;
    public static final int LIST=16;
    public static final int NAMESPACE=34;
    public static final int EMPTYSTATEMENT=35;
    public static final int UNSET_T=135;
    public static final int NEW_T=144;
    public static final int MEMBERACCESS=18;
    public static final int PLUS_PLUS_T=139;
    public static final int EscapeSequence=167;
    public static final int CLASS_T=51;
    public static final int IntegerNumber=158;
    public static final int ECHO_T=70;
    public static final int DOLLAR_T=150;
    public static final int Exponent=166;
    public static final int SOC_T=45;
    public static final int METHOD_DECL=9;
    public static final int LE_T=126;
    public static final int PERCENT_T=134;
    public static final int INDEX=17;
    public static final int PROG=6;
    public static final int EXPR=21;
    public static final int T__195=195;
    public static final int USE_DECL=29;
    public static final int T__194=194;
    public static final int NOT_EQUAL_T=121;
    public static final int T__193=193;
    public static final int HERE_DOC=155;
    public static final int T__192=192;
    public static final int POWER_T=118;
    public static final int T__191=191;
    public static final int IDENTIFIER=52;
    public static final int T__190=190;
    public static final int LEFT_OPEN_RECT=148;
    public static final int LMOVE_EQ=112;
    public static final int SCALAR_VAR=25;
    public static final int IdentifierPart=169;
    public static final int TILDA_T=137;
    public static final int T__184=184;
    public static final int SWITCH_T=64;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int LOGICAL_AND_T=116;
    public static final int T__189=189;
    public static final int QUESTION_T=114;
    public static final int LSHIFT_T=128;
    public static final int T__180=180;
    public static final int INSTANCEOF_T=141;
    public static final int ELSEIF_T=88;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int END_HEREDOC=157;
    public static final int LT_T=124;
    public static final int ModuleDeclaration=4;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int ME_T=127;
    public static final int LABEL=27;
    public static final int RIGHT_PARETHESIS=49;
    public static final int ASSIGN=22;
    public static final int EXC_NOT_T=138;
    public static final int BREAK_T=65;
    public static final int CASE_T=93;
    public static final int DOT_EQ=107;
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
    public String getGrammarFileName() { return "/home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g"; }


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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:112:1: php_source : ( SOC_T | SOC_PHP_T ) ( top_statement_list )? EOC_T -> ^( ModuleDeclaration ( top_statement_list )? ) ;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:122:3: ( ( SOC_T | SOC_PHP_T ) ( top_statement_list )? EOC_T -> ^( ModuleDeclaration ( top_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:122:5: ( SOC_T | SOC_PHP_T ) ( top_statement_list )? EOC_T
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:122:5: ( SOC_T | SOC_PHP_T )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:122:6: SOC_T
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:127:5: SOC_PHP_T
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

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:132:9: ( top_statement_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LEFT_PARETHESIS||(LA2_0>=SEMI_COLON && LA2_0<=IDENTIFIER)||LA2_0==LEFT_BRACKET||(LA2_0>=INTERFACE_T && LA2_0<=REF_T)||(LA2_0>=WHILE_T && LA2_0<=FOREACH_T)||(LA2_0>=DECLARE_T && LA2_0<=STRINGLITERAL)||LA2_0==IF_T||(LA2_0>=PLUS_T && LA2_0<=MINUS_T)||(LA2_0>=UNSET_T && LA2_0<=MINUS_MINUS_T)||(LA2_0>=AT_T && LA2_0<=PRINT_T)||(LA2_0>=DOLLAR_T && LA2_0<=HERE_DOC)||(LA2_0>=173 && LA2_0<=175)||(LA2_0>=188 && LA2_0<=195)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:132:9: top_statement_list
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
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:138:9: ^( ModuleDeclaration ( top_statement_list )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(ModuleDeclaration, "ModuleDeclaration"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:138:29: ( top_statement_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:142:1: top_statement_list : ( top_statement )+ ;
    public final CompilerAstParser.top_statement_list_return top_statement_list() throws RecognitionException {
        CompilerAstParser.top_statement_list_return retval = new CompilerAstParser.top_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.top_statement_return top_statement5 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:143:3: ( ( top_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:143:5: ( top_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:143:5: ( top_statement )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==LEFT_PARETHESIS||(LA3_0>=SEMI_COLON && LA3_0<=IDENTIFIER)||LA3_0==LEFT_BRACKET||(LA3_0>=INTERFACE_T && LA3_0<=REF_T)||(LA3_0>=WHILE_T && LA3_0<=FOREACH_T)||(LA3_0>=DECLARE_T && LA3_0<=STRINGLITERAL)||LA3_0==IF_T||(LA3_0>=PLUS_T && LA3_0<=MINUS_T)||(LA3_0>=UNSET_T && LA3_0<=MINUS_MINUS_T)||(LA3_0>=AT_T && LA3_0<=PRINT_T)||(LA3_0>=DOLLAR_T && LA3_0<=HERE_DOC)||(LA3_0>=173 && LA3_0<=175)||(LA3_0>=188 && LA3_0<=195)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:143:5: top_statement
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:146:1: top_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement );
    public final CompilerAstParser.top_statement_return top_statement() throws RecognitionException {
        CompilerAstParser.top_statement_return retval = new CompilerAstParser.top_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.statement_return statement6 = null;

        CompilerAstParser.function_declaration_statement_return function_declaration_statement7 = null;

        CompilerAstParser.class_declaration_statement_return class_declaration_statement8 = null;

        CompilerAstParser.halt_compiler_statement_return halt_compiler_statement9 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:147:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement )
            int alt4=4;
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
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
                {
                alt4=1;
                }
                break;
            case FUNCTION_T:
                {
                alt4=2;
                }
                break;
            case CLASS_T:
            case INTERFACE_T:
            case 174:
            case 175:
                {
                alt4=3;
                }
                break;
            case 173:
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:147:5: statement
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:148:5: function_declaration_statement
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:149:5: class_declaration_statement
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:150:5: halt_compiler_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_halt_compiler_statement_in_top_statement378);
                    halt_compiler_statement9=halt_compiler_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, halt_compiler_statement9.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:153:1: inner_statement_list : ( inner_statement )+ ;
    public final CompilerAstParser.inner_statement_list_return inner_statement_list() throws RecognitionException {
        CompilerAstParser.inner_statement_list_return retval = new CompilerAstParser.inner_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.inner_statement_return inner_statement10 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:154:3: ( ( inner_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:154:5: ( inner_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:154:5: ( inner_statement )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==LEFT_PARETHESIS||(LA5_0>=SEMI_COLON && LA5_0<=IDENTIFIER)||LA5_0==LEFT_BRACKET||(LA5_0>=INTERFACE_T && LA5_0<=REF_T)||(LA5_0>=WHILE_T && LA5_0<=FOREACH_T)||(LA5_0>=DECLARE_T && LA5_0<=STRINGLITERAL)||LA5_0==IF_T||(LA5_0>=PLUS_T && LA5_0<=MINUS_T)||(LA5_0>=UNSET_T && LA5_0<=MINUS_MINUS_T)||(LA5_0>=AT_T && LA5_0<=PRINT_T)||(LA5_0>=DOLLAR_T && LA5_0<=HERE_DOC)||(LA5_0>=173 && LA5_0<=175)||(LA5_0>=188 && LA5_0<=195)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:154:6: inner_statement
            	    {
            	    pushFollow(FOLLOW_inner_statement_in_inner_statement_list394);
            	    inner_statement10=inner_statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inner_statement10.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:157:1: inner_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement );
    public final CompilerAstParser.inner_statement_return inner_statement() throws RecognitionException {
        CompilerAstParser.inner_statement_return retval = new CompilerAstParser.inner_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.statement_return statement11 = null;

        CompilerAstParser.function_declaration_statement_return function_declaration_statement12 = null;

        CompilerAstParser.class_declaration_statement_return class_declaration_statement13 = null;

        CompilerAstParser.halt_compiler_statement_return halt_compiler_statement14 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:158:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement )
            int alt6=4;
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
            case 188:
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
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
            case 174:
            case 175:
                {
                alt6=3;
                }
                break;
            case 173:
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:158:5: statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_inner_statement411);
                    statement11=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, statement11.getTree());

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:159:5: function_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_function_declaration_statement_in_inner_statement417);
                    function_declaration_statement12=function_declaration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, function_declaration_statement12.getTree());

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:160:5: class_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_class_declaration_statement_in_inner_statement423);
                    class_declaration_statement13=class_declaration_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_declaration_statement13.getTree());

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:161:5: halt_compiler_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_halt_compiler_statement_in_inner_statement429);
                    halt_compiler_statement14=halt_compiler_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, halt_compiler_statement14.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:164:1: halt_compiler_statement : '__halt_compiler' LEFT_PARETHESIS RIGHT_PARETHESIS SEMI_COLON -> '__halt_compiler' ;
    public final CompilerAstParser.halt_compiler_statement_return halt_compiler_statement() throws RecognitionException {
        CompilerAstParser.halt_compiler_statement_return retval = new CompilerAstParser.halt_compiler_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token string_literal15=null;
        Token LEFT_PARETHESIS16=null;
        Token RIGHT_PARETHESIS17=null;
        Token SEMI_COLON18=null;

        SLAST string_literal15_tree=null;
        SLAST LEFT_PARETHESIS16_tree=null;
        SLAST RIGHT_PARETHESIS17_tree=null;
        SLAST SEMI_COLON18_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_173=new RewriteRuleTokenStream(adaptor,"token 173");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:165:3: ( '__halt_compiler' LEFT_PARETHESIS RIGHT_PARETHESIS SEMI_COLON -> '__halt_compiler' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:165:5: '__halt_compiler' LEFT_PARETHESIS RIGHT_PARETHESIS SEMI_COLON
            {
            string_literal15=(Token)match(input,173,FOLLOW_173_in_halt_compiler_statement444); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_173.add(string_literal15);

            LEFT_PARETHESIS16=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_halt_compiler_statement446); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS16);

            RIGHT_PARETHESIS17=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_halt_compiler_statement448); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS17);

            SEMI_COLON18=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_halt_compiler_statement450); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON18);



            // AST REWRITE
            // elements: 173
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 165:69: -> '__halt_compiler'
            {
                adaptor.addChild(root_0, stream_173.nextNode());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:168:1: class_declaration_statement : ( ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) | ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) );
    public final CompilerAstParser.class_declaration_statement_return class_declaration_statement() throws RecognitionException {
        CompilerAstParser.class_declaration_statement_return retval = new CompilerAstParser.class_declaration_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token CLASS_T20=null;
        Token IDENTIFIER21=null;
        Token EXTENDS_T22=null;
        Token IMPLEMENTS_T24=null;
        Token LEFT_BRACKET26=null;
        Token RIGHT_BRACKET28=null;
        Token INTERFACE_T29=null;
        Token IDENTIFIER30=null;
        Token EXTENDS_T31=null;
        Token IMPLEMENTS_T33=null;
        Token LEFT_BRACKET35=null;
        Token RIGHT_BRACKET37=null;
        CompilerAstParser.class_entr_type_return class_entr_type19 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name23 = null;

        CompilerAstParser.fully_qualified_class_name_list_return fully_qualified_class_name_list25 = null;

        CompilerAstParser.class_statement_return class_statement27 = null;

        CompilerAstParser.fully_qualified_class_name_list_return fully_qualified_class_name_list32 = null;

        CompilerAstParser.fully_qualified_class_name_list_return fully_qualified_class_name_list34 = null;

        CompilerAstParser.class_statement_return class_statement36 = null;


        SLAST CLASS_T20_tree=null;
        SLAST IDENTIFIER21_tree=null;
        SLAST EXTENDS_T22_tree=null;
        SLAST IMPLEMENTS_T24_tree=null;
        SLAST LEFT_BRACKET26_tree=null;
        SLAST RIGHT_BRACKET28_tree=null;
        SLAST INTERFACE_T29_tree=null;
        SLAST IDENTIFIER30_tree=null;
        SLAST EXTENDS_T31_tree=null;
        SLAST IMPLEMENTS_T33_tree=null;
        SLAST LEFT_BRACKET35_tree=null;
        SLAST RIGHT_BRACKET37_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:3: ( ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) | ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==CLASS_T||(LA14_0>=174 && LA14_0<=175)) ) {
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:5: ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:5: ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:7: ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:7: ( class_entr_type )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=174 && LA7_0<=175)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:7: class_entr_type
                            {
                            pushFollow(FOLLOW_class_entr_type_in_class_declaration_statement485);
                            class_entr_type19=class_entr_type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_class_entr_type.add(class_entr_type19.getTree());

                            }
                            break;

                    }

                    CLASS_T20=(Token)match(input,CLASS_T,FOLLOW_CLASS_T_in_class_declaration_statement488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLASS_T.add(CLASS_T20);

                    IDENTIFIER21=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER21);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:43: ( EXTENDS_T fully_qualified_class_name )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==EXTENDS_T) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:44: EXTENDS_T fully_qualified_class_name
                            {
                            EXTENDS_T22=(Token)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement493); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EXTENDS_T.add(EXTENDS_T22);

                            pushFollow(FOLLOW_fully_qualified_class_name_in_class_declaration_statement495);
                            fully_qualified_class_name23=fully_qualified_class_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name23.getTree());

                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:83: ( IMPLEMENTS_T fully_qualified_class_name_list )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==IMPLEMENTS_T) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:178:84: IMPLEMENTS_T fully_qualified_class_name_list
                            {
                            IMPLEMENTS_T24=(Token)match(input,IMPLEMENTS_T,FOLLOW_IMPLEMENTS_T_in_class_declaration_statement500); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IMPLEMENTS_T.add(IMPLEMENTS_T24);

                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement502);
                            fully_qualified_class_name_list25=fully_qualified_class_name_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list25.getTree());

                            }
                            break;

                    }

                    LEFT_BRACKET26=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_class_declaration_statement512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET26);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:179:20: ( class_statement )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==FUNCTION_T||LA10_0==CONST_T||LA10_0==STATIC_T||(LA10_0>=174 && LA10_0<=179)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:179:20: class_statement
                    	    {
                    	    pushFollow(FOLLOW_class_statement_in_class_declaration_statement514);
                    	    class_statement27=class_statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_class_statement.add(class_statement27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    RIGHT_BRACKET28=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_class_declaration_statement517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET28);

                    if ( state.backtracking==0 ) {

                            startIndex = ((CommonToken)CLASS_T20).getStartIndex();
                            if ((class_entr_type19!=null?input.toString(class_entr_type19.start,class_entr_type19.stop):null) != null) {
                                token = (CommonToken)(class_entr_type19!=null?((Token)class_entr_type19.start):null);
                                startIndex = token.getStartIndex();
                            } 
                            token = (CommonToken)RIGHT_BRACKET28;
                            endIndex = token.getStopIndex(); 
                          
                    }


                    // AST REWRITE
                    // elements: IMPLEMENTS_T, class_statement, fully_qualified_class_name_list, fully_qualified_class_name, EXTENDS_T, class_entr_type, CLASS_T, IDENTIFIER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 189:5: -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:189:9: ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_CLASS_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:189:19: ( class_entr_type )?
                        if ( stream_class_entr_type.hasNext() ) {
                            adaptor.addChild(root_1, stream_class_entr_type.nextTree());

                        }
                        stream_class_entr_type.reset();
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:189:47: ( ^( EXTENDS_T fully_qualified_class_name ) )?
                        if ( stream_fully_qualified_class_name.hasNext()||stream_EXTENDS_T.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:189:47: ^( EXTENDS_T fully_qualified_class_name )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_EXTENDS_T.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_fully_qualified_class_name.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_fully_qualified_class_name.reset();
                        stream_EXTENDS_T.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:189:88: ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )?
                        if ( stream_IMPLEMENTS_T.hasNext()||stream_fully_qualified_class_name_list.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:189:88: ^( IMPLEMENTS_T fully_qualified_class_name_list )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_IMPLEMENTS_T.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_fully_qualified_class_name_list.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_IMPLEMENTS_T.reset();
                        stream_fully_qualified_class_name_list.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:190:7: ( ^( CLASS_BODY ( class_statement )* ) )?
                        if ( stream_class_statement.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:190:7: ^( CLASS_BODY ( class_statement )* )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CLASS_BODY, "CLASS_BODY"), root_2);

                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:190:20: ( class_statement )*
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:192:6: ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:192:6: ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:192:7: INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET
                    {
                    INTERFACE_T29=(Token)match(input,INTERFACE_T,FOLLOW_INTERFACE_T_in_class_declaration_statement579); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTERFACE_T.add(INTERFACE_T29);

                    IDENTIFIER30=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER30);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:192:30: ( EXTENDS_T fully_qualified_class_name_list )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==EXTENDS_T) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:192:31: EXTENDS_T fully_qualified_class_name_list
                            {
                            EXTENDS_T31=(Token)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement584); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EXTENDS_T.add(EXTENDS_T31);

                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement586);
                            fully_qualified_class_name_list32=fully_qualified_class_name_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list32.getTree());

                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:192:75: ( IMPLEMENTS_T fully_qualified_class_name_list )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==IMPLEMENTS_T) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:192:76: IMPLEMENTS_T fully_qualified_class_name_list
                            {
                            IMPLEMENTS_T33=(Token)match(input,IMPLEMENTS_T,FOLLOW_IMPLEMENTS_T_in_class_declaration_statement591); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_IMPLEMENTS_T.add(IMPLEMENTS_T33);

                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement593);
                            fully_qualified_class_name_list34=fully_qualified_class_name_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list34.getTree());

                            }
                            break;

                    }

                    LEFT_BRACKET35=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_class_declaration_statement603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET35);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:193:20: ( class_statement )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==FUNCTION_T||LA13_0==CONST_T||LA13_0==STATIC_T||(LA13_0>=174 && LA13_0<=179)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:193:20: class_statement
                    	    {
                    	    pushFollow(FOLLOW_class_statement_in_class_declaration_statement605);
                    	    class_statement36=class_statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_class_statement.add(class_statement36.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    RIGHT_BRACKET37=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_class_declaration_statement608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET37);

                    if ( state.backtracking==0 ) {

                            startIndex = ((CommonToken)INTERFACE_T29).getStartIndex();
                            endIndex = ((CommonToken)RIGHT_BRACKET37).getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: IDENTIFIER, INTERFACE_T, fully_qualified_class_name_list, class_statement, EXTENDS_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 199:5: -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:199:9: ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_INTERFACE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:199:34: ( ^( EXTENDS_T fully_qualified_class_name_list ) )?
                        if ( stream_fully_qualified_class_name_list.hasNext()||stream_EXTENDS_T.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:199:34: ^( EXTENDS_T fully_qualified_class_name_list )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_EXTENDS_T.nextNode(), root_2);

                            adaptor.addChild(root_2, stream_fully_qualified_class_name_list.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_fully_qualified_class_name_list.reset();
                        stream_EXTENDS_T.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:200:7: ( ^( CLASS_BODY ( class_statement )* ) )?
                        if ( stream_class_statement.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:200:7: ^( CLASS_BODY ( class_statement )* )
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CLASS_BODY, "CLASS_BODY"), root_2);

                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:200:20: ( class_statement )*
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:204:1: class_entr_type : ( 'abstract' | 'final' );
    public final CompilerAstParser.class_entr_type_return class_entr_type() throws RecognitionException {
        CompilerAstParser.class_entr_type_return retval = new CompilerAstParser.class_entr_type_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set38=null;

        SLAST set38_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:205:3: ( 'abstract' | 'final' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set38=(Token)input.LT(1);
            if ( (input.LA(1)>=174 && input.LA(1)<=175) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set38));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:209:1: class_statement : ( variable_modifiers static_var_list SEMI_COLON -> ^( FIELD_DECL variable_modifiers static_var_list ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block ) | CONST_T directive SEMI_COLON -> ^( FIELD_DECL CONST_T directive ) );
    public final CompilerAstParser.class_statement_return class_statement() throws RecognitionException {
        CompilerAstParser.class_statement_return retval = new CompilerAstParser.class_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token SEMI_COLON41=null;
        Token FUNCTION_T43=null;
        Token REF_T44=null;
        Token IDENTIFIER45=null;
        Token LEFT_PARETHESIS46=null;
        Token RIGHT_PARETHESIS48=null;
        Token SEMI_COLON49=null;
        Token FUNCTION_T51=null;
        Token REF_T52=null;
        Token IDENTIFIER53=null;
        Token LEFT_PARETHESIS54=null;
        Token RIGHT_PARETHESIS56=null;
        Token CONST_T58=null;
        Token SEMI_COLON60=null;
        CompilerAstParser.variable_modifiers_return variable_modifiers39 = null;

        CompilerAstParser.static_var_list_return static_var_list40 = null;

        CompilerAstParser.modifier_return modifier42 = null;

        CompilerAstParser.parameter_list_return parameter_list47 = null;

        CompilerAstParser.modifier_return modifier50 = null;

        CompilerAstParser.parameter_list_return parameter_list55 = null;

        CompilerAstParser.block_return block57 = null;

        CompilerAstParser.directive_return directive59 = null;


        SLAST SEMI_COLON41_tree=null;
        SLAST FUNCTION_T43_tree=null;
        SLAST REF_T44_tree=null;
        SLAST IDENTIFIER45_tree=null;
        SLAST LEFT_PARETHESIS46_tree=null;
        SLAST RIGHT_PARETHESIS48_tree=null;
        SLAST SEMI_COLON49_tree=null;
        SLAST FUNCTION_T51_tree=null;
        SLAST REF_T52_tree=null;
        SLAST IDENTIFIER53_tree=null;
        SLAST LEFT_PARETHESIS54_tree=null;
        SLAST RIGHT_PARETHESIS56_tree=null;
        SLAST CONST_T58_tree=null;
        SLAST SEMI_COLON60_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:220:3: ( variable_modifiers static_var_list SEMI_COLON -> ^( FIELD_DECL variable_modifiers static_var_list ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block ) | CONST_T directive SEMI_COLON -> ^( FIELD_DECL CONST_T directive ) )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:220:5: variable_modifiers static_var_list SEMI_COLON
                    {
                    pushFollow(FOLLOW_variable_modifiers_in_class_statement707);
                    variable_modifiers39=variable_modifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable_modifiers.add(variable_modifiers39.getTree());
                    pushFollow(FOLLOW_static_var_list_in_class_statement709);
                    static_var_list40=static_var_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_static_var_list.add(static_var_list40.getTree());
                    SEMI_COLON41=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_class_statement711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON41);

                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(variable_modifiers39!=null?((Token)variable_modifiers39.start):null);
                      	   startIndex = token.getStartIndex();
                      	   token = (CommonToken)SEMI_COLON41;
                           endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: variable_modifiers, static_var_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 227:7: -> ^( FIELD_DECL variable_modifiers static_var_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:227:11: ^( FIELD_DECL variable_modifiers static_var_list )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:228:5: ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:228:5: ( modifier )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==STATIC_T||(LA15_0>=174 && LA15_0<=175)||(LA15_0>=177 && LA15_0<=179)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:228:5: modifier
                            {
                            pushFollow(FOLLOW_modifier_in_class_statement738);
                            modifier42=modifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_modifier.add(modifier42.getTree());

                            }
                            break;

                    }

                    FUNCTION_T43=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_class_statement741); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T43);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:228:26: ( REF_T )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==REF_T) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:228:26: REF_T
                            {
                            REF_T44=(Token)match(input,REF_T,FOLLOW_REF_T_in_class_statement743); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_REF_T.add(REF_T44);


                            }
                            break;

                    }

                    IDENTIFIER45=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_statement746); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER45);

                    LEFT_PARETHESIS46=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_class_statement748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS46);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:228:60: ( parameter_list )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==IDENTIFIER||(LA17_0>=REF_T && LA17_0<=CONST_T)||(LA17_0>=UNSET_T && LA17_0<=CLONE_T)||LA17_0==DOLLAR_T||(LA17_0>=180 && LA17_0<=188)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:228:60: parameter_list
                            {
                            pushFollow(FOLLOW_parameter_list_in_class_statement750);
                            parameter_list47=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list47.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS48=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_class_statement753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS48);

                    SEMI_COLON49=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_class_statement755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON49);

                    if ( state.backtracking==0 ) {

                           if ((modifier42!=null?input.toString(modifier42.start,modifier42.stop):null) != null) {
                             token = (CommonToken)(modifier42!=null?((Token)modifier42.start):null);
                           }
                           else {
                             token = (CommonToken)FUNCTION_T43;
                           }
                           startIndex = token.getStartIndex();
                           token = (CommonToken)SEMI_COLON49;
                           endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: REF_T, parameter_list, IDENTIFIER, modifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 240:6: -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:240:10: ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:240:24: ( modifier )?
                        if ( stream_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_modifier.nextTree());

                        }
                        stream_modifier.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:240:34: ( REF_T )?
                        if ( stream_REF_T.hasNext() ) {
                            adaptor.addChild(root_1, stream_REF_T.nextNode());

                        }
                        stream_REF_T.reset();
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:240:52: ( parameter_list )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:241:5: ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:241:5: ( modifier )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==STATIC_T||(LA18_0>=174 && LA18_0<=175)||(LA18_0>=177 && LA18_0<=179)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:241:5: modifier
                            {
                            pushFollow(FOLLOW_modifier_in_class_statement790);
                            modifier50=modifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_modifier.add(modifier50.getTree());

                            }
                            break;

                    }

                    FUNCTION_T51=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_class_statement793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T51);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:241:26: ( REF_T )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==REF_T) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:241:26: REF_T
                            {
                            REF_T52=(Token)match(input,REF_T,FOLLOW_REF_T_in_class_statement795); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_REF_T.add(REF_T52);


                            }
                            break;

                    }

                    IDENTIFIER53=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_statement798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER53);

                    LEFT_PARETHESIS54=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_class_statement800); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS54);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:241:60: ( parameter_list )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==IDENTIFIER||(LA20_0>=REF_T && LA20_0<=CONST_T)||(LA20_0>=UNSET_T && LA20_0<=CLONE_T)||LA20_0==DOLLAR_T||(LA20_0>=180 && LA20_0<=188)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:241:60: parameter_list
                            {
                            pushFollow(FOLLOW_parameter_list_in_class_statement802);
                            parameter_list55=parameter_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list55.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS56=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_class_statement805); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS56);

                    pushFollow(FOLLOW_block_in_class_statement807);
                    block57=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block57.getTree());
                    if ( state.backtracking==0 ) {

                           if ((modifier50!=null?input.toString(modifier50.start,modifier50.stop):null) != null) {
                             token = (CommonToken)(modifier50!=null?((Token)modifier50.start):null);
                           }
                           else {
                             token = (CommonToken)FUNCTION_T51;
                           }
                           startIndex = token.getStartIndex();
                           token = (CommonToken)(block57!=null?((Token)block57.stop):null);
                           endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: REF_T, IDENTIFIER, modifier, block, parameter_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 253:6: -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:253:10: ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:253:24: ( modifier )?
                        if ( stream_modifier.hasNext() ) {
                            adaptor.addChild(root_1, stream_modifier.nextTree());

                        }
                        stream_modifier.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:253:34: ( REF_T )?
                        if ( stream_REF_T.hasNext() ) {
                            adaptor.addChild(root_1, stream_REF_T.nextNode());

                        }
                        stream_REF_T.reset();
                        adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:253:52: ( parameter_list )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:254:5: CONST_T directive SEMI_COLON
                    {
                    CONST_T58=(Token)match(input,CONST_T,FOLLOW_CONST_T_in_class_statement842); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST_T.add(CONST_T58);

                    pushFollow(FOLLOW_directive_in_class_statement844);
                    directive59=directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_directive.add(directive59.getTree());
                    SEMI_COLON60=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_class_statement846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON60);

                    if ( state.backtracking==0 ) {

                           token = (CommonToken)CONST_T58;
                           startIndex = token.getStartIndex();
                           token = (CommonToken)SEMI_COLON60;
                           endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: directive, CONST_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 261:6: -> ^( FIELD_DECL CONST_T directive )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:261:10: ^( FIELD_DECL CONST_T directive )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:264:1: function_declaration_statement : FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) ;
    public final CompilerAstParser.function_declaration_statement_return function_declaration_statement() throws RecognitionException {
        CompilerAstParser.function_declaration_statement_return retval = new CompilerAstParser.function_declaration_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token FUNCTION_T61=null;
        Token REF_T62=null;
        Token IDENTIFIER63=null;
        Token LEFT_PARETHESIS64=null;
        Token RIGHT_PARETHESIS66=null;
        CompilerAstParser.parameter_list_return parameter_list65 = null;

        CompilerAstParser.block_return block67 = null;


        SLAST FUNCTION_T61_tree=null;
        SLAST REF_T62_tree=null;
        SLAST IDENTIFIER63_tree=null;
        SLAST LEFT_PARETHESIS64_tree=null;
        SLAST RIGHT_PARETHESIS66_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:274:3: ( FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:274:5: FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block
            {
            FUNCTION_T61=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_function_declaration_statement893); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T61);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:274:16: ( REF_T )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==REF_T) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:274:16: REF_T
                    {
                    REF_T62=(Token)match(input,REF_T,FOLLOW_REF_T_in_function_declaration_statement895); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REF_T.add(REF_T62);


                    }
                    break;

            }

            IDENTIFIER63=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration_statement898); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER63);

            LEFT_PARETHESIS64=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_function_declaration_statement900); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS64);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:274:50: ( parameter_list )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==IDENTIFIER||(LA23_0>=REF_T && LA23_0<=CONST_T)||(LA23_0>=UNSET_T && LA23_0<=CLONE_T)||LA23_0==DOLLAR_T||(LA23_0>=180 && LA23_0<=188)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:274:50: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function_declaration_statement902);
                    parameter_list65=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list65.getTree());

                    }
                    break;

            }

            RIGHT_PARETHESIS66=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_function_declaration_statement905); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS66);

            pushFollow(FOLLOW_block_in_function_declaration_statement912);
            block67=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block67.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)FUNCTION_T61;
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(block67!=null?((Token)block67.stop):null);
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: parameter_list, block, REF_T, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 282:3: -> ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:282:6: ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:282:20: ( REF_T )?
                if ( stream_REF_T.hasNext() ) {
                    adaptor.addChild(root_1, stream_REF_T.nextNode());

                }
                stream_REF_T.reset();
                adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:282:38: ( parameter_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:285:1: block : LEFT_BRACKET ( inner_statement_list )? RIGHT_BRACKET -> ^( BLOCK ( inner_statement_list )? ) ;
    public final CompilerAstParser.block_return block() throws RecognitionException {
        CompilerAstParser.block_return retval = new CompilerAstParser.block_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_BRACKET68=null;
        Token RIGHT_BRACKET70=null;
        CompilerAstParser.inner_statement_list_return inner_statement_list69 = null;


        SLAST LEFT_BRACKET68_tree=null;
        SLAST RIGHT_BRACKET70_tree=null;
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:295:3: ( LEFT_BRACKET ( inner_statement_list )? RIGHT_BRACKET -> ^( BLOCK ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:295:5: LEFT_BRACKET ( inner_statement_list )? RIGHT_BRACKET
            {
            LEFT_BRACKET68=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_block958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET68);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:295:18: ( inner_statement_list )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==LEFT_PARETHESIS||(LA24_0>=SEMI_COLON && LA24_0<=IDENTIFIER)||LA24_0==LEFT_BRACKET||(LA24_0>=INTERFACE_T && LA24_0<=REF_T)||(LA24_0>=WHILE_T && LA24_0<=FOREACH_T)||(LA24_0>=DECLARE_T && LA24_0<=STRINGLITERAL)||LA24_0==IF_T||(LA24_0>=PLUS_T && LA24_0<=MINUS_T)||(LA24_0>=UNSET_T && LA24_0<=MINUS_MINUS_T)||(LA24_0>=AT_T && LA24_0<=PRINT_T)||(LA24_0>=DOLLAR_T && LA24_0<=HERE_DOC)||(LA24_0>=173 && LA24_0<=175)||(LA24_0>=188 && LA24_0<=195)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:295:18: inner_statement_list
                    {
                    pushFollow(FOLLOW_inner_statement_list_in_block960);
                    inner_statement_list69=inner_statement_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list69.getTree());

                    }
                    break;

            }

            RIGHT_BRACKET70=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_block963); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET70);

            if ( state.backtracking==0 ) {

                  token = (CommonToken)LEFT_BRACKET68;
                  startIndex = token.getStartIndex();
                  token = (CommonToken)RIGHT_BRACKET70;
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
            // 303:6: -> ^( BLOCK ( inner_statement_list )? )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:303:10: ^( BLOCK ( inner_statement_list )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:303:18: ( inner_statement_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:306:1: statement : topStatement -> ^( STATEMENT topStatement ) ;
    public final CompilerAstParser.statement_return statement() throws RecognitionException {
        CompilerAstParser.statement_return retval = new CompilerAstParser.statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.topStatement_return topStatement71 = null;


        RewriteRuleSubtreeStream stream_topStatement=new RewriteRuleSubtreeStream(adaptor,"rule topStatement");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:316:3: ( topStatement -> ^( STATEMENT topStatement ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:316:5: topStatement
            {
            pushFollow(FOLLOW_topStatement_in_statement1010);
            topStatement71=topStatement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_topStatement.add(topStatement71.getTree());
            if ( state.backtracking==0 ) {

                    startIndex = (topStatement71!=null?((SLAST)topStatement71.tree):null).startIndex;
                    endIndex = (topStatement71!=null?((SLAST)topStatement71.tree):null).endIndex;
                
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
            // 321:5: -> ^( STATEMENT topStatement )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:321:8: ^( STATEMENT topStatement )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:324:1: topStatement : ( block | if_stat | WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement -> ^( WHILE_T ^( CONDITION expression ) while_statement ) | DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( DO_T ^( CONDITION expression ) statement ) | FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? ) | SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list ) | BREAK_T ( expression )? SEMI_COLON -> ^( BREAK_T ( expression )? ) | CONTINUE_T ( expression )? SEMI_COLON -> ^( CONTINUE_T ( expression )? ) | RETURN_T ( expression )? SEMI_COLON -> ^( RETURN_T ( expression )? ) | GLOBAL_T variable_list SEMI_COLON -> ^( GLOBAL_T variable_list ) | STATIC_T static_var_list SEMI_COLON -> ^( STATIC_T static_var_list ) | ECHO_T expr_list SEMI_COLON -> ^( ECHO_T expr_list ) | expression SEMI_COLON | FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement ) | DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement -> ^( DECLARE_T directive ( declare_statement )? ) | SEMI_COLON -> ^( EMPTYSTATEMENT SEMI_COLON ) | TRY_T block ( catch_branch )+ -> ^( TRY_T block ( catch_branch )+ ) | THROW_T expression SEMI_COLON -> ^( THROW_T expression ) | USE_T scalar SEMI_COLON -> ^( USE_T scalar ) | USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON -> ^( USE_PARETHESIS_T scalar ) | INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_T expression ) | INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_ONCE_T expression ) | REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_T expression ) | REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_ONCE_T expression ) );
    public final CompilerAstParser.topStatement_return topStatement() throws RecognitionException {
        CompilerAstParser.topStatement_return retval = new CompilerAstParser.topStatement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token WHILE_T74=null;
        Token LEFT_PARETHESIS75=null;
        Token RIGHT_PARETHESIS77=null;
        Token DO_T79=null;
        Token WHILE_T81=null;
        Token LEFT_PARETHESIS82=null;
        Token RIGHT_PARETHESIS84=null;
        Token SEMI_COLON85=null;
        Token FOR_T86=null;
        Token LEFT_PARETHESIS87=null;
        Token SEMI_COLON88=null;
        Token SEMI_COLON89=null;
        Token RIGHT_PARETHESIS90=null;
        Token SWITCH_T92=null;
        Token LEFT_PARETHESIS93=null;
        Token RIGHT_PARETHESIS95=null;
        Token BREAK_T97=null;
        Token SEMI_COLON99=null;
        Token CONTINUE_T100=null;
        Token SEMI_COLON102=null;
        Token RETURN_T103=null;
        Token SEMI_COLON105=null;
        Token GLOBAL_T106=null;
        Token SEMI_COLON108=null;
        Token STATIC_T109=null;
        Token SEMI_COLON111=null;
        Token ECHO_T112=null;
        Token SEMI_COLON114=null;
        Token SEMI_COLON116=null;
        Token FOREACH_T117=null;
        Token LEFT_PARETHESIS118=null;
        Token AS_T120=null;
        Token ARROW_T122=null;
        Token RIGHT_PARETHESIS124=null;
        Token DECLARE_T126=null;
        Token LEFT_PARETHESIS127=null;
        Token RIGHT_PARETHESIS129=null;
        Token SEMI_COLON131=null;
        Token TRY_T132=null;
        Token THROW_T135=null;
        Token SEMI_COLON137=null;
        Token USE_T138=null;
        Token SEMI_COLON140=null;
        Token USE_T141=null;
        Token LEFT_PARETHESIS142=null;
        Token RIGHT_PARETHESIS144=null;
        Token SEMI_COLON145=null;
        Token INCLUDE_T146=null;
        Token LEFT_PARETHESIS147=null;
        Token RIGHT_PARETHESIS149=null;
        Token SEMI_COLON150=null;
        Token INCLUDE_ONCE_T151=null;
        Token LEFT_PARETHESIS152=null;
        Token RIGHT_PARETHESIS154=null;
        Token SEMI_COLON155=null;
        Token REQUIRE_T156=null;
        Token LEFT_PARETHESIS157=null;
        Token RIGHT_PARETHESIS159=null;
        Token SEMI_COLON160=null;
        Token REQUIRE_ONCE_T161=null;
        Token LEFT_PARETHESIS162=null;
        Token RIGHT_PARETHESIS164=null;
        Token SEMI_COLON165=null;
        CompilerAstParser.expr_list_return e1 = null;

        CompilerAstParser.expr_list_return e2 = null;

        CompilerAstParser.expr_list_return e3 = null;

        CompilerAstParser.block_return block72 = null;

        CompilerAstParser.if_stat_return if_stat73 = null;

        CompilerAstParser.expression_return expression76 = null;

        CompilerAstParser.while_statement_return while_statement78 = null;

        CompilerAstParser.statement_return statement80 = null;

        CompilerAstParser.expression_return expression83 = null;

        CompilerAstParser.for_statement_return for_statement91 = null;

        CompilerAstParser.expression_return expression94 = null;

        CompilerAstParser.switch_case_list_return switch_case_list96 = null;

        CompilerAstParser.expression_return expression98 = null;

        CompilerAstParser.expression_return expression101 = null;

        CompilerAstParser.expression_return expression104 = null;

        CompilerAstParser.variable_list_return variable_list107 = null;

        CompilerAstParser.static_var_list_return static_var_list110 = null;

        CompilerAstParser.expr_list_return expr_list113 = null;

        CompilerAstParser.expression_return expression115 = null;

        CompilerAstParser.expression_return expression119 = null;

        CompilerAstParser.foreach_variable_return foreach_variable121 = null;

        CompilerAstParser.foreach_variable_return foreach_variable123 = null;

        CompilerAstParser.foreach_statement_return foreach_statement125 = null;

        CompilerAstParser.directive_return directive128 = null;

        CompilerAstParser.declare_statement_return declare_statement130 = null;

        CompilerAstParser.block_return block133 = null;

        CompilerAstParser.catch_branch_return catch_branch134 = null;

        CompilerAstParser.expression_return expression136 = null;

        CompilerAstParser.scalar_return scalar139 = null;

        CompilerAstParser.scalar_return scalar143 = null;

        CompilerAstParser.expression_return expression148 = null;

        CompilerAstParser.expression_return expression153 = null;

        CompilerAstParser.expression_return expression158 = null;

        CompilerAstParser.expression_return expression163 = null;


        SLAST WHILE_T74_tree=null;
        SLAST LEFT_PARETHESIS75_tree=null;
        SLAST RIGHT_PARETHESIS77_tree=null;
        SLAST DO_T79_tree=null;
        SLAST WHILE_T81_tree=null;
        SLAST LEFT_PARETHESIS82_tree=null;
        SLAST RIGHT_PARETHESIS84_tree=null;
        SLAST SEMI_COLON85_tree=null;
        SLAST FOR_T86_tree=null;
        SLAST LEFT_PARETHESIS87_tree=null;
        SLAST SEMI_COLON88_tree=null;
        SLAST SEMI_COLON89_tree=null;
        SLAST RIGHT_PARETHESIS90_tree=null;
        SLAST SWITCH_T92_tree=null;
        SLAST LEFT_PARETHESIS93_tree=null;
        SLAST RIGHT_PARETHESIS95_tree=null;
        SLAST BREAK_T97_tree=null;
        SLAST SEMI_COLON99_tree=null;
        SLAST CONTINUE_T100_tree=null;
        SLAST SEMI_COLON102_tree=null;
        SLAST RETURN_T103_tree=null;
        SLAST SEMI_COLON105_tree=null;
        SLAST GLOBAL_T106_tree=null;
        SLAST SEMI_COLON108_tree=null;
        SLAST STATIC_T109_tree=null;
        SLAST SEMI_COLON111_tree=null;
        SLAST ECHO_T112_tree=null;
        SLAST SEMI_COLON114_tree=null;
        SLAST SEMI_COLON116_tree=null;
        SLAST FOREACH_T117_tree=null;
        SLAST LEFT_PARETHESIS118_tree=null;
        SLAST AS_T120_tree=null;
        SLAST ARROW_T122_tree=null;
        SLAST RIGHT_PARETHESIS124_tree=null;
        SLAST DECLARE_T126_tree=null;
        SLAST LEFT_PARETHESIS127_tree=null;
        SLAST RIGHT_PARETHESIS129_tree=null;
        SLAST SEMI_COLON131_tree=null;
        SLAST TRY_T132_tree=null;
        SLAST THROW_T135_tree=null;
        SLAST SEMI_COLON137_tree=null;
        SLAST USE_T138_tree=null;
        SLAST SEMI_COLON140_tree=null;
        SLAST USE_T141_tree=null;
        SLAST LEFT_PARETHESIS142_tree=null;
        SLAST RIGHT_PARETHESIS144_tree=null;
        SLAST SEMI_COLON145_tree=null;
        SLAST INCLUDE_T146_tree=null;
        SLAST LEFT_PARETHESIS147_tree=null;
        SLAST RIGHT_PARETHESIS149_tree=null;
        SLAST SEMI_COLON150_tree=null;
        SLAST INCLUDE_ONCE_T151_tree=null;
        SLAST LEFT_PARETHESIS152_tree=null;
        SLAST RIGHT_PARETHESIS154_tree=null;
        SLAST SEMI_COLON155_tree=null;
        SLAST REQUIRE_T156_tree=null;
        SLAST LEFT_PARETHESIS157_tree=null;
        SLAST RIGHT_PARETHESIS159_tree=null;
        SLAST SEMI_COLON160_tree=null;
        SLAST REQUIRE_ONCE_T161_tree=null;
        SLAST LEFT_PARETHESIS162_tree=null;
        SLAST RIGHT_PARETHESIS164_tree=null;
        SLAST SEMI_COLON165_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:337:3: ( block | if_stat | WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement -> ^( WHILE_T ^( CONDITION expression ) while_statement ) | DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( DO_T ^( CONDITION expression ) statement ) | FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? ) | SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list ) | BREAK_T ( expression )? SEMI_COLON -> ^( BREAK_T ( expression )? ) | CONTINUE_T ( expression )? SEMI_COLON -> ^( CONTINUE_T ( expression )? ) | RETURN_T ( expression )? SEMI_COLON -> ^( RETURN_T ( expression )? ) | GLOBAL_T variable_list SEMI_COLON -> ^( GLOBAL_T variable_list ) | STATIC_T static_var_list SEMI_COLON -> ^( STATIC_T static_var_list ) | ECHO_T expr_list SEMI_COLON -> ^( ECHO_T expr_list ) | expression SEMI_COLON | FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement ) | DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement -> ^( DECLARE_T directive ( declare_statement )? ) | SEMI_COLON -> ^( EMPTYSTATEMENT SEMI_COLON ) | TRY_T block ( catch_branch )+ -> ^( TRY_T block ( catch_branch )+ ) | THROW_T expression SEMI_COLON -> ^( THROW_T expression ) | USE_T scalar SEMI_COLON -> ^( USE_T scalar ) | USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON -> ^( USE_PARETHESIS_T scalar ) | INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_T expression ) | INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_ONCE_T expression ) | REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_T expression ) | REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_ONCE_T expression ) )
            int alt33=24;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:337:5: block
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_block_in_topStatement1052);
                    block72=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, block72.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(block72!=null?((Token)block72.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(block72!=null?((Token)block72.stop):null)).getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:342:5: if_stat
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_if_stat_in_topStatement1062);
                    if_stat73=if_stat();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, if_stat73.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = (if_stat73!=null?((SLAST)if_stat73.tree):null).startIndex;
                          endIndex = (if_stat73!=null?((SLAST)if_stat73.tree):null).endIndex;
                        
                    }

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:347:5: WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement
                    {
                    WHILE_T74=(Token)match(input,WHILE_T,FOLLOW_WHILE_T_in_topStatement1072); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE_T.add(WHILE_T74);

                    LEFT_PARETHESIS75=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS75);

                    pushFollow(FOLLOW_expression_in_topStatement1076);
                    expression76=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression76.getTree());
                    RIGHT_PARETHESIS77=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1078); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS77);

                    pushFollow(FOLLOW_while_statement_in_topStatement1080);
                    while_statement78=while_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_while_statement.add(while_statement78.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)WHILE_T74).getStartIndex();
                          endIndex = ((CommonToken)(while_statement78!=null?((Token)while_statement78.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: WHILE_T, expression, while_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 352:5: -> ^( WHILE_T ^( CONDITION expression ) while_statement )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:352:9: ^( WHILE_T ^( CONDITION expression ) while_statement )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_WHILE_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:352:19: ^( CONDITION expression )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:353:5: DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    DO_T79=(Token)match(input,DO_T,FOLLOW_DO_T_in_topStatement1113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DO_T.add(DO_T79);

                    pushFollow(FOLLOW_statement_in_topStatement1115);
                    statement80=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement80.getTree());
                    WHILE_T81=(Token)match(input,WHILE_T,FOLLOW_WHILE_T_in_topStatement1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_WHILE_T.add(WHILE_T81);

                    LEFT_PARETHESIS82=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS82);

                    pushFollow(FOLLOW_expression_in_topStatement1121);
                    expression83=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression83.getTree());
                    RIGHT_PARETHESIS84=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS84);

                    SEMI_COLON85=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON85);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)DO_T79).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON85).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: DO_T, expression, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 358:5: -> ^( DO_T ^( CONDITION expression ) statement )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:358:9: ^( DO_T ^( CONDITION expression ) statement )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_DO_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:358:16: ^( CONDITION expression )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:359:5: FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement
                    {
                    FOR_T86=(Token)match(input,FOR_T,FOLLOW_FOR_T_in_topStatement1155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOR_T.add(FOR_T86);

                    LEFT_PARETHESIS87=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS87);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:359:29: (e1= expr_list )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==LEFT_PARETHESIS||LA25_0==IDENTIFIER||LA25_0==REF_T||LA25_0==STRINGLITERAL||(LA25_0>=PLUS_T && LA25_0<=MINUS_T)||(LA25_0>=UNSET_T && LA25_0<=MINUS_MINUS_T)||(LA25_0>=AT_T && LA25_0<=PRINT_T)||(LA25_0>=DOLLAR_T && LA25_0<=HERE_DOC)||(LA25_0>=188 && LA25_0<=195)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:359:29: e1= expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_topStatement1161);
                            e1=expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr_list.add(e1.getTree());

                            }
                            break;

                    }

                    SEMI_COLON88=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1164); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON88);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:359:54: (e2= expr_list )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==LEFT_PARETHESIS||LA26_0==IDENTIFIER||LA26_0==REF_T||LA26_0==STRINGLITERAL||(LA26_0>=PLUS_T && LA26_0<=MINUS_T)||(LA26_0>=UNSET_T && LA26_0<=MINUS_MINUS_T)||(LA26_0>=AT_T && LA26_0<=PRINT_T)||(LA26_0>=DOLLAR_T && LA26_0<=HERE_DOC)||(LA26_0>=188 && LA26_0<=195)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:359:54: e2= expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_topStatement1168);
                            e2=expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr_list.add(e2.getTree());

                            }
                            break;

                    }

                    SEMI_COLON89=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON89);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:359:79: (e3= expr_list )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==LEFT_PARETHESIS||LA27_0==IDENTIFIER||LA27_0==REF_T||LA27_0==STRINGLITERAL||(LA27_0>=PLUS_T && LA27_0<=MINUS_T)||(LA27_0>=UNSET_T && LA27_0<=MINUS_MINUS_T)||(LA27_0>=AT_T && LA27_0<=PRINT_T)||(LA27_0>=DOLLAR_T && LA27_0<=HERE_DOC)||(LA27_0>=188 && LA27_0<=195)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:359:79: e3= expr_list
                            {
                            pushFollow(FOLLOW_expr_list_in_topStatement1175);
                            e3=expr_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expr_list.add(e3.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS90=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS90);

                    pushFollow(FOLLOW_for_statement_in_topStatement1180);
                    for_statement91=for_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_for_statement.add(for_statement91.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)FOR_T86).getStartIndex();
                          endIndex = ((CommonToken)RIGHT_PARETHESIS90).getStopIndex();
                          if ((for_statement91!=null?input.toString(for_statement91.start,for_statement91.stop):null) != null) {
                            endIndex = ((CommonToken)(for_statement91!=null?((Token)for_statement91.stop):null)).getStopIndex();
                          }
                        
                    }


                    // AST REWRITE
                    // elements: e1, e2, e3, FOR_T, for_statement
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
                    // 367:5: -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:367:9: ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_FOR_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:367:17: ( $e1)?
                        if ( stream_e1.hasNext() ) {
                            adaptor.addChild(root_1, stream_e1.nextTree());

                        }
                        stream_e1.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:367:22: ^( CONDITION ( $e2)? )
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:367:34: ( $e2)?
                        if ( stream_e2.hasNext() ) {
                            adaptor.addChild(root_2, stream_e2.nextTree());

                        }
                        stream_e2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:367:40: ^( ITERATE ( $e3)? )
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(ITERATE, "ITERATE"), root_2);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:367:50: ( $e3)?
                        if ( stream_e3.hasNext() ) {
                            adaptor.addChild(root_2, stream_e3.nextTree());

                        }
                        stream_e3.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:367:56: ( for_statement )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:368:5: SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list
                    {
                    SWITCH_T92=(Token)match(input,SWITCH_T,FOLLOW_SWITCH_T_in_topStatement1224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SWITCH_T.add(SWITCH_T92);

                    LEFT_PARETHESIS93=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS93);

                    pushFollow(FOLLOW_expression_in_topStatement1228);
                    expression94=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression94.getTree());
                    RIGHT_PARETHESIS95=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1230); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS95);

                    pushFollow(FOLLOW_switch_case_list_in_topStatement1232);
                    switch_case_list96=switch_case_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_switch_case_list.add(switch_case_list96.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)SWITCH_T92).getStartIndex();
                          endIndex = ((CommonToken)(switch_case_list96!=null?((Token)switch_case_list96.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expression, switch_case_list, SWITCH_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 373:5: -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:373:9: ^( SWITCH_T ^( CONDITION expression ) switch_case_list )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_SWITCH_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:373:20: ^( CONDITION expression )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:374:5: BREAK_T ( expression )? SEMI_COLON
                    {
                    BREAK_T97=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_topStatement1261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BREAK_T.add(BREAK_T97);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:374:13: ( expression )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==LEFT_PARETHESIS||LA28_0==IDENTIFIER||LA28_0==REF_T||LA28_0==STRINGLITERAL||(LA28_0>=PLUS_T && LA28_0<=MINUS_T)||(LA28_0>=UNSET_T && LA28_0<=MINUS_MINUS_T)||(LA28_0>=AT_T && LA28_0<=PRINT_T)||(LA28_0>=DOLLAR_T && LA28_0<=HERE_DOC)||(LA28_0>=188 && LA28_0<=195)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:374:13: expression
                            {
                            pushFollow(FOLLOW_expression_in_topStatement1263);
                            expression98=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression98.getTree());

                            }
                            break;

                    }

                    SEMI_COLON99=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1266); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON99);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)BREAK_T97).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON99).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expression, BREAK_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 379:5: -> ^( BREAK_T ( expression )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:379:9: ^( BREAK_T ( expression )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_BREAK_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:379:19: ( expression )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:380:5: CONTINUE_T ( expression )? SEMI_COLON
                    {
                    CONTINUE_T100=(Token)match(input,CONTINUE_T,FOLLOW_CONTINUE_T_in_topStatement1290); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONTINUE_T.add(CONTINUE_T100);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:380:16: ( expression )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==LEFT_PARETHESIS||LA29_0==IDENTIFIER||LA29_0==REF_T||LA29_0==STRINGLITERAL||(LA29_0>=PLUS_T && LA29_0<=MINUS_T)||(LA29_0>=UNSET_T && LA29_0<=MINUS_MINUS_T)||(LA29_0>=AT_T && LA29_0<=PRINT_T)||(LA29_0>=DOLLAR_T && LA29_0<=HERE_DOC)||(LA29_0>=188 && LA29_0<=195)) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:380:16: expression
                            {
                            pushFollow(FOLLOW_expression_in_topStatement1292);
                            expression101=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression101.getTree());

                            }
                            break;

                    }

                    SEMI_COLON102=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON102);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)CONTINUE_T100).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON102).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: CONTINUE_T, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 385:5: -> ^( CONTINUE_T ( expression )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:385:9: ^( CONTINUE_T ( expression )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_CONTINUE_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:385:22: ( expression )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:386:5: RETURN_T ( expression )? SEMI_COLON
                    {
                    RETURN_T103=(Token)match(input,RETURN_T,FOLLOW_RETURN_T_in_topStatement1331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RETURN_T.add(RETURN_T103);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:386:14: ( expression )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LEFT_PARETHESIS||LA30_0==IDENTIFIER||LA30_0==REF_T||LA30_0==STRINGLITERAL||(LA30_0>=PLUS_T && LA30_0<=MINUS_T)||(LA30_0>=UNSET_T && LA30_0<=MINUS_MINUS_T)||(LA30_0>=AT_T && LA30_0<=PRINT_T)||(LA30_0>=DOLLAR_T && LA30_0<=HERE_DOC)||(LA30_0>=188 && LA30_0<=195)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:386:14: expression
                            {
                            pushFollow(FOLLOW_expression_in_topStatement1333);
                            expression104=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression104.getTree());

                            }
                            break;

                    }

                    SEMI_COLON105=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1336); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON105);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)RETURN_T103).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON105).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expression, RETURN_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 391:5: -> ^( RETURN_T ( expression )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:391:9: ^( RETURN_T ( expression )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_RETURN_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:391:20: ( expression )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:392:5: GLOBAL_T variable_list SEMI_COLON
                    {
                    GLOBAL_T106=(Token)match(input,GLOBAL_T,FOLLOW_GLOBAL_T_in_topStatement1375); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GLOBAL_T.add(GLOBAL_T106);

                    pushFollow(FOLLOW_variable_list_in_topStatement1377);
                    variable_list107=variable_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable_list.add(variable_list107.getTree());
                    SEMI_COLON108=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1379); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON108);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)GLOBAL_T106).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON108).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: GLOBAL_T, variable_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 397:5: -> ^( GLOBAL_T variable_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:397:9: ^( GLOBAL_T variable_list )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:398:5: STATIC_T static_var_list SEMI_COLON
                    {
                    STATIC_T109=(Token)match(input,STATIC_T,FOLLOW_STATIC_T_in_topStatement1417); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STATIC_T.add(STATIC_T109);

                    pushFollow(FOLLOW_static_var_list_in_topStatement1419);
                    static_var_list110=static_var_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_static_var_list.add(static_var_list110.getTree());
                    SEMI_COLON111=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON111);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)STATIC_T109).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON111).getStartIndex();
                        
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
                    // 403:5: -> ^( STATIC_T static_var_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:403:9: ^( STATIC_T static_var_list )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:404:5: ECHO_T expr_list SEMI_COLON
                    {
                    ECHO_T112=(Token)match(input,ECHO_T,FOLLOW_ECHO_T_in_topStatement1456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ECHO_T.add(ECHO_T112);

                    pushFollow(FOLLOW_expr_list_in_topStatement1458);
                    expr_list113=expr_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_list.add(expr_list113.getTree());
                    SEMI_COLON114=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1460); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON114);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)ECHO_T112).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON114).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expr_list, ECHO_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 409:5: -> ^( ECHO_T expr_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:409:9: ^( ECHO_T expr_list )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:410:5: expression SEMI_COLON
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_topStatement1483);
                    expression115=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression115.getTree());
                    SEMI_COLON116=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1485); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(expression115!=null?((Token)expression115.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(expression115!=null?((Token)expression115.stop):null)).getStopIndex();
                          if (((CommonToken)SEMI_COLON116).getStopIndex() != 0) {
                            endIndex = ((CommonToken)SEMI_COLON116).getStopIndex();
                          }    
                          System.out.println("weird:" + endIndex);
                        
                    }

                    }
                    break;
                case 14 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:419:5: FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement
                    {
                    FOREACH_T117=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_topStatement1496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FOREACH_T.add(FOREACH_T117);

                    LEFT_PARETHESIS118=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1498); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS118);

                    pushFollow(FOLLOW_expression_in_topStatement1500);
                    expression119=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression119.getTree());
                    AS_T120=(Token)match(input,AS_T,FOLLOW_AS_T_in_topStatement1502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AS_T.add(AS_T120);

                    pushFollow(FOLLOW_foreach_variable_in_topStatement1504);
                    foreach_variable121=foreach_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_foreach_variable.add(foreach_variable121.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:419:64: ( ARROW_T foreach_variable )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==ARROW_T) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:419:65: ARROW_T foreach_variable
                            {
                            ARROW_T122=(Token)match(input,ARROW_T,FOLLOW_ARROW_T_in_topStatement1507); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ARROW_T.add(ARROW_T122);

                            pushFollow(FOLLOW_foreach_variable_in_topStatement1509);
                            foreach_variable123=foreach_variable();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_foreach_variable.add(foreach_variable123.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS124=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1513); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS124);

                    pushFollow(FOLLOW_foreach_statement_in_topStatement1523);
                    foreach_statement125=foreach_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_foreach_statement.add(foreach_statement125.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)FOREACH_T117).getStartIndex();
                          endIndex = ((CommonToken)(foreach_statement125!=null?((Token)foreach_statement125.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: foreach_variable, FOREACH_T, AS_T, expression, foreach_variable, foreach_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 425:6: -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:425:9: ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_FOREACH_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:425:21: ^( AS_T expression foreach_variable ( foreach_variable )? )
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot(stream_AS_T.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_expression.nextTree());
                        adaptor.addChild(root_2, stream_foreach_variable.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:425:56: ( foreach_variable )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:426:5: DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement
                    {
                    DECLARE_T126=(Token)match(input,DECLARE_T,FOLLOW_DECLARE_T_in_topStatement1558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DECLARE_T.add(DECLARE_T126);

                    LEFT_PARETHESIS127=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1560); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS127);

                    pushFollow(FOLLOW_directive_in_topStatement1562);
                    directive128=directive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_directive.add(directive128.getTree());
                    RIGHT_PARETHESIS129=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS129);

                    pushFollow(FOLLOW_declare_statement_in_topStatement1566);
                    declare_statement130=declare_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declare_statement.add(declare_statement130.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)DECLARE_T126).getStartIndex();
                          endIndex = ((CommonToken)(declare_statement130!=null?((Token)declare_statement130.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: directive, DECLARE_T, declare_statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 431:5: -> ^( DECLARE_T directive ( declare_statement )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:431:9: ^( DECLARE_T directive ( declare_statement )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_DECLARE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_directive.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:431:31: ( declare_statement )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:432:5: SEMI_COLON
                    {
                    SEMI_COLON131=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1592); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON131);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)SEMI_COLON131).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON131).getStopIndex();
                        
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
                    // 437:5: -> ^( EMPTYSTATEMENT SEMI_COLON )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:437:9: ^( EMPTYSTATEMENT SEMI_COLON )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:438:5: TRY_T block ( catch_branch )+
                    {
                    TRY_T132=(Token)match(input,TRY_T,FOLLOW_TRY_T_in_topStatement1615); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRY_T.add(TRY_T132);

                    pushFollow(FOLLOW_block_in_topStatement1617);
                    block133=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block133.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:438:17: ( catch_branch )+
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
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:438:17: catch_branch
                    	    {
                    	    pushFollow(FOLLOW_catch_branch_in_topStatement1619);
                    	    catch_branch134=catch_branch();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_catch_branch.add(catch_branch134.getTree());

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

                          startIndex = ((CommonToken)TRY_T132).getStartIndex();
                          endIndex = ((CommonToken)(catch_branch134!=null?((Token)catch_branch134.stop):null)).getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: block, catch_branch, TRY_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 443:5: -> ^( TRY_T block ( catch_branch )+ )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:443:9: ^( TRY_T block ( catch_branch )+ )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:444:5: THROW_T expression SEMI_COLON
                    {
                    THROW_T135=(Token)match(input,THROW_T,FOLLOW_THROW_T_in_topStatement1646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_THROW_T.add(THROW_T135);

                    pushFollow(FOLLOW_expression_in_topStatement1648);
                    expression136=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression136.getTree());
                    SEMI_COLON137=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON137);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)THROW_T135).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON137).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: expression, THROW_T
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 449:5: -> ^( THROW_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:449:9: ^( THROW_T expression )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:450:5: USE_T scalar SEMI_COLON
                    {
                    USE_T138=(Token)match(input,USE_T,FOLLOW_USE_T_in_topStatement1687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE_T.add(USE_T138);

                    pushFollow(FOLLOW_scalar_in_topStatement1689);
                    scalar139=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scalar.add(scalar139.getTree());
                    SEMI_COLON140=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON140);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)USE_T138).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON140).getStartIndex();
                        
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
                    // 455:5: -> ^( USE_T scalar )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:455:9: ^( USE_T scalar )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:456:5: USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON
                    {
                    USE_T141=(Token)match(input,USE_T,FOLLOW_USE_T_in_topStatement1728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_USE_T.add(USE_T141);

                    LEFT_PARETHESIS142=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1730); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS142);

                    pushFollow(FOLLOW_scalar_in_topStatement1732);
                    scalar143=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scalar.add(scalar143.getTree());
                    RIGHT_PARETHESIS144=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS144);

                    SEMI_COLON145=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1736); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON145);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)USE_T141).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON145).getStartIndex();
                        
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
                    // 461:5: -> ^( USE_PARETHESIS_T scalar )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:461:9: ^( USE_PARETHESIS_T scalar )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:462:5: INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    INCLUDE_T146=(Token)match(input,INCLUDE_T,FOLLOW_INCLUDE_T_in_topStatement1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCLUDE_T.add(INCLUDE_T146);

                    LEFT_PARETHESIS147=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS147);

                    pushFollow(FOLLOW_expression_in_topStatement1763);
                    expression148=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression148.getTree());
                    RIGHT_PARETHESIS149=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS149);

                    SEMI_COLON150=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON150);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)INCLUDE_T146).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON150).getStartIndex();
                        
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
                    // 467:5: -> ^( INCLUDE_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:467:9: ^( INCLUDE_T expression )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:468:5: INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    INCLUDE_ONCE_T151=(Token)match(input,INCLUDE_ONCE_T,FOLLOW_INCLUDE_ONCE_T_in_topStatement1790); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INCLUDE_ONCE_T.add(INCLUDE_ONCE_T151);

                    LEFT_PARETHESIS152=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1792); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS152);

                    pushFollow(FOLLOW_expression_in_topStatement1794);
                    expression153=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression153.getTree());
                    RIGHT_PARETHESIS154=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1796); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS154);

                    SEMI_COLON155=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1798); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON155);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)INCLUDE_ONCE_T151).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON155).getStartIndex();
                        
                    }


                    // AST REWRITE
                    // elements: INCLUDE_ONCE_T, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 473:5: -> ^( INCLUDE_ONCE_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:473:9: ^( INCLUDE_ONCE_T expression )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:474:5: REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    REQUIRE_T156=(Token)match(input,REQUIRE_T,FOLLOW_REQUIRE_T_in_topStatement1821); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRE_T.add(REQUIRE_T156);

                    LEFT_PARETHESIS157=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1823); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS157);

                    pushFollow(FOLLOW_expression_in_topStatement1825);
                    expression158=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression158.getTree());
                    RIGHT_PARETHESIS159=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1827); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS159);

                    SEMI_COLON160=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1829); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON160);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)REQUIRE_T156).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON160).getStartIndex();
                        
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
                    // 479:5: -> ^( REQUIRE_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:479:9: ^( REQUIRE_T expression )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:480:5: REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
                    {
                    REQUIRE_ONCE_T161=(Token)match(input,REQUIRE_ONCE_T,FOLLOW_REQUIRE_ONCE_T_in_topStatement1852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REQUIRE_ONCE_T.add(REQUIRE_ONCE_T161);

                    LEFT_PARETHESIS162=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS162);

                    pushFollow(FOLLOW_expression_in_topStatement1856);
                    expression163=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression163.getTree());
                    RIGHT_PARETHESIS164=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1858); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS164);

                    SEMI_COLON165=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1860); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON165);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)REQUIRE_ONCE_T161).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON165).getStartIndex();
                        
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
                    // 485:5: -> ^( REQUIRE_ONCE_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:485:9: ^( REQUIRE_ONCE_T expression )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:492:1: foreach_variable : ( REF_T )? variable ;
    public final CompilerAstParser.foreach_variable_return foreach_variable() throws RecognitionException {
        CompilerAstParser.foreach_variable_return retval = new CompilerAstParser.foreach_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token REF_T166=null;
        CompilerAstParser.variable_return variable167 = null;


        SLAST REF_T166_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:495:3: ( ( REF_T )? variable )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:495:5: ( REF_T )? variable
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:495:5: ( REF_T )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==REF_T) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:495:5: REF_T
                    {
                    REF_T166=(Token)match(input,REF_T,FOLLOW_REF_T_in_foreach_variable1900); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REF_T166_tree = (SLAST)adaptor.create(REF_T166);
                    adaptor.addChild(root_0, REF_T166_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_variable_in_foreach_variable1903);
            variable167=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable167.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:498:1: use_filename : ( STRINGLITERAL | QUOTE_STRING | LEFT_PARETHESIS STRINGLITERAL RIGHT_PARETHESIS | LEFT_PARETHESIS QUOTE_STRING RIGHT_PARETHESIS );
    public final CompilerAstParser.use_filename_return use_filename() throws RecognitionException {
        CompilerAstParser.use_filename_return retval = new CompilerAstParser.use_filename_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token STRINGLITERAL168=null;
        Token QUOTE_STRING169=null;
        Token LEFT_PARETHESIS170=null;
        Token STRINGLITERAL171=null;
        Token RIGHT_PARETHESIS172=null;
        Token LEFT_PARETHESIS173=null;
        Token QUOTE_STRING174=null;
        Token RIGHT_PARETHESIS175=null;

        SLAST STRINGLITERAL168_tree=null;
        SLAST QUOTE_STRING169_tree=null;
        SLAST LEFT_PARETHESIS170_tree=null;
        SLAST STRINGLITERAL171_tree=null;
        SLAST RIGHT_PARETHESIS172_tree=null;
        SLAST LEFT_PARETHESIS173_tree=null;
        SLAST QUOTE_STRING174_tree=null;
        SLAST RIGHT_PARETHESIS175_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:499:3: ( STRINGLITERAL | QUOTE_STRING | LEFT_PARETHESIS STRINGLITERAL RIGHT_PARETHESIS | LEFT_PARETHESIS QUOTE_STRING RIGHT_PARETHESIS )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:499:5: STRINGLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    STRINGLITERAL168=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_use_filename1918); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRINGLITERAL168_tree = (SLAST)adaptor.create(STRINGLITERAL168);
                    adaptor.addChild(root_0, STRINGLITERAL168_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:500:5: QUOTE_STRING
                    {
                    root_0 = (SLAST)adaptor.nil();

                    QUOTE_STRING169=(Token)match(input,QUOTE_STRING,FOLLOW_QUOTE_STRING_in_use_filename1924); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUOTE_STRING169_tree = (SLAST)adaptor.create(QUOTE_STRING169);
                    adaptor.addChild(root_0, QUOTE_STRING169_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:501:5: LEFT_PARETHESIS STRINGLITERAL RIGHT_PARETHESIS
                    {
                    root_0 = (SLAST)adaptor.nil();

                    LEFT_PARETHESIS170=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_use_filename1930); if (state.failed) return retval;
                    STRINGLITERAL171=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_use_filename1933); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRINGLITERAL171_tree = (SLAST)adaptor.create(STRINGLITERAL171);
                    adaptor.addChild(root_0, STRINGLITERAL171_tree);
                    }
                    RIGHT_PARETHESIS172=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_use_filename1935); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:502:5: LEFT_PARETHESIS QUOTE_STRING RIGHT_PARETHESIS
                    {
                    root_0 = (SLAST)adaptor.nil();

                    LEFT_PARETHESIS173=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_use_filename1942); if (state.failed) return retval;
                    QUOTE_STRING174=(Token)match(input,QUOTE_STRING,FOLLOW_QUOTE_STRING_in_use_filename1945); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUOTE_STRING174_tree = (SLAST)adaptor.create(QUOTE_STRING174);
                    adaptor.addChild(root_0, QUOTE_STRING174_tree);
                    }
                    RIGHT_PARETHESIS175=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_use_filename1947); if (state.failed) return retval;

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:518:1: fully_qualified_class_name_list : fully_qualified_class_name ( ',' fully_qualified_class_name )* -> ( fully_qualified_class_name )+ ;
    public final CompilerAstParser.fully_qualified_class_name_list_return fully_qualified_class_name_list() throws RecognitionException {
        CompilerAstParser.fully_qualified_class_name_list_return retval = new CompilerAstParser.fully_qualified_class_name_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token char_literal177=null;
        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name176 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name178 = null;


        SLAST char_literal177_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:519:3: ( fully_qualified_class_name ( ',' fully_qualified_class_name )* -> ( fully_qualified_class_name )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:519:5: fully_qualified_class_name ( ',' fully_qualified_class_name )*
            {
            pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1976);
            fully_qualified_class_name176=fully_qualified_class_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name176.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:519:32: ( ',' fully_qualified_class_name )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==COMMA_T) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:519:33: ',' fully_qualified_class_name
            	    {
            	    char_literal177=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_fully_qualified_class_name_list1979); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(char_literal177);

            	    pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1981);
            	    fully_qualified_class_name178=fully_qualified_class_name();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name178.getTree());

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
            // 519:69: -> ( fully_qualified_class_name )+
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:522:1: fully_qualified_class_name : id1= IDENTIFIER ( DOMAIN_T id2= IDENTIFIER )* (d2= DOMAIN_T )? ;
    public final CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name() throws RecognitionException {
        CompilerAstParser.fully_qualified_class_name_return retval = new CompilerAstParser.fully_qualified_class_name_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token id1=null;
        Token id2=null;
        Token d2=null;
        Token DOMAIN_T179=null;

        SLAST id1_tree=null;
        SLAST id2_tree=null;
        SLAST d2_tree=null;
        SLAST DOMAIN_T179_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:533:3: (id1= IDENTIFIER ( DOMAIN_T id2= IDENTIFIER )* (d2= DOMAIN_T )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:533:5: id1= IDENTIFIER ( DOMAIN_T id2= IDENTIFIER )* (d2= DOMAIN_T )?
            {
            root_0 = (SLAST)adaptor.nil();

            id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name2017); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            id1_tree = (SLAST)adaptor.create(id1);
            adaptor.addChild(root_0, id1_tree);
            }
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:533:20: ( DOMAIN_T id2= IDENTIFIER )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==DOMAIN_T) ) {
                    int LA37_1 = input.LA(2);

                    if ( (LA37_1==IDENTIFIER) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:533:21: DOMAIN_T id2= IDENTIFIER
            	    {
            	    DOMAIN_T179=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name2020); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOMAIN_T179_tree = (SLAST)adaptor.create(DOMAIN_T179);
            	    root_0 = (SLAST)adaptor.becomeRoot(DOMAIN_T179_tree, root_0);
            	    }
            	    id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name2025); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    id2_tree = (SLAST)adaptor.create(id2);
            	    adaptor.addChild(root_0, id2_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:533:50: (d2= DOMAIN_T )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==DOMAIN_T) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:533:50: d2= DOMAIN_T
                    {
                    d2=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name2031); if (state.failed) return retval;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:555:1: static_var_list : static_var_element ( COMMA_T static_var_element )* -> ( static_var_element )+ ;
    public final CompilerAstParser.static_var_list_return static_var_list() throws RecognitionException {
        CompilerAstParser.static_var_list_return retval = new CompilerAstParser.static_var_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T181=null;
        CompilerAstParser.static_var_element_return static_var_element180 = null;

        CompilerAstParser.static_var_element_return static_var_element182 = null;


        SLAST COMMA_T181_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_static_var_element=new RewriteRuleSubtreeStream(adaptor,"rule static_var_element");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:556:3: ( static_var_element ( COMMA_T static_var_element )* -> ( static_var_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:556:5: static_var_element ( COMMA_T static_var_element )*
            {
            pushFollow(FOLLOW_static_var_element_in_static_var_list2062);
            static_var_element180=static_var_element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_static_var_element.add(static_var_element180.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:556:24: ( COMMA_T static_var_element )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==COMMA_T) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:556:25: COMMA_T static_var_element
            	    {
            	    COMMA_T181=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_static_var_list2065); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T181);

            	    pushFollow(FOLLOW_static_var_element_in_static_var_list2067);
            	    static_var_element182=static_var_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_static_var_element.add(static_var_element182.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
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
            // 556:55: -> ( static_var_element )+
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:559:1: static_var_element : pure_variable ( EQUAL_T scalar )? ;
    public final CompilerAstParser.static_var_element_return static_var_element() throws RecognitionException {
        CompilerAstParser.static_var_element_return retval = new CompilerAstParser.static_var_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token EQUAL_T184=null;
        CompilerAstParser.pure_variable_return pure_variable183 = null;

        CompilerAstParser.scalar_return scalar185 = null;


        SLAST EQUAL_T184_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:569:3: ( pure_variable ( EQUAL_T scalar )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:569:5: pure_variable ( EQUAL_T scalar )?
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_pure_variable_in_static_var_element2099);
            pure_variable183=pure_variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pure_variable183.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:569:19: ( EQUAL_T scalar )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==EQUAL_T) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:569:20: EQUAL_T scalar
                    {
                    EQUAL_T184=(Token)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_static_var_element2102); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUAL_T184_tree = (SLAST)adaptor.create(EQUAL_T184);
                    root_0 = (SLAST)adaptor.becomeRoot(EQUAL_T184_tree, root_0);
                    }
                    pushFollow(FOLLOW_scalar_in_static_var_element2105);
                    scalar185=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar185.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(pure_variable183!=null?((Token)pure_variable183.start):null);
                  startIndex = token.getStartIndex();
                  endIndex = token.getStopIndex();
                  if ((scalar185!=null?input.toString(scalar185.start,scalar185.stop):null) != null) {
                    endIndex = ((CommonToken)(scalar185!=null?((Token)scalar185.stop):null)).getStopIndex();
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:580:1: if_stat : IF_T LEFT_PARETHESIS eIfCond= expression RIGHT_PARETHESIS (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) ) ;
    public final CompilerAstParser.if_stat_return if_stat() throws RecognitionException {
        CompilerAstParser.if_stat_return retval = new CompilerAstParser.if_stat_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token IF_T186=null;
        Token LEFT_PARETHESIS187=null;
        Token RIGHT_PARETHESIS188=null;
        Token ELSEIF_T189=null;
        Token LEFT_PARETHESIS190=null;
        Token RIGHT_PARETHESIS191=null;
        Token ELSE_T192=null;
        Token COLON_T193=null;
        Token ELSE_T196=null;
        Token COLON_T197=null;
        Token ENDIF_T198=null;
        Token SEMI_COLON199=null;
        CompilerAstParser.expression_return eIfCond = null;

        CompilerAstParser.statement_return s1 = null;

        CompilerAstParser.expression_return eElseCond = null;

        CompilerAstParser.statement_return s2 = null;

        CompilerAstParser.statement_return s3 = null;

        CompilerAstParser.statement_return s4 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list194 = null;

        CompilerAstParser.new_elseif_branch_return new_elseif_branch195 = null;


        SLAST IF_T186_tree=null;
        SLAST LEFT_PARETHESIS187_tree=null;
        SLAST RIGHT_PARETHESIS188_tree=null;
        SLAST ELSEIF_T189_tree=null;
        SLAST LEFT_PARETHESIS190_tree=null;
        SLAST RIGHT_PARETHESIS191_tree=null;
        SLAST ELSE_T192_tree=null;
        SLAST COLON_T193_tree=null;
        SLAST ELSE_T196_tree=null;
        SLAST COLON_T197_tree=null;
        SLAST ENDIF_T198_tree=null;
        SLAST SEMI_COLON199_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:591:3: ( IF_T LEFT_PARETHESIS eIfCond= expression RIGHT_PARETHESIS (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:591:5: IF_T LEFT_PARETHESIS eIfCond= expression RIGHT_PARETHESIS (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) )
            {
            IF_T186=(Token)match(input,IF_T,FOLLOW_IF_T_in_if_stat2136); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF_T.add(IF_T186);

            LEFT_PARETHESIS187=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_if_stat2138); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS187);

            pushFollow(FOLLOW_expression_in_if_stat2142);
            eIfCond=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(eIfCond.getTree());
            RIGHT_PARETHESIS188=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_if_stat2144); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS188);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:592:5: (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LEFT_PARETHESIS||LA46_0==SEMI_COLON||LA46_0==IDENTIFIER||LA46_0==LEFT_BRACKET||LA46_0==REF_T||(LA46_0>=WHILE_T && LA46_0<=FOREACH_T)||(LA46_0>=DECLARE_T && LA46_0<=STRINGLITERAL)||LA46_0==IF_T||(LA46_0>=PLUS_T && LA46_0<=MINUS_T)||(LA46_0>=UNSET_T && LA46_0<=MINUS_MINUS_T)||(LA46_0>=AT_T && LA46_0<=PRINT_T)||(LA46_0>=DOLLAR_T && LA46_0<=HERE_DOC)||(LA46_0>=188 && LA46_0<=195)) ) {
                alt46=1;
            }
            else if ( (LA46_0==COLON_T) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:593:7: s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )?
                    {
                    pushFollow(FOLLOW_statement_in_if_stat2160);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s1.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:593:20: ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )*
                    loop41:
                    do {
                        int alt41=2;
                        alt41 = dfa41.predict(input);
                        switch (alt41) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:593:53: ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement
                    	    {
                    	    ELSEIF_T189=(Token)match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_if_stat2176); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ELSEIF_T.add(ELSEIF_T189);

                    	    LEFT_PARETHESIS190=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_if_stat2178); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS190);

                    	    pushFollow(FOLLOW_expression_in_if_stat2182);
                    	    eElseCond=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(eElseCond.getTree());
                    	    RIGHT_PARETHESIS191=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_if_stat2184); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS191);

                    	    pushFollow(FOLLOW_statement_in_if_stat2188);
                    	    s2=statement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_statement.add(s2.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:594:9: ( options {k=1; backtrack=true; } : ELSE_T s3= statement )?
                    int alt42=2;
                    alt42 = dfa42.predict(input);
                    switch (alt42) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:594:42: ELSE_T s3= statement
                            {
                            ELSE_T192=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_if_stat2214); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE_T.add(ELSE_T192);

                            pushFollow(FOLLOW_statement_in_if_stat2218);
                            s3=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(s3.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                              startIndex = ((CommonToken)IF_T186).getStartIndex();
                              endIndex = ((CommonToken)(s1!=null?((Token)s1.stop):null)).getStopIndex();
                              if ((s2!=null?input.toString(s2.start,s2.stop):null) != null) {
                                endIndex = ((CommonToken)(s2!=null?((Token)s2.stop):null)).getStopIndex();
                              }
                              if ((s3!=null?input.toString(s3.start,s3.stop):null) != null) {
                                endIndex = ((CommonToken)(s3!=null?((Token)s3.stop):null)).getStopIndex();
                              }
                           
                    }


                    // AST REWRITE
                    // elements: ELSEIF_T, s3, IF_T, s2, s1, ELSE_T, eElseCond, eIfCond
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
                    // 605:7: -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:605:11: ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_IF_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:605:18: ^( CONDITION $eIfCond)
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_eIfCond.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_s1.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:605:45: ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )*
                        while ( stream_ELSEIF_T.hasNext()||stream_s2.hasNext()||stream_eElseCond.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:605:45: ^( ELSEIF_T ^( CONDITION $eElseCond) $s2)
                            {
                            SLAST root_2 = (SLAST)adaptor.nil();
                            root_2 = (SLAST)adaptor.becomeRoot(stream_ELSEIF_T.nextNode(), root_2);

                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:605:56: ^( CONDITION $eElseCond)
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
                        stream_ELSEIF_T.reset();
                        stream_s2.reset();
                        stream_eElseCond.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:605:86: ( ^( ELSE_T $s3) )?
                        if ( stream_s3.hasNext()||stream_ELSE_T.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:605:86: ^( ELSE_T $s3)
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:606:9: COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON
                    {
                    COLON_T193=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_if_stat2284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T193);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:606:17: ( inner_statement_list )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==LEFT_PARETHESIS||(LA43_0>=SEMI_COLON && LA43_0<=IDENTIFIER)||LA43_0==LEFT_BRACKET||(LA43_0>=INTERFACE_T && LA43_0<=REF_T)||(LA43_0>=WHILE_T && LA43_0<=FOREACH_T)||(LA43_0>=DECLARE_T && LA43_0<=STRINGLITERAL)||LA43_0==IF_T||(LA43_0>=PLUS_T && LA43_0<=MINUS_T)||(LA43_0>=UNSET_T && LA43_0<=MINUS_MINUS_T)||(LA43_0>=AT_T && LA43_0<=PRINT_T)||(LA43_0>=DOLLAR_T && LA43_0<=HERE_DOC)||(LA43_0>=173 && LA43_0<=175)||(LA43_0>=188 && LA43_0<=195)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:606:17: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_if_stat2286);
                            inner_statement_list194=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list194.getTree());

                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:606:39: ( new_elseif_branch )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==ELSEIF_T) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:606:39: new_elseif_branch
                    	    {
                    	    pushFollow(FOLLOW_new_elseif_branch_in_if_stat2289);
                    	    new_elseif_branch195=new_elseif_branch();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_new_elseif_branch.add(new_elseif_branch195.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:606:58: ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ELSE_T) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:606:91: ELSE_T COLON_T s4= statement
                            {
                            ELSE_T196=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_if_stat2306); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE_T.add(ELSE_T196);

                            COLON_T197=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_if_stat2308); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T197);

                            pushFollow(FOLLOW_statement_in_if_stat2312);
                            s4=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(s4.getTree());

                            }
                            break;

                    }

                    ENDIF_T198=(Token)match(input,ENDIF_T,FOLLOW_ENDIF_T_in_if_stat2316); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDIF_T.add(ENDIF_T198);

                    SEMI_COLON199=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_if_stat2318); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON199);

                    if ( state.backtracking==0 ) {

                              startIndex = ((CommonToken)IF_T186).getStartIndex();
                              endIndex = ((CommonToken)ENDIF_T198).getStartIndex() -2;
                           
                    }


                    // AST REWRITE
                    // elements: s4, eIfCond, inner_statement_list, IF_T, new_elseif_branch, ELSE_T
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
                    // 611:7: -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:611:11: ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_IF_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:611:18: ^( CONDITION $eIfCond)
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                        adaptor.addChild(root_2, stream_eIfCond.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:611:40: ( inner_statement_list )?
                        if ( stream_inner_statement_list.hasNext() ) {
                            adaptor.addChild(root_1, stream_inner_statement_list.nextTree());

                        }
                        stream_inner_statement_list.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:611:62: ( new_elseif_branch )*
                        while ( stream_new_elseif_branch.hasNext() ) {
                            adaptor.addChild(root_1, stream_new_elseif_branch.nextTree());

                        }
                        stream_new_elseif_branch.reset();
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:611:81: ( ^( ELSE_T $s4) )?
                        if ( stream_s4.hasNext()||stream_ELSE_T.hasNext() ) {
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:611:81: ^( ELSE_T $s4)
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:615:1: new_elseif_branch : ELSEIF_T LEFT_PARETHESIS expression RIGHT_PARETHESIS COLON_T ( inner_statement_list )? -> ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) ;
    public final CompilerAstParser.new_elseif_branch_return new_elseif_branch() throws RecognitionException {
        CompilerAstParser.new_elseif_branch_return retval = new CompilerAstParser.new_elseif_branch_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token ELSEIF_T200=null;
        Token LEFT_PARETHESIS201=null;
        Token RIGHT_PARETHESIS203=null;
        Token COLON_T204=null;
        CompilerAstParser.expression_return expression202 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list205 = null;


        SLAST ELSEIF_T200_tree=null;
        SLAST LEFT_PARETHESIS201_tree=null;
        SLAST RIGHT_PARETHESIS203_tree=null;
        SLAST COLON_T204_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:625:2: ( ELSEIF_T LEFT_PARETHESIS expression RIGHT_PARETHESIS COLON_T ( inner_statement_list )? -> ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:625:4: ELSEIF_T LEFT_PARETHESIS expression RIGHT_PARETHESIS COLON_T ( inner_statement_list )?
            {
            ELSEIF_T200=(Token)match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_new_elseif_branch2389); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSEIF_T.add(ELSEIF_T200);

            LEFT_PARETHESIS201=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_new_elseif_branch2391); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS201);

            pushFollow(FOLLOW_expression_in_new_elseif_branch2393);
            expression202=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression202.getTree());
            RIGHT_PARETHESIS203=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_new_elseif_branch2395); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS203);

            COLON_T204=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_new_elseif_branch2397); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T204);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:625:65: ( inner_statement_list )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==LEFT_PARETHESIS||(LA47_0>=SEMI_COLON && LA47_0<=IDENTIFIER)||LA47_0==LEFT_BRACKET||(LA47_0>=INTERFACE_T && LA47_0<=REF_T)||(LA47_0>=WHILE_T && LA47_0<=FOREACH_T)||(LA47_0>=DECLARE_T && LA47_0<=STRINGLITERAL)||LA47_0==IF_T||(LA47_0>=PLUS_T && LA47_0<=MINUS_T)||(LA47_0>=UNSET_T && LA47_0<=MINUS_MINUS_T)||(LA47_0>=AT_T && LA47_0<=PRINT_T)||(LA47_0>=DOLLAR_T && LA47_0<=HERE_DOC)||(LA47_0>=173 && LA47_0<=175)||(LA47_0>=188 && LA47_0<=195)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:625:65: inner_statement_list
                    {
                    pushFollow(FOLLOW_inner_statement_list_in_new_elseif_branch2399);
                    inner_statement_list205=inner_statement_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list205.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)ELSEIF_T200;
                  startIndex = token.getStartIndex();
                  token = (CommonToken)COLON_T204;
                  endIndex = token.getStopIndex();
                  if ((inner_statement_list205!=null?input.toString(inner_statement_list205.start,inner_statement_list205.stop):null) != null) {
                    endIndex = ((CommonToken)(inner_statement_list205!=null?((Token)inner_statement_list205.stop):null)).getStopIndex();
                  }
                
            }


            // AST REWRITE
            // elements: expression, ELSEIF_T, inner_statement_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 635:4: -> ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:635:8: ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot(stream_ELSEIF_T.nextNode(), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:635:19: ^( CONDITION expression )
                {
                SLAST root_2 = (SLAST)adaptor.nil();
                root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:635:43: ( inner_statement_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:638:1: switch_case_list : ( LEFT_BRACKET ( SEMI_COLON )? ( case_list )+ RIGHT_BRACKET -> ( case_list )+ | COLON_T ( SEMI_COLON )? ( case_list )+ ENDSWITCH_T SEMI_COLON -> ( case_list )+ );
    public final CompilerAstParser.switch_case_list_return switch_case_list() throws RecognitionException {
        CompilerAstParser.switch_case_list_return retval = new CompilerAstParser.switch_case_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_BRACKET206=null;
        Token SEMI_COLON207=null;
        Token RIGHT_BRACKET209=null;
        Token COLON_T210=null;
        Token SEMI_COLON211=null;
        Token ENDSWITCH_T213=null;
        Token SEMI_COLON214=null;
        CompilerAstParser.case_list_return case_list208 = null;

        CompilerAstParser.case_list_return case_list212 = null;


        SLAST LEFT_BRACKET206_tree=null;
        SLAST SEMI_COLON207_tree=null;
        SLAST RIGHT_BRACKET209_tree=null;
        SLAST COLON_T210_tree=null;
        SLAST SEMI_COLON211_tree=null;
        SLAST ENDSWITCH_T213_tree=null;
        SLAST SEMI_COLON214_tree=null;
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_ENDSWITCH_T=new RewriteRuleTokenStream(adaptor,"token ENDSWITCH_T");
        RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
        RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
        RewriteRuleSubtreeStream stream_case_list=new RewriteRuleSubtreeStream(adaptor,"rule case_list");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:639:3: ( LEFT_BRACKET ( SEMI_COLON )? ( case_list )+ RIGHT_BRACKET -> ( case_list )+ | COLON_T ( SEMI_COLON )? ( case_list )+ ENDSWITCH_T SEMI_COLON -> ( case_list )+ )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LEFT_BRACKET) ) {
                alt52=1;
            }
            else if ( (LA52_0==COLON_T) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:639:5: LEFT_BRACKET ( SEMI_COLON )? ( case_list )+ RIGHT_BRACKET
                    {
                    LEFT_BRACKET206=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_switch_case_list2437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET206);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:639:18: ( SEMI_COLON )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==SEMI_COLON) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:639:18: SEMI_COLON
                            {
                            SEMI_COLON207=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_switch_case_list2439); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON207);


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:639:30: ( case_list )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=CASE_T && LA49_0<=DEFAULT_T)) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:639:30: case_list
                    	    {
                    	    pushFollow(FOLLOW_case_list_in_switch_case_list2442);
                    	    case_list208=case_list();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_case_list.add(case_list208.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
                    } while (true);

                    RIGHT_BRACKET209=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_switch_case_list2445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET209);



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
                    // 639:65: -> ( case_list )+
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:640:5: COLON_T ( SEMI_COLON )? ( case_list )+ ENDSWITCH_T SEMI_COLON
                    {
                    COLON_T210=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_switch_case_list2467); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T210);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:640:13: ( SEMI_COLON )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==SEMI_COLON) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:640:13: SEMI_COLON
                            {
                            SEMI_COLON211=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_switch_case_list2469); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON211);


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:640:25: ( case_list )+
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
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:640:25: case_list
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

                    ENDSWITCH_T213=(Token)match(input,ENDSWITCH_T,FOLLOW_ENDSWITCH_T_in_switch_case_list2475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDSWITCH_T.add(ENDSWITCH_T213);

                    SEMI_COLON214=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_switch_case_list2477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON214);



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
                    // 640:63: -> ( case_list )+
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:643:1: case_list : ( CASE_T expression ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( CASE_T expression ( inner_statement_list )? ) | DEFAULT_T ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( DEFAULT_T ( inner_statement_list )? ) );
    public final CompilerAstParser.case_list_return case_list() throws RecognitionException {
        CompilerAstParser.case_list_return retval = new CompilerAstParser.case_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token CASE_T215=null;
        Token COLON_T217=null;
        Token SEMI_COLON218=null;
        Token DEFAULT_T220=null;
        Token COLON_T221=null;
        Token SEMI_COLON222=null;
        CompilerAstParser.expression_return expression216 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list219 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list223 = null;


        SLAST CASE_T215_tree=null;
        SLAST COLON_T217_tree=null;
        SLAST SEMI_COLON218_tree=null;
        SLAST DEFAULT_T220_tree=null;
        SLAST COLON_T221_tree=null;
        SLAST SEMI_COLON222_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:653:3: ( CASE_T expression ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( CASE_T expression ( inner_statement_list )? ) | DEFAULT_T ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( DEFAULT_T ( inner_statement_list )? ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==CASE_T) ) {
                alt57=1;
            }
            else if ( (LA57_0==DEFAULT_T) ) {
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:653:5: CASE_T expression ( COLON_T | SEMI_COLON ) ( inner_statement_list )?
                    {
                    CASE_T215=(Token)match(input,CASE_T,FOLLOW_CASE_T_in_case_list2510); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE_T.add(CASE_T215);

                    pushFollow(FOLLOW_expression_in_case_list2512);
                    expression216=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression216.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:653:23: ( COLON_T | SEMI_COLON )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==COLON_T) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==SEMI_COLON) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:653:24: COLON_T
                            {
                            COLON_T217=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_case_list2515); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T217);


                            }
                            break;
                        case 2 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:653:34: SEMI_COLON
                            {
                            SEMI_COLON218=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_case_list2519); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON218);


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:653:46: ( inner_statement_list )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==LEFT_PARETHESIS||(LA54_0>=SEMI_COLON && LA54_0<=IDENTIFIER)||LA54_0==LEFT_BRACKET||(LA54_0>=INTERFACE_T && LA54_0<=REF_T)||(LA54_0>=WHILE_T && LA54_0<=FOREACH_T)||(LA54_0>=DECLARE_T && LA54_0<=STRINGLITERAL)||LA54_0==IF_T||(LA54_0>=PLUS_T && LA54_0<=MINUS_T)||(LA54_0>=UNSET_T && LA54_0<=MINUS_MINUS_T)||(LA54_0>=AT_T && LA54_0<=PRINT_T)||(LA54_0>=DOLLAR_T && LA54_0<=HERE_DOC)||(LA54_0>=173 && LA54_0<=175)||(LA54_0>=188 && LA54_0<=195)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:653:46: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_case_list2522);
                            inner_statement_list219=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list219.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                          token = (CommonToken)CASE_T215;
                          startIndex = token.getStartIndex();
                          token = (CommonToken)COLON_T217;
                          if ((SEMI_COLON218!=null?SEMI_COLON218.getText():null) != null) {
                            token = (CommonToken)SEMI_COLON218;
                          }
                          endIndex = token.getStopIndex();
                          if ((inner_statement_list219!=null?input.toString(inner_statement_list219.start,inner_statement_list219.stop):null) != null) {
                            endIndex = ((CommonToken)(inner_statement_list219!=null?((Token)inner_statement_list219.stop):null)).getStopIndex();
                          }
                        
                    }


                    // AST REWRITE
                    // elements: inner_statement_list, CASE_T, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 666:5: -> ^( CASE_T expression ( inner_statement_list )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:666:9: ^( CASE_T expression ( inner_statement_list )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_CASE_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:666:29: ( inner_statement_list )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:667:5: DEFAULT_T ( COLON_T | SEMI_COLON ) ( inner_statement_list )?
                    {
                    DEFAULT_T220=(Token)match(input,DEFAULT_T,FOLLOW_DEFAULT_T_in_case_list2554); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEFAULT_T.add(DEFAULT_T220);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:667:15: ( COLON_T | SEMI_COLON )
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
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:667:16: COLON_T
                            {
                            COLON_T221=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_case_list2557); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T221);


                            }
                            break;
                        case 2 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:667:26: SEMI_COLON
                            {
                            SEMI_COLON222=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_case_list2561); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON222);


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:667:38: ( inner_statement_list )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==LEFT_PARETHESIS||(LA56_0>=SEMI_COLON && LA56_0<=IDENTIFIER)||LA56_0==LEFT_BRACKET||(LA56_0>=INTERFACE_T && LA56_0<=REF_T)||(LA56_0>=WHILE_T && LA56_0<=FOREACH_T)||(LA56_0>=DECLARE_T && LA56_0<=STRINGLITERAL)||LA56_0==IF_T||(LA56_0>=PLUS_T && LA56_0<=MINUS_T)||(LA56_0>=UNSET_T && LA56_0<=MINUS_MINUS_T)||(LA56_0>=AT_T && LA56_0<=PRINT_T)||(LA56_0>=DOLLAR_T && LA56_0<=HERE_DOC)||(LA56_0>=173 && LA56_0<=175)||(LA56_0>=188 && LA56_0<=195)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:667:38: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_case_list2564);
                            inner_statement_list223=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list223.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                          token = (CommonToken)DEFAULT_T220;
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
                    // 680:5: -> ^( DEFAULT_T ( inner_statement_list )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:680:9: ^( DEFAULT_T ( inner_statement_list )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_DEFAULT_T.nextNode(), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:680:21: ( inner_statement_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:683:1: catch_branch : CATCH_T LEFT_PARETHESIS fully_qualified_class_name variable RIGHT_PARETHESIS block -> ^( CATCH_T fully_qualified_class_name variable block ) ;
    public final CompilerAstParser.catch_branch_return catch_branch() throws RecognitionException {
        CompilerAstParser.catch_branch_return retval = new CompilerAstParser.catch_branch_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token CATCH_T224=null;
        Token LEFT_PARETHESIS225=null;
        Token RIGHT_PARETHESIS228=null;
        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name226 = null;

        CompilerAstParser.variable_return variable227 = null;

        CompilerAstParser.block_return block229 = null;


        SLAST CATCH_T224_tree=null;
        SLAST LEFT_PARETHESIS225_tree=null;
        SLAST RIGHT_PARETHESIS228_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:693:3: ( CATCH_T LEFT_PARETHESIS fully_qualified_class_name variable RIGHT_PARETHESIS block -> ^( CATCH_T fully_qualified_class_name variable block ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:693:5: CATCH_T LEFT_PARETHESIS fully_qualified_class_name variable RIGHT_PARETHESIS block
            {
            CATCH_T224=(Token)match(input,CATCH_T,FOLLOW_CATCH_T_in_catch_branch2613); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CATCH_T.add(CATCH_T224);

            LEFT_PARETHESIS225=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_catch_branch2615); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS225);

            pushFollow(FOLLOW_fully_qualified_class_name_in_catch_branch2617);
            fully_qualified_class_name226=fully_qualified_class_name();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name226.getTree());
            pushFollow(FOLLOW_variable_in_catch_branch2619);
            variable227=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable227.getTree());
            RIGHT_PARETHESIS228=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_catch_branch2621); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS228);

            pushFollow(FOLLOW_block_in_catch_branch2629);
            block229=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block229.getTree());
            if ( state.backtracking==0 ) {

              	    token = (CommonToken)CATCH_T224;
              	    startIndex = token.getStartIndex();
              	    token = (CommonToken)(block229!=null?((Token)block229.stop):null);
              	    endIndex = token.getStopIndex();  
                  
            }


            // AST REWRITE
            // elements: block, variable, CATCH_T, fully_qualified_class_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 701:5: -> ^( CATCH_T fully_qualified_class_name variable block )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:701:9: ^( CATCH_T fully_qualified_class_name variable block )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:704:1: for_statement : ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOR_T SEMI_COLON -> ( inner_statement_list )? );
    public final CompilerAstParser.for_statement_return for_statement() throws RecognitionException {
        CompilerAstParser.for_statement_return retval = new CompilerAstParser.for_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COLON_T231=null;
        Token ENDFOR_T233=null;
        Token SEMI_COLON234=null;
        CompilerAstParser.statement_return statement230 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list232 = null;


        SLAST COLON_T231_tree=null;
        SLAST ENDFOR_T233_tree=null;
        SLAST SEMI_COLON234_tree=null;
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_ENDFOR_T=new RewriteRuleTokenStream(adaptor,"token ENDFOR_T");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:714:2: ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOR_T SEMI_COLON -> ( inner_statement_list )? )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LEFT_PARETHESIS||LA59_0==SEMI_COLON||LA59_0==IDENTIFIER||LA59_0==LEFT_BRACKET||LA59_0==REF_T||(LA59_0>=WHILE_T && LA59_0<=FOREACH_T)||(LA59_0>=DECLARE_T && LA59_0<=STRINGLITERAL)||LA59_0==IF_T||(LA59_0>=PLUS_T && LA59_0<=MINUS_T)||(LA59_0>=UNSET_T && LA59_0<=MINUS_MINUS_T)||(LA59_0>=AT_T && LA59_0<=PRINT_T)||(LA59_0>=DOLLAR_T && LA59_0<=HERE_DOC)||(LA59_0>=188 && LA59_0<=195)) ) {
                alt59=1;
            }
            else if ( (LA59_0==COLON_T) ) {
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:714:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_for_statement2674);
                    statement230=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement230.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(statement230!=null?((Token)statement230.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(statement230!=null?((Token)statement230.stop):null)).getStopIndex();
                       
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
                    // 719:4: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:720:4: COLON_T ( inner_statement_list )? ENDFOR_T SEMI_COLON
                    {
                    COLON_T231=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_for_statement2690); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T231);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:720:12: ( inner_statement_list )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==LEFT_PARETHESIS||(LA58_0>=SEMI_COLON && LA58_0<=IDENTIFIER)||LA58_0==LEFT_BRACKET||(LA58_0>=INTERFACE_T && LA58_0<=REF_T)||(LA58_0>=WHILE_T && LA58_0<=FOREACH_T)||(LA58_0>=DECLARE_T && LA58_0<=STRINGLITERAL)||LA58_0==IF_T||(LA58_0>=PLUS_T && LA58_0<=MINUS_T)||(LA58_0>=UNSET_T && LA58_0<=MINUS_MINUS_T)||(LA58_0>=AT_T && LA58_0<=PRINT_T)||(LA58_0>=DOLLAR_T && LA58_0<=HERE_DOC)||(LA58_0>=173 && LA58_0<=175)||(LA58_0>=188 && LA58_0<=195)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:720:12: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_for_statement2692);
                            inner_statement_list232=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list232.getTree());

                            }
                            break;

                    }

                    ENDFOR_T233=(Token)match(input,ENDFOR_T,FOLLOW_ENDFOR_T_in_for_statement2695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDFOR_T.add(ENDFOR_T233);

                    SEMI_COLON234=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_for_statement2697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON234);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)COLON_T231).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON234).getStopIndex();
                       
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
                    // 725:4: -> ( inner_statement_list )?
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:725:8: ( inner_statement_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:728:1: while_statement : ( statement -> statement | COLON_T ( inner_statement_list )? ENDWHILE_T SEMI_COLON -> ( inner_statement_list )? );
    public final CompilerAstParser.while_statement_return while_statement() throws RecognitionException {
        CompilerAstParser.while_statement_return retval = new CompilerAstParser.while_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COLON_T236=null;
        Token ENDWHILE_T238=null;
        Token SEMI_COLON239=null;
        CompilerAstParser.statement_return statement235 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list237 = null;


        SLAST COLON_T236_tree=null;
        SLAST ENDWHILE_T238_tree=null;
        SLAST SEMI_COLON239_tree=null;
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_ENDWHILE_T=new RewriteRuleTokenStream(adaptor,"token ENDWHILE_T");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:738:2: ( statement -> statement | COLON_T ( inner_statement_list )? ENDWHILE_T SEMI_COLON -> ( inner_statement_list )? )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LEFT_PARETHESIS||LA61_0==SEMI_COLON||LA61_0==IDENTIFIER||LA61_0==LEFT_BRACKET||LA61_0==REF_T||(LA61_0>=WHILE_T && LA61_0<=FOREACH_T)||(LA61_0>=DECLARE_T && LA61_0<=STRINGLITERAL)||LA61_0==IF_T||(LA61_0>=PLUS_T && LA61_0<=MINUS_T)||(LA61_0>=UNSET_T && LA61_0<=MINUS_MINUS_T)||(LA61_0>=AT_T && LA61_0<=PRINT_T)||(LA61_0>=DOLLAR_T && LA61_0<=HERE_DOC)||(LA61_0>=188 && LA61_0<=195)) ) {
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:738:4: statement
                    {
                    pushFollow(FOLLOW_statement_in_while_statement2731);
                    statement235=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement235.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(statement235!=null?((Token)statement235.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(statement235!=null?((Token)statement235.stop):null)).getStopIndex();
                        
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
                    // 743:4: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:744:4: COLON_T ( inner_statement_list )? ENDWHILE_T SEMI_COLON
                    {
                    COLON_T236=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_while_statement2748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T236);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:744:12: ( inner_statement_list )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==LEFT_PARETHESIS||(LA60_0>=SEMI_COLON && LA60_0<=IDENTIFIER)||LA60_0==LEFT_BRACKET||(LA60_0>=INTERFACE_T && LA60_0<=REF_T)||(LA60_0>=WHILE_T && LA60_0<=FOREACH_T)||(LA60_0>=DECLARE_T && LA60_0<=STRINGLITERAL)||LA60_0==IF_T||(LA60_0>=PLUS_T && LA60_0<=MINUS_T)||(LA60_0>=UNSET_T && LA60_0<=MINUS_MINUS_T)||(LA60_0>=AT_T && LA60_0<=PRINT_T)||(LA60_0>=DOLLAR_T && LA60_0<=HERE_DOC)||(LA60_0>=173 && LA60_0<=175)||(LA60_0>=188 && LA60_0<=195)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:744:12: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_while_statement2750);
                            inner_statement_list237=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list237.getTree());

                            }
                            break;

                    }

                    ENDWHILE_T238=(Token)match(input,ENDWHILE_T,FOLLOW_ENDWHILE_T_in_while_statement2753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDWHILE_T.add(ENDWHILE_T238);

                    SEMI_COLON239=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_while_statement2755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON239);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)COLON_T236).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON239).getStopIndex();
                        
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
                    // 749:4: -> ( inner_statement_list )?
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:749:8: ( inner_statement_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:752:1: foreach_statement : ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOREACH_T SEMI_COLON -> ( inner_statement_list )? );
    public final CompilerAstParser.foreach_statement_return foreach_statement() throws RecognitionException {
        CompilerAstParser.foreach_statement_return retval = new CompilerAstParser.foreach_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COLON_T241=null;
        Token ENDFOREACH_T243=null;
        Token SEMI_COLON244=null;
        CompilerAstParser.statement_return statement240 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list242 = null;


        SLAST COLON_T241_tree=null;
        SLAST ENDFOREACH_T243_tree=null;
        SLAST SEMI_COLON244_tree=null;
        RewriteRuleTokenStream stream_ENDFOREACH_T=new RewriteRuleTokenStream(adaptor,"token ENDFOREACH_T");
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:763:3: ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOREACH_T SEMI_COLON -> ( inner_statement_list )? )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LEFT_PARETHESIS||LA63_0==SEMI_COLON||LA63_0==IDENTIFIER||LA63_0==LEFT_BRACKET||LA63_0==REF_T||(LA63_0>=WHILE_T && LA63_0<=FOREACH_T)||(LA63_0>=DECLARE_T && LA63_0<=STRINGLITERAL)||LA63_0==IF_T||(LA63_0>=PLUS_T && LA63_0<=MINUS_T)||(LA63_0>=UNSET_T && LA63_0<=MINUS_MINUS_T)||(LA63_0>=AT_T && LA63_0<=PRINT_T)||(LA63_0>=DOLLAR_T && LA63_0<=HERE_DOC)||(LA63_0>=188 && LA63_0<=195)) ) {
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:763:5: statement
                    {
                    pushFollow(FOLLOW_statement_in_foreach_statement2791);
                    statement240=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement240.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(statement240!=null?((Token)statement240.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(statement240!=null?((Token)statement240.stop):null)).getStopIndex();
                        
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
                    // 768:4: -> statement
                    {
                        adaptor.addChild(root_0, stream_statement.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:769:5: COLON_T ( inner_statement_list )? ENDFOREACH_T SEMI_COLON
                    {
                    COLON_T241=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_foreach_statement2809); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T241);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:769:13: ( inner_statement_list )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==LEFT_PARETHESIS||(LA62_0>=SEMI_COLON && LA62_0<=IDENTIFIER)||LA62_0==LEFT_BRACKET||(LA62_0>=INTERFACE_T && LA62_0<=REF_T)||(LA62_0>=WHILE_T && LA62_0<=FOREACH_T)||(LA62_0>=DECLARE_T && LA62_0<=STRINGLITERAL)||LA62_0==IF_T||(LA62_0>=PLUS_T && LA62_0<=MINUS_T)||(LA62_0>=UNSET_T && LA62_0<=MINUS_MINUS_T)||(LA62_0>=AT_T && LA62_0<=PRINT_T)||(LA62_0>=DOLLAR_T && LA62_0<=HERE_DOC)||(LA62_0>=173 && LA62_0<=175)||(LA62_0>=188 && LA62_0<=195)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:769:13: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_foreach_statement2811);
                            inner_statement_list242=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list242.getTree());

                            }
                            break;

                    }

                    ENDFOREACH_T243=(Token)match(input,ENDFOREACH_T,FOLLOW_ENDFOREACH_T_in_foreach_statement2814); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDFOREACH_T.add(ENDFOREACH_T243);

                    SEMI_COLON244=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_foreach_statement2816); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON244);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)COLON_T241).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON244).getStopIndex();
                        
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
                    // 774:4: -> ( inner_statement_list )?
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:774:8: ( inner_statement_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:777:1: declare_statement : ( statement -> ^( BLOCK statement ) | COLON_T ( inner_statement_list )? ENDDECLARE_T SEMI_COLON -> ^( BLOCK ( inner_statement_list )? ) );
    public final CompilerAstParser.declare_statement_return declare_statement() throws RecognitionException {
        CompilerAstParser.declare_statement_return retval = new CompilerAstParser.declare_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COLON_T246=null;
        Token ENDDECLARE_T248=null;
        Token SEMI_COLON249=null;
        CompilerAstParser.statement_return statement245 = null;

        CompilerAstParser.inner_statement_list_return inner_statement_list247 = null;


        SLAST COLON_T246_tree=null;
        SLAST ENDDECLARE_T248_tree=null;
        SLAST SEMI_COLON249_tree=null;
        RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleTokenStream stream_ENDDECLARE_T=new RewriteRuleTokenStream(adaptor,"token ENDDECLARE_T");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:790:3: ( statement -> ^( BLOCK statement ) | COLON_T ( inner_statement_list )? ENDDECLARE_T SEMI_COLON -> ^( BLOCK ( inner_statement_list )? ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==LEFT_PARETHESIS||LA65_0==SEMI_COLON||LA65_0==IDENTIFIER||LA65_0==LEFT_BRACKET||LA65_0==REF_T||(LA65_0>=WHILE_T && LA65_0<=FOREACH_T)||(LA65_0>=DECLARE_T && LA65_0<=STRINGLITERAL)||LA65_0==IF_T||(LA65_0>=PLUS_T && LA65_0<=MINUS_T)||(LA65_0>=UNSET_T && LA65_0<=MINUS_MINUS_T)||(LA65_0>=AT_T && LA65_0<=PRINT_T)||(LA65_0>=DOLLAR_T && LA65_0<=HERE_DOC)||(LA65_0>=188 && LA65_0<=195)) ) {
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:790:5: statement
                    {
                    pushFollow(FOLLOW_statement_in_declare_statement2854);
                    statement245=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement245.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(statement245!=null?((Token)statement245.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(statement245!=null?((Token)statement245.stop):null)).getStopIndex();
                        
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
                    // 795:5: -> ^( BLOCK statement )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:795:9: ^( BLOCK statement )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:796:5: COLON_T ( inner_statement_list )? ENDDECLARE_T SEMI_COLON
                    {
                    COLON_T246=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_declare_statement2877); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T246);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:796:13: ( inner_statement_list )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==LEFT_PARETHESIS||(LA64_0>=SEMI_COLON && LA64_0<=IDENTIFIER)||LA64_0==LEFT_BRACKET||(LA64_0>=INTERFACE_T && LA64_0<=REF_T)||(LA64_0>=WHILE_T && LA64_0<=FOREACH_T)||(LA64_0>=DECLARE_T && LA64_0<=STRINGLITERAL)||LA64_0==IF_T||(LA64_0>=PLUS_T && LA64_0<=MINUS_T)||(LA64_0>=UNSET_T && LA64_0<=MINUS_MINUS_T)||(LA64_0>=AT_T && LA64_0<=PRINT_T)||(LA64_0>=DOLLAR_T && LA64_0<=HERE_DOC)||(LA64_0>=173 && LA64_0<=175)||(LA64_0>=188 && LA64_0<=195)) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:796:13: inner_statement_list
                            {
                            pushFollow(FOLLOW_inner_statement_list_in_declare_statement2879);
                            inner_statement_list247=inner_statement_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list247.getTree());

                            }
                            break;

                    }

                    ENDDECLARE_T248=(Token)match(input,ENDDECLARE_T,FOLLOW_ENDDECLARE_T_in_declare_statement2882); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENDDECLARE_T.add(ENDDECLARE_T248);

                    SEMI_COLON249=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_declare_statement2884); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON249);

                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)COLON_T246).getStartIndex();
                          endIndex = ((CommonToken)SEMI_COLON249).getStopIndex();
                        
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
                    // 801:5: -> ^( BLOCK ( inner_statement_list )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:801:9: ^( BLOCK ( inner_statement_list )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(BLOCK, "BLOCK"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:801:17: ( inner_statement_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:804:1: parameter_list : p1= parameter ( COMMA_T p2= parameter )* -> ( parameter )+ ;
    public final CompilerAstParser.parameter_list_return parameter_list() throws RecognitionException {
        CompilerAstParser.parameter_list_return retval = new CompilerAstParser.parameter_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T250=null;
        CompilerAstParser.parameter_return p1 = null;

        CompilerAstParser.parameter_return p2 = null;


        SLAST COMMA_T250_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:814:3: (p1= parameter ( COMMA_T p2= parameter )* -> ( parameter )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:814:5: p1= parameter ( COMMA_T p2= parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameter_list2930);
            p1=parameter();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter.add(p1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:814:18: ( COMMA_T p2= parameter )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==COMMA_T) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:814:19: COMMA_T p2= parameter
            	    {
            	    COMMA_T250=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_parameter_list2933); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T250);

            	    pushFollow(FOLLOW_parameter_in_parameter_list2937);
            	    p2=parameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter.add(p2.getTree());

            	    }
            	    break;

            	default :
            	    break loop66;
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
            // 824:5: -> ( parameter )+
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:827:1: parameter : ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T scalar )? -> ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) ;
    public final CompilerAstParser.parameter_return parameter() throws RecognitionException {
        CompilerAstParser.parameter_return retval = new CompilerAstParser.parameter_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token CONST_T252=null;
        Token EQUAL_T254=null;
        CompilerAstParser.parameter_type_return parameter_type251 = null;

        CompilerAstParser.pure_variable_return pure_variable253 = null;

        CompilerAstParser.scalar_return scalar255 = null;


        SLAST CONST_T252_tree=null;
        SLAST EQUAL_T254_tree=null;
        RewriteRuleTokenStream stream_EQUAL_T=new RewriteRuleTokenStream(adaptor,"token EQUAL_T");
        RewriteRuleTokenStream stream_CONST_T=new RewriteRuleTokenStream(adaptor,"token CONST_T");
        RewriteRuleSubtreeStream stream_scalar=new RewriteRuleSubtreeStream(adaptor,"rule scalar");
        RewriteRuleSubtreeStream stream_parameter_type=new RewriteRuleSubtreeStream(adaptor,"rule parameter_type");
        RewriteRuleSubtreeStream stream_pure_variable=new RewriteRuleSubtreeStream(adaptor,"rule pure_variable");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:837:3: ( ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T scalar )? -> ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:837:5: ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T scalar )?
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:837:5: ( parameter_type )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==IDENTIFIER||(LA67_0>=UNSET_T && LA67_0<=CLONE_T)||(LA67_0>=180 && LA67_0<=188)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:837:5: parameter_type
                    {
                    pushFollow(FOLLOW_parameter_type_in_parameter2987);
                    parameter_type251=parameter_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_type.add(parameter_type251.getTree());

                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:837:21: ( CONST_T )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==CONST_T) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:837:21: CONST_T
                    {
                    CONST_T252=(Token)match(input,CONST_T,FOLLOW_CONST_T_in_parameter2990); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST_T.add(CONST_T252);


                    }
                    break;

            }

            pushFollow(FOLLOW_pure_variable_in_parameter2993);
            pure_variable253=pure_variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pure_variable.add(pure_variable253.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:837:44: ( options {k=1; backtrack=true; } : EQUAL_T scalar )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==EQUAL_T) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:837:76: EQUAL_T scalar
                    {
                    EQUAL_T254=(Token)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_parameter3009); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL_T.add(EQUAL_T254);

                    pushFollow(FOLLOW_scalar_in_parameter3011);
                    scalar255=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_scalar.add(scalar255.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(pure_variable253!=null?((Token)pure_variable253.start):null);
                  if ((parameter_type251!=null?input.toString(parameter_type251.start,parameter_type251.stop):null) != null) {
                    token = (CommonToken)(parameter_type251!=null?((Token)parameter_type251.start):null);
                  }
                  else if ((CONST_T252!=null?CONST_T252.getText():null) != null) {
                    token = (CommonToken)CONST_T252;
                  }
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(pure_variable253!=null?((Token)pure_variable253.stop):null);
                  if ((scalar255!=null?input.toString(scalar255.start,scalar255.stop):null) != null) {
                    token = (CommonToken)(scalar255!=null?((Token)scalar255.stop):null);
                  }
                  endIndex = token.getStopIndex();
                
            }


            // AST REWRITE
            // elements: CONST_T, scalar, pure_variable, parameter_type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 854:3: -> ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:854:6: ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(PARAMETER, "PARAMETER"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:854:18: ( ^( TYPE parameter_type ) )?
                if ( stream_parameter_type.hasNext() ) {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:854:18: ^( TYPE parameter_type )
                    {
                    SLAST root_2 = (SLAST)adaptor.nil();
                    root_2 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(TYPE, "TYPE"), root_2);

                    adaptor.addChild(root_2, stream_parameter_type.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_parameter_type.reset();
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:854:42: ( CONST_T )?
                if ( stream_CONST_T.hasNext() ) {
                    adaptor.addChild(root_1, stream_CONST_T.nextNode());

                }
                stream_CONST_T.reset();
                adaptor.addChild(root_1, stream_pure_variable.nextTree());
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:854:65: ( scalar )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:857:1: parameter_type : ( fully_qualified_class_name | cast_option );
    public final CompilerAstParser.parameter_type_return parameter_type() throws RecognitionException {
        CompilerAstParser.parameter_type_return retval = new CompilerAstParser.parameter_type_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name256 = null;

        CompilerAstParser.cast_option_return cast_option257 = null;




          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:867:3: ( fully_qualified_class_name | cast_option )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==IDENTIFIER) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=UNSET_T && LA70_0<=CLONE_T)||(LA70_0>=180 && LA70_0<=188)) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:867:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_fully_qualified_class_name_in_parameter_type3070);
                    fully_qualified_class_name256=fully_qualified_class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fully_qualified_class_name256.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(fully_qualified_class_name256!=null?((Token)fully_qualified_class_name256.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(fully_qualified_class_name256!=null?((Token)fully_qualified_class_name256.stop):null)).getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:872:5: cast_option
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_cast_option_in_parameter_type3080);
                    cast_option257=cast_option();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_option257.getTree());
                    if ( state.backtracking==0 ) {

                          startIndex = ((CommonToken)(cast_option257!=null?((Token)cast_option257.start):null)).getStartIndex();
                          endIndex = ((CommonToken)(cast_option257!=null?((Token)cast_option257.stop):null)).getStopIndex();
                        
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:879:1: variable_list : v1= variable ( COMMA_T v2= variable )* -> ( variable )+ ;
    public final CompilerAstParser.variable_list_return variable_list() throws RecognitionException {
        CompilerAstParser.variable_list_return retval = new CompilerAstParser.variable_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T258=null;
        CompilerAstParser.variable_return v1 = null;

        CompilerAstParser.variable_return v2 = null;


        SLAST COMMA_T258_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:889:3: (v1= variable ( COMMA_T v2= variable )* -> ( variable )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:889:5: v1= variable ( COMMA_T v2= variable )*
            {
            pushFollow(FOLLOW_variable_in_variable_list3111);
            v1=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(v1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:889:17: ( COMMA_T v2= variable )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==COMMA_T) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:889:18: COMMA_T v2= variable
            	    {
            	    COMMA_T258=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_variable_list3114); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T258);

            	    pushFollow(FOLLOW_variable_in_variable_list3118);
            	    v2=variable();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variable.add(v2.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
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
            // 899:5: -> ( variable )+
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:902:1: variable_modifiers : ( 'var' | modifier );
    public final CompilerAstParser.variable_modifiers_return variable_modifiers() throws RecognitionException {
        CompilerAstParser.variable_modifiers_return retval = new CompilerAstParser.variable_modifiers_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token string_literal259=null;
        CompilerAstParser.modifier_return modifier260 = null;


        SLAST string_literal259_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:903:3: ( 'var' | modifier )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==176) ) {
                alt72=1;
            }
            else if ( (LA72_0==STATIC_T||(LA72_0>=174 && LA72_0<=175)||(LA72_0>=177 && LA72_0<=179)) ) {
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:903:5: 'var'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    string_literal259=(Token)match(input,176,FOLLOW_176_in_variable_modifiers3149); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal259_tree = (SLAST)adaptor.create(string_literal259);
                    adaptor.addChild(root_0, string_literal259_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:904:5: modifier
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_modifier_in_variable_modifiers3155);
                    modifier260=modifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier260.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:907:1: modifier : ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+ ;
    public final CompilerAstParser.modifier_return modifier() throws RecognitionException {
        CompilerAstParser.modifier_return retval = new CompilerAstParser.modifier_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set261=null;

        SLAST set261_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:908:3: ( ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:908:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:908:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==STATIC_T||(LA73_0>=174 && LA73_0<=175)||(LA73_0>=177 && LA73_0<=179)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:
            	    {
            	    set261=(Token)input.LT(1);
            	    if ( input.LA(1)==STATIC_T||(input.LA(1)>=174 && input.LA(1)<=175)||(input.LA(1)>=177 && input.LA(1)<=179) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set261));
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
            	    if ( cnt73 >= 1 ) break loop73;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:916:1: directive : d1= directive_element ( COMMA_T d2= directive_element )* -> ( directive_element )+ ;
    public final CompilerAstParser.directive_return directive() throws RecognitionException {
        CompilerAstParser.directive_return retval = new CompilerAstParser.directive_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T262=null;
        CompilerAstParser.directive_element_return d1 = null;

        CompilerAstParser.directive_element_return d2 = null;


        SLAST COMMA_T262_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_directive_element=new RewriteRuleSubtreeStream(adaptor,"rule directive_element");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:926:3: (d1= directive_element ( COMMA_T d2= directive_element )* -> ( directive_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:926:5: d1= directive_element ( COMMA_T d2= directive_element )*
            {
            pushFollow(FOLLOW_directive_element_in_directive3232);
            d1=directive_element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_directive_element.add(d1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:926:26: ( COMMA_T d2= directive_element )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==COMMA_T) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:926:27: COMMA_T d2= directive_element
            	    {
            	    COMMA_T262=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_directive3235); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T262);

            	    pushFollow(FOLLOW_directive_element_in_directive3239);
            	    d2=directive_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_directive_element.add(d2.getTree());

            	    }
            	    break;

            	default :
            	    break loop74;
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
            // 936:4: -> ( directive_element )+
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:939:1: directive_element : IDENTIFIER EQUAL_T expression -> ^( EQUAL_T IDENTIFIER expression ) ;
    public final CompilerAstParser.directive_element_return directive_element() throws RecognitionException {
        CompilerAstParser.directive_element_return retval = new CompilerAstParser.directive_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token IDENTIFIER263=null;
        Token EQUAL_T264=null;
        CompilerAstParser.expression_return expression265 = null;


        SLAST IDENTIFIER263_tree=null;
        SLAST EQUAL_T264_tree=null;
        RewriteRuleTokenStream stream_EQUAL_T=new RewriteRuleTokenStream(adaptor,"token EQUAL_T");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:949:3: ( IDENTIFIER EQUAL_T expression -> ^( EQUAL_T IDENTIFIER expression ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:949:5: IDENTIFIER EQUAL_T expression
            {
            IDENTIFIER263=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_directive_element3282); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER263);

            EQUAL_T264=(Token)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_directive_element3284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL_T.add(EQUAL_T264);

            pushFollow(FOLLOW_expression_in_directive_element3286);
            expression265=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression265.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)IDENTIFIER263;
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(expression265!=null?((Token)expression265.stop):null);
                  endIndex = token.getStopIndex();  
                
            }


            // AST REWRITE
            // elements: IDENTIFIER, EQUAL_T, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 956:5: -> ^( EQUAL_T IDENTIFIER expression )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:956:9: ^( EQUAL_T IDENTIFIER expression )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:959:1: expr_list : e1= expression ( COMMA_T e2= expression )* -> ( expression )+ ;
    public final CompilerAstParser.expr_list_return expr_list() throws RecognitionException {
        CompilerAstParser.expr_list_return retval = new CompilerAstParser.expr_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T266=null;
        CompilerAstParser.expression_return e1 = null;

        CompilerAstParser.expression_return e2 = null;


        SLAST COMMA_T266_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:969:2: (e1= expression ( COMMA_T e2= expression )* -> ( expression )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:969:4: e1= expression ( COMMA_T e2= expression )*
            {
            pushFollow(FOLLOW_expression_in_expr_list3331);
            e1=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:969:18: ( COMMA_T e2= expression )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==COMMA_T) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:969:19: COMMA_T e2= expression
            	    {
            	    COMMA_T266=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_expr_list3334); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T266);

            	    pushFollow(FOLLOW_expression_in_expr_list3338);
            	    e2=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
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
            // 979:5: -> ( expression )+
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:982:1: expression : logical_text_or_expr -> ^( EXPR logical_text_or_expr ) ;
    public final CompilerAstParser.expression_return expression() throws RecognitionException {
        CompilerAstParser.expression_return retval = new CompilerAstParser.expression_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.logical_text_or_expr_return logical_text_or_expr267 = null;


        RewriteRuleSubtreeStream stream_logical_text_or_expr=new RewriteRuleSubtreeStream(adaptor,"rule logical_text_or_expr");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:993:3: ( logical_text_or_expr -> ^( EXPR logical_text_or_expr ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:993:5: logical_text_or_expr
            {
            pushFollow(FOLLOW_logical_text_or_expr_in_expression3379);
            logical_text_or_expr267=logical_text_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_logical_text_or_expr.add(logical_text_or_expr267.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(logical_text_or_expr267!=null?((Token)logical_text_or_expr267.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(logical_text_or_expr267!=null?((Token)logical_text_or_expr267.stop):null);
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
            // 1000:5: -> ^( EXPR logical_text_or_expr )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1000:9: ^( EXPR logical_text_or_expr )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1003:1: logical_text_or_expr : e1= logical_text_xor_expr ( OR_T e2= logical_text_xor_expr )* ;
    public final CompilerAstParser.logical_text_or_expr_return logical_text_or_expr() throws RecognitionException {
        CompilerAstParser.logical_text_or_expr_return retval = new CompilerAstParser.logical_text_or_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token OR_T268=null;
        CompilerAstParser.logical_text_xor_expr_return e1 = null;

        CompilerAstParser.logical_text_xor_expr_return e2 = null;


        SLAST OR_T268_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1013:3: (e1= logical_text_xor_expr ( OR_T e2= logical_text_xor_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1013:5: e1= logical_text_xor_expr ( OR_T e2= logical_text_xor_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3422);
            e1=logical_text_xor_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1013:30: ( OR_T e2= logical_text_xor_expr )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==OR_T) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1013:31: OR_T e2= logical_text_xor_expr
            	    {
            	    OR_T268=(Token)match(input,OR_T,FOLLOW_OR_T_in_logical_text_or_expr3425); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    OR_T268_tree = (SLAST)adaptor.create(OR_T268);
            	    root_0 = (SLAST)adaptor.becomeRoot(OR_T268_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3430);
            	    e2=logical_text_xor_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1025:1: logical_text_xor_expr : e1= logical_text_and_expr ( XOR_T e2= logical_text_and_expr )* ;
    public final CompilerAstParser.logical_text_xor_expr_return logical_text_xor_expr() throws RecognitionException {
        CompilerAstParser.logical_text_xor_expr_return retval = new CompilerAstParser.logical_text_xor_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token XOR_T269=null;
        CompilerAstParser.logical_text_and_expr_return e1 = null;

        CompilerAstParser.logical_text_and_expr_return e2 = null;


        SLAST XOR_T269_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1035:3: (e1= logical_text_and_expr ( XOR_T e2= logical_text_and_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1035:5: e1= logical_text_and_expr ( XOR_T e2= logical_text_and_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3461);
            e1=logical_text_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1035:30: ( XOR_T e2= logical_text_and_expr )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==XOR_T) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1035:31: XOR_T e2= logical_text_and_expr
            	    {
            	    XOR_T269=(Token)match(input,XOR_T,FOLLOW_XOR_T_in_logical_text_xor_expr3464); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    XOR_T269_tree = (SLAST)adaptor.create(XOR_T269);
            	    root_0 = (SLAST)adaptor.becomeRoot(XOR_T269_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3469);
            	    e2=logical_text_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1047:1: logical_text_and_expr : e1= assignment_expr ( AND_T e2= assignment_expr )* ;
    public final CompilerAstParser.logical_text_and_expr_return logical_text_and_expr() throws RecognitionException {
        CompilerAstParser.logical_text_and_expr_return retval = new CompilerAstParser.logical_text_and_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token AND_T270=null;
        CompilerAstParser.assignment_expr_return e1 = null;

        CompilerAstParser.assignment_expr_return e2 = null;


        SLAST AND_T270_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1057:3: (e1= assignment_expr ( AND_T e2= assignment_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1057:5: e1= assignment_expr ( AND_T e2= assignment_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_assignment_expr_in_logical_text_and_expr3500);
            e1=assignment_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1057:24: ( AND_T e2= assignment_expr )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==AND_T) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1057:25: AND_T e2= assignment_expr
            	    {
            	    AND_T270=(Token)match(input,AND_T,FOLLOW_AND_T_in_logical_text_and_expr3503); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    AND_T270_tree = (SLAST)adaptor.create(AND_T270);
            	    root_0 = (SLAST)adaptor.becomeRoot(AND_T270_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_assignment_expr_in_logical_text_and_expr3508);
            	    e2=assignment_expr();

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
    // $ANTLR end "logical_text_and_expr"

    public static class assignment_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1069:1: assignment_expr : e1= conditional_expr ( assignment_operator e2= conditional_expr )* ;
    public final CompilerAstParser.assignment_expr_return assignment_expr() throws RecognitionException {
        CompilerAstParser.assignment_expr_return retval = new CompilerAstParser.assignment_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.conditional_expr_return e1 = null;

        CompilerAstParser.conditional_expr_return e2 = null;

        CompilerAstParser.assignment_operator_return assignment_operator271 = null;




          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1079:3: (e1= conditional_expr ( assignment_operator e2= conditional_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1079:5: e1= conditional_expr ( assignment_operator e2= conditional_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_conditional_expr_in_assignment_expr3539);
            e1=conditional_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1079:25: ( assignment_operator e2= conditional_expr )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==EQUAL_T||(LA79_0>=PLUS_EQ && LA79_0<=RMOVE_EQ)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1079:26: assignment_operator e2= conditional_expr
            	    {
            	    pushFollow(FOLLOW_assignment_operator_in_assignment_expr3542);
            	    assignment_operator271=assignment_operator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot(assignment_operator271.getTree(), root_0);
            	    pushFollow(FOLLOW_conditional_expr_in_assignment_expr3547);
            	    e2=conditional_expr();

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
    // $ANTLR end "assignment_expr"

    public static class assignment_operator_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_operator"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1091:1: assignment_operator : ( EQUAL_T | PLUS_EQ | MINUS_EQ | MUL_EQ | DIV_EQ | DOT_EQ | PERCENT_EQ | BIT_AND_EQ | BIT_OR_EQ | POWER_EQ | LMOVE_EQ | RMOVE_EQ );
    public final CompilerAstParser.assignment_operator_return assignment_operator() throws RecognitionException {
        CompilerAstParser.assignment_operator_return retval = new CompilerAstParser.assignment_operator_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set272=null;

        SLAST set272_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1092:3: ( EQUAL_T | PLUS_EQ | MINUS_EQ | MUL_EQ | DIV_EQ | DOT_EQ | PERCENT_EQ | BIT_AND_EQ | BIT_OR_EQ | POWER_EQ | LMOVE_EQ | RMOVE_EQ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set272=(Token)input.LT(1);
            if ( input.LA(1)==EQUAL_T||(input.LA(1)>=PLUS_EQ && input.LA(1)<=RMOVE_EQ) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set272));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1106:1: conditional_expr : (ll= logical_or_expr -> $ll) ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )? ;
    public final CompilerAstParser.conditional_expr_return conditional_expr() throws RecognitionException {
        CompilerAstParser.conditional_expr_return retval = new CompilerAstParser.conditional_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token QUESTION_T273=null;
        Token COLON_T275=null;
        CompilerAstParser.logical_or_expr_return ll = null;

        CompilerAstParser.logical_or_expr_return lr = null;

        CompilerAstParser.expression_return expression274 = null;


        SLAST QUESTION_T273_tree=null;
        SLAST COLON_T275_tree=null;
        RewriteRuleTokenStream stream_QUESTION_T=new RewriteRuleTokenStream(adaptor,"token QUESTION_T");
        RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_logical_or_expr=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expr");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1117:3: ( (ll= logical_or_expr -> $ll) ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1117:5: (ll= logical_or_expr -> $ll) ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )?
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1117:5: (ll= logical_or_expr -> $ll)
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1117:6: ll= logical_or_expr
            {
            pushFollow(FOLLOW_logical_or_expr_in_conditional_expr3683);
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
            // 1124:4: -> $ll
            {
                adaptor.addChild(root_0, stream_ll.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1125:4: ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==QUESTION_T) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1125:5: QUESTION_T ( expression )? COLON_T lr= logical_or_expr
                    {
                    QUESTION_T273=(Token)match(input,QUESTION_T,FOLLOW_QUESTION_T_in_conditional_expr3702); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUESTION_T.add(QUESTION_T273);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1125:16: ( expression )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==LEFT_PARETHESIS||LA80_0==IDENTIFIER||LA80_0==REF_T||LA80_0==STRINGLITERAL||(LA80_0>=PLUS_T && LA80_0<=MINUS_T)||(LA80_0>=UNSET_T && LA80_0<=MINUS_MINUS_T)||(LA80_0>=AT_T && LA80_0<=PRINT_T)||(LA80_0>=DOLLAR_T && LA80_0<=HERE_DOC)||(LA80_0>=188 && LA80_0<=195)) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1125:16: expression
                            {
                            pushFollow(FOLLOW_expression_in_conditional_expr3704);
                            expression274=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_expression.add(expression274.getTree());

                            }
                            break;

                    }

                    COLON_T275=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_conditional_expr3707); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T275);

                    pushFollow(FOLLOW_logical_or_expr_in_conditional_expr3711);
                    lr=logical_or_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_logical_or_expr.add(lr.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(lr!=null?((Token)lr.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: lr, COLON_T, ll, expression, QUESTION_T
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
                    // 1129:5: -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1129:8: ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot(stream_QUESTION_T.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ll.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1129:25: ^( COLON_T ( expression )? $lr)
                        {
                        SLAST root_2 = (SLAST)adaptor.nil();
                        root_2 = (SLAST)adaptor.becomeRoot(stream_COLON_T.nextNode(), root_2);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1129:35: ( expression )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1132:1: logical_or_expr : e1= logical_and_expr ( LOGICAL_OR_T e2= logical_and_expr )* ;
    public final CompilerAstParser.logical_or_expr_return logical_or_expr() throws RecognitionException {
        CompilerAstParser.logical_or_expr_return retval = new CompilerAstParser.logical_or_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LOGICAL_OR_T276=null;
        CompilerAstParser.logical_and_expr_return e1 = null;

        CompilerAstParser.logical_and_expr_return e2 = null;


        SLAST LOGICAL_OR_T276_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1142:3: (e1= logical_and_expr ( LOGICAL_OR_T e2= logical_and_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1142:5: e1= logical_and_expr ( LOGICAL_OR_T e2= logical_and_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr3761);
            e1=logical_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1142:25: ( LOGICAL_OR_T e2= logical_and_expr )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==LOGICAL_OR_T) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1142:26: LOGICAL_OR_T e2= logical_and_expr
            	    {
            	    LOGICAL_OR_T276=(Token)match(input,LOGICAL_OR_T,FOLLOW_LOGICAL_OR_T_in_logical_or_expr3764); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOGICAL_OR_T276_tree = (SLAST)adaptor.create(LOGICAL_OR_T276);
            	    root_0 = (SLAST)adaptor.becomeRoot(LOGICAL_OR_T276_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr3769);
            	    e2=logical_and_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1154:1: logical_and_expr : e1= bitwise_or_expr ( LOGICAL_AND_T e2= bitwise_or_expr )* ;
    public final CompilerAstParser.logical_and_expr_return logical_and_expr() throws RecognitionException {
        CompilerAstParser.logical_and_expr_return retval = new CompilerAstParser.logical_and_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LOGICAL_AND_T277=null;
        CompilerAstParser.bitwise_or_expr_return e1 = null;

        CompilerAstParser.bitwise_or_expr_return e2 = null;


        SLAST LOGICAL_AND_T277_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1164:3: (e1= bitwise_or_expr ( LOGICAL_AND_T e2= bitwise_or_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1164:5: e1= bitwise_or_expr ( LOGICAL_AND_T e2= bitwise_or_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_bitwise_or_expr_in_logical_and_expr3800);
            e1=bitwise_or_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1164:24: ( LOGICAL_AND_T e2= bitwise_or_expr )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==LOGICAL_AND_T) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1164:25: LOGICAL_AND_T e2= bitwise_or_expr
            	    {
            	    LOGICAL_AND_T277=(Token)match(input,LOGICAL_AND_T,FOLLOW_LOGICAL_AND_T_in_logical_and_expr3803); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    LOGICAL_AND_T277_tree = (SLAST)adaptor.create(LOGICAL_AND_T277);
            	    root_0 = (SLAST)adaptor.becomeRoot(LOGICAL_AND_T277_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwise_or_expr_in_logical_and_expr3808);
            	    e2=bitwise_or_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop83;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1176:1: bitwise_or_expr : e1= bitwise_xor_expr ( BIT_OR_T e2= bitwise_xor_expr )* ;
    public final CompilerAstParser.bitwise_or_expr_return bitwise_or_expr() throws RecognitionException {
        CompilerAstParser.bitwise_or_expr_return retval = new CompilerAstParser.bitwise_or_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token BIT_OR_T278=null;
        CompilerAstParser.bitwise_xor_expr_return e1 = null;

        CompilerAstParser.bitwise_xor_expr_return e2 = null;


        SLAST BIT_OR_T278_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1186:3: (e1= bitwise_xor_expr ( BIT_OR_T e2= bitwise_xor_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1186:5: e1= bitwise_xor_expr ( BIT_OR_T e2= bitwise_xor_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_bitwise_xor_expr_in_bitwise_or_expr3839);
            e1=bitwise_xor_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1186:25: ( BIT_OR_T e2= bitwise_xor_expr )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==BIT_OR_T) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1186:26: BIT_OR_T e2= bitwise_xor_expr
            	    {
            	    BIT_OR_T278=(Token)match(input,BIT_OR_T,FOLLOW_BIT_OR_T_in_bitwise_or_expr3842); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    BIT_OR_T278_tree = (SLAST)adaptor.create(BIT_OR_T278);
            	    root_0 = (SLAST)adaptor.becomeRoot(BIT_OR_T278_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwise_xor_expr_in_bitwise_or_expr3847);
            	    e2=bitwise_xor_expr();

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
    // $ANTLR end "bitwise_or_expr"

    public static class bitwise_xor_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwise_xor_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1198:1: bitwise_xor_expr : e1= bitwise_and_expr ( POWER_T e2= bitwise_and_expr )* ;
    public final CompilerAstParser.bitwise_xor_expr_return bitwise_xor_expr() throws RecognitionException {
        CompilerAstParser.bitwise_xor_expr_return retval = new CompilerAstParser.bitwise_xor_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token POWER_T279=null;
        CompilerAstParser.bitwise_and_expr_return e1 = null;

        CompilerAstParser.bitwise_and_expr_return e2 = null;


        SLAST POWER_T279_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1208:3: (e1= bitwise_and_expr ( POWER_T e2= bitwise_and_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1208:5: e1= bitwise_and_expr ( POWER_T e2= bitwise_and_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_bitwise_and_expr_in_bitwise_xor_expr3878);
            e1=bitwise_and_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1208:25: ( POWER_T e2= bitwise_and_expr )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==POWER_T) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1208:26: POWER_T e2= bitwise_and_expr
            	    {
            	    POWER_T279=(Token)match(input,POWER_T,FOLLOW_POWER_T_in_bitwise_xor_expr3881); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    POWER_T279_tree = (SLAST)adaptor.create(POWER_T279);
            	    root_0 = (SLAST)adaptor.becomeRoot(POWER_T279_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_bitwise_and_expr_in_bitwise_xor_expr3886);
            	    e2=bitwise_and_expr();

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
    // $ANTLR end "bitwise_xor_expr"

    public static class bitwise_and_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwise_and_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1220:1: bitwise_and_expr : e1= concat_expr ( DOT_T e2= concat_expr )* ;
    public final CompilerAstParser.bitwise_and_expr_return bitwise_and_expr() throws RecognitionException {
        CompilerAstParser.bitwise_and_expr_return retval = new CompilerAstParser.bitwise_and_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token DOT_T280=null;
        CompilerAstParser.concat_expr_return e1 = null;

        CompilerAstParser.concat_expr_return e2 = null;


        SLAST DOT_T280_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1230:3: (e1= concat_expr ( DOT_T e2= concat_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1230:5: e1= concat_expr ( DOT_T e2= concat_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_concat_expr_in_bitwise_and_expr3917);
            e1=concat_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1230:20: ( DOT_T e2= concat_expr )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==DOT_T) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1230:21: DOT_T e2= concat_expr
            	    {
            	    DOT_T280=(Token)match(input,DOT_T,FOLLOW_DOT_T_in_bitwise_and_expr3920); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOT_T280_tree = (SLAST)adaptor.create(DOT_T280);
            	    root_0 = (SLAST)adaptor.becomeRoot(DOT_T280_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_concat_expr_in_bitwise_and_expr3925);
            	    e2=concat_expr();

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
    // $ANTLR end "bitwise_and_expr"

    public static class concat_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "concat_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1242:1: concat_expr : e1= equality_expr ( REF_T e2= equality_expr )* ;
    public final CompilerAstParser.concat_expr_return concat_expr() throws RecognitionException {
        CompilerAstParser.concat_expr_return retval = new CompilerAstParser.concat_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token REF_T281=null;
        CompilerAstParser.equality_expr_return e1 = null;

        CompilerAstParser.equality_expr_return e2 = null;


        SLAST REF_T281_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1252:3: (e1= equality_expr ( REF_T e2= equality_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1252:5: e1= equality_expr ( REF_T e2= equality_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_equality_expr_in_concat_expr3956);
            e1=equality_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1252:22: ( REF_T e2= equality_expr )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==REF_T) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1252:23: REF_T e2= equality_expr
            	    {
            	    REF_T281=(Token)match(input,REF_T,FOLLOW_REF_T_in_concat_expr3959); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    REF_T281_tree = (SLAST)adaptor.create(REF_T281);
            	    root_0 = (SLAST)adaptor.becomeRoot(REF_T281_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equality_expr_in_concat_expr3964);
            	    e2=equality_expr();

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
    // $ANTLR end "concat_expr"

    public static class equality_expr_return extends ParserRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equality_expr"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1264:1: equality_expr : e1= relational_expr ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr )* ;
    public final CompilerAstParser.equality_expr_return equality_expr() throws RecognitionException {
        CompilerAstParser.equality_expr_return retval = new CompilerAstParser.equality_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set282=null;
        CompilerAstParser.relational_expr_return e1 = null;

        CompilerAstParser.relational_expr_return e2 = null;


        SLAST set282_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1275:3: (e1= relational_expr ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1275:5: e1= relational_expr ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_relational_expr_in_equality_expr3995);
            e1=relational_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1275:24: ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=EQUAL_EQUAL_T && LA88_0<=NOT_EQUAL_EQUAL_T)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1275:25: ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr
            	    {
            	    set282=(Token)input.LT(1);
            	    set282=(Token)input.LT(1);
            	    if ( (input.LA(1)>=EQUAL_EQUAL_T && input.LA(1)<=NOT_EQUAL_EQUAL_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set282), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expr_in_equality_expr4017);
            	    e2=relational_expr();

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1287:1: relational_expr : e1= shift_expr ( ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr )* ;
    public final CompilerAstParser.relational_expr_return relational_expr() throws RecognitionException {
        CompilerAstParser.relational_expr_return retval = new CompilerAstParser.relational_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set283=null;
        CompilerAstParser.shift_expr_return e1 = null;

        CompilerAstParser.shift_expr_return e2 = null;


        SLAST set283_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1298:3: (e1= shift_expr ( ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1298:5: e1= shift_expr ( ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_shift_expr_in_relational_expr4048);
            e1=shift_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1298:19: ( ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( ((LA89_0>=LT_T && LA89_0<=ME_T)) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1298:20: ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr
            	    {
            	    set283=(Token)input.LT(1);
            	    set283=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LT_T && input.LA(1)<=ME_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set283), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_shift_expr_in_relational_expr4070);
            	    e2=shift_expr();

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1310:1: shift_expr : e1= additive_expr ( ( LSHIFT_T | RSHIFT_T ) e2= additive_expr )* ;
    public final CompilerAstParser.shift_expr_return shift_expr() throws RecognitionException {
        CompilerAstParser.shift_expr_return retval = new CompilerAstParser.shift_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set284=null;
        CompilerAstParser.additive_expr_return e1 = null;

        CompilerAstParser.additive_expr_return e2 = null;


        SLAST set284_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1321:3: (e1= additive_expr ( ( LSHIFT_T | RSHIFT_T ) e2= additive_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1321:5: e1= additive_expr ( ( LSHIFT_T | RSHIFT_T ) e2= additive_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_additive_expr_in_shift_expr4101);
            e1=additive_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1321:22: ( ( LSHIFT_T | RSHIFT_T ) e2= additive_expr )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( ((LA90_0>=LSHIFT_T && LA90_0<=RSHIFT_T)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1321:23: ( LSHIFT_T | RSHIFT_T ) e2= additive_expr
            	    {
            	    set284=(Token)input.LT(1);
            	    set284=(Token)input.LT(1);
            	    if ( (input.LA(1)>=LSHIFT_T && input.LA(1)<=RSHIFT_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set284), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expr_in_shift_expr4115);
            	    e2=additive_expr();

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1333:1: additive_expr : e1= multiplicative_expr ( ( PLUS_T | MINUS_T ) e2= multiplicative_expr )* ;
    public final CompilerAstParser.additive_expr_return additive_expr() throws RecognitionException {
        CompilerAstParser.additive_expr_return retval = new CompilerAstParser.additive_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set285=null;
        CompilerAstParser.multiplicative_expr_return e1 = null;

        CompilerAstParser.multiplicative_expr_return e2 = null;


        SLAST set285_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1344:3: (e1= multiplicative_expr ( ( PLUS_T | MINUS_T ) e2= multiplicative_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1344:5: e1= multiplicative_expr ( ( PLUS_T | MINUS_T ) e2= multiplicative_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expr_in_additive_expr4146);
            e1=multiplicative_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1344:28: ( ( PLUS_T | MINUS_T ) e2= multiplicative_expr )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=PLUS_T && LA91_0<=MINUS_T)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1344:29: ( PLUS_T | MINUS_T ) e2= multiplicative_expr
            	    {
            	    set285=(Token)input.LT(1);
            	    set285=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUS_T && input.LA(1)<=MINUS_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set285), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expr_in_additive_expr4160);
            	    e2=multiplicative_expr();

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1356:1: multiplicative_expr : e1= cast_expr ( ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr )* ;
    public final CompilerAstParser.multiplicative_expr_return multiplicative_expr() throws RecognitionException {
        CompilerAstParser.multiplicative_expr_return retval = new CompilerAstParser.multiplicative_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set286=null;
        CompilerAstParser.cast_expr_return e1 = null;

        CompilerAstParser.cast_expr_return e2 = null;


        SLAST set286_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1367:3: (e1= cast_expr ( ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1367:5: e1= cast_expr ( ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr )*
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_cast_expr_in_multiplicative_expr4191);
            e1=cast_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1367:18: ( ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=MUL_T && LA92_0<=PERCENT_T)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1367:19: ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr
            	    {
            	    set286=(Token)input.LT(1);
            	    set286=(Token)input.LT(1);
            	    if ( (input.LA(1)>=MUL_T && input.LA(1)<=PERCENT_T) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(set286), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_cast_expr_in_multiplicative_expr4209);
            	    e2=cast_expr();

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1379:1: cast_expr : ( unary_expr | ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+ unary_expr -> ^( CAST_EXPR ( cast_option )+ unary_expr ) );
    public final CompilerAstParser.cast_expr_return cast_expr() throws RecognitionException {
        CompilerAstParser.cast_expr_return retval = new CompilerAstParser.cast_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_PARETHESIS288=null;
        Token RIGHT_PARETHESIS290=null;
        CompilerAstParser.unary_expr_return unary_expr287 = null;

        CompilerAstParser.cast_option_return cast_option289 = null;

        CompilerAstParser.unary_expr_return unary_expr291 = null;


        SLAST LEFT_PARETHESIS288_tree=null;
        SLAST RIGHT_PARETHESIS290_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule unary_expr");
        RewriteRuleSubtreeStream stream_cast_option=new RewriteRuleSubtreeStream(adaptor,"rule cast_option");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1390:3: ( unary_expr | ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+ unary_expr -> ^( CAST_EXPR ( cast_option )+ unary_expr ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==IDENTIFIER||LA94_0==REF_T||LA94_0==STRINGLITERAL||(LA94_0>=PLUS_T && LA94_0<=MINUS_T)||(LA94_0>=UNSET_T && LA94_0<=MINUS_MINUS_T)||(LA94_0>=AT_T && LA94_0<=PRINT_T)||(LA94_0>=DOLLAR_T && LA94_0<=HERE_DOC)||(LA94_0>=188 && LA94_0<=195)) ) {
                alt94=1;
            }
            else if ( (LA94_0==LEFT_PARETHESIS) ) {
                switch ( input.LA(2) ) {
                case 188:
                    {
                    int LA94_3 = input.LA(3);

                    if ( (LA94_3==LEFT_PARETHESIS) ) {
                        alt94=1;
                    }
                    else if ( (LA94_3==RIGHT_PARETHESIS) ) {
                        alt94=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case LEFT_PARETHESIS:
                case IDENTIFIER:
                case REF_T:
                case STRINGLITERAL:
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
                case 189:
                case 190:
                case 191:
                case 192:
                case 193:
                case 194:
                case 195:
                    {
                    alt94=1;
                    }
                    break;
                case CLONE_T:
                    {
                    int LA94_4 = input.LA(3);

                    if ( (LA94_4==IDENTIFIER||LA94_4==DOLLAR_T) ) {
                        alt94=1;
                    }
                    else if ( (LA94_4==RIGHT_PARETHESIS) ) {
                        alt94=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case UNSET_T:
                    {
                    int LA94_5 = input.LA(3);

                    if ( (LA94_5==LEFT_PARETHESIS) ) {
                        alt94=1;
                    }
                    else if ( (LA94_5==RIGHT_PARETHESIS) ) {
                        alt94=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 185:
                case 186:
                case 187:
                    {
                    alt94=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 94, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1390:5: unary_expr
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_unary_expr_in_cast_expr4238);
                    unary_expr287=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr287.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(unary_expr287!=null?((Token)unary_expr287.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(unary_expr287!=null?((Token)unary_expr287.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1397:5: ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+ unary_expr
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1397:5: ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+
                    int cnt93=0;
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==LEFT_PARETHESIS) ) {
                            switch ( input.LA(2) ) {
                            case 188:
                                {
                                int LA93_3 = input.LA(3);

                                if ( (LA93_3==RIGHT_PARETHESIS) ) {
                                    alt93=1;
                                }


                                }
                                break;
                            case CLONE_T:
                                {
                                int LA93_4 = input.LA(3);

                                if ( (LA93_4==RIGHT_PARETHESIS) ) {
                                    alt93=1;
                                }


                                }
                                break;
                            case UNSET_T:
                                {
                                int LA93_5 = input.LA(3);

                                if ( (LA93_5==RIGHT_PARETHESIS) ) {
                                    alt93=1;
                                }


                                }
                                break;
                            case 180:
                            case 181:
                            case 182:
                            case 183:
                            case 184:
                            case 185:
                            case 186:
                            case 187:
                                {
                                alt93=1;
                                }
                                break;

                            }

                        }


                        switch (alt93) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1397:6: LEFT_PARETHESIS cast_option RIGHT_PARETHESIS
                    	    {
                    	    LEFT_PARETHESIS288=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_cast_expr4249); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS288);

                    	    pushFollow(FOLLOW_cast_option_in_cast_expr4251);
                    	    cast_option289=cast_option();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_cast_option.add(cast_option289.getTree());
                    	    RIGHT_PARETHESIS290=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_cast_expr4253); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS290);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt93 >= 1 ) break loop93;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(93, input);
                                throw eee;
                        }
                        cnt93++;
                    } while (true);

                    pushFollow(FOLLOW_unary_expr_in_cast_expr4257);
                    unary_expr291=unary_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_expr.add(unary_expr291.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)LEFT_PARETHESIS288;
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(unary_expr291!=null?((Token)unary_expr291.stop):null);
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
                    // 1404:4: -> ^( CAST_EXPR ( cast_option )+ unary_expr )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1404:7: ^( CAST_EXPR ( cast_option )+ unary_expr )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1407:1: cast_option : ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'real' | 'string' | UNSET_T | CLONE_T | 'object' | 'array' );
    public final CompilerAstParser.cast_option_return cast_option() throws RecognitionException {
        CompilerAstParser.cast_option_return retval = new CompilerAstParser.cast_option_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set292=null;

        SLAST set292_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1408:3: ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'real' | 'string' | UNSET_T | CLONE_T | 'object' | 'array' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set292=(Token)input.LT(1);
            if ( (input.LA(1)>=UNSET_T && input.LA(1)<=CLONE_T)||(input.LA(1)>=180 && input.LA(1)<=188) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set292));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1421:1: unary_expr : ( unary_symbol_list prefix_inc_dec_expr -> ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr ) | prefix_inc_dec_expr );
    public final CompilerAstParser.unary_expr_return unary_expr() throws RecognitionException {
        CompilerAstParser.unary_expr_return retval = new CompilerAstParser.unary_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.unary_symbol_list_return unary_symbol_list293 = null;

        CompilerAstParser.prefix_inc_dec_expr_return prefix_inc_dec_expr294 = null;

        CompilerAstParser.prefix_inc_dec_expr_return prefix_inc_dec_expr295 = null;


        RewriteRuleSubtreeStream stream_prefix_inc_dec_expr=new RewriteRuleSubtreeStream(adaptor,"rule prefix_inc_dec_expr");
        RewriteRuleSubtreeStream stream_unary_symbol_list=new RewriteRuleSubtreeStream(adaptor,"rule unary_symbol_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1432:3: ( unary_symbol_list prefix_inc_dec_expr -> ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr ) | prefix_inc_dec_expr )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==REF_T||(LA95_0>=PLUS_T && LA95_0<=MINUS_T)||(LA95_0>=TILDA_T && LA95_0<=EXC_NOT_T)) ) {
                alt95=1;
            }
            else if ( (LA95_0==LEFT_PARETHESIS||LA95_0==IDENTIFIER||LA95_0==STRINGLITERAL||(LA95_0>=UNSET_T && LA95_0<=CLONE_T)||(LA95_0>=PLUS_PLUS_T && LA95_0<=MINUS_MINUS_T)||(LA95_0>=AT_T && LA95_0<=PRINT_T)||(LA95_0>=DOLLAR_T && LA95_0<=HERE_DOC)||(LA95_0>=188 && LA95_0<=195)) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1432:5: unary_symbol_list prefix_inc_dec_expr
                    {
                    pushFollow(FOLLOW_unary_symbol_list_in_unary_expr4377);
                    unary_symbol_list293=unary_symbol_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_unary_symbol_list.add(unary_symbol_list293.getTree());
                    pushFollow(FOLLOW_prefix_inc_dec_expr_in_unary_expr4379);
                    prefix_inc_dec_expr294=prefix_inc_dec_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_prefix_inc_dec_expr.add(prefix_inc_dec_expr294.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(unary_symbol_list293!=null?((Token)unary_symbol_list293.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(prefix_inc_dec_expr294!=null?((Token)prefix_inc_dec_expr294.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: prefix_inc_dec_expr, unary_symbol_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1439:5: -> ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1439:9: ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1440:5: prefix_inc_dec_expr
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_prefix_inc_dec_expr_in_unary_expr4404);
                    prefix_inc_dec_expr295=prefix_inc_dec_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, prefix_inc_dec_expr295.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(prefix_inc_dec_expr295!=null?((Token)prefix_inc_dec_expr295.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(prefix_inc_dec_expr295!=null?((Token)prefix_inc_dec_expr295.stop):null);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1449:1: unary_symbol_list : ( unary_symbol )+ ;
    public final CompilerAstParser.unary_symbol_list_return unary_symbol_list() throws RecognitionException {
        CompilerAstParser.unary_symbol_list_return retval = new CompilerAstParser.unary_symbol_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.unary_symbol_return unary_symbol296 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1450:3: ( ( unary_symbol )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1450:5: ( unary_symbol )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1450:5: ( unary_symbol )+
            int cnt96=0;
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==REF_T||(LA96_0>=PLUS_T && LA96_0<=MINUS_T)||(LA96_0>=TILDA_T && LA96_0<=EXC_NOT_T)) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1450:5: unary_symbol
            	    {
            	    pushFollow(FOLLOW_unary_symbol_in_unary_symbol_list4421);
            	    unary_symbol296=unary_symbol();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_symbol296.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt96 >= 1 ) break loop96;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(96, input);
                        throw eee;
                }
                cnt96++;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1453:1: unary_symbol : ( REF_T | PLUS_T | MINUS_T | TILDA_T | EXC_NOT_T );
    public final CompilerAstParser.unary_symbol_return unary_symbol() throws RecognitionException {
        CompilerAstParser.unary_symbol_return retval = new CompilerAstParser.unary_symbol_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set297=null;

        SLAST set297_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1454:3: ( REF_T | PLUS_T | MINUS_T | TILDA_T | EXC_NOT_T )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set297=(Token)input.LT(1);
            if ( input.LA(1)==REF_T||(input.LA(1)>=PLUS_T && input.LA(1)<=MINUS_T)||(input.LA(1)>=TILDA_T && input.LA(1)<=EXC_NOT_T) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set297));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1457:1: prefix_inc_dec_expr : ( post_inc_dec_expr | ( plus_minus )+ post_inc_dec_expr -> ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr ) );
    public final CompilerAstParser.prefix_inc_dec_expr_return prefix_inc_dec_expr() throws RecognitionException {
        CompilerAstParser.prefix_inc_dec_expr_return retval = new CompilerAstParser.prefix_inc_dec_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.post_inc_dec_expr_return post_inc_dec_expr298 = null;

        CompilerAstParser.plus_minus_return plus_minus299 = null;

        CompilerAstParser.post_inc_dec_expr_return post_inc_dec_expr300 = null;


        RewriteRuleSubtreeStream stream_plus_minus=new RewriteRuleSubtreeStream(adaptor,"rule plus_minus");
        RewriteRuleSubtreeStream stream_post_inc_dec_expr=new RewriteRuleSubtreeStream(adaptor,"rule post_inc_dec_expr");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1468:3: ( post_inc_dec_expr | ( plus_minus )+ post_inc_dec_expr -> ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==LEFT_PARETHESIS||LA98_0==IDENTIFIER||LA98_0==STRINGLITERAL||(LA98_0>=UNSET_T && LA98_0<=CLONE_T)||(LA98_0>=AT_T && LA98_0<=PRINT_T)||(LA98_0>=DOLLAR_T && LA98_0<=HERE_DOC)||(LA98_0>=188 && LA98_0<=195)) ) {
                alt98=1;
            }
            else if ( ((LA98_0>=PLUS_PLUS_T && LA98_0<=MINUS_MINUS_T)) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1468:5: post_inc_dec_expr
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4478);
                    post_inc_dec_expr298=post_inc_dec_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, post_inc_dec_expr298.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(post_inc_dec_expr298!=null?((Token)post_inc_dec_expr298.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(post_inc_dec_expr298!=null?((Token)post_inc_dec_expr298.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1475:5: ( plus_minus )+ post_inc_dec_expr
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1475:5: ( plus_minus )+
                    int cnt97=0;
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( ((LA97_0>=PLUS_PLUS_T && LA97_0<=MINUS_MINUS_T)) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1475:6: plus_minus
                    	    {
                    	    pushFollow(FOLLOW_plus_minus_in_prefix_inc_dec_expr4489);
                    	    plus_minus299=plus_minus();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_plus_minus.add(plus_minus299.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt97 >= 1 ) break loop97;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(97, input);
                                throw eee;
                        }
                        cnt97++;
                    } while (true);

                    pushFollow(FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4493);
                    post_inc_dec_expr300=post_inc_dec_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_post_inc_dec_expr.add(post_inc_dec_expr300.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(plus_minus299!=null?((Token)plus_minus299.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(post_inc_dec_expr300!=null?((Token)post_inc_dec_expr300.stop):null);
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
                    // 1482:4: -> ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1482:8: ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1485:1: post_inc_dec_expr : ( instance_expr -> instance_expr ) ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )* ;
    public final CompilerAstParser.post_inc_dec_expr_return post_inc_dec_expr() throws RecognitionException {
        CompilerAstParser.post_inc_dec_expr_return retval = new CompilerAstParser.post_inc_dec_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.instance_expr_return instance_expr301 = null;

        CompilerAstParser.plus_minus_return plus_minus302 = null;


        RewriteRuleSubtreeStream stream_plus_minus=new RewriteRuleSubtreeStream(adaptor,"rule plus_minus");
        RewriteRuleSubtreeStream stream_instance_expr=new RewriteRuleSubtreeStream(adaptor,"rule instance_expr");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1496:3: ( ( instance_expr -> instance_expr ) ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1496:5: ( instance_expr -> instance_expr ) ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1496:5: ( instance_expr -> instance_expr )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1496:6: instance_expr
            {
            pushFollow(FOLLOW_instance_expr_in_post_inc_dec_expr4538);
            instance_expr301=instance_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_instance_expr.add(instance_expr301.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(instance_expr301!=null?((Token)instance_expr301.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(instance_expr301!=null?((Token)instance_expr301.stop):null);
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
            // 1503:4: -> instance_expr
            {
                adaptor.addChild(root_0, stream_instance_expr.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1504:3: ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( ((LA99_0>=PLUS_PLUS_T && LA99_0<=MINUS_MINUS_T)) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1504:4: plus_minus
            	    {
            	    pushFollow(FOLLOW_plus_minus_in_post_inc_dec_expr4555);
            	    plus_minus302=plus_minus();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_plus_minus.add(plus_minus302.getTree());
            	    if ( state.backtracking==0 ) {

            	          token = (CommonToken)(plus_minus302!=null?((Token)plus_minus302.stop):null);
            	          endIndex = token.getStopIndex();
            	        
            	    }


            	    // AST REWRITE
            	    // elements: post_inc_dec_expr, plus_minus
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 1509:4: -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1509:7: ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus )
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
            	    break loop99;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1512:1: plus_minus : ( PLUS_PLUS_T | MINUS_MINUS_T );
    public final CompilerAstParser.plus_minus_return plus_minus() throws RecognitionException {
        CompilerAstParser.plus_minus_return retval = new CompilerAstParser.plus_minus_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set303=null;

        SLAST set303_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1513:3: ( PLUS_PLUS_T | MINUS_MINUS_T )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set303=(Token)input.LT(1);
            if ( (input.LA(1)>=PLUS_PLUS_T && input.LA(1)<=MINUS_MINUS_T) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set303));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1517:1: instance_expr : atom_expr ( INSTANCEOF_T class_name_reference )? ;
    public final CompilerAstParser.instance_expr_return instance_expr() throws RecognitionException {
        CompilerAstParser.instance_expr_return retval = new CompilerAstParser.instance_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token INSTANCEOF_T305=null;
        CompilerAstParser.atom_expr_return atom_expr304 = null;

        CompilerAstParser.class_name_reference_return class_name_reference306 = null;


        SLAST INSTANCEOF_T305_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1527:3: ( atom_expr ( INSTANCEOF_T class_name_reference )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1527:5: atom_expr ( INSTANCEOF_T class_name_reference )?
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_atom_expr_in_instance_expr4623);
            atom_expr304=atom_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atom_expr304.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1527:15: ( INSTANCEOF_T class_name_reference )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==INSTANCEOF_T) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1527:16: INSTANCEOF_T class_name_reference
                    {
                    INSTANCEOF_T305=(Token)match(input,INSTANCEOF_T,FOLLOW_INSTANCEOF_T_in_instance_expr4626); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF_T305_tree = (SLAST)adaptor.create(INSTANCEOF_T305);
                    root_0 = (SLAST)adaptor.becomeRoot(INSTANCEOF_T305_tree, root_0);
                    }
                    pushFollow(FOLLOW_class_name_reference_in_instance_expr4629);
                    class_name_reference306=class_name_reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, class_name_reference306.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  token = (CommonToken)(atom_expr304!=null?((Token)atom_expr304.start):null);
                  startIndex = token.getStartIndex();    
                  token = (CommonToken)(atom_expr304!=null?((Token)atom_expr304.stop):null);
                  if ((class_name_reference306!=null?input.toString(class_name_reference306.start,class_name_reference306.stop):null) != null) {
                    token = (CommonToken)(class_name_reference306!=null?((Token)class_name_reference306.stop):null);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1539:1: atom_expr : ( ( AT_T )? variable | ( AT_T )? scalar | LEFT_PARETHESIS expression RIGHT_PARETHESIS | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) | 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS -> ^( ARRAY_DECL ( array_pair_list )? ) | NEW_T class_name_reference -> ^( NEW_T class_name_reference ) | CLONE_T variable -> ^( CLONE_T variable ) | UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS -> ^( UNSET_T variable_list ) | BACKTRICKLITERAL | PRINT_T expression -> ^( PRINT_T expression ) );
    public final CompilerAstParser.atom_expr_return atom_expr() throws RecognitionException {
        CompilerAstParser.atom_expr_return retval = new CompilerAstParser.atom_expr_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token AT_T307=null;
        Token AT_T309=null;
        Token LEFT_PARETHESIS311=null;
        Token RIGHT_PARETHESIS313=null;
        Token LIST_T314=null;
        Token LEFT_PARETHESIS315=null;
        Token RIGHT_PARETHESIS317=null;
        Token string_literal318=null;
        Token LEFT_PARETHESIS319=null;
        Token RIGHT_PARETHESIS321=null;
        Token NEW_T322=null;
        Token CLONE_T324=null;
        Token UNSET_T326=null;
        Token LEFT_PARETHESIS327=null;
        Token RIGHT_PARETHESIS329=null;
        Token BACKTRICKLITERAL330=null;
        Token PRINT_T331=null;
        CompilerAstParser.variable_return variable308 = null;

        CompilerAstParser.scalar_return scalar310 = null;

        CompilerAstParser.expression_return expression312 = null;

        CompilerAstParser.assignment_list_return assignment_list316 = null;

        CompilerAstParser.array_pair_list_return array_pair_list320 = null;

        CompilerAstParser.class_name_reference_return class_name_reference323 = null;

        CompilerAstParser.variable_return variable325 = null;

        CompilerAstParser.variable_list_return variable_list328 = null;

        CompilerAstParser.expression_return expression332 = null;


        SLAST AT_T307_tree=null;
        SLAST AT_T309_tree=null;
        SLAST LEFT_PARETHESIS311_tree=null;
        SLAST RIGHT_PARETHESIS313_tree=null;
        SLAST LIST_T314_tree=null;
        SLAST LEFT_PARETHESIS315_tree=null;
        SLAST RIGHT_PARETHESIS317_tree=null;
        SLAST string_literal318_tree=null;
        SLAST LEFT_PARETHESIS319_tree=null;
        SLAST RIGHT_PARETHESIS321_tree=null;
        SLAST NEW_T322_tree=null;
        SLAST CLONE_T324_tree=null;
        SLAST UNSET_T326_tree=null;
        SLAST LEFT_PARETHESIS327_tree=null;
        SLAST RIGHT_PARETHESIS329_tree=null;
        SLAST BACKTRICKLITERAL330_tree=null;
        SLAST PRINT_T331_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_PRINT_T=new RewriteRuleTokenStream(adaptor,"token PRINT_T");
        RewriteRuleTokenStream stream_188=new RewriteRuleTokenStream(adaptor,"token 188");
        RewriteRuleTokenStream stream_UNSET_T=new RewriteRuleTokenStream(adaptor,"token UNSET_T");
        RewriteRuleTokenStream stream_LIST_T=new RewriteRuleTokenStream(adaptor,"token LIST_T");
        RewriteRuleTokenStream stream_NEW_T=new RewriteRuleTokenStream(adaptor,"token NEW_T");
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1549:3: ( ( AT_T )? variable | ( AT_T )? scalar | LEFT_PARETHESIS expression RIGHT_PARETHESIS | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) | 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS -> ^( ARRAY_DECL ( array_pair_list )? ) | NEW_T class_name_reference -> ^( NEW_T class_name_reference ) | CLONE_T variable -> ^( CLONE_T variable ) | UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS -> ^( UNSET_T variable_list ) | BACKTRICKLITERAL | PRINT_T expression -> ^( PRINT_T expression ) )
            int alt104=10;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1549:6: ( AT_T )? variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1549:6: ( AT_T )?
                    int alt101=2;
                    int LA101_0 = input.LA(1);

                    if ( (LA101_0==AT_T) ) {
                        alt101=1;
                    }
                    switch (alt101) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1549:6: AT_T
                            {
                            AT_T307=(Token)match(input,AT_T,FOLLOW_AT_T_in_atom_expr4661); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT_T307_tree = (SLAST)adaptor.create(AT_T307);
                            adaptor.addChild(root_0, AT_T307_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_variable_in_atom_expr4664);
                    variable308=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable308.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)(variable308!=null?((Token)variable308.start):null);
                            if ((AT_T307!=null?AT_T307.getText():null) != null) {
                              token = (CommonToken)AT_T307;
                            }
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(variable308!=null?((Token)variable308.stop):null);
                            endIndex = token.getStopIndex();
                            System.out.println("i write here: " + startIndex + " " + endIndex);
                          
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1560:6: ( AT_T )? scalar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1560:6: ( AT_T )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==AT_T) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1560:6: AT_T
                            {
                            AT_T309=(Token)match(input,AT_T,FOLLOW_AT_T_in_atom_expr4677); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            AT_T309_tree = (SLAST)adaptor.create(AT_T309);
                            adaptor.addChild(root_0, AT_T309_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_scalar_in_atom_expr4680);
                    scalar310=scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar310.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)(scalar310!=null?((Token)scalar310.start):null);
                            if ((AT_T309!=null?AT_T309.getText():null) != null) {
                              token = (CommonToken)AT_T309;
                            }
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(scalar310!=null?((Token)scalar310.stop):null);
                            endIndex = token.getStopIndex();
                          
                    }

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1570:6: LEFT_PARETHESIS expression RIGHT_PARETHESIS
                    {
                    root_0 = (SLAST)adaptor.nil();

                    LEFT_PARETHESIS311=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr4693); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LEFT_PARETHESIS311_tree = (SLAST)adaptor.create(LEFT_PARETHESIS311);
                    adaptor.addChild(root_0, LEFT_PARETHESIS311_tree);
                    }
                    pushFollow(FOLLOW_expression_in_atom_expr4695);
                    expression312=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression312.getTree());
                    RIGHT_PARETHESIS313=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr4697); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RIGHT_PARETHESIS313_tree = (SLAST)adaptor.create(RIGHT_PARETHESIS313);
                    adaptor.addChild(root_0, RIGHT_PARETHESIS313_tree);
                    }
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)LEFT_PARETHESIS311;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)RIGHT_PARETHESIS313;
                            endIndex = token.getStopIndex();
                          
                    }

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1577:6: LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS
                    {
                    LIST_T314=(Token)match(input,LIST_T,FOLLOW_LIST_T_in_atom_expr4710); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST_T.add(LIST_T314);

                    LEFT_PARETHESIS315=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr4712); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS315);

                    pushFollow(FOLLOW_assignment_list_in_atom_expr4714);
                    assignment_list316=assignment_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list316.getTree());
                    RIGHT_PARETHESIS317=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr4716); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS317);

                    if ( state.backtracking==0 ) {

                            token = (CommonToken)LIST_T314;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)RIGHT_PARETHESIS317;
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
                    // 1584:6: -> ^( LIST_T assignment_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1584:10: ^( LIST_T assignment_list )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1585:6: 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS
                    {
                    string_literal318=(Token)match(input,188,FOLLOW_188_in_atom_expr4743); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_188.add(string_literal318);

                    LEFT_PARETHESIS319=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr4745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS319);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1585:30: ( array_pair_list )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==LEFT_PARETHESIS||LA103_0==IDENTIFIER||LA103_0==REF_T||LA103_0==STRINGLITERAL||(LA103_0>=PLUS_T && LA103_0<=MINUS_T)||(LA103_0>=UNSET_T && LA103_0<=MINUS_MINUS_T)||(LA103_0>=AT_T && LA103_0<=PRINT_T)||(LA103_0>=DOLLAR_T && LA103_0<=HERE_DOC)||(LA103_0>=188 && LA103_0<=195)) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1585:30: array_pair_list
                            {
                            pushFollow(FOLLOW_array_pair_list_in_atom_expr4747);
                            array_pair_list320=array_pair_list();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_array_pair_list.add(array_pair_list320.getTree());

                            }
                            break;

                    }

                    RIGHT_PARETHESIS321=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr4750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS321);

                    if ( state.backtracking==0 ) {

                            token = (CommonToken)LEFT_PARETHESIS319;
                      	    startIndex = token.getStartIndex() - 5;
                      	    token = (CommonToken)RIGHT_PARETHESIS321;
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
                    // 1592:7: -> ^( ARRAY_DECL ( array_pair_list )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1592:11: ^( ARRAY_DECL ( array_pair_list )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(ARRAY_DECL, "ARRAY_DECL"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1592:24: ( array_pair_list )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1593:6: NEW_T class_name_reference
                    {
                    NEW_T322=(Token)match(input,NEW_T,FOLLOW_NEW_T_in_atom_expr4779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEW_T.add(NEW_T322);

                    pushFollow(FOLLOW_class_name_reference_in_atom_expr4781);
                    class_name_reference323=class_name_reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_class_name_reference.add(class_name_reference323.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)NEW_T322;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(class_name_reference323!=null?((Token)class_name_reference323.stop):null);
                            endIndex = token.getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: NEW_T, class_name_reference
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1600:4: -> ^( NEW_T class_name_reference )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1600:8: ^( NEW_T class_name_reference )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1601:6: CLONE_T variable
                    {
                    CLONE_T324=(Token)match(input,CLONE_T,FOLLOW_CLONE_T_in_atom_expr4808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CLONE_T.add(CLONE_T324);

                    pushFollow(FOLLOW_variable_in_atom_expr4810);
                    variable325=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable.add(variable325.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)CLONE_T324;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(variable325!=null?((Token)variable325.stop):null);
                            endIndex = token.getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: CLONE_T, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1608:4: -> ^( CLONE_T variable )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1608:8: ^( CLONE_T variable )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1620:6: UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS
                    {
                    UNSET_T326=(Token)match(input,UNSET_T,FOLLOW_UNSET_T_in_atom_expr4846); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_UNSET_T.add(UNSET_T326);

                    LEFT_PARETHESIS327=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr4848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS327);

                    pushFollow(FOLLOW_variable_list_in_atom_expr4850);
                    variable_list328=variable_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable_list.add(variable_list328.getTree());
                    RIGHT_PARETHESIS329=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr4852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS329);

                    if ( state.backtracking==0 ) {

                            token = (CommonToken)UNSET_T326;
                            startIndex = token.getStartIndex();
                            token = (CommonToken)RIGHT_PARETHESIS329;
                            endIndex = token.getStopIndex();
                        
                    }


                    // AST REWRITE
                    // elements: UNSET_T, variable_list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1627:5: -> ^( UNSET_T variable_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1627:9: ^( UNSET_T variable_list )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1628:6: BACKTRICKLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    BACKTRICKLITERAL330=(Token)match(input,BACKTRICKLITERAL,FOLLOW_BACKTRICKLITERAL_in_atom_expr4876); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BACKTRICKLITERAL330_tree = (SLAST)adaptor.create(BACKTRICKLITERAL330);
                    adaptor.addChild(root_0, BACKTRICKLITERAL330_tree);
                    }
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)BACKTRICKLITERAL330;
                            startIndex = token.getStartIndex();
                            endIndex = token.getStopIndex();
                          
                    }

                    }
                    break;
                case 10 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1634:6: PRINT_T expression
                    {
                    PRINT_T331=(Token)match(input,PRINT_T,FOLLOW_PRINT_T_in_atom_expr4889); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PRINT_T.add(PRINT_T331);

                    pushFollow(FOLLOW_expression_in_atom_expr4891);
                    expression332=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression332.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)PRINT_T331;
                            startIndex = token.getStartIndex();
                            if ((expression332!=null?input.toString(expression332.start,expression332.stop):null) != null) {
                              token = (CommonToken)(expression332!=null?((Token)expression332.stop):null);
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
                    // 1643:4: -> ^( PRINT_T expression )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1643:7: ^( PRINT_T expression )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1653:1: class_name_reference : ( dynamic_name_reference | fully_qualified_class_name );
    public final CompilerAstParser.class_name_reference_return class_name_reference() throws RecognitionException {
        CompilerAstParser.class_name_reference_return retval = new CompilerAstParser.class_name_reference_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.dynamic_name_reference_return dynamic_name_reference333 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name334 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1654:3: ( dynamic_name_reference | fully_qualified_class_name )
            int alt105=2;
            alt105 = dfa105.predict(input);
            switch (alt105) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1654:5: dynamic_name_reference
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_dynamic_name_reference_in_class_name_reference4934);
                    dynamic_name_reference333=dynamic_name_reference();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dynamic_name_reference333.getTree());

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1655:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_fully_qualified_class_name_in_class_name_reference4940);
                    fully_qualified_class_name334=fully_qualified_class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fully_qualified_class_name334.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1658:1: dynamic_name_reference : ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )* ;
    public final CompilerAstParser.dynamic_name_reference_return dynamic_name_reference() throws RecognitionException {
        CompilerAstParser.dynamic_name_reference_return retval = new CompilerAstParser.dynamic_name_reference_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token SINGLE_ARROW_T336=null;
        CompilerAstParser.base_variable_with_function_calls_return base_variable_with_function_calls335 = null;

        CompilerAstParser.object_property_return object_property337 = null;

        CompilerAstParser.ctor_arguments_return ctor_arguments338 = null;


        SLAST SINGLE_ARROW_T336_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1693:3: ( ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1693:5: ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1693:5: ( base_variable_with_function_calls -> base_variable_with_function_calls )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1693:6: base_variable_with_function_calls
            {
            pushFollow(FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference4968);
            base_variable_with_function_calls335=base_variable_with_function_calls();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_base_variable_with_function_calls.add(base_variable_with_function_calls335.getTree());
            if ( state.backtracking==0 ) {

                    token = (CommonToken)(base_variable_with_function_calls335!=null?((Token)base_variable_with_function_calls335.start):null);
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
            // 1699:7: -> base_variable_with_function_calls
            {
                adaptor.addChild(root_0, stream_base_variable_with_function_calls.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1700:5: ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )*
            loop107:
            do {
                int alt107=2;
                int LA107_0 = input.LA(1);

                if ( (LA107_0==SINGLE_ARROW_T) ) {
                    alt107=1;
                }


                switch (alt107) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1700:6: SINGLE_ARROW_T object_property ( ctor_arguments )?
            	    {
            	    SINGLE_ARROW_T336=(Token)match(input,SINGLE_ARROW_T,FOLLOW_SINGLE_ARROW_T_in_dynamic_name_reference4993); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SINGLE_ARROW_T.add(SINGLE_ARROW_T336);

            	    pushFollow(FOLLOW_object_property_in_dynamic_name_reference4995);
            	    object_property337=object_property();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_object_property.add(object_property337.getTree());
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1700:37: ( ctor_arguments )?
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==LEFT_PARETHESIS) ) {
            	        alt106=1;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1700:37: ctor_arguments
            	            {
            	            pushFollow(FOLLOW_ctor_arguments_in_dynamic_name_reference4997);
            	            ctor_arguments338=ctor_arguments();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments338.getTree());

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	            token = (CommonToken)(base_variable_with_function_calls335!=null?((Token)base_variable_with_function_calls335.start):null);
            	            startIndex = token.getStartIndex();
            	            token = (CommonToken)(object_property337!=null?((Token)object_property337.stop):null);
            	            endIndex = token.getStopIndex();
            	            endIndexList.add(0, endIndex);
            	            if ((ctor_arguments338!=null?input.toString(ctor_arguments338.start,ctor_arguments338.stop):null) != null) {
            	              endIndex = ((CommonToken)(ctor_arguments338!=null?((Token)ctor_arguments338.stop):null)).getStopIndex();
            	              int sid = (ctor_arguments338!=null?((SLAST)ctor_arguments338.tree):null).startIndex;
            	              int eid = (ctor_arguments338!=null?((SLAST)ctor_arguments338.tree):null).endIndex;
            	              hasArgument.add(0, true);
            	              argumentStartIndex.add(sid);
            	              argumentEndIndex.add(eid);
            	              endIndex = ((CommonToken)(ctor_arguments338!=null?((Token)ctor_arguments338.stop):null)).getStopIndex();
            	            }
            	            else {
            	              hasArgument.add(0, false);
            	            }
            	            
            	          
            	    }


            	    // AST REWRITE
            	    // elements: dynamic_name_reference, object_property, ctor_arguments
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 1721:5: -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1721:9: ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_object_property.nextTree());
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1721:56: ( ctor_arguments )?
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
            	    break loop107;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1724:1: assignment_list : ( assignment_element )? ( COMMA_T ( assignment_element )? )* -> ( assignment_element )* ;
    public final CompilerAstParser.assignment_list_return assignment_list() throws RecognitionException {
        CompilerAstParser.assignment_list_return retval = new CompilerAstParser.assignment_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T340=null;
        CompilerAstParser.assignment_element_return assignment_element339 = null;

        CompilerAstParser.assignment_element_return assignment_element341 = null;


        SLAST COMMA_T340_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_assignment_element=new RewriteRuleSubtreeStream(adaptor,"rule assignment_element");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1725:3: ( ( assignment_element )? ( COMMA_T ( assignment_element )? )* -> ( assignment_element )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1725:5: ( assignment_element )? ( COMMA_T ( assignment_element )? )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1725:5: ( assignment_element )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==IDENTIFIER||LA108_0==LIST_T||LA108_0==DOLLAR_T) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1725:5: assignment_element
                    {
                    pushFollow(FOLLOW_assignment_element_in_assignment_list5048);
                    assignment_element339=assignment_element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_element.add(assignment_element339.getTree());

                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1725:25: ( COMMA_T ( assignment_element )? )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==COMMA_T) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1725:26: COMMA_T ( assignment_element )?
            	    {
            	    COMMA_T340=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_assignment_list5052); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T340);

            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1725:34: ( assignment_element )?
            	    int alt109=2;
            	    int LA109_0 = input.LA(1);

            	    if ( (LA109_0==IDENTIFIER||LA109_0==LIST_T||LA109_0==DOLLAR_T) ) {
            	        alt109=1;
            	    }
            	    switch (alt109) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1725:34: assignment_element
            	            {
            	            pushFollow(FOLLOW_assignment_element_in_assignment_list5054);
            	            assignment_element341=assignment_element();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_assignment_element.add(assignment_element341.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
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
            // 1725:57: -> ( assignment_element )*
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1725:61: ( assignment_element )*
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1728:1: assignment_element : ( variable | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) );
    public final CompilerAstParser.assignment_element_return assignment_element() throws RecognitionException {
        CompilerAstParser.assignment_element_return retval = new CompilerAstParser.assignment_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LIST_T343=null;
        Token LEFT_PARETHESIS344=null;
        Token RIGHT_PARETHESIS346=null;
        CompilerAstParser.variable_return variable342 = null;

        CompilerAstParser.assignment_list_return assignment_list345 = null;


        SLAST LIST_T343_tree=null;
        SLAST LEFT_PARETHESIS344_tree=null;
        SLAST RIGHT_PARETHESIS346_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_LIST_T=new RewriteRuleTokenStream(adaptor,"token LIST_T");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_assignment_list=new RewriteRuleSubtreeStream(adaptor,"rule assignment_list");
        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1729:3: ( variable | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==IDENTIFIER||LA111_0==DOLLAR_T) ) {
                alt111=1;
            }
            else if ( (LA111_0==LIST_T) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1729:5: variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_assignment_element5078);
                    variable342=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable342.getTree());

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1730:5: LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS
                    {
                    LIST_T343=(Token)match(input,LIST_T,FOLLOW_LIST_T_in_assignment_element5084); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LIST_T.add(LIST_T343);

                    LEFT_PARETHESIS344=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_assignment_element5086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS344);

                    pushFollow(FOLLOW_assignment_list_in_assignment_element5088);
                    assignment_list345=assignment_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list345.getTree());
                    RIGHT_PARETHESIS346=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_assignment_element5090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS346);



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
                    // 1730:62: -> ^( LIST_T assignment_list )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1730:66: ^( LIST_T assignment_list )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1733:1: array_pair_list : e1= array_pair_element ( COMMA_T e2= array_pair_element )* ( COMMA_T )? -> ( array_pair_element )+ ;
    public final CompilerAstParser.array_pair_list_return array_pair_list() throws RecognitionException {
        CompilerAstParser.array_pair_list_return retval = new CompilerAstParser.array_pair_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token COMMA_T347=null;
        Token COMMA_T348=null;
        CompilerAstParser.array_pair_element_return e1 = null;

        CompilerAstParser.array_pair_element_return e2 = null;


        SLAST COMMA_T347_tree=null;
        SLAST COMMA_T348_tree=null;
        RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
        RewriteRuleSubtreeStream stream_array_pair_element=new RewriteRuleSubtreeStream(adaptor,"rule array_pair_element");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1743:3: (e1= array_pair_element ( COMMA_T e2= array_pair_element )* ( COMMA_T )? -> ( array_pair_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1743:5: e1= array_pair_element ( COMMA_T e2= array_pair_element )* ( COMMA_T )?
            {
            pushFollow(FOLLOW_array_pair_element_in_array_pair_list5127);
            e1=array_pair_element();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_array_pair_element.add(e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1743:27: ( COMMA_T e2= array_pair_element )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==COMMA_T) ) {
                    int LA112_1 = input.LA(2);

                    if ( (LA112_1==LEFT_PARETHESIS||LA112_1==IDENTIFIER||LA112_1==REF_T||LA112_1==STRINGLITERAL||(LA112_1>=PLUS_T && LA112_1<=MINUS_T)||(LA112_1>=UNSET_T && LA112_1<=MINUS_MINUS_T)||(LA112_1>=AT_T && LA112_1<=PRINT_T)||(LA112_1>=DOLLAR_T && LA112_1<=HERE_DOC)||(LA112_1>=188 && LA112_1<=195)) ) {
                        alt112=1;
                    }


                }


                switch (alt112) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1743:28: COMMA_T e2= array_pair_element
            	    {
            	    COMMA_T347=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_array_pair_list5130); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T347);

            	    pushFollow(FOLLOW_array_pair_element_in_array_pair_list5134);
            	    e2=array_pair_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_array_pair_element.add(e2.getTree());

            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1743:60: ( COMMA_T )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==COMMA_T) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1743:60: COMMA_T
                    {
                    COMMA_T348=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_array_pair_list5138); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T348);


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
            // 1753:6: -> ( array_pair_element )+
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1756:1: array_pair_element : e1= expression ( ARROW_T e2= expression )? ;
    public final CompilerAstParser.array_pair_element_return array_pair_element() throws RecognitionException {
        CompilerAstParser.array_pair_element_return retval = new CompilerAstParser.array_pair_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token ARROW_T349=null;
        CompilerAstParser.expression_return e1 = null;

        CompilerAstParser.expression_return e2 = null;


        SLAST ARROW_T349_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1766:3: (e1= expression ( ARROW_T e2= expression )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1766:5: e1= expression ( ARROW_T e2= expression )?
            {
            root_0 = (SLAST)adaptor.nil();

            pushFollow(FOLLOW_expression_in_array_pair_element5183);
            e1=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1766:19: ( ARROW_T e2= expression )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==ARROW_T) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1766:20: ARROW_T e2= expression
                    {
                    ARROW_T349=(Token)match(input,ARROW_T,FOLLOW_ARROW_T_in_array_pair_element5186); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ARROW_T349_tree = (SLAST)adaptor.create(ARROW_T349);
                    root_0 = (SLAST)adaptor.becomeRoot(ARROW_T349_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_array_pair_element5191);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1778:1: variable : ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )* ;
    public final CompilerAstParser.variable_return variable() throws RecognitionException {
        CompilerAstParser.variable_return retval = new CompilerAstParser.variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token SINGLE_ARROW_T351=null;
        CompilerAstParser.base_variable_with_function_calls_return base_variable_with_function_calls350 = null;

        CompilerAstParser.object_property_return object_property352 = null;

        CompilerAstParser.ctor_arguments_return ctor_arguments353 = null;


        SLAST SINGLE_ARROW_T351_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1813:3: ( ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1813:5: ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1813:5: ( base_variable_with_function_calls -> base_variable_with_function_calls )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1813:6: base_variable_with_function_calls
            {
            pushFollow(FOLLOW_base_variable_with_function_calls_in_variable5225);
            base_variable_with_function_calls350=base_variable_with_function_calls();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_base_variable_with_function_calls.add(base_variable_with_function_calls350.getTree());
            if ( state.backtracking==0 ) {

                    token = (CommonToken)(base_variable_with_function_calls350!=null?((Token)base_variable_with_function_calls350.start):null);
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
            // 1819:6: -> base_variable_with_function_calls
            {
                adaptor.addChild(root_0, stream_base_variable_with_function_calls.nextTree());

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1820:5: ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==SINGLE_ARROW_T) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1820:6: SINGLE_ARROW_T object_property ( ctor_arguments )?
            	    {
            	    SINGLE_ARROW_T351=(Token)match(input,SINGLE_ARROW_T,FOLLOW_SINGLE_ARROW_T_in_variable5248); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_SINGLE_ARROW_T.add(SINGLE_ARROW_T351);

            	    pushFollow(FOLLOW_object_property_in_variable5250);
            	    object_property352=object_property();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_object_property.add(object_property352.getTree());
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1820:37: ( ctor_arguments )?
            	    int alt115=2;
            	    int LA115_0 = input.LA(1);

            	    if ( (LA115_0==LEFT_PARETHESIS) ) {
            	        alt115=1;
            	    }
            	    switch (alt115) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1820:37: ctor_arguments
            	            {
            	            pushFollow(FOLLOW_ctor_arguments_in_variable5252);
            	            ctor_arguments353=ctor_arguments();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments353.getTree());

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {

            	            token = (CommonToken)(base_variable_with_function_calls350!=null?((Token)base_variable_with_function_calls350.start):null);
            	            startIndex = token.getStartIndex();
            	            token = (CommonToken)(object_property352!=null?((Token)object_property352.stop):null);
            	            endIndex = token.getStopIndex();
            	            endIndexList.add(0, endIndex);
            	            
            	            if ((ctor_arguments353!=null?input.toString(ctor_arguments353.start,ctor_arguments353.stop):null) != null) {
            	              int sid = (ctor_arguments353!=null?((SLAST)ctor_arguments353.tree):null).startIndex;
            	              int eid = (ctor_arguments353!=null?((SLAST)ctor_arguments353.tree):null).endIndex;
            	              hasArgument.add(0, true);
            	              argumentStartIndex.add(sid);
            	              argumentEndIndex.add(eid);
            	              endIndex = ((CommonToken)(ctor_arguments353!=null?((Token)ctor_arguments353.stop):null)).getStopIndex();
            	            }
            	            else {
            	              hasArgument.add(0, false);
            	            }
            	          
            	    }


            	    // AST REWRITE
            	    // elements: variable, ctor_arguments, object_property
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 1840:5: -> ^( CALL $variable object_property ( ctor_arguments )? )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1840:9: ^( CALL $variable object_property ( ctor_arguments )? )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_object_property.nextTree());
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1840:42: ( ctor_arguments )?
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
            	    break loop116;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1843:1: base_variable_with_function_calls : ( ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? ) | fully_qualified_class_name ctor_arguments -> ^( CALL fully_qualified_class_name ctor_arguments ) );
    public final CompilerAstParser.base_variable_with_function_calls_return base_variable_with_function_calls() throws RecognitionException {
        CompilerAstParser.base_variable_with_function_calls_return retval = new CompilerAstParser.base_variable_with_function_calls_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name354 = null;

        CompilerAstParser.reference_variable_return reference_variable355 = null;

        CompilerAstParser.ctor_arguments_return ctor_arguments356 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name357 = null;

        CompilerAstParser.ctor_arguments_return ctor_arguments358 = null;


        RewriteRuleSubtreeStream stream_ctor_arguments=new RewriteRuleSubtreeStream(adaptor,"rule ctor_arguments");
        RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");
        RewriteRuleSubtreeStream stream_reference_variable=new RewriteRuleSubtreeStream(adaptor,"rule reference_variable");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1854:3: ( ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? ) | fully_qualified_class_name ctor_arguments -> ^( CALL fully_qualified_class_name ctor_arguments ) )
            int alt119=2;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1854:5: ( fully_qualified_class_name )? reference_variable ( ctor_arguments )?
                    {
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1854:5: ( fully_qualified_class_name )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==IDENTIFIER) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1854:5: fully_qualified_class_name
                            {
                            pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5309);
                            fully_qualified_class_name354=fully_qualified_class_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name354.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_reference_variable_in_base_variable_with_function_calls5312);
                    reference_variable355=reference_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_reference_variable.add(reference_variable355.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1854:52: ( ctor_arguments )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==LEFT_PARETHESIS) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1854:52: ctor_arguments
                            {
                            pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls5314);
                            ctor_arguments356=ctor_arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments356.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                            token = (CommonToken)(reference_variable355!=null?((Token)reference_variable355.start):null);
                            if ((fully_qualified_class_name354!=null?input.toString(fully_qualified_class_name354.start,fully_qualified_class_name354.stop):null) != null) {
                              token = (CommonToken)(fully_qualified_class_name354!=null?((Token)fully_qualified_class_name354.start):null);
                            }
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(reference_variable355!=null?((Token)reference_variable355.stop):null);
                            if ((ctor_arguments356!=null?input.toString(ctor_arguments356.start,ctor_arguments356.stop):null) != null) {
                              token = (CommonToken)(ctor_arguments356!=null?((Token)ctor_arguments356.stop):null);
                            }
                            endIndex = token.getStopIndex();
                          
                    }


                    // AST REWRITE
                    // elements: ctor_arguments, fully_qualified_class_name, reference_variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1867:7: -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1867:11: ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? )
                        {
                        SLAST root_1 = (SLAST)adaptor.nil();
                        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1867:22: ( fully_qualified_class_name )?
                        if ( stream_fully_qualified_class_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());

                        }
                        stream_fully_qualified_class_name.reset();
                        adaptor.addChild(root_1, stream_reference_variable.nextTree());
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1867:69: ( ctor_arguments )?
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1868:5: fully_qualified_class_name ctor_arguments
                    {
                    pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5348);
                    fully_qualified_class_name357=fully_qualified_class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name357.getTree());
                    pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls5350);
                    ctor_arguments358=ctor_arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments358.getTree());
                    if ( state.backtracking==0 ) {

                            token = (CommonToken)(fully_qualified_class_name357!=null?((Token)fully_qualified_class_name357.start):null);
                            startIndex = token.getStartIndex();
                            token = (CommonToken)(ctor_arguments358!=null?((Token)ctor_arguments358.stop):null);
                            endIndex = token.getStopIndex();
                            
                            System.out.println("ctor_ag::");
                          
                    }


                    // AST REWRITE
                    // elements: fully_qualified_class_name, ctor_arguments
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (SLAST)adaptor.nil();
                    // 1877:7: -> ^( CALL fully_qualified_class_name ctor_arguments )
                    {
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1877:11: ^( CALL fully_qualified_class_name ctor_arguments )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1882:1: object_property : ( reference_variable | reference_variable_without_dollar );
    public final CompilerAstParser.object_property_return object_property() throws RecognitionException {
        CompilerAstParser.object_property_return retval = new CompilerAstParser.object_property_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.reference_variable_return reference_variable359 = null;

        CompilerAstParser.reference_variable_without_dollar_return reference_variable_without_dollar360 = null;




          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1893:3: ( reference_variable | reference_variable_without_dollar )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==DOLLAR_T) ) {
                alt120=1;
            }
            else if ( (LA120_0==IDENTIFIER||LA120_0==LEFT_BRACKET) ) {
                alt120=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1893:5: reference_variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_reference_variable_in_object_property5403);
                    reference_variable359=reference_variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reference_variable359.getTree());
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(reference_variable359!=null?((Token)reference_variable359.start):null);
                           startIndex = token.getStartIndex();
                           token = (CommonToken)(reference_variable359!=null?((Token)reference_variable359.stop):null);
                           endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1900:5: reference_variable_without_dollar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_reference_variable_without_dollar_in_object_property5413);
                    reference_variable_without_dollar360=reference_variable_without_dollar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, reference_variable_without_dollar360.getTree());
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(reference_variable_without_dollar360!=null?((Token)reference_variable_without_dollar360.start):null);
                           startIndex = token.getStartIndex();
                           token = (CommonToken)(reference_variable_without_dollar360!=null?((Token)reference_variable_without_dollar360.stop):null);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1909:1: reference_variable : ( compound_variable -> ^( VAR compound_variable ) ) ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )* ;
    public final CompilerAstParser.reference_variable_return reference_variable() throws RecognitionException {
        CompilerAstParser.reference_variable_return retval = new CompilerAstParser.reference_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_OPEN_RECT362=null;
        Token RIGHT_OPEN_RECT363=null;
        Token LEFT_BRACKET364=null;
        Token RIGHT_BRACKET365=null;
        CompilerAstParser.expression_return e = null;

        CompilerAstParser.compound_variable_return compound_variable361 = null;


        SLAST LEFT_OPEN_RECT362_tree=null;
        SLAST RIGHT_OPEN_RECT363_tree=null;
        SLAST LEFT_BRACKET364_tree=null;
        SLAST RIGHT_BRACKET365_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1929:3: ( ( compound_variable -> ^( VAR compound_variable ) ) ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1929:5: ( compound_variable -> ^( VAR compound_variable ) ) ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1929:5: ( compound_variable -> ^( VAR compound_variable ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1929:6: compound_variable
            {
            pushFollow(FOLLOW_compound_variable_in_reference_variable5443);
            compound_variable361=compound_variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_variable.add(compound_variable361.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(compound_variable361!=null?((Token)compound_variable361.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(compound_variable361!=null?((Token)compound_variable361.stop):null);
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
            // 1936:5: -> ^( VAR compound_variable )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1936:8: ^( VAR compound_variable )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_compound_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1937:3: ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )*
            loop122:
            do {
                int alt122=3;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==LEFT_OPEN_RECT) ) {
                    alt122=1;
                }
                else if ( (LA122_0==LEFT_BRACKET) ) {
                    alt122=2;
                }


                switch (alt122) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1938:3: LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT
            	    {
            	    LEFT_OPEN_RECT362=(Token)match(input,LEFT_OPEN_RECT,FOLLOW_LEFT_OPEN_RECT_in_reference_variable5468); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LEFT_OPEN_RECT.add(LEFT_OPEN_RECT362);

            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1938:19: (e= expression )?
            	    int alt121=2;
            	    int LA121_0 = input.LA(1);

            	    if ( (LA121_0==LEFT_PARETHESIS||LA121_0==IDENTIFIER||LA121_0==REF_T||LA121_0==STRINGLITERAL||(LA121_0>=PLUS_T && LA121_0<=MINUS_T)||(LA121_0>=UNSET_T && LA121_0<=MINUS_MINUS_T)||(LA121_0>=AT_T && LA121_0<=PRINT_T)||(LA121_0>=DOLLAR_T && LA121_0<=HERE_DOC)||(LA121_0>=188 && LA121_0<=195)) ) {
            	        alt121=1;
            	    }
            	    switch (alt121) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1938:19: e= expression
            	            {
            	            pushFollow(FOLLOW_expression_in_reference_variable5472);
            	            e=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expression.add(e.getTree());

            	            }
            	            break;

            	    }

            	    RIGHT_OPEN_RECT363=(Token)match(input,RIGHT_OPEN_RECT,FOLLOW_RIGHT_OPEN_RECT_in_reference_variable5475); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RIGHT_OPEN_RECT.add(RIGHT_OPEN_RECT363);

            	    if ( state.backtracking==0 ) {

            	          endIndex = ((CommonToken)RIGHT_OPEN_RECT363).getStopIndex();
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
            	    // 1943:5: -> ^( INDEX $reference_variable ( $e)? )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1943:9: ^( INDEX $reference_variable ( $e)? )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(INDEX, "INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1943:37: ( $e)?
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1945:3: LEFT_BRACKET e= expression RIGHT_BRACKET
            	    {
            	    LEFT_BRACKET364=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_reference_variable5505); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET364);

            	    pushFollow(FOLLOW_expression_in_reference_variable5509);
            	    e=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(e.getTree());
            	    RIGHT_BRACKET365=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_reference_variable5511); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET365);

            	    if ( state.backtracking==0 ) {

            	          endIndex = ((CommonToken)RIGHT_BRACKET365).getStopIndex();
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
            	    // 1950:5: -> ^( HASH_INDEX $reference_variable $e)
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1950:9: ^( HASH_INDEX $reference_variable $e)
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
            	    break loop122;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1954:1: compound_variable : ( dollars IDENTIFIER | dollars LEFT_BRACKET expression RIGHT_BRACKET );
    public final CompilerAstParser.compound_variable_return compound_variable() throws RecognitionException {
        CompilerAstParser.compound_variable_return retval = new CompilerAstParser.compound_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token IDENTIFIER367=null;
        Token LEFT_BRACKET369=null;
        Token RIGHT_BRACKET371=null;
        CompilerAstParser.dollars_return dollars366 = null;

        CompilerAstParser.dollars_return dollars368 = null;

        CompilerAstParser.expression_return expression370 = null;


        SLAST IDENTIFIER367_tree=null;
        SLAST LEFT_BRACKET369_tree=null;
        SLAST RIGHT_BRACKET371_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;  

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1965:3: ( dollars IDENTIFIER | dollars LEFT_BRACKET expression RIGHT_BRACKET )
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1965:5: dollars IDENTIFIER
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_dollars_in_compound_variable5562);
                    dollars366=dollars();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dollars366.getTree());
                    IDENTIFIER367=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compound_variable5564); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER367_tree = (SLAST)adaptor.create(IDENTIFIER367);
                    adaptor.addChild(root_0, IDENTIFIER367_tree);
                    }
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(dollars366!=null?((Token)dollars366.start):null);
                           startIndex = token.getStartIndex();
                           token = (CommonToken)IDENTIFIER367;
                           endIndex = token.getStopIndex();
                         
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1972:5: dollars LEFT_BRACKET expression RIGHT_BRACKET
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_dollars_in_compound_variable5576);
                    dollars368=dollars();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dollars368.getTree());
                    LEFT_BRACKET369=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_compound_variable5578); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_compound_variable5581);
                    expression370=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression370.getTree());
                    RIGHT_BRACKET371=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_compound_variable5583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)(dollars368!=null?((Token)dollars368.start):null);
                           startIndex = token.getStartIndex();
                           token = (CommonToken)RIGHT_BRACKET371;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1981:1: dollars : ( DOLLAR_T )+ ;
    public final CompilerAstParser.dollars_return dollars() throws RecognitionException {
        CompilerAstParser.dollars_return retval = new CompilerAstParser.dollars_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token DOLLAR_T372=null;

        SLAST DOLLAR_T372_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1982:3: ( ( DOLLAR_T )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1982:5: ( DOLLAR_T )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1982:5: ( DOLLAR_T )+
            int cnt124=0;
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==DOLLAR_T) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1982:5: DOLLAR_T
            	    {
            	    DOLLAR_T372=(Token)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_dollars5604); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    DOLLAR_T372_tree = (SLAST)adaptor.create(DOLLAR_T372);
            	    adaptor.addChild(root_0, DOLLAR_T372_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt124 >= 1 ) break loop124;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(124, input);
                        throw eee;
                }
                cnt124++;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:1985:1: reference_variable_without_dollar : ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) ) ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )* ;
    public final CompilerAstParser.reference_variable_without_dollar_return reference_variable_without_dollar() throws RecognitionException {
        CompilerAstParser.reference_variable_without_dollar_return retval = new CompilerAstParser.reference_variable_without_dollar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_OPEN_RECT374=null;
        Token RIGHT_OPEN_RECT376=null;
        Token LEFT_BRACKET377=null;
        Token RIGHT_BRACKET379=null;
        CompilerAstParser.compound_variable_without_dollar_return compound_variable_without_dollar373 = null;

        CompilerAstParser.expression_return expression375 = null;

        CompilerAstParser.expression_return expression378 = null;


        SLAST LEFT_OPEN_RECT374_tree=null;
        SLAST RIGHT_OPEN_RECT376_tree=null;
        SLAST LEFT_BRACKET377_tree=null;
        SLAST RIGHT_BRACKET379_tree=null;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2004:3: ( ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) ) ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2004:5: ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) ) ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )*
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2004:5: ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2004:6: compound_variable_without_dollar
            {
            pushFollow(FOLLOW_compound_variable_without_dollar_in_reference_variable_without_dollar5632);
            compound_variable_without_dollar373=compound_variable_without_dollar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_variable_without_dollar.add(compound_variable_without_dollar373.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(compound_variable_without_dollar373!=null?((Token)compound_variable_without_dollar373.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(compound_variable_without_dollar373!=null?((Token)compound_variable_without_dollar373.stop):null);
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
            // 2011:6: -> ^( VAR compound_variable_without_dollar )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2011:10: ^( VAR compound_variable_without_dollar )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(VAR, "VAR"), root_1);

                adaptor.addChild(root_1, stream_compound_variable_without_dollar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2012:3: ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )*
            loop126:
            do {
                int alt126=3;
                int LA126_0 = input.LA(1);

                if ( (LA126_0==LEFT_OPEN_RECT) ) {
                    alt126=1;
                }
                else if ( (LA126_0==LEFT_BRACKET) ) {
                    alt126=2;
                }


                switch (alt126) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2013:3: LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT
            	    {
            	    LEFT_OPEN_RECT374=(Token)match(input,LEFT_OPEN_RECT,FOLLOW_LEFT_OPEN_RECT_in_reference_variable_without_dollar5661); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LEFT_OPEN_RECT.add(LEFT_OPEN_RECT374);

            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2013:18: ( expression )?
            	    int alt125=2;
            	    int LA125_0 = input.LA(1);

            	    if ( (LA125_0==LEFT_PARETHESIS||LA125_0==IDENTIFIER||LA125_0==REF_T||LA125_0==STRINGLITERAL||(LA125_0>=PLUS_T && LA125_0<=MINUS_T)||(LA125_0>=UNSET_T && LA125_0<=MINUS_MINUS_T)||(LA125_0>=AT_T && LA125_0<=PRINT_T)||(LA125_0>=DOLLAR_T && LA125_0<=HERE_DOC)||(LA125_0>=188 && LA125_0<=195)) ) {
            	        alt125=1;
            	    }
            	    switch (alt125) {
            	        case 1 :
            	            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2013:18: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_reference_variable_without_dollar5663);
            	            expression375=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_expression.add(expression375.getTree());

            	            }
            	            break;

            	    }

            	    RIGHT_OPEN_RECT376=(Token)match(input,RIGHT_OPEN_RECT,FOLLOW_RIGHT_OPEN_RECT_in_reference_variable_without_dollar5666); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RIGHT_OPEN_RECT.add(RIGHT_OPEN_RECT376);

            	    if ( state.backtracking==0 ) {

            	          endIndex = ((CommonToken)RIGHT_OPEN_RECT376).getStopIndex();
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
            	    // 2018:6: -> ^( INDEX $reference_variable_without_dollar ( expression )? )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2018:10: ^( INDEX $reference_variable_without_dollar ( expression )? )
            	        {
            	        SLAST root_1 = (SLAST)adaptor.nil();
            	        root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(INDEX, "INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2018:53: ( expression )?
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2020:3: LEFT_BRACKET expression RIGHT_BRACKET
            	    {
            	    LEFT_BRACKET377=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_reference_variable_without_dollar5697); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET377);

            	    pushFollow(FOLLOW_expression_in_reference_variable_without_dollar5699);
            	    expression378=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression378.getTree());
            	    RIGHT_BRACKET379=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_reference_variable_without_dollar5701); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET379);

            	    if ( state.backtracking==0 ) {

            	          endIndex = ((CommonToken)RIGHT_BRACKET379).getStopIndex();
            	          endIndexList.add(0, endIndex);
            	        
            	    }


            	    // AST REWRITE
            	    // elements: reference_variable_without_dollar, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (SLAST)adaptor.nil();
            	    // 2025:6: -> ^( HASH_INDEX $reference_variable_without_dollar expression )
            	    {
            	        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2025:10: ^( HASH_INDEX $reference_variable_without_dollar expression )
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
            	    break loop126;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2029:1: compound_variable_without_dollar : ( IDENTIFIER | LEFT_BRACKET expression RIGHT_BRACKET );
    public final CompilerAstParser.compound_variable_without_dollar_return compound_variable_without_dollar() throws RecognitionException {
        CompilerAstParser.compound_variable_without_dollar_return retval = new CompilerAstParser.compound_variable_without_dollar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token IDENTIFIER380=null;
        Token LEFT_BRACKET381=null;
        Token RIGHT_BRACKET383=null;
        CompilerAstParser.expression_return expression382 = null;


        SLAST IDENTIFIER380_tree=null;
        SLAST LEFT_BRACKET381_tree=null;
        SLAST RIGHT_BRACKET383_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;  

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2040:3: ( IDENTIFIER | LEFT_BRACKET expression RIGHT_BRACKET )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==IDENTIFIER) ) {
                alt127=1;
            }
            else if ( (LA127_0==LEFT_BRACKET) ) {
                alt127=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2040:5: IDENTIFIER
                    {
                    root_0 = (SLAST)adaptor.nil();

                    IDENTIFIER380=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compound_variable_without_dollar5751); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER380_tree = (SLAST)adaptor.create(IDENTIFIER380);
                    adaptor.addChild(root_0, IDENTIFIER380_tree);
                    }
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)IDENTIFIER380;
                           startIndex = token.getStartIndex();
                           endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2046:5: LEFT_BRACKET expression RIGHT_BRACKET
                    {
                    root_0 = (SLAST)adaptor.nil();

                    LEFT_BRACKET381=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_compound_variable_without_dollar5761); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_compound_variable_without_dollar5764);
                    expression382=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression382.getTree());
                    RIGHT_BRACKET383=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_compound_variable_without_dollar5766); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                           token = (CommonToken)LEFT_BRACKET381;
                           startIndex = token.getStartIndex();
                           token = (CommonToken)RIGHT_BRACKET383;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2055:1: ctor_arguments : LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS -> ^( ARGU ( expr_list )? ) ;
    public final CompilerAstParser.ctor_arguments_return ctor_arguments() throws RecognitionException {
        CompilerAstParser.ctor_arguments_return retval = new CompilerAstParser.ctor_arguments_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token LEFT_PARETHESIS384=null;
        Token RIGHT_PARETHESIS386=null;
        CompilerAstParser.expr_list_return expr_list385 = null;


        SLAST LEFT_PARETHESIS384_tree=null;
        SLAST RIGHT_PARETHESIS386_tree=null;
        RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
        RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2066:3: ( LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS -> ^( ARGU ( expr_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2066:6: LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS
            {
            LEFT_PARETHESIS384=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_ctor_arguments5797); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS384);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2066:22: ( expr_list )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==LEFT_PARETHESIS||LA128_0==IDENTIFIER||LA128_0==REF_T||LA128_0==STRINGLITERAL||(LA128_0>=PLUS_T && LA128_0<=MINUS_T)||(LA128_0>=UNSET_T && LA128_0<=MINUS_MINUS_T)||(LA128_0>=AT_T && LA128_0<=PRINT_T)||(LA128_0>=DOLLAR_T && LA128_0<=HERE_DOC)||(LA128_0>=188 && LA128_0<=195)) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2066:22: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_ctor_arguments5799);
                    expr_list385=expr_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_list.add(expr_list385.getTree());

                    }
                    break;

            }

            RIGHT_PARETHESIS386=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_ctor_arguments5802); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS386);

            if ( state.backtracking==0 ) {

                    token = (CommonToken)LEFT_PARETHESIS384;
                    startIndex = token.getStartIndex();
                    token = (CommonToken)RIGHT_PARETHESIS386;
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
            // 2073:6: -> ^( ARGU ( expr_list )? )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2073:10: ^( ARGU ( expr_list )? )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(ARGU, "ARGU"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2073:17: ( expr_list )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2076:1: pure_variable : ( REF_T )? ( DOLLAR_T )+ IDENTIFIER -> ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) ;
    public final CompilerAstParser.pure_variable_return pure_variable() throws RecognitionException {
        CompilerAstParser.pure_variable_return retval = new CompilerAstParser.pure_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token REF_T387=null;
        Token DOLLAR_T388=null;
        Token IDENTIFIER389=null;

        SLAST REF_T387_tree=null;
        SLAST DOLLAR_T388_tree=null;
        SLAST IDENTIFIER389_tree=null;
        RewriteRuleTokenStream stream_REF_T=new RewriteRuleTokenStream(adaptor,"token REF_T");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_DOLLAR_T=new RewriteRuleTokenStream(adaptor,"token DOLLAR_T");


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2086:3: ( ( REF_T )? ( DOLLAR_T )+ IDENTIFIER -> ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2086:5: ( REF_T )? ( DOLLAR_T )+ IDENTIFIER
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2086:5: ( REF_T )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==REF_T) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2086:5: REF_T
                    {
                    REF_T387=(Token)match(input,REF_T,FOLLOW_REF_T_in_pure_variable5848); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REF_T.add(REF_T387);


                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2086:12: ( DOLLAR_T )+
            int cnt130=0;
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==DOLLAR_T) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2086:12: DOLLAR_T
            	    {
            	    DOLLAR_T388=(Token)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_pure_variable5851); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOLLAR_T.add(DOLLAR_T388);


            	    }
            	    break;

            	default :
            	    if ( cnt130 >= 1 ) break loop130;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(130, input);
                        throw eee;
                }
                cnt130++;
            } while (true);

            IDENTIFIER389=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pure_variable5854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER389);

            if ( state.backtracking==0 ) {

                    token = (CommonToken)DOLLAR_T388;
                    if ((REF_T387!=null?REF_T387.getText():null) != null) {
                      token = (CommonToken)REF_T387;
                    }
                    startIndex = token.getStartIndex();
                    token = (CommonToken)IDENTIFIER389;
                    endIndex = token.getStopIndex();
                  
            }


            // AST REWRITE
            // elements: IDENTIFIER, REF_T, DOLLAR_T
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (SLAST)adaptor.nil();
            // 2096:5: -> ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2096:9: ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER )
                {
                SLAST root_1 = (SLAST)adaptor.nil();
                root_1 = (SLAST)adaptor.becomeRoot((SLAST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2096:20: ( REF_T )?
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2099:1: scalar : constant -> ^( SCALAR constant ) ;
    public final CompilerAstParser.scalar_return scalar() throws RecognitionException {
        CompilerAstParser.scalar_return retval = new CompilerAstParser.scalar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        CompilerAstParser.constant_return constant390 = null;


        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");

          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2109:3: ( constant -> ^( SCALAR constant ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2109:5: constant
            {
            pushFollow(FOLLOW_constant_in_scalar5906);
            constant390=constant();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constant.add(constant390.getTree());
            if ( state.backtracking==0 ) {

                  token = (CommonToken)(constant390!=null?((Token)constant390.start):null);
                  startIndex = token.getStartIndex();
                  token = (CommonToken)(constant390!=null?((Token)constant390.stop):null);
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
            // 2116:5: -> ^( SCALAR constant )
            {
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2116:9: ^( SCALAR constant )
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2119:1: constant : ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | DOUBLELITERRAL | REALLITERAL | common_scalar | fully_qualified_class_name | HERE_DOC );
    public final CompilerAstParser.constant_return constant() throws RecognitionException {
        CompilerAstParser.constant_return retval = new CompilerAstParser.constant_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token INTLITERAL391=null;
        Token FLOATLITERAL392=null;
        Token STRINGLITERAL393=null;
        Token DOUBLELITERRAL394=null;
        Token REALLITERAL395=null;
        Token HERE_DOC398=null;
        CompilerAstParser.common_scalar_return common_scalar396 = null;

        CompilerAstParser.fully_qualified_class_name_return fully_qualified_class_name397 = null;


        SLAST INTLITERAL391_tree=null;
        SLAST FLOATLITERAL392_tree=null;
        SLAST STRINGLITERAL393_tree=null;
        SLAST DOUBLELITERRAL394_tree=null;
        SLAST REALLITERAL395_tree=null;
        SLAST HERE_DOC398_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          CommonToken token;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2129:3: ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | DOUBLELITERRAL | REALLITERAL | common_scalar | fully_qualified_class_name | HERE_DOC )
            int alt131=8;
            switch ( input.LA(1) ) {
            case INTLITERAL:
                {
                alt131=1;
                }
                break;
            case FLOATLITERAL:
                {
                alt131=2;
                }
                break;
            case STRINGLITERAL:
                {
                alt131=3;
                }
                break;
            case DOUBLELITERRAL:
                {
                alt131=4;
                }
                break;
            case REALLITERAL:
                {
                alt131=5;
                }
                break;
            case 189:
            case 190:
            case 191:
            case 192:
            case 193:
            case 194:
            case 195:
                {
                alt131=6;
                }
                break;
            case IDENTIFIER:
                {
                alt131=7;
                }
                break;
            case HERE_DOC:
                {
                alt131=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2129:5: INTLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    INTLITERAL391=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_constant5951); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTLITERAL391_tree = (SLAST)adaptor.create(INTLITERAL391);
                    adaptor.addChild(root_0, INTLITERAL391_tree);
                    }

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2130:5: FLOATLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    FLOATLITERAL392=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_constant5960); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FLOATLITERAL392_tree = (SLAST)adaptor.create(FLOATLITERAL392);
                    adaptor.addChild(root_0, FLOATLITERAL392_tree);
                    }

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2131:5: STRINGLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    STRINGLITERAL393=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_constant5968); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRINGLITERAL393_tree = (SLAST)adaptor.create(STRINGLITERAL393);
                    adaptor.addChild(root_0, STRINGLITERAL393_tree);
                    }

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2133:5: DOUBLELITERRAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    DOUBLELITERRAL394=(Token)match(input,DOUBLELITERRAL,FOLLOW_DOUBLELITERRAL_in_constant5975); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOUBLELITERRAL394_tree = (SLAST)adaptor.create(DOUBLELITERRAL394);
                    adaptor.addChild(root_0, DOUBLELITERRAL394_tree);
                    }

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2134:5: REALLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    REALLITERAL395=(Token)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_constant5981); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    REALLITERAL395_tree = (SLAST)adaptor.create(REALLITERAL395);
                    adaptor.addChild(root_0, REALLITERAL395_tree);
                    }

                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2135:5: common_scalar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_common_scalar_in_constant5987);
                    common_scalar396=common_scalar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, common_scalar396.getTree());

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2136:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    pushFollow(FOLLOW_fully_qualified_class_name_in_constant5995);
                    fully_qualified_class_name397=fully_qualified_class_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fully_qualified_class_name397.getTree());
                    if ( state.backtracking==0 ) {

                          token = (CommonToken)(fully_qualified_class_name397!=null?((Token)fully_qualified_class_name397.start):null);
                          startIndex = token.getStartIndex();
                          token = (CommonToken)(fully_qualified_class_name397!=null?((Token)fully_qualified_class_name397.stop):null);
                          endIndex = token.getStopIndex();
                        
                    }

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2143:5: HERE_DOC
                    {
                    root_0 = (SLAST)adaptor.nil();

                    HERE_DOC398=(Token)match(input,HERE_DOC,FOLLOW_HERE_DOC_in_constant6005); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    HERE_DOC398_tree = (SLAST)adaptor.create(HERE_DOC398);
                    adaptor.addChild(root_0, HERE_DOC398_tree);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2146:1: common_scalar : ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' );
    public final CompilerAstParser.common_scalar_return common_scalar() throws RecognitionException {
        CompilerAstParser.common_scalar_return retval = new CompilerAstParser.common_scalar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        Token set399=null;

        SLAST set399_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:2147:3: ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:
            {
            root_0 = (SLAST)adaptor.nil();

            set399=(Token)input.LT(1);
            if ( (input.LA(1)>=189 && input.LA(1)<=195) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (SLAST)adaptor.create(set399));
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


        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:593:53: ( ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )
        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:593:53: ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement
        {
        match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_synpred1_CompilerAst2176); if (state.failed) return ;
        match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_synpred1_CompilerAst2178); if (state.failed) return ;
        pushFollow(FOLLOW_expression_in_synpred1_CompilerAst2182);
        eElseCond=expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_synpred1_CompilerAst2184); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred1_CompilerAst2188);
        s2=statement();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_CompilerAst

    // $ANTLR start synpred2_CompilerAst
    public final void synpred2_CompilerAst_fragment() throws RecognitionException {   
        CompilerAstParser.statement_return s3 = null;


        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:594:42: ( ELSE_T s3= statement )
        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php5/CompilerAst.g:594:42: ELSE_T s3= statement
        {
        match(input,ELSE_T,FOLLOW_ELSE_T_in_synpred2_CompilerAst2214); if (state.failed) return ;
        pushFollow(FOLLOW_statement_in_synpred2_CompilerAst2218);
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
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA105 dfa105 = new DFA105(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA123 dfa123 = new DFA123(this);
    static final String DFA21_eotS =
        "\62\uffff";
    static final String DFA21_eofS =
        "\62\uffff";
    static final String DFA21_minS =
        "\1\72\1\uffff\1\72\1\64\1\uffff\1\64\1\60\1\61\3\73\1\u0096\1\64"+
        "\1\62\1\64\1\61\2\uffff\1\73\2\64\10\61\3\73\1\u0096\1\64\1\61\1"+
        "\64\2\61\1\73\1\64\12\61";
    static final String DFA21_maxS =
        "\1\u00b3\1\uffff\1\u00b3\1\73\1\uffff\1\64\1\60\1\u00bc\5\u0096"+
        "\1\67\1\u0096\1\126\2\uffff\1\u0096\1\u00c3\1\u00bc\10\125\5\u0096"+
        "\1\125\1\u0096\1\126\1\125\1\u0096\1\u00c3\12\125";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\13\uffff\1\2\1\3\40\uffff";
    static final String DFA21_specialS =
        "\62\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\3\1\uffff\1\4\10\uffff\1\2\150\uffff\2\2\1\1\3\2",
            "",
            "\1\3\1\1\11\uffff\1\2\120\uffff\1\1\27\uffff\2\2\1\uffff\3"+
            "\2",
            "\1\6\6\uffff\1\5",
            "",
            "\1\6",
            "\1\7",
            "\1\15\2\uffff\1\10\6\uffff\1\13\1\12\112\uffff\2\11\15\uffff"+
            "\1\14\35\uffff\11\11",
            "\1\13\1\12\27\uffff\1\16\101\uffff\1\14",
            "\1\13\1\12\131\uffff\1\14",
            "\1\13\132\uffff\1\14",
            "\1\14",
            "\1\17\141\uffff\1\14",
            "\1\20\4\uffff\1\21",
            "\1\22\6\uffff\1\13\1\12\131\uffff\1\14",
            "\1\15\43\uffff\1\24\1\23",
            "",
            "",
            "\1\13\1\12\27\uffff\1\16\101\uffff\1\14",
            "\1\33\35\uffff\1\27\104\uffff\1\25\1\26\1\30\1\31\1\34\41\uffff"+
            "\7\32",
            "\1\35\6\uffff\1\40\1\37\112\uffff\2\36\15\uffff\1\41\35\uffff"+
            "\11\36",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\42\uffff\1\42\1\24",
            "\1\15\43\uffff\1\24",
            "\1\40\1\37\27\uffff\1\43\101\uffff\1\41",
            "\1\40\1\37\131\uffff\1\41",
            "\1\40\132\uffff\1\41",
            "\1\41",
            "\1\44\141\uffff\1\41",
            "\1\15\2\uffff\1\45\40\uffff\1\24",
            "\1\46\6\uffff\1\40\1\37\131\uffff\1\41",
            "\1\15\43\uffff\1\24\1\47",
            "\1\15\42\uffff\1\42\1\24",
            "\1\40\1\37\27\uffff\1\43\101\uffff\1\41",
            "\1\56\35\uffff\1\52\104\uffff\1\50\1\51\1\53\1\54\1\57\41\uffff"+
            "\7\55",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\42\uffff\1\60\1\24",
            "\1\15\43\uffff\1\24",
            "\1\15\2\uffff\1\61\40\uffff\1\24",
            "\1\15\42\uffff\1\60\1\24"
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
            return "209:1: class_statement : ( variable_modifiers static_var_list SEMI_COLON -> ^( FIELD_DECL variable_modifiers static_var_list ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block ) | CONST_T directive SEMI_COLON -> ^( FIELD_DECL CONST_T directive ) );";
        }
    }
    static final String DFA33_eotS =
        "\32\uffff";
    static final String DFA33_eofS =
        "\32\uffff";
    static final String DFA33_minS =
        "\1\60\22\uffff\1\60\6\uffff";
    static final String DFA33_maxS =
        "\1\u00c3\22\uffff\1\u00c3\6\uffff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\uffff\1\25\1\26\1\27\1\30\1\24\1"+
        "\23";
    static final String DFA33_specialS =
        "\32\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\15\1\uffff\1\20\1\uffff\1\15\2\uffff\1\1\3\uffff\1\15\1\uffff"+
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\16\2\uffff\1"+
            "\17\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\15\4\uffff\1\2\52\uffff"+
            "\2\15\3\uffff\6\15\1\uffff\5\15\3\uffff\6\15\40\uffff\10\15",
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
            "\1\30\3\uffff\1\31\35\uffff\1\31\104\uffff\5\31\41\uffff\7"+
            "\31",
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
            return "324:1: topStatement : ( block | if_stat | WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement -> ^( WHILE_T ^( CONDITION expression ) while_statement ) | DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( DO_T ^( CONDITION expression ) statement ) | FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? ) | SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list ) | BREAK_T ( expression )? SEMI_COLON -> ^( BREAK_T ( expression )? ) | CONTINUE_T ( expression )? SEMI_COLON -> ^( CONTINUE_T ( expression )? ) | RETURN_T ( expression )? SEMI_COLON -> ^( RETURN_T ( expression )? ) | GLOBAL_T variable_list SEMI_COLON -> ^( GLOBAL_T variable_list ) | STATIC_T static_var_list SEMI_COLON -> ^( STATIC_T static_var_list ) | ECHO_T expr_list SEMI_COLON -> ^( ECHO_T expr_list ) | expression SEMI_COLON | FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement ) | DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement -> ^( DECLARE_T directive ( declare_statement )? ) | SEMI_COLON -> ^( EMPTYSTATEMENT SEMI_COLON ) | TRY_T block ( catch_branch )+ -> ^( TRY_T block ( catch_branch )+ ) | THROW_T expression SEMI_COLON -> ^( THROW_T expression ) | USE_T scalar SEMI_COLON -> ^( USE_T scalar ) | USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON -> ^( USE_PARETHESIS_T scalar ) | INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_T expression ) | INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_ONCE_T expression ) | REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_T expression ) | REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_ONCE_T expression ) );";
        }
    }
    static final String DFA41_eotS =
        "\76\uffff";
    static final String DFA41_eofS =
        "\1\1\75\uffff";
    static final String DFA41_minS =
        "\1\57\62\uffff\1\0\12\uffff";
    static final String DFA41_maxS =
        "\1\u00c3\62\uffff\1\0\12\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\2\73\uffff\1\1";
    static final String DFA41_specialS =
        "\63\uffff\1\0\12\uffff}>";
    static final String[] DFA41_transitionS = {
            "\2\1\1\uffff\3\1\2\uffff\5\1\1\uffff\13\1\2\uffff\11\1\4\uffff"+
            "\1\1\1\63\1\1\1\uffff\4\1\1\uffff\4\1\36\uffff\2\1\3\uffff\6"+
            "\1\1\uffff\5\1\3\uffff\6\1\21\uffff\3\1\14\uffff\10\1",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 593:20: ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_51 = input.LA(1);

                         
                        int index41_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_CompilerAst()) ) {s = 61;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index41_51);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\76\uffff";
    static final String DFA42_eofS =
        "\1\2\75\uffff";
    static final String DFA42_minS =
        "\1\57\1\0\74\uffff";
    static final String DFA42_maxS =
        "\1\u00c3\1\0\74\uffff";
    static final String DFA42_acceptS =
        "\2\uffff\1\2\72\uffff\1\1";
    static final String DFA42_specialS =
        "\1\uffff\1\0\74\uffff}>";
    static final String[] DFA42_transitionS = {
            "\2\2\1\uffff\3\2\2\uffff\5\2\1\uffff\13\2\2\uffff\11\2\4\uffff"+
            "\2\2\1\1\1\uffff\4\2\1\uffff\4\2\36\uffff\2\2\3\uffff\6\2\1"+
            "\uffff\5\2\3\uffff\6\2\21\uffff\3\2\14\uffff\10\2",
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
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "594:9: ( options {k=1; backtrack=true; } : ELSE_T s3= statement )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_1 = input.LA(1);

                         
                        int index42_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_CompilerAst()) ) {s = 61;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index42_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA104_eotS =
        "\17\uffff";
    static final String DFA104_eofS =
        "\17\uffff";
    static final String DFA104_minS =
        "\1\60\1\64\1\60\12\uffff\2\60";
    static final String DFA104_maxS =
        "\2\u00c3\1\u0096\12\uffff\2\u0096";
    static final String DFA104_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff";
    static final String DFA104_specialS =
        "\17\uffff}>";
    static final String[] DFA104_transitionS = {
            "\1\5\3\uffff\1\2\35\uffff\1\4\64\uffff\1\12\1\11\5\uffff\1\1"+
            "\1\6\1\10\1\13\1\14\3\uffff\1\3\5\4\40\uffff\1\7\7\4",
            "\1\2\35\uffff\1\4\103\uffff\1\3\5\4\41\uffff\7\4",
            "\1\3\2\4\5\uffff\1\4\2\uffff\1\4\14\uffff\2\4\12\uffff\1\15"+
            "\2\4\3\uffff\1\4\11\uffff\43\4\4\uffff\3\4\7\uffff\1\4\1\3",
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
            "\1\3\2\4\1\uffff\1\16\3\uffff\1\4\2\uffff\1\4\14\uffff\2\4"+
            "\13\uffff\2\4\3\uffff\1\4\11\uffff\43\4\4\uffff\3\4\7\uffff"+
            "\1\4\1\3",
            "\1\3\2\4\5\uffff\1\4\2\uffff\1\4\14\uffff\2\4\12\uffff\1\15"+
            "\2\4\3\uffff\1\4\11\uffff\43\4\4\uffff\3\4\7\uffff\1\4\1\3"
    };

    static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
    static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
    static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
    static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
    static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
    static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
    static final short[][] DFA104_transition;

    static {
        int numStates = DFA104_transitionS.length;
        DFA104_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = DFA104_eot;
            this.eof = DFA104_eof;
            this.min = DFA104_min;
            this.max = DFA104_max;
            this.accept = DFA104_accept;
            this.special = DFA104_special;
            this.transition = DFA104_transition;
        }
        public String getDescription() {
            return "1539:1: atom_expr : ( ( AT_T )? variable | ( AT_T )? scalar | LEFT_PARETHESIS expression RIGHT_PARETHESIS | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) | 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS -> ^( ARRAY_DECL ( array_pair_list )? ) | NEW_T class_name_reference -> ^( NEW_T class_name_reference ) | CLONE_T variable -> ^( CLONE_T variable ) | UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS -> ^( UNSET_T variable_list ) | BACKTRICKLITERAL | PRINT_T expression -> ^( PRINT_T expression ) );";
        }
    }
    static final String DFA105_eotS =
        "\6\uffff";
    static final String DFA105_eofS =
        "\6\uffff";
    static final String DFA105_minS =
        "\1\64\1\60\1\uffff\1\60\1\uffff\1\60";
    static final String DFA105_maxS =
        "\2\u0096\1\uffff\1\u0096\1\uffff\1\u0096";
    static final String DFA105_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String DFA105_specialS =
        "\6\uffff}>";
    static final String[] DFA105_transitionS = {
            "\1\1\141\uffff\1\2",
            "\1\2\2\4\5\uffff\1\4\2\uffff\1\4\14\uffff\2\4\12\uffff\1\3"+
            "\2\4\3\uffff\1\4\11\uffff\43\4\4\uffff\3\4\7\uffff\1\4\1\2",
            "",
            "\1\2\2\4\1\uffff\1\5\3\uffff\1\4\2\uffff\1\4\14\uffff\2\4\13"+
            "\uffff\2\4\3\uffff\1\4\11\uffff\43\4\4\uffff\3\4\7\uffff\1\4"+
            "\1\2",
            "",
            "\1\2\2\4\5\uffff\1\4\2\uffff\1\4\14\uffff\2\4\12\uffff\1\3"+
            "\2\4\3\uffff\1\4\11\uffff\43\4\4\uffff\3\4\7\uffff\1\4\1\2"
    };

    static final short[] DFA105_eot = DFA.unpackEncodedString(DFA105_eotS);
    static final short[] DFA105_eof = DFA.unpackEncodedString(DFA105_eofS);
    static final char[] DFA105_min = DFA.unpackEncodedStringToUnsignedChars(DFA105_minS);
    static final char[] DFA105_max = DFA.unpackEncodedStringToUnsignedChars(DFA105_maxS);
    static final short[] DFA105_accept = DFA.unpackEncodedString(DFA105_acceptS);
    static final short[] DFA105_special = DFA.unpackEncodedString(DFA105_specialS);
    static final short[][] DFA105_transition;

    static {
        int numStates = DFA105_transitionS.length;
        DFA105_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA105_transition[i] = DFA.unpackEncodedString(DFA105_transitionS[i]);
        }
    }

    class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = DFA105_eot;
            this.eof = DFA105_eof;
            this.min = DFA105_min;
            this.max = DFA105_max;
            this.accept = DFA105_accept;
            this.special = DFA105_special;
            this.transition = DFA105_transition;
        }
        public String getDescription() {
            return "1653:1: class_name_reference : ( dynamic_name_reference | fully_qualified_class_name );";
        }
    }
    static final String DFA119_eotS =
        "\6\uffff";
    static final String DFA119_eofS =
        "\6\uffff";
    static final String DFA119_minS =
        "\1\64\1\60\1\uffff\1\60\1\uffff\1\60";
    static final String DFA119_maxS =
        "\2\u0096\1\uffff\1\u0096\1\uffff\1\u0096";
    static final String DFA119_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\1\uffff";
    static final String DFA119_specialS =
        "\6\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\1\141\uffff\1\2",
            "\1\4\43\uffff\1\3\101\uffff\1\2",
            "",
            "\1\4\3\uffff\1\5\141\uffff\1\2",
            "",
            "\1\4\43\uffff\1\3\101\uffff\1\2"
    };

    static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
    static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
    static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
    static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
    static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
    static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
    static final short[][] DFA119_transition;

    static {
        int numStates = DFA119_transitionS.length;
        DFA119_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = DFA119_eot;
            this.eof = DFA119_eof;
            this.min = DFA119_min;
            this.max = DFA119_max;
            this.accept = DFA119_accept;
            this.special = DFA119_special;
            this.transition = DFA119_transition;
        }
        public String getDescription() {
            return "1843:1: base_variable_with_function_calls : ( ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? ) | fully_qualified_class_name ctor_arguments -> ^( CALL fully_qualified_class_name ctor_arguments ) );";
        }
    }
    static final String DFA123_eotS =
        "\4\uffff";
    static final String DFA123_eofS =
        "\4\uffff";
    static final String DFA123_minS =
        "\1\u0096\1\64\2\uffff";
    static final String DFA123_maxS =
        "\2\u0096\2\uffff";
    static final String DFA123_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA123_specialS =
        "\4\uffff}>";
    static final String[] DFA123_transitionS = {
            "\1\1",
            "\1\3\2\uffff\1\2\136\uffff\1\1",
            "",
            ""
    };

    static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
    static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
    static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
    static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
    static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
    static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
    static final short[][] DFA123_transition;

    static {
        int numStates = DFA123_transitionS.length;
        DFA123_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
        }
    }

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = DFA123_eot;
            this.eof = DFA123_eof;
            this.min = DFA123_min;
            this.max = DFA123_max;
            this.accept = DFA123_accept;
            this.special = DFA123_special;
            this.transition = DFA123_transition;
        }
        public String getDescription() {
            return "1954:1: compound_variable : ( dollars IDENTIFIER | dollars LEFT_BRACKET expression RIGHT_BRACKET );";
        }
    }
 

    public static final BitSet FOLLOW_SOC_T_in_php_source275 = new BitSet(new long[]{0xEE9D800000000000L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_SOC_PHP_T_in_php_source287 = new BitSet(new long[]{0xEE9D800000000000L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_top_statement_list_in_php_source302 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_EOC_T_in_php_source311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_top_statement_in_top_statement_list346 = new BitSet(new long[]{0xEE9D000000000002L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_top_statement360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_statement_in_top_statement366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_declaration_statement_in_top_statement372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_halt_compiler_statement_in_top_statement378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_statement_in_inner_statement_list394 = new BitSet(new long[]{0xEE9D000000000002L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_inner_statement411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_statement_in_inner_statement417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_declaration_statement_in_inner_statement423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_halt_compiler_statement_in_inner_statement429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_halt_compiler_statement444 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_halt_compiler_statement446 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_halt_compiler_statement448 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_halt_compiler_statement450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_entr_type_in_class_declaration_statement485 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_CLASS_T_in_class_declaration_statement488 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement490 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement493 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_class_declaration_statement495 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_T_in_class_declaration_statement500 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement502 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_class_declaration_statement512 = new BitSet(new long[]{0x1500000000000000L,0x0000000000000020L,0x000FC00000000000L});
    public static final BitSet FOLLOW_class_statement_in_class_declaration_statement514 = new BitSet(new long[]{0x1500000000000000L,0x0000000000000020L,0x000FC00000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_class_declaration_statement517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_T_in_class_declaration_statement579 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement581 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement584 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement586 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_T_in_class_declaration_statement591 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement593 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_class_declaration_statement603 = new BitSet(new long[]{0x1500000000000000L,0x0000000000000020L,0x000FC00000000000L});
    public static final BitSet FOLLOW_class_statement_in_class_declaration_statement605 = new BitSet(new long[]{0x1500000000000000L,0x0000000000000020L,0x000FC00000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_class_declaration_statement608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_class_entr_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_modifiers_in_class_statement707 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_static_var_list_in_class_statement709 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_class_statement711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_class_statement738 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_T_in_class_statement741 = new BitSet(new long[]{0x0810000000000000L});
    public static final BitSet FOLLOW_REF_T_in_class_statement743 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_statement746 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_class_statement748 = new BitSet(new long[]{0x1812000000000000L,0x0000000000000000L,0x1FF0000000400180L});
    public static final BitSet FOLLOW_parameter_list_in_class_statement750 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_class_statement753 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_class_statement755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_class_statement790 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_FUNCTION_T_in_class_statement793 = new BitSet(new long[]{0x0810000000000000L});
    public static final BitSet FOLLOW_REF_T_in_class_statement795 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_statement798 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_class_statement800 = new BitSet(new long[]{0x1812000000000000L,0x0000000000000000L,0x1FF0000000400180L});
    public static final BitSet FOLLOW_parameter_list_in_class_statement802 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_class_statement805 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_block_in_class_statement807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST_T_in_class_statement842 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_directive_in_class_statement844 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_class_statement846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_T_in_function_declaration_statement893 = new BitSet(new long[]{0x0810000000000000L});
    public static final BitSet FOLLOW_REF_T_in_function_declaration_statement895 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration_statement898 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_function_declaration_statement900 = new BitSet(new long[]{0x1812000000000000L,0x0000000000000000L,0x1FF0000000400180L});
    public static final BitSet FOLLOW_parameter_list_in_function_declaration_statement902 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_function_declaration_statement905 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_block_in_function_declaration_statement912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_block958 = new BitSet(new long[]{0xEF9D000000000000L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_inner_statement_list_in_block960 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_block963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_topStatement_in_statement1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_topStatement1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stat_in_topStatement1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_T_in_topStatement1072 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1074 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1076 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1078 = new BitSet(new long[]{0xE895000000000000L,0x000000000487FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_while_statement_in_topStatement1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_T_in_topStatement1113 = new BitSet(new long[]{0xE895000000000000L,0x000000000087FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_topStatement1115 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_WHILE_T_in_topStatement1117 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1119 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1121 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1123 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_T_in_topStatement1155 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1157 = new BitSet(new long[]{0x0815000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_list_in_topStatement1161 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1164 = new BitSet(new long[]{0x0815000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_list_in_topStatement1168 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1171 = new BitSet(new long[]{0x0813000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_list_in_topStatement1175 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1178 = new BitSet(new long[]{0xE895000000000000L,0x000000000487FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_for_statement_in_topStatement1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_T_in_topStatement1224 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1226 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1228 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1230 = new BitSet(new long[]{0x0080000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switch_case_list_in_topStatement1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_T_in_topStatement1261 = new BitSet(new long[]{0x0815000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1263 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_T_in_topStatement1290 = new BitSet(new long[]{0x0815000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1292 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_T_in_topStatement1331 = new BitSet(new long[]{0x0815000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1333 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GLOBAL_T_in_topStatement1375 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_variable_list_in_topStatement1377 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_T_in_topStatement1417 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_static_var_list_in_topStatement1419 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ECHO_T_in_topStatement1456 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_list_in_topStatement1458 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_topStatement1483 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_topStatement1496 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1498 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_AS_T_in_topStatement1502 = new BitSet(new long[]{0x0810000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_foreach_variable_in_topStatement1504 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_T_in_topStatement1507 = new BitSet(new long[]{0x0810000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_foreach_variable_in_topStatement1509 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1513 = new BitSet(new long[]{0xE895000000000000L,0x000000000487FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_foreach_statement_in_topStatement1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_T_in_topStatement1558 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1560 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_directive_in_topStatement1562 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1564 = new BitSet(new long[]{0xE895000000000000L,0x000000000487FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_declare_statement_in_topStatement1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_T_in_topStatement1615 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_block_in_topStatement1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_catch_branch_in_topStatement1619 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_THROW_T_in_topStatement1646 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1648 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_T_in_topStatement1687 = new BitSet(new long[]{0x0010000000000000L,0x0000000000040000L,0xE00000000F804000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scalar_in_topStatement1689 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_T_in_topStatement1728 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1730 = new BitSet(new long[]{0x0010000000000000L,0x0000000000040000L,0xE00000000F804000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scalar_in_topStatement1732 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1734 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_T_in_topStatement1759 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1761 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1763 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1765 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INCLUDE_ONCE_T_in_topStatement1790 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1792 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1794 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1796 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRE_T_in_topStatement1821 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1823 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1825 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1827 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REQUIRE_ONCE_T_in_topStatement1852 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1854 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_topStatement1856 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1858 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_T_in_foreach_variable1900 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_variable_in_foreach_variable1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_use_filename1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_STRING_in_use_filename1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_use_filename1930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_use_filename1933 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_use_filename1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_use_filename1942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_QUOTE_STRING_in_use_filename1945 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_use_filename1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_T_in_fully_qualified_class_name_list1979 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1981 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name2017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name2020 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name2025 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_var_element_in_static_var_list2062 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_T_in_static_var_list2065 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_static_var_element_in_static_var_list2067 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_pure_variable_in_static_var_element2099 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_T_in_static_var_element2102 = new BitSet(new long[]{0x0010000000000000L,0x0000000000040000L,0xE00000000F804000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scalar_in_static_var_element2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_T_in_if_stat2136 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_if_stat2138 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_if_stat2142 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_if_stat2144 = new BitSet(new long[]{0xE895000000000000L,0x000000000487FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_if_stat2160 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_ELSEIF_T_in_if_stat2176 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_if_stat2178 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_if_stat2182 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_if_stat2184 = new BitSet(new long[]{0xE895000000000000L,0x000000000087FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_if_stat2188 = new BitSet(new long[]{0x0000000000000002L,0x0000000003000000L});
    public static final BitSet FOLLOW_ELSE_T_in_if_stat2214 = new BitSet(new long[]{0xE895000000000000L,0x000000000087FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_if_stat2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_if_stat2284 = new BitSet(new long[]{0xEE9D000000000000L,0x000000000B87FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_inner_statement_list_in_if_stat2286 = new BitSet(new long[]{0x0000000000000000L,0x000000000B000000L});
    public static final BitSet FOLLOW_new_elseif_branch_in_if_stat2289 = new BitSet(new long[]{0x0000000000000000L,0x000000000B000000L});
    public static final BitSet FOLLOW_ELSE_T_in_if_stat2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_T_in_if_stat2308 = new BitSet(new long[]{0xE895000000000000L,0x000000000087FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_if_stat2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ENDIF_T_in_if_stat2316 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_if_stat2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_T_in_new_elseif_branch2389 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_new_elseif_branch2391 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_new_elseif_branch2393 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_new_elseif_branch2395 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_T_in_new_elseif_branch2397 = new BitSet(new long[]{0xEE9D000000000002L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_inner_statement_list_in_new_elseif_branch2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_switch_case_list2437 = new BitSet(new long[]{0x0004000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_switch_case_list2439 = new BitSet(new long[]{0x0004000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_case_list_in_switch_case_list2442 = new BitSet(new long[]{0x0104000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_switch_case_list2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_switch_case_list2467 = new BitSet(new long[]{0x0004000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_switch_case_list2469 = new BitSet(new long[]{0x0004000000000000L,0x0000000060000000L});
    public static final BitSet FOLLOW_case_list_in_switch_case_list2472 = new BitSet(new long[]{0x0004000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_ENDSWITCH_T_in_switch_case_list2475 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_switch_case_list2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_T_in_case_list2510 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_case_list2512 = new BitSet(new long[]{0x0004000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_T_in_case_list2515 = new BitSet(new long[]{0xEE9D000000000002L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_SEMI_COLON_in_case_list2519 = new BitSet(new long[]{0xEE9D000000000002L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_inner_statement_list_in_case_list2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_T_in_case_list2554 = new BitSet(new long[]{0x0004000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_T_in_case_list2557 = new BitSet(new long[]{0xEE9D000000000002L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_SEMI_COLON_in_case_list2561 = new BitSet(new long[]{0xEE9D000000000002L,0x000000000087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_inner_statement_list_in_case_list2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_T_in_catch_branch2613 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_catch_branch2615 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_catch_branch2617 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_variable_in_catch_branch2619 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_catch_branch2621 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_block_in_catch_branch2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_for_statement2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_for_statement2690 = new BitSet(new long[]{0xEE9D000000000000L,0x000000010087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_inner_statement_list_in_for_statement2692 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ENDFOR_T_in_for_statement2695 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_for_statement2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_while_statement2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_while_statement2748 = new BitSet(new long[]{0xEE9D000000000000L,0x000000020087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_inner_statement_list_in_while_statement2750 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_ENDWHILE_T_in_while_statement2753 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_while_statement2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_foreach_statement2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_foreach_statement2809 = new BitSet(new long[]{0xEE9D000000000000L,0x000000040087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_inner_statement_list_in_foreach_statement2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ENDFOREACH_T_in_foreach_statement2814 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_foreach_statement2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_declare_statement2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_T_in_declare_statement2877 = new BitSet(new long[]{0xEE9D000000000000L,0x000000080087FCFFL,0xF000E0000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_inner_statement_list_in_declare_statement2879 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_ENDDECLARE_T_in_declare_statement2882 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_SEMI_COLON_in_declare_statement2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameter_list2930 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_T_in_parameter_list2933 = new BitSet(new long[]{0x1810000000000000L,0x0000000000000000L,0x1FF0000000400180L});
    public static final BitSet FOLLOW_parameter_in_parameter_list2937 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_parameter_type_in_parameter2987 = new BitSet(new long[]{0x1800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_CONST_T_in_parameter2990 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_pure_variable_in_parameter2993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_T_in_parameter3009 = new BitSet(new long[]{0x0010000000000000L,0x0000000000040000L,0xE00000000F804000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scalar_in_parameter3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_parameter_type3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_option_in_parameter_type3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_list3111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_T_in_variable_list3114 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_variable_in_variable_list3118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_176_in_variable_modifiers3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_variable_modifiers3155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_modifier3169 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x000EC00000000000L});
    public static final BitSet FOLLOW_directive_element_in_directive3232 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_T_in_directive3235 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_directive_element_in_directive3239 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_directive_element3282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_T_in_directive_element3284 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_directive_element3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expr_list3331 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_T_in_expr_list3334 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_expr_list3338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_logical_text_or_expr_in_expression3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3422 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_OR_T_in_logical_text_or_expr3425 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3430 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3461 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_XOR_T_in_logical_text_xor_expr3464 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3469 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_assignment_expr_in_logical_text_and_expr3500 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_AND_T_in_logical_text_and_expr3503 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_assignment_expr_in_logical_text_and_expr3508 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr3539 = new BitSet(new long[]{0x0000000000000002L,0x0003FF8000400000L});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expr3542 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_conditional_expr_in_assignment_expr3547 = new BitSet(new long[]{0x0000000000000002L,0x0003FF8000400000L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expr_in_conditional_expr3683 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
    public static final BitSet FOLLOW_QUESTION_T_in_conditional_expr3702 = new BitSet(new long[]{0x0811000000000000L,0x0000000004040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_conditional_expr3704 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_T_in_conditional_expr3707 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_logical_or_expr_in_conditional_expr3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr3761 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_LOGICAL_OR_T_in_logical_or_expr3764 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr3769 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_bitwise_or_expr_in_logical_and_expr3800 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_LOGICAL_AND_T_in_logical_and_expr3803 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_bitwise_or_expr_in_logical_and_expr3808 = new BitSet(new long[]{0x0000000000000002L,0x0010000000000000L});
    public static final BitSet FOLLOW_bitwise_xor_expr_in_bitwise_or_expr3839 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_BIT_OR_T_in_bitwise_or_expr3842 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_bitwise_xor_expr_in_bitwise_or_expr3847 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_bitwise_and_expr_in_bitwise_xor_expr3878 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_POWER_T_in_bitwise_xor_expr3881 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_bitwise_and_expr_in_bitwise_xor_expr3886 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_concat_expr_in_bitwise_and_expr3917 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_DOT_T_in_bitwise_and_expr3920 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_concat_expr_in_bitwise_and_expr3925 = new BitSet(new long[]{0x0000000000000002L,0x0080000000000000L});
    public static final BitSet FOLLOW_equality_expr_in_concat_expr3956 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_REF_T_in_concat_expr3959 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_equality_expr_in_concat_expr3964 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr3995 = new BitSet(new long[]{0x0000000000000002L,0x0F00000000000000L});
    public static final BitSet FOLLOW_set_in_equality_expr3998 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_relational_expr_in_equality_expr4017 = new BitSet(new long[]{0x0000000000000002L,0x0F00000000000000L});
    public static final BitSet FOLLOW_shift_expr_in_relational_expr4048 = new BitSet(new long[]{0x0000000000000002L,0xF000000000000000L});
    public static final BitSet FOLLOW_set_in_relational_expr4051 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_shift_expr_in_relational_expr4070 = new BitSet(new long[]{0x0000000000000002L,0xF000000000000000L});
    public static final BitSet FOLLOW_additive_expr_in_shift_expr4101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_shift_expr4104 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_additive_expr_in_shift_expr4115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr4146 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_set_in_additive_expr4149 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr4160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_cast_expr_in_multiplicative_expr4191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_set_in_multiplicative_expr4194 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_cast_expr_in_multiplicative_expr4209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_unary_expr_in_cast_expr4238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_cast_expr4249 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x1FF0000000000180L});
    public static final BitSet FOLLOW_cast_option_in_cast_expr4251 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_cast_expr4253 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_unary_expr_in_cast_expr4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_cast_option0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_symbol_list_in_unary_expr4377 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_prefix_inc_dec_expr_in_unary_expr4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefix_inc_dec_expr_in_unary_expr4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_symbol_in_unary_symbol_list4421 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000000L,0x000000000000060CL});
    public static final BitSet FOLLOW_set_in_unary_symbol0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plus_minus_in_prefix_inc_dec_expr4489 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instance_expr_in_post_inc_dec_expr4538 = new BitSet(new long[]{0x0811000000000002L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_plus_minus_in_post_inc_dec_expr4555 = new BitSet(new long[]{0x0811000000000002L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_plus_minus0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_expr_in_instance_expr4623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_INSTANCEOF_T_in_instance_expr4626 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_class_name_reference_in_instance_expr4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_T_in_atom_expr4661 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_variable_in_atom_expr4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_T_in_atom_expr4677 = new BitSet(new long[]{0x0010000000000000L,0x0000000000040000L,0xE00000000F804000L,0x000000000000000FL});
    public static final BitSet FOLLOW_scalar_in_atom_expr4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr4693 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_atom_expr4695 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr4697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_T_in_atom_expr4710 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr4712 = new BitSet(new long[]{0x0012000000000000L,0x0000000000200000L,0x000000000040C000L});
    public static final BitSet FOLLOW_assignment_list_in_atom_expr4714 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_atom_expr4743 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr4745 = new BitSet(new long[]{0x0813000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_array_pair_list_in_atom_expr4747 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_T_in_atom_expr4779 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_class_name_reference_in_atom_expr4781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLONE_T_in_atom_expr4808 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_variable_in_atom_expr4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSET_T_in_atom_expr4846 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr4848 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000404000L});
    public static final BitSet FOLLOW_variable_list_in_atom_expr4850 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BACKTRICKLITERAL_in_atom_expr4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_T_in_atom_expr4889 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_atom_expr4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_name_reference_in_class_name_reference4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_class_name_reference4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference4968 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SINGLE_ARROW_T_in_dynamic_name_reference4993 = new BitSet(new long[]{0x0090000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_object_property_in_dynamic_name_reference4995 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ctor_arguments_in_dynamic_name_reference4997 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_assignment_element_in_assignment_list5048 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_T_in_assignment_list5052 = new BitSet(new long[]{0x0010000000000002L,0x0000000000200000L,0x000000000040C000L});
    public static final BitSet FOLLOW_assignment_element_in_assignment_list5054 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_variable_in_assignment_element5078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LIST_T_in_assignment_element5084 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_assignment_element5086 = new BitSet(new long[]{0x0012000000000000L,0x0000000000200000L,0x000000000040C000L});
    public static final BitSet FOLLOW_assignment_list_in_assignment_element5088 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_assignment_element5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_pair_element_in_array_pair_list5127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_T_in_array_pair_list5130 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_array_pair_element_in_array_pair_list5134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_COMMA_T_in_array_pair_list5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_array_pair_element5183 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ARROW_T_in_array_pair_element5186 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_array_pair_element5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_variable_with_function_calls_in_variable5225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_SINGLE_ARROW_T_in_variable5248 = new BitSet(new long[]{0x0090000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_object_property_in_variable5250 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ctor_arguments_in_variable5252 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5309 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_reference_variable_in_base_variable_with_function_calls5312 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5348 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_variable_in_object_property5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reference_variable_without_dollar_in_object_property5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_variable_in_reference_variable5443 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LEFT_OPEN_RECT_in_reference_variable5468 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FE7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_reference_variable5472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RIGHT_OPEN_RECT_in_reference_variable5475 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_reference_variable5505 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_reference_variable5509 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_reference_variable5511 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_dollars_in_compound_variable5562 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compound_variable5564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dollars_in_compound_variable5576 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_compound_variable5578 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_compound_variable5581 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_compound_variable5583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLAR_T_in_dollars5604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_compound_variable_without_dollar_in_reference_variable_without_dollar5632 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LEFT_OPEN_RECT_in_reference_variable_without_dollar5661 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FE7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_reference_variable_without_dollar5663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RIGHT_OPEN_RECT_in_reference_variable_without_dollar5666 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_reference_variable_without_dollar5697 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_reference_variable_without_dollar5699 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_reference_variable_without_dollar5701 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_compound_variable_without_dollar5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_BRACKET_in_compound_variable_without_dollar5761 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_compound_variable_without_dollar5764 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_RIGHT_BRACKET_in_compound_variable_without_dollar5766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_ctor_arguments5797 = new BitSet(new long[]{0x0813000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expr_list_in_ctor_arguments5799 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_ctor_arguments5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_T_in_pure_variable5848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DOLLAR_T_in_pure_variable5851 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pure_variable5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_scalar5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_constant5951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_constant5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_constant5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERRAL_in_constant5975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_constant5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_common_scalar_in_constant5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_constant5995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HERE_DOC_in_constant6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_common_scalar0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSEIF_T_in_synpred1_CompilerAst2176 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_LEFT_PARETHESIS_in_synpred1_CompilerAst2178 = new BitSet(new long[]{0x0811000000000000L,0x0000000000040000L,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_expression_in_synpred1_CompilerAst2182 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_synpred1_CompilerAst2184 = new BitSet(new long[]{0xE895000000000000L,0x000000000087FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_synpred1_CompilerAst2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_T_in_synpred2_CompilerAst2214 = new BitSet(new long[]{0xE895000000000000L,0x000000000087FCFFL,0xF00000000FC7DF8CL,0x000000000000000FL});
    public static final BitSet FOLLOW_statement_in_synpred2_CompilerAst2218 = new BitSet(new long[]{0x0000000000000002L});

}