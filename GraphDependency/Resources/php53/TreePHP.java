// $ANTLR 3.5.2 /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g 2014-06-27 03:38:17

package box.php;
  
import java.util.*;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.expressions.Expression;
import org.eclipse.dltk.ast.expressions.ExpressionConstants;
import org.eclipse.dltk.ast.statements.Statement;
import org.eclipse.dltk.ast.statements.Block;
import org.eclipse.dltk.ast.declarations.*;
import org.eclipse.dltk.ast.references.*;

import org.eclipse.dltk.ast.*;

import org.antlr.runtime.BitSet;

import box.ast.nodes.Scalar.ScalarEnum;
import box.ast.nodes.Include.IncludeEnum;
import box.ast.nodes.AssignmentExpression.AssignmentEnum;
import box.ast.nodes.InfixExpression.InfixEnum;
import box.ast.nodes.UnaryOperation.UnaryOperationEnum;
import box.ast.nodes.CastExpression.CastEnum;
import box.ast.nodes.PostfixExpression.PostfixEnum;
import box.ast.nodes.PrefixExpression.PrefixEnum;
import box.ast.nodes.ArrayVariableReference.ArrayVariableRefEnum;
import box.ast.nodes.ReflectionArrayVariableReference.ReflectionArrayEnum;

import box.ast.*;
import box.ast.nodes.*;
import box.ast.parser.*;
import box.ast.nodes.php.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class TreePHP extends TreeParser {
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
		"'public'", "'real'", "'string'", "'var'", "QUOTE_STRING"
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
	public static final int QUOTE_STRING=199;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public TreePHP(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public TreePHP(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return TreePHP.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g"; }


	  ModuleDeclaration program;
	  
	  AbstractASTParser parser;
	  
	  Expression quoteExpr;
	  
	  boolean inExprList = false;
	  
	  boolean inClassStatementList = false;
	  
	  boolean inVarList = false;
	  
	  boolean inNameList = false;
	    
	  public TreePHP(TreeNodeStream input, AbstractASTParser parser) {
	     this(input, new RecognizerSharedState());
	     this.parser = parser;
	  }
	   
	  public ModuleDeclaration getModuleDeclaration() {
	    return program;
	  }
	  
	  public Expression getQuoteExpression() {
	      return quoteExpr;
	  }
	  
	  class ModifierDocPair {
	    public int modifier;
	    public PHPDocBlock doc;
	    
	    public ModifierDocPair(int modifier, PHPDocBlock doc) {
	      this.modifier = modifier;
	      this.doc = doc;
	    }
	  }
	  
	  public Expression createDispatch(Expression dispatcher, Expression property) {

	    if (property.getKind() == ASTNodeKinds.REFLECTION_CALL_EXPRESSION.ordinal()) {
	      ((ReflectionCallExpression) property).setReceiver (dispatcher);
	      dispatcher = property;
	    } else if (property.getKind() == ASTNodeKinds.METHOD_INVOCATION.ordinal()) {
	      PHPCallExpression callExpression = (PHPCallExpression) property;
	      dispatcher = new PHPCallExpression(dispatcher.sourceStart(), callExpression.sourceEnd(), dispatcher, callExpression.getCallName(), callExpression.getArgs());
	    } else {
	      dispatcher =  new FieldAccess(dispatcher.sourceStart(), property.sourceEnd(), dispatcher, property);
	    }

	    return dispatcher;
	  }
	  
	    private List errors = new LinkedList();
	    public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        errors.add(hdr + " " + msg);
	    }
	    public List<String> getErrors() {
	        return errors;
	    }
	    
	    public static TreeAdaptor tokenAdaptor = new CommonTreeAdaptor() {
	            public Object create(Token token) {
	              return new AST(token);
	            }
	        
	            public Object dupNode(Object t) {
	              if (t == null) {
	                return null;
	              }
	              return create(((AST) t).token);
	            }
	    };
	    
	    
	    public Expression parseQuote(String inputStr, int originalStartIndex, int originalEndIndex, int type) {
	      
	        if (inputStr.contains("'")) {
	          inputStr = inputStr.replace("'", "");
	        }
	      
	        String [] stats = inputStr.split("( |\n|\t)+",0);
	     
	        Expression expr = null;
	        
	        List list = new LinkedList();
	        
	        int startIndex = originalStartIndex;
	        
	        int endIndex = 0; 
	        ComplexQuote quote = null;
	   
	       
	        
	        for (String str : stats) {
	          
	          String code = "<?php " + str + ";?>";
	          
	          try {
	                
	                        CharStream input = new ANTLRStringStream(code);
	                    
	                        PHPASTLexer lexer = new PHPASTLexer(input);
	                        
	                        CommonTokenStream tokens = new CommonTokenStream(lexer);
	                        
	                        PHPASTParser parser = new PHPASTParser(tokens);
	                        
	                        parser.setTreeAdaptor(tokenAdaptor);
	                        
	                        if (inputStr.indexOf(str) >= endIndex) {
	                  startIndex = inputStr.indexOf(str) + originalStartIndex + 1;
	              }
	              
	              endIndex = startIndex + str.length();
	                          
	                        PHPASTParser.php_source_return r = parser.php_source();
	                    
	                        AST t = (AST) r.getTree(); // get tree result
	                        
	                        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tokenAdaptor, t);
	                        
	                        nodes.setTokenStream(tokens);
	                
	                      TreePHP def = new TreePHP(nodes, parser);
	                      
	                      def.setTreeAdaptor(tokenAdaptor);
	                      
	                      TreePHP.php_source_return result = def.php_source();
	                      
	                      expr = def.getQuoteExpression();
	                      
	                      expr.setStart(startIndex);
	              
	              expr.setEnd(endIndex);
	                  
	                  }  catch (Exception ex) {
	              System.out.println(ex);
	              
	              expr = new Scalar(startIndex, endIndex, str, ScalarEnum.UNKNOWN);
	            }
	                          
	            list.add(expr);
	              
	            startIndex = endIndex;
	                  }
	                  
	              quote = new ComplexQuote(originalStartIndex, originalEndIndex, list, type);

	          return quote;
	      }


	public static class php_source_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "php_source"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:203:1: php_source : ^( ModuleDeclaration ( top_statement_list )? ) ;
	public final TreePHP.php_source_return php_source() throws RecognitionException {
		TreePHP.php_source_return retval = new TreePHP.php_source_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST ModuleDeclaration1=null;
		TreeRuleReturnScope top_statement_list2 =null;

		AST ModuleDeclaration1_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:204:3: ( ^( ModuleDeclaration ( top_statement_list )? ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:204:6: ^( ModuleDeclaration ( top_statement_list )? )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			ModuleDeclaration1=(AST)match(input,ModuleDeclaration,FOLLOW_ModuleDeclaration_in_php_source58); 
			ModuleDeclaration1_tree = (AST)adaptor.dupNode(ModuleDeclaration1);


			root_1 = (AST)adaptor.becomeRoot(ModuleDeclaration1_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:204:26: ( top_statement_list )?
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==CLASS_T||LA1_0==INTERFACE_T||LA1_0==METHOD_DECL||LA1_0==NAMESPACE_T||LA1_0==STATEMENT||LA1_0==TRAIT_T||LA1_0==183) ) {
					alt1=1;
				}
				switch (alt1) {
					case 1 :
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:204:26: top_statement_list
						{
						_last = (AST)input.LT(1);
						pushFollow(FOLLOW_top_statement_list_in_php_source60);
						top_statement_list2=top_statement_list();
						state._fsp--;

						adaptor.addChild(root_1, top_statement_list2.getTree());

						}
						break;

				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    ModuleDeclaration RESULT = null;
			    int startIndex = ModuleDeclaration1.startIndex;
			    int endIndex = ModuleDeclaration1.endIndex + 2;
			 
			    PHPModuleDeclaration program = parser.getModuleDeclaration();
			      program.setStart(startIndex);
			      program.setEnd(endIndex);
			      RESULT = program;
			      
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "php_source"


	public static class top_statement_list_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "top_statement_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:218:1: top_statement_list : ( top_statement )+ ;
	public final TreePHP.top_statement_list_return top_statement_list() throws RecognitionException {
		TreePHP.top_statement_list_return retval = new TreePHP.top_statement_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope top_statement3 =null;


		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:219:3: ( ( top_statement )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:219:5: ( top_statement )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:219:5: ( top_statement )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==CLASS_T||LA2_0==INTERFACE_T||LA2_0==METHOD_DECL||LA2_0==NAMESPACE_T||LA2_0==STATEMENT||LA2_0==TRAIT_T||LA2_0==183) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:219:5: top_statement
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_top_statement_in_top_statement_list79);
					top_statement3=top_statement();
					state._fsp--;

					adaptor.addChild(root_0, top_statement3.getTree());

					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "top_statement_list"


	public static class top_statement_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "top_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:222:1: top_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement | ^( NAMESPACE_T fully_qualified_class_name ) );
	public final TreePHP.top_statement_return top_statement() throws RecognitionException {
		TreePHP.top_statement_return retval = new TreePHP.top_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST NAMESPACE_T8=null;
		TreeRuleReturnScope statement4 =null;
		TreeRuleReturnScope function_declaration_statement5 =null;
		TreeRuleReturnScope class_declaration_statement6 =null;
		TreeRuleReturnScope halt_compiler_statement7 =null;
		TreeRuleReturnScope fully_qualified_class_name9 =null;

		AST NAMESPACE_T8_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:223:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement | ^( NAMESPACE_T fully_qualified_class_name ) )
			int alt3=5;
			switch ( input.LA(1) ) {
			case STATEMENT:
				{
				alt3=1;
				}
				break;
			case METHOD_DECL:
				{
				alt3=2;
				}
				break;
			case CLASS_T:
			case INTERFACE_T:
			case TRAIT_T:
				{
				alt3=3;
				}
				break;
			case 183:
				{
				alt3=4;
				}
				break;
			case NAMESPACE_T:
				{
				alt3=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:223:5: statement
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_statement_in_top_statement93);
					statement4=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement4.getTree());


					    Statement stat = (statement4!=null?((TreePHP.statement_return)statement4).stat:null);
					    parser.addStatement(stat);
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:228:5: function_declaration_statement
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_function_declaration_statement_in_top_statement103);
					function_declaration_statement5=function_declaration_statement();
					state._fsp--;

					adaptor.addChild(root_0, function_declaration_statement5.getTree());


					    parser.addStatement((function_declaration_statement5!=null?((TreePHP.function_declaration_statement_return)function_declaration_statement5).stat:null));
					  
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:232:5: class_declaration_statement
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_class_declaration_statement_in_top_statement113);
					class_declaration_statement6=class_declaration_statement();
					state._fsp--;

					adaptor.addChild(root_0, class_declaration_statement6.getTree());


					    ClassDeclaration classDeclaration = (class_declaration_statement6!=null?((TreePHP.class_declaration_statement_return)class_declaration_statement6).classDeclaration:null);
					    if (classDeclaration != null) {
					      parser.addDeclarationStatement(classDeclaration);
					      parser.declarations.push(classDeclaration);
					      parser.addStatement(classDeclaration);
					    }
					    else {
					      InterfaceDeclaration interfaceDeclaration = (class_declaration_statement6!=null?((TreePHP.class_declaration_statement_return)class_declaration_statement6).interfaceDeclaration:null);
					      parser.addDeclarationStatement(interfaceDeclaration);
					      parser.declarations.push(interfaceDeclaration);
					      parser.addStatement(interfaceDeclaration);
					    }
					  
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:247:5: halt_compiler_statement
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_halt_compiler_statement_in_top_statement123);
					halt_compiler_statement7=halt_compiler_statement();
					state._fsp--;

					adaptor.addChild(root_0, halt_compiler_statement7.getTree());

					}
					break;
				case 5 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:248:5: ^( NAMESPACE_T fully_qualified_class_name )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					NAMESPACE_T8=(AST)match(input,NAMESPACE_T,FOLLOW_NAMESPACE_T_in_top_statement130); 
					NAMESPACE_T8_tree = (AST)adaptor.dupNode(NAMESPACE_T8);


					root_1 = (AST)adaptor.becomeRoot(NAMESPACE_T8_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_in_top_statement132);
					fully_qualified_class_name9=fully_qualified_class_name();
					state._fsp--;

					adaptor.addChild(root_1, fully_qualified_class_name9.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "top_statement"


	protected static class inner_statement_list_scope {
		List list;
	}
	protected Stack<inner_statement_list_scope> inner_statement_list_stack = new Stack<inner_statement_list_scope>();

	public static class inner_statement_list_return extends TreeRuleReturnScope {
		public List innerStatementList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "inner_statement_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:251:1: inner_statement_list returns [List innerStatementList] : ( inner_statement )+ ;
	public final TreePHP.inner_statement_list_return inner_statement_list() throws RecognitionException {
		inner_statement_list_stack.push(new inner_statement_list_scope());
		TreePHP.inner_statement_list_return retval = new TreePHP.inner_statement_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope inner_statement10 =null;



		  inner_statement_list_stack.peek().list = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:258:3: ( ( inner_statement )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:258:5: ( inner_statement )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:258:5: ( inner_statement )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==CLASS_T||LA4_0==INTERFACE_T||LA4_0==METHOD_DECL||LA4_0==STATEMENT||LA4_0==TRAIT_T||LA4_0==183) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:258:6: inner_statement
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_inner_statement_in_inner_statement_list160);
					inner_statement10=inner_statement();
					state._fsp--;

					adaptor.addChild(root_0, inner_statement10.getTree());

					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}


			    retval.innerStatementList = inner_statement_list_stack.peek().list;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			inner_statement_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "inner_statement_list"


	public static class inner_statement_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "inner_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:264:1: inner_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement );
	public final TreePHP.inner_statement_return inner_statement() throws RecognitionException {
		TreePHP.inner_statement_return retval = new TreePHP.inner_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope statement11 =null;
		TreeRuleReturnScope function_declaration_statement12 =null;
		TreeRuleReturnScope class_declaration_statement13 =null;
		TreeRuleReturnScope halt_compiler_statement14 =null;


		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:265:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement )
			int alt5=4;
			switch ( input.LA(1) ) {
			case STATEMENT:
				{
				alt5=1;
				}
				break;
			case METHOD_DECL:
				{
				alt5=2;
				}
				break;
			case CLASS_T:
			case INTERFACE_T:
			case TRAIT_T:
				{
				alt5=3;
				}
				break;
			case 183:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:265:5: statement
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_statement_in_inner_statement182);
					statement11=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement11.getTree());


					    if ((statement11!=null?((TreePHP.statement_return)statement11).stat:null) != null) {
					      inner_statement_list_stack.peek().list.add((statement11!=null?((TreePHP.statement_return)statement11).stat:null));
					    }
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:271:5: function_declaration_statement
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_function_declaration_statement_in_inner_statement192);
					function_declaration_statement12=function_declaration_statement();
					state._fsp--;

					adaptor.addChild(root_0, function_declaration_statement12.getTree());


					    if ((function_declaration_statement12!=null?((TreePHP.function_declaration_statement_return)function_declaration_statement12).stat:null) != null) {
					      inner_statement_list_stack.peek().list.add((function_declaration_statement12!=null?((TreePHP.function_declaration_statement_return)function_declaration_statement12).stat:null));
					    }  
					  
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:277:5: class_declaration_statement
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_class_declaration_statement_in_inner_statement202);
					class_declaration_statement13=class_declaration_statement();
					state._fsp--;

					adaptor.addChild(root_0, class_declaration_statement13.getTree());


					    if ((class_declaration_statement13!=null?((TreePHP.class_declaration_statement_return)class_declaration_statement13).classDeclaration:null) != null) {
					      inner_statement_list_stack.peek().list.add((class_declaration_statement13!=null?((TreePHP.class_declaration_statement_return)class_declaration_statement13).classDeclaration:null));
					    } 
					  
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:283:5: halt_compiler_statement
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_halt_compiler_statement_in_inner_statement212);
					halt_compiler_statement14=halt_compiler_statement();
					state._fsp--;

					adaptor.addChild(root_0, halt_compiler_statement14.getTree());

					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inner_statement"


	public static class halt_compiler_statement_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "halt_compiler_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:286:1: halt_compiler_statement : '__halt_compiler' ;
	public final TreePHP.halt_compiler_statement_return halt_compiler_statement() throws RecognitionException {
		TreePHP.halt_compiler_statement_return retval = new TreePHP.halt_compiler_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST string_literal15=null;

		AST string_literal15_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:287:3: ( '__halt_compiler' )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:287:5: '__halt_compiler'
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			string_literal15=(AST)match(input,183,FOLLOW_183_in_halt_compiler_statement227); 
			string_literal15_tree = (AST)adaptor.dupNode(string_literal15);


			adaptor.addChild(root_0, string_literal15_tree);

			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "halt_compiler_statement"


	public static class class_declaration_statement_return extends TreeRuleReturnScope {
		public ClassDeclaration classDeclaration;
		public InterfaceDeclaration interfaceDeclaration;
		public TraitDeclaration traitDeclaration;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "class_declaration_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:290:1: class_declaration_statement returns [ClassDeclaration classDeclaration, InterfaceDeclaration interfaceDeclaration, TraitDeclaration traitDeclaration] : ( ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) | ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) | ^( TRAIT_T IDENTIFIER ( ^( TRAIT_BODY class_statement_list ) )? ) );
	public final TreePHP.class_declaration_statement_return class_declaration_statement() throws RecognitionException {
		TreePHP.class_declaration_statement_return retval = new TreePHP.class_declaration_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST CLASS_T16=null;
		AST IDENTIFIER18=null;
		AST EXTENDS_T19=null;
		AST IMPLEMENTS_T21=null;
		AST CLASS_BODY23=null;
		AST INTERFACE_T25=null;
		AST IDENTIFIER26=null;
		AST EXTENDS_T27=null;
		AST CLASS_BODY29=null;
		AST TRAIT_T31=null;
		AST IDENTIFIER32=null;
		AST TRAIT_BODY33=null;
		TreeRuleReturnScope class_entr_type17 =null;
		TreeRuleReturnScope fully_qualified_class_name20 =null;
		TreeRuleReturnScope fully_qualified_class_name_list22 =null;
		TreeRuleReturnScope class_statement_list24 =null;
		TreeRuleReturnScope fully_qualified_class_name_list28 =null;
		TreeRuleReturnScope class_statement_list30 =null;
		TreeRuleReturnScope class_statement_list34 =null;

		AST CLASS_T16_tree=null;
		AST IDENTIFIER18_tree=null;
		AST EXTENDS_T19_tree=null;
		AST IMPLEMENTS_T21_tree=null;
		AST CLASS_BODY23_tree=null;
		AST INTERFACE_T25_tree=null;
		AST IDENTIFIER26_tree=null;
		AST EXTENDS_T27_tree=null;
		AST CLASS_BODY29_tree=null;
		AST TRAIT_T31_tree=null;
		AST IDENTIFIER32_tree=null;
		AST TRAIT_BODY33_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:291:3: ( ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) | ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) | ^( TRAIT_T IDENTIFIER ( ^( TRAIT_BODY class_statement_list ) )? ) )
			int alt13=3;
			switch ( input.LA(1) ) {
			case CLASS_T:
				{
				alt13=1;
				}
				break;
			case INTERFACE_T:
				{
				alt13=2;
				}
				break;
			case TRAIT_T:
				{
				alt13=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:291:5: ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CLASS_T16=(AST)match(input,CLASS_T,FOLLOW_CLASS_T_in_class_declaration_statement247); 
					CLASS_T16_tree = (AST)adaptor.dupNode(CLASS_T16);


					root_1 = (AST)adaptor.becomeRoot(CLASS_T16_tree, root_1);

					match(input, Token.DOWN, null); 
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:291:15: ( class_entr_type )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==184||LA6_0==189) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:291:15: class_entr_type
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_class_entr_type_in_class_declaration_statement249);
							class_entr_type17=class_entr_type();
							state._fsp--;

							adaptor.addChild(root_1, class_entr_type17.getTree());

							}
							break;

					}

					_last = (AST)input.LT(1);
					IDENTIFIER18=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement252); 
					IDENTIFIER18_tree = (AST)adaptor.dupNode(IDENTIFIER18);


					adaptor.addChild(root_1, IDENTIFIER18_tree);


					      TreePHP.ModifierDocPair modifier = new ModifierDocPair(Modifiers.AccDefault, null);
					      int startIndex = CLASS_T16.startIndex;
					      int endIndex = CLASS_T16.endIndex + 1;
					      if ((class_entr_type17!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(class_entr_type17.start),input.getTreeAdaptor().getTokenStopIndex(class_entr_type17.start))):null) != null) {
					          if ((class_entr_type17!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(class_entr_type17.start),input.getTreeAdaptor().getTokenStopIndex(class_entr_type17.start))):null).equals("abstract")) {
					            modifier = new ModifierDocPair(Modifiers.AccAbstract, null);
					          }
					      }
					      
					      CommonToken token = (CommonToken)IDENTIFIER18.token;
					      int classNameLeft = token.getStartIndex();
					      int classNameRight = token.getStopIndex() + 1;
					      String className = (IDENTIFIER18!=null?IDENTIFIER18.getText():null);
					      
					      retval.classDeclaration = new ClassDeclaration(startIndex ,endIndex, classNameLeft, classNameRight, modifier.modifier, className, null, null, new Block(classNameRight,classNameRight,null), null);
					      parser.addDeclarationStatement(retval.classDeclaration);
					      parser.declarations.push(retval.classDeclaration);
					  
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:312:4: ( ^( EXTENDS_T fully_qualified_class_name ) )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==EXTENDS_T) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:312:5: ^( EXTENDS_T fully_qualified_class_name )
							{
							_last = (AST)input.LT(1);
							{
							AST _save_last_2 = _last;
							AST _first_2 = null;
							AST root_2 = (AST)adaptor.nil();
							_last = (AST)input.LT(1);
							EXTENDS_T19=(AST)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement266); 
							EXTENDS_T19_tree = (AST)adaptor.dupNode(EXTENDS_T19);


							root_2 = (AST)adaptor.becomeRoot(EXTENDS_T19_tree, root_2);

							match(input, Token.DOWN, null); 
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_fully_qualified_class_name_in_class_declaration_statement268);
							fully_qualified_class_name20=fully_qualified_class_name();
							state._fsp--;

							adaptor.addChild(root_2, fully_qualified_class_name20.getTree());

							match(input, Token.UP, null); 
							adaptor.addChild(root_1, root_2);
							_last = _save_last_2;
							}


							}
							break;

					}

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:312:47: ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==IMPLEMENTS_T) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:312:48: ^( IMPLEMENTS_T fully_qualified_class_name_list )
							{
							_last = (AST)input.LT(1);
							{
							AST _save_last_2 = _last;
							AST _first_2 = null;
							AST root_2 = (AST)adaptor.nil();
							_last = (AST)input.LT(1);
							IMPLEMENTS_T21=(AST)match(input,IMPLEMENTS_T,FOLLOW_IMPLEMENTS_T_in_class_declaration_statement275); 
							IMPLEMENTS_T21_tree = (AST)adaptor.dupNode(IMPLEMENTS_T21);


							root_2 = (AST)adaptor.becomeRoot(IMPLEMENTS_T21_tree, root_2);

							match(input, Token.DOWN, null); 
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement277);
							fully_qualified_class_name_list22=fully_qualified_class_name_list();
							state._fsp--;

							adaptor.addChild(root_2, fully_qualified_class_name_list22.getTree());

							match(input, Token.UP, null); 
							adaptor.addChild(root_1, root_2);
							_last = _save_last_2;
							}


							}
							break;

					}

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:313:7: ( ^( CLASS_BODY class_statement_list ) )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==CLASS_BODY) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:313:8: ^( CLASS_BODY class_statement_list )
							{
							_last = (AST)input.LT(1);
							{
							AST _save_last_2 = _last;
							AST _first_2 = null;
							AST root_2 = (AST)adaptor.nil();
							_last = (AST)input.LT(1);
							CLASS_BODY23=(AST)match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_class_declaration_statement290); 
							CLASS_BODY23_tree = (AST)adaptor.dupNode(CLASS_BODY23);


							root_2 = (AST)adaptor.becomeRoot(CLASS_BODY23_tree, root_2);

							match(input, Token.DOWN, null); 
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_class_statement_list_in_class_declaration_statement292);
							class_statement_list24=class_statement_list();
							state._fsp--;

							adaptor.addChild(root_2, class_statement_list24.getTree());

							match(input, Token.UP, null); 
							adaptor.addChild(root_1, root_2);
							_last = _save_last_2;
							}


							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					      
					      TreePHP.ModifierDocPair modifier = new ModifierDocPair(Modifiers.AccDefault, null);
					      int startIndex = CLASS_T16.startIndex;
					      int endIndex = CLASS_T16.endIndex + 1;
					      if ((class_entr_type17!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(class_entr_type17.start),input.getTreeAdaptor().getTokenStopIndex(class_entr_type17.start))):null) != null) {
					          if ((class_entr_type17!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(class_entr_type17.start),input.getTreeAdaptor().getTokenStopIndex(class_entr_type17.start))):null).equals("abstract")) {
					            modifier = new ModifierDocPair(Modifiers.AccAbstract, null);
					          }
					      }
					      
					      CommonToken token = (CommonToken)IDENTIFIER18.token;
					      int classNameLeft = token.getStartIndex();
					      int classNameRight = token.getStopIndex() + 1;
					      String className = (IDENTIFIER18!=null?IDENTIFIER18.getText():null);
					        
					      TypeReference superClass = null;
					      int superClassLeft = 0;
					      int superClassRight = 0;
					      if ((fully_qualified_class_name20!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(fully_qualified_class_name20.start),input.getTreeAdaptor().getTokenStopIndex(fully_qualified_class_name20.start))):null) != null) {
					          superClassLeft = ((CommonToken)(fully_qualified_class_name20!=null?((AST)fully_qualified_class_name20.getTree()):null).token).getStartIndex();
					          superClassRight = ((CommonToken)(fully_qualified_class_name20!=null?((AST)fully_qualified_class_name20.getTree()):null).token).getStopIndex() + 1;
					          superClass = (fully_qualified_class_name20!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name20).type:null);
					      }
					      
					      List interfaces = null;
					      int interfacesLeft = 0;
					      int interfacesRight = 0;
					      if ((fully_qualified_class_name_list22!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(fully_qualified_class_name_list22.start),input.getTreeAdaptor().getTokenStopIndex(fully_qualified_class_name_list22.start))):null) != null) {
					          interfacesLeft = ((CommonToken)(fully_qualified_class_name_list22!=null?((AST)fully_qualified_class_name_list22.getTree()):null).token).getStartIndex();
					          interfacesRight = ((CommonToken)(fully_qualified_class_name_list22!=null?((AST)fully_qualified_class_name_list22.getTree()):null).token).getStopIndex() + 1;
					      }
					      
					      retval.classDeclaration = (ClassDeclaration)parser.declarations.pop();
					          if (superClass != null) {
					            retval.classDeclaration.setSuperClass(superClass);
					          }
					          if (interfaces != null) {
					            retval.classDeclaration.setInterfaceList(interfaces);
					          }
					    
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:355:5: ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					INTERFACE_T25=(AST)match(input,INTERFACE_T,FOLLOW_INTERFACE_T_in_class_declaration_statement309); 
					INTERFACE_T25_tree = (AST)adaptor.dupNode(INTERFACE_T25);


					root_1 = (AST)adaptor.becomeRoot(INTERFACE_T25_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					IDENTIFIER26=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement311); 
					IDENTIFIER26_tree = (AST)adaptor.dupNode(IDENTIFIER26);


					adaptor.addChild(root_1, IDENTIFIER26_tree);

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:355:30: ( ^( EXTENDS_T fully_qualified_class_name_list ) )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==EXTENDS_T) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:355:31: ^( EXTENDS_T fully_qualified_class_name_list )
							{
							_last = (AST)input.LT(1);
							{
							AST _save_last_2 = _last;
							AST _first_2 = null;
							AST root_2 = (AST)adaptor.nil();
							_last = (AST)input.LT(1);
							EXTENDS_T27=(AST)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement315); 
							EXTENDS_T27_tree = (AST)adaptor.dupNode(EXTENDS_T27);


							root_2 = (AST)adaptor.becomeRoot(EXTENDS_T27_tree, root_2);

							match(input, Token.DOWN, null); 
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement317);
							fully_qualified_class_name_list28=fully_qualified_class_name_list();
							state._fsp--;

							adaptor.addChild(root_2, fully_qualified_class_name_list28.getTree());

							match(input, Token.UP, null); 
							adaptor.addChild(root_1, root_2);
							_last = _save_last_2;
							}


							}
							break;

					}

					 
					       PHPDocBlock start = null;
					       int startIndex = INTERFACE_T25.startIndex;
					       int endIndex = INTERFACE_T25.endIndex + 1;
					          
					       CommonToken token = (CommonToken)IDENTIFIER26.token;
					       int classNameLeft = token.getStartIndex();
					       int classNameRight = token.getStopIndex() + 1;
					       String className = (IDENTIFIER26!=null?IDENTIFIER26.getText():null);
					       
					       List interfaces = new LinkedList();
					       int listStartIndex = 0, listEndIndex = 0;
					       if ((fully_qualified_class_name_list28!=null?((TreePHP.fully_qualified_class_name_list_return)fully_qualified_class_name_list28).list:null) != null) {
					          interfaces = (fully_qualified_class_name_list28!=null?((TreePHP.fully_qualified_class_name_list_return)fully_qualified_class_name_list28).list:null);
					          CommonToken listToken = (CommonToken)(fully_qualified_class_name_list28!=null?((AST)fully_qualified_class_name_list28.getTree()):null).token;
					          listStartIndex = listToken.getStartIndex();
					          listEndIndex = listToken.getStopIndex();
					       }
					          
					       retval.interfaceDeclaration = new InterfaceDeclaration(startIndex ,endIndex, classNameLeft, classNameRight, className, interfaces, new Block(listStartIndex, listEndIndex,null), start);
					       parser.declarations.push(retval.interfaceDeclaration);
					    
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:378:7: ( ^( CLASS_BODY class_statement_list ) )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==CLASS_BODY) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:378:8: ^( CLASS_BODY class_statement_list )
							{
							_last = (AST)input.LT(1);
							{
							AST _save_last_2 = _last;
							AST _first_2 = null;
							AST root_2 = (AST)adaptor.nil();
							_last = (AST)input.LT(1);
							CLASS_BODY29=(AST)match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_class_declaration_statement336); 
							CLASS_BODY29_tree = (AST)adaptor.dupNode(CLASS_BODY29);


							root_2 = (AST)adaptor.becomeRoot(CLASS_BODY29_tree, root_2);

							match(input, Token.DOWN, null); 
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_class_statement_list_in_class_declaration_statement338);
							class_statement_list30=class_statement_list();
							state._fsp--;

							adaptor.addChild(root_2, class_statement_list30.getTree());

							match(input, Token.UP, null); 
							adaptor.addChild(root_1, root_2);
							_last = _save_last_2;
							}


							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					       retval.interfaceDeclaration = (InterfaceDeclaration)parser.declarations.pop();
					    
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:382:5: ^( TRAIT_T IDENTIFIER ( ^( TRAIT_BODY class_statement_list ) )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					TRAIT_T31=(AST)match(input,TRAIT_T,FOLLOW_TRAIT_T_in_class_declaration_statement355); 
					TRAIT_T31_tree = (AST)adaptor.dupNode(TRAIT_T31);


					root_1 = (AST)adaptor.becomeRoot(TRAIT_T31_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					IDENTIFIER32=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement357); 
					IDENTIFIER32_tree = (AST)adaptor.dupNode(IDENTIFIER32);


					adaptor.addChild(root_1, IDENTIFIER32_tree);

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:382:26: ( ^( TRAIT_BODY class_statement_list ) )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==TRAIT_BODY) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:382:27: ^( TRAIT_BODY class_statement_list )
							{
							_last = (AST)input.LT(1);
							{
							AST _save_last_2 = _last;
							AST _first_2 = null;
							AST root_2 = (AST)adaptor.nil();
							_last = (AST)input.LT(1);
							TRAIT_BODY33=(AST)match(input,TRAIT_BODY,FOLLOW_TRAIT_BODY_in_class_declaration_statement361); 
							TRAIT_BODY33_tree = (AST)adaptor.dupNode(TRAIT_BODY33);


							root_2 = (AST)adaptor.becomeRoot(TRAIT_BODY33_tree, root_2);

							match(input, Token.DOWN, null); 
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_class_statement_list_in_class_declaration_statement363);
							class_statement_list34=class_statement_list();
							state._fsp--;

							adaptor.addChild(root_2, class_statement_list34.getTree());

							match(input, Token.UP, null); 
							adaptor.addChild(root_1, root_2);
							_last = _save_last_2;
							}


							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					        int startIndex = TRAIT_T31.startIndex;
					        int endIndex = TRAIT_T31.endIndex + 1;

					        CommonToken token = (CommonToken)IDENTIFIER32.token;
					        int traitNameLeft = token.getStartIndex();
					        int traitNameRight = token.getStopIndex() + 1;
					        String className = (IDENTIFIER32!=null?IDENTIFIER32.getText():null);
					        
					        retval.traitDeclaration = new TraitDeclaration(startIndex ,endIndex, traitNameLeft, traitNameRight, className, new Block(traitNameRight,traitNameRight,null), null);
					        parser.addDeclarationStatement(retval.traitDeclaration);
					        parser.declarations.push(retval.traitDeclaration);
					     
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "class_declaration_statement"


	public static class class_entr_type_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "class_entr_type"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:398:1: class_entr_type : ( 'abstract' | 'final' );
	public final TreePHP.class_entr_type_return class_entr_type() throws RecognitionException {
		TreePHP.class_entr_type_return retval = new TreePHP.class_entr_type_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST set35=null;

		AST set35_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:399:3: ( 'abstract' | 'final' )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			set35=(AST)input.LT(1);
			if ( input.LA(1)==184||input.LA(1)==189 ) {
				input.consume();
				set35_tree = (AST)adaptor.dupNode(set35);


				adaptor.addChild(root_0, set35_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "class_entr_type"


	public static class class_statement_list_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "class_statement_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:403:1: class_statement_list : ( class_statement )+ ;
	public final TreePHP.class_statement_list_return class_statement_list() throws RecognitionException {
		TreePHP.class_statement_list_return retval = new TreePHP.class_statement_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope class_statement36 =null;


		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:404:3: ( ( class_statement )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:404:5: ( class_statement )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:404:5: ( class_statement )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==FIELD_DECL||LA14_0==METHOD_DECL||LA14_0==USE_DECL) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:404:5: class_statement
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_class_statement_in_class_statement_list411);
					class_statement36=class_statement();
					state._fsp--;

					adaptor.addChild(root_0, class_statement36.getTree());

					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "class_statement_list"


	protected static class class_statement_scope {
		List constList;
		List varList;
	}
	protected Stack<class_statement_scope> class_statement_stack = new Stack<class_statement_scope>();

	public static class class_statement_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "class_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:407:1: class_statement : ( ^( FIELD_DECL variable_modifiers ( static_var_element )+ ) | ^( METHOD_DECL modifier ( REF_T )? IDENTIFIER ( parameter_list )? ( block | EMPTYSTATEMENT ) ) | ^( FIELD_DECL CONST_T ( directive )+ ) | ^( USE_DECL fully_qualified_class_name_list trait_adaptations ) );
	public final TreePHP.class_statement_return class_statement() throws RecognitionException {
		class_statement_stack.push(new class_statement_scope());
		TreePHP.class_statement_return retval = new TreePHP.class_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST FIELD_DECL37=null;
		AST METHOD_DECL40=null;
		AST REF_T42=null;
		AST IDENTIFIER43=null;
		AST EMPTYSTATEMENT46=null;
		AST FIELD_DECL47=null;
		AST CONST_T48=null;
		AST USE_DECL50=null;
		TreeRuleReturnScope variable_modifiers38 =null;
		TreeRuleReturnScope static_var_element39 =null;
		TreeRuleReturnScope modifier41 =null;
		TreeRuleReturnScope parameter_list44 =null;
		TreeRuleReturnScope block45 =null;
		TreeRuleReturnScope directive49 =null;
		TreeRuleReturnScope fully_qualified_class_name_list51 =null;
		TreeRuleReturnScope trait_adaptations52 =null;

		AST FIELD_DECL37_tree=null;
		AST METHOD_DECL40_tree=null;
		AST REF_T42_tree=null;
		AST IDENTIFIER43_tree=null;
		AST EMPTYSTATEMENT46_tree=null;
		AST FIELD_DECL47_tree=null;
		AST CONST_T48_tree=null;
		AST USE_DECL50_tree=null;


		  class_statement_stack.peek().constList = new LinkedList();
		  class_statement_stack.peek().varList = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:416:3: ( ^( FIELD_DECL variable_modifiers ( static_var_element )+ ) | ^( METHOD_DECL modifier ( REF_T )? IDENTIFIER ( parameter_list )? ( block | EMPTYSTATEMENT ) ) | ^( FIELD_DECL CONST_T ( directive )+ ) | ^( USE_DECL fully_qualified_class_name_list trait_adaptations ) )
			int alt20=4;
			switch ( input.LA(1) ) {
			case FIELD_DECL:
				{
				int LA20_1 = input.LA(2);
				if ( (LA20_1==DOWN) ) {
					int LA20_4 = input.LA(3);
					if ( (LA20_4==STATIC_T||LA20_4==184||LA20_4==189||(LA20_4 >= 193 && LA20_4 <= 195)||LA20_4==198) ) {
						alt20=1;
					}
					else if ( (LA20_4==CONST_T) ) {
						alt20=3;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case METHOD_DECL:
				{
				alt20=2;
				}
				break;
			case USE_DECL:
				{
				alt20=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:416:5: ^( FIELD_DECL variable_modifiers ( static_var_element )+ )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					FIELD_DECL37=(AST)match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_class_statement436); 
					FIELD_DECL37_tree = (AST)adaptor.dupNode(FIELD_DECL37);


					root_1 = (AST)adaptor.becomeRoot(FIELD_DECL37_tree, root_1);

					inClassStatementList = true;
					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_variable_modifiers_in_class_statement440);
					variable_modifiers38=variable_modifiers();
					state._fsp--;

					adaptor.addChild(root_1, variable_modifiers38.getTree());

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:416:68: ( static_var_element )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==EQUAL_T||LA15_0==VAR_DECL) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:416:68: static_var_element
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_static_var_element_in_class_statement442);
							static_var_element39=static_var_element();
							state._fsp--;

							adaptor.addChild(root_1, static_var_element39.getTree());

							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					inClassStatementList = false;
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    ModifierDocPair modifier = new ModifierDocPair(Modifiers.AccDefault, null);
					    int modifierLeft = 0;
					    
					    AST tree = (AST)(variable_modifiers38!=null?((AST)variable_modifiers38.getTree()):null);
					    if(tree != null) {
					        Token token = tree.token;
					        if(token != null) {
					            modifierLeft = ((CommonToken)token).getStartIndex();
					        }
					    }
					    
					    //int modifierLeft = ((CommonToken)(variable_modifiers38!=null?((AST)variable_modifiers38.getTree()):null).token).getStartIndex();
					    if ((variable_modifiers38!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(variable_modifiers38.start),input.getTreeAdaptor().getTokenStopIndex(variable_modifiers38.start))):null).equals("var")) {
					      modifier = new ModifierDocPair(Modifiers.AccPublic, null);
					    }
					    
					    Iterator iter = class_statement_stack.peek().varList.iterator();
					    while (iter.hasNext()) {
					        ASTNode[] decl = (ASTNode[])iter.next();
					        if (decl != null) {
					            VariableReference variable = (VariableReference)decl[0];
					            Expression initializer = (Expression)decl[1];
					            int start = variable.sourceStart();
					            int end = (initializer == null ? variable.sourceEnd() : initializer.sourceEnd());
					            parser.addDeclarationStatement(new PHPFieldDeclaration(variable, initializer, start, end, modifier.modifier, modifierLeft, modifier.doc));
					          }
					        }
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:446:5: ^( METHOD_DECL modifier ( REF_T )? IDENTIFIER ( parameter_list )? ( block | EMPTYSTATEMENT ) )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					METHOD_DECL40=(AST)match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_class_statement457); 
					METHOD_DECL40_tree = (AST)adaptor.dupNode(METHOD_DECL40);


					root_1 = (AST)adaptor.becomeRoot(METHOD_DECL40_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_modifier_in_class_statement459);
					modifier41=modifier();
					state._fsp--;

					adaptor.addChild(root_1, modifier41.getTree());

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:446:28: ( REF_T )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==REF_T) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:446:28: REF_T
							{
							_last = (AST)input.LT(1);
							REF_T42=(AST)match(input,REF_T,FOLLOW_REF_T_in_class_statement461); 
							REF_T42_tree = (AST)adaptor.dupNode(REF_T42);


							adaptor.addChild(root_1, REF_T42_tree);

							}
							break;

					}

					_last = (AST)input.LT(1);
					IDENTIFIER43=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_statement464); 
					IDENTIFIER43_tree = (AST)adaptor.dupNode(IDENTIFIER43);


					adaptor.addChild(root_1, IDENTIFIER43_tree);


					      ModifierDocPair modifier = (modifier41!=null?((TreePHP.modifier_return)modifier41).modifierVar:null);
					      PHPDocBlock start = null;
					      Boolean isReference = false;
					      if ((REF_T42!=null?REF_T42.getText():null) != null) {
					         isReference = true;
					      }
					      int functionNameLeft = ((CommonToken)IDENTIFIER43.token).getStartIndex();
					      int functionNameRight = ((CommonToken)IDENTIFIER43.token).getStopIndex() + 1;
					      String functionName = (IDENTIFIER43!=null?IDENTIFIER43.getText():null);
					  
					      int startIndex = METHOD_DECL40.startIndex;
					      int endIndex = METHOD_DECL40.endIndex + 1;
					      int modifierValue = (modifier == null || modifier.modifier == Modifiers.AccDefault) ? Modifiers.AccPublic : modifier.modifier;
					      
					      PHPDocBlock docBlock = start;
					      if (modifier != null && modifier.doc != null) {
					        docBlock = modifier.doc;
					      }
					      PHPMethodDeclaration methodDeclaration = new PHPMethodDeclaration(startIndex, endIndex, startIndex, endIndex, functionName, modifierValue, null, new Block(startIndex, endIndex, null), isReference.booleanValue(), docBlock);
					      parser.addDeclarationStatement(methodDeclaration);
					      parser.declarations.push(methodDeclaration);
					    
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:470:7: ( parameter_list )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==PARAMETER) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:470:7: parameter_list
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_parameter_list_in_class_statement478);
							parameter_list44=parameter_list();
							state._fsp--;

							adaptor.addChild(root_1, parameter_list44.getTree());

							}
							break;

					}


					        if ((parameter_list44!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(parameter_list44.start),input.getTreeAdaptor().getTokenStopIndex(parameter_list44.start))):null) != null) {
					          PHPMethodDeclaration functionDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
					                  functionDeclaration.acceptArguments((parameter_list44!=null?((TreePHP.parameter_list_return)parameter_list44).parameterList:null));
					        }
					      
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:477:5: ( block | EMPTYSTATEMENT )
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==BLOCK) ) {
						alt18=1;
					}
					else if ( (LA18_0==EMPTYSTATEMENT) ) {
						alt18=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 18, 0, input);
						throw nvae;
					}

					switch (alt18) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:477:6: block
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_block_in_class_statement494);
							block45=block();
							state._fsp--;

							adaptor.addChild(root_1, block45.getTree());


							        startIndex = ((CommonToken)(block45!=null?((AST)block45.getTree()):null).token).getStartIndex();
							            endIndex = ((CommonToken)(block45!=null?((AST)block45.getTree()):null).token).getStopIndex() + 1;
							            
							            methodDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
							              methodDeclaration.getBody().setStart(startIndex);
							              methodDeclaration.getBody().setEnd(endIndex);
							              methodDeclaration.getBody().getStatements().clear();
							              methodDeclaration.getBody().acceptStatements((block45!=null?((TreePHP.block_return)block45).statList:null));
							              
							              methodDeclaration = (PHPMethodDeclaration)parser.declarations.pop();
							//              if(body instanceof ASTError) {
							//                parser.reportError(new ASTError(methodDeclaration.sourceEnd() - 1, methodDeclaration.sourceEnd()), "syntax error, unfinished method declaration");
							//              }
							              TypeDeclaration type = (TypeDeclaration)parser.declarations.peek();
							              methodDeclaration.setDeclaringTypeName(type.getName()); 
							     
							}
							break;
						case 2 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:496:5: EMPTYSTATEMENT
							{
							_last = (AST)input.LT(1);
							EMPTYSTATEMENT46=(AST)match(input,EMPTYSTATEMENT,FOLLOW_EMPTYSTATEMENT_in_class_statement513); 
							EMPTYSTATEMENT46_tree = (AST)adaptor.dupNode(EMPTYSTATEMENT46);


							adaptor.addChild(root_1, EMPTYSTATEMENT46_tree);

							   
							        startIndex = ((CommonToken)EMPTYSTATEMENT46.token).getStartIndex();
							        endIndex = ((CommonToken)EMPTYSTATEMENT46.token).getStopIndex() + 1;
							        
							        methodDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
							        methodDeclaration.getBody().setStart(startIndex);
							        methodDeclaration.getBody().setEnd(endIndex);
							        methodDeclaration.getBody().getStatements().clear();
							        methodDeclaration.getBody().acceptStatements(new LinkedList());
							        
							        methodDeclaration = (PHPMethodDeclaration)parser.declarations.pop();
							//        if(body instanceof ASTError) {
							//          parser.reportError(new ASTError(methodDeclaration.sourceEnd() - 1, methodDeclaration.sourceEnd()), "syntax error, unfinished method declaration");
							//        }
							        TypeDeclaration type = (TypeDeclaration)parser.declarations.peek();
							        methodDeclaration.setDeclaringTypeName(type.getName()); 
							     
							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:515:5: ^( FIELD_DECL CONST_T ( directive )+ )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					FIELD_DECL47=(AST)match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_class_statement536); 
					FIELD_DECL47_tree = (AST)adaptor.dupNode(FIELD_DECL47);


					root_1 = (AST)adaptor.becomeRoot(FIELD_DECL47_tree, root_1);

					inClassStatementList = true;
					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					CONST_T48=(AST)match(input,CONST_T,FOLLOW_CONST_T_in_class_statement540); 
					CONST_T48_tree = (AST)adaptor.dupNode(CONST_T48);


					adaptor.addChild(root_1, CONST_T48_tree);

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:515:57: ( directive )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==EQUAL_T) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:515:57: directive
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_directive_in_class_statement542);
							directive49=directive();
							state._fsp--;

							adaptor.addChild(root_1, directive49.getTree());

							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					inClassStatementList = false;
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = FIELD_DECL47.startIndex;
					    int endIndex = FIELD_DECL47.endIndex;
					    Iterator iter = class_statement_stack.peek().constList.iterator();
					    while (iter.hasNext()) {
					      ASTNode[] decl = (ASTNode[])iter.next();
					        if (decl != null) {
					            ConstantReference constant = (ConstantReference)decl[0];
					            Expression initializer = (Expression)decl[1];
					            int decListLeft = ((CommonToken)(directive49!=null?((AST)directive49.getTree()):null).token).getStartIndex();
					              
					            PHPDocBlock docBlock = null;
					            if (decl.length == 3) {
					              docBlock = (PHPDocBlock)decl[2];
					            }
					            int start = constant.sourceStart();
					            int end = (initializer == null ? constant.sourceEnd() : initializer.sourceEnd());
					            parser.addDeclarationStatement(new ConstantDeclaration(constant, initializer, startIndex, end, docBlock));
					          }
					        }
					  
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:537:5: ^( USE_DECL fully_qualified_class_name_list trait_adaptations )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					USE_DECL50=(AST)match(input,USE_DECL,FOLLOW_USE_DECL_in_class_statement557); 
					USE_DECL50_tree = (AST)adaptor.dupNode(USE_DECL50);


					root_1 = (AST)adaptor.becomeRoot(USE_DECL50_tree, root_1);

					inClassStatementList = true;
					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_statement561);
					fully_qualified_class_name_list51=fully_qualified_class_name_list();
					state._fsp--;

					adaptor.addChild(root_1, fully_qualified_class_name_list51.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_trait_adaptations_in_class_statement563);
					trait_adaptations52=trait_adaptations();
					state._fsp--;

					adaptor.addChild(root_1, trait_adaptations52.getTree());

					inClassStatementList = false;
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = USE_DECL50.startIndex;
					    int endIndex = USE_DECL50.endIndex;
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			class_statement_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "class_statement"


	public static class trait_adaptations_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "trait_adaptations"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:544:1: trait_adaptations : ^( TRAIT_T ( trait_adaptation )* ) ;
	public final TreePHP.trait_adaptations_return trait_adaptations() throws RecognitionException {
		TreePHP.trait_adaptations_return retval = new TreePHP.trait_adaptations_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST TRAIT_T53=null;
		TreeRuleReturnScope trait_adaptation54 =null;

		AST TRAIT_T53_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:545:3: ( ^( TRAIT_T ( trait_adaptation )* ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:545:5: ^( TRAIT_T ( trait_adaptation )* )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			TRAIT_T53=(AST)match(input,TRAIT_T,FOLLOW_TRAIT_T_in_trait_adaptations585); 
			TRAIT_T53_tree = (AST)adaptor.dupNode(TRAIT_T53);


			root_1 = (AST)adaptor.becomeRoot(TRAIT_T53_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:545:15: ( trait_adaptation )*
				loop21:
				while (true) {
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==INSTANCEOF_T||LA21_0==TRAIT_METH) ) {
						alt21=1;
					}

					switch (alt21) {
					case 1 :
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:545:15: trait_adaptation
						{
						_last = (AST)input.LT(1);
						pushFollow(FOLLOW_trait_adaptation_in_trait_adaptations587);
						trait_adaptation54=trait_adaptation();
						state._fsp--;

						adaptor.addChild(root_1, trait_adaptation54.getTree());

						}
						break;

					default :
						break loop21;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trait_adaptations"


	public static class trait_adaptation_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "trait_adaptation"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:548:1: trait_adaptation : ( ^( INSTANCEOF_T fully_qualified_class_name fully_qualified_class_name_list ) | ^( TRAIT_METH fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? ) );
	public final TreePHP.trait_adaptation_return trait_adaptation() throws RecognitionException {
		TreePHP.trait_adaptation_return retval = new TreePHP.trait_adaptation_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST INSTANCEOF_T55=null;
		AST TRAIT_METH58=null;
		AST AS_T60=null;
		AST IDENTIFIER62=null;
		TreeRuleReturnScope fully_qualified_class_name56 =null;
		TreeRuleReturnScope fully_qualified_class_name_list57 =null;
		TreeRuleReturnScope fully_qualified_class_name59 =null;
		TreeRuleReturnScope modifier61 =null;

		AST INSTANCEOF_T55_tree=null;
		AST TRAIT_METH58_tree=null;
		AST AS_T60_tree=null;
		AST IDENTIFIER62_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:549:3: ( ^( INSTANCEOF_T fully_qualified_class_name fully_qualified_class_name_list ) | ^( TRAIT_METH fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? ) )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==INSTANCEOF_T) ) {
				alt24=1;
			}
			else if ( (LA24_0==TRAIT_METH) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:549:5: ^( INSTANCEOF_T fully_qualified_class_name fully_qualified_class_name_list )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					INSTANCEOF_T55=(AST)match(input,INSTANCEOF_T,FOLLOW_INSTANCEOF_T_in_trait_adaptation603); 
					INSTANCEOF_T55_tree = (AST)adaptor.dupNode(INSTANCEOF_T55);


					root_1 = (AST)adaptor.becomeRoot(INSTANCEOF_T55_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_in_trait_adaptation605);
					fully_qualified_class_name56=fully_qualified_class_name();
					state._fsp--;

					adaptor.addChild(root_1, fully_qualified_class_name56.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_list_in_trait_adaptation607);
					fully_qualified_class_name_list57=fully_qualified_class_name_list();
					state._fsp--;

					adaptor.addChild(root_1, fully_qualified_class_name_list57.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:550:5: ^( TRAIT_METH fully_qualified_class_name AS_T ( modifier )? ( IDENTIFIER )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					TRAIT_METH58=(AST)match(input,TRAIT_METH,FOLLOW_TRAIT_METH_in_trait_adaptation615); 
					TRAIT_METH58_tree = (AST)adaptor.dupNode(TRAIT_METH58);


					root_1 = (AST)adaptor.becomeRoot(TRAIT_METH58_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_in_trait_adaptation617);
					fully_qualified_class_name59=fully_qualified_class_name();
					state._fsp--;

					adaptor.addChild(root_1, fully_qualified_class_name59.getTree());

					_last = (AST)input.LT(1);
					AS_T60=(AST)match(input,AS_T,FOLLOW_AS_T_in_trait_adaptation619); 
					AS_T60_tree = (AST)adaptor.dupNode(AS_T60);


					adaptor.addChild(root_1, AS_T60_tree);

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:550:50: ( modifier )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==STATIC_T||LA22_0==184||LA22_0==189||(LA22_0 >= 193 && LA22_0 <= 195)) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:550:50: modifier
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_modifier_in_trait_adaptation621);
							modifier61=modifier();
							state._fsp--;

							adaptor.addChild(root_1, modifier61.getTree());

							}
							break;

					}

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:550:60: ( IDENTIFIER )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==IDENTIFIER) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:550:60: IDENTIFIER
							{
							_last = (AST)input.LT(1);
							IDENTIFIER62=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_trait_adaptation624); 
							IDENTIFIER62_tree = (AST)adaptor.dupNode(IDENTIFIER62);


							adaptor.addChild(root_1, IDENTIFIER62_tree);

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trait_adaptation"


	public static class function_declaration_statement_return extends TreeRuleReturnScope {
		public Statement stat;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "function_declaration_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:553:1: function_declaration_statement returns [Statement stat] : ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) ;
	public final TreePHP.function_declaration_statement_return function_declaration_statement() throws RecognitionException {
		TreePHP.function_declaration_statement_return retval = new TreePHP.function_declaration_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST METHOD_DECL63=null;
		AST REF_T64=null;
		AST IDENTIFIER65=null;
		TreeRuleReturnScope parameter_list66 =null;
		TreeRuleReturnScope block67 =null;

		AST METHOD_DECL63_tree=null;
		AST REF_T64_tree=null;
		AST IDENTIFIER65_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:554:3: ( ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:554:5: ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			METHOD_DECL63=(AST)match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_function_declaration_statement644); 
			METHOD_DECL63_tree = (AST)adaptor.dupNode(METHOD_DECL63);


			root_1 = (AST)adaptor.becomeRoot(METHOD_DECL63_tree, root_1);

			match(input, Token.DOWN, null); 
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:554:19: ( REF_T )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==REF_T) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:554:19: REF_T
					{
					_last = (AST)input.LT(1);
					REF_T64=(AST)match(input,REF_T,FOLLOW_REF_T_in_function_declaration_statement646); 
					REF_T64_tree = (AST)adaptor.dupNode(REF_T64);


					adaptor.addChild(root_1, REF_T64_tree);

					}
					break;

			}

			_last = (AST)input.LT(1);
			IDENTIFIER65=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration_statement649); 
			IDENTIFIER65_tree = (AST)adaptor.dupNode(IDENTIFIER65);


			adaptor.addChild(root_1, IDENTIFIER65_tree);


			    Boolean isReference = false;
			    if ((REF_T64!=null?REF_T64.getText():null) != null) {
			       isReference = true;
			    }
			    int functionNameLeft = ((CommonToken)IDENTIFIER65.token).getStartIndex();
			    int functionNameRight = ((CommonToken)IDENTIFIER65.token).getStopIndex() + 1;
			    String functionName = (IDENTIFIER65!=null?IDENTIFIER65.getText():null);
			  
			    int startIndex = METHOD_DECL63.startIndex;
			    int endIndex = METHOD_DECL63.endIndex + 1;
			    int modifierValue = Modifiers.AccDefault;
			      
			    PHPDocBlock docBlock = null;
			    
			    PHPMethodDeclaration methodDeclaration = new PHPMethodDeclaration(startIndex, endIndex, startIndex, endIndex, functionName, modifierValue, null, new Block(startIndex, endIndex, null), isReference.booleanValue(), docBlock);
			    parser.addDeclarationStatement(methodDeclaration);
			    parser.declarations.push(methodDeclaration);
			  
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:574:4: ( parameter_list )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==PARAMETER) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:574:4: parameter_list
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_parameter_list_in_function_declaration_statement658);
					parameter_list66=parameter_list();
					state._fsp--;

					adaptor.addChild(root_1, parameter_list66.getTree());

					}
					break;

			}


			      if ((parameter_list66!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(parameter_list66.start),input.getTreeAdaptor().getTokenStopIndex(parameter_list66.start))):null) != null) {
			        PHPMethodDeclaration functionDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
			        functionDeclaration.acceptArguments((parameter_list66!=null?((TreePHP.parameter_list_return)parameter_list66).parameterList:null));
			      }
			   
			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_block_in_function_declaration_statement671);
			block67=block();
			state._fsp--;

			adaptor.addChild(root_1, block67.getTree());


			    startIndex = ((CommonToken)(block67!=null?((AST)block67.getTree()):null).token).getStartIndex();
			    endIndex = ((CommonToken)(block67!=null?((AST)block67.getTree()):null).token).getStopIndex() + 1;
			        
			    methodDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
			    methodDeclaration.getBody().setStart(startIndex);
			    methodDeclaration.getBody().setEnd(endIndex);
			    methodDeclaration.getBody().getStatements().clear();
			    methodDeclaration.getBody().acceptStatements((block67!=null?((TreePHP.block_return)block67).statList:null));
			        
			    methodDeclaration = (PHPMethodDeclaration)parser.declarations.pop();
			//        if(body instanceof ASTError) {
			//          parser.reportError(new ASTError(methodDeclaration.sourceEnd() - 1, methodDeclaration.sourceEnd()), "syntax error, unfinished method declaration");
			//        }
			//    TypeDeclaration type = (TypeDeclaration)parser.declarations.peek();
			//    methodDeclaration.setDeclaringTypeName(type.getName());
			    retval.stat = methodDeclaration;
			  
			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function_declaration_statement"


	public static class block_return extends TreeRuleReturnScope {
		public Statement stat;
		public List statList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:605:1: block returns [Statement stat, List statList] : ^( BLOCK ( inner_statement_list )? ) ;
	public final TreePHP.block_return block() throws RecognitionException {
		TreePHP.block_return retval = new TreePHP.block_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST BLOCK68=null;
		TreeRuleReturnScope inner_statement_list69 =null;

		AST BLOCK68_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:606:3: ( ^( BLOCK ( inner_statement_list )? ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:606:5: ^( BLOCK ( inner_statement_list )? )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			BLOCK68=(AST)match(input,BLOCK,FOLLOW_BLOCK_in_block706); 
			BLOCK68_tree = (AST)adaptor.dupNode(BLOCK68);


			root_1 = (AST)adaptor.becomeRoot(BLOCK68_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:606:13: ( inner_statement_list )?
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==CLASS_T||LA27_0==INTERFACE_T||LA27_0==METHOD_DECL||LA27_0==STATEMENT||LA27_0==TRAIT_T||LA27_0==183) ) {
					alt27=1;
				}
				switch (alt27) {
					case 1 :
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:606:13: inner_statement_list
						{
						_last = (AST)input.LT(1);
						pushFollow(FOLLOW_inner_statement_list_in_block708);
						inner_statement_list69=inner_statement_list();
						state._fsp--;

						adaptor.addChild(root_1, inner_statement_list69.getTree());

						}
						break;

				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			      int startIndex = BLOCK68.startIndex;
			      int endIndex = BLOCK68.endIndex + 1;
			      Block block = new Block(startIndex, endIndex, new LinkedList());
			      if ((inner_statement_list69!=null?((TreePHP.inner_statement_list_return)inner_statement_list69).innerStatementList:null) != null) {
			        block.getStatements().clear();
			        block.acceptStatements((inner_statement_list69!=null?((TreePHP.inner_statement_list_return)inner_statement_list69).innerStatementList:null));
			        retval.statList = (inner_statement_list69!=null?((TreePHP.inner_statement_list_return)inner_statement_list69).innerStatementList:null);
			      }
			      else {
			        retval.statList = new LinkedList();
			      }
			      retval.stat = block;
			    
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class statement_return extends TreeRuleReturnScope {
		public Statement stat;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:623:1: statement returns [Statement stat] : ^( STATEMENT topStatement ) ;
	public final TreePHP.statement_return statement() throws RecognitionException {
		TreePHP.statement_return retval = new TreePHP.statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST STATEMENT70=null;
		TreeRuleReturnScope topStatement71 =null;

		AST STATEMENT70_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:624:3: ( ^( STATEMENT topStatement ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:624:5: ^( STATEMENT topStatement )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			STATEMENT70=(AST)match(input,STATEMENT,FOLLOW_STATEMENT_in_statement737); 
			STATEMENT70_tree = (AST)adaptor.dupNode(STATEMENT70);


			root_1 = (AST)adaptor.becomeRoot(STATEMENT70_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_topStatement_in_statement739);
			topStatement71=topStatement();
			state._fsp--;

			adaptor.addChild(root_1, topStatement71.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    if ((topStatement71!=null?((TreePHP.topStatement_return)topStatement71).expr:null) != null) {
			//        int startIndex = STATEMENT70.startIndex;
			//        int endIndex = STATEMENT70.endIndex + 1;
			      AST ast = (topStatement71!=null?((AST)topStatement71.start):null);
			      int startIndex = ast.startIndex;
			      int endIndex = ast.endIndex + 1;
			        retval.stat = new ExpressionStatement(startIndex, endIndex, (topStatement71!=null?((TreePHP.topStatement_return)topStatement71).expr:null));
			        quoteExpr = (topStatement71!=null?((TreePHP.topStatement_return)topStatement71).expr:null);
			    }
			    else {
			      retval.stat = (topStatement71!=null?((TreePHP.topStatement_return)topStatement71).stat:null);
			    }
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	protected static class topStatement_scope {
		List declareKey;
		List declareValue;
	}
	protected Stack<topStatement_scope> topStatement_stack = new Stack<topStatement_scope>();

	public static class topStatement_return extends TreeRuleReturnScope {
		public Expression expr;
		public Statement stat;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "topStatement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:641:1: topStatement returns [Expression expr, Statement stat] : ( block | if_stat | ^( WHILE_T ^( CONDITION e= expression ) while_statement ) | ^( DO_T ^( CONDITION e= expression ) statement ) | ^( FOR_T (e1= expr_list )? ^( CONDITION (e2= expr_list )? ) ^( ITERATE (e3= expr_list )? ) s1= for_statement ) | ^( SWITCH_T ^( CONDITION e= expression ) switch_case_list ) | ^( BREAK_T ( expression )? ) | ^( CONTINUE_T (e= expression )? ) | ^( RETURN_T (e= expression )? ) | ^( GLOBAL_T variable_list ) | ^( STATIC_T static_var_list ) | ^( ECHO_T expr_list ) | ^( EMPTYSTATEMENT SEMI_COLON ) | expression | ^( FOREACH_T ^( AS_T e= expression v1= foreach_variable (v2= foreach_variable )? ) foreach_statement ) | ^( DECLARE_T directive declare_statement ) | ^( TRY_T block catch_branch_list ) | ^( THROW_T e= expression ) | ^( USE_T scalar ) | ^( USE_PARETHESIS_T scalar ) | ^( INCLUDE_T e= expression ) | ^( INCLUDE_ONCE_T e= expression ) | ^( REQUIRE_T e= expression ) | ^( REQUIRE_ONCE_T e= expression ) );
	public final TreePHP.topStatement_return topStatement() throws RecognitionException {
		topStatement_stack.push(new topStatement_scope());
		TreePHP.topStatement_return retval = new TreePHP.topStatement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST WHILE_T74=null;
		AST CONDITION75=null;
		AST DO_T77=null;
		AST CONDITION78=null;
		AST FOR_T80=null;
		AST CONDITION81=null;
		AST ITERATE82=null;
		AST SWITCH_T83=null;
		AST CONDITION84=null;
		AST BREAK_T86=null;
		AST CONTINUE_T88=null;
		AST RETURN_T89=null;
		AST GLOBAL_T90=null;
		AST STATIC_T92=null;
		AST ECHO_T94=null;
		AST EMPTYSTATEMENT96=null;
		AST SEMI_COLON97=null;
		AST FOREACH_T99=null;
		AST AS_T100=null;
		AST DECLARE_T102=null;
		AST TRY_T105=null;
		AST THROW_T108=null;
		AST USE_T109=null;
		AST USE_PARETHESIS_T111=null;
		AST INCLUDE_T113=null;
		AST INCLUDE_ONCE_T114=null;
		AST REQUIRE_T115=null;
		AST REQUIRE_ONCE_T116=null;
		TreeRuleReturnScope e =null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;
		TreeRuleReturnScope e3 =null;
		TreeRuleReturnScope s1 =null;
		TreeRuleReturnScope v1 =null;
		TreeRuleReturnScope v2 =null;
		TreeRuleReturnScope block72 =null;
		TreeRuleReturnScope if_stat73 =null;
		TreeRuleReturnScope while_statement76 =null;
		TreeRuleReturnScope statement79 =null;
		TreeRuleReturnScope switch_case_list85 =null;
		TreeRuleReturnScope expression87 =null;
		TreeRuleReturnScope variable_list91 =null;
		TreeRuleReturnScope static_var_list93 =null;
		TreeRuleReturnScope expr_list95 =null;
		TreeRuleReturnScope expression98 =null;
		TreeRuleReturnScope foreach_statement101 =null;
		TreeRuleReturnScope directive103 =null;
		TreeRuleReturnScope declare_statement104 =null;
		TreeRuleReturnScope block106 =null;
		TreeRuleReturnScope catch_branch_list107 =null;
		TreeRuleReturnScope scalar110 =null;
		TreeRuleReturnScope scalar112 =null;

		AST WHILE_T74_tree=null;
		AST CONDITION75_tree=null;
		AST DO_T77_tree=null;
		AST CONDITION78_tree=null;
		AST FOR_T80_tree=null;
		AST CONDITION81_tree=null;
		AST ITERATE82_tree=null;
		AST SWITCH_T83_tree=null;
		AST CONDITION84_tree=null;
		AST BREAK_T86_tree=null;
		AST CONTINUE_T88_tree=null;
		AST RETURN_T89_tree=null;
		AST GLOBAL_T90_tree=null;
		AST STATIC_T92_tree=null;
		AST ECHO_T94_tree=null;
		AST EMPTYSTATEMENT96_tree=null;
		AST SEMI_COLON97_tree=null;
		AST FOREACH_T99_tree=null;
		AST AS_T100_tree=null;
		AST DECLARE_T102_tree=null;
		AST TRY_T105_tree=null;
		AST THROW_T108_tree=null;
		AST USE_T109_tree=null;
		AST USE_PARETHESIS_T111_tree=null;
		AST INCLUDE_T113_tree=null;
		AST INCLUDE_ONCE_T114_tree=null;
		AST REQUIRE_T115_tree=null;
		AST REQUIRE_ONCE_T116_tree=null;


		  topStatement_stack.peek().declareKey = new LinkedList();
		  topStatement_stack.peek().declareValue = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:650:3: ( block | if_stat | ^( WHILE_T ^( CONDITION e= expression ) while_statement ) | ^( DO_T ^( CONDITION e= expression ) statement ) | ^( FOR_T (e1= expr_list )? ^( CONDITION (e2= expr_list )? ) ^( ITERATE (e3= expr_list )? ) s1= for_statement ) | ^( SWITCH_T ^( CONDITION e= expression ) switch_case_list ) | ^( BREAK_T ( expression )? ) | ^( CONTINUE_T (e= expression )? ) | ^( RETURN_T (e= expression )? ) | ^( GLOBAL_T variable_list ) | ^( STATIC_T static_var_list ) | ^( ECHO_T expr_list ) | ^( EMPTYSTATEMENT SEMI_COLON ) | expression | ^( FOREACH_T ^( AS_T e= expression v1= foreach_variable (v2= foreach_variable )? ) foreach_statement ) | ^( DECLARE_T directive declare_statement ) | ^( TRY_T block catch_branch_list ) | ^( THROW_T e= expression ) | ^( USE_T scalar ) | ^( USE_PARETHESIS_T scalar ) | ^( INCLUDE_T e= expression ) | ^( INCLUDE_ONCE_T e= expression ) | ^( REQUIRE_T e= expression ) | ^( REQUIRE_ONCE_T e= expression ) )
			int alt35=24;
			switch ( input.LA(1) ) {
			case BLOCK:
				{
				alt35=1;
				}
				break;
			case IF_T:
				{
				alt35=2;
				}
				break;
			case WHILE_T:
				{
				alt35=3;
				}
				break;
			case DO_T:
				{
				alt35=4;
				}
				break;
			case FOR_T:
				{
				alt35=5;
				}
				break;
			case SWITCH_T:
				{
				alt35=6;
				}
				break;
			case BREAK_T:
				{
				alt35=7;
				}
				break;
			case CONTINUE_T:
				{
				alt35=8;
				}
				break;
			case RETURN_T:
				{
				alt35=9;
				}
				break;
			case GLOBAL_T:
				{
				alt35=10;
				}
				break;
			case STATIC_T:
				{
				alt35=11;
				}
				break;
			case ECHO_T:
				{
				alt35=12;
				}
				break;
			case EMPTYSTATEMENT:
				{
				alt35=13;
				}
				break;
			case AND_T:
			case ARRAY_DECL:
			case AT_T:
			case BACKTRICKLITERAL:
			case BIT_AND_EQ:
			case BIT_OR_EQ:
			case BIT_OR_T:
			case CALL:
			case CAST_EXPR:
			case CLONE_T:
			case DIV_EQ:
			case DIV_T:
			case DOT_EQ:
			case DOT_T:
			case EQUAL_EQUAL_EQUAL_T:
			case EQUAL_EQUAL_T:
			case EQUAL_T:
			case EXPR:
			case INSTANCEOF_T:
			case LE_T:
			case LIST_T:
			case LMOVE_EQ:
			case LOGICAL_AND_T:
			case LOGICAL_OR_T:
			case LSHIFT_T:
			case LT_T:
			case ME_T:
			case MINUS_EQ:
			case MINUS_T:
			case MT_T:
			case MUL_EQ:
			case MUL_T:
			case NEW_T:
			case NOT_EQUAL_EQUAL_T:
			case NOT_EQUAL_T:
			case OR_T:
			case PERCENT_EQ:
			case PERCENT_T:
			case PLUS_EQ:
			case PLUS_T:
			case POSTFIX_EXPR:
			case POWER_EQ:
			case POWER_T:
			case PREFIX_EXPR:
			case PRINT_T:
			case QUESTION_T:
			case REF_T:
			case RMOVE_EQ:
			case RSHIFT_T:
			case SCALAR:
			case UNARY_EXPR:
			case UNSET_T:
			case VAR_DECL:
			case XOR_T:
				{
				alt35=14;
				}
				break;
			case FOREACH_T:
				{
				alt35=15;
				}
				break;
			case DECLARE_T:
				{
				alt35=16;
				}
				break;
			case TRY_T:
				{
				alt35=17;
				}
				break;
			case THROW_T:
				{
				alt35=18;
				}
				break;
			case USE_T:
				{
				alt35=19;
				}
				break;
			case USE_PARETHESIS_T:
				{
				alt35=20;
				}
				break;
			case INCLUDE_T:
				{
				alt35=21;
				}
				break;
			case INCLUDE_ONCE_T:
				{
				alt35=22;
				}
				break;
			case REQUIRE_T:
				{
				alt35=23;
				}
				break;
			case REQUIRE_ONCE_T:
				{
				alt35=24;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:650:5: block
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_block_in_topStatement770);
					block72=block();
					state._fsp--;

					adaptor.addChild(root_0, block72.getTree());


					    retval.stat = (block72!=null?((TreePHP.block_return)block72).stat:null);
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:654:5: if_stat
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_if_stat_in_topStatement781);
					if_stat73=if_stat();
					state._fsp--;

					adaptor.addChild(root_0, if_stat73.getTree());


					    retval.stat = (if_stat73!=null?((TreePHP.if_stat_return)if_stat73).stat:null);
					  
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:658:5: ^( WHILE_T ^( CONDITION e= expression ) while_statement )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					WHILE_T74=(AST)match(input,WHILE_T,FOLLOW_WHILE_T_in_topStatement792); 
					WHILE_T74_tree = (AST)adaptor.dupNode(WHILE_T74);


					root_1 = (AST)adaptor.becomeRoot(WHILE_T74_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					{
					AST _save_last_2 = _last;
					AST _first_2 = null;
					AST root_2 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CONDITION75=(AST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement795); 
					CONDITION75_tree = (AST)adaptor.dupNode(CONDITION75);


					root_2 = (AST)adaptor.becomeRoot(CONDITION75_tree, root_2);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement799);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_2, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_while_statement_in_topStatement802);
					while_statement76=while_statement();
					state._fsp--;

					adaptor.addChild(root_1, while_statement76.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = WHILE_T74.startIndex;
					    int endIndex = WHILE_T74.endIndex + 1;
					    retval.stat = new WhileStatement(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), (while_statement76!=null?((TreePHP.while_statement_return)while_statement76).block:null));   
					  
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:665:5: ^( DO_T ^( CONDITION e= expression ) statement )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					DO_T77=(AST)match(input,DO_T,FOLLOW_DO_T_in_topStatement817); 
					DO_T77_tree = (AST)adaptor.dupNode(DO_T77);


					root_1 = (AST)adaptor.becomeRoot(DO_T77_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					{
					AST _save_last_2 = _last;
					AST _first_2 = null;
					AST root_2 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CONDITION78=(AST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement820); 
					CONDITION78_tree = (AST)adaptor.dupNode(CONDITION78);


					root_2 = (AST)adaptor.becomeRoot(CONDITION78_tree, root_2);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement824);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_2, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_statement_in_topStatement827);
					statement79=statement();
					state._fsp--;

					adaptor.addChild(root_1, statement79.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = DO_T77.startIndex;
					    int endIndex = DO_T77.endIndex + 1;
					    retval.stat = new DoWhileStatement(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), (statement79!=null?((TreePHP.statement_return)statement79).stat:null));      
					  
					}
					break;
				case 5 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:671:5: ^( FOR_T (e1= expr_list )? ^( CONDITION (e2= expr_list )? ) ^( ITERATE (e3= expr_list )? ) s1= for_statement )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					FOR_T80=(AST)match(input,FOR_T,FOLLOW_FOR_T_in_topStatement839); 
					FOR_T80_tree = (AST)adaptor.dupNode(FOR_T80);


					root_1 = (AST)adaptor.becomeRoot(FOR_T80_tree, root_1);

					match(input, Token.DOWN, null); 
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:671:15: (e1= expr_list )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==AND_T||LA28_0==ARRAY_DECL||(LA28_0 >= AT_T && LA28_0 <= BIT_OR_T)||LA28_0==CALL||LA28_0==CAST_EXPR||LA28_0==CLONE_T||(LA28_0 >= DIV_EQ && LA28_0 <= DIV_T)||(LA28_0 >= DOT_EQ && LA28_0 <= DOT_T)||(LA28_0 >= EQUAL_EQUAL_EQUAL_T && LA28_0 <= EQUAL_T)||LA28_0==EXPR||LA28_0==INSTANCEOF_T||LA28_0==LE_T||(LA28_0 >= LIST_T && LA28_0 <= LT_T)||(LA28_0 >= ME_T && LA28_0 <= MINUS_EQ)||(LA28_0 >= MINUS_T && LA28_0 <= MUL_T)||(LA28_0 >= NEW_T && LA28_0 <= NOT_EQUAL_T)||LA28_0==OR_T||(LA28_0 >= PERCENT_EQ && LA28_0 <= PLUS_EQ)||LA28_0==PLUS_T||(LA28_0 >= POSTFIX_EXPR && LA28_0 <= POWER_T)||(LA28_0 >= PREFIX_EXPR && LA28_0 <= PRINT_T)||LA28_0==QUESTION_T||LA28_0==REF_T||(LA28_0 >= RMOVE_EQ && LA28_0 <= SCALAR)||(LA28_0 >= UNARY_EXPR && LA28_0 <= UNSET_T)||LA28_0==VAR_DECL||LA28_0==XOR_T) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:671:15: e1= expr_list
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_expr_list_in_topStatement843);
							e1=expr_list();
							state._fsp--;

							adaptor.addChild(root_1, e1.getTree());

							}
							break;

					}

					_last = (AST)input.LT(1);
					{
					AST _save_last_2 = _last;
					AST _first_2 = null;
					AST root_2 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CONDITION81=(AST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement847); 
					CONDITION81_tree = (AST)adaptor.dupNode(CONDITION81);


					root_2 = (AST)adaptor.becomeRoot(CONDITION81_tree, root_2);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:671:41: (e2= expr_list )?
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==AND_T||LA29_0==ARRAY_DECL||(LA29_0 >= AT_T && LA29_0 <= BIT_OR_T)||LA29_0==CALL||LA29_0==CAST_EXPR||LA29_0==CLONE_T||(LA29_0 >= DIV_EQ && LA29_0 <= DIV_T)||(LA29_0 >= DOT_EQ && LA29_0 <= DOT_T)||(LA29_0 >= EQUAL_EQUAL_EQUAL_T && LA29_0 <= EQUAL_T)||LA29_0==EXPR||LA29_0==INSTANCEOF_T||LA29_0==LE_T||(LA29_0 >= LIST_T && LA29_0 <= LT_T)||(LA29_0 >= ME_T && LA29_0 <= MINUS_EQ)||(LA29_0 >= MINUS_T && LA29_0 <= MUL_T)||(LA29_0 >= NEW_T && LA29_0 <= NOT_EQUAL_T)||LA29_0==OR_T||(LA29_0 >= PERCENT_EQ && LA29_0 <= PLUS_EQ)||LA29_0==PLUS_T||(LA29_0 >= POSTFIX_EXPR && LA29_0 <= POWER_T)||(LA29_0 >= PREFIX_EXPR && LA29_0 <= PRINT_T)||LA29_0==QUESTION_T||LA29_0==REF_T||(LA29_0 >= RMOVE_EQ && LA29_0 <= SCALAR)||(LA29_0 >= UNARY_EXPR && LA29_0 <= UNSET_T)||LA29_0==VAR_DECL||LA29_0==XOR_T) ) {
							alt29=1;
						}
						switch (alt29) {
							case 1 :
								// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:671:41: e2= expr_list
								{
								_last = (AST)input.LT(1);
								pushFollow(FOLLOW_expr_list_in_topStatement851);
								e2=expr_list();
								state._fsp--;

								adaptor.addChild(root_2, e2.getTree());

								}
								break;

						}

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (AST)input.LT(1);
					{
					AST _save_last_2 = _last;
					AST _first_2 = null;
					AST root_2 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					ITERATE82=(AST)match(input,ITERATE,FOLLOW_ITERATE_in_topStatement856); 
					ITERATE82_tree = (AST)adaptor.dupNode(ITERATE82);


					root_2 = (AST)adaptor.becomeRoot(ITERATE82_tree, root_2);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:671:66: (e3= expr_list )?
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==AND_T||LA30_0==ARRAY_DECL||(LA30_0 >= AT_T && LA30_0 <= BIT_OR_T)||LA30_0==CALL||LA30_0==CAST_EXPR||LA30_0==CLONE_T||(LA30_0 >= DIV_EQ && LA30_0 <= DIV_T)||(LA30_0 >= DOT_EQ && LA30_0 <= DOT_T)||(LA30_0 >= EQUAL_EQUAL_EQUAL_T && LA30_0 <= EQUAL_T)||LA30_0==EXPR||LA30_0==INSTANCEOF_T||LA30_0==LE_T||(LA30_0 >= LIST_T && LA30_0 <= LT_T)||(LA30_0 >= ME_T && LA30_0 <= MINUS_EQ)||(LA30_0 >= MINUS_T && LA30_0 <= MUL_T)||(LA30_0 >= NEW_T && LA30_0 <= NOT_EQUAL_T)||LA30_0==OR_T||(LA30_0 >= PERCENT_EQ && LA30_0 <= PLUS_EQ)||LA30_0==PLUS_T||(LA30_0 >= POSTFIX_EXPR && LA30_0 <= POWER_T)||(LA30_0 >= PREFIX_EXPR && LA30_0 <= PRINT_T)||LA30_0==QUESTION_T||LA30_0==REF_T||(LA30_0 >= RMOVE_EQ && LA30_0 <= SCALAR)||(LA30_0 >= UNARY_EXPR && LA30_0 <= UNSET_T)||LA30_0==VAR_DECL||LA30_0==XOR_T) ) {
							alt30=1;
						}
						switch (alt30) {
							case 1 :
								// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:671:66: e3= expr_list
								{
								_last = (AST)input.LT(1);
								pushFollow(FOLLOW_expr_list_in_topStatement860);
								e3=expr_list();
								state._fsp--;

								adaptor.addChild(root_2, e3.getTree());

								}
								break;

						}

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_for_statement_in_topStatement866);
					s1=for_statement();
					state._fsp--;

					adaptor.addChild(root_1, s1.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    List initList = new LinkedList(),
					        condList = new LinkedList(),
					        changeList = new LinkedList();
					    if ((e1!=null?((TreePHP.expr_list_return)e1).exprList:null) != null) initList = (e1!=null?((TreePHP.expr_list_return)e1).exprList:null);
					    if ((e2!=null?((TreePHP.expr_list_return)e2).exprList:null) != null) condList = (e2!=null?((TreePHP.expr_list_return)e2).exprList:null);
					    if ((e3!=null?((TreePHP.expr_list_return)e3).exprList:null) != null) changeList = (e3!=null?((TreePHP.expr_list_return)e3).exprList:null);
					    int startIndex = FOR_T80.startIndex;
					    int endIndex = FOR_T80.endIndex + 1;
					    retval.stat = new ForStatement(startIndex, endIndex, initList, condList, changeList, (s1!=null?((TreePHP.for_statement_return)s1).block:null));
					  
					}
					break;
				case 6 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:683:5: ^( SWITCH_T ^( CONDITION e= expression ) switch_case_list )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					SWITCH_T83=(AST)match(input,SWITCH_T,FOLLOW_SWITCH_T_in_topStatement878); 
					SWITCH_T83_tree = (AST)adaptor.dupNode(SWITCH_T83);


					root_1 = (AST)adaptor.becomeRoot(SWITCH_T83_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					{
					AST _save_last_2 = _last;
					AST _first_2 = null;
					AST root_2 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CONDITION84=(AST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement881); 
					CONDITION84_tree = (AST)adaptor.dupNode(CONDITION84);


					root_2 = (AST)adaptor.becomeRoot(CONDITION84_tree, root_2);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement885);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_2, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_switch_case_list_in_topStatement888);
					switch_case_list85=switch_case_list();
					state._fsp--;

					adaptor.addChild(root_1, switch_case_list85.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = SWITCH_T83.startIndex;
					    int endIndex = SWITCH_T83.endIndex + 1;
					    retval.stat = new SwitchStatement(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), (switch_case_list85!=null?((TreePHP.switch_case_list_return)switch_case_list85).block:null));
					  
					}
					break;
				case 7 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:689:5: ^( BREAK_T ( expression )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					BREAK_T86=(AST)match(input,BREAK_T,FOLLOW_BREAK_T_in_topStatement900); 
					BREAK_T86_tree = (AST)adaptor.dupNode(BREAK_T86);


					root_1 = (AST)adaptor.becomeRoot(BREAK_T86_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:689:15: ( expression )?
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( (LA31_0==AND_T||LA31_0==ARRAY_DECL||(LA31_0 >= AT_T && LA31_0 <= BIT_OR_T)||LA31_0==CALL||LA31_0==CAST_EXPR||LA31_0==CLONE_T||(LA31_0 >= DIV_EQ && LA31_0 <= DIV_T)||(LA31_0 >= DOT_EQ && LA31_0 <= DOT_T)||(LA31_0 >= EQUAL_EQUAL_EQUAL_T && LA31_0 <= EQUAL_T)||LA31_0==EXPR||LA31_0==INSTANCEOF_T||LA31_0==LE_T||(LA31_0 >= LIST_T && LA31_0 <= LT_T)||(LA31_0 >= ME_T && LA31_0 <= MINUS_EQ)||(LA31_0 >= MINUS_T && LA31_0 <= MUL_T)||(LA31_0 >= NEW_T && LA31_0 <= NOT_EQUAL_T)||LA31_0==OR_T||(LA31_0 >= PERCENT_EQ && LA31_0 <= PLUS_EQ)||LA31_0==PLUS_T||(LA31_0 >= POSTFIX_EXPR && LA31_0 <= POWER_T)||(LA31_0 >= PREFIX_EXPR && LA31_0 <= PRINT_T)||LA31_0==QUESTION_T||LA31_0==REF_T||(LA31_0 >= RMOVE_EQ && LA31_0 <= SCALAR)||(LA31_0 >= UNARY_EXPR && LA31_0 <= UNSET_T)||LA31_0==VAR_DECL||LA31_0==XOR_T) ) {
							alt31=1;
						}
						switch (alt31) {
							case 1 :
								// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:689:15: expression
								{
								_last = (AST)input.LT(1);
								pushFollow(FOLLOW_expression_in_topStatement902);
								expression87=expression();
								state._fsp--;

								adaptor.addChild(root_1, expression87.getTree());

								}
								break;

						}

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = BREAK_T86.startIndex;
					    int endIndex = BREAK_T86.endIndex + 1;
					    retval.stat = new BreakStatement(startIndex, endIndex);
					  
					}
					break;
				case 8 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:695:5: ^( CONTINUE_T (e= expression )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CONTINUE_T88=(AST)match(input,CONTINUE_T,FOLLOW_CONTINUE_T_in_topStatement915); 
					CONTINUE_T88_tree = (AST)adaptor.dupNode(CONTINUE_T88);


					root_1 = (AST)adaptor.becomeRoot(CONTINUE_T88_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:695:19: (e= expression )?
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==AND_T||LA32_0==ARRAY_DECL||(LA32_0 >= AT_T && LA32_0 <= BIT_OR_T)||LA32_0==CALL||LA32_0==CAST_EXPR||LA32_0==CLONE_T||(LA32_0 >= DIV_EQ && LA32_0 <= DIV_T)||(LA32_0 >= DOT_EQ && LA32_0 <= DOT_T)||(LA32_0 >= EQUAL_EQUAL_EQUAL_T && LA32_0 <= EQUAL_T)||LA32_0==EXPR||LA32_0==INSTANCEOF_T||LA32_0==LE_T||(LA32_0 >= LIST_T && LA32_0 <= LT_T)||(LA32_0 >= ME_T && LA32_0 <= MINUS_EQ)||(LA32_0 >= MINUS_T && LA32_0 <= MUL_T)||(LA32_0 >= NEW_T && LA32_0 <= NOT_EQUAL_T)||LA32_0==OR_T||(LA32_0 >= PERCENT_EQ && LA32_0 <= PLUS_EQ)||LA32_0==PLUS_T||(LA32_0 >= POSTFIX_EXPR && LA32_0 <= POWER_T)||(LA32_0 >= PREFIX_EXPR && LA32_0 <= PRINT_T)||LA32_0==QUESTION_T||LA32_0==REF_T||(LA32_0 >= RMOVE_EQ && LA32_0 <= SCALAR)||(LA32_0 >= UNARY_EXPR && LA32_0 <= UNSET_T)||LA32_0==VAR_DECL||LA32_0==XOR_T) ) {
							alt32=1;
						}
						switch (alt32) {
							case 1 :
								// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:695:19: e= expression
								{
								_last = (AST)input.LT(1);
								pushFollow(FOLLOW_expression_in_topStatement919);
								e=expression();
								state._fsp--;

								adaptor.addChild(root_1, e.getTree());

								}
								break;

						}

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = CONTINUE_T88.startIndex;
					    int endIndex = CONTINUE_T88.endIndex + 1;
					    retval.stat = new ContinueStatement(startIndex, endIndex);
					    if ((e!=null?((TreePHP.expression_return)e).expr:null) != null) {
					      retval.stat = new ContinueStatement(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null));
					    }
					  
					}
					break;
				case 9 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:704:5: ^( RETURN_T (e= expression )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					RETURN_T89=(AST)match(input,RETURN_T,FOLLOW_RETURN_T_in_topStatement932); 
					RETURN_T89_tree = (AST)adaptor.dupNode(RETURN_T89);


					root_1 = (AST)adaptor.becomeRoot(RETURN_T89_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:704:17: (e= expression )?
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==AND_T||LA33_0==ARRAY_DECL||(LA33_0 >= AT_T && LA33_0 <= BIT_OR_T)||LA33_0==CALL||LA33_0==CAST_EXPR||LA33_0==CLONE_T||(LA33_0 >= DIV_EQ && LA33_0 <= DIV_T)||(LA33_0 >= DOT_EQ && LA33_0 <= DOT_T)||(LA33_0 >= EQUAL_EQUAL_EQUAL_T && LA33_0 <= EQUAL_T)||LA33_0==EXPR||LA33_0==INSTANCEOF_T||LA33_0==LE_T||(LA33_0 >= LIST_T && LA33_0 <= LT_T)||(LA33_0 >= ME_T && LA33_0 <= MINUS_EQ)||(LA33_0 >= MINUS_T && LA33_0 <= MUL_T)||(LA33_0 >= NEW_T && LA33_0 <= NOT_EQUAL_T)||LA33_0==OR_T||(LA33_0 >= PERCENT_EQ && LA33_0 <= PLUS_EQ)||LA33_0==PLUS_T||(LA33_0 >= POSTFIX_EXPR && LA33_0 <= POWER_T)||(LA33_0 >= PREFIX_EXPR && LA33_0 <= PRINT_T)||LA33_0==QUESTION_T||LA33_0==REF_T||(LA33_0 >= RMOVE_EQ && LA33_0 <= SCALAR)||(LA33_0 >= UNARY_EXPR && LA33_0 <= UNSET_T)||LA33_0==VAR_DECL||LA33_0==XOR_T) ) {
							alt33=1;
						}
						switch (alt33) {
							case 1 :
								// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:704:17: e= expression
								{
								_last = (AST)input.LT(1);
								pushFollow(FOLLOW_expression_in_topStatement936);
								e=expression();
								state._fsp--;

								adaptor.addChild(root_1, e.getTree());

								}
								break;

						}

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = RETURN_T89.startIndex;
					    int endIndex = RETURN_T89.endIndex + 1;
					    retval.stat = new ReturnStatement(startIndex, endIndex);
					    if ((e!=null?((TreePHP.expression_return)e).expr:null) != null) {
					      retval.stat = new ReturnStatement(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null));
					    }
					  
					}
					break;
				case 10 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:713:5: ^( GLOBAL_T variable_list )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					GLOBAL_T90=(AST)match(input,GLOBAL_T,FOLLOW_GLOBAL_T_in_topStatement949); 
					GLOBAL_T90_tree = (AST)adaptor.dupNode(GLOBAL_T90);


					root_1 = (AST)adaptor.becomeRoot(GLOBAL_T90_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_variable_list_in_topStatement951);
					variable_list91=variable_list();
					state._fsp--;

					adaptor.addChild(root_1, variable_list91.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = GLOBAL_T90.startIndex;
					    int endIndex = GLOBAL_T90.endIndex + 1;
					    retval.stat = new GlobalStatement(startIndex, endIndex, (variable_list91!=null?((TreePHP.variable_list_return)variable_list91).variableList:null));
					  
					}
					break;
				case 11 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:719:5: ^( STATIC_T static_var_list )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					STATIC_T92=(AST)match(input,STATIC_T,FOLLOW_STATIC_T_in_topStatement963); 
					STATIC_T92_tree = (AST)adaptor.dupNode(STATIC_T92);


					root_1 = (AST)adaptor.becomeRoot(STATIC_T92_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_static_var_list_in_topStatement965);
					static_var_list93=static_var_list();
					state._fsp--;

					adaptor.addChild(root_1, static_var_list93.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = STATIC_T92.startIndex;
					    int endIndex = STATIC_T92.endIndex + 1;
					    retval.stat = new StaticStatement(startIndex, endIndex, (static_var_list93!=null?((TreePHP.static_var_list_return)static_var_list93).staticVarList:null));
					  
					}
					break;
				case 12 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:725:5: ^( ECHO_T expr_list )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					ECHO_T94=(AST)match(input,ECHO_T,FOLLOW_ECHO_T_in_topStatement977); 
					ECHO_T94_tree = (AST)adaptor.dupNode(ECHO_T94);


					root_1 = (AST)adaptor.becomeRoot(ECHO_T94_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expr_list_in_topStatement979);
					expr_list95=expr_list();
					state._fsp--;

					adaptor.addChild(root_1, expr_list95.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = ECHO_T94.startIndex;
					    int endIndex = ECHO_T94.endIndex + 1;
					    retval.stat = new EchoStatement(startIndex, endIndex, (expr_list95!=null?((TreePHP.expr_list_return)expr_list95).exprList:null)); 
					  
					}
					break;
				case 13 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:731:5: ^( EMPTYSTATEMENT SEMI_COLON )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					EMPTYSTATEMENT96=(AST)match(input,EMPTYSTATEMENT,FOLLOW_EMPTYSTATEMENT_in_topStatement991); 
					EMPTYSTATEMENT96_tree = (AST)adaptor.dupNode(EMPTYSTATEMENT96);


					root_1 = (AST)adaptor.becomeRoot(EMPTYSTATEMENT96_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					SEMI_COLON97=(AST)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement993); 
					SEMI_COLON97_tree = (AST)adaptor.dupNode(SEMI_COLON97);


					adaptor.addChild(root_1, SEMI_COLON97_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = EMPTYSTATEMENT96.startIndex;
					    int endIndex = EMPTYSTATEMENT96.endIndex + 1;
					    retval.stat = new EmptyStatement(startIndex, endIndex); 
					  
					}
					break;
				case 14 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:737:5: expression
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement1004);
					expression98=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression98.getTree());


					     retval.expr = (expression98!=null?((TreePHP.expression_return)expression98).expr:null);
					  
					}
					break;
				case 15 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:741:5: ^( FOREACH_T ^( AS_T e= expression v1= foreach_variable (v2= foreach_variable )? ) foreach_statement )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					FOREACH_T99=(AST)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_topStatement1015); 
					FOREACH_T99_tree = (AST)adaptor.dupNode(FOREACH_T99);


					root_1 = (AST)adaptor.becomeRoot(FOREACH_T99_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					{
					AST _save_last_2 = _last;
					AST _first_2 = null;
					AST root_2 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					AS_T100=(AST)match(input,AS_T,FOLLOW_AS_T_in_topStatement1018); 
					AS_T100_tree = (AST)adaptor.dupNode(AS_T100);


					root_2 = (AST)adaptor.becomeRoot(AS_T100_tree, root_2);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement1022);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_2, e.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_foreach_variable_in_topStatement1026);
					v1=foreach_variable();
					state._fsp--;

					adaptor.addChild(root_2, v1.getTree());

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:741:59: (v2= foreach_variable )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==CALL||LA34_0==REF_T||LA34_0==VAR_DECL) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:741:59: v2= foreach_variable
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_foreach_variable_in_topStatement1030);
							v2=foreach_variable();
							state._fsp--;

							adaptor.addChild(root_2, v2.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_foreach_statement_in_topStatement1034);
					foreach_statement101=foreach_statement();
					state._fsp--;

					adaptor.addChild(root_1, foreach_statement101.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = FOREACH_T99.startIndex;
					    int endIndex = FOREACH_T99.endIndex + 1;
					    
					    if ((v2!=null?((TreePHP.foreach_variable_return)v2).expr:null) == null) {
					      retval.stat = new ForEachStatement(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), (v1!=null?((TreePHP.foreach_variable_return)v1).expr:null), (foreach_statement101!=null?((TreePHP.foreach_statement_return)foreach_statement101).block:null));
					    }
					    else {
					      retval.stat = new ForEachStatement(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), (v1!=null?((TreePHP.foreach_variable_return)v1).expr:null), (v2!=null?((TreePHP.foreach_variable_return)v2).expr:null), (foreach_statement101!=null?((TreePHP.foreach_statement_return)foreach_statement101).block:null));
					    }
					  
					}
					break;
				case 16 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:753:5: ^( DECLARE_T directive declare_statement )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					DECLARE_T102=(AST)match(input,DECLARE_T,FOLLOW_DECLARE_T_in_topStatement1047); 
					DECLARE_T102_tree = (AST)adaptor.dupNode(DECLARE_T102);


					root_1 = (AST)adaptor.becomeRoot(DECLARE_T102_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_directive_in_topStatement1049);
					directive103=directive();
					state._fsp--;

					adaptor.addChild(root_1, directive103.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_declare_statement_in_topStatement1051);
					declare_statement104=declare_statement();
					state._fsp--;

					adaptor.addChild(root_1, declare_statement104.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					        int startIndex = DECLARE_T102.startIndex;
					        int endIndex = DECLARE_T102.endIndex + 1;
					        DeclareStatement declare = new DeclareStatement(startIndex, endIndex, topStatement_stack.peek().declareKey, topStatement_stack.peek().declareValue, (declare_statement104!=null?((TreePHP.declare_statement_return)declare_statement104).block:null));
					        retval.stat = declare;
					      
					}
					break;
				case 17 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:760:5: ^( TRY_T block catch_branch_list )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					TRY_T105=(AST)match(input,TRY_T,FOLLOW_TRY_T_in_topStatement1067); 
					TRY_T105_tree = (AST)adaptor.dupNode(TRY_T105);


					root_1 = (AST)adaptor.becomeRoot(TRY_T105_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_block_in_topStatement1069);
					block106=block();
					state._fsp--;

					adaptor.addChild(root_1, block106.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_catch_branch_list_in_topStatement1071);
					catch_branch_list107=catch_branch_list();
					state._fsp--;

					adaptor.addChild(root_1, catch_branch_list107.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = TRY_T105.startIndex;
					    int endIndex = TRY_T105.endIndex + 1;
					    
					    TryStatement tryStatement = new TryStatement(startIndex, endIndex, (Block)(block106!=null?((TreePHP.block_return)block106).stat:null), (catch_branch_list107!=null?((TreePHP.catch_branch_list_return)catch_branch_list107).catchList:null));
					    retval.stat = tryStatement;
					  
					}
					break;
				case 18 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:768:5: ^( THROW_T e= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					THROW_T108=(AST)match(input,THROW_T,FOLLOW_THROW_T_in_topStatement1083); 
					THROW_T108_tree = (AST)adaptor.dupNode(THROW_T108);


					root_1 = (AST)adaptor.becomeRoot(THROW_T108_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement1087);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = THROW_T108.startIndex;
					    int endIndex = THROW_T108.endIndex + 1;
					    retval.stat = new ThrowStatement(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null)); 
					  
					}
					break;
				case 19 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:774:5: ^( USE_T scalar )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					USE_T109=(AST)match(input,USE_T,FOLLOW_USE_T_in_topStatement1099); 
					USE_T109_tree = (AST)adaptor.dupNode(USE_T109);


					root_1 = (AST)adaptor.becomeRoot(USE_T109_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_scalar_in_topStatement1101);
					scalar110=scalar();
					state._fsp--;

					adaptor.addChild(root_1, scalar110.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = USE_T109.startIndex;
					    int endIndex = USE_T109.endIndex;
					    SimpleReference functionName = new SimpleReference(startIndex, startIndex + "use".length(), "use");
					    
					    PHPCallArgumentsList list = new PHPCallArgumentsList((scalar110!=null?((TreePHP.scalar_return)scalar110).expr:null).sourceStart(), (scalar110!=null?((TreePHP.scalar_return)scalar110).expr:null).sourceEnd());
					    list.addNode((scalar110!=null?((TreePHP.scalar_return)scalar110).expr:null));
					    
					    retval.expr = new PHPCallExpression(startIndex, endIndex, null, functionName, list);
					  
					}
					break;
				case 20 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:785:5: ^( USE_PARETHESIS_T scalar )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					USE_PARETHESIS_T111=(AST)match(input,USE_PARETHESIS_T,FOLLOW_USE_PARETHESIS_T_in_topStatement1113); 
					USE_PARETHESIS_T111_tree = (AST)adaptor.dupNode(USE_PARETHESIS_T111);


					root_1 = (AST)adaptor.becomeRoot(USE_PARETHESIS_T111_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_scalar_in_topStatement1115);
					scalar112=scalar();
					state._fsp--;

					adaptor.addChild(root_1, scalar112.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = USE_PARETHESIS_T111.startIndex;
					    int endIndex = USE_PARETHESIS_T111.endIndex;
					    SimpleReference functionName = new SimpleReference(startIndex, startIndex + "use".length(), "use");
					    
					    PHPCallArgumentsList list = new PHPCallArgumentsList((scalar112!=null?((TreePHP.scalar_return)scalar112).expr:null).sourceStart() - 1, (scalar112!=null?((TreePHP.scalar_return)scalar112).expr:null).sourceEnd() + 1);
					    list.addNode((scalar112!=null?((TreePHP.scalar_return)scalar112).expr:null));
					    
					    retval.expr = new PHPCallExpression(startIndex, endIndex, null, functionName, list);
					  
					}
					break;
				case 21 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:796:5: ^( INCLUDE_T e= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					INCLUDE_T113=(AST)match(input,INCLUDE_T,FOLLOW_INCLUDE_T_in_topStatement1127); 
					INCLUDE_T113_tree = (AST)adaptor.dupNode(INCLUDE_T113);


					root_1 = (AST)adaptor.becomeRoot(INCLUDE_T113_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement1131);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = INCLUDE_T113.startIndex;
					    int endIndex = INCLUDE_T113.endIndex;
					    retval.expr = new Include(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), IncludeEnum.INCLUDE);
					  
					}
					break;
				case 22 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:802:5: ^( INCLUDE_ONCE_T e= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					INCLUDE_ONCE_T114=(AST)match(input,INCLUDE_ONCE_T,FOLLOW_INCLUDE_ONCE_T_in_topStatement1144); 
					INCLUDE_ONCE_T114_tree = (AST)adaptor.dupNode(INCLUDE_ONCE_T114);


					root_1 = (AST)adaptor.becomeRoot(INCLUDE_ONCE_T114_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement1148);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = INCLUDE_ONCE_T114.startIndex;
					    int endIndex = INCLUDE_ONCE_T114.endIndex;
					    retval.expr = new Include(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), IncludeEnum.INCLUDE_ONCE);
					  
					}
					break;
				case 23 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:808:5: ^( REQUIRE_T e= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					REQUIRE_T115=(AST)match(input,REQUIRE_T,FOLLOW_REQUIRE_T_in_topStatement1161); 
					REQUIRE_T115_tree = (AST)adaptor.dupNode(REQUIRE_T115);


					root_1 = (AST)adaptor.becomeRoot(REQUIRE_T115_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement1165);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = REQUIRE_T115.startIndex;
					    int endIndex = REQUIRE_T115.endIndex;
					    retval.expr = new Include(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), IncludeEnum.REQUIRE);
					  
					}
					break;
				case 24 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:814:5: ^( REQUIRE_ONCE_T e= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					REQUIRE_ONCE_T116=(AST)match(input,REQUIRE_ONCE_T,FOLLOW_REQUIRE_ONCE_T_in_topStatement1178); 
					REQUIRE_ONCE_T116_tree = (AST)adaptor.dupNode(REQUIRE_ONCE_T116);


					root_1 = (AST)adaptor.becomeRoot(REQUIRE_ONCE_T116_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_topStatement1182);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = REQUIRE_ONCE_T116.startIndex;
					    int endIndex = REQUIRE_ONCE_T116.endIndex;
					    retval.expr = new Include(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), IncludeEnum.REQUIRE_ONCE);
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			topStatement_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "topStatement"


	public static class foreach_variable_return extends TreeRuleReturnScope {
		public Expression expr;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "foreach_variable"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:825:1: foreach_variable returns [Expression expr] : ( REF_T )? variable ;
	public final TreePHP.foreach_variable_return foreach_variable() throws RecognitionException {
		TreePHP.foreach_variable_return retval = new TreePHP.foreach_variable_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST REF_T117=null;
		TreeRuleReturnScope variable118 =null;

		AST REF_T117_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:831:3: ( ( REF_T )? variable )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:831:5: ( REF_T )? variable
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:831:5: ( REF_T )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==REF_T) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:831:5: REF_T
					{
					_last = (AST)input.LT(1);
					REF_T117=(AST)match(input,REF_T,FOLLOW_REF_T_in_foreach_variable1213); 
					REF_T117_tree = (AST)adaptor.dupNode(REF_T117);


					adaptor.addChild(root_0, REF_T117_tree);

					}
					break;

			}

			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_variable_in_foreach_variable1216);
			variable118=variable();
			state._fsp--;

			adaptor.addChild(root_0, variable118.getTree());


			    retval.expr = (variable118!=null?((TreePHP.variable_return)variable118).var:null);
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foreach_variable"


	public static class use_filename_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "use_filename"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:838:1: use_filename : ( STRINGLITERAL | QUOTE_STRING );
	public final TreePHP.use_filename_return use_filename() throws RecognitionException {
		TreePHP.use_filename_return retval = new TreePHP.use_filename_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST set119=null;

		AST set119_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:839:3: ( STRINGLITERAL | QUOTE_STRING )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			set119=(AST)input.LT(1);
			if ( input.LA(1)==STRINGLITERAL||input.LA(1)==QUOTE_STRING ) {
				input.consume();
				set119_tree = (AST)adaptor.dupNode(set119);


				adaptor.addChild(root_0, set119_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "use_filename"


	protected static class variable_list_scope {
		List varList;
	}
	protected Stack<variable_list_scope> variable_list_stack = new Stack<variable_list_scope>();

	public static class variable_list_return extends TreeRuleReturnScope {
		public List variableList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "variable_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:843:1: variable_list returns [List variableList] : ( variable )+ ;
	public final TreePHP.variable_list_return variable_list() throws RecognitionException {
		variable_list_stack.push(new variable_list_scope());
		TreePHP.variable_list_return retval = new TreePHP.variable_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope variable120 =null;



		  variable_list_stack.peek().varList = new LinkedList();
		  inVarList = true;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:854:3: ( ( variable )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:854:5: ( variable )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:854:5: ( variable )+
			int cnt37=0;
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==CALL||LA37_0==VAR_DECL) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:854:5: variable
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_variable_in_variable_list1276);
					variable120=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable120.getTree());

					}
					break;

				default :
					if ( cnt37 >= 1 ) break loop37;
					EarlyExitException eee = new EarlyExitException(37, input);
					throw eee;
				}
				cnt37++;
			}


			    retval.variableList = variable_list_stack.peek().varList;
			    inVarList = false;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);


			  retval.tree = ((AST)retval.start);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			variable_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "variable_list"


	protected static class fully_qualified_class_name_list_scope {
		List nameList;
	}
	protected Stack<fully_qualified_class_name_list_scope> fully_qualified_class_name_list_stack = new Stack<fully_qualified_class_name_list_scope>();

	public static class fully_qualified_class_name_list_return extends TreeRuleReturnScope {
		public List list;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "fully_qualified_class_name_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:861:1: fully_qualified_class_name_list returns [List list] : ( fully_qualified_class_name )+ ;
	public final TreePHP.fully_qualified_class_name_list_return fully_qualified_class_name_list() throws RecognitionException {
		fully_qualified_class_name_list_stack.push(new fully_qualified_class_name_list_scope());
		TreePHP.fully_qualified_class_name_list_return retval = new TreePHP.fully_qualified_class_name_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope fully_qualified_class_name121 =null;



		  fully_qualified_class_name_list_stack.peek().nameList = new LinkedList();
		  inNameList = true;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:872:3: ( ( fully_qualified_class_name )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:872:5: ( fully_qualified_class_name )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:872:5: ( fully_qualified_class_name )+
			int cnt38=0;
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==DOMAIN_T||LA38_0==IDENTIFIER) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:872:5: fully_qualified_class_name
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1314);
					fully_qualified_class_name121=fully_qualified_class_name();
					state._fsp--;

					adaptor.addChild(root_0, fully_qualified_class_name121.getTree());

					}
					break;

				default :
					if ( cnt38 >= 1 ) break loop38;
					EarlyExitException eee = new EarlyExitException(38, input);
					throw eee;
				}
				cnt38++;
			}


			    retval.list = fully_qualified_class_name_list_stack.peek().nameList; 
			    inNameList = false;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);


			  retval.tree = ((AST)retval.start);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			fully_qualified_class_name_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "fully_qualified_class_name_list"


	public static class fully_qualified_class_name_return extends TreeRuleReturnScope {
		public String name;
		public TypeReference type;
		public SimpleReference simpleRef;
		public ConstStaticAccess constant;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "fully_qualified_class_name"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:879:1: fully_qualified_class_name returns [String name, TypeReference type, SimpleReference simpleRef, ConstStaticAccess constant] : ( ^(d= DOMAIN_T f= fully_qualified_class_name IDENTIFIER ) ( DOMAIN_T )? | IDENTIFIER ( DOMAIN_T )? );
	public final TreePHP.fully_qualified_class_name_return fully_qualified_class_name() throws RecognitionException {
		TreePHP.fully_qualified_class_name_return retval = new TreePHP.fully_qualified_class_name_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST d=null;
		AST IDENTIFIER122=null;
		AST DOMAIN_T123=null;
		AST IDENTIFIER124=null;
		AST DOMAIN_T125=null;
		TreeRuleReturnScope f =null;

		AST d_tree=null;
		AST IDENTIFIER122_tree=null;
		AST DOMAIN_T123_tree=null;
		AST IDENTIFIER124_tree=null;
		AST DOMAIN_T125_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:880:3: ( ^(d= DOMAIN_T f= fully_qualified_class_name IDENTIFIER ) ( DOMAIN_T )? | IDENTIFIER ( DOMAIN_T )? )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==DOMAIN_T) ) {
				alt41=1;
			}
			else if ( (LA41_0==IDENTIFIER) ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:880:5: ^(d= DOMAIN_T f= fully_qualified_class_name IDENTIFIER ) ( DOMAIN_T )?
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					d=(AST)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name1341); 
					d_tree = (AST)adaptor.dupNode(d);


					root_1 = (AST)adaptor.becomeRoot(d_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name1345);
					f=fully_qualified_class_name();
					state._fsp--;

					adaptor.addChild(root_1, f.getTree());

					_last = (AST)input.LT(1);
					IDENTIFIER122=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name1347); 
					IDENTIFIER122_tree = (AST)adaptor.dupNode(IDENTIFIER122);


					adaptor.addChild(root_1, IDENTIFIER122_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:880:59: ( DOMAIN_T )?
					int alt39=2;
					int LA39_0 = input.LA(1);
					if ( (LA39_0==DOMAIN_T) ) {
						int LA39_1 = input.LA(2);
						if ( (LA39_1==UP||LA39_1==ARGU||LA39_1==AS_T||LA39_1==CALL||LA39_1==DOMAIN_T||LA39_1==HASH_INDEX||LA39_1==IDENTIFIER||LA39_1==INDEX||LA39_1==TRAIT_T||(LA39_1 >= VAR && LA39_1 <= VAR_DECL)) ) {
							alt39=1;
						}
					}
					switch (alt39) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:880:59: DOMAIN_T
							{
							_last = (AST)input.LT(1);
							DOMAIN_T123=(AST)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name1350); 
							DOMAIN_T123_tree = (AST)adaptor.dupNode(DOMAIN_T123);


							adaptor.addChild(root_0, DOMAIN_T123_tree);

							}
							break;

					}


					    int startIndex = d.startIndex;
					    int endIndex = d.endIndex + 1;
					    String className = null;
					    TypeReference type = null;
					        
					    if ((f!=null?((TreePHP.fully_qualified_class_name_return)f).name:null) != null) {
					      className = (f!=null?((TreePHP.fully_qualified_class_name_return)f).name:null);
					      
					      int typeLeft = ((CommonToken)(f!=null?((AST)f.getTree()):null).token).getStartIndex();
					      int typeRight = ((CommonToken)(f!=null?((AST)f.getTree()):null).token).getStopIndex() + 1;
					      type = new TypeReference(typeLeft, typeRight, className);
					      CommonToken token = (CommonToken)IDENTIFIER122.token;
					      int varLeft = token.getStartIndex();
					      int varRight = token.getStopIndex() + 1;
					      retval.type = type;
					      retval.simpleRef = new SimpleReference(varLeft, varRight, (IDENTIFIER122!=null?IDENTIFIER122.getText():null));
					    }
					    else {
					      type = retval.type;
					    }
					      
					    CommonToken token = (CommonToken)IDENTIFIER122.token;
					    int varLeft = token.getStartIndex();
					    int varRight = token.getStopIndex() + 1;
					    ConstantReference constRef = new ConstantReference(varLeft, varRight, (IDENTIFIER122!=null?IDENTIFIER122.getText():null));
					    retval.constant = new ConstStaticAccess(startIndex, endIndex, type, constRef);
					    
					    if (inNameList) {
					      fully_qualified_class_name_list_stack.peek().nameList.add(type);
					    }
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:913:5: IDENTIFIER ( DOMAIN_T )?
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					IDENTIFIER124=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name1361); 
					IDENTIFIER124_tree = (AST)adaptor.dupNode(IDENTIFIER124);


					adaptor.addChild(root_0, IDENTIFIER124_tree);

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:913:16: ( DOMAIN_T )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==DOMAIN_T) ) {
						int LA40_1 = input.LA(2);
						if ( (LA40_1==UP||LA40_1==ARGU||LA40_1==AS_T||LA40_1==CALL||LA40_1==DOMAIN_T||LA40_1==HASH_INDEX||LA40_1==IDENTIFIER||LA40_1==INDEX||LA40_1==TRAIT_T||(LA40_1 >= VAR && LA40_1 <= VAR_DECL)) ) {
							alt40=1;
						}
					}
					switch (alt40) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:913:16: DOMAIN_T
							{
							_last = (AST)input.LT(1);
							DOMAIN_T125=(AST)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name1363); 
							DOMAIN_T125_tree = (AST)adaptor.dupNode(DOMAIN_T125);


							adaptor.addChild(root_0, DOMAIN_T125_tree);

							}
							break;

					}


					    retval.name = (IDENTIFIER124!=null?IDENTIFIER124.getText():null);
					    int typeLeft = ((CommonToken)IDENTIFIER124.token).getStartIndex();
					    int typeRight = ((CommonToken)IDENTIFIER124.token).getStopIndex() + 1;

					    retval.type = new TypeReference(typeLeft, typeRight, (IDENTIFIER124!=null?IDENTIFIER124.getText():null));
					    
					    if (inNameList) {
					      fully_qualified_class_name_list_stack.peek().nameList.add(retval.type);
					    }
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fully_qualified_class_name"


	protected static class static_var_list_scope {
		List varList;
	}
	protected Stack<static_var_list_scope> static_var_list_stack = new Stack<static_var_list_scope>();

	public static class static_var_list_return extends TreeRuleReturnScope {
		public List staticVarList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "static_var_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:928:1: static_var_list returns [List staticVarList] : ( static_var_element )+ ;
	public final TreePHP.static_var_list_return static_var_list() throws RecognitionException {
		static_var_list_stack.push(new static_var_list_scope());
		TreePHP.static_var_list_return retval = new TreePHP.static_var_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope static_var_element126 =null;



		  static_var_list_stack.peek().varList = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:935:3: ( ( static_var_element )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:935:5: ( static_var_element )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:935:5: ( static_var_element )+
			int cnt42=0;
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==EQUAL_T||LA42_0==VAR_DECL) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:935:5: static_var_element
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_static_var_element_in_static_var_list1397);
					static_var_element126=static_var_element();
					state._fsp--;

					adaptor.addChild(root_0, static_var_element126.getTree());

					}
					break;

				default :
					if ( cnt42 >= 1 ) break loop42;
					EarlyExitException eee = new EarlyExitException(42, input);
					throw eee;
				}
				cnt42++;
			}


			    retval.staticVarList = static_var_list_stack.peek().varList;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			static_var_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "static_var_list"


	public static class static_var_element_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "static_var_element"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:941:1: static_var_element : ( pure_variable | ^( EQUAL_T pure_variable scalar ) );
	public final TreePHP.static_var_element_return static_var_element() throws RecognitionException {
		TreePHP.static_var_element_return retval = new TreePHP.static_var_element_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST EQUAL_T128=null;
		TreeRuleReturnScope pure_variable127 =null;
		TreeRuleReturnScope pure_variable129 =null;
		TreeRuleReturnScope scalar130 =null;

		AST EQUAL_T128_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:942:3: ( pure_variable | ^( EQUAL_T pure_variable scalar ) )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==VAR_DECL) ) {
				alt43=1;
			}
			else if ( (LA43_0==EQUAL_T) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:942:5: pure_variable
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_pure_variable_in_static_var_element1415);
					pure_variable127=pure_variable();
					state._fsp--;

					adaptor.addChild(root_0, pure_variable127.getTree());


					    int varNameLeft = (pure_variable127!=null?((AST)pure_variable127.getTree()):null).startIndex;
					    int varNameRight = (pure_variable127!=null?((AST)pure_variable127.getTree()):null).endIndex + 2;
					    String varName = (pure_variable127!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(pure_variable127.start),input.getTreeAdaptor().getTokenStopIndex(pure_variable127.start))):null);
					    VariableReference varId = new VariableReference(varNameLeft, varNameRight, varName);
					    
					    if (inClassStatementList) {
					      Object obj = new ASTNode[] {varId, null};
					      class_statement_stack.peek().varList.add(obj);
					    }
					    else {
					      static_var_list_stack.peek().varList.add(varId);
					    }
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:957:5: ^( EQUAL_T pure_variable scalar )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					EQUAL_T128=(AST)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_static_var_element1426); 
					EQUAL_T128_tree = (AST)adaptor.dupNode(EQUAL_T128);


					root_1 = (AST)adaptor.becomeRoot(EQUAL_T128_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_pure_variable_in_static_var_element1428);
					pure_variable129=pure_variable();
					state._fsp--;

					adaptor.addChild(root_1, pure_variable129.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_scalar_in_static_var_element1430);
					scalar130=scalar();
					state._fsp--;

					adaptor.addChild(root_1, scalar130.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = EQUAL_T128.startIndex;
					    int endIndex = EQUAL_T128.endIndex + 1;
					    int varNameLeft = (pure_variable129!=null?((AST)pure_variable129.getTree()):null).startIndex;
					    int varNameRight = (pure_variable129!=null?((AST)pure_variable129.getTree()):null).endIndex + 2;
					    String varName = (pure_variable129!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(pure_variable129.start),input.getTreeAdaptor().getTokenStopIndex(pure_variable129.start))):null);
					    Expression expr = (scalar130!=null?((TreePHP.scalar_return)scalar130).expr:null);
					    
					    VariableReference varId = new VariableReference(varNameLeft, varNameRight, varName);

					    Expression assignExpr = new AssignmentExpression(startIndex, endIndex, varId, AssignmentEnum.EQUAL, expr);
					    if (inClassStatementList) {
					      Object obj = new ASTNode[] {varId, expr};
					      class_statement_stack.peek().varList.add(obj);
					    }
					    else {
					      static_var_list_stack.peek().varList.add(assignExpr);
					    }
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "static_var_element"


	protected static class if_stat_scope {
		List conditionList;
		List statementList;
		List tokenList;
	}
	protected Stack<if_stat_scope> if_stat_stack = new Stack<if_stat_scope>();

	public static class if_stat_return extends TreeRuleReturnScope {
		public Statement stat;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "if_stat"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:979:1: if_stat returns [Statement stat] : ^( IF_T ^( CONDITION expression ) ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? ) ) ;
	public final TreePHP.if_stat_return if_stat() throws RecognitionException {
		if_stat_stack.push(new if_stat_scope());
		TreePHP.if_stat_return retval = new TreePHP.if_stat_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST IF_T131=null;
		AST CONDITION132=null;
		AST ELSE_T136=null;
		TreeRuleReturnScope expression133 =null;
		TreeRuleReturnScope inner_statement_list134 =null;
		TreeRuleReturnScope else_if_stat135 =null;
		TreeRuleReturnScope statement137 =null;

		AST IF_T131_tree=null;
		AST CONDITION132_tree=null;
		AST ELSE_T136_tree=null;


		  if_stat_stack.peek().conditionList = new LinkedList();
		  if_stat_stack.peek().statementList = new LinkedList();
		  if_stat_stack.peek().tokenList = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:990:3: ( ^( IF_T ^( CONDITION expression ) ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? ) ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:990:5: ^( IF_T ^( CONDITION expression ) ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? ) )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			IF_T131=(AST)match(input,IF_T,FOLLOW_IF_T_in_if_stat1464); 
			IF_T131_tree = (AST)adaptor.dupNode(IF_T131);


			root_1 = (AST)adaptor.becomeRoot(IF_T131_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (AST)input.LT(1);
			{
			AST _save_last_2 = _last;
			AST _first_2 = null;
			AST root_2 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			CONDITION132=(AST)match(input,CONDITION,FOLLOW_CONDITION_in_if_stat1468); 
			CONDITION132_tree = (AST)adaptor.dupNode(CONDITION132);


			root_2 = (AST)adaptor.becomeRoot(CONDITION132_tree, root_2);

			match(input, Token.DOWN, null); 
			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_expression_in_if_stat1470);
			expression133=expression();
			state._fsp--;

			adaptor.addChild(root_2, expression133.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:991:5: ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:992:7: ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )?
			{
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:992:7: ( inner_statement_list )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==CLASS_T||LA44_0==INTERFACE_T||LA44_0==METHOD_DECL||LA44_0==STATEMENT||LA44_0==TRAIT_T||LA44_0==183) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:992:7: inner_statement_list
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_inner_statement_list_in_if_stat1486);
					inner_statement_list134=inner_statement_list();
					state._fsp--;

					adaptor.addChild(root_1, inner_statement_list134.getTree());

					}
					break;

			}

			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:993:7: ( else_if_stat )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==ELSEIF_T) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:993:7: else_if_stat
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_else_if_stat_in_if_stat1495);
					else_if_stat135=else_if_stat();
					state._fsp--;

					adaptor.addChild(root_1, else_if_stat135.getTree());

					}
					break;

				default :
					break loop45;
				}
			}

			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:993:21: ( ^( ELSE_T statement ) )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==ELSE_T) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:993:22: ^( ELSE_T statement )
					{
					_last = (AST)input.LT(1);
					{
					AST _save_last_2 = _last;
					AST _first_2 = null;
					AST root_2 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					ELSE_T136=(AST)match(input,ELSE_T,FOLLOW_ELSE_T_in_if_stat1500); 
					ELSE_T136_tree = (AST)adaptor.dupNode(ELSE_T136);


					root_2 = (AST)adaptor.becomeRoot(ELSE_T136_tree, root_2);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_statement_in_if_stat1502);
					statement137=statement();
					state._fsp--;

					adaptor.addChild(root_2, statement137.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					}
					break;

			}

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			      int startIndex = IF_T131.startIndex;
			      int endIndex = IF_T131.endIndex + 1;
			      Expression innerCondition = null; 
			      Statement trueStatement = null;
			      Statement falseStatement = (statement137!=null?((TreePHP.statement_return)statement137).stat:null);
			      Iterator iterCond = if_stat_stack.peek().conditionList.iterator(),
			              iterIfTrueStat = if_stat_stack.peek().statementList.iterator(),
			              iterTokenList = if_stat_stack.peek().tokenList.iterator();
			      while (iterCond.hasNext()) {
			         innerCondition = (Expression)iterCond.next();
			         trueStatement = (Statement)iterIfTrueStat.next();
			         int start = (Integer)iterTokenList.next();
			         falseStatement = new IfStatement(start, trueStatement.sourceEnd(), innerCondition, trueStatement, falseStatement);
			      }
			      
			      int sid = ((CommonToken)(inner_statement_list134!=null?((AST)inner_statement_list134.getTree()):null).token).getStartIndex();
			      int eid = ((CommonToken)(inner_statement_list134!=null?((AST)inner_statement_list134.getTree()):null).token).getStopIndex() + 1;
			      Block block = new Block(sid, eid, new LinkedList());
			      if ((inner_statement_list134!=null?((TreePHP.inner_statement_list_return)inner_statement_list134).innerStatementList:null) != null) {
			        block.getStatements().clear();
			        block.acceptStatements((inner_statement_list134!=null?((TreePHP.inner_statement_list_return)inner_statement_list134).innerStatementList:null));
			      }
			      retval.stat = new IfStatement(startIndex, endIndex, (expression133!=null?((TreePHP.expression_return)expression133).expr:null), block, falseStatement);  
			    
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if_stat_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "if_stat"


	public static class else_if_stat_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "else_if_stat"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1022:1: else_if_stat : ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) ;
	public final TreePHP.else_if_stat_return else_if_stat() throws RecognitionException {
		TreePHP.else_if_stat_return retval = new TreePHP.else_if_stat_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST ELSEIF_T138=null;
		AST CONDITION139=null;
		TreeRuleReturnScope expression140 =null;
		TreeRuleReturnScope inner_statement_list141 =null;

		AST ELSEIF_T138_tree=null;
		AST CONDITION139_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1023:3: ( ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1023:5: ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			ELSEIF_T138=(AST)match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_else_if_stat1532); 
			ELSEIF_T138_tree = (AST)adaptor.dupNode(ELSEIF_T138);


			root_1 = (AST)adaptor.becomeRoot(ELSEIF_T138_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (AST)input.LT(1);
			{
			AST _save_last_2 = _last;
			AST _first_2 = null;
			AST root_2 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			CONDITION139=(AST)match(input,CONDITION,FOLLOW_CONDITION_in_else_if_stat1535); 
			CONDITION139_tree = (AST)adaptor.dupNode(CONDITION139);


			root_2 = (AST)adaptor.becomeRoot(CONDITION139_tree, root_2);

			match(input, Token.DOWN, null); 
			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_expression_in_else_if_stat1537);
			expression140=expression();
			state._fsp--;

			adaptor.addChild(root_2, expression140.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_1, root_2);
			_last = _save_last_2;
			}


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1023:40: ( inner_statement_list )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==CLASS_T||LA47_0==INTERFACE_T||LA47_0==METHOD_DECL||LA47_0==STATEMENT||LA47_0==TRAIT_T||LA47_0==183) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1023:40: inner_statement_list
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_inner_statement_list_in_else_if_stat1540);
					inner_statement_list141=inner_statement_list();
					state._fsp--;

					adaptor.addChild(root_1, inner_statement_list141.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    int startIndex = ELSEIF_T138.startIndex;
			    int endIndex = ELSEIF_T138.endIndex;
			    if_stat_stack.peek().conditionList.add((expression140!=null?((TreePHP.expression_return)expression140).expr:null));
			    
			    Block block = new Block(startIndex, endIndex, new LinkedList());
			    if ((inner_statement_list141!=null?((TreePHP.inner_statement_list_return)inner_statement_list141).innerStatementList:null) != null) {
			      block.getStatements().clear();
			      block.acceptStatements((inner_statement_list141!=null?((TreePHP.inner_statement_list_return)inner_statement_list141).innerStatementList:null));
			    }
			    if_stat_stack.peek().statementList.add(block);
			    if_stat_stack.peek().tokenList.add(startIndex);
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "else_if_stat"


	protected static class switch_case_list_scope {
		List list;
	}
	protected Stack<switch_case_list_scope> switch_case_list_stack = new Stack<switch_case_list_scope>();

	public static class switch_case_list_return extends TreeRuleReturnScope {
		public Block block;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "switch_case_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1040:1: switch_case_list returns [Block block] : ( case_list )+ ;
	public final TreePHP.switch_case_list_return switch_case_list() throws RecognitionException {
		switch_case_list_stack.push(new switch_case_list_scope());
		TreePHP.switch_case_list_return retval = new TreePHP.switch_case_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope case_list142 =null;



		  switch_case_list_stack.peek().list = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1047:3: ( ( case_list )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1047:5: ( case_list )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1047:5: ( case_list )+
			int cnt48=0;
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==CASE_T||LA48_0==DEFAULT_T) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1047:5: case_list
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_case_list_in_switch_case_list1574);
					case_list142=case_list();
					state._fsp--;

					adaptor.addChild(root_0, case_list142.getTree());

					}
					break;

				default :
					if ( cnt48 >= 1 ) break loop48;
					EarlyExitException eee = new EarlyExitException(48, input);
					throw eee;
				}
				cnt48++;
			}


			    int startIndex = -1;
			    int endIndex = -1;
			    Block block = new Block(startIndex, endIndex, new LinkedList());
			    block.getStatements().clear();
			    block.acceptStatements(switch_case_list_stack.peek().list);
			    retval.block = block;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			switch_case_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "switch_case_list"


	public static class case_list_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "case_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1058:1: case_list : ( ^( CASE_T e= expression ( inner_statement_list )? ) | ^( DEFAULT_T ( inner_statement_list )? ) );
	public final TreePHP.case_list_return case_list() throws RecognitionException {
		TreePHP.case_list_return retval = new TreePHP.case_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST CASE_T143=null;
		AST DEFAULT_T145=null;
		TreeRuleReturnScope e =null;
		TreeRuleReturnScope inner_statement_list144 =null;
		TreeRuleReturnScope inner_statement_list146 =null;

		AST CASE_T143_tree=null;
		AST DEFAULT_T145_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1059:3: ( ^( CASE_T e= expression ( inner_statement_list )? ) | ^( DEFAULT_T ( inner_statement_list )? ) )
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==CASE_T) ) {
				alt51=1;
			}
			else if ( (LA51_0==DEFAULT_T) ) {
				alt51=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}

			switch (alt51) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1059:5: ^( CASE_T e= expression ( inner_statement_list )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CASE_T143=(AST)match(input,CASE_T,FOLLOW_CASE_T_in_case_list1593); 
					CASE_T143_tree = (AST)adaptor.dupNode(CASE_T143);


					root_1 = (AST)adaptor.becomeRoot(CASE_T143_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_case_list1597);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1059:27: ( inner_statement_list )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==CLASS_T||LA49_0==INTERFACE_T||LA49_0==METHOD_DECL||LA49_0==STATEMENT||LA49_0==TRAIT_T||LA49_0==183) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1059:27: inner_statement_list
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_inner_statement_list_in_case_list1599);
							inner_statement_list144=inner_statement_list();
							state._fsp--;

							adaptor.addChild(root_1, inner_statement_list144.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = CASE_T143.startIndex;
					    int endIndex = CASE_T143.endIndex + 1;
					    List list = new LinkedList();
					    if ((inner_statement_list144!=null?((TreePHP.inner_statement_list_return)inner_statement_list144).innerStatementList:null) != null) {
					      list = (inner_statement_list144!=null?((TreePHP.inner_statement_list_return)inner_statement_list144).innerStatementList:null);
					    }
					    SwitchCase switchCase = new SwitchCase(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), list, false);
					    switch_case_list_stack.peek().list.add(switchCase);
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1070:5: ^( DEFAULT_T ( inner_statement_list )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					DEFAULT_T145=(AST)match(input,DEFAULT_T,FOLLOW_DEFAULT_T_in_case_list1614); 
					DEFAULT_T145_tree = (AST)adaptor.dupNode(DEFAULT_T145);


					root_1 = (AST)adaptor.becomeRoot(DEFAULT_T145_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1070:17: ( inner_statement_list )?
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==CLASS_T||LA50_0==INTERFACE_T||LA50_0==METHOD_DECL||LA50_0==STATEMENT||LA50_0==TRAIT_T||LA50_0==183) ) {
							alt50=1;
						}
						switch (alt50) {
							case 1 :
								// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1070:17: inner_statement_list
								{
								_last = (AST)input.LT(1);
								pushFollow(FOLLOW_inner_statement_list_in_case_list1616);
								inner_statement_list146=inner_statement_list();
								state._fsp--;

								adaptor.addChild(root_1, inner_statement_list146.getTree());

								}
								break;

						}

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = DEFAULT_T145.startIndex;
					    int endIndex = DEFAULT_T145.endIndex + 1;
					    List list = new LinkedList();
					    if ((inner_statement_list146!=null?((TreePHP.inner_statement_list_return)inner_statement_list146).innerStatementList:null) != null) {
					      list = (inner_statement_list146!=null?((TreePHP.inner_statement_list_return)inner_statement_list146).innerStatementList:null);
					    }
					    SwitchCase switchCase = new SwitchCase(startIndex, endIndex, null, list, true);
					    switch_case_list_stack.peek().list.add(switchCase);
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "case_list"


	protected static class catch_branch_list_scope {
		List list;
	}
	protected Stack<catch_branch_list_scope> catch_branch_list_stack = new Stack<catch_branch_list_scope>();

	public static class catch_branch_list_return extends TreeRuleReturnScope {
		public List catchList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "catch_branch_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1083:1: catch_branch_list returns [List catchList] : ( catch_branch )+ ;
	public final TreePHP.catch_branch_list_return catch_branch_list() throws RecognitionException {
		catch_branch_list_stack.push(new catch_branch_list_scope());
		TreePHP.catch_branch_list_return retval = new TreePHP.catch_branch_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope catch_branch147 =null;



		  catch_branch_list_stack.peek().list = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1090:3: ( ( catch_branch )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1090:5: ( catch_branch )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1090:5: ( catch_branch )+
			int cnt52=0;
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==CATCH_T) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1090:5: catch_branch
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_catch_branch_in_catch_branch_list1650);
					catch_branch147=catch_branch();
					state._fsp--;

					adaptor.addChild(root_0, catch_branch147.getTree());

					}
					break;

				default :
					if ( cnt52 >= 1 ) break loop52;
					EarlyExitException eee = new EarlyExitException(52, input);
					throw eee;
				}
				cnt52++;
			}


			    retval.catchList = catch_branch_list_stack.peek().list;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			catch_branch_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "catch_branch_list"


	public static class catch_branch_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "catch_branch"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1096:1: catch_branch : ^( CATCH_T fully_qualified_class_name variable block ) ;
	public final TreePHP.catch_branch_return catch_branch() throws RecognitionException {
		TreePHP.catch_branch_return retval = new TreePHP.catch_branch_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST CATCH_T148=null;
		TreeRuleReturnScope fully_qualified_class_name149 =null;
		TreeRuleReturnScope variable150 =null;
		TreeRuleReturnScope block151 =null;

		AST CATCH_T148_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1097:3: ( ^( CATCH_T fully_qualified_class_name variable block ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1097:5: ^( CATCH_T fully_qualified_class_name variable block )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			CATCH_T148=(AST)match(input,CATCH_T,FOLLOW_CATCH_T_in_catch_branch1672); 
			CATCH_T148_tree = (AST)adaptor.dupNode(CATCH_T148);


			root_1 = (AST)adaptor.becomeRoot(CATCH_T148_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_fully_qualified_class_name_in_catch_branch1674);
			fully_qualified_class_name149=fully_qualified_class_name();
			state._fsp--;

			adaptor.addChild(root_1, fully_qualified_class_name149.getTree());

			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_variable_in_catch_branch1676);
			variable150=variable();
			state._fsp--;

			adaptor.addChild(root_1, variable150.getTree());

			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_block_in_catch_branch1678);
			block151=block();
			state._fsp--;

			adaptor.addChild(root_1, block151.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    int startIndex = CATCH_T148.startIndex;
			    int endIndex = CATCH_T148.endIndex + 1;
			    CatchStatement catchStatement = new CatchStatement(startIndex, endIndex, (fully_qualified_class_name149!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name149).type:null), (VariableReference)(variable150!=null?((TreePHP.variable_return)variable150).var:null), (Block)(block151!=null?((TreePHP.block_return)block151).stat:null));
			    catch_branch_list_stack.peek().list.add(catchStatement);
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "catch_branch"


	public static class for_statement_return extends TreeRuleReturnScope {
		public Statement block;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "for_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1106:1: for_statement returns [Statement block] : ( inner_statement_list )? ;
	public final TreePHP.for_statement_return for_statement() throws RecognitionException {
		TreePHP.for_statement_return retval = new TreePHP.for_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope inner_statement_list152 =null;


		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1107:2: ( ( inner_statement_list )? )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1107:4: ( inner_statement_list )?
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1107:4: ( inner_statement_list )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==CLASS_T||LA53_0==INTERFACE_T||LA53_0==METHOD_DECL||LA53_0==STATEMENT||LA53_0==TRAIT_T||LA53_0==183) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1107:4: inner_statement_list
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_inner_statement_list_in_for_statement1699);
					inner_statement_list152=inner_statement_list();
					state._fsp--;

					adaptor.addChild(root_0, inner_statement_list152.getTree());

					}
					break;

			}


			      int startIndex = -1;
			      int endIndex = -1;
			      Block block = new Block(startIndex, endIndex, new LinkedList());
			      if ((inner_statement_list152!=null?((TreePHP.inner_statement_list_return)inner_statement_list152).innerStatementList:null) != null) {
			        block.getStatements().clear();
			        block.acceptStatements((inner_statement_list152!=null?((TreePHP.inner_statement_list_return)inner_statement_list152).innerStatementList:null));
			      }

			      retval.block = block;
			    
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "for_statement"


	public static class while_statement_return extends TreeRuleReturnScope {
		public Statement block;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "while_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1121:1: while_statement returns [Statement block] : ( inner_statement_list )? ;
	public final TreePHP.while_statement_return while_statement() throws RecognitionException {
		TreePHP.while_statement_return retval = new TreePHP.while_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope inner_statement_list153 =null;


		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1122:3: ( ( inner_statement_list )? )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1122:5: ( inner_statement_list )?
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1122:5: ( inner_statement_list )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==CLASS_T||LA54_0==INTERFACE_T||LA54_0==METHOD_DECL||LA54_0==STATEMENT||LA54_0==TRAIT_T||LA54_0==183) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1122:5: inner_statement_list
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_inner_statement_list_in_while_statement1722);
					inner_statement_list153=inner_statement_list();
					state._fsp--;

					adaptor.addChild(root_0, inner_statement_list153.getTree());

					}
					break;

			}


			      int startIndex = -1;
			      int endIndex = -1;
			      Block block = new Block(startIndex, endIndex, new LinkedList());
			      if ((inner_statement_list153!=null?((TreePHP.inner_statement_list_return)inner_statement_list153).innerStatementList:null) != null) {
			        block.getStatements().clear();
			        block.acceptStatements((inner_statement_list153!=null?((TreePHP.inner_statement_list_return)inner_statement_list153).innerStatementList:null));
			      }
			      retval.block = block;
			    
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "while_statement"


	public static class foreach_statement_return extends TreeRuleReturnScope {
		public Statement block;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "foreach_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1135:1: foreach_statement returns [Statement block] : ( inner_statement_list )? ;
	public final TreePHP.foreach_statement_return foreach_statement() throws RecognitionException {
		TreePHP.foreach_statement_return retval = new TreePHP.foreach_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope inner_statement_list154 =null;


		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1136:3: ( ( inner_statement_list )? )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1136:5: ( inner_statement_list )?
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1136:5: ( inner_statement_list )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==CLASS_T||LA55_0==INTERFACE_T||LA55_0==METHOD_DECL||LA55_0==STATEMENT||LA55_0==TRAIT_T||LA55_0==183) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1136:5: inner_statement_list
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_inner_statement_list_in_foreach_statement1747);
					inner_statement_list154=inner_statement_list();
					state._fsp--;

					adaptor.addChild(root_0, inner_statement_list154.getTree());

					}
					break;

			}


			      int startIndex = -1;
			      int endIndex = -1;
			      Block block = new Block(startIndex, endIndex, new LinkedList());
			      if ((inner_statement_list154!=null?((TreePHP.inner_statement_list_return)inner_statement_list154).innerStatementList:null) != null) {
			        block.getStatements().clear();
			        block.acceptStatements((inner_statement_list154!=null?((TreePHP.inner_statement_list_return)inner_statement_list154).innerStatementList:null));
			      }
			      retval.block = block;
			    
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "foreach_statement"


	public static class declare_statement_return extends TreeRuleReturnScope {
		public Statement block;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "declare_statement"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1149:1: declare_statement returns [Statement block] : ^( BLOCK ( inner_statement_list )? ) ;
	public final TreePHP.declare_statement_return declare_statement() throws RecognitionException {
		TreePHP.declare_statement_return retval = new TreePHP.declare_statement_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST BLOCK155=null;
		TreeRuleReturnScope inner_statement_list156 =null;

		AST BLOCK155_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1150:3: ( ^( BLOCK ( inner_statement_list )? ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1150:5: ^( BLOCK ( inner_statement_list )? )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			BLOCK155=(AST)match(input,BLOCK,FOLLOW_BLOCK_in_declare_statement1774); 
			BLOCK155_tree = (AST)adaptor.dupNode(BLOCK155);


			root_1 = (AST)adaptor.becomeRoot(BLOCK155_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1150:13: ( inner_statement_list )?
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==CLASS_T||LA56_0==INTERFACE_T||LA56_0==METHOD_DECL||LA56_0==STATEMENT||LA56_0==TRAIT_T||LA56_0==183) ) {
					alt56=1;
				}
				switch (alt56) {
					case 1 :
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1150:13: inner_statement_list
						{
						_last = (AST)input.LT(1);
						pushFollow(FOLLOW_inner_statement_list_in_declare_statement1776);
						inner_statement_list156=inner_statement_list();
						state._fsp--;

						adaptor.addChild(root_1, inner_statement_list156.getTree());

						}
						break;

				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			      int startIndex = -1;
			      int endIndex = -1;
			      Block block = new Block(startIndex, endIndex, new LinkedList());
			      if ((inner_statement_list156!=null?((TreePHP.inner_statement_list_return)inner_statement_list156).innerStatementList:null) != null) {
			              block.getStatements().clear();
			              block.acceptStatements((inner_statement_list156!=null?((TreePHP.inner_statement_list_return)inner_statement_list156).innerStatementList:null));
			            }
			            retval.block = block;
			    
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declare_statement"


	protected static class parameter_list_scope {
		List paramList;
	}
	protected Stack<parameter_list_scope> parameter_list_stack = new Stack<parameter_list_scope>();

	public static class parameter_list_return extends TreeRuleReturnScope {
		public List parameterList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "parameter_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1163:1: parameter_list returns [List parameterList] : ( parameter )+ ;
	public final TreePHP.parameter_list_return parameter_list() throws RecognitionException {
		parameter_list_stack.push(new parameter_list_scope());
		TreePHP.parameter_list_return retval = new TreePHP.parameter_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope parameter157 =null;



		  parameter_list_stack.peek().paramList = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1170:3: ( ( parameter )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1170:5: ( parameter )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1170:5: ( parameter )+
			int cnt57=0;
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==PARAMETER) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1170:5: parameter
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_parameter_in_parameter_list1812);
					parameter157=parameter();
					state._fsp--;

					adaptor.addChild(root_0, parameter157.getTree());

					}
					break;

				default :
					if ( cnt57 >= 1 ) break loop57;
					EarlyExitException eee = new EarlyExitException(57, input);
					throw eee;
				}
				cnt57++;
			}


			    retval.parameterList = parameter_list_stack.peek().paramList;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			parameter_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "parameter_list"


	public static class parameter_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "parameter"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1176:1: parameter : ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) ;
	public final TreePHP.parameter_return parameter() throws RecognitionException {
		TreePHP.parameter_return retval = new TreePHP.parameter_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST PARAMETER158=null;
		AST TYPE159=null;
		AST CONST_T161=null;
		TreeRuleReturnScope parameter_type160 =null;
		TreeRuleReturnScope pure_variable162 =null;
		TreeRuleReturnScope scalar163 =null;

		AST PARAMETER158_tree=null;
		AST TYPE159_tree=null;
		AST CONST_T161_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1177:3: ( ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1177:5: ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			PARAMETER158=(AST)match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter1833); 
			PARAMETER158_tree = (AST)adaptor.dupNode(PARAMETER158);


			root_1 = (AST)adaptor.becomeRoot(PARAMETER158_tree, root_1);

			match(input, Token.DOWN, null); 
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1177:17: ( ^( TYPE parameter_type ) )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==TYPE) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1177:18: ^( TYPE parameter_type )
					{
					_last = (AST)input.LT(1);
					{
					AST _save_last_2 = _last;
					AST _first_2 = null;
					AST root_2 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					TYPE159=(AST)match(input,TYPE,FOLLOW_TYPE_in_parameter1837); 
					TYPE159_tree = (AST)adaptor.dupNode(TYPE159);


					root_2 = (AST)adaptor.becomeRoot(TYPE159_tree, root_2);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_parameter_type_in_parameter1839);
					parameter_type160=parameter_type();
					state._fsp--;

					adaptor.addChild(root_2, parameter_type160.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					}
					break;

			}

			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1177:43: ( CONST_T )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==CONST_T) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1177:43: CONST_T
					{
					_last = (AST)input.LT(1);
					CONST_T161=(AST)match(input,CONST_T,FOLLOW_CONST_T_in_parameter1844); 
					CONST_T161_tree = (AST)adaptor.dupNode(CONST_T161);


					adaptor.addChild(root_1, CONST_T161_tree);

					}
					break;

			}

			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_pure_variable_in_parameter1847);
			pure_variable162=pure_variable();
			state._fsp--;

			adaptor.addChild(root_1, pure_variable162.getTree());

			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1177:66: ( scalar )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==SCALAR) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1177:66: scalar
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_scalar_in_parameter1849);
					scalar163=scalar();
					state._fsp--;

					adaptor.addChild(root_1, scalar163.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    FunctionFormalParameter RESULT = null;
			    TypeReference classType = (parameter_type160!=null?((TreePHP.parameter_type_return)parameter_type160).type:null);
			    int varLeft = (pure_variable162!=null?((AST)pure_variable162.getTree()):null).startIndex;
			    int varRight = (pure_variable162!=null?((AST)pure_variable162.getTree()):null).endIndex + 1;
			    String varName = (pure_variable162!=null?((TreePHP.pure_variable_return)pure_variable162).str:null);
			    
			    int startIndex = PARAMETER158.startIndex;
			    int endIndex = PARAMETER158.endIndex + 1;
			    if ((pure_variable162!=null?((TreePHP.pure_variable_return)pure_variable162).isRef:null)) {
			      varLeft++;
			    }
			    VariableReference var = new VariableReference(varLeft, varRight, varName, PHPVariableKind.LOCAL);
			    
			    
			    if ((scalar163!=null?((TreePHP.scalar_return)scalar163).expr:null) == null) {
			      if ((pure_variable162!=null?((TreePHP.pure_variable_return)pure_variable162).isRef:null)) {
			        parameter_list_stack.peek().paramList.add(new FunctionFormalParameterByReference(startIndex, endIndex, classType, var));
			      }
			      else {
			        parameter_list_stack.peek().paramList.add(new FunctionFormalParameter(startIndex, endIndex, classType, var));
			      }
			    }
			    else {
			      if ((pure_variable162!=null?((TreePHP.pure_variable_return)pure_variable162).isRef:null)) {
			        parameter_list_stack.peek().paramList.add(new FunctionFormalParameterByReference(startIndex, endIndex, classType, var, (scalar163!=null?((TreePHP.scalar_return)scalar163).expr:null)));
			      }
			      else {
			        parameter_list_stack.peek().paramList.add(new FunctionFormalParameter(startIndex, endIndex, classType, var, (scalar163!=null?((TreePHP.scalar_return)scalar163).expr:null)));
			      }
			    }
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter"


	public static class parameter_type_return extends TreeRuleReturnScope {
		public TypeReference type;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "parameter_type"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1212:1: parameter_type returns [TypeReference type] : ( fully_qualified_class_name | cast_option );
	public final TreePHP.parameter_type_return parameter_type() throws RecognitionException {
		TreePHP.parameter_type_return retval = new TreePHP.parameter_type_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope fully_qualified_class_name164 =null;
		TreeRuleReturnScope cast_option165 =null;


		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1213:3: ( fully_qualified_class_name | cast_option )
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==DOMAIN_T||LA61_0==IDENTIFIER) ) {
				alt61=1;
			}
			else if ( (LA61_0==CLONE_T||LA61_0==UNSET_T||(LA61_0 >= 185 && LA61_0 <= 188)||(LA61_0 >= 190 && LA61_0 <= 192)||(LA61_0 >= 196 && LA61_0 <= 197)) ) {
				alt61=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}

			switch (alt61) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1213:5: fully_qualified_class_name
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_in_parameter_type1874);
					fully_qualified_class_name164=fully_qualified_class_name();
					state._fsp--;

					adaptor.addChild(root_0, fully_qualified_class_name164.getTree());


					    retval.type = (fully_qualified_class_name164!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name164).type:null);
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1217:5: cast_option
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_cast_option_in_parameter_type1884);
					cast_option165=cast_option();
					state._fsp--;

					adaptor.addChild(root_0, cast_option165.getTree());


					    int startIndex = ((CommonToken)(cast_option165!=null?((AST)cast_option165.getTree()):null).token).getStartIndex();
					    int endIndex = ((CommonToken)(cast_option165!=null?((AST)cast_option165.getTree()):null).token).getStopIndex() + 1;
					    retval.type = new TypeReference(startIndex, endIndex, (cast_option165!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(cast_option165.start),input.getTreeAdaptor().getTokenStopIndex(cast_option165.start))):null));
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameter_type"


	public static class variable_modifiers_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "variable_modifiers"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1225:1: variable_modifiers : ( 'var' | modifier );
	public final TreePHP.variable_modifiers_return variable_modifiers() throws RecognitionException {
		TreePHP.variable_modifiers_return retval = new TreePHP.variable_modifiers_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST string_literal166=null;
		TreeRuleReturnScope modifier167 =null;

		AST string_literal166_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1226:3: ( 'var' | modifier )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==198) ) {
				alt62=1;
			}
			else if ( (LA62_0==STATIC_T||LA62_0==184||LA62_0==189||(LA62_0 >= 193 && LA62_0 <= 195)) ) {
				alt62=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1226:5: 'var'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal166=(AST)match(input,198,FOLLOW_198_in_variable_modifiers1902); 
					string_literal166_tree = (AST)adaptor.dupNode(string_literal166);


					adaptor.addChild(root_0, string_literal166_tree);

					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1227:5: modifier
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_modifier_in_variable_modifiers1908);
					modifier167=modifier();
					state._fsp--;

					adaptor.addChild(root_0, modifier167.getTree());

					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_modifiers"


	protected static class modifier_scope {
		ModifierDocPair m;
	}
	protected Stack<modifier_scope> modifier_stack = new Stack<modifier_scope>();

	public static class modifier_return extends TreeRuleReturnScope {
		public ModifierDocPair modifierVar;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "modifier"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1230:1: modifier returns [ModifierDocPair modifierVar] : ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+ ;
	public final TreePHP.modifier_return modifier() throws RecognitionException {
		modifier_stack.push(new modifier_scope());
		TreePHP.modifier_return retval = new TreePHP.modifier_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST string_literal168=null;
		AST string_literal169=null;
		AST string_literal170=null;
		AST string_literal171=null;
		AST string_literal172=null;
		AST string_literal173=null;

		AST string_literal168_tree=null;
		AST string_literal169_tree=null;
		AST string_literal170_tree=null;
		AST string_literal171_tree=null;
		AST string_literal172_tree=null;
		AST string_literal173_tree=null;


		  modifier_stack.peek().m = new ModifierDocPair(Modifiers.AccDefault, null);

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1237:3: ( ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1237:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1237:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )+
			int cnt63=0;
			loop63:
			while (true) {
				int alt63=7;
				switch ( input.LA(1) ) {
				case 195:
					{
					alt63=1;
					}
					break;
				case 194:
					{
					alt63=2;
					}
					break;
				case 193:
					{
					alt63=3;
					}
					break;
				case STATIC_T:
					{
					alt63=4;
					}
					break;
				case 184:
					{
					alt63=5;
					}
					break;
				case 189:
					{
					alt63=6;
					}
					break;
				}
				switch (alt63) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1237:6: 'public'
					{
					_last = (AST)input.LT(1);
					string_literal168=(AST)match(input,195,FOLLOW_195_in_modifier1936); 
					string_literal168_tree = (AST)adaptor.dupNode(string_literal168);


					adaptor.addChild(root_0, string_literal168_tree);

					modifier_stack.peek().m = new ModifierDocPair(Modifiers.AccPublic, null);
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1238:5: 'protected'
					{
					_last = (AST)input.LT(1);
					string_literal169=(AST)match(input,194,FOLLOW_194_in_modifier1944); 
					string_literal169_tree = (AST)adaptor.dupNode(string_literal169);


					adaptor.addChild(root_0, string_literal169_tree);

					modifier_stack.peek().m = new ModifierDocPair(Modifiers.AccProtected, null);
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1239:5: 'private'
					{
					_last = (AST)input.LT(1);
					string_literal170=(AST)match(input,193,FOLLOW_193_in_modifier1952); 
					string_literal170_tree = (AST)adaptor.dupNode(string_literal170);


					adaptor.addChild(root_0, string_literal170_tree);

					modifier_stack.peek().m = new ModifierDocPair(Modifiers.AccPrivate, null);
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1240:5: 'static'
					{
					_last = (AST)input.LT(1);
					string_literal171=(AST)match(input,STATIC_T,FOLLOW_STATIC_T_in_modifier1960); 
					string_literal171_tree = (AST)adaptor.dupNode(string_literal171);


					adaptor.addChild(root_0, string_literal171_tree);

					modifier_stack.peek().m = new ModifierDocPair(Modifiers.AccStatic, null);
					}
					break;
				case 5 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1241:5: 'abstract'
					{
					_last = (AST)input.LT(1);
					string_literal172=(AST)match(input,184,FOLLOW_184_in_modifier1969); 
					string_literal172_tree = (AST)adaptor.dupNode(string_literal172);


					adaptor.addChild(root_0, string_literal172_tree);

					modifier_stack.peek().m = new ModifierDocPair(Modifiers.AccAbstract, null);
					}
					break;
				case 6 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1242:5: 'final'
					{
					_last = (AST)input.LT(1);
					string_literal173=(AST)match(input,189,FOLLOW_189_in_modifier1978); 
					string_literal173_tree = (AST)adaptor.dupNode(string_literal173);


					adaptor.addChild(root_0, string_literal173_tree);

					modifier_stack.peek().m = new ModifierDocPair(Modifiers.AccFinal, null);
					}
					break;

				default :
					if ( cnt63 >= 1 ) break loop63;
					EarlyExitException eee = new EarlyExitException(63, input);
					throw eee;
				}
				cnt63++;
			}


			    retval.modifierVar = modifier_stack.peek().m;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			modifier_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "modifier"


	public static class directive_return extends TreeRuleReturnScope {
		public Object astNode;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "directive"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1249:1: directive returns [Object astNode] : ^( EQUAL_T IDENTIFIER expression ) ;
	public final TreePHP.directive_return directive() throws RecognitionException {
		TreePHP.directive_return retval = new TreePHP.directive_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST EQUAL_T174=null;
		AST IDENTIFIER175=null;
		TreeRuleReturnScope expression176 =null;

		AST EQUAL_T174_tree=null;
		AST IDENTIFIER175_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1250:3: ( ^( EQUAL_T IDENTIFIER expression ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1250:5: ^( EQUAL_T IDENTIFIER expression )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			EQUAL_T174=(AST)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_directive2010); 
			EQUAL_T174_tree = (AST)adaptor.dupNode(EQUAL_T174);


			root_1 = (AST)adaptor.becomeRoot(EQUAL_T174_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (AST)input.LT(1);
			IDENTIFIER175=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_directive2012); 
			IDENTIFIER175_tree = (AST)adaptor.dupNode(IDENTIFIER175);


			adaptor.addChild(root_1, IDENTIFIER175_tree);

			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_expression_in_directive2014);
			expression176=expression();
			state._fsp--;

			adaptor.addChild(root_1, expression176.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    if (inClassStatementList) {
			        int constNameleft = ((CommonToken)IDENTIFIER175.token).getStartIndex();
			        int constNameright = ((CommonToken)IDENTIFIER175.token).getStopIndex() + 1;
			        String constName = (IDENTIFIER175!=null?IDENTIFIER175.getText():null);
			        int exprLeft = ((CommonToken)((expression176!=null?((AST)expression176.getTree()):null).token)).getStartIndex();
			        int exprRight = ((CommonToken)((expression176!=null?((AST)expression176.getTree()):null).token)).getStopIndex() + 1;
			        Expression expr = (expression176!=null?((TreePHP.expression_return)expression176).expr:null);
			        
			        ConstantReference constId = new ConstantReference(constNameleft, constNameright, constName);
			        Object obj = new ASTNode[]{constId, expr};
			        class_statement_stack.peek().constList.add(obj);
			      }
			      else {
			      topStatement_stack.peek().declareKey.add((IDENTIFIER175!=null?IDENTIFIER175.getText():null));
			      topStatement_stack.peek().declareValue.add((expression176!=null?((TreePHP.expression_return)expression176).expr:null));
			    }
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "directive"


	protected static class expr_list_scope {
		List list;
	}
	protected Stack<expr_list_scope> expr_list_stack = new Stack<expr_list_scope>();

	public static class expr_list_return extends TreeRuleReturnScope {
		public List exprList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "expr_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1271:1: expr_list returns [List exprList] : ( expression )+ ;
	public final TreePHP.expr_list_return expr_list() throws RecognitionException {
		expr_list_stack.push(new expr_list_scope());
		TreePHP.expr_list_return retval = new TreePHP.expr_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope expression177 =null;



		  expr_list_stack.peek().list = new LinkedList();
		  inExprList = true;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1282:2: ( ( expression )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1282:4: ( expression )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1282:4: ( expression )+
			int cnt64=0;
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==AND_T||LA64_0==ARRAY_DECL||(LA64_0 >= AT_T && LA64_0 <= BIT_OR_T)||LA64_0==CALL||LA64_0==CAST_EXPR||LA64_0==CLONE_T||(LA64_0 >= DIV_EQ && LA64_0 <= DIV_T)||(LA64_0 >= DOT_EQ && LA64_0 <= DOT_T)||(LA64_0 >= EQUAL_EQUAL_EQUAL_T && LA64_0 <= EQUAL_T)||LA64_0==EXPR||LA64_0==INSTANCEOF_T||LA64_0==LE_T||(LA64_0 >= LIST_T && LA64_0 <= LT_T)||(LA64_0 >= ME_T && LA64_0 <= MINUS_EQ)||(LA64_0 >= MINUS_T && LA64_0 <= MUL_T)||(LA64_0 >= NEW_T && LA64_0 <= NOT_EQUAL_T)||LA64_0==OR_T||(LA64_0 >= PERCENT_EQ && LA64_0 <= PLUS_EQ)||LA64_0==PLUS_T||(LA64_0 >= POSTFIX_EXPR && LA64_0 <= POWER_T)||(LA64_0 >= PREFIX_EXPR && LA64_0 <= PRINT_T)||LA64_0==QUESTION_T||LA64_0==REF_T||(LA64_0 >= RMOVE_EQ && LA64_0 <= SCALAR)||(LA64_0 >= UNARY_EXPR && LA64_0 <= UNSET_T)||LA64_0==VAR_DECL||LA64_0==XOR_T) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1282:4: expression
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expr_list2051);
					expression177=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression177.getTree());

					}
					break;

				default :
					if ( cnt64 >= 1 ) break loop64;
					EarlyExitException eee = new EarlyExitException(64, input);
					throw eee;
				}
				cnt64++;
			}


			  retval.exprList = expr_list_stack.peek().list;
			 
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);


			  inExprList = false;

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			expr_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "expr_list"


	public static class expression_return extends TreeRuleReturnScope {
		public Expression expr;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1288:1: expression returns [Expression expr] : ( ^( EXPR etop= expression ) | ^( OR_T e1= expression e2= expression ) | ^( XOR_T e1= expression e2= expression ) | ^( AND_T e1= expression e2= expression ) | ^( EQUAL_T e1= expression e2= expression ) | ^( PLUS_EQ e1= expression e2= expression ) | ^( MINUS_EQ e1= expression e2= expression ) | ^( MUL_EQ e1= expression e2= expression ) | ^( DIV_EQ e1= expression e2= expression ) | ^( DOT_EQ e1= expression e2= expression ) | ^( PERCENT_EQ e1= expression e2= expression ) | ^( BIT_AND_EQ e1= expression e2= expression ) | ^( BIT_OR_EQ e1= expression e2= expression ) | ^( POWER_EQ e1= expression e2= expression ) | ^( LMOVE_EQ e1= expression e2= expression ) | ^( RMOVE_EQ e1= expression e2= expression ) | ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) ) | ^( LOGICAL_OR_T e1= expression e2= expression ) | ^( LOGICAL_AND_T e1= expression e2= expression ) | ^( BIT_OR_T e1= expression e2= expression ) | ^( POWER_T e1= expression e2= expression ) | ^( REF_T e1= expression e2= expression ) | ^( UNARY_EXPR unary_symbol_list e= expression ) | ^( DOT_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( LT_T e1= expression e2= expression ) | ^( MT_T e1= expression e2= expression ) | ^( LE_T e1= expression e2= expression ) | ^( ME_T e1= expression e2= expression ) | ^( LSHIFT_T e1= expression e2= expression ) | ^( RSHIFT_T e1= expression e2= expression ) | ^( PLUS_T e1= expression e2= expression ) | ^( MINUS_T e1= expression e2= expression ) | ^( MUL_T e1= expression e2= expression ) | ^( DIV_T e1= expression e2= expression ) | ^( PERCENT_T e1= expression e2= expression ) | ^( CAST_EXPR cast_option e= expression ) | ^( POSTFIX_EXPR e= expression plus_minus ) | ^( PREFIX_EXPR ( plus_minus )+ e= expression ) | ^( INSTANCEOF_T e= expression class_name_reference ) | ( AT_T )? variable | ( AT_T )? scalar | list_decl | ^( ARRAY_DECL ( array_pair_list )? ) | ^( NEW_T class_name_reference ) | ^( CLONE_T variable ) | ^( UNSET_T variable_list ) | BACKTRICKLITERAL | ^( PRINT_T e= expression ) );
	public final TreePHP.expression_return expression() throws RecognitionException {
		TreePHP.expression_return retval = new TreePHP.expression_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST EXPR178=null;
		AST OR_T179=null;
		AST XOR_T180=null;
		AST AND_T181=null;
		AST EQUAL_T182=null;
		AST PLUS_EQ183=null;
		AST MINUS_EQ184=null;
		AST MUL_EQ185=null;
		AST DIV_EQ186=null;
		AST DOT_EQ187=null;
		AST PERCENT_EQ188=null;
		AST BIT_AND_EQ189=null;
		AST BIT_OR_EQ190=null;
		AST POWER_EQ191=null;
		AST LMOVE_EQ192=null;
		AST RMOVE_EQ193=null;
		AST QUESTION_T194=null;
		AST COLON_T195=null;
		AST LOGICAL_OR_T196=null;
		AST LOGICAL_AND_T197=null;
		AST BIT_OR_T198=null;
		AST POWER_T199=null;
		AST REF_T200=null;
		AST UNARY_EXPR201=null;
		AST DOT_T203=null;
		AST EQUAL_EQUAL_T204=null;
		AST NOT_EQUAL_T205=null;
		AST EQUAL_EQUAL_EQUAL_T206=null;
		AST NOT_EQUAL_EQUAL_T207=null;
		AST LT_T208=null;
		AST MT_T209=null;
		AST LE_T210=null;
		AST ME_T211=null;
		AST LSHIFT_T212=null;
		AST RSHIFT_T213=null;
		AST PLUS_T214=null;
		AST MINUS_T215=null;
		AST MUL_T216=null;
		AST DIV_T217=null;
		AST PERCENT_T218=null;
		AST CAST_EXPR219=null;
		AST POSTFIX_EXPR221=null;
		AST PREFIX_EXPR223=null;
		AST INSTANCEOF_T225=null;
		AST AT_T227=null;
		AST AT_T229=null;
		AST ARRAY_DECL232=null;
		AST NEW_T234=null;
		AST CLONE_T236=null;
		AST UNSET_T238=null;
		AST BACKTRICKLITERAL240=null;
		AST PRINT_T241=null;
		TreeRuleReturnScope etop =null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;
		TreeRuleReturnScope e3 =null;
		TreeRuleReturnScope e =null;
		TreeRuleReturnScope unary_symbol_list202 =null;
		TreeRuleReturnScope cast_option220 =null;
		TreeRuleReturnScope plus_minus222 =null;
		TreeRuleReturnScope plus_minus224 =null;
		TreeRuleReturnScope class_name_reference226 =null;
		TreeRuleReturnScope variable228 =null;
		TreeRuleReturnScope scalar230 =null;
		TreeRuleReturnScope list_decl231 =null;
		TreeRuleReturnScope array_pair_list233 =null;
		TreeRuleReturnScope class_name_reference235 =null;
		TreeRuleReturnScope variable237 =null;
		TreeRuleReturnScope variable_list239 =null;

		AST EXPR178_tree=null;
		AST OR_T179_tree=null;
		AST XOR_T180_tree=null;
		AST AND_T181_tree=null;
		AST EQUAL_T182_tree=null;
		AST PLUS_EQ183_tree=null;
		AST MINUS_EQ184_tree=null;
		AST MUL_EQ185_tree=null;
		AST DIV_EQ186_tree=null;
		AST DOT_EQ187_tree=null;
		AST PERCENT_EQ188_tree=null;
		AST BIT_AND_EQ189_tree=null;
		AST BIT_OR_EQ190_tree=null;
		AST POWER_EQ191_tree=null;
		AST LMOVE_EQ192_tree=null;
		AST RMOVE_EQ193_tree=null;
		AST QUESTION_T194_tree=null;
		AST COLON_T195_tree=null;
		AST LOGICAL_OR_T196_tree=null;
		AST LOGICAL_AND_T197_tree=null;
		AST BIT_OR_T198_tree=null;
		AST POWER_T199_tree=null;
		AST REF_T200_tree=null;
		AST UNARY_EXPR201_tree=null;
		AST DOT_T203_tree=null;
		AST EQUAL_EQUAL_T204_tree=null;
		AST NOT_EQUAL_T205_tree=null;
		AST EQUAL_EQUAL_EQUAL_T206_tree=null;
		AST NOT_EQUAL_EQUAL_T207_tree=null;
		AST LT_T208_tree=null;
		AST MT_T209_tree=null;
		AST LE_T210_tree=null;
		AST ME_T211_tree=null;
		AST LSHIFT_T212_tree=null;
		AST RSHIFT_T213_tree=null;
		AST PLUS_T214_tree=null;
		AST MINUS_T215_tree=null;
		AST MUL_T216_tree=null;
		AST DIV_T217_tree=null;
		AST PERCENT_T218_tree=null;
		AST CAST_EXPR219_tree=null;
		AST POSTFIX_EXPR221_tree=null;
		AST PREFIX_EXPR223_tree=null;
		AST INSTANCEOF_T225_tree=null;
		AST AT_T227_tree=null;
		AST AT_T229_tree=null;
		AST ARRAY_DECL232_tree=null;
		AST NEW_T234_tree=null;
		AST CLONE_T236_tree=null;
		AST UNSET_T238_tree=null;
		AST BACKTRICKLITERAL240_tree=null;
		AST PRINT_T241_tree=null;


		  AST ast = null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1297:3: ( ^( EXPR etop= expression ) | ^( OR_T e1= expression e2= expression ) | ^( XOR_T e1= expression e2= expression ) | ^( AND_T e1= expression e2= expression ) | ^( EQUAL_T e1= expression e2= expression ) | ^( PLUS_EQ e1= expression e2= expression ) | ^( MINUS_EQ e1= expression e2= expression ) | ^( MUL_EQ e1= expression e2= expression ) | ^( DIV_EQ e1= expression e2= expression ) | ^( DOT_EQ e1= expression e2= expression ) | ^( PERCENT_EQ e1= expression e2= expression ) | ^( BIT_AND_EQ e1= expression e2= expression ) | ^( BIT_OR_EQ e1= expression e2= expression ) | ^( POWER_EQ e1= expression e2= expression ) | ^( LMOVE_EQ e1= expression e2= expression ) | ^( RMOVE_EQ e1= expression e2= expression ) | ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) ) | ^( LOGICAL_OR_T e1= expression e2= expression ) | ^( LOGICAL_AND_T e1= expression e2= expression ) | ^( BIT_OR_T e1= expression e2= expression ) | ^( POWER_T e1= expression e2= expression ) | ^( REF_T e1= expression e2= expression ) | ^( UNARY_EXPR unary_symbol_list e= expression ) | ^( DOT_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( LT_T e1= expression e2= expression ) | ^( MT_T e1= expression e2= expression ) | ^( LE_T e1= expression e2= expression ) | ^( ME_T e1= expression e2= expression ) | ^( LSHIFT_T e1= expression e2= expression ) | ^( RSHIFT_T e1= expression e2= expression ) | ^( PLUS_T e1= expression e2= expression ) | ^( MINUS_T e1= expression e2= expression ) | ^( MUL_T e1= expression e2= expression ) | ^( DIV_T e1= expression e2= expression ) | ^( PERCENT_T e1= expression e2= expression ) | ^( CAST_EXPR cast_option e= expression ) | ^( POSTFIX_EXPR e= expression plus_minus ) | ^( PREFIX_EXPR ( plus_minus )+ e= expression ) | ^( INSTANCEOF_T e= expression class_name_reference ) | ( AT_T )? variable | ( AT_T )? scalar | list_decl | ^( ARRAY_DECL ( array_pair_list )? ) | ^( NEW_T class_name_reference ) | ^( CLONE_T variable ) | ^( UNSET_T variable_list ) | BACKTRICKLITERAL | ^( PRINT_T e= expression ) )
			int alt69=52;
			switch ( input.LA(1) ) {
			case EXPR:
				{
				alt69=1;
				}
				break;
			case OR_T:
				{
				alt69=2;
				}
				break;
			case XOR_T:
				{
				alt69=3;
				}
				break;
			case AND_T:
				{
				alt69=4;
				}
				break;
			case EQUAL_T:
				{
				alt69=5;
				}
				break;
			case PLUS_EQ:
				{
				alt69=6;
				}
				break;
			case MINUS_EQ:
				{
				alt69=7;
				}
				break;
			case MUL_EQ:
				{
				alt69=8;
				}
				break;
			case DIV_EQ:
				{
				alt69=9;
				}
				break;
			case DOT_EQ:
				{
				alt69=10;
				}
				break;
			case PERCENT_EQ:
				{
				alt69=11;
				}
				break;
			case BIT_AND_EQ:
				{
				alt69=12;
				}
				break;
			case BIT_OR_EQ:
				{
				alt69=13;
				}
				break;
			case POWER_EQ:
				{
				alt69=14;
				}
				break;
			case LMOVE_EQ:
				{
				alt69=15;
				}
				break;
			case RMOVE_EQ:
				{
				alt69=16;
				}
				break;
			case QUESTION_T:
				{
				alt69=17;
				}
				break;
			case LOGICAL_OR_T:
				{
				alt69=18;
				}
				break;
			case LOGICAL_AND_T:
				{
				alt69=19;
				}
				break;
			case BIT_OR_T:
				{
				alt69=20;
				}
				break;
			case POWER_T:
				{
				alt69=21;
				}
				break;
			case REF_T:
				{
				alt69=22;
				}
				break;
			case UNARY_EXPR:
				{
				alt69=23;
				}
				break;
			case DOT_T:
				{
				alt69=24;
				}
				break;
			case EQUAL_EQUAL_T:
				{
				alt69=25;
				}
				break;
			case NOT_EQUAL_T:
				{
				alt69=26;
				}
				break;
			case EQUAL_EQUAL_EQUAL_T:
				{
				alt69=27;
				}
				break;
			case NOT_EQUAL_EQUAL_T:
				{
				alt69=28;
				}
				break;
			case LT_T:
				{
				alt69=29;
				}
				break;
			case MT_T:
				{
				alt69=30;
				}
				break;
			case LE_T:
				{
				alt69=31;
				}
				break;
			case ME_T:
				{
				alt69=32;
				}
				break;
			case LSHIFT_T:
				{
				alt69=33;
				}
				break;
			case RSHIFT_T:
				{
				alt69=34;
				}
				break;
			case PLUS_T:
				{
				alt69=35;
				}
				break;
			case MINUS_T:
				{
				alt69=36;
				}
				break;
			case MUL_T:
				{
				alt69=37;
				}
				break;
			case DIV_T:
				{
				alt69=38;
				}
				break;
			case PERCENT_T:
				{
				alt69=39;
				}
				break;
			case CAST_EXPR:
				{
				alt69=40;
				}
				break;
			case POSTFIX_EXPR:
				{
				alt69=41;
				}
				break;
			case PREFIX_EXPR:
				{
				alt69=42;
				}
				break;
			case INSTANCEOF_T:
				{
				alt69=43;
				}
				break;
			case AT_T:
				{
				int LA69_44 = input.LA(2);
				if ( (LA69_44==CALL||LA69_44==VAR_DECL) ) {
					alt69=44;
				}
				else if ( (LA69_44==SCALAR) ) {
					alt69=45;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 69, 44, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CALL:
			case VAR_DECL:
				{
				alt69=44;
				}
				break;
			case SCALAR:
				{
				alt69=45;
				}
				break;
			case LIST_T:
				{
				alt69=46;
				}
				break;
			case ARRAY_DECL:
				{
				alt69=47;
				}
				break;
			case NEW_T:
				{
				alt69=48;
				}
				break;
			case CLONE_T:
				{
				alt69=49;
				}
				break;
			case UNSET_T:
				{
				alt69=50;
				}
				break;
			case BACKTRICKLITERAL:
				{
				alt69=51;
				}
				break;
			case PRINT_T:
				{
				alt69=52;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1297:5: ^( EXPR etop= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					EXPR178=(AST)match(input,EXPR,FOLLOW_EXPR_in_expression2085); 
					EXPR178_tree = (AST)adaptor.dupNode(EXPR178);


					root_1 = (AST)adaptor.becomeRoot(EXPR178_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2089);
					etop=expression();
					state._fsp--;

					adaptor.addChild(root_1, etop.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    retval.expr = (etop!=null?((TreePHP.expression_return)etop).expr:null);
					    ast = (etop!=null?((AST)etop.getTree()):null);
					    if (inExprList) {
					      expr_list_stack.peek().list.add(retval.expr);
					    }
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1305:5: ^( OR_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					OR_T179=(AST)match(input,OR_T,FOLLOW_OR_T_in_expression2101); 
					OR_T179_tree = (AST)adaptor.dupNode(OR_T179);


					root_1 = (AST)adaptor.becomeRoot(OR_T179_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2105);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2109);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = OR_T179.startIndex;
					    int endIndex = OR_T179.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.STRING_OR, expr2); 
					  
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1313:5: ^( XOR_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					XOR_T180=(AST)match(input,XOR_T,FOLLOW_XOR_T_in_expression2121); 
					XOR_T180_tree = (AST)adaptor.dupNode(XOR_T180);


					root_1 = (AST)adaptor.becomeRoot(XOR_T180_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2125);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2129);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = XOR_T180.startIndex;
					    int endIndex = XOR_T180.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.STRING_XOR, expr2);
					  
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1321:5: ^( AND_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					AND_T181=(AST)match(input,AND_T,FOLLOW_AND_T_in_expression2141); 
					AND_T181_tree = (AST)adaptor.dupNode(AND_T181);


					root_1 = (AST)adaptor.becomeRoot(AND_T181_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2145);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2149);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = AND_T181.startIndex;
					    int endIndex = AND_T181.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.STRING_AND, expr2);
					  
					}
					break;
				case 5 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1329:5: ^( EQUAL_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					EQUAL_T182=(AST)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_expression2161); 
					EQUAL_T182_tree = (AST)adaptor.dupNode(EQUAL_T182);


					root_1 = (AST)adaptor.becomeRoot(EQUAL_T182_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2165);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2169);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = EQUAL_T182.startIndex;
					    int endIndex = EQUAL_T182.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    if ((e2!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e2.start),input.getTreeAdaptor().getTokenStopIndex(e2.start))):null).startsWith("&")) {
					      retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.REF_EQUAL, expr);
					    }
					    else {
					      retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.EQUAL, expr);
					    }
					  
					}
					break;
				case 6 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1342:5: ^( PLUS_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					PLUS_EQ183=(AST)match(input,PLUS_EQ,FOLLOW_PLUS_EQ_in_expression2182); 
					PLUS_EQ183_tree = (AST)adaptor.dupNode(PLUS_EQ183);


					root_1 = (AST)adaptor.becomeRoot(PLUS_EQ183_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2186);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2190);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = PLUS_EQ183.startIndex;
					    int endIndex = PLUS_EQ183.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.PLUS_EQUAL, expr);
					  
					}
					break;
				case 7 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1350:5: ^( MINUS_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					MINUS_EQ184=(AST)match(input,MINUS_EQ,FOLLOW_MINUS_EQ_in_expression2202); 
					MINUS_EQ184_tree = (AST)adaptor.dupNode(MINUS_EQ184);


					root_1 = (AST)adaptor.becomeRoot(MINUS_EQ184_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2206);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2210);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = MINUS_EQ184.startIndex;
					    int endIndex = MINUS_EQ184.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.MINUS_EQUAL, expr);
					  
					}
					break;
				case 8 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1358:5: ^( MUL_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					MUL_EQ185=(AST)match(input,MUL_EQ,FOLLOW_MUL_EQ_in_expression2222); 
					MUL_EQ185_tree = (AST)adaptor.dupNode(MUL_EQ185);


					root_1 = (AST)adaptor.becomeRoot(MUL_EQ185_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2226);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2230);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = MUL_EQ185.startIndex;
					    int endIndex = MUL_EQ185.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.MULT_EQUAL, expr);
					  
					}
					break;
				case 9 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1366:5: ^( DIV_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					DIV_EQ186=(AST)match(input,DIV_EQ,FOLLOW_DIV_EQ_in_expression2242); 
					DIV_EQ186_tree = (AST)adaptor.dupNode(DIV_EQ186);


					root_1 = (AST)adaptor.becomeRoot(DIV_EQ186_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2246);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2250);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = DIV_EQ186.startIndex;
					    int endIndex = DIV_EQ186.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.DIV_EQUAL, expr);
					  
					}
					break;
				case 10 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1374:5: ^( DOT_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					DOT_EQ187=(AST)match(input,DOT_EQ,FOLLOW_DOT_EQ_in_expression2262); 
					DOT_EQ187_tree = (AST)adaptor.dupNode(DOT_EQ187);


					root_1 = (AST)adaptor.becomeRoot(DOT_EQ187_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2266);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2270);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = DOT_EQ187.startIndex;
					    int endIndex = DOT_EQ187.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.CONCAT_EQUAL, expr);
					  
					}
					break;
				case 11 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1382:5: ^( PERCENT_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					PERCENT_EQ188=(AST)match(input,PERCENT_EQ,FOLLOW_PERCENT_EQ_in_expression2282); 
					PERCENT_EQ188_tree = (AST)adaptor.dupNode(PERCENT_EQ188);


					root_1 = (AST)adaptor.becomeRoot(PERCENT_EQ188_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2286);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2290);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = PERCENT_EQ188.startIndex;
					    int endIndex = PERCENT_EQ188.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.MOD_EQUAL, expr);
					  
					}
					break;
				case 12 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1390:5: ^( BIT_AND_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					BIT_AND_EQ189=(AST)match(input,BIT_AND_EQ,FOLLOW_BIT_AND_EQ_in_expression2302); 
					BIT_AND_EQ189_tree = (AST)adaptor.dupNode(BIT_AND_EQ189);


					root_1 = (AST)adaptor.becomeRoot(BIT_AND_EQ189_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2306);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2310);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = BIT_AND_EQ189.startIndex;
					    int endIndex = BIT_AND_EQ189.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.AND_EQUAL, expr);
					  
					}
					break;
				case 13 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1398:5: ^( BIT_OR_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					BIT_OR_EQ190=(AST)match(input,BIT_OR_EQ,FOLLOW_BIT_OR_EQ_in_expression2322); 
					BIT_OR_EQ190_tree = (AST)adaptor.dupNode(BIT_OR_EQ190);


					root_1 = (AST)adaptor.becomeRoot(BIT_OR_EQ190_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2326);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2330);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = BIT_OR_EQ190.startIndex;
					    int endIndex = BIT_OR_EQ190.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.OR_EQUAL, expr);
					  
					}
					break;
				case 14 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1406:5: ^( POWER_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					POWER_EQ191=(AST)match(input,POWER_EQ,FOLLOW_POWER_EQ_in_expression2342); 
					POWER_EQ191_tree = (AST)adaptor.dupNode(POWER_EQ191);


					root_1 = (AST)adaptor.becomeRoot(POWER_EQ191_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2346);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2350);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = POWER_EQ191.startIndex;
					    int endIndex = POWER_EQ191.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.XOR_EQUAL, expr);
					  
					}
					break;
				case 15 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1414:5: ^( LMOVE_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					LMOVE_EQ192=(AST)match(input,LMOVE_EQ,FOLLOW_LMOVE_EQ_in_expression2362); 
					LMOVE_EQ192_tree = (AST)adaptor.dupNode(LMOVE_EQ192);


					root_1 = (AST)adaptor.becomeRoot(LMOVE_EQ192_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2366);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2370);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = LMOVE_EQ192.startIndex;
					    int endIndex = LMOVE_EQ192.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.LSHIFT_EQUAL, expr);
					  
					}
					break;
				case 16 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1422:5: ^( RMOVE_EQ e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					RMOVE_EQ193=(AST)match(input,RMOVE_EQ,FOLLOW_RMOVE_EQ_in_expression2382); 
					RMOVE_EQ193_tree = (AST)adaptor.dupNode(RMOVE_EQ193);


					root_1 = (AST)adaptor.becomeRoot(RMOVE_EQ193_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2386);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2390);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = RMOVE_EQ193.startIndex;
					    int endIndex = RMOVE_EQ193.endIndex + 1;
					    Expression var = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new AssignmentExpression(startIndex, endIndex, var, AssignmentEnum.RSHIFT_EQUAL, expr);
					  
					}
					break;
				case 17 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1430:5: ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					QUESTION_T194=(AST)match(input,QUESTION_T,FOLLOW_QUESTION_T_in_expression2402); 
					QUESTION_T194_tree = (AST)adaptor.dupNode(QUESTION_T194);


					root_1 = (AST)adaptor.becomeRoot(QUESTION_T194_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2406);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					{
					AST _save_last_2 = _last;
					AST _first_2 = null;
					AST root_2 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					COLON_T195=(AST)match(input,COLON_T,FOLLOW_COLON_T_in_expression2409); 
					COLON_T195_tree = (AST)adaptor.dupNode(COLON_T195);


					root_2 = (AST)adaptor.becomeRoot(COLON_T195_tree, root_2);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2413);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_2, e2.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2417);
					e3=expression();
					state._fsp--;

					adaptor.addChild(root_2, e3.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_1, root_2);
					_last = _save_last_2;
					}


					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = QUESTION_T194.startIndex;
					    int endIndex = QUESTION_T194.endIndex + 1;
					    retval.expr = new ConditionalExpression(startIndex, endIndex, (e1!=null?((TreePHP.expression_return)e1).expr:null), (e2!=null?((TreePHP.expression_return)e2).expr:null), (e3!=null?((TreePHP.expression_return)e3).expr:null)); 
					  
					}
					break;
				case 18 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1436:5: ^( LOGICAL_OR_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					LOGICAL_OR_T196=(AST)match(input,LOGICAL_OR_T,FOLLOW_LOGICAL_OR_T_in_expression2432); 
					LOGICAL_OR_T196_tree = (AST)adaptor.dupNode(LOGICAL_OR_T196);


					root_1 = (AST)adaptor.becomeRoot(LOGICAL_OR_T196_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2436);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2440);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = LOGICAL_OR_T196.startIndex;
					    int endIndex = LOGICAL_OR_T196.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.BOOL_OR, expr2); 
					  
					}
					break;
				case 19 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1444:5: ^( LOGICAL_AND_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					LOGICAL_AND_T197=(AST)match(input,LOGICAL_AND_T,FOLLOW_LOGICAL_AND_T_in_expression2452); 
					LOGICAL_AND_T197_tree = (AST)adaptor.dupNode(LOGICAL_AND_T197);


					root_1 = (AST)adaptor.becomeRoot(LOGICAL_AND_T197_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2456);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2460);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = LOGICAL_AND_T197.startIndex;
					    int endIndex = LOGICAL_AND_T197.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.BOOL_AND, expr2);
					  
					}
					break;
				case 20 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1452:5: ^( BIT_OR_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					BIT_OR_T198=(AST)match(input,BIT_OR_T,FOLLOW_BIT_OR_T_in_expression2472); 
					BIT_OR_T198_tree = (AST)adaptor.dupNode(BIT_OR_T198);


					root_1 = (AST)adaptor.becomeRoot(BIT_OR_T198_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2476);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2480);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = BIT_OR_T198.startIndex;
					    int endIndex = BIT_OR_T198.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.OR, expr2); 
					  
					}
					break;
				case 21 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1460:5: ^( POWER_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					POWER_T199=(AST)match(input,POWER_T,FOLLOW_POWER_T_in_expression2492); 
					POWER_T199_tree = (AST)adaptor.dupNode(POWER_T199);


					root_1 = (AST)adaptor.becomeRoot(POWER_T199_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2496);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2500);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = POWER_T199.startIndex;
					    int endIndex = POWER_T199.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.XOR, expr2); 
					  
					}
					break;
				case 22 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1468:5: ^( REF_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					REF_T200=(AST)match(input,REF_T,FOLLOW_REF_T_in_expression2512); 
					REF_T200_tree = (AST)adaptor.dupNode(REF_T200);


					root_1 = (AST)adaptor.becomeRoot(REF_T200_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2516);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2520);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = REF_T200.startIndex;
					    int endIndex = REF_T200.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					//    if (expr2 != null) {
					      retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.AND, expr2);
					//    }
					//    else {
					//      retval.expr = new ReferenceExpression(startIndex, endIndex, expr1);
					//    }
					  
					}
					break;
				case 23 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1481:5: ^( UNARY_EXPR unary_symbol_list e= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					UNARY_EXPR201=(AST)match(input,UNARY_EXPR,FOLLOW_UNARY_EXPR_in_expression2532); 
					UNARY_EXPR201_tree = (AST)adaptor.dupNode(UNARY_EXPR201);


					root_1 = (AST)adaptor.becomeRoot(UNARY_EXPR201_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_unary_symbol_list_in_expression2534);
					unary_symbol_list202=unary_symbol_list();
					state._fsp--;

					adaptor.addChild(root_1, unary_symbol_list202.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2538);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    Iterator iter = (unary_symbol_list202!=null?((TreePHP.unary_symbol_list_return)unary_symbol_list202).symbolList:null).iterator();
					    int symbolIndex;
					    int startIndex = UNARY_EXPR201.startIndex + (unary_symbol_list202!=null?((TreePHP.unary_symbol_list_return)unary_symbol_list202).symbolList:null).size() - 1;
					    int endIndex = UNARY_EXPR201.endIndex + 1;
					    retval.expr = (e!=null?((TreePHP.expression_return)e).expr:null);
					    while (iter.hasNext()) {
					      symbolIndex = (Integer)iter.next();
					      switch(symbolIndex) {
					        case 1:
					          retval.expr = new UnaryOperation(startIndex--, endIndex, retval.expr, UnaryOperationEnum.UOP_PLUS);
					          break;
					        case 2:
					          retval.expr = new UnaryOperation(startIndex--, endIndex, retval.expr, UnaryOperationEnum.UOP_MINUS);
					          break;
					        case 3:
					          if (retval.expr instanceof VariableReference) {
					            retval.expr = new ReferenceExpression(startIndex--, endIndex, retval.expr);
					          }
					          break;
					        case 4:
					          retval.expr = new UnaryOperation(startIndex--, endIndex, retval.expr, UnaryOperationEnum.UOP_TILDA);
					          break;
					        case 5:
					          retval.expr = new UnaryOperation(startIndex--, endIndex, retval.expr, UnaryOperationEnum.UOP_BANG);
					          break;
					        default:
					          break;
					      }
					    }
					  
					}
					break;
				case 24 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1513:5: ^( DOT_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					DOT_T203=(AST)match(input,DOT_T,FOLLOW_DOT_T_in_expression2550); 
					DOT_T203_tree = (AST)adaptor.dupNode(DOT_T203);


					root_1 = (AST)adaptor.becomeRoot(DOT_T203_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2554);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2558);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = DOT_T203.startIndex;
					    int endIndex = DOT_T203.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.CONCAT, expr2); 
					  
					}
					break;
				case 25 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1521:5: ^( EQUAL_EQUAL_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					EQUAL_EQUAL_T204=(AST)match(input,EQUAL_EQUAL_T,FOLLOW_EQUAL_EQUAL_T_in_expression2570); 
					EQUAL_EQUAL_T204_tree = (AST)adaptor.dupNode(EQUAL_EQUAL_T204);


					root_1 = (AST)adaptor.becomeRoot(EQUAL_EQUAL_T204_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2574);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2578);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = EQUAL_EQUAL_T204.startIndex;
					    int endIndex = EQUAL_EQUAL_T204.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.IS_EQUAL, expr2);
					  
					}
					break;
				case 26 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1529:5: ^( NOT_EQUAL_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					NOT_EQUAL_T205=(AST)match(input,NOT_EQUAL_T,FOLLOW_NOT_EQUAL_T_in_expression2590); 
					NOT_EQUAL_T205_tree = (AST)adaptor.dupNode(NOT_EQUAL_T205);


					root_1 = (AST)adaptor.becomeRoot(NOT_EQUAL_T205_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2594);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2598);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = NOT_EQUAL_T205.startIndex;
					    int endIndex = NOT_EQUAL_T205.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.IS_NOT_EQUAL, expr2);
					  
					}
					break;
				case 27 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1537:5: ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					EQUAL_EQUAL_EQUAL_T206=(AST)match(input,EQUAL_EQUAL_EQUAL_T,FOLLOW_EQUAL_EQUAL_EQUAL_T_in_expression2610); 
					EQUAL_EQUAL_EQUAL_T206_tree = (AST)adaptor.dupNode(EQUAL_EQUAL_EQUAL_T206);


					root_1 = (AST)adaptor.becomeRoot(EQUAL_EQUAL_EQUAL_T206_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2614);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2618);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = EQUAL_EQUAL_EQUAL_T206.startIndex;
					    int endIndex = EQUAL_EQUAL_EQUAL_T206.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.IS_IDENTICAL, expr2);
					  
					}
					break;
				case 28 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1545:5: ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					NOT_EQUAL_EQUAL_T207=(AST)match(input,NOT_EQUAL_EQUAL_T,FOLLOW_NOT_EQUAL_EQUAL_T_in_expression2630); 
					NOT_EQUAL_EQUAL_T207_tree = (AST)adaptor.dupNode(NOT_EQUAL_EQUAL_T207);


					root_1 = (AST)adaptor.becomeRoot(NOT_EQUAL_EQUAL_T207_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2634);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2638);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = NOT_EQUAL_EQUAL_T207.startIndex;
					    int endIndex = NOT_EQUAL_EQUAL_T207.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.IS_NOT_IDENTICAL, expr2);
					  
					}
					break;
				case 29 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1553:5: ^( LT_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					LT_T208=(AST)match(input,LT_T,FOLLOW_LT_T_in_expression2650); 
					LT_T208_tree = (AST)adaptor.dupNode(LT_T208);


					root_1 = (AST)adaptor.becomeRoot(LT_T208_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2654);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2658);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = LT_T208.startIndex;
					    int endIndex = LT_T208.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.LESS_THAN, expr2); 
					  
					}
					break;
				case 30 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1561:5: ^( MT_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					MT_T209=(AST)match(input,MT_T,FOLLOW_MT_T_in_expression2670); 
					MT_T209_tree = (AST)adaptor.dupNode(MT_T209);


					root_1 = (AST)adaptor.becomeRoot(MT_T209_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2674);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2678);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = MT_T209.startIndex;
					    int endIndex = MT_T209.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.GREATER_THAN, expr2); 
					  
					}
					break;
				case 31 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1569:5: ^( LE_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					LE_T210=(AST)match(input,LE_T,FOLLOW_LE_T_in_expression2690); 
					LE_T210_tree = (AST)adaptor.dupNode(LE_T210);


					root_1 = (AST)adaptor.becomeRoot(LE_T210_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2694);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2698);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = LE_T210.startIndex;
					    int endIndex = LE_T210.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.LESS_EQUAL, expr2); 
					  
					}
					break;
				case 32 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1577:5: ^( ME_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					ME_T211=(AST)match(input,ME_T,FOLLOW_ME_T_in_expression2710); 
					ME_T211_tree = (AST)adaptor.dupNode(ME_T211);


					root_1 = (AST)adaptor.becomeRoot(ME_T211_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2714);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2718);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = ME_T211.startIndex;
					    int endIndex = ME_T211.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixEnum.GREATER_EQUAL, expr2); 
					  
					}
					break;
				case 33 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1585:5: ^( LSHIFT_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					LSHIFT_T212=(AST)match(input,LSHIFT_T,FOLLOW_LSHIFT_T_in_expression2730); 
					LSHIFT_T212_tree = (AST)adaptor.dupNode(LSHIFT_T212);


					root_1 = (AST)adaptor.becomeRoot(LSHIFT_T212_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2734);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2738);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = LSHIFT_T212.startIndex;
					    int endIndex = LSHIFT_T212.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixEnum.LSHIFT, expr2); 
					  
					}
					break;
				case 34 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1593:5: ^( RSHIFT_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					RSHIFT_T213=(AST)match(input,RSHIFT_T,FOLLOW_RSHIFT_T_in_expression2750); 
					RSHIFT_T213_tree = (AST)adaptor.dupNode(RSHIFT_T213);


					root_1 = (AST)adaptor.becomeRoot(RSHIFT_T213_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2754);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2758);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = RSHIFT_T213.startIndex;
					    int endIndex = RSHIFT_T213.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixEnum.RSHIFT, expr2); 
					  
					}
					break;
				case 35 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1601:5: ^( PLUS_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					PLUS_T214=(AST)match(input,PLUS_T,FOLLOW_PLUS_T_in_expression2770); 
					PLUS_T214_tree = (AST)adaptor.dupNode(PLUS_T214);


					root_1 = (AST)adaptor.becomeRoot(PLUS_T214_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2774);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2778);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = PLUS_T214.startIndex;
					    int endIndex = PLUS_T214.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					//    if (expr2 != null) {
					      retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixEnum.PLUS, expr2);
					//    }
					//    else {
					//      retval.expr = new UnaryOperation(startIndex, endIndex, (e1!=null?((TreePHP.expression_return)e1).expr:null) , UnaryOperationEnum.UOP_PLUS);
					//    }
					  
					}
					break;
				case 36 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1614:5: ^( MINUS_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					MINUS_T215=(AST)match(input,MINUS_T,FOLLOW_MINUS_T_in_expression2790); 
					MINUS_T215_tree = (AST)adaptor.dupNode(MINUS_T215);


					root_1 = (AST)adaptor.becomeRoot(MINUS_T215_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2794);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2798);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = MINUS_T215.startIndex;
					    int endIndex = MINUS_T215.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					//    if (expr2 != null) {
					      retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixEnum.MINUS, expr2);
					//    }
					//    else {
					//      retval.expr = new UnaryOperation(startIndex, endIndex, (e1!=null?((TreePHP.expression_return)e1).expr:null) , UnaryOperationEnum.UOP_MINUS);
					//    }
					  
					}
					break;
				case 37 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1627:5: ^( MUL_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					MUL_T216=(AST)match(input,MUL_T,FOLLOW_MUL_T_in_expression2810); 
					MUL_T216_tree = (AST)adaptor.dupNode(MUL_T216);


					root_1 = (AST)adaptor.becomeRoot(MUL_T216_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2814);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2818);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = MUL_T216.startIndex;
					    int endIndex = MUL_T216.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixEnum.MULT, expr2);
					  
					}
					break;
				case 38 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1635:5: ^( DIV_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					DIV_T217=(AST)match(input,DIV_T,FOLLOW_DIV_T_in_expression2830); 
					DIV_T217_tree = (AST)adaptor.dupNode(DIV_T217);


					root_1 = (AST)adaptor.becomeRoot(DIV_T217_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2834);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2838);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = DIV_T217.startIndex;
					    int endIndex = DIV_T217.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixEnum.DIV, expr2);
					  
					}
					break;
				case 39 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1643:5: ^( PERCENT_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					PERCENT_T218=(AST)match(input,PERCENT_T,FOLLOW_PERCENT_T_in_expression2850); 
					PERCENT_T218_tree = (AST)adaptor.dupNode(PERCENT_T218);


					root_1 = (AST)adaptor.becomeRoot(PERCENT_T218_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2854);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2858);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = PERCENT_T218.startIndex;
					    int endIndex = PERCENT_T218.endIndex + 1;
					    Expression expr1 = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression expr2 = (e2!=null?((TreePHP.expression_return)e2).expr:null);
					    retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixEnum.MOD, expr2);
					  
					}
					break;
				case 40 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1651:5: ^( CAST_EXPR cast_option e= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CAST_EXPR219=(AST)match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expression2870); 
					CAST_EXPR219_tree = (AST)adaptor.dupNode(CAST_EXPR219);


					root_1 = (AST)adaptor.becomeRoot(CAST_EXPR219_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_cast_option_in_expression2872);
					cast_option220=cast_option();
					state._fsp--;

					adaptor.addChild(root_1, cast_option220.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2876);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int result = (cast_option220!=null?((TreePHP.cast_option_return)cast_option220).castOption:0);
					    int startIndex = CAST_EXPR219.startIndex;
					    int endIndex = CAST_EXPR219.endIndex + 1;
					    Expression expr = (e!=null?((TreePHP.expression_return)e).expr:null);
					    switch(result) {
					      case 1:
					      case 2:
					        retval.expr = new CastExpression(startIndex, endIndex, expr, CastEnum.BOOL);
					        break;
					      case 3:
					        retval.expr = new CastExpression(startIndex, endIndex, expr, CastEnum.INT);
					        break;
					      case 6:
					        retval.expr = new CastExpression(startIndex, endIndex, expr, CastEnum.ARRAY);
					        break;
					      case 7:
					        retval.expr = new CastExpression(startIndex, endIndex, expr, CastEnum.OBJECT);
					        break;
					      case 8:
					        retval.expr = new CastExpression(startIndex, endIndex, expr, CastEnum.REAL);
					        break;
					      case 9:
					        retval.expr = new CastExpression(startIndex, endIndex, expr, CastEnum.STRING);
					        break;
					      case 10:
					        retval.expr = new CastExpression(startIndex, endIndex, expr, CastEnum.UNSET);
					        break;
					      default:
					        retval.expr = new CastExpression(startIndex, endIndex, expr, CastEnum.OBJECT);
					        break;
					    }
					  
					}
					break;
				case 41 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1697:5: ^( POSTFIX_EXPR e= expression plus_minus )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					POSTFIX_EXPR221=(AST)match(input,POSTFIX_EXPR,FOLLOW_POSTFIX_EXPR_in_expression2900); 
					POSTFIX_EXPR221_tree = (AST)adaptor.dupNode(POSTFIX_EXPR221);


					root_1 = (AST)adaptor.becomeRoot(POSTFIX_EXPR221_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2904);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_plus_minus_in_expression2906);
					plus_minus222=plus_minus();
					state._fsp--;

					adaptor.addChild(root_1, plus_minus222.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					      int startIndex = POSTFIX_EXPR221.startIndex;
					      int endIndex = POSTFIX_EXPR221.endIndex + 1;
					      if ((plus_minus222!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(plus_minus222.start),input.getTreeAdaptor().getTokenStopIndex(plus_minus222.start))):null).equals("++")) {
					        retval.expr = new PostfixExpression(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null) , PostfixEnum.INC);
					      }
					      else {
					        retval.expr = new PostfixExpression(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null) , PostfixEnum.DEC);
					      } 
					  
					}
					break;
				case 42 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1708:5: ^( PREFIX_EXPR ( plus_minus )+ e= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					PREFIX_EXPR223=(AST)match(input,PREFIX_EXPR,FOLLOW_PREFIX_EXPR_in_expression2918); 
					PREFIX_EXPR223_tree = (AST)adaptor.dupNode(PREFIX_EXPR223);


					root_1 = (AST)adaptor.becomeRoot(PREFIX_EXPR223_tree, root_1);

					match(input, Token.DOWN, null); 
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1708:19: ( plus_minus )+
					int cnt65=0;
					loop65:
					while (true) {
						int alt65=2;
						int LA65_0 = input.LA(1);
						if ( (LA65_0==MINUS_MINUS_T||LA65_0==PLUS_PLUS_T) ) {
							alt65=1;
						}

						switch (alt65) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1708:19: plus_minus
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_plus_minus_in_expression2920);
							plus_minus224=plus_minus();
							state._fsp--;

							adaptor.addChild(root_1, plus_minus224.getTree());

							}
							break;

						default :
							if ( cnt65 >= 1 ) break loop65;
							EarlyExitException eee = new EarlyExitException(65, input);
							throw eee;
						}
						cnt65++;
					}

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2925);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					      int startIndex = PREFIX_EXPR223.startIndex;
					      int endIndex = PREFIX_EXPR223.endIndex + 1;
					      if ((plus_minus224!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(plus_minus224.start),input.getTreeAdaptor().getTokenStopIndex(plus_minus224.start))):null).equals("++")) {
					        retval.expr = new PrefixExpression(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), PrefixEnum.INC);
					      }
					      else {
					        retval.expr = new PrefixExpression(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), PrefixEnum.DEC);
					      }
					  
					}
					break;
				case 43 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1719:5: ^( INSTANCEOF_T e= expression class_name_reference )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					INSTANCEOF_T225=(AST)match(input,INSTANCEOF_T,FOLLOW_INSTANCEOF_T_in_expression2937); 
					INSTANCEOF_T225_tree = (AST)adaptor.dupNode(INSTANCEOF_T225);


					root_1 = (AST)adaptor.becomeRoot(INSTANCEOF_T225_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression2941);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_class_name_reference_in_expression2943);
					class_name_reference226=class_name_reference();
					state._fsp--;

					adaptor.addChild(root_1, class_name_reference226.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = INSTANCEOF_T225.startIndex;
					    int endIndex = INSTANCEOF_T225.endIndex + 1;
					    retval.expr = new InstanceOfExpression(startIndex, endIndex, (e!=null?((TreePHP.expression_return)e).expr:null), (class_name_reference226!=null?((TreePHP.class_name_reference_return)class_name_reference226).var:null)); 
					  
					}
					break;
				case 44 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1725:5: ( AT_T )? variable
					{
					root_0 = (AST)adaptor.nil();


					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1725:5: ( AT_T )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==AT_T) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1725:5: AT_T
							{
							_last = (AST)input.LT(1);
							AT_T227=(AST)match(input,AT_T,FOLLOW_AT_T_in_expression2954); 
							AT_T227_tree = (AST)adaptor.dupNode(AT_T227);


							adaptor.addChild(root_0, AT_T227_tree);

							}
							break;

					}

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_variable_in_expression2957);
					variable228=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable228.getTree());


					    retval.expr = (variable228!=null?((TreePHP.variable_return)variable228).var:null);
					  
					}
					break;
				case 45 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1729:5: ( AT_T )? scalar
					{
					root_0 = (AST)adaptor.nil();


					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1729:5: ( AT_T )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==AT_T) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1729:5: AT_T
							{
							_last = (AST)input.LT(1);
							AT_T229=(AST)match(input,AT_T,FOLLOW_AT_T_in_expression2967); 
							AT_T229_tree = (AST)adaptor.dupNode(AT_T229);


							adaptor.addChild(root_0, AT_T229_tree);

							}
							break;

					}

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_scalar_in_expression2970);
					scalar230=scalar();
					state._fsp--;

					adaptor.addChild(root_0, scalar230.getTree());


					    retval.expr = (scalar230!=null?((TreePHP.scalar_return)scalar230).expr:null);
					    ast = (scalar230!=null?((AST)scalar230.getTree()):null);
					  
					}
					break;
				case 46 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1734:5: list_decl
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_list_decl_in_expression2980);
					list_decl231=list_decl();
					state._fsp--;

					adaptor.addChild(root_0, list_decl231.getTree());


					    retval.expr = (list_decl231!=null?((TreePHP.list_decl_return)list_decl231).expr:null);
					  
					}
					break;
				case 47 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1738:5: ^( ARRAY_DECL ( array_pair_list )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					ARRAY_DECL232=(AST)match(input,ARRAY_DECL,FOLLOW_ARRAY_DECL_in_expression2991); 
					ARRAY_DECL232_tree = (AST)adaptor.dupNode(ARRAY_DECL232);


					root_1 = (AST)adaptor.becomeRoot(ARRAY_DECL232_tree, root_1);

					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1738:18: ( array_pair_list )?
						int alt68=2;
						int LA68_0 = input.LA(1);
						if ( (LA68_0==AND_T||(LA68_0 >= ARRAY_DECL && LA68_0 <= ARROW_T)||(LA68_0 >= AT_T && LA68_0 <= BIT_OR_T)||LA68_0==CALL||LA68_0==CAST_EXPR||LA68_0==CLONE_T||(LA68_0 >= DIV_EQ && LA68_0 <= DIV_T)||(LA68_0 >= DOT_EQ && LA68_0 <= DOT_T)||(LA68_0 >= EQUAL_EQUAL_EQUAL_T && LA68_0 <= EQUAL_T)||LA68_0==EXPR||LA68_0==INSTANCEOF_T||LA68_0==LE_T||(LA68_0 >= LIST_T && LA68_0 <= LT_T)||(LA68_0 >= ME_T && LA68_0 <= MINUS_EQ)||(LA68_0 >= MINUS_T && LA68_0 <= MUL_T)||(LA68_0 >= NEW_T && LA68_0 <= NOT_EQUAL_T)||LA68_0==OR_T||(LA68_0 >= PERCENT_EQ && LA68_0 <= PLUS_EQ)||LA68_0==PLUS_T||(LA68_0 >= POSTFIX_EXPR && LA68_0 <= POWER_T)||(LA68_0 >= PREFIX_EXPR && LA68_0 <= PRINT_T)||LA68_0==QUESTION_T||LA68_0==REF_T||(LA68_0 >= RMOVE_EQ && LA68_0 <= SCALAR)||(LA68_0 >= UNARY_EXPR && LA68_0 <= UNSET_T)||LA68_0==VAR_DECL||LA68_0==XOR_T) ) {
							alt68=1;
						}
						switch (alt68) {
							case 1 :
								// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1738:18: array_pair_list
								{
								_last = (AST)input.LT(1);
								pushFollow(FOLLOW_array_pair_list_in_expression2993);
								array_pair_list233=array_pair_list();
								state._fsp--;

								adaptor.addChild(root_1, array_pair_list233.getTree());

								}
								break;

						}

						match(input, Token.UP, null); 
					}
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = ARRAY_DECL232.startIndex;
					    int endIndex = ARRAY_DECL232.endIndex + 1;
					    if ((array_pair_list233!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(array_pair_list233.start),input.getTreeAdaptor().getTokenStopIndex(array_pair_list233.start))):null) != null) {
					       retval.expr = new ArrayCreation(startIndex, endIndex, (array_pair_list233!=null?((TreePHP.array_pair_list_return)array_pair_list233).arrayList:null));
					    }
					    else {
					       retval.expr = new ArrayCreation(startIndex, endIndex, new LinkedList());
					    }
					  
					}
					break;
				case 48 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1749:5: ^( NEW_T class_name_reference )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					NEW_T234=(AST)match(input,NEW_T,FOLLOW_NEW_T_in_expression3006); 
					NEW_T234_tree = (AST)adaptor.dupNode(NEW_T234);


					root_1 = (AST)adaptor.becomeRoot(NEW_T234_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_class_name_reference_in_expression3008);
					class_name_reference235=class_name_reference();
					state._fsp--;

					adaptor.addChild(root_1, class_name_reference235.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = NEW_T234.startIndex;
					    int endIndex = NEW_T234.endIndex + 1;
					    Expression className = (class_name_reference235!=null?((TreePHP.class_name_reference_return)class_name_reference235).var:null);
					    PHPCallArgumentsList ctor = (class_name_reference235!=null?((TreePHP.class_name_reference_return)class_name_reference235).parameterList:null);
					    if (ctor == null) {
					      ctor = new PHPCallArgumentsList();
					      ctor.setStart(endIndex);
					      ctor.setEnd(endIndex);
					    }

					    ClassInstanceCreation classInstanceCreation = new ClassInstanceCreation(startIndex, endIndex, className, ctor);
					    retval.expr = classInstanceCreation;
					  
					}
					break;
				case 49 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1765:5: ^( CLONE_T variable )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CLONE_T236=(AST)match(input,CLONE_T,FOLLOW_CLONE_T_in_expression3023); 
					CLONE_T236_tree = (AST)adaptor.dupNode(CLONE_T236);


					root_1 = (AST)adaptor.becomeRoot(CLONE_T236_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_variable_in_expression3025);
					variable237=variable();
					state._fsp--;

					adaptor.addChild(root_1, variable237.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = CLONE_T236.startIndex;
					    int endIndex = CLONE_T236.endIndex + 1;
					    retval.expr = new CloneExpression(startIndex, endIndex, (variable237!=null?((TreePHP.variable_return)variable237).var:null));
					  
					}
					break;
				case 50 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1772:5: ^( UNSET_T variable_list )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					UNSET_T238=(AST)match(input,UNSET_T,FOLLOW_UNSET_T_in_expression3038); 
					UNSET_T238_tree = (AST)adaptor.dupNode(UNSET_T238);


					root_1 = (AST)adaptor.becomeRoot(UNSET_T238_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_variable_list_in_expression3040);
					variable_list239=variable_list();
					state._fsp--;

					adaptor.addChild(root_1, variable_list239.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					     int startIndex = UNSET_T238.startIndex;
					     int endIndex = UNSET_T238.endIndex + 1;
					     int startOfVariableList = startIndex + "unset".length() + 1;
					     SimpleReference simpleRef = new SimpleReference(startIndex, startIndex + "unset".length(), "unset");
					     
					     PHPCallArgumentsList list = new PHPCallArgumentsList();
					     List variableList = (variable_list239!=null?((TreePHP.variable_list_return)variable_list239).variableList:null);
					     Iterator iter = variableList.iterator();
					     while (iter.hasNext()) {
					          Expression expr = (Expression)iter.next();
					          list.addNode(expr);
					     }
					     list.setStart(startOfVariableList);
					     list.setEnd(endIndex - 1);     
					     
					     retval.expr = new PHPCallExpression(startIndex, endIndex, null, simpleRef, list);
					  
					}
					break;
				case 51 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1792:5: BACKTRICKLITERAL
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					BACKTRICKLITERAL240=(AST)match(input,BACKTRICKLITERAL,FOLLOW_BACKTRICKLITERAL_in_expression3052); 
					BACKTRICKLITERAL240_tree = (AST)adaptor.dupNode(BACKTRICKLITERAL240);


					adaptor.addChild(root_0, BACKTRICKLITERAL240_tree);


					    int startIndex = BACKTRICKLITERAL240.startIndex;
					    int endIndex = BACKTRICKLITERAL240.endIndex + 1;
					    retval.expr = new BackTickExpression(startIndex, endIndex, new LinkedList());
					  
					}
					break;
				case 52 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1798:5: ^( PRINT_T e= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					PRINT_T241=(AST)match(input,PRINT_T,FOLLOW_PRINT_T_in_expression3063); 
					PRINT_T241_tree = (AST)adaptor.dupNode(PRINT_T241);


					root_1 = (AST)adaptor.becomeRoot(PRINT_T241_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_expression3067);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_1, e.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = PRINT_T241.startIndex;
					    int endIndex = PRINT_T241.endIndex + 1;
					    
					    PHPCallArgumentsList list = new PHPCallArgumentsList();
					      if ((e!=null?((TreePHP.expression_return)e).expr:null) != null) {
					        list.addNode((e!=null?((TreePHP.expression_return)e).expr:null));
					        list.setStart((e!=null?((TreePHP.expression_return)e).expr:null).sourceStart());
					        list.setEnd((e!=null?((TreePHP.expression_return)e).expr:null).sourceEnd());
					      } else {
					        list.setStart(startIndex);
					        list.setEnd(startIndex);
					      }
					      
					      if (inExprList) {
					         expr_list_stack.peek().list.remove(expr_list_stack.peek().list.size() - 1);
					      }
					    
					    SimpleReference name = new SimpleReference(startIndex, startIndex + "print".length(), "print");
					      retval.expr = new PHPCallExpression(startIndex, endIndex, null, name, list);
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	protected static class unary_symbol_list_scope {
		List list;
	}
	protected Stack<unary_symbol_list_scope> unary_symbol_list_stack = new Stack<unary_symbol_list_scope>();

	public static class unary_symbol_list_return extends TreeRuleReturnScope {
		public List symbolList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "unary_symbol_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1823:1: unary_symbol_list returns [List symbolList] : ( unary_symbol )+ ;
	public final TreePHP.unary_symbol_list_return unary_symbol_list() throws RecognitionException {
		unary_symbol_list_stack.push(new unary_symbol_list_scope());
		TreePHP.unary_symbol_list_return retval = new TreePHP.unary_symbol_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope unary_symbol242 =null;



		  unary_symbol_list_stack.peek().list = new ArrayList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1830:3: ( ( unary_symbol )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1830:5: ( unary_symbol )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1830:5: ( unary_symbol )+
			int cnt70=0;
			loop70:
			while (true) {
				int alt70=2;
				switch ( input.LA(1) ) {
				case REF_T:
					{
					int LA70_2 = input.LA(2);
					if ( (LA70_2==AND_T||LA70_2==ARRAY_DECL||(LA70_2 >= AT_T && LA70_2 <= BIT_OR_T)||LA70_2==CALL||LA70_2==CAST_EXPR||LA70_2==CLONE_T||(LA70_2 >= DIV_EQ && LA70_2 <= DIV_T)||(LA70_2 >= DOT_EQ && LA70_2 <= DOT_T)||(LA70_2 >= EQUAL_EQUAL_EQUAL_T && LA70_2 <= EXPR)||LA70_2==INSTANCEOF_T||LA70_2==LE_T||(LA70_2 >= LIST_T && LA70_2 <= LT_T)||(LA70_2 >= ME_T && LA70_2 <= MINUS_EQ)||(LA70_2 >= MINUS_T && LA70_2 <= MUL_T)||(LA70_2 >= NEW_T && LA70_2 <= NOT_EQUAL_T)||LA70_2==OR_T||(LA70_2 >= PERCENT_EQ && LA70_2 <= PLUS_EQ)||LA70_2==PLUS_T||(LA70_2 >= POSTFIX_EXPR && LA70_2 <= POWER_T)||(LA70_2 >= PREFIX_EXPR && LA70_2 <= PRINT_T)||LA70_2==QUESTION_T||LA70_2==REF_T||(LA70_2 >= RMOVE_EQ && LA70_2 <= SCALAR)||LA70_2==TILDA_T||(LA70_2 >= UNARY_EXPR && LA70_2 <= UNSET_T)||LA70_2==VAR_DECL||LA70_2==XOR_T) ) {
						alt70=1;
					}

					}
					break;
				case PLUS_T:
					{
					int LA70_3 = input.LA(2);
					if ( (LA70_3==AND_T||LA70_3==ARRAY_DECL||(LA70_3 >= AT_T && LA70_3 <= BIT_OR_T)||LA70_3==CALL||LA70_3==CAST_EXPR||LA70_3==CLONE_T||(LA70_3 >= DIV_EQ && LA70_3 <= DIV_T)||(LA70_3 >= DOT_EQ && LA70_3 <= DOT_T)||(LA70_3 >= EQUAL_EQUAL_EQUAL_T && LA70_3 <= EXPR)||LA70_3==INSTANCEOF_T||LA70_3==LE_T||(LA70_3 >= LIST_T && LA70_3 <= LT_T)||(LA70_3 >= ME_T && LA70_3 <= MINUS_EQ)||(LA70_3 >= MINUS_T && LA70_3 <= MUL_T)||(LA70_3 >= NEW_T && LA70_3 <= NOT_EQUAL_T)||LA70_3==OR_T||(LA70_3 >= PERCENT_EQ && LA70_3 <= PLUS_EQ)||LA70_3==PLUS_T||(LA70_3 >= POSTFIX_EXPR && LA70_3 <= POWER_T)||(LA70_3 >= PREFIX_EXPR && LA70_3 <= PRINT_T)||LA70_3==QUESTION_T||LA70_3==REF_T||(LA70_3 >= RMOVE_EQ && LA70_3 <= SCALAR)||LA70_3==TILDA_T||(LA70_3 >= UNARY_EXPR && LA70_3 <= UNSET_T)||LA70_3==VAR_DECL||LA70_3==XOR_T) ) {
						alt70=1;
					}

					}
					break;
				case MINUS_T:
					{
					int LA70_4 = input.LA(2);
					if ( (LA70_4==AND_T||LA70_4==ARRAY_DECL||(LA70_4 >= AT_T && LA70_4 <= BIT_OR_T)||LA70_4==CALL||LA70_4==CAST_EXPR||LA70_4==CLONE_T||(LA70_4 >= DIV_EQ && LA70_4 <= DIV_T)||(LA70_4 >= DOT_EQ && LA70_4 <= DOT_T)||(LA70_4 >= EQUAL_EQUAL_EQUAL_T && LA70_4 <= EXPR)||LA70_4==INSTANCEOF_T||LA70_4==LE_T||(LA70_4 >= LIST_T && LA70_4 <= LT_T)||(LA70_4 >= ME_T && LA70_4 <= MINUS_EQ)||(LA70_4 >= MINUS_T && LA70_4 <= MUL_T)||(LA70_4 >= NEW_T && LA70_4 <= NOT_EQUAL_T)||LA70_4==OR_T||(LA70_4 >= PERCENT_EQ && LA70_4 <= PLUS_EQ)||LA70_4==PLUS_T||(LA70_4 >= POSTFIX_EXPR && LA70_4 <= POWER_T)||(LA70_4 >= PREFIX_EXPR && LA70_4 <= PRINT_T)||LA70_4==QUESTION_T||LA70_4==REF_T||(LA70_4 >= RMOVE_EQ && LA70_4 <= SCALAR)||LA70_4==TILDA_T||(LA70_4 >= UNARY_EXPR && LA70_4 <= UNSET_T)||LA70_4==VAR_DECL||LA70_4==XOR_T) ) {
						alt70=1;
					}

					}
					break;
				case EXC_NOT_T:
				case TILDA_T:
					{
					alt70=1;
					}
					break;
				}
				switch (alt70) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1830:5: unary_symbol
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_unary_symbol_in_unary_symbol_list3101);
					unary_symbol242=unary_symbol();
					state._fsp--;

					adaptor.addChild(root_0, unary_symbol242.getTree());

					}
					break;

				default :
					if ( cnt70 >= 1 ) break loop70;
					EarlyExitException eee = new EarlyExitException(70, input);
					throw eee;
				}
				cnt70++;
			}


			    retval.symbolList = unary_symbol_list_stack.peek().list;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			unary_symbol_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "unary_symbol_list"


	public static class unary_symbol_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "unary_symbol"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1836:1: unary_symbol : ( PLUS_T | MINUS_T | REF_T | TILDA_T | EXC_NOT_T );
	public final TreePHP.unary_symbol_return unary_symbol() throws RecognitionException {
		TreePHP.unary_symbol_return retval = new TreePHP.unary_symbol_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST PLUS_T243=null;
		AST MINUS_T244=null;
		AST REF_T245=null;
		AST TILDA_T246=null;
		AST EXC_NOT_T247=null;

		AST PLUS_T243_tree=null;
		AST MINUS_T244_tree=null;
		AST REF_T245_tree=null;
		AST TILDA_T246_tree=null;
		AST EXC_NOT_T247_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1837:3: ( PLUS_T | MINUS_T | REF_T | TILDA_T | EXC_NOT_T )
			int alt71=5;
			switch ( input.LA(1) ) {
			case PLUS_T:
				{
				alt71=1;
				}
				break;
			case MINUS_T:
				{
				alt71=2;
				}
				break;
			case REF_T:
				{
				alt71=3;
				}
				break;
			case TILDA_T:
				{
				alt71=4;
				}
				break;
			case EXC_NOT_T:
				{
				alt71=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}
			switch (alt71) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1837:5: PLUS_T
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					PLUS_T243=(AST)match(input,PLUS_T,FOLLOW_PLUS_T_in_unary_symbol3121); 
					PLUS_T243_tree = (AST)adaptor.dupNode(PLUS_T243);


					adaptor.addChild(root_0, PLUS_T243_tree);

					unary_symbol_list_stack.peek().list.add(0,1);
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1838:5: MINUS_T
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					MINUS_T244=(AST)match(input,MINUS_T,FOLLOW_MINUS_T_in_unary_symbol3130); 
					MINUS_T244_tree = (AST)adaptor.dupNode(MINUS_T244);


					adaptor.addChild(root_0, MINUS_T244_tree);

					unary_symbol_list_stack.peek().list.add(0,2);
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1839:5: REF_T
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					REF_T245=(AST)match(input,REF_T,FOLLOW_REF_T_in_unary_symbol3138); 
					REF_T245_tree = (AST)adaptor.dupNode(REF_T245);


					adaptor.addChild(root_0, REF_T245_tree);

					unary_symbol_list_stack.peek().list.add(0,3);
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1840:5: TILDA_T
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					TILDA_T246=(AST)match(input,TILDA_T,FOLLOW_TILDA_T_in_unary_symbol3148); 
					TILDA_T246_tree = (AST)adaptor.dupNode(TILDA_T246);


					adaptor.addChild(root_0, TILDA_T246_tree);

					unary_symbol_list_stack.peek().list.add(0,4);
					}
					break;
				case 5 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1841:5: EXC_NOT_T
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					EXC_NOT_T247=(AST)match(input,EXC_NOT_T,FOLLOW_EXC_NOT_T_in_unary_symbol3156); 
					EXC_NOT_T247_tree = (AST)adaptor.dupNode(EXC_NOT_T247);


					adaptor.addChild(root_0, EXC_NOT_T247_tree);

					unary_symbol_list_stack.peek().list.add(0,5);
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary_symbol"


	public static class plus_minus_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "plus_minus"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1844:1: plus_minus : ( PLUS_PLUS_T | MINUS_MINUS_T );
	public final TreePHP.plus_minus_return plus_minus() throws RecognitionException {
		TreePHP.plus_minus_return retval = new TreePHP.plus_minus_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST set248=null;

		AST set248_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1845:3: ( PLUS_PLUS_T | MINUS_MINUS_T )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			set248=(AST)input.LT(1);
			if ( input.LA(1)==MINUS_MINUS_T||input.LA(1)==PLUS_PLUS_T ) {
				input.consume();
				set248_tree = (AST)adaptor.dupNode(set248);


				adaptor.addChild(root_0, set248_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plus_minus"


	public static class cast_option_return extends TreeRuleReturnScope {
		public int castOption;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "cast_option"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1849:1: cast_option returns [int castOption] : ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'array' | 'object' | 'real' | 'string' | UNSET_T | CLONE_T );
	public final TreePHP.cast_option_return cast_option() throws RecognitionException {
		TreePHP.cast_option_return retval = new TreePHP.cast_option_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST string_literal249=null;
		AST string_literal250=null;
		AST string_literal251=null;
		AST string_literal252=null;
		AST string_literal253=null;
		AST string_literal254=null;
		AST string_literal255=null;
		AST string_literal256=null;
		AST string_literal257=null;
		AST UNSET_T258=null;
		AST CLONE_T259=null;

		AST string_literal249_tree=null;
		AST string_literal250_tree=null;
		AST string_literal251_tree=null;
		AST string_literal252_tree=null;
		AST string_literal253_tree=null;
		AST string_literal254_tree=null;
		AST string_literal255_tree=null;
		AST string_literal256_tree=null;
		AST string_literal257_tree=null;
		AST UNSET_T258_tree=null;
		AST CLONE_T259_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1850:3: ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'array' | 'object' | 'real' | 'string' | UNSET_T | CLONE_T )
			int alt72=11;
			switch ( input.LA(1) ) {
			case 186:
				{
				alt72=1;
				}
				break;
			case 187:
				{
				alt72=2;
				}
				break;
			case 191:
				{
				alt72=3;
				}
				break;
			case 190:
				{
				alt72=4;
				}
				break;
			case 188:
				{
				alt72=5;
				}
				break;
			case 185:
				{
				alt72=6;
				}
				break;
			case 192:
				{
				alt72=7;
				}
				break;
			case 196:
				{
				alt72=8;
				}
				break;
			case 197:
				{
				alt72=9;
				}
				break;
			case UNSET_T:
				{
				alt72=10;
				}
				break;
			case CLONE_T:
				{
				alt72=11;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1850:5: 'bool'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal249=(AST)match(input,186,FOLLOW_186_in_cast_option3194); 
					string_literal249_tree = (AST)adaptor.dupNode(string_literal249);


					adaptor.addChild(root_0, string_literal249_tree);

					retval.castOption = 1;
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1851:5: 'boolean'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal250=(AST)match(input,187,FOLLOW_187_in_cast_option3205); 
					string_literal250_tree = (AST)adaptor.dupNode(string_literal250);


					adaptor.addChild(root_0, string_literal250_tree);

					retval.castOption = 2;
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1852:5: 'int'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal251=(AST)match(input,191,FOLLOW_191_in_cast_option3213); 
					string_literal251_tree = (AST)adaptor.dupNode(string_literal251);


					adaptor.addChild(root_0, string_literal251_tree);

					retval.castOption = 3;
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1853:5: 'float'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal252=(AST)match(input,190,FOLLOW_190_in_cast_option3225); 
					string_literal252_tree = (AST)adaptor.dupNode(string_literal252);


					adaptor.addChild(root_0, string_literal252_tree);

					retval.castOption = 4;
					}
					break;
				case 5 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1854:5: 'double'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal253=(AST)match(input,188,FOLLOW_188_in_cast_option3235); 
					string_literal253_tree = (AST)adaptor.dupNode(string_literal253);


					adaptor.addChild(root_0, string_literal253_tree);

					retval.castOption = 5;
					}
					break;
				case 6 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1855:5: 'array'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal254=(AST)match(input,185,FOLLOW_185_in_cast_option3244); 
					string_literal254_tree = (AST)adaptor.dupNode(string_literal254);


					adaptor.addChild(root_0, string_literal254_tree);

					retval.castOption = 6;
					}
					break;
				case 7 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1856:5: 'object'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal255=(AST)match(input,192,FOLLOW_192_in_cast_option3254); 
					string_literal255_tree = (AST)adaptor.dupNode(string_literal255);


					adaptor.addChild(root_0, string_literal255_tree);

					retval.castOption = 7;
					}
					break;
				case 8 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1857:5: 'real'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal256=(AST)match(input,196,FOLLOW_196_in_cast_option3263); 
					string_literal256_tree = (AST)adaptor.dupNode(string_literal256);


					adaptor.addChild(root_0, string_literal256_tree);

					retval.castOption = 8;
					}
					break;
				case 9 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1858:5: 'string'
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					string_literal257=(AST)match(input,197,FOLLOW_197_in_cast_option3274); 
					string_literal257_tree = (AST)adaptor.dupNode(string_literal257);


					adaptor.addChild(root_0, string_literal257_tree);

					retval.castOption = 9;
					}
					break;
				case 10 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1859:5: UNSET_T
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					UNSET_T258=(AST)match(input,UNSET_T,FOLLOW_UNSET_T_in_cast_option3283); 
					UNSET_T258_tree = (AST)adaptor.dupNode(UNSET_T258);


					adaptor.addChild(root_0, UNSET_T258_tree);

					retval.castOption = 10;
					}
					break;
				case 11 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1860:5: CLONE_T
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					CLONE_T259=(AST)match(input,CLONE_T,FOLLOW_CLONE_T_in_cast_option3293); 
					CLONE_T259_tree = (AST)adaptor.dupNode(CLONE_T259);


					adaptor.addChild(root_0, CLONE_T259_tree);

					retval.castOption = 11;
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "cast_option"


	protected static class class_name_reference_scope {
		List list;
		List argList;
	}
	protected Stack<class_name_reference_scope> class_name_reference_stack = new Stack<class_name_reference_scope>();

	public static class class_name_reference_return extends TreeRuleReturnScope {
		public Expression var;
		public PHPCallArgumentsList parameterList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "class_name_reference"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1868:1: class_name_reference returns [Expression var, PHPCallArgumentsList parameterList] : ( dynamic_name_reference | fully_qualified_class_name );
	public final TreePHP.class_name_reference_return class_name_reference() throws RecognitionException {
		class_name_reference_stack.push(new class_name_reference_scope());
		TreePHP.class_name_reference_return retval = new TreePHP.class_name_reference_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope dynamic_name_reference260 =null;
		TreeRuleReturnScope fully_qualified_class_name261 =null;



		  class_name_reference_stack.peek().list = new LinkedList();
		  class_name_reference_stack.peek().argList = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1877:3: ( dynamic_name_reference | fully_qualified_class_name )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==CALL||LA73_0==VAR_DECL) ) {
				alt73=1;
			}
			else if ( (LA73_0==DOMAIN_T||LA73_0==IDENTIFIER) ) {
				alt73=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1877:5: dynamic_name_reference
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_dynamic_name_reference_in_class_name_reference3335);
					dynamic_name_reference260=dynamic_name_reference();
					state._fsp--;

					adaptor.addChild(root_0, dynamic_name_reference260.getTree());


					    retval.var = (dynamic_name_reference260!=null?((TreePHP.dynamic_name_reference_return)dynamic_name_reference260).var:null);
					    retval.parameterList = (dynamic_name_reference260!=null?((TreePHP.dynamic_name_reference_return)dynamic_name_reference260).parameterList:null);
					       
					    Expression dispatcher = retval.var;
					    Iterator iter = class_name_reference_stack.peek().list.iterator();
					    while (iter.hasNext()) {
					      Expression property = (Expression)iter.next();
					      dispatcher = createDispatch(dispatcher, property);
					    }
					    retval.var = dispatcher;
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1890:5: fully_qualified_class_name
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_in_class_name_reference3345);
					fully_qualified_class_name261=fully_qualified_class_name();
					state._fsp--;

					adaptor.addChild(root_0, fully_qualified_class_name261.getTree());


					    retval.var = (fully_qualified_class_name261!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name261).type:null);
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			class_name_reference_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "class_name_reference"


	public static class dynamic_name_reference_return extends TreeRuleReturnScope {
		public Expression var;
		public PHPCallArgumentsList parameterList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "dynamic_name_reference"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1896:1: dynamic_name_reference returns [Expression var, PHPCallArgumentsList parameterList] : ( base_variable_with_function_calls | ^( CALL v1= dynamic_name_reference obj= object_property ( ctor_arguments )? ) );
	public final TreePHP.dynamic_name_reference_return dynamic_name_reference() throws RecognitionException {
		TreePHP.dynamic_name_reference_return retval = new TreePHP.dynamic_name_reference_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST CALL263=null;
		TreeRuleReturnScope v1 =null;
		TreeRuleReturnScope obj =null;
		TreeRuleReturnScope base_variable_with_function_calls262 =null;
		TreeRuleReturnScope ctor_arguments264 =null;

		AST CALL263_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1897:3: ( base_variable_with_function_calls | ^( CALL v1= dynamic_name_reference obj= object_property ( ctor_arguments )? ) )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==VAR_DECL) ) {
				alt75=1;
			}
			else if ( (LA75_0==CALL) ) {
				int LA75_2 = input.LA(2);
				if ( (LA75_2==DOWN) ) {
					int LA75_3 = input.LA(3);
					if ( (LA75_3==DOMAIN_T||LA75_3==IDENTIFIER) ) {
						alt75=1;
					}
					else if ( (LA75_3==CALL||LA75_3==VAR_DECL) ) {
						alt75=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 75, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1897:5: base_variable_with_function_calls
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference3368);
					base_variable_with_function_calls262=base_variable_with_function_calls();
					state._fsp--;

					adaptor.addChild(root_0, base_variable_with_function_calls262.getTree());


					     retval.var = (base_variable_with_function_calls262!=null?((TreePHP.base_variable_with_function_calls_return)base_variable_with_function_calls262).var:null);
					     if ((base_variable_with_function_calls262!=null?((TreePHP.base_variable_with_function_calls_return)base_variable_with_function_calls262).type:null) != null) {
					        retval.var = (base_variable_with_function_calls262!=null?((TreePHP.base_variable_with_function_calls_return)base_variable_with_function_calls262).type:null);
					     }
					     retval.parameterList = (base_variable_with_function_calls262!=null?((TreePHP.base_variable_with_function_calls_return)base_variable_with_function_calls262).parameterList:null);
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1905:5: ^( CALL v1= dynamic_name_reference obj= object_property ( ctor_arguments )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CALL263=(AST)match(input,CALL,FOLLOW_CALL_in_dynamic_name_reference3380); 
					CALL263_tree = (AST)adaptor.dupNode(CALL263);


					root_1 = (AST)adaptor.becomeRoot(CALL263_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_dynamic_name_reference_in_dynamic_name_reference3384);
					v1=dynamic_name_reference();
					state._fsp--;

					adaptor.addChild(root_1, v1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_object_property_in_dynamic_name_reference3388);
					obj=object_property();
					state._fsp--;

					adaptor.addChild(root_1, obj.getTree());

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1905:58: ( ctor_arguments )?
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==ARGU) ) {
						alt74=1;
					}
					switch (alt74) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1905:58: ctor_arguments
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_ctor_arguments_in_dynamic_name_reference3390);
							ctor_arguments264=ctor_arguments();
							state._fsp--;

							adaptor.addChild(root_1, ctor_arguments264.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					      retval.var = (v1!=null?((TreePHP.dynamic_name_reference_return)v1).var:null);
					       
					      class_name_reference_stack.peek().list.add((obj!=null?((TreePHP.object_property_return)obj).expr:null));
					      
					      if ((ctor_arguments264!=null?((TreePHP.ctor_arguments_return)ctor_arguments264).argumentList:null) != null) {
					        retval.parameterList = (ctor_arguments264!=null?((TreePHP.ctor_arguments_return)ctor_arguments264).argumentList:null);
					      }
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dynamic_name_reference"


	public static class list_decl_return extends TreeRuleReturnScope {
		public Expression expr;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "list_decl"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1917:1: list_decl returns [Expression expr] : ^( LIST_T ( assignment_list )? ) ;
	public final TreePHP.list_decl_return list_decl() throws RecognitionException {
		TreePHP.list_decl_return retval = new TreePHP.list_decl_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST LIST_T265=null;
		TreeRuleReturnScope assignment_list266 =null;

		AST LIST_T265_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1918:3: ( ^( LIST_T ( assignment_list )? ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1918:5: ^( LIST_T ( assignment_list )? )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			LIST_T265=(AST)match(input,LIST_T,FOLLOW_LIST_T_in_list_decl3414); 
			LIST_T265_tree = (AST)adaptor.dupNode(LIST_T265);


			root_1 = (AST)adaptor.becomeRoot(LIST_T265_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1918:14: ( assignment_list )?
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==CALL||LA76_0==LIST_T||LA76_0==VAR_DECL) ) {
					alt76=1;
				}
				switch (alt76) {
					case 1 :
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1918:14: assignment_list
						{
						_last = (AST)input.LT(1);
						pushFollow(FOLLOW_assignment_list_in_list_decl3416);
						assignment_list266=assignment_list();
						state._fsp--;

						adaptor.addChild(root_1, assignment_list266.getTree());

						}
						break;

				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    int startIndex = (LIST_T265).startIndex;
			    int endIndex = LIST_T265.endIndex + 1;
			    retval.expr = new ListVariable(startIndex, endIndex, (assignment_list266!=null?((TreePHP.assignment_list_return)assignment_list266).assignList:null));
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "list_decl"


	protected static class assignment_list_scope {
		List list;
	}
	protected Stack<assignment_list_scope> assignment_list_stack = new Stack<assignment_list_scope>();

	public static class assignment_list_return extends TreeRuleReturnScope {
		public List assignList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "assignment_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1926:1: assignment_list returns [List assignList] : ( assignment_element )+ ;
	public final TreePHP.assignment_list_return assignment_list() throws RecognitionException {
		assignment_list_stack.push(new assignment_list_scope());
		TreePHP.assignment_list_return retval = new TreePHP.assignment_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope assignment_element267 =null;



		  assignment_list_stack.peek().list = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1933:3: ( ( assignment_element )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1933:5: ( assignment_element )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1933:5: ( assignment_element )+
			int cnt77=0;
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==CALL||LA77_0==LIST_T||LA77_0==VAR_DECL) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1933:5: assignment_element
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_assignment_element_in_assignment_list3448);
					assignment_element267=assignment_element();
					state._fsp--;

					adaptor.addChild(root_0, assignment_element267.getTree());

					}
					break;

				default :
					if ( cnt77 >= 1 ) break loop77;
					EarlyExitException eee = new EarlyExitException(77, input);
					throw eee;
				}
				cnt77++;
			}


			    retval.assignList = assignment_list_stack.peek().list;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			assignment_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "assignment_list"


	public static class assignment_element_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "assignment_element"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1939:1: assignment_element : ( variable | list_decl );
	public final TreePHP.assignment_element_return assignment_element() throws RecognitionException {
		TreePHP.assignment_element_return retval = new TreePHP.assignment_element_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope variable268 =null;
		TreeRuleReturnScope list_decl269 =null;


		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1940:3: ( variable | list_decl )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==CALL||LA78_0==VAR_DECL) ) {
				alt78=1;
			}
			else if ( (LA78_0==LIST_T) ) {
				alt78=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}

			switch (alt78) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1940:5: variable
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_variable_in_assignment_element3466);
					variable268=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable268.getTree());


					    assignment_list_stack.peek().list.add((variable268!=null?((TreePHP.variable_return)variable268).var:null));
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1944:5: list_decl
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_list_decl_in_assignment_element3476);
					list_decl269=list_decl();
					state._fsp--;

					adaptor.addChild(root_0, list_decl269.getTree());


					    assignment_list_stack.peek().list.add((list_decl269!=null?((TreePHP.list_decl_return)list_decl269).expr:null));
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment_element"


	protected static class array_pair_list_scope {
		List list;
	}
	protected Stack<array_pair_list_scope> array_pair_list_stack = new Stack<array_pair_list_scope>();

	public static class array_pair_list_return extends TreeRuleReturnScope {
		public List arrayList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "array_pair_list"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1950:1: array_pair_list returns [List arrayList] : ( array_pair_element )+ ;
	public final TreePHP.array_pair_list_return array_pair_list() throws RecognitionException {
		array_pair_list_stack.push(new array_pair_list_scope());
		TreePHP.array_pair_list_return retval = new TreePHP.array_pair_list_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope array_pair_element270 =null;



		  array_pair_list_stack.peek().list = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1957:3: ( ( array_pair_element )+ )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1957:5: ( array_pair_element )+
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1957:5: ( array_pair_element )+
			int cnt79=0;
			loop79:
			while (true) {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==AND_T||(LA79_0 >= ARRAY_DECL && LA79_0 <= ARROW_T)||(LA79_0 >= AT_T && LA79_0 <= BIT_OR_T)||LA79_0==CALL||LA79_0==CAST_EXPR||LA79_0==CLONE_T||(LA79_0 >= DIV_EQ && LA79_0 <= DIV_T)||(LA79_0 >= DOT_EQ && LA79_0 <= DOT_T)||(LA79_0 >= EQUAL_EQUAL_EQUAL_T && LA79_0 <= EQUAL_T)||LA79_0==EXPR||LA79_0==INSTANCEOF_T||LA79_0==LE_T||(LA79_0 >= LIST_T && LA79_0 <= LT_T)||(LA79_0 >= ME_T && LA79_0 <= MINUS_EQ)||(LA79_0 >= MINUS_T && LA79_0 <= MUL_T)||(LA79_0 >= NEW_T && LA79_0 <= NOT_EQUAL_T)||LA79_0==OR_T||(LA79_0 >= PERCENT_EQ && LA79_0 <= PLUS_EQ)||LA79_0==PLUS_T||(LA79_0 >= POSTFIX_EXPR && LA79_0 <= POWER_T)||(LA79_0 >= PREFIX_EXPR && LA79_0 <= PRINT_T)||LA79_0==QUESTION_T||LA79_0==REF_T||(LA79_0 >= RMOVE_EQ && LA79_0 <= SCALAR)||(LA79_0 >= UNARY_EXPR && LA79_0 <= UNSET_T)||LA79_0==VAR_DECL||LA79_0==XOR_T) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1957:5: array_pair_element
					{
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_array_pair_element_in_array_pair_list3508);
					array_pair_element270=array_pair_element();
					state._fsp--;

					adaptor.addChild(root_0, array_pair_element270.getTree());

					}
					break;

				default :
					if ( cnt79 >= 1 ) break loop79;
					EarlyExitException eee = new EarlyExitException(79, input);
					throw eee;
				}
				cnt79++;
			}


			    retval.arrayList = array_pair_list_stack.peek().list;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			array_pair_list_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "array_pair_list"


	public static class array_pair_element_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "array_pair_element"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1963:1: array_pair_element : ( ^( ARROW_T e1= expression e2= expression ) |e= expression );
	public final TreePHP.array_pair_element_return array_pair_element() throws RecognitionException {
		TreePHP.array_pair_element_return retval = new TreePHP.array_pair_element_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST ARROW_T271=null;
		TreeRuleReturnScope e1 =null;
		TreeRuleReturnScope e2 =null;
		TreeRuleReturnScope e =null;

		AST ARROW_T271_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1964:3: ( ^( ARROW_T e1= expression e2= expression ) |e= expression )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==ARROW_T) ) {
				alt80=1;
			}
			else if ( (LA80_0==AND_T||LA80_0==ARRAY_DECL||(LA80_0 >= AT_T && LA80_0 <= BIT_OR_T)||LA80_0==CALL||LA80_0==CAST_EXPR||LA80_0==CLONE_T||(LA80_0 >= DIV_EQ && LA80_0 <= DIV_T)||(LA80_0 >= DOT_EQ && LA80_0 <= DOT_T)||(LA80_0 >= EQUAL_EQUAL_EQUAL_T && LA80_0 <= EQUAL_T)||LA80_0==EXPR||LA80_0==INSTANCEOF_T||LA80_0==LE_T||(LA80_0 >= LIST_T && LA80_0 <= LT_T)||(LA80_0 >= ME_T && LA80_0 <= MINUS_EQ)||(LA80_0 >= MINUS_T && LA80_0 <= MUL_T)||(LA80_0 >= NEW_T && LA80_0 <= NOT_EQUAL_T)||LA80_0==OR_T||(LA80_0 >= PERCENT_EQ && LA80_0 <= PLUS_EQ)||LA80_0==PLUS_T||(LA80_0 >= POSTFIX_EXPR && LA80_0 <= POWER_T)||(LA80_0 >= PREFIX_EXPR && LA80_0 <= PRINT_T)||LA80_0==QUESTION_T||LA80_0==REF_T||(LA80_0 >= RMOVE_EQ && LA80_0 <= SCALAR)||(LA80_0 >= UNARY_EXPR && LA80_0 <= UNSET_T)||LA80_0==VAR_DECL||LA80_0==XOR_T) ) {
				alt80=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1964:5: ^( ARROW_T e1= expression e2= expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					ARROW_T271=(AST)match(input,ARROW_T,FOLLOW_ARROW_T_in_array_pair_element3529); 
					ARROW_T271_tree = (AST)adaptor.dupNode(ARROW_T271);


					root_1 = (AST)adaptor.becomeRoot(ARROW_T271_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_array_pair_element3533);
					e1=expression();
					state._fsp--;

					adaptor.addChild(root_1, e1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_array_pair_element3537);
					e2=expression();
					state._fsp--;

					adaptor.addChild(root_1, e2.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = ARROW_T271.startIndex;
					    int endIndex = ARROW_T271.endIndex + 1;
					    Expression key = (e1!=null?((TreePHP.expression_return)e1).expr:null);
					    Expression value = (e2!=null?((TreePHP.expression_return)e2).expr:null); 
					    ArrayElement element = new ArrayElement(startIndex, endIndex, key, value);
					    array_pair_list_stack.peek().list.add(element);
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1973:5: e= expression
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_array_pair_element3550);
					e=expression();
					state._fsp--;

					adaptor.addChild(root_0, e.getTree());


					    int startIndex = (e!=null?((TreePHP.expression_return)e).expr:null).sourceStart();
					    int endIndex = (e!=null?((TreePHP.expression_return)e).expr:null).sourceEnd();
					    Expression expr = (e!=null?((TreePHP.expression_return)e).expr:null);
					    ArrayElement element = new ArrayElement(startIndex, endIndex, expr);
					    array_pair_list_stack.peek().list.add(element);
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "array_pair_element"


	protected static class variable_scope {
		List list;
	}
	protected Stack<variable_scope> variable_stack = new Stack<variable_scope>();

	public static class variable_return extends TreeRuleReturnScope {
		public Expression var;
		public PHPCallArgumentsList parameterList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1983:1: variable returns [Expression var, PHPCallArgumentsList parameterList] : variable_temp ;
	public final TreePHP.variable_return variable() throws RecognitionException {
		variable_stack.push(new variable_scope());
		TreePHP.variable_return retval = new TreePHP.variable_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		TreeRuleReturnScope variable_temp272 =null;



		  variable_stack.peek().list = new LinkedList();

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1990:3: ( variable_temp )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:1990:5: variable_temp
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_variable_temp_in_variable3585);
			variable_temp272=variable_temp();
			state._fsp--;

			adaptor.addChild(root_0, variable_temp272.getTree());


			    Iterator iter = variable_stack.peek().list.iterator();
			    Expression dispatcher = (variable_temp272!=null?((TreePHP.variable_temp_return)variable_temp272).var:null);
			    iter = variable_stack.peek().list.iterator();
			    while (iter.hasNext()) {
			      Expression property = (Expression)iter.next();
			      if (inVarList) {
			        if (variable_list_stack.peek().varList.contains(property)) {
			           variable_list_stack.peek().varList.remove(property);
			        }
			      }
			      dispatcher = createDispatch(dispatcher, property);
			    }
			    retval.var = dispatcher;
			    if (inVarList) {
			      variable_list_stack.peek().varList.add(retval.var);
			    }
			    
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			variable_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class variable_temp_return extends TreeRuleReturnScope {
		public Expression var;
		public PHPCallArgumentsList parameterList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "variable_temp"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2012:1: variable_temp returns [Expression var, PHPCallArgumentsList parameterList] : ( base_variable_with_function_calls | ^( CALL v1= variable_temp obj= object_property ( ctor_arguments )? ) );
	public final TreePHP.variable_temp_return variable_temp() throws RecognitionException {
		TreePHP.variable_temp_return retval = new TreePHP.variable_temp_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST CALL274=null;
		TreeRuleReturnScope v1 =null;
		TreeRuleReturnScope obj =null;
		TreeRuleReturnScope base_variable_with_function_calls273 =null;
		TreeRuleReturnScope ctor_arguments275 =null;

		AST CALL274_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2013:3: ( base_variable_with_function_calls | ^( CALL v1= variable_temp obj= object_property ( ctor_arguments )? ) )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==VAR_DECL) ) {
				alt82=1;
			}
			else if ( (LA82_0==CALL) ) {
				int LA82_2 = input.LA(2);
				if ( (LA82_2==DOWN) ) {
					int LA82_3 = input.LA(3);
					if ( (LA82_3==DOMAIN_T||LA82_3==IDENTIFIER) ) {
						alt82=1;
					}
					else if ( (LA82_3==CALL||LA82_3==VAR_DECL) ) {
						alt82=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 82, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2013:5: base_variable_with_function_calls
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_base_variable_with_function_calls_in_variable_temp3608);
					base_variable_with_function_calls273=base_variable_with_function_calls();
					state._fsp--;

					adaptor.addChild(root_0, base_variable_with_function_calls273.getTree());


					     retval.var = (base_variable_with_function_calls273!=null?((TreePHP.base_variable_with_function_calls_return)base_variable_with_function_calls273).var:null);
					     retval.parameterList = (base_variable_with_function_calls273!=null?((TreePHP.base_variable_with_function_calls_return)base_variable_with_function_calls273).parameterList:null);
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2018:5: ^( CALL v1= variable_temp obj= object_property ( ctor_arguments )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CALL274=(AST)match(input,CALL,FOLLOW_CALL_in_variable_temp3620); 
					CALL274_tree = (AST)adaptor.dupNode(CALL274);


					root_1 = (AST)adaptor.becomeRoot(CALL274_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_variable_temp_in_variable_temp3624);
					v1=variable_temp();
					state._fsp--;

					adaptor.addChild(root_1, v1.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_object_property_in_variable_temp3628);
					obj=object_property();
					state._fsp--;

					adaptor.addChild(root_1, obj.getTree());

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2018:49: ( ctor_arguments )?
					int alt81=2;
					int LA81_0 = input.LA(1);
					if ( (LA81_0==ARGU) ) {
						alt81=1;
					}
					switch (alt81) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2018:49: ctor_arguments
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_ctor_arguments_in_variable_temp3630);
							ctor_arguments275=ctor_arguments();
							state._fsp--;

							adaptor.addChild(root_1, ctor_arguments275.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					      retval.var = (v1!=null?((TreePHP.variable_temp_return)v1).var:null);

					      int startIndex = CALL274.startIndex;
					      int endIndex = CALL274.endIndex + 1;

					      Expression firstVarProperty = null;
					      if ((ctor_arguments275!=null?((TreePHP.ctor_arguments_return)ctor_arguments275).argumentList:null) == null) {
					        firstVarProperty = (obj!=null?((TreePHP.object_property_return)obj).expr:null);
					        if ((obj!=null?((TreePHP.object_property_return)obj).simpleRef:null) != null) {
					          firstVarProperty = (obj!=null?((TreePHP.object_property_return)obj).simpleRef:null);
					        }
					      }
					      else {
					        if ((obj!=null?((TreePHP.object_property_return)obj).simpleRef:null).getClass().equals(SimpleReference.class)) {
					              firstVarProperty = new PHPCallExpression(startIndex, endIndex, null, (obj!=null?((TreePHP.object_property_return)obj).simpleRef:null), (ctor_arguments275!=null?((TreePHP.ctor_arguments_return)ctor_arguments275).argumentList:null));
					            } else {
					              firstVarProperty = new ReflectionCallExpression(startIndex, endIndex, null, (SimpleReference)(obj!=null?((TreePHP.object_property_return)obj).simpleRef:null), (ctor_arguments275!=null?((TreePHP.ctor_arguments_return)ctor_arguments275).argumentList:null));
					            }
					      }
					      
					      variable_stack.peek().list.add(firstVarProperty);
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable_temp"


	public static class base_variable_with_function_calls_return extends TreeRuleReturnScope {
		public Expression var;
		public PHPCallArgumentsList parameterList;
		public TypeReference type;
		public Expression functionInvocation;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "base_variable_with_function_calls"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2044:1: base_variable_with_function_calls returns [Expression var, PHPCallArgumentsList parameterList, TypeReference type, Expression functionInvocation] : ( ^( VAR_DECL ( fully_qualified_class_name )? obj= object_property ( ctor_arguments )? ) | ^( CALL fully_qualified_class_name ctor_arguments ) );
	public final TreePHP.base_variable_with_function_calls_return base_variable_with_function_calls() throws RecognitionException {
		TreePHP.base_variable_with_function_calls_return retval = new TreePHP.base_variable_with_function_calls_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST VAR_DECL276=null;
		AST CALL279=null;
		TreeRuleReturnScope obj =null;
		TreeRuleReturnScope fully_qualified_class_name277 =null;
		TreeRuleReturnScope ctor_arguments278 =null;
		TreeRuleReturnScope fully_qualified_class_name280 =null;
		TreeRuleReturnScope ctor_arguments281 =null;

		AST VAR_DECL276_tree=null;
		AST CALL279_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2045:3: ( ^( VAR_DECL ( fully_qualified_class_name )? obj= object_property ( ctor_arguments )? ) | ^( CALL fully_qualified_class_name ctor_arguments ) )
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==VAR_DECL) ) {
				alt85=1;
			}
			else if ( (LA85_0==CALL) ) {
				alt85=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 85, 0, input);
				throw nvae;
			}

			switch (alt85) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2045:5: ^( VAR_DECL ( fully_qualified_class_name )? obj= object_property ( ctor_arguments )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					VAR_DECL276=(AST)match(input,VAR_DECL,FOLLOW_VAR_DECL_in_base_variable_with_function_calls3656); 
					VAR_DECL276_tree = (AST)adaptor.dupNode(VAR_DECL276);


					root_1 = (AST)adaptor.becomeRoot(VAR_DECL276_tree, root_1);

					match(input, Token.DOWN, null); 
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2045:16: ( fully_qualified_class_name )?
					int alt83=2;
					int LA83_0 = input.LA(1);
					if ( (LA83_0==DOMAIN_T||LA83_0==IDENTIFIER) ) {
						alt83=1;
					}
					switch (alt83) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2045:16: fully_qualified_class_name
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3658);
							fully_qualified_class_name277=fully_qualified_class_name();
							state._fsp--;

							adaptor.addChild(root_1, fully_qualified_class_name277.getTree());

							}
							break;

					}

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_object_property_in_base_variable_with_function_calls3663);
					obj=object_property();
					state._fsp--;

					adaptor.addChild(root_1, obj.getTree());

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2045:64: ( ctor_arguments )?
					int alt84=2;
					int LA84_0 = input.LA(1);
					if ( (LA84_0==ARGU) ) {
						alt84=1;
					}
					switch (alt84) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2045:64: ctor_arguments
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls3665);
							ctor_arguments278=ctor_arguments();
							state._fsp--;

							adaptor.addChild(root_1, ctor_arguments278.getTree());

							}
							break;

					}


					    int startIndex = VAR_DECL276.startIndex;
					    int endIndex = VAR_DECL276.endIndex + 1;
					    retval.var = (obj!=null?((TreePHP.object_property_return)obj).expr:null);
					    TypeReference type = (fully_qualified_class_name277!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name277).type:null);
					    
					    if (type != null) {
					        retval.var = new StaticFieldAccess(startIndex, endIndex, (fully_qualified_class_name277!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name277).type:null), (obj!=null?((TreePHP.object_property_return)obj).expr:null));
					    }
					    
					    if ((ctor_arguments278!=null?((TreePHP.ctor_arguments_return)ctor_arguments278).argumentList:null) != null) {
					      PHPCallArgumentsList parameters = (ctor_arguments278!=null?((TreePHP.ctor_arguments_return)ctor_arguments278).argumentList:null);
					  //    parameters.addNode(retval.var);
					      retval.parameterList = parameters;
					      retval.var = new ReflectionCallExpression(startIndex, endIndex, null, (obj!=null?((TreePHP.object_property_return)obj).expr:null), parameters);
					      
					//      retval.var = new ReflectionStaticMethodInvocation(startIndex, endIndex, type, (obj!=null?((TreePHP.object_property_return)obj).expr:null), parameters);
					    }
					    else {
					      retval.parameterList = new PHPCallArgumentsList();
					      retval.parameterList.setStart(startIndex);
					      retval.parameterList.setEnd(startIndex);
					      
					    }
					  
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2072:5: ^( CALL fully_qualified_class_name ctor_arguments )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					CALL279=(AST)match(input,CALL,FOLLOW_CALL_in_base_variable_with_function_calls3686); 
					CALL279_tree = (AST)adaptor.dupNode(CALL279);


					root_1 = (AST)adaptor.becomeRoot(CALL279_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3688);
					fully_qualified_class_name280=fully_qualified_class_name();
					state._fsp--;

					adaptor.addChild(root_1, fully_qualified_class_name280.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls3690);
					ctor_arguments281=ctor_arguments();
					state._fsp--;

					adaptor.addChild(root_1, ctor_arguments281.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    int startIndex = CALL279.startIndex;
					    int endIndex = CALL279.endIndex + 1;
					    
					    TypeReference type = (fully_qualified_class_name280!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name280).type:null);    
					    PHPCallArgumentsList parameters = (ctor_arguments281!=null?((TreePHP.ctor_arguments_return)ctor_arguments281).argumentList:null);
					    
					    retval.type = type;
					    retval.parameterList = parameters;
					    
					    if ((fully_qualified_class_name280!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name280).simpleRef:null) != null) {
					      retval.var = new StaticMethodInvocation(startIndex, endIndex, (TypeReference)(fully_qualified_class_name280!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name280).type:null), (fully_qualified_class_name280!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name280).simpleRef:null), parameters);
					    }
					    else {
					        int functionNameLeft= ((CommonToken)(fully_qualified_class_name280!=null?((AST)fully_qualified_class_name280.getTree()):null).token).getStartIndex();
					        int functionNameRight= ((CommonToken)(fully_qualified_class_name280!=null?((AST)fully_qualified_class_name280.getTree()):null).token).getStopIndex() + 1;
					        String functionName = (fully_qualified_class_name280!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(fully_qualified_class_name280.start),input.getTreeAdaptor().getTokenStopIndex(fully_qualified_class_name280.start))):null);
					        SimpleReference name = new SimpleReference(functionNameLeft, functionNameRight, functionName);
					        retval.var = new PHPCallExpression(startIndex, endIndex, null, name, parameters);
					      }    
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "base_variable_with_function_calls"


	public static class dollars_return extends TreeRuleReturnScope {
		public int size;
		public String str;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "dollars"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2098:1: dollars returns [int size, String str] : ( DOLLAR_T )* ;
	public final TreePHP.dollars_return dollars() throws RecognitionException {
		TreePHP.dollars_return retval = new TreePHP.dollars_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST DOLLAR_T282=null;

		AST DOLLAR_T282_tree=null;


		  retval.size = 0;
		  retval.str = "";

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2103:3: ( ( DOLLAR_T )* )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2103:5: ( DOLLAR_T )*
			{
			root_0 = (AST)adaptor.nil();


			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2103:5: ( DOLLAR_T )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==DOLLAR_T) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2103:6: DOLLAR_T
					{
					_last = (AST)input.LT(1);
					DOLLAR_T282=(AST)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_dollars3724); 
					DOLLAR_T282_tree = (AST)adaptor.dupNode(DOLLAR_T282);


					adaptor.addChild(root_0, DOLLAR_T282_tree);

					retval.size++; retval.str += (DOLLAR_T282!=null?DOLLAR_T282.getText():null);
					}
					break;

				default :
					break loop86;
				}
			}

			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dollars"


	public static class object_property_return extends TreeRuleReturnScope {
		public String str;
		public Expression expr;
		public SimpleReference simpleRef;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "object_property"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2106:1: object_property returns [String str, Expression expr, SimpleReference simpleRef] : ( ^( VAR dollars IDENTIFIER ) | ^( VAR dollars expression ) | ^( INDEX obj= object_property ( expression )? ) | ^( HASH_INDEX obj= object_property ( expression )? ) );
	public final TreePHP.object_property_return object_property() throws RecognitionException {
		TreePHP.object_property_return retval = new TreePHP.object_property_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST VAR283=null;
		AST IDENTIFIER285=null;
		AST VAR286=null;
		AST INDEX289=null;
		AST HASH_INDEX291=null;
		TreeRuleReturnScope obj =null;
		TreeRuleReturnScope dollars284 =null;
		TreeRuleReturnScope dollars287 =null;
		TreeRuleReturnScope expression288 =null;
		TreeRuleReturnScope expression290 =null;
		TreeRuleReturnScope expression292 =null;

		AST VAR283_tree=null;
		AST IDENTIFIER285_tree=null;
		AST VAR286_tree=null;
		AST INDEX289_tree=null;
		AST HASH_INDEX291_tree=null;


		  int startIndex = -1;
		  int endIndex = -1;
		  AST ast = null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2115:3: ( ^( VAR dollars IDENTIFIER ) | ^( VAR dollars expression ) | ^( INDEX obj= object_property ( expression )? ) | ^( HASH_INDEX obj= object_property ( expression )? ) )
			int alt89=4;
			alt89 = dfa89.predict(input);
			switch (alt89) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2115:5: ^( VAR dollars IDENTIFIER )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					VAR283=(AST)match(input,VAR,FOLLOW_VAR_in_object_property3760); 
					VAR283_tree = (AST)adaptor.dupNode(VAR283);


					root_1 = (AST)adaptor.becomeRoot(VAR283_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_dollars_in_object_property3762);
					dollars284=dollars();
					state._fsp--;

					adaptor.addChild(root_1, dollars284.getTree());

					_last = (AST)input.LT(1);
					IDENTIFIER285=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_object_property3764); 
					IDENTIFIER285_tree = (AST)adaptor.dupNode(IDENTIFIER285);


					adaptor.addChild(root_1, IDENTIFIER285_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					        int size = (dollars284!=null?((TreePHP.dollars_return)dollars284).size:0);
					        
					        retval.str = (IDENTIFIER285!=null?IDENTIFIER285.getText():null);
					        startIndex = ((CommonToken)IDENTIFIER285.token).getStartIndex();
					        endIndex = ((CommonToken)IDENTIFIER285.token).getStopIndex() + 1;

					        if (!(dollars284!=null?((TreePHP.dollars_return)dollars284).str:null).equals("")) {
					          retval.str = "$" + (IDENTIFIER285!=null?IDENTIFIER285.getText():null);
					          startIndex--;
					        }
					        
					        VariableReference variableRef = new VariableReference(startIndex, endIndex, retval.str ,PHPVariableKind.LOCAL);
					        retval.expr = variableRef;
					        
					        retval.simpleRef = new SimpleReference(startIndex, endIndex, retval.str);
					        ast = VAR283_tree;
					        
					        if ((dollars284!=null?((TreePHP.dollars_return)dollars284).size:0) > 1) {
					          for (int i = 0; i < (dollars284!=null?((TreePHP.dollars_return)dollars284).size:0) - 1; i++) {
					                    retval.expr = new ReflectionVariableReference(startIndex - i - 1, endIndex, retval.expr);       
					                  }
					        }
					    
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2140:5: ^( VAR dollars expression )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					VAR286=(AST)match(input,VAR,FOLLOW_VAR_in_object_property3778); 
					VAR286_tree = (AST)adaptor.dupNode(VAR286);


					root_1 = (AST)adaptor.becomeRoot(VAR286_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_dollars_in_object_property3780);
					dollars287=dollars();
					state._fsp--;

					adaptor.addChild(root_1, dollars287.getTree());

					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_expression_in_object_property3782);
					expression288=expression();
					state._fsp--;

					adaptor.addChild(root_1, expression288.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    startIndex = VAR286.startIndex;
					    endIndex = VAR286.endIndex + 1;
					    retval.expr = new ReflectionVariableReference(startIndex, endIndex, (expression288!=null?((TreePHP.expression_return)expression288).expr:null));
					    ast = VAR286_tree;
					  
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2147:5: ^( INDEX obj= object_property ( expression )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					INDEX289=(AST)match(input,INDEX,FOLLOW_INDEX_in_object_property3794); 
					INDEX289_tree = (AST)adaptor.dupNode(INDEX289);


					root_1 = (AST)adaptor.becomeRoot(INDEX289_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_object_property_in_object_property3798);
					obj=object_property();
					state._fsp--;

					adaptor.addChild(root_1, obj.getTree());

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2147:33: ( expression )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==AND_T||LA87_0==ARRAY_DECL||(LA87_0 >= AT_T && LA87_0 <= BIT_OR_T)||LA87_0==CALL||LA87_0==CAST_EXPR||LA87_0==CLONE_T||(LA87_0 >= DIV_EQ && LA87_0 <= DIV_T)||(LA87_0 >= DOT_EQ && LA87_0 <= DOT_T)||(LA87_0 >= EQUAL_EQUAL_EQUAL_T && LA87_0 <= EQUAL_T)||LA87_0==EXPR||LA87_0==INSTANCEOF_T||LA87_0==LE_T||(LA87_0 >= LIST_T && LA87_0 <= LT_T)||(LA87_0 >= ME_T && LA87_0 <= MINUS_EQ)||(LA87_0 >= MINUS_T && LA87_0 <= MUL_T)||(LA87_0 >= NEW_T && LA87_0 <= NOT_EQUAL_T)||LA87_0==OR_T||(LA87_0 >= PERCENT_EQ && LA87_0 <= PLUS_EQ)||LA87_0==PLUS_T||(LA87_0 >= POSTFIX_EXPR && LA87_0 <= POWER_T)||(LA87_0 >= PREFIX_EXPR && LA87_0 <= PRINT_T)||LA87_0==QUESTION_T||LA87_0==REF_T||(LA87_0 >= RMOVE_EQ && LA87_0 <= SCALAR)||(LA87_0 >= UNARY_EXPR && LA87_0 <= UNSET_T)||LA87_0==VAR_DECL||LA87_0==XOR_T) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2147:33: expression
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_expression_in_object_property3800);
							expression290=expression();
							state._fsp--;

							adaptor.addChild(root_1, expression290.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    startIndex = INDEX289.startIndex;
					    endIndex = INDEX289.endIndex + 1;
					   
					   
					    Expression varName = (obj!=null?((TreePHP.object_property_return)obj).expr:null);
					    Expression index = (expression290!=null?((TreePHP.expression_return)expression290).expr:null);
					    if ((expression290!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(expression290.start),input.getTreeAdaptor().getTokenStopIndex(expression290.start))):null) != null) {
					      if(varName.getKind() == ExpressionConstants.E_IDENTIFIER) {
					         retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableRefEnum.ARRAY);
					      } else {
					         retval.expr = new ReflectionArrayVariableReference(startIndex, endIndex, varName, index, ReflectionArrayEnum.ARRAY);
					      }
					    }
					    else {
					       retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableRefEnum.ARRAY);
					    }
					    ast = INDEX289_tree;
					  
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2167:5: ^( HASH_INDEX obj= object_property ( expression )? )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					{
					AST _save_last_1 = _last;
					AST _first_1 = null;
					AST root_1 = (AST)adaptor.nil();
					_last = (AST)input.LT(1);
					HASH_INDEX291=(AST)match(input,HASH_INDEX,FOLLOW_HASH_INDEX_in_object_property3813); 
					HASH_INDEX291_tree = (AST)adaptor.dupNode(HASH_INDEX291);


					root_1 = (AST)adaptor.becomeRoot(HASH_INDEX291_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_object_property_in_object_property3817);
					obj=object_property();
					state._fsp--;

					adaptor.addChild(root_1, obj.getTree());

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2167:38: ( expression )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==AND_T||LA88_0==ARRAY_DECL||(LA88_0 >= AT_T && LA88_0 <= BIT_OR_T)||LA88_0==CALL||LA88_0==CAST_EXPR||LA88_0==CLONE_T||(LA88_0 >= DIV_EQ && LA88_0 <= DIV_T)||(LA88_0 >= DOT_EQ && LA88_0 <= DOT_T)||(LA88_0 >= EQUAL_EQUAL_EQUAL_T && LA88_0 <= EQUAL_T)||LA88_0==EXPR||LA88_0==INSTANCEOF_T||LA88_0==LE_T||(LA88_0 >= LIST_T && LA88_0 <= LT_T)||(LA88_0 >= ME_T && LA88_0 <= MINUS_EQ)||(LA88_0 >= MINUS_T && LA88_0 <= MUL_T)||(LA88_0 >= NEW_T && LA88_0 <= NOT_EQUAL_T)||LA88_0==OR_T||(LA88_0 >= PERCENT_EQ && LA88_0 <= PLUS_EQ)||LA88_0==PLUS_T||(LA88_0 >= POSTFIX_EXPR && LA88_0 <= POWER_T)||(LA88_0 >= PREFIX_EXPR && LA88_0 <= PRINT_T)||LA88_0==QUESTION_T||LA88_0==REF_T||(LA88_0 >= RMOVE_EQ && LA88_0 <= SCALAR)||(LA88_0 >= UNARY_EXPR && LA88_0 <= UNSET_T)||LA88_0==VAR_DECL||LA88_0==XOR_T) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2167:38: expression
							{
							_last = (AST)input.LT(1);
							pushFollow(FOLLOW_expression_in_object_property3819);
							expression292=expression();
							state._fsp--;

							adaptor.addChild(root_1, expression292.getTree());

							}
							break;

					}

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}



					    startIndex = HASH_INDEX291.startIndex;
					    endIndex = HASH_INDEX291.endIndex + 1;
					   
					    if (startIndex == 0 && (expression292!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(expression292.start),input.getTreeAdaptor().getTokenStopIndex(expression292.start))):null) != null) {
					       startIndex = (obj!=null?((AST)obj.getTree()):null).startIndex;
					       endIndex = (obj!=null?((AST)obj.getTree()):null).endIndex + (expression292!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(expression292.start),input.getTreeAdaptor().getTokenStopIndex(expression292.start))):null).length();
					    }
					    Expression varName = (obj!=null?((TreePHP.object_property_return)obj).expr:null);
					    Expression index = (expression292!=null?((TreePHP.expression_return)expression292).expr:null);
					    if ((expression292!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(expression292.start),input.getTreeAdaptor().getTokenStopIndex(expression292.start))):null) != null) {
					      if(varName.getKind() == ExpressionConstants.E_IDENTIFIER) {
					         retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableRefEnum.HASHTABLE);
					      } else {
					         retval.expr = new ReflectionArrayVariableReference(startIndex, endIndex, varName, index, ReflectionArrayEnum.HASHTABLE);
					      }
					    }
					    else {
					       retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableRefEnum.HASHTABLE);
					    }
					    ast = HASH_INDEX291_tree;
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);


			  retval.tree = ((AST)retval.start);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "object_property"


	public static class ctor_arguments_return extends TreeRuleReturnScope {
		public PHPCallArgumentsList argumentList;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "ctor_arguments"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2193:1: ctor_arguments returns [PHPCallArgumentsList argumentList] : ^( ARGU ( expr_list )? ) ;
	public final TreePHP.ctor_arguments_return ctor_arguments() throws RecognitionException {
		TreePHP.ctor_arguments_return retval = new TreePHP.ctor_arguments_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST ARGU293=null;
		TreeRuleReturnScope expr_list294 =null;

		AST ARGU293_tree=null;


		  AST ast = null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2200:3: ( ^( ARGU ( expr_list )? ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2200:6: ^( ARGU ( expr_list )? )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			ARGU293=(AST)match(input,ARGU,FOLLOW_ARGU_in_ctor_arguments3859); 
			ARGU293_tree = (AST)adaptor.dupNode(ARGU293);


			root_1 = (AST)adaptor.becomeRoot(ARGU293_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2200:13: ( expr_list )?
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==AND_T||LA90_0==ARRAY_DECL||(LA90_0 >= AT_T && LA90_0 <= BIT_OR_T)||LA90_0==CALL||LA90_0==CAST_EXPR||LA90_0==CLONE_T||(LA90_0 >= DIV_EQ && LA90_0 <= DIV_T)||(LA90_0 >= DOT_EQ && LA90_0 <= DOT_T)||(LA90_0 >= EQUAL_EQUAL_EQUAL_T && LA90_0 <= EQUAL_T)||LA90_0==EXPR||LA90_0==INSTANCEOF_T||LA90_0==LE_T||(LA90_0 >= LIST_T && LA90_0 <= LT_T)||(LA90_0 >= ME_T && LA90_0 <= MINUS_EQ)||(LA90_0 >= MINUS_T && LA90_0 <= MUL_T)||(LA90_0 >= NEW_T && LA90_0 <= NOT_EQUAL_T)||LA90_0==OR_T||(LA90_0 >= PERCENT_EQ && LA90_0 <= PLUS_EQ)||LA90_0==PLUS_T||(LA90_0 >= POSTFIX_EXPR && LA90_0 <= POWER_T)||(LA90_0 >= PREFIX_EXPR && LA90_0 <= PRINT_T)||LA90_0==QUESTION_T||LA90_0==REF_T||(LA90_0 >= RMOVE_EQ && LA90_0 <= SCALAR)||(LA90_0 >= UNARY_EXPR && LA90_0 <= UNSET_T)||LA90_0==VAR_DECL||LA90_0==XOR_T) ) {
					alt90=1;
				}
				switch (alt90) {
					case 1 :
						// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2200:13: expr_list
						{
						_last = (AST)input.LT(1);
						pushFollow(FOLLOW_expr_list_in_ctor_arguments3861);
						expr_list294=expr_list();
						state._fsp--;

						adaptor.addChild(root_1, expr_list294.getTree());

						}
						break;

				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    int startIndex = ARGU293.startIndex + 1;
			    int endIndex = ARGU293.endIndex;

			      retval.argumentList = new PHPCallArgumentsList();
			      retval.argumentList.setStart(startIndex);
			      retval.argumentList.setEnd(endIndex);
			      
			      if ((expr_list294!=null?((TreePHP.expr_list_return)expr_list294).exprList:null) != null) {
			        Iterator iter = (expr_list294!=null?((TreePHP.expr_list_return)expr_list294).exprList:null).iterator();
			        while (iter.hasNext()) {
			          retval.argumentList.addNode((Expression)iter.next());
			        }
			      }
			      ast = ARGU293;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);


			  retval.tree = ast;

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ctor_arguments"


	public static class pure_variable_return extends TreeRuleReturnScope {
		public String str;
		public Boolean isRef;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "pure_variable"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2219:1: pure_variable returns [String str, Boolean isRef] : ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) ;
	public final TreePHP.pure_variable_return pure_variable() throws RecognitionException {
		TreePHP.pure_variable_return retval = new TreePHP.pure_variable_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST VAR_DECL295=null;
		AST REF_T296=null;
		AST DOLLAR_T297=null;
		AST IDENTIFIER298=null;

		AST VAR_DECL295_tree=null;
		AST REF_T296_tree=null;
		AST DOLLAR_T297_tree=null;
		AST IDENTIFIER298_tree=null;


		  AST ast;
		  retval.isRef = false;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2227:3: ( ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2227:5: ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			VAR_DECL295=(AST)match(input,VAR_DECL,FOLLOW_VAR_DECL_in_pure_variable3897); 
			VAR_DECL295_tree = (AST)adaptor.dupNode(VAR_DECL295);


			root_1 = (AST)adaptor.becomeRoot(VAR_DECL295_tree, root_1);

			match(input, Token.DOWN, null); 
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2227:16: ( REF_T )?
			int alt91=2;
			int LA91_0 = input.LA(1);
			if ( (LA91_0==REF_T) ) {
				alt91=1;
			}
			switch (alt91) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2227:16: REF_T
					{
					_last = (AST)input.LT(1);
					REF_T296=(AST)match(input,REF_T,FOLLOW_REF_T_in_pure_variable3899); 
					REF_T296_tree = (AST)adaptor.dupNode(REF_T296);


					adaptor.addChild(root_1, REF_T296_tree);

					}
					break;

			}

			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2227:23: ( DOLLAR_T )+
			int cnt92=0;
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==DOLLAR_T) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2227:23: DOLLAR_T
					{
					_last = (AST)input.LT(1);
					DOLLAR_T297=(AST)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_pure_variable3902); 
					DOLLAR_T297_tree = (AST)adaptor.dupNode(DOLLAR_T297);


					adaptor.addChild(root_1, DOLLAR_T297_tree);

					}
					break;

				default :
					if ( cnt92 >= 1 ) break loop92;
					EarlyExitException eee = new EarlyExitException(92, input);
					throw eee;
				}
				cnt92++;
			}

			_last = (AST)input.LT(1);
			IDENTIFIER298=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pure_variable3905); 
			IDENTIFIER298_tree = (AST)adaptor.dupNode(IDENTIFIER298);


			adaptor.addChild(root_1, IDENTIFIER298_tree);

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    if ((REF_T296!=null?REF_T296.getText():null) != null) {
			      retval.isRef = true;
			    }
			    retval.str = "$" + (IDENTIFIER298!=null?IDENTIFIER298.getText():null);
			    ast = VAR_DECL295;
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);


			  retval.tree = ast;

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pure_variable"


	public static class scalar_return extends TreeRuleReturnScope {
		public Expression expr;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "scalar"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2237:1: scalar returns [Expression expr] : ^( SCALAR constant ) ;
	public final TreePHP.scalar_return scalar() throws RecognitionException {
		TreePHP.scalar_return retval = new TreePHP.scalar_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST SCALAR299=null;
		TreeRuleReturnScope constant300 =null;

		AST SCALAR299_tree=null;


		  AST ast = null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2244:3: ( ^( SCALAR constant ) )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2244:5: ^( SCALAR constant )
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			{
			AST _save_last_1 = _last;
			AST _first_1 = null;
			AST root_1 = (AST)adaptor.nil();
			_last = (AST)input.LT(1);
			SCALAR299=(AST)match(input,SCALAR,FOLLOW_SCALAR_in_scalar3938); 
			SCALAR299_tree = (AST)adaptor.dupNode(SCALAR299);


			root_1 = (AST)adaptor.becomeRoot(SCALAR299_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (AST)input.LT(1);
			pushFollow(FOLLOW_constant_in_scalar3940);
			constant300=constant();
			state._fsp--;

			adaptor.addChild(root_1, constant300.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}



			    if ((constant300!=null?((TreePHP.constant_return)constant300).expr:null) != null ) {
			      retval.expr = (constant300!=null?((TreePHP.constant_return)constant300).expr:null);
			    }
			    else {
			      retval.expr = (constant300!=null?((TreePHP.constant_return)constant300).scalar:null);
			    }
			    ast = (constant300!=null?((AST)constant300.getTree()):null);
			  
			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scalar"


	public static class constant_return extends TreeRuleReturnScope {
		public Scalar scalar;
		public Expression expr;
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "constant"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2256:1: constant returns [Scalar scalar, Expression expr] : ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | REALLITERAL | DOUBLELITERRAL | common_scalar | IDENTIFIER | fully_qualified_class_name | HEREDOC_START (id1= IDENTIFIER ) );
	public final TreePHP.constant_return constant() throws RecognitionException {
		TreePHP.constant_return retval = new TreePHP.constant_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST id1=null;
		AST INTLITERAL301=null;
		AST FLOATLITERAL302=null;
		AST STRINGLITERAL303=null;
		AST REALLITERAL304=null;
		AST DOUBLELITERRAL305=null;
		AST IDENTIFIER307=null;
		AST HEREDOC_START309=null;
		TreeRuleReturnScope common_scalar306 =null;
		TreeRuleReturnScope fully_qualified_class_name308 =null;

		AST id1_tree=null;
		AST INTLITERAL301_tree=null;
		AST FLOATLITERAL302_tree=null;
		AST STRINGLITERAL303_tree=null;
		AST REALLITERAL304_tree=null;
		AST DOUBLELITERRAL305_tree=null;
		AST IDENTIFIER307_tree=null;
		AST HEREDOC_START309_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2257:3: ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | REALLITERAL | DOUBLELITERRAL | common_scalar | IDENTIFIER | fully_qualified_class_name | HEREDOC_START (id1= IDENTIFIER ) )
			int alt93=9;
			switch ( input.LA(1) ) {
			case INTLITERAL:
				{
				alt93=1;
				}
				break;
			case FLOATLITERAL:
				{
				alt93=2;
				}
				break;
			case STRINGLITERAL:
				{
				alt93=3;
				}
				break;
			case REALLITERAL:
				{
				alt93=4;
				}
				break;
			case DOUBLELITERRAL:
				{
				alt93=5;
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
				alt93=6;
				}
				break;
			case IDENTIFIER:
				{
				alt93=7;
				}
				break;
			case DOMAIN_T:
				{
				alt93=8;
				}
				break;
			case HEREDOC_START:
				{
				alt93=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 93, 0, input);
				throw nvae;
			}
			switch (alt93) {
				case 1 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2257:7: INTLITERAL
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					INTLITERAL301=(AST)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_constant3966); 
					INTLITERAL301_tree = (AST)adaptor.dupNode(INTLITERAL301);


					adaptor.addChild(root_0, INTLITERAL301_tree);


					    CommonToken token = (CommonToken)INTLITERAL301.token;
					    int startIndex = token.getStartIndex();
					    int endIndex = token.getStopIndex() + 1;
					    retval.scalar = new Scalar(startIndex, endIndex, (INTLITERAL301!=null?INTLITERAL301.getText():null), ScalarEnum.INT);
					  
					}
					break;
				case 2 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2264:7: FLOATLITERAL
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					FLOATLITERAL302=(AST)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_constant3978); 
					FLOATLITERAL302_tree = (AST)adaptor.dupNode(FLOATLITERAL302);


					adaptor.addChild(root_0, FLOATLITERAL302_tree);


					    CommonToken token = (CommonToken)FLOATLITERAL302.token;
					    int startIndex = token.getStartIndex();
					    int endIndex = token.getStopIndex() + 1;
					    retval.scalar = new Scalar(startIndex, endIndex, (FLOATLITERAL302!=null?FLOATLITERAL302.getText():null), ScalarEnum.REAL);
					  
					}
					break;
				case 3 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2271:7: STRINGLITERAL
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					STRINGLITERAL303=(AST)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_constant3990); 
					STRINGLITERAL303_tree = (AST)adaptor.dupNode(STRINGLITERAL303);


					adaptor.addChild(root_0, STRINGLITERAL303_tree);


					    CommonToken token = (CommonToken)STRINGLITERAL303.token;
					    int startIndex = token.getStartIndex();
					    int endIndex = token.getStopIndex() + 1;
					    retval.scalar = new Scalar(startIndex, endIndex, (STRINGLITERAL303!=null?STRINGLITERAL303.getText():null), ScalarEnum.STRING);
					  
					}
					break;
				case 4 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2288:7: REALLITERAL
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					REALLITERAL304=(AST)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_constant4012); 
					REALLITERAL304_tree = (AST)adaptor.dupNode(REALLITERAL304);


					adaptor.addChild(root_0, REALLITERAL304_tree);


					    CommonToken token = (CommonToken)REALLITERAL304.token;
					    int startIndex = token.getStartIndex();
					    int endIndex = token.getStopIndex() + 1;
					    retval.scalar = new Scalar(startIndex, endIndex, (REALLITERAL304!=null?REALLITERAL304.getText():null), ScalarEnum.REAL);
					  
					}
					break;
				case 5 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2296:7: DOUBLELITERRAL
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					DOUBLELITERRAL305=(AST)match(input,DOUBLELITERRAL,FOLLOW_DOUBLELITERRAL_in_constant4027); 
					DOUBLELITERRAL305_tree = (AST)adaptor.dupNode(DOUBLELITERRAL305);


					adaptor.addChild(root_0, DOUBLELITERRAL305_tree);


					    CommonToken token = (CommonToken)DOUBLELITERRAL305.token;
					    int startIndex = token.getStartIndex();
					    int endIndex = token.getStopIndex() + 1;
					    retval.scalar = new Scalar(startIndex, endIndex, (DOUBLELITERRAL305!=null?DOUBLELITERRAL305.getText():null), ScalarEnum.REAL);
					  
					}
					break;
				case 6 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2303:7: common_scalar
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_common_scalar_in_constant4039);
					common_scalar306=common_scalar();
					state._fsp--;

					adaptor.addChild(root_0, common_scalar306.getTree());


					      CommonToken token = (CommonToken)(common_scalar306!=null?((AST)common_scalar306.getTree()):null).token;
					      int startIndex = token.getStartIndex();
					      int endIndex = token.getStopIndex() + 1;
					      retval.scalar = new Scalar(startIndex, endIndex, (common_scalar306!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(common_scalar306.start),input.getTreeAdaptor().getTokenStopIndex(common_scalar306.start))):null), ScalarEnum.SYSTEM);
					  
					}
					break;
				case 7 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2310:7: IDENTIFIER
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					IDENTIFIER307=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant4051); 
					IDENTIFIER307_tree = (AST)adaptor.dupNode(IDENTIFIER307);


					adaptor.addChild(root_0, IDENTIFIER307_tree);


					      CommonToken token = (CommonToken)IDENTIFIER307.token;
					        int startIndex = token.getStartIndex();
					        int endIndex = token.getStopIndex() + 1;
					        retval.scalar = new Scalar(startIndex, endIndex, (IDENTIFIER307!=null?IDENTIFIER307.getText():null), ScalarEnum.STRING);
					  
					}
					break;
				case 8 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2317:7: fully_qualified_class_name
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					pushFollow(FOLLOW_fully_qualified_class_name_in_constant4063);
					fully_qualified_class_name308=fully_qualified_class_name();
					state._fsp--;

					adaptor.addChild(root_0, fully_qualified_class_name308.getTree());


					      if ((fully_qualified_class_name308!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name308).constant:null) != null) {
					        retval.expr = (fully_qualified_class_name308!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name308).constant:null);
					      }
					      else {
					        retval.expr = (fully_qualified_class_name308!=null?((TreePHP.fully_qualified_class_name_return)fully_qualified_class_name308).type:null);
					      }
					  
					}
					break;
				case 9 :
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2326:6: HEREDOC_START (id1= IDENTIFIER )
					{
					root_0 = (AST)adaptor.nil();


					_last = (AST)input.LT(1);
					HEREDOC_START309=(AST)match(input,HEREDOC_START,FOLLOW_HEREDOC_START_in_constant4074); 
					HEREDOC_START309_tree = (AST)adaptor.dupNode(HEREDOC_START309);


					adaptor.addChild(root_0, HEREDOC_START309_tree);

					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2326:20: (id1= IDENTIFIER )
					// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2326:21: id1= IDENTIFIER
					{
					_last = (AST)input.LT(1);
					id1=(AST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant4079); 
					id1_tree = (AST)adaptor.dupNode(id1);


					adaptor.addChild(root_0, id1_tree);

					}


					    System.out.println("ID: " + (id1!=null?id1.getText():null));
					    CommonToken token = (CommonToken)HEREDOC_START309.token;
					    int startIndex = token.getStartIndex();
					    int endIndex = token.getStopIndex();
					    List list = new LinkedList();
					    list.add(new Scalar( ((CommonToken)id1.token).getStartIndex(), ((CommonToken)id1.token).getStopIndex(), (id1!=null?id1.getText():null), ScalarEnum.STRING));
					    retval.expr = new ComplexQuote(startIndex, endIndex, list, ComplexQuote.HEREDOC);
					  
					}
					break;

			}
			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constant"


	public static class common_scalar_return extends TreeRuleReturnScope {
		AST tree;
		@Override
		public AST getTree() { return tree; }
	};


	// $ANTLR start "common_scalar"
	// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2369:1: common_scalar : ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' );
	public final TreePHP.common_scalar_return common_scalar() throws RecognitionException {
		TreePHP.common_scalar_return retval = new TreePHP.common_scalar_return();
		retval.start = input.LT(1);

		AST root_0 = null;

		AST _first_0 = null;
		AST _last = null;


		AST set310=null;

		AST set310_tree=null;

		try {
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:2370:3: ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' )
			// /Users/jseaidoun/Documents/Personal/Projects/GraphDependency/GraphDependency/Resources/php53/TreePHP.g:
			{
			root_0 = (AST)adaptor.nil();


			_last = (AST)input.LT(1);
			set310=(AST)input.LT(1);
			if ( (input.LA(1) >= 176 && input.LA(1) <= 182) ) {
				input.consume();
				set310_tree = (AST)adaptor.dupNode(set310);


				adaptor.addChild(root_0, set310_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (AST)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "common_scalar"

	// Delegated rules


	protected DFA89 dfa89 = new DFA89(this);
	static final String DFA89_eotS =
		"\10\uffff";
	static final String DFA89_eofS =
		"\10\uffff";
	static final String DFA89_minS =
		"\1\106\1\2\2\uffff\2\4\2\uffff";
	static final String DFA89_maxS =
		"\1\u00ab\1\2\2\uffff\2\u00af\2\uffff";
	static final String DFA89_acceptS =
		"\2\uffff\1\3\1\4\2\uffff\1\1\1\2";
	static final String DFA89_specialS =
		"\10\uffff}>";
	static final String[] DFA89_transitionS = {
			"\1\3\12\uffff\1\2\131\uffff\1\1",
			"\1\4",
			"",
			"",
			"\1\7\1\uffff\1\7\3\uffff\5\7\2\uffff\1\7\3\uffff\1\7\3\uffff\1\7\10"+
			"\uffff\2\7\1\5\1\uffff\2\7\17\uffff\3\7\1\uffff\1\7\20\uffff\1\6\5\uffff"+
			"\1\7\12\uffff\1\7\3\uffff\6\7\3\uffff\2\7\1\uffff\4\7\3\uffff\3\7\1\uffff"+
			"\1\7\1\uffff\3\7\1\uffff\1\7\1\uffff\3\7\1\uffff\2\7\1\uffff\1\7\1\uffff"+
			"\1\7\6\uffff\3\7\23\uffff\2\7\4\uffff\1\7\2\uffff\1\7",
			"\1\7\1\uffff\1\7\3\uffff\5\7\2\uffff\1\7\3\uffff\1\7\3\uffff\1\7\10"+
			"\uffff\2\7\1\5\1\uffff\2\7\17\uffff\3\7\1\uffff\1\7\20\uffff\1\6\5\uffff"+
			"\1\7\12\uffff\1\7\3\uffff\6\7\3\uffff\2\7\1\uffff\4\7\3\uffff\3\7\1\uffff"+
			"\1\7\1\uffff\3\7\1\uffff\1\7\1\uffff\3\7\1\uffff\2\7\1\uffff\1\7\1\uffff"+
			"\1\7\6\uffff\3\7\23\uffff\2\7\4\uffff\1\7\2\uffff\1\7",
			"",
			""
	};

	static final short[] DFA89_eot = DFA.unpackEncodedString(DFA89_eotS);
	static final short[] DFA89_eof = DFA.unpackEncodedString(DFA89_eofS);
	static final char[] DFA89_min = DFA.unpackEncodedStringToUnsignedChars(DFA89_minS);
	static final char[] DFA89_max = DFA.unpackEncodedStringToUnsignedChars(DFA89_maxS);
	static final short[] DFA89_accept = DFA.unpackEncodedString(DFA89_acceptS);
	static final short[] DFA89_special = DFA.unpackEncodedString(DFA89_specialS);
	static final short[][] DFA89_transition;

	static {
		int numStates = DFA89_transitionS.length;
		DFA89_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA89_transition[i] = DFA.unpackEncodedString(DFA89_transitionS[i]);
		}
	}

	protected class DFA89 extends DFA {

		public DFA89(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 89;
			this.eot = DFA89_eot;
			this.eof = DFA89_eof;
			this.min = DFA89_min;
			this.max = DFA89_max;
			this.accept = DFA89_accept;
			this.special = DFA89_special;
			this.transition = DFA89_transition;
		}
		@Override
		public String getDescription() {
			return "2106:1: object_property returns [String str, Expression expr, SimpleReference simpleRef] : ( ^( VAR dollars IDENTIFIER ) | ^( VAR dollars expression ) | ^( INDEX obj= object_property ( expression )? ) | ^( HASH_INDEX obj= object_property ( expression )? ) );";
		}
	}

	public static final BitSet FOLLOW_ModuleDeclaration_in_php_source58 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_top_statement_list_in_php_source60 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_top_statement_in_top_statement_list79 = new BitSet(new long[]{0x0000000001000002L,0x0008020000080000L,0x0080000402000000L});
	public static final BitSet FOLLOW_statement_in_top_statement93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_statement_in_top_statement103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_declaration_statement_in_top_statement113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_halt_compiler_statement_in_top_statement123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NAMESPACE_T_in_top_statement130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_top_statement132 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_inner_statement_in_inner_statement_list160 = new BitSet(new long[]{0x0000000001000002L,0x0000020000080000L,0x0080000402000000L});
	public static final BitSet FOLLOW_statement_in_inner_statement182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_declaration_statement_in_inner_statement192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_class_declaration_statement_in_inner_statement202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_halt_compiler_statement_in_inner_statement212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_183_in_halt_compiler_statement227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_T_in_class_declaration_statement247 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_class_entr_type_in_class_declaration_statement249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement252 = new BitSet(new long[]{0x1000000000800008L,0x0000000000004000L});
	public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement266 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_class_declaration_statement268 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IMPLEMENTS_T_in_class_declaration_statement275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_BODY_in_class_declaration_statement290 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_class_statement_list_in_class_declaration_statement292 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTERFACE_T_in_class_declaration_statement309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement311 = new BitSet(new long[]{0x1000000000800008L});
	public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement315 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement317 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_BODY_in_class_declaration_statement336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_class_statement_list_in_class_declaration_statement338 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRAIT_T_in_class_declaration_statement355 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement357 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000100000000L});
	public static final BitSet FOLLOW_TRAIT_BODY_in_class_declaration_statement361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_class_statement_list_in_class_declaration_statement363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_class_statement_in_class_statement_list411 = new BitSet(new long[]{0x8000000000000002L,0x0000020000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_FIELD_DECL_in_class_statement436 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_modifiers_in_class_statement440 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_static_var_element_in_class_statement442 = new BitSet(new long[]{0x0200000000000008L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_METHOD_DECL_in_class_statement457 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_modifier_in_class_statement459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L,0x0000000000000200L});
	public static final BitSet FOLLOW_REF_T_in_class_statement461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_class_statement464 = new BitSet(new long[]{0x0000800000008000L,0x0200000000000000L});
	public static final BitSet FOLLOW_parameter_list_in_class_statement478 = new BitSet(new long[]{0x0000800000008000L});
	public static final BitSet FOLLOW_block_in_class_statement494 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EMPTYSTATEMENT_in_class_statement513 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FIELD_DECL_in_class_statement536 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONST_T_in_class_statement540 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_directive_in_class_statement542 = new BitSet(new long[]{0x0200000000000008L});
	public static final BitSet FOLLOW_USE_DECL_in_class_statement557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_statement561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
	public static final BitSet FOLLOW_trait_adaptations_in_class_statement563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRAIT_T_in_trait_adaptations585 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_trait_adaptation_in_trait_adaptations587 = new BitSet(new long[]{0x0000000000000008L,0x0000000000040000L,0x0000000200000000L});
	public static final BitSet FOLLOW_INSTANCEOF_T_in_trait_adaptation603 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_trait_adaptation605 = new BitSet(new long[]{0x0000002000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_list_in_trait_adaptation607 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRAIT_METH_in_trait_adaptation615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_trait_adaptation617 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_AS_T_in_trait_adaptation619 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L,0x2100000008000000L,0x000000000000000EL});
	public static final BitSet FOLLOW_modifier_in_trait_adaptation621 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_trait_adaptation624 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECL_in_function_declaration_statement644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_REF_T_in_function_declaration_statement646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration_statement649 = new BitSet(new long[]{0x0000000000008000L,0x0200000000000000L});
	public static final BitSet FOLLOW_parameter_list_in_function_declaration_statement658 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_block_in_function_declaration_statement671 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_in_block706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inner_statement_list_in_block708 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STATEMENT_in_statement737 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_topStatement_in_statement739 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_block_in_topStatement770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stat_in_topStatement781 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_T_in_topStatement792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONDITION_in_topStatement795 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement799 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_while_statement_in_topStatement802 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DO_T_in_topStatement817 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONDITION_in_topStatement820 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement824 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_statement_in_topStatement827 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FOR_T_in_topStatement839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_list_in_topStatement843 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_CONDITION_in_topStatement847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_list_in_topStatement851 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ITERATE_in_topStatement856 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_list_in_topStatement860 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_for_statement_in_topStatement866 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SWITCH_T_in_topStatement878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONDITION_in_topStatement881 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement885 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_switch_case_list_in_topStatement888 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BREAK_T_in_topStatement900 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement902 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONTINUE_T_in_topStatement915 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement919 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RETURN_T_in_topStatement932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement936 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_GLOBAL_T_in_topStatement949 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_list_in_topStatement951 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_STATIC_T_in_topStatement963 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_static_var_list_in_topStatement965 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ECHO_T_in_topStatement977 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_list_in_topStatement979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EMPTYSTATEMENT_in_topStatement991 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_COLON_in_topStatement993 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_topStatement1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOREACH_T_in_topStatement1015 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AS_T_in_topStatement1018 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement1022 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000100000000200L});
	public static final BitSet FOLLOW_foreach_variable_in_topStatement1026 = new BitSet(new long[]{0x0000000000020008L,0x0000000000000000L,0x0000100000000200L});
	public static final BitSet FOLLOW_foreach_variable_in_topStatement1030 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_foreach_statement_in_topStatement1034 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DECLARE_T_in_topStatement1047 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_directive_in_topStatement1049 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_declare_statement_in_topStatement1051 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRY_T_in_topStatement1067 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_block_in_topStatement1069 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_catch_branch_list_in_topStatement1071 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_THROW_T_in_topStatement1083 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement1087 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_USE_T_in_topStatement1099 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_scalar_in_topStatement1101 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_USE_PARETHESIS_T_in_topStatement1113 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_scalar_in_topStatement1115 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INCLUDE_T_in_topStatement1127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement1131 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INCLUDE_ONCE_T_in_topStatement1144 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement1148 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REQUIRE_T_in_topStatement1161 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement1165 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REQUIRE_ONCE_T_in_topStatement1178 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_topStatement1182 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REF_T_in_foreach_variable1213 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_variable_in_foreach_variable1216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_variable_list1276 = new BitSet(new long[]{0x0000000000020002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1314 = new BitSet(new long[]{0x0000002000000002L,0x0000000000001000L});
	public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name1341 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name1345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name1347 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name1361 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_static_var_element_in_static_var_list1397 = new BitSet(new long[]{0x0200000000000002L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_pure_variable_in_static_var_element1415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQUAL_T_in_static_var_element1426 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_pure_variable_in_static_var_element1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_scalar_in_static_var_element1430 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IF_T_in_if_stat1464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONDITION_in_if_stat1468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_if_stat1470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_inner_statement_list_in_if_stat1486 = new BitSet(new long[]{0x0000600000000008L});
	public static final BitSet FOLLOW_else_if_stat_in_if_stat1495 = new BitSet(new long[]{0x0000600000000008L});
	public static final BitSet FOLLOW_ELSE_T_in_if_stat1500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_if_stat1502 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ELSEIF_T_in_else_if_stat1532 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONDITION_in_else_if_stat1535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_else_if_stat1537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_inner_statement_list_in_else_if_stat1540 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_case_list_in_switch_case_list1574 = new BitSet(new long[]{0x0000000200080002L});
	public static final BitSet FOLLOW_CASE_T_in_case_list1593 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_case_list1597 = new BitSet(new long[]{0x0000000001000008L,0x0000020000080000L,0x0080000402000000L});
	public static final BitSet FOLLOW_inner_statement_list_in_case_list1599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEFAULT_T_in_case_list1614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inner_statement_list_in_case_list1616 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_catch_branch_in_catch_branch_list1650 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_CATCH_T_in_catch_branch1672 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_catch_branch1674 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_variable_in_catch_branch1676 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_block_in_catch_branch1678 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_inner_statement_list_in_for_statement1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_statement_list_in_while_statement1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inner_statement_list_in_foreach_statement1747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_declare_statement1774 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_inner_statement_list_in_declare_statement1776 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_parameter_in_parameter_list1812 = new BitSet(new long[]{0x0000000000000002L,0x0200000000000000L});
	public static final BitSet FOLLOW_PARAMETER_in_parameter1833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_parameter1837 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_parameter_type_in_parameter1839 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONST_T_in_parameter1844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_pure_variable_in_parameter1847 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_scalar_in_parameter1849 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_parameter_type1874 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cast_option_in_parameter_type1884 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_198_in_variable_modifiers1902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_modifier_in_variable_modifiers1908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_195_in_modifier1936 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2100000008000000L,0x000000000000000EL});
	public static final BitSet FOLLOW_194_in_modifier1944 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2100000008000000L,0x000000000000000EL});
	public static final BitSet FOLLOW_193_in_modifier1952 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2100000008000000L,0x000000000000000EL});
	public static final BitSet FOLLOW_STATIC_T_in_modifier1960 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2100000008000000L,0x000000000000000EL});
	public static final BitSet FOLLOW_184_in_modifier1969 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2100000008000000L,0x000000000000000EL});
	public static final BitSet FOLLOW_189_in_modifier1978 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x2100000008000000L,0x000000000000000EL});
	public static final BitSet FOLLOW_EQUAL_T_in_directive2010 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_IDENTIFIER_in_directive2012 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_directive2014 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_expr_list2051 = new BitSet(new long[]{0x0B8000CC02227C52L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_EXPR_in_expression2085 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2089 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OR_T_in_expression2101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2105 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2109 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_XOR_T_in_expression2121 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2125 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2129 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AND_T_in_expression2141 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2145 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUAL_T_in_expression2161 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2165 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2169 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_EQ_in_expression2182 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2186 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2190 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_EQ_in_expression2202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2206 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2210 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_EQ_in_expression2222 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2226 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2230 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_EQ_in_expression2242 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2246 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2250 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_EQ_in_expression2262 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2266 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2270 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PERCENT_EQ_in_expression2282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2286 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIT_AND_EQ_in_expression2302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2306 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2310 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIT_OR_EQ_in_expression2322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2326 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2330 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POWER_EQ_in_expression2342 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2346 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2350 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LMOVE_EQ_in_expression2362 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2366 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2370 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RMOVE_EQ_in_expression2382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2386 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QUESTION_T_in_expression2402 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2406 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_COLON_T_in_expression2409 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2413 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2417 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOGICAL_OR_T_in_expression2432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2436 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2440 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOGICAL_AND_T_in_expression2452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2456 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIT_OR_T_in_expression2472 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2476 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2480 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POWER_T_in_expression2492 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2496 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2500 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REF_T_in_expression2512 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2516 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2520 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNARY_EXPR_in_expression2532 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unary_symbol_list_in_expression2534 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2538 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOT_T_in_expression2550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2554 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2558 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUAL_EQUAL_T_in_expression2570 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2574 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2578 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_EQUAL_T_in_expression2590 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2594 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2598 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EQUAL_EQUAL_EQUAL_T_in_expression2610 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2614 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_EQUAL_EQUAL_T_in_expression2630 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2634 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2638 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LT_T_in_expression2650 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2654 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2658 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MT_T_in_expression2670 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2674 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2678 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LE_T_in_expression2690 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2694 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2698 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ME_T_in_expression2710 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2714 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2718 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSHIFT_T_in_expression2730 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2734 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2738 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RSHIFT_T_in_expression2750 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2754 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2758 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PLUS_T_in_expression2770 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2774 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2778 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MINUS_T_in_expression2790 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2794 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2798 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUL_T_in_expression2810 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2814 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2818 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DIV_T_in_expression2830 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2834 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2838 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PERCENT_T_in_expression2850 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2854 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2858 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CAST_EXPR_in_expression2870 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_cast_option_in_expression2872 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2876 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_POSTFIX_EXPR_in_expression2900 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2904 = new BitSet(new long[]{0x0000000000000000L,0x2000100000000000L});
	public static final BitSet FOLLOW_plus_minus_in_expression2906 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PREFIX_EXPR_in_expression2918 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_plus_minus_in_expression2920 = new BitSet(new long[]{0x0B8000CC02227C50L,0x7D71FC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_expression2925 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INSTANCEOF_T_in_expression2937 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2941 = new BitSet(new long[]{0x0000002000020000L,0x0000000000001000L,0x0000100000000000L});
	public static final BitSet FOLLOW_class_name_reference_in_expression2943 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_AT_T_in_expression2954 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_variable_in_expression2957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AT_T_in_expression2967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_scalar_in_expression2970 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_decl_in_expression2980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_DECL_in_expression2991 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_array_pair_list_in_expression2993 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEW_T_in_expression3006 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_class_name_reference_in_expression3008 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLONE_T_in_expression3023 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_in_expression3025 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_UNSET_T_in_expression3038 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_list_in_expression3040 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BACKTRICKLITERAL_in_expression3052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_T_in_expression3063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression3067 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unary_symbol_in_unary_symbol_list3101 = new BitSet(new long[]{0x0400000000000002L,0x4000200000000000L,0x0000000080000200L});
	public static final BitSet FOLLOW_PLUS_T_in_unary_symbol3121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_T_in_unary_symbol3130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REF_T_in_unary_symbol3138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TILDA_T_in_unary_symbol3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXC_NOT_T_in_unary_symbol3156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_186_in_cast_option3194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_187_in_cast_option3205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_191_in_cast_option3213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_190_in_cast_option3225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_188_in_cast_option3235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_185_in_cast_option3244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_192_in_cast_option3254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_196_in_cast_option3263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_197_in_cast_option3274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNSET_T_in_cast_option3283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLONE_T_in_cast_option3293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dynamic_name_reference_in_class_name_reference3335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_class_name_reference3345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference3368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CALL_in_dynamic_name_reference3380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dynamic_name_reference_in_dynamic_name_reference3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L,0x0000080000000000L});
	public static final BitSet FOLLOW_object_property_in_dynamic_name_reference3388 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_ctor_arguments_in_dynamic_name_reference3390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LIST_T_in_list_decl3414 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_assignment_list_in_list_decl3416 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_element_in_assignment_list3448 = new BitSet(new long[]{0x0000000000020002L,0x0000000200000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_variable_in_assignment_element3466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_decl_in_assignment_element3476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_array_pair_element_in_array_pair_list3508 = new BitSet(new long[]{0x0B8000CC02227CD2L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_ARROW_T_in_array_pair_element3529 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_array_pair_element3533 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_array_pair_element3537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_array_pair_element3550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_temp_in_variable3585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_base_variable_with_function_calls_in_variable_temp3608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CALL_in_variable_temp3620 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variable_temp_in_variable_temp3624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L,0x0000080000000000L});
	public static final BitSet FOLLOW_object_property_in_variable_temp3628 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_ctor_arguments_in_variable_temp3630 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_DECL_in_base_variable_with_function_calls3656 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020040L,0x0000080000000000L});
	public static final BitSet FOLLOW_object_property_in_base_variable_with_function_calls3663 = new BitSet(new long[]{0x0000000000000028L});
	public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls3665 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CALL_in_base_variable_with_function_calls3686 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3688 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls3690 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DOLLAR_T_in_dollars3724 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_VAR_in_object_property3760 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dollars_in_object_property3762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_object_property3764 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_in_object_property3778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_dollars_in_object_property3780 = new BitSet(new long[]{0x0B8000CC02227C50L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_object_property3782 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INDEX_in_object_property3794 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_object_property_in_object_property3798 = new BitSet(new long[]{0x0B8000CC02227C58L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_object_property3800 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_HASH_INDEX_in_object_property3813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_object_property_in_object_property3817 = new BitSet(new long[]{0x0B8000CC02227C58L,0x5D71EC7E20040000L,0x000090C0000702B7L});
	public static final BitSet FOLLOW_expression_in_object_property3819 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGU_in_ctor_arguments3859 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expr_list_in_ctor_arguments3861 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VAR_DECL_in_pure_variable3897 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_REF_T_in_pure_variable3899 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_DOLLAR_T_in_pure_variable3902 = new BitSet(new long[]{0x0000001000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_pure_variable3905 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SCALAR_in_scalar3938 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_constant_in_scalar3940 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTLITERAL_in_constant3966 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOATLITERAL_in_constant3978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRINGLITERAL_in_constant3990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REALLITERAL_in_constant4012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLELITERRAL_in_constant4027 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_common_scalar_in_constant4039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant4051 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fully_qualified_class_name_in_constant4063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HEREDOC_START_in_constant4074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_constant4079 = new BitSet(new long[]{0x0000000000000002L});
}
