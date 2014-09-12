// $ANTLR 3.5.2 PHPAST.g 2014-06-27 03:51:45

package box.php;
  
import org.antlr.runtime.*;
import org.antlr.runtime.BitSet;

import box.ast.*;
import box.ast.parser.*;

import java.util.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PHPASTParser extends AbstractASTParser{
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND_T", "ARGU", "ARRAY_DECL", 
		"ARROW_T", "ASSIGN", "AS_T", "AT_T", "BACKTRICKLITERAL", "BIT_AND_EQ", 
		"BIT_OR_EQ", "BIT_OR_T", "BLOCK", "BREAK_T", "CALL", "CALLED_OBJ", "CASE_T", 
		"CAST", "CAST_EXPR", "CATCH_T", "CLASS_BODY", "CLASS_T", "CLONE_T", "COLON_T", 
		"COMMA_T", "COMMENT", "CONDITION", "CONST_T", "CONTINUE_T", "DECLARE_T", 
		"DEFAULT_T", "DIV_EQ", "DIV_T", "DOLLAR_T", "DOMAIN_T", "DOT_EQ", "DOT_T", 
		"DOUBLELITERRAL", "DO_T", "DoubleSuffix", "ECHO_T", "ELIST", "ELSEIF_T", 
		"ELSE_T", "EMPTYSTATEMENT", "ENDDECLARE_T", "ENDFOREACH_T", "ENDFOR_T", 
		"ENDIF_T", "ENDSWITCH_T", "ENDWHILE_T", "EOC_T", "EQUAL_EQUAL_EQUAL_T", 
		"EQUAL_EQUAL_T", "EQUAL_T", "EXC_NOT_T", "EXPR", "EXTENDS_T", "EscapeSequence", 
		"Exponent", "FIELD_DECL", "FLOATLITERAL", "FOREACH_T", "FOR_T", "FUNCTION_T", 
		"FloatSuffix", "GLOBAL_T", "HASH_INDEX", "HEREDOC_START", "HERE_DOC", 
		"Heredoc", "HexDigit", "HexPrefix", "IDENTIFIER", "IF_T", "IMPLEMENTS_T", 
		"INCLUDE_ONCE_T", "INCLUDE_T", "INDEX", "INSTANCEOF_T", "INTERFACE_T", 
		"INTLITERAL", "ITERATE", "IdentifierPart", "IdentifierStart", "IntegerNumber", 
		"LABEL", "LEFT_BRACKET", "LEFT_OPEN_RECT", "LEFT_PARETHESIS", "LE_T", 
		"LINE_COMMENT", "LIST", "LIST_DECL", "LIST_T", "LMOVE_EQ", "LOGICAL_AND_T", 
		"LOGICAL_OR_T", "LSHIFT_T", "LT_T", "LongSuffix", "MEMBERACCESS", "METHOD_DECL", 
		"ME_T", "MINUS_EQ", "MINUS_MINUS_T", "MINUS_T", "MT_T", "MUL_EQ", "MUL_T", 
		"ModuleDeclaration", "NAMESPACE", "NAMESPACE_T", "NEW_T", "NOT_EQUAL_EQUAL_T", 
		"NOT_EQUAL_T", "NonIntegerNumber", "OR_T", "PARAMETER", "PERCENT_EQ", 
		"PERCENT_T", "PLUS_EQ", "PLUS_PLUS_T", "PLUS_T", "POSTFIX", "POSTFIX_EXPR", 
		"POWER_EQ", "POWER_T", "PREFIX", "PREFIX_EXPR", "PRINT_T", "PROG", "QUESTION_T", 
		"REALLITERAL", "REF_T", "REQUIRE_ONCE_T", "REQUIRE_T", "RETURN_T", "RIGHT_BRACKET", 
		"RIGHT_OPEN_RECT", "RIGHT_PARETHESIS", "RMOVE_EQ", "RSHIFT_T", "SCALAR", 
		"SCALAR_ELEMENT", "SCALAR_VAR", "SEMI_COLON", "SINGLE_ARROW_T", "SOC_PHP_T", 
		"SOC_T", "STATEMENT", "STATIC", "STATIC_T", "STRINGLITERAL", "SWITCH_T", 
		"THROW_T", "TILDA_T", "TRAIT_BODY", "TRAIT_METH", "TRAIT_T", "TRY_T", 
		"TYPE", "TraitDeclaration", "UNARY_EXPR", "UNSET_T", "USE_DECL", "USE_PARETHESIS_T", 
		"USE_T", "VAR", "VAR_DECL", "WHILE_T", "WS", "XOR_T", "'__CLASS__'", "'__DIR__'", 
		"'__FILE__'", "'__FUNCTION__'", "'__LINE__'", "'__METHOD__'", "'__NAMESPACE__'", 
		"'__halt_compiler'", "'abstract'", "'array'", "'bool'", "'boolean'", "'double'", 
		"'final'", "'float'", "'int'", "'object'", "'private'", "'protected'", 
		"'public'", "'real'", "'string'", "'var'"
	};
	public static final int EOF=-1;
	public static final int T__176=176;
	public static final int T__177=177;
	public static final int T__178=178;
	public static final int T__179=179;
	public static final int T__180=180;
	public static final int T__181=181;
	public static final int T__182=182;
	public static final int T__183=183;
	public static final int T__184=184;
	public static final int T__185=185;
	public static final int T__186=186;
	public static final int T__187=187;
	public static final int T__188=188;
	public static final int T__189=189;
	public static final int T__190=190;
	public static final int T__191=191;
	public static final int T__192=192;
	public static final int T__193=193;
	public static final int T__194=194;
	public static final int T__195=195;
	public static final int T__196=196;
	public static final int T__197=197;
	public static final int T__198=198;
	public static final int AND_T=4;
	public static final int ARGU=5;
	public static final int ARRAY_DECL=6;
	public static final int ARROW_T=7;
	public static final int ASSIGN=8;
	public static final int AS_T=9;
	public static final int AT_T=10;
	public static final int BACKTRICKLITERAL=11;
	public static final int BIT_AND_EQ=12;
	public static final int BIT_OR_EQ=13;
	public static final int BIT_OR_T=14;
	public static final int BLOCK=15;
	public static final int BREAK_T=16;
	public static final int CALL=17;
	public static final int CALLED_OBJ=18;
	public static final int CASE_T=19;
	public static final int CAST=20;
	public static final int CAST_EXPR=21;
	public static final int CATCH_T=22;
	public static final int CLASS_BODY=23;
	public static final int CLASS_T=24;
	public static final int CLONE_T=25;
	public static final int COLON_T=26;
	public static final int COMMA_T=27;
	public static final int COMMENT=28;
	public static final int CONDITION=29;
	public static final int CONST_T=30;
	public static final int CONTINUE_T=31;
	public static final int DECLARE_T=32;
	public static final int DEFAULT_T=33;
	public static final int DIV_EQ=34;
	public static final int DIV_T=35;
	public static final int DOLLAR_T=36;
	public static final int DOMAIN_T=37;
	public static final int DOT_EQ=38;
	public static final int DOT_T=39;
	public static final int DOUBLELITERRAL=40;
	public static final int DO_T=41;
	public static final int DoubleSuffix=42;
	public static final int ECHO_T=43;
	public static final int ELIST=44;
	public static final int ELSEIF_T=45;
	public static final int ELSE_T=46;
	public static final int EMPTYSTATEMENT=47;
	public static final int ENDDECLARE_T=48;
	public static final int ENDFOREACH_T=49;
	public static final int ENDFOR_T=50;
	public static final int ENDIF_T=51;
	public static final int ENDSWITCH_T=52;
	public static final int ENDWHILE_T=53;
	public static final int EOC_T=54;
	public static final int EQUAL_EQUAL_EQUAL_T=55;
	public static final int EQUAL_EQUAL_T=56;
	public static final int EQUAL_T=57;
	public static final int EXC_NOT_T=58;
	public static final int EXPR=59;
	public static final int EXTENDS_T=60;
	public static final int EscapeSequence=61;
	public static final int Exponent=62;
	public static final int FIELD_DECL=63;
	public static final int FLOATLITERAL=64;
	public static final int FOREACH_T=65;
	public static final int FOR_T=66;
	public static final int FUNCTION_T=67;
	public static final int FloatSuffix=68;
	public static final int GLOBAL_T=69;
	public static final int HASH_INDEX=70;
	public static final int HEREDOC_START=71;
	public static final int HERE_DOC=72;
	public static final int Heredoc=73;
	public static final int HexDigit=74;
	public static final int HexPrefix=75;
	public static final int IDENTIFIER=76;
	public static final int IF_T=77;
	public static final int IMPLEMENTS_T=78;
	public static final int INCLUDE_ONCE_T=79;
	public static final int INCLUDE_T=80;
	public static final int INDEX=81;
	public static final int INSTANCEOF_T=82;
	public static final int INTERFACE_T=83;
	public static final int INTLITERAL=84;
	public static final int ITERATE=85;
	public static final int IdentifierPart=86;
	public static final int IdentifierStart=87;
	public static final int IntegerNumber=88;
	public static final int LABEL=89;
	public static final int LEFT_BRACKET=90;
	public static final int LEFT_OPEN_RECT=91;
	public static final int LEFT_PARETHESIS=92;
	public static final int LE_T=93;
	public static final int LINE_COMMENT=94;
	public static final int LIST=95;
	public static final int LIST_DECL=96;
	public static final int LIST_T=97;
	public static final int LMOVE_EQ=98;
	public static final int LOGICAL_AND_T=99;
	public static final int LOGICAL_OR_T=100;
	public static final int LSHIFT_T=101;
	public static final int LT_T=102;
	public static final int LongSuffix=103;
	public static final int MEMBERACCESS=104;
	public static final int METHOD_DECL=105;
	public static final int ME_T=106;
	public static final int MINUS_EQ=107;
	public static final int MINUS_MINUS_T=108;
	public static final int MINUS_T=109;
	public static final int MT_T=110;
	public static final int MUL_EQ=111;
	public static final int MUL_T=112;
	public static final int ModuleDeclaration=113;
	public static final int NAMESPACE=114;
	public static final int NAMESPACE_T=115;
	public static final int NEW_T=116;
	public static final int NOT_EQUAL_EQUAL_T=117;
	public static final int NOT_EQUAL_T=118;
	public static final int NonIntegerNumber=119;
	public static final int OR_T=120;
	public static final int PARAMETER=121;
	public static final int PERCENT_EQ=122;
	public static final int PERCENT_T=123;
	public static final int PLUS_EQ=124;
	public static final int PLUS_PLUS_T=125;
	public static final int PLUS_T=126;
	public static final int POSTFIX=127;
	public static final int POSTFIX_EXPR=128;
	public static final int POWER_EQ=129;
	public static final int POWER_T=130;
	public static final int PREFIX=131;
	public static final int PREFIX_EXPR=132;
	public static final int PRINT_T=133;
	public static final int PROG=134;
	public static final int QUESTION_T=135;
	public static final int REALLITERAL=136;
	public static final int REF_T=137;
	public static final int REQUIRE_ONCE_T=138;
	public static final int REQUIRE_T=139;
	public static final int RETURN_T=140;
	public static final int RIGHT_BRACKET=141;
	public static final int RIGHT_OPEN_RECT=142;
	public static final int RIGHT_PARETHESIS=143;
	public static final int RMOVE_EQ=144;
	public static final int RSHIFT_T=145;
	public static final int SCALAR=146;
	public static final int SCALAR_ELEMENT=147;
	public static final int SCALAR_VAR=148;
	public static final int SEMI_COLON=149;
	public static final int SINGLE_ARROW_T=150;
	public static final int SOC_PHP_T=151;
	public static final int SOC_T=152;
	public static final int STATEMENT=153;
	public static final int STATIC=154;
	public static final int STATIC_T=155;
	public static final int STRINGLITERAL=156;
	public static final int SWITCH_T=157;
	public static final int THROW_T=158;
	public static final int TILDA_T=159;
	public static final int TRAIT_BODY=160;
	public static final int TRAIT_METH=161;
	public static final int TRAIT_T=162;
	public static final int TRY_T=163;
	public static final int TYPE=164;
	public static final int TraitDeclaration=165;
	public static final int UNARY_EXPR=166;
	public static final int UNSET_T=167;
	public static final int USE_DECL=168;
	public static final int USE_PARETHESIS_T=169;
	public static final int USE_T=170;
	public static final int VAR=171;
	public static final int VAR_DECL=172;
	public static final int WHILE_T=173;
	public static final int WS=174;
	public static final int XOR_T=175;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PHPASTParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PHPASTParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PHPASTParser.tokenNames; }
	@Override public String getGrammarFileName() { return "PHPAST.g"; }


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
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "php_source"
	// PHPAST.g:98:1: php_source : ( SOC_T | SOC_PHP_T ) ( top_statement_list )? EOC_T -> ^( ModuleDeclaration ( top_statement_list )? ) ;
	public final PHPASTParser.php_source_return php_source() throws RecognitionException {
		PHPASTParser.php_source_return retval = new PHPASTParser.php_source_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token SOC_T1=null;
		Token SOC_PHP_T2=null;
		Token EOC_T4=null;
		ParserRuleReturnScope top_statement_list3 =null;

		AST SOC_T1_tree=null;
		AST SOC_PHP_T2_tree=null;
		AST EOC_T4_tree=null;
		RewriteRuleTokenStream stream_SOC_T=new RewriteRuleTokenStream(adaptor,"token SOC_T");
		RewriteRuleTokenStream stream_EOC_T=new RewriteRuleTokenStream(adaptor,"token EOC_T");
		RewriteRuleTokenStream stream_SOC_PHP_T=new RewriteRuleTokenStream(adaptor,"token SOC_PHP_T");
		RewriteRuleSubtreeStream stream_top_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule top_statement_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:108:3: ( ( SOC_T | SOC_PHP_T ) ( top_statement_list )? EOC_T -> ^( ModuleDeclaration ( top_statement_list )? ) )
			// PHPAST.g:108:5: ( SOC_T | SOC_PHP_T ) ( top_statement_list )? EOC_T
			{
			// PHPAST.g:108:5: ( SOC_T | SOC_PHP_T )
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
					// PHPAST.g:108:6: SOC_T
					{
					SOC_T1=(Token)match(input,SOC_T,FOLLOW_SOC_T_in_php_source434); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SOC_T.add(SOC_T1);

					if ( state.backtracking==0 ) {
					    token = (CommonToken)SOC_T1;
					    startIndex = token.getStartIndex();
					  }
					}
					break;
				case 2 :
					// PHPAST.g:113:5: SOC_PHP_T
					{
					SOC_PHP_T2=(Token)match(input,SOC_PHP_T,FOLLOW_SOC_PHP_T_in_php_source446); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SOC_PHP_T.add(SOC_PHP_T2);

					if ( state.backtracking==0 ) {
					    token = (CommonToken)SOC_PHP_T2;
					    startIndex = token.getStartIndex();
					  }
					}
					break;

			}

			// PHPAST.g:118:9: ( top_statement_list )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= AT_T && LA2_0 <= BACKTRICKLITERAL)||LA2_0==BREAK_T||(LA2_0 >= CLASS_T && LA2_0 <= CLONE_T)||(LA2_0 >= CONTINUE_T && LA2_0 <= DECLARE_T)||(LA2_0 >= DOLLAR_T && LA2_0 <= DOMAIN_T)||(LA2_0 >= DOUBLELITERRAL && LA2_0 <= DO_T)||LA2_0==ECHO_T||LA2_0==EXC_NOT_T||(LA2_0 >= FLOATLITERAL && LA2_0 <= FUNCTION_T)||LA2_0==GLOBAL_T||LA2_0==HERE_DOC||(LA2_0 >= IDENTIFIER && LA2_0 <= IF_T)||(LA2_0 >= INCLUDE_ONCE_T && LA2_0 <= INCLUDE_T)||(LA2_0 >= INTERFACE_T && LA2_0 <= INTLITERAL)||(LA2_0 >= LEFT_BRACKET && LA2_0 <= LEFT_PARETHESIS)||LA2_0==LIST_T||(LA2_0 >= MINUS_MINUS_T && LA2_0 <= MINUS_T)||(LA2_0 >= NAMESPACE_T && LA2_0 <= NEW_T)||(LA2_0 >= PLUS_PLUS_T && LA2_0 <= PLUS_T)||LA2_0==PRINT_T||(LA2_0 >= REALLITERAL && LA2_0 <= RETURN_T)||LA2_0==SEMI_COLON||(LA2_0 >= STATIC && LA2_0 <= TILDA_T)||(LA2_0 >= TRAIT_T && LA2_0 <= TRY_T)||LA2_0==UNSET_T||LA2_0==USE_T||LA2_0==WHILE_T||(LA2_0 >= 176 && LA2_0 <= 185)||LA2_0==189) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// PHPAST.g:118:9: top_statement_list
					{
					pushFollow(FOLLOW_top_statement_list_in_php_source461);
					top_statement_list3=top_statement_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_top_statement_list.add(top_statement_list3.getTree());
					}
					break;

			}

			EOC_T4=(Token)match(input,EOC_T,FOLLOW_EOC_T_in_php_source470); if (state.failed) return retval; 
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 124:5: -> ^( ModuleDeclaration ( top_statement_list )? )
			{
				// PHPAST.g:124:9: ^( ModuleDeclaration ( top_statement_list )? )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(ModuleDeclaration, "ModuleDeclaration"), root_1);
				// PHPAST.g:124:29: ( top_statement_list )?
				if ( stream_top_statement_list.hasNext() ) {
					adaptor.addChild(root_1, stream_top_statement_list.nextTree());
				}
				stream_top_statement_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST phpSourceToken = retval.tree;
			  phpSourceToken.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "php_source"


	public static class top_statement_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "top_statement_list"
	// PHPAST.g:128:1: top_statement_list : ( top_statement )+ ;
	public final PHPASTParser.top_statement_list_return top_statement_list() throws RecognitionException {
		PHPASTParser.top_statement_list_return retval = new PHPASTParser.top_statement_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope top_statement5 =null;


		try {
			// PHPAST.g:129:3: ( ( top_statement )+ )
			// PHPAST.g:129:5: ( top_statement )+
			{
			root_0 = (AST)adaptor.nil();


			// PHPAST.g:129:5: ( top_statement )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= AT_T && LA3_0 <= BACKTRICKLITERAL)||LA3_0==BREAK_T||(LA3_0 >= CLASS_T && LA3_0 <= CLONE_T)||(LA3_0 >= CONTINUE_T && LA3_0 <= DECLARE_T)||(LA3_0 >= DOLLAR_T && LA3_0 <= DOMAIN_T)||(LA3_0 >= DOUBLELITERRAL && LA3_0 <= DO_T)||LA3_0==ECHO_T||LA3_0==EXC_NOT_T||(LA3_0 >= FLOATLITERAL && LA3_0 <= FUNCTION_T)||LA3_0==GLOBAL_T||LA3_0==HERE_DOC||(LA3_0 >= IDENTIFIER && LA3_0 <= IF_T)||(LA3_0 >= INCLUDE_ONCE_T && LA3_0 <= INCLUDE_T)||(LA3_0 >= INTERFACE_T && LA3_0 <= INTLITERAL)||(LA3_0 >= LEFT_BRACKET && LA3_0 <= LEFT_PARETHESIS)||LA3_0==LIST_T||(LA3_0 >= MINUS_MINUS_T && LA3_0 <= MINUS_T)||(LA3_0 >= NAMESPACE_T && LA3_0 <= NEW_T)||(LA3_0 >= PLUS_PLUS_T && LA3_0 <= PLUS_T)||LA3_0==PRINT_T||(LA3_0 >= REALLITERAL && LA3_0 <= RETURN_T)||LA3_0==SEMI_COLON||(LA3_0 >= STATIC && LA3_0 <= TILDA_T)||(LA3_0 >= TRAIT_T && LA3_0 <= TRY_T)||LA3_0==UNSET_T||LA3_0==USE_T||LA3_0==WHILE_T||(LA3_0 >= 176 && LA3_0 <= 185)||LA3_0==189) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// PHPAST.g:129:5: top_statement
					{
					pushFollow(FOLLOW_top_statement_in_top_statement_list505);
					top_statement5=top_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, top_statement5.getTree());

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "top_statement_list"


	public static class top_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "top_statement"
	// PHPAST.g:132:1: top_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement | NAMESPACE_T fully_qualified_class_name -> ^( NAMESPACE_T fully_qualified_class_name ) );
	public final PHPASTParser.top_statement_return top_statement() throws RecognitionException {
		PHPASTParser.top_statement_return retval = new PHPASTParser.top_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token NAMESPACE_T10=null;
		ParserRuleReturnScope statement6 =null;
		ParserRuleReturnScope function_declaration_statement7 =null;
		ParserRuleReturnScope class_declaration_statement8 =null;
		ParserRuleReturnScope halt_compiler_statement9 =null;
		ParserRuleReturnScope fully_qualified_class_name11 =null;

		AST NAMESPACE_T10_tree=null;
		RewriteRuleTokenStream stream_NAMESPACE_T=new RewriteRuleTokenStream(adaptor,"token NAMESPACE_T");
		RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");

		try {
			// PHPAST.g:133:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement | NAMESPACE_T fully_qualified_class_name -> ^( NAMESPACE_T fully_qualified_class_name ) )
			int alt4=5;
			switch ( input.LA(1) ) {
			case AT_T:
			case BACKTRICKLITERAL:
			case BREAK_T:
			case CLONE_T:
			case CONTINUE_T:
			case DECLARE_T:
			case DOLLAR_T:
			case DOMAIN_T:
			case DOUBLELITERRAL:
			case DO_T:
			case ECHO_T:
			case EXC_NOT_T:
			case FLOATLITERAL:
			case FOREACH_T:
			case FOR_T:
			case GLOBAL_T:
			case HERE_DOC:
			case IDENTIFIER:
			case IF_T:
			case INCLUDE_ONCE_T:
			case INCLUDE_T:
			case INTLITERAL:
			case LEFT_BRACKET:
			case LEFT_OPEN_RECT:
			case LEFT_PARETHESIS:
			case LIST_T:
			case MINUS_MINUS_T:
			case MINUS_T:
			case NEW_T:
			case PLUS_PLUS_T:
			case PLUS_T:
			case PRINT_T:
			case REALLITERAL:
			case REF_T:
			case REQUIRE_ONCE_T:
			case REQUIRE_T:
			case RETURN_T:
			case SEMI_COLON:
			case STATIC:
			case STATIC_T:
			case STRINGLITERAL:
			case SWITCH_T:
			case THROW_T:
			case TILDA_T:
			case TRY_T:
			case UNSET_T:
			case USE_T:
			case WHILE_T:
			case 176:
			case 177:
			case 178:
			case 179:
			case 180:
			case 181:
			case 182:
			case 185:
				{
				alt4=1;
				}
				break;
			case NAMESPACE_T:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==DOMAIN_T) ) {
					int LA4_6 = input.LA(3);
					if ( (LA4_6==IDENTIFIER) ) {
						int LA4_10 = input.LA(4);
						if ( (synpred4_PHPAST()) ) {
							alt4=1;
						}
						else if ( (true) ) {
							alt4=5;
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA4_2==IDENTIFIER||LA4_2==NAMESPACE_T) ) {
					alt4=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FUNCTION_T:
				{
				switch ( input.LA(2) ) {
				case REF_T:
					{
					int LA4_8 = input.LA(3);
					if ( (LA4_8==LEFT_PARETHESIS) ) {
						alt4=1;
					}
					else if ( (LA4_8==IDENTIFIER) ) {
						alt4=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LEFT_PARETHESIS:
					{
					alt4=1;
					}
					break;
				case IDENTIFIER:
					{
					alt4=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case CLASS_T:
			case INTERFACE_T:
			case TRAIT_T:
			case 184:
			case 189:
				{
				alt4=3;
				}
				break;
			case 183:
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
					// PHPAST.g:133:5: statement
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_statement_in_top_statement519);
					statement6=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement6.getTree());

					}
					break;
				case 2 :
					// PHPAST.g:134:5: function_declaration_statement
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_function_declaration_statement_in_top_statement525);
					function_declaration_statement7=function_declaration_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_declaration_statement7.getTree());

					}
					break;
				case 3 :
					// PHPAST.g:135:5: class_declaration_statement
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_class_declaration_statement_in_top_statement531);
					class_declaration_statement8=class_declaration_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, class_declaration_statement8.getTree());

					}
					break;
				case 4 :
					// PHPAST.g:136:5: halt_compiler_statement
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_halt_compiler_statement_in_top_statement537);
					halt_compiler_statement9=halt_compiler_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, halt_compiler_statement9.getTree());

					}
					break;
				case 5 :
					// PHPAST.g:137:5: NAMESPACE_T fully_qualified_class_name
					{
					NAMESPACE_T10=(Token)match(input,NAMESPACE_T,FOLLOW_NAMESPACE_T_in_top_statement543); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NAMESPACE_T.add(NAMESPACE_T10);

					pushFollow(FOLLOW_fully_qualified_class_name_in_top_statement545);
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 137:45: -> ^( NAMESPACE_T fully_qualified_class_name )
					{
						// PHPAST.g:137:49: ^( NAMESPACE_T fully_qualified_class_name )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_NAMESPACE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "top_statement"


	public static class inner_statement_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "inner_statement_list"
	// PHPAST.g:143:1: inner_statement_list : ( inner_statement )+ ;
	public final PHPASTParser.inner_statement_list_return inner_statement_list() throws RecognitionException {
		PHPASTParser.inner_statement_list_return retval = new PHPASTParser.inner_statement_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope inner_statement12 =null;


		try {
			// PHPAST.g:144:3: ( ( inner_statement )+ )
			// PHPAST.g:144:5: ( inner_statement )+
			{
			root_0 = (AST)adaptor.nil();


			// PHPAST.g:144:5: ( inner_statement )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= AT_T && LA5_0 <= BACKTRICKLITERAL)||LA5_0==BREAK_T||(LA5_0 >= CLASS_T && LA5_0 <= CLONE_T)||(LA5_0 >= CONTINUE_T && LA5_0 <= DECLARE_T)||(LA5_0 >= DOLLAR_T && LA5_0 <= DOMAIN_T)||(LA5_0 >= DOUBLELITERRAL && LA5_0 <= DO_T)||LA5_0==ECHO_T||LA5_0==EXC_NOT_T||(LA5_0 >= FLOATLITERAL && LA5_0 <= FUNCTION_T)||LA5_0==GLOBAL_T||LA5_0==HERE_DOC||(LA5_0 >= IDENTIFIER && LA5_0 <= IF_T)||(LA5_0 >= INCLUDE_ONCE_T && LA5_0 <= INCLUDE_T)||(LA5_0 >= INTERFACE_T && LA5_0 <= INTLITERAL)||(LA5_0 >= LEFT_BRACKET && LA5_0 <= LEFT_PARETHESIS)||LA5_0==LIST_T||(LA5_0 >= MINUS_MINUS_T && LA5_0 <= MINUS_T)||(LA5_0 >= NAMESPACE_T && LA5_0 <= NEW_T)||(LA5_0 >= PLUS_PLUS_T && LA5_0 <= PLUS_T)||LA5_0==PRINT_T||(LA5_0 >= REALLITERAL && LA5_0 <= RETURN_T)||LA5_0==SEMI_COLON||(LA5_0 >= STATIC && LA5_0 <= TILDA_T)||(LA5_0 >= TRAIT_T && LA5_0 <= TRY_T)||LA5_0==UNSET_T||LA5_0==USE_T||LA5_0==WHILE_T||(LA5_0 >= 176 && LA5_0 <= 185)||LA5_0==189) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// PHPAST.g:144:6: inner_statement
					{
					pushFollow(FOLLOW_inner_statement_in_inner_statement_list578);
					inner_statement12=inner_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inner_statement12.getTree());

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inner_statement_list"


	public static class inner_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "inner_statement"
	// PHPAST.g:147:1: inner_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement );
	public final PHPASTParser.inner_statement_return inner_statement() throws RecognitionException {
		PHPASTParser.inner_statement_return retval = new PHPASTParser.inner_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope statement13 =null;
		ParserRuleReturnScope function_declaration_statement14 =null;
		ParserRuleReturnScope class_declaration_statement15 =null;
		ParserRuleReturnScope halt_compiler_statement16 =null;


		try {
			// PHPAST.g:148:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement )
			int alt6=4;
			switch ( input.LA(1) ) {
			case AT_T:
			case BACKTRICKLITERAL:
			case BREAK_T:
			case CLONE_T:
			case CONTINUE_T:
			case DECLARE_T:
			case DOLLAR_T:
			case DOMAIN_T:
			case DOUBLELITERRAL:
			case DO_T:
			case ECHO_T:
			case EXC_NOT_T:
			case FLOATLITERAL:
			case FOREACH_T:
			case FOR_T:
			case GLOBAL_T:
			case HERE_DOC:
			case IDENTIFIER:
			case IF_T:
			case INCLUDE_ONCE_T:
			case INCLUDE_T:
			case INTLITERAL:
			case LEFT_BRACKET:
			case LEFT_OPEN_RECT:
			case LEFT_PARETHESIS:
			case LIST_T:
			case MINUS_MINUS_T:
			case MINUS_T:
			case NAMESPACE_T:
			case NEW_T:
			case PLUS_PLUS_T:
			case PLUS_T:
			case PRINT_T:
			case REALLITERAL:
			case REF_T:
			case REQUIRE_ONCE_T:
			case REQUIRE_T:
			case RETURN_T:
			case SEMI_COLON:
			case STATIC:
			case STATIC_T:
			case STRINGLITERAL:
			case SWITCH_T:
			case THROW_T:
			case TILDA_T:
			case TRY_T:
			case UNSET_T:
			case USE_T:
			case WHILE_T:
			case 176:
			case 177:
			case 178:
			case 179:
			case 180:
			case 181:
			case 182:
			case 185:
				{
				alt6=1;
				}
				break;
			case FUNCTION_T:
				{
				switch ( input.LA(2) ) {
				case REF_T:
					{
					int LA6_5 = input.LA(3);
					if ( (LA6_5==LEFT_PARETHESIS) ) {
						alt6=1;
					}
					else if ( (LA6_5==IDENTIFIER) ) {
						alt6=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LEFT_PARETHESIS:
					{
					alt6=1;
					}
					break;
				case IDENTIFIER:
					{
					alt6=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case CLASS_T:
			case INTERFACE_T:
			case TRAIT_T:
			case 184:
			case 189:
				{
				alt6=3;
				}
				break;
			case 183:
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
					// PHPAST.g:148:5: statement
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_statement_in_inner_statement595);
					statement13=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement13.getTree());

					}
					break;
				case 2 :
					// PHPAST.g:149:5: function_declaration_statement
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_function_declaration_statement_in_inner_statement601);
					function_declaration_statement14=function_declaration_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function_declaration_statement14.getTree());

					}
					break;
				case 3 :
					// PHPAST.g:150:5: class_declaration_statement
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_class_declaration_statement_in_inner_statement607);
					class_declaration_statement15=class_declaration_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, class_declaration_statement15.getTree());

					}
					break;
				case 4 :
					// PHPAST.g:151:5: halt_compiler_statement
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_halt_compiler_statement_in_inner_statement613);
					halt_compiler_statement16=halt_compiler_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, halt_compiler_statement16.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inner_statement"


	public static class halt_compiler_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "halt_compiler_statement"
	// PHPAST.g:154:1: halt_compiler_statement : '__halt_compiler' LEFT_PARETHESIS RIGHT_PARETHESIS SEMI_COLON -> '__halt_compiler' ;
	public final PHPASTParser.halt_compiler_statement_return halt_compiler_statement() throws RecognitionException {
		PHPASTParser.halt_compiler_statement_return retval = new PHPASTParser.halt_compiler_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token string_literal17=null;
		Token LEFT_PARETHESIS18=null;
		Token RIGHT_PARETHESIS19=null;
		Token SEMI_COLON20=null;

		AST string_literal17_tree=null;
		AST LEFT_PARETHESIS18_tree=null;
		AST RIGHT_PARETHESIS19_tree=null;
		AST SEMI_COLON20_tree=null;
		RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
		RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
		RewriteRuleTokenStream stream_183=new RewriteRuleTokenStream(adaptor,"token 183");
		RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");

		try {
			// PHPAST.g:155:3: ( '__halt_compiler' LEFT_PARETHESIS RIGHT_PARETHESIS SEMI_COLON -> '__halt_compiler' )
			// PHPAST.g:155:5: '__halt_compiler' LEFT_PARETHESIS RIGHT_PARETHESIS SEMI_COLON
			{
			string_literal17=(Token)match(input,183,FOLLOW_183_in_halt_compiler_statement628); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_183.add(string_literal17);

			LEFT_PARETHESIS18=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_halt_compiler_statement630); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS18);

			RIGHT_PARETHESIS19=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_halt_compiler_statement632); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS19);

			SEMI_COLON20=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_halt_compiler_statement634); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON20);

			// AST REWRITE
			// elements: 183
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 155:69: -> '__halt_compiler'
			{
				adaptor.addChild(root_0, stream_183.nextNode());
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "halt_compiler_statement"


	public static class class_declaration_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "class_declaration_statement"
	// PHPAST.g:158:1: class_declaration_statement : ( ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) | ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) | ( TRAIT_T IDENTIFIER LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( TRAIT_T IDENTIFIER ( ^( TRAIT_BODY ( class_statement )* ) )? ) ) );
	public final PHPASTParser.class_declaration_statement_return class_declaration_statement() throws RecognitionException {
		PHPASTParser.class_declaration_statement_return retval = new PHPASTParser.class_declaration_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

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
		Token TRAIT_T40=null;
		Token IDENTIFIER41=null;
		Token LEFT_BRACKET42=null;
		Token RIGHT_BRACKET44=null;
		ParserRuleReturnScope class_entr_type21 =null;
		ParserRuleReturnScope fully_qualified_class_name25 =null;
		ParserRuleReturnScope fully_qualified_class_name_list27 =null;
		ParserRuleReturnScope class_statement29 =null;
		ParserRuleReturnScope fully_qualified_class_name_list34 =null;
		ParserRuleReturnScope fully_qualified_class_name_list36 =null;
		ParserRuleReturnScope class_statement38 =null;
		ParserRuleReturnScope class_statement43 =null;

		AST CLASS_T22_tree=null;
		AST IDENTIFIER23_tree=null;
		AST EXTENDS_T24_tree=null;
		AST IMPLEMENTS_T26_tree=null;
		AST LEFT_BRACKET28_tree=null;
		AST RIGHT_BRACKET30_tree=null;
		AST INTERFACE_T31_tree=null;
		AST IDENTIFIER32_tree=null;
		AST EXTENDS_T33_tree=null;
		AST IMPLEMENTS_T35_tree=null;
		AST LEFT_BRACKET37_tree=null;
		AST RIGHT_BRACKET39_tree=null;
		AST TRAIT_T40_tree=null;
		AST IDENTIFIER41_tree=null;
		AST LEFT_BRACKET42_tree=null;
		AST RIGHT_BRACKET44_tree=null;
		RewriteRuleTokenStream stream_EXTENDS_T=new RewriteRuleTokenStream(adaptor,"token EXTENDS_T");
		RewriteRuleTokenStream stream_INTERFACE_T=new RewriteRuleTokenStream(adaptor,"token INTERFACE_T");
		RewriteRuleTokenStream stream_CLASS_T=new RewriteRuleTokenStream(adaptor,"token CLASS_T");
		RewriteRuleTokenStream stream_TRAIT_T=new RewriteRuleTokenStream(adaptor,"token TRAIT_T");
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
			// PHPAST.g:168:3: ( ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) | ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) ) | ( TRAIT_T IDENTIFIER LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( TRAIT_T IDENTIFIER ( ^( TRAIT_BODY ( class_statement )* ) )? ) ) )
			int alt15=3;
			switch ( input.LA(1) ) {
			case CLASS_T:
			case 184:
			case 189:
				{
				alt15=1;
				}
				break;
			case INTERFACE_T:
				{
				alt15=2;
				}
				break;
			case TRAIT_T:
				{
				alt15=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// PHPAST.g:168:5: ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
					{
					// PHPAST.g:168:5: ( ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
					// PHPAST.g:168:7: ( class_entr_type )? CLASS_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET
					{
					// PHPAST.g:168:7: ( class_entr_type )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==184||LA7_0==189) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// PHPAST.g:168:7: class_entr_type
							{
							pushFollow(FOLLOW_class_entr_type_in_class_declaration_statement669);
							class_entr_type21=class_entr_type();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_class_entr_type.add(class_entr_type21.getTree());
							}
							break;

					}

					CLASS_T22=(Token)match(input,CLASS_T,FOLLOW_CLASS_T_in_class_declaration_statement672); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CLASS_T.add(CLASS_T22);

					IDENTIFIER23=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement674); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER23);

					// PHPAST.g:168:43: ( EXTENDS_T fully_qualified_class_name )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==EXTENDS_T) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// PHPAST.g:168:44: EXTENDS_T fully_qualified_class_name
							{
							EXTENDS_T24=(Token)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement677); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_EXTENDS_T.add(EXTENDS_T24);

							pushFollow(FOLLOW_fully_qualified_class_name_in_class_declaration_statement679);
							fully_qualified_class_name25=fully_qualified_class_name();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name25.getTree());
							}
							break;

					}

					// PHPAST.g:168:83: ( IMPLEMENTS_T fully_qualified_class_name_list )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==IMPLEMENTS_T) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// PHPAST.g:168:84: IMPLEMENTS_T fully_qualified_class_name_list
							{
							IMPLEMENTS_T26=(Token)match(input,IMPLEMENTS_T,FOLLOW_IMPLEMENTS_T_in_class_declaration_statement684); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IMPLEMENTS_T.add(IMPLEMENTS_T26);

							pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement686);
							fully_qualified_class_name_list27=fully_qualified_class_name_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list27.getTree());
							}
							break;

					}

					LEFT_BRACKET28=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_class_declaration_statement696); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET28);

					// PHPAST.g:169:20: ( class_statement )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==CONST_T||LA10_0==FUNCTION_T||LA10_0==STATIC_T||LA10_0==USE_T||LA10_0==184||LA10_0==189||(LA10_0 >= 193 && LA10_0 <= 195)||LA10_0==198) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// PHPAST.g:169:20: class_statement
							{
							pushFollow(FOLLOW_class_statement_in_class_declaration_statement698);
							class_statement29=class_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_class_statement.add(class_statement29.getTree());
							}
							break;

						default :
							break loop10;
						}
					}

					RIGHT_BRACKET30=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_class_declaration_statement701); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET30);

					if ( state.backtracking==0 ) {
					      startIndex = ((CommonToken)CLASS_T22).getStartIndex();
					      if ((class_entr_type21!=null?input.toString(class_entr_type21.start,class_entr_type21.stop):null) != null) {
					          token = (CommonToken)(class_entr_type21!=null?(class_entr_type21.start):null);
					          startIndex = token.getStartIndex();
					      } 
					      token = (CommonToken)RIGHT_BRACKET30;
					      endIndex = token.getStopIndex(); 
					    }
					// AST REWRITE
					// elements: class_statement, fully_qualified_class_name, IMPLEMENTS_T, EXTENDS_T, IDENTIFIER, CLASS_T, class_entr_type, fully_qualified_class_name_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 179:5: -> ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
					{
						// PHPAST.g:179:9: ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_CLASS_T.nextNode(), root_1);
						// PHPAST.g:179:19: ( class_entr_type )?
						if ( stream_class_entr_type.hasNext() ) {
							adaptor.addChild(root_1, stream_class_entr_type.nextTree());
						}
						stream_class_entr_type.reset();

						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// PHPAST.g:179:47: ( ^( EXTENDS_T fully_qualified_class_name ) )?
						if ( stream_fully_qualified_class_name.hasNext()||stream_EXTENDS_T.hasNext() ) {
							// PHPAST.g:179:47: ^( EXTENDS_T fully_qualified_class_name )
							{
							AST root_2 = (AST)adaptor.nil();
							root_2 = (AST)adaptor.becomeRoot(stream_EXTENDS_T.nextNode(), root_2);
							adaptor.addChild(root_2, stream_fully_qualified_class_name.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_fully_qualified_class_name.reset();
						stream_EXTENDS_T.reset();

						// PHPAST.g:179:88: ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )?
						if ( stream_IMPLEMENTS_T.hasNext()||stream_fully_qualified_class_name_list.hasNext() ) {
							// PHPAST.g:179:88: ^( IMPLEMENTS_T fully_qualified_class_name_list )
							{
							AST root_2 = (AST)adaptor.nil();
							root_2 = (AST)adaptor.becomeRoot(stream_IMPLEMENTS_T.nextNode(), root_2);
							adaptor.addChild(root_2, stream_fully_qualified_class_name_list.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_IMPLEMENTS_T.reset();
						stream_fully_qualified_class_name_list.reset();

						// PHPAST.g:180:7: ( ^( CLASS_BODY ( class_statement )* ) )?
						if ( stream_class_statement.hasNext() ) {
							// PHPAST.g:180:7: ^( CLASS_BODY ( class_statement )* )
							{
							AST root_2 = (AST)adaptor.nil();
							root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(CLASS_BODY, "CLASS_BODY"), root_2);
							// PHPAST.g:180:20: ( class_statement )*
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


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// PHPAST.g:182:6: ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
					{
					// PHPAST.g:182:6: ( INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? ) )
					// PHPAST.g:182:7: INTERFACE_T IDENTIFIER ( EXTENDS_T fully_qualified_class_name_list )? ( IMPLEMENTS_T fully_qualified_class_name_list )? LEFT_BRACKET ( class_statement )* RIGHT_BRACKET
					{
					INTERFACE_T31=(Token)match(input,INTERFACE_T,FOLLOW_INTERFACE_T_in_class_declaration_statement763); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INTERFACE_T.add(INTERFACE_T31);

					IDENTIFIER32=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement765); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER32);

					// PHPAST.g:182:30: ( EXTENDS_T fully_qualified_class_name_list )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==EXTENDS_T) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// PHPAST.g:182:31: EXTENDS_T fully_qualified_class_name_list
							{
							EXTENDS_T33=(Token)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement768); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_EXTENDS_T.add(EXTENDS_T33);

							pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement770);
							fully_qualified_class_name_list34=fully_qualified_class_name_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list34.getTree());
							}
							break;

					}

					// PHPAST.g:182:75: ( IMPLEMENTS_T fully_qualified_class_name_list )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==IMPLEMENTS_T) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// PHPAST.g:182:76: IMPLEMENTS_T fully_qualified_class_name_list
							{
							IMPLEMENTS_T35=(Token)match(input,IMPLEMENTS_T,FOLLOW_IMPLEMENTS_T_in_class_declaration_statement775); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IMPLEMENTS_T.add(IMPLEMENTS_T35);

							pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement777);
							fully_qualified_class_name_list36=fully_qualified_class_name_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list36.getTree());
							}
							break;

					}

					LEFT_BRACKET37=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_class_declaration_statement787); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET37);

					// PHPAST.g:183:20: ( class_statement )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==CONST_T||LA13_0==FUNCTION_T||LA13_0==STATIC_T||LA13_0==USE_T||LA13_0==184||LA13_0==189||(LA13_0 >= 193 && LA13_0 <= 195)||LA13_0==198) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// PHPAST.g:183:20: class_statement
							{
							pushFollow(FOLLOW_class_statement_in_class_declaration_statement789);
							class_statement38=class_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_class_statement.add(class_statement38.getTree());
							}
							break;

						default :
							break loop13;
						}
					}

					RIGHT_BRACKET39=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_class_declaration_statement792); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET39);

					if ( state.backtracking==0 ) {
					      startIndex = ((CommonToken)INTERFACE_T31).getStartIndex();
					      endIndex = ((CommonToken)RIGHT_BRACKET39).getStopIndex();
					    }
					// AST REWRITE
					// elements: INTERFACE_T, fully_qualified_class_name_list, EXTENDS_T, class_statement, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 189:5: -> ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
					{
						// PHPAST.g:189:9: ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY ( class_statement )* ) )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_INTERFACE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// PHPAST.g:189:34: ( ^( EXTENDS_T fully_qualified_class_name_list ) )?
						if ( stream_fully_qualified_class_name_list.hasNext()||stream_EXTENDS_T.hasNext() ) {
							// PHPAST.g:189:34: ^( EXTENDS_T fully_qualified_class_name_list )
							{
							AST root_2 = (AST)adaptor.nil();
							root_2 = (AST)adaptor.becomeRoot(stream_EXTENDS_T.nextNode(), root_2);
							adaptor.addChild(root_2, stream_fully_qualified_class_name_list.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_fully_qualified_class_name_list.reset();
						stream_EXTENDS_T.reset();

						// PHPAST.g:190:7: ( ^( CLASS_BODY ( class_statement )* ) )?
						if ( stream_class_statement.hasNext() ) {
							// PHPAST.g:190:7: ^( CLASS_BODY ( class_statement )* )
							{
							AST root_2 = (AST)adaptor.nil();
							root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(CLASS_BODY, "CLASS_BODY"), root_2);
							// PHPAST.g:190:20: ( class_statement )*
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


					retval.tree = root_0;
					}

					}

					}
					break;
				case 3 :
					// PHPAST.g:192:6: ( TRAIT_T IDENTIFIER LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( TRAIT_T IDENTIFIER ( ^( TRAIT_BODY ( class_statement )* ) )? ) )
					{
					// PHPAST.g:192:6: ( TRAIT_T IDENTIFIER LEFT_BRACKET ( class_statement )* RIGHT_BRACKET -> ^( TRAIT_T IDENTIFIER ( ^( TRAIT_BODY ( class_statement )* ) )? ) )
					// PHPAST.g:192:7: TRAIT_T IDENTIFIER LEFT_BRACKET ( class_statement )* RIGHT_BRACKET
					{
					TRAIT_T40=(Token)match(input,TRAIT_T,FOLLOW_TRAIT_T_in_class_declaration_statement853); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TRAIT_T.add(TRAIT_T40);

					IDENTIFIER41=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement855); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER41);

					LEFT_BRACKET42=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_class_declaration_statement857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET42);

					// PHPAST.g:192:39: ( class_statement )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==CONST_T||LA14_0==FUNCTION_T||LA14_0==STATIC_T||LA14_0==USE_T||LA14_0==184||LA14_0==189||(LA14_0 >= 193 && LA14_0 <= 195)||LA14_0==198) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// PHPAST.g:192:39: class_statement
							{
							pushFollow(FOLLOW_class_statement_in_class_declaration_statement859);
							class_statement43=class_statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_class_statement.add(class_statement43.getTree());
							}
							break;

						default :
							break loop14;
						}
					}

					RIGHT_BRACKET44=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_class_declaration_statement862); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET44);

					if ( state.backtracking==0 ) {
					        startIndex = ((CommonToken)TRAIT_T40).getStartIndex();
					        token = (CommonToken)RIGHT_BRACKET44;
					        endIndex = token.getStopIndex();
					    }
					// AST REWRITE
					// elements: class_statement, TRAIT_T, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 199:5: -> ^( TRAIT_T IDENTIFIER ( ^( TRAIT_BODY ( class_statement )* ) )? )
					{
						// PHPAST.g:199:8: ^( TRAIT_T IDENTIFIER ( ^( TRAIT_BODY ( class_statement )* ) )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_TRAIT_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// PHPAST.g:199:29: ( ^( TRAIT_BODY ( class_statement )* ) )?
						if ( stream_class_statement.hasNext() ) {
							// PHPAST.g:199:29: ^( TRAIT_BODY ( class_statement )* )
							{
							AST root_2 = (AST)adaptor.nil();
							root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(TRAIT_BODY, "TRAIT_BODY"), root_2);
							// PHPAST.g:199:42: ( class_statement )*
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


					retval.tree = root_0;
					}

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "class_declaration_statement"


	public static class class_entr_type_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "class_entr_type"
	// PHPAST.g:203:1: class_entr_type : ( 'abstract' | 'final' );
	public final PHPASTParser.class_entr_type_return class_entr_type() throws RecognitionException {
		PHPASTParser.class_entr_type_return retval = new PHPASTParser.class_entr_type_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set45=null;

		AST set45_tree=null;

		try {
			// PHPAST.g:204:3: ( 'abstract' | 'final' )
			// PHPAST.g:
			{
			root_0 = (AST)adaptor.nil();


			set45=input.LT(1);
			if ( input.LA(1)==184||input.LA(1)==189 ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set45));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "class_entr_type"


	public static class class_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "class_statement"
	// PHPAST.g:208:1: class_statement : ( variable_modifiers static_var_list SEMI_COLON -> ^( FIELD_DECL variable_modifiers static_var_list ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block ) | CONST_T directive SEMI_COLON -> ^( FIELD_DECL CONST_T directive ) | USE_T fully_qualified_class_name_list trait_adaptations -> ^( USE_T fully_qualified_class_name_list trait_adaptations ) );
	public final PHPASTParser.class_statement_return class_statement() throws RecognitionException {
		PHPASTParser.class_statement_return retval = new PHPASTParser.class_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token SEMI_COLON48=null;
		Token FUNCTION_T50=null;
		Token REF_T51=null;
		Token IDENTIFIER52=null;
		Token LEFT_PARETHESIS53=null;
		Token RIGHT_PARETHESIS55=null;
		Token SEMI_COLON56=null;
		Token FUNCTION_T58=null;
		Token REF_T59=null;
		Token IDENTIFIER60=null;
		Token LEFT_PARETHESIS61=null;
		Token RIGHT_PARETHESIS63=null;
		Token CONST_T65=null;
		Token SEMI_COLON67=null;
		Token USE_T68=null;
		ParserRuleReturnScope variable_modifiers46 =null;
		ParserRuleReturnScope static_var_list47 =null;
		ParserRuleReturnScope modifier49 =null;
		ParserRuleReturnScope parameter_list54 =null;
		ParserRuleReturnScope modifier57 =null;
		ParserRuleReturnScope parameter_list62 =null;
		ParserRuleReturnScope block64 =null;
		ParserRuleReturnScope directive66 =null;
		ParserRuleReturnScope fully_qualified_class_name_list69 =null;
		ParserRuleReturnScope trait_adaptations70 =null;

		AST SEMI_COLON48_tree=null;
		AST FUNCTION_T50_tree=null;
		AST REF_T51_tree=null;
		AST IDENTIFIER52_tree=null;
		AST LEFT_PARETHESIS53_tree=null;
		AST RIGHT_PARETHESIS55_tree=null;
		AST SEMI_COLON56_tree=null;
		AST FUNCTION_T58_tree=null;
		AST REF_T59_tree=null;
		AST IDENTIFIER60_tree=null;
		AST LEFT_PARETHESIS61_tree=null;
		AST RIGHT_PARETHESIS63_tree=null;
		AST CONST_T65_tree=null;
		AST SEMI_COLON67_tree=null;
		AST USE_T68_tree=null;
		RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
		RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
		RewriteRuleTokenStream stream_REF_T=new RewriteRuleTokenStream(adaptor,"token REF_T");
		RewriteRuleTokenStream stream_USE_T=new RewriteRuleTokenStream(adaptor,"token USE_T");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_CONST_T=new RewriteRuleTokenStream(adaptor,"token CONST_T");
		RewriteRuleTokenStream stream_FUNCTION_T=new RewriteRuleTokenStream(adaptor,"token FUNCTION_T");
		RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
		RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
		RewriteRuleSubtreeStream stream_fully_qualified_class_name_list=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name_list");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_directive=new RewriteRuleSubtreeStream(adaptor,"rule directive");
		RewriteRuleSubtreeStream stream_static_var_list=new RewriteRuleSubtreeStream(adaptor,"rule static_var_list");
		RewriteRuleSubtreeStream stream_trait_adaptations=new RewriteRuleSubtreeStream(adaptor,"rule trait_adaptations");
		RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
		RewriteRuleSubtreeStream stream_variable_modifiers=new RewriteRuleSubtreeStream(adaptor,"rule variable_modifiers");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:218:3: ( variable_modifiers static_var_list SEMI_COLON -> ^( FIELD_DECL variable_modifiers static_var_list ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT ) | ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block ) | CONST_T directive SEMI_COLON -> ^( FIELD_DECL CONST_T directive ) | USE_T fully_qualified_class_name_list trait_adaptations -> ^( USE_T fully_qualified_class_name_list trait_adaptations ) )
			int alt22=5;
			switch ( input.LA(1) ) {
			case 198:
				{
				alt22=1;
				}
				break;
			case STATIC_T:
			case 184:
			case 189:
			case 193:
			case 194:
			case 195:
				{
				int LA22_2 = input.LA(2);
				if ( (synpred23_PHPAST()) ) {
					alt22=1;
				}
				else if ( (synpred27_PHPAST()) ) {
					alt22=2;
				}
				else if ( (synpred31_PHPAST()) ) {
					alt22=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FUNCTION_T:
				{
				int LA22_3 = input.LA(2);
				if ( (synpred27_PHPAST()) ) {
					alt22=2;
				}
				else if ( (synpred31_PHPAST()) ) {
					alt22=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CONST_T:
				{
				alt22=4;
				}
				break;
			case USE_T:
				{
				alt22=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// PHPAST.g:218:5: variable_modifiers static_var_list SEMI_COLON
					{
					pushFollow(FOLLOW_variable_modifiers_in_class_statement943);
					variable_modifiers46=variable_modifiers();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variable_modifiers.add(variable_modifiers46.getTree());
					pushFollow(FOLLOW_static_var_list_in_class_statement945);
					static_var_list47=static_var_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_static_var_list.add(static_var_list47.getTree());
					SEMI_COLON48=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_class_statement947); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON48);

					if ( state.backtracking==0 ) {
					     token = (CommonToken)(variable_modifiers46!=null?(variable_modifiers46.start):null);
					       startIndex = token.getStartIndex();
					       token = (CommonToken)SEMI_COLON48;
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 225:7: -> ^( FIELD_DECL variable_modifiers static_var_list )
					{
						// PHPAST.g:225:11: ^( FIELD_DECL variable_modifiers static_var_list )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(FIELD_DECL, "FIELD_DECL"), root_1);
						adaptor.addChild(root_1, stream_variable_modifiers.nextTree());
						adaptor.addChild(root_1, stream_static_var_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:226:5: ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON
					{
					// PHPAST.g:226:5: ( modifier )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==STATIC_T||LA16_0==184||LA16_0==189||(LA16_0 >= 193 && LA16_0 <= 195)) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// PHPAST.g:226:5: modifier
							{
							pushFollow(FOLLOW_modifier_in_class_statement974);
							modifier49=modifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_modifier.add(modifier49.getTree());
							}
							break;

					}

					FUNCTION_T50=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_class_statement977); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T50);

					// PHPAST.g:226:26: ( REF_T )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==REF_T) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// PHPAST.g:226:26: REF_T
							{
							REF_T51=(Token)match(input,REF_T,FOLLOW_REF_T_in_class_statement979); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_REF_T.add(REF_T51);

							}
							break;

					}

					IDENTIFIER52=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_statement982); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER52);

					LEFT_PARETHESIS53=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_class_statement984); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS53);

					// PHPAST.g:226:60: ( parameter_list )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==CLONE_T||LA18_0==CONST_T||(LA18_0 >= DOLLAR_T && LA18_0 <= DOMAIN_T)||LA18_0==IDENTIFIER||LA18_0==NAMESPACE_T||LA18_0==REF_T||LA18_0==UNSET_T||(LA18_0 >= 185 && LA18_0 <= 188)||(LA18_0 >= 190 && LA18_0 <= 192)||(LA18_0 >= 196 && LA18_0 <= 197)) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// PHPAST.g:226:60: parameter_list
							{
							pushFollow(FOLLOW_parameter_list_in_class_statement986);
							parameter_list54=parameter_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list54.getTree());
							}
							break;

					}

					RIGHT_PARETHESIS55=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_class_statement989); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS55);

					SEMI_COLON56=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_class_statement991); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON56);

					if ( state.backtracking==0 ) {
					     if ((modifier49!=null?input.toString(modifier49.start,modifier49.stop):null) != null) {
					       token = (CommonToken)(modifier49!=null?(modifier49.start):null);
					     }
					     else {
					       token = (CommonToken)FUNCTION_T50;
					     }
					     startIndex = token.getStartIndex();
					     token = (CommonToken)SEMI_COLON56;
					     endIndex = token.getStopIndex();
					  }
					// AST REWRITE
					// elements: parameter_list, IDENTIFIER, modifier, REF_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 238:6: -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT )
					{
						// PHPAST.g:238:10: ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? EMPTYSTATEMENT )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);
						// PHPAST.g:238:24: ( modifier )?
						if ( stream_modifier.hasNext() ) {
							adaptor.addChild(root_1, stream_modifier.nextTree());
						}
						stream_modifier.reset();

						// PHPAST.g:238:34: ( REF_T )?
						if ( stream_REF_T.hasNext() ) {
							adaptor.addChild(root_1, stream_REF_T.nextNode());
						}
						stream_REF_T.reset();

						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// PHPAST.g:238:52: ( parameter_list )?
						if ( stream_parameter_list.hasNext() ) {
							adaptor.addChild(root_1, stream_parameter_list.nextTree());
						}
						stream_parameter_list.reset();

						adaptor.addChild(root_1, (AST)adaptor.create(EMPTYSTATEMENT, "EMPTYSTATEMENT"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// PHPAST.g:239:5: ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block
					{
					// PHPAST.g:239:5: ( modifier )?
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==STATIC_T||LA19_0==184||LA19_0==189||(LA19_0 >= 193 && LA19_0 <= 195)) ) {
						alt19=1;
					}
					switch (alt19) {
						case 1 :
							// PHPAST.g:239:5: modifier
							{
							pushFollow(FOLLOW_modifier_in_class_statement1026);
							modifier57=modifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_modifier.add(modifier57.getTree());
							}
							break;

					}

					FUNCTION_T58=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_class_statement1029); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T58);

					// PHPAST.g:239:26: ( REF_T )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==REF_T) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// PHPAST.g:239:26: REF_T
							{
							REF_T59=(Token)match(input,REF_T,FOLLOW_REF_T_in_class_statement1031); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_REF_T.add(REF_T59);

							}
							break;

					}

					IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_statement1034); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER60);

					LEFT_PARETHESIS61=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_class_statement1036); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS61);

					// PHPAST.g:239:60: ( parameter_list )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==CLONE_T||LA21_0==CONST_T||(LA21_0 >= DOLLAR_T && LA21_0 <= DOMAIN_T)||LA21_0==IDENTIFIER||LA21_0==NAMESPACE_T||LA21_0==REF_T||LA21_0==UNSET_T||(LA21_0 >= 185 && LA21_0 <= 188)||(LA21_0 >= 190 && LA21_0 <= 192)||(LA21_0 >= 196 && LA21_0 <= 197)) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// PHPAST.g:239:60: parameter_list
							{
							pushFollow(FOLLOW_parameter_list_in_class_statement1038);
							parameter_list62=parameter_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list62.getTree());
							}
							break;

					}

					RIGHT_PARETHESIS63=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_class_statement1041); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS63);

					pushFollow(FOLLOW_block_in_class_statement1043);
					block64=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block64.getTree());
					if ( state.backtracking==0 ) {
					     if ((modifier57!=null?input.toString(modifier57.start,modifier57.stop):null) != null) {
					       token = (CommonToken)(modifier57!=null?(modifier57.start):null);
					     }
					     else {
					       token = (CommonToken)FUNCTION_T58;
					     }
					     startIndex = token.getStartIndex();
					     token = (CommonToken)(block64!=null?(block64.stop):null);
					     endIndex = token.getStopIndex();
					  }
					// AST REWRITE
					// elements: parameter_list, modifier, IDENTIFIER, block, REF_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 251:6: -> ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block )
					{
						// PHPAST.g:251:10: ^( METHOD_DECL ( modifier )? ( REF_T )? IDENTIFIER ( parameter_list )? block )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);
						// PHPAST.g:251:24: ( modifier )?
						if ( stream_modifier.hasNext() ) {
							adaptor.addChild(root_1, stream_modifier.nextTree());
						}
						stream_modifier.reset();

						// PHPAST.g:251:34: ( REF_T )?
						if ( stream_REF_T.hasNext() ) {
							adaptor.addChild(root_1, stream_REF_T.nextNode());
						}
						stream_REF_T.reset();

						adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						// PHPAST.g:251:52: ( parameter_list )?
						if ( stream_parameter_list.hasNext() ) {
							adaptor.addChild(root_1, stream_parameter_list.nextTree());
						}
						stream_parameter_list.reset();

						adaptor.addChild(root_1, stream_block.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// PHPAST.g:252:5: CONST_T directive SEMI_COLON
					{
					CONST_T65=(Token)match(input,CONST_T,FOLLOW_CONST_T_in_class_statement1078); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CONST_T.add(CONST_T65);

					pushFollow(FOLLOW_directive_in_class_statement1080);
					directive66=directive();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_directive.add(directive66.getTree());
					SEMI_COLON67=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_class_statement1082); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON67);

					if ( state.backtracking==0 ) {
					     token = (CommonToken)CONST_T65;
					     startIndex = token.getStartIndex();
					     token = (CommonToken)SEMI_COLON67;
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 259:6: -> ^( FIELD_DECL CONST_T directive )
					{
						// PHPAST.g:259:10: ^( FIELD_DECL CONST_T directive )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(FIELD_DECL, "FIELD_DECL"), root_1);
						adaptor.addChild(root_1, stream_CONST_T.nextNode());
						adaptor.addChild(root_1, stream_directive.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// PHPAST.g:260:5: USE_T fully_qualified_class_name_list trait_adaptations
					{
					USE_T68=(Token)match(input,USE_T,FOLLOW_USE_T_in_class_statement1110); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USE_T.add(USE_T68);

					pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_statement1112);
					fully_qualified_class_name_list69=fully_qualified_class_name_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list69.getTree());
					pushFollow(FOLLOW_trait_adaptations_in_class_statement1114);
					trait_adaptations70=trait_adaptations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_trait_adaptations.add(trait_adaptations70.getTree());
					if ( state.backtracking==0 ) {
					    token = (CommonToken)USE_T68;
					    startIndex = token.getStartIndex();
					    token = (CommonToken)(trait_adaptations70!=null?(trait_adaptations70.stop):null);
					    endIndex = token.getStopIndex();
					  }
					// AST REWRITE
					// elements: USE_T, trait_adaptations, fully_qualified_class_name_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 267:6: -> ^( USE_T fully_qualified_class_name_list trait_adaptations )
					{
						// PHPAST.g:267:9: ^( USE_T fully_qualified_class_name_list trait_adaptations )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_USE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_fully_qualified_class_name_list.nextTree());
						adaptor.addChild(root_1, stream_trait_adaptations.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "class_statement"


	public static class trait_adaptations_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "trait_adaptations"
	// PHPAST.g:270:1: trait_adaptations : ( ( LEFT_BRACKET )? ( trait_adaptation )* ( RIGHT_BRACKET )? -> ^( TRAIT_T ( trait_adaptation )* ) | SEMI_COLON );
	public final PHPASTParser.trait_adaptations_return trait_adaptations() throws RecognitionException {
		PHPASTParser.trait_adaptations_return retval = new PHPASTParser.trait_adaptations_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LEFT_BRACKET71=null;
		Token RIGHT_BRACKET73=null;
		Token SEMI_COLON74=null;
		ParserRuleReturnScope trait_adaptation72 =null;

		AST LEFT_BRACKET71_tree=null;
		AST RIGHT_BRACKET73_tree=null;
		AST SEMI_COLON74_tree=null;
		RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
		RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
		RewriteRuleSubtreeStream stream_trait_adaptation=new RewriteRuleSubtreeStream(adaptor,"rule trait_adaptation");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:280:3: ( ( LEFT_BRACKET )? ( trait_adaptation )* ( RIGHT_BRACKET )? -> ^( TRAIT_T ( trait_adaptation )* ) | SEMI_COLON )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==EOF||LA26_0==CONST_T||LA26_0==DOMAIN_T||LA26_0==FUNCTION_T||LA26_0==IDENTIFIER||LA26_0==LEFT_BRACKET||LA26_0==NAMESPACE_T||LA26_0==RIGHT_BRACKET||LA26_0==STATIC_T||LA26_0==USE_T||LA26_0==184||LA26_0==189||(LA26_0 >= 193 && LA26_0 <= 195)||LA26_0==198) ) {
				alt26=1;
			}
			else if ( (LA26_0==SEMI_COLON) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// PHPAST.g:280:5: ( LEFT_BRACKET )? ( trait_adaptation )* ( RIGHT_BRACKET )?
					{
					// PHPAST.g:280:5: ( LEFT_BRACKET )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==LEFT_BRACKET) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// PHPAST.g:280:5: LEFT_BRACKET
							{
							LEFT_BRACKET71=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_trait_adaptations1156); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET71);

							}
							break;

					}

					// PHPAST.g:280:19: ( trait_adaptation )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==DOMAIN_T||LA24_0==IDENTIFIER||LA24_0==NAMESPACE_T) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// PHPAST.g:280:19: trait_adaptation
							{
							pushFollow(FOLLOW_trait_adaptation_in_trait_adaptations1159);
							trait_adaptation72=trait_adaptation();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_trait_adaptation.add(trait_adaptation72.getTree());
							}
							break;

						default :
							break loop24;
						}
					}

					// PHPAST.g:280:37: ( RIGHT_BRACKET )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==RIGHT_BRACKET) ) {
						int LA25_1 = input.LA(2);
						if ( (synpred35_PHPAST()) ) {
							alt25=1;
						}
					}
					switch (alt25) {
						case 1 :
							// PHPAST.g:280:37: RIGHT_BRACKET
							{
							RIGHT_BRACKET73=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_trait_adaptations1162); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET73);

							}
							break;

					}

					if ( state.backtracking==0 ) {
					    token = (CommonToken)LEFT_BRACKET71;
					    startIndex = token.getStartIndex();
					    token = (CommonToken)RIGHT_BRACKET73;
					    endIndex = token.getStopIndex();
					  }
					// AST REWRITE
					// elements: trait_adaptation
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 287:3: -> ^( TRAIT_T ( trait_adaptation )* )
					{
						// PHPAST.g:287:6: ^( TRAIT_T ( trait_adaptation )* )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(TRAIT_T, "TRAIT_T"), root_1);
						// PHPAST.g:287:16: ( trait_adaptation )*
						while ( stream_trait_adaptation.hasNext() ) {
							adaptor.addChild(root_1, stream_trait_adaptation.nextTree());
						}
						stream_trait_adaptation.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:288:5: SEMI_COLON
					{
					root_0 = (AST)adaptor.nil();


					SEMI_COLON74=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_trait_adaptations1184); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMI_COLON74_tree = (AST)adaptor.create(SEMI_COLON74);
					adaptor.addChild(root_0, SEMI_COLON74_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trait_adaptations"


	public static class trait_adaptation_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "trait_adaptation"
	// PHPAST.g:291:1: trait_adaptation : ( fully_qualified_class_name INSTANCEOF_T fully_qualified_class_name_list SEMI_COLON -> ^( INSTANCEOF_T fully_qualified_class_name fully_qualified_class_name_list ) | fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? SEMI_COLON -> ^( TRAIT_METH fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? ) );
	public final PHPASTParser.trait_adaptation_return trait_adaptation() throws RecognitionException {
		PHPASTParser.trait_adaptation_return retval = new PHPASTParser.trait_adaptation_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token INSTANCEOF_T76=null;
		Token SEMI_COLON78=null;
		Token AS_T80=null;
		Token IDENTIFIER82=null;
		Token SEMI_COLON83=null;
		ParserRuleReturnScope fully_qualified_class_name75 =null;
		ParserRuleReturnScope fully_qualified_class_name_list77 =null;
		ParserRuleReturnScope fully_qualified_class_name79 =null;
		ParserRuleReturnScope modifier81 =null;

		AST INSTANCEOF_T76_tree=null;
		AST SEMI_COLON78_tree=null;
		AST AS_T80_tree=null;
		AST IDENTIFIER82_tree=null;
		AST SEMI_COLON83_tree=null;
		RewriteRuleTokenStream stream_AS_T=new RewriteRuleTokenStream(adaptor,"token AS_T");
		RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_INSTANCEOF_T=new RewriteRuleTokenStream(adaptor,"token INSTANCEOF_T");
		RewriteRuleSubtreeStream stream_modifier=new RewriteRuleSubtreeStream(adaptor,"rule modifier");
		RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");
		RewriteRuleSubtreeStream stream_fully_qualified_class_name_list=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:301:3: ( fully_qualified_class_name INSTANCEOF_T fully_qualified_class_name_list SEMI_COLON -> ^( INSTANCEOF_T fully_qualified_class_name fully_qualified_class_name_list ) | fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? SEMI_COLON -> ^( TRAIT_METH fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? ) )
			int alt29=2;
			alt29 = dfa29.predict(input);
			switch (alt29) {
				case 1 :
					// PHPAST.g:301:5: fully_qualified_class_name INSTANCEOF_T fully_qualified_class_name_list SEMI_COLON
					{
					pushFollow(FOLLOW_fully_qualified_class_name_in_trait_adaptation1209);
					fully_qualified_class_name75=fully_qualified_class_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name75.getTree());
					INSTANCEOF_T76=(Token)match(input,INSTANCEOF_T,FOLLOW_INSTANCEOF_T_in_trait_adaptation1211); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INSTANCEOF_T.add(INSTANCEOF_T76);

					pushFollow(FOLLOW_fully_qualified_class_name_list_in_trait_adaptation1213);
					fully_qualified_class_name_list77=fully_qualified_class_name_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fully_qualified_class_name_list.add(fully_qualified_class_name_list77.getTree());
					SEMI_COLON78=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_trait_adaptation1215); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON78);

					if ( state.backtracking==0 ) {
					    token = (CommonToken)(fully_qualified_class_name75!=null?(fully_qualified_class_name75.start):null);
					    startIndex = token.getStartIndex();
					    token = (CommonToken)SEMI_COLON78;
					    endIndex = token.getStopIndex();
					  }
					// AST REWRITE
					// elements: fully_qualified_class_name_list, fully_qualified_class_name, INSTANCEOF_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 308:3: -> ^( INSTANCEOF_T fully_qualified_class_name fully_qualified_class_name_list )
					{
						// PHPAST.g:308:6: ^( INSTANCEOF_T fully_qualified_class_name fully_qualified_class_name_list )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_INSTANCEOF_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());
						adaptor.addChild(root_1, stream_fully_qualified_class_name_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:309:5: fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? SEMI_COLON
					{
					pushFollow(FOLLOW_fully_qualified_class_name_in_trait_adaptation1237);
					fully_qualified_class_name79=fully_qualified_class_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name79.getTree());
					AS_T80=(Token)match(input,AS_T,FOLLOW_AS_T_in_trait_adaptation1239); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AS_T.add(AS_T80);

					// PHPAST.g:309:37: ( modifier )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==STATIC_T||LA27_0==184||LA27_0==189||(LA27_0 >= 193 && LA27_0 <= 195)) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// PHPAST.g:309:37: modifier
							{
							pushFollow(FOLLOW_modifier_in_trait_adaptation1241);
							modifier81=modifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_modifier.add(modifier81.getTree());
							}
							break;

					}

					// PHPAST.g:309:47: ( IDENTIFIER )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==IDENTIFIER) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// PHPAST.g:309:47: IDENTIFIER
							{
							IDENTIFIER82=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_trait_adaptation1244); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER82);

							}
							break;

					}

					SEMI_COLON83=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_trait_adaptation1247); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON83);

					if ( state.backtracking==0 ) {
					    token = (CommonToken)(fully_qualified_class_name79!=null?(fully_qualified_class_name79.start):null);
					    startIndex = token.getStartIndex();
					    token = (CommonToken)SEMI_COLON83;
					    endIndex = token.getStopIndex();
					  }
					// AST REWRITE
					// elements: modifier, AS_T, fully_qualified_class_name, IDENTIFIER
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 316:3: -> ^( TRAIT_METH fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? )
					{
						// PHPAST.g:316:6: ^( TRAIT_METH fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(TRAIT_METH, "TRAIT_METH"), root_1);
						adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());
						adaptor.addChild(root_1, stream_AS_T.nextNode());
						// PHPAST.g:316:51: ( modifier )?
						if ( stream_modifier.hasNext() ) {
							adaptor.addChild(root_1, stream_modifier.nextTree());
						}
						stream_modifier.reset();

						// PHPAST.g:316:61: ( IDENTIFIER )?
						if ( stream_IDENTIFIER.hasNext() ) {
							adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
						}
						stream_IDENTIFIER.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trait_adaptation"


	public static class trait_method_reference_fully_qualified_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "trait_method_reference_fully_qualified"
	// PHPAST.g:319:1: trait_method_reference_fully_qualified :;
	public final PHPASTParser.trait_method_reference_fully_qualified_return trait_method_reference_fully_qualified() throws RecognitionException {
		PHPASTParser.trait_method_reference_fully_qualified_return retval = new PHPASTParser.trait_method_reference_fully_qualified_return();
		retval.start = input.LT(1);

		AST root_0 = null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:329:3: ()
			// PHPAST.g:330:3: 
			{
			root_0 = (AST)adaptor.nil();


			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trait_method_reference_fully_qualified"


	public static class function_declaration_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "function_declaration_statement"
	// PHPAST.g:331:1: function_declaration_statement : FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) ;
	public final PHPASTParser.function_declaration_statement_return function_declaration_statement() throws RecognitionException {
		PHPASTParser.function_declaration_statement_return retval = new PHPASTParser.function_declaration_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token FUNCTION_T84=null;
		Token REF_T85=null;
		Token IDENTIFIER86=null;
		Token LEFT_PARETHESIS87=null;
		Token RIGHT_PARETHESIS89=null;
		ParserRuleReturnScope parameter_list88 =null;
		ParserRuleReturnScope block90 =null;

		AST FUNCTION_T84_tree=null;
		AST REF_T85_tree=null;
		AST IDENTIFIER86_tree=null;
		AST LEFT_PARETHESIS87_tree=null;
		AST RIGHT_PARETHESIS89_tree=null;
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
			// PHPAST.g:341:3: ( FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block -> ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) )
			// PHPAST.g:341:5: FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block
			{
			FUNCTION_T84=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_function_declaration_statement1312); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T84);

			// PHPAST.g:341:16: ( REF_T )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==REF_T) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// PHPAST.g:341:16: REF_T
					{
					REF_T85=(Token)match(input,REF_T,FOLLOW_REF_T_in_function_declaration_statement1314); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REF_T.add(REF_T85);

					}
					break;

			}

			IDENTIFIER86=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration_statement1317); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER86);

			LEFT_PARETHESIS87=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_function_declaration_statement1319); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS87);

			// PHPAST.g:341:50: ( parameter_list )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==CLONE_T||LA31_0==CONST_T||(LA31_0 >= DOLLAR_T && LA31_0 <= DOMAIN_T)||LA31_0==IDENTIFIER||LA31_0==NAMESPACE_T||LA31_0==REF_T||LA31_0==UNSET_T||(LA31_0 >= 185 && LA31_0 <= 188)||(LA31_0 >= 190 && LA31_0 <= 192)||(LA31_0 >= 196 && LA31_0 <= 197)) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// PHPAST.g:341:50: parameter_list
					{
					pushFollow(FOLLOW_parameter_list_in_function_declaration_statement1321);
					parameter_list88=parameter_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list88.getTree());
					}
					break;

			}

			RIGHT_PARETHESIS89=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_function_declaration_statement1324); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS89);

			pushFollow(FOLLOW_block_in_function_declaration_statement1331);
			block90=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block90.getTree());
			if ( state.backtracking==0 ) {
			    token = (CommonToken)FUNCTION_T84;
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(block90!=null?(block90.stop):null);
			    endIndex = token.getStopIndex();
			  }
			// AST REWRITE
			// elements: REF_T, IDENTIFIER, parameter_list, block
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 349:3: -> ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block )
			{
				// PHPAST.g:349:6: ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);
				// PHPAST.g:349:20: ( REF_T )?
				if ( stream_REF_T.hasNext() ) {
					adaptor.addChild(root_1, stream_REF_T.nextNode());
				}
				stream_REF_T.reset();

				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				// PHPAST.g:349:38: ( parameter_list )?
				if ( stream_parameter_list.hasNext() ) {
					adaptor.addChild(root_1, stream_parameter_list.nextTree());
				}
				stream_parameter_list.reset();

				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_declaration_statement"


	public static class block_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "block"
	// PHPAST.g:352:1: block : LEFT_BRACKET ( inner_statement_list )? RIGHT_BRACKET -> ^( BLOCK ( inner_statement_list )? ) ;
	public final PHPASTParser.block_return block() throws RecognitionException {
		PHPASTParser.block_return retval = new PHPASTParser.block_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LEFT_BRACKET91=null;
		Token RIGHT_BRACKET93=null;
		ParserRuleReturnScope inner_statement_list92 =null;

		AST LEFT_BRACKET91_tree=null;
		AST RIGHT_BRACKET93_tree=null;
		RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
		RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
		RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:362:3: ( LEFT_BRACKET ( inner_statement_list )? RIGHT_BRACKET -> ^( BLOCK ( inner_statement_list )? ) )
			// PHPAST.g:362:5: LEFT_BRACKET ( inner_statement_list )? RIGHT_BRACKET
			{
			LEFT_BRACKET91=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_block1377); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET91);

			// PHPAST.g:362:18: ( inner_statement_list )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( ((LA32_0 >= AT_T && LA32_0 <= BACKTRICKLITERAL)||LA32_0==BREAK_T||(LA32_0 >= CLASS_T && LA32_0 <= CLONE_T)||(LA32_0 >= CONTINUE_T && LA32_0 <= DECLARE_T)||(LA32_0 >= DOLLAR_T && LA32_0 <= DOMAIN_T)||(LA32_0 >= DOUBLELITERRAL && LA32_0 <= DO_T)||LA32_0==ECHO_T||LA32_0==EXC_NOT_T||(LA32_0 >= FLOATLITERAL && LA32_0 <= FUNCTION_T)||LA32_0==GLOBAL_T||LA32_0==HERE_DOC||(LA32_0 >= IDENTIFIER && LA32_0 <= IF_T)||(LA32_0 >= INCLUDE_ONCE_T && LA32_0 <= INCLUDE_T)||(LA32_0 >= INTERFACE_T && LA32_0 <= INTLITERAL)||(LA32_0 >= LEFT_BRACKET && LA32_0 <= LEFT_PARETHESIS)||LA32_0==LIST_T||(LA32_0 >= MINUS_MINUS_T && LA32_0 <= MINUS_T)||(LA32_0 >= NAMESPACE_T && LA32_0 <= NEW_T)||(LA32_0 >= PLUS_PLUS_T && LA32_0 <= PLUS_T)||LA32_0==PRINT_T||(LA32_0 >= REALLITERAL && LA32_0 <= RETURN_T)||LA32_0==SEMI_COLON||(LA32_0 >= STATIC && LA32_0 <= TILDA_T)||(LA32_0 >= TRAIT_T && LA32_0 <= TRY_T)||LA32_0==UNSET_T||LA32_0==USE_T||LA32_0==WHILE_T||(LA32_0 >= 176 && LA32_0 <= 185)||LA32_0==189) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// PHPAST.g:362:18: inner_statement_list
					{
					pushFollow(FOLLOW_inner_statement_list_in_block1379);
					inner_statement_list92=inner_statement_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list92.getTree());
					}
					break;

			}

			RIGHT_BRACKET93=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_block1382); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET93);

			if ( state.backtracking==0 ) {
			    token = (CommonToken)LEFT_BRACKET91;
			    startIndex = token.getStartIndex();
			    token = (CommonToken)RIGHT_BRACKET93;
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 370:6: -> ^( BLOCK ( inner_statement_list )? )
			{
				// PHPAST.g:370:10: ^( BLOCK ( inner_statement_list )? )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(BLOCK, "BLOCK"), root_1);
				// PHPAST.g:370:18: ( inner_statement_list )?
				if ( stream_inner_statement_list.hasNext() ) {
					adaptor.addChild(root_1, stream_inner_statement_list.nextTree());
				}
				stream_inner_statement_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// PHPAST.g:373:1: statement : topStatement -> ^( STATEMENT topStatement ) ;
	public final PHPASTParser.statement_return statement() throws RecognitionException {
		PHPASTParser.statement_return retval = new PHPASTParser.statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope topStatement94 =null;

		RewriteRuleSubtreeStream stream_topStatement=new RewriteRuleSubtreeStream(adaptor,"rule topStatement");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:383:3: ( topStatement -> ^( STATEMENT topStatement ) )
			// PHPAST.g:383:5: topStatement
			{
			pushFollow(FOLLOW_topStatement_in_statement1429);
			topStatement94=topStatement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_topStatement.add(topStatement94.getTree());
			if ( state.backtracking==0 ) {
			      startIndex = (topStatement94!=null?((AST)topStatement94.getTree()):null).startIndex;
			      endIndex = (topStatement94!=null?((AST)topStatement94.getTree()):null).endIndex;
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 388:5: -> ^( STATEMENT topStatement )
			{
				// PHPAST.g:388:8: ^( STATEMENT topStatement )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(STATEMENT, "STATEMENT"), root_1);
				adaptor.addChild(root_1, stream_topStatement.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST exprToken = retval.tree;
			  exprToken.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class topStatement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "topStatement"
	// PHPAST.g:391:1: topStatement : ( block | if_stat | WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement -> ^( WHILE_T ^( CONDITION expression ) while_statement ) | DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( DO_T ^( CONDITION expression ) statement ) | FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? ) | SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list ) | BREAK_T ( expression )? SEMI_COLON -> ^( BREAK_T ( expression )? ) | CONTINUE_T ( expression )? SEMI_COLON -> ^( CONTINUE_T ( expression )? ) | RETURN_T ( expression )? SEMI_COLON -> ^( RETURN_T ( expression )? ) | GLOBAL_T variable_list SEMI_COLON -> ^( GLOBAL_T variable_list ) | STATIC_T static_var_list SEMI_COLON -> ^( STATIC_T static_var_list ) | ECHO_T expr_list SEMI_COLON -> ^( ECHO_T expr_list ) | expression SEMI_COLON !| FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement ) | DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement -> ^( DECLARE_T directive ( declare_statement )? ) | SEMI_COLON -> ^( EMPTYSTATEMENT SEMI_COLON ) | TRY_T block ( catch_branch )+ -> ^( TRY_T block ( catch_branch )+ ) | THROW_T expression SEMI_COLON -> ^( THROW_T expression ) | USE_T scalar SEMI_COLON -> ^( USE_T scalar ) | USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON -> ^( USE_PARETHESIS_T scalar ) | INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_T expression ) | INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_ONCE_T expression ) | REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_T expression ) | REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_ONCE_T expression ) );
	public final PHPASTParser.topStatement_return topStatement() throws RecognitionException {
		PHPASTParser.topStatement_return retval = new PHPASTParser.topStatement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token WHILE_T97=null;
		Token LEFT_PARETHESIS98=null;
		Token RIGHT_PARETHESIS100=null;
		Token DO_T102=null;
		Token WHILE_T104=null;
		Token LEFT_PARETHESIS105=null;
		Token RIGHT_PARETHESIS107=null;
		Token SEMI_COLON108=null;
		Token FOR_T109=null;
		Token LEFT_PARETHESIS110=null;
		Token SEMI_COLON111=null;
		Token SEMI_COLON112=null;
		Token RIGHT_PARETHESIS113=null;
		Token SWITCH_T115=null;
		Token LEFT_PARETHESIS116=null;
		Token RIGHT_PARETHESIS118=null;
		Token BREAK_T120=null;
		Token SEMI_COLON122=null;
		Token CONTINUE_T123=null;
		Token SEMI_COLON125=null;
		Token RETURN_T126=null;
		Token SEMI_COLON128=null;
		Token GLOBAL_T129=null;
		Token SEMI_COLON131=null;
		Token STATIC_T132=null;
		Token SEMI_COLON134=null;
		Token ECHO_T135=null;
		Token SEMI_COLON137=null;
		Token SEMI_COLON139=null;
		Token FOREACH_T140=null;
		Token LEFT_PARETHESIS141=null;
		Token AS_T143=null;
		Token ARROW_T145=null;
		Token RIGHT_PARETHESIS147=null;
		Token DECLARE_T149=null;
		Token LEFT_PARETHESIS150=null;
		Token RIGHT_PARETHESIS152=null;
		Token SEMI_COLON154=null;
		Token TRY_T155=null;
		Token THROW_T158=null;
		Token SEMI_COLON160=null;
		Token USE_T161=null;
		Token SEMI_COLON163=null;
		Token USE_T164=null;
		Token LEFT_PARETHESIS165=null;
		Token RIGHT_PARETHESIS167=null;
		Token SEMI_COLON168=null;
		Token INCLUDE_T169=null;
		Token LEFT_PARETHESIS170=null;
		Token RIGHT_PARETHESIS172=null;
		Token SEMI_COLON173=null;
		Token INCLUDE_ONCE_T174=null;
		Token LEFT_PARETHESIS175=null;
		Token RIGHT_PARETHESIS177=null;
		Token SEMI_COLON178=null;
		Token REQUIRE_T179=null;
		Token LEFT_PARETHESIS180=null;
		Token RIGHT_PARETHESIS182=null;
		Token SEMI_COLON183=null;
		Token REQUIRE_ONCE_T184=null;
		Token LEFT_PARETHESIS185=null;
		Token RIGHT_PARETHESIS187=null;
		Token SEMI_COLON188=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope e3 =null;
		ParserRuleReturnScope block95 =null;
		ParserRuleReturnScope if_stat96 =null;
		ParserRuleReturnScope expression99 =null;
		ParserRuleReturnScope while_statement101 =null;
		ParserRuleReturnScope statement103 =null;
		ParserRuleReturnScope expression106 =null;
		ParserRuleReturnScope for_statement114 =null;
		ParserRuleReturnScope expression117 =null;
		ParserRuleReturnScope switch_case_list119 =null;
		ParserRuleReturnScope expression121 =null;
		ParserRuleReturnScope expression124 =null;
		ParserRuleReturnScope expression127 =null;
		ParserRuleReturnScope variable_list130 =null;
		ParserRuleReturnScope static_var_list133 =null;
		ParserRuleReturnScope expr_list136 =null;
		ParserRuleReturnScope expression138 =null;
		ParserRuleReturnScope expression142 =null;
		ParserRuleReturnScope foreach_variable144 =null;
		ParserRuleReturnScope foreach_variable146 =null;
		ParserRuleReturnScope foreach_statement148 =null;
		ParserRuleReturnScope directive151 =null;
		ParserRuleReturnScope declare_statement153 =null;
		ParserRuleReturnScope block156 =null;
		ParserRuleReturnScope catch_branch157 =null;
		ParserRuleReturnScope expression159 =null;
		ParserRuleReturnScope scalar162 =null;
		ParserRuleReturnScope scalar166 =null;
		ParserRuleReturnScope expression171 =null;
		ParserRuleReturnScope expression176 =null;
		ParserRuleReturnScope expression181 =null;
		ParserRuleReturnScope expression186 =null;

		AST WHILE_T97_tree=null;
		AST LEFT_PARETHESIS98_tree=null;
		AST RIGHT_PARETHESIS100_tree=null;
		AST DO_T102_tree=null;
		AST WHILE_T104_tree=null;
		AST LEFT_PARETHESIS105_tree=null;
		AST RIGHT_PARETHESIS107_tree=null;
		AST SEMI_COLON108_tree=null;
		AST FOR_T109_tree=null;
		AST LEFT_PARETHESIS110_tree=null;
		AST SEMI_COLON111_tree=null;
		AST SEMI_COLON112_tree=null;
		AST RIGHT_PARETHESIS113_tree=null;
		AST SWITCH_T115_tree=null;
		AST LEFT_PARETHESIS116_tree=null;
		AST RIGHT_PARETHESIS118_tree=null;
		AST BREAK_T120_tree=null;
		AST SEMI_COLON122_tree=null;
		AST CONTINUE_T123_tree=null;
		AST SEMI_COLON125_tree=null;
		AST RETURN_T126_tree=null;
		AST SEMI_COLON128_tree=null;
		AST GLOBAL_T129_tree=null;
		AST SEMI_COLON131_tree=null;
		AST STATIC_T132_tree=null;
		AST SEMI_COLON134_tree=null;
		AST ECHO_T135_tree=null;
		AST SEMI_COLON137_tree=null;
		AST SEMI_COLON139_tree=null;
		AST FOREACH_T140_tree=null;
		AST LEFT_PARETHESIS141_tree=null;
		AST AS_T143_tree=null;
		AST ARROW_T145_tree=null;
		AST RIGHT_PARETHESIS147_tree=null;
		AST DECLARE_T149_tree=null;
		AST LEFT_PARETHESIS150_tree=null;
		AST RIGHT_PARETHESIS152_tree=null;
		AST SEMI_COLON154_tree=null;
		AST TRY_T155_tree=null;
		AST THROW_T158_tree=null;
		AST SEMI_COLON160_tree=null;
		AST USE_T161_tree=null;
		AST SEMI_COLON163_tree=null;
		AST USE_T164_tree=null;
		AST LEFT_PARETHESIS165_tree=null;
		AST RIGHT_PARETHESIS167_tree=null;
		AST SEMI_COLON168_tree=null;
		AST INCLUDE_T169_tree=null;
		AST LEFT_PARETHESIS170_tree=null;
		AST RIGHT_PARETHESIS172_tree=null;
		AST SEMI_COLON173_tree=null;
		AST INCLUDE_ONCE_T174_tree=null;
		AST LEFT_PARETHESIS175_tree=null;
		AST RIGHT_PARETHESIS177_tree=null;
		AST SEMI_COLON178_tree=null;
		AST REQUIRE_T179_tree=null;
		AST LEFT_PARETHESIS180_tree=null;
		AST RIGHT_PARETHESIS182_tree=null;
		AST SEMI_COLON183_tree=null;
		AST REQUIRE_ONCE_T184_tree=null;
		AST LEFT_PARETHESIS185_tree=null;
		AST RIGHT_PARETHESIS187_tree=null;
		AST SEMI_COLON188_tree=null;
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
			// PHPAST.g:403:3: ( block | if_stat | WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement -> ^( WHILE_T ^( CONDITION expression ) while_statement ) | DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( DO_T ^( CONDITION expression ) statement ) | FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? ) | SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list ) | BREAK_T ( expression )? SEMI_COLON -> ^( BREAK_T ( expression )? ) | CONTINUE_T ( expression )? SEMI_COLON -> ^( CONTINUE_T ( expression )? ) | RETURN_T ( expression )? SEMI_COLON -> ^( RETURN_T ( expression )? ) | GLOBAL_T variable_list SEMI_COLON -> ^( GLOBAL_T variable_list ) | STATIC_T static_var_list SEMI_COLON -> ^( STATIC_T static_var_list ) | ECHO_T expr_list SEMI_COLON -> ^( ECHO_T expr_list ) | expression SEMI_COLON !| FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement ) | DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement -> ^( DECLARE_T directive ( declare_statement )? ) | SEMI_COLON -> ^( EMPTYSTATEMENT SEMI_COLON ) | TRY_T block ( catch_branch )+ -> ^( TRY_T block ( catch_branch )+ ) | THROW_T expression SEMI_COLON -> ^( THROW_T expression ) | USE_T scalar SEMI_COLON -> ^( USE_T scalar ) | USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON -> ^( USE_PARETHESIS_T scalar ) | INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_T expression ) | INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( INCLUDE_ONCE_T expression ) | REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_T expression ) | REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON -> ^( REQUIRE_ONCE_T expression ) )
			int alt41=24;
			switch ( input.LA(1) ) {
			case LEFT_BRACKET:
				{
				alt41=1;
				}
				break;
			case IF_T:
				{
				alt41=2;
				}
				break;
			case WHILE_T:
				{
				alt41=3;
				}
				break;
			case DO_T:
				{
				alt41=4;
				}
				break;
			case FOR_T:
				{
				alt41=5;
				}
				break;
			case SWITCH_T:
				{
				alt41=6;
				}
				break;
			case BREAK_T:
				{
				alt41=7;
				}
				break;
			case CONTINUE_T:
				{
				alt41=8;
				}
				break;
			case RETURN_T:
				{
				alt41=9;
				}
				break;
			case GLOBAL_T:
				{
				alt41=10;
				}
				break;
			case STATIC_T:
				{
				alt41=11;
				}
				break;
			case ECHO_T:
				{
				alt41=12;
				}
				break;
			case AT_T:
			case BACKTRICKLITERAL:
			case CLONE_T:
			case DOLLAR_T:
			case DOMAIN_T:
			case DOUBLELITERRAL:
			case EXC_NOT_T:
			case FLOATLITERAL:
			case FUNCTION_T:
			case HERE_DOC:
			case IDENTIFIER:
			case INTLITERAL:
			case LEFT_OPEN_RECT:
			case LEFT_PARETHESIS:
			case LIST_T:
			case MINUS_MINUS_T:
			case MINUS_T:
			case NAMESPACE_T:
			case NEW_T:
			case PLUS_PLUS_T:
			case PLUS_T:
			case PRINT_T:
			case REALLITERAL:
			case REF_T:
			case STATIC:
			case STRINGLITERAL:
			case TILDA_T:
			case UNSET_T:
			case 176:
			case 177:
			case 178:
			case 179:
			case 180:
			case 181:
			case 182:
			case 185:
				{
				alt41=13;
				}
				break;
			case FOREACH_T:
				{
				alt41=14;
				}
				break;
			case DECLARE_T:
				{
				alt41=15;
				}
				break;
			case SEMI_COLON:
				{
				alt41=16;
				}
				break;
			case TRY_T:
				{
				alt41=17;
				}
				break;
			case THROW_T:
				{
				alt41=18;
				}
				break;
			case USE_T:
				{
				int LA41_19 = input.LA(2);
				if ( (LA41_19==LEFT_PARETHESIS) ) {
					alt41=20;
				}
				else if ( (LA41_19==DOMAIN_T||LA41_19==DOUBLELITERRAL||LA41_19==FLOATLITERAL||LA41_19==HERE_DOC||LA41_19==IDENTIFIER||LA41_19==INTLITERAL||LA41_19==NAMESPACE_T||LA41_19==REALLITERAL||LA41_19==STRINGLITERAL||(LA41_19 >= 176 && LA41_19 <= 182)) ) {
					alt41=19;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 19, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INCLUDE_T:
				{
				alt41=21;
				}
				break;
			case INCLUDE_ONCE_T:
				{
				alt41=22;
				}
				break;
			case REQUIRE_T:
				{
				alt41=23;
				}
				break;
			case REQUIRE_ONCE_T:
				{
				alt41=24;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// PHPAST.g:403:5: block
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_block_in_topStatement1471);
					block95=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block95.getTree());

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)(block95!=null?(block95.start):null)).getStartIndex();
					    endIndex = ((CommonToken)(block95!=null?(block95.stop):null)).getStopIndex();
					  }
					}
					break;
				case 2 :
					// PHPAST.g:408:5: if_stat
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_if_stat_in_topStatement1481);
					if_stat96=if_stat();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, if_stat96.getTree());

					if ( state.backtracking==0 ) {
					    startIndex = (if_stat96!=null?((AST)if_stat96.getTree()):null).startIndex;
					    endIndex = (if_stat96!=null?((AST)if_stat96.getTree()):null).endIndex;
					  }
					}
					break;
				case 3 :
					// PHPAST.g:413:5: WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS while_statement
					{
					WHILE_T97=(Token)match(input,WHILE_T,FOLLOW_WHILE_T_in_topStatement1491); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHILE_T.add(WHILE_T97);

					LEFT_PARETHESIS98=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1493); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS98);

					pushFollow(FOLLOW_expression_in_topStatement1495);
					expression99=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression99.getTree());
					RIGHT_PARETHESIS100=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1497); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS100);

					pushFollow(FOLLOW_while_statement_in_topStatement1499);
					while_statement101=while_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_while_statement.add(while_statement101.getTree());
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)WHILE_T97).getStartIndex();
					    endIndex = ((CommonToken)(while_statement101!=null?(while_statement101.stop):null)).getStopIndex();
					  }
					// AST REWRITE
					// elements: while_statement, expression, WHILE_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 418:5: -> ^( WHILE_T ^( CONDITION expression ) while_statement )
					{
						// PHPAST.g:418:9: ^( WHILE_T ^( CONDITION expression ) while_statement )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_WHILE_T.nextNode(), root_1);
						// PHPAST.g:418:19: ^( CONDITION expression )
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITION, "CONDITION"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_while_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// PHPAST.g:419:5: DO_T statement WHILE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
					{
					DO_T102=(Token)match(input,DO_T,FOLLOW_DO_T_in_topStatement1532); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DO_T.add(DO_T102);

					pushFollow(FOLLOW_statement_in_topStatement1534);
					statement103=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement103.getTree());
					WHILE_T104=(Token)match(input,WHILE_T,FOLLOW_WHILE_T_in_topStatement1536); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_WHILE_T.add(WHILE_T104);

					LEFT_PARETHESIS105=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1538); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS105);

					pushFollow(FOLLOW_expression_in_topStatement1540);
					expression106=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression106.getTree());
					RIGHT_PARETHESIS107=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1542); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS107);

					SEMI_COLON108=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1544); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON108);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)DO_T102).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON108).getStartIndex();
					  }
					// AST REWRITE
					// elements: expression, statement, DO_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 424:5: -> ^( DO_T ^( CONDITION expression ) statement )
					{
						// PHPAST.g:424:9: ^( DO_T ^( CONDITION expression ) statement )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_DO_T.nextNode(), root_1);
						// PHPAST.g:424:16: ^( CONDITION expression )
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITION, "CONDITION"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// PHPAST.g:425:5: FOR_T LEFT_PARETHESIS (e1= expr_list )? SEMI_COLON (e2= expr_list )? SEMI_COLON (e3= expr_list )? RIGHT_PARETHESIS for_statement
					{
					FOR_T109=(Token)match(input,FOR_T,FOLLOW_FOR_T_in_topStatement1574); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOR_T.add(FOR_T109);

					LEFT_PARETHESIS110=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1576); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS110);

					// PHPAST.g:425:29: (e1= expr_list )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( ((LA33_0 >= AT_T && LA33_0 <= BACKTRICKLITERAL)||LA33_0==CLONE_T||(LA33_0 >= DOLLAR_T && LA33_0 <= DOMAIN_T)||LA33_0==DOUBLELITERRAL||LA33_0==EXC_NOT_T||LA33_0==FLOATLITERAL||LA33_0==FUNCTION_T||LA33_0==HERE_DOC||LA33_0==IDENTIFIER||LA33_0==INTLITERAL||(LA33_0 >= LEFT_OPEN_RECT && LA33_0 <= LEFT_PARETHESIS)||LA33_0==LIST_T||(LA33_0 >= MINUS_MINUS_T && LA33_0 <= MINUS_T)||(LA33_0 >= NAMESPACE_T && LA33_0 <= NEW_T)||(LA33_0 >= PLUS_PLUS_T && LA33_0 <= PLUS_T)||LA33_0==PRINT_T||(LA33_0 >= REALLITERAL && LA33_0 <= REF_T)||LA33_0==STATIC||LA33_0==STRINGLITERAL||LA33_0==TILDA_T||LA33_0==UNSET_T||(LA33_0 >= 176 && LA33_0 <= 182)||LA33_0==185) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// PHPAST.g:425:29: e1= expr_list
							{
							pushFollow(FOLLOW_expr_list_in_topStatement1580);
							e1=expr_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expr_list.add(e1.getTree());
							}
							break;

					}

					SEMI_COLON111=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1583); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON111);

					// PHPAST.g:425:54: (e2= expr_list )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( ((LA34_0 >= AT_T && LA34_0 <= BACKTRICKLITERAL)||LA34_0==CLONE_T||(LA34_0 >= DOLLAR_T && LA34_0 <= DOMAIN_T)||LA34_0==DOUBLELITERRAL||LA34_0==EXC_NOT_T||LA34_0==FLOATLITERAL||LA34_0==FUNCTION_T||LA34_0==HERE_DOC||LA34_0==IDENTIFIER||LA34_0==INTLITERAL||(LA34_0 >= LEFT_OPEN_RECT && LA34_0 <= LEFT_PARETHESIS)||LA34_0==LIST_T||(LA34_0 >= MINUS_MINUS_T && LA34_0 <= MINUS_T)||(LA34_0 >= NAMESPACE_T && LA34_0 <= NEW_T)||(LA34_0 >= PLUS_PLUS_T && LA34_0 <= PLUS_T)||LA34_0==PRINT_T||(LA34_0 >= REALLITERAL && LA34_0 <= REF_T)||LA34_0==STATIC||LA34_0==STRINGLITERAL||LA34_0==TILDA_T||LA34_0==UNSET_T||(LA34_0 >= 176 && LA34_0 <= 182)||LA34_0==185) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// PHPAST.g:425:54: e2= expr_list
							{
							pushFollow(FOLLOW_expr_list_in_topStatement1587);
							e2=expr_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expr_list.add(e2.getTree());
							}
							break;

					}

					SEMI_COLON112=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1590); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON112);

					// PHPAST.g:425:79: (e3= expr_list )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( ((LA35_0 >= AT_T && LA35_0 <= BACKTRICKLITERAL)||LA35_0==CLONE_T||(LA35_0 >= DOLLAR_T && LA35_0 <= DOMAIN_T)||LA35_0==DOUBLELITERRAL||LA35_0==EXC_NOT_T||LA35_0==FLOATLITERAL||LA35_0==FUNCTION_T||LA35_0==HERE_DOC||LA35_0==IDENTIFIER||LA35_0==INTLITERAL||(LA35_0 >= LEFT_OPEN_RECT && LA35_0 <= LEFT_PARETHESIS)||LA35_0==LIST_T||(LA35_0 >= MINUS_MINUS_T && LA35_0 <= MINUS_T)||(LA35_0 >= NAMESPACE_T && LA35_0 <= NEW_T)||(LA35_0 >= PLUS_PLUS_T && LA35_0 <= PLUS_T)||LA35_0==PRINT_T||(LA35_0 >= REALLITERAL && LA35_0 <= REF_T)||LA35_0==STATIC||LA35_0==STRINGLITERAL||LA35_0==TILDA_T||LA35_0==UNSET_T||(LA35_0 >= 176 && LA35_0 <= 182)||LA35_0==185) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// PHPAST.g:425:79: e3= expr_list
							{
							pushFollow(FOLLOW_expr_list_in_topStatement1594);
							e3=expr_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expr_list.add(e3.getTree());
							}
							break;

					}

					RIGHT_PARETHESIS113=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1597); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS113);

					pushFollow(FOLLOW_for_statement_in_topStatement1599);
					for_statement114=for_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_for_statement.add(for_statement114.getTree());
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)FOR_T109).getStartIndex();
					    endIndex = ((CommonToken)RIGHT_PARETHESIS113).getStopIndex();
					    if ((for_statement114!=null?input.toString(for_statement114.start,for_statement114.stop):null) != null) {
					      endIndex = ((CommonToken)(for_statement114!=null?(for_statement114.stop):null)).getStopIndex();
					    }
					  }
					// AST REWRITE
					// elements: e1, e2, e3, for_statement, FOR_T
					// token labels: 
					// rule labels: e3, retval, e1, e2
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_e3=new RewriteRuleSubtreeStream(adaptor,"rule e3",e3!=null?e3.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
					RewriteRuleSubtreeStream stream_e2=new RewriteRuleSubtreeStream(adaptor,"rule e2",e2!=null?e2.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 433:5: -> ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? )
					{
						// PHPAST.g:433:9: ^( FOR_T ( $e1)? ^( CONDITION ( $e2)? ) ^( ITERATE ( $e3)? ) ( for_statement )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_FOR_T.nextNode(), root_1);
						// PHPAST.g:433:18: ( $e1)?
						if ( stream_e1.hasNext() ) {
							adaptor.addChild(root_1, stream_e1.nextTree());
						}
						stream_e1.reset();

						// PHPAST.g:433:22: ^( CONDITION ( $e2)? )
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITION, "CONDITION"), root_2);
						// PHPAST.g:433:35: ( $e2)?
						if ( stream_e2.hasNext() ) {
							adaptor.addChild(root_2, stream_e2.nextTree());
						}
						stream_e2.reset();

						adaptor.addChild(root_1, root_2);
						}

						// PHPAST.g:433:40: ^( ITERATE ( $e3)? )
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(ITERATE, "ITERATE"), root_2);
						// PHPAST.g:433:51: ( $e3)?
						if ( stream_e3.hasNext() ) {
							adaptor.addChild(root_2, stream_e3.nextTree());
						}
						stream_e3.reset();

						adaptor.addChild(root_1, root_2);
						}

						// PHPAST.g:433:56: ( for_statement )?
						if ( stream_for_statement.hasNext() ) {
							adaptor.addChild(root_1, stream_for_statement.nextTree());
						}
						stream_for_statement.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// PHPAST.g:434:5: SWITCH_T LEFT_PARETHESIS expression RIGHT_PARETHESIS switch_case_list
					{
					SWITCH_T115=(Token)match(input,SWITCH_T,FOLLOW_SWITCH_T_in_topStatement1643); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SWITCH_T.add(SWITCH_T115);

					LEFT_PARETHESIS116=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1645); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS116);

					pushFollow(FOLLOW_expression_in_topStatement1647);
					expression117=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression117.getTree());
					RIGHT_PARETHESIS118=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1649); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS118);

					pushFollow(FOLLOW_switch_case_list_in_topStatement1651);
					switch_case_list119=switch_case_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_switch_case_list.add(switch_case_list119.getTree());
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)SWITCH_T115).getStartIndex();
					    endIndex = ((CommonToken)(switch_case_list119!=null?(switch_case_list119.stop):null)).getStopIndex();
					  }
					// AST REWRITE
					// elements: SWITCH_T, expression, switch_case_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 439:5: -> ^( SWITCH_T ^( CONDITION expression ) switch_case_list )
					{
						// PHPAST.g:439:9: ^( SWITCH_T ^( CONDITION expression ) switch_case_list )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_SWITCH_T.nextNode(), root_1);
						// PHPAST.g:439:20: ^( CONDITION expression )
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITION, "CONDITION"), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_switch_case_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// PHPAST.g:440:5: BREAK_T ( expression )? SEMI_COLON
					{
					BREAK_T120=(Token)match(input,BREAK_T,FOLLOW_BREAK_T_in_topStatement1680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BREAK_T.add(BREAK_T120);

					// PHPAST.g:440:13: ( expression )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( ((LA36_0 >= AT_T && LA36_0 <= BACKTRICKLITERAL)||LA36_0==CLONE_T||(LA36_0 >= DOLLAR_T && LA36_0 <= DOMAIN_T)||LA36_0==DOUBLELITERRAL||LA36_0==EXC_NOT_T||LA36_0==FLOATLITERAL||LA36_0==FUNCTION_T||LA36_0==HERE_DOC||LA36_0==IDENTIFIER||LA36_0==INTLITERAL||(LA36_0 >= LEFT_OPEN_RECT && LA36_0 <= LEFT_PARETHESIS)||LA36_0==LIST_T||(LA36_0 >= MINUS_MINUS_T && LA36_0 <= MINUS_T)||(LA36_0 >= NAMESPACE_T && LA36_0 <= NEW_T)||(LA36_0 >= PLUS_PLUS_T && LA36_0 <= PLUS_T)||LA36_0==PRINT_T||(LA36_0 >= REALLITERAL && LA36_0 <= REF_T)||LA36_0==STATIC||LA36_0==STRINGLITERAL||LA36_0==TILDA_T||LA36_0==UNSET_T||(LA36_0 >= 176 && LA36_0 <= 182)||LA36_0==185) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// PHPAST.g:440:13: expression
							{
							pushFollow(FOLLOW_expression_in_topStatement1682);
							expression121=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression121.getTree());
							}
							break;

					}

					SEMI_COLON122=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1685); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON122);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)BREAK_T120).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON122).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 445:5: -> ^( BREAK_T ( expression )? )
					{
						// PHPAST.g:445:9: ^( BREAK_T ( expression )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_BREAK_T.nextNode(), root_1);
						// PHPAST.g:445:19: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// PHPAST.g:446:5: CONTINUE_T ( expression )? SEMI_COLON
					{
					CONTINUE_T123=(Token)match(input,CONTINUE_T,FOLLOW_CONTINUE_T_in_topStatement1709); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CONTINUE_T.add(CONTINUE_T123);

					// PHPAST.g:446:16: ( expression )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( ((LA37_0 >= AT_T && LA37_0 <= BACKTRICKLITERAL)||LA37_0==CLONE_T||(LA37_0 >= DOLLAR_T && LA37_0 <= DOMAIN_T)||LA37_0==DOUBLELITERRAL||LA37_0==EXC_NOT_T||LA37_0==FLOATLITERAL||LA37_0==FUNCTION_T||LA37_0==HERE_DOC||LA37_0==IDENTIFIER||LA37_0==INTLITERAL||(LA37_0 >= LEFT_OPEN_RECT && LA37_0 <= LEFT_PARETHESIS)||LA37_0==LIST_T||(LA37_0 >= MINUS_MINUS_T && LA37_0 <= MINUS_T)||(LA37_0 >= NAMESPACE_T && LA37_0 <= NEW_T)||(LA37_0 >= PLUS_PLUS_T && LA37_0 <= PLUS_T)||LA37_0==PRINT_T||(LA37_0 >= REALLITERAL && LA37_0 <= REF_T)||LA37_0==STATIC||LA37_0==STRINGLITERAL||LA37_0==TILDA_T||LA37_0==UNSET_T||(LA37_0 >= 176 && LA37_0 <= 182)||LA37_0==185) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// PHPAST.g:446:16: expression
							{
							pushFollow(FOLLOW_expression_in_topStatement1711);
							expression124=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression124.getTree());
							}
							break;

					}

					SEMI_COLON125=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1714); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON125);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)CONTINUE_T123).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON125).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 451:5: -> ^( CONTINUE_T ( expression )? )
					{
						// PHPAST.g:451:9: ^( CONTINUE_T ( expression )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_CONTINUE_T.nextNode(), root_1);
						// PHPAST.g:451:22: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 9 :
					// PHPAST.g:452:5: RETURN_T ( expression )? SEMI_COLON
					{
					RETURN_T126=(Token)match(input,RETURN_T,FOLLOW_RETURN_T_in_topStatement1750); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RETURN_T.add(RETURN_T126);

					// PHPAST.g:452:14: ( expression )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( ((LA38_0 >= AT_T && LA38_0 <= BACKTRICKLITERAL)||LA38_0==CLONE_T||(LA38_0 >= DOLLAR_T && LA38_0 <= DOMAIN_T)||LA38_0==DOUBLELITERRAL||LA38_0==EXC_NOT_T||LA38_0==FLOATLITERAL||LA38_0==FUNCTION_T||LA38_0==HERE_DOC||LA38_0==IDENTIFIER||LA38_0==INTLITERAL||(LA38_0 >= LEFT_OPEN_RECT && LA38_0 <= LEFT_PARETHESIS)||LA38_0==LIST_T||(LA38_0 >= MINUS_MINUS_T && LA38_0 <= MINUS_T)||(LA38_0 >= NAMESPACE_T && LA38_0 <= NEW_T)||(LA38_0 >= PLUS_PLUS_T && LA38_0 <= PLUS_T)||LA38_0==PRINT_T||(LA38_0 >= REALLITERAL && LA38_0 <= REF_T)||LA38_0==STATIC||LA38_0==STRINGLITERAL||LA38_0==TILDA_T||LA38_0==UNSET_T||(LA38_0 >= 176 && LA38_0 <= 182)||LA38_0==185) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// PHPAST.g:452:14: expression
							{
							pushFollow(FOLLOW_expression_in_topStatement1752);
							expression127=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression127.getTree());
							}
							break;

					}

					SEMI_COLON128=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1755); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON128);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)RETURN_T126).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON128).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 457:5: -> ^( RETURN_T ( expression )? )
					{
						// PHPAST.g:457:9: ^( RETURN_T ( expression )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_RETURN_T.nextNode(), root_1);
						// PHPAST.g:457:20: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 10 :
					// PHPAST.g:458:5: GLOBAL_T variable_list SEMI_COLON
					{
					GLOBAL_T129=(Token)match(input,GLOBAL_T,FOLLOW_GLOBAL_T_in_topStatement1794); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_GLOBAL_T.add(GLOBAL_T129);

					pushFollow(FOLLOW_variable_list_in_topStatement1796);
					variable_list130=variable_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variable_list.add(variable_list130.getTree());
					SEMI_COLON131=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1798); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON131);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)GLOBAL_T129).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON131).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 463:5: -> ^( GLOBAL_T variable_list )
					{
						// PHPAST.g:463:9: ^( GLOBAL_T variable_list )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_GLOBAL_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_variable_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 11 :
					// PHPAST.g:464:5: STATIC_T static_var_list SEMI_COLON
					{
					STATIC_T132=(Token)match(input,STATIC_T,FOLLOW_STATIC_T_in_topStatement1836); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STATIC_T.add(STATIC_T132);

					pushFollow(FOLLOW_static_var_list_in_topStatement1838);
					static_var_list133=static_var_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_static_var_list.add(static_var_list133.getTree());
					SEMI_COLON134=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1840); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON134);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)STATIC_T132).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON134).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 469:5: -> ^( STATIC_T static_var_list )
					{
						// PHPAST.g:469:9: ^( STATIC_T static_var_list )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_STATIC_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_static_var_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 12 :
					// PHPAST.g:470:5: ECHO_T expr_list SEMI_COLON
					{
					ECHO_T135=(Token)match(input,ECHO_T,FOLLOW_ECHO_T_in_topStatement1875); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ECHO_T.add(ECHO_T135);

					pushFollow(FOLLOW_expr_list_in_topStatement1877);
					expr_list136=expr_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_list.add(expr_list136.getTree());
					SEMI_COLON137=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1879); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON137);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)ECHO_T135).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON137).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 475:5: -> ^( ECHO_T expr_list )
					{
						// PHPAST.g:475:9: ^( ECHO_T expr_list )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_ECHO_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expr_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 13 :
					// PHPAST.g:476:5: expression SEMI_COLON !
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_expression_in_topStatement1902);
					expression138=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression138.getTree());

					SEMI_COLON139=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement1904); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)(expression138!=null?(expression138.start):null)).getStartIndex();
					    endIndex = ((CommonToken)(expression138!=null?(expression138.stop):null)).getStopIndex();
					    if (((CommonToken)SEMI_COLON139).getStopIndex() != 0) {
					      endIndex = ((CommonToken)SEMI_COLON139).getStopIndex();
					    }    
					  }
					}
					break;
				case 14 :
					// PHPAST.g:484:5: FOREACH_T LEFT_PARETHESIS expression AS_T foreach_variable ( ARROW_T foreach_variable )? RIGHT_PARETHESIS foreach_statement
					{
					FOREACH_T140=(Token)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_topStatement1915); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_FOREACH_T.add(FOREACH_T140);

					LEFT_PARETHESIS141=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1917); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS141);

					pushFollow(FOLLOW_expression_in_topStatement1919);
					expression142=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression142.getTree());
					AS_T143=(Token)match(input,AS_T,FOLLOW_AS_T_in_topStatement1921); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AS_T.add(AS_T143);

					pushFollow(FOLLOW_foreach_variable_in_topStatement1923);
					foreach_variable144=foreach_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_foreach_variable.add(foreach_variable144.getTree());
					// PHPAST.g:484:64: ( ARROW_T foreach_variable )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==ARROW_T) ) {
						alt39=1;
					}
					switch (alt39) {
						case 1 :
							// PHPAST.g:484:65: ARROW_T foreach_variable
							{
							ARROW_T145=(Token)match(input,ARROW_T,FOLLOW_ARROW_T_in_topStatement1926); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ARROW_T.add(ARROW_T145);

							pushFollow(FOLLOW_foreach_variable_in_topStatement1928);
							foreach_variable146=foreach_variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_foreach_variable.add(foreach_variable146.getTree());
							}
							break;

					}

					RIGHT_PARETHESIS147=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1932); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS147);

					pushFollow(FOLLOW_foreach_statement_in_topStatement1942);
					foreach_statement148=foreach_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_foreach_statement.add(foreach_statement148.getTree());
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)FOREACH_T140).getStartIndex();
					    endIndex = ((CommonToken)(foreach_statement148!=null?(foreach_statement148.stop):null)).getStopIndex();
					  }
					// AST REWRITE
					// elements: foreach_variable, foreach_statement, AS_T, foreach_variable, expression, FOREACH_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 490:6: -> ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement )
					{
						// PHPAST.g:490:9: ^( FOREACH_T ^( AS_T expression foreach_variable ( foreach_variable )? ) foreach_statement )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_FOREACH_T.nextNode(), root_1);
						// PHPAST.g:490:21: ^( AS_T expression foreach_variable ( foreach_variable )? )
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot(stream_AS_T.nextNode(), root_2);
						adaptor.addChild(root_2, stream_expression.nextTree());
						adaptor.addChild(root_2, stream_foreach_variable.nextTree());
						// PHPAST.g:490:56: ( foreach_variable )?
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


					retval.tree = root_0;
					}

					}
					break;
				case 15 :
					// PHPAST.g:491:5: DECLARE_T LEFT_PARETHESIS directive RIGHT_PARETHESIS declare_statement
					{
					DECLARE_T149=(Token)match(input,DECLARE_T,FOLLOW_DECLARE_T_in_topStatement1977); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DECLARE_T.add(DECLARE_T149);

					LEFT_PARETHESIS150=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement1979); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS150);

					pushFollow(FOLLOW_directive_in_topStatement1981);
					directive151=directive();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_directive.add(directive151.getTree());
					RIGHT_PARETHESIS152=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement1983); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS152);

					pushFollow(FOLLOW_declare_statement_in_topStatement1985);
					declare_statement153=declare_statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declare_statement.add(declare_statement153.getTree());
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)DECLARE_T149).getStartIndex();
					    endIndex = ((CommonToken)(declare_statement153!=null?(declare_statement153.stop):null)).getStopIndex();
					  }
					// AST REWRITE
					// elements: declare_statement, DECLARE_T, directive
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 496:5: -> ^( DECLARE_T directive ( declare_statement )? )
					{
						// PHPAST.g:496:9: ^( DECLARE_T directive ( declare_statement )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_DECLARE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_directive.nextTree());
						// PHPAST.g:496:31: ( declare_statement )?
						if ( stream_declare_statement.hasNext() ) {
							adaptor.addChild(root_1, stream_declare_statement.nextTree());
						}
						stream_declare_statement.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 16 :
					// PHPAST.g:497:5: SEMI_COLON
					{
					SEMI_COLON154=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement2011); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON154);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)SEMI_COLON154).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON154).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 502:5: -> ^( EMPTYSTATEMENT SEMI_COLON )
					{
						// PHPAST.g:502:9: ^( EMPTYSTATEMENT SEMI_COLON )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(EMPTYSTATEMENT, "EMPTYSTATEMENT"), root_1);
						adaptor.addChild(root_1, stream_SEMI_COLON.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 17 :
					// PHPAST.g:503:5: TRY_T block ( catch_branch )+
					{
					TRY_T155=(Token)match(input,TRY_T,FOLLOW_TRY_T_in_topStatement2034); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_TRY_T.add(TRY_T155);

					pushFollow(FOLLOW_block_in_topStatement2036);
					block156=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_block.add(block156.getTree());
					// PHPAST.g:503:17: ( catch_branch )+
					int cnt40=0;
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( (LA40_0==CATCH_T) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// PHPAST.g:503:17: catch_branch
							{
							pushFollow(FOLLOW_catch_branch_in_topStatement2038);
							catch_branch157=catch_branch();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_catch_branch.add(catch_branch157.getTree());
							}
							break;

						default :
							if ( cnt40 >= 1 ) break loop40;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(40, input);
							throw eee;
						}
						cnt40++;
					}

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)TRY_T155).getStartIndex();
					    endIndex = ((CommonToken)(catch_branch157!=null?(catch_branch157.stop):null)).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 508:5: -> ^( TRY_T block ( catch_branch )+ )
					{
						// PHPAST.g:508:9: ^( TRY_T block ( catch_branch )+ )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_TRY_T.nextNode(), root_1);
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


					retval.tree = root_0;
					}

					}
					break;
				case 18 :
					// PHPAST.g:509:5: THROW_T expression SEMI_COLON
					{
					THROW_T158=(Token)match(input,THROW_T,FOLLOW_THROW_T_in_topStatement2065); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_THROW_T.add(THROW_T158);

					pushFollow(FOLLOW_expression_in_topStatement2067);
					expression159=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression159.getTree());
					SEMI_COLON160=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement2069); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON160);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)THROW_T158).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON160).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 514:5: -> ^( THROW_T expression )
					{
						// PHPAST.g:514:9: ^( THROW_T expression )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_THROW_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 19 :
					// PHPAST.g:515:5: USE_T scalar SEMI_COLON
					{
					USE_T161=(Token)match(input,USE_T,FOLLOW_USE_T_in_topStatement2106); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USE_T.add(USE_T161);

					pushFollow(FOLLOW_scalar_in_topStatement2108);
					scalar162=scalar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_scalar.add(scalar162.getTree());
					SEMI_COLON163=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement2110); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON163);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)USE_T161).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON163).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 520:5: -> ^( USE_T scalar )
					{
						// PHPAST.g:520:9: ^( USE_T scalar )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_USE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_scalar.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 20 :
					// PHPAST.g:521:5: USE_T LEFT_PARETHESIS scalar RIGHT_PARETHESIS SEMI_COLON
					{
					USE_T164=(Token)match(input,USE_T,FOLLOW_USE_T_in_topStatement2147); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USE_T.add(USE_T164);

					LEFT_PARETHESIS165=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement2149); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS165);

					pushFollow(FOLLOW_scalar_in_topStatement2151);
					scalar166=scalar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_scalar.add(scalar166.getTree());
					RIGHT_PARETHESIS167=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement2153); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS167);

					SEMI_COLON168=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement2155); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON168);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)USE_T164).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON168).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 526:5: -> ^( USE_PARETHESIS_T scalar )
					{
						// PHPAST.g:526:9: ^( USE_PARETHESIS_T scalar )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(USE_PARETHESIS_T, "USE_PARETHESIS_T"), root_1);
						adaptor.addChild(root_1, stream_scalar.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 21 :
					// PHPAST.g:527:5: INCLUDE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
					{
					INCLUDE_T169=(Token)match(input,INCLUDE_T,FOLLOW_INCLUDE_T_in_topStatement2178); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INCLUDE_T.add(INCLUDE_T169);

					LEFT_PARETHESIS170=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement2180); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS170);

					pushFollow(FOLLOW_expression_in_topStatement2182);
					expression171=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression171.getTree());
					RIGHT_PARETHESIS172=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement2184); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS172);

					SEMI_COLON173=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement2186); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON173);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)INCLUDE_T169).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON173).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 532:5: -> ^( INCLUDE_T expression )
					{
						// PHPAST.g:532:9: ^( INCLUDE_T expression )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_INCLUDE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 22 :
					// PHPAST.g:533:5: INCLUDE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
					{
					INCLUDE_ONCE_T174=(Token)match(input,INCLUDE_ONCE_T,FOLLOW_INCLUDE_ONCE_T_in_topStatement2209); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INCLUDE_ONCE_T.add(INCLUDE_ONCE_T174);

					LEFT_PARETHESIS175=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement2211); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS175);

					pushFollow(FOLLOW_expression_in_topStatement2213);
					expression176=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression176.getTree());
					RIGHT_PARETHESIS177=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement2215); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS177);

					SEMI_COLON178=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement2217); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON178);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)INCLUDE_ONCE_T174).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON178).getStartIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 538:5: -> ^( INCLUDE_ONCE_T expression )
					{
						// PHPAST.g:538:9: ^( INCLUDE_ONCE_T expression )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_INCLUDE_ONCE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 23 :
					// PHPAST.g:539:5: REQUIRE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
					{
					REQUIRE_T179=(Token)match(input,REQUIRE_T,FOLLOW_REQUIRE_T_in_topStatement2240); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REQUIRE_T.add(REQUIRE_T179);

					LEFT_PARETHESIS180=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement2242); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS180);

					pushFollow(FOLLOW_expression_in_topStatement2244);
					expression181=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression181.getTree());
					RIGHT_PARETHESIS182=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement2246); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS182);

					SEMI_COLON183=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement2248); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON183);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)REQUIRE_T179).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON183).getStartIndex();
					  }
					// AST REWRITE
					// elements: REQUIRE_T, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 544:5: -> ^( REQUIRE_T expression )
					{
						// PHPAST.g:544:9: ^( REQUIRE_T expression )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_REQUIRE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 24 :
					// PHPAST.g:545:5: REQUIRE_ONCE_T LEFT_PARETHESIS expression RIGHT_PARETHESIS SEMI_COLON
					{
					REQUIRE_ONCE_T184=(Token)match(input,REQUIRE_ONCE_T,FOLLOW_REQUIRE_ONCE_T_in_topStatement2271); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REQUIRE_ONCE_T.add(REQUIRE_ONCE_T184);

					LEFT_PARETHESIS185=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_topStatement2273); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS185);

					pushFollow(FOLLOW_expression_in_topStatement2275);
					expression186=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression186.getTree());
					RIGHT_PARETHESIS187=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_topStatement2277); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS187);

					SEMI_COLON188=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement2279); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON188);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)REQUIRE_ONCE_T184).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON188).getStartIndex();
					  }
					// AST REWRITE
					// elements: expression, REQUIRE_ONCE_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 550:5: -> ^( REQUIRE_ONCE_T expression )
					{
						// PHPAST.g:550:9: ^( REQUIRE_ONCE_T expression )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_REQUIRE_ONCE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  if (ast != null) {
			    ast.setIndex(startIndex, endIndex);
			  }
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "topStatement"


	public static class foreach_variable_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "foreach_variable"
	// PHPAST.g:557:1: foreach_variable : ( REF_T )? variable ;
	public final PHPASTParser.foreach_variable_return foreach_variable() throws RecognitionException {
		PHPASTParser.foreach_variable_return retval = new PHPASTParser.foreach_variable_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token REF_T189=null;
		ParserRuleReturnScope variable190 =null;

		AST REF_T189_tree=null;

		try {
			// PHPAST.g:560:3: ( ( REF_T )? variable )
			// PHPAST.g:560:5: ( REF_T )? variable
			{
			root_0 = (AST)adaptor.nil();


			// PHPAST.g:560:5: ( REF_T )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==REF_T) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// PHPAST.g:560:5: REF_T
					{
					REF_T189=(Token)match(input,REF_T,FOLLOW_REF_T_in_foreach_variable2319); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					REF_T189_tree = (AST)adaptor.create(REF_T189);
					adaptor.addChild(root_0, REF_T189_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_variable_in_foreach_variable2322);
			variable190=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, variable190.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foreach_variable"


	public static class use_filename_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "use_filename"
	// PHPAST.g:563:1: use_filename : ( STRINGLITERAL | LEFT_PARETHESIS ! STRINGLITERAL RIGHT_PARETHESIS !);
	public final PHPASTParser.use_filename_return use_filename() throws RecognitionException {
		PHPASTParser.use_filename_return retval = new PHPASTParser.use_filename_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token STRINGLITERAL191=null;
		Token LEFT_PARETHESIS192=null;
		Token STRINGLITERAL193=null;
		Token RIGHT_PARETHESIS194=null;

		AST STRINGLITERAL191_tree=null;
		AST LEFT_PARETHESIS192_tree=null;
		AST STRINGLITERAL193_tree=null;
		AST RIGHT_PARETHESIS194_tree=null;

		try {
			// PHPAST.g:564:3: ( STRINGLITERAL | LEFT_PARETHESIS ! STRINGLITERAL RIGHT_PARETHESIS !)
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==STRINGLITERAL) ) {
				alt43=1;
			}
			else if ( (LA43_0==LEFT_PARETHESIS) ) {
				alt43=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// PHPAST.g:564:5: STRINGLITERAL
					{
					root_0 = (AST)adaptor.nil();


					STRINGLITERAL191=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_use_filename2337); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRINGLITERAL191_tree = (AST)adaptor.create(STRINGLITERAL191);
					adaptor.addChild(root_0, STRINGLITERAL191_tree);
					}

					}
					break;
				case 2 :
					// PHPAST.g:565:5: LEFT_PARETHESIS ! STRINGLITERAL RIGHT_PARETHESIS !
					{
					root_0 = (AST)adaptor.nil();


					LEFT_PARETHESIS192=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_use_filename2343); if (state.failed) return retval;
					STRINGLITERAL193=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_use_filename2346); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRINGLITERAL193_tree = (AST)adaptor.create(STRINGLITERAL193);
					adaptor.addChild(root_0, STRINGLITERAL193_tree);
					}

					RIGHT_PARETHESIS194=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_use_filename2348); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "use_filename"


	public static class fully_qualified_class_name_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "fully_qualified_class_name_list"
	// PHPAST.g:582:1: fully_qualified_class_name_list : fully_qualified_class_name ( ',' fully_qualified_class_name )* -> ( fully_qualified_class_name )+ ;
	public final PHPASTParser.fully_qualified_class_name_list_return fully_qualified_class_name_list() throws RecognitionException {
		PHPASTParser.fully_qualified_class_name_list_return retval = new PHPASTParser.fully_qualified_class_name_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token char_literal196=null;
		ParserRuleReturnScope fully_qualified_class_name195 =null;
		ParserRuleReturnScope fully_qualified_class_name197 =null;

		AST char_literal196_tree=null;
		RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
		RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");

		try {
			// PHPAST.g:583:3: ( fully_qualified_class_name ( ',' fully_qualified_class_name )* -> ( fully_qualified_class_name )+ )
			// PHPAST.g:583:5: fully_qualified_class_name ( ',' fully_qualified_class_name )*
			{
			pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list2380);
			fully_qualified_class_name195=fully_qualified_class_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name195.getTree());
			// PHPAST.g:583:32: ( ',' fully_qualified_class_name )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==COMMA_T) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// PHPAST.g:583:33: ',' fully_qualified_class_name
					{
					char_literal196=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_fully_qualified_class_name_list2383); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA_T.add(char_literal196);

					pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list2385);
					fully_qualified_class_name197=fully_qualified_class_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name197.getTree());
					}
					break;

				default :
					break loop44;
				}
			}

			// AST REWRITE
			// elements: fully_qualified_class_name
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 583:69: -> ( fully_qualified_class_name )+
			{
				if ( !(stream_fully_qualified_class_name.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_fully_qualified_class_name.hasNext() ) {
					adaptor.addChild(root_0, stream_fully_qualified_class_name.nextTree());
				}
				stream_fully_qualified_class_name.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fully_qualified_class_name_list"


	public static class fully_qualified_class_name_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "fully_qualified_class_name"
	// PHPAST.g:586:1: fully_qualified_class_name : ( ( NAMESPACE_T )? DOMAIN_T )? id1= IDENTIFIER ( DOMAIN_T ^id2= IDENTIFIER )* (d2= DOMAIN_T )? ;
	public final PHPASTParser.fully_qualified_class_name_return fully_qualified_class_name() throws RecognitionException {
		PHPASTParser.fully_qualified_class_name_return retval = new PHPASTParser.fully_qualified_class_name_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token id1=null;
		Token id2=null;
		Token d2=null;
		Token NAMESPACE_T198=null;
		Token DOMAIN_T199=null;
		Token DOMAIN_T200=null;

		AST id1_tree=null;
		AST id2_tree=null;
		AST d2_tree=null;
		AST NAMESPACE_T198_tree=null;
		AST DOMAIN_T199_tree=null;
		AST DOMAIN_T200_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:596:3: ( ( ( NAMESPACE_T )? DOMAIN_T )? id1= IDENTIFIER ( DOMAIN_T ^id2= IDENTIFIER )* (d2= DOMAIN_T )? )
			// PHPAST.g:596:5: ( ( NAMESPACE_T )? DOMAIN_T )? id1= IDENTIFIER ( DOMAIN_T ^id2= IDENTIFIER )* (d2= DOMAIN_T )?
			{
			root_0 = (AST)adaptor.nil();


			// PHPAST.g:596:5: ( ( NAMESPACE_T )? DOMAIN_T )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==DOMAIN_T||LA46_0==NAMESPACE_T) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// PHPAST.g:596:6: ( NAMESPACE_T )? DOMAIN_T
					{
					// PHPAST.g:596:6: ( NAMESPACE_T )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==NAMESPACE_T) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// PHPAST.g:596:6: NAMESPACE_T
							{
							NAMESPACE_T198=(Token)match(input,NAMESPACE_T,FOLLOW_NAMESPACE_T_in_fully_qualified_class_name2420); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NAMESPACE_T198_tree = (AST)adaptor.create(NAMESPACE_T198);
							adaptor.addChild(root_0, NAMESPACE_T198_tree);
							}

							}
							break;

					}

					DOMAIN_T199=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name2423); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOMAIN_T199_tree = (AST)adaptor.create(DOMAIN_T199);
					adaptor.addChild(root_0, DOMAIN_T199_tree);
					}

					}
					break;

			}

			id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name2429); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			id1_tree = (AST)adaptor.create(id1);
			adaptor.addChild(root_0, id1_tree);
			}

			// PHPAST.g:596:45: ( DOMAIN_T ^id2= IDENTIFIER )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==DOMAIN_T) ) {
					int LA47_1 = input.LA(2);
					if ( (LA47_1==IDENTIFIER) ) {
						int LA47_3 = input.LA(3);
						if ( (synpred79_PHPAST()) ) {
							alt47=1;
						}

					}

				}

				switch (alt47) {
				case 1 :
					// PHPAST.g:596:46: DOMAIN_T ^id2= IDENTIFIER
					{
					DOMAIN_T200=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name2432); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOMAIN_T200_tree = (AST)adaptor.create(DOMAIN_T200);
					root_0 = (AST)adaptor.becomeRoot(DOMAIN_T200_tree, root_0);
					}

					id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name2437); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					id2_tree = (AST)adaptor.create(id2);
					adaptor.addChild(root_0, id2_tree);
					}

					}
					break;

				default :
					break loop47;
				}
			}

			// PHPAST.g:596:75: (d2= DOMAIN_T )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==DOMAIN_T) ) {
				int LA48_1 = input.LA(2);
				if ( (synpred80_PHPAST()) ) {
					alt48=1;
				}
			}
			switch (alt48) {
				case 1 :
					// PHPAST.g:596:75: d2= DOMAIN_T
					{
					d2=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name2443); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					d2_tree = (AST)adaptor.create(d2);
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
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fully_qualified_class_name"


	public static class static_var_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "static_var_list"
	// PHPAST.g:618:1: static_var_list : static_var_element ( COMMA_T static_var_element )* -> ( static_var_element )+ ;
	public final PHPASTParser.static_var_list_return static_var_list() throws RecognitionException {
		PHPASTParser.static_var_list_return retval = new PHPASTParser.static_var_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COMMA_T202=null;
		ParserRuleReturnScope static_var_element201 =null;
		ParserRuleReturnScope static_var_element203 =null;

		AST COMMA_T202_tree=null;
		RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
		RewriteRuleSubtreeStream stream_static_var_element=new RewriteRuleSubtreeStream(adaptor,"rule static_var_element");

		try {
			// PHPAST.g:619:3: ( static_var_element ( COMMA_T static_var_element )* -> ( static_var_element )+ )
			// PHPAST.g:619:5: static_var_element ( COMMA_T static_var_element )*
			{
			pushFollow(FOLLOW_static_var_element_in_static_var_list2474);
			static_var_element201=static_var_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_static_var_element.add(static_var_element201.getTree());
			// PHPAST.g:619:24: ( COMMA_T static_var_element )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==COMMA_T) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// PHPAST.g:619:25: COMMA_T static_var_element
					{
					COMMA_T202=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_static_var_list2477); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T202);

					pushFollow(FOLLOW_static_var_element_in_static_var_list2479);
					static_var_element203=static_var_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_static_var_element.add(static_var_element203.getTree());
					}
					break;

				default :
					break loop49;
				}
			}

			// AST REWRITE
			// elements: static_var_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 619:55: -> ( static_var_element )+
			{
				if ( !(stream_static_var_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_static_var_element.hasNext() ) {
					adaptor.addChild(root_0, stream_static_var_element.nextTree());
				}
				stream_static_var_element.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "static_var_list"


	public static class static_var_element_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "static_var_element"
	// PHPAST.g:622:1: static_var_element : pure_variable ( EQUAL_T ^ default_arg )? ;
	public final PHPASTParser.static_var_element_return static_var_element() throws RecognitionException {
		PHPASTParser.static_var_element_return retval = new PHPASTParser.static_var_element_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token EQUAL_T205=null;
		ParserRuleReturnScope pure_variable204 =null;
		ParserRuleReturnScope default_arg206 =null;

		AST EQUAL_T205_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:632:3: ( pure_variable ( EQUAL_T ^ default_arg )? )
			// PHPAST.g:632:5: pure_variable ( EQUAL_T ^ default_arg )?
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_pure_variable_in_static_var_element2511);
			pure_variable204=pure_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, pure_variable204.getTree());

			// PHPAST.g:632:19: ( EQUAL_T ^ default_arg )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==EQUAL_T) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// PHPAST.g:632:20: EQUAL_T ^ default_arg
					{
					EQUAL_T205=(Token)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_static_var_element2514); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUAL_T205_tree = (AST)adaptor.create(EQUAL_T205);
					root_0 = (AST)adaptor.becomeRoot(EQUAL_T205_tree, root_0);
					}

					pushFollow(FOLLOW_default_arg_in_static_var_element2517);
					default_arg206=default_arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, default_arg206.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(pure_variable204!=null?(pure_variable204.start):null);
			    startIndex = token.getStartIndex();
			    endIndex = token.getStopIndex();
			    if ((default_arg206!=null?input.toString(default_arg206.start,default_arg206.stop):null) != null) {
			      endIndex = ((CommonToken)(default_arg206!=null?(default_arg206.stop):null)).getStopIndex();
			    }
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "static_var_element"


	public static class if_stat_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "if_stat"
	// PHPAST.g:643:1: if_stat : IF_T LEFT_PARETHESIS eIfCond= expression RIGHT_PARETHESIS (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) ) ;
	public final PHPASTParser.if_stat_return if_stat() throws RecognitionException {
		PHPASTParser.if_stat_return retval = new PHPASTParser.if_stat_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token IF_T207=null;
		Token LEFT_PARETHESIS208=null;
		Token RIGHT_PARETHESIS209=null;
		Token ELSEIF_T210=null;
		Token LEFT_PARETHESIS211=null;
		Token RIGHT_PARETHESIS212=null;
		Token ELSE_T213=null;
		Token COLON_T214=null;
		Token ELSE_T217=null;
		Token COLON_T218=null;
		Token ENDIF_T219=null;
		Token SEMI_COLON220=null;
		ParserRuleReturnScope eIfCond =null;
		ParserRuleReturnScope s1 =null;
		ParserRuleReturnScope eElseCond =null;
		ParserRuleReturnScope s2 =null;
		ParserRuleReturnScope s3 =null;
		ParserRuleReturnScope s4 =null;
		ParserRuleReturnScope inner_statement_list215 =null;
		ParserRuleReturnScope new_elseif_branch216 =null;

		AST IF_T207_tree=null;
		AST LEFT_PARETHESIS208_tree=null;
		AST RIGHT_PARETHESIS209_tree=null;
		AST ELSEIF_T210_tree=null;
		AST LEFT_PARETHESIS211_tree=null;
		AST RIGHT_PARETHESIS212_tree=null;
		AST ELSE_T213_tree=null;
		AST COLON_T214_tree=null;
		AST ELSE_T217_tree=null;
		AST COLON_T218_tree=null;
		AST ENDIF_T219_tree=null;
		AST SEMI_COLON220_tree=null;
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
			// PHPAST.g:653:3: ( IF_T LEFT_PARETHESIS eIfCond= expression RIGHT_PARETHESIS (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) ) )
			// PHPAST.g:653:5: IF_T LEFT_PARETHESIS eIfCond= expression RIGHT_PARETHESIS (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) )
			{
			IF_T207=(Token)match(input,IF_T,FOLLOW_IF_T_in_if_stat2548); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IF_T.add(IF_T207);

			LEFT_PARETHESIS208=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_if_stat2550); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS208);

			pushFollow(FOLLOW_expression_in_if_stat2554);
			eIfCond=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(eIfCond.getTree());
			RIGHT_PARETHESIS209=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_if_stat2556); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS209);

			// PHPAST.g:654:5: (s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )? -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? ) | COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? ) )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( ((LA56_0 >= AT_T && LA56_0 <= BACKTRICKLITERAL)||LA56_0==BREAK_T||LA56_0==CLONE_T||(LA56_0 >= CONTINUE_T && LA56_0 <= DECLARE_T)||(LA56_0 >= DOLLAR_T && LA56_0 <= DOMAIN_T)||(LA56_0 >= DOUBLELITERRAL && LA56_0 <= DO_T)||LA56_0==ECHO_T||LA56_0==EXC_NOT_T||(LA56_0 >= FLOATLITERAL && LA56_0 <= FUNCTION_T)||LA56_0==GLOBAL_T||LA56_0==HERE_DOC||(LA56_0 >= IDENTIFIER && LA56_0 <= IF_T)||(LA56_0 >= INCLUDE_ONCE_T && LA56_0 <= INCLUDE_T)||LA56_0==INTLITERAL||(LA56_0 >= LEFT_BRACKET && LA56_0 <= LEFT_PARETHESIS)||LA56_0==LIST_T||(LA56_0 >= MINUS_MINUS_T && LA56_0 <= MINUS_T)||(LA56_0 >= NAMESPACE_T && LA56_0 <= NEW_T)||(LA56_0 >= PLUS_PLUS_T && LA56_0 <= PLUS_T)||LA56_0==PRINT_T||(LA56_0 >= REALLITERAL && LA56_0 <= RETURN_T)||LA56_0==SEMI_COLON||(LA56_0 >= STATIC && LA56_0 <= TILDA_T)||LA56_0==TRY_T||LA56_0==UNSET_T||LA56_0==USE_T||LA56_0==WHILE_T||(LA56_0 >= 176 && LA56_0 <= 182)||LA56_0==185) ) {
				alt56=1;
			}
			else if ( (LA56_0==COLON_T) ) {
				alt56=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// PHPAST.g:655:7: s1= statement ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )* ( options {k=1; backtrack=true; } : ELSE_T s3= statement )?
					{
					pushFollow(FOLLOW_statement_in_if_stat2572);
					s1=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(s1.getTree());
					// PHPAST.g:655:20: ( options {k=1; backtrack=true; } : ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==ELSEIF_T) ) {
							int LA51_1 = input.LA(2);
							if ( (synpred83_PHPAST()) ) {
								alt51=1;
							}

						}

						switch (alt51) {
						case 1 :
							// PHPAST.g:655:53: ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement
							{
							ELSEIF_T210=(Token)match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_if_stat2588); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ELSEIF_T.add(ELSEIF_T210);

							LEFT_PARETHESIS211=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_if_stat2590); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS211);

							pushFollow(FOLLOW_expression_in_if_stat2594);
							eElseCond=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(eElseCond.getTree());
							RIGHT_PARETHESIS212=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_if_stat2596); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS212);

							pushFollow(FOLLOW_statement_in_if_stat2600);
							s2=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_statement.add(s2.getTree());
							}
							break;

						default :
							break loop51;
						}
					}

					// PHPAST.g:656:9: ( options {k=1; backtrack=true; } : ELSE_T s3= statement )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==ELSE_T) ) {
						int LA52_1 = input.LA(2);
						if ( (synpred84_PHPAST()) ) {
							alt52=1;
						}
					}
					switch (alt52) {
						case 1 :
							// PHPAST.g:656:42: ELSE_T s3= statement
							{
							ELSE_T213=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_if_stat2626); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ELSE_T.add(ELSE_T213);

							pushFollow(FOLLOW_statement_in_if_stat2630);
							s3=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_statement.add(s3.getTree());
							}
							break;

					}

					if ( state.backtracking==0 ) {
					        startIndex = ((CommonToken)IF_T207).getStartIndex();
					        endIndex = ((CommonToken)(s1!=null?(s1.stop):null)).getStopIndex();
					        if ((s2!=null?input.toString(s2.start,s2.stop):null) != null) {
					          endIndex = ((CommonToken)(s2!=null?(s2.stop):null)).getStopIndex();
					        }
					        if ((s3!=null?input.toString(s3.start,s3.stop):null) != null) {
					          endIndex = ((CommonToken)(s3!=null?(s3.stop):null)).getStopIndex();
					        }
					     }
					// AST REWRITE
					// elements: eElseCond, ELSEIF_T, IF_T, s1, s3, eIfCond, ELSE_T, s2
					// token labels: 
					// rule labels: retval, s2, s1, eIfCond, s3, eElseCond
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.getTree():null);
					RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.getTree():null);
					RewriteRuleSubtreeStream stream_eIfCond=new RewriteRuleSubtreeStream(adaptor,"rule eIfCond",eIfCond!=null?eIfCond.getTree():null);
					RewriteRuleSubtreeStream stream_s3=new RewriteRuleSubtreeStream(adaptor,"rule s3",s3!=null?s3.getTree():null);
					RewriteRuleSubtreeStream stream_eElseCond=new RewriteRuleSubtreeStream(adaptor,"rule eElseCond",eElseCond!=null?eElseCond.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 667:7: -> ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? )
					{
						// PHPAST.g:667:11: ^( IF_T ^( CONDITION $eIfCond) $s1 ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )* ( ^( ELSE_T $s3) )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_IF_T.nextNode(), root_1);
						// PHPAST.g:667:18: ^( CONDITION $eIfCond)
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITION, "CONDITION"), root_2);
						adaptor.addChild(root_2, stream_eIfCond.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_1, stream_s1.nextTree());
						// PHPAST.g:667:45: ( ^( ELSEIF_T ^( CONDITION $eElseCond) $s2) )*
						while ( stream_eElseCond.hasNext()||stream_ELSEIF_T.hasNext()||stream_s2.hasNext() ) {
							// PHPAST.g:667:45: ^( ELSEIF_T ^( CONDITION $eElseCond) $s2)
							{
							AST root_2 = (AST)adaptor.nil();
							root_2 = (AST)adaptor.becomeRoot(stream_ELSEIF_T.nextNode(), root_2);
							// PHPAST.g:667:56: ^( CONDITION $eElseCond)
							{
							AST root_3 = (AST)adaptor.nil();
							root_3 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITION, "CONDITION"), root_3);
							adaptor.addChild(root_3, stream_eElseCond.nextTree());
							adaptor.addChild(root_2, root_3);
							}

							adaptor.addChild(root_2, stream_s2.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_eElseCond.reset();
						stream_ELSEIF_T.reset();
						stream_s2.reset();

						// PHPAST.g:667:86: ( ^( ELSE_T $s3) )?
						if ( stream_s3.hasNext()||stream_ELSE_T.hasNext() ) {
							// PHPAST.g:667:86: ^( ELSE_T $s3)
							{
							AST root_2 = (AST)adaptor.nil();
							root_2 = (AST)adaptor.becomeRoot(stream_ELSE_T.nextNode(), root_2);
							adaptor.addChild(root_2, stream_s3.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_s3.reset();
						stream_ELSE_T.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:668:9: COLON_T ( inner_statement_list )? ( new_elseif_branch )* ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )? ENDIF_T SEMI_COLON
					{
					COLON_T214=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_if_stat2696); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T214);

					// PHPAST.g:668:17: ( inner_statement_list )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( ((LA53_0 >= AT_T && LA53_0 <= BACKTRICKLITERAL)||LA53_0==BREAK_T||(LA53_0 >= CLASS_T && LA53_0 <= CLONE_T)||(LA53_0 >= CONTINUE_T && LA53_0 <= DECLARE_T)||(LA53_0 >= DOLLAR_T && LA53_0 <= DOMAIN_T)||(LA53_0 >= DOUBLELITERRAL && LA53_0 <= DO_T)||LA53_0==ECHO_T||LA53_0==EXC_NOT_T||(LA53_0 >= FLOATLITERAL && LA53_0 <= FUNCTION_T)||LA53_0==GLOBAL_T||LA53_0==HERE_DOC||(LA53_0 >= IDENTIFIER && LA53_0 <= IF_T)||(LA53_0 >= INCLUDE_ONCE_T && LA53_0 <= INCLUDE_T)||(LA53_0 >= INTERFACE_T && LA53_0 <= INTLITERAL)||(LA53_0 >= LEFT_BRACKET && LA53_0 <= LEFT_PARETHESIS)||LA53_0==LIST_T||(LA53_0 >= MINUS_MINUS_T && LA53_0 <= MINUS_T)||(LA53_0 >= NAMESPACE_T && LA53_0 <= NEW_T)||(LA53_0 >= PLUS_PLUS_T && LA53_0 <= PLUS_T)||LA53_0==PRINT_T||(LA53_0 >= REALLITERAL && LA53_0 <= RETURN_T)||LA53_0==SEMI_COLON||(LA53_0 >= STATIC && LA53_0 <= TILDA_T)||(LA53_0 >= TRAIT_T && LA53_0 <= TRY_T)||LA53_0==UNSET_T||LA53_0==USE_T||LA53_0==WHILE_T||(LA53_0 >= 176 && LA53_0 <= 185)||LA53_0==189) ) {
						alt53=1;
					}
					switch (alt53) {
						case 1 :
							// PHPAST.g:668:17: inner_statement_list
							{
							pushFollow(FOLLOW_inner_statement_list_in_if_stat2698);
							inner_statement_list215=inner_statement_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list215.getTree());
							}
							break;

					}

					// PHPAST.g:668:39: ( new_elseif_branch )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==ELSEIF_T) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// PHPAST.g:668:39: new_elseif_branch
							{
							pushFollow(FOLLOW_new_elseif_branch_in_if_stat2701);
							new_elseif_branch216=new_elseif_branch();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_new_elseif_branch.add(new_elseif_branch216.getTree());
							}
							break;

						default :
							break loop54;
						}
					}

					// PHPAST.g:668:58: ( options {k=1; backtrack=true; } : ELSE_T COLON_T s4= statement )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==ELSE_T) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// PHPAST.g:668:91: ELSE_T COLON_T s4= statement
							{
							ELSE_T217=(Token)match(input,ELSE_T,FOLLOW_ELSE_T_in_if_stat2718); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_ELSE_T.add(ELSE_T217);

							COLON_T218=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_if_stat2720); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T218);

							pushFollow(FOLLOW_statement_in_if_stat2724);
							s4=statement();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_statement.add(s4.getTree());
							}
							break;

					}

					ENDIF_T219=(Token)match(input,ENDIF_T,FOLLOW_ENDIF_T_in_if_stat2728); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ENDIF_T.add(ENDIF_T219);

					SEMI_COLON220=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_if_stat2730); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON220);

					if ( state.backtracking==0 ) {
					        startIndex = ((CommonToken)IF_T207).getStartIndex();
					        endIndex = ((CommonToken)ENDIF_T219).getStartIndex() -2;
					     }
					// AST REWRITE
					// elements: ELSE_T, s4, new_elseif_branch, inner_statement_list, eIfCond, IF_T
					// token labels: 
					// rule labels: retval, eIfCond, s4
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_eIfCond=new RewriteRuleSubtreeStream(adaptor,"rule eIfCond",eIfCond!=null?eIfCond.getTree():null);
					RewriteRuleSubtreeStream stream_s4=new RewriteRuleSubtreeStream(adaptor,"rule s4",s4!=null?s4.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 673:7: -> ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? )
					{
						// PHPAST.g:673:11: ^( IF_T ^( CONDITION $eIfCond) ( inner_statement_list )? ( new_elseif_branch )* ( ^( ELSE_T $s4) )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_IF_T.nextNode(), root_1);
						// PHPAST.g:673:18: ^( CONDITION $eIfCond)
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITION, "CONDITION"), root_2);
						adaptor.addChild(root_2, stream_eIfCond.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// PHPAST.g:673:40: ( inner_statement_list )?
						if ( stream_inner_statement_list.hasNext() ) {
							adaptor.addChild(root_1, stream_inner_statement_list.nextTree());
						}
						stream_inner_statement_list.reset();

						// PHPAST.g:673:62: ( new_elseif_branch )*
						while ( stream_new_elseif_branch.hasNext() ) {
							adaptor.addChild(root_1, stream_new_elseif_branch.nextTree());
						}
						stream_new_elseif_branch.reset();

						// PHPAST.g:673:81: ( ^( ELSE_T $s4) )?
						if ( stream_ELSE_T.hasNext()||stream_s4.hasNext() ) {
							// PHPAST.g:673:81: ^( ELSE_T $s4)
							{
							AST root_2 = (AST)adaptor.nil();
							root_2 = (AST)adaptor.becomeRoot(stream_ELSE_T.nextNode(), root_2);
							adaptor.addChild(root_2, stream_s4.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_ELSE_T.reset();
						stream_s4.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "if_stat"


	public static class new_elseif_branch_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "new_elseif_branch"
	// PHPAST.g:677:1: new_elseif_branch : ELSEIF_T LEFT_PARETHESIS expression RIGHT_PARETHESIS COLON_T ( inner_statement_list )? -> ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) ;
	public final PHPASTParser.new_elseif_branch_return new_elseif_branch() throws RecognitionException {
		PHPASTParser.new_elseif_branch_return retval = new PHPASTParser.new_elseif_branch_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token ELSEIF_T221=null;
		Token LEFT_PARETHESIS222=null;
		Token RIGHT_PARETHESIS224=null;
		Token COLON_T225=null;
		ParserRuleReturnScope expression223 =null;
		ParserRuleReturnScope inner_statement_list226 =null;

		AST ELSEIF_T221_tree=null;
		AST LEFT_PARETHESIS222_tree=null;
		AST RIGHT_PARETHESIS224_tree=null;
		AST COLON_T225_tree=null;
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
			// PHPAST.g:687:2: ( ELSEIF_T LEFT_PARETHESIS expression RIGHT_PARETHESIS COLON_T ( inner_statement_list )? -> ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) )
			// PHPAST.g:687:4: ELSEIF_T LEFT_PARETHESIS expression RIGHT_PARETHESIS COLON_T ( inner_statement_list )?
			{
			ELSEIF_T221=(Token)match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_new_elseif_branch2801); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_ELSEIF_T.add(ELSEIF_T221);

			LEFT_PARETHESIS222=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_new_elseif_branch2803); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS222);

			pushFollow(FOLLOW_expression_in_new_elseif_branch2805);
			expression223=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression223.getTree());
			RIGHT_PARETHESIS224=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_new_elseif_branch2807); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS224);

			COLON_T225=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_new_elseif_branch2809); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T225);

			// PHPAST.g:687:65: ( inner_statement_list )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( ((LA57_0 >= AT_T && LA57_0 <= BACKTRICKLITERAL)||LA57_0==BREAK_T||(LA57_0 >= CLASS_T && LA57_0 <= CLONE_T)||(LA57_0 >= CONTINUE_T && LA57_0 <= DECLARE_T)||(LA57_0 >= DOLLAR_T && LA57_0 <= DOMAIN_T)||(LA57_0 >= DOUBLELITERRAL && LA57_0 <= DO_T)||LA57_0==ECHO_T||LA57_0==EXC_NOT_T||(LA57_0 >= FLOATLITERAL && LA57_0 <= FUNCTION_T)||LA57_0==GLOBAL_T||LA57_0==HERE_DOC||(LA57_0 >= IDENTIFIER && LA57_0 <= IF_T)||(LA57_0 >= INCLUDE_ONCE_T && LA57_0 <= INCLUDE_T)||(LA57_0 >= INTERFACE_T && LA57_0 <= INTLITERAL)||(LA57_0 >= LEFT_BRACKET && LA57_0 <= LEFT_PARETHESIS)||LA57_0==LIST_T||(LA57_0 >= MINUS_MINUS_T && LA57_0 <= MINUS_T)||(LA57_0 >= NAMESPACE_T && LA57_0 <= NEW_T)||(LA57_0 >= PLUS_PLUS_T && LA57_0 <= PLUS_T)||LA57_0==PRINT_T||(LA57_0 >= REALLITERAL && LA57_0 <= RETURN_T)||LA57_0==SEMI_COLON||(LA57_0 >= STATIC && LA57_0 <= TILDA_T)||(LA57_0 >= TRAIT_T && LA57_0 <= TRY_T)||LA57_0==UNSET_T||LA57_0==USE_T||LA57_0==WHILE_T||(LA57_0 >= 176 && LA57_0 <= 185)||LA57_0==189) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// PHPAST.g:687:65: inner_statement_list
					{
					pushFollow(FOLLOW_inner_statement_list_in_new_elseif_branch2811);
					inner_statement_list226=inner_statement_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list226.getTree());
					}
					break;

			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)ELSEIF_T221;
			    startIndex = token.getStartIndex();
			    token = (CommonToken)COLON_T225;
			    endIndex = token.getStopIndex();
			    if ((inner_statement_list226!=null?input.toString(inner_statement_list226.start,inner_statement_list226.stop):null) != null) {
			      endIndex = ((CommonToken)(inner_statement_list226!=null?(inner_statement_list226.stop):null)).getStopIndex();
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 697:4: -> ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? )
			{
				// PHPAST.g:697:8: ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot(stream_ELSEIF_T.nextNode(), root_1);
				// PHPAST.g:697:19: ^( CONDITION expression )
				{
				AST root_2 = (AST)adaptor.nil();
				root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(CONDITION, "CONDITION"), root_2);
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// PHPAST.g:697:43: ( inner_statement_list )?
				if ( stream_inner_statement_list.hasNext() ) {
					adaptor.addChild(root_1, stream_inner_statement_list.nextTree());
				}
				stream_inner_statement_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "new_elseif_branch"


	public static class switch_case_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "switch_case_list"
	// PHPAST.g:700:1: switch_case_list : ( LEFT_BRACKET ( SEMI_COLON )? ( case_list )+ RIGHT_BRACKET -> ( case_list )+ | COLON_T ( SEMI_COLON )? ( case_list )+ ENDSWITCH_T SEMI_COLON -> ( case_list )+ );
	public final PHPASTParser.switch_case_list_return switch_case_list() throws RecognitionException {
		PHPASTParser.switch_case_list_return retval = new PHPASTParser.switch_case_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LEFT_BRACKET227=null;
		Token SEMI_COLON228=null;
		Token RIGHT_BRACKET230=null;
		Token COLON_T231=null;
		Token SEMI_COLON232=null;
		Token ENDSWITCH_T234=null;
		Token SEMI_COLON235=null;
		ParserRuleReturnScope case_list229 =null;
		ParserRuleReturnScope case_list233 =null;

		AST LEFT_BRACKET227_tree=null;
		AST SEMI_COLON228_tree=null;
		AST RIGHT_BRACKET230_tree=null;
		AST COLON_T231_tree=null;
		AST SEMI_COLON232_tree=null;
		AST ENDSWITCH_T234_tree=null;
		AST SEMI_COLON235_tree=null;
		RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
		RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
		RewriteRuleTokenStream stream_ENDSWITCH_T=new RewriteRuleTokenStream(adaptor,"token ENDSWITCH_T");
		RewriteRuleTokenStream stream_LEFT_BRACKET=new RewriteRuleTokenStream(adaptor,"token LEFT_BRACKET");
		RewriteRuleTokenStream stream_RIGHT_BRACKET=new RewriteRuleTokenStream(adaptor,"token RIGHT_BRACKET");
		RewriteRuleSubtreeStream stream_case_list=new RewriteRuleSubtreeStream(adaptor,"rule case_list");

		try {
			// PHPAST.g:701:3: ( LEFT_BRACKET ( SEMI_COLON )? ( case_list )+ RIGHT_BRACKET -> ( case_list )+ | COLON_T ( SEMI_COLON )? ( case_list )+ ENDSWITCH_T SEMI_COLON -> ( case_list )+ )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==LEFT_BRACKET) ) {
				alt62=1;
			}
			else if ( (LA62_0==COLON_T) ) {
				alt62=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// PHPAST.g:701:5: LEFT_BRACKET ( SEMI_COLON )? ( case_list )+ RIGHT_BRACKET
					{
					LEFT_BRACKET227=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_switch_case_list2849); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET227);

					// PHPAST.g:701:18: ( SEMI_COLON )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==SEMI_COLON) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// PHPAST.g:701:18: SEMI_COLON
							{
							SEMI_COLON228=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_switch_case_list2851); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON228);

							}
							break;

					}

					// PHPAST.g:701:30: ( case_list )+
					int cnt59=0;
					loop59:
					while (true) {
						int alt59=2;
						int LA59_0 = input.LA(1);
						if ( (LA59_0==CASE_T||LA59_0==DEFAULT_T) ) {
							alt59=1;
						}

						switch (alt59) {
						case 1 :
							// PHPAST.g:701:30: case_list
							{
							pushFollow(FOLLOW_case_list_in_switch_case_list2854);
							case_list229=case_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_case_list.add(case_list229.getTree());
							}
							break;

						default :
							if ( cnt59 >= 1 ) break loop59;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(59, input);
							throw eee;
						}
						cnt59++;
					}

					RIGHT_BRACKET230=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_switch_case_list2857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET230);

					// AST REWRITE
					// elements: case_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 701:65: -> ( case_list )+
					{
						if ( !(stream_case_list.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_case_list.hasNext() ) {
							adaptor.addChild(root_0, stream_case_list.nextTree());
						}
						stream_case_list.reset();

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:702:5: COLON_T ( SEMI_COLON )? ( case_list )+ ENDSWITCH_T SEMI_COLON
					{
					COLON_T231=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_switch_case_list2879); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T231);

					// PHPAST.g:702:13: ( SEMI_COLON )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==SEMI_COLON) ) {
						alt60=1;
					}
					switch (alt60) {
						case 1 :
							// PHPAST.g:702:13: SEMI_COLON
							{
							SEMI_COLON232=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_switch_case_list2881); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON232);

							}
							break;

					}

					// PHPAST.g:702:25: ( case_list )+
					int cnt61=0;
					loop61:
					while (true) {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( (LA61_0==CASE_T||LA61_0==DEFAULT_T) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// PHPAST.g:702:25: case_list
							{
							pushFollow(FOLLOW_case_list_in_switch_case_list2884);
							case_list233=case_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_case_list.add(case_list233.getTree());
							}
							break;

						default :
							if ( cnt61 >= 1 ) break loop61;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(61, input);
							throw eee;
						}
						cnt61++;
					}

					ENDSWITCH_T234=(Token)match(input,ENDSWITCH_T,FOLLOW_ENDSWITCH_T_in_switch_case_list2887); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ENDSWITCH_T.add(ENDSWITCH_T234);

					SEMI_COLON235=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_switch_case_list2889); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON235);

					// AST REWRITE
					// elements: case_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 702:63: -> ( case_list )+
					{
						if ( !(stream_case_list.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_case_list.hasNext() ) {
							adaptor.addChild(root_0, stream_case_list.nextTree());
						}
						stream_case_list.reset();

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "switch_case_list"


	public static class case_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "case_list"
	// PHPAST.g:705:1: case_list : ( CASE_T expression ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( CASE_T expression ( inner_statement_list )? ) | DEFAULT_T ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( DEFAULT_T ( inner_statement_list )? ) );
	public final PHPASTParser.case_list_return case_list() throws RecognitionException {
		PHPASTParser.case_list_return retval = new PHPASTParser.case_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token CASE_T236=null;
		Token COLON_T238=null;
		Token SEMI_COLON239=null;
		Token DEFAULT_T241=null;
		Token COLON_T242=null;
		Token SEMI_COLON243=null;
		ParserRuleReturnScope expression237 =null;
		ParserRuleReturnScope inner_statement_list240 =null;
		ParserRuleReturnScope inner_statement_list244 =null;

		AST CASE_T236_tree=null;
		AST COLON_T238_tree=null;
		AST SEMI_COLON239_tree=null;
		AST DEFAULT_T241_tree=null;
		AST COLON_T242_tree=null;
		AST SEMI_COLON243_tree=null;
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
			// PHPAST.g:715:3: ( CASE_T expression ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( CASE_T expression ( inner_statement_list )? ) | DEFAULT_T ( COLON_T | SEMI_COLON ) ( inner_statement_list )? -> ^( DEFAULT_T ( inner_statement_list )? ) )
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==CASE_T) ) {
				alt67=1;
			}
			else if ( (LA67_0==DEFAULT_T) ) {
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
					// PHPAST.g:715:5: CASE_T expression ( COLON_T | SEMI_COLON ) ( inner_statement_list )?
					{
					CASE_T236=(Token)match(input,CASE_T,FOLLOW_CASE_T_in_case_list2922); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CASE_T.add(CASE_T236);

					pushFollow(FOLLOW_expression_in_case_list2924);
					expression237=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression237.getTree());
					// PHPAST.g:715:23: ( COLON_T | SEMI_COLON )
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==COLON_T) ) {
						alt63=1;
					}
					else if ( (LA63_0==SEMI_COLON) ) {
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
							// PHPAST.g:715:24: COLON_T
							{
							COLON_T238=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_case_list2927); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T238);

							}
							break;
						case 2 :
							// PHPAST.g:715:34: SEMI_COLON
							{
							SEMI_COLON239=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_case_list2931); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON239);

							}
							break;

					}

					// PHPAST.g:715:46: ( inner_statement_list )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( ((LA64_0 >= AT_T && LA64_0 <= BACKTRICKLITERAL)||LA64_0==BREAK_T||(LA64_0 >= CLASS_T && LA64_0 <= CLONE_T)||(LA64_0 >= CONTINUE_T && LA64_0 <= DECLARE_T)||(LA64_0 >= DOLLAR_T && LA64_0 <= DOMAIN_T)||(LA64_0 >= DOUBLELITERRAL && LA64_0 <= DO_T)||LA64_0==ECHO_T||LA64_0==EXC_NOT_T||(LA64_0 >= FLOATLITERAL && LA64_0 <= FUNCTION_T)||LA64_0==GLOBAL_T||LA64_0==HERE_DOC||(LA64_0 >= IDENTIFIER && LA64_0 <= IF_T)||(LA64_0 >= INCLUDE_ONCE_T && LA64_0 <= INCLUDE_T)||(LA64_0 >= INTERFACE_T && LA64_0 <= INTLITERAL)||(LA64_0 >= LEFT_BRACKET && LA64_0 <= LEFT_PARETHESIS)||LA64_0==LIST_T||(LA64_0 >= MINUS_MINUS_T && LA64_0 <= MINUS_T)||(LA64_0 >= NAMESPACE_T && LA64_0 <= NEW_T)||(LA64_0 >= PLUS_PLUS_T && LA64_0 <= PLUS_T)||LA64_0==PRINT_T||(LA64_0 >= REALLITERAL && LA64_0 <= RETURN_T)||LA64_0==SEMI_COLON||(LA64_0 >= STATIC && LA64_0 <= TILDA_T)||(LA64_0 >= TRAIT_T && LA64_0 <= TRY_T)||LA64_0==UNSET_T||LA64_0==USE_T||LA64_0==WHILE_T||(LA64_0 >= 176 && LA64_0 <= 185)||LA64_0==189) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// PHPAST.g:715:46: inner_statement_list
							{
							pushFollow(FOLLOW_inner_statement_list_in_case_list2934);
							inner_statement_list240=inner_statement_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list240.getTree());
							}
							break;

					}

					if ( state.backtracking==0 ) {
					    token = (CommonToken)CASE_T236;
					    startIndex = token.getStartIndex();
					    token = (CommonToken)COLON_T238;
					    if ((SEMI_COLON239!=null?SEMI_COLON239.getText():null) != null) {
					      token = (CommonToken)SEMI_COLON239;
					    }
					    endIndex = token.getStopIndex();
					    if ((inner_statement_list240!=null?input.toString(inner_statement_list240.start,inner_statement_list240.stop):null) != null) {
					      endIndex = ((CommonToken)(inner_statement_list240!=null?(inner_statement_list240.stop):null)).getStopIndex();
					    }
					  }
					// AST REWRITE
					// elements: inner_statement_list, expression, CASE_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 728:5: -> ^( CASE_T expression ( inner_statement_list )? )
					{
						// PHPAST.g:728:9: ^( CASE_T expression ( inner_statement_list )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_CASE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// PHPAST.g:728:29: ( inner_statement_list )?
						if ( stream_inner_statement_list.hasNext() ) {
							adaptor.addChild(root_1, stream_inner_statement_list.nextTree());
						}
						stream_inner_statement_list.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:729:5: DEFAULT_T ( COLON_T | SEMI_COLON ) ( inner_statement_list )?
					{
					DEFAULT_T241=(Token)match(input,DEFAULT_T,FOLLOW_DEFAULT_T_in_case_list2966); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DEFAULT_T.add(DEFAULT_T241);

					// PHPAST.g:729:15: ( COLON_T | SEMI_COLON )
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==COLON_T) ) {
						alt65=1;
					}
					else if ( (LA65_0==SEMI_COLON) ) {
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
							// PHPAST.g:729:16: COLON_T
							{
							COLON_T242=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_case_list2969); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T242);

							}
							break;
						case 2 :
							// PHPAST.g:729:26: SEMI_COLON
							{
							SEMI_COLON243=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_case_list2973); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON243);

							}
							break;

					}

					// PHPAST.g:729:38: ( inner_statement_list )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( ((LA66_0 >= AT_T && LA66_0 <= BACKTRICKLITERAL)||LA66_0==BREAK_T||(LA66_0 >= CLASS_T && LA66_0 <= CLONE_T)||(LA66_0 >= CONTINUE_T && LA66_0 <= DECLARE_T)||(LA66_0 >= DOLLAR_T && LA66_0 <= DOMAIN_T)||(LA66_0 >= DOUBLELITERRAL && LA66_0 <= DO_T)||LA66_0==ECHO_T||LA66_0==EXC_NOT_T||(LA66_0 >= FLOATLITERAL && LA66_0 <= FUNCTION_T)||LA66_0==GLOBAL_T||LA66_0==HERE_DOC||(LA66_0 >= IDENTIFIER && LA66_0 <= IF_T)||(LA66_0 >= INCLUDE_ONCE_T && LA66_0 <= INCLUDE_T)||(LA66_0 >= INTERFACE_T && LA66_0 <= INTLITERAL)||(LA66_0 >= LEFT_BRACKET && LA66_0 <= LEFT_PARETHESIS)||LA66_0==LIST_T||(LA66_0 >= MINUS_MINUS_T && LA66_0 <= MINUS_T)||(LA66_0 >= NAMESPACE_T && LA66_0 <= NEW_T)||(LA66_0 >= PLUS_PLUS_T && LA66_0 <= PLUS_T)||LA66_0==PRINT_T||(LA66_0 >= REALLITERAL && LA66_0 <= RETURN_T)||LA66_0==SEMI_COLON||(LA66_0 >= STATIC && LA66_0 <= TILDA_T)||(LA66_0 >= TRAIT_T && LA66_0 <= TRY_T)||LA66_0==UNSET_T||LA66_0==USE_T||LA66_0==WHILE_T||(LA66_0 >= 176 && LA66_0 <= 185)||LA66_0==189) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// PHPAST.g:729:38: inner_statement_list
							{
							pushFollow(FOLLOW_inner_statement_list_in_case_list2976);
							inner_statement_list244=inner_statement_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list244.getTree());
							}
							break;

					}

					if ( state.backtracking==0 ) {
					    token = (CommonToken)DEFAULT_T241;
					    startIndex = token.getStartIndex();
					    token = (CommonToken)COLON_T242;
					    if ((SEMI_COLON243!=null?SEMI_COLON243.getText():null) != null) {
					      token = (CommonToken)SEMI_COLON243;
					    }
					    endIndex = token.getStopIndex();
					    if ((inner_statement_list244!=null?input.toString(inner_statement_list244.start,inner_statement_list244.stop):null) != null) {
					      endIndex = ((CommonToken)(inner_statement_list244!=null?(inner_statement_list244.stop):null)).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 742:5: -> ^( DEFAULT_T ( inner_statement_list )? )
					{
						// PHPAST.g:742:9: ^( DEFAULT_T ( inner_statement_list )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_DEFAULT_T.nextNode(), root_1);
						// PHPAST.g:742:21: ( inner_statement_list )?
						if ( stream_inner_statement_list.hasNext() ) {
							adaptor.addChild(root_1, stream_inner_statement_list.nextTree());
						}
						stream_inner_statement_list.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "case_list"


	public static class catch_branch_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "catch_branch"
	// PHPAST.g:745:1: catch_branch : CATCH_T LEFT_PARETHESIS fully_qualified_class_name variable RIGHT_PARETHESIS block -> ^( CATCH_T fully_qualified_class_name variable block ) ;
	public final PHPASTParser.catch_branch_return catch_branch() throws RecognitionException {
		PHPASTParser.catch_branch_return retval = new PHPASTParser.catch_branch_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token CATCH_T245=null;
		Token LEFT_PARETHESIS246=null;
		Token RIGHT_PARETHESIS249=null;
		ParserRuleReturnScope fully_qualified_class_name247 =null;
		ParserRuleReturnScope variable248 =null;
		ParserRuleReturnScope block250 =null;

		AST CATCH_T245_tree=null;
		AST LEFT_PARETHESIS246_tree=null;
		AST RIGHT_PARETHESIS249_tree=null;
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
			// PHPAST.g:755:3: ( CATCH_T LEFT_PARETHESIS fully_qualified_class_name variable RIGHT_PARETHESIS block -> ^( CATCH_T fully_qualified_class_name variable block ) )
			// PHPAST.g:755:5: CATCH_T LEFT_PARETHESIS fully_qualified_class_name variable RIGHT_PARETHESIS block
			{
			CATCH_T245=(Token)match(input,CATCH_T,FOLLOW_CATCH_T_in_catch_branch3025); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_CATCH_T.add(CATCH_T245);

			LEFT_PARETHESIS246=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_catch_branch3027); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS246);

			pushFollow(FOLLOW_fully_qualified_class_name_in_catch_branch3029);
			fully_qualified_class_name247=fully_qualified_class_name();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name247.getTree());
			pushFollow(FOLLOW_variable_in_catch_branch3031);
			variable248=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(variable248.getTree());
			RIGHT_PARETHESIS249=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_catch_branch3033); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS249);

			pushFollow(FOLLOW_block_in_catch_branch3041);
			block250=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block250.getTree());
			if ( state.backtracking==0 ) {
			        token = (CommonToken)CATCH_T245;
			        startIndex = token.getStartIndex();
			        token = (CommonToken)(block250!=null?(block250.stop):null);
			        endIndex = token.getStopIndex();  
			    }
			// AST REWRITE
			// elements: block, fully_qualified_class_name, variable, CATCH_T
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 763:5: -> ^( CATCH_T fully_qualified_class_name variable block )
			{
				// PHPAST.g:763:9: ^( CATCH_T fully_qualified_class_name variable block )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot(stream_CATCH_T.nextNode(), root_1);
				adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());
				adaptor.addChild(root_1, stream_variable.nextTree());
				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catch_branch"


	public static class for_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "for_statement"
	// PHPAST.g:766:1: for_statement : ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOR_T SEMI_COLON -> ( inner_statement_list )? );
	public final PHPASTParser.for_statement_return for_statement() throws RecognitionException {
		PHPASTParser.for_statement_return retval = new PHPASTParser.for_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COLON_T252=null;
		Token ENDFOR_T254=null;
		Token SEMI_COLON255=null;
		ParserRuleReturnScope statement251 =null;
		ParserRuleReturnScope inner_statement_list253 =null;

		AST COLON_T252_tree=null;
		AST ENDFOR_T254_tree=null;
		AST SEMI_COLON255_tree=null;
		RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
		RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
		RewriteRuleTokenStream stream_ENDFOR_T=new RewriteRuleTokenStream(adaptor,"token ENDFOR_T");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:776:2: ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOR_T SEMI_COLON -> ( inner_statement_list )? )
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( ((LA69_0 >= AT_T && LA69_0 <= BACKTRICKLITERAL)||LA69_0==BREAK_T||LA69_0==CLONE_T||(LA69_0 >= CONTINUE_T && LA69_0 <= DECLARE_T)||(LA69_0 >= DOLLAR_T && LA69_0 <= DOMAIN_T)||(LA69_0 >= DOUBLELITERRAL && LA69_0 <= DO_T)||LA69_0==ECHO_T||LA69_0==EXC_NOT_T||(LA69_0 >= FLOATLITERAL && LA69_0 <= FUNCTION_T)||LA69_0==GLOBAL_T||LA69_0==HERE_DOC||(LA69_0 >= IDENTIFIER && LA69_0 <= IF_T)||(LA69_0 >= INCLUDE_ONCE_T && LA69_0 <= INCLUDE_T)||LA69_0==INTLITERAL||(LA69_0 >= LEFT_BRACKET && LA69_0 <= LEFT_PARETHESIS)||LA69_0==LIST_T||(LA69_0 >= MINUS_MINUS_T && LA69_0 <= MINUS_T)||(LA69_0 >= NAMESPACE_T && LA69_0 <= NEW_T)||(LA69_0 >= PLUS_PLUS_T && LA69_0 <= PLUS_T)||LA69_0==PRINT_T||(LA69_0 >= REALLITERAL && LA69_0 <= RETURN_T)||LA69_0==SEMI_COLON||(LA69_0 >= STATIC && LA69_0 <= TILDA_T)||LA69_0==TRY_T||LA69_0==UNSET_T||LA69_0==USE_T||LA69_0==WHILE_T||(LA69_0 >= 176 && LA69_0 <= 182)||LA69_0==185) ) {
				alt69=1;
			}
			else if ( (LA69_0==COLON_T) ) {
				alt69=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}

			switch (alt69) {
				case 1 :
					// PHPAST.g:776:4: statement
					{
					pushFollow(FOLLOW_statement_in_for_statement3086);
					statement251=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement251.getTree());
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)(statement251!=null?(statement251.start):null)).getStartIndex();
					    endIndex = ((CommonToken)(statement251!=null?(statement251.stop):null)).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 781:4: -> statement
					{
						adaptor.addChild(root_0, stream_statement.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:782:4: COLON_T ( inner_statement_list )? ENDFOR_T SEMI_COLON
					{
					COLON_T252=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_for_statement3102); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T252);

					// PHPAST.g:782:12: ( inner_statement_list )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( ((LA68_0 >= AT_T && LA68_0 <= BACKTRICKLITERAL)||LA68_0==BREAK_T||(LA68_0 >= CLASS_T && LA68_0 <= CLONE_T)||(LA68_0 >= CONTINUE_T && LA68_0 <= DECLARE_T)||(LA68_0 >= DOLLAR_T && LA68_0 <= DOMAIN_T)||(LA68_0 >= DOUBLELITERRAL && LA68_0 <= DO_T)||LA68_0==ECHO_T||LA68_0==EXC_NOT_T||(LA68_0 >= FLOATLITERAL && LA68_0 <= FUNCTION_T)||LA68_0==GLOBAL_T||LA68_0==HERE_DOC||(LA68_0 >= IDENTIFIER && LA68_0 <= IF_T)||(LA68_0 >= INCLUDE_ONCE_T && LA68_0 <= INCLUDE_T)||(LA68_0 >= INTERFACE_T && LA68_0 <= INTLITERAL)||(LA68_0 >= LEFT_BRACKET && LA68_0 <= LEFT_PARETHESIS)||LA68_0==LIST_T||(LA68_0 >= MINUS_MINUS_T && LA68_0 <= MINUS_T)||(LA68_0 >= NAMESPACE_T && LA68_0 <= NEW_T)||(LA68_0 >= PLUS_PLUS_T && LA68_0 <= PLUS_T)||LA68_0==PRINT_T||(LA68_0 >= REALLITERAL && LA68_0 <= RETURN_T)||LA68_0==SEMI_COLON||(LA68_0 >= STATIC && LA68_0 <= TILDA_T)||(LA68_0 >= TRAIT_T && LA68_0 <= TRY_T)||LA68_0==UNSET_T||LA68_0==USE_T||LA68_0==WHILE_T||(LA68_0 >= 176 && LA68_0 <= 185)||LA68_0==189) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// PHPAST.g:782:12: inner_statement_list
							{
							pushFollow(FOLLOW_inner_statement_list_in_for_statement3104);
							inner_statement_list253=inner_statement_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list253.getTree());
							}
							break;

					}

					ENDFOR_T254=(Token)match(input,ENDFOR_T,FOLLOW_ENDFOR_T_in_for_statement3107); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ENDFOR_T.add(ENDFOR_T254);

					SEMI_COLON255=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_for_statement3109); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON255);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)COLON_T252).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON255).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 787:4: -> ( inner_statement_list )?
					{
						// PHPAST.g:787:8: ( inner_statement_list )?
						if ( stream_inner_statement_list.hasNext() ) {
							adaptor.addChild(root_0, stream_inner_statement_list.nextTree());
						}
						stream_inner_statement_list.reset();

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_statement"


	public static class while_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "while_statement"
	// PHPAST.g:790:1: while_statement : ( statement -> statement | COLON_T ( inner_statement_list )? ENDWHILE_T SEMI_COLON -> ( inner_statement_list )? );
	public final PHPASTParser.while_statement_return while_statement() throws RecognitionException {
		PHPASTParser.while_statement_return retval = new PHPASTParser.while_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COLON_T257=null;
		Token ENDWHILE_T259=null;
		Token SEMI_COLON260=null;
		ParserRuleReturnScope statement256 =null;
		ParserRuleReturnScope inner_statement_list258 =null;

		AST COLON_T257_tree=null;
		AST ENDWHILE_T259_tree=null;
		AST SEMI_COLON260_tree=null;
		RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
		RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
		RewriteRuleTokenStream stream_ENDWHILE_T=new RewriteRuleTokenStream(adaptor,"token ENDWHILE_T");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:800:2: ( statement -> statement | COLON_T ( inner_statement_list )? ENDWHILE_T SEMI_COLON -> ( inner_statement_list )? )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( ((LA71_0 >= AT_T && LA71_0 <= BACKTRICKLITERAL)||LA71_0==BREAK_T||LA71_0==CLONE_T||(LA71_0 >= CONTINUE_T && LA71_0 <= DECLARE_T)||(LA71_0 >= DOLLAR_T && LA71_0 <= DOMAIN_T)||(LA71_0 >= DOUBLELITERRAL && LA71_0 <= DO_T)||LA71_0==ECHO_T||LA71_0==EXC_NOT_T||(LA71_0 >= FLOATLITERAL && LA71_0 <= FUNCTION_T)||LA71_0==GLOBAL_T||LA71_0==HERE_DOC||(LA71_0 >= IDENTIFIER && LA71_0 <= IF_T)||(LA71_0 >= INCLUDE_ONCE_T && LA71_0 <= INCLUDE_T)||LA71_0==INTLITERAL||(LA71_0 >= LEFT_BRACKET && LA71_0 <= LEFT_PARETHESIS)||LA71_0==LIST_T||(LA71_0 >= MINUS_MINUS_T && LA71_0 <= MINUS_T)||(LA71_0 >= NAMESPACE_T && LA71_0 <= NEW_T)||(LA71_0 >= PLUS_PLUS_T && LA71_0 <= PLUS_T)||LA71_0==PRINT_T||(LA71_0 >= REALLITERAL && LA71_0 <= RETURN_T)||LA71_0==SEMI_COLON||(LA71_0 >= STATIC && LA71_0 <= TILDA_T)||LA71_0==TRY_T||LA71_0==UNSET_T||LA71_0==USE_T||LA71_0==WHILE_T||(LA71_0 >= 176 && LA71_0 <= 182)||LA71_0==185) ) {
				alt71=1;
			}
			else if ( (LA71_0==COLON_T) ) {
				alt71=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}

			switch (alt71) {
				case 1 :
					// PHPAST.g:800:4: statement
					{
					pushFollow(FOLLOW_statement_in_while_statement3143);
					statement256=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement256.getTree());
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)(statement256!=null?(statement256.start):null)).getStartIndex();
					    endIndex = ((CommonToken)(statement256!=null?(statement256.stop):null)).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 805:4: -> statement
					{
						adaptor.addChild(root_0, stream_statement.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:806:4: COLON_T ( inner_statement_list )? ENDWHILE_T SEMI_COLON
					{
					COLON_T257=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_while_statement3160); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T257);

					// PHPAST.g:806:12: ( inner_statement_list )?
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( ((LA70_0 >= AT_T && LA70_0 <= BACKTRICKLITERAL)||LA70_0==BREAK_T||(LA70_0 >= CLASS_T && LA70_0 <= CLONE_T)||(LA70_0 >= CONTINUE_T && LA70_0 <= DECLARE_T)||(LA70_0 >= DOLLAR_T && LA70_0 <= DOMAIN_T)||(LA70_0 >= DOUBLELITERRAL && LA70_0 <= DO_T)||LA70_0==ECHO_T||LA70_0==EXC_NOT_T||(LA70_0 >= FLOATLITERAL && LA70_0 <= FUNCTION_T)||LA70_0==GLOBAL_T||LA70_0==HERE_DOC||(LA70_0 >= IDENTIFIER && LA70_0 <= IF_T)||(LA70_0 >= INCLUDE_ONCE_T && LA70_0 <= INCLUDE_T)||(LA70_0 >= INTERFACE_T && LA70_0 <= INTLITERAL)||(LA70_0 >= LEFT_BRACKET && LA70_0 <= LEFT_PARETHESIS)||LA70_0==LIST_T||(LA70_0 >= MINUS_MINUS_T && LA70_0 <= MINUS_T)||(LA70_0 >= NAMESPACE_T && LA70_0 <= NEW_T)||(LA70_0 >= PLUS_PLUS_T && LA70_0 <= PLUS_T)||LA70_0==PRINT_T||(LA70_0 >= REALLITERAL && LA70_0 <= RETURN_T)||LA70_0==SEMI_COLON||(LA70_0 >= STATIC && LA70_0 <= TILDA_T)||(LA70_0 >= TRAIT_T && LA70_0 <= TRY_T)||LA70_0==UNSET_T||LA70_0==USE_T||LA70_0==WHILE_T||(LA70_0 >= 176 && LA70_0 <= 185)||LA70_0==189) ) {
						alt70=1;
					}
					switch (alt70) {
						case 1 :
							// PHPAST.g:806:12: inner_statement_list
							{
							pushFollow(FOLLOW_inner_statement_list_in_while_statement3162);
							inner_statement_list258=inner_statement_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list258.getTree());
							}
							break;

					}

					ENDWHILE_T259=(Token)match(input,ENDWHILE_T,FOLLOW_ENDWHILE_T_in_while_statement3165); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ENDWHILE_T.add(ENDWHILE_T259);

					SEMI_COLON260=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_while_statement3167); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON260);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)COLON_T257).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON260).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 811:4: -> ( inner_statement_list )?
					{
						// PHPAST.g:811:8: ( inner_statement_list )?
						if ( stream_inner_statement_list.hasNext() ) {
							adaptor.addChild(root_0, stream_inner_statement_list.nextTree());
						}
						stream_inner_statement_list.reset();

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_statement"


	public static class foreach_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "foreach_statement"
	// PHPAST.g:814:1: foreach_statement : ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOREACH_T SEMI_COLON -> ( inner_statement_list )? );
	public final PHPASTParser.foreach_statement_return foreach_statement() throws RecognitionException {
		PHPASTParser.foreach_statement_return retval = new PHPASTParser.foreach_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COLON_T262=null;
		Token ENDFOREACH_T264=null;
		Token SEMI_COLON265=null;
		ParserRuleReturnScope statement261 =null;
		ParserRuleReturnScope inner_statement_list263 =null;

		AST COLON_T262_tree=null;
		AST ENDFOREACH_T264_tree=null;
		AST SEMI_COLON265_tree=null;
		RewriteRuleTokenStream stream_ENDFOREACH_T=new RewriteRuleTokenStream(adaptor,"token ENDFOREACH_T");
		RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
		RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:824:3: ( statement -> statement | COLON_T ( inner_statement_list )? ENDFOREACH_T SEMI_COLON -> ( inner_statement_list )? )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( ((LA73_0 >= AT_T && LA73_0 <= BACKTRICKLITERAL)||LA73_0==BREAK_T||LA73_0==CLONE_T||(LA73_0 >= CONTINUE_T && LA73_0 <= DECLARE_T)||(LA73_0 >= DOLLAR_T && LA73_0 <= DOMAIN_T)||(LA73_0 >= DOUBLELITERRAL && LA73_0 <= DO_T)||LA73_0==ECHO_T||LA73_0==EXC_NOT_T||(LA73_0 >= FLOATLITERAL && LA73_0 <= FUNCTION_T)||LA73_0==GLOBAL_T||LA73_0==HERE_DOC||(LA73_0 >= IDENTIFIER && LA73_0 <= IF_T)||(LA73_0 >= INCLUDE_ONCE_T && LA73_0 <= INCLUDE_T)||LA73_0==INTLITERAL||(LA73_0 >= LEFT_BRACKET && LA73_0 <= LEFT_PARETHESIS)||LA73_0==LIST_T||(LA73_0 >= MINUS_MINUS_T && LA73_0 <= MINUS_T)||(LA73_0 >= NAMESPACE_T && LA73_0 <= NEW_T)||(LA73_0 >= PLUS_PLUS_T && LA73_0 <= PLUS_T)||LA73_0==PRINT_T||(LA73_0 >= REALLITERAL && LA73_0 <= RETURN_T)||LA73_0==SEMI_COLON||(LA73_0 >= STATIC && LA73_0 <= TILDA_T)||LA73_0==TRY_T||LA73_0==UNSET_T||LA73_0==USE_T||LA73_0==WHILE_T||(LA73_0 >= 176 && LA73_0 <= 182)||LA73_0==185) ) {
				alt73=1;
			}
			else if ( (LA73_0==COLON_T) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// PHPAST.g:824:5: statement
					{
					pushFollow(FOLLOW_statement_in_foreach_statement3203);
					statement261=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement261.getTree());
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)(statement261!=null?(statement261.start):null)).getStartIndex();
					    endIndex = ((CommonToken)(statement261!=null?(statement261.stop):null)).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 829:4: -> statement
					{
						adaptor.addChild(root_0, stream_statement.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:830:5: COLON_T ( inner_statement_list )? ENDFOREACH_T SEMI_COLON
					{
					COLON_T262=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_foreach_statement3221); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T262);

					// PHPAST.g:830:13: ( inner_statement_list )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( ((LA72_0 >= AT_T && LA72_0 <= BACKTRICKLITERAL)||LA72_0==BREAK_T||(LA72_0 >= CLASS_T && LA72_0 <= CLONE_T)||(LA72_0 >= CONTINUE_T && LA72_0 <= DECLARE_T)||(LA72_0 >= DOLLAR_T && LA72_0 <= DOMAIN_T)||(LA72_0 >= DOUBLELITERRAL && LA72_0 <= DO_T)||LA72_0==ECHO_T||LA72_0==EXC_NOT_T||(LA72_0 >= FLOATLITERAL && LA72_0 <= FUNCTION_T)||LA72_0==GLOBAL_T||LA72_0==HERE_DOC||(LA72_0 >= IDENTIFIER && LA72_0 <= IF_T)||(LA72_0 >= INCLUDE_ONCE_T && LA72_0 <= INCLUDE_T)||(LA72_0 >= INTERFACE_T && LA72_0 <= INTLITERAL)||(LA72_0 >= LEFT_BRACKET && LA72_0 <= LEFT_PARETHESIS)||LA72_0==LIST_T||(LA72_0 >= MINUS_MINUS_T && LA72_0 <= MINUS_T)||(LA72_0 >= NAMESPACE_T && LA72_0 <= NEW_T)||(LA72_0 >= PLUS_PLUS_T && LA72_0 <= PLUS_T)||LA72_0==PRINT_T||(LA72_0 >= REALLITERAL && LA72_0 <= RETURN_T)||LA72_0==SEMI_COLON||(LA72_0 >= STATIC && LA72_0 <= TILDA_T)||(LA72_0 >= TRAIT_T && LA72_0 <= TRY_T)||LA72_0==UNSET_T||LA72_0==USE_T||LA72_0==WHILE_T||(LA72_0 >= 176 && LA72_0 <= 185)||LA72_0==189) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// PHPAST.g:830:13: inner_statement_list
							{
							pushFollow(FOLLOW_inner_statement_list_in_foreach_statement3223);
							inner_statement_list263=inner_statement_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list263.getTree());
							}
							break;

					}

					ENDFOREACH_T264=(Token)match(input,ENDFOREACH_T,FOLLOW_ENDFOREACH_T_in_foreach_statement3226); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ENDFOREACH_T.add(ENDFOREACH_T264);

					SEMI_COLON265=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_foreach_statement3228); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON265);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)COLON_T262).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON265).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 835:4: -> ( inner_statement_list )?
					{
						// PHPAST.g:835:8: ( inner_statement_list )?
						if ( stream_inner_statement_list.hasNext() ) {
							adaptor.addChild(root_0, stream_inner_statement_list.nextTree());
						}
						stream_inner_statement_list.reset();

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foreach_statement"


	public static class declare_statement_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "declare_statement"
	// PHPAST.g:838:1: declare_statement : ( statement -> ^( BLOCK statement ) | COLON_T ( inner_statement_list )? ENDDECLARE_T SEMI_COLON -> ^( BLOCK ( inner_statement_list )? ) );
	public final PHPASTParser.declare_statement_return declare_statement() throws RecognitionException {
		PHPASTParser.declare_statement_return retval = new PHPASTParser.declare_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COLON_T267=null;
		Token ENDDECLARE_T269=null;
		Token SEMI_COLON270=null;
		ParserRuleReturnScope statement266 =null;
		ParserRuleReturnScope inner_statement_list268 =null;

		AST COLON_T267_tree=null;
		AST ENDDECLARE_T269_tree=null;
		AST SEMI_COLON270_tree=null;
		RewriteRuleTokenStream stream_SEMI_COLON=new RewriteRuleTokenStream(adaptor,"token SEMI_COLON");
		RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
		RewriteRuleTokenStream stream_ENDDECLARE_T=new RewriteRuleTokenStream(adaptor,"token ENDDECLARE_T");
		RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
		RewriteRuleSubtreeStream stream_inner_statement_list=new RewriteRuleSubtreeStream(adaptor,"rule inner_statement_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:850:3: ( statement -> ^( BLOCK statement ) | COLON_T ( inner_statement_list )? ENDDECLARE_T SEMI_COLON -> ^( BLOCK ( inner_statement_list )? ) )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( ((LA75_0 >= AT_T && LA75_0 <= BACKTRICKLITERAL)||LA75_0==BREAK_T||LA75_0==CLONE_T||(LA75_0 >= CONTINUE_T && LA75_0 <= DECLARE_T)||(LA75_0 >= DOLLAR_T && LA75_0 <= DOMAIN_T)||(LA75_0 >= DOUBLELITERRAL && LA75_0 <= DO_T)||LA75_0==ECHO_T||LA75_0==EXC_NOT_T||(LA75_0 >= FLOATLITERAL && LA75_0 <= FUNCTION_T)||LA75_0==GLOBAL_T||LA75_0==HERE_DOC||(LA75_0 >= IDENTIFIER && LA75_0 <= IF_T)||(LA75_0 >= INCLUDE_ONCE_T && LA75_0 <= INCLUDE_T)||LA75_0==INTLITERAL||(LA75_0 >= LEFT_BRACKET && LA75_0 <= LEFT_PARETHESIS)||LA75_0==LIST_T||(LA75_0 >= MINUS_MINUS_T && LA75_0 <= MINUS_T)||(LA75_0 >= NAMESPACE_T && LA75_0 <= NEW_T)||(LA75_0 >= PLUS_PLUS_T && LA75_0 <= PLUS_T)||LA75_0==PRINT_T||(LA75_0 >= REALLITERAL && LA75_0 <= RETURN_T)||LA75_0==SEMI_COLON||(LA75_0 >= STATIC && LA75_0 <= TILDA_T)||LA75_0==TRY_T||LA75_0==UNSET_T||LA75_0==USE_T||LA75_0==WHILE_T||(LA75_0 >= 176 && LA75_0 <= 182)||LA75_0==185) ) {
				alt75=1;
			}
			else if ( (LA75_0==COLON_T) ) {
				alt75=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// PHPAST.g:850:5: statement
					{
					pushFollow(FOLLOW_statement_in_declare_statement3266);
					statement266=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_statement.add(statement266.getTree());
					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)(statement266!=null?(statement266.start):null)).getStartIndex();
					    endIndex = ((CommonToken)(statement266!=null?(statement266.stop):null)).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 855:5: -> ^( BLOCK statement )
					{
						// PHPAST.g:855:9: ^( BLOCK statement )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(BLOCK, "BLOCK"), root_1);
						adaptor.addChild(root_1, stream_statement.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:856:5: COLON_T ( inner_statement_list )? ENDDECLARE_T SEMI_COLON
					{
					COLON_T267=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_declare_statement3289); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T267);

					// PHPAST.g:856:13: ( inner_statement_list )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( ((LA74_0 >= AT_T && LA74_0 <= BACKTRICKLITERAL)||LA74_0==BREAK_T||(LA74_0 >= CLASS_T && LA74_0 <= CLONE_T)||(LA74_0 >= CONTINUE_T && LA74_0 <= DECLARE_T)||(LA74_0 >= DOLLAR_T && LA74_0 <= DOMAIN_T)||(LA74_0 >= DOUBLELITERRAL && LA74_0 <= DO_T)||LA74_0==ECHO_T||LA74_0==EXC_NOT_T||(LA74_0 >= FLOATLITERAL && LA74_0 <= FUNCTION_T)||LA74_0==GLOBAL_T||LA74_0==HERE_DOC||(LA74_0 >= IDENTIFIER && LA74_0 <= IF_T)||(LA74_0 >= INCLUDE_ONCE_T && LA74_0 <= INCLUDE_T)||(LA74_0 >= INTERFACE_T && LA74_0 <= INTLITERAL)||(LA74_0 >= LEFT_BRACKET && LA74_0 <= LEFT_PARETHESIS)||LA74_0==LIST_T||(LA74_0 >= MINUS_MINUS_T && LA74_0 <= MINUS_T)||(LA74_0 >= NAMESPACE_T && LA74_0 <= NEW_T)||(LA74_0 >= PLUS_PLUS_T && LA74_0 <= PLUS_T)||LA74_0==PRINT_T||(LA74_0 >= REALLITERAL && LA74_0 <= RETURN_T)||LA74_0==SEMI_COLON||(LA74_0 >= STATIC && LA74_0 <= TILDA_T)||(LA74_0 >= TRAIT_T && LA74_0 <= TRY_T)||LA74_0==UNSET_T||LA74_0==USE_T||LA74_0==WHILE_T||(LA74_0 >= 176 && LA74_0 <= 185)||LA74_0==189) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// PHPAST.g:856:13: inner_statement_list
							{
							pushFollow(FOLLOW_inner_statement_list_in_declare_statement3291);
							inner_statement_list268=inner_statement_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_inner_statement_list.add(inner_statement_list268.getTree());
							}
							break;

					}

					ENDDECLARE_T269=(Token)match(input,ENDDECLARE_T,FOLLOW_ENDDECLARE_T_in_declare_statement3294); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ENDDECLARE_T.add(ENDDECLARE_T269);

					SEMI_COLON270=(Token)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_declare_statement3296); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMI_COLON.add(SEMI_COLON270);

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)COLON_T267).getStartIndex();
					    endIndex = ((CommonToken)SEMI_COLON270).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 861:5: -> ^( BLOCK ( inner_statement_list )? )
					{
						// PHPAST.g:861:9: ^( BLOCK ( inner_statement_list )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(BLOCK, "BLOCK"), root_1);
						// PHPAST.g:861:17: ( inner_statement_list )?
						if ( stream_inner_statement_list.hasNext() ) {
							adaptor.addChild(root_1, stream_inner_statement_list.nextTree());
						}
						stream_inner_statement_list.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  if (ast != null) {
			      ast.setIndex(startIndex, endIndex);
			  }
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declare_statement"


	public static class parameter_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "parameter_list"
	// PHPAST.g:864:1: parameter_list : p1= parameter ( COMMA_T p2= parameter )* -> ( parameter )+ ;
	public final PHPASTParser.parameter_list_return parameter_list() throws RecognitionException {
		PHPASTParser.parameter_list_return retval = new PHPASTParser.parameter_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COMMA_T271=null;
		ParserRuleReturnScope p1 =null;
		ParserRuleReturnScope p2 =null;

		AST COMMA_T271_tree=null;
		RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
		RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:874:3: (p1= parameter ( COMMA_T p2= parameter )* -> ( parameter )+ )
			// PHPAST.g:874:5: p1= parameter ( COMMA_T p2= parameter )*
			{
			pushFollow(FOLLOW_parameter_in_parameter_list3342);
			p1=parameter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_parameter.add(p1.getTree());
			// PHPAST.g:874:18: ( COMMA_T p2= parameter )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==COMMA_T) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// PHPAST.g:874:19: COMMA_T p2= parameter
					{
					COMMA_T271=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_parameter_list3345); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T271);

					pushFollow(FOLLOW_parameter_in_parameter_list3349);
					p2=parameter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameter.add(p2.getTree());
					}
					break;

				default :
					break loop76;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(p1!=null?(p1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(p1!=null?(p1.stop):null);
			    if ((p2!=null?input.toString(p2.start,p2.stop):null) != null) {
			      token = (CommonToken)(p2!=null?(p2.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 884:5: -> ( parameter )+
			{
				if ( !(stream_parameter.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_parameter.hasNext() ) {
					adaptor.addChild(root_0, stream_parameter.nextTree());
				}
				stream_parameter.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_list"


	public static class parameter_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "parameter"
	// PHPAST.g:887:1: parameter : ( ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T default_arg )? ) -> ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( default_arg )? ) ;
	public final PHPASTParser.parameter_return parameter() throws RecognitionException {
		PHPASTParser.parameter_return retval = new PHPASTParser.parameter_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token CONST_T273=null;
		Token EQUAL_T275=null;
		ParserRuleReturnScope parameter_type272 =null;
		ParserRuleReturnScope pure_variable274 =null;
		ParserRuleReturnScope default_arg276 =null;

		AST CONST_T273_tree=null;
		AST EQUAL_T275_tree=null;
		RewriteRuleTokenStream stream_EQUAL_T=new RewriteRuleTokenStream(adaptor,"token EQUAL_T");
		RewriteRuleTokenStream stream_CONST_T=new RewriteRuleTokenStream(adaptor,"token CONST_T");
		RewriteRuleSubtreeStream stream_default_arg=new RewriteRuleSubtreeStream(adaptor,"rule default_arg");
		RewriteRuleSubtreeStream stream_parameter_type=new RewriteRuleSubtreeStream(adaptor,"rule parameter_type");
		RewriteRuleSubtreeStream stream_pure_variable=new RewriteRuleSubtreeStream(adaptor,"rule pure_variable");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:897:3: ( ( ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T default_arg )? ) -> ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( default_arg )? ) )
			// PHPAST.g:897:5: ( ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T default_arg )? )
			{
			// PHPAST.g:897:5: ( ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T default_arg )? )
			// PHPAST.g:897:6: ( parameter_type )? ( CONST_T )? pure_variable ( options {k=1; backtrack=true; } : EQUAL_T default_arg )?
			{
			// PHPAST.g:897:6: ( parameter_type )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==CLONE_T||LA77_0==DOMAIN_T||LA77_0==IDENTIFIER||LA77_0==NAMESPACE_T||LA77_0==UNSET_T||(LA77_0 >= 185 && LA77_0 <= 188)||(LA77_0 >= 190 && LA77_0 <= 192)||(LA77_0 >= 196 && LA77_0 <= 197)) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// PHPAST.g:897:6: parameter_type
					{
					pushFollow(FOLLOW_parameter_type_in_parameter3392);
					parameter_type272=parameter_type();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameter_type.add(parameter_type272.getTree());
					}
					break;

			}

			// PHPAST.g:897:22: ( CONST_T )?
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==CONST_T) ) {
				alt78=1;
			}
			switch (alt78) {
				case 1 :
					// PHPAST.g:897:22: CONST_T
					{
					CONST_T273=(Token)match(input,CONST_T,FOLLOW_CONST_T_in_parameter3395); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CONST_T.add(CONST_T273);

					}
					break;

			}

			pushFollow(FOLLOW_pure_variable_in_parameter3398);
			pure_variable274=pure_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_pure_variable.add(pure_variable274.getTree());
			// PHPAST.g:897:45: ( options {k=1; backtrack=true; } : EQUAL_T default_arg )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==EQUAL_T) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// PHPAST.g:897:77: EQUAL_T default_arg
					{
					EQUAL_T275=(Token)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_parameter3414); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUAL_T.add(EQUAL_T275);

					pushFollow(FOLLOW_default_arg_in_parameter3416);
					default_arg276=default_arg();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_default_arg.add(default_arg276.getTree());
					}
					break;

			}

			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(pure_variable274!=null?(pure_variable274.start):null);
			    if ((parameter_type272!=null?input.toString(parameter_type272.start,parameter_type272.stop):null) != null) {
			      token = (CommonToken)(parameter_type272!=null?(parameter_type272.start):null);
			    }
			    else if ((CONST_T273!=null?CONST_T273.getText():null) != null) {
			      token = (CommonToken)CONST_T273;
			    }
			    
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(pure_variable274!=null?(pure_variable274.stop):null);
			    
			    if((default_arg276!=null?input.toString(default_arg276.start,default_arg276.stop):null) != null) {
			        token = (CommonToken)(default_arg276!=null?(default_arg276.start):null);
			    }
			    
			    endIndex = token.getStopIndex();
			  }
			// AST REWRITE
			// elements: default_arg, pure_variable, CONST_T, parameter_type
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 917:3: -> ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( default_arg )? )
			{
				// PHPAST.g:917:6: ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( default_arg )? )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(PARAMETER, "PARAMETER"), root_1);
				// PHPAST.g:917:18: ( ^( TYPE parameter_type ) )?
				if ( stream_parameter_type.hasNext() ) {
					// PHPAST.g:917:18: ^( TYPE parameter_type )
					{
					AST root_2 = (AST)adaptor.nil();
					root_2 = (AST)adaptor.becomeRoot((AST)adaptor.create(TYPE, "TYPE"), root_2);
					adaptor.addChild(root_2, stream_parameter_type.nextTree());
					adaptor.addChild(root_1, root_2);
					}

				}
				stream_parameter_type.reset();

				// PHPAST.g:917:42: ( CONST_T )?
				if ( stream_CONST_T.hasNext() ) {
					adaptor.addChild(root_1, stream_CONST_T.nextNode());
				}
				stream_CONST_T.reset();

				adaptor.addChild(root_1, stream_pure_variable.nextTree());
				// PHPAST.g:917:65: ( default_arg )?
				if ( stream_default_arg.hasNext() ) {
					adaptor.addChild(root_1, stream_default_arg.nextTree());
				}
				stream_default_arg.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter"


	public static class parameter_type_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "parameter_type"
	// PHPAST.g:919:1: parameter_type : ( fully_qualified_class_name | cast_option );
	public final PHPASTParser.parameter_type_return parameter_type() throws RecognitionException {
		PHPASTParser.parameter_type_return retval = new PHPASTParser.parameter_type_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope fully_qualified_class_name277 =null;
		ParserRuleReturnScope cast_option278 =null;



		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:929:3: ( fully_qualified_class_name | cast_option )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==DOMAIN_T||LA80_0==IDENTIFIER||LA80_0==NAMESPACE_T) ) {
				alt80=1;
			}
			else if ( (LA80_0==CLONE_T||LA80_0==UNSET_T||(LA80_0 >= 185 && LA80_0 <= 188)||(LA80_0 >= 190 && LA80_0 <= 192)||(LA80_0 >= 196 && LA80_0 <= 197)) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// PHPAST.g:929:5: fully_qualified_class_name
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_fully_qualified_class_name_in_parameter_type3474);
					fully_qualified_class_name277=fully_qualified_class_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fully_qualified_class_name277.getTree());

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)(fully_qualified_class_name277!=null?(fully_qualified_class_name277.start):null)).getStartIndex();
					    endIndex = ((CommonToken)(fully_qualified_class_name277!=null?(fully_qualified_class_name277.stop):null)).getStopIndex();
					  }
					}
					break;
				case 2 :
					// PHPAST.g:934:5: cast_option
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_cast_option_in_parameter_type3484);
					cast_option278=cast_option();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, cast_option278.getTree());

					if ( state.backtracking==0 ) {
					    startIndex = ((CommonToken)(cast_option278!=null?(cast_option278.start):null)).getStartIndex();
					    endIndex = ((CommonToken)(cast_option278!=null?(cast_option278.stop):null)).getStopIndex();
					  }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_type"


	public static class default_arg_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "default_arg"
	// PHPAST.g:942:1: default_arg : ( scalar | array_decl );
	public final PHPASTParser.default_arg_return default_arg() throws RecognitionException {
		PHPASTParser.default_arg_return retval = new PHPASTParser.default_arg_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope scalar279 =null;
		ParserRuleReturnScope array_decl280 =null;


		try {
			// PHPAST.g:943:3: ( scalar | array_decl )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==DOMAIN_T||LA81_0==DOUBLELITERRAL||LA81_0==FLOATLITERAL||LA81_0==HERE_DOC||LA81_0==IDENTIFIER||LA81_0==INTLITERAL||LA81_0==NAMESPACE_T||LA81_0==REALLITERAL||LA81_0==STRINGLITERAL||(LA81_0 >= 176 && LA81_0 <= 182)) ) {
				alt81=1;
			}
			else if ( (LA81_0==LEFT_OPEN_RECT||LA81_0==185) ) {
				alt81=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// PHPAST.g:943:5: scalar
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_scalar_in_default_arg3504);
					scalar279=scalar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar279.getTree());

					}
					break;
				case 2 :
					// PHPAST.g:944:5: array_decl
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_array_decl_in_default_arg3510);
					array_decl280=array_decl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_decl280.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "default_arg"


	public static class variable_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "variable_list"
	// PHPAST.g:947:1: variable_list : v1= variable ( COMMA_T v2= variable )* -> ( variable )+ ;
	public final PHPASTParser.variable_list_return variable_list() throws RecognitionException {
		PHPASTParser.variable_list_return retval = new PHPASTParser.variable_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COMMA_T281=null;
		ParserRuleReturnScope v1 =null;
		ParserRuleReturnScope v2 =null;

		AST COMMA_T281_tree=null;
		RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:957:3: (v1= variable ( COMMA_T v2= variable )* -> ( variable )+ )
			// PHPAST.g:957:5: v1= variable ( COMMA_T v2= variable )*
			{
			pushFollow(FOLLOW_variable_in_variable_list3537);
			v1=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(v1.getTree());
			// PHPAST.g:957:17: ( COMMA_T v2= variable )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==COMMA_T) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// PHPAST.g:957:18: COMMA_T v2= variable
					{
					COMMA_T281=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_variable_list3540); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T281);

					pushFollow(FOLLOW_variable_in_variable_list3544);
					v2=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variable.add(v2.getTree());
					}
					break;

				default :
					break loop82;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(v1!=null?(v1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(v1!=null?(v1.stop):null);
			    if ((v2!=null?input.toString(v2.start,v2.stop):null) != null) {
			      token = (CommonToken)(v2!=null?(v2.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 967:5: -> ( variable )+
			{
				if ( !(stream_variable.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_variable.hasNext() ) {
					adaptor.addChild(root_0, stream_variable.nextTree());
				}
				stream_variable.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_list"


	public static class variable_modifiers_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "variable_modifiers"
	// PHPAST.g:970:1: variable_modifiers : ( 'var' | modifier );
	public final PHPASTParser.variable_modifiers_return variable_modifiers() throws RecognitionException {
		PHPASTParser.variable_modifiers_return retval = new PHPASTParser.variable_modifiers_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token string_literal282=null;
		ParserRuleReturnScope modifier283 =null;

		AST string_literal282_tree=null;

		try {
			// PHPAST.g:971:3: ( 'var' | modifier )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==198) ) {
				alt83=1;
			}
			else if ( (LA83_0==STATIC_T||LA83_0==184||LA83_0==189||(LA83_0 >= 193 && LA83_0 <= 195)) ) {
				alt83=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}

			switch (alt83) {
				case 1 :
					// PHPAST.g:971:5: 'var'
					{
					root_0 = (AST)adaptor.nil();


					string_literal282=(Token)match(input,198,FOLLOW_198_in_variable_modifiers3575); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal282_tree = (AST)adaptor.create(string_literal282);
					adaptor.addChild(root_0, string_literal282_tree);
					}

					}
					break;
				case 2 :
					// PHPAST.g:972:5: modifier
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_modifier_in_variable_modifiers3581);
					modifier283=modifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, modifier283.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_modifiers"


	public static class modifier_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// PHPAST.g:975:1: modifier : ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+ ;
	public final PHPASTParser.modifier_return modifier() throws RecognitionException {
		PHPASTParser.modifier_return retval = new PHPASTParser.modifier_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set284=null;

		AST set284_tree=null;

		try {
			// PHPAST.g:976:3: ( ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+ )
			// PHPAST.g:976:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+
			{
			root_0 = (AST)adaptor.nil();


			// PHPAST.g:976:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+
			int cnt84=0;
			loop84:
			while (true) {
				int alt84=2;
				int LA84_0 = input.LA(1);
				if ( (LA84_0==STATIC_T||LA84_0==184||LA84_0==189||(LA84_0 >= 193 && LA84_0 <= 195)) ) {
					alt84=1;
				}

				switch (alt84) {
				case 1 :
					// PHPAST.g:
					{
					set284=input.LT(1);
					if ( input.LA(1)==STATIC_T||input.LA(1)==184||input.LA(1)==189||(input.LA(1) >= 193 && input.LA(1) <= 195) ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set284));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt84 >= 1 ) break loop84;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(84, input);
					throw eee;
				}
				cnt84++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "modifier"


	public static class directive_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "directive"
	// PHPAST.g:984:1: directive : d1= directive_element ( COMMA_T d2= directive_element )* -> ( directive_element )+ ;
	public final PHPASTParser.directive_return directive() throws RecognitionException {
		PHPASTParser.directive_return retval = new PHPASTParser.directive_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COMMA_T285=null;
		ParserRuleReturnScope d1 =null;
		ParserRuleReturnScope d2 =null;

		AST COMMA_T285_tree=null;
		RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
		RewriteRuleSubtreeStream stream_directive_element=new RewriteRuleSubtreeStream(adaptor,"rule directive_element");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:994:3: (d1= directive_element ( COMMA_T d2= directive_element )* -> ( directive_element )+ )
			// PHPAST.g:994:5: d1= directive_element ( COMMA_T d2= directive_element )*
			{
			pushFollow(FOLLOW_directive_element_in_directive3658);
			d1=directive_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_directive_element.add(d1.getTree());
			// PHPAST.g:994:26: ( COMMA_T d2= directive_element )*
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( (LA85_0==COMMA_T) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// PHPAST.g:994:27: COMMA_T d2= directive_element
					{
					COMMA_T285=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_directive3661); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T285);

					pushFollow(FOLLOW_directive_element_in_directive3665);
					d2=directive_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_directive_element.add(d2.getTree());
					}
					break;

				default :
					break loop85;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(d1!=null?(d1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(d1!=null?(d1.stop):null);
			    if ((d2!=null?input.toString(d2.start,d2.stop):null) != null) {
			      token = (CommonToken)(d2!=null?(d2.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1004:4: -> ( directive_element )+
			{
				if ( !(stream_directive_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_directive_element.hasNext() ) {
					adaptor.addChild(root_0, stream_directive_element.nextTree());
				}
				stream_directive_element.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "directive"


	public static class directive_element_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "directive_element"
	// PHPAST.g:1007:1: directive_element : IDENTIFIER EQUAL_T expression -> ^( EQUAL_T IDENTIFIER expression ) ;
	public final PHPASTParser.directive_element_return directive_element() throws RecognitionException {
		PHPASTParser.directive_element_return retval = new PHPASTParser.directive_element_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token IDENTIFIER286=null;
		Token EQUAL_T287=null;
		ParserRuleReturnScope expression288 =null;

		AST IDENTIFIER286_tree=null;
		AST EQUAL_T287_tree=null;
		RewriteRuleTokenStream stream_EQUAL_T=new RewriteRuleTokenStream(adaptor,"token EQUAL_T");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1017:3: ( IDENTIFIER EQUAL_T expression -> ^( EQUAL_T IDENTIFIER expression ) )
			// PHPAST.g:1017:5: IDENTIFIER EQUAL_T expression
			{
			IDENTIFIER286=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_directive_element3708); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER286);

			EQUAL_T287=(Token)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_directive_element3710); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUAL_T.add(EQUAL_T287);

			pushFollow(FOLLOW_expression_in_directive_element3712);
			expression288=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression288.getTree());
			if ( state.backtracking==0 ) {
			    token = (CommonToken)IDENTIFIER286;
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(expression288!=null?(expression288.stop):null);
			    endIndex = token.getStopIndex();  
			  }
			// AST REWRITE
			// elements: EQUAL_T, IDENTIFIER, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1024:5: -> ^( EQUAL_T IDENTIFIER expression )
			{
				// PHPAST.g:1024:9: ^( EQUAL_T IDENTIFIER expression )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot(stream_EQUAL_T.nextNode(), root_1);
				adaptor.addChild(root_1, stream_IDENTIFIER.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "directive_element"


	public static class expr_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// PHPAST.g:1027:1: expr_list : e1= expression ( COMMA_T e2= expression )* -> ( expression )+ ;
	public final PHPASTParser.expr_list_return expr_list() throws RecognitionException {
		PHPASTParser.expr_list_return retval = new PHPASTParser.expr_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COMMA_T289=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST COMMA_T289_tree=null;
		RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1037:2: (e1= expression ( COMMA_T e2= expression )* -> ( expression )+ )
			// PHPAST.g:1037:4: e1= expression ( COMMA_T e2= expression )*
			{
			pushFollow(FOLLOW_expression_in_expr_list3757);
			e1=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(e1.getTree());
			// PHPAST.g:1037:18: ( COMMA_T e2= expression )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==COMMA_T) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// PHPAST.g:1037:19: COMMA_T e2= expression
					{
					COMMA_T289=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_expr_list3760); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T289);

					pushFollow(FOLLOW_expression_in_expr_list3764);
					e2=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(e2.getTree());
					}
					break;

				default :
					break loop86;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1047:5: -> ( expression )+
			{
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_0, stream_expression.nextTree());
				}
				stream_expression.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expr_list"


	public static class expression_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// PHPAST.g:1050:1: expression : logical_text_or_expr -> ^( EXPR logical_text_or_expr ) ;
	public final PHPASTParser.expression_return expression() throws RecognitionException {
		PHPASTParser.expression_return retval = new PHPASTParser.expression_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope logical_text_or_expr290 =null;

		RewriteRuleSubtreeStream stream_logical_text_or_expr=new RewriteRuleSubtreeStream(adaptor,"rule logical_text_or_expr");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1060:3: ( logical_text_or_expr -> ^( EXPR logical_text_or_expr ) )
			// PHPAST.g:1060:5: logical_text_or_expr
			{
			pushFollow(FOLLOW_logical_text_or_expr_in_expression3805);
			logical_text_or_expr290=logical_text_or_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logical_text_or_expr.add(logical_text_or_expr290.getTree());
			if ( state.backtracking==0 ) {
			    token = (CommonToken)(logical_text_or_expr290!=null?(logical_text_or_expr290.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(logical_text_or_expr290!=null?(logical_text_or_expr290.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1067:5: -> ^( EXPR logical_text_or_expr )
			{
				// PHPAST.g:1067:9: ^( EXPR logical_text_or_expr )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_logical_text_or_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class logical_text_or_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "logical_text_or_expr"
	// PHPAST.g:1070:1: logical_text_or_expr : e1= logical_text_xor_expr ( OR_T ^e2= logical_text_xor_expr )* ;
	public final PHPASTParser.logical_text_or_expr_return logical_text_or_expr() throws RecognitionException {
		PHPASTParser.logical_text_or_expr_return retval = new PHPASTParser.logical_text_or_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token OR_T291=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST OR_T291_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1080:3: (e1= logical_text_xor_expr ( OR_T ^e2= logical_text_xor_expr )* )
			// PHPAST.g:1080:5: e1= logical_text_xor_expr ( OR_T ^e2= logical_text_xor_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3848);
			e1=logical_text_xor_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1080:30: ( OR_T ^e2= logical_text_xor_expr )*
			loop87:
			while (true) {
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==OR_T) ) {
					int LA87_2 = input.LA(2);
					if ( (synpred124_PHPAST()) ) {
						alt87=1;
					}

				}

				switch (alt87) {
				case 1 :
					// PHPAST.g:1080:31: OR_T ^e2= logical_text_xor_expr
					{
					OR_T291=(Token)match(input,OR_T,FOLLOW_OR_T_in_logical_text_or_expr3851); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OR_T291_tree = (AST)adaptor.create(OR_T291);
					root_0 = (AST)adaptor.becomeRoot(OR_T291_tree, root_0);
					}

					pushFollow(FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3856);
					e2=logical_text_xor_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop87;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_text_or_expr"


	public static class logical_text_xor_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "logical_text_xor_expr"
	// PHPAST.g:1092:1: logical_text_xor_expr : e1= logical_text_and_expr ( XOR_T ^e2= logical_text_and_expr )* ;
	public final PHPASTParser.logical_text_xor_expr_return logical_text_xor_expr() throws RecognitionException {
		PHPASTParser.logical_text_xor_expr_return retval = new PHPASTParser.logical_text_xor_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token XOR_T292=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST XOR_T292_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1102:3: (e1= logical_text_and_expr ( XOR_T ^e2= logical_text_and_expr )* )
			// PHPAST.g:1102:5: e1= logical_text_and_expr ( XOR_T ^e2= logical_text_and_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3887);
			e1=logical_text_and_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1102:30: ( XOR_T ^e2= logical_text_and_expr )*
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==XOR_T) ) {
					int LA88_2 = input.LA(2);
					if ( (synpred125_PHPAST()) ) {
						alt88=1;
					}

				}

				switch (alt88) {
				case 1 :
					// PHPAST.g:1102:31: XOR_T ^e2= logical_text_and_expr
					{
					XOR_T292=(Token)match(input,XOR_T,FOLLOW_XOR_T_in_logical_text_xor_expr3890); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					XOR_T292_tree = (AST)adaptor.create(XOR_T292);
					root_0 = (AST)adaptor.becomeRoot(XOR_T292_tree, root_0);
					}

					pushFollow(FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3895);
					e2=logical_text_and_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop88;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_text_xor_expr"


	public static class logical_text_and_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "logical_text_and_expr"
	// PHPAST.g:1114:1: logical_text_and_expr : e1= assignment_expr ( AND_T ^e2= assignment_expr )* ;
	public final PHPASTParser.logical_text_and_expr_return logical_text_and_expr() throws RecognitionException {
		PHPASTParser.logical_text_and_expr_return retval = new PHPASTParser.logical_text_and_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token AND_T293=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST AND_T293_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1124:3: (e1= assignment_expr ( AND_T ^e2= assignment_expr )* )
			// PHPAST.g:1124:5: e1= assignment_expr ( AND_T ^e2= assignment_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_assignment_expr_in_logical_text_and_expr3926);
			e1=assignment_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1124:24: ( AND_T ^e2= assignment_expr )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==AND_T) ) {
					int LA89_2 = input.LA(2);
					if ( (synpred126_PHPAST()) ) {
						alt89=1;
					}

				}

				switch (alt89) {
				case 1 :
					// PHPAST.g:1124:25: AND_T ^e2= assignment_expr
					{
					AND_T293=(Token)match(input,AND_T,FOLLOW_AND_T_in_logical_text_and_expr3929); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND_T293_tree = (AST)adaptor.create(AND_T293);
					root_0 = (AST)adaptor.becomeRoot(AND_T293_tree, root_0);
					}

					pushFollow(FOLLOW_assignment_expr_in_logical_text_and_expr3934);
					e2=assignment_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop89;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_text_and_expr"


	public static class assignment_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "assignment_expr"
	// PHPAST.g:1136:1: assignment_expr : e1= conditional_expr ( assignment_operator ^e2= conditional_expr )* ;
	public final PHPASTParser.assignment_expr_return assignment_expr() throws RecognitionException {
		PHPASTParser.assignment_expr_return retval = new PHPASTParser.assignment_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope assignment_operator294 =null;



		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1146:3: (e1= conditional_expr ( assignment_operator ^e2= conditional_expr )* )
			// PHPAST.g:1146:5: e1= conditional_expr ( assignment_operator ^e2= conditional_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_conditional_expr_in_assignment_expr3965);
			e1=conditional_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1146:25: ( assignment_operator ^e2= conditional_expr )*
			loop90:
			while (true) {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( ((LA90_0 >= BIT_AND_EQ && LA90_0 <= BIT_OR_EQ)||LA90_0==DIV_EQ||LA90_0==DOT_EQ||LA90_0==EQUAL_T||LA90_0==LMOVE_EQ||LA90_0==MINUS_EQ||LA90_0==MUL_EQ||LA90_0==PERCENT_EQ||LA90_0==PLUS_EQ||LA90_0==POWER_EQ||LA90_0==RMOVE_EQ) ) {
					int LA90_2 = input.LA(2);
					if ( (synpred127_PHPAST()) ) {
						alt90=1;
					}

				}

				switch (alt90) {
				case 1 :
					// PHPAST.g:1146:26: assignment_operator ^e2= conditional_expr
					{
					pushFollow(FOLLOW_assignment_operator_in_assignment_expr3968);
					assignment_operator294=assignment_operator();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot(assignment_operator294.getTree(), root_0);
					pushFollow(FOLLOW_conditional_expr_in_assignment_expr3973);
					e2=conditional_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop90;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_expr"


	public static class assignment_operator_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "assignment_operator"
	// PHPAST.g:1158:1: assignment_operator : ( EQUAL_T | PLUS_EQ | MINUS_EQ | MUL_EQ | DIV_EQ | DOT_EQ | PERCENT_EQ | BIT_AND_EQ | BIT_OR_EQ | POWER_EQ | LMOVE_EQ | RMOVE_EQ );
	public final PHPASTParser.assignment_operator_return assignment_operator() throws RecognitionException {
		PHPASTParser.assignment_operator_return retval = new PHPASTParser.assignment_operator_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set295=null;

		AST set295_tree=null;

		try {
			// PHPAST.g:1159:3: ( EQUAL_T | PLUS_EQ | MINUS_EQ | MUL_EQ | DIV_EQ | DOT_EQ | PERCENT_EQ | BIT_AND_EQ | BIT_OR_EQ | POWER_EQ | LMOVE_EQ | RMOVE_EQ )
			// PHPAST.g:
			{
			root_0 = (AST)adaptor.nil();


			set295=input.LT(1);
			if ( (input.LA(1) >= BIT_AND_EQ && input.LA(1) <= BIT_OR_EQ)||input.LA(1)==DIV_EQ||input.LA(1)==DOT_EQ||input.LA(1)==EQUAL_T||input.LA(1)==LMOVE_EQ||input.LA(1)==MINUS_EQ||input.LA(1)==MUL_EQ||input.LA(1)==PERCENT_EQ||input.LA(1)==PLUS_EQ||input.LA(1)==POWER_EQ||input.LA(1)==RMOVE_EQ ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set295));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_operator"


	public static class conditional_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "conditional_expr"
	// PHPAST.g:1173:1: conditional_expr : (ll= logical_or_expr -> $ll) ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )? ;
	public final PHPASTParser.conditional_expr_return conditional_expr() throws RecognitionException {
		PHPASTParser.conditional_expr_return retval = new PHPASTParser.conditional_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token QUESTION_T296=null;
		Token COLON_T298=null;
		ParserRuleReturnScope ll =null;
		ParserRuleReturnScope lr =null;
		ParserRuleReturnScope expression297 =null;

		AST QUESTION_T296_tree=null;
		AST COLON_T298_tree=null;
		RewriteRuleTokenStream stream_QUESTION_T=new RewriteRuleTokenStream(adaptor,"token QUESTION_T");
		RewriteRuleTokenStream stream_COLON_T=new RewriteRuleTokenStream(adaptor,"token COLON_T");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_logical_or_expr=new RewriteRuleSubtreeStream(adaptor,"rule logical_or_expr");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1183:3: ( (ll= logical_or_expr -> $ll) ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )? )
			// PHPAST.g:1183:5: (ll= logical_or_expr -> $ll) ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )?
			{
			// PHPAST.g:1183:5: (ll= logical_or_expr -> $ll)
			// PHPAST.g:1183:6: ll= logical_or_expr
			{
			pushFollow(FOLLOW_logical_or_expr_in_conditional_expr4109);
			ll=logical_or_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logical_or_expr.add(ll.getTree());
			if ( state.backtracking==0 ) {
			    token = (CommonToken)(ll!=null?(ll.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(ll!=null?(ll.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ll=new RewriteRuleSubtreeStream(adaptor,"rule ll",ll!=null?ll.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1190:4: -> $ll
			{
				adaptor.addChild(root_0, stream_ll.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// PHPAST.g:1191:4: ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) ) )?
			int alt92=2;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==QUESTION_T) ) {
				int LA92_1 = input.LA(2);
				if ( (synpred140_PHPAST()) ) {
					alt92=1;
				}
			}
			switch (alt92) {
				case 1 :
					// PHPAST.g:1191:5: QUESTION_T ( expression )? COLON_T lr= logical_or_expr
					{
					QUESTION_T296=(Token)match(input,QUESTION_T,FOLLOW_QUESTION_T_in_conditional_expr4128); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_QUESTION_T.add(QUESTION_T296);

					// PHPAST.g:1191:16: ( expression )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( ((LA91_0 >= AT_T && LA91_0 <= BACKTRICKLITERAL)||LA91_0==CLONE_T||(LA91_0 >= DOLLAR_T && LA91_0 <= DOMAIN_T)||LA91_0==DOUBLELITERRAL||LA91_0==EXC_NOT_T||LA91_0==FLOATLITERAL||LA91_0==FUNCTION_T||LA91_0==HERE_DOC||LA91_0==IDENTIFIER||LA91_0==INTLITERAL||(LA91_0 >= LEFT_OPEN_RECT && LA91_0 <= LEFT_PARETHESIS)||LA91_0==LIST_T||(LA91_0 >= MINUS_MINUS_T && LA91_0 <= MINUS_T)||(LA91_0 >= NAMESPACE_T && LA91_0 <= NEW_T)||(LA91_0 >= PLUS_PLUS_T && LA91_0 <= PLUS_T)||LA91_0==PRINT_T||(LA91_0 >= REALLITERAL && LA91_0 <= REF_T)||LA91_0==STATIC||LA91_0==STRINGLITERAL||LA91_0==TILDA_T||LA91_0==UNSET_T||(LA91_0 >= 176 && LA91_0 <= 182)||LA91_0==185) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// PHPAST.g:1191:16: expression
							{
							pushFollow(FOLLOW_expression_in_conditional_expr4130);
							expression297=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression297.getTree());
							}
							break;

					}

					COLON_T298=(Token)match(input,COLON_T,FOLLOW_COLON_T_in_conditional_expr4133); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON_T.add(COLON_T298);

					pushFollow(FOLLOW_logical_or_expr_in_conditional_expr4137);
					lr=logical_or_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logical_or_expr.add(lr.getTree());
					if ( state.backtracking==0 ) {
					    token = (CommonToken)(lr!=null?(lr.stop):null);
					    endIndex = token.getStopIndex();
					  }
					// AST REWRITE
					// elements: expression, COLON_T, ll, QUESTION_T, lr
					// token labels: 
					// rule labels: retval, ll, lr
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_ll=new RewriteRuleSubtreeStream(adaptor,"rule ll",ll!=null?ll.getTree():null);
					RewriteRuleSubtreeStream stream_lr=new RewriteRuleSubtreeStream(adaptor,"rule lr",lr!=null?lr.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1195:5: -> ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) )
					{
						// PHPAST.g:1195:8: ^( QUESTION_T $ll ^( COLON_T ( expression )? $lr) )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_QUESTION_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_ll.nextTree());
						// PHPAST.g:1195:25: ^( COLON_T ( expression )? $lr)
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot(stream_COLON_T.nextNode(), root_2);
						// PHPAST.g:1195:35: ( expression )?
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


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional_expr"


	public static class logical_or_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "logical_or_expr"
	// PHPAST.g:1198:1: logical_or_expr : e1= logical_and_expr ( LOGICAL_OR_T ^e2= logical_and_expr )* ;
	public final PHPASTParser.logical_or_expr_return logical_or_expr() throws RecognitionException {
		PHPASTParser.logical_or_expr_return retval = new PHPASTParser.logical_or_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LOGICAL_OR_T299=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST LOGICAL_OR_T299_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1208:3: (e1= logical_and_expr ( LOGICAL_OR_T ^e2= logical_and_expr )* )
			// PHPAST.g:1208:5: e1= logical_and_expr ( LOGICAL_OR_T ^e2= logical_and_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr4187);
			e1=logical_and_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1208:25: ( LOGICAL_OR_T ^e2= logical_and_expr )*
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==LOGICAL_OR_T) ) {
					int LA93_2 = input.LA(2);
					if ( (synpred141_PHPAST()) ) {
						alt93=1;
					}

				}

				switch (alt93) {
				case 1 :
					// PHPAST.g:1208:26: LOGICAL_OR_T ^e2= logical_and_expr
					{
					LOGICAL_OR_T299=(Token)match(input,LOGICAL_OR_T,FOLLOW_LOGICAL_OR_T_in_logical_or_expr4190); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LOGICAL_OR_T299_tree = (AST)adaptor.create(LOGICAL_OR_T299);
					root_0 = (AST)adaptor.becomeRoot(LOGICAL_OR_T299_tree, root_0);
					}

					pushFollow(FOLLOW_logical_and_expr_in_logical_or_expr4195);
					e2=logical_and_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop93;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_or_expr"


	public static class logical_and_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "logical_and_expr"
	// PHPAST.g:1220:1: logical_and_expr : e1= bitwise_or_expr ( LOGICAL_AND_T ^e2= bitwise_or_expr )* ;
	public final PHPASTParser.logical_and_expr_return logical_and_expr() throws RecognitionException {
		PHPASTParser.logical_and_expr_return retval = new PHPASTParser.logical_and_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LOGICAL_AND_T300=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST LOGICAL_AND_T300_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1230:3: (e1= bitwise_or_expr ( LOGICAL_AND_T ^e2= bitwise_or_expr )* )
			// PHPAST.g:1230:5: e1= bitwise_or_expr ( LOGICAL_AND_T ^e2= bitwise_or_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_bitwise_or_expr_in_logical_and_expr4226);
			e1=bitwise_or_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1230:24: ( LOGICAL_AND_T ^e2= bitwise_or_expr )*
			loop94:
			while (true) {
				int alt94=2;
				int LA94_0 = input.LA(1);
				if ( (LA94_0==LOGICAL_AND_T) ) {
					int LA94_2 = input.LA(2);
					if ( (synpred142_PHPAST()) ) {
						alt94=1;
					}

				}

				switch (alt94) {
				case 1 :
					// PHPAST.g:1230:25: LOGICAL_AND_T ^e2= bitwise_or_expr
					{
					LOGICAL_AND_T300=(Token)match(input,LOGICAL_AND_T,FOLLOW_LOGICAL_AND_T_in_logical_and_expr4229); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LOGICAL_AND_T300_tree = (AST)adaptor.create(LOGICAL_AND_T300);
					root_0 = (AST)adaptor.becomeRoot(LOGICAL_AND_T300_tree, root_0);
					}

					pushFollow(FOLLOW_bitwise_or_expr_in_logical_and_expr4234);
					e2=bitwise_or_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop94;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logical_and_expr"


	public static class bitwise_or_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "bitwise_or_expr"
	// PHPAST.g:1242:1: bitwise_or_expr : e1= bitwise_xor_expr ( BIT_OR_T ^e2= bitwise_xor_expr )* ;
	public final PHPASTParser.bitwise_or_expr_return bitwise_or_expr() throws RecognitionException {
		PHPASTParser.bitwise_or_expr_return retval = new PHPASTParser.bitwise_or_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token BIT_OR_T301=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST BIT_OR_T301_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1252:3: (e1= bitwise_xor_expr ( BIT_OR_T ^e2= bitwise_xor_expr )* )
			// PHPAST.g:1252:5: e1= bitwise_xor_expr ( BIT_OR_T ^e2= bitwise_xor_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_bitwise_xor_expr_in_bitwise_or_expr4265);
			e1=bitwise_xor_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1252:25: ( BIT_OR_T ^e2= bitwise_xor_expr )*
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==BIT_OR_T) ) {
					int LA95_2 = input.LA(2);
					if ( (synpred143_PHPAST()) ) {
						alt95=1;
					}

				}

				switch (alt95) {
				case 1 :
					// PHPAST.g:1252:26: BIT_OR_T ^e2= bitwise_xor_expr
					{
					BIT_OR_T301=(Token)match(input,BIT_OR_T,FOLLOW_BIT_OR_T_in_bitwise_or_expr4268); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BIT_OR_T301_tree = (AST)adaptor.create(BIT_OR_T301);
					root_0 = (AST)adaptor.becomeRoot(BIT_OR_T301_tree, root_0);
					}

					pushFollow(FOLLOW_bitwise_xor_expr_in_bitwise_or_expr4273);
					e2=bitwise_xor_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop95;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwise_or_expr"


	public static class bitwise_xor_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "bitwise_xor_expr"
	// PHPAST.g:1264:1: bitwise_xor_expr : e1= bitwise_and_expr ( POWER_T ^e2= bitwise_and_expr )* ;
	public final PHPASTParser.bitwise_xor_expr_return bitwise_xor_expr() throws RecognitionException {
		PHPASTParser.bitwise_xor_expr_return retval = new PHPASTParser.bitwise_xor_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token POWER_T302=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST POWER_T302_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1274:3: (e1= bitwise_and_expr ( POWER_T ^e2= bitwise_and_expr )* )
			// PHPAST.g:1274:5: e1= bitwise_and_expr ( POWER_T ^e2= bitwise_and_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_bitwise_and_expr_in_bitwise_xor_expr4304);
			e1=bitwise_and_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1274:25: ( POWER_T ^e2= bitwise_and_expr )*
			loop96:
			while (true) {
				int alt96=2;
				int LA96_0 = input.LA(1);
				if ( (LA96_0==POWER_T) ) {
					int LA96_2 = input.LA(2);
					if ( (synpred144_PHPAST()) ) {
						alt96=1;
					}

				}

				switch (alt96) {
				case 1 :
					// PHPAST.g:1274:26: POWER_T ^e2= bitwise_and_expr
					{
					POWER_T302=(Token)match(input,POWER_T,FOLLOW_POWER_T_in_bitwise_xor_expr4307); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					POWER_T302_tree = (AST)adaptor.create(POWER_T302);
					root_0 = (AST)adaptor.becomeRoot(POWER_T302_tree, root_0);
					}

					pushFollow(FOLLOW_bitwise_and_expr_in_bitwise_xor_expr4312);
					e2=bitwise_and_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop96;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwise_xor_expr"


	public static class bitwise_and_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "bitwise_and_expr"
	// PHPAST.g:1286:1: bitwise_and_expr : e1= concat_expr ( DOT_T ^e2= concat_expr )* ;
	public final PHPASTParser.bitwise_and_expr_return bitwise_and_expr() throws RecognitionException {
		PHPASTParser.bitwise_and_expr_return retval = new PHPASTParser.bitwise_and_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token DOT_T303=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST DOT_T303_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1296:3: (e1= concat_expr ( DOT_T ^e2= concat_expr )* )
			// PHPAST.g:1296:5: e1= concat_expr ( DOT_T ^e2= concat_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_concat_expr_in_bitwise_and_expr4343);
			e1=concat_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1296:20: ( DOT_T ^e2= concat_expr )*
			loop97:
			while (true) {
				int alt97=2;
				int LA97_0 = input.LA(1);
				if ( (LA97_0==DOT_T) ) {
					int LA97_2 = input.LA(2);
					if ( (synpred145_PHPAST()) ) {
						alt97=1;
					}

				}

				switch (alt97) {
				case 1 :
					// PHPAST.g:1296:21: DOT_T ^e2= concat_expr
					{
					DOT_T303=(Token)match(input,DOT_T,FOLLOW_DOT_T_in_bitwise_and_expr4346); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT_T303_tree = (AST)adaptor.create(DOT_T303);
					root_0 = (AST)adaptor.becomeRoot(DOT_T303_tree, root_0);
					}

					pushFollow(FOLLOW_concat_expr_in_bitwise_and_expr4351);
					e2=concat_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop97;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bitwise_and_expr"


	public static class concat_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "concat_expr"
	// PHPAST.g:1308:1: concat_expr : e1= equality_expr ( REF_T ^e2= equality_expr )* ;
	public final PHPASTParser.concat_expr_return concat_expr() throws RecognitionException {
		PHPASTParser.concat_expr_return retval = new PHPASTParser.concat_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token REF_T304=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST REF_T304_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1318:3: (e1= equality_expr ( REF_T ^e2= equality_expr )* )
			// PHPAST.g:1318:5: e1= equality_expr ( REF_T ^e2= equality_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_equality_expr_in_concat_expr4382);
			e1=equality_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1318:22: ( REF_T ^e2= equality_expr )*
			loop98:
			while (true) {
				int alt98=2;
				int LA98_0 = input.LA(1);
				if ( (LA98_0==REF_T) ) {
					int LA98_2 = input.LA(2);
					if ( (synpred146_PHPAST()) ) {
						alt98=1;
					}

				}

				switch (alt98) {
				case 1 :
					// PHPAST.g:1318:23: REF_T ^e2= equality_expr
					{
					REF_T304=(Token)match(input,REF_T,FOLLOW_REF_T_in_concat_expr4385); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					REF_T304_tree = (AST)adaptor.create(REF_T304);
					root_0 = (AST)adaptor.becomeRoot(REF_T304_tree, root_0);
					}

					pushFollow(FOLLOW_equality_expr_in_concat_expr4390);
					e2=equality_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop98;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "concat_expr"


	public static class equality_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "equality_expr"
	// PHPAST.g:1330:1: equality_expr : e1= relational_expr ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) ^e2= relational_expr )* ;
	public final PHPASTParser.equality_expr_return equality_expr() throws RecognitionException {
		PHPASTParser.equality_expr_return retval = new PHPASTParser.equality_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set305=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST set305_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1340:3: (e1= relational_expr ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) ^e2= relational_expr )* )
			// PHPAST.g:1340:5: e1= relational_expr ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) ^e2= relational_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_relational_expr_in_equality_expr4421);
			e1=relational_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1340:24: ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) ^e2= relational_expr )*
			loop99:
			while (true) {
				int alt99=2;
				int LA99_0 = input.LA(1);
				if ( ((LA99_0 >= EQUAL_EQUAL_EQUAL_T && LA99_0 <= EQUAL_EQUAL_T)||(LA99_0 >= NOT_EQUAL_EQUAL_T && LA99_0 <= NOT_EQUAL_T)) ) {
					int LA99_2 = input.LA(2);
					if ( (synpred150_PHPAST()) ) {
						alt99=1;
					}

				}

				switch (alt99) {
				case 1 :
					// PHPAST.g:1340:25: ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) ^e2= relational_expr
					{
					set305=input.LT(1);
					set305=input.LT(1);
					if ( (input.LA(1) >= EQUAL_EQUAL_EQUAL_T && input.LA(1) <= EQUAL_EQUAL_T)||(input.LA(1) >= NOT_EQUAL_EQUAL_T && input.LA(1) <= NOT_EQUAL_T) ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot((AST)adaptor.create(set305), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_relational_expr_in_equality_expr4443);
					e2=relational_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop99;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality_expr"


	public static class relational_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "relational_expr"
	// PHPAST.g:1352:1: relational_expr : e1= shift_expr ( ( LT_T | MT_T | LE_T | ME_T ) ^e2= shift_expr )* ;
	public final PHPASTParser.relational_expr_return relational_expr() throws RecognitionException {
		PHPASTParser.relational_expr_return retval = new PHPASTParser.relational_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set306=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST set306_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1362:3: (e1= shift_expr ( ( LT_T | MT_T | LE_T | ME_T ) ^e2= shift_expr )* )
			// PHPAST.g:1362:5: e1= shift_expr ( ( LT_T | MT_T | LE_T | ME_T ) ^e2= shift_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_shift_expr_in_relational_expr4474);
			e1=shift_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1362:19: ( ( LT_T | MT_T | LE_T | ME_T ) ^e2= shift_expr )*
			loop100:
			while (true) {
				int alt100=2;
				int LA100_0 = input.LA(1);
				if ( (LA100_0==LE_T||LA100_0==LT_T||LA100_0==ME_T||LA100_0==MT_T) ) {
					int LA100_2 = input.LA(2);
					if ( (synpred154_PHPAST()) ) {
						alt100=1;
					}

				}

				switch (alt100) {
				case 1 :
					// PHPAST.g:1362:20: ( LT_T | MT_T | LE_T | ME_T ) ^e2= shift_expr
					{
					set306=input.LT(1);
					set306=input.LT(1);
					if ( input.LA(1)==LE_T||input.LA(1)==LT_T||input.LA(1)==ME_T||input.LA(1)==MT_T ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot((AST)adaptor.create(set306), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_shift_expr_in_relational_expr4496);
					e2=shift_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop100;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational_expr"


	public static class shift_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "shift_expr"
	// PHPAST.g:1374:1: shift_expr : e1= additive_expr ( ( LSHIFT_T | RSHIFT_T ) ^e2= additive_expr )* ;
	public final PHPASTParser.shift_expr_return shift_expr() throws RecognitionException {
		PHPASTParser.shift_expr_return retval = new PHPASTParser.shift_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set307=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST set307_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1384:3: (e1= additive_expr ( ( LSHIFT_T | RSHIFT_T ) ^e2= additive_expr )* )
			// PHPAST.g:1384:5: e1= additive_expr ( ( LSHIFT_T | RSHIFT_T ) ^e2= additive_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_additive_expr_in_shift_expr4527);
			e1=additive_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1384:22: ( ( LSHIFT_T | RSHIFT_T ) ^e2= additive_expr )*
			loop101:
			while (true) {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==LSHIFT_T||LA101_0==RSHIFT_T) ) {
					int LA101_2 = input.LA(2);
					if ( (synpred156_PHPAST()) ) {
						alt101=1;
					}

				}

				switch (alt101) {
				case 1 :
					// PHPAST.g:1384:23: ( LSHIFT_T | RSHIFT_T ) ^e2= additive_expr
					{
					set307=input.LT(1);
					set307=input.LT(1);
					if ( input.LA(1)==LSHIFT_T||input.LA(1)==RSHIFT_T ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot((AST)adaptor.create(set307), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_additive_expr_in_shift_expr4541);
					e2=additive_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop101;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "shift_expr"


	public static class additive_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "additive_expr"
	// PHPAST.g:1396:1: additive_expr : e1= multiplicative_expr ( ( PLUS_T | MINUS_T ) ^e2= multiplicative_expr )* ;
	public final PHPASTParser.additive_expr_return additive_expr() throws RecognitionException {
		PHPASTParser.additive_expr_return retval = new PHPASTParser.additive_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set308=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST set308_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1406:3: (e1= multiplicative_expr ( ( PLUS_T | MINUS_T ) ^e2= multiplicative_expr )* )
			// PHPAST.g:1406:5: e1= multiplicative_expr ( ( PLUS_T | MINUS_T ) ^e2= multiplicative_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_multiplicative_expr_in_additive_expr4572);
			e1=multiplicative_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1406:28: ( ( PLUS_T | MINUS_T ) ^e2= multiplicative_expr )*
			loop102:
			while (true) {
				int alt102=2;
				int LA102_0 = input.LA(1);
				if ( (LA102_0==MINUS_T||LA102_0==PLUS_T) ) {
					int LA102_2 = input.LA(2);
					if ( (synpred158_PHPAST()) ) {
						alt102=1;
					}

				}

				switch (alt102) {
				case 1 :
					// PHPAST.g:1406:29: ( PLUS_T | MINUS_T ) ^e2= multiplicative_expr
					{
					set308=input.LT(1);
					set308=input.LT(1);
					if ( input.LA(1)==MINUS_T||input.LA(1)==PLUS_T ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot((AST)adaptor.create(set308), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiplicative_expr_in_additive_expr4586);
					e2=multiplicative_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop102;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive_expr"


	public static class multiplicative_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "multiplicative_expr"
	// PHPAST.g:1418:1: multiplicative_expr : e1= cast_expr ( ( MUL_T | DIV_T | PERCENT_T ) ^e2= cast_expr )* ;
	public final PHPASTParser.multiplicative_expr_return multiplicative_expr() throws RecognitionException {
		PHPASTParser.multiplicative_expr_return retval = new PHPASTParser.multiplicative_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set309=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST set309_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1428:3: (e1= cast_expr ( ( MUL_T | DIV_T | PERCENT_T ) ^e2= cast_expr )* )
			// PHPAST.g:1428:5: e1= cast_expr ( ( MUL_T | DIV_T | PERCENT_T ) ^e2= cast_expr )*
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_cast_expr_in_multiplicative_expr4617);
			e1=cast_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1428:18: ( ( MUL_T | DIV_T | PERCENT_T ) ^e2= cast_expr )*
			loop103:
			while (true) {
				int alt103=2;
				int LA103_0 = input.LA(1);
				if ( (LA103_0==DIV_T||LA103_0==MUL_T||LA103_0==PERCENT_T) ) {
					int LA103_2 = input.LA(2);
					if ( (synpred161_PHPAST()) ) {
						alt103=1;
					}

				}

				switch (alt103) {
				case 1 :
					// PHPAST.g:1428:19: ( MUL_T | DIV_T | PERCENT_T ) ^e2= cast_expr
					{
					set309=input.LT(1);
					set309=input.LT(1);
					if ( input.LA(1)==DIV_T||input.LA(1)==MUL_T||input.LA(1)==PERCENT_T ) {
						input.consume();
						if ( state.backtracking==0 ) root_0 = (AST)adaptor.becomeRoot((AST)adaptor.create(set309), root_0);
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_cast_expr_in_multiplicative_expr4635);
					e2=cast_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

				default :
					break loop103;
				}
			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative_expr"


	public static class cast_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cast_expr"
	// PHPAST.g:1440:1: cast_expr : ( unary_expr | ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+ unary_expr -> ^( CAST_EXPR ( cast_option )+ unary_expr ) );
	public final PHPASTParser.cast_expr_return cast_expr() throws RecognitionException {
		PHPASTParser.cast_expr_return retval = new PHPASTParser.cast_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LEFT_PARETHESIS311=null;
		Token RIGHT_PARETHESIS313=null;
		ParserRuleReturnScope unary_expr310 =null;
		ParserRuleReturnScope cast_option312 =null;
		ParserRuleReturnScope unary_expr314 =null;

		AST LEFT_PARETHESIS311_tree=null;
		AST RIGHT_PARETHESIS313_tree=null;
		RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
		RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
		RewriteRuleSubtreeStream stream_unary_expr=new RewriteRuleSubtreeStream(adaptor,"rule unary_expr");
		RewriteRuleSubtreeStream stream_cast_option=new RewriteRuleSubtreeStream(adaptor,"rule cast_option");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1450:3: ( unary_expr | ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+ unary_expr -> ^( CAST_EXPR ( cast_option )+ unary_expr ) )
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( ((LA105_0 >= AT_T && LA105_0 <= BACKTRICKLITERAL)||LA105_0==CLONE_T||(LA105_0 >= DOLLAR_T && LA105_0 <= DOMAIN_T)||LA105_0==DOUBLELITERRAL||LA105_0==EXC_NOT_T||LA105_0==FLOATLITERAL||LA105_0==FUNCTION_T||LA105_0==HERE_DOC||LA105_0==IDENTIFIER||LA105_0==INTLITERAL||LA105_0==LEFT_OPEN_RECT||LA105_0==LIST_T||(LA105_0 >= MINUS_MINUS_T && LA105_0 <= MINUS_T)||(LA105_0 >= NAMESPACE_T && LA105_0 <= NEW_T)||(LA105_0 >= PLUS_PLUS_T && LA105_0 <= PLUS_T)||LA105_0==PRINT_T||(LA105_0 >= REALLITERAL && LA105_0 <= REF_T)||LA105_0==STATIC||LA105_0==STRINGLITERAL||LA105_0==TILDA_T||LA105_0==UNSET_T||(LA105_0 >= 176 && LA105_0 <= 182)||LA105_0==185) ) {
				alt105=1;
			}
			else if ( (LA105_0==LEFT_PARETHESIS) ) {
				switch ( input.LA(2) ) {
				case AT_T:
				case BACKTRICKLITERAL:
				case DOLLAR_T:
				case DOMAIN_T:
				case DOUBLELITERRAL:
				case EXC_NOT_T:
				case FLOATLITERAL:
				case FUNCTION_T:
				case HERE_DOC:
				case IDENTIFIER:
				case INTLITERAL:
				case LEFT_OPEN_RECT:
				case LEFT_PARETHESIS:
				case LIST_T:
				case MINUS_MINUS_T:
				case MINUS_T:
				case NAMESPACE_T:
				case NEW_T:
				case PLUS_PLUS_T:
				case PLUS_T:
				case PRINT_T:
				case REALLITERAL:
				case REF_T:
				case STATIC:
				case STRINGLITERAL:
				case TILDA_T:
				case 176:
				case 177:
				case 178:
				case 179:
				case 180:
				case 181:
				case 182:
					{
					alt105=1;
					}
					break;
				case 185:
					{
					int LA105_3 = input.LA(3);
					if ( (LA105_3==LEFT_PARETHESIS) ) {
						alt105=1;
					}
					else if ( (LA105_3==RIGHT_PARETHESIS) ) {
						alt105=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 105, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case CLONE_T:
					{
					int LA105_4 = input.LA(3);
					if ( ((LA105_4 >= DOLLAR_T && LA105_4 <= DOMAIN_T)||LA105_4==IDENTIFIER||LA105_4==NAMESPACE_T||LA105_4==STATIC) ) {
						alt105=1;
					}
					else if ( (LA105_4==RIGHT_PARETHESIS) ) {
						alt105=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 105, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case UNSET_T:
					{
					int LA105_5 = input.LA(3);
					if ( (LA105_5==LEFT_PARETHESIS) ) {
						alt105=1;
					}
					else if ( (LA105_5==RIGHT_PARETHESIS) ) {
						alt105=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 105, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 186:
				case 187:
				case 188:
				case 190:
				case 191:
				case 192:
				case 196:
				case 197:
					{
					alt105=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 105, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 105, 0, input);
				throw nvae;
			}

			switch (alt105) {
				case 1 :
					// PHPAST.g:1450:5: unary_expr
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_unary_expr_in_cast_expr4664);
					unary_expr310=unary_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_expr310.getTree());

					if ( state.backtracking==0 ) {
					    token = (CommonToken)(unary_expr310!=null?(unary_expr310.start):null);
					    startIndex = token.getStartIndex();
					    token = (CommonToken)(unary_expr310!=null?(unary_expr310.stop):null);
					    endIndex = token.getStopIndex();
					  }
					}
					break;
				case 2 :
					// PHPAST.g:1457:5: ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+ unary_expr
					{
					// PHPAST.g:1457:5: ( LEFT_PARETHESIS cast_option RIGHT_PARETHESIS )+
					int cnt104=0;
					loop104:
					while (true) {
						int alt104=2;
						int LA104_0 = input.LA(1);
						if ( (LA104_0==LEFT_PARETHESIS) ) {
							switch ( input.LA(2) ) {
							case 185:
								{
								int LA104_3 = input.LA(3);
								if ( (LA104_3==RIGHT_PARETHESIS) ) {
									alt104=1;
								}

								}
								break;
							case CLONE_T:
								{
								int LA104_4 = input.LA(3);
								if ( (LA104_4==RIGHT_PARETHESIS) ) {
									alt104=1;
								}

								}
								break;
							case UNSET_T:
								{
								int LA104_5 = input.LA(3);
								if ( (LA104_5==RIGHT_PARETHESIS) ) {
									alt104=1;
								}

								}
								break;
							case 186:
							case 187:
							case 188:
							case 190:
							case 191:
							case 192:
							case 196:
							case 197:
								{
								alt104=1;
								}
								break;
							}
						}

						switch (alt104) {
						case 1 :
							// PHPAST.g:1457:6: LEFT_PARETHESIS cast_option RIGHT_PARETHESIS
							{
							LEFT_PARETHESIS311=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_cast_expr4675); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS311);

							pushFollow(FOLLOW_cast_option_in_cast_expr4677);
							cast_option312=cast_option();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_cast_option.add(cast_option312.getTree());
							RIGHT_PARETHESIS313=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_cast_expr4679); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS313);

							}
							break;

						default :
							if ( cnt104 >= 1 ) break loop104;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(104, input);
							throw eee;
						}
						cnt104++;
					}

					pushFollow(FOLLOW_unary_expr_in_cast_expr4683);
					unary_expr314=unary_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_expr.add(unary_expr314.getTree());
					if ( state.backtracking==0 ) {
					    token = (CommonToken)LEFT_PARETHESIS311;
					    startIndex = token.getStartIndex();
					    token = (CommonToken)(unary_expr314!=null?(unary_expr314.stop):null);
					    endIndex = token.getStopIndex();
					  }
					// AST REWRITE
					// elements: unary_expr, cast_option
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1464:4: -> ^( CAST_EXPR ( cast_option )+ unary_expr )
					{
						// PHPAST.g:1464:7: ^( CAST_EXPR ( cast_option )+ unary_expr )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CAST_EXPR, "CAST_EXPR"), root_1);
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


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cast_expr"


	public static class cast_option_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cast_option"
	// PHPAST.g:1467:1: cast_option : ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'real' | 'string' | UNSET_T | CLONE_T | 'object' | 'array' );
	public final PHPASTParser.cast_option_return cast_option() throws RecognitionException {
		PHPASTParser.cast_option_return retval = new PHPASTParser.cast_option_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set315=null;

		AST set315_tree=null;

		try {
			// PHPAST.g:1468:3: ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'real' | 'string' | UNSET_T | CLONE_T | 'object' | 'array' )
			// PHPAST.g:
			{
			root_0 = (AST)adaptor.nil();


			set315=input.LT(1);
			if ( input.LA(1)==CLONE_T||input.LA(1)==UNSET_T||(input.LA(1) >= 185 && input.LA(1) <= 188)||(input.LA(1) >= 190 && input.LA(1) <= 192)||(input.LA(1) >= 196 && input.LA(1) <= 197) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set315));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cast_option"


	public static class unary_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "unary_expr"
	// PHPAST.g:1481:1: unary_expr : ( unary_symbol_list prefix_inc_dec_expr -> ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr ) | prefix_inc_dec_expr );
	public final PHPASTParser.unary_expr_return unary_expr() throws RecognitionException {
		PHPASTParser.unary_expr_return retval = new PHPASTParser.unary_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope unary_symbol_list316 =null;
		ParserRuleReturnScope prefix_inc_dec_expr317 =null;
		ParserRuleReturnScope prefix_inc_dec_expr318 =null;

		RewriteRuleSubtreeStream stream_prefix_inc_dec_expr=new RewriteRuleSubtreeStream(adaptor,"rule prefix_inc_dec_expr");
		RewriteRuleSubtreeStream stream_unary_symbol_list=new RewriteRuleSubtreeStream(adaptor,"rule unary_symbol_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1491:3: ( unary_symbol_list prefix_inc_dec_expr -> ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr ) | prefix_inc_dec_expr )
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==EXC_NOT_T||LA106_0==MINUS_T||LA106_0==PLUS_T||LA106_0==REF_T||LA106_0==TILDA_T) ) {
				alt106=1;
			}
			else if ( ((LA106_0 >= AT_T && LA106_0 <= BACKTRICKLITERAL)||LA106_0==CLONE_T||(LA106_0 >= DOLLAR_T && LA106_0 <= DOMAIN_T)||LA106_0==DOUBLELITERRAL||LA106_0==FLOATLITERAL||LA106_0==FUNCTION_T||LA106_0==HERE_DOC||LA106_0==IDENTIFIER||LA106_0==INTLITERAL||(LA106_0 >= LEFT_OPEN_RECT && LA106_0 <= LEFT_PARETHESIS)||LA106_0==LIST_T||LA106_0==MINUS_MINUS_T||(LA106_0 >= NAMESPACE_T && LA106_0 <= NEW_T)||LA106_0==PLUS_PLUS_T||LA106_0==PRINT_T||LA106_0==REALLITERAL||LA106_0==STATIC||LA106_0==STRINGLITERAL||LA106_0==UNSET_T||(LA106_0 >= 176 && LA106_0 <= 182)||LA106_0==185) ) {
				alt106=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 106, 0, input);
				throw nvae;
			}

			switch (alt106) {
				case 1 :
					// PHPAST.g:1491:5: unary_symbol_list prefix_inc_dec_expr
					{
					pushFollow(FOLLOW_unary_symbol_list_in_unary_expr4803);
					unary_symbol_list316=unary_symbol_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary_symbol_list.add(unary_symbol_list316.getTree());
					pushFollow(FOLLOW_prefix_inc_dec_expr_in_unary_expr4805);
					prefix_inc_dec_expr317=prefix_inc_dec_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_prefix_inc_dec_expr.add(prefix_inc_dec_expr317.getTree());
					if ( state.backtracking==0 ) {
					    token = (CommonToken)(unary_symbol_list316!=null?(unary_symbol_list316.start):null);
					    startIndex = token.getStartIndex();
					    token = (CommonToken)(prefix_inc_dec_expr317!=null?(prefix_inc_dec_expr317.stop):null);
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1498:5: -> ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr )
					{
						// PHPAST.g:1498:9: ^( UNARY_EXPR unary_symbol_list prefix_inc_dec_expr )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(UNARY_EXPR, "UNARY_EXPR"), root_1);
						adaptor.addChild(root_1, stream_unary_symbol_list.nextTree());
						adaptor.addChild(root_1, stream_prefix_inc_dec_expr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:1499:5: prefix_inc_dec_expr
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_prefix_inc_dec_expr_in_unary_expr4830);
					prefix_inc_dec_expr318=prefix_inc_dec_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, prefix_inc_dec_expr318.getTree());

					if ( state.backtracking==0 ) {
					    token = (CommonToken)(prefix_inc_dec_expr318!=null?(prefix_inc_dec_expr318.start):null);
					    startIndex = token.getStartIndex();
					    token = (CommonToken)(prefix_inc_dec_expr318!=null?(prefix_inc_dec_expr318.stop):null);
					    endIndex = token.getStopIndex();
					  }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_expr"


	public static class unary_symbol_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "unary_symbol_list"
	// PHPAST.g:1508:1: unary_symbol_list : ( unary_symbol )+ ;
	public final PHPASTParser.unary_symbol_list_return unary_symbol_list() throws RecognitionException {
		PHPASTParser.unary_symbol_list_return retval = new PHPASTParser.unary_symbol_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope unary_symbol319 =null;


		try {
			// PHPAST.g:1509:3: ( ( unary_symbol )+ )
			// PHPAST.g:1509:5: ( unary_symbol )+
			{
			root_0 = (AST)adaptor.nil();


			// PHPAST.g:1509:5: ( unary_symbol )+
			int cnt107=0;
			loop107:
			while (true) {
				int alt107=2;
				int LA107_0 = input.LA(1);
				if ( (LA107_0==EXC_NOT_T||LA107_0==MINUS_T||LA107_0==PLUS_T||LA107_0==REF_T||LA107_0==TILDA_T) ) {
					alt107=1;
				}

				switch (alt107) {
				case 1 :
					// PHPAST.g:1509:5: unary_symbol
					{
					pushFollow(FOLLOW_unary_symbol_in_unary_symbol_list4847);
					unary_symbol319=unary_symbol();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unary_symbol319.getTree());

					}
					break;

				default :
					if ( cnt107 >= 1 ) break loop107;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(107, input);
					throw eee;
				}
				cnt107++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_symbol_list"


	public static class unary_symbol_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "unary_symbol"
	// PHPAST.g:1512:1: unary_symbol : ( REF_T | PLUS_T | MINUS_T | TILDA_T | EXC_NOT_T );
	public final PHPASTParser.unary_symbol_return unary_symbol() throws RecognitionException {
		PHPASTParser.unary_symbol_return retval = new PHPASTParser.unary_symbol_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set320=null;

		AST set320_tree=null;

		try {
			// PHPAST.g:1513:3: ( REF_T | PLUS_T | MINUS_T | TILDA_T | EXC_NOT_T )
			// PHPAST.g:
			{
			root_0 = (AST)adaptor.nil();


			set320=input.LT(1);
			if ( input.LA(1)==EXC_NOT_T||input.LA(1)==MINUS_T||input.LA(1)==PLUS_T||input.LA(1)==REF_T||input.LA(1)==TILDA_T ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set320));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_symbol"


	public static class prefix_inc_dec_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "prefix_inc_dec_expr"
	// PHPAST.g:1516:1: prefix_inc_dec_expr : ( post_inc_dec_expr | ( plus_minus )+ post_inc_dec_expr -> ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr ) );
	public final PHPASTParser.prefix_inc_dec_expr_return prefix_inc_dec_expr() throws RecognitionException {
		PHPASTParser.prefix_inc_dec_expr_return retval = new PHPASTParser.prefix_inc_dec_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope post_inc_dec_expr321 =null;
		ParserRuleReturnScope plus_minus322 =null;
		ParserRuleReturnScope post_inc_dec_expr323 =null;

		RewriteRuleSubtreeStream stream_plus_minus=new RewriteRuleSubtreeStream(adaptor,"rule plus_minus");
		RewriteRuleSubtreeStream stream_post_inc_dec_expr=new RewriteRuleSubtreeStream(adaptor,"rule post_inc_dec_expr");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1526:3: ( post_inc_dec_expr | ( plus_minus )+ post_inc_dec_expr -> ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr ) )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( ((LA109_0 >= AT_T && LA109_0 <= BACKTRICKLITERAL)||LA109_0==CLONE_T||(LA109_0 >= DOLLAR_T && LA109_0 <= DOMAIN_T)||LA109_0==DOUBLELITERRAL||LA109_0==FLOATLITERAL||LA109_0==FUNCTION_T||LA109_0==HERE_DOC||LA109_0==IDENTIFIER||LA109_0==INTLITERAL||(LA109_0 >= LEFT_OPEN_RECT && LA109_0 <= LEFT_PARETHESIS)||LA109_0==LIST_T||(LA109_0 >= NAMESPACE_T && LA109_0 <= NEW_T)||LA109_0==PRINT_T||LA109_0==REALLITERAL||LA109_0==STATIC||LA109_0==STRINGLITERAL||LA109_0==UNSET_T||(LA109_0 >= 176 && LA109_0 <= 182)||LA109_0==185) ) {
				alt109=1;
			}
			else if ( (LA109_0==MINUS_MINUS_T||LA109_0==PLUS_PLUS_T) ) {
				alt109=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}

			switch (alt109) {
				case 1 :
					// PHPAST.g:1526:5: post_inc_dec_expr
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4904);
					post_inc_dec_expr321=post_inc_dec_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, post_inc_dec_expr321.getTree());

					if ( state.backtracking==0 ) {
					    token = (CommonToken)(post_inc_dec_expr321!=null?(post_inc_dec_expr321.start):null);
					    startIndex = token.getStartIndex();
					    token = (CommonToken)(post_inc_dec_expr321!=null?(post_inc_dec_expr321.stop):null);
					    endIndex = token.getStopIndex();
					  }
					}
					break;
				case 2 :
					// PHPAST.g:1533:5: ( plus_minus )+ post_inc_dec_expr
					{
					// PHPAST.g:1533:5: ( plus_minus )+
					int cnt108=0;
					loop108:
					while (true) {
						int alt108=2;
						int LA108_0 = input.LA(1);
						if ( (LA108_0==MINUS_MINUS_T||LA108_0==PLUS_PLUS_T) ) {
							alt108=1;
						}

						switch (alt108) {
						case 1 :
							// PHPAST.g:1533:6: plus_minus
							{
							pushFollow(FOLLOW_plus_minus_in_prefix_inc_dec_expr4915);
							plus_minus322=plus_minus();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_plus_minus.add(plus_minus322.getTree());
							}
							break;

						default :
							if ( cnt108 >= 1 ) break loop108;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(108, input);
							throw eee;
						}
						cnt108++;
					}

					pushFollow(FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4919);
					post_inc_dec_expr323=post_inc_dec_expr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_post_inc_dec_expr.add(post_inc_dec_expr323.getTree());
					if ( state.backtracking==0 ) {
					    token = (CommonToken)(plus_minus322!=null?(plus_minus322.start):null);
					    startIndex = token.getStartIndex();
					    token = (CommonToken)(post_inc_dec_expr323!=null?(post_inc_dec_expr323.stop):null);
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1540:4: -> ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr )
					{
						// PHPAST.g:1540:8: ^( PREFIX_EXPR ( plus_minus )+ post_inc_dec_expr )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(PREFIX_EXPR, "PREFIX_EXPR"), root_1);
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


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "prefix_inc_dec_expr"


	public static class post_inc_dec_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "post_inc_dec_expr"
	// PHPAST.g:1543:1: post_inc_dec_expr : ( instance_expr -> instance_expr ) ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )* ;
	public final PHPASTParser.post_inc_dec_expr_return post_inc_dec_expr() throws RecognitionException {
		PHPASTParser.post_inc_dec_expr_return retval = new PHPASTParser.post_inc_dec_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope instance_expr324 =null;
		ParserRuleReturnScope plus_minus325 =null;

		RewriteRuleSubtreeStream stream_plus_minus=new RewriteRuleSubtreeStream(adaptor,"rule plus_minus");
		RewriteRuleSubtreeStream stream_instance_expr=new RewriteRuleSubtreeStream(adaptor,"rule instance_expr");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1553:3: ( ( instance_expr -> instance_expr ) ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )* )
			// PHPAST.g:1553:5: ( instance_expr -> instance_expr ) ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )*
			{
			// PHPAST.g:1553:5: ( instance_expr -> instance_expr )
			// PHPAST.g:1553:6: instance_expr
			{
			pushFollow(FOLLOW_instance_expr_in_post_inc_dec_expr4964);
			instance_expr324=instance_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_instance_expr.add(instance_expr324.getTree());
			if ( state.backtracking==0 ) {
			    token = (CommonToken)(instance_expr324!=null?(instance_expr324.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(instance_expr324!=null?(instance_expr324.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1560:4: -> instance_expr
			{
				adaptor.addChild(root_0, stream_instance_expr.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// PHPAST.g:1561:3: ( plus_minus -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus ) )*
			loop110:
			while (true) {
				int alt110=2;
				int LA110_0 = input.LA(1);
				if ( (LA110_0==MINUS_MINUS_T||LA110_0==PLUS_PLUS_T) ) {
					int LA110_2 = input.LA(2);
					if ( (synpred182_PHPAST()) ) {
						alt110=1;
					}

				}

				switch (alt110) {
				case 1 :
					// PHPAST.g:1561:4: plus_minus
					{
					pushFollow(FOLLOW_plus_minus_in_post_inc_dec_expr4981);
					plus_minus325=plus_minus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_plus_minus.add(plus_minus325.getTree());
					if ( state.backtracking==0 ) {
					    token = (CommonToken)(plus_minus325!=null?(plus_minus325.stop):null);
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1566:4: -> ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus )
					{
						// PHPAST.g:1566:7: ^( POSTFIX_EXPR $post_inc_dec_expr plus_minus )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(POSTFIX_EXPR, "POSTFIX_EXPR"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_plus_minus.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop110;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "post_inc_dec_expr"


	public static class plus_minus_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "plus_minus"
	// PHPAST.g:1569:1: plus_minus : ( PLUS_PLUS_T | MINUS_MINUS_T );
	public final PHPASTParser.plus_minus_return plus_minus() throws RecognitionException {
		PHPASTParser.plus_minus_return retval = new PHPASTParser.plus_minus_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set326=null;

		AST set326_tree=null;

		try {
			// PHPAST.g:1570:3: ( PLUS_PLUS_T | MINUS_MINUS_T )
			// PHPAST.g:
			{
			root_0 = (AST)adaptor.nil();


			set326=input.LT(1);
			if ( input.LA(1)==MINUS_MINUS_T||input.LA(1)==PLUS_PLUS_T ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set326));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plus_minus"


	public static class instance_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "instance_expr"
	// PHPAST.g:1574:1: instance_expr : atom_expr ( INSTANCEOF_T ^ class_name_reference )? ;
	public final PHPASTParser.instance_expr_return instance_expr() throws RecognitionException {
		PHPASTParser.instance_expr_return retval = new PHPASTParser.instance_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token INSTANCEOF_T328=null;
		ParserRuleReturnScope atom_expr327 =null;
		ParserRuleReturnScope class_name_reference329 =null;

		AST INSTANCEOF_T328_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1584:3: ( atom_expr ( INSTANCEOF_T ^ class_name_reference )? )
			// PHPAST.g:1584:5: atom_expr ( INSTANCEOF_T ^ class_name_reference )?
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_atom_expr_in_instance_expr5049);
			atom_expr327=atom_expr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atom_expr327.getTree());

			// PHPAST.g:1584:15: ( INSTANCEOF_T ^ class_name_reference )?
			int alt111=2;
			int LA111_0 = input.LA(1);
			if ( (LA111_0==INSTANCEOF_T) ) {
				int LA111_1 = input.LA(2);
				if ( (synpred184_PHPAST()) ) {
					alt111=1;
				}
			}
			switch (alt111) {
				case 1 :
					// PHPAST.g:1584:16: INSTANCEOF_T ^ class_name_reference
					{
					INSTANCEOF_T328=(Token)match(input,INSTANCEOF_T,FOLLOW_INSTANCEOF_T_in_instance_expr5052); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INSTANCEOF_T328_tree = (AST)adaptor.create(INSTANCEOF_T328);
					root_0 = (AST)adaptor.becomeRoot(INSTANCEOF_T328_tree, root_0);
					}

					pushFollow(FOLLOW_class_name_reference_in_instance_expr5055);
					class_name_reference329=class_name_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, class_name_reference329.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(atom_expr327!=null?(atom_expr327.start):null);
			    startIndex = token.getStartIndex();    
			    token = (CommonToken)(atom_expr327!=null?(atom_expr327.stop):null);
			    if ((class_name_reference329!=null?input.toString(class_name_reference329.start,class_name_reference329.stop):null) != null) {
			      token = (CommonToken)(class_name_reference329!=null?(class_name_reference329.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instance_expr"


	public static class atom_expr_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "atom_expr"
	// PHPAST.g:1596:1: atom_expr : ( ( AT_T )? variable | ( AT_T )? scalar | LEFT_PARETHESIS expression RIGHT_PARETHESIS | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) | array_decl | NEW_T class_name_reference -> ^( NEW_T class_name_reference ) | CLONE_T variable -> ^( CLONE_T variable ) | lambda_function_declaration | UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS -> ^( UNSET_T variable_list ) | BACKTRICKLITERAL | PRINT_T expression -> ^( PRINT_T expression ) );
	public final PHPASTParser.atom_expr_return atom_expr() throws RecognitionException {
		PHPASTParser.atom_expr_return retval = new PHPASTParser.atom_expr_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token AT_T330=null;
		Token AT_T332=null;
		Token LEFT_PARETHESIS334=null;
		Token RIGHT_PARETHESIS336=null;
		Token LIST_T337=null;
		Token LEFT_PARETHESIS338=null;
		Token RIGHT_PARETHESIS340=null;
		Token NEW_T342=null;
		Token CLONE_T344=null;
		Token UNSET_T347=null;
		Token LEFT_PARETHESIS348=null;
		Token RIGHT_PARETHESIS350=null;
		Token BACKTRICKLITERAL351=null;
		Token PRINT_T352=null;
		ParserRuleReturnScope variable331 =null;
		ParserRuleReturnScope scalar333 =null;
		ParserRuleReturnScope expression335 =null;
		ParserRuleReturnScope assignment_list339 =null;
		ParserRuleReturnScope array_decl341 =null;
		ParserRuleReturnScope class_name_reference343 =null;
		ParserRuleReturnScope variable345 =null;
		ParserRuleReturnScope lambda_function_declaration346 =null;
		ParserRuleReturnScope variable_list349 =null;
		ParserRuleReturnScope expression353 =null;

		AST AT_T330_tree=null;
		AST AT_T332_tree=null;
		AST LEFT_PARETHESIS334_tree=null;
		AST RIGHT_PARETHESIS336_tree=null;
		AST LIST_T337_tree=null;
		AST LEFT_PARETHESIS338_tree=null;
		AST RIGHT_PARETHESIS340_tree=null;
		AST NEW_T342_tree=null;
		AST CLONE_T344_tree=null;
		AST UNSET_T347_tree=null;
		AST LEFT_PARETHESIS348_tree=null;
		AST RIGHT_PARETHESIS350_tree=null;
		AST BACKTRICKLITERAL351_tree=null;
		AST PRINT_T352_tree=null;
		RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
		RewriteRuleTokenStream stream_PRINT_T=new RewriteRuleTokenStream(adaptor,"token PRINT_T");
		RewriteRuleTokenStream stream_UNSET_T=new RewriteRuleTokenStream(adaptor,"token UNSET_T");
		RewriteRuleTokenStream stream_LIST_T=new RewriteRuleTokenStream(adaptor,"token LIST_T");
		RewriteRuleTokenStream stream_NEW_T=new RewriteRuleTokenStream(adaptor,"token NEW_T");
		RewriteRuleTokenStream stream_CLONE_T=new RewriteRuleTokenStream(adaptor,"token CLONE_T");
		RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_variable_list=new RewriteRuleSubtreeStream(adaptor,"rule variable_list");
		RewriteRuleSubtreeStream stream_class_name_reference=new RewriteRuleSubtreeStream(adaptor,"rule class_name_reference");
		RewriteRuleSubtreeStream stream_assignment_list=new RewriteRuleSubtreeStream(adaptor,"rule assignment_list");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1606:3: ( ( AT_T )? variable | ( AT_T )? scalar | LEFT_PARETHESIS expression RIGHT_PARETHESIS | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) | array_decl | NEW_T class_name_reference -> ^( NEW_T class_name_reference ) | CLONE_T variable -> ^( CLONE_T variable ) | lambda_function_declaration | UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS -> ^( UNSET_T variable_list ) | BACKTRICKLITERAL | PRINT_T expression -> ^( PRINT_T expression ) )
			int alt114=11;
			alt114 = dfa114.predict(input);
			switch (alt114) {
				case 1 :
					// PHPAST.g:1606:6: ( AT_T )? variable
					{
					root_0 = (AST)adaptor.nil();


					// PHPAST.g:1606:6: ( AT_T )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==AT_T) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// PHPAST.g:1606:6: AT_T
							{
							AT_T330=(Token)match(input,AT_T,FOLLOW_AT_T_in_atom_expr5087); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AT_T330_tree = (AST)adaptor.create(AT_T330);
							adaptor.addChild(root_0, AT_T330_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_variable_in_atom_expr5090);
					variable331=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable331.getTree());

					if ( state.backtracking==0 ) {
					      token = (CommonToken)(variable331!=null?(variable331.start):null);
					      if ((AT_T330!=null?AT_T330.getText():null) != null) {
					        token = (CommonToken)AT_T330;
					      }
					      startIndex = token.getStartIndex();
					      token = (CommonToken)(variable331!=null?(variable331.stop):null);
					      endIndex = token.getStopIndex();
					    }
					}
					break;
				case 2 :
					// PHPAST.g:1616:6: ( AT_T )? scalar
					{
					root_0 = (AST)adaptor.nil();


					// PHPAST.g:1616:6: ( AT_T )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==AT_T) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// PHPAST.g:1616:6: AT_T
							{
							AT_T332=(Token)match(input,AT_T,FOLLOW_AT_T_in_atom_expr5103); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AT_T332_tree = (AST)adaptor.create(AT_T332);
							adaptor.addChild(root_0, AT_T332_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_scalar_in_atom_expr5106);
					scalar333=scalar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalar333.getTree());

					if ( state.backtracking==0 ) {
					      token = (CommonToken)(scalar333!=null?(scalar333.start):null);
					      if ((AT_T332!=null?AT_T332.getText():null) != null) {
					        token = (CommonToken)AT_T332;
					      }
					      startIndex = token.getStartIndex();
					      token = (CommonToken)(scalar333!=null?(scalar333.stop):null);
					      endIndex = token.getStopIndex();
					    }
					}
					break;
				case 3 :
					// PHPAST.g:1626:6: LEFT_PARETHESIS expression RIGHT_PARETHESIS
					{
					root_0 = (AST)adaptor.nil();


					LEFT_PARETHESIS334=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr5119); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PARETHESIS334_tree = (AST)adaptor.create(LEFT_PARETHESIS334);
					adaptor.addChild(root_0, LEFT_PARETHESIS334_tree);
					}

					pushFollow(FOLLOW_expression_in_atom_expr5121);
					expression335=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression335.getTree());

					RIGHT_PARETHESIS336=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr5123); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PARETHESIS336_tree = (AST)adaptor.create(RIGHT_PARETHESIS336);
					adaptor.addChild(root_0, RIGHT_PARETHESIS336_tree);
					}

					if ( state.backtracking==0 ) {
					      token = (CommonToken)LEFT_PARETHESIS334;
					      startIndex = token.getStartIndex();
					      token = (CommonToken)RIGHT_PARETHESIS336;
					      endIndex = token.getStopIndex();
					    }
					}
					break;
				case 4 :
					// PHPAST.g:1633:6: LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS
					{
					LIST_T337=(Token)match(input,LIST_T,FOLLOW_LIST_T_in_atom_expr5136); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LIST_T.add(LIST_T337);

					LEFT_PARETHESIS338=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr5138); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS338);

					pushFollow(FOLLOW_assignment_list_in_atom_expr5140);
					assignment_list339=assignment_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list339.getTree());
					RIGHT_PARETHESIS340=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr5142); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS340);

					if ( state.backtracking==0 ) {
					      token = (CommonToken)LIST_T337;
					      startIndex = token.getStartIndex();
					      token = (CommonToken)RIGHT_PARETHESIS340;
					      endIndex = token.getStopIndex();
					    }
					// AST REWRITE
					// elements: LIST_T, assignment_list
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1640:6: -> ^( LIST_T assignment_list )
					{
						// PHPAST.g:1640:10: ^( LIST_T assignment_list )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_LIST_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_assignment_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// PHPAST.g:1641:6: array_decl
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_array_decl_in_atom_expr5169);
					array_decl341=array_decl();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, array_decl341.getTree());

					}
					break;
				case 6 :
					// PHPAST.g:1642:6: NEW_T class_name_reference
					{
					NEW_T342=(Token)match(input,NEW_T,FOLLOW_NEW_T_in_atom_expr5176); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NEW_T.add(NEW_T342);

					pushFollow(FOLLOW_class_name_reference_in_atom_expr5178);
					class_name_reference343=class_name_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_class_name_reference.add(class_name_reference343.getTree());
					if ( state.backtracking==0 ) {
					      token = (CommonToken)NEW_T342;
					      startIndex = token.getStartIndex();
					      token = (CommonToken)(class_name_reference343!=null?(class_name_reference343.stop):null);
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1649:4: -> ^( NEW_T class_name_reference )
					{
						// PHPAST.g:1649:8: ^( NEW_T class_name_reference )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_NEW_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_class_name_reference.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// PHPAST.g:1650:6: CLONE_T variable
					{
					CLONE_T344=(Token)match(input,CLONE_T,FOLLOW_CLONE_T_in_atom_expr5205); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_CLONE_T.add(CLONE_T344);

					pushFollow(FOLLOW_variable_in_atom_expr5207);
					variable345=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variable.add(variable345.getTree());
					if ( state.backtracking==0 ) {
					      token = (CommonToken)CLONE_T344;
					      startIndex = token.getStartIndex();
					      token = (CommonToken)(variable345!=null?(variable345.stop):null);
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1657:4: -> ^( CLONE_T variable )
					{
						// PHPAST.g:1657:8: ^( CLONE_T variable )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_CLONE_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_variable.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// PHPAST.g:1668:6: lambda_function_declaration
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_lambda_function_declaration_in_atom_expr5242);
					lambda_function_declaration346=lambda_function_declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lambda_function_declaration346.getTree());

					}
					break;
				case 9 :
					// PHPAST.g:1669:6: UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS
					{
					UNSET_T347=(Token)match(input,UNSET_T,FOLLOW_UNSET_T_in_atom_expr5249); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_UNSET_T.add(UNSET_T347);

					LEFT_PARETHESIS348=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_atom_expr5251); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS348);

					pushFollow(FOLLOW_variable_list_in_atom_expr5253);
					variable_list349=variable_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_variable_list.add(variable_list349.getTree());
					RIGHT_PARETHESIS350=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_atom_expr5255); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS350);

					if ( state.backtracking==0 ) {
					      token = (CommonToken)UNSET_T347;
					      startIndex = token.getStartIndex();
					      token = (CommonToken)RIGHT_PARETHESIS350;
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1676:5: -> ^( UNSET_T variable_list )
					{
						// PHPAST.g:1676:9: ^( UNSET_T variable_list )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_UNSET_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_variable_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 10 :
					// PHPAST.g:1677:6: BACKTRICKLITERAL
					{
					root_0 = (AST)adaptor.nil();


					BACKTRICKLITERAL351=(Token)match(input,BACKTRICKLITERAL,FOLLOW_BACKTRICKLITERAL_in_atom_expr5279); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					BACKTRICKLITERAL351_tree = (AST)adaptor.create(BACKTRICKLITERAL351);
					adaptor.addChild(root_0, BACKTRICKLITERAL351_tree);
					}

					if ( state.backtracking==0 ) {
					      token = (CommonToken)BACKTRICKLITERAL351;
					      startIndex = token.getStartIndex();
					      endIndex = token.getStopIndex();
					    }
					}
					break;
				case 11 :
					// PHPAST.g:1683:6: PRINT_T expression
					{
					PRINT_T352=(Token)match(input,PRINT_T,FOLLOW_PRINT_T_in_atom_expr5292); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_PRINT_T.add(PRINT_T352);

					pushFollow(FOLLOW_expression_in_atom_expr5294);
					expression353=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression353.getTree());
					if ( state.backtracking==0 ) {
					      token = (CommonToken)PRINT_T352;
					      startIndex = token.getStartIndex();
					      if ((expression353!=null?input.toString(expression353.start,expression353.stop):null) != null) {
					        token = (CommonToken)(expression353!=null?(expression353.stop):null);
					      }
					      endIndex = token.getStopIndex();
					    }
					// AST REWRITE
					// elements: expression, PRINT_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1692:4: -> ^( PRINT_T expression )
					{
						// PHPAST.g:1692:7: ^( PRINT_T expression )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_PRINT_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom_expr"


	public static class array_decl_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "array_decl"
	// PHPAST.g:1696:1: array_decl : ( ( ( 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS ) ) | ( ( LEFT_OPEN_RECT ( array_pair_list )? RIGHT_OPEN_RECT ) ) -> ^( ARRAY_DECL ( array_pair_list )? ) );
	public final PHPASTParser.array_decl_return array_decl() throws RecognitionException {
		PHPASTParser.array_decl_return retval = new PHPASTParser.array_decl_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token string_literal354=null;
		Token LEFT_PARETHESIS355=null;
		Token RIGHT_PARETHESIS357=null;
		Token LEFT_OPEN_RECT358=null;
		Token RIGHT_OPEN_RECT360=null;
		ParserRuleReturnScope array_pair_list356 =null;
		ParserRuleReturnScope array_pair_list359 =null;

		AST string_literal354_tree=null;
		AST LEFT_PARETHESIS355_tree=null;
		AST RIGHT_PARETHESIS357_tree=null;
		AST LEFT_OPEN_RECT358_tree=null;
		AST RIGHT_OPEN_RECT360_tree=null;
		RewriteRuleTokenStream stream_RIGHT_OPEN_RECT=new RewriteRuleTokenStream(adaptor,"token RIGHT_OPEN_RECT");
		RewriteRuleTokenStream stream_LEFT_OPEN_RECT=new RewriteRuleTokenStream(adaptor,"token LEFT_OPEN_RECT");
		RewriteRuleSubtreeStream stream_array_pair_list=new RewriteRuleSubtreeStream(adaptor,"rule array_pair_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1706:3: ( ( ( 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS ) ) | ( ( LEFT_OPEN_RECT ( array_pair_list )? RIGHT_OPEN_RECT ) ) -> ^( ARRAY_DECL ( array_pair_list )? ) )
			int alt117=2;
			int LA117_0 = input.LA(1);
			if ( (LA117_0==185) ) {
				alt117=1;
			}
			else if ( (LA117_0==LEFT_OPEN_RECT) ) {
				alt117=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 117, 0, input);
				throw nvae;
			}

			switch (alt117) {
				case 1 :
					// PHPAST.g:1706:5: ( ( 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS ) )
					{
					root_0 = (AST)adaptor.nil();


					// PHPAST.g:1706:5: ( ( 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS ) )
					// PHPAST.g:1706:7: ( 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS )
					{
					// PHPAST.g:1706:7: ( 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS )
					// PHPAST.g:1706:8: 'array' LEFT_PARETHESIS ( array_pair_list )? RIGHT_PARETHESIS
					{
					string_literal354=(Token)match(input,185,FOLLOW_185_in_array_decl5339); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal354_tree = (AST)adaptor.create(string_literal354);
					adaptor.addChild(root_0, string_literal354_tree);
					}

					LEFT_PARETHESIS355=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_array_decl5341); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT_PARETHESIS355_tree = (AST)adaptor.create(LEFT_PARETHESIS355);
					adaptor.addChild(root_0, LEFT_PARETHESIS355_tree);
					}

					// PHPAST.g:1706:32: ( array_pair_list )?
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( ((LA115_0 >= AT_T && LA115_0 <= BACKTRICKLITERAL)||LA115_0==CLONE_T||(LA115_0 >= DOLLAR_T && LA115_0 <= DOMAIN_T)||LA115_0==DOUBLELITERRAL||LA115_0==EXC_NOT_T||LA115_0==FLOATLITERAL||LA115_0==FUNCTION_T||LA115_0==HERE_DOC||LA115_0==IDENTIFIER||LA115_0==INTLITERAL||(LA115_0 >= LEFT_OPEN_RECT && LA115_0 <= LEFT_PARETHESIS)||LA115_0==LIST_T||(LA115_0 >= MINUS_MINUS_T && LA115_0 <= MINUS_T)||(LA115_0 >= NAMESPACE_T && LA115_0 <= NEW_T)||(LA115_0 >= PLUS_PLUS_T && LA115_0 <= PLUS_T)||LA115_0==PRINT_T||(LA115_0 >= REALLITERAL && LA115_0 <= REF_T)||LA115_0==STATIC||LA115_0==STRINGLITERAL||LA115_0==TILDA_T||LA115_0==UNSET_T||(LA115_0 >= 176 && LA115_0 <= 182)||LA115_0==185) ) {
						alt115=1;
					}
					switch (alt115) {
						case 1 :
							// PHPAST.g:1706:32: array_pair_list
							{
							pushFollow(FOLLOW_array_pair_list_in_array_decl5343);
							array_pair_list356=array_pair_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, array_pair_list356.getTree());

							}
							break;

					}

					RIGHT_PARETHESIS357=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_array_decl5346); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT_PARETHESIS357_tree = (AST)adaptor.create(RIGHT_PARETHESIS357);
					adaptor.addChild(root_0, RIGHT_PARETHESIS357_tree);
					}

					}

					if ( state.backtracking==0 ) {
					     token = (CommonToken)LEFT_PARETHESIS355;
					     startIndex = token.getStartIndex() - 5;
					     token = (CommonToken)RIGHT_PARETHESIS357;
					     endIndex = token.getStopIndex();
					   }
					}

					}
					break;
				case 2 :
					// PHPAST.g:1713:5: ( ( LEFT_OPEN_RECT ( array_pair_list )? RIGHT_OPEN_RECT ) )
					{
					// PHPAST.g:1713:5: ( ( LEFT_OPEN_RECT ( array_pair_list )? RIGHT_OPEN_RECT ) )
					// PHPAST.g:1713:6: ( LEFT_OPEN_RECT ( array_pair_list )? RIGHT_OPEN_RECT )
					{
					// PHPAST.g:1713:6: ( LEFT_OPEN_RECT ( array_pair_list )? RIGHT_OPEN_RECT )
					// PHPAST.g:1713:7: LEFT_OPEN_RECT ( array_pair_list )? RIGHT_OPEN_RECT
					{
					LEFT_OPEN_RECT358=(Token)match(input,LEFT_OPEN_RECT,FOLLOW_LEFT_OPEN_RECT_in_array_decl5360); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_OPEN_RECT.add(LEFT_OPEN_RECT358);

					// PHPAST.g:1713:22: ( array_pair_list )?
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( ((LA116_0 >= AT_T && LA116_0 <= BACKTRICKLITERAL)||LA116_0==CLONE_T||(LA116_0 >= DOLLAR_T && LA116_0 <= DOMAIN_T)||LA116_0==DOUBLELITERRAL||LA116_0==EXC_NOT_T||LA116_0==FLOATLITERAL||LA116_0==FUNCTION_T||LA116_0==HERE_DOC||LA116_0==IDENTIFIER||LA116_0==INTLITERAL||(LA116_0 >= LEFT_OPEN_RECT && LA116_0 <= LEFT_PARETHESIS)||LA116_0==LIST_T||(LA116_0 >= MINUS_MINUS_T && LA116_0 <= MINUS_T)||(LA116_0 >= NAMESPACE_T && LA116_0 <= NEW_T)||(LA116_0 >= PLUS_PLUS_T && LA116_0 <= PLUS_T)||LA116_0==PRINT_T||(LA116_0 >= REALLITERAL && LA116_0 <= REF_T)||LA116_0==STATIC||LA116_0==STRINGLITERAL||LA116_0==TILDA_T||LA116_0==UNSET_T||(LA116_0 >= 176 && LA116_0 <= 182)||LA116_0==185) ) {
						alt116=1;
					}
					switch (alt116) {
						case 1 :
							// PHPAST.g:1713:22: array_pair_list
							{
							pushFollow(FOLLOW_array_pair_list_in_array_decl5362);
							array_pair_list359=array_pair_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_array_pair_list.add(array_pair_list359.getTree());
							}
							break;

					}

					RIGHT_OPEN_RECT360=(Token)match(input,RIGHT_OPEN_RECT,FOLLOW_RIGHT_OPEN_RECT_in_array_decl5365); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_OPEN_RECT.add(RIGHT_OPEN_RECT360);

					}

					if ( state.backtracking==0 ) {
					     token = (CommonToken)LEFT_OPEN_RECT358;
					     startIndex = token.getStartIndex();
					     token = (CommonToken)RIGHT_OPEN_RECT360;
					     endIndex = token.getStopIndex();
					  }
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1720:3: -> ^( ARRAY_DECL ( array_pair_list )? )
					{
						// PHPAST.g:1720:7: ^( ARRAY_DECL ( array_pair_list )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(ARRAY_DECL, "ARRAY_DECL"), root_1);
						// PHPAST.g:1720:20: ( array_pair_list )?
						if ( stream_array_pair_list.hasNext() ) {
							adaptor.addChild(root_1, stream_array_pair_list.nextTree());
						}
						stream_array_pair_list.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST exprToken = retval.tree;
			  exprToken.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_decl"


	public static class lambda_function_declaration_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "lambda_function_declaration"
	// PHPAST.g:1723:1: lambda_function_declaration : FUNCTION_T ( REF_T )? LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS ( USE_T LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS )? block -> ^( METHOD_DECL ( REF_T )? ( parameter_list )? ( ^( USE_T ( expr_list )? ) )? block ) ;
	public final PHPASTParser.lambda_function_declaration_return lambda_function_declaration() throws RecognitionException {
		PHPASTParser.lambda_function_declaration_return retval = new PHPASTParser.lambda_function_declaration_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token FUNCTION_T361=null;
		Token REF_T362=null;
		Token LEFT_PARETHESIS363=null;
		Token RIGHT_PARETHESIS365=null;
		Token USE_T366=null;
		Token LEFT_PARETHESIS367=null;
		Token RIGHT_PARETHESIS369=null;
		ParserRuleReturnScope parameter_list364 =null;
		ParserRuleReturnScope expr_list368 =null;
		ParserRuleReturnScope block370 =null;

		AST FUNCTION_T361_tree=null;
		AST REF_T362_tree=null;
		AST LEFT_PARETHESIS363_tree=null;
		AST RIGHT_PARETHESIS365_tree=null;
		AST USE_T366_tree=null;
		AST LEFT_PARETHESIS367_tree=null;
		AST RIGHT_PARETHESIS369_tree=null;
		RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
		RewriteRuleTokenStream stream_REF_T=new RewriteRuleTokenStream(adaptor,"token REF_T");
		RewriteRuleTokenStream stream_USE_T=new RewriteRuleTokenStream(adaptor,"token USE_T");
		RewriteRuleTokenStream stream_FUNCTION_T=new RewriteRuleTokenStream(adaptor,"token FUNCTION_T");
		RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");

		try {
			// PHPAST.g:1724:3: ( FUNCTION_T ( REF_T )? LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS ( USE_T LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS )? block -> ^( METHOD_DECL ( REF_T )? ( parameter_list )? ( ^( USE_T ( expr_list )? ) )? block ) )
			// PHPAST.g:1724:5: FUNCTION_T ( REF_T )? LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS ( USE_T LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS )? block
			{
			FUNCTION_T361=(Token)match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_lambda_function_declaration5396); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FUNCTION_T.add(FUNCTION_T361);

			// PHPAST.g:1724:16: ( REF_T )?
			int alt118=2;
			int LA118_0 = input.LA(1);
			if ( (LA118_0==REF_T) ) {
				alt118=1;
			}
			switch (alt118) {
				case 1 :
					// PHPAST.g:1724:16: REF_T
					{
					REF_T362=(Token)match(input,REF_T,FOLLOW_REF_T_in_lambda_function_declaration5398); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REF_T.add(REF_T362);

					}
					break;

			}

			LEFT_PARETHESIS363=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_lambda_function_declaration5401); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS363);

			// PHPAST.g:1724:39: ( parameter_list )?
			int alt119=2;
			int LA119_0 = input.LA(1);
			if ( (LA119_0==CLONE_T||LA119_0==CONST_T||(LA119_0 >= DOLLAR_T && LA119_0 <= DOMAIN_T)||LA119_0==IDENTIFIER||LA119_0==NAMESPACE_T||LA119_0==REF_T||LA119_0==UNSET_T||(LA119_0 >= 185 && LA119_0 <= 188)||(LA119_0 >= 190 && LA119_0 <= 192)||(LA119_0 >= 196 && LA119_0 <= 197)) ) {
				alt119=1;
			}
			switch (alt119) {
				case 1 :
					// PHPAST.g:1724:39: parameter_list
					{
					pushFollow(FOLLOW_parameter_list_in_lambda_function_declaration5403);
					parameter_list364=parameter_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list364.getTree());
					}
					break;

			}

			RIGHT_PARETHESIS365=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_lambda_function_declaration5406); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS365);

			// PHPAST.g:1724:72: ( USE_T LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS )?
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==USE_T) ) {
				alt121=1;
			}
			switch (alt121) {
				case 1 :
					// PHPAST.g:1724:73: USE_T LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS
					{
					USE_T366=(Token)match(input,USE_T,FOLLOW_USE_T_in_lambda_function_declaration5409); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_USE_T.add(USE_T366);

					LEFT_PARETHESIS367=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_lambda_function_declaration5411); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS367);

					// PHPAST.g:1724:95: ( expr_list )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( ((LA120_0 >= AT_T && LA120_0 <= BACKTRICKLITERAL)||LA120_0==CLONE_T||(LA120_0 >= DOLLAR_T && LA120_0 <= DOMAIN_T)||LA120_0==DOUBLELITERRAL||LA120_0==EXC_NOT_T||LA120_0==FLOATLITERAL||LA120_0==FUNCTION_T||LA120_0==HERE_DOC||LA120_0==IDENTIFIER||LA120_0==INTLITERAL||(LA120_0 >= LEFT_OPEN_RECT && LA120_0 <= LEFT_PARETHESIS)||LA120_0==LIST_T||(LA120_0 >= MINUS_MINUS_T && LA120_0 <= MINUS_T)||(LA120_0 >= NAMESPACE_T && LA120_0 <= NEW_T)||(LA120_0 >= PLUS_PLUS_T && LA120_0 <= PLUS_T)||LA120_0==PRINT_T||(LA120_0 >= REALLITERAL && LA120_0 <= REF_T)||LA120_0==STATIC||LA120_0==STRINGLITERAL||LA120_0==TILDA_T||LA120_0==UNSET_T||(LA120_0 >= 176 && LA120_0 <= 182)||LA120_0==185) ) {
						alt120=1;
					}
					switch (alt120) {
						case 1 :
							// PHPAST.g:1724:95: expr_list
							{
							pushFollow(FOLLOW_expr_list_in_lambda_function_declaration5413);
							expr_list368=expr_list();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expr_list.add(expr_list368.getTree());
							}
							break;

					}

					RIGHT_PARETHESIS369=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_lambda_function_declaration5416); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS369);

					}
					break;

			}

			pushFollow(FOLLOW_block_in_lambda_function_declaration5424);
			block370=block();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_block.add(block370.getTree());
			// AST REWRITE
			// elements: block, expr_list, parameter_list, USE_T, REF_T
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1726:3: -> ^( METHOD_DECL ( REF_T )? ( parameter_list )? ( ^( USE_T ( expr_list )? ) )? block )
			{
				// PHPAST.g:1726:7: ^( METHOD_DECL ( REF_T )? ( parameter_list )? ( ^( USE_T ( expr_list )? ) )? block )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(METHOD_DECL, "METHOD_DECL"), root_1);
				// PHPAST.g:1726:21: ( REF_T )?
				if ( stream_REF_T.hasNext() ) {
					adaptor.addChild(root_1, stream_REF_T.nextNode());
				}
				stream_REF_T.reset();

				// PHPAST.g:1726:28: ( parameter_list )?
				if ( stream_parameter_list.hasNext() ) {
					adaptor.addChild(root_1, stream_parameter_list.nextTree());
				}
				stream_parameter_list.reset();

				// PHPAST.g:1726:44: ( ^( USE_T ( expr_list )? ) )?
				if ( stream_expr_list.hasNext()||stream_USE_T.hasNext() ) {
					// PHPAST.g:1726:44: ^( USE_T ( expr_list )? )
					{
					AST root_2 = (AST)adaptor.nil();
					root_2 = (AST)adaptor.becomeRoot(stream_USE_T.nextNode(), root_2);
					// PHPAST.g:1726:52: ( expr_list )?
					if ( stream_expr_list.hasNext() ) {
						adaptor.addChild(root_2, stream_expr_list.nextTree());
					}
					stream_expr_list.reset();

					adaptor.addChild(root_1, root_2);
					}

				}
				stream_expr_list.reset();
				stream_USE_T.reset();

				adaptor.addChild(root_1, stream_block.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lambda_function_declaration"


	public static class class_name_reference_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "class_name_reference"
	// PHPAST.g:1730:1: class_name_reference : ( dynamic_name_reference | fully_qualified_class_name );
	public final PHPASTParser.class_name_reference_return class_name_reference() throws RecognitionException {
		PHPASTParser.class_name_reference_return retval = new PHPASTParser.class_name_reference_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope dynamic_name_reference371 =null;
		ParserRuleReturnScope fully_qualified_class_name372 =null;


		try {
			// PHPAST.g:1731:3: ( dynamic_name_reference | fully_qualified_class_name )
			int alt122=2;
			alt122 = dfa122.predict(input);
			switch (alt122) {
				case 1 :
					// PHPAST.g:1731:5: dynamic_name_reference
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_dynamic_name_reference_in_class_name_reference5471);
					dynamic_name_reference371=dynamic_name_reference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dynamic_name_reference371.getTree());

					}
					break;
				case 2 :
					// PHPAST.g:1732:5: fully_qualified_class_name
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_fully_qualified_class_name_in_class_name_reference5477);
					fully_qualified_class_name372=fully_qualified_class_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fully_qualified_class_name372.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "class_name_reference"


	public static class dynamic_name_reference_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "dynamic_name_reference"
	// PHPAST.g:1735:1: dynamic_name_reference : ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )* ;
	public final PHPASTParser.dynamic_name_reference_return dynamic_name_reference() throws RecognitionException {
		PHPASTParser.dynamic_name_reference_return retval = new PHPASTParser.dynamic_name_reference_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token SINGLE_ARROW_T374=null;
		ParserRuleReturnScope base_variable_with_function_calls373 =null;
		ParserRuleReturnScope object_property375 =null;
		ParserRuleReturnScope ctor_arguments376 =null;

		AST SINGLE_ARROW_T374_tree=null;
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
			// PHPAST.g:1770:3: ( ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )* )
			// PHPAST.g:1770:5: ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )*
			{
			// PHPAST.g:1770:5: ( base_variable_with_function_calls -> base_variable_with_function_calls )
			// PHPAST.g:1770:6: base_variable_with_function_calls
			{
			pushFollow(FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference5505);
			base_variable_with_function_calls373=base_variable_with_function_calls();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_base_variable_with_function_calls.add(base_variable_with_function_calls373.getTree());
			if ( state.backtracking==0 ) {
			      token = (CommonToken)(base_variable_with_function_calls373!=null?(base_variable_with_function_calls373.start):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1776:7: -> base_variable_with_function_calls
			{
				adaptor.addChild(root_0, stream_base_variable_with_function_calls.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// PHPAST.g:1777:5: ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? ) )*
			loop124:
			while (true) {
				int alt124=2;
				int LA124_0 = input.LA(1);
				if ( (LA124_0==SINGLE_ARROW_T) ) {
					alt124=1;
				}

				switch (alt124) {
				case 1 :
					// PHPAST.g:1777:6: SINGLE_ARROW_T object_property ( ctor_arguments )?
					{
					SINGLE_ARROW_T374=(Token)match(input,SINGLE_ARROW_T,FOLLOW_SINGLE_ARROW_T_in_dynamic_name_reference5530); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SINGLE_ARROW_T.add(SINGLE_ARROW_T374);

					pushFollow(FOLLOW_object_property_in_dynamic_name_reference5532);
					object_property375=object_property();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_object_property.add(object_property375.getTree());
					// PHPAST.g:1777:37: ( ctor_arguments )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==LEFT_PARETHESIS) ) {
						alt123=1;
					}
					switch (alt123) {
						case 1 :
							// PHPAST.g:1777:37: ctor_arguments
							{
							pushFollow(FOLLOW_ctor_arguments_in_dynamic_name_reference5534);
							ctor_arguments376=ctor_arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments376.getTree());
							}
							break;

					}

					if ( state.backtracking==0 ) {
					      token = (CommonToken)(base_variable_with_function_calls373!=null?(base_variable_with_function_calls373.start):null);
					      startIndex = token.getStartIndex();
					      token = (CommonToken)(object_property375!=null?(object_property375.stop):null);
					      endIndex = token.getStopIndex();
					      endIndexList.add(0, endIndex);
					      if ((ctor_arguments376!=null?input.toString(ctor_arguments376.start,ctor_arguments376.stop):null) != null) {
					        endIndex = ((CommonToken)(ctor_arguments376!=null?(ctor_arguments376.stop):null)).getStopIndex();
					        int sid = (ctor_arguments376!=null?((AST)ctor_arguments376.getTree()):null).startIndex;
					        int eid = (ctor_arguments376!=null?((AST)ctor_arguments376.getTree()):null).endIndex;
					        hasArgument.add(0, true);
					        argumentStartIndex.add(sid);
					        argumentEndIndex.add(eid);
					        endIndex = ((CommonToken)(ctor_arguments376!=null?(ctor_arguments376.stop):null)).getStopIndex();
					      }
					      else {
					        hasArgument.add(0, false);
					      }
					      
					    }
					// AST REWRITE
					// elements: object_property, ctor_arguments, dynamic_name_reference
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1798:5: -> ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? )
					{
						// PHPAST.g:1798:9: ^( CALL $dynamic_name_reference object_property ( ctor_arguments )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_object_property.nextTree());
						// PHPAST.g:1798:56: ( ctor_arguments )?
						if ( stream_ctor_arguments.hasNext() ) {
							adaptor.addChild(root_1, stream_ctor_arguments.nextTree());
						}
						stream_ctor_arguments.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop124;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			  
			  Iterator iter = endIndexList.iterator(),
			          iterHasArgument = hasArgument.iterator(),
			          iterArguStart = argumentStartIndex.iterator(),
			          iterArguEnd = argumentEndIndex.iterator();
			  
			  int currentEndIndex = endIndex;
			  boolean hasArgu = false;
			  AST arguAst = null;
			  while (iter.hasNext()) {
			    currentEndIndex = (Integer)iter.next();
			    ast.setIndex(startIndex, currentEndIndex);
			    hasArgu = (Boolean)iterHasArgument.next();
			    if (hasArgu) {
			      arguAst = (AST)ast.getChild(2);
			      arguAst.setIndex((Integer)iterArguStart.next(), (Integer)iterArguEnd.next());
			    }   
			    
			    ast = (AST)ast.getChild(0);
			  }
			  
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dynamic_name_reference"


	public static class assignment_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "assignment_list"
	// PHPAST.g:1801:1: assignment_list : ( assignment_element )? ( COMMA_T ( assignment_element )? )* -> ( assignment_element )* ;
	public final PHPASTParser.assignment_list_return assignment_list() throws RecognitionException {
		PHPASTParser.assignment_list_return retval = new PHPASTParser.assignment_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COMMA_T378=null;
		ParserRuleReturnScope assignment_element377 =null;
		ParserRuleReturnScope assignment_element379 =null;

		AST COMMA_T378_tree=null;
		RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
		RewriteRuleSubtreeStream stream_assignment_element=new RewriteRuleSubtreeStream(adaptor,"rule assignment_element");

		try {
			// PHPAST.g:1802:3: ( ( assignment_element )? ( COMMA_T ( assignment_element )? )* -> ( assignment_element )* )
			// PHPAST.g:1802:5: ( assignment_element )? ( COMMA_T ( assignment_element )? )*
			{
			// PHPAST.g:1802:5: ( assignment_element )?
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( ((LA125_0 >= DOLLAR_T && LA125_0 <= DOMAIN_T)||LA125_0==IDENTIFIER||LA125_0==LIST_T||LA125_0==NAMESPACE_T||LA125_0==STATIC) ) {
				alt125=1;
			}
			switch (alt125) {
				case 1 :
					// PHPAST.g:1802:5: assignment_element
					{
					pushFollow(FOLLOW_assignment_element_in_assignment_list5585);
					assignment_element377=assignment_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_element.add(assignment_element377.getTree());
					}
					break;

			}

			// PHPAST.g:1802:25: ( COMMA_T ( assignment_element )? )*
			loop127:
			while (true) {
				int alt127=2;
				int LA127_0 = input.LA(1);
				if ( (LA127_0==COMMA_T) ) {
					alt127=1;
				}

				switch (alt127) {
				case 1 :
					// PHPAST.g:1802:26: COMMA_T ( assignment_element )?
					{
					COMMA_T378=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_assignment_list5589); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T378);

					// PHPAST.g:1802:34: ( assignment_element )?
					int alt126=2;
					int LA126_0 = input.LA(1);
					if ( ((LA126_0 >= DOLLAR_T && LA126_0 <= DOMAIN_T)||LA126_0==IDENTIFIER||LA126_0==LIST_T||LA126_0==NAMESPACE_T||LA126_0==STATIC) ) {
						alt126=1;
					}
					switch (alt126) {
						case 1 :
							// PHPAST.g:1802:34: assignment_element
							{
							pushFollow(FOLLOW_assignment_element_in_assignment_list5591);
							assignment_element379=assignment_element();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_assignment_element.add(assignment_element379.getTree());
							}
							break;

					}

					}
					break;

				default :
					break loop127;
				}
			}

			// AST REWRITE
			// elements: assignment_element
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1802:57: -> ( assignment_element )*
			{
				// PHPAST.g:1802:61: ( assignment_element )*
				while ( stream_assignment_element.hasNext() ) {
					adaptor.addChild(root_0, stream_assignment_element.nextTree());
				}
				stream_assignment_element.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_list"


	public static class assignment_element_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "assignment_element"
	// PHPAST.g:1805:1: assignment_element : ( variable | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) );
	public final PHPASTParser.assignment_element_return assignment_element() throws RecognitionException {
		PHPASTParser.assignment_element_return retval = new PHPASTParser.assignment_element_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LIST_T381=null;
		Token LEFT_PARETHESIS382=null;
		Token RIGHT_PARETHESIS384=null;
		ParserRuleReturnScope variable380 =null;
		ParserRuleReturnScope assignment_list383 =null;

		AST LIST_T381_tree=null;
		AST LEFT_PARETHESIS382_tree=null;
		AST RIGHT_PARETHESIS384_tree=null;
		RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
		RewriteRuleTokenStream stream_LIST_T=new RewriteRuleTokenStream(adaptor,"token LIST_T");
		RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
		RewriteRuleSubtreeStream stream_assignment_list=new RewriteRuleSubtreeStream(adaptor,"rule assignment_list");

		try {
			// PHPAST.g:1806:3: ( variable | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) )
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( ((LA128_0 >= DOLLAR_T && LA128_0 <= DOMAIN_T)||LA128_0==IDENTIFIER||LA128_0==NAMESPACE_T||LA128_0==STATIC) ) {
				alt128=1;
			}
			else if ( (LA128_0==LIST_T) ) {
				alt128=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}

			switch (alt128) {
				case 1 :
					// PHPAST.g:1806:5: variable
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_variable_in_assignment_element5615);
					variable380=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable380.getTree());

					}
					break;
				case 2 :
					// PHPAST.g:1807:5: LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS
					{
					LIST_T381=(Token)match(input,LIST_T,FOLLOW_LIST_T_in_assignment_element5621); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LIST_T.add(LIST_T381);

					LEFT_PARETHESIS382=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_assignment_element5623); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS382);

					pushFollow(FOLLOW_assignment_list_in_assignment_element5625);
					assignment_list383=assignment_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_assignment_list.add(assignment_list383.getTree());
					RIGHT_PARETHESIS384=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_assignment_element5627); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS384);

					// AST REWRITE
					// elements: assignment_list, LIST_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1807:62: -> ^( LIST_T assignment_list )
					{
						// PHPAST.g:1807:66: ^( LIST_T assignment_list )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot(stream_LIST_T.nextNode(), root_1);
						adaptor.addChild(root_1, stream_assignment_list.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_element"


	public static class array_pair_list_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "array_pair_list"
	// PHPAST.g:1810:1: array_pair_list : e1= array_pair_element ( COMMA_T e2= array_pair_element )* ( COMMA_T )? -> ( array_pair_element )+ ;
	public final PHPASTParser.array_pair_list_return array_pair_list() throws RecognitionException {
		PHPASTParser.array_pair_list_return retval = new PHPASTParser.array_pair_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token COMMA_T385=null;
		Token COMMA_T386=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST COMMA_T385_tree=null;
		AST COMMA_T386_tree=null;
		RewriteRuleTokenStream stream_COMMA_T=new RewriteRuleTokenStream(adaptor,"token COMMA_T");
		RewriteRuleSubtreeStream stream_array_pair_element=new RewriteRuleSubtreeStream(adaptor,"rule array_pair_element");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1820:3: (e1= array_pair_element ( COMMA_T e2= array_pair_element )* ( COMMA_T )? -> ( array_pair_element )+ )
			// PHPAST.g:1820:5: e1= array_pair_element ( COMMA_T e2= array_pair_element )* ( COMMA_T )?
			{
			pushFollow(FOLLOW_array_pair_element_in_array_pair_list5664);
			e1=array_pair_element();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_array_pair_element.add(e1.getTree());
			// PHPAST.g:1820:27: ( COMMA_T e2= array_pair_element )*
			loop129:
			while (true) {
				int alt129=2;
				int LA129_0 = input.LA(1);
				if ( (LA129_0==COMMA_T) ) {
					int LA129_1 = input.LA(2);
					if ( ((LA129_1 >= AT_T && LA129_1 <= BACKTRICKLITERAL)||LA129_1==CLONE_T||(LA129_1 >= DOLLAR_T && LA129_1 <= DOMAIN_T)||LA129_1==DOUBLELITERRAL||LA129_1==EXC_NOT_T||LA129_1==FLOATLITERAL||LA129_1==FUNCTION_T||LA129_1==HERE_DOC||LA129_1==IDENTIFIER||LA129_1==INTLITERAL||(LA129_1 >= LEFT_OPEN_RECT && LA129_1 <= LEFT_PARETHESIS)||LA129_1==LIST_T||(LA129_1 >= MINUS_MINUS_T && LA129_1 <= MINUS_T)||(LA129_1 >= NAMESPACE_T && LA129_1 <= NEW_T)||(LA129_1 >= PLUS_PLUS_T && LA129_1 <= PLUS_T)||LA129_1==PRINT_T||(LA129_1 >= REALLITERAL && LA129_1 <= REF_T)||LA129_1==STATIC||LA129_1==STRINGLITERAL||LA129_1==TILDA_T||LA129_1==UNSET_T||(LA129_1 >= 176 && LA129_1 <= 182)||LA129_1==185) ) {
						alt129=1;
					}

				}

				switch (alt129) {
				case 1 :
					// PHPAST.g:1820:28: COMMA_T e2= array_pair_element
					{
					COMMA_T385=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_array_pair_list5667); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T385);

					pushFollow(FOLLOW_array_pair_element_in_array_pair_list5671);
					e2=array_pair_element();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_array_pair_element.add(e2.getTree());
					}
					break;

				default :
					break loop129;
				}
			}

			// PHPAST.g:1820:60: ( COMMA_T )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==COMMA_T) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// PHPAST.g:1820:60: COMMA_T
					{
					COMMA_T386=(Token)match(input,COMMA_T,FOLLOW_COMMA_T_in_array_pair_list5675); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA_T.add(COMMA_T386);

					}
					break;

			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1830:6: -> ( array_pair_element )+
			{
				if ( !(stream_array_pair_element.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_array_pair_element.hasNext() ) {
					adaptor.addChild(root_0, stream_array_pair_element.nextTree());
				}
				stream_array_pair_element.reset();

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_pair_list"


	public static class array_pair_element_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "array_pair_element"
	// PHPAST.g:1833:1: array_pair_element : e1= expression ( ARROW_T ^e2= expression )? ;
	public final PHPASTParser.array_pair_element_return array_pair_element() throws RecognitionException {
		PHPASTParser.array_pair_element_return retval = new PHPASTParser.array_pair_element_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token ARROW_T387=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;

		AST ARROW_T387_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1843:3: (e1= expression ( ARROW_T ^e2= expression )? )
			// PHPAST.g:1843:5: e1= expression ( ARROW_T ^e2= expression )?
			{
			root_0 = (AST)adaptor.nil();


			pushFollow(FOLLOW_expression_in_array_pair_element5720);
			e1=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());

			// PHPAST.g:1843:19: ( ARROW_T ^e2= expression )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==ARROW_T) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// PHPAST.g:1843:20: ARROW_T ^e2= expression
					{
					ARROW_T387=(Token)match(input,ARROW_T,FOLLOW_ARROW_T_in_array_pair_element5723); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ARROW_T387_tree = (AST)adaptor.create(ARROW_T387);
					root_0 = (AST)adaptor.becomeRoot(ARROW_T387_tree, root_0);
					}

					pushFollow(FOLLOW_expression_in_array_pair_element5728);
					e2=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, e2.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {
			    token = (CommonToken)(e1!=null?(e1.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(e1!=null?(e1.stop):null);
			    if ((e2!=null?input.toString(e2.start,e2.stop):null) != null) {
			      token = (CommonToken)(e2!=null?(e2.stop):null);
			    }
			    endIndex = token.getStopIndex();
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_pair_element"


	public static class variable_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// PHPAST.g:1855:1: variable : ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )* ;
	public final PHPASTParser.variable_return variable() throws RecognitionException {
		PHPASTParser.variable_return retval = new PHPASTParser.variable_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token SINGLE_ARROW_T389=null;
		ParserRuleReturnScope base_variable_with_function_calls388 =null;
		ParserRuleReturnScope object_property390 =null;
		ParserRuleReturnScope ctor_arguments391 =null;

		AST SINGLE_ARROW_T389_tree=null;
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
			// PHPAST.g:1889:3: ( ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )* )
			// PHPAST.g:1889:5: ( base_variable_with_function_calls -> base_variable_with_function_calls ) ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )*
			{
			// PHPAST.g:1889:5: ( base_variable_with_function_calls -> base_variable_with_function_calls )
			// PHPAST.g:1889:6: base_variable_with_function_calls
			{
			pushFollow(FOLLOW_base_variable_with_function_calls_in_variable5762);
			base_variable_with_function_calls388=base_variable_with_function_calls();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_base_variable_with_function_calls.add(base_variable_with_function_calls388.getTree());
			if ( state.backtracking==0 ) {
			      token = (CommonToken)(base_variable_with_function_calls388!=null?(base_variable_with_function_calls388.start):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 1895:6: -> base_variable_with_function_calls
			{
				adaptor.addChild(root_0, stream_base_variable_with_function_calls.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// PHPAST.g:1896:5: ( SINGLE_ARROW_T object_property ( ctor_arguments )? -> ^( CALL $variable object_property ( ctor_arguments )? ) )*
			loop133:
			while (true) {
				int alt133=2;
				int LA133_0 = input.LA(1);
				if ( (LA133_0==SINGLE_ARROW_T) ) {
					alt133=1;
				}

				switch (alt133) {
				case 1 :
					// PHPAST.g:1896:6: SINGLE_ARROW_T object_property ( ctor_arguments )?
					{
					SINGLE_ARROW_T389=(Token)match(input,SINGLE_ARROW_T,FOLLOW_SINGLE_ARROW_T_in_variable5785); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SINGLE_ARROW_T.add(SINGLE_ARROW_T389);

					pushFollow(FOLLOW_object_property_in_variable5787);
					object_property390=object_property();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_object_property.add(object_property390.getTree());
					// PHPAST.g:1896:37: ( ctor_arguments )?
					int alt132=2;
					int LA132_0 = input.LA(1);
					if ( (LA132_0==LEFT_PARETHESIS) ) {
						alt132=1;
					}
					switch (alt132) {
						case 1 :
							// PHPAST.g:1896:37: ctor_arguments
							{
							pushFollow(FOLLOW_ctor_arguments_in_variable5789);
							ctor_arguments391=ctor_arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments391.getTree());
							}
							break;

					}

					if ( state.backtracking==0 ) {
					      token = (CommonToken)(base_variable_with_function_calls388!=null?(base_variable_with_function_calls388.start):null);
					      startIndex = token.getStartIndex();
					      token = (CommonToken)(object_property390!=null?(object_property390.stop):null);
					      endIndex = token.getStopIndex();
					      endIndexList.add(0, endIndex);
					      
					      if ((ctor_arguments391!=null?input.toString(ctor_arguments391.start,ctor_arguments391.stop):null) != null) {
					        int sid = (ctor_arguments391!=null?((AST)ctor_arguments391.getTree()):null).startIndex;
					        int eid = (ctor_arguments391!=null?((AST)ctor_arguments391.getTree()):null).endIndex;
					        hasArgument.add(0, true);
					        argumentStartIndex.add(sid);
					        argumentEndIndex.add(eid);
					        endIndex = ((CommonToken)(ctor_arguments391!=null?(ctor_arguments391.stop):null)).getStopIndex();
					      }
					      else {
					        hasArgument.add(0, false);
					      }
					    }
					// AST REWRITE
					// elements: object_property, variable, ctor_arguments
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1916:5: -> ^( CALL $variable object_property ( ctor_arguments )? )
					{
						// PHPAST.g:1916:9: ^( CALL $variable object_property ( ctor_arguments )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_object_property.nextTree());
						// PHPAST.g:1916:42: ( ctor_arguments )?
						if ( stream_ctor_arguments.hasNext() ) {
							adaptor.addChild(root_1, stream_ctor_arguments.nextTree());
						}
						stream_ctor_arguments.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop133;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			  
			  Iterator iter = endIndexList.iterator(),
			          iterHasArgument = hasArgument.iterator(),
			          iterArguStart = argumentStartIndex.iterator(),
			          iterArguEnd = argumentEndIndex.iterator();
			  
			  int currentEndIndex = endIndex;
			  boolean hasArgu = false;
			  AST arguAst = null;
			  while (iter.hasNext()) {
			    currentEndIndex = (Integer)iter.next();
			    ast.setIndex(startIndex, currentEndIndex);
			    hasArgu = (Boolean)iterHasArgument.next();
			    if (hasArgu) {
			      arguAst = (AST)ast.getChild(2);
			      arguAst.setIndex((Integer)iterArguStart.next(), (Integer)iterArguEnd.next());
			    }   
			    
			    ast = (AST)ast.getChild(0);
			  }
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class base_variable_with_function_calls_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "base_variable_with_function_calls"
	// PHPAST.g:1919:1: base_variable_with_function_calls : ( ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? ) | fully_qualified_class_name ctor_arguments -> ^( CALL fully_qualified_class_name ctor_arguments ) | STATIC '::' reference_variable -> ^( VAR_DECL ^( '::' STATIC reference_variable ) ) | STATIC '::' reference_variable_without_dollar -> ^( VAR_DECL ^( '::' STATIC reference_variable_without_dollar ) ) );
	public final PHPASTParser.base_variable_with_function_calls_return base_variable_with_function_calls() throws RecognitionException {
		PHPASTParser.base_variable_with_function_calls_return retval = new PHPASTParser.base_variable_with_function_calls_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token STATIC397=null;
		Token string_literal398=null;
		Token STATIC400=null;
		Token string_literal401=null;
		ParserRuleReturnScope fully_qualified_class_name392 =null;
		ParserRuleReturnScope reference_variable393 =null;
		ParserRuleReturnScope ctor_arguments394 =null;
		ParserRuleReturnScope fully_qualified_class_name395 =null;
		ParserRuleReturnScope ctor_arguments396 =null;
		ParserRuleReturnScope reference_variable399 =null;
		ParserRuleReturnScope reference_variable_without_dollar402 =null;

		AST STATIC397_tree=null;
		AST string_literal398_tree=null;
		AST STATIC400_tree=null;
		AST string_literal401_tree=null;
		RewriteRuleTokenStream stream_DOMAIN_T=new RewriteRuleTokenStream(adaptor,"token DOMAIN_T");
		RewriteRuleTokenStream stream_STATIC=new RewriteRuleTokenStream(adaptor,"token STATIC");
		RewriteRuleSubtreeStream stream_ctor_arguments=new RewriteRuleSubtreeStream(adaptor,"rule ctor_arguments");
		RewriteRuleSubtreeStream stream_fully_qualified_class_name=new RewriteRuleSubtreeStream(adaptor,"rule fully_qualified_class_name");
		RewriteRuleSubtreeStream stream_reference_variable_without_dollar=new RewriteRuleSubtreeStream(adaptor,"rule reference_variable_without_dollar");
		RewriteRuleSubtreeStream stream_reference_variable=new RewriteRuleSubtreeStream(adaptor,"rule reference_variable");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1929:3: ( ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? ) | fully_qualified_class_name ctor_arguments -> ^( CALL fully_qualified_class_name ctor_arguments ) | STATIC '::' reference_variable -> ^( VAR_DECL ^( '::' STATIC reference_variable ) ) | STATIC '::' reference_variable_without_dollar -> ^( VAR_DECL ^( '::' STATIC reference_variable_without_dollar ) ) )
			int alt136=4;
			alt136 = dfa136.predict(input);
			switch (alt136) {
				case 1 :
					// PHPAST.g:1929:5: ( fully_qualified_class_name )? reference_variable ( ctor_arguments )?
					{
					// PHPAST.g:1929:5: ( fully_qualified_class_name )?
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( (LA134_0==DOMAIN_T||LA134_0==IDENTIFIER||LA134_0==NAMESPACE_T) ) {
						alt134=1;
					}
					switch (alt134) {
						case 1 :
							// PHPAST.g:1929:5: fully_qualified_class_name
							{
							pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5846);
							fully_qualified_class_name392=fully_qualified_class_name();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name392.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_reference_variable_in_base_variable_with_function_calls5849);
					reference_variable393=reference_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_reference_variable.add(reference_variable393.getTree());
					// PHPAST.g:1929:52: ( ctor_arguments )?
					int alt135=2;
					int LA135_0 = input.LA(1);
					if ( (LA135_0==LEFT_PARETHESIS) ) {
						alt135=1;
					}
					switch (alt135) {
						case 1 :
							// PHPAST.g:1929:52: ctor_arguments
							{
							pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls5851);
							ctor_arguments394=ctor_arguments();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments394.getTree());
							}
							break;

					}

					if ( state.backtracking==0 ) {
					      token = (CommonToken)(reference_variable393!=null?(reference_variable393.start):null);
					      if ((fully_qualified_class_name392!=null?input.toString(fully_qualified_class_name392.start,fully_qualified_class_name392.stop):null) != null) {
					        token = (CommonToken)(fully_qualified_class_name392!=null?(fully_qualified_class_name392.start):null);
					      }
					      startIndex = token.getStartIndex();
					      token = (CommonToken)(reference_variable393!=null?(reference_variable393.stop):null);
					      if ((ctor_arguments394!=null?input.toString(ctor_arguments394.start,ctor_arguments394.stop):null) != null) {
					        token = (CommonToken)(ctor_arguments394!=null?(ctor_arguments394.stop):null);
					      }
					      endIndex = token.getStopIndex();
					    }
					// AST REWRITE
					// elements: reference_variable, fully_qualified_class_name, ctor_arguments
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1942:7: -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? )
					{
						// PHPAST.g:1942:11: ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
						// PHPAST.g:1942:22: ( fully_qualified_class_name )?
						if ( stream_fully_qualified_class_name.hasNext() ) {
							adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());
						}
						stream_fully_qualified_class_name.reset();

						adaptor.addChild(root_1, stream_reference_variable.nextTree());
						// PHPAST.g:1942:69: ( ctor_arguments )?
						if ( stream_ctor_arguments.hasNext() ) {
							adaptor.addChild(root_1, stream_ctor_arguments.nextTree());
						}
						stream_ctor_arguments.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:1943:5: fully_qualified_class_name ctor_arguments
					{
					pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5885);
					fully_qualified_class_name395=fully_qualified_class_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_fully_qualified_class_name.add(fully_qualified_class_name395.getTree());
					pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls5887);
					ctor_arguments396=ctor_arguments();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_ctor_arguments.add(ctor_arguments396.getTree());
					if ( state.backtracking==0 ) {
					      token = (CommonToken)(fully_qualified_class_name395!=null?(fully_qualified_class_name395.start):null);
					      startIndex = token.getStartIndex();
					      token = (CommonToken)(ctor_arguments396!=null?(ctor_arguments396.stop):null);
					      if(token != null) {
					        endIndex = token.getStopIndex();
					      }
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1952:7: -> ^( CALL fully_qualified_class_name ctor_arguments )
					{
						// PHPAST.g:1952:11: ^( CALL fully_qualified_class_name ctor_arguments )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(CALL, "CALL"), root_1);
						adaptor.addChild(root_1, stream_fully_qualified_class_name.nextTree());
						adaptor.addChild(root_1, stream_ctor_arguments.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// PHPAST.g:1953:5: STATIC '::' reference_variable
					{
					STATIC397=(Token)match(input,STATIC,FOLLOW_STATIC_in_base_variable_with_function_calls5919); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STATIC.add(STATIC397);

					string_literal398=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_base_variable_with_function_calls5921); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOMAIN_T.add(string_literal398);

					pushFollow(FOLLOW_reference_variable_in_base_variable_with_function_calls5923);
					reference_variable399=reference_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_reference_variable.add(reference_variable399.getTree());
					// AST REWRITE
					// elements: DOMAIN_T, STATIC, reference_variable
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1953:43: -> ^( VAR_DECL ^( '::' STATIC reference_variable ) )
					{
						// PHPAST.g:1953:47: ^( VAR_DECL ^( '::' STATIC reference_variable ) )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
						// PHPAST.g:1953:58: ^( '::' STATIC reference_variable )
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot(stream_DOMAIN_T.nextNode(), root_2);
						adaptor.addChild(root_2, stream_STATIC.nextNode());
						adaptor.addChild(root_2, stream_reference_variable.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// PHPAST.g:1954:5: STATIC '::' reference_variable_without_dollar
					{
					STATIC400=(Token)match(input,STATIC,FOLLOW_STATIC_in_base_variable_with_function_calls5951); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STATIC.add(STATIC400);

					string_literal401=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_base_variable_with_function_calls5953); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOMAIN_T.add(string_literal401);

					pushFollow(FOLLOW_reference_variable_without_dollar_in_base_variable_with_function_calls5955);
					reference_variable_without_dollar402=reference_variable_without_dollar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_reference_variable_without_dollar.add(reference_variable_without_dollar402.getTree());
					// AST REWRITE
					// elements: reference_variable_without_dollar, STATIC, DOMAIN_T
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 1954:51: -> ^( VAR_DECL ^( '::' STATIC reference_variable_without_dollar ) )
					{
						// PHPAST.g:1954:54: ^( VAR_DECL ^( '::' STATIC reference_variable_without_dollar ) )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
						// PHPAST.g:1954:65: ^( '::' STATIC reference_variable_without_dollar )
						{
						AST root_2 = (AST)adaptor.nil();
						root_2 = (AST)adaptor.becomeRoot(stream_DOMAIN_T.nextNode(), root_2);
						adaptor.addChild(root_2, stream_STATIC.nextNode());
						adaptor.addChild(root_2, stream_reference_variable_without_dollar.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "base_variable_with_function_calls"


	public static class object_property_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "object_property"
	// PHPAST.g:1958:1: object_property : ( reference_variable | reference_variable_without_dollar );
	public final PHPASTParser.object_property_return object_property() throws RecognitionException {
		PHPASTParser.object_property_return retval = new PHPASTParser.object_property_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope reference_variable403 =null;
		ParserRuleReturnScope reference_variable_without_dollar404 =null;



		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:1968:3: ( reference_variable | reference_variable_without_dollar )
			int alt137=2;
			int LA137_0 = input.LA(1);
			if ( (LA137_0==DOLLAR_T) ) {
				alt137=1;
			}
			else if ( (LA137_0==IDENTIFIER||LA137_0==LEFT_BRACKET) ) {
				alt137=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 137, 0, input);
				throw nvae;
			}

			switch (alt137) {
				case 1 :
					// PHPAST.g:1968:5: reference_variable
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_reference_variable_in_object_property5996);
					reference_variable403=reference_variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, reference_variable403.getTree());

					if ( state.backtracking==0 ) {
					     token = (CommonToken)(reference_variable403!=null?(reference_variable403.start):null);
					     startIndex = token.getStartIndex();
					     token = (CommonToken)(reference_variable403!=null?(reference_variable403.stop):null);
					     endIndex = token.getStopIndex();
					  }
					}
					break;
				case 2 :
					// PHPAST.g:1975:5: reference_variable_without_dollar
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_reference_variable_without_dollar_in_object_property6006);
					reference_variable_without_dollar404=reference_variable_without_dollar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, reference_variable_without_dollar404.getTree());

					if ( state.backtracking==0 ) {
					     token = (CommonToken)(reference_variable_without_dollar404!=null?(reference_variable_without_dollar404.start):null);
					     startIndex = token.getStartIndex();
					     token = (CommonToken)(reference_variable_without_dollar404!=null?(reference_variable_without_dollar404.stop):null);
					     endIndex = token.getStopIndex();
					  }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "object_property"


	public static class reference_variable_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "reference_variable"
	// PHPAST.g:1984:1: reference_variable : ( compound_variable -> ^( VAR compound_variable ) ) ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )* ;
	public final PHPASTParser.reference_variable_return reference_variable() throws RecognitionException {
		PHPASTParser.reference_variable_return retval = new PHPASTParser.reference_variable_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LEFT_OPEN_RECT406=null;
		Token RIGHT_OPEN_RECT407=null;
		Token LEFT_BRACKET408=null;
		Token RIGHT_BRACKET409=null;
		ParserRuleReturnScope e =null;
		ParserRuleReturnScope compound_variable405 =null;

		AST LEFT_OPEN_RECT406_tree=null;
		AST RIGHT_OPEN_RECT407_tree=null;
		AST LEFT_BRACKET408_tree=null;
		AST RIGHT_BRACKET409_tree=null;
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
			// PHPAST.g:2003:3: ( ( compound_variable -> ^( VAR compound_variable ) ) ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )* )
			// PHPAST.g:2003:5: ( compound_variable -> ^( VAR compound_variable ) ) ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )*
			{
			// PHPAST.g:2003:5: ( compound_variable -> ^( VAR compound_variable ) )
			// PHPAST.g:2003:6: compound_variable
			{
			pushFollow(FOLLOW_compound_variable_in_reference_variable6034);
			compound_variable405=compound_variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_compound_variable.add(compound_variable405.getTree());
			if ( state.backtracking==0 ) {
			    token = (CommonToken)(compound_variable405!=null?(compound_variable405.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(compound_variable405!=null?(compound_variable405.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 2010:5: -> ^( VAR compound_variable )
			{
				// PHPAST.g:2010:8: ^( VAR compound_variable )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(VAR, "VAR"), root_1);
				adaptor.addChild(root_1, stream_compound_variable.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			// PHPAST.g:2011:3: ( LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable ( $e)? ) | LEFT_BRACKET e= expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable $e) )*
			loop139:
			while (true) {
				int alt139=3;
				int LA139_0 = input.LA(1);
				if ( (LA139_0==LEFT_OPEN_RECT) ) {
					alt139=1;
				}
				else if ( (LA139_0==LEFT_BRACKET) ) {
					alt139=2;
				}

				switch (alt139) {
				case 1 :
					// PHPAST.g:2012:3: LEFT_OPEN_RECT (e= expression )? RIGHT_OPEN_RECT
					{
					LEFT_OPEN_RECT406=(Token)match(input,LEFT_OPEN_RECT,FOLLOW_LEFT_OPEN_RECT_in_reference_variable6059); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_OPEN_RECT.add(LEFT_OPEN_RECT406);

					// PHPAST.g:2012:19: (e= expression )?
					int alt138=2;
					int LA138_0 = input.LA(1);
					if ( ((LA138_0 >= AT_T && LA138_0 <= BACKTRICKLITERAL)||LA138_0==CLONE_T||(LA138_0 >= DOLLAR_T && LA138_0 <= DOMAIN_T)||LA138_0==DOUBLELITERRAL||LA138_0==EXC_NOT_T||LA138_0==FLOATLITERAL||LA138_0==FUNCTION_T||LA138_0==HERE_DOC||LA138_0==IDENTIFIER||LA138_0==INTLITERAL||(LA138_0 >= LEFT_OPEN_RECT && LA138_0 <= LEFT_PARETHESIS)||LA138_0==LIST_T||(LA138_0 >= MINUS_MINUS_T && LA138_0 <= MINUS_T)||(LA138_0 >= NAMESPACE_T && LA138_0 <= NEW_T)||(LA138_0 >= PLUS_PLUS_T && LA138_0 <= PLUS_T)||LA138_0==PRINT_T||(LA138_0 >= REALLITERAL && LA138_0 <= REF_T)||LA138_0==STATIC||LA138_0==STRINGLITERAL||LA138_0==TILDA_T||LA138_0==UNSET_T||(LA138_0 >= 176 && LA138_0 <= 182)||LA138_0==185) ) {
						alt138=1;
					}
					switch (alt138) {
						case 1 :
							// PHPAST.g:2012:19: e= expression
							{
							pushFollow(FOLLOW_expression_in_reference_variable6063);
							e=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(e.getTree());
							}
							break;

					}

					RIGHT_OPEN_RECT407=(Token)match(input,RIGHT_OPEN_RECT,FOLLOW_RIGHT_OPEN_RECT_in_reference_variable6066); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_OPEN_RECT.add(RIGHT_OPEN_RECT407);

					if ( state.backtracking==0 ) {
					    endIndex = ((CommonToken)RIGHT_OPEN_RECT407).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 2017:5: -> ^( INDEX $reference_variable ( $e)? )
					{
						// PHPAST.g:2017:9: ^( INDEX $reference_variable ( $e)? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(INDEX, "INDEX"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// PHPAST.g:2017:38: ( $e)?
						if ( stream_e.hasNext() ) {
							adaptor.addChild(root_1, stream_e.nextTree());
						}
						stream_e.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:2019:3: LEFT_BRACKET e= expression RIGHT_BRACKET
					{
					LEFT_BRACKET408=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_reference_variable6096); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET408);

					pushFollow(FOLLOW_expression_in_reference_variable6100);
					e=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(e.getTree());
					RIGHT_BRACKET409=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_reference_variable6102); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET409);

					if ( state.backtracking==0 ) {
					    endIndex = ((CommonToken)RIGHT_BRACKET409).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_e=new RewriteRuleSubtreeStream(adaptor,"rule e",e!=null?e.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 2024:5: -> ^( HASH_INDEX $reference_variable $e)
					{
						// PHPAST.g:2024:9: ^( HASH_INDEX $reference_variable $e)
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(HASH_INDEX, "HASH_INDEX"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_e.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop139;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			  
			  Iterator iter = endIndexList.iterator();
			  int currentEndIndex = endIndex;
			  while (iter.hasNext()) {
			    currentEndIndex = (Integer)iter.next();
			    ast.setIndex(startIndex, currentEndIndex);
			    ast = (AST)ast.getChild(0);
			  }  
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reference_variable"


	public static class compound_variable_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "compound_variable"
	// PHPAST.g:2028:1: compound_variable : ( dollars IDENTIFIER | dollars LEFT_BRACKET ! expression RIGHT_BRACKET !);
	public final PHPASTParser.compound_variable_return compound_variable() throws RecognitionException {
		PHPASTParser.compound_variable_return retval = new PHPASTParser.compound_variable_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token IDENTIFIER411=null;
		Token LEFT_BRACKET413=null;
		Token RIGHT_BRACKET415=null;
		ParserRuleReturnScope dollars410 =null;
		ParserRuleReturnScope dollars412 =null;
		ParserRuleReturnScope expression414 =null;

		AST IDENTIFIER411_tree=null;
		AST LEFT_BRACKET413_tree=null;
		AST RIGHT_BRACKET415_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;  

		try {
			// PHPAST.g:2038:3: ( dollars IDENTIFIER | dollars LEFT_BRACKET ! expression RIGHT_BRACKET !)
			int alt140=2;
			alt140 = dfa140.predict(input);
			switch (alt140) {
				case 1 :
					// PHPAST.g:2038:5: dollars IDENTIFIER
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_dollars_in_compound_variable6153);
					dollars410=dollars();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dollars410.getTree());

					IDENTIFIER411=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compound_variable6155); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER411_tree = (AST)adaptor.create(IDENTIFIER411);
					adaptor.addChild(root_0, IDENTIFIER411_tree);
					}

					if ( state.backtracking==0 ) {
					     token = (CommonToken)(dollars410!=null?(dollars410.start):null);
					     startIndex = token.getStartIndex();
					     token = (CommonToken)IDENTIFIER411;
					     endIndex = token.getStopIndex();
					   }
					}
					break;
				case 2 :
					// PHPAST.g:2045:5: dollars LEFT_BRACKET ! expression RIGHT_BRACKET !
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_dollars_in_compound_variable6167);
					dollars412=dollars();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dollars412.getTree());

					LEFT_BRACKET413=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_compound_variable6169); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_compound_variable6172);
					expression414=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression414.getTree());

					RIGHT_BRACKET415=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_compound_variable6174); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					     token = (CommonToken)(dollars412!=null?(dollars412.start):null);
					     startIndex = token.getStartIndex();
					     token = (CommonToken)RIGHT_BRACKET415;
					     endIndex = token.getStopIndex();
					   }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_variable"


	public static class dollars_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "dollars"
	// PHPAST.g:2054:1: dollars : ( DOLLAR_T )+ ;
	public final PHPASTParser.dollars_return dollars() throws RecognitionException {
		PHPASTParser.dollars_return retval = new PHPASTParser.dollars_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token DOLLAR_T416=null;

		AST DOLLAR_T416_tree=null;

		try {
			// PHPAST.g:2055:3: ( ( DOLLAR_T )+ )
			// PHPAST.g:2055:5: ( DOLLAR_T )+
			{
			root_0 = (AST)adaptor.nil();


			// PHPAST.g:2055:5: ( DOLLAR_T )+
			int cnt141=0;
			loop141:
			while (true) {
				int alt141=2;
				int LA141_0 = input.LA(1);
				if ( (LA141_0==DOLLAR_T) ) {
					alt141=1;
				}

				switch (alt141) {
				case 1 :
					// PHPAST.g:2055:5: DOLLAR_T
					{
					DOLLAR_T416=(Token)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_dollars6195); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOLLAR_T416_tree = (AST)adaptor.create(DOLLAR_T416);
					adaptor.addChild(root_0, DOLLAR_T416_tree);
					}

					}
					break;

				default :
					if ( cnt141 >= 1 ) break loop141;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(141, input);
					throw eee;
				}
				cnt141++;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dollars"


	public static class reference_variable_without_dollar_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "reference_variable_without_dollar"
	// PHPAST.g:2058:1: reference_variable_without_dollar : ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) ) ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )* ;
	public final PHPASTParser.reference_variable_without_dollar_return reference_variable_without_dollar() throws RecognitionException {
		PHPASTParser.reference_variable_without_dollar_return retval = new PHPASTParser.reference_variable_without_dollar_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LEFT_OPEN_RECT418=null;
		Token RIGHT_OPEN_RECT420=null;
		Token LEFT_BRACKET421=null;
		Token RIGHT_BRACKET423=null;
		ParserRuleReturnScope compound_variable_without_dollar417 =null;
		ParserRuleReturnScope expression419 =null;
		ParserRuleReturnScope expression422 =null;

		AST LEFT_OPEN_RECT418_tree=null;
		AST RIGHT_OPEN_RECT420_tree=null;
		AST LEFT_BRACKET421_tree=null;
		AST RIGHT_BRACKET423_tree=null;
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
			// PHPAST.g:2077:3: ( ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) ) ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )* )
			// PHPAST.g:2077:5: ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) ) ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )*
			{
			// PHPAST.g:2077:5: ( compound_variable_without_dollar -> ^( VAR compound_variable_without_dollar ) )
			// PHPAST.g:2077:6: compound_variable_without_dollar
			{
			pushFollow(FOLLOW_compound_variable_without_dollar_in_reference_variable_without_dollar6223);
			compound_variable_without_dollar417=compound_variable_without_dollar();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_compound_variable_without_dollar.add(compound_variable_without_dollar417.getTree());
			if ( state.backtracking==0 ) {
			    token = (CommonToken)(compound_variable_without_dollar417!=null?(compound_variable_without_dollar417.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(compound_variable_without_dollar417!=null?(compound_variable_without_dollar417.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 2084:6: -> ^( VAR compound_variable_without_dollar )
			{
				// PHPAST.g:2084:10: ^( VAR compound_variable_without_dollar )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(VAR, "VAR"), root_1);
				adaptor.addChild(root_1, stream_compound_variable_without_dollar.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			// PHPAST.g:2085:3: ( LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT -> ^( INDEX $reference_variable_without_dollar ( expression )? ) | LEFT_BRACKET expression RIGHT_BRACKET -> ^( HASH_INDEX $reference_variable_without_dollar expression ) )*
			loop143:
			while (true) {
				int alt143=3;
				int LA143_0 = input.LA(1);
				if ( (LA143_0==LEFT_OPEN_RECT) ) {
					alt143=1;
				}
				else if ( (LA143_0==LEFT_BRACKET) ) {
					alt143=2;
				}

				switch (alt143) {
				case 1 :
					// PHPAST.g:2086:3: LEFT_OPEN_RECT ( expression )? RIGHT_OPEN_RECT
					{
					LEFT_OPEN_RECT418=(Token)match(input,LEFT_OPEN_RECT,FOLLOW_LEFT_OPEN_RECT_in_reference_variable_without_dollar6252); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_OPEN_RECT.add(LEFT_OPEN_RECT418);

					// PHPAST.g:2086:18: ( expression )?
					int alt142=2;
					int LA142_0 = input.LA(1);
					if ( ((LA142_0 >= AT_T && LA142_0 <= BACKTRICKLITERAL)||LA142_0==CLONE_T||(LA142_0 >= DOLLAR_T && LA142_0 <= DOMAIN_T)||LA142_0==DOUBLELITERRAL||LA142_0==EXC_NOT_T||LA142_0==FLOATLITERAL||LA142_0==FUNCTION_T||LA142_0==HERE_DOC||LA142_0==IDENTIFIER||LA142_0==INTLITERAL||(LA142_0 >= LEFT_OPEN_RECT && LA142_0 <= LEFT_PARETHESIS)||LA142_0==LIST_T||(LA142_0 >= MINUS_MINUS_T && LA142_0 <= MINUS_T)||(LA142_0 >= NAMESPACE_T && LA142_0 <= NEW_T)||(LA142_0 >= PLUS_PLUS_T && LA142_0 <= PLUS_T)||LA142_0==PRINT_T||(LA142_0 >= REALLITERAL && LA142_0 <= REF_T)||LA142_0==STATIC||LA142_0==STRINGLITERAL||LA142_0==TILDA_T||LA142_0==UNSET_T||(LA142_0 >= 176 && LA142_0 <= 182)||LA142_0==185) ) {
						alt142=1;
					}
					switch (alt142) {
						case 1 :
							// PHPAST.g:2086:18: expression
							{
							pushFollow(FOLLOW_expression_in_reference_variable_without_dollar6254);
							expression419=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression419.getTree());
							}
							break;

					}

					RIGHT_OPEN_RECT420=(Token)match(input,RIGHT_OPEN_RECT,FOLLOW_RIGHT_OPEN_RECT_in_reference_variable_without_dollar6257); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_OPEN_RECT.add(RIGHT_OPEN_RECT420);

					if ( state.backtracking==0 ) {
					    endIndex = ((CommonToken)RIGHT_OPEN_RECT420).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 2091:6: -> ^( INDEX $reference_variable_without_dollar ( expression )? )
					{
						// PHPAST.g:2091:10: ^( INDEX $reference_variable_without_dollar ( expression )? )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(INDEX, "INDEX"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						// PHPAST.g:2091:53: ( expression )?
						if ( stream_expression.hasNext() ) {
							adaptor.addChild(root_1, stream_expression.nextTree());
						}
						stream_expression.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// PHPAST.g:2093:3: LEFT_BRACKET expression RIGHT_BRACKET
					{
					LEFT_BRACKET421=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_reference_variable_without_dollar6288); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LEFT_BRACKET.add(LEFT_BRACKET421);

					pushFollow(FOLLOW_expression_in_reference_variable_without_dollar6290);
					expression422=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression422.getTree());
					RIGHT_BRACKET423=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_reference_variable_without_dollar6292); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RIGHT_BRACKET.add(RIGHT_BRACKET423);

					if ( state.backtracking==0 ) {
					    endIndex = ((CommonToken)RIGHT_BRACKET423).getStopIndex();
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
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (AST)adaptor.nil();
					// 2098:6: -> ^( HASH_INDEX $reference_variable_without_dollar expression )
					{
						// PHPAST.g:2098:10: ^( HASH_INDEX $reference_variable_without_dollar expression )
						{
						AST root_1 = (AST)adaptor.nil();
						root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(HASH_INDEX, "HASH_INDEX"), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop143;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			  
			  int currentEndIndex = endIndex;
			  Iterator iter = endIndexList.iterator();
			  while (iter.hasNext()) {
			    currentEndIndex = (Integer)iter.next();
			    ast.setIndex(startIndex, currentEndIndex);
			    ast = (AST)ast.getChild(0);
			  }
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reference_variable_without_dollar"


	public static class compound_variable_without_dollar_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "compound_variable_without_dollar"
	// PHPAST.g:2102:1: compound_variable_without_dollar : ( IDENTIFIER | LEFT_BRACKET ! expression RIGHT_BRACKET !);
	public final PHPASTParser.compound_variable_without_dollar_return compound_variable_without_dollar() throws RecognitionException {
		PHPASTParser.compound_variable_without_dollar_return retval = new PHPASTParser.compound_variable_without_dollar_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token IDENTIFIER424=null;
		Token LEFT_BRACKET425=null;
		Token RIGHT_BRACKET427=null;
		ParserRuleReturnScope expression426 =null;

		AST IDENTIFIER424_tree=null;
		AST LEFT_BRACKET425_tree=null;
		AST RIGHT_BRACKET427_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;  

		try {
			// PHPAST.g:2112:3: ( IDENTIFIER | LEFT_BRACKET ! expression RIGHT_BRACKET !)
			int alt144=2;
			int LA144_0 = input.LA(1);
			if ( (LA144_0==IDENTIFIER) ) {
				alt144=1;
			}
			else if ( (LA144_0==LEFT_BRACKET) ) {
				alt144=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 144, 0, input);
				throw nvae;
			}

			switch (alt144) {
				case 1 :
					// PHPAST.g:2112:5: IDENTIFIER
					{
					root_0 = (AST)adaptor.nil();


					IDENTIFIER424=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_compound_variable_without_dollar6342); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IDENTIFIER424_tree = (AST)adaptor.create(IDENTIFIER424);
					adaptor.addChild(root_0, IDENTIFIER424_tree);
					}

					if ( state.backtracking==0 ) {
					     token = (CommonToken)IDENTIFIER424;
					     startIndex = token.getStartIndex();
					     endIndex = token.getStopIndex();
					  }
					}
					break;
				case 2 :
					// PHPAST.g:2118:5: LEFT_BRACKET ! expression RIGHT_BRACKET !
					{
					root_0 = (AST)adaptor.nil();


					LEFT_BRACKET425=(Token)match(input,LEFT_BRACKET,FOLLOW_LEFT_BRACKET_in_compound_variable_without_dollar6352); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_compound_variable_without_dollar6355);
					expression426=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression426.getTree());

					RIGHT_BRACKET427=(Token)match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_compound_variable_without_dollar6357); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					     token = (CommonToken)LEFT_BRACKET425;
					     startIndex = token.getStartIndex();
					     token = (CommonToken)RIGHT_BRACKET427;
					     endIndex = token.getStopIndex();
					  }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compound_variable_without_dollar"


	public static class ctor_arguments_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "ctor_arguments"
	// PHPAST.g:2127:1: ctor_arguments : LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS -> ^( ARGU ( expr_list )? ) ;
	public final PHPASTParser.ctor_arguments_return ctor_arguments() throws RecognitionException {
		PHPASTParser.ctor_arguments_return retval = new PHPASTParser.ctor_arguments_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token LEFT_PARETHESIS428=null;
		Token RIGHT_PARETHESIS430=null;
		ParserRuleReturnScope expr_list429 =null;

		AST LEFT_PARETHESIS428_tree=null;
		AST RIGHT_PARETHESIS430_tree=null;
		RewriteRuleTokenStream stream_LEFT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token LEFT_PARETHESIS");
		RewriteRuleTokenStream stream_RIGHT_PARETHESIS=new RewriteRuleTokenStream(adaptor,"token RIGHT_PARETHESIS");
		RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:2137:3: ( LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS -> ^( ARGU ( expr_list )? ) )
			// PHPAST.g:2137:6: LEFT_PARETHESIS ( expr_list )? RIGHT_PARETHESIS
			{
			LEFT_PARETHESIS428=(Token)match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_ctor_arguments6388); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LEFT_PARETHESIS.add(LEFT_PARETHESIS428);

			// PHPAST.g:2137:22: ( expr_list )?
			int alt145=2;
			int LA145_0 = input.LA(1);
			if ( ((LA145_0 >= AT_T && LA145_0 <= BACKTRICKLITERAL)||LA145_0==CLONE_T||(LA145_0 >= DOLLAR_T && LA145_0 <= DOMAIN_T)||LA145_0==DOUBLELITERRAL||LA145_0==EXC_NOT_T||LA145_0==FLOATLITERAL||LA145_0==FUNCTION_T||LA145_0==HERE_DOC||LA145_0==IDENTIFIER||LA145_0==INTLITERAL||(LA145_0 >= LEFT_OPEN_RECT && LA145_0 <= LEFT_PARETHESIS)||LA145_0==LIST_T||(LA145_0 >= MINUS_MINUS_T && LA145_0 <= MINUS_T)||(LA145_0 >= NAMESPACE_T && LA145_0 <= NEW_T)||(LA145_0 >= PLUS_PLUS_T && LA145_0 <= PLUS_T)||LA145_0==PRINT_T||(LA145_0 >= REALLITERAL && LA145_0 <= REF_T)||LA145_0==STATIC||LA145_0==STRINGLITERAL||LA145_0==TILDA_T||LA145_0==UNSET_T||(LA145_0 >= 176 && LA145_0 <= 182)||LA145_0==185) ) {
				alt145=1;
			}
			switch (alt145) {
				case 1 :
					// PHPAST.g:2137:22: expr_list
					{
					pushFollow(FOLLOW_expr_list_in_ctor_arguments6390);
					expr_list429=expr_list();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expr_list.add(expr_list429.getTree());
					}
					break;

			}

			RIGHT_PARETHESIS430=(Token)match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_ctor_arguments6393); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RIGHT_PARETHESIS.add(RIGHT_PARETHESIS430);

			if ( state.backtracking==0 ) {
			      token = (CommonToken)LEFT_PARETHESIS428;
			      startIndex = token.getStartIndex();
			      token = (CommonToken)RIGHT_PARETHESIS430;
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 2144:6: -> ^( ARGU ( expr_list )? )
			{
				// PHPAST.g:2144:10: ^( ARGU ( expr_list )? )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(ARGU, "ARGU"), root_1);
				// PHPAST.g:2144:17: ( expr_list )?
				if ( stream_expr_list.hasNext() ) {
					adaptor.addChild(root_1, stream_expr_list.nextTree());
				}
				stream_expr_list.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ctor_arguments"


	public static class pure_variable_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "pure_variable"
	// PHPAST.g:2147:1: pure_variable : ( REF_T )? ( DOLLAR_T )+ IDENTIFIER -> ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) ;
	public final PHPASTParser.pure_variable_return pure_variable() throws RecognitionException {
		PHPASTParser.pure_variable_return retval = new PHPASTParser.pure_variable_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token REF_T431=null;
		Token DOLLAR_T432=null;
		Token IDENTIFIER433=null;

		AST REF_T431_tree=null;
		AST DOLLAR_T432_tree=null;
		AST IDENTIFIER433_tree=null;
		RewriteRuleTokenStream stream_REF_T=new RewriteRuleTokenStream(adaptor,"token REF_T");
		RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
		RewriteRuleTokenStream stream_DOLLAR_T=new RewriteRuleTokenStream(adaptor,"token DOLLAR_T");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:2157:3: ( ( REF_T )? ( DOLLAR_T )+ IDENTIFIER -> ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) )
			// PHPAST.g:2157:5: ( REF_T )? ( DOLLAR_T )+ IDENTIFIER
			{
			// PHPAST.g:2157:5: ( REF_T )?
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==REF_T) ) {
				alt146=1;
			}
			switch (alt146) {
				case 1 :
					// PHPAST.g:2157:5: REF_T
					{
					REF_T431=(Token)match(input,REF_T,FOLLOW_REF_T_in_pure_variable6439); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_REF_T.add(REF_T431);

					}
					break;

			}

			// PHPAST.g:2157:12: ( DOLLAR_T )+
			int cnt147=0;
			loop147:
			while (true) {
				int alt147=2;
				int LA147_0 = input.LA(1);
				if ( (LA147_0==DOLLAR_T) ) {
					alt147=1;
				}

				switch (alt147) {
				case 1 :
					// PHPAST.g:2157:12: DOLLAR_T
					{
					DOLLAR_T432=(Token)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_pure_variable6442); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOLLAR_T.add(DOLLAR_T432);

					}
					break;

				default :
					if ( cnt147 >= 1 ) break loop147;
					if (state.backtracking>0) {state.failed=true; return retval;}
					EarlyExitException eee = new EarlyExitException(147, input);
					throw eee;
				}
				cnt147++;
			}

			IDENTIFIER433=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pure_variable6445); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_IDENTIFIER.add(IDENTIFIER433);

			if ( state.backtracking==0 ) {
			      token = (CommonToken)DOLLAR_T432;
			      if ((REF_T431!=null?REF_T431.getText():null) != null) {
			        token = (CommonToken)REF_T431;
			      }
			      startIndex = token.getStartIndex();
			      token = (CommonToken)IDENTIFIER433;
			      endIndex = token.getStopIndex();
			    }
			// AST REWRITE
			// elements: IDENTIFIER, DOLLAR_T, REF_T
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 2167:5: -> ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER )
			{
				// PHPAST.g:2167:9: ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);
				// PHPAST.g:2167:20: ( REF_T )?
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


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST ast = retval.tree;
			  ast.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pure_variable"


	public static class scalar_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "scalar"
	// PHPAST.g:2170:1: scalar : constant -> ^( SCALAR constant ) ;
	public final PHPASTParser.scalar_return scalar() throws RecognitionException {
		PHPASTParser.scalar_return retval = new PHPASTParser.scalar_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		ParserRuleReturnScope constant434 =null;

		RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:2180:3: ( constant -> ^( SCALAR constant ) )
			// PHPAST.g:2180:5: constant
			{
			pushFollow(FOLLOW_constant_in_scalar6497);
			constant434=constant();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_constant.add(constant434.getTree());
			if ( state.backtracking==0 ) {
			    token = (CommonToken)(constant434!=null?(constant434.start):null);
			    startIndex = token.getStartIndex();
			    token = (CommonToken)(constant434!=null?(constant434.stop):null);
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
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (AST)adaptor.nil();
			// 2187:5: -> ^( SCALAR constant )
			{
				// PHPAST.g:2187:9: ^( SCALAR constant )
				{
				AST root_1 = (AST)adaptor.nil();
				root_1 = (AST)adaptor.becomeRoot((AST)adaptor.create(SCALAR, "SCALAR"), root_1);
				adaptor.addChild(root_1, stream_constant.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST exprToken = retval.tree;
			  exprToken.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scalar"


	public static class constant_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// PHPAST.g:2190:1: constant : ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | DOUBLELITERRAL | REALLITERAL | common_scalar | fully_qualified_class_name | HERE_DOC );
	public final PHPASTParser.constant_return constant() throws RecognitionException {
		PHPASTParser.constant_return retval = new PHPASTParser.constant_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token INTLITERAL435=null;
		Token FLOATLITERAL436=null;
		Token STRINGLITERAL437=null;
		Token DOUBLELITERRAL438=null;
		Token REALLITERAL439=null;
		Token HERE_DOC442=null;
		ParserRuleReturnScope common_scalar440 =null;
		ParserRuleReturnScope fully_qualified_class_name441 =null;

		AST INTLITERAL435_tree=null;
		AST FLOATLITERAL436_tree=null;
		AST STRINGLITERAL437_tree=null;
		AST DOUBLELITERRAL438_tree=null;
		AST REALLITERAL439_tree=null;
		AST HERE_DOC442_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  CommonToken token;

		try {
			// PHPAST.g:2200:3: ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | DOUBLELITERRAL | REALLITERAL | common_scalar | fully_qualified_class_name | HERE_DOC )
			int alt148=8;
			switch ( input.LA(1) ) {
			case INTLITERAL:
				{
				alt148=1;
				}
				break;
			case FLOATLITERAL:
				{
				alt148=2;
				}
				break;
			case STRINGLITERAL:
				{
				alt148=3;
				}
				break;
			case DOUBLELITERRAL:
				{
				alt148=4;
				}
				break;
			case REALLITERAL:
				{
				alt148=5;
				}
				break;
			case 176:
			case 177:
			case 178:
			case 179:
			case 180:
			case 181:
			case 182:
				{
				alt148=6;
				}
				break;
			case DOMAIN_T:
			case IDENTIFIER:
			case NAMESPACE_T:
				{
				alt148=7;
				}
				break;
			case HERE_DOC:
				{
				alt148=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 148, 0, input);
				throw nvae;
			}
			switch (alt148) {
				case 1 :
					// PHPAST.g:2200:5: INTLITERAL
					{
					root_0 = (AST)adaptor.nil();


					INTLITERAL435=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_constant6542); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTLITERAL435_tree = (AST)adaptor.create(INTLITERAL435);
					adaptor.addChild(root_0, INTLITERAL435_tree);
					}

					}
					break;
				case 2 :
					// PHPAST.g:2201:5: FLOATLITERAL
					{
					root_0 = (AST)adaptor.nil();


					FLOATLITERAL436=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_constant6551); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FLOATLITERAL436_tree = (AST)adaptor.create(FLOATLITERAL436);
					adaptor.addChild(root_0, FLOATLITERAL436_tree);
					}

					}
					break;
				case 3 :
					// PHPAST.g:2202:5: STRINGLITERAL
					{
					root_0 = (AST)adaptor.nil();


					STRINGLITERAL437=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_constant6557); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRINGLITERAL437_tree = (AST)adaptor.create(STRINGLITERAL437);
					adaptor.addChild(root_0, STRINGLITERAL437_tree);
					}

					}
					break;
				case 4 :
					// PHPAST.g:2204:5: DOUBLELITERRAL
					{
					root_0 = (AST)adaptor.nil();


					DOUBLELITERRAL438=(Token)match(input,DOUBLELITERRAL,FOLLOW_DOUBLELITERRAL_in_constant6564); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOUBLELITERRAL438_tree = (AST)adaptor.create(DOUBLELITERRAL438);
					adaptor.addChild(root_0, DOUBLELITERRAL438_tree);
					}

					}
					break;
				case 5 :
					// PHPAST.g:2205:5: REALLITERAL
					{
					root_0 = (AST)adaptor.nil();


					REALLITERAL439=(Token)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_constant6570); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					REALLITERAL439_tree = (AST)adaptor.create(REALLITERAL439);
					adaptor.addChild(root_0, REALLITERAL439_tree);
					}

					}
					break;
				case 6 :
					// PHPAST.g:2206:5: common_scalar
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_common_scalar_in_constant6576);
					common_scalar440=common_scalar();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, common_scalar440.getTree());

					}
					break;
				case 7 :
					// PHPAST.g:2207:5: fully_qualified_class_name
					{
					root_0 = (AST)adaptor.nil();


					pushFollow(FOLLOW_fully_qualified_class_name_in_constant6584);
					fully_qualified_class_name441=fully_qualified_class_name();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fully_qualified_class_name441.getTree());

					if ( state.backtracking==0 ) {
					    token = (CommonToken)(fully_qualified_class_name441!=null?(fully_qualified_class_name441.start):null);
					    startIndex = token.getStartIndex();
					    token = (CommonToken)(fully_qualified_class_name441!=null?(fully_qualified_class_name441.stop):null);
					    endIndex = token.getStopIndex();
					  }
					}
					break;
				case 8 :
					// PHPAST.g:2214:5: HERE_DOC
					{
					root_0 = (AST)adaptor.nil();


					HERE_DOC442=(Token)match(input,HERE_DOC,FOLLOW_HERE_DOC_in_constant6594); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					HERE_DOC442_tree = (AST)adaptor.create(HERE_DOC442);
					adaptor.addChild(root_0, HERE_DOC442_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {
			  AST exprToken = retval.tree;
			  exprToken.setIndex(startIndex, endIndex);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class common_scalar_return extends ParserRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "common_scalar"
	// PHPAST.g:2217:1: common_scalar : ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' );
	public final PHPASTParser.common_scalar_return common_scalar() throws RecognitionException {
		PHPASTParser.common_scalar_return retval = new PHPASTParser.common_scalar_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		Token set443=null;

		AST set443_tree=null;

		try {
			// PHPAST.g:2218:3: ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' )
			// PHPAST.g:
			{
			root_0 = (AST)adaptor.nil();


			set443=input.LT(1);
			if ( (input.LA(1) >= 176 && input.LA(1) <= 182) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (AST)adaptor.create(set443));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (AST)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "common_scalar"

	// $ANTLR start synpred4_PHPAST
	public final void synpred4_PHPAST_fragment() throws RecognitionException {
		// PHPAST.g:133:5: ( statement )
		// PHPAST.g:133:5: statement
		{
		pushFollow(FOLLOW_statement_in_synpred4_PHPAST519);
		statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_PHPAST

	// $ANTLR start synpred23_PHPAST
	public final void synpred23_PHPAST_fragment() throws RecognitionException {
		// PHPAST.g:218:5: ( variable_modifiers static_var_list SEMI_COLON )
		// PHPAST.g:218:5: variable_modifiers static_var_list SEMI_COLON
		{
		pushFollow(FOLLOW_variable_modifiers_in_synpred23_PHPAST943);
		variable_modifiers();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_static_var_list_in_synpred23_PHPAST945);
		static_var_list();
		state._fsp--;
		if (state.failed) return;

		match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_synpred23_PHPAST947); if (state.failed) return;

		}

	}
	// $ANTLR end synpred23_PHPAST

	// $ANTLR start synpred27_PHPAST
	public final void synpred27_PHPAST_fragment() throws RecognitionException {
		// PHPAST.g:226:5: ( ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON )
		// PHPAST.g:226:5: ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS SEMI_COLON
		{
		// PHPAST.g:226:5: ( modifier )?
		int alt156=2;
		int LA156_0 = input.LA(1);
		if ( (LA156_0==STATIC_T||LA156_0==184||LA156_0==189||(LA156_0 >= 193 && LA156_0 <= 195)) ) {
			alt156=1;
		}
		switch (alt156) {
			case 1 :
				// PHPAST.g:226:5: modifier
				{
				pushFollow(FOLLOW_modifier_in_synpred27_PHPAST974);
				modifier();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_synpred27_PHPAST977); if (state.failed) return;

		// PHPAST.g:226:26: ( REF_T )?
		int alt157=2;
		int LA157_0 = input.LA(1);
		if ( (LA157_0==REF_T) ) {
			alt157=1;
		}
		switch (alt157) {
			case 1 :
				// PHPAST.g:226:26: REF_T
				{
				match(input,REF_T,FOLLOW_REF_T_in_synpred27_PHPAST979); if (state.failed) return;

				}
				break;

		}

		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred27_PHPAST982); if (state.failed) return;

		match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_synpred27_PHPAST984); if (state.failed) return;

		// PHPAST.g:226:60: ( parameter_list )?
		int alt158=2;
		int LA158_0 = input.LA(1);
		if ( (LA158_0==CLONE_T||LA158_0==CONST_T||(LA158_0 >= DOLLAR_T && LA158_0 <= DOMAIN_T)||LA158_0==IDENTIFIER||LA158_0==NAMESPACE_T||LA158_0==REF_T||LA158_0==UNSET_T||(LA158_0 >= 185 && LA158_0 <= 188)||(LA158_0 >= 190 && LA158_0 <= 192)||(LA158_0 >= 196 && LA158_0 <= 197)) ) {
			alt158=1;
		}
		switch (alt158) {
			case 1 :
				// PHPAST.g:226:60: parameter_list
				{
				pushFollow(FOLLOW_parameter_list_in_synpred27_PHPAST986);
				parameter_list();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_synpred27_PHPAST989); if (state.failed) return;

		match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_synpred27_PHPAST991); if (state.failed) return;

		}

	}
	// $ANTLR end synpred27_PHPAST

	// $ANTLR start synpred31_PHPAST
	public final void synpred31_PHPAST_fragment() throws RecognitionException {
		// PHPAST.g:239:5: ( ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block )
		// PHPAST.g:239:5: ( modifier )? FUNCTION_T ( REF_T )? IDENTIFIER LEFT_PARETHESIS ( parameter_list )? RIGHT_PARETHESIS block
		{
		// PHPAST.g:239:5: ( modifier )?
		int alt159=2;
		int LA159_0 = input.LA(1);
		if ( (LA159_0==STATIC_T||LA159_0==184||LA159_0==189||(LA159_0 >= 193 && LA159_0 <= 195)) ) {
			alt159=1;
		}
		switch (alt159) {
			case 1 :
				// PHPAST.g:239:5: modifier
				{
				pushFollow(FOLLOW_modifier_in_synpred31_PHPAST1026);
				modifier();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		match(input,FUNCTION_T,FOLLOW_FUNCTION_T_in_synpred31_PHPAST1029); if (state.failed) return;

		// PHPAST.g:239:26: ( REF_T )?
		int alt160=2;
		int LA160_0 = input.LA(1);
		if ( (LA160_0==REF_T) ) {
			alt160=1;
		}
		switch (alt160) {
			case 1 :
				// PHPAST.g:239:26: REF_T
				{
				match(input,REF_T,FOLLOW_REF_T_in_synpred31_PHPAST1031); if (state.failed) return;

				}
				break;

		}

		match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred31_PHPAST1034); if (state.failed) return;

		match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_synpred31_PHPAST1036); if (state.failed) return;

		// PHPAST.g:239:60: ( parameter_list )?
		int alt161=2;
		int LA161_0 = input.LA(1);
		if ( (LA161_0==CLONE_T||LA161_0==CONST_T||(LA161_0 >= DOLLAR_T && LA161_0 <= DOMAIN_T)||LA161_0==IDENTIFIER||LA161_0==NAMESPACE_T||LA161_0==REF_T||LA161_0==UNSET_T||(LA161_0 >= 185 && LA161_0 <= 188)||(LA161_0 >= 190 && LA161_0 <= 192)||(LA161_0 >= 196 && LA161_0 <= 197)) ) {
			alt161=1;
		}
		switch (alt161) {
			case 1 :
				// PHPAST.g:239:60: parameter_list
				{
				pushFollow(FOLLOW_parameter_list_in_synpred31_PHPAST1038);
				parameter_list();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_synpred31_PHPAST1041); if (state.failed) return;

		pushFollow(FOLLOW_block_in_synpred31_PHPAST1043);
		block();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred31_PHPAST

	// $ANTLR start synpred35_PHPAST
	public final void synpred35_PHPAST_fragment() throws RecognitionException {
		// PHPAST.g:280:37: ( RIGHT_BRACKET )
		// PHPAST.g:280:37: RIGHT_BRACKET
		{
		match(input,RIGHT_BRACKET,FOLLOW_RIGHT_BRACKET_in_synpred35_PHPAST1162); if (state.failed) return;

		}

	}
	// $ANTLR end synpred35_PHPAST

	// $ANTLR start synpred79_PHPAST
	public final void synpred79_PHPAST_fragment() throws RecognitionException {
		Token id2=null;


		// PHPAST.g:596:46: ( DOMAIN_T id2= IDENTIFIER )
		// PHPAST.g:596:46: DOMAIN_T id2= IDENTIFIER
		{
		match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_synpred79_PHPAST2432); if (state.failed) return;

		id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred79_PHPAST2437); if (state.failed) return;

		}

	}
	// $ANTLR end synpred79_PHPAST

	// $ANTLR start synpred80_PHPAST
	public final void synpred80_PHPAST_fragment() throws RecognitionException {
		Token d2=null;


		// PHPAST.g:596:75: (d2= DOMAIN_T )
		// PHPAST.g:596:75: d2= DOMAIN_T
		{
		d2=(Token)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_synpred80_PHPAST2443); if (state.failed) return;

		}

	}
	// $ANTLR end synpred80_PHPAST

	// $ANTLR start synpred83_PHPAST
	public final void synpred83_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope eElseCond =null;
		ParserRuleReturnScope s2 =null;


		// PHPAST.g:655:53: ( ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement )
		// PHPAST.g:655:53: ELSEIF_T LEFT_PARETHESIS eElseCond= expression RIGHT_PARETHESIS s2= statement
		{
		match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_synpred83_PHPAST2588); if (state.failed) return;

		match(input,LEFT_PARETHESIS,FOLLOW_LEFT_PARETHESIS_in_synpred83_PHPAST2590); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred83_PHPAST2594);
		eElseCond=expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RIGHT_PARETHESIS,FOLLOW_RIGHT_PARETHESIS_in_synpred83_PHPAST2596); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred83_PHPAST2600);
		s2=statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred83_PHPAST

	// $ANTLR start synpred84_PHPAST
	public final void synpred84_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope s3 =null;


		// PHPAST.g:656:42: ( ELSE_T s3= statement )
		// PHPAST.g:656:42: ELSE_T s3= statement
		{
		match(input,ELSE_T,FOLLOW_ELSE_T_in_synpred84_PHPAST2626); if (state.failed) return;

		pushFollow(FOLLOW_statement_in_synpred84_PHPAST2630);
		s3=statement();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred84_PHPAST

	// $ANTLR start synpred124_PHPAST
	public final void synpred124_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1080:31: ( OR_T e2= logical_text_xor_expr )
		// PHPAST.g:1080:31: OR_T e2= logical_text_xor_expr
		{
		match(input,OR_T,FOLLOW_OR_T_in_synpred124_PHPAST3851); if (state.failed) return;

		pushFollow(FOLLOW_logical_text_xor_expr_in_synpred124_PHPAST3856);
		e2=logical_text_xor_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred124_PHPAST

	// $ANTLR start synpred125_PHPAST
	public final void synpred125_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1102:31: ( XOR_T e2= logical_text_and_expr )
		// PHPAST.g:1102:31: XOR_T e2= logical_text_and_expr
		{
		match(input,XOR_T,FOLLOW_XOR_T_in_synpred125_PHPAST3890); if (state.failed) return;

		pushFollow(FOLLOW_logical_text_and_expr_in_synpred125_PHPAST3895);
		e2=logical_text_and_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred125_PHPAST

	// $ANTLR start synpred126_PHPAST
	public final void synpred126_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1124:25: ( AND_T e2= assignment_expr )
		// PHPAST.g:1124:25: AND_T e2= assignment_expr
		{
		match(input,AND_T,FOLLOW_AND_T_in_synpred126_PHPAST3929); if (state.failed) return;

		pushFollow(FOLLOW_assignment_expr_in_synpred126_PHPAST3934);
		e2=assignment_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred126_PHPAST

	// $ANTLR start synpred127_PHPAST
	public final void synpred127_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1146:26: ( assignment_operator e2= conditional_expr )
		// PHPAST.g:1146:26: assignment_operator e2= conditional_expr
		{
		pushFollow(FOLLOW_assignment_operator_in_synpred127_PHPAST3968);
		assignment_operator();
		state._fsp--;
		if (state.failed) return;

		pushFollow(FOLLOW_conditional_expr_in_synpred127_PHPAST3973);
		e2=conditional_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred127_PHPAST

	// $ANTLR start synpred140_PHPAST
	public final void synpred140_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope lr =null;


		// PHPAST.g:1191:5: ( QUESTION_T ( expression )? COLON_T lr= logical_or_expr )
		// PHPAST.g:1191:5: QUESTION_T ( expression )? COLON_T lr= logical_or_expr
		{
		match(input,QUESTION_T,FOLLOW_QUESTION_T_in_synpred140_PHPAST4128); if (state.failed) return;

		// PHPAST.g:1191:16: ( expression )?
		int alt179=2;
		int LA179_0 = input.LA(1);
		if ( ((LA179_0 >= AT_T && LA179_0 <= BACKTRICKLITERAL)||LA179_0==CLONE_T||(LA179_0 >= DOLLAR_T && LA179_0 <= DOMAIN_T)||LA179_0==DOUBLELITERRAL||LA179_0==EXC_NOT_T||LA179_0==FLOATLITERAL||LA179_0==FUNCTION_T||LA179_0==HERE_DOC||LA179_0==IDENTIFIER||LA179_0==INTLITERAL||(LA179_0 >= LEFT_OPEN_RECT && LA179_0 <= LEFT_PARETHESIS)||LA179_0==LIST_T||(LA179_0 >= MINUS_MINUS_T && LA179_0 <= MINUS_T)||(LA179_0 >= NAMESPACE_T && LA179_0 <= NEW_T)||(LA179_0 >= PLUS_PLUS_T && LA179_0 <= PLUS_T)||LA179_0==PRINT_T||(LA179_0 >= REALLITERAL && LA179_0 <= REF_T)||LA179_0==STATIC||LA179_0==STRINGLITERAL||LA179_0==TILDA_T||LA179_0==UNSET_T||(LA179_0 >= 176 && LA179_0 <= 182)||LA179_0==185) ) {
			alt179=1;
		}
		switch (alt179) {
			case 1 :
				// PHPAST.g:1191:16: expression
				{
				pushFollow(FOLLOW_expression_in_synpred140_PHPAST4130);
				expression();
				state._fsp--;
				if (state.failed) return;

				}
				break;

		}

		match(input,COLON_T,FOLLOW_COLON_T_in_synpred140_PHPAST4133); if (state.failed) return;

		pushFollow(FOLLOW_logical_or_expr_in_synpred140_PHPAST4137);
		lr=logical_or_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred140_PHPAST

	// $ANTLR start synpred141_PHPAST
	public final void synpred141_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1208:26: ( LOGICAL_OR_T e2= logical_and_expr )
		// PHPAST.g:1208:26: LOGICAL_OR_T e2= logical_and_expr
		{
		match(input,LOGICAL_OR_T,FOLLOW_LOGICAL_OR_T_in_synpred141_PHPAST4190); if (state.failed) return;

		pushFollow(FOLLOW_logical_and_expr_in_synpred141_PHPAST4195);
		e2=logical_and_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred141_PHPAST

	// $ANTLR start synpred142_PHPAST
	public final void synpred142_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1230:25: ( LOGICAL_AND_T e2= bitwise_or_expr )
		// PHPAST.g:1230:25: LOGICAL_AND_T e2= bitwise_or_expr
		{
		match(input,LOGICAL_AND_T,FOLLOW_LOGICAL_AND_T_in_synpred142_PHPAST4229); if (state.failed) return;

		pushFollow(FOLLOW_bitwise_or_expr_in_synpred142_PHPAST4234);
		e2=bitwise_or_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred142_PHPAST

	// $ANTLR start synpred143_PHPAST
	public final void synpred143_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1252:26: ( BIT_OR_T e2= bitwise_xor_expr )
		// PHPAST.g:1252:26: BIT_OR_T e2= bitwise_xor_expr
		{
		match(input,BIT_OR_T,FOLLOW_BIT_OR_T_in_synpred143_PHPAST4268); if (state.failed) return;

		pushFollow(FOLLOW_bitwise_xor_expr_in_synpred143_PHPAST4273);
		e2=bitwise_xor_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred143_PHPAST

	// $ANTLR start synpred144_PHPAST
	public final void synpred144_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1274:26: ( POWER_T e2= bitwise_and_expr )
		// PHPAST.g:1274:26: POWER_T e2= bitwise_and_expr
		{
		match(input,POWER_T,FOLLOW_POWER_T_in_synpred144_PHPAST4307); if (state.failed) return;

		pushFollow(FOLLOW_bitwise_and_expr_in_synpred144_PHPAST4312);
		e2=bitwise_and_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred144_PHPAST

	// $ANTLR start synpred145_PHPAST
	public final void synpred145_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1296:21: ( DOT_T e2= concat_expr )
		// PHPAST.g:1296:21: DOT_T e2= concat_expr
		{
		match(input,DOT_T,FOLLOW_DOT_T_in_synpred145_PHPAST4346); if (state.failed) return;

		pushFollow(FOLLOW_concat_expr_in_synpred145_PHPAST4351);
		e2=concat_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred145_PHPAST

	// $ANTLR start synpred146_PHPAST
	public final void synpred146_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1318:23: ( REF_T e2= equality_expr )
		// PHPAST.g:1318:23: REF_T e2= equality_expr
		{
		match(input,REF_T,FOLLOW_REF_T_in_synpred146_PHPAST4385); if (state.failed) return;

		pushFollow(FOLLOW_equality_expr_in_synpred146_PHPAST4390);
		e2=equality_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred146_PHPAST

	// $ANTLR start synpred150_PHPAST
	public final void synpred150_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1340:25: ( ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr )
		// PHPAST.g:1340:25: ( EQUAL_EQUAL_T | NOT_EQUAL_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T ) e2= relational_expr
		{
		if ( (input.LA(1) >= EQUAL_EQUAL_EQUAL_T && input.LA(1) <= EQUAL_EQUAL_T)||(input.LA(1) >= NOT_EQUAL_EQUAL_T && input.LA(1) <= NOT_EQUAL_T) ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_relational_expr_in_synpred150_PHPAST4443);
		e2=relational_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred150_PHPAST

	// $ANTLR start synpred154_PHPAST
	public final void synpred154_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1362:20: ( ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr )
		// PHPAST.g:1362:20: ( LT_T | MT_T | LE_T | ME_T ) e2= shift_expr
		{
		if ( input.LA(1)==LE_T||input.LA(1)==LT_T||input.LA(1)==ME_T||input.LA(1)==MT_T ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_shift_expr_in_synpred154_PHPAST4496);
		e2=shift_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred154_PHPAST

	// $ANTLR start synpred156_PHPAST
	public final void synpred156_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1384:23: ( ( LSHIFT_T | RSHIFT_T ) e2= additive_expr )
		// PHPAST.g:1384:23: ( LSHIFT_T | RSHIFT_T ) e2= additive_expr
		{
		if ( input.LA(1)==LSHIFT_T||input.LA(1)==RSHIFT_T ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_additive_expr_in_synpred156_PHPAST4541);
		e2=additive_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred156_PHPAST

	// $ANTLR start synpred158_PHPAST
	public final void synpred158_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1406:29: ( ( PLUS_T | MINUS_T ) e2= multiplicative_expr )
		// PHPAST.g:1406:29: ( PLUS_T | MINUS_T ) e2= multiplicative_expr
		{
		if ( input.LA(1)==MINUS_T||input.LA(1)==PLUS_T ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_multiplicative_expr_in_synpred158_PHPAST4586);
		e2=multiplicative_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred158_PHPAST

	// $ANTLR start synpred161_PHPAST
	public final void synpred161_PHPAST_fragment() throws RecognitionException {
		ParserRuleReturnScope e2 =null;


		// PHPAST.g:1428:19: ( ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr )
		// PHPAST.g:1428:19: ( MUL_T | DIV_T | PERCENT_T ) e2= cast_expr
		{
		if ( input.LA(1)==DIV_T||input.LA(1)==MUL_T||input.LA(1)==PERCENT_T ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_cast_expr_in_synpred161_PHPAST4635);
		e2=cast_expr();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred161_PHPAST

	// $ANTLR start synpred182_PHPAST
	public final void synpred182_PHPAST_fragment() throws RecognitionException {
		// PHPAST.g:1561:4: ( plus_minus )
		// PHPAST.g:1561:4: plus_minus
		{
		pushFollow(FOLLOW_plus_minus_in_synpred182_PHPAST4981);
		plus_minus();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred182_PHPAST

	// $ANTLR start synpred184_PHPAST
	public final void synpred184_PHPAST_fragment() throws RecognitionException {
		// PHPAST.g:1584:16: ( INSTANCEOF_T class_name_reference )
		// PHPAST.g:1584:16: INSTANCEOF_T class_name_reference
		{
		match(input,INSTANCEOF_T,FOLLOW_INSTANCEOF_T_in_synpred184_PHPAST5052); if (state.failed) return;

		pushFollow(FOLLOW_class_name_reference_in_synpred184_PHPAST5055);
		class_name_reference();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred184_PHPAST

	// Delegated rules

	public final boolean synpred80_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred80_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred141_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred141_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred126_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred126_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred182_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred182_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred31_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred31_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred83_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred124_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred124_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred84_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred84_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred35_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred35_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred146_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred146_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred161_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred161_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred127_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred127_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred79_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred79_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred140_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred140_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred154_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred154_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred158_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred158_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred150_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred150_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred125_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred125_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred142_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred142_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred145_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred145_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred184_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred184_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred156_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred156_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred143_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred143_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred144_PHPAST() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred144_PHPAST_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA29 dfa29 = new DFA29(this);
	protected DFA114 dfa114 = new DFA114(this);
	protected DFA122 dfa122 = new DFA122(this);
	protected DFA136 dfa136 = new DFA136(this);
	protected DFA140 dfa140 = new DFA140(this);
	static final String DFA29_eotS =
		"\10\uffff";
	static final String DFA29_eofS =
		"\10\uffff";
	static final String DFA29_minS =
		"\2\45\1\114\2\11\2\uffff\1\11";
	static final String DFA29_maxS =
		"\1\163\1\45\1\114\2\122\2\uffff\1\122";
	static final String DFA29_acceptS =
		"\5\uffff\1\1\1\2\1\uffff";
	static final String DFA29_specialS =
		"\10\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\2\46\uffff\1\3\46\uffff\1\1",
			"\1\2",
			"\1\3",
			"\1\6\33\uffff\1\4\54\uffff\1\5",
			"\1\6\102\uffff\1\7\5\uffff\1\5",
			"",
			"",
			"\1\6\33\uffff\1\4\54\uffff\1\5"
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "291:1: trait_adaptation : ( fully_qualified_class_name INSTANCEOF_T fully_qualified_class_name_list SEMI_COLON -> ^( INSTANCEOF_T fully_qualified_class_name fully_qualified_class_name_list ) | fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? SEMI_COLON -> ^( TRAIT_METH fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? ) );";
		}
	}

	static final String DFA114_eotS =
		"\22\uffff";
	static final String DFA114_eofS =
		"\4\uffff\1\6\13\uffff\2\6";
	static final String DFA114_minS =
		"\1\12\1\44\1\45\1\114\1\4\13\uffff\2\4";
	static final String DFA114_maxS =
		"\1\u00b9\1\u00b6\1\45\1\114\1\u00af\13\uffff\2\u00af";
	static final String DFA114_acceptS =
		"\5\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\uffff";
	static final String DFA114_specialS =
		"\22\uffff}>";
	static final String[] DFA114_transitionS = {
			"\1\1\1\16\15\uffff\1\13\12\uffff\1\5\1\3\2\uffff\1\6\27\uffff\1\6\2\uffff"+
			"\1\14\4\uffff\1\6\3\uffff\1\4\7\uffff\1\6\6\uffff\1\11\1\7\4\uffff\1"+
			"\10\21\uffff\1\2\1\12\20\uffff\1\17\2\uffff\1\6\21\uffff\1\5\1\uffff"+
			"\1\6\12\uffff\1\15\10\uffff\7\6\2\uffff\1\11",
			"\1\5\1\3\2\uffff\1\6\27\uffff\1\6\7\uffff\1\6\3\uffff\1\4\7\uffff\1"+
			"\6\36\uffff\1\2\24\uffff\1\6\21\uffff\1\5\1\uffff\1\6\23\uffff\7\6",
			"\1\3",
			"\1\4",
			"\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\3\6\13\uffff\2\6\6\uffff\2\6\1"+
			"\5\1\20\2\6\17\uffff\3\6\30\uffff\1\6\11\uffff\1\5\1\6\4\uffff\5\6\3"+
			"\uffff\7\6\4\uffff\2\6\1\uffff\1\6\1\uffff\5\6\2\uffff\2\6\4\uffff\1"+
			"\6\1\uffff\1\6\3\uffff\5\6\3\uffff\1\6\31\uffff\1\6",
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
			"\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\3\6\13\uffff\2\6\6\uffff\2\6\1"+
			"\5\1\uffff\2\6\17\uffff\3\6\22\uffff\1\21\5\uffff\1\6\11\uffff\1\5\1"+
			"\6\4\uffff\5\6\3\uffff\7\6\4\uffff\2\6\1\uffff\1\6\1\uffff\5\6\2\uffff"+
			"\2\6\4\uffff\1\6\1\uffff\1\6\3\uffff\5\6\3\uffff\1\6\31\uffff\1\6",
			"\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\3\6\13\uffff\2\6\6\uffff\2\6\1"+
			"\5\1\20\2\6\17\uffff\3\6\30\uffff\1\6\11\uffff\1\5\1\6\4\uffff\5\6\3"+
			"\uffff\7\6\4\uffff\2\6\1\uffff\1\6\1\uffff\5\6\2\uffff\2\6\4\uffff\1"+
			"\6\1\uffff\1\6\3\uffff\5\6\3\uffff\1\6\31\uffff\1\6"
	};

	static final short[] DFA114_eot = DFA.unpackEncodedString(DFA114_eotS);
	static final short[] DFA114_eof = DFA.unpackEncodedString(DFA114_eofS);
	static final char[] DFA114_min = DFA.unpackEncodedStringToUnsignedChars(DFA114_minS);
	static final char[] DFA114_max = DFA.unpackEncodedStringToUnsignedChars(DFA114_maxS);
	static final short[] DFA114_accept = DFA.unpackEncodedString(DFA114_acceptS);
	static final short[] DFA114_special = DFA.unpackEncodedString(DFA114_specialS);
	static final short[][] DFA114_transition;

	static {
		int numStates = DFA114_transitionS.length;
		DFA114_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA114_transition[i] = DFA.unpackEncodedString(DFA114_transitionS[i]);
		}
	}

	protected class DFA114 extends DFA {

		public DFA114(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 114;
			this.eot = DFA114_eot;
			this.eof = DFA114_eof;
			this.min = DFA114_min;
			this.max = DFA114_max;
			this.accept = DFA114_accept;
			this.special = DFA114_special;
			this.transition = DFA114_transition;
		}
		@Override
		public String getDescription() {
			return "1596:1: atom_expr : ( ( AT_T )? variable | ( AT_T )? scalar | LEFT_PARETHESIS expression RIGHT_PARETHESIS | LIST_T LEFT_PARETHESIS assignment_list RIGHT_PARETHESIS -> ^( LIST_T assignment_list ) | array_decl | NEW_T class_name_reference -> ^( NEW_T class_name_reference ) | CLONE_T variable -> ^( CLONE_T variable ) | lambda_function_declaration | UNSET_T LEFT_PARETHESIS variable_list RIGHT_PARETHESIS -> ^( UNSET_T variable_list ) | BACKTRICKLITERAL | PRINT_T expression -> ^( PRINT_T expression ) );";
		}
	}

	static final String DFA122_eotS =
		"\10\uffff";
	static final String DFA122_eofS =
		"\3\uffff\1\6\1\uffff\1\6\1\uffff\1\6";
	static final String DFA122_minS =
		"\1\44\1\45\1\114\1\4\1\uffff\1\4\1\uffff\1\4";
	static final String DFA122_maxS =
		"\1\u009a\1\45\1\114\1\u00af\1\uffff\1\u00af\1\uffff\1\u00af";
	static final String DFA122_acceptS =
		"\4\uffff\1\1\1\uffff\1\2\1\uffff";
	static final String DFA122_specialS =
		"\10\uffff}>";
	static final String[] DFA122_transitionS = {
			"\1\4\1\2\46\uffff\1\3\46\uffff\1\1\46\uffff\1\4",
			"\1\2",
			"\1\3",
			"\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\3\6\13\uffff\2\6\6\uffff\2\6\1"+
			"\4\1\5\2\6\17\uffff\3\6\30\uffff\1\6\11\uffff\1\4\1\6\4\uffff\5\6\3\uffff"+
			"\7\6\4\uffff\2\6\1\uffff\1\6\1\uffff\5\6\2\uffff\2\6\4\uffff\1\6\1\uffff"+
			"\1\6\3\uffff\5\6\3\uffff\1\6\31\uffff\1\6",
			"",
			"\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\3\6\13\uffff\2\6\6\uffff\2\6\1"+
			"\4\1\uffff\2\6\17\uffff\3\6\22\uffff\1\7\5\uffff\1\6\11\uffff\1\4\1\6"+
			"\4\uffff\5\6\3\uffff\7\6\4\uffff\2\6\1\uffff\1\6\1\uffff\5\6\2\uffff"+
			"\2\6\4\uffff\1\6\1\uffff\1\6\3\uffff\5\6\3\uffff\1\6\31\uffff\1\6",
			"",
			"\1\6\2\uffff\1\6\1\uffff\1\6\2\uffff\3\6\13\uffff\2\6\6\uffff\2\6\1"+
			"\4\1\5\2\6\17\uffff\3\6\30\uffff\1\6\11\uffff\1\4\1\6\4\uffff\5\6\3\uffff"+
			"\7\6\4\uffff\2\6\1\uffff\1\6\1\uffff\5\6\2\uffff\2\6\4\uffff\1\6\1\uffff"+
			"\1\6\3\uffff\5\6\3\uffff\1\6\31\uffff\1\6"
	};

	static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
	static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
	static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
	static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
	static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
	static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
	static final short[][] DFA122_transition;

	static {
		int numStates = DFA122_transitionS.length;
		DFA122_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
		}
	}

	protected class DFA122 extends DFA {

		public DFA122(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 122;
			this.eot = DFA122_eot;
			this.eof = DFA122_eof;
			this.min = DFA122_min;
			this.max = DFA122_max;
			this.accept = DFA122_accept;
			this.special = DFA122_special;
			this.transition = DFA122_transition;
		}
		@Override
		public String getDescription() {
			return "1730:1: class_name_reference : ( dynamic_name_reference | fully_qualified_class_name );";
		}
	}

	static final String DFA136_eotS =
		"\14\uffff";
	static final String DFA136_eofS =
		"\14\uffff";
	static final String DFA136_minS =
		"\1\44\1\45\1\114\1\44\1\uffff\1\45\1\44\1\uffff\2\44\2\uffff";
	static final String DFA136_maxS =
		"\1\u009a\1\45\1\114\1\134\1\uffff\1\45\1\134\1\uffff\1\132\1\134\2\uffff";
	static final String DFA136_acceptS =
		"\4\uffff\1\1\2\uffff\1\2\2\uffff\1\3\1\4";
	static final String DFA136_specialS =
		"\14\uffff}>";
	static final String[] DFA136_transitionS = {
			"\1\4\1\2\46\uffff\1\3\46\uffff\1\1\46\uffff\1\5",
			"\1\2",
			"\1\3",
			"\1\4\1\6\66\uffff\1\7",
			"",
			"\1\10",
			"\1\4\47\uffff\1\11\17\uffff\1\7",
			"",
			"\1\12\47\uffff\1\13\15\uffff\1\13",
			"\1\4\1\6\66\uffff\1\7",
			"",
			""
	};

	static final short[] DFA136_eot = DFA.unpackEncodedString(DFA136_eotS);
	static final short[] DFA136_eof = DFA.unpackEncodedString(DFA136_eofS);
	static final char[] DFA136_min = DFA.unpackEncodedStringToUnsignedChars(DFA136_minS);
	static final char[] DFA136_max = DFA.unpackEncodedStringToUnsignedChars(DFA136_maxS);
	static final short[] DFA136_accept = DFA.unpackEncodedString(DFA136_acceptS);
	static final short[] DFA136_special = DFA.unpackEncodedString(DFA136_specialS);
	static final short[][] DFA136_transition;

	static {
		int numStates = DFA136_transitionS.length;
		DFA136_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA136_transition[i] = DFA.unpackEncodedString(DFA136_transitionS[i]);
		}
	}

	protected class DFA136 extends DFA {

		public DFA136(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 136;
			this.eot = DFA136_eot;
			this.eof = DFA136_eof;
			this.min = DFA136_min;
			this.max = DFA136_max;
			this.accept = DFA136_accept;
			this.special = DFA136_special;
			this.transition = DFA136_transition;
		}
		@Override
		public String getDescription() {
			return "1919:1: base_variable_with_function_calls : ( ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? -> ^( VAR_DECL ( fully_qualified_class_name )? reference_variable ( ctor_arguments )? ) | fully_qualified_class_name ctor_arguments -> ^( CALL fully_qualified_class_name ctor_arguments ) | STATIC '::' reference_variable -> ^( VAR_DECL ^( '::' STATIC reference_variable ) ) | STATIC '::' reference_variable_without_dollar -> ^( VAR_DECL ^( '::' STATIC reference_variable_without_dollar ) ) );";
		}
	}

	static final String DFA140_eotS =
		"\4\uffff";
	static final String DFA140_eofS =
		"\4\uffff";
	static final String DFA140_minS =
		"\2\44\2\uffff";
	static final String DFA140_maxS =
		"\1\44\1\132\2\uffff";
	static final String DFA140_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA140_specialS =
		"\4\uffff}>";
	static final String[] DFA140_transitionS = {
			"\1\1",
			"\1\1\47\uffff\1\2\15\uffff\1\3",
			"",
			""
	};

	static final short[] DFA140_eot = DFA.unpackEncodedString(DFA140_eotS);
	static final short[] DFA140_eof = DFA.unpackEncodedString(DFA140_eofS);
	static final char[] DFA140_min = DFA.unpackEncodedStringToUnsignedChars(DFA140_minS);
	static final char[] DFA140_max = DFA.unpackEncodedStringToUnsignedChars(DFA140_maxS);
	static final short[] DFA140_accept = DFA.unpackEncodedString(DFA140_acceptS);
	static final short[] DFA140_special = DFA.unpackEncodedString(DFA140_specialS);
	static final short[][] DFA140_transition;

	static {
		int numStates = DFA140_transitionS.length;
		DFA140_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA140_transition[i] = DFA.unpackEncodedString(DFA140_transitionS[i]);
		}
	}

	protected class DFA140 extends DFA {

		public DFA140(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 140;
			this.eot = DFA140_eot;
			this.eof = DFA140_eof;
			this.min = DFA140_min;
			this.max = DFA140_max;
			this.accept = DFA140_accept;
			this.special = DFA140_special;
			this.transition = DFA140_transition;
		}
		@Override
		public String getDescription() {
			return "2028:1: compound_variable : ( dollars IDENTIFIER | dollars LEFT_BRACKET ! expression RIGHT_BRACKET !);";
		}
	}

	public static final BitSet FOLLOW_SOC_T_in_php_source434 = new BitSet(new long[]{0x04400B3183010C00L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_SOC_PHP_T_in_php_source446 = new BitSet(new long[]{0x04400B3183010C00L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_top_statement_list_in_php_source461 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_EOC_T_in_php_source470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_top_statement_in_top_statement_list505 = new BitSet(new long[]{0x04000B3183010C02L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_statement_in_top_statement519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_statement_in_top_statement525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_declaration_statement_in_top_statement531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_halt_compiler_statement_in_top_statement537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMESPACE_T_in_top_statement543 = new BitSet(new long[]{0x0000002000000000L,0x0008000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_top_statement545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_statement_in_inner_statement_list578 = new BitSet(new long[]{0x04000B3183010C02L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_statement_in_inner_statement595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_statement_in_inner_statement601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_declaration_statement_in_inner_statement607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_halt_compiler_statement_in_inner_statement613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_halt_compiler_statement628 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_halt_compiler_statement630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_halt_compiler_statement632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_halt_compiler_statement634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_entr_type_in_class_declaration_statement669 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_CLASS_T_in_class_declaration_statement672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement674 = new BitSet(new long[]{0x1000000000000000L,0x0000000004004000L});
	public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement677 = new BitSet(new long[]{0x0000002000000000L,0x0008000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_class_declaration_statement679 = new BitSet(new long[]{0x0000000000000000L,0x0000000004004000L});
	public static final BitSet FOLLOW_IMPLEMENTS_T_in_class_declaration_statement684 = new BitSet(new long[]{0x0000002000000000L,0x0008000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement686 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_class_declaration_statement696 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000008L,0x2100040008002000L,0x000000000000004EL});
	public static final BitSet FOLLOW_class_statement_in_class_declaration_statement698 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000008L,0x2100040008002000L,0x000000000000004EL});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_class_declaration_statement701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTERFACE_T_in_class_declaration_statement763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement765 = new BitSet(new long[]{0x1000000000000000L,0x0000000004004000L});
	public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement768 = new BitSet(new long[]{0x0000002000000000L,0x0008000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement770 = new BitSet(new long[]{0x0000000000000000L,0x0000000004004000L});
	public static final BitSet FOLLOW_IMPLEMENTS_T_in_class_declaration_statement775 = new BitSet(new long[]{0x0000002000000000L,0x0008000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement777 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_class_declaration_statement787 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000008L,0x2100040008002000L,0x000000000000004EL});
	public static final BitSet FOLLOW_class_statement_in_class_declaration_statement789 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000008L,0x2100040008002000L,0x000000000000004EL});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_class_declaration_statement792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAIT_T_in_class_declaration_statement853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement855 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_class_declaration_statement857 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000008L,0x2100040008002000L,0x000000000000004EL});
	public static final BitSet FOLLOW_class_statement_in_class_declaration_statement859 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000008L,0x2100040008002000L,0x000000000000004EL});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_class_declaration_statement862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_modifiers_in_class_statement943 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_static_var_list_in_class_statement945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_class_statement947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_class_statement974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_T_in_class_statement977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REF_T_in_class_statement979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_class_statement982 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_class_statement984 = new BitSet(new long[]{0x0000003042000000L,0x0008000000001000L,0xDE00008000008200L,0x0000000000000031L});
	public static final BitSet FOLLOW_parameter_list_in_class_statement986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_class_statement989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_class_statement991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_class_statement1026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_T_in_class_statement1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REF_T_in_class_statement1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_class_statement1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_class_statement1036 = new BitSet(new long[]{0x0000003042000000L,0x0008000000001000L,0xDE00008000008200L,0x0000000000000031L});
	public static final BitSet FOLLOW_parameter_list_in_class_statement1038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_class_statement1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_block_in_class_statement1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONST_T_in_class_statement1078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_directive_in_class_statement1080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_class_statement1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_T_in_class_statement1110 = new BitSet(new long[]{0x0000002000000000L,0x0008000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_statement1112 = new BitSet(new long[]{0x0000002000000000L,0x0008000004001000L,0x0000000000202000L});
	public static final BitSet FOLLOW_trait_adaptations_in_class_statement1114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_trait_adaptations1156 = new BitSet(new long[]{0x0000002000000002L,0x0008000000001000L,0x0000000000002000L});
	public static final BitSet FOLLOW_trait_adaptation_in_trait_adaptations1159 = new BitSet(new long[]{0x0000002000000002L,0x0008000000001000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_trait_adaptations1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLON_in_trait_adaptations1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_trait_adaptation1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_INSTANCEOF_T_in_trait_adaptation1211 = new BitSet(new long[]{0x0000002000000000L,0x0008000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_list_in_trait_adaptation1213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_trait_adaptation1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_trait_adaptation1237 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_AS_T_in_trait_adaptation1239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x2100000008200000L,0x000000000000000EL});
	public static final BitSet FOLLOW_modifier_in_trait_adaptation1241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000200000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_trait_adaptation1244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_trait_adaptation1247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_T_in_function_declaration_statement1312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REF_T_in_function_declaration_statement1314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration_statement1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_function_declaration_statement1319 = new BitSet(new long[]{0x0000003042000000L,0x0008000000001000L,0xDE00008000008200L,0x0000000000000031L});
	public static final BitSet FOLLOW_parameter_list_in_function_declaration_statement1321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_function_declaration_statement1324 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_block_in_function_declaration_statement1331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_block1377 = new BitSet(new long[]{0x04000B3183010C00L,0x601830021C19B12FL,0x23FF248CFC203F20L});
	public static final BitSet FOLLOW_inner_statement_list_in_block1379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_block1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_topStatement_in_statement1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_topStatement1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stat_in_topStatement1481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_T_in_topStatement1491 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1493 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_topStatement1495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1497 = new BitSet(new long[]{0x04000B3186010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_while_statement_in_topStatement1499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DO_T_in_topStatement1532 = new BitSet(new long[]{0x04000B3182010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_statement_in_topStatement1534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_WHILE_T_in_topStatement1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1538 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_topStatement1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_T_in_topStatement1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1576 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094200320L});
	public static final BitSet FOLLOW_expr_list_in_topStatement1580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1583 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094200320L});
	public static final BitSet FOLLOW_expr_list_in_topStatement1587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1590 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094008320L});
	public static final BitSet FOLLOW_expr_list_in_topStatement1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1597 = new BitSet(new long[]{0x04000B3186010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_for_statement_in_topStatement1599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SWITCH_T_in_topStatement1643 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1645 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_topStatement1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1649 = new BitSet(new long[]{0x0000000004000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_switch_case_list_in_topStatement1651 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_T_in_topStatement1680 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094200320L});
	public static final BitSet FOLLOW_expression_in_topStatement1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_T_in_topStatement1709 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094200320L});
	public static final BitSet FOLLOW_expression_in_topStatement1711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RETURN_T_in_topStatement1750 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094200320L});
	public static final BitSet FOLLOW_expression_in_topStatement1752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GLOBAL_T_in_topStatement1794 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_variable_list_in_topStatement1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_T_in_topStatement1836 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_static_var_list_in_topStatement1838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ECHO_T_in_topStatement1875 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expr_list_in_topStatement1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_topStatement1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement1904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_T_in_topStatement1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1917 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_topStatement1919 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_AS_T_in_topStatement1921 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000200L});
	public static final BitSet FOLLOW_foreach_variable_in_topStatement1923 = new BitSet(new long[]{0x0000000000000080L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_ARROW_T_in_topStatement1926 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000200L});
	public static final BitSet FOLLOW_foreach_variable_in_topStatement1928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1932 = new BitSet(new long[]{0x04000B3186010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_foreach_statement_in_topStatement1942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DECLARE_T_in_topStatement1977 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_directive_in_topStatement1981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement1983 = new BitSet(new long[]{0x04000B3186010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_declare_statement_in_topStatement1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRY_T_in_topStatement2034 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_block_in_topStatement2036 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_catch_branch_in_topStatement2038 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_THROW_T_in_topStatement2065 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_topStatement2067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement2069 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_T_in_topStatement2106 = new BitSet(new long[]{0x0000012000000000L,0x0008000000101101L,0x007F000010000100L});
	public static final BitSet FOLLOW_scalar_in_topStatement2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement2110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USE_T_in_topStatement2147 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement2149 = new BitSet(new long[]{0x0000012000000000L,0x0008000000101101L,0x007F000010000100L});
	public static final BitSet FOLLOW_scalar_in_topStatement2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement2155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_T_in_topStatement2178 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement2180 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_topStatement2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement2184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement2186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_ONCE_T_in_topStatement2209 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement2211 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_topStatement2213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement2215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement2217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REQUIRE_T_in_topStatement2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement2242 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_topStatement2244 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement2246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement2248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REQUIRE_ONCE_T_in_topStatement2271 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_topStatement2273 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_topStatement2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_topStatement2277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement2279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REF_T_in_foreach_variable2319 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_variable_in_foreach_variable2322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_use_filename2337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_use_filename2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_use_filename2346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_use_filename2348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list2380 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_T_in_fully_qualified_class_name_list2383 = new BitSet(new long[]{0x0000002000000000L,0x0008000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list2385 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_NAMESPACE_T_in_fully_qualified_class_name2420 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name2423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name2429 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name2437 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name2443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_static_var_element_in_static_var_list2474 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_T_in_static_var_list2477 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_static_var_element_in_static_var_list2479 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_pure_variable_in_static_var_element2511 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_EQUAL_T_in_static_var_element2514 = new BitSet(new long[]{0x0000012000000000L,0x0008000008101101L,0x027F000010000100L});
	public static final BitSet FOLLOW_default_arg_in_static_var_element2517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_T_in_if_stat2548 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_if_stat2550 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_if_stat2554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_if_stat2556 = new BitSet(new long[]{0x04000B3186010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_statement_in_if_stat2572 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_ELSEIF_T_in_if_stat2588 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_if_stat2590 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_if_stat2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_if_stat2596 = new BitSet(new long[]{0x04000B3182010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_statement_in_if_stat2600 = new BitSet(new long[]{0x0000600000000002L});
	public static final BitSet FOLLOW_ELSE_T_in_if_stat2626 = new BitSet(new long[]{0x04000B3182010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_statement_in_if_stat2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_T_in_if_stat2696 = new BitSet(new long[]{0x04086B3183010C00L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_inner_statement_list_in_if_stat2698 = new BitSet(new long[]{0x0008600000000000L});
	public static final BitSet FOLLOW_new_elseif_branch_in_if_stat2701 = new BitSet(new long[]{0x0008600000000000L});
	public static final BitSet FOLLOW_ELSE_T_in_if_stat2718 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_T_in_if_stat2720 = new BitSet(new long[]{0x04000B3182010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_statement_in_if_stat2724 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_ENDIF_T_in_if_stat2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_if_stat2730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSEIF_T_in_new_elseif_branch2801 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_new_elseif_branch2803 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_new_elseif_branch2805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_new_elseif_branch2807 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_T_in_new_elseif_branch2809 = new BitSet(new long[]{0x04000B3183010C02L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_inner_statement_list_in_new_elseif_branch2811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_switch_case_list2849 = new BitSet(new long[]{0x0000000200080000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_switch_case_list2851 = new BitSet(new long[]{0x0000000200080000L});
	public static final BitSet FOLLOW_case_list_in_switch_case_list2854 = new BitSet(new long[]{0x0000000200080000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_switch_case_list2857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_T_in_switch_case_list2879 = new BitSet(new long[]{0x0000000200080000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_switch_case_list2881 = new BitSet(new long[]{0x0000000200080000L});
	public static final BitSet FOLLOW_case_list_in_switch_case_list2884 = new BitSet(new long[]{0x0010000200080000L});
	public static final BitSet FOLLOW_ENDSWITCH_T_in_switch_case_list2887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_switch_case_list2889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_T_in_case_list2922 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_case_list2924 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_COLON_T_in_case_list2927 = new BitSet(new long[]{0x04000B3183010C02L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_SEMI_COLON_in_case_list2931 = new BitSet(new long[]{0x04000B3183010C02L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_inner_statement_list_in_case_list2934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEFAULT_T_in_case_list2966 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_COLON_T_in_case_list2969 = new BitSet(new long[]{0x04000B3183010C02L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_SEMI_COLON_in_case_list2973 = new BitSet(new long[]{0x04000B3183010C02L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_inner_statement_list_in_case_list2976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CATCH_T_in_catch_branch3025 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_catch_branch3027 = new BitSet(new long[]{0x0000002000000000L,0x0008000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_catch_branch3029 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_variable_in_catch_branch3031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_catch_branch3033 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_block_in_catch_branch3041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_for_statement3086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_T_in_for_statement3102 = new BitSet(new long[]{0x04040B3183010C00L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_inner_statement_list_in_for_statement3104 = new BitSet(new long[]{0x0004000000000000L});
	public static final BitSet FOLLOW_ENDFOR_T_in_for_statement3107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_for_statement3109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_while_statement3143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_T_in_while_statement3160 = new BitSet(new long[]{0x04200B3183010C00L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_inner_statement_list_in_while_statement3162 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_ENDWHILE_T_in_while_statement3165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_while_statement3167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_foreach_statement3203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_T_in_foreach_statement3221 = new BitSet(new long[]{0x04020B3183010C00L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_inner_statement_list_in_foreach_statement3223 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_ENDFOREACH_T_in_foreach_statement3226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_foreach_statement3228 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_declare_statement3266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_T_in_declare_statement3289 = new BitSet(new long[]{0x04010B3183010C00L,0x601830021C19B12FL,0x23FF248CFC201F20L});
	public static final BitSet FOLLOW_inner_statement_list_in_declare_statement3291 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ENDDECLARE_T_in_declare_statement3294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_declare_statement3296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parameter_in_parameter_list3342 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_T_in_parameter_list3345 = new BitSet(new long[]{0x0000003042000000L,0x0008000000001000L,0xDE00008000000200L,0x0000000000000031L});
	public static final BitSet FOLLOW_parameter_in_parameter_list3349 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_parameter_type_in_parameter3392 = new BitSet(new long[]{0x0000001040000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_CONST_T_in_parameter3395 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_pure_variable_in_parameter3398 = new BitSet(new long[]{0x0200000000000002L});
	public static final BitSet FOLLOW_EQUAL_T_in_parameter3414 = new BitSet(new long[]{0x0000012000000000L,0x0008000008101101L,0x027F000010000100L});
	public static final BitSet FOLLOW_default_arg_in_parameter3416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_parameter_type3474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cast_option_in_parameter_type3484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalar_in_default_arg3504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_decl_in_default_arg3510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_variable_list3537 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_T_in_variable_list3540 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_variable_in_variable_list3544 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_198_in_variable_modifiers3575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_variable_modifiers3581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_directive_element_in_directive3658 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_T_in_directive3661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_directive_element_in_directive3665 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_directive_element3708 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_EQUAL_T_in_directive_element3710 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_directive_element3712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expr_list3757 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_T_in_expr_list3760 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_expr_list3764 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_logical_text_or_expr_in_expression3805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3848 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
	public static final BitSet FOLLOW_OR_T_in_logical_text_or_expr3851 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_logical_text_xor_expr_in_logical_text_or_expr3856 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
	public static final BitSet FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3887 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_XOR_T_in_logical_text_xor_expr3890 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_logical_text_and_expr_in_logical_text_xor_expr3895 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_assignment_expr_in_logical_text_and_expr3926 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_T_in_logical_text_and_expr3929 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_assignment_expr_in_logical_text_and_expr3934 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_conditional_expr_in_assignment_expr3965 = new BitSet(new long[]{0x0200004400003002L,0x1400880400000000L,0x0000000000010002L});
	public static final BitSet FOLLOW_assignment_operator_in_assignment_expr3968 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_conditional_expr_in_assignment_expr3973 = new BitSet(new long[]{0x0200004400003002L,0x1400880400000000L,0x0000000000010002L});
	public static final BitSet FOLLOW_logical_or_expr_in_conditional_expr4109 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_QUESTION_T_in_conditional_expr4128 = new BitSet(new long[]{0x0400013006000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_conditional_expr4130 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_T_in_conditional_expr4133 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_logical_or_expr_in_conditional_expr4137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr4187 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_LOGICAL_OR_T_in_logical_or_expr4190 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_logical_and_expr_in_logical_or_expr4195 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
	public static final BitSet FOLLOW_bitwise_or_expr_in_logical_and_expr4226 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_LOGICAL_AND_T_in_logical_and_expr4229 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_bitwise_or_expr_in_logical_and_expr4234 = new BitSet(new long[]{0x0000000000000002L,0x0000000800000000L});
	public static final BitSet FOLLOW_bitwise_xor_expr_in_bitwise_or_expr4265 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_BIT_OR_T_in_bitwise_or_expr4268 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_bitwise_xor_expr_in_bitwise_or_expr4273 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_bitwise_and_expr_in_bitwise_xor_expr4304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_POWER_T_in_bitwise_xor_expr4307 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_bitwise_and_expr_in_bitwise_xor_expr4312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_concat_expr_in_bitwise_and_expr4343 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_DOT_T_in_bitwise_and_expr4346 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_concat_expr_in_bitwise_and_expr4351 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_equality_expr_in_concat_expr4382 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REF_T_in_concat_expr4385 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_equality_expr_in_concat_expr4390 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_relational_expr_in_equality_expr4421 = new BitSet(new long[]{0x0180000000000002L,0x0060000000000000L});
	public static final BitSet FOLLOW_set_in_equality_expr4424 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_relational_expr_in_equality_expr4443 = new BitSet(new long[]{0x0180000000000002L,0x0060000000000000L});
	public static final BitSet FOLLOW_shift_expr_in_relational_expr4474 = new BitSet(new long[]{0x0000000000000002L,0x0000444020000000L});
	public static final BitSet FOLLOW_set_in_relational_expr4477 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_shift_expr_in_relational_expr4496 = new BitSet(new long[]{0x0000000000000002L,0x0000444020000000L});
	public static final BitSet FOLLOW_additive_expr_in_shift_expr4527 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_set_in_shift_expr4530 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_additive_expr_in_shift_expr4541 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr4572 = new BitSet(new long[]{0x0000000000000002L,0x4000200000000000L});
	public static final BitSet FOLLOW_set_in_additive_expr4575 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_multiplicative_expr_in_additive_expr4586 = new BitSet(new long[]{0x0000000000000002L,0x4000200000000000L});
	public static final BitSet FOLLOW_cast_expr_in_multiplicative_expr4617 = new BitSet(new long[]{0x0000000800000002L,0x0801000000000000L});
	public static final BitSet FOLLOW_set_in_multiplicative_expr4620 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_cast_expr_in_multiplicative_expr4635 = new BitSet(new long[]{0x0000000800000002L,0x0801000000000000L});
	public static final BitSet FOLLOW_unary_expr_in_cast_expr4664 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_cast_expr4675 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0xDE00008000000000L,0x0000000000000031L});
	public static final BitSet FOLLOW_cast_option_in_cast_expr4677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_cast_expr4679 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_unary_expr_in_cast_expr4683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_symbol_list_in_unary_expr4803 = new BitSet(new long[]{0x0000013002000C00L,0x2018100218101109L,0x027F008014000120L});
	public static final BitSet FOLLOW_prefix_inc_dec_expr_in_unary_expr4805 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_prefix_inc_dec_expr_in_unary_expr4830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_symbol_in_unary_symbol_list4847 = new BitSet(new long[]{0x0400000000000002L,0x4000200000000000L,0x0000000080000200L});
	public static final BitSet FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_minus_in_prefix_inc_dec_expr4915 = new BitSet(new long[]{0x0000013002000C00L,0x2018100218101109L,0x027F008014000120L});
	public static final BitSet FOLLOW_post_inc_dec_expr_in_prefix_inc_dec_expr4919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instance_expr_in_post_inc_dec_expr4964 = new BitSet(new long[]{0x0000000000000002L,0x2000100000000000L});
	public static final BitSet FOLLOW_plus_minus_in_post_inc_dec_expr4981 = new BitSet(new long[]{0x0000000000000002L,0x2000100000000000L});
	public static final BitSet FOLLOW_atom_expr_in_instance_expr5049 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
	public static final BitSet FOLLOW_INSTANCEOF_T_in_instance_expr5052 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_class_name_reference_in_instance_expr5055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_T_in_atom_expr5087 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_variable_in_atom_expr5090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_T_in_atom_expr5103 = new BitSet(new long[]{0x0000012000000000L,0x0008000000101101L,0x007F000010000100L});
	public static final BitSet FOLLOW_scalar_in_atom_expr5106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr5119 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_atom_expr5121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr5123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_T_in_atom_expr5136 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr5138 = new BitSet(new long[]{0x0000003008000000L,0x0008000200001000L,0x0000000004008000L});
	public static final BitSet FOLLOW_assignment_list_in_atom_expr5140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr5142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_decl_in_atom_expr5169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_T_in_atom_expr5176 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_class_name_reference_in_atom_expr5178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLONE_T_in_atom_expr5205 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_variable_in_atom_expr5207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lambda_function_declaration_in_atom_expr5242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSET_T_in_atom_expr5249 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_atom_expr5251 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_variable_list_in_atom_expr5253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_atom_expr5255 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BACKTRICKLITERAL_in_atom_expr5279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_T_in_atom_expr5292 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_atom_expr5294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_185_in_array_decl5339 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_array_decl5341 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094008320L});
	public static final BitSet FOLLOW_array_pair_list_in_array_decl5343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_array_decl5346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_OPEN_RECT_in_array_decl5360 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094004320L});
	public static final BitSet FOLLOW_array_pair_list_in_array_decl5362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RIGHT_OPEN_RECT_in_array_decl5365 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_T_in_lambda_function_declaration5396 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REF_T_in_lambda_function_declaration5398 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_lambda_function_declaration5401 = new BitSet(new long[]{0x0000003042000000L,0x0008000000001000L,0xDE00008000008200L,0x0000000000000031L});
	public static final BitSet FOLLOW_parameter_list_in_lambda_function_declaration5403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_lambda_function_declaration5406 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_USE_T_in_lambda_function_declaration5409 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_lambda_function_declaration5411 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094008320L});
	public static final BitSet FOLLOW_expr_list_in_lambda_function_declaration5413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_lambda_function_declaration5416 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_block_in_lambda_function_declaration5424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dynamic_name_reference_in_class_name_reference5471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_class_name_reference5477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference5505 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SINGLE_ARROW_T_in_dynamic_name_reference5530 = new BitSet(new long[]{0x0000001000000000L,0x0000000004001000L});
	public static final BitSet FOLLOW_object_property_in_dynamic_name_reference5532 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_ctor_arguments_in_dynamic_name_reference5534 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_assignment_element_in_assignment_list5585 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_T_in_assignment_list5589 = new BitSet(new long[]{0x0000003008000002L,0x0008000200001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_assignment_element_in_assignment_list5591 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_variable_in_assignment_element5615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_T_in_assignment_element5621 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_assignment_element5623 = new BitSet(new long[]{0x0000003008000000L,0x0008000200001000L,0x0000000004008000L});
	public static final BitSet FOLLOW_assignment_list_in_assignment_element5625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_assignment_element5627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_pair_element_in_array_pair_list5664 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_T_in_array_pair_list5667 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_array_pair_element_in_array_pair_list5671 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_COMMA_T_in_array_pair_list5675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_array_pair_element5720 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_ARROW_T_in_array_pair_element5723 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_array_pair_element5728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_variable_with_function_calls_in_variable5762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_SINGLE_ARROW_T_in_variable5785 = new BitSet(new long[]{0x0000001000000000L,0x0000000004001000L});
	public static final BitSet FOLLOW_object_property_in_variable5787 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_ctor_arguments_in_variable5789 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5846 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_reference_variable_in_base_variable_with_function_calls5849 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls5851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls5885 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls5887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_base_variable_with_function_calls5919 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DOMAIN_T_in_base_variable_with_function_calls5921 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_reference_variable_in_base_variable_with_function_calls5923 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_base_variable_with_function_calls5951 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_DOMAIN_T_in_base_variable_with_function_calls5953 = new BitSet(new long[]{0x0000000000000000L,0x0000000004001000L});
	public static final BitSet FOLLOW_reference_variable_without_dollar_in_base_variable_with_function_calls5955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_variable_in_object_property5996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_reference_variable_without_dollar_in_object_property6006 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compound_variable_in_reference_variable6034 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
	public static final BitSet FOLLOW_LEFT_OPEN_RECT_in_reference_variable6059 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094004320L});
	public static final BitSet FOLLOW_expression_in_reference_variable6063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RIGHT_OPEN_RECT_in_reference_variable6066 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_reference_variable6096 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_reference_variable6100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_reference_variable6102 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
	public static final BitSet FOLLOW_dollars_in_compound_variable6153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_compound_variable6155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dollars_in_compound_variable6167 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_compound_variable6169 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_compound_variable6172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_compound_variable6174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOLLAR_T_in_dollars6195 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_compound_variable_without_dollar_in_reference_variable_without_dollar6223 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
	public static final BitSet FOLLOW_LEFT_OPEN_RECT_in_reference_variable_without_dollar6252 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094004320L});
	public static final BitSet FOLLOW_expression_in_reference_variable_without_dollar6254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_RIGHT_OPEN_RECT_in_reference_variable_without_dollar6257 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_reference_variable_without_dollar6288 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_reference_variable_without_dollar6290 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_reference_variable_without_dollar6292 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_compound_variable_without_dollar6342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_BRACKET_in_compound_variable_without_dollar6352 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_compound_variable_without_dollar6355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_compound_variable_without_dollar6357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_ctor_arguments6388 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094008320L});
	public static final BitSet FOLLOW_expr_list_in_ctor_arguments6390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_ctor_arguments6393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REF_T_in_pure_variable6439 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_DOLLAR_T_in_pure_variable6442 = new BitSet(new long[]{0x0000001000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_pure_variable6445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constant_in_scalar6497 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTLITERAL_in_constant6542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATLITERAL_in_constant6551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_constant6557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLELITERRAL_in_constant6564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REALLITERAL_in_constant6570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_common_scalar_in_constant6576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_constant6584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HERE_DOC_in_constant6594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_synpred4_PHPAST519 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_modifiers_in_synpred23_PHPAST943 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_static_var_list_in_synpred23_PHPAST945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_synpred23_PHPAST947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_synpred27_PHPAST974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_T_in_synpred27_PHPAST977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REF_T_in_synpred27_PHPAST979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred27_PHPAST982 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_synpred27_PHPAST984 = new BitSet(new long[]{0x0000003042000000L,0x0008000000001000L,0xDE00008000008200L,0x0000000000000031L});
	public static final BitSet FOLLOW_parameter_list_in_synpred27_PHPAST986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_synpred27_PHPAST989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SEMI_COLON_in_synpred27_PHPAST991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_synpred31_PHPAST1026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_FUNCTION_T_in_synpred31_PHPAST1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REF_T_in_synpred31_PHPAST1031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred31_PHPAST1034 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_synpred31_PHPAST1036 = new BitSet(new long[]{0x0000003042000000L,0x0008000000001000L,0xDE00008000008200L,0x0000000000000031L});
	public static final BitSet FOLLOW_parameter_list_in_synpred31_PHPAST1038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_synpred31_PHPAST1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_block_in_synpred31_PHPAST1043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RIGHT_BRACKET_in_synpred35_PHPAST1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOMAIN_T_in_synpred79_PHPAST2432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_synpred79_PHPAST2437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOMAIN_T_in_synpred80_PHPAST2443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSEIF_T_in_synpred83_PHPAST2588 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LEFT_PARETHESIS_in_synpred83_PHPAST2590 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_synpred83_PHPAST2594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RIGHT_PARETHESIS_in_synpred83_PHPAST2596 = new BitSet(new long[]{0x04000B3182010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_statement_in_synpred83_PHPAST2600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_T_in_synpred84_PHPAST2626 = new BitSet(new long[]{0x04000B3182010C00L,0x601830021C11B12FL,0x027F2488FC201F20L});
	public static final BitSet FOLLOW_statement_in_synpred84_PHPAST2630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OR_T_in_synpred124_PHPAST3851 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_logical_text_xor_expr_in_synpred124_PHPAST3856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_XOR_T_in_synpred125_PHPAST3890 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_logical_text_and_expr_in_synpred125_PHPAST3895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_T_in_synpred126_PHPAST3929 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_assignment_expr_in_synpred126_PHPAST3934 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_operator_in_synpred127_PHPAST3968 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_conditional_expr_in_synpred127_PHPAST3973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUESTION_T_in_synpred140_PHPAST4128 = new BitSet(new long[]{0x0400013006000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_expression_in_synpred140_PHPAST4130 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_T_in_synpred140_PHPAST4133 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_logical_or_expr_in_synpred140_PHPAST4137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOGICAL_OR_T_in_synpred141_PHPAST4190 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_logical_and_expr_in_synpred141_PHPAST4195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOGICAL_AND_T_in_synpred142_PHPAST4229 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_bitwise_or_expr_in_synpred142_PHPAST4234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BIT_OR_T_in_synpred143_PHPAST4268 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_bitwise_xor_expr_in_synpred143_PHPAST4273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POWER_T_in_synpred144_PHPAST4307 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_bitwise_and_expr_in_synpred144_PHPAST4312 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_T_in_synpred145_PHPAST4346 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_concat_expr_in_synpred145_PHPAST4351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REF_T_in_synpred146_PHPAST4385 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_equality_expr_in_synpred146_PHPAST4390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred150_PHPAST4424 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_relational_expr_in_synpred150_PHPAST4443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred154_PHPAST4477 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_shift_expr_in_synpred154_PHPAST4496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred156_PHPAST4530 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_additive_expr_in_synpred156_PHPAST4541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred158_PHPAST4575 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_multiplicative_expr_in_synpred158_PHPAST4586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred161_PHPAST4620 = new BitSet(new long[]{0x0400013002000C00L,0x6018300218101109L,0x027F008094000320L});
	public static final BitSet FOLLOW_cast_expr_in_synpred161_PHPAST4635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_plus_minus_in_synpred182_PHPAST4981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSTANCEOF_T_in_synpred184_PHPAST5052 = new BitSet(new long[]{0x0000003000000000L,0x0008000000001000L,0x0000000004000000L});
	public static final BitSet FOLLOW_class_name_reference_in_synpred184_PHPAST5055 = new BitSet(new long[]{0x0000000000000002L});
}
