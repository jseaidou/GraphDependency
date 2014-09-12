// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g 2009-08-11 01:00:08

  package org.eclipse.php.internal.core.compiler.ast.parser.php53;
  
  import org.eclipse.dltk.ast.*;
import org.eclipse.dltk.ast.declarations.*;
import org.eclipse.dltk.ast.expressions.*;
import org.eclipse.dltk.ast.references.*;
import org.eclipse.dltk.ast.statements.*;
import org.eclipse.php.internal.core.compiler.ast.nodes.*;
import org.eclipse.php.internal.core.compiler.ast.parser.*;
import java.util.*;
import org.antlr.runtime.BitSet;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


public class TreePHP extends TreeParser {
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
    public static final int NOT_EQUAL_EQUAL_T=124;
    public static final int CAST_EXPR=40;
    public static final int AT_T=143;
    public static final int NonIntegerNumber=164;
    public static final int FloatSuffix=165;
    public static final int AND_T=103;
    public static final int RIGHT_BRACKET=57;
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
    public static final int BIT_AND_EQ=110;
    public static final int INCLUDE_ONCE_T=80;
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
    public static final int FIELD_DECL=8;
    public static final int PREFIX_EXPR=38;
    public static final int LIST_T=144;
    public static final int CLASS_BODY=7;
    public static final int LIST_DECL=23;
    public static final int BACKTRICKLITERAL=146;
    public static final int QUOTE_STRING=84;
    public static final int ITERATE=28;
    public static final int LEFT_PARETHESIS=49;
    public static final int RETURN_T=68;
    public static final int HEREDOC=157;
    public static final int DoubleSuffix=166;
    public static final int ENDWHILE_T=98;
    public static final int STRINGLITERAL=83;
    public static final int BLOCK=12;
    public static final int EXTENDS_T=54;
    public static final int CONTINUE_T=67;
    public static final int PRINT_T=147;
    public static final int FLOATLITERAL=153;
    public static final int ENDSWITCH_T=93;
    public static final int CAST=26;
    public static final int PREFIX=32;
    public static final int XOR_T=102;
    public static final int TRY_T=76;
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
    public static final int ME_T=128;
    public static final int T__176=176;
    public static final int LABEL=27;
    public static final int ASSIGN=22;
    public static final int RIGHT_PARETHESIS=50;
    public static final int EXC_NOT_T=139;
    public static final int CASE_T=94;
    public static final int BREAK_T=66;
    public static final int DOT_EQ=108;
    public static final int ClassDeclaration=5;

    // delegates
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

    public String[] getTokenNames() { return TreePHP.tokenNames; }
    public String getGrammarFileName() { return "/home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g"; }


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

        if (property.getKind() == ASTNodeKinds.REFLECTION_CALL_EXPRESSION) {
          ((ReflectionCallExpression) property).setReceiver (dispatcher);
          dispatcher = property;
        } else if (property.getKind() == ASTNodeKinds.METHOD_INVOCATION) {
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
    		      return new SLAST(token);
    		    }
    		
    		    public Object dupNode(Object t) {
    		      if (t == null) {
    		        return null;
    		      }
    		      return create(((SLAST) t).token);
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
            Quote quote = null;
       
           
            
            for (String str : stats) {
              
              String code = "<?php " + str + ";?>";
              
              System.out.println("code:" + code);
              
              try {
    			    
    					    CharStream input = new ANTLRStringStream(code);
    					
    					    CompilerAstLexer lexer = new CompilerAstLexer(input);
    					    
    					    CommonTokenStream tokens = new CommonTokenStream(lexer);
    					    
    					    CompilerAstParser parser = new CompilerAstParser(tokens);
    					    
    					    parser.setTreeAdaptor(tokenAdaptor);
    					    
    					    if (inputStr.indexOf(str) >= endIndex) {
                      startIndex = inputStr.indexOf(str) + originalStartIndex + 1;
                  }
                  
                  endIndex = startIndex + str.length();
    					      
    					    CompilerAstParser.php_source_return r = parser.php_source();
    					
    					    SLAST t = (SLAST) r.getTree(); // get tree result
    					    
    					    CommonTreeNodeStream nodes = new CommonTreeNodeStream(tokenAdaptor, t);
    					    
    					    nodes.setTokenStream(tokens);
    				
    				      TreePHP def = new TreePHP(nodes, parser);
    				      
    				      def.setTreeAdaptor(tokenAdaptor);
    				      
    				      TreePHP.php_source_return result = def.php_source();
    				      
    				      expr = def.getQuoteExpression();
    				      
    				      expr.setStart(startIndex);
                  
                  expr.setEnd(endIndex);
    			      
    			      }  catch (Exception ex) {
                  System.out.println("exception in quote");
                  System.out.println(ex);
                  
                  expr = new Scalar(startIndex, endIndex, str, Scalar.TYPE_UNKNOWN);
                }
                              
                list.add(expr);
                  
                startIndex = endIndex;
    				  }
    				  
    			  quote = new Quote(originalStartIndex, originalEndIndex, list, type);

    	      return quote;
    	  }


    public static class php_source_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "php_source"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:186:1: php_source : ^( ModuleDeclaration ( top_statement_list )? ) ;
    public final TreePHP.php_source_return php_source() throws RecognitionException {
        TreePHP.php_source_return retval = new TreePHP.php_source_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST ModuleDeclaration1=null;
        TreePHP.top_statement_list_return top_statement_list2 = null;


        SLAST ModuleDeclaration1_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:187:3: ( ^( ModuleDeclaration ( top_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:187:6: ^( ModuleDeclaration ( top_statement_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            ModuleDeclaration1=(SLAST)match(input,ModuleDeclaration,FOLLOW_ModuleDeclaration_in_php_source58); 
            ModuleDeclaration1_tree = (SLAST)adaptor.dupNode(ModuleDeclaration1);

            root_1 = (SLAST)adaptor.becomeRoot(ModuleDeclaration1_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:187:26: ( top_statement_list )?
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==METHOD_DECL||LA1_0==STATEMENT||LA1_0==NAMESPACE_T||LA1_0==CLASS_T||LA1_0==INTERFACE_T||LA1_0==174) ) {
                    alt1=1;
                }
                switch (alt1) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:187:26: top_statement_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_top_statement_list_in_php_source60);
                        top_statement_list2=top_statement_list();

                        state._fsp--;

                        adaptor.addChild(root_1, top_statement_list2.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                ModuleDeclaration RESULT = null;
                int startIndex = ModuleDeclaration1.startIndex;
                int endIndex = ModuleDeclaration1.endIndex + 2;
             
                PHPModuleDeclaration program = parser.getModuleDeclaration();
            	  program.setStart(startIndex);
            	  program.setEnd(endIndex);
            	  RESULT = program;
            	  
            	  System.out.println("module: \n" + RESULT);
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "php_source"

    public static class top_statement_list_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "top_statement_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:202:1: top_statement_list : ( top_statement )+ ;
    public final TreePHP.top_statement_list_return top_statement_list() throws RecognitionException {
        TreePHP.top_statement_list_return retval = new TreePHP.top_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.top_statement_return top_statement3 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:203:3: ( ( top_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:203:5: ( top_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:203:5: ( top_statement )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==METHOD_DECL||LA2_0==STATEMENT||LA2_0==NAMESPACE_T||LA2_0==CLASS_T||LA2_0==INTERFACE_T||LA2_0==174) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:203:5: top_statement
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_top_statement_in_top_statement_list79);
            	    top_statement3=top_statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, top_statement3.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "top_statement_list"

    public static class top_statement_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "top_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:206:1: top_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement | ^( NAMESPACE_T fully_qualified_class_name ) );
    public final TreePHP.top_statement_return top_statement() throws RecognitionException {
        TreePHP.top_statement_return retval = new TreePHP.top_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST NAMESPACE_T8=null;
        TreePHP.statement_return statement4 = null;

        TreePHP.function_declaration_statement_return function_declaration_statement5 = null;

        TreePHP.class_declaration_statement_return class_declaration_statement6 = null;

        TreePHP.halt_compiler_statement_return halt_compiler_statement7 = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name9 = null;


        SLAST NAMESPACE_T8_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:207:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement | ^( NAMESPACE_T fully_qualified_class_name ) )
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
                {
                alt3=3;
                }
                break;
            case 174:
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:207:5: statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_statement_in_top_statement93);
                    statement4=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement4.getTree());

                        Statement stat = (statement4!=null?statement4.stat:null);
                        parser.addStatement(stat);
                    //    System.out.println("state:" + stat);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:213:5: function_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_function_declaration_statement_in_top_statement103);
                    function_declaration_statement5=function_declaration_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration_statement5.getTree());

                        parser.addStatement((function_declaration_statement5!=null?function_declaration_statement5.stat:null));
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:217:5: class_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_class_declaration_statement_in_top_statement113);
                    class_declaration_statement6=class_declaration_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, class_declaration_statement6.getTree());

                        ClassDeclaration classDeclaration = (class_declaration_statement6!=null?class_declaration_statement6.classDeclaration:null);
                        if (classDeclaration != null) {
                          parser.addDeclarationStatement(classDeclaration);
                          parser.declarations.push(classDeclaration);
                          parser.addStatement(classDeclaration);
                        }
                        else {
                          InterfaceDeclaration interfaceDeclaration = (class_declaration_statement6!=null?class_declaration_statement6.interfaceDeclaration:null);
                          parser.addDeclarationStatement(interfaceDeclaration);
                          parser.declarations.push(interfaceDeclaration);
                          parser.addStatement(interfaceDeclaration);
                        }
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:232:5: halt_compiler_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_halt_compiler_statement_in_top_statement123);
                    halt_compiler_statement7=halt_compiler_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, halt_compiler_statement7.getTree());

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:233:5: ^( NAMESPACE_T fully_qualified_class_name )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    NAMESPACE_T8=(SLAST)match(input,NAMESPACE_T,FOLLOW_NAMESPACE_T_in_top_statement130); 
                    NAMESPACE_T8_tree = (SLAST)adaptor.dupNode(NAMESPACE_T8);

                    root_1 = (SLAST)adaptor.becomeRoot(NAMESPACE_T8_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_top_statement132);
                    fully_qualified_class_name9=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_1, fully_qualified_class_name9.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "top_statement"

    protected static class inner_statement_list_scope {
        List list;
    }
    protected Stack inner_statement_list_stack = new Stack();

    public static class inner_statement_list_return extends TreeRuleReturnScope {
        public List innerStatementList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inner_statement_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:236:1: inner_statement_list returns [List innerStatementList] : ( inner_statement )+ ;
    public final TreePHP.inner_statement_list_return inner_statement_list() throws RecognitionException {
        inner_statement_list_stack.push(new inner_statement_list_scope());
        TreePHP.inner_statement_list_return retval = new TreePHP.inner_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.inner_statement_return inner_statement10 = null;




          ((inner_statement_list_scope)inner_statement_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:243:3: ( ( inner_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:243:5: ( inner_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:243:5: ( inner_statement )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==METHOD_DECL||LA4_0==STATEMENT||LA4_0==CLASS_T||LA4_0==INTERFACE_T||LA4_0==174) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:243:6: inner_statement
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_inner_statement_in_inner_statement_list160);
            	    inner_statement10=inner_statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, inner_statement10.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


                retval.innerStatementList = ((inner_statement_list_scope)inner_statement_list_stack.peek()).list;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            inner_statement_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "inner_statement_list"

    public static class inner_statement_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inner_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:249:1: inner_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement );
    public final TreePHP.inner_statement_return inner_statement() throws RecognitionException {
        TreePHP.inner_statement_return retval = new TreePHP.inner_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.statement_return statement11 = null;

        TreePHP.function_declaration_statement_return function_declaration_statement12 = null;

        TreePHP.class_declaration_statement_return class_declaration_statement13 = null;

        TreePHP.halt_compiler_statement_return halt_compiler_statement14 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:250:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement )
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
                {
                alt5=3;
                }
                break;
            case 174:
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:250:5: statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_statement_in_inner_statement182);
                    statement11=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement11.getTree());

                        if ((statement11!=null?statement11.stat:null) != null) {
                          ((inner_statement_list_scope)inner_statement_list_stack.peek()).list.add((statement11!=null?statement11.stat:null));
                          System.out.println("inner state: " + (statement11!=null?statement11.stat:null));
                        }
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:257:5: function_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_function_declaration_statement_in_inner_statement192);
                    function_declaration_statement12=function_declaration_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration_statement12.getTree());

                        if ((function_declaration_statement12!=null?function_declaration_statement12.stat:null) != null) {
                          ((inner_statement_list_scope)inner_statement_list_stack.peek()).list.add((function_declaration_statement12!=null?function_declaration_statement12.stat:null));
                        }  
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:263:5: class_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_class_declaration_statement_in_inner_statement202);
                    class_declaration_statement13=class_declaration_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, class_declaration_statement13.getTree());

                        if ((class_declaration_statement13!=null?class_declaration_statement13.classDeclaration:null) != null) {
                          ((inner_statement_list_scope)inner_statement_list_stack.peek()).list.add((class_declaration_statement13!=null?class_declaration_statement13.classDeclaration:null));
                        } 
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:269:5: halt_compiler_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_halt_compiler_statement_in_inner_statement212);
                    halt_compiler_statement14=halt_compiler_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, halt_compiler_statement14.getTree());

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "inner_statement"

    public static class halt_compiler_statement_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "halt_compiler_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:272:1: halt_compiler_statement : '__halt_compiler' ;
    public final TreePHP.halt_compiler_statement_return halt_compiler_statement() throws RecognitionException {
        TreePHP.halt_compiler_statement_return retval = new TreePHP.halt_compiler_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST string_literal15=null;

        SLAST string_literal15_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:273:3: ( '__halt_compiler' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:273:5: '__halt_compiler'
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            string_literal15=(SLAST)match(input,174,FOLLOW_174_in_halt_compiler_statement227); 
            string_literal15_tree = (SLAST)adaptor.dupNode(string_literal15);

            adaptor.addChild(root_0, string_literal15_tree);


            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "halt_compiler_statement"

    public static class class_declaration_statement_return extends TreeRuleReturnScope {
        public ClassDeclaration classDeclaration;
        public InterfaceDeclaration interfaceDeclaration;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_declaration_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:276:1: class_declaration_statement returns [ClassDeclaration classDeclaration, InterfaceDeclaration interfaceDeclaration] : ( ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) | ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) );
    public final TreePHP.class_declaration_statement_return class_declaration_statement() throws RecognitionException {
        TreePHP.class_declaration_statement_return retval = new TreePHP.class_declaration_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CLASS_T16=null;
        SLAST IDENTIFIER18=null;
        SLAST EXTENDS_T19=null;
        SLAST IMPLEMENTS_T21=null;
        SLAST CLASS_BODY23=null;
        SLAST INTERFACE_T25=null;
        SLAST IDENTIFIER26=null;
        SLAST EXTENDS_T27=null;
        SLAST CLASS_BODY29=null;
        TreePHP.class_entr_type_return class_entr_type17 = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name20 = null;

        TreePHP.fully_qualified_class_name_list_return fully_qualified_class_name_list22 = null;

        TreePHP.class_statement_list_return class_statement_list24 = null;

        TreePHP.fully_qualified_class_name_list_return fully_qualified_class_name_list28 = null;

        TreePHP.class_statement_list_return class_statement_list30 = null;


        SLAST CLASS_T16_tree=null;
        SLAST IDENTIFIER18_tree=null;
        SLAST EXTENDS_T19_tree=null;
        SLAST IMPLEMENTS_T21_tree=null;
        SLAST CLASS_BODY23_tree=null;
        SLAST INTERFACE_T25_tree=null;
        SLAST IDENTIFIER26_tree=null;
        SLAST EXTENDS_T27_tree=null;
        SLAST CLASS_BODY29_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:277:3: ( ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) | ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==CLASS_T) ) {
                alt12=1;
            }
            else if ( (LA12_0==INTERFACE_T) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:277:5: ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CLASS_T16=(SLAST)match(input,CLASS_T,FOLLOW_CLASS_T_in_class_declaration_statement247); 
                    CLASS_T16_tree = (SLAST)adaptor.dupNode(CLASS_T16);

                    root_1 = (SLAST)adaptor.becomeRoot(CLASS_T16_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:277:15: ( class_entr_type )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=175 && LA6_0<=176)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:277:15: class_entr_type
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_class_entr_type_in_class_declaration_statement249);
                            class_entr_type17=class_entr_type();

                            state._fsp--;

                            adaptor.addChild(root_1, class_entr_type17.getTree());

                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    IDENTIFIER18=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement252); 
                    IDENTIFIER18_tree = (SLAST)adaptor.dupNode(IDENTIFIER18);

                    adaptor.addChild(root_1, IDENTIFIER18_tree);


                          TreePHP.ModifierDocPair modifier = new ModifierDocPair(Modifiers.AccDefault, null);
                          int startIndex = CLASS_T16.startIndex;
                          int endIndex = CLASS_T16.endIndex + 1;
                          if ((class_entr_type17!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(class_entr_type17.start),
                      input.getTreeAdaptor().getTokenStopIndex(class_entr_type17.start))):null) != null) {
                              if ((class_entr_type17!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(class_entr_type17.start),
                      input.getTreeAdaptor().getTokenStopIndex(class_entr_type17.start))):null).equals("abstract")) {
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
                      
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:298:4: ( ^( EXTENDS_T fully_qualified_class_name ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_T) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:298:5: ^( EXTENDS_T fully_qualified_class_name )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            EXTENDS_T19=(SLAST)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement266); 
                            EXTENDS_T19_tree = (SLAST)adaptor.dupNode(EXTENDS_T19);

                            root_2 = (SLAST)adaptor.becomeRoot(EXTENDS_T19_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_fully_qualified_class_name_in_class_declaration_statement268);
                            fully_qualified_class_name20=fully_qualified_class_name();

                            state._fsp--;

                            adaptor.addChild(root_2, fully_qualified_class_name20.getTree());

                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:298:47: ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_T) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:298:48: ^( IMPLEMENTS_T fully_qualified_class_name_list )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            IMPLEMENTS_T21=(SLAST)match(input,IMPLEMENTS_T,FOLLOW_IMPLEMENTS_T_in_class_declaration_statement275); 
                            IMPLEMENTS_T21_tree = (SLAST)adaptor.dupNode(IMPLEMENTS_T21);

                            root_2 = (SLAST)adaptor.becomeRoot(IMPLEMENTS_T21_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement277);
                            fully_qualified_class_name_list22=fully_qualified_class_name_list();

                            state._fsp--;

                            adaptor.addChild(root_2, fully_qualified_class_name_list22.getTree());

                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:299:7: ( ^( CLASS_BODY class_statement_list ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==CLASS_BODY) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:299:8: ^( CLASS_BODY class_statement_list )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            CLASS_BODY23=(SLAST)match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_class_declaration_statement290); 
                            CLASS_BODY23_tree = (SLAST)adaptor.dupNode(CLASS_BODY23);

                            root_2 = (SLAST)adaptor.becomeRoot(CLASS_BODY23_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_class_statement_list_in_class_declaration_statement292);
                            class_statement_list24=class_statement_list();

                            state._fsp--;

                            adaptor.addChild(root_2, class_statement_list24.getTree());

                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          
                          TreePHP.ModifierDocPair modifier = new ModifierDocPair(Modifiers.AccDefault, null);
                          int startIndex = CLASS_T16.startIndex;
                          int endIndex = CLASS_T16.endIndex + 1;
                          if ((class_entr_type17!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(class_entr_type17.start),
                      input.getTreeAdaptor().getTokenStopIndex(class_entr_type17.start))):null) != null) {
                              if ((class_entr_type17!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(class_entr_type17.start),
                      input.getTreeAdaptor().getTokenStopIndex(class_entr_type17.start))):null).equals("abstract")) {
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
                          if ((fully_qualified_class_name20!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(fully_qualified_class_name20.start),
                      input.getTreeAdaptor().getTokenStopIndex(fully_qualified_class_name20.start))):null) != null) {
                              superClassLeft = ((CommonToken)(fully_qualified_class_name20!=null?((SLAST)fully_qualified_class_name20.tree):null).token).getStartIndex();
                              superClassRight = ((CommonToken)(fully_qualified_class_name20!=null?((SLAST)fully_qualified_class_name20.tree):null).token).getStopIndex() + 1;
                              superClass = (fully_qualified_class_name20!=null?fully_qualified_class_name20.type:null);
                          }
                          
                          List interfaces = null;
                          int interfacesLeft = 0;
                          int interfacesRight = 0;
                          if ((fully_qualified_class_name_list22!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(fully_qualified_class_name_list22.start),
                      input.getTreeAdaptor().getTokenStopIndex(fully_qualified_class_name_list22.start))):null) != null) {
                              interfacesLeft = ((CommonToken)(fully_qualified_class_name_list22!=null?((SLAST)fully_qualified_class_name_list22.tree):null).token).getStartIndex();
                              interfacesRight = ((CommonToken)(fully_qualified_class_name_list22!=null?((SLAST)fully_qualified_class_name_list22.tree):null).token).getStopIndex() + 1;
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:341:5: ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INTERFACE_T25=(SLAST)match(input,INTERFACE_T,FOLLOW_INTERFACE_T_in_class_declaration_statement309); 
                    INTERFACE_T25_tree = (SLAST)adaptor.dupNode(INTERFACE_T25);

                    root_1 = (SLAST)adaptor.becomeRoot(INTERFACE_T25_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    IDENTIFIER26=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement311); 
                    IDENTIFIER26_tree = (SLAST)adaptor.dupNode(IDENTIFIER26);

                    adaptor.addChild(root_1, IDENTIFIER26_tree);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:341:30: ( ^( EXTENDS_T fully_qualified_class_name_list ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EXTENDS_T) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:341:31: ^( EXTENDS_T fully_qualified_class_name_list )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            EXTENDS_T27=(SLAST)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement315); 
                            EXTENDS_T27_tree = (SLAST)adaptor.dupNode(EXTENDS_T27);

                            root_2 = (SLAST)adaptor.becomeRoot(EXTENDS_T27_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement317);
                            fully_qualified_class_name_list28=fully_qualified_class_name_list();

                            state._fsp--;

                            adaptor.addChild(root_2, fully_qualified_class_name_list28.getTree());

                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
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
                           if ((fully_qualified_class_name_list28!=null?fully_qualified_class_name_list28.list:null) != null) {
                              interfaces = (fully_qualified_class_name_list28!=null?fully_qualified_class_name_list28.list:null);
                              CommonToken listToken = (CommonToken)(fully_qualified_class_name_list28!=null?((SLAST)fully_qualified_class_name_list28.tree):null).token;
                              listStartIndex = listToken.getStartIndex();
                              listEndIndex = listToken.getStopIndex();
                           }
                              
                           retval.interfaceDeclaration = new InterfaceDeclaration(startIndex ,endIndex, classNameLeft, classNameRight, className, interfaces, new Block(listStartIndex, listEndIndex,null), start);
                           parser.declarations.push(retval.interfaceDeclaration);
                        
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:364:7: ( ^( CLASS_BODY class_statement_list ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==CLASS_BODY) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:364:8: ^( CLASS_BODY class_statement_list )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            CLASS_BODY29=(SLAST)match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_class_declaration_statement336); 
                            CLASS_BODY29_tree = (SLAST)adaptor.dupNode(CLASS_BODY29);

                            root_2 = (SLAST)adaptor.becomeRoot(CLASS_BODY29_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_class_statement_list_in_class_declaration_statement338);
                            class_statement_list30=class_statement_list();

                            state._fsp--;

                            adaptor.addChild(root_2, class_statement_list30.getTree());

                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                           retval.interfaceDeclaration = (InterfaceDeclaration)parser.declarations.pop();
                        

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_declaration_statement"

    public static class class_entr_type_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_entr_type"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:370:1: class_entr_type : ( 'abstract' | 'final' );
    public final TreePHP.class_entr_type_return class_entr_type() throws RecognitionException {
        TreePHP.class_entr_type_return retval = new TreePHP.class_entr_type_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST set31=null;

        SLAST set31_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:371:3: ( 'abstract' | 'final' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            set31=(SLAST)input.LT(1);
            if ( (input.LA(1)>=175 && input.LA(1)<=176) ) {
                input.consume();

                set31_tree = (SLAST)adaptor.dupNode(set31);

                adaptor.addChild(root_0, set31_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_entr_type"

    public static class class_statement_list_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_statement_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:375:1: class_statement_list : ( class_statement )+ ;
    public final TreePHP.class_statement_list_return class_statement_list() throws RecognitionException {
        TreePHP.class_statement_list_return retval = new TreePHP.class_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.class_statement_return class_statement32 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:376:3: ( ( class_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:376:5: ( class_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:376:5: ( class_statement )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=FIELD_DECL && LA13_0<=METHOD_DECL)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:376:5: class_statement
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_class_statement_in_class_statement_list384);
            	    class_statement32=class_statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, class_statement32.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "class_statement_list"

    protected static class class_statement_scope {
        List constList;
        List varList;
    }
    protected Stack class_statement_stack = new Stack();

    public static class class_statement_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:379:1: class_statement : ( ^( FIELD_DECL variable_modifiers ( static_var_element )+ ) | ^( METHOD_DECL modifier ( REF_T )? IDENTIFIER ( parameter_list )? ( block | EMPTYSTATEMENT ) ) | ^( FIELD_DECL CONST_T ( directive )+ ) );
    public final TreePHP.class_statement_return class_statement() throws RecognitionException {
        class_statement_stack.push(new class_statement_scope());
        TreePHP.class_statement_return retval = new TreePHP.class_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST FIELD_DECL33=null;
        SLAST METHOD_DECL36=null;
        SLAST REF_T38=null;
        SLAST IDENTIFIER39=null;
        SLAST EMPTYSTATEMENT42=null;
        SLAST FIELD_DECL43=null;
        SLAST CONST_T44=null;
        TreePHP.variable_modifiers_return variable_modifiers34 = null;

        TreePHP.static_var_element_return static_var_element35 = null;

        TreePHP.modifier_return modifier37 = null;

        TreePHP.parameter_list_return parameter_list40 = null;

        TreePHP.block_return block41 = null;

        TreePHP.directive_return directive45 = null;


        SLAST FIELD_DECL33_tree=null;
        SLAST METHOD_DECL36_tree=null;
        SLAST REF_T38_tree=null;
        SLAST IDENTIFIER39_tree=null;
        SLAST EMPTYSTATEMENT42_tree=null;
        SLAST FIELD_DECL43_tree=null;
        SLAST CONST_T44_tree=null;


          ((class_statement_scope)class_statement_stack.peek()).constList = new LinkedList();
          ((class_statement_scope)class_statement_stack.peek()).varList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:388:3: ( ^( FIELD_DECL variable_modifiers ( static_var_element )+ ) | ^( METHOD_DECL modifier ( REF_T )? IDENTIFIER ( parameter_list )? ( block | EMPTYSTATEMENT ) ) | ^( FIELD_DECL CONST_T ( directive )+ ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==FIELD_DECL) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==DOWN) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==VAR_DECL||LA19_3==STATIC_T||LA19_3==EQUAL_T||(LA19_3>=175 && LA19_3<=180)) ) {
                        alt19=1;
                    }
                    else if ( (LA19_3==CONST_T) ) {
                        alt19=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==METHOD_DECL) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:388:5: ^( FIELD_DECL variable_modifiers ( static_var_element )+ )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    FIELD_DECL33=(SLAST)match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_class_statement409); 
                    FIELD_DECL33_tree = (SLAST)adaptor.dupNode(FIELD_DECL33);

                    root_1 = (SLAST)adaptor.becomeRoot(FIELD_DECL33_tree, root_1);


                    inClassStatementList = true;

                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_modifiers_in_class_statement413);
                    variable_modifiers34=variable_modifiers();

                    state._fsp--;

                    adaptor.addChild(root_1, variable_modifiers34.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:388:68: ( static_var_element )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==VAR_DECL||LA14_0==EQUAL_T) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:388:68: static_var_element
                    	    {
                    	    _last = (SLAST)input.LT(1);
                    	    pushFollow(FOLLOW_static_var_element_in_class_statement415);
                    	    static_var_element35=static_var_element();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, static_var_element35.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    inClassStatementList = false;

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        ModifierDocPair modifier = new ModifierDocPair(Modifiers.AccDefault, null);
                        int modifierLeft = ((CommonToken)(variable_modifiers34!=null?((SLAST)variable_modifiers34.tree):null).token).getStartIndex();
                        if ((variable_modifiers34!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(variable_modifiers34.start),
                      input.getTreeAdaptor().getTokenStopIndex(variable_modifiers34.start))):null).equals("var")) {
                          modifier = new ModifierDocPair(Modifiers.AccPublic, null);
                        }
                        
                        Iterator iter = ((class_statement_scope)class_statement_stack.peek()).varList.iterator();
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:408:5: ^( METHOD_DECL modifier ( REF_T )? IDENTIFIER ( parameter_list )? ( block | EMPTYSTATEMENT ) )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    METHOD_DECL36=(SLAST)match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_class_statement430); 
                    METHOD_DECL36_tree = (SLAST)adaptor.dupNode(METHOD_DECL36);

                    root_1 = (SLAST)adaptor.becomeRoot(METHOD_DECL36_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_modifier_in_class_statement432);
                    modifier37=modifier();

                    state._fsp--;

                    adaptor.addChild(root_1, modifier37.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:408:28: ( REF_T )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==REF_T) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:408:28: REF_T
                            {
                            _last = (SLAST)input.LT(1);
                            REF_T38=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_class_statement434); 
                            REF_T38_tree = (SLAST)adaptor.dupNode(REF_T38);

                            adaptor.addChild(root_1, REF_T38_tree);


                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    IDENTIFIER39=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_statement437); 
                    IDENTIFIER39_tree = (SLAST)adaptor.dupNode(IDENTIFIER39);

                    adaptor.addChild(root_1, IDENTIFIER39_tree);


                          ModifierDocPair modifier = (modifier37!=null?modifier37.modifierVar:null);
                          PHPDocBlock start = null;
                          Boolean isReference = false;
                          if ((REF_T38!=null?REF_T38.getText():null) != null) {
                             isReference = true;
                          }
                          int functionNameLeft = ((CommonToken)IDENTIFIER39.token).getStartIndex();
                          int functionNameRight = ((CommonToken)IDENTIFIER39.token).getStopIndex() + 1;
                          String functionName = (IDENTIFIER39!=null?IDENTIFIER39.getText():null);
                      
                          int startIndex = METHOD_DECL36.startIndex;
                          int endIndex = METHOD_DECL36.endIndex + 1;
                          int modifierValue = (modifier == null || modifier.modifier == Modifiers.AccDefault) ? Modifiers.AccPublic : modifier.modifier;
                          
                          PHPDocBlock docBlock = start;
                          if (modifier != null && modifier.doc != null) {
                            docBlock = modifier.doc;
                          }
                          PHPMethodDeclaration methodDeclaration = new PHPMethodDeclaration(startIndex, endIndex, startIndex, endIndex, functionName, modifierValue, null, new Block(startIndex, endIndex, null), isReference.booleanValue(), docBlock);
                          parser.addDeclarationStatement(methodDeclaration);
                          parser.declarations.push(methodDeclaration);
                        
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:432:7: ( parameter_list )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==PARAMETER) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:432:7: parameter_list
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_parameter_list_in_class_statement451);
                            parameter_list40=parameter_list();

                            state._fsp--;

                            adaptor.addChild(root_1, parameter_list40.getTree());

                            }
                            break;

                    }


                            if ((parameter_list40!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(parameter_list40.start),
                      input.getTreeAdaptor().getTokenStopIndex(parameter_list40.start))):null) != null) {
                              PHPMethodDeclaration functionDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
                    				  functionDeclaration.acceptArguments((parameter_list40!=null?parameter_list40.parameterList:null));
                            }
                          
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:439:5: ( block | EMPTYSTATEMENT )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==BLOCK) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==EMPTYSTATEMENT) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:439:6: block
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_block_in_class_statement467);
                            block41=block();

                            state._fsp--;

                            adaptor.addChild(root_1, block41.getTree());

                                    startIndex = ((CommonToken)(block41!=null?((SLAST)block41.tree):null).token).getStartIndex();
                            		    endIndex = ((CommonToken)(block41!=null?((SLAST)block41.tree):null).token).getStopIndex() + 1;
                            		    
                            		    methodDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
                            			  methodDeclaration.getBody().setStart(startIndex);
                            			  methodDeclaration.getBody().setEnd(endIndex);
                            			  methodDeclaration.getBody().getStatements().clear();
                            			  methodDeclaration.getBody().acceptStatements((block41!=null?block41.statList:null));
                            			  
                            			  methodDeclaration = (PHPMethodDeclaration)parser.declarations.pop();
                            //			  if(body instanceof ASTError) {
                            //			    parser.reportError(new ASTError(methodDeclaration.sourceEnd() - 1, methodDeclaration.sourceEnd()), "syntax error, unfinished method declaration");
                            //			  }
                            			  TypeDeclaration type = (TypeDeclaration)parser.declarations.peek();
                            			  methodDeclaration.setDeclaringTypeName(type.getName()); 
                                 

                            }
                            break;
                        case 2 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:458:5: EMPTYSTATEMENT
                            {
                            _last = (SLAST)input.LT(1);
                            EMPTYSTATEMENT42=(SLAST)match(input,EMPTYSTATEMENT,FOLLOW_EMPTYSTATEMENT_in_class_statement486); 
                            EMPTYSTATEMENT42_tree = (SLAST)adaptor.dupNode(EMPTYSTATEMENT42);

                            adaptor.addChild(root_1, EMPTYSTATEMENT42_tree);

                               
                                    startIndex = ((CommonToken)EMPTYSTATEMENT42.token).getStartIndex();
                                    endIndex = ((CommonToken)EMPTYSTATEMENT42.token).getStopIndex() + 1;
                                    
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


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:477:5: ^( FIELD_DECL CONST_T ( directive )+ )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    FIELD_DECL43=(SLAST)match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_class_statement509); 
                    FIELD_DECL43_tree = (SLAST)adaptor.dupNode(FIELD_DECL43);

                    root_1 = (SLAST)adaptor.becomeRoot(FIELD_DECL43_tree, root_1);


                    inClassStatementList = true;

                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    CONST_T44=(SLAST)match(input,CONST_T,FOLLOW_CONST_T_in_class_statement513); 
                    CONST_T44_tree = (SLAST)adaptor.dupNode(CONST_T44);

                    adaptor.addChild(root_1, CONST_T44_tree);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:477:57: ( directive )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==EQUAL_T) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:477:57: directive
                    	    {
                    	    _last = (SLAST)input.LT(1);
                    	    pushFollow(FOLLOW_directive_in_class_statement515);
                    	    directive45=directive();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, directive45.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    inClassStatementList = false;

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = FIELD_DECL43.startIndex;
                        int endIndex = FIELD_DECL43.endIndex;
                        Iterator iter = ((class_statement_scope)class_statement_stack.peek()).constList.iterator();
                        while (iter.hasNext()) {
                          ASTNode[] decl = (ASTNode[])iter.next();
                    	    if (decl != null) {
                    		    ConstantReference constant = (ConstantReference)decl[0];
                    		    Expression initializer = (Expression)decl[1];
                    		    int decListLeft = ((CommonToken)(directive45!=null?((SLAST)directive45.tree):null).token).getStartIndex();
                    		      
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

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            class_statement_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "class_statement"

    public static class function_declaration_statement_return extends TreeRuleReturnScope {
        public Statement stat;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_declaration_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:501:1: function_declaration_statement returns [Statement stat] : ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) ;
    public final TreePHP.function_declaration_statement_return function_declaration_statement() throws RecognitionException {
        TreePHP.function_declaration_statement_return retval = new TreePHP.function_declaration_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST METHOD_DECL46=null;
        SLAST REF_T47=null;
        SLAST IDENTIFIER48=null;
        TreePHP.parameter_list_return parameter_list49 = null;

        TreePHP.block_return block50 = null;


        SLAST METHOD_DECL46_tree=null;
        SLAST REF_T47_tree=null;
        SLAST IDENTIFIER48_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:502:3: ( ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:502:5: ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            METHOD_DECL46=(SLAST)match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_function_declaration_statement541); 
            METHOD_DECL46_tree = (SLAST)adaptor.dupNode(METHOD_DECL46);

            root_1 = (SLAST)adaptor.becomeRoot(METHOD_DECL46_tree, root_1);



            match(input, Token.DOWN, null); 
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:502:19: ( REF_T )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==REF_T) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:502:19: REF_T
                    {
                    _last = (SLAST)input.LT(1);
                    REF_T47=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_function_declaration_statement543); 
                    REF_T47_tree = (SLAST)adaptor.dupNode(REF_T47);

                    adaptor.addChild(root_1, REF_T47_tree);


                    }
                    break;

            }

            _last = (SLAST)input.LT(1);
            IDENTIFIER48=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration_statement546); 
            IDENTIFIER48_tree = (SLAST)adaptor.dupNode(IDENTIFIER48);

            adaptor.addChild(root_1, IDENTIFIER48_tree);


                Boolean isReference = false;
                if ((REF_T47!=null?REF_T47.getText():null) != null) {
                   isReference = true;
                }
                int functionNameLeft = ((CommonToken)IDENTIFIER48.token).getStartIndex();
                int functionNameRight = ((CommonToken)IDENTIFIER48.token).getStopIndex() + 1;
                String functionName = (IDENTIFIER48!=null?IDENTIFIER48.getText():null);
              
                int startIndex = METHOD_DECL46.startIndex;
                int endIndex = METHOD_DECL46.endIndex + 1;
                int modifierValue = Modifiers.AccDefault;
                  
                PHPDocBlock docBlock = null;
                
                PHPMethodDeclaration methodDeclaration = new PHPMethodDeclaration(startIndex, endIndex, startIndex, endIndex, functionName, modifierValue, null, new Block(startIndex, endIndex, null), isReference.booleanValue(), docBlock);
                parser.addDeclarationStatement(methodDeclaration);
                parser.declarations.push(methodDeclaration);
              
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:522:4: ( parameter_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==PARAMETER) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:522:4: parameter_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_parameter_list_in_function_declaration_statement555);
                    parameter_list49=parameter_list();

                    state._fsp--;

                    adaptor.addChild(root_1, parameter_list49.getTree());

                    }
                    break;

            }


                  if ((parameter_list49!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(parameter_list49.start),
              input.getTreeAdaptor().getTokenStopIndex(parameter_list49.start))):null) != null) {
                    PHPMethodDeclaration functionDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
                    functionDeclaration.acceptArguments((parameter_list49!=null?parameter_list49.parameterList:null));
                  }
               
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_block_in_function_declaration_statement568);
            block50=block();

            state._fsp--;

            adaptor.addChild(root_1, block50.getTree());

                startIndex = ((CommonToken)(block50!=null?((SLAST)block50.tree):null).token).getStartIndex();
                endIndex = ((CommonToken)(block50!=null?((SLAST)block50.tree):null).token).getStopIndex() + 1;
                    
                methodDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
                methodDeclaration.getBody().setStart(startIndex);
                methodDeclaration.getBody().setEnd(endIndex);
                methodDeclaration.getBody().getStatements().clear();
                methodDeclaration.getBody().acceptStatements((block50!=null?block50.statList:null));
                    
                methodDeclaration = (PHPMethodDeclaration)parser.declarations.pop();
            //        if(body instanceof ASTError) {
            //          parser.reportError(new ASTError(methodDeclaration.sourceEnd() - 1, methodDeclaration.sourceEnd()), "syntax error, unfinished method declaration");
            //        }
            //    TypeDeclaration type = (TypeDeclaration)parser.declarations.peek();
            //    methodDeclaration.setDeclaringTypeName(type.getName());
                retval.stat = methodDeclaration;
                System.out.println("here" + retval.stat);
              

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_declaration_statement"

    public static class block_return extends TreeRuleReturnScope {
        public Statement stat;
        public List statList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:554:1: block returns [Statement stat, List statList] : ^( BLOCK ( inner_statement_list )? ) ;
    public final TreePHP.block_return block() throws RecognitionException {
        TreePHP.block_return retval = new TreePHP.block_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST BLOCK51=null;
        TreePHP.inner_statement_list_return inner_statement_list52 = null;


        SLAST BLOCK51_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:555:3: ( ^( BLOCK ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:555:5: ^( BLOCK ( inner_statement_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            BLOCK51=(SLAST)match(input,BLOCK,FOLLOW_BLOCK_in_block603); 
            BLOCK51_tree = (SLAST)adaptor.dupNode(BLOCK51);

            root_1 = (SLAST)adaptor.becomeRoot(BLOCK51_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:555:13: ( inner_statement_list )?
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==METHOD_DECL||LA22_0==STATEMENT||LA22_0==CLASS_T||LA22_0==INTERFACE_T||LA22_0==174) ) {
                    alt22=1;
                }
                switch (alt22) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:555:13: inner_statement_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_inner_statement_list_in_block605);
                        inner_statement_list52=inner_statement_list();

                        state._fsp--;

                        adaptor.addChild(root_1, inner_statement_list52.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                  int startIndex = BLOCK51.startIndex;
                  int endIndex = BLOCK51.endIndex + 1;
                  System.out.println("emptystat:" + startIndex + " " + endIndex);
                  Block block = new Block(startIndex, endIndex, new LinkedList());
                  if ((inner_statement_list52!=null?inner_statement_list52.innerStatementList:null) != null) {
                    block.getStatements().clear();
                    block.acceptStatements((inner_statement_list52!=null?inner_statement_list52.innerStatementList:null));
                    retval.statList = (inner_statement_list52!=null?inner_statement_list52.innerStatementList:null);
                  }
                  else {
                    retval.statList = new LinkedList();
                  }
                  retval.stat = block;
                

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class statement_return extends TreeRuleReturnScope {
        public Statement stat;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:573:1: statement returns [Statement stat] : ^( STATEMENT topStatement ) ;
    public final TreePHP.statement_return statement() throws RecognitionException {
        TreePHP.statement_return retval = new TreePHP.statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST STATEMENT53=null;
        TreePHP.topStatement_return topStatement54 = null;


        SLAST STATEMENT53_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:574:3: ( ^( STATEMENT topStatement ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:574:5: ^( STATEMENT topStatement )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            STATEMENT53=(SLAST)match(input,STATEMENT,FOLLOW_STATEMENT_in_statement634); 
            STATEMENT53_tree = (SLAST)adaptor.dupNode(STATEMENT53);

            root_1 = (SLAST)adaptor.becomeRoot(STATEMENT53_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_topStatement_in_statement636);
            topStatement54=topStatement();

            state._fsp--;

            adaptor.addChild(root_1, topStatement54.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                if ((topStatement54!=null?topStatement54.expr:null) != null) {
            //	    int startIndex = STATEMENT53.startIndex;
            //	    int endIndex = STATEMENT53.endIndex + 1;
                  SLAST ast = (topStatement54!=null?((SLAST)topStatement54.start):null);
                  int startIndex = ast.startIndex;
                  int endIndex = ast.endIndex + 1;
            	    retval.stat = new ExpressionStatement(startIndex, endIndex, (topStatement54!=null?topStatement54.expr:null));
            	    System.out.println("retval.stat:" + retval.stat);
            	    quoteExpr = (topStatement54!=null?topStatement54.expr:null);
                }
                else {
                  retval.stat = (topStatement54!=null?topStatement54.stat:null);
                }
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    protected static class topStatement_scope {
        List declareKey;
        List declareValue;
    }
    protected Stack topStatement_stack = new Stack();

    public static class topStatement_return extends TreeRuleReturnScope {
        public Expression expr;
        public Statement stat;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "topStatement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:592:1: topStatement returns [Expression expr, Statement stat] : ( block | if_stat | ^( WHILE_T ^( CONDITION e= expression ) while_statement ) | ^( DO_T ^( CONDITION e= expression ) statement ) | ^( FOR_T (e1= expr_list )? ^( CONDITION (e2= expr_list )? ) ^( ITERATE (e3= expr_list )? ) s1= for_statement ) | ^( SWITCH_T ^( CONDITION e= expression ) switch_case_list ) | ^( BREAK_T ( expression )? ) | ^( CONTINUE_T (e= expression )? ) | ^( RETURN_T (e= expression )? ) | ^( GLOBAL_T variable_list ) | ^( STATIC_T static_var_list ) | ^( ECHO_T expr_list ) | ^( EMPTYSTATEMENT SEMI_COLON ) | expression | ^( FOREACH_T ^( AS_T e= expression v1= foreach_variable (v2= foreach_variable )? ) foreach_statement ) | ^( DECLARE_T directive declare_statement ) | ^( TRY_T block catch_branch_list ) | ^( THROW_T e= expression ) | ^( USE_T scalar ) | ^( USE_PARETHESIS_T scalar ) | ^( INCLUDE_T e= expression ) | ^( INCLUDE_ONCE_T e= expression ) | ^( REQUIRE_T e= expression ) | ^( REQUIRE_ONCE_T e= expression ) );
    public final TreePHP.topStatement_return topStatement() throws RecognitionException {
        topStatement_stack.push(new topStatement_scope());
        TreePHP.topStatement_return retval = new TreePHP.topStatement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST WHILE_T57=null;
        SLAST CONDITION58=null;
        SLAST DO_T60=null;
        SLAST CONDITION61=null;
        SLAST FOR_T63=null;
        SLAST CONDITION64=null;
        SLAST ITERATE65=null;
        SLAST SWITCH_T66=null;
        SLAST CONDITION67=null;
        SLAST BREAK_T69=null;
        SLAST CONTINUE_T71=null;
        SLAST RETURN_T72=null;
        SLAST GLOBAL_T73=null;
        SLAST STATIC_T75=null;
        SLAST ECHO_T77=null;
        SLAST EMPTYSTATEMENT79=null;
        SLAST SEMI_COLON80=null;
        SLAST FOREACH_T82=null;
        SLAST AS_T83=null;
        SLAST DECLARE_T85=null;
        SLAST TRY_T88=null;
        SLAST THROW_T91=null;
        SLAST USE_T92=null;
        SLAST USE_PARETHESIS_T94=null;
        SLAST INCLUDE_T96=null;
        SLAST INCLUDE_ONCE_T97=null;
        SLAST REQUIRE_T98=null;
        SLAST REQUIRE_ONCE_T99=null;
        TreePHP.expression_return e = null;

        TreePHP.expr_list_return e1 = null;

        TreePHP.expr_list_return e2 = null;

        TreePHP.expr_list_return e3 = null;

        TreePHP.for_statement_return s1 = null;

        TreePHP.foreach_variable_return v1 = null;

        TreePHP.foreach_variable_return v2 = null;

        TreePHP.block_return block55 = null;

        TreePHP.if_stat_return if_stat56 = null;

        TreePHP.while_statement_return while_statement59 = null;

        TreePHP.statement_return statement62 = null;

        TreePHP.switch_case_list_return switch_case_list68 = null;

        TreePHP.expression_return expression70 = null;

        TreePHP.variable_list_return variable_list74 = null;

        TreePHP.static_var_list_return static_var_list76 = null;

        TreePHP.expr_list_return expr_list78 = null;

        TreePHP.expression_return expression81 = null;

        TreePHP.foreach_statement_return foreach_statement84 = null;

        TreePHP.directive_return directive86 = null;

        TreePHP.declare_statement_return declare_statement87 = null;

        TreePHP.block_return block89 = null;

        TreePHP.catch_branch_list_return catch_branch_list90 = null;

        TreePHP.scalar_return scalar93 = null;

        TreePHP.scalar_return scalar95 = null;


        SLAST WHILE_T57_tree=null;
        SLAST CONDITION58_tree=null;
        SLAST DO_T60_tree=null;
        SLAST CONDITION61_tree=null;
        SLAST FOR_T63_tree=null;
        SLAST CONDITION64_tree=null;
        SLAST ITERATE65_tree=null;
        SLAST SWITCH_T66_tree=null;
        SLAST CONDITION67_tree=null;
        SLAST BREAK_T69_tree=null;
        SLAST CONTINUE_T71_tree=null;
        SLAST RETURN_T72_tree=null;
        SLAST GLOBAL_T73_tree=null;
        SLAST STATIC_T75_tree=null;
        SLAST ECHO_T77_tree=null;
        SLAST EMPTYSTATEMENT79_tree=null;
        SLAST SEMI_COLON80_tree=null;
        SLAST FOREACH_T82_tree=null;
        SLAST AS_T83_tree=null;
        SLAST DECLARE_T85_tree=null;
        SLAST TRY_T88_tree=null;
        SLAST THROW_T91_tree=null;
        SLAST USE_T92_tree=null;
        SLAST USE_PARETHESIS_T94_tree=null;
        SLAST INCLUDE_T96_tree=null;
        SLAST INCLUDE_ONCE_T97_tree=null;
        SLAST REQUIRE_T98_tree=null;
        SLAST REQUIRE_ONCE_T99_tree=null;


          ((topStatement_scope)topStatement_stack.peek()).declareKey = new LinkedList();
          ((topStatement_scope)topStatement_stack.peek()).declareValue = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:601:3: ( block | if_stat | ^( WHILE_T ^( CONDITION e= expression ) while_statement ) | ^( DO_T ^( CONDITION e= expression ) statement ) | ^( FOR_T (e1= expr_list )? ^( CONDITION (e2= expr_list )? ) ^( ITERATE (e3= expr_list )? ) s1= for_statement ) | ^( SWITCH_T ^( CONDITION e= expression ) switch_case_list ) | ^( BREAK_T ( expression )? ) | ^( CONTINUE_T (e= expression )? ) | ^( RETURN_T (e= expression )? ) | ^( GLOBAL_T variable_list ) | ^( STATIC_T static_var_list ) | ^( ECHO_T expr_list ) | ^( EMPTYSTATEMENT SEMI_COLON ) | expression | ^( FOREACH_T ^( AS_T e= expression v1= foreach_variable (v2= foreach_variable )? ) foreach_statement ) | ^( DECLARE_T directive declare_statement ) | ^( TRY_T block catch_branch_list ) | ^( THROW_T e= expression ) | ^( USE_T scalar ) | ^( USE_PARETHESIS_T scalar ) | ^( INCLUDE_T e= expression ) | ^( INCLUDE_ONCE_T e= expression ) | ^( REQUIRE_T e= expression ) | ^( REQUIRE_ONCE_T e= expression ) )
            int alt30=24;
            switch ( input.LA(1) ) {
            case BLOCK:
                {
                alt30=1;
                }
                break;
            case IF_T:
                {
                alt30=2;
                }
                break;
            case WHILE_T:
                {
                alt30=3;
                }
                break;
            case DO_T:
                {
                alt30=4;
                }
                break;
            case FOR_T:
                {
                alt30=5;
                }
                break;
            case SWITCH_T:
                {
                alt30=6;
                }
                break;
            case BREAK_T:
                {
                alt30=7;
                }
                break;
            case CONTINUE_T:
                {
                alt30=8;
                }
                break;
            case RETURN_T:
                {
                alt30=9;
                }
                break;
            case GLOBAL_T:
                {
                alt30=10;
                }
                break;
            case STATIC_T:
                {
                alt30=11;
                }
                break;
            case ECHO_T:
                {
                alt30=12;
                }
                break;
            case EMPTYSTATEMENT:
                {
                alt30=13;
                }
                break;
            case VAR_DECL:
            case CALL:
            case EXPR:
            case SCALAR:
            case ARRAY_DECL:
            case PREFIX_EXPR:
            case POSTFIX_EXPR:
            case CAST_EXPR:
            case UNARY_EXPR:
            case REF_T:
            case EQUAL_T:
            case OR_T:
            case XOR_T:
            case AND_T:
            case PLUS_EQ:
            case MINUS_EQ:
            case MUL_EQ:
            case DIV_EQ:
            case DOT_EQ:
            case PERCENT_EQ:
            case BIT_AND_EQ:
            case BIT_OR_EQ:
            case POWER_EQ:
            case LMOVE_EQ:
            case RMOVE_EQ:
            case QUESTION_T:
            case LOGICAL_OR_T:
            case LOGICAL_AND_T:
            case BIT_OR_T:
            case POWER_T:
            case DOT_T:
            case EQUAL_EQUAL_T:
            case NOT_EQUAL_T:
            case EQUAL_EQUAL_EQUAL_T:
            case NOT_EQUAL_EQUAL_T:
            case LT_T:
            case MT_T:
            case LE_T:
            case ME_T:
            case LSHIFT_T:
            case RSHIFT_T:
            case PLUS_T:
            case MINUS_T:
            case MUL_T:
            case DIV_T:
            case PERCENT_T:
            case UNSET_T:
            case CLONE_T:
            case INSTANCEOF_T:
            case AT_T:
            case LIST_T:
            case NEW_T:
            case BACKTRICKLITERAL:
            case PRINT_T:
                {
                alt30=14;
                }
                break;
            case FOREACH_T:
                {
                alt30=15;
                }
                break;
            case DECLARE_T:
                {
                alt30=16;
                }
                break;
            case TRY_T:
                {
                alt30=17;
                }
                break;
            case THROW_T:
                {
                alt30=18;
                }
                break;
            case USE_T:
                {
                alt30=19;
                }
                break;
            case USE_PARETHESIS_T:
                {
                alt30=20;
                }
                break;
            case INCLUDE_T:
                {
                alt30=21;
                }
                break;
            case INCLUDE_ONCE_T:
                {
                alt30=22;
                }
                break;
            case REQUIRE_T:
                {
                alt30=23;
                }
                break;
            case REQUIRE_ONCE_T:
                {
                alt30=24;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:601:5: block
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_block_in_topStatement667);
                    block55=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block55.getTree());

                        retval.stat = (block55!=null?block55.stat:null);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:605:5: if_stat
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_if_stat_in_topStatement678);
                    if_stat56=if_stat();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stat56.getTree());

                        retval.stat = (if_stat56!=null?if_stat56.stat:null);
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:609:5: ^( WHILE_T ^( CONDITION e= expression ) while_statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    WHILE_T57=(SLAST)match(input,WHILE_T,FOLLOW_WHILE_T_in_topStatement689); 
                    WHILE_T57_tree = (SLAST)adaptor.dupNode(WHILE_T57);

                    root_1 = (SLAST)adaptor.becomeRoot(WHILE_T57_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CONDITION58=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement692); 
                    CONDITION58_tree = (SLAST)adaptor.dupNode(CONDITION58);

                    root_2 = (SLAST)adaptor.becomeRoot(CONDITION58_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement696);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_while_statement_in_topStatement699);
                    while_statement59=while_statement();

                    state._fsp--;

                    adaptor.addChild(root_1, while_statement59.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = WHILE_T57.startIndex;
                        int endIndex = WHILE_T57.endIndex + 1;
                        retval.stat = new WhileStatement(startIndex, endIndex, (e!=null?e.expr:null), (while_statement59!=null?while_statement59.block:null));   
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:616:5: ^( DO_T ^( CONDITION e= expression ) statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DO_T60=(SLAST)match(input,DO_T,FOLLOW_DO_T_in_topStatement714); 
                    DO_T60_tree = (SLAST)adaptor.dupNode(DO_T60);

                    root_1 = (SLAST)adaptor.becomeRoot(DO_T60_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CONDITION61=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement717); 
                    CONDITION61_tree = (SLAST)adaptor.dupNode(CONDITION61);

                    root_2 = (SLAST)adaptor.becomeRoot(CONDITION61_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement721);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_statement_in_topStatement724);
                    statement62=statement();

                    state._fsp--;

                    adaptor.addChild(root_1, statement62.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DO_T60.startIndex;
                        int endIndex = DO_T60.endIndex + 1;
                        retval.stat = new DoStatement(startIndex, endIndex, (e!=null?e.expr:null), (statement62!=null?statement62.stat:null));      
                      

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:622:5: ^( FOR_T (e1= expr_list )? ^( CONDITION (e2= expr_list )? ) ^( ITERATE (e3= expr_list )? ) s1= for_statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    FOR_T63=(SLAST)match(input,FOR_T,FOLLOW_FOR_T_in_topStatement736); 
                    FOR_T63_tree = (SLAST)adaptor.dupNode(FOR_T63);

                    root_1 = (SLAST)adaptor.becomeRoot(FOR_T63_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:622:15: (e1= expr_list )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==VAR_DECL||LA23_0==CALL||LA23_0==EXPR||(LA23_0>=SCALAR && LA23_0<=UNARY_EXPR)||LA23_0==REF_T||LA23_0==EQUAL_T||(LA23_0>=OR_T && LA23_0<=CLONE_T)||(LA23_0>=INSTANCEOF_T && LA23_0<=PRINT_T)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:622:15: e1= expr_list
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_expr_list_in_topStatement740);
                            e1=expr_list();

                            state._fsp--;

                            adaptor.addChild(root_1, e1.getTree());

                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CONDITION64=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement744); 
                    CONDITION64_tree = (SLAST)adaptor.dupNode(CONDITION64);

                    root_2 = (SLAST)adaptor.becomeRoot(CONDITION64_tree, root_2);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:622:41: (e2= expr_list )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==VAR_DECL||LA24_0==CALL||LA24_0==EXPR||(LA24_0>=SCALAR && LA24_0<=UNARY_EXPR)||LA24_0==REF_T||LA24_0==EQUAL_T||(LA24_0>=OR_T && LA24_0<=CLONE_T)||(LA24_0>=INSTANCEOF_T && LA24_0<=PRINT_T)) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:622:41: e2= expr_list
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expr_list_in_topStatement748);
                                e2=expr_list();

                                state._fsp--;

                                adaptor.addChild(root_2, e2.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ITERATE65=(SLAST)match(input,ITERATE,FOLLOW_ITERATE_in_topStatement753); 
                    ITERATE65_tree = (SLAST)adaptor.dupNode(ITERATE65);

                    root_2 = (SLAST)adaptor.becomeRoot(ITERATE65_tree, root_2);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:622:66: (e3= expr_list )?
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==VAR_DECL||LA25_0==CALL||LA25_0==EXPR||(LA25_0>=SCALAR && LA25_0<=UNARY_EXPR)||LA25_0==REF_T||LA25_0==EQUAL_T||(LA25_0>=OR_T && LA25_0<=CLONE_T)||(LA25_0>=INSTANCEOF_T && LA25_0<=PRINT_T)) ) {
                            alt25=1;
                        }
                        switch (alt25) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:622:66: e3= expr_list
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expr_list_in_topStatement757);
                                e3=expr_list();

                                state._fsp--;

                                adaptor.addChild(root_2, e3.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_for_statement_in_topStatement763);
                    s1=for_statement();

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        List initList = new LinkedList(),
                            condList = new LinkedList(),
                            changeList = new LinkedList();
                        if ((e1!=null?e1.exprList:null) != null) initList = (e1!=null?e1.exprList:null);
                        if ((e2!=null?e2.exprList:null) != null) condList = (e2!=null?e2.exprList:null);
                        if ((e3!=null?e3.exprList:null) != null) changeList = (e3!=null?e3.exprList:null);
                        int startIndex = FOR_T63.startIndex;
                        int endIndex = FOR_T63.endIndex + 1;
                        retval.stat = new ForStatement(startIndex, endIndex, initList, condList, changeList, (s1!=null?s1.block:null));
                      

                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:634:5: ^( SWITCH_T ^( CONDITION e= expression ) switch_case_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    SWITCH_T66=(SLAST)match(input,SWITCH_T,FOLLOW_SWITCH_T_in_topStatement775); 
                    SWITCH_T66_tree = (SLAST)adaptor.dupNode(SWITCH_T66);

                    root_1 = (SLAST)adaptor.becomeRoot(SWITCH_T66_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CONDITION67=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement778); 
                    CONDITION67_tree = (SLAST)adaptor.dupNode(CONDITION67);

                    root_2 = (SLAST)adaptor.becomeRoot(CONDITION67_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement782);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_switch_case_list_in_topStatement785);
                    switch_case_list68=switch_case_list();

                    state._fsp--;

                    adaptor.addChild(root_1, switch_case_list68.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = SWITCH_T66.startIndex;
                        int endIndex = SWITCH_T66.endIndex + 1;
                        retval.stat = new SwitchStatement(startIndex, endIndex, (e!=null?e.expr:null), (switch_case_list68!=null?switch_case_list68.block:null));
                      

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:640:5: ^( BREAK_T ( expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    BREAK_T69=(SLAST)match(input,BREAK_T,FOLLOW_BREAK_T_in_topStatement797); 
                    BREAK_T69_tree = (SLAST)adaptor.dupNode(BREAK_T69);

                    root_1 = (SLAST)adaptor.becomeRoot(BREAK_T69_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:640:15: ( expression )?
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==VAR_DECL||LA26_0==CALL||LA26_0==EXPR||(LA26_0>=SCALAR && LA26_0<=UNARY_EXPR)||LA26_0==REF_T||LA26_0==EQUAL_T||(LA26_0>=OR_T && LA26_0<=CLONE_T)||(LA26_0>=INSTANCEOF_T && LA26_0<=PRINT_T)) ) {
                            alt26=1;
                        }
                        switch (alt26) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:640:15: expression
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expression_in_topStatement799);
                                expression70=expression();

                                state._fsp--;

                                adaptor.addChild(root_1, expression70.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = BREAK_T69.startIndex;
                        int endIndex = BREAK_T69.endIndex + 1;
                        retval.stat = new BreakStatement(startIndex, endIndex);
                      

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:646:5: ^( CONTINUE_T (e= expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CONTINUE_T71=(SLAST)match(input,CONTINUE_T,FOLLOW_CONTINUE_T_in_topStatement812); 
                    CONTINUE_T71_tree = (SLAST)adaptor.dupNode(CONTINUE_T71);

                    root_1 = (SLAST)adaptor.becomeRoot(CONTINUE_T71_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:646:19: (e= expression )?
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==VAR_DECL||LA27_0==CALL||LA27_0==EXPR||(LA27_0>=SCALAR && LA27_0<=UNARY_EXPR)||LA27_0==REF_T||LA27_0==EQUAL_T||(LA27_0>=OR_T && LA27_0<=CLONE_T)||(LA27_0>=INSTANCEOF_T && LA27_0<=PRINT_T)) ) {
                            alt27=1;
                        }
                        switch (alt27) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:646:19: e= expression
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expression_in_topStatement816);
                                e=expression();

                                state._fsp--;

                                adaptor.addChild(root_1, e.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = CONTINUE_T71.startIndex;
                        int endIndex = CONTINUE_T71.endIndex + 1;
                        retval.stat = new ContinueStatement(startIndex, endIndex);
                        if ((e!=null?e.expr:null) != null) {
                          retval.stat = new ContinueStatement(startIndex, endIndex, (e!=null?e.expr:null));
                        }
                      

                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:655:5: ^( RETURN_T (e= expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    RETURN_T72=(SLAST)match(input,RETURN_T,FOLLOW_RETURN_T_in_topStatement829); 
                    RETURN_T72_tree = (SLAST)adaptor.dupNode(RETURN_T72);

                    root_1 = (SLAST)adaptor.becomeRoot(RETURN_T72_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:655:17: (e= expression )?
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==VAR_DECL||LA28_0==CALL||LA28_0==EXPR||(LA28_0>=SCALAR && LA28_0<=UNARY_EXPR)||LA28_0==REF_T||LA28_0==EQUAL_T||(LA28_0>=OR_T && LA28_0<=CLONE_T)||(LA28_0>=INSTANCEOF_T && LA28_0<=PRINT_T)) ) {
                            alt28=1;
                        }
                        switch (alt28) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:655:17: e= expression
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expression_in_topStatement833);
                                e=expression();

                                state._fsp--;

                                adaptor.addChild(root_1, e.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = RETURN_T72.startIndex;
                        int endIndex = RETURN_T72.endIndex + 1;
                        retval.stat = new ReturnStatement(startIndex, endIndex);
                        if ((e!=null?e.expr:null) != null) {
                          retval.stat = new ReturnStatement(startIndex, endIndex, (e!=null?e.expr:null));
                        }
                      

                    }
                    break;
                case 10 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:664:5: ^( GLOBAL_T variable_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    GLOBAL_T73=(SLAST)match(input,GLOBAL_T,FOLLOW_GLOBAL_T_in_topStatement846); 
                    GLOBAL_T73_tree = (SLAST)adaptor.dupNode(GLOBAL_T73);

                    root_1 = (SLAST)adaptor.becomeRoot(GLOBAL_T73_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_list_in_topStatement848);
                    variable_list74=variable_list();

                    state._fsp--;

                    adaptor.addChild(root_1, variable_list74.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = GLOBAL_T73.startIndex;
                        int endIndex = GLOBAL_T73.endIndex + 1;
                        retval.stat = new GlobalStatement(startIndex, endIndex, (variable_list74!=null?variable_list74.variableList:null));
                      

                    }
                    break;
                case 11 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:670:5: ^( STATIC_T static_var_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    STATIC_T75=(SLAST)match(input,STATIC_T,FOLLOW_STATIC_T_in_topStatement860); 
                    STATIC_T75_tree = (SLAST)adaptor.dupNode(STATIC_T75);

                    root_1 = (SLAST)adaptor.becomeRoot(STATIC_T75_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_static_var_list_in_topStatement862);
                    static_var_list76=static_var_list();

                    state._fsp--;

                    adaptor.addChild(root_1, static_var_list76.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = STATIC_T75.startIndex;
                        int endIndex = STATIC_T75.endIndex + 1;
                        retval.stat = new StaticStatement(startIndex, endIndex, (static_var_list76!=null?static_var_list76.staticVarList:null));
                      

                    }
                    break;
                case 12 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:676:5: ^( ECHO_T expr_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ECHO_T77=(SLAST)match(input,ECHO_T,FOLLOW_ECHO_T_in_topStatement874); 
                    ECHO_T77_tree = (SLAST)adaptor.dupNode(ECHO_T77);

                    root_1 = (SLAST)adaptor.becomeRoot(ECHO_T77_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expr_list_in_topStatement876);
                    expr_list78=expr_list();

                    state._fsp--;

                    adaptor.addChild(root_1, expr_list78.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = ECHO_T77.startIndex;
                        int endIndex = ECHO_T77.endIndex + 1;
                        retval.stat = new EchoStatement(startIndex, endIndex, (expr_list78!=null?expr_list78.exprList:null)); 
                      

                    }
                    break;
                case 13 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:682:5: ^( EMPTYSTATEMENT SEMI_COLON )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EMPTYSTATEMENT79=(SLAST)match(input,EMPTYSTATEMENT,FOLLOW_EMPTYSTATEMENT_in_topStatement888); 
                    EMPTYSTATEMENT79_tree = (SLAST)adaptor.dupNode(EMPTYSTATEMENT79);

                    root_1 = (SLAST)adaptor.becomeRoot(EMPTYSTATEMENT79_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    SEMI_COLON80=(SLAST)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement890); 
                    SEMI_COLON80_tree = (SLAST)adaptor.dupNode(SEMI_COLON80);

                    adaptor.addChild(root_1, SEMI_COLON80_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EMPTYSTATEMENT79.startIndex;
                        int endIndex = EMPTYSTATEMENT79.endIndex + 1;
                        retval.stat = new EmptyStatement(startIndex, endIndex); 
                      

                    }
                    break;
                case 14 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:688:5: expression
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement901);
                    expression81=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression81.getTree());

                         retval.expr = (expression81!=null?expression81.expr:null);
                      

                    }
                    break;
                case 15 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:692:5: ^( FOREACH_T ^( AS_T e= expression v1= foreach_variable (v2= foreach_variable )? ) foreach_statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    FOREACH_T82=(SLAST)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_topStatement912); 
                    FOREACH_T82_tree = (SLAST)adaptor.dupNode(FOREACH_T82);

                    root_1 = (SLAST)adaptor.becomeRoot(FOREACH_T82_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    AS_T83=(SLAST)match(input,AS_T,FOLLOW_AS_T_in_topStatement915); 
                    AS_T83_tree = (SLAST)adaptor.dupNode(AS_T83);

                    root_2 = (SLAST)adaptor.becomeRoot(AS_T83_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement919);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_foreach_variable_in_topStatement923);
                    v1=foreach_variable();

                    state._fsp--;

                    adaptor.addChild(root_2, v1.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:692:59: (v2= foreach_variable )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==VAR_DECL||LA29_0==CALL||LA29_0==REF_T) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:692:59: v2= foreach_variable
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_foreach_variable_in_topStatement927);
                            v2=foreach_variable();

                            state._fsp--;

                            adaptor.addChild(root_2, v2.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_foreach_statement_in_topStatement931);
                    foreach_statement84=foreach_statement();

                    state._fsp--;

                    adaptor.addChild(root_1, foreach_statement84.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = FOREACH_T82.startIndex;
                        int endIndex = FOREACH_T82.endIndex + 1;
                        
                        if ((v2!=null?v2.expr:null) == null) {
                          retval.stat = new ForEachStatement(startIndex, endIndex, (e!=null?e.expr:null), (v1!=null?v1.expr:null), (foreach_statement84!=null?foreach_statement84.block:null));
                        }
                        else {
                          retval.stat = new ForEachStatement(startIndex, endIndex, (e!=null?e.expr:null), (v1!=null?v1.expr:null), (v2!=null?v2.expr:null), (foreach_statement84!=null?foreach_statement84.block:null));
                        }
                      

                    }
                    break;
                case 16 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:704:5: ^( DECLARE_T directive declare_statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DECLARE_T85=(SLAST)match(input,DECLARE_T,FOLLOW_DECLARE_T_in_topStatement944); 
                    DECLARE_T85_tree = (SLAST)adaptor.dupNode(DECLARE_T85);

                    root_1 = (SLAST)adaptor.becomeRoot(DECLARE_T85_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_directive_in_topStatement946);
                    directive86=directive();

                    state._fsp--;

                    adaptor.addChild(root_1, directive86.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_declare_statement_in_topStatement948);
                    declare_statement87=declare_statement();

                    state._fsp--;

                    adaptor.addChild(root_1, declare_statement87.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	    int startIndex = DECLARE_T85.startIndex;
                    	    int endIndex = DECLARE_T85.endIndex + 1;
                    	    DeclareStatement declare = new DeclareStatement(startIndex, endIndex, ((topStatement_scope)topStatement_stack.peek()).declareKey, ((topStatement_scope)topStatement_stack.peek()).declareValue, (declare_statement87!=null?declare_statement87.block:null));
                    	    retval.stat = declare;
                    	    System.out.println("declare block");
                    	  

                    }
                    break;
                case 17 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:712:5: ^( TRY_T block catch_branch_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    TRY_T88=(SLAST)match(input,TRY_T,FOLLOW_TRY_T_in_topStatement961); 
                    TRY_T88_tree = (SLAST)adaptor.dupNode(TRY_T88);

                    root_1 = (SLAST)adaptor.becomeRoot(TRY_T88_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_block_in_topStatement963);
                    block89=block();

                    state._fsp--;

                    adaptor.addChild(root_1, block89.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_catch_branch_list_in_topStatement965);
                    catch_branch_list90=catch_branch_list();

                    state._fsp--;

                    adaptor.addChild(root_1, catch_branch_list90.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = TRY_T88.startIndex;
                        int endIndex = TRY_T88.endIndex + 1;
                        
                        TryStatement tryStatement = new TryStatement(startIndex, endIndex, (Block)(block89!=null?block89.stat:null), (catch_branch_list90!=null?catch_branch_list90.catchList:null));
                        retval.stat = tryStatement;
                      

                    }
                    break;
                case 18 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:720:5: ^( THROW_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    THROW_T91=(SLAST)match(input,THROW_T,FOLLOW_THROW_T_in_topStatement977); 
                    THROW_T91_tree = (SLAST)adaptor.dupNode(THROW_T91);

                    root_1 = (SLAST)adaptor.becomeRoot(THROW_T91_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement981);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = THROW_T91.startIndex;
                        int endIndex = THROW_T91.endIndex + 1;
                        retval.stat = new ThrowStatement(startIndex, endIndex, (e!=null?e.expr:null)); 
                      

                    }
                    break;
                case 19 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:726:5: ^( USE_T scalar )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    USE_T92=(SLAST)match(input,USE_T,FOLLOW_USE_T_in_topStatement993); 
                    USE_T92_tree = (SLAST)adaptor.dupNode(USE_T92);

                    root_1 = (SLAST)adaptor.becomeRoot(USE_T92_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_topStatement995);
                    scalar93=scalar();

                    state._fsp--;

                    adaptor.addChild(root_1, scalar93.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = USE_T92.startIndex;
                        int endIndex = USE_T92.endIndex;
                        SimpleReference functionName = new SimpleReference(startIndex, startIndex + "use".length(), "use");
                        
                        PHPCallArgumentsList list = new PHPCallArgumentsList((scalar93!=null?scalar93.expr:null).sourceStart(), (scalar93!=null?scalar93.expr:null).sourceEnd());
                        list.addNode((scalar93!=null?scalar93.expr:null));
                        
                        retval.expr = new PHPCallExpression(startIndex, endIndex, null, functionName, list);
                      

                    }
                    break;
                case 20 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:737:5: ^( USE_PARETHESIS_T scalar )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    USE_PARETHESIS_T94=(SLAST)match(input,USE_PARETHESIS_T,FOLLOW_USE_PARETHESIS_T_in_topStatement1007); 
                    USE_PARETHESIS_T94_tree = (SLAST)adaptor.dupNode(USE_PARETHESIS_T94);

                    root_1 = (SLAST)adaptor.becomeRoot(USE_PARETHESIS_T94_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_topStatement1009);
                    scalar95=scalar();

                    state._fsp--;

                    adaptor.addChild(root_1, scalar95.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = USE_PARETHESIS_T94.startIndex;
                        int endIndex = USE_PARETHESIS_T94.endIndex;
                        SimpleReference functionName = new SimpleReference(startIndex, startIndex + "use".length(), "use");
                        
                        PHPCallArgumentsList list = new PHPCallArgumentsList((scalar95!=null?scalar95.expr:null).sourceStart() - 1, (scalar95!=null?scalar95.expr:null).sourceEnd() + 1);
                        list.addNode((scalar95!=null?scalar95.expr:null));
                        
                        retval.expr = new PHPCallExpression(startIndex, endIndex, null, functionName, list);
                      

                    }
                    break;
                case 21 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:748:5: ^( INCLUDE_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INCLUDE_T96=(SLAST)match(input,INCLUDE_T,FOLLOW_INCLUDE_T_in_topStatement1021); 
                    INCLUDE_T96_tree = (SLAST)adaptor.dupNode(INCLUDE_T96);

                    root_1 = (SLAST)adaptor.becomeRoot(INCLUDE_T96_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement1025);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = INCLUDE_T96.startIndex;
                        int endIndex = INCLUDE_T96.endIndex;
                        retval.expr = new Include(startIndex, endIndex, (e!=null?e.expr:null), Include.IT_INCLUDE);
                      

                    }
                    break;
                case 22 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:754:5: ^( INCLUDE_ONCE_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INCLUDE_ONCE_T97=(SLAST)match(input,INCLUDE_ONCE_T,FOLLOW_INCLUDE_ONCE_T_in_topStatement1038); 
                    INCLUDE_ONCE_T97_tree = (SLAST)adaptor.dupNode(INCLUDE_ONCE_T97);

                    root_1 = (SLAST)adaptor.becomeRoot(INCLUDE_ONCE_T97_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement1042);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = INCLUDE_ONCE_T97.startIndex;
                        int endIndex = INCLUDE_ONCE_T97.endIndex;
                        retval.expr = new Include(startIndex, endIndex, (e!=null?e.expr:null), Include.IT_INCLUDE_ONCE);
                      

                    }
                    break;
                case 23 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:760:5: ^( REQUIRE_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    REQUIRE_T98=(SLAST)match(input,REQUIRE_T,FOLLOW_REQUIRE_T_in_topStatement1055); 
                    REQUIRE_T98_tree = (SLAST)adaptor.dupNode(REQUIRE_T98);

                    root_1 = (SLAST)adaptor.becomeRoot(REQUIRE_T98_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement1059);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = REQUIRE_T98.startIndex;
                        int endIndex = REQUIRE_T98.endIndex;
                        retval.expr = new Include(startIndex, endIndex, (e!=null?e.expr:null), Include.IT_REQUIRE);
                      

                    }
                    break;
                case 24 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:766:5: ^( REQUIRE_ONCE_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    REQUIRE_ONCE_T99=(SLAST)match(input,REQUIRE_ONCE_T,FOLLOW_REQUIRE_ONCE_T_in_topStatement1072); 
                    REQUIRE_ONCE_T99_tree = (SLAST)adaptor.dupNode(REQUIRE_ONCE_T99);

                    root_1 = (SLAST)adaptor.becomeRoot(REQUIRE_ONCE_T99_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement1076);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = REQUIRE_ONCE_T99.startIndex;
                        int endIndex = REQUIRE_ONCE_T99.endIndex;
                        retval.expr = new Include(startIndex, endIndex, (e!=null?e.expr:null), Include.IT_REQUIRE_ONCE);
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            topStatement_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "topStatement"

    public static class foreach_variable_return extends TreeRuleReturnScope {
        public Expression expr;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach_variable"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:777:1: foreach_variable returns [Expression expr] : ( REF_T )? variable ;
    public final TreePHP.foreach_variable_return foreach_variable() throws RecognitionException {
        TreePHP.foreach_variable_return retval = new TreePHP.foreach_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST REF_T100=null;
        TreePHP.variable_return variable101 = null;


        SLAST REF_T100_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:783:3: ( ( REF_T )? variable )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:783:5: ( REF_T )? variable
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:783:5: ( REF_T )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==REF_T) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:783:5: REF_T
                    {
                    _last = (SLAST)input.LT(1);
                    REF_T100=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_foreach_variable1107); 
                    REF_T100_tree = (SLAST)adaptor.dupNode(REF_T100);

                    adaptor.addChild(root_0, REF_T100_tree);


                    }
                    break;

            }

            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_variable_in_foreach_variable1110);
            variable101=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable101.getTree());

                retval.expr = (variable101!=null?variable101.var:null);
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreach_variable"

    public static class use_filename_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "use_filename"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:790:1: use_filename : ( STRINGLITERAL | QUOTE_STRING );
    public final TreePHP.use_filename_return use_filename() throws RecognitionException {
        TreePHP.use_filename_return retval = new TreePHP.use_filename_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST set102=null;

        SLAST set102_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:791:3: ( STRINGLITERAL | QUOTE_STRING )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            set102=(SLAST)input.LT(1);
            if ( (input.LA(1)>=STRINGLITERAL && input.LA(1)<=QUOTE_STRING) ) {
                input.consume();

                set102_tree = (SLAST)adaptor.dupNode(set102);

                adaptor.addChild(root_0, set102_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "use_filename"

    protected static class variable_list_scope {
        List varList;
    }
    protected Stack variable_list_stack = new Stack();

    public static class variable_list_return extends TreeRuleReturnScope {
        public List variableList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:795:1: variable_list returns [List variableList] : ( variable )+ ;
    public final TreePHP.variable_list_return variable_list() throws RecognitionException {
        variable_list_stack.push(new variable_list_scope());
        TreePHP.variable_list_return retval = new TreePHP.variable_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.variable_return variable103 = null;




          ((variable_list_scope)variable_list_stack.peek()).varList = new LinkedList();
          inVarList = true;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:806:3: ( ( variable )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:806:5: ( variable )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:806:5: ( variable )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==VAR_DECL||LA32_0==CALL) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:806:5: variable
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_variable_in_variable_list1170);
            	    variable103=variable();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variable103.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);


                retval.variableList = ((variable_list_scope)variable_list_stack.peek()).varList;
                inVarList = false;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);


              retval.tree = ((SLAST)retval.start);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            variable_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "variable_list"

    protected static class fully_qualified_class_name_list_scope {
        List nameList;
    }
    protected Stack fully_qualified_class_name_list_stack = new Stack();

    public static class fully_qualified_class_name_list_return extends TreeRuleReturnScope {
        public List list;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fully_qualified_class_name_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:813:1: fully_qualified_class_name_list returns [List list] : ( fully_qualified_class_name )+ ;
    public final TreePHP.fully_qualified_class_name_list_return fully_qualified_class_name_list() throws RecognitionException {
        fully_qualified_class_name_list_stack.push(new fully_qualified_class_name_list_scope());
        TreePHP.fully_qualified_class_name_list_return retval = new TreePHP.fully_qualified_class_name_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name104 = null;




          ((fully_qualified_class_name_list_scope)fully_qualified_class_name_list_stack.peek()).nameList = new LinkedList();
          inNameList = true;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:824:3: ( ( fully_qualified_class_name )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:824:5: ( fully_qualified_class_name )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:824:5: ( fully_qualified_class_name )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==IDENTIFIER||LA33_0==DOMAIN_T) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:824:5: fully_qualified_class_name
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1208);
            	    fully_qualified_class_name104=fully_qualified_class_name();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fully_qualified_class_name104.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
            } while (true);


                retval.list = ((fully_qualified_class_name_list_scope)fully_qualified_class_name_list_stack.peek()).nameList; 
                inNameList = false;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);


              retval.tree = ((SLAST)retval.start);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            fully_qualified_class_name_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "fully_qualified_class_name_list"

    public static class fully_qualified_class_name_return extends TreeRuleReturnScope {
        public String name;
        public TypeReference type;
        public SimpleReference simpleRef;
        public StaticConstantAccess constant;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fully_qualified_class_name"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:831:1: fully_qualified_class_name returns [String name, TypeReference type, SimpleReference simpleRef, StaticConstantAccess constant] : ( ^(d= DOMAIN_T f= fully_qualified_class_name IDENTIFIER ) ( DOMAIN_T )? | IDENTIFIER ( DOMAIN_T )? );
    public final TreePHP.fully_qualified_class_name_return fully_qualified_class_name() throws RecognitionException {
        TreePHP.fully_qualified_class_name_return retval = new TreePHP.fully_qualified_class_name_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST d=null;
        SLAST IDENTIFIER105=null;
        SLAST DOMAIN_T106=null;
        SLAST IDENTIFIER107=null;
        SLAST DOMAIN_T108=null;
        TreePHP.fully_qualified_class_name_return f = null;


        SLAST d_tree=null;
        SLAST IDENTIFIER105_tree=null;
        SLAST DOMAIN_T106_tree=null;
        SLAST IDENTIFIER107_tree=null;
        SLAST DOMAIN_T108_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:832:3: ( ^(d= DOMAIN_T f= fully_qualified_class_name IDENTIFIER ) ( DOMAIN_T )? | IDENTIFIER ( DOMAIN_T )? )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==DOMAIN_T) ) {
                alt36=1;
            }
            else if ( (LA36_0==IDENTIFIER) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:832:5: ^(d= DOMAIN_T f= fully_qualified_class_name IDENTIFIER ) ( DOMAIN_T )?
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    d=(SLAST)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name1235); 
                    d_tree = (SLAST)adaptor.dupNode(d);

                    root_1 = (SLAST)adaptor.becomeRoot(d_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name1239);
                    f=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_1, f.getTree());
                    _last = (SLAST)input.LT(1);
                    IDENTIFIER105=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name1241); 
                    IDENTIFIER105_tree = (SLAST)adaptor.dupNode(IDENTIFIER105);

                    adaptor.addChild(root_1, IDENTIFIER105_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:832:59: ( DOMAIN_T )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==DOMAIN_T) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==UP||LA34_1==VAR_DECL||LA34_1==INDEX||LA34_1==CALL||LA34_1==ARGU||(LA34_1>=VAR && LA34_1<=HASH_INDEX)||LA34_1==IDENTIFIER||LA34_1==DOMAIN_T) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:832:59: DOMAIN_T
                            {
                            _last = (SLAST)input.LT(1);
                            DOMAIN_T106=(SLAST)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name1244); 
                            DOMAIN_T106_tree = (SLAST)adaptor.dupNode(DOMAIN_T106);

                            adaptor.addChild(root_0, DOMAIN_T106_tree);


                            }
                            break;

                    }


                        int startIndex = d.startIndex;
                        int endIndex = d.endIndex + 1;
                        String className = null;
                        TypeReference type = null;
                            
                        if ((f!=null?f.name:null) != null) {
                          className = (f!=null?f.name:null);
                          
                          System.out.println("classname: " + className);
                          int typeLeft = ((CommonToken)(f!=null?((SLAST)f.tree):null).token).getStartIndex();
                          int typeRight = ((CommonToken)(f!=null?((SLAST)f.tree):null).token).getStopIndex() + 1;
                          type = new TypeReference(typeLeft, typeRight, className);
                          CommonToken token = (CommonToken)IDENTIFIER105.token;
                          int varLeft = token.getStartIndex();
                          int varRight = token.getStopIndex() + 1;
                          retval.type = type;
                          retval.simpleRef = new SimpleReference(varLeft, varRight, (IDENTIFIER105!=null?IDENTIFIER105.getText():null));
                        }
                        else {
                          type = retval.type;
                        }
                          
                        CommonToken token = (CommonToken)IDENTIFIER105.token;
                        int varLeft = token.getStartIndex();
                        int varRight = token.getStopIndex() + 1;
                        ConstantReference constRef = new ConstantReference(varLeft, varRight, (IDENTIFIER105!=null?IDENTIFIER105.getText():null));
                        retval.constant = new StaticConstantAccess(startIndex, endIndex, type, constRef);
                        
                        if (inNameList) {
                          ((fully_qualified_class_name_list_scope)fully_qualified_class_name_list_stack.peek()).nameList.add(type);
                        }
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:866:5: IDENTIFIER ( DOMAIN_T )?
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    IDENTIFIER107=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name1255); 
                    IDENTIFIER107_tree = (SLAST)adaptor.dupNode(IDENTIFIER107);

                    adaptor.addChild(root_0, IDENTIFIER107_tree);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:866:16: ( DOMAIN_T )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==DOMAIN_T) ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1==UP||LA35_1==VAR_DECL||LA35_1==INDEX||LA35_1==CALL||LA35_1==ARGU||(LA35_1>=VAR && LA35_1<=HASH_INDEX)||LA35_1==IDENTIFIER||LA35_1==DOMAIN_T) ) {
                            alt35=1;
                        }
                    }
                    switch (alt35) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:866:16: DOMAIN_T
                            {
                            _last = (SLAST)input.LT(1);
                            DOMAIN_T108=(SLAST)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name1257); 
                            DOMAIN_T108_tree = (SLAST)adaptor.dupNode(DOMAIN_T108);

                            adaptor.addChild(root_0, DOMAIN_T108_tree);


                            }
                            break;

                    }


                        retval.name = (IDENTIFIER107!=null?IDENTIFIER107.getText():null);
                        int typeLeft = ((CommonToken)IDENTIFIER107.token).getStartIndex();
                        int typeRight = ((CommonToken)IDENTIFIER107.token).getStopIndex() + 1;

                        retval.type = new TypeReference(typeLeft, typeRight, (IDENTIFIER107!=null?IDENTIFIER107.getText():null));
                        
                        if (inNameList) {
                          ((fully_qualified_class_name_list_scope)fully_qualified_class_name_list_stack.peek()).nameList.add(retval.type);
                        }
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fully_qualified_class_name"

    protected static class static_var_list_scope {
        List varList;
    }
    protected Stack static_var_list_stack = new Stack();

    public static class static_var_list_return extends TreeRuleReturnScope {
        public List staticVarList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "static_var_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:881:1: static_var_list returns [List staticVarList] : ( static_var_element )+ ;
    public final TreePHP.static_var_list_return static_var_list() throws RecognitionException {
        static_var_list_stack.push(new static_var_list_scope());
        TreePHP.static_var_list_return retval = new TreePHP.static_var_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.static_var_element_return static_var_element109 = null;




          ((static_var_list_scope)static_var_list_stack.peek()).varList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:888:3: ( ( static_var_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:888:5: ( static_var_element )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:888:5: ( static_var_element )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==VAR_DECL||LA37_0==EQUAL_T) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:888:5: static_var_element
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_static_var_element_in_static_var_list1291);
            	    static_var_element109=static_var_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, static_var_element109.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


                retval.staticVarList = ((static_var_list_scope)static_var_list_stack.peek()).varList;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            static_var_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "static_var_list"

    public static class static_var_element_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "static_var_element"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:894:1: static_var_element : ( pure_variable | ^( EQUAL_T pure_variable scalar ) );
    public final TreePHP.static_var_element_return static_var_element() throws RecognitionException {
        TreePHP.static_var_element_return retval = new TreePHP.static_var_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST EQUAL_T111=null;
        TreePHP.pure_variable_return pure_variable110 = null;

        TreePHP.pure_variable_return pure_variable112 = null;

        TreePHP.scalar_return scalar113 = null;


        SLAST EQUAL_T111_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:895:3: ( pure_variable | ^( EQUAL_T pure_variable scalar ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==VAR_DECL) ) {
                alt38=1;
            }
            else if ( (LA38_0==EQUAL_T) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:895:5: pure_variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_pure_variable_in_static_var_element1309);
                    pure_variable110=pure_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, pure_variable110.getTree());

                        int varNameLeft = (pure_variable110!=null?((SLAST)pure_variable110.tree):null).startIndex;
                        int varNameRight = (pure_variable110!=null?((SLAST)pure_variable110.tree):null).endIndex + 2;
                        String varName = (pure_variable110!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(pure_variable110.start),
                      input.getTreeAdaptor().getTokenStopIndex(pure_variable110.start))):null);
                        VariableReference varId = new VariableReference(varNameLeft, varNameRight, varName);
                        
                        if (inClassStatementList) {
                          Object obj = new ASTNode[] {varId, null};
                          ((class_statement_scope)class_statement_stack.peek()).varList.add(obj);
                        }
                        else {
                          ((static_var_list_scope)static_var_list_stack.peek()).varList.add(varId);
                          System.out.println("var id:" + varId);
                        }
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:911:5: ^( EQUAL_T pure_variable scalar )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EQUAL_T111=(SLAST)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_static_var_element1320); 
                    EQUAL_T111_tree = (SLAST)adaptor.dupNode(EQUAL_T111);

                    root_1 = (SLAST)adaptor.becomeRoot(EQUAL_T111_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_pure_variable_in_static_var_element1322);
                    pure_variable112=pure_variable();

                    state._fsp--;

                    adaptor.addChild(root_1, pure_variable112.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_static_var_element1324);
                    scalar113=scalar();

                    state._fsp--;

                    adaptor.addChild(root_1, scalar113.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EQUAL_T111.startIndex;
                        int endIndex = EQUAL_T111.endIndex + 1;
                        int varNameLeft = (pure_variable112!=null?((SLAST)pure_variable112.tree):null).startIndex;
                        int varNameRight = (pure_variable112!=null?((SLAST)pure_variable112.tree):null).endIndex + 2;
                        String varName = (pure_variable112!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(pure_variable112.start),
                      input.getTreeAdaptor().getTokenStopIndex(pure_variable112.start))):null);
                        Expression expr = (scalar113!=null?scalar113.expr:null);
                        
                        VariableReference varId = new VariableReference(varNameLeft, varNameRight, varName);

                        Expression assignExpr = new Assignment(startIndex, endIndex, varId, Assignment.OP_EQUAL, expr);
                        if (inClassStatementList) {
                          Object obj = new ASTNode[] {varId, expr};
                          ((class_statement_scope)class_statement_stack.peek()).varList.add(obj);
                        }
                        else {
                          ((static_var_list_scope)static_var_list_stack.peek()).varList.add(assignExpr);
                        }
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "static_var_element"

    protected static class if_stat_scope {
        List conditionList;
        List statementList;
        List tokenList;
    }
    protected Stack if_stat_stack = new Stack();

    public static class if_stat_return extends TreeRuleReturnScope {
        public Statement stat;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_stat"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:933:1: if_stat returns [Statement stat] : ^( IF_T ^( CONDITION expression ) ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? ) ) ;
    public final TreePHP.if_stat_return if_stat() throws RecognitionException {
        if_stat_stack.push(new if_stat_scope());
        TreePHP.if_stat_return retval = new TreePHP.if_stat_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST IF_T114=null;
        SLAST CONDITION115=null;
        SLAST ELSE_T119=null;
        TreePHP.expression_return expression116 = null;

        TreePHP.inner_statement_list_return inner_statement_list117 = null;

        TreePHP.else_if_stat_return else_if_stat118 = null;

        TreePHP.statement_return statement120 = null;


        SLAST IF_T114_tree=null;
        SLAST CONDITION115_tree=null;
        SLAST ELSE_T119_tree=null;


          ((if_stat_scope)if_stat_stack.peek()).conditionList = new LinkedList();
          ((if_stat_scope)if_stat_stack.peek()).statementList = new LinkedList();
          ((if_stat_scope)if_stat_stack.peek()).tokenList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:944:3: ( ^( IF_T ^( CONDITION expression ) ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? ) ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:944:5: ^( IF_T ^( CONDITION expression ) ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? ) )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            IF_T114=(SLAST)match(input,IF_T,FOLLOW_IF_T_in_if_stat1358); 
            IF_T114_tree = (SLAST)adaptor.dupNode(IF_T114);

            root_1 = (SLAST)adaptor.becomeRoot(IF_T114_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_2 = _last;
            SLAST _first_2 = null;
            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            CONDITION115=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_if_stat1362); 
            CONDITION115_tree = (SLAST)adaptor.dupNode(CONDITION115);

            root_2 = (SLAST)adaptor.becomeRoot(CONDITION115_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_expression_in_if_stat1364);
            expression116=expression();

            state._fsp--;

            adaptor.addChild(root_2, expression116.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:945:5: ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:946:7: ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )?
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:946:7: ( inner_statement_list )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==METHOD_DECL||LA39_0==STATEMENT||LA39_0==CLASS_T||LA39_0==INTERFACE_T||LA39_0==174) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:946:7: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_if_stat1380);
                    inner_statement_list117=inner_statement_list();

                    state._fsp--;

                    adaptor.addChild(root_1, inner_statement_list117.getTree());

                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:947:7: ( else_if_stat )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==ELSEIF_T) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:947:7: else_if_stat
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_else_if_stat_in_if_stat1389);
            	    else_if_stat118=else_if_stat();

            	    state._fsp--;

            	    adaptor.addChild(root_1, else_if_stat118.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:947:21: ( ^( ELSE_T statement ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ELSE_T) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:947:22: ^( ELSE_T statement )
                    {
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ELSE_T119=(SLAST)match(input,ELSE_T,FOLLOW_ELSE_T_in_if_stat1394); 
                    ELSE_T119_tree = (SLAST)adaptor.dupNode(ELSE_T119);

                    root_2 = (SLAST)adaptor.becomeRoot(ELSE_T119_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_statement_in_if_stat1396);
                    statement120=statement();

                    state._fsp--;

                    adaptor.addChild(root_2, statement120.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    }
                    break;

            }


            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                  int startIndex = IF_T114.startIndex;
                  int endIndex = IF_T114.endIndex + 1;
                  System.out.println("if:" + startIndex + " " + endIndex);
                  Expression innerCondition = null; 
                  Statement trueStatement = null;
                  Statement falseStatement = (statement120!=null?statement120.stat:null);
                  Iterator iterCond = ((if_stat_scope)if_stat_stack.peek()).conditionList.iterator(),
                          iterIfTrueStat = ((if_stat_scope)if_stat_stack.peek()).statementList.iterator(),
                          iterTokenList = ((if_stat_scope)if_stat_stack.peek()).tokenList.iterator();
                  while (iterCond.hasNext()) {
                     innerCondition = (Expression)iterCond.next();
                     trueStatement = (Statement)iterIfTrueStat.next();
                     int start = (Integer)iterTokenList.next();
                     falseStatement = new IfStatement(start, trueStatement.sourceEnd(), innerCondition, trueStatement, falseStatement);
                  }
                  
                  int sid = ((CommonToken)(inner_statement_list117!=null?((SLAST)inner_statement_list117.tree):null).token).getStartIndex();
                  int eid = ((CommonToken)(inner_statement_list117!=null?((SLAST)inner_statement_list117.tree):null).token).getStopIndex() + 1;
                  Block block = new Block(sid, eid, new LinkedList());
                  if ((inner_statement_list117!=null?inner_statement_list117.innerStatementList:null) != null) {
                    block.getStatements().clear();
                    block.acceptStatements((inner_statement_list117!=null?inner_statement_list117.innerStatementList:null));
                  }
                  retval.stat = new IfStatement(startIndex, endIndex, (expression116!=null?expression116.expr:null), block, falseStatement);  
                

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if_stat_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "if_stat"

    public static class else_if_stat_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "else_if_stat"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:977:1: else_if_stat : ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) ;
    public final TreePHP.else_if_stat_return else_if_stat() throws RecognitionException {
        TreePHP.else_if_stat_return retval = new TreePHP.else_if_stat_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST ELSEIF_T121=null;
        SLAST CONDITION122=null;
        TreePHP.expression_return expression123 = null;

        TreePHP.inner_statement_list_return inner_statement_list124 = null;


        SLAST ELSEIF_T121_tree=null;
        SLAST CONDITION122_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:978:3: ( ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:978:5: ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            ELSEIF_T121=(SLAST)match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_else_if_stat1426); 
            ELSEIF_T121_tree = (SLAST)adaptor.dupNode(ELSEIF_T121);

            root_1 = (SLAST)adaptor.becomeRoot(ELSEIF_T121_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_2 = _last;
            SLAST _first_2 = null;
            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            CONDITION122=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_else_if_stat1429); 
            CONDITION122_tree = (SLAST)adaptor.dupNode(CONDITION122);

            root_2 = (SLAST)adaptor.becomeRoot(CONDITION122_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_expression_in_else_if_stat1431);
            expression123=expression();

            state._fsp--;

            adaptor.addChild(root_2, expression123.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:978:40: ( inner_statement_list )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==METHOD_DECL||LA42_0==STATEMENT||LA42_0==CLASS_T||LA42_0==INTERFACE_T||LA42_0==174) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:978:40: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_else_if_stat1434);
                    inner_statement_list124=inner_statement_list();

                    state._fsp--;

                    adaptor.addChild(root_1, inner_statement_list124.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                int startIndex = ELSEIF_T121.startIndex;
                int endIndex = ELSEIF_T121.endIndex;
                ((if_stat_scope)if_stat_stack.peek()).conditionList.add((expression123!=null?expression123.expr:null));
                
                Block block = new Block(startIndex, endIndex, new LinkedList());
                if ((inner_statement_list124!=null?inner_statement_list124.innerStatementList:null) != null) {
                  block.getStatements().clear();
                  block.acceptStatements((inner_statement_list124!=null?inner_statement_list124.innerStatementList:null));
                }
                ((if_stat_scope)if_stat_stack.peek()).statementList.add(block);
                ((if_stat_scope)if_stat_stack.peek()).tokenList.add(startIndex);
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "else_if_stat"

    protected static class switch_case_list_scope {
        List list;
    }
    protected Stack switch_case_list_stack = new Stack();

    public static class switch_case_list_return extends TreeRuleReturnScope {
        public Block block;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switch_case_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:995:1: switch_case_list returns [Block block] : ( case_list )+ ;
    public final TreePHP.switch_case_list_return switch_case_list() throws RecognitionException {
        switch_case_list_stack.push(new switch_case_list_scope());
        TreePHP.switch_case_list_return retval = new TreePHP.switch_case_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.case_list_return case_list125 = null;




          ((switch_case_list_scope)switch_case_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1002:3: ( ( case_list )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1002:5: ( case_list )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1002:5: ( case_list )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=CASE_T && LA43_0<=DEFAULT_T)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1002:5: case_list
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_case_list_in_switch_case_list1468);
            	    case_list125=case_list();

            	    state._fsp--;

            	    adaptor.addChild(root_0, case_list125.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);


                int startIndex = -1;
                int endIndex = -1;
                Block block = new Block(startIndex, endIndex, new LinkedList());
                block.getStatements().clear();
                block.acceptStatements(((switch_case_list_scope)switch_case_list_stack.peek()).list);
                retval.block = block;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            switch_case_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "switch_case_list"

    public static class case_list_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "case_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1013:1: case_list : ( ^( CASE_T e= expression ( inner_statement_list )? ) | ^( DEFAULT_T ( inner_statement_list )? ) );
    public final TreePHP.case_list_return case_list() throws RecognitionException {
        TreePHP.case_list_return retval = new TreePHP.case_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CASE_T126=null;
        SLAST DEFAULT_T128=null;
        TreePHP.expression_return e = null;

        TreePHP.inner_statement_list_return inner_statement_list127 = null;

        TreePHP.inner_statement_list_return inner_statement_list129 = null;


        SLAST CASE_T126_tree=null;
        SLAST DEFAULT_T128_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1014:3: ( ^( CASE_T e= expression ( inner_statement_list )? ) | ^( DEFAULT_T ( inner_statement_list )? ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==CASE_T) ) {
                alt46=1;
            }
            else if ( (LA46_0==DEFAULT_T) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1014:5: ^( CASE_T e= expression ( inner_statement_list )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CASE_T126=(SLAST)match(input,CASE_T,FOLLOW_CASE_T_in_case_list1487); 
                    CASE_T126_tree = (SLAST)adaptor.dupNode(CASE_T126);

                    root_1 = (SLAST)adaptor.becomeRoot(CASE_T126_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_case_list1491);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1014:27: ( inner_statement_list )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==METHOD_DECL||LA44_0==STATEMENT||LA44_0==CLASS_T||LA44_0==INTERFACE_T||LA44_0==174) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1014:27: inner_statement_list
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_inner_statement_list_in_case_list1493);
                            inner_statement_list127=inner_statement_list();

                            state._fsp--;

                            adaptor.addChild(root_1, inner_statement_list127.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = CASE_T126.startIndex;
                        int endIndex = CASE_T126.endIndex + 1;
                        List list = new LinkedList();
                        if ((inner_statement_list127!=null?inner_statement_list127.innerStatementList:null) != null) {
                          list = (inner_statement_list127!=null?inner_statement_list127.innerStatementList:null);
                        }
                        SwitchCase switchCase = new SwitchCase(startIndex, endIndex, (e!=null?e.expr:null), list, false);
                        ((switch_case_list_scope)switch_case_list_stack.peek()).list.add(switchCase);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1025:5: ^( DEFAULT_T ( inner_statement_list )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DEFAULT_T128=(SLAST)match(input,DEFAULT_T,FOLLOW_DEFAULT_T_in_case_list1508); 
                    DEFAULT_T128_tree = (SLAST)adaptor.dupNode(DEFAULT_T128);

                    root_1 = (SLAST)adaptor.becomeRoot(DEFAULT_T128_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1025:17: ( inner_statement_list )?
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==METHOD_DECL||LA45_0==STATEMENT||LA45_0==CLASS_T||LA45_0==INTERFACE_T||LA45_0==174) ) {
                            alt45=1;
                        }
                        switch (alt45) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1025:17: inner_statement_list
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_inner_statement_list_in_case_list1510);
                                inner_statement_list129=inner_statement_list();

                                state._fsp--;

                                adaptor.addChild(root_1, inner_statement_list129.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DEFAULT_T128.startIndex;
                        int endIndex = DEFAULT_T128.endIndex + 1;
                        List list = new LinkedList();
                        if ((inner_statement_list129!=null?inner_statement_list129.innerStatementList:null) != null) {
                          list = (inner_statement_list129!=null?inner_statement_list129.innerStatementList:null);
                        }
                        SwitchCase switchCase = new SwitchCase(startIndex, endIndex, null, list, true);
                        ((switch_case_list_scope)switch_case_list_stack.peek()).list.add(switchCase);
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "case_list"

    protected static class catch_branch_list_scope {
        List list;
    }
    protected Stack catch_branch_list_stack = new Stack();

    public static class catch_branch_list_return extends TreeRuleReturnScope {
        public List catchList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_branch_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1038:1: catch_branch_list returns [List catchList] : ( catch_branch )+ ;
    public final TreePHP.catch_branch_list_return catch_branch_list() throws RecognitionException {
        catch_branch_list_stack.push(new catch_branch_list_scope());
        TreePHP.catch_branch_list_return retval = new TreePHP.catch_branch_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.catch_branch_return catch_branch130 = null;




          ((catch_branch_list_scope)catch_branch_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1045:3: ( ( catch_branch )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1045:5: ( catch_branch )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1045:5: ( catch_branch )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==CATCH_T) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1045:5: catch_branch
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_catch_branch_in_catch_branch_list1544);
            	    catch_branch130=catch_branch();

            	    state._fsp--;

            	    adaptor.addChild(root_0, catch_branch130.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);


                retval.catchList = ((catch_branch_list_scope)catch_branch_list_stack.peek()).list;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            catch_branch_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "catch_branch_list"

    public static class catch_branch_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catch_branch"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1051:1: catch_branch : ^( CATCH_T fully_qualified_class_name variable block ) ;
    public final TreePHP.catch_branch_return catch_branch() throws RecognitionException {
        TreePHP.catch_branch_return retval = new TreePHP.catch_branch_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CATCH_T131=null;
        TreePHP.fully_qualified_class_name_return fully_qualified_class_name132 = null;

        TreePHP.variable_return variable133 = null;

        TreePHP.block_return block134 = null;


        SLAST CATCH_T131_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1052:3: ( ^( CATCH_T fully_qualified_class_name variable block ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1052:5: ^( CATCH_T fully_qualified_class_name variable block )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            CATCH_T131=(SLAST)match(input,CATCH_T,FOLLOW_CATCH_T_in_catch_branch1566); 
            CATCH_T131_tree = (SLAST)adaptor.dupNode(CATCH_T131);

            root_1 = (SLAST)adaptor.becomeRoot(CATCH_T131_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_fully_qualified_class_name_in_catch_branch1568);
            fully_qualified_class_name132=fully_qualified_class_name();

            state._fsp--;

            adaptor.addChild(root_1, fully_qualified_class_name132.getTree());
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_variable_in_catch_branch1570);
            variable133=variable();

            state._fsp--;

            adaptor.addChild(root_1, variable133.getTree());
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_block_in_catch_branch1572);
            block134=block();

            state._fsp--;

            adaptor.addChild(root_1, block134.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                int startIndex = CATCH_T131.startIndex;
                int endIndex = CATCH_T131.endIndex + 1;
                CatchClause catchClause = new CatchClause(startIndex, endIndex, (fully_qualified_class_name132!=null?fully_qualified_class_name132.type:null), (VariableReference)(variable133!=null?variable133.var:null), (Block)(block134!=null?block134.stat:null));
                ((catch_branch_list_scope)catch_branch_list_stack.peek()).list.add(catchClause);
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "catch_branch"

    public static class for_statement_return extends TreeRuleReturnScope {
        public Statement block;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "for_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1061:1: for_statement returns [Statement block] : ( inner_statement_list )? ;
    public final TreePHP.for_statement_return for_statement() throws RecognitionException {
        TreePHP.for_statement_return retval = new TreePHP.for_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.inner_statement_list_return inner_statement_list135 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1062:2: ( ( inner_statement_list )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1062:4: ( inner_statement_list )?
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1062:4: ( inner_statement_list )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==METHOD_DECL||LA48_0==STATEMENT||LA48_0==CLASS_T||LA48_0==INTERFACE_T||LA48_0==174) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1062:4: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_for_statement1593);
                    inner_statement_list135=inner_statement_list();

                    state._fsp--;

                    adaptor.addChild(root_0, inner_statement_list135.getTree());

                    }
                    break;

            }


                  int startIndex = -1;
                  int endIndex = -1;
                  Block block = new Block(startIndex, endIndex, new LinkedList());
                  if ((inner_statement_list135!=null?inner_statement_list135.innerStatementList:null) != null) {
                    block.getStatements().clear();
                    block.acceptStatements((inner_statement_list135!=null?inner_statement_list135.innerStatementList:null));
                  }

                  retval.block = block;
                  System.out.println("what block" + block);
                

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_statement"

    public static class while_statement_return extends TreeRuleReturnScope {
        public Statement block;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1077:1: while_statement returns [Statement block] : ( inner_statement_list )? ;
    public final TreePHP.while_statement_return while_statement() throws RecognitionException {
        TreePHP.while_statement_return retval = new TreePHP.while_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.inner_statement_list_return inner_statement_list136 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1078:3: ( ( inner_statement_list )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1078:5: ( inner_statement_list )?
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1078:5: ( inner_statement_list )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==METHOD_DECL||LA49_0==STATEMENT||LA49_0==CLASS_T||LA49_0==INTERFACE_T||LA49_0==174) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1078:5: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_while_statement1616);
                    inner_statement_list136=inner_statement_list();

                    state._fsp--;

                    adaptor.addChild(root_0, inner_statement_list136.getTree());

                    }
                    break;

            }


                  int startIndex = -1;
                  int endIndex = -1;
                  Block block = new Block(startIndex, endIndex, new LinkedList());
                  if ((inner_statement_list136!=null?inner_statement_list136.innerStatementList:null) != null) {
                    block.getStatements().clear();
                    block.acceptStatements((inner_statement_list136!=null?inner_statement_list136.innerStatementList:null));
                  }
                  retval.block = block;
                

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_statement"

    public static class foreach_statement_return extends TreeRuleReturnScope {
        public Statement block;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "foreach_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1091:1: foreach_statement returns [Statement block] : ( inner_statement_list )? ;
    public final TreePHP.foreach_statement_return foreach_statement() throws RecognitionException {
        TreePHP.foreach_statement_return retval = new TreePHP.foreach_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.inner_statement_list_return inner_statement_list137 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1092:3: ( ( inner_statement_list )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1092:5: ( inner_statement_list )?
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1092:5: ( inner_statement_list )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==METHOD_DECL||LA50_0==STATEMENT||LA50_0==CLASS_T||LA50_0==INTERFACE_T||LA50_0==174) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1092:5: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_foreach_statement1641);
                    inner_statement_list137=inner_statement_list();

                    state._fsp--;

                    adaptor.addChild(root_0, inner_statement_list137.getTree());

                    }
                    break;

            }


                  int startIndex = -1;
                  int endIndex = -1;
                  Block block = new Block(startIndex, endIndex, new LinkedList());
                  if ((inner_statement_list137!=null?inner_statement_list137.innerStatementList:null) != null) {
                    block.getStatements().clear();
                    block.acceptStatements((inner_statement_list137!=null?inner_statement_list137.innerStatementList:null));
                  }
                  retval.block = block;
                

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "foreach_statement"

    public static class declare_statement_return extends TreeRuleReturnScope {
        public Statement block;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declare_statement"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1105:1: declare_statement returns [Statement block] : ^( BLOCK ( inner_statement_list )? ) ;
    public final TreePHP.declare_statement_return declare_statement() throws RecognitionException {
        TreePHP.declare_statement_return retval = new TreePHP.declare_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST BLOCK138=null;
        TreePHP.inner_statement_list_return inner_statement_list139 = null;


        SLAST BLOCK138_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1106:3: ( ^( BLOCK ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1106:5: ^( BLOCK ( inner_statement_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            BLOCK138=(SLAST)match(input,BLOCK,FOLLOW_BLOCK_in_declare_statement1668); 
            BLOCK138_tree = (SLAST)adaptor.dupNode(BLOCK138);

            root_1 = (SLAST)adaptor.becomeRoot(BLOCK138_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1106:13: ( inner_statement_list )?
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==METHOD_DECL||LA51_0==STATEMENT||LA51_0==CLASS_T||LA51_0==INTERFACE_T||LA51_0==174) ) {
                    alt51=1;
                }
                switch (alt51) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1106:13: inner_statement_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_inner_statement_list_in_declare_statement1670);
                        inner_statement_list139=inner_statement_list();

                        state._fsp--;

                        adaptor.addChild(root_1, inner_statement_list139.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                  int startIndex = -1;
                  int endIndex = -1;
                  Block block = new Block(startIndex, endIndex, new LinkedList());
                  if ((inner_statement_list139!=null?inner_statement_list139.innerStatementList:null) != null) {
            			  block.getStatements().clear();
            			  block.acceptStatements((inner_statement_list139!=null?inner_statement_list139.innerStatementList:null));
            			}
            			retval.block = block;
                

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declare_statement"

    protected static class parameter_list_scope {
        List paramList;
    }
    protected Stack parameter_list_stack = new Stack();

    public static class parameter_list_return extends TreeRuleReturnScope {
        public List parameterList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1119:1: parameter_list returns [List parameterList] : ( parameter )+ ;
    public final TreePHP.parameter_list_return parameter_list() throws RecognitionException {
        parameter_list_stack.push(new parameter_list_scope());
        TreePHP.parameter_list_return retval = new TreePHP.parameter_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.parameter_return parameter140 = null;




          ((parameter_list_scope)parameter_list_stack.peek()).paramList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1126:3: ( ( parameter )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1126:5: ( parameter )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1126:5: ( parameter )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==PARAMETER) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1126:5: parameter
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_parameter_in_parameter_list1706);
            	    parameter140=parameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, parameter140.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


                retval.parameterList = ((parameter_list_scope)parameter_list_stack.peek()).paramList;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            parameter_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "parameter_list"

    public static class parameter_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1132:1: parameter : ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) ;
    public final TreePHP.parameter_return parameter() throws RecognitionException {
        TreePHP.parameter_return retval = new TreePHP.parameter_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST PARAMETER141=null;
        SLAST TYPE142=null;
        SLAST CONST_T144=null;
        TreePHP.parameter_type_return parameter_type143 = null;

        TreePHP.pure_variable_return pure_variable145 = null;

        TreePHP.scalar_return scalar146 = null;


        SLAST PARAMETER141_tree=null;
        SLAST TYPE142_tree=null;
        SLAST CONST_T144_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1133:3: ( ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1133:5: ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            PARAMETER141=(SLAST)match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter1727); 
            PARAMETER141_tree = (SLAST)adaptor.dupNode(PARAMETER141);

            root_1 = (SLAST)adaptor.becomeRoot(PARAMETER141_tree, root_1);



            match(input, Token.DOWN, null); 
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1133:17: ( ^( TYPE parameter_type ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==TYPE) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1133:18: ^( TYPE parameter_type )
                    {
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    TYPE142=(SLAST)match(input,TYPE,FOLLOW_TYPE_in_parameter1731); 
                    TYPE142_tree = (SLAST)adaptor.dupNode(TYPE142);

                    root_2 = (SLAST)adaptor.becomeRoot(TYPE142_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_parameter_type_in_parameter1733);
                    parameter_type143=parameter_type();

                    state._fsp--;

                    adaptor.addChild(root_2, parameter_type143.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1133:43: ( CONST_T )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==CONST_T) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1133:43: CONST_T
                    {
                    _last = (SLAST)input.LT(1);
                    CONST_T144=(SLAST)match(input,CONST_T,FOLLOW_CONST_T_in_parameter1738); 
                    CONST_T144_tree = (SLAST)adaptor.dupNode(CONST_T144);

                    adaptor.addChild(root_1, CONST_T144_tree);


                    }
                    break;

            }

            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_pure_variable_in_parameter1741);
            pure_variable145=pure_variable();

            state._fsp--;

            adaptor.addChild(root_1, pure_variable145.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1133:66: ( scalar )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==SCALAR) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1133:66: scalar
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_parameter1743);
                    scalar146=scalar();

                    state._fsp--;

                    adaptor.addChild(root_1, scalar146.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                FormalParameter RESULT = null;
                TypeReference classType = (parameter_type143!=null?parameter_type143.type:null);
                System.out.println("type:" + classType);
                int varLeft = (pure_variable145!=null?((SLAST)pure_variable145.tree):null).startIndex;
                int varRight = (pure_variable145!=null?((SLAST)pure_variable145.tree):null).endIndex + 1;
                String varName = (pure_variable145!=null?pure_variable145.str:null);
                
                int startIndex = PARAMETER141.startIndex;
                int endIndex = PARAMETER141.endIndex + 1;
                if ((pure_variable145!=null?pure_variable145.isRef:null)) {
                  varLeft++;
                }
                VariableReference var = new VariableReference(varLeft, varRight, varName, PHPVariableKind.LOCAL);
                
                System.out.println("variable par:" + var);
                
                if ((scalar146!=null?scalar146.expr:null) == null) {
                  if ((pure_variable145!=null?pure_variable145.isRef:null)) {
                    ((parameter_list_scope)parameter_list_stack.peek()).paramList.add(new FormalParameterByReference(startIndex, endIndex, classType, var));
                  }
                  else {
                    ((parameter_list_scope)parameter_list_stack.peek()).paramList.add(new FormalParameter(startIndex, endIndex, classType, var));
                  }
                }
                else {
                  if ((pure_variable145!=null?pure_variable145.isRef:null)) {
                    ((parameter_list_scope)parameter_list_stack.peek()).paramList.add(new FormalParameterByReference(startIndex, endIndex, classType, var, (scalar146!=null?scalar146.expr:null)));
                  }
                  else {
                    ((parameter_list_scope)parameter_list_stack.peek()).paramList.add(new FormalParameter(startIndex, endIndex, classType, var, (scalar146!=null?scalar146.expr:null)));
                  }
                }
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class parameter_type_return extends TreeRuleReturnScope {
        public TypeReference type;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_type"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1170:1: parameter_type returns [TypeReference type] : ( fully_qualified_class_name | cast_option );
    public final TreePHP.parameter_type_return parameter_type() throws RecognitionException {
        TreePHP.parameter_type_return retval = new TreePHP.parameter_type_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name147 = null;

        TreePHP.cast_option_return cast_option148 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1171:3: ( fully_qualified_class_name | cast_option )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==IDENTIFIER||LA56_0==DOMAIN_T) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=UNSET_T && LA56_0<=CLONE_T)||(LA56_0>=181 && LA56_0<=189)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1171:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_parameter_type1768);
                    fully_qualified_class_name147=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_0, fully_qualified_class_name147.getTree());

                        retval.type = (fully_qualified_class_name147!=null?fully_qualified_class_name147.type:null);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1175:5: cast_option
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_cast_option_in_parameter_type1778);
                    cast_option148=cast_option();

                    state._fsp--;

                    adaptor.addChild(root_0, cast_option148.getTree());

                        int startIndex = ((CommonToken)(cast_option148!=null?((SLAST)cast_option148.tree):null).token).getStartIndex();
                        int endIndex = ((CommonToken)(cast_option148!=null?((SLAST)cast_option148.tree):null).token).getStopIndex() + 1;
                        retval.type = new TypeReference(startIndex, endIndex, (cast_option148!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(cast_option148.start),
                      input.getTreeAdaptor().getTokenStopIndex(cast_option148.start))):null));
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_type"

    public static class variable_modifiers_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_modifiers"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1183:1: variable_modifiers : ( 'var' | modifier );
    public final TreePHP.variable_modifiers_return variable_modifiers() throws RecognitionException {
        TreePHP.variable_modifiers_return retval = new TreePHP.variable_modifiers_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST string_literal149=null;
        TreePHP.modifier_return modifier150 = null;


        SLAST string_literal149_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1184:3: ( 'var' | modifier )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==177) ) {
                alt57=1;
            }
            else if ( (LA57_0==VAR_DECL||LA57_0==IDENTIFIER||LA57_0==REF_T||LA57_0==STATIC_T||LA57_0==EQUAL_T||(LA57_0>=175 && LA57_0<=176)||(LA57_0>=178 && LA57_0<=180)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1184:5: 'var'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal149=(SLAST)match(input,177,FOLLOW_177_in_variable_modifiers1796); 
                    string_literal149_tree = (SLAST)adaptor.dupNode(string_literal149);

                    adaptor.addChild(root_0, string_literal149_tree);


                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1185:5: modifier
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_modifier_in_variable_modifiers1802);
                    modifier150=modifier();

                    state._fsp--;

                    adaptor.addChild(root_0, modifier150.getTree());

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_modifiers"

    protected static class modifier_scope {
        ModifierDocPair m;
    }
    protected Stack modifier_stack = new Stack();

    public static class modifier_return extends TreeRuleReturnScope {
        public ModifierDocPair modifierVar;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1188:1: modifier returns [ModifierDocPair modifierVar] : ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )* ;
    public final TreePHP.modifier_return modifier() throws RecognitionException {
        modifier_stack.push(new modifier_scope());
        TreePHP.modifier_return retval = new TreePHP.modifier_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST string_literal151=null;
        SLAST string_literal152=null;
        SLAST string_literal153=null;
        SLAST string_literal154=null;
        SLAST string_literal155=null;
        SLAST string_literal156=null;

        SLAST string_literal151_tree=null;
        SLAST string_literal152_tree=null;
        SLAST string_literal153_tree=null;
        SLAST string_literal154_tree=null;
        SLAST string_literal155_tree=null;
        SLAST string_literal156_tree=null;


          ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccDefault, null);

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1195:3: ( ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1195:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )*
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1195:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )*
            loop58:
            do {
                int alt58=7;
                switch ( input.LA(1) ) {
                case 178:
                    {
                    alt58=1;
                    }
                    break;
                case 179:
                    {
                    alt58=2;
                    }
                    break;
                case 180:
                    {
                    alt58=3;
                    }
                    break;
                case STATIC_T:
                    {
                    alt58=4;
                    }
                    break;
                case 175:
                    {
                    alt58=5;
                    }
                    break;
                case 176:
                    {
                    alt58=6;
                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1195:6: 'public'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal151=(SLAST)match(input,178,FOLLOW_178_in_modifier1830); 
            	    string_literal151_tree = (SLAST)adaptor.dupNode(string_literal151);

            	    adaptor.addChild(root_0, string_literal151_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccPublic, null);

            	    }
            	    break;
            	case 2 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1196:5: 'protected'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal152=(SLAST)match(input,179,FOLLOW_179_in_modifier1838); 
            	    string_literal152_tree = (SLAST)adaptor.dupNode(string_literal152);

            	    adaptor.addChild(root_0, string_literal152_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccProtected, null);

            	    }
            	    break;
            	case 3 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1197:5: 'private'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal153=(SLAST)match(input,180,FOLLOW_180_in_modifier1846); 
            	    string_literal153_tree = (SLAST)adaptor.dupNode(string_literal153);

            	    adaptor.addChild(root_0, string_literal153_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccPrivate, null);

            	    }
            	    break;
            	case 4 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1198:5: 'static'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal154=(SLAST)match(input,STATIC_T,FOLLOW_STATIC_T_in_modifier1854); 
            	    string_literal154_tree = (SLAST)adaptor.dupNode(string_literal154);

            	    adaptor.addChild(root_0, string_literal154_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccStatic, null);

            	    }
            	    break;
            	case 5 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1199:5: 'abstract'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal155=(SLAST)match(input,175,FOLLOW_175_in_modifier1863); 
            	    string_literal155_tree = (SLAST)adaptor.dupNode(string_literal155);

            	    adaptor.addChild(root_0, string_literal155_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccAbstract, null);

            	    }
            	    break;
            	case 6 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1200:5: 'final'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal156=(SLAST)match(input,176,FOLLOW_176_in_modifier1872); 
            	    string_literal156_tree = (SLAST)adaptor.dupNode(string_literal156);

            	    adaptor.addChild(root_0, string_literal156_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccFinal, null);

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


                retval.modifierVar = ((modifier_scope)modifier_stack.peek()).m;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            modifier_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class directive_return extends TreeRuleReturnScope {
        public Object astNode;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "directive"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1207:1: directive returns [Object astNode] : ^( EQUAL_T IDENTIFIER expression ) ;
    public final TreePHP.directive_return directive() throws RecognitionException {
        TreePHP.directive_return retval = new TreePHP.directive_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST EQUAL_T157=null;
        SLAST IDENTIFIER158=null;
        TreePHP.expression_return expression159 = null;


        SLAST EQUAL_T157_tree=null;
        SLAST IDENTIFIER158_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1208:3: ( ^( EQUAL_T IDENTIFIER expression ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1208:5: ^( EQUAL_T IDENTIFIER expression )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            EQUAL_T157=(SLAST)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_directive1904); 
            EQUAL_T157_tree = (SLAST)adaptor.dupNode(EQUAL_T157);

            root_1 = (SLAST)adaptor.becomeRoot(EQUAL_T157_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            IDENTIFIER158=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_directive1906); 
            IDENTIFIER158_tree = (SLAST)adaptor.dupNode(IDENTIFIER158);

            adaptor.addChild(root_1, IDENTIFIER158_tree);

            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_expression_in_directive1908);
            expression159=expression();

            state._fsp--;

            adaptor.addChild(root_1, expression159.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                if (inClassStatementList) {
            	    int constNameleft = ((CommonToken)IDENTIFIER158.token).getStartIndex();
            	    int constNameright = ((CommonToken)IDENTIFIER158.token).getStopIndex() + 1;
            	    String constName = (IDENTIFIER158!=null?IDENTIFIER158.getText():null);
            	    int exprLeft = ((CommonToken)((expression159!=null?((SLAST)expression159.tree):null).token)).getStartIndex();
            	    int exprRight = ((CommonToken)((expression159!=null?((SLAST)expression159.tree):null).token)).getStopIndex() + 1;
            	    Expression expr = (expression159!=null?expression159.expr:null);
            	    
            	    ConstantReference constId = new ConstantReference(constNameleft, constNameright, constName);
            	    Object obj = new ASTNode[]{constId, expr};
            	    ((class_statement_scope)class_statement_stack.peek()).constList.add(obj);
            	  }
            	  else {
                  ((topStatement_scope)topStatement_stack.peek()).declareKey.add((IDENTIFIER158!=null?IDENTIFIER158.getText():null));
                  ((topStatement_scope)topStatement_stack.peek()).declareValue.add((expression159!=null?expression159.expr:null));
                }
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "directive"

    protected static class expr_list_scope {
        List list;
    }
    protected Stack expr_list_stack = new Stack();

    public static class expr_list_return extends TreeRuleReturnScope {
        public List exprList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1229:1: expr_list returns [List exprList] : ( expression )+ ;
    public final TreePHP.expr_list_return expr_list() throws RecognitionException {
        expr_list_stack.push(new expr_list_scope());
        TreePHP.expr_list_return retval = new TreePHP.expr_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.expression_return expression160 = null;




          ((expr_list_scope)expr_list_stack.peek()).list = new LinkedList();
          inExprList = true;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1240:2: ( ( expression )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1240:4: ( expression )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1240:4: ( expression )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==VAR_DECL||LA59_0==CALL||LA59_0==EXPR||(LA59_0>=SCALAR && LA59_0<=UNARY_EXPR)||LA59_0==REF_T||LA59_0==EQUAL_T||(LA59_0>=OR_T && LA59_0<=CLONE_T)||(LA59_0>=INSTANCEOF_T && LA59_0<=PRINT_T)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1240:4: expression
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_expr_list1945);
            	    expression160=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression160.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);


              retval.exprList = ((expr_list_scope)expr_list_stack.peek()).list;
             

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);


              inExprList = false;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            expr_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "expr_list"

    public static class expression_return extends TreeRuleReturnScope {
        public Expression expr;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1246:1: expression returns [Expression expr] : ( ^( EXPR etop= expression ) | ^( OR_T e1= expression e2= expression ) | ^( XOR_T e1= expression e2= expression ) | ^( AND_T e1= expression e2= expression ) | ^( EQUAL_T e1= expression e2= expression ) | ^( PLUS_EQ e1= expression e2= expression ) | ^( MINUS_EQ e1= expression e2= expression ) | ^( MUL_EQ e1= expression e2= expression ) | ^( DIV_EQ e1= expression e2= expression ) | ^( DOT_EQ e1= expression e2= expression ) | ^( PERCENT_EQ e1= expression e2= expression ) | ^( BIT_AND_EQ e1= expression e2= expression ) | ^( BIT_OR_EQ e1= expression e2= expression ) | ^( POWER_EQ e1= expression e2= expression ) | ^( LMOVE_EQ e1= expression e2= expression ) | ^( RMOVE_EQ e1= expression e2= expression ) | ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) ) | ^( LOGICAL_OR_T e1= expression e2= expression ) | ^( LOGICAL_AND_T e1= expression e2= expression ) | ^( BIT_OR_T e1= expression e2= expression ) | ^( POWER_T e1= expression e2= expression ) | ^( REF_T e1= expression e2= expression ) | ^( UNARY_EXPR unary_symbol_list e= expression ) | ^( DOT_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( LT_T e1= expression e2= expression ) | ^( MT_T e1= expression e2= expression ) | ^( LE_T e1= expression e2= expression ) | ^( ME_T e1= expression e2= expression ) | ^( LSHIFT_T e1= expression e2= expression ) | ^( RSHIFT_T e1= expression e2= expression ) | ^( PLUS_T e1= expression e2= expression ) | ^( MINUS_T e1= expression e2= expression ) | ^( MUL_T e1= expression e2= expression ) | ^( DIV_T e1= expression e2= expression ) | ^( PERCENT_T e1= expression e2= expression ) | ^( CAST_EXPR cast_option e= expression ) | ^( POSTFIX_EXPR e= expression plus_minus ) | ^( PREFIX_EXPR ( plus_minus )+ e= expression ) | ^( INSTANCEOF_T e= expression class_name_reference ) | ( AT_T )? variable | ( AT_T )? scalar | list_decl | ^( ARRAY_DECL ( array_pair_list )? ) | ^( NEW_T class_name_reference ) | ^( CLONE_T variable ) | ^( UNSET_T variable_list ) | BACKTRICKLITERAL | ^( PRINT_T e= expression ) );
    public final TreePHP.expression_return expression() throws RecognitionException {
        TreePHP.expression_return retval = new TreePHP.expression_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST EXPR161=null;
        SLAST OR_T162=null;
        SLAST XOR_T163=null;
        SLAST AND_T164=null;
        SLAST EQUAL_T165=null;
        SLAST PLUS_EQ166=null;
        SLAST MINUS_EQ167=null;
        SLAST MUL_EQ168=null;
        SLAST DIV_EQ169=null;
        SLAST DOT_EQ170=null;
        SLAST PERCENT_EQ171=null;
        SLAST BIT_AND_EQ172=null;
        SLAST BIT_OR_EQ173=null;
        SLAST POWER_EQ174=null;
        SLAST LMOVE_EQ175=null;
        SLAST RMOVE_EQ176=null;
        SLAST QUESTION_T177=null;
        SLAST COLON_T178=null;
        SLAST LOGICAL_OR_T179=null;
        SLAST LOGICAL_AND_T180=null;
        SLAST BIT_OR_T181=null;
        SLAST POWER_T182=null;
        SLAST REF_T183=null;
        SLAST UNARY_EXPR184=null;
        SLAST DOT_T186=null;
        SLAST EQUAL_EQUAL_T187=null;
        SLAST NOT_EQUAL_T188=null;
        SLAST EQUAL_EQUAL_EQUAL_T189=null;
        SLAST NOT_EQUAL_EQUAL_T190=null;
        SLAST LT_T191=null;
        SLAST MT_T192=null;
        SLAST LE_T193=null;
        SLAST ME_T194=null;
        SLAST LSHIFT_T195=null;
        SLAST RSHIFT_T196=null;
        SLAST PLUS_T197=null;
        SLAST MINUS_T198=null;
        SLAST MUL_T199=null;
        SLAST DIV_T200=null;
        SLAST PERCENT_T201=null;
        SLAST CAST_EXPR202=null;
        SLAST POSTFIX_EXPR204=null;
        SLAST PREFIX_EXPR206=null;
        SLAST INSTANCEOF_T208=null;
        SLAST AT_T210=null;
        SLAST AT_T212=null;
        SLAST ARRAY_DECL215=null;
        SLAST NEW_T217=null;
        SLAST CLONE_T219=null;
        SLAST UNSET_T221=null;
        SLAST BACKTRICKLITERAL223=null;
        SLAST PRINT_T224=null;
        TreePHP.expression_return etop = null;

        TreePHP.expression_return e1 = null;

        TreePHP.expression_return e2 = null;

        TreePHP.expression_return e3 = null;

        TreePHP.expression_return e = null;

        TreePHP.unary_symbol_list_return unary_symbol_list185 = null;

        TreePHP.cast_option_return cast_option203 = null;

        TreePHP.plus_minus_return plus_minus205 = null;

        TreePHP.plus_minus_return plus_minus207 = null;

        TreePHP.class_name_reference_return class_name_reference209 = null;

        TreePHP.variable_return variable211 = null;

        TreePHP.scalar_return scalar213 = null;

        TreePHP.list_decl_return list_decl214 = null;

        TreePHP.array_pair_list_return array_pair_list216 = null;

        TreePHP.class_name_reference_return class_name_reference218 = null;

        TreePHP.variable_return variable220 = null;

        TreePHP.variable_list_return variable_list222 = null;


        SLAST EXPR161_tree=null;
        SLAST OR_T162_tree=null;
        SLAST XOR_T163_tree=null;
        SLAST AND_T164_tree=null;
        SLAST EQUAL_T165_tree=null;
        SLAST PLUS_EQ166_tree=null;
        SLAST MINUS_EQ167_tree=null;
        SLAST MUL_EQ168_tree=null;
        SLAST DIV_EQ169_tree=null;
        SLAST DOT_EQ170_tree=null;
        SLAST PERCENT_EQ171_tree=null;
        SLAST BIT_AND_EQ172_tree=null;
        SLAST BIT_OR_EQ173_tree=null;
        SLAST POWER_EQ174_tree=null;
        SLAST LMOVE_EQ175_tree=null;
        SLAST RMOVE_EQ176_tree=null;
        SLAST QUESTION_T177_tree=null;
        SLAST COLON_T178_tree=null;
        SLAST LOGICAL_OR_T179_tree=null;
        SLAST LOGICAL_AND_T180_tree=null;
        SLAST BIT_OR_T181_tree=null;
        SLAST POWER_T182_tree=null;
        SLAST REF_T183_tree=null;
        SLAST UNARY_EXPR184_tree=null;
        SLAST DOT_T186_tree=null;
        SLAST EQUAL_EQUAL_T187_tree=null;
        SLAST NOT_EQUAL_T188_tree=null;
        SLAST EQUAL_EQUAL_EQUAL_T189_tree=null;
        SLAST NOT_EQUAL_EQUAL_T190_tree=null;
        SLAST LT_T191_tree=null;
        SLAST MT_T192_tree=null;
        SLAST LE_T193_tree=null;
        SLAST ME_T194_tree=null;
        SLAST LSHIFT_T195_tree=null;
        SLAST RSHIFT_T196_tree=null;
        SLAST PLUS_T197_tree=null;
        SLAST MINUS_T198_tree=null;
        SLAST MUL_T199_tree=null;
        SLAST DIV_T200_tree=null;
        SLAST PERCENT_T201_tree=null;
        SLAST CAST_EXPR202_tree=null;
        SLAST POSTFIX_EXPR204_tree=null;
        SLAST PREFIX_EXPR206_tree=null;
        SLAST INSTANCEOF_T208_tree=null;
        SLAST AT_T210_tree=null;
        SLAST AT_T212_tree=null;
        SLAST ARRAY_DECL215_tree=null;
        SLAST NEW_T217_tree=null;
        SLAST CLONE_T219_tree=null;
        SLAST UNSET_T221_tree=null;
        SLAST BACKTRICKLITERAL223_tree=null;
        SLAST PRINT_T224_tree=null;


          SLAST ast = null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1255:3: ( ^( EXPR etop= expression ) | ^( OR_T e1= expression e2= expression ) | ^( XOR_T e1= expression e2= expression ) | ^( AND_T e1= expression e2= expression ) | ^( EQUAL_T e1= expression e2= expression ) | ^( PLUS_EQ e1= expression e2= expression ) | ^( MINUS_EQ e1= expression e2= expression ) | ^( MUL_EQ e1= expression e2= expression ) | ^( DIV_EQ e1= expression e2= expression ) | ^( DOT_EQ e1= expression e2= expression ) | ^( PERCENT_EQ e1= expression e2= expression ) | ^( BIT_AND_EQ e1= expression e2= expression ) | ^( BIT_OR_EQ e1= expression e2= expression ) | ^( POWER_EQ e1= expression e2= expression ) | ^( LMOVE_EQ e1= expression e2= expression ) | ^( RMOVE_EQ e1= expression e2= expression ) | ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) ) | ^( LOGICAL_OR_T e1= expression e2= expression ) | ^( LOGICAL_AND_T e1= expression e2= expression ) | ^( BIT_OR_T e1= expression e2= expression ) | ^( POWER_T e1= expression e2= expression ) | ^( REF_T e1= expression e2= expression ) | ^( UNARY_EXPR unary_symbol_list e= expression ) | ^( DOT_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( LT_T e1= expression e2= expression ) | ^( MT_T e1= expression e2= expression ) | ^( LE_T e1= expression e2= expression ) | ^( ME_T e1= expression e2= expression ) | ^( LSHIFT_T e1= expression e2= expression ) | ^( RSHIFT_T e1= expression e2= expression ) | ^( PLUS_T e1= expression e2= expression ) | ^( MINUS_T e1= expression e2= expression ) | ^( MUL_T e1= expression e2= expression ) | ^( DIV_T e1= expression e2= expression ) | ^( PERCENT_T e1= expression e2= expression ) | ^( CAST_EXPR cast_option e= expression ) | ^( POSTFIX_EXPR e= expression plus_minus ) | ^( PREFIX_EXPR ( plus_minus )+ e= expression ) | ^( INSTANCEOF_T e= expression class_name_reference ) | ( AT_T )? variable | ( AT_T )? scalar | list_decl | ^( ARRAY_DECL ( array_pair_list )? ) | ^( NEW_T class_name_reference ) | ^( CLONE_T variable ) | ^( UNSET_T variable_list ) | BACKTRICKLITERAL | ^( PRINT_T e= expression ) )
            int alt64=52;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1255:5: ^( EXPR etop= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EXPR161=(SLAST)match(input,EXPR,FOLLOW_EXPR_in_expression1979); 
                    EXPR161_tree = (SLAST)adaptor.dupNode(EXPR161);

                    root_1 = (SLAST)adaptor.becomeRoot(EXPR161_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1983);
                    etop=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, etop.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        retval.expr = (etop!=null?etop.expr:null);
                        ast = (etop!=null?((SLAST)etop.tree):null);
                        if (inExprList) {
                          ((expr_list_scope)expr_list_stack.peek()).list.add(retval.expr);
                        }
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1263:5: ^( OR_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    OR_T162=(SLAST)match(input,OR_T,FOLLOW_OR_T_in_expression1995); 
                    OR_T162_tree = (SLAST)adaptor.dupNode(OR_T162);

                    root_1 = (SLAST)adaptor.becomeRoot(OR_T162_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1999);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2003);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = OR_T162.startIndex;
                        int endIndex = OR_T162.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_STRING_OR, expr2); 
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1271:5: ^( XOR_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    XOR_T163=(SLAST)match(input,XOR_T,FOLLOW_XOR_T_in_expression2015); 
                    XOR_T163_tree = (SLAST)adaptor.dupNode(XOR_T163);

                    root_1 = (SLAST)adaptor.becomeRoot(XOR_T163_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2019);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2023);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = XOR_T163.startIndex;
                        int endIndex = XOR_T163.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_STRING_XOR, expr2);
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1279:5: ^( AND_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    AND_T164=(SLAST)match(input,AND_T,FOLLOW_AND_T_in_expression2035); 
                    AND_T164_tree = (SLAST)adaptor.dupNode(AND_T164);

                    root_1 = (SLAST)adaptor.becomeRoot(AND_T164_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2039);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2043);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = AND_T164.startIndex;
                        int endIndex = AND_T164.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_STRING_AND, expr2);
                      

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1287:5: ^( EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EQUAL_T165=(SLAST)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_expression2055); 
                    EQUAL_T165_tree = (SLAST)adaptor.dupNode(EQUAL_T165);

                    root_1 = (SLAST)adaptor.becomeRoot(EQUAL_T165_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2059);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2063);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EQUAL_T165.startIndex;
                        int endIndex = EQUAL_T165.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        if ((e2!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(e2.start),
                      input.getTreeAdaptor().getTokenStopIndex(e2.start))):null).startsWith("&")) {
                          retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_REF_EQUAL, expr);
                        }
                        else {
                          retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_EQUAL, expr);
                        }
                      

                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1300:5: ^( PLUS_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PLUS_EQ166=(SLAST)match(input,PLUS_EQ,FOLLOW_PLUS_EQ_in_expression2076); 
                    PLUS_EQ166_tree = (SLAST)adaptor.dupNode(PLUS_EQ166);

                    root_1 = (SLAST)adaptor.becomeRoot(PLUS_EQ166_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2080);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2084);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PLUS_EQ166.startIndex;
                        int endIndex = PLUS_EQ166.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_PLUS_EQUAL, expr);
                      

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1308:5: ^( MINUS_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MINUS_EQ167=(SLAST)match(input,MINUS_EQ,FOLLOW_MINUS_EQ_in_expression2096); 
                    MINUS_EQ167_tree = (SLAST)adaptor.dupNode(MINUS_EQ167);

                    root_1 = (SLAST)adaptor.becomeRoot(MINUS_EQ167_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2100);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2104);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MINUS_EQ167.startIndex;
                        int endIndex = MINUS_EQ167.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_MINUS_EQUAL, expr);
                      

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1316:5: ^( MUL_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MUL_EQ168=(SLAST)match(input,MUL_EQ,FOLLOW_MUL_EQ_in_expression2116); 
                    MUL_EQ168_tree = (SLAST)adaptor.dupNode(MUL_EQ168);

                    root_1 = (SLAST)adaptor.becomeRoot(MUL_EQ168_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2120);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2124);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MUL_EQ168.startIndex;
                        int endIndex = MUL_EQ168.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_MUL_EQUAL, expr);
                      

                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1324:5: ^( DIV_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DIV_EQ169=(SLAST)match(input,DIV_EQ,FOLLOW_DIV_EQ_in_expression2136); 
                    DIV_EQ169_tree = (SLAST)adaptor.dupNode(DIV_EQ169);

                    root_1 = (SLAST)adaptor.becomeRoot(DIV_EQ169_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2140);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2144);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DIV_EQ169.startIndex;
                        int endIndex = DIV_EQ169.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_DIV_EQUAL, expr);
                      

                    }
                    break;
                case 10 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1332:5: ^( DOT_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DOT_EQ170=(SLAST)match(input,DOT_EQ,FOLLOW_DOT_EQ_in_expression2156); 
                    DOT_EQ170_tree = (SLAST)adaptor.dupNode(DOT_EQ170);

                    root_1 = (SLAST)adaptor.becomeRoot(DOT_EQ170_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2160);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2164);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DOT_EQ170.startIndex;
                        int endIndex = DOT_EQ170.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_CONCAT_EQUAL, expr);
                      

                    }
                    break;
                case 11 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1340:5: ^( PERCENT_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PERCENT_EQ171=(SLAST)match(input,PERCENT_EQ,FOLLOW_PERCENT_EQ_in_expression2176); 
                    PERCENT_EQ171_tree = (SLAST)adaptor.dupNode(PERCENT_EQ171);

                    root_1 = (SLAST)adaptor.becomeRoot(PERCENT_EQ171_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2180);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2184);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PERCENT_EQ171.startIndex;
                        int endIndex = PERCENT_EQ171.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_MOD_EQUAL, expr);
                      

                    }
                    break;
                case 12 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1348:5: ^( BIT_AND_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    BIT_AND_EQ172=(SLAST)match(input,BIT_AND_EQ,FOLLOW_BIT_AND_EQ_in_expression2196); 
                    BIT_AND_EQ172_tree = (SLAST)adaptor.dupNode(BIT_AND_EQ172);

                    root_1 = (SLAST)adaptor.becomeRoot(BIT_AND_EQ172_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2200);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2204);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = BIT_AND_EQ172.startIndex;
                        int endIndex = BIT_AND_EQ172.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_AND_EQUAL, expr);
                      

                    }
                    break;
                case 13 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1356:5: ^( BIT_OR_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    BIT_OR_EQ173=(SLAST)match(input,BIT_OR_EQ,FOLLOW_BIT_OR_EQ_in_expression2216); 
                    BIT_OR_EQ173_tree = (SLAST)adaptor.dupNode(BIT_OR_EQ173);

                    root_1 = (SLAST)adaptor.becomeRoot(BIT_OR_EQ173_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2220);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2224);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = BIT_OR_EQ173.startIndex;
                        int endIndex = BIT_OR_EQ173.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_OR_EQUAL, expr);
                      

                    }
                    break;
                case 14 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1364:5: ^( POWER_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    POWER_EQ174=(SLAST)match(input,POWER_EQ,FOLLOW_POWER_EQ_in_expression2236); 
                    POWER_EQ174_tree = (SLAST)adaptor.dupNode(POWER_EQ174);

                    root_1 = (SLAST)adaptor.becomeRoot(POWER_EQ174_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2240);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2244);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = POWER_EQ174.startIndex;
                        int endIndex = POWER_EQ174.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_XOR_EQUAL, expr);
                      

                    }
                    break;
                case 15 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1372:5: ^( LMOVE_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LMOVE_EQ175=(SLAST)match(input,LMOVE_EQ,FOLLOW_LMOVE_EQ_in_expression2256); 
                    LMOVE_EQ175_tree = (SLAST)adaptor.dupNode(LMOVE_EQ175);

                    root_1 = (SLAST)adaptor.becomeRoot(LMOVE_EQ175_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2260);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2264);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LMOVE_EQ175.startIndex;
                        int endIndex = LMOVE_EQ175.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_SL_EQUAL, expr);
                      

                    }
                    break;
                case 16 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1380:5: ^( RMOVE_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    RMOVE_EQ176=(SLAST)match(input,RMOVE_EQ,FOLLOW_RMOVE_EQ_in_expression2276); 
                    RMOVE_EQ176_tree = (SLAST)adaptor.dupNode(RMOVE_EQ176);

                    root_1 = (SLAST)adaptor.becomeRoot(RMOVE_EQ176_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2280);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2284);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = RMOVE_EQ176.startIndex;
                        int endIndex = RMOVE_EQ176.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_SR_EQUAL, expr);
                      

                    }
                    break;
                case 17 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1388:5: ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    QUESTION_T177=(SLAST)match(input,QUESTION_T,FOLLOW_QUESTION_T_in_expression2296); 
                    QUESTION_T177_tree = (SLAST)adaptor.dupNode(QUESTION_T177);

                    root_1 = (SLAST)adaptor.becomeRoot(QUESTION_T177_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2300);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    COLON_T178=(SLAST)match(input,COLON_T,FOLLOW_COLON_T_in_expression2303); 
                    COLON_T178_tree = (SLAST)adaptor.dupNode(COLON_T178);

                    root_2 = (SLAST)adaptor.becomeRoot(COLON_T178_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2307);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e2.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2311);
                    e3=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e3.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = QUESTION_T177.startIndex;
                        int endIndex = QUESTION_T177.endIndex + 1;
                        retval.expr = new ConditionalExpression(startIndex, endIndex, (e1!=null?e1.expr:null), (e2!=null?e2.expr:null), (e3!=null?e3.expr:null)); 
                      

                    }
                    break;
                case 18 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1394:5: ^( LOGICAL_OR_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LOGICAL_OR_T179=(SLAST)match(input,LOGICAL_OR_T,FOLLOW_LOGICAL_OR_T_in_expression2326); 
                    LOGICAL_OR_T179_tree = (SLAST)adaptor.dupNode(LOGICAL_OR_T179);

                    root_1 = (SLAST)adaptor.becomeRoot(LOGICAL_OR_T179_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2330);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2334);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LOGICAL_OR_T179.startIndex;
                        int endIndex = LOGICAL_OR_T179.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_BOOL_OR, expr2); 
                      

                    }
                    break;
                case 19 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1402:5: ^( LOGICAL_AND_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LOGICAL_AND_T180=(SLAST)match(input,LOGICAL_AND_T,FOLLOW_LOGICAL_AND_T_in_expression2346); 
                    LOGICAL_AND_T180_tree = (SLAST)adaptor.dupNode(LOGICAL_AND_T180);

                    root_1 = (SLAST)adaptor.becomeRoot(LOGICAL_AND_T180_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2350);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2354);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LOGICAL_AND_T180.startIndex;
                        int endIndex = LOGICAL_AND_T180.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_BOOL_AND, expr2);
                      

                    }
                    break;
                case 20 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1410:5: ^( BIT_OR_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    BIT_OR_T181=(SLAST)match(input,BIT_OR_T,FOLLOW_BIT_OR_T_in_expression2366); 
                    BIT_OR_T181_tree = (SLAST)adaptor.dupNode(BIT_OR_T181);

                    root_1 = (SLAST)adaptor.becomeRoot(BIT_OR_T181_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2370);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2374);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = BIT_OR_T181.startIndex;
                        int endIndex = BIT_OR_T181.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_OR, expr2); 
                      

                    }
                    break;
                case 21 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1418:5: ^( POWER_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    POWER_T182=(SLAST)match(input,POWER_T,FOLLOW_POWER_T_in_expression2386); 
                    POWER_T182_tree = (SLAST)adaptor.dupNode(POWER_T182);

                    root_1 = (SLAST)adaptor.becomeRoot(POWER_T182_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2390);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2394);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = POWER_T182.startIndex;
                        int endIndex = POWER_T182.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_XOR, expr2); 
                      

                    }
                    break;
                case 22 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1426:5: ^( REF_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    REF_T183=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_expression2406); 
                    REF_T183_tree = (SLAST)adaptor.dupNode(REF_T183);

                    root_1 = (SLAST)adaptor.becomeRoot(REF_T183_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2410);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2414);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = REF_T183.startIndex;
                        int endIndex = REF_T183.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                    //    if (expr2 != null) {
                          retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_AND, expr2);
                    //    }
                    //    else {
                    //      retval.expr = new ReferenceExpression(startIndex, endIndex, expr1);
                    //    }
                      

                    }
                    break;
                case 23 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1439:5: ^( UNARY_EXPR unary_symbol_list e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    UNARY_EXPR184=(SLAST)match(input,UNARY_EXPR,FOLLOW_UNARY_EXPR_in_expression2426); 
                    UNARY_EXPR184_tree = (SLAST)adaptor.dupNode(UNARY_EXPR184);

                    root_1 = (SLAST)adaptor.becomeRoot(UNARY_EXPR184_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_unary_symbol_list_in_expression2428);
                    unary_symbol_list185=unary_symbol_list();

                    state._fsp--;

                    adaptor.addChild(root_1, unary_symbol_list185.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2432);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        Iterator iter = (unary_symbol_list185!=null?unary_symbol_list185.symbolList:null).iterator();
                        int symbolIndex;
                        int startIndex = UNARY_EXPR184.startIndex + (unary_symbol_list185!=null?unary_symbol_list185.symbolList:null).size() - 1;
                        int endIndex = UNARY_EXPR184.endIndex + 1;
                        retval.expr = (e!=null?e.expr:null);
                        while (iter.hasNext()) {
                          symbolIndex = (Integer)iter.next();
                          System.out.println("symbolIndex: " + symbolIndex);
                          switch(symbolIndex) {
                            case 1:
                              retval.expr = new UnaryOperation(startIndex--, endIndex, retval.expr, UnaryOperation.OP_PLUS);
                              break;
                            case 2:
                              retval.expr = new UnaryOperation(startIndex--, endIndex, retval.expr, UnaryOperation.OP_MINUS);
                              break;
                            case 3:
                              if (retval.expr instanceof VariableReference) {
                                retval.expr = new ReferenceExpression(startIndex--, endIndex, retval.expr);
                              }
                              break;
                            case 4:
                              retval.expr = new UnaryOperation(startIndex--, endIndex, retval.expr, UnaryOperation.OP_TILDA);
                              break;
                            case 5:
                              retval.expr = new UnaryOperation(startIndex--, endIndex, retval.expr, UnaryOperation.OP_NOT);
                              break;
                            default:
                              break;
                          }
                        }
                      

                    }
                    break;
                case 24 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1472:5: ^( DOT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DOT_T186=(SLAST)match(input,DOT_T,FOLLOW_DOT_T_in_expression2444); 
                    DOT_T186_tree = (SLAST)adaptor.dupNode(DOT_T186);

                    root_1 = (SLAST)adaptor.becomeRoot(DOT_T186_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2448);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2452);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DOT_T186.startIndex;
                        int endIndex = DOT_T186.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_CONCAT, expr2); 
                      

                    }
                    break;
                case 25 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1480:5: ^( EQUAL_EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EQUAL_EQUAL_T187=(SLAST)match(input,EQUAL_EQUAL_T,FOLLOW_EQUAL_EQUAL_T_in_expression2464); 
                    EQUAL_EQUAL_T187_tree = (SLAST)adaptor.dupNode(EQUAL_EQUAL_T187);

                    root_1 = (SLAST)adaptor.becomeRoot(EQUAL_EQUAL_T187_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2468);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2472);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EQUAL_EQUAL_T187.startIndex;
                        int endIndex = EQUAL_EQUAL_T187.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_EQUAL, expr2);
                      

                    }
                    break;
                case 26 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1488:5: ^( NOT_EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    NOT_EQUAL_T188=(SLAST)match(input,NOT_EQUAL_T,FOLLOW_NOT_EQUAL_T_in_expression2484); 
                    NOT_EQUAL_T188_tree = (SLAST)adaptor.dupNode(NOT_EQUAL_T188);

                    root_1 = (SLAST)adaptor.becomeRoot(NOT_EQUAL_T188_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2488);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2492);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = NOT_EQUAL_T188.startIndex;
                        int endIndex = NOT_EQUAL_T188.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_NOT_EQUAL, expr2);
                      

                    }
                    break;
                case 27 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1496:5: ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EQUAL_EQUAL_EQUAL_T189=(SLAST)match(input,EQUAL_EQUAL_EQUAL_T,FOLLOW_EQUAL_EQUAL_EQUAL_T_in_expression2504); 
                    EQUAL_EQUAL_EQUAL_T189_tree = (SLAST)adaptor.dupNode(EQUAL_EQUAL_EQUAL_T189);

                    root_1 = (SLAST)adaptor.becomeRoot(EQUAL_EQUAL_EQUAL_T189_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2508);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2512);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EQUAL_EQUAL_EQUAL_T189.startIndex;
                        int endIndex = EQUAL_EQUAL_EQUAL_T189.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_IDENTICAL, expr2);
                      

                    }
                    break;
                case 28 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1504:5: ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    NOT_EQUAL_EQUAL_T190=(SLAST)match(input,NOT_EQUAL_EQUAL_T,FOLLOW_NOT_EQUAL_EQUAL_T_in_expression2524); 
                    NOT_EQUAL_EQUAL_T190_tree = (SLAST)adaptor.dupNode(NOT_EQUAL_EQUAL_T190);

                    root_1 = (SLAST)adaptor.becomeRoot(NOT_EQUAL_EQUAL_T190_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2528);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2532);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = NOT_EQUAL_EQUAL_T190.startIndex;
                        int endIndex = NOT_EQUAL_EQUAL_T190.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_NOT_IDENTICAL, expr2);
                      

                    }
                    break;
                case 29 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1512:5: ^( LT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LT_T191=(SLAST)match(input,LT_T,FOLLOW_LT_T_in_expression2544); 
                    LT_T191_tree = (SLAST)adaptor.dupNode(LT_T191);

                    root_1 = (SLAST)adaptor.becomeRoot(LT_T191_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2548);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2552);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LT_T191.startIndex;
                        int endIndex = LT_T191.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_RGREATER, expr2); 
                      

                    }
                    break;
                case 30 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1520:5: ^( MT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MT_T192=(SLAST)match(input,MT_T,FOLLOW_MT_T_in_expression2564); 
                    MT_T192_tree = (SLAST)adaptor.dupNode(MT_T192);

                    root_1 = (SLAST)adaptor.becomeRoot(MT_T192_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2568);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2572);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MT_T192.startIndex;
                        int endIndex = MT_T192.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_LGREATER, expr2); 
                      

                    }
                    break;
                case 31 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1528:5: ^( LE_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LE_T193=(SLAST)match(input,LE_T,FOLLOW_LE_T_in_expression2584); 
                    LE_T193_tree = (SLAST)adaptor.dupNode(LE_T193);

                    root_1 = (SLAST)adaptor.becomeRoot(LE_T193_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2588);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2592);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LE_T193.startIndex;
                        int endIndex = LE_T193.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_SMALLER_OR_EQUAL, expr2); 
                      

                    }
                    break;
                case 32 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1536:5: ^( ME_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ME_T194=(SLAST)match(input,ME_T,FOLLOW_ME_T_in_expression2604); 
                    ME_T194_tree = (SLAST)adaptor.dupNode(ME_T194);

                    root_1 = (SLAST)adaptor.becomeRoot(ME_T194_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2608);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2612);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = ME_T194.startIndex;
                        int endIndex = ME_T194.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_GREATER_OR_EQUAL, expr2); 
                      

                    }
                    break;
                case 33 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1544:5: ^( LSHIFT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LSHIFT_T195=(SLAST)match(input,LSHIFT_T,FOLLOW_LSHIFT_T_in_expression2624); 
                    LSHIFT_T195_tree = (SLAST)adaptor.dupNode(LSHIFT_T195);

                    root_1 = (SLAST)adaptor.becomeRoot(LSHIFT_T195_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2628);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2632);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LSHIFT_T195.startIndex;
                        int endIndex = LSHIFT_T195.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_SL, expr2); 
                      

                    }
                    break;
                case 34 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1552:5: ^( RSHIFT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    RSHIFT_T196=(SLAST)match(input,RSHIFT_T,FOLLOW_RSHIFT_T_in_expression2644); 
                    RSHIFT_T196_tree = (SLAST)adaptor.dupNode(RSHIFT_T196);

                    root_1 = (SLAST)adaptor.becomeRoot(RSHIFT_T196_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2648);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2652);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = RSHIFT_T196.startIndex;
                        int endIndex = RSHIFT_T196.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_SR, expr2); 
                      

                    }
                    break;
                case 35 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1560:5: ^( PLUS_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PLUS_T197=(SLAST)match(input,PLUS_T,FOLLOW_PLUS_T_in_expression2664); 
                    PLUS_T197_tree = (SLAST)adaptor.dupNode(PLUS_T197);

                    root_1 = (SLAST)adaptor.becomeRoot(PLUS_T197_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2668);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2672);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PLUS_T197.startIndex;
                        int endIndex = PLUS_T197.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                    //    if (expr2 != null) {
                          retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_PLUS, expr2);
                    //    }
                    //    else {
                    //      retval.expr = new UnaryOperation(startIndex, endIndex, (e1!=null?e1.expr:null) , UnaryOperation.OP_PLUS);
                    //    }
                      

                    }
                    break;
                case 36 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1573:5: ^( MINUS_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MINUS_T198=(SLAST)match(input,MINUS_T,FOLLOW_MINUS_T_in_expression2684); 
                    MINUS_T198_tree = (SLAST)adaptor.dupNode(MINUS_T198);

                    root_1 = (SLAST)adaptor.becomeRoot(MINUS_T198_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2688);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2692);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MINUS_T198.startIndex;
                        int endIndex = MINUS_T198.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                    //    if (expr2 != null) {
                          retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_MINUS, expr2);
                    //    }
                    //    else {
                    //      retval.expr = new UnaryOperation(startIndex, endIndex, (e1!=null?e1.expr:null) , UnaryOperation.OP_MINUS);
                    //    }
                      

                    }
                    break;
                case 37 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1586:5: ^( MUL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MUL_T199=(SLAST)match(input,MUL_T,FOLLOW_MUL_T_in_expression2704); 
                    MUL_T199_tree = (SLAST)adaptor.dupNode(MUL_T199);

                    root_1 = (SLAST)adaptor.becomeRoot(MUL_T199_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2708);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2712);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MUL_T199.startIndex;
                        int endIndex = MUL_T199.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_MUL, expr2);
                      

                    }
                    break;
                case 38 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1594:5: ^( DIV_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DIV_T200=(SLAST)match(input,DIV_T,FOLLOW_DIV_T_in_expression2724); 
                    DIV_T200_tree = (SLAST)adaptor.dupNode(DIV_T200);

                    root_1 = (SLAST)adaptor.becomeRoot(DIV_T200_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2728);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2732);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DIV_T200.startIndex;
                        int endIndex = DIV_T200.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_DIV, expr2);
                      

                    }
                    break;
                case 39 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1602:5: ^( PERCENT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PERCENT_T201=(SLAST)match(input,PERCENT_T,FOLLOW_PERCENT_T_in_expression2744); 
                    PERCENT_T201_tree = (SLAST)adaptor.dupNode(PERCENT_T201);

                    root_1 = (SLAST)adaptor.becomeRoot(PERCENT_T201_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2748);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2752);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PERCENT_T201.startIndex;
                        int endIndex = PERCENT_T201.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_MOD, expr2);
                      

                    }
                    break;
                case 40 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1610:5: ^( CAST_EXPR cast_option e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CAST_EXPR202=(SLAST)match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expression2764); 
                    CAST_EXPR202_tree = (SLAST)adaptor.dupNode(CAST_EXPR202);

                    root_1 = (SLAST)adaptor.becomeRoot(CAST_EXPR202_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_cast_option_in_expression2766);
                    cast_option203=cast_option();

                    state._fsp--;

                    adaptor.addChild(root_1, cast_option203.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2770);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int result = (cast_option203!=null?cast_option203.castOption:0);
                        int startIndex = CAST_EXPR202.startIndex;
                        int endIndex = CAST_EXPR202.endIndex + 1;
                        Expression expr = (e!=null?e.expr:null);
                        switch(result) {
                          case 1:
                          case 2:
                            retval.expr = new CastExpression(startIndex, endIndex, expr, CastExpression.TYPE_BOOL);
                            break;
                          case 3:
                            retval.expr = new CastExpression(startIndex, endIndex, expr, CastExpression.TYPE_INT);
                            break;
                          case 6:
                            retval.expr = new CastExpression(startIndex, endIndex, expr, CastExpression.TYPE_ARRAY);
                            break;
                          case 7:
                            retval.expr = new CastExpression(startIndex, endIndex, expr, CastExpression.TYPE_OBJECT);
                            break;
                          case 8:
                            retval.expr = new CastExpression(startIndex, endIndex, expr, CastExpression.TYPE_REAL);
                            break;
                          case 9:
                            retval.expr = new CastExpression(startIndex, endIndex, expr, CastExpression.TYPE_STRING);
                            break;
                          case 10:
                            retval.expr = new CastExpression(startIndex, endIndex, expr, CastExpression.TYPE_UNSET);
                            break;
                          default:
                            retval.expr = new CastExpression(startIndex, endIndex, expr, CastExpression.TYPE_OBJECT);
                            break;
                        }
                      

                    }
                    break;
                case 41 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1656:5: ^( POSTFIX_EXPR e= expression plus_minus )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    POSTFIX_EXPR204=(SLAST)match(input,POSTFIX_EXPR,FOLLOW_POSTFIX_EXPR_in_expression2794); 
                    POSTFIX_EXPR204_tree = (SLAST)adaptor.dupNode(POSTFIX_EXPR204);

                    root_1 = (SLAST)adaptor.becomeRoot(POSTFIX_EXPR204_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2798);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_plus_minus_in_expression2800);
                    plus_minus205=plus_minus();

                    state._fsp--;

                    adaptor.addChild(root_1, plus_minus205.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          int startIndex = POSTFIX_EXPR204.startIndex;
                          int endIndex = POSTFIX_EXPR204.endIndex + 1;
                          if ((plus_minus205!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(plus_minus205.start),
                      input.getTreeAdaptor().getTokenStopIndex(plus_minus205.start))):null).equals("++")) {
                            retval.expr = new PostfixExpression(startIndex, endIndex, (e!=null?e.expr:null) , PostfixExpression.OP_INC);
                          }
                          else {
                            retval.expr = new PostfixExpression(startIndex, endIndex, (e!=null?e.expr:null) , PostfixExpression.OP_DEC);
                          } 
                      

                    }
                    break;
                case 42 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1667:5: ^( PREFIX_EXPR ( plus_minus )+ e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PREFIX_EXPR206=(SLAST)match(input,PREFIX_EXPR,FOLLOW_PREFIX_EXPR_in_expression2812); 
                    PREFIX_EXPR206_tree = (SLAST)adaptor.dupNode(PREFIX_EXPR206);

                    root_1 = (SLAST)adaptor.becomeRoot(PREFIX_EXPR206_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1667:19: ( plus_minus )+
                    int cnt60=0;
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( ((LA60_0>=PLUS_PLUS_T && LA60_0<=MINUS_MINUS_T)) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1667:19: plus_minus
                    	    {
                    	    _last = (SLAST)input.LT(1);
                    	    pushFollow(FOLLOW_plus_minus_in_expression2814);
                    	    plus_minus207=plus_minus();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, plus_minus207.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt60 >= 1 ) break loop60;
                                EarlyExitException eee =
                                    new EarlyExitException(60, input);
                                throw eee;
                        }
                        cnt60++;
                    } while (true);

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2819);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          int startIndex = PREFIX_EXPR206.startIndex;
                          int endIndex = PREFIX_EXPR206.endIndex + 1;
                          if ((plus_minus207!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(plus_minus207.start),
                      input.getTreeAdaptor().getTokenStopIndex(plus_minus207.start))):null).equals("++")) {
                            retval.expr = new PrefixExpression(startIndex, endIndex, (e!=null?e.expr:null), PrefixExpression.OP_INC);
                          }
                          else {
                            retval.expr = new PrefixExpression(startIndex, endIndex, (e!=null?e.expr:null), PrefixExpression.OP_DEC);
                          }
                      

                    }
                    break;
                case 43 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1678:5: ^( INSTANCEOF_T e= expression class_name_reference )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INSTANCEOF_T208=(SLAST)match(input,INSTANCEOF_T,FOLLOW_INSTANCEOF_T_in_expression2831); 
                    INSTANCEOF_T208_tree = (SLAST)adaptor.dupNode(INSTANCEOF_T208);

                    root_1 = (SLAST)adaptor.becomeRoot(INSTANCEOF_T208_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2835);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_class_name_reference_in_expression2837);
                    class_name_reference209=class_name_reference();

                    state._fsp--;

                    adaptor.addChild(root_1, class_name_reference209.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = INSTANCEOF_T208.startIndex;
                        int endIndex = INSTANCEOF_T208.endIndex + 1;
                        retval.expr = new InstanceOfExpression(startIndex, endIndex, (e!=null?e.expr:null), (class_name_reference209!=null?class_name_reference209.var:null)); 
                      

                    }
                    break;
                case 44 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1684:5: ( AT_T )? variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1684:5: ( AT_T )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==AT_T) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1684:5: AT_T
                            {
                            _last = (SLAST)input.LT(1);
                            AT_T210=(SLAST)match(input,AT_T,FOLLOW_AT_T_in_expression2848); 
                            AT_T210_tree = (SLAST)adaptor.dupNode(AT_T210);

                            adaptor.addChild(root_0, AT_T210_tree);


                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_in_expression2851);
                    variable211=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable211.getTree());

                        retval.expr = (variable211!=null?variable211.var:null);
                      

                    }
                    break;
                case 45 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1688:5: ( AT_T )? scalar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1688:5: ( AT_T )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==AT_T) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1688:5: AT_T
                            {
                            _last = (SLAST)input.LT(1);
                            AT_T212=(SLAST)match(input,AT_T,FOLLOW_AT_T_in_expression2861); 
                            AT_T212_tree = (SLAST)adaptor.dupNode(AT_T212);

                            adaptor.addChild(root_0, AT_T212_tree);


                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_expression2864);
                    scalar213=scalar();

                    state._fsp--;

                    adaptor.addChild(root_0, scalar213.getTree());

                        retval.expr = (scalar213!=null?scalar213.expr:null);
                        ast = (scalar213!=null?((SLAST)scalar213.tree):null);
                      

                    }
                    break;
                case 46 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1693:5: list_decl
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_list_decl_in_expression2874);
                    list_decl214=list_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, list_decl214.getTree());

                        retval.expr = (list_decl214!=null?list_decl214.expr:null);
                      

                    }
                    break;
                case 47 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1697:5: ^( ARRAY_DECL ( array_pair_list )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ARRAY_DECL215=(SLAST)match(input,ARRAY_DECL,FOLLOW_ARRAY_DECL_in_expression2885); 
                    ARRAY_DECL215_tree = (SLAST)adaptor.dupNode(ARRAY_DECL215);

                    root_1 = (SLAST)adaptor.becomeRoot(ARRAY_DECL215_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1697:18: ( array_pair_list )?
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==VAR_DECL||LA63_0==CALL||LA63_0==EXPR||(LA63_0>=SCALAR && LA63_0<=UNARY_EXPR)||LA63_0==REF_T||LA63_0==ARROW_T||LA63_0==EQUAL_T||(LA63_0>=OR_T && LA63_0<=CLONE_T)||(LA63_0>=INSTANCEOF_T && LA63_0<=PRINT_T)) ) {
                            alt63=1;
                        }
                        switch (alt63) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1697:18: array_pair_list
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_array_pair_list_in_expression2887);
                                array_pair_list216=array_pair_list();

                                state._fsp--;

                                adaptor.addChild(root_1, array_pair_list216.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = ARRAY_DECL215.startIndex;
                        int endIndex = ARRAY_DECL215.endIndex + 1;
                        if ((array_pair_list216!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(array_pair_list216.start),
                      input.getTreeAdaptor().getTokenStopIndex(array_pair_list216.start))):null) != null) {
                           retval.expr = new ArrayCreation(startIndex, endIndex, (array_pair_list216!=null?array_pair_list216.arrayList:null));
                        }
                        else {
                           retval.expr = new ArrayCreation(startIndex, endIndex, new LinkedList());
                        }
                      

                    }
                    break;
                case 48 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1708:5: ^( NEW_T class_name_reference )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    NEW_T217=(SLAST)match(input,NEW_T,FOLLOW_NEW_T_in_expression2900); 
                    NEW_T217_tree = (SLAST)adaptor.dupNode(NEW_T217);

                    root_1 = (SLAST)adaptor.becomeRoot(NEW_T217_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_class_name_reference_in_expression2902);
                    class_name_reference218=class_name_reference();

                    state._fsp--;

                    adaptor.addChild(root_1, class_name_reference218.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = NEW_T217.startIndex;
                        int endIndex = NEW_T217.endIndex + 1;
                        Expression className = (class_name_reference218!=null?class_name_reference218.var:null);
                        PHPCallArgumentsList ctor = (class_name_reference218!=null?class_name_reference218.parameterList:null);
                        if (ctor == null) {
                          System.out.println("ctor is null");
                          ctor = new PHPCallArgumentsList();
                          ctor.setStart(endIndex);
                          ctor.setEnd(endIndex);
                        }

                        ClassInstanceCreation classInstanceCreation = new ClassInstanceCreation(startIndex, endIndex, className, ctor);
                        retval.expr = classInstanceCreation;
                      

                    }
                    break;
                case 49 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1725:5: ^( CLONE_T variable )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CLONE_T219=(SLAST)match(input,CLONE_T,FOLLOW_CLONE_T_in_expression2917); 
                    CLONE_T219_tree = (SLAST)adaptor.dupNode(CLONE_T219);

                    root_1 = (SLAST)adaptor.becomeRoot(CLONE_T219_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_in_expression2919);
                    variable220=variable();

                    state._fsp--;

                    adaptor.addChild(root_1, variable220.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = CLONE_T219.startIndex;
                        int endIndex = CLONE_T219.endIndex + 1;
                        retval.expr = new CloneExpression(startIndex, endIndex, (variable220!=null?variable220.var:null));
                      

                    }
                    break;
                case 50 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1732:5: ^( UNSET_T variable_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    UNSET_T221=(SLAST)match(input,UNSET_T,FOLLOW_UNSET_T_in_expression2932); 
                    UNSET_T221_tree = (SLAST)adaptor.dupNode(UNSET_T221);

                    root_1 = (SLAST)adaptor.becomeRoot(UNSET_T221_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_list_in_expression2934);
                    variable_list222=variable_list();

                    state._fsp--;

                    adaptor.addChild(root_1, variable_list222.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                         int startIndex = UNSET_T221.startIndex;
                         int endIndex = UNSET_T221.endIndex + 1;
                         int startOfVariableList = startIndex + "unset".length() + 1;
                         SimpleReference simpleRef = new SimpleReference(startIndex, startIndex + "unset".length(), "unset");
                         
                         PHPCallArgumentsList list = new PHPCallArgumentsList();
                         List variableList = (variable_list222!=null?variable_list222.variableList:null);
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1752:5: BACKTRICKLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    BACKTRICKLITERAL223=(SLAST)match(input,BACKTRICKLITERAL,FOLLOW_BACKTRICKLITERAL_in_expression2946); 
                    BACKTRICKLITERAL223_tree = (SLAST)adaptor.dupNode(BACKTRICKLITERAL223);

                    adaptor.addChild(root_0, BACKTRICKLITERAL223_tree);


                        int startIndex = BACKTRICKLITERAL223.startIndex;
                        int endIndex = BACKTRICKLITERAL223.endIndex + 1;
                        retval.expr = new BackTickExpression(startIndex, endIndex, new LinkedList());
                      

                    }
                    break;
                case 52 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1758:5: ^( PRINT_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PRINT_T224=(SLAST)match(input,PRINT_T,FOLLOW_PRINT_T_in_expression2957); 
                    PRINT_T224_tree = (SLAST)adaptor.dupNode(PRINT_T224);

                    root_1 = (SLAST)adaptor.becomeRoot(PRINT_T224_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2961);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PRINT_T224.startIndex;
                        int endIndex = PRINT_T224.endIndex + 1;
                        
                        PHPCallArgumentsList list = new PHPCallArgumentsList();
                    	  if ((e!=null?e.expr:null) != null) {
                    	    list.addNode((e!=null?e.expr:null));
                    	    list.setStart((e!=null?e.expr:null).sourceStart());
                    	    list.setEnd((e!=null?e.expr:null).sourceEnd());
                    	  } else {
                    	    list.setStart(startIndex);
                    	    list.setEnd(startIndex);
                    	  }
                    	  
                    	  if (inExprList) {
                    	     ((expr_list_scope)expr_list_stack.peek()).list.remove(((expr_list_scope)expr_list_stack.peek()).list.size() - 1);
                    	  }
                        
                        SimpleReference name = new SimpleReference(startIndex, startIndex + "print".length(), "print");
                    	  retval.expr = new PHPCallExpression(startIndex, endIndex, null, name, list);
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    protected static class unary_symbol_list_scope {
        List list;
    }
    protected Stack unary_symbol_list_stack = new Stack();

    public static class unary_symbol_list_return extends TreeRuleReturnScope {
        public List symbolList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_symbol_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1783:1: unary_symbol_list returns [List symbolList] : ( unary_symbol )+ ;
    public final TreePHP.unary_symbol_list_return unary_symbol_list() throws RecognitionException {
        unary_symbol_list_stack.push(new unary_symbol_list_scope());
        TreePHP.unary_symbol_list_return retval = new TreePHP.unary_symbol_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.unary_symbol_return unary_symbol225 = null;




          ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list = new ArrayList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1790:3: ( ( unary_symbol )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1790:5: ( unary_symbol )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1790:5: ( unary_symbol )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                switch ( input.LA(1) ) {
                case REF_T:
                    {
                    int LA65_2 = input.LA(2);

                    if ( (LA65_2==VAR_DECL||LA65_2==CALL||LA65_2==EXPR||(LA65_2>=SCALAR && LA65_2<=UNARY_EXPR)||LA65_2==REF_T||LA65_2==EQUAL_T||(LA65_2>=OR_T && LA65_2<=EXC_NOT_T)||(LA65_2>=INSTANCEOF_T && LA65_2<=PRINT_T)) ) {
                        alt65=1;
                    }


                    }
                    break;
                case PLUS_T:
                    {
                    int LA65_3 = input.LA(2);

                    if ( (LA65_3==VAR_DECL||LA65_3==CALL||LA65_3==EXPR||(LA65_3>=SCALAR && LA65_3<=UNARY_EXPR)||LA65_3==REF_T||LA65_3==EQUAL_T||(LA65_3>=OR_T && LA65_3<=EXC_NOT_T)||(LA65_3>=INSTANCEOF_T && LA65_3<=PRINT_T)) ) {
                        alt65=1;
                    }


                    }
                    break;
                case MINUS_T:
                    {
                    int LA65_4 = input.LA(2);

                    if ( (LA65_4==VAR_DECL||LA65_4==CALL||LA65_4==EXPR||(LA65_4>=SCALAR && LA65_4<=UNARY_EXPR)||LA65_4==REF_T||LA65_4==EQUAL_T||(LA65_4>=OR_T && LA65_4<=EXC_NOT_T)||(LA65_4>=INSTANCEOF_T && LA65_4<=PRINT_T)) ) {
                        alt65=1;
                    }


                    }
                    break;
                case TILDA_T:
                case EXC_NOT_T:
                    {
                    alt65=1;
                    }
                    break;

                }

                switch (alt65) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1790:5: unary_symbol
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_unary_symbol_in_unary_symbol_list2995);
            	    unary_symbol225=unary_symbol();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_symbol225.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);


                retval.symbolList = ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            unary_symbol_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "unary_symbol_list"

    public static class unary_symbol_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unary_symbol"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1796:1: unary_symbol : ( PLUS_T | MINUS_T | REF_T | TILDA_T | EXC_NOT_T );
    public final TreePHP.unary_symbol_return unary_symbol() throws RecognitionException {
        TreePHP.unary_symbol_return retval = new TreePHP.unary_symbol_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST PLUS_T226=null;
        SLAST MINUS_T227=null;
        SLAST REF_T228=null;
        SLAST TILDA_T229=null;
        SLAST EXC_NOT_T230=null;

        SLAST PLUS_T226_tree=null;
        SLAST MINUS_T227_tree=null;
        SLAST REF_T228_tree=null;
        SLAST TILDA_T229_tree=null;
        SLAST EXC_NOT_T230_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1797:3: ( PLUS_T | MINUS_T | REF_T | TILDA_T | EXC_NOT_T )
            int alt66=5;
            switch ( input.LA(1) ) {
            case PLUS_T:
                {
                alt66=1;
                }
                break;
            case MINUS_T:
                {
                alt66=2;
                }
                break;
            case REF_T:
                {
                alt66=3;
                }
                break;
            case TILDA_T:
                {
                alt66=4;
                }
                break;
            case EXC_NOT_T:
                {
                alt66=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1797:5: PLUS_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    PLUS_T226=(SLAST)match(input,PLUS_T,FOLLOW_PLUS_T_in_unary_symbol3015); 
                    PLUS_T226_tree = (SLAST)adaptor.dupNode(PLUS_T226);

                    adaptor.addChild(root_0, PLUS_T226_tree);

                    ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list.add(0,1);

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1798:5: MINUS_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    MINUS_T227=(SLAST)match(input,MINUS_T,FOLLOW_MINUS_T_in_unary_symbol3024); 
                    MINUS_T227_tree = (SLAST)adaptor.dupNode(MINUS_T227);

                    adaptor.addChild(root_0, MINUS_T227_tree);

                    ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list.add(0,2);

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1799:5: REF_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    REF_T228=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_unary_symbol3032); 
                    REF_T228_tree = (SLAST)adaptor.dupNode(REF_T228);

                    adaptor.addChild(root_0, REF_T228_tree);

                    ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list.add(0,3);

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1800:5: TILDA_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    TILDA_T229=(SLAST)match(input,TILDA_T,FOLLOW_TILDA_T_in_unary_symbol3042); 
                    TILDA_T229_tree = (SLAST)adaptor.dupNode(TILDA_T229);

                    adaptor.addChild(root_0, TILDA_T229_tree);

                    ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list.add(0,4);

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1801:5: EXC_NOT_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    EXC_NOT_T230=(SLAST)match(input,EXC_NOT_T,FOLLOW_EXC_NOT_T_in_unary_symbol3050); 
                    EXC_NOT_T230_tree = (SLAST)adaptor.dupNode(EXC_NOT_T230);

                    adaptor.addChild(root_0, EXC_NOT_T230_tree);

                    ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list.add(0,5);

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unary_symbol"

    public static class plus_minus_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plus_minus"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1804:1: plus_minus : ( PLUS_PLUS_T | MINUS_MINUS_T );
    public final TreePHP.plus_minus_return plus_minus() throws RecognitionException {
        TreePHP.plus_minus_return retval = new TreePHP.plus_minus_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST set231=null;

        SLAST set231_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1805:3: ( PLUS_PLUS_T | MINUS_MINUS_T )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            set231=(SLAST)input.LT(1);
            if ( (input.LA(1)>=PLUS_PLUS_T && input.LA(1)<=MINUS_MINUS_T) ) {
                input.consume();

                set231_tree = (SLAST)adaptor.dupNode(set231);

                adaptor.addChild(root_0, set231_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "plus_minus"

    public static class cast_option_return extends TreeRuleReturnScope {
        public int castOption;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "cast_option"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1809:1: cast_option returns [int castOption] : ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'array' | 'object' | 'real' | 'string' | UNSET_T | CLONE_T );
    public final TreePHP.cast_option_return cast_option() throws RecognitionException {
        TreePHP.cast_option_return retval = new TreePHP.cast_option_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST string_literal232=null;
        SLAST string_literal233=null;
        SLAST string_literal234=null;
        SLAST string_literal235=null;
        SLAST string_literal236=null;
        SLAST string_literal237=null;
        SLAST string_literal238=null;
        SLAST string_literal239=null;
        SLAST string_literal240=null;
        SLAST UNSET_T241=null;
        SLAST CLONE_T242=null;

        SLAST string_literal232_tree=null;
        SLAST string_literal233_tree=null;
        SLAST string_literal234_tree=null;
        SLAST string_literal235_tree=null;
        SLAST string_literal236_tree=null;
        SLAST string_literal237_tree=null;
        SLAST string_literal238_tree=null;
        SLAST string_literal239_tree=null;
        SLAST string_literal240_tree=null;
        SLAST UNSET_T241_tree=null;
        SLAST CLONE_T242_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1810:3: ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'array' | 'object' | 'real' | 'string' | UNSET_T | CLONE_T )
            int alt67=11;
            switch ( input.LA(1) ) {
            case 181:
                {
                alt67=1;
                }
                break;
            case 182:
                {
                alt67=2;
                }
                break;
            case 183:
                {
                alt67=3;
                }
                break;
            case 184:
                {
                alt67=4;
                }
                break;
            case 185:
                {
                alt67=5;
                }
                break;
            case 189:
                {
                alt67=6;
                }
                break;
            case 188:
                {
                alt67=7;
                }
                break;
            case 186:
                {
                alt67=8;
                }
                break;
            case 187:
                {
                alt67=9;
                }
                break;
            case UNSET_T:
                {
                alt67=10;
                }
                break;
            case CLONE_T:
                {
                alt67=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1810:5: 'bool'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal232=(SLAST)match(input,181,FOLLOW_181_in_cast_option3088); 
                    string_literal232_tree = (SLAST)adaptor.dupNode(string_literal232);

                    adaptor.addChild(root_0, string_literal232_tree);

                    retval.castOption = 1;

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1811:5: 'boolean'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal233=(SLAST)match(input,182,FOLLOW_182_in_cast_option3099); 
                    string_literal233_tree = (SLAST)adaptor.dupNode(string_literal233);

                    adaptor.addChild(root_0, string_literal233_tree);

                    retval.castOption = 2;

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1812:5: 'int'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal234=(SLAST)match(input,183,FOLLOW_183_in_cast_option3107); 
                    string_literal234_tree = (SLAST)adaptor.dupNode(string_literal234);

                    adaptor.addChild(root_0, string_literal234_tree);

                    retval.castOption = 3;

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1813:5: 'float'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal235=(SLAST)match(input,184,FOLLOW_184_in_cast_option3119); 
                    string_literal235_tree = (SLAST)adaptor.dupNode(string_literal235);

                    adaptor.addChild(root_0, string_literal235_tree);

                    retval.castOption = 4;

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1814:5: 'double'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal236=(SLAST)match(input,185,FOLLOW_185_in_cast_option3129); 
                    string_literal236_tree = (SLAST)adaptor.dupNode(string_literal236);

                    adaptor.addChild(root_0, string_literal236_tree);

                    retval.castOption = 5;

                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1815:5: 'array'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal237=(SLAST)match(input,189,FOLLOW_189_in_cast_option3138); 
                    string_literal237_tree = (SLAST)adaptor.dupNode(string_literal237);

                    adaptor.addChild(root_0, string_literal237_tree);

                    retval.castOption = 6;

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1816:5: 'object'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal238=(SLAST)match(input,188,FOLLOW_188_in_cast_option3148); 
                    string_literal238_tree = (SLAST)adaptor.dupNode(string_literal238);

                    adaptor.addChild(root_0, string_literal238_tree);

                    retval.castOption = 7;

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1817:5: 'real'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal239=(SLAST)match(input,186,FOLLOW_186_in_cast_option3157); 
                    string_literal239_tree = (SLAST)adaptor.dupNode(string_literal239);

                    adaptor.addChild(root_0, string_literal239_tree);

                    retval.castOption = 8;

                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1818:5: 'string'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal240=(SLAST)match(input,187,FOLLOW_187_in_cast_option3168); 
                    string_literal240_tree = (SLAST)adaptor.dupNode(string_literal240);

                    adaptor.addChild(root_0, string_literal240_tree);

                    retval.castOption = 9;

                    }
                    break;
                case 10 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1819:5: UNSET_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    UNSET_T241=(SLAST)match(input,UNSET_T,FOLLOW_UNSET_T_in_cast_option3177); 
                    UNSET_T241_tree = (SLAST)adaptor.dupNode(UNSET_T241);

                    adaptor.addChild(root_0, UNSET_T241_tree);

                    retval.castOption = 10;

                    }
                    break;
                case 11 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1820:5: CLONE_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    CLONE_T242=(SLAST)match(input,CLONE_T,FOLLOW_CLONE_T_in_cast_option3187); 
                    CLONE_T242_tree = (SLAST)adaptor.dupNode(CLONE_T242);

                    adaptor.addChild(root_0, CLONE_T242_tree);

                    retval.castOption = 11;

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "cast_option"

    protected static class class_name_reference_scope {
        List list;
        List argList;
    }
    protected Stack class_name_reference_stack = new Stack();

    public static class class_name_reference_return extends TreeRuleReturnScope {
        public Expression var;
        public PHPCallArgumentsList parameterList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "class_name_reference"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1828:1: class_name_reference returns [Expression var, PHPCallArgumentsList parameterList] : ( dynamic_name_reference | fully_qualified_class_name );
    public final TreePHP.class_name_reference_return class_name_reference() throws RecognitionException {
        class_name_reference_stack.push(new class_name_reference_scope());
        TreePHP.class_name_reference_return retval = new TreePHP.class_name_reference_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.dynamic_name_reference_return dynamic_name_reference243 = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name244 = null;




          ((class_name_reference_scope)class_name_reference_stack.peek()).list = new LinkedList();
          ((class_name_reference_scope)class_name_reference_stack.peek()).argList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1837:3: ( dynamic_name_reference | fully_qualified_class_name )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==VAR_DECL||LA68_0==CALL) ) {
                alt68=1;
            }
            else if ( (LA68_0==IDENTIFIER||LA68_0==DOMAIN_T) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1837:5: dynamic_name_reference
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_dynamic_name_reference_in_class_name_reference3229);
                    dynamic_name_reference243=dynamic_name_reference();

                    state._fsp--;

                    adaptor.addChild(root_0, dynamic_name_reference243.getTree());

                        retval.var = (dynamic_name_reference243!=null?dynamic_name_reference243.var:null);
                        retval.parameterList = (dynamic_name_reference243!=null?dynamic_name_reference243.parameterList:null);
                           
                        Expression dispatcher = retval.var;
                        Iterator iter = ((class_name_reference_scope)class_name_reference_stack.peek()).list.iterator();
                        System.out.println("i ma vara;;;;" + retval.var);
                        while (iter.hasNext()) {
                          Expression property = (Expression)iter.next();
                          dispatcher = createDispatch(dispatcher, property);
                        }
                        retval.var = dispatcher;
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1851:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_class_name_reference3239);
                    fully_qualified_class_name244=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_0, fully_qualified_class_name244.getTree());

                        retval.var = (fully_qualified_class_name244!=null?fully_qualified_class_name244.type:null);
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            class_name_reference_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "class_name_reference"

    public static class dynamic_name_reference_return extends TreeRuleReturnScope {
        public Expression var;
        public PHPCallArgumentsList parameterList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dynamic_name_reference"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1857:1: dynamic_name_reference returns [Expression var, PHPCallArgumentsList parameterList] : ( base_variable_with_function_calls | ^( CALL v1= dynamic_name_reference obj= object_property ( ctor_arguments )? ) );
    public final TreePHP.dynamic_name_reference_return dynamic_name_reference() throws RecognitionException {
        TreePHP.dynamic_name_reference_return retval = new TreePHP.dynamic_name_reference_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CALL246=null;
        TreePHP.dynamic_name_reference_return v1 = null;

        TreePHP.object_property_return obj = null;

        TreePHP.base_variable_with_function_calls_return base_variable_with_function_calls245 = null;

        TreePHP.ctor_arguments_return ctor_arguments247 = null;


        SLAST CALL246_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1858:3: ( base_variable_with_function_calls | ^( CALL v1= dynamic_name_reference obj= object_property ( ctor_arguments )? ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==VAR_DECL) ) {
                alt70=1;
            }
            else if ( (LA70_0==CALL) ) {
                int LA70_2 = input.LA(2);

                if ( (LA70_2==DOWN) ) {
                    int LA70_3 = input.LA(3);

                    if ( (LA70_3==IDENTIFIER||LA70_3==DOMAIN_T) ) {
                        alt70=1;
                    }
                    else if ( (LA70_3==VAR_DECL||LA70_3==CALL) ) {
                        alt70=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1858:5: base_variable_with_function_calls
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference3262);
                    base_variable_with_function_calls245=base_variable_with_function_calls();

                    state._fsp--;

                    adaptor.addChild(root_0, base_variable_with_function_calls245.getTree());

                         retval.var = (base_variable_with_function_calls245!=null?base_variable_with_function_calls245.var:null);
                         if ((base_variable_with_function_calls245!=null?base_variable_with_function_calls245.type:null) != null) {
                            retval.var = (base_variable_with_function_calls245!=null?base_variable_with_function_calls245.type:null);
                         }
                         retval.parameterList = (base_variable_with_function_calls245!=null?base_variable_with_function_calls245.parameterList:null);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1866:5: ^( CALL v1= dynamic_name_reference obj= object_property ( ctor_arguments )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CALL246=(SLAST)match(input,CALL,FOLLOW_CALL_in_dynamic_name_reference3274); 
                    CALL246_tree = (SLAST)adaptor.dupNode(CALL246);

                    root_1 = (SLAST)adaptor.becomeRoot(CALL246_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_dynamic_name_reference_in_dynamic_name_reference3278);
                    v1=dynamic_name_reference();

                    state._fsp--;

                    adaptor.addChild(root_1, v1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_dynamic_name_reference3282);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1866:58: ( ctor_arguments )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==ARGU) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1866:58: ctor_arguments
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_ctor_arguments_in_dynamic_name_reference3284);
                            ctor_arguments247=ctor_arguments();

                            state._fsp--;

                            adaptor.addChild(root_1, ctor_arguments247.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          retval.var = (v1!=null?v1.var:null);
                           
                          ((class_name_reference_scope)class_name_reference_stack.peek()).list.add((obj!=null?obj.expr:null));
                          
                          if ((ctor_arguments247!=null?ctor_arguments247.argumentList:null) != null) {
                            retval.parameterList = (ctor_arguments247!=null?ctor_arguments247.argumentList:null);
                          }
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dynamic_name_reference"

    public static class list_decl_return extends TreeRuleReturnScope {
        public Expression expr;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list_decl"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1878:1: list_decl returns [Expression expr] : ^( LIST_T ( assignment_list )? ) ;
    public final TreePHP.list_decl_return list_decl() throws RecognitionException {
        TreePHP.list_decl_return retval = new TreePHP.list_decl_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST LIST_T248=null;
        TreePHP.assignment_list_return assignment_list249 = null;


        SLAST LIST_T248_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1879:3: ( ^( LIST_T ( assignment_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1879:5: ^( LIST_T ( assignment_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            LIST_T248=(SLAST)match(input,LIST_T,FOLLOW_LIST_T_in_list_decl3308); 
            LIST_T248_tree = (SLAST)adaptor.dupNode(LIST_T248);

            root_1 = (SLAST)adaptor.becomeRoot(LIST_T248_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1879:14: ( assignment_list )?
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==VAR_DECL||LA71_0==CALL||LA71_0==LIST_T) ) {
                    alt71=1;
                }
                switch (alt71) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1879:14: assignment_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_assignment_list_in_list_decl3310);
                        assignment_list249=assignment_list();

                        state._fsp--;

                        adaptor.addChild(root_1, assignment_list249.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                int startIndex = (LIST_T248).startIndex;
                int endIndex = LIST_T248.endIndex + 1;
                retval.expr = new ListVariable(startIndex, endIndex, (assignment_list249!=null?assignment_list249.assignList:null));
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list_decl"

    protected static class assignment_list_scope {
        List list;
    }
    protected Stack assignment_list_stack = new Stack();

    public static class assignment_list_return extends TreeRuleReturnScope {
        public List assignList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1887:1: assignment_list returns [List assignList] : ( assignment_element )+ ;
    public final TreePHP.assignment_list_return assignment_list() throws RecognitionException {
        assignment_list_stack.push(new assignment_list_scope());
        TreePHP.assignment_list_return retval = new TreePHP.assignment_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.assignment_element_return assignment_element250 = null;




          ((assignment_list_scope)assignment_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1894:3: ( ( assignment_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1894:5: ( assignment_element )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1894:5: ( assignment_element )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==VAR_DECL||LA72_0==CALL||LA72_0==LIST_T) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1894:5: assignment_element
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_assignment_element_in_assignment_list3342);
            	    assignment_element250=assignment_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assignment_element250.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
            } while (true);


                retval.assignList = ((assignment_list_scope)assignment_list_stack.peek()).list;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            assignment_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "assignment_list"

    public static class assignment_element_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_element"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1900:1: assignment_element : ( variable | list_decl );
    public final TreePHP.assignment_element_return assignment_element() throws RecognitionException {
        TreePHP.assignment_element_return retval = new TreePHP.assignment_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.variable_return variable251 = null;

        TreePHP.list_decl_return list_decl252 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1901:3: ( variable | list_decl )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==VAR_DECL||LA73_0==CALL) ) {
                alt73=1;
            }
            else if ( (LA73_0==LIST_T) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1901:5: variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_in_assignment_element3360);
                    variable251=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable251.getTree());

                        ((assignment_list_scope)assignment_list_stack.peek()).list.add((variable251!=null?variable251.var:null));
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1905:5: list_decl
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_list_decl_in_assignment_element3370);
                    list_decl252=list_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, list_decl252.getTree());

                        ((assignment_list_scope)assignment_list_stack.peek()).list.add((list_decl252!=null?list_decl252.expr:null));
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment_element"

    protected static class array_pair_list_scope {
        List list;
    }
    protected Stack array_pair_list_stack = new Stack();

    public static class array_pair_list_return extends TreeRuleReturnScope {
        public List arrayList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_pair_list"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1911:1: array_pair_list returns [List arrayList] : ( array_pair_element )+ ;
    public final TreePHP.array_pair_list_return array_pair_list() throws RecognitionException {
        array_pair_list_stack.push(new array_pair_list_scope());
        TreePHP.array_pair_list_return retval = new TreePHP.array_pair_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.array_pair_element_return array_pair_element253 = null;




          ((array_pair_list_scope)array_pair_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1918:3: ( ( array_pair_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1918:5: ( array_pair_element )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1918:5: ( array_pair_element )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==VAR_DECL||LA74_0==CALL||LA74_0==EXPR||(LA74_0>=SCALAR && LA74_0<=UNARY_EXPR)||LA74_0==REF_T||LA74_0==ARROW_T||LA74_0==EQUAL_T||(LA74_0>=OR_T && LA74_0<=CLONE_T)||(LA74_0>=INSTANCEOF_T && LA74_0<=PRINT_T)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1918:5: array_pair_element
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_array_pair_element_in_array_pair_list3402);
            	    array_pair_element253=array_pair_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, array_pair_element253.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
            } while (true);


                retval.arrayList = ((array_pair_list_scope)array_pair_list_stack.peek()).list;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            array_pair_list_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "array_pair_list"

    public static class array_pair_element_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "array_pair_element"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1924:1: array_pair_element : ( ^( ARROW_T e1= expression e2= expression ) | e= expression );
    public final TreePHP.array_pair_element_return array_pair_element() throws RecognitionException {
        TreePHP.array_pair_element_return retval = new TreePHP.array_pair_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST ARROW_T254=null;
        TreePHP.expression_return e1 = null;

        TreePHP.expression_return e2 = null;

        TreePHP.expression_return e = null;


        SLAST ARROW_T254_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1925:3: ( ^( ARROW_T e1= expression e2= expression ) | e= expression )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==ARROW_T) ) {
                alt75=1;
            }
            else if ( (LA75_0==VAR_DECL||LA75_0==CALL||LA75_0==EXPR||(LA75_0>=SCALAR && LA75_0<=UNARY_EXPR)||LA75_0==REF_T||LA75_0==EQUAL_T||(LA75_0>=OR_T && LA75_0<=CLONE_T)||(LA75_0>=INSTANCEOF_T && LA75_0<=PRINT_T)) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1925:5: ^( ARROW_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ARROW_T254=(SLAST)match(input,ARROW_T,FOLLOW_ARROW_T_in_array_pair_element3423); 
                    ARROW_T254_tree = (SLAST)adaptor.dupNode(ARROW_T254);

                    root_1 = (SLAST)adaptor.becomeRoot(ARROW_T254_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_array_pair_element3427);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_array_pair_element3431);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = ARROW_T254.startIndex;
                        int endIndex = ARROW_T254.endIndex + 1;
                        Expression key = (e1!=null?e1.expr:null);
                        Expression value = (e2!=null?e2.expr:null); 
                        ArrayElement element = new ArrayElement(startIndex, endIndex, key, value);
                        ((array_pair_list_scope)array_pair_list_stack.peek()).list.add(element);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1934:5: e= expression
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_array_pair_element3444);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, e.getTree());

                        int startIndex = (e!=null?e.expr:null).sourceStart();
                        int endIndex = (e!=null?e.expr:null).sourceEnd();
                        Expression expr = (e!=null?e.expr:null);
                        ArrayElement element = new ArrayElement(startIndex, endIndex, expr);
                        ((array_pair_list_scope)array_pair_list_stack.peek()).list.add(element);
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "array_pair_element"

    protected static class variable_scope {
        List list;
    }
    protected Stack variable_stack = new Stack();

    public static class variable_return extends TreeRuleReturnScope {
        public Expression var;
        public PHPCallArgumentsList parameterList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1944:1: variable returns [Expression var, PHPCallArgumentsList parameterList] : variable_temp ;
    public final TreePHP.variable_return variable() throws RecognitionException {
        variable_stack.push(new variable_scope());
        TreePHP.variable_return retval = new TreePHP.variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.variable_temp_return variable_temp255 = null;




          ((variable_scope)variable_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1951:3: ( variable_temp )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1951:5: variable_temp
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_variable_temp_in_variable3479);
            variable_temp255=variable_temp();

            state._fsp--;

            adaptor.addChild(root_0, variable_temp255.getTree());

                Iterator iter = ((variable_scope)variable_stack.peek()).list.iterator();
                Expression dispatcher = (variable_temp255!=null?variable_temp255.var:null);
                iter = ((variable_scope)variable_stack.peek()).list.iterator();
                while (iter.hasNext()) {
                  Expression property = (Expression)iter.next();
                  if (inVarList) {
                    if (((variable_list_scope)variable_list_stack.peek()).varList.contains(property)) {
                       ((variable_list_scope)variable_list_stack.peek()).varList.remove(property);
                    }
                  }
                  System.out.println("property:" + property);
                  dispatcher = createDispatch(dispatcher, property);
                }
                retval.var = dispatcher;
                if (inVarList) {
                  ((variable_list_scope)variable_list_stack.peek()).varList.add(retval.var);
                }
                
                System.out.println("whatXXX:" + retval.var);
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            variable_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class variable_temp_return extends TreeRuleReturnScope {
        public Expression var;
        public PHPCallArgumentsList parameterList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable_temp"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1975:1: variable_temp returns [Expression var, PHPCallArgumentsList parameterList] : ( base_variable_with_function_calls | ^( CALL v1= variable_temp obj= object_property ( ctor_arguments )? ) );
    public final TreePHP.variable_temp_return variable_temp() throws RecognitionException {
        TreePHP.variable_temp_return retval = new TreePHP.variable_temp_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CALL257=null;
        TreePHP.variable_temp_return v1 = null;

        TreePHP.object_property_return obj = null;

        TreePHP.base_variable_with_function_calls_return base_variable_with_function_calls256 = null;

        TreePHP.ctor_arguments_return ctor_arguments258 = null;


        SLAST CALL257_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1976:3: ( base_variable_with_function_calls | ^( CALL v1= variable_temp obj= object_property ( ctor_arguments )? ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==VAR_DECL) ) {
                alt77=1;
            }
            else if ( (LA77_0==CALL) ) {
                int LA77_2 = input.LA(2);

                if ( (LA77_2==DOWN) ) {
                    int LA77_3 = input.LA(3);

                    if ( (LA77_3==IDENTIFIER||LA77_3==DOMAIN_T) ) {
                        alt77=1;
                    }
                    else if ( (LA77_3==VAR_DECL||LA77_3==CALL) ) {
                        alt77=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1976:5: base_variable_with_function_calls
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_base_variable_with_function_calls_in_variable_temp3502);
                    base_variable_with_function_calls256=base_variable_with_function_calls();

                    state._fsp--;

                    adaptor.addChild(root_0, base_variable_with_function_calls256.getTree());

                         retval.var = (base_variable_with_function_calls256!=null?base_variable_with_function_calls256.var:null);
                         retval.parameterList = (base_variable_with_function_calls256!=null?base_variable_with_function_calls256.parameterList:null);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1981:5: ^( CALL v1= variable_temp obj= object_property ( ctor_arguments )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CALL257=(SLAST)match(input,CALL,FOLLOW_CALL_in_variable_temp3514); 
                    CALL257_tree = (SLAST)adaptor.dupNode(CALL257);

                    root_1 = (SLAST)adaptor.becomeRoot(CALL257_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_temp_in_variable_temp3518);
                    v1=variable_temp();

                    state._fsp--;

                    adaptor.addChild(root_1, v1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_variable_temp3522);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1981:49: ( ctor_arguments )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==ARGU) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:1981:49: ctor_arguments
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_ctor_arguments_in_variable_temp3524);
                            ctor_arguments258=ctor_arguments();

                            state._fsp--;

                            adaptor.addChild(root_1, ctor_arguments258.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          retval.var = (v1!=null?v1.var:null);

                          int startIndex = CALL257.startIndex;
                          int endIndex = CALL257.endIndex + 1;

                          Expression firstVarProperty = null;
                          if ((ctor_arguments258!=null?ctor_arguments258.argumentList:null) == null) {
                            firstVarProperty = (obj!=null?obj.expr:null);
                            if ((obj!=null?obj.simpleRef:null) != null) {
                              firstVarProperty = (obj!=null?obj.simpleRef:null);
                            }
                          }
                          else {
                            if ((obj!=null?obj.simpleRef:null).getClass().equals(SimpleReference.class)) {
                    		      firstVarProperty = new PHPCallExpression(startIndex, endIndex, null, (obj!=null?obj.simpleRef:null), (ctor_arguments258!=null?ctor_arguments258.argumentList:null));
                    		    } else {
                    		      firstVarProperty = new ReflectionCallExpression(startIndex, endIndex, null, (SimpleReference)(obj!=null?obj.simpleRef:null), (ctor_arguments258!=null?ctor_arguments258.argumentList:null));
                    		    }
                          }
                          
                          System.out.println("first var:" + firstVarProperty);
                          ((variable_scope)variable_stack.peek()).list.add(firstVarProperty);
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable_temp"

    public static class base_variable_with_function_calls_return extends TreeRuleReturnScope {
        public Expression var;
        public PHPCallArgumentsList parameterList;
        public TypeReference type;
        public Expression functionInvocation;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "base_variable_with_function_calls"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2008:1: base_variable_with_function_calls returns [Expression var, PHPCallArgumentsList parameterList, TypeReference type, Expression functionInvocation] : ( ^( VAR_DECL ( fully_qualified_class_name )? obj= object_property ( ctor_arguments )? ) | ^( CALL fully_qualified_class_name ctor_arguments ) );
    public final TreePHP.base_variable_with_function_calls_return base_variable_with_function_calls() throws RecognitionException {
        TreePHP.base_variable_with_function_calls_return retval = new TreePHP.base_variable_with_function_calls_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST VAR_DECL259=null;
        SLAST CALL262=null;
        TreePHP.object_property_return obj = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name260 = null;

        TreePHP.ctor_arguments_return ctor_arguments261 = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name263 = null;

        TreePHP.ctor_arguments_return ctor_arguments264 = null;


        SLAST VAR_DECL259_tree=null;
        SLAST CALL262_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2009:3: ( ^( VAR_DECL ( fully_qualified_class_name )? obj= object_property ( ctor_arguments )? ) | ^( CALL fully_qualified_class_name ctor_arguments ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==VAR_DECL) ) {
                alt80=1;
            }
            else if ( (LA80_0==CALL) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2009:5: ^( VAR_DECL ( fully_qualified_class_name )? obj= object_property ( ctor_arguments )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    VAR_DECL259=(SLAST)match(input,VAR_DECL,FOLLOW_VAR_DECL_in_base_variable_with_function_calls3550); 
                    VAR_DECL259_tree = (SLAST)adaptor.dupNode(VAR_DECL259);

                    root_1 = (SLAST)adaptor.becomeRoot(VAR_DECL259_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2009:16: ( fully_qualified_class_name )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==IDENTIFIER||LA78_0==DOMAIN_T) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2009:16: fully_qualified_class_name
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3552);
                            fully_qualified_class_name260=fully_qualified_class_name();

                            state._fsp--;

                            adaptor.addChild(root_1, fully_qualified_class_name260.getTree());

                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_base_variable_with_function_calls3557);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2009:64: ( ctor_arguments )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==ARGU) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2009:64: ctor_arguments
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls3559);
                            ctor_arguments261=ctor_arguments();

                            state._fsp--;

                            adaptor.addChild(root_1, ctor_arguments261.getTree());

                            }
                            break;

                    }


                        int startIndex = VAR_DECL259.startIndex;
                        int endIndex = VAR_DECL259.endIndex + 1;
                        System.out.println("varid: " + startIndex + " " + endIndex);
                        retval.var = (obj!=null?obj.expr:null);
                        TypeReference type = (fully_qualified_class_name260!=null?fully_qualified_class_name260.type:null);
                        
                        System.out.println("vardddd:" + retval.var);
                        
                        if (type != null) {
                            retval.var = new StaticFieldAccess(startIndex, endIndex, (fully_qualified_class_name260!=null?fully_qualified_class_name260.type:null), (obj!=null?obj.expr:null));
                        }
                        
                        if ((ctor_arguments261!=null?ctor_arguments261.argumentList:null) != null) {
                          PHPCallArgumentsList parameters = (ctor_arguments261!=null?ctor_arguments261.argumentList:null);
                      //    parameters.addNode(retval.var);
                          retval.parameterList = parameters;
                          retval.var = new ReflectionCallExpression(startIndex, endIndex, null, (obj!=null?obj.expr:null), parameters);
                          
                    //      retval.var = new ReflectionStaticMethodInvocation(startIndex, endIndex, type, (obj!=null?obj.expr:null), parameters);
                        }
                        else {
                          retval.parameterList = new PHPCallArgumentsList();
                          retval.parameterList.setStart(startIndex);
                          retval.parameterList.setEnd(startIndex);
                          
                        }
                      

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2039:5: ^( CALL fully_qualified_class_name ctor_arguments )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CALL262=(SLAST)match(input,CALL,FOLLOW_CALL_in_base_variable_with_function_calls3580); 
                    CALL262_tree = (SLAST)adaptor.dupNode(CALL262);

                    root_1 = (SLAST)adaptor.becomeRoot(CALL262_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3582);
                    fully_qualified_class_name263=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_1, fully_qualified_class_name263.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls3584);
                    ctor_arguments264=ctor_arguments();

                    state._fsp--;

                    adaptor.addChild(root_1, ctor_arguments264.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = CALL262.startIndex;
                        int endIndex = CALL262.endIndex + 1;
                        
                        TypeReference type = (fully_qualified_class_name263!=null?fully_qualified_class_name263.type:null);    
                        PHPCallArgumentsList parameters = (ctor_arguments264!=null?ctor_arguments264.argumentList:null);
                        
                        retval.type = type;
                        retval.parameterList = parameters;
                        
                        if ((fully_qualified_class_name263!=null?fully_qualified_class_name263.simpleRef:null) != null) {
                          retval.var = new StaticMethodInvocation(startIndex, endIndex, (TypeReference)(fully_qualified_class_name263!=null?fully_qualified_class_name263.type:null), (fully_qualified_class_name263!=null?fully_qualified_class_name263.simpleRef:null), parameters);
                        }
                        else {
                        
                    	    int functionNameLeft= ((CommonToken)(fully_qualified_class_name263!=null?((SLAST)fully_qualified_class_name263.tree):null).token).getStartIndex();
                    	    int functionNameRight= ((CommonToken)(fully_qualified_class_name263!=null?((SLAST)fully_qualified_class_name263.tree):null).token).getStopIndex() + 1;
                    	    String functionName = (fully_qualified_class_name263!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(fully_qualified_class_name263.start),
                      input.getTreeAdaptor().getTokenStopIndex(fully_qualified_class_name263.start))):null);
                    	    SimpleReference name = new SimpleReference(functionNameLeft, functionNameRight, functionName);
                    	    retval.var = new PHPCallExpression(startIndex, endIndex, null, name, parameters);
                    	  }    
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "base_variable_with_function_calls"

    public static class dollars_return extends TreeRuleReturnScope {
        public int size;
        public String str;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dollars"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2066:1: dollars returns [int size, String str] : ( DOLLAR_T )* ;
    public final TreePHP.dollars_return dollars() throws RecognitionException {
        TreePHP.dollars_return retval = new TreePHP.dollars_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST DOLLAR_T265=null;

        SLAST DOLLAR_T265_tree=null;


          retval.size = 0;
          retval.str = "";

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2071:3: ( ( DOLLAR_T )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2071:5: ( DOLLAR_T )*
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2071:5: ( DOLLAR_T )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==DOLLAR_T) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2071:6: DOLLAR_T
            	    {
            	    _last = (SLAST)input.LT(1);
            	    DOLLAR_T265=(SLAST)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_dollars3616); 
            	    DOLLAR_T265_tree = (SLAST)adaptor.dupNode(DOLLAR_T265);

            	    adaptor.addChild(root_0, DOLLAR_T265_tree);

            	    retval.size++; retval.str += (DOLLAR_T265!=null?DOLLAR_T265.getText():null);

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dollars"

    public static class object_property_return extends TreeRuleReturnScope {
        public String str;
        public Expression expr;
        public SimpleReference simpleRef;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "object_property"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2074:1: object_property returns [String str, Expression expr, SimpleReference simpleRef] : ( ^( VAR dollars IDENTIFIER ) | ^( VAR dollars expression ) | ^( INDEX obj= object_property ( expression )? ) | ^( HASH_INDEX obj= object_property ( expression )? ) );
    public final TreePHP.object_property_return object_property() throws RecognitionException {
        TreePHP.object_property_return retval = new TreePHP.object_property_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST VAR266=null;
        SLAST IDENTIFIER268=null;
        SLAST VAR269=null;
        SLAST INDEX272=null;
        SLAST HASH_INDEX274=null;
        TreePHP.object_property_return obj = null;

        TreePHP.dollars_return dollars267 = null;

        TreePHP.dollars_return dollars270 = null;

        TreePHP.expression_return expression271 = null;

        TreePHP.expression_return expression273 = null;

        TreePHP.expression_return expression275 = null;


        SLAST VAR266_tree=null;
        SLAST IDENTIFIER268_tree=null;
        SLAST VAR269_tree=null;
        SLAST INDEX272_tree=null;
        SLAST HASH_INDEX274_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          SLAST ast = null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2083:3: ( ^( VAR dollars IDENTIFIER ) | ^( VAR dollars expression ) | ^( INDEX obj= object_property ( expression )? ) | ^( HASH_INDEX obj= object_property ( expression )? ) )
            int alt84=4;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2083:5: ^( VAR dollars IDENTIFIER )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    VAR266=(SLAST)match(input,VAR,FOLLOW_VAR_in_object_property3652); 
                    VAR266_tree = (SLAST)adaptor.dupNode(VAR266);

                    root_1 = (SLAST)adaptor.becomeRoot(VAR266_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_dollars_in_object_property3654);
                    dollars267=dollars();

                    state._fsp--;

                    adaptor.addChild(root_1, dollars267.getTree());
                    _last = (SLAST)input.LT(1);
                    IDENTIFIER268=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_object_property3656); 
                    IDENTIFIER268_tree = (SLAST)adaptor.dupNode(IDENTIFIER268);

                    adaptor.addChild(root_1, IDENTIFIER268_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                            int size = (dollars267!=null?dollars267.size:0);
                            
                            retval.str = (IDENTIFIER268!=null?IDENTIFIER268.getText():null);
                            startIndex = ((CommonToken)IDENTIFIER268.token).getStartIndex();
                            endIndex = ((CommonToken)IDENTIFIER268.token).getStopIndex() + 1;

                            if (!(dollars267!=null?dollars267.str:null).equals("")) {
                              retval.str = "$" + (IDENTIFIER268!=null?IDENTIFIER268.getText():null);
                              startIndex--;
                            }
                            
                            VariableReference variableRef = new VariableReference(startIndex, endIndex, retval.str ,PHPVariableKind.LOCAL);
                            retval.expr = variableRef;
                            
                            retval.simpleRef = new SimpleReference(startIndex, endIndex, retval.str);
                            ast = VAR266_tree;
                            
                            if ((dollars267!=null?dollars267.size:0) > 1) {
                              for (int i = 0; i < (dollars267!=null?dollars267.size:0) - 1; i++) {
                    				    retval.expr = new ReflectionVariableReference(startIndex - i - 1, endIndex, retval.expr);       
                    				  }
                            }
                        

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2108:5: ^( VAR dollars expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    VAR269=(SLAST)match(input,VAR,FOLLOW_VAR_in_object_property3670); 
                    VAR269_tree = (SLAST)adaptor.dupNode(VAR269);

                    root_1 = (SLAST)adaptor.becomeRoot(VAR269_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_dollars_in_object_property3672);
                    dollars270=dollars();

                    state._fsp--;

                    adaptor.addChild(root_1, dollars270.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_object_property3674);
                    expression271=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression271.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        startIndex = VAR269.startIndex;
                        endIndex = VAR269.endIndex + 1;
                        retval.expr = new ReflectionVariableReference(startIndex, endIndex, (expression271!=null?expression271.expr:null));
                        ast = VAR269_tree;
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2115:5: ^( INDEX obj= object_property ( expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INDEX272=(SLAST)match(input,INDEX,FOLLOW_INDEX_in_object_property3686); 
                    INDEX272_tree = (SLAST)adaptor.dupNode(INDEX272);

                    root_1 = (SLAST)adaptor.becomeRoot(INDEX272_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_object_property3690);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2115:33: ( expression )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==VAR_DECL||LA82_0==CALL||LA82_0==EXPR||(LA82_0>=SCALAR && LA82_0<=UNARY_EXPR)||LA82_0==REF_T||LA82_0==EQUAL_T||(LA82_0>=OR_T && LA82_0<=CLONE_T)||(LA82_0>=INSTANCEOF_T && LA82_0<=PRINT_T)) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2115:33: expression
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_expression_in_object_property3692);
                            expression273=expression();

                            state._fsp--;

                            adaptor.addChild(root_1, expression273.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        startIndex = INDEX272.startIndex;
                        endIndex = INDEX272.endIndex + 1;
                       
                       
                        Expression varName = (obj!=null?obj.expr:null);
                        Expression index = (expression273!=null?expression273.expr:null);
                        if ((expression273!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expression273.start),
                      input.getTreeAdaptor().getTokenStopIndex(expression273.start))):null) != null) {
                          if(varName.getKind() == ExpressionConstants.E_IDENTIFIER) {
                             retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableReference.VARIABLE_ARRAY);
                          } else {
                             retval.expr = new ReflectionArrayVariableReference(startIndex, endIndex, varName, index, ReflectionArrayVariableReference.VARIABLE_ARRAY);
                          }
                        }
                        else {
                           retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableReference.VARIABLE_ARRAY);
                        }
                        ast = INDEX272_tree;
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2135:5: ^( HASH_INDEX obj= object_property ( expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    HASH_INDEX274=(SLAST)match(input,HASH_INDEX,FOLLOW_HASH_INDEX_in_object_property3705); 
                    HASH_INDEX274_tree = (SLAST)adaptor.dupNode(HASH_INDEX274);

                    root_1 = (SLAST)adaptor.becomeRoot(HASH_INDEX274_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_object_property3709);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2135:38: ( expression )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==VAR_DECL||LA83_0==CALL||LA83_0==EXPR||(LA83_0>=SCALAR && LA83_0<=UNARY_EXPR)||LA83_0==REF_T||LA83_0==EQUAL_T||(LA83_0>=OR_T && LA83_0<=CLONE_T)||(LA83_0>=INSTANCEOF_T && LA83_0<=PRINT_T)) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2135:38: expression
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_expression_in_object_property3711);
                            expression275=expression();

                            state._fsp--;

                            adaptor.addChild(root_1, expression275.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        startIndex = HASH_INDEX274.startIndex;
                        endIndex = HASH_INDEX274.endIndex + 1;
                       
                        if (startIndex == 0 && (expression275!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expression275.start),
                      input.getTreeAdaptor().getTokenStopIndex(expression275.start))):null) != null) {
                           startIndex = (obj!=null?((SLAST)obj.tree):null).startIndex;
                           endIndex = (obj!=null?((SLAST)obj.tree):null).endIndex + (expression275!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expression275.start),
                      input.getTreeAdaptor().getTokenStopIndex(expression275.start))):null).length();
                        }
                        Expression varName = (obj!=null?obj.expr:null);
                        Expression index = (expression275!=null?expression275.expr:null);
                        if ((expression275!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expression275.start),
                      input.getTreeAdaptor().getTokenStopIndex(expression275.start))):null) != null) {
                          if(varName.getKind() == ExpressionConstants.E_IDENTIFIER) {
                             retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableReference.VARIABLE_HASHTABLE);
                          } else {
                             retval.expr = new ReflectionArrayVariableReference(startIndex, endIndex, varName, index, ReflectionArrayVariableReference.VARIABLE_HASHTABLE);
                          }
                        }
                        else {
                           retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableReference.VARIABLE_HASHTABLE);
                        }
                        ast = HASH_INDEX274_tree;
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);


              retval.tree = ((SLAST)retval.start);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "object_property"

    public static class ctor_arguments_return extends TreeRuleReturnScope {
        public PHPCallArgumentsList argumentList;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ctor_arguments"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2161:1: ctor_arguments returns [PHPCallArgumentsList argumentList] : ^( ARGU ( expr_list )? ) ;
    public final TreePHP.ctor_arguments_return ctor_arguments() throws RecognitionException {
        TreePHP.ctor_arguments_return retval = new TreePHP.ctor_arguments_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST ARGU276=null;
        TreePHP.expr_list_return expr_list277 = null;


        SLAST ARGU276_tree=null;


          SLAST ast = null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2168:3: ( ^( ARGU ( expr_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2168:6: ^( ARGU ( expr_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            ARGU276=(SLAST)match(input,ARGU,FOLLOW_ARGU_in_ctor_arguments3751); 
            ARGU276_tree = (SLAST)adaptor.dupNode(ARGU276);

            root_1 = (SLAST)adaptor.becomeRoot(ARGU276_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2168:13: ( expr_list )?
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==VAR_DECL||LA85_0==CALL||LA85_0==EXPR||(LA85_0>=SCALAR && LA85_0<=UNARY_EXPR)||LA85_0==REF_T||LA85_0==EQUAL_T||(LA85_0>=OR_T && LA85_0<=CLONE_T)||(LA85_0>=INSTANCEOF_T && LA85_0<=PRINT_T)) ) {
                    alt85=1;
                }
                switch (alt85) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2168:13: expr_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_expr_list_in_ctor_arguments3753);
                        expr_list277=expr_list();

                        state._fsp--;

                        adaptor.addChild(root_1, expr_list277.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                int startIndex = ARGU276.startIndex + 1;
                int endIndex = ARGU276.endIndex;

            	  retval.argumentList = new PHPCallArgumentsList();
            	  retval.argumentList.setStart(startIndex);
            	  retval.argumentList.setEnd(endIndex);
            	  
            	  if ((expr_list277!=null?expr_list277.exprList:null) != null) {
            	    Iterator iter = (expr_list277!=null?expr_list277.exprList:null).iterator();
            	    while (iter.hasNext()) {
            	      retval.argumentList.addNode((Expression)iter.next());
            	    }
            	  }
            	  ast = ARGU276;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);


              retval.tree = ast;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ctor_arguments"

    public static class pure_variable_return extends TreeRuleReturnScope {
        public String str;
        public Boolean isRef;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pure_variable"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2187:1: pure_variable returns [String str, Boolean isRef] : ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) ;
    public final TreePHP.pure_variable_return pure_variable() throws RecognitionException {
        TreePHP.pure_variable_return retval = new TreePHP.pure_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST VAR_DECL278=null;
        SLAST REF_T279=null;
        SLAST DOLLAR_T280=null;
        SLAST IDENTIFIER281=null;

        SLAST VAR_DECL278_tree=null;
        SLAST REF_T279_tree=null;
        SLAST DOLLAR_T280_tree=null;
        SLAST IDENTIFIER281_tree=null;


          SLAST ast;
          retval.isRef = false;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2195:3: ( ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2195:5: ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            VAR_DECL278=(SLAST)match(input,VAR_DECL,FOLLOW_VAR_DECL_in_pure_variable3789); 
            VAR_DECL278_tree = (SLAST)adaptor.dupNode(VAR_DECL278);

            root_1 = (SLAST)adaptor.becomeRoot(VAR_DECL278_tree, root_1);



            match(input, Token.DOWN, null); 
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2195:16: ( REF_T )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==REF_T) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2195:16: REF_T
                    {
                    _last = (SLAST)input.LT(1);
                    REF_T279=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_pure_variable3791); 
                    REF_T279_tree = (SLAST)adaptor.dupNode(REF_T279);

                    adaptor.addChild(root_1, REF_T279_tree);


                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2195:23: ( DOLLAR_T )+
            int cnt87=0;
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==DOLLAR_T) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2195:23: DOLLAR_T
            	    {
            	    _last = (SLAST)input.LT(1);
            	    DOLLAR_T280=(SLAST)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_pure_variable3794); 
            	    DOLLAR_T280_tree = (SLAST)adaptor.dupNode(DOLLAR_T280);

            	    adaptor.addChild(root_1, DOLLAR_T280_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt87 >= 1 ) break loop87;
                        EarlyExitException eee =
                            new EarlyExitException(87, input);
                        throw eee;
                }
                cnt87++;
            } while (true);

            _last = (SLAST)input.LT(1);
            IDENTIFIER281=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pure_variable3797); 
            IDENTIFIER281_tree = (SLAST)adaptor.dupNode(IDENTIFIER281);

            adaptor.addChild(root_1, IDENTIFIER281_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                if ((REF_T279!=null?REF_T279.getText():null) != null) {
                  retval.isRef = true;
                }
                retval.str = "$" + (IDENTIFIER281!=null?IDENTIFIER281.getText():null);
                ast = VAR_DECL278;
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);


              retval.tree = ast;

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pure_variable"

    public static class scalar_return extends TreeRuleReturnScope {
        public Expression expr;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scalar"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2205:1: scalar returns [Expression expr] : ^( SCALAR constant ) ;
    public final TreePHP.scalar_return scalar() throws RecognitionException {
        TreePHP.scalar_return retval = new TreePHP.scalar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST SCALAR282=null;
        TreePHP.constant_return constant283 = null;


        SLAST SCALAR282_tree=null;


          SLAST ast = null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2212:3: ( ^( SCALAR constant ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2212:5: ^( SCALAR constant )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            SCALAR282=(SLAST)match(input,SCALAR,FOLLOW_SCALAR_in_scalar3830); 
            SCALAR282_tree = (SLAST)adaptor.dupNode(SCALAR282);

            root_1 = (SLAST)adaptor.becomeRoot(SCALAR282_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_constant_in_scalar3832);
            constant283=constant();

            state._fsp--;

            adaptor.addChild(root_1, constant283.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                if ((constant283!=null?constant283.expr:null) != null ) {
                  retval.expr = (constant283!=null?constant283.expr:null);
                }
                else {
                  retval.expr = (constant283!=null?constant283.scalar:null);
                }
                ast = (constant283!=null?((SLAST)constant283.tree):null);
              

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "scalar"

    public static class constant_return extends TreeRuleReturnScope {
        public Scalar scalar;
        public Expression expr;
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constant"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2224:1: constant returns [Scalar scalar, Expression expr] : ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | REALLITERAL | DOUBLELITERRAL | common_scalar | IDENTIFIER | fully_qualified_class_name | HERE_DOC );
    public final TreePHP.constant_return constant() throws RecognitionException {
        TreePHP.constant_return retval = new TreePHP.constant_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST INTLITERAL284=null;
        SLAST FLOATLITERAL285=null;
        SLAST STRINGLITERAL286=null;
        SLAST REALLITERAL287=null;
        SLAST DOUBLELITERRAL288=null;
        SLAST IDENTIFIER290=null;
        SLAST HERE_DOC292=null;
        TreePHP.common_scalar_return common_scalar289 = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name291 = null;


        SLAST INTLITERAL284_tree=null;
        SLAST FLOATLITERAL285_tree=null;
        SLAST STRINGLITERAL286_tree=null;
        SLAST REALLITERAL287_tree=null;
        SLAST DOUBLELITERRAL288_tree=null;
        SLAST IDENTIFIER290_tree=null;
        SLAST HERE_DOC292_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2225:3: ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | REALLITERAL | DOUBLELITERRAL | common_scalar | IDENTIFIER | fully_qualified_class_name | HERE_DOC )
            int alt88=9;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2225:7: INTLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    INTLITERAL284=(SLAST)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_constant3858); 
                    INTLITERAL284_tree = (SLAST)adaptor.dupNode(INTLITERAL284);

                    adaptor.addChild(root_0, INTLITERAL284_tree);


                        CommonToken token = (CommonToken)INTLITERAL284.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        retval.scalar = new Scalar(startIndex, endIndex, (INTLITERAL284!=null?INTLITERAL284.getText():null), Scalar.TYPE_INT);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2232:7: FLOATLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    FLOATLITERAL285=(SLAST)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_constant3870); 
                    FLOATLITERAL285_tree = (SLAST)adaptor.dupNode(FLOATLITERAL285);

                    adaptor.addChild(root_0, FLOATLITERAL285_tree);


                        CommonToken token = (CommonToken)FLOATLITERAL285.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        retval.scalar = new Scalar(startIndex, endIndex, (FLOATLITERAL285!=null?FLOATLITERAL285.getText():null), Scalar.TYPE_REAL);
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2239:7: STRINGLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    STRINGLITERAL286=(SLAST)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_constant3882); 
                    STRINGLITERAL286_tree = (SLAST)adaptor.dupNode(STRINGLITERAL286);

                    adaptor.addChild(root_0, STRINGLITERAL286_tree);


                        CommonToken token = (CommonToken)STRINGLITERAL286.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        retval.scalar = new Scalar(startIndex, endIndex, (STRINGLITERAL286!=null?STRINGLITERAL286.getText():null), Scalar.TYPE_STRING);
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2256:7: REALLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    REALLITERAL287=(SLAST)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_constant3904); 
                    REALLITERAL287_tree = (SLAST)adaptor.dupNode(REALLITERAL287);

                    adaptor.addChild(root_0, REALLITERAL287_tree);


                        CommonToken token = (CommonToken)REALLITERAL287.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        System.out.println("real id:" + startIndex + " " + endIndex);
                        retval.scalar = new Scalar(startIndex, endIndex, (REALLITERAL287!=null?REALLITERAL287.getText():null), Scalar.TYPE_REAL);
                      

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2265:7: DOUBLELITERRAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    DOUBLELITERRAL288=(SLAST)match(input,DOUBLELITERRAL,FOLLOW_DOUBLELITERRAL_in_constant3919); 
                    DOUBLELITERRAL288_tree = (SLAST)adaptor.dupNode(DOUBLELITERRAL288);

                    adaptor.addChild(root_0, DOUBLELITERRAL288_tree);


                        CommonToken token = (CommonToken)DOUBLELITERRAL288.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        retval.scalar = new Scalar(startIndex, endIndex, (DOUBLELITERRAL288!=null?DOUBLELITERRAL288.getText():null), Scalar.TYPE_REAL);
                      

                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2272:7: common_scalar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_common_scalar_in_constant3931);
                    common_scalar289=common_scalar();

                    state._fsp--;

                    adaptor.addChild(root_0, common_scalar289.getTree());

                          CommonToken token = (CommonToken)(common_scalar289!=null?((SLAST)common_scalar289.tree):null).token;
                          int startIndex = token.getStartIndex();
                          int endIndex = token.getStopIndex() + 1;
                          retval.scalar = new Scalar(startIndex, endIndex, (common_scalar289!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(common_scalar289.start),
                      input.getTreeAdaptor().getTokenStopIndex(common_scalar289.start))):null), Scalar.TYPE_SYSTEM);
                      

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2279:7: IDENTIFIER
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    IDENTIFIER290=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant3943); 
                    IDENTIFIER290_tree = (SLAST)adaptor.dupNode(IDENTIFIER290);

                    adaptor.addChild(root_0, IDENTIFIER290_tree);


                          CommonToken token = (CommonToken)IDENTIFIER290.token;
                    	    int startIndex = token.getStartIndex();
                    	    int endIndex = token.getStopIndex() + 1;
                    	    retval.scalar = new Scalar(startIndex, endIndex, (IDENTIFIER290!=null?IDENTIFIER290.getText():null), Scalar.TYPE_STRING);
                      

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2286:7: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_constant3955);
                    fully_qualified_class_name291=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_0, fully_qualified_class_name291.getTree());

                          if ((fully_qualified_class_name291!=null?fully_qualified_class_name291.constant:null) != null) {
                            retval.expr = (fully_qualified_class_name291!=null?fully_qualified_class_name291.constant:null);
                          }
                          else {
                            retval.expr = (fully_qualified_class_name291!=null?fully_qualified_class_name291.type:null);
                          }
                      

                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2295:6: HERE_DOC
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    HERE_DOC292=(SLAST)match(input,HERE_DOC,FOLLOW_HERE_DOC_in_constant3966); 
                    HERE_DOC292_tree = (SLAST)adaptor.dupNode(HERE_DOC292);

                    adaptor.addChild(root_0, HERE_DOC292_tree);


                        CommonToken token = (CommonToken)HERE_DOC292.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex();
                        int index1 = "<<<Heredoc".length() + startIndex + 1;
                        int index2 = (HERE_DOC292!=null?HERE_DOC292.getText():null).lastIndexOf("Heredoc") - "Heredoc;".length();

                        if (index1 < index2) {
                           Scalar scalar = new Scalar(index1, endIndex - 1, (HERE_DOC292!=null?HERE_DOC292.getText():null).substring(index1, index2), Scalar.TYPE_STRING);
                           List list = new LinkedList();
                           list.add(scalar);
                           retval.expr = new Quote(startIndex, endIndex, list, Quote.QT_HEREDOC);
                    	  }
                    	  else {
                    	     retval.expr = new Quote(startIndex, endIndex, new LinkedList(), Quote.QT_HEREDOC);
                    	  }
                      

                    }
                    break;

            }
            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constant"

    public static class common_scalar_return extends TreeRuleReturnScope {
        SLAST tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "common_scalar"
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2315:1: common_scalar : ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' );
    public final TreePHP.common_scalar_return common_scalar() throws RecognitionException {
        TreePHP.common_scalar_return retval = new TreePHP.common_scalar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST set293=null;

        SLAST set293_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:2316:3: ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php53/TreePHP.g:
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            set293=(SLAST)input.LT(1);
            if ( (input.LA(1)>=190 && input.LA(1)<=196) ) {
                input.consume();

                set293_tree = (SLAST)adaptor.dupNode(set293);

                adaptor.addChild(root_0, set293_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (SLAST)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "common_scalar"

    // Delegated rules


    protected DFA64 dfa64 = new DFA64(this);
    protected DFA84 dfa84 = new DFA84(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA64_eotS =
        "\66\uffff";
    static final String DFA64_eofS =
        "\66\uffff";
    static final String DFA64_minS =
        "\1\15\53\uffff\1\15\11\uffff";
    static final String DFA64_maxS =
        "\1\u0093\53\uffff\1\44\11\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
        "\1\47\1\50\1\51\1\52\1\53\1\uffff\1\54\1\55\1\56\1\57\1\60\1\61"+
        "\1\62\1\63\1\64";
    static final String DFA64_specialS =
        "\66\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\55\5\uffff\1\55\1\uffff\1\1\16\uffff\1\56\1\60\1\52\1\51"+
            "\1\50\1\27\22\uffff\1\26\32\uffff\1\5\15\uffff\1\2\1\3\1\4\1"+
            "\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
            "\1\23\1\24\1\25\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
            "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\63\1\62\4\uffff\1\53\1"+
            "\54\1\57\1\61\1\64\1\65",
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
            "\1\55\5\uffff\1\55\20\uffff\1\56",
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

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "1246:1: expression returns [Expression expr] : ( ^( EXPR etop= expression ) | ^( OR_T e1= expression e2= expression ) | ^( XOR_T e1= expression e2= expression ) | ^( AND_T e1= expression e2= expression ) | ^( EQUAL_T e1= expression e2= expression ) | ^( PLUS_EQ e1= expression e2= expression ) | ^( MINUS_EQ e1= expression e2= expression ) | ^( MUL_EQ e1= expression e2= expression ) | ^( DIV_EQ e1= expression e2= expression ) | ^( DOT_EQ e1= expression e2= expression ) | ^( PERCENT_EQ e1= expression e2= expression ) | ^( BIT_AND_EQ e1= expression e2= expression ) | ^( BIT_OR_EQ e1= expression e2= expression ) | ^( POWER_EQ e1= expression e2= expression ) | ^( LMOVE_EQ e1= expression e2= expression ) | ^( RMOVE_EQ e1= expression e2= expression ) | ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) ) | ^( LOGICAL_OR_T e1= expression e2= expression ) | ^( LOGICAL_AND_T e1= expression e2= expression ) | ^( BIT_OR_T e1= expression e2= expression ) | ^( POWER_T e1= expression e2= expression ) | ^( REF_T e1= expression e2= expression ) | ^( UNARY_EXPR unary_symbol_list e= expression ) | ^( DOT_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( LT_T e1= expression e2= expression ) | ^( MT_T e1= expression e2= expression ) | ^( LE_T e1= expression e2= expression ) | ^( ME_T e1= expression e2= expression ) | ^( LSHIFT_T e1= expression e2= expression ) | ^( RSHIFT_T e1= expression e2= expression ) | ^( PLUS_T e1= expression e2= expression ) | ^( MINUS_T e1= expression e2= expression ) | ^( MUL_T e1= expression e2= expression ) | ^( DIV_T e1= expression e2= expression ) | ^( PERCENT_T e1= expression e2= expression ) | ^( CAST_EXPR cast_option e= expression ) | ^( POSTFIX_EXPR e= expression plus_minus ) | ^( PREFIX_EXPR ( plus_minus )+ e= expression ) | ^( INSTANCEOF_T e= expression class_name_reference ) | ( AT_T )? variable | ( AT_T )? scalar | list_decl | ^( ARRAY_DECL ( array_pair_list )? ) | ^( NEW_T class_name_reference ) | ^( CLONE_T variable ) | ^( UNSET_T variable_list ) | BACKTRICKLITERAL | ^( PRINT_T e= expression ) );";
        }
    }
    static final String DFA84_eotS =
        "\10\uffff";
    static final String DFA84_eofS =
        "\10\uffff";
    static final String DFA84_minS =
        "\1\21\1\2\2\uffff\2\15\2\uffff";
    static final String DFA84_maxS =
        "\1\53\1\2\2\uffff\2\u0097\2\uffff";
    static final String DFA84_acceptS =
        "\2\uffff\1\3\1\4\2\uffff\1\2\1\1";
    static final String DFA84_specialS =
        "\10\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\2\30\uffff\1\1\1\3",
            "\1\4",
            "",
            "",
            "\1\6\5\uffff\1\6\1\uffff\1\6\16\uffff\6\6\13\uffff\1\7\6\uffff"+
            "\1\6\32\uffff\1\6\15\uffff\45\6\4\uffff\6\6\3\uffff\1\5",
            "\1\6\5\uffff\1\6\1\uffff\1\6\16\uffff\6\6\13\uffff\1\7\6\uffff"+
            "\1\6\32\uffff\1\6\15\uffff\45\6\4\uffff\6\6\3\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA84_eot = DFA.unpackEncodedString(DFA84_eotS);
    static final short[] DFA84_eof = DFA.unpackEncodedString(DFA84_eofS);
    static final char[] DFA84_min = DFA.unpackEncodedStringToUnsignedChars(DFA84_minS);
    static final char[] DFA84_max = DFA.unpackEncodedStringToUnsignedChars(DFA84_maxS);
    static final short[] DFA84_accept = DFA.unpackEncodedString(DFA84_acceptS);
    static final short[] DFA84_special = DFA.unpackEncodedString(DFA84_specialS);
    static final short[][] DFA84_transition;

    static {
        int numStates = DFA84_transitionS.length;
        DFA84_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA84_transition[i] = DFA.unpackEncodedString(DFA84_transitionS[i]);
        }
    }

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = DFA84_eot;
            this.eof = DFA84_eof;
            this.min = DFA84_min;
            this.max = DFA84_max;
            this.accept = DFA84_accept;
            this.special = DFA84_special;
            this.transition = DFA84_transition;
        }
        public String getDescription() {
            return "2074:1: object_property returns [String str, Expression expr, SimpleReference simpleRef] : ( ^( VAR dollars IDENTIFIER ) | ^( VAR dollars expression ) | ^( INDEX obj= object_property ( expression )? ) | ^( HASH_INDEX obj= object_property ( expression )? ) );";
        }
    }
    static final String DFA88_eotS =
        "\12\uffff";
    static final String DFA88_eofS =
        "\12\uffff";
    static final String DFA88_minS =
        "\1\65\11\uffff";
    static final String DFA88_maxS =
        "\1\u00c4\11\uffff";
    static final String DFA88_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA88_specialS =
        "\12\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\7\35\uffff\1\3\1\uffff\1\10\102\uffff\1\1\1\2\1\5\1\4\1\11"+
            "\41\uffff\7\6",
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

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "2224:1: constant returns [Scalar scalar, Expression expr] : ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | REALLITERAL | DOUBLELITERRAL | common_scalar | IDENTIFIER | fully_qualified_class_name | HERE_DOC );";
        }
    }
 

    public static final BitSet FOLLOW_ModuleDeclaration_in_php_source58 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_top_statement_list_in_php_source60 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_top_statement_in_top_statement_list79 = new BitSet(new long[]{0x0411000000004202L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_statement_in_top_statement93 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_statement_in_top_statement103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_declaration_statement_in_top_statement113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_halt_compiler_statement_in_top_statement123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_T_in_top_statement130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_top_statement132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inner_statement_in_inner_statement_list160 = new BitSet(new long[]{0x0410000000004202L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_statement_in_inner_statement182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_statement_in_inner_statement192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_declaration_statement_in_inner_statement202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_halt_compiler_statement_in_inner_statement212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_halt_compiler_statement227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_T_in_class_declaration_statement247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_entr_type_in_class_declaration_statement249 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement252 = new BitSet(new long[]{0x00C0000000000088L});
    public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_class_declaration_statement268 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPLEMENTS_T_in_class_declaration_statement275 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_BODY_in_class_declaration_statement290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_statement_list_in_class_declaration_statement292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_T_in_class_declaration_statement309 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement311 = new BitSet(new long[]{0x0040000000000088L});
    public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement317 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_BODY_in_class_declaration_statement336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_statement_list_in_class_declaration_statement338 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_class_entr_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_statement_in_class_statement_list384 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_FIELD_DECL_in_class_statement409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_modifiers_in_class_statement413 = new BitSet(new long[]{0x0000000000002000L,0x0000000000800000L});
    public static final BitSet FOLLOW_static_var_element_in_class_statement415 = new BitSet(new long[]{0x0000000000002008L,0x0000000000800000L});
    public static final BitSet FOLLOW_METHOD_DECL_in_class_statement430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_class_statement432 = new BitSet(new long[]{0x1020000000000000L});
    public static final BitSet FOLLOW_REF_T_in_class_statement434 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_statement437 = new BitSet(new long[]{0x0000000800001800L});
    public static final BitSet FOLLOW_parameter_list_in_class_statement451 = new BitSet(new long[]{0x0000000800001000L});
    public static final BitSet FOLLOW_block_in_class_statement467 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EMPTYSTATEMENT_in_class_statement486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_DECL_in_class_statement509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONST_T_in_class_statement513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_directive_in_class_statement515 = new BitSet(new long[]{0x0000000000000008L,0x0000000000800000L});
    public static final BitSet FOLLOW_METHOD_DECL_in_function_declaration_statement541 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REF_T_in_function_declaration_statement543 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration_statement546 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_parameter_list_in_function_declaration_statement555 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_function_declaration_statement568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inner_statement_list_in_block605 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATEMENT_in_statement634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_topStatement_in_statement636 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_topStatement667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stat_in_topStatement678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_T_in_topStatement689 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_topStatement692 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement696 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_while_statement_in_topStatement699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_T_in_topStatement714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_topStatement717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement721 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_topStatement724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_T_in_topStatement736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_topStatement740 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CONDITION_in_topStatement744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_topStatement748 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ITERATE_in_topStatement753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_topStatement757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_for_statement_in_topStatement763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_T_in_topStatement775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_topStatement778 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement782 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_switch_case_list_in_topStatement785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_T_in_topStatement797 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_T_in_topStatement812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement816 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_T_in_topStatement829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLOBAL_T_in_topStatement846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_list_in_topStatement848 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_T_in_topStatement860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_static_var_list_in_topStatement862 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ECHO_T_in_topStatement874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_topStatement876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EMPTYSTATEMENT_in_topStatement888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_topStatement901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_topStatement912 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AS_T_in_topStatement915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement919 = new BitSet(new long[]{0x1000000000082000L});
    public static final BitSet FOLLOW_foreach_variable_in_topStatement923 = new BitSet(new long[]{0x1000000000082008L});
    public static final BitSet FOLLOW_foreach_variable_in_topStatement927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_foreach_statement_in_topStatement931 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARE_T_in_topStatement944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_in_topStatement946 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_declare_statement_in_topStatement948 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_T_in_topStatement961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_topStatement963 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_catch_branch_list_in_topStatement965 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_T_in_topStatement977 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement981 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_USE_T_in_topStatement993 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scalar_in_topStatement995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_USE_PARETHESIS_T_in_topStatement1007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scalar_in_topStatement1009 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INCLUDE_T_in_topStatement1021 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement1025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INCLUDE_ONCE_T_in_topStatement1038 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement1042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUIRE_T_in_topStatement1055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement1059 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUIRE_ONCE_T_in_topStatement1072 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement1076 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REF_T_in_foreach_variable1107 = new BitSet(new long[]{0x1000000000082000L});
    public static final BitSet FOLLOW_variable_in_foreach_variable1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_use_filename0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_list1170 = new BitSet(new long[]{0x1000000000082002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1208 = new BitSet(new long[]{0x0020000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name1235 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name1239 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name1241 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name1255 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_var_element_in_static_var_list1291 = new BitSet(new long[]{0x0000000000002002L,0x0000000000800000L});
    public static final BitSet FOLLOW_pure_variable_in_static_var_element1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_T_in_static_var_element1320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pure_variable_in_static_var_element1322 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_scalar_in_static_var_element1324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_T_in_if_stat1358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_if_stat1362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_if_stat1364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inner_statement_list_in_if_stat1380 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000000L});
    public static final BitSet FOLLOW_else_if_stat_in_if_stat1389 = new BitSet(new long[]{0x0000000000000008L,0x0000000006000000L});
    public static final BitSet FOLLOW_ELSE_T_in_if_stat1394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_if_stat1396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSEIF_T_in_else_if_stat1426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_else_if_stat1429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_else_if_stat1431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inner_statement_list_in_else_if_stat1434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_case_list_in_switch_case_list1468 = new BitSet(new long[]{0x0000000000000002L,0x00000000C0000000L});
    public static final BitSet FOLLOW_CASE_T_in_case_list1487 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_case_list1491 = new BitSet(new long[]{0x0410000000004208L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_inner_statement_list_in_case_list1493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_T_in_case_list1508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inner_statement_list_in_case_list1510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_catch_branch_in_catch_branch_list1544 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_CATCH_T_in_catch_branch1566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_catch_branch1568 = new BitSet(new long[]{0x1000000000082000L});
    public static final BitSet FOLLOW_variable_in_catch_branch1570 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_catch_branch1572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inner_statement_list_in_for_statement1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_statement_list_in_while_statement1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_statement_list_in_foreach_statement1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_declare_statement1668 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inner_statement_list_in_declare_statement1670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parameter_in_parameter_list1706 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_PARAMETER_in_parameter1727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_parameter1731 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_type_in_parameter1733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONST_T_in_parameter1738 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pure_variable_in_parameter1741 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_scalar_in_parameter1743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_parameter_type1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_option_in_parameter_type1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_variable_modifiers1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_variable_modifiers1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_modifier1830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x001D800000000000L});
    public static final BitSet FOLLOW_179_in_modifier1838 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x001D800000000000L});
    public static final BitSet FOLLOW_180_in_modifier1846 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x001D800000000000L});
    public static final BitSet FOLLOW_STATIC_T_in_modifier1854 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x001D800000000000L});
    public static final BitSet FOLLOW_175_in_modifier1863 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x001D800000000000L});
    public static final BitSet FOLLOW_176_in_modifier1872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L,0x001D800000000000L});
    public static final BitSet FOLLOW_EQUAL_T_in_directive1904 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_directive1906 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_directive1908 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expr_list1945 = new BitSet(new long[]{0x100003F000282002L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_EXPR_in_expression1979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_T_in_expression1995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1999 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_T_in_expression2015 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2019 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_T_in_expression2035 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2039 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2043 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_T_in_expression2055 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2059 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_EQ_in_expression2076 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2080 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2084 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_EQ_in_expression2096 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2100 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_EQ_in_expression2116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2120 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_EQ_in_expression2136 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2140 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2144 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_EQ_in_expression2156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2160 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PERCENT_EQ_in_expression2176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2180 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_AND_EQ_in_expression2196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2200 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_OR_EQ_in_expression2216 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2220 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POWER_EQ_in_expression2236 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2240 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LMOVE_EQ_in_expression2256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2260 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RMOVE_EQ_in_expression2276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2280 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_T_in_expression2296 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2300 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_COLON_T_in_expression2303 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2307 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_T_in_expression2326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2330 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_T_in_expression2346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2350 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2354 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_OR_T_in_expression2366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2370 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2374 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POWER_T_in_expression2386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2390 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2394 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REF_T_in_expression2406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2410 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2414 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_EXPR_in_expression2426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unary_symbol_list_in_expression2428 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2432 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_T_in_expression2444 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2448 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2452 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_EQUAL_T_in_expression2464 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2468 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_T_in_expression2484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2488 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2492 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_EQUAL_EQUAL_T_in_expression2504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2508 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2512 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_EQUAL_T_in_expression2524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2528 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2532 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_T_in_expression2544 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2548 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2552 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MT_T_in_expression2564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2568 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2572 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_T_in_expression2584 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2588 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2592 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ME_T_in_expression2604 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2608 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LSHIFT_T_in_expression2624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2628 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2632 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RSHIFT_T_in_expression2644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2648 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2652 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_T_in_expression2664 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2668 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_T_in_expression2684 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2688 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_T_in_expression2704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2708 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_T_in_expression2724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2728 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PERCENT_T_in_expression2744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2748 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2752 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expression2764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cast_option_in_expression2766 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_expression2770 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSTFIX_EXPR_in_expression2794 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_plus_minus_in_expression2800 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_EXPR_in_expression2812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_plus_minus_in_expression2814 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FF3FFL});
    public static final BitSet FOLLOW_expression_in_expression2819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_T_in_expression2831 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2835 = new BitSet(new long[]{0x0020000000082000L,0x0000000000200000L});
    public static final BitSet FOLLOW_class_name_reference_in_expression2837 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_T_in_expression2848 = new BitSet(new long[]{0x1000000000082000L});
    public static final BitSet FOLLOW_variable_in_expression2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_T_in_expression2861 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_scalar_in_expression2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_decl_in_expression2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECL_in_expression2885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_array_pair_list_in_expression2887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_T_in_expression2900 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_name_reference_in_expression2902 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLONE_T_in_expression2917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_expression2919 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNSET_T_in_expression2932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_list_in_expression2934 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BACKTRICKLITERAL_in_expression2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_T_in_expression2957 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_unary_symbol_in_unary_symbol_list2995 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000000000C18L});
    public static final BitSet FOLLOW_PLUS_T_in_unary_symbol3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_T_in_unary_symbol3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_T_in_unary_symbol3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDA_T_in_unary_symbol3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXC_NOT_T_in_unary_symbol3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_plus_minus0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_cast_option3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_cast_option3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_cast_option3107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_cast_option3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_cast_option3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_cast_option3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_cast_option3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_cast_option3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_cast_option3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSET_T_in_cast_option3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLONE_T_in_cast_option3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_name_reference_in_class_name_reference3229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_class_name_reference3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference3262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_dynamic_name_reference3274 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dynamic_name_reference_in_dynamic_name_reference3278 = new BitSet(new long[]{0x00000C0000020000L});
    public static final BitSet FOLLOW_object_property_in_dynamic_name_reference3282 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_ctor_arguments_in_dynamic_name_reference3284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_T_in_list_decl3308 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignment_list_in_list_decl3310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_element_in_assignment_list3342 = new BitSet(new long[]{0x1000000000082002L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_variable_in_assignment_element3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_decl_in_assignment_element3370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_pair_element_in_array_pair_list3402 = new BitSet(new long[]{0x100003F000282002L,0xFFFFFFE000800400L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_ARROW_T_in_array_pair_element3423 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_array_pair_element3427 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_array_pair_element3431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_array_pair_element3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_temp_in_variable3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_variable_with_function_calls_in_variable_temp3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_variable_temp3514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_temp_in_variable_temp3518 = new BitSet(new long[]{0x00000C0000020000L});
    public static final BitSet FOLLOW_object_property_in_variable_temp3522 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_ctor_arguments_in_variable_temp3524 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECL_in_base_variable_with_function_calls3550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3552 = new BitSet(new long[]{0x00000C0000020000L});
    public static final BitSet FOLLOW_object_property_in_base_variable_with_function_calls3557 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls3559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_base_variable_with_function_calls3580 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3582 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls3584 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOLLAR_T_in_dollars3616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_VAR_in_object_property3652 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dollars_in_object_property3654 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_object_property3656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_object_property3670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dollars_in_object_property3672 = new BitSet(new long[]{0x100003F000282000L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_object_property3674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_object_property3686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_property_in_object_property3690 = new BitSet(new long[]{0x100003F000282008L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_object_property3692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HASH_INDEX_in_object_property3705 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_property_in_object_property3709 = new BitSet(new long[]{0x100003F000282008L,0xFFFFFFE000800000L,0x00000000000FC3FFL});
    public static final BitSet FOLLOW_expression_in_object_property3711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGU_in_ctor_arguments3751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_ctor_arguments3753 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECL_in_pure_variable3789 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REF_T_in_pure_variable3791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_DOLLAR_T_in_pure_variable3794 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pure_variable3797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCALAR_in_scalar3830 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_scalar3832 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_constant3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_constant3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_constant3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_constant3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERRAL_in_constant3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_common_scalar_in_constant3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_constant3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HERE_DOC_in_constant3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_common_scalar0 = new BitSet(new long[]{0x0000000000000002L});

}