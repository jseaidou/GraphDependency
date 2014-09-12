// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g 2009-08-10 21:24:36

  package org.eclipse.php.internal.core.compiler.ast.parser.php4;
  
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
    public static final int NOT_EQUAL_EQUAL_T=123;
    public static final int CAST_EXPR=40;
    public static final int AT_T=142;
    public static final int FloatSuffix=164;
    public static final int NonIntegerNumber=163;
    public static final int AND_T=102;
    public static final int RIGHT_BRACKET=56;
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
    public static final int BIT_AND_EQ=109;
    public static final int INCLUDE_ONCE_T=79;
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
    public static final int FIELD_DECL=8;
    public static final int PREFIX_EXPR=38;
    public static final int LIST_T=143;
    public static final int CLASS_BODY=7;
    public static final int LIST_DECL=23;
    public static final int BACKTRICKLITERAL=145;
    public static final int QUOTE_STRING=83;
    public static final int ITERATE=28;
    public static final int LEFT_PARETHESIS=48;
    public static final int RETURN_T=67;
    public static final int HEREDOC=156;
    public static final int DoubleSuffix=165;
    public static final int ENDWHILE_T=97;
    public static final int STRINGLITERAL=82;
    public static final int BLOCK=12;
    public static final int EXTENDS_T=53;
    public static final int CONTINUE_T=66;
    public static final int PRINT_T=146;
    public static final int FLOATLITERAL=152;
    public static final int ENDSWITCH_T=92;
    public static final int CAST=26;
    public static final int PREFIX=32;
    public static final int XOR_T=101;
    public static final int TRY_T=75;
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
    public static final int ASSIGN=22;
    public static final int RIGHT_PARETHESIS=49;
    public static final int EXC_NOT_T=138;
    public static final int CASE_T=93;
    public static final int BREAK_T=65;
    public static final int DOT_EQ=107;
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
    public String getGrammarFileName() { return "/home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g"; }


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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:182:1: php_source : ^( ModuleDeclaration ( top_statement_list )? ) ;
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
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:183:3: ( ^( ModuleDeclaration ( top_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:183:6: ^( ModuleDeclaration ( top_statement_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            ModuleDeclaration1=(SLAST)match(input,ModuleDeclaration,FOLLOW_ModuleDeclaration_in_php_source54); 
            ModuleDeclaration1_tree = (SLAST)adaptor.dupNode(ModuleDeclaration1);

            root_1 = (SLAST)adaptor.becomeRoot(ModuleDeclaration1_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:183:26: ( top_statement_list )?
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==METHOD_DECL||LA1_0==STATEMENT||LA1_0==CLASS_T||LA1_0==INTERFACE_T||LA1_0==173) ) {
                    alt1=1;
                }
                switch (alt1) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:183:26: top_statement_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_top_statement_list_in_php_source56);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:198:1: top_statement_list : ( top_statement )+ ;
    public final TreePHP.top_statement_list_return top_statement_list() throws RecognitionException {
        TreePHP.top_statement_list_return retval = new TreePHP.top_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.top_statement_return top_statement3 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:199:3: ( ( top_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:199:5: ( top_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:199:5: ( top_statement )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==METHOD_DECL||LA2_0==STATEMENT||LA2_0==CLASS_T||LA2_0==INTERFACE_T||LA2_0==173) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:199:5: top_statement
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_top_statement_in_top_statement_list75);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:202:1: top_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement );
    public final TreePHP.top_statement_return top_statement() throws RecognitionException {
        TreePHP.top_statement_return retval = new TreePHP.top_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.statement_return statement4 = null;

        TreePHP.function_declaration_statement_return function_declaration_statement5 = null;

        TreePHP.class_declaration_statement_return class_declaration_statement6 = null;

        TreePHP.halt_compiler_statement_return halt_compiler_statement7 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:203:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement )
            int alt3=4;
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
            case 173:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:203:5: statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_statement_in_top_statement89);
                    statement4=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement4.getTree());

                        Statement stat = (statement4!=null?statement4.stat:null);
                        parser.addStatement(stat);
                    //    System.out.println("state:" + stat);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:209:5: function_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_function_declaration_statement_in_top_statement99);
                    function_declaration_statement5=function_declaration_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration_statement5.getTree());

                        parser.addStatement((function_declaration_statement5!=null?function_declaration_statement5.stat:null));
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:213:5: class_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_class_declaration_statement_in_top_statement109);
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:228:5: halt_compiler_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_halt_compiler_statement_in_top_statement119);
                    halt_compiler_statement7=halt_compiler_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, halt_compiler_statement7.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:231:1: inner_statement_list returns [List innerStatementList] : ( inner_statement )+ ;
    public final TreePHP.inner_statement_list_return inner_statement_list() throws RecognitionException {
        inner_statement_list_stack.push(new inner_statement_list_scope());
        TreePHP.inner_statement_list_return retval = new TreePHP.inner_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.inner_statement_return inner_statement8 = null;




          ((inner_statement_list_scope)inner_statement_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:238:3: ( ( inner_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:238:5: ( inner_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:238:5: ( inner_statement )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==METHOD_DECL||LA4_0==STATEMENT||LA4_0==CLASS_T||LA4_0==INTERFACE_T||LA4_0==173) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:238:6: inner_statement
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_inner_statement_in_inner_statement_list146);
            	    inner_statement8=inner_statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, inner_statement8.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:244:1: inner_statement : ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement );
    public final TreePHP.inner_statement_return inner_statement() throws RecognitionException {
        TreePHP.inner_statement_return retval = new TreePHP.inner_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.statement_return statement9 = null;

        TreePHP.function_declaration_statement_return function_declaration_statement10 = null;

        TreePHP.class_declaration_statement_return class_declaration_statement11 = null;

        TreePHP.halt_compiler_statement_return halt_compiler_statement12 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:245:3: ( statement | function_declaration_statement | class_declaration_statement | halt_compiler_statement )
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
            case 173:
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:245:5: statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_statement_in_inner_statement168);
                    statement9=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement9.getTree());

                        if ((statement9!=null?statement9.stat:null) != null) {
                          ((inner_statement_list_scope)inner_statement_list_stack.peek()).list.add((statement9!=null?statement9.stat:null));
                          System.out.println("inner state: " + (statement9!=null?statement9.stat:null));
                        }
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:252:5: function_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_function_declaration_statement_in_inner_statement178);
                    function_declaration_statement10=function_declaration_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, function_declaration_statement10.getTree());

                        if ((function_declaration_statement10!=null?function_declaration_statement10.stat:null) != null) {
                          ((inner_statement_list_scope)inner_statement_list_stack.peek()).list.add((function_declaration_statement10!=null?function_declaration_statement10.stat:null));
                        }  
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:258:5: class_declaration_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_class_declaration_statement_in_inner_statement188);
                    class_declaration_statement11=class_declaration_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, class_declaration_statement11.getTree());

                        if ((class_declaration_statement11!=null?class_declaration_statement11.classDeclaration:null) != null) {
                          ((inner_statement_list_scope)inner_statement_list_stack.peek()).list.add((class_declaration_statement11!=null?class_declaration_statement11.classDeclaration:null));
                        } 
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:264:5: halt_compiler_statement
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_halt_compiler_statement_in_inner_statement198);
                    halt_compiler_statement12=halt_compiler_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, halt_compiler_statement12.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:267:1: halt_compiler_statement : '__halt_compiler' ;
    public final TreePHP.halt_compiler_statement_return halt_compiler_statement() throws RecognitionException {
        TreePHP.halt_compiler_statement_return retval = new TreePHP.halt_compiler_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST string_literal13=null;

        SLAST string_literal13_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:268:3: ( '__halt_compiler' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:268:5: '__halt_compiler'
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            string_literal13=(SLAST)match(input,173,FOLLOW_173_in_halt_compiler_statement213); 
            string_literal13_tree = (SLAST)adaptor.dupNode(string_literal13);

            adaptor.addChild(root_0, string_literal13_tree);


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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:271:1: class_declaration_statement returns [ClassDeclaration classDeclaration, InterfaceDeclaration interfaceDeclaration] : ( ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) | ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) );
    public final TreePHP.class_declaration_statement_return class_declaration_statement() throws RecognitionException {
        TreePHP.class_declaration_statement_return retval = new TreePHP.class_declaration_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CLASS_T14=null;
        SLAST IDENTIFIER16=null;
        SLAST EXTENDS_T17=null;
        SLAST IMPLEMENTS_T19=null;
        SLAST CLASS_BODY21=null;
        SLAST INTERFACE_T23=null;
        SLAST IDENTIFIER24=null;
        SLAST EXTENDS_T25=null;
        SLAST CLASS_BODY27=null;
        TreePHP.class_entr_type_return class_entr_type15 = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name18 = null;

        TreePHP.fully_qualified_class_name_list_return fully_qualified_class_name_list20 = null;

        TreePHP.class_statement_list_return class_statement_list22 = null;

        TreePHP.fully_qualified_class_name_list_return fully_qualified_class_name_list26 = null;

        TreePHP.class_statement_list_return class_statement_list28 = null;


        SLAST CLASS_T14_tree=null;
        SLAST IDENTIFIER16_tree=null;
        SLAST EXTENDS_T17_tree=null;
        SLAST IMPLEMENTS_T19_tree=null;
        SLAST CLASS_BODY21_tree=null;
        SLAST INTERFACE_T23_tree=null;
        SLAST IDENTIFIER24_tree=null;
        SLAST EXTENDS_T25_tree=null;
        SLAST CLASS_BODY27_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:272:3: ( ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) | ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? ) )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:272:5: ^( CLASS_T ( class_entr_type )? IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name ) )? ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CLASS_T14=(SLAST)match(input,CLASS_T,FOLLOW_CLASS_T_in_class_declaration_statement233); 
                    CLASS_T14_tree = (SLAST)adaptor.dupNode(CLASS_T14);

                    root_1 = (SLAST)adaptor.becomeRoot(CLASS_T14_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:272:15: ( class_entr_type )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=174 && LA6_0<=175)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:272:15: class_entr_type
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_class_entr_type_in_class_declaration_statement235);
                            class_entr_type15=class_entr_type();

                            state._fsp--;

                            adaptor.addChild(root_1, class_entr_type15.getTree());

                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    IDENTIFIER16=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement238); 
                    IDENTIFIER16_tree = (SLAST)adaptor.dupNode(IDENTIFIER16);

                    adaptor.addChild(root_1, IDENTIFIER16_tree);


                          TreePHP.ModifierDocPair modifier = new ModifierDocPair(Modifiers.AccDefault, null);
                          int startIndex = CLASS_T14.startIndex;
                          int endIndex = CLASS_T14.endIndex + 1;
                          if ((class_entr_type15!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(class_entr_type15.start),
                      input.getTreeAdaptor().getTokenStopIndex(class_entr_type15.start))):null) != null) {
                              if ((class_entr_type15!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(class_entr_type15.start),
                      input.getTreeAdaptor().getTokenStopIndex(class_entr_type15.start))):null).equals("abstract")) {
                                modifier = new ModifierDocPair(Modifiers.AccAbstract, null);
                              }
                          }
                          
                          CommonToken token = (CommonToken)IDENTIFIER16.token;
                          int classNameLeft = token.getStartIndex();
                          int classNameRight = token.getStopIndex() + 1;
                          String className = (IDENTIFIER16!=null?IDENTIFIER16.getText():null);
                          
                          retval.classDeclaration = new ClassDeclaration(startIndex ,endIndex, classNameLeft, classNameRight, modifier.modifier, className, null, null, new Block(classNameRight,classNameRight,null), null);
                          parser.addDeclarationStatement(retval.classDeclaration);
                          parser.declarations.push(retval.classDeclaration);
                      
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:293:4: ( ^( EXTENDS_T fully_qualified_class_name ) )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_T) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:293:5: ^( EXTENDS_T fully_qualified_class_name )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            EXTENDS_T17=(SLAST)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement252); 
                            EXTENDS_T17_tree = (SLAST)adaptor.dupNode(EXTENDS_T17);

                            root_2 = (SLAST)adaptor.becomeRoot(EXTENDS_T17_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_fully_qualified_class_name_in_class_declaration_statement254);
                            fully_qualified_class_name18=fully_qualified_class_name();

                            state._fsp--;

                            adaptor.addChild(root_2, fully_qualified_class_name18.getTree());

                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:293:47: ( ^( IMPLEMENTS_T fully_qualified_class_name_list ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_T) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:293:48: ^( IMPLEMENTS_T fully_qualified_class_name_list )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            IMPLEMENTS_T19=(SLAST)match(input,IMPLEMENTS_T,FOLLOW_IMPLEMENTS_T_in_class_declaration_statement261); 
                            IMPLEMENTS_T19_tree = (SLAST)adaptor.dupNode(IMPLEMENTS_T19);

                            root_2 = (SLAST)adaptor.becomeRoot(IMPLEMENTS_T19_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement263);
                            fully_qualified_class_name_list20=fully_qualified_class_name_list();

                            state._fsp--;

                            adaptor.addChild(root_2, fully_qualified_class_name_list20.getTree());

                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }


                            }
                            break;

                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:294:7: ( ^( CLASS_BODY class_statement_list ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==CLASS_BODY) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:294:8: ^( CLASS_BODY class_statement_list )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            CLASS_BODY21=(SLAST)match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_class_declaration_statement276); 
                            CLASS_BODY21_tree = (SLAST)adaptor.dupNode(CLASS_BODY21);

                            root_2 = (SLAST)adaptor.becomeRoot(CLASS_BODY21_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_class_statement_list_in_class_declaration_statement278);
                            class_statement_list22=class_statement_list();

                            state._fsp--;

                            adaptor.addChild(root_2, class_statement_list22.getTree());

                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }


                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          
                          TreePHP.ModifierDocPair modifier = new ModifierDocPair(Modifiers.AccDefault, null);
                          int startIndex = CLASS_T14.startIndex;
                          int endIndex = CLASS_T14.endIndex + 1;
                          if ((class_entr_type15!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(class_entr_type15.start),
                      input.getTreeAdaptor().getTokenStopIndex(class_entr_type15.start))):null) != null) {
                              if ((class_entr_type15!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(class_entr_type15.start),
                      input.getTreeAdaptor().getTokenStopIndex(class_entr_type15.start))):null).equals("abstract")) {
                                modifier = new ModifierDocPair(Modifiers.AccAbstract, null);
                              }
                          }
                          
                          CommonToken token = (CommonToken)IDENTIFIER16.token;
                          int classNameLeft = token.getStartIndex();
                          int classNameRight = token.getStopIndex() + 1;
                          String className = (IDENTIFIER16!=null?IDENTIFIER16.getText():null);
                            
                          TypeReference superClass = null;
                          int superClassLeft = 0;
                          int superClassRight = 0;
                          if ((fully_qualified_class_name18!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(fully_qualified_class_name18.start),
                      input.getTreeAdaptor().getTokenStopIndex(fully_qualified_class_name18.start))):null) != null) {
                              superClassLeft = ((CommonToken)(fully_qualified_class_name18!=null?((SLAST)fully_qualified_class_name18.tree):null).token).getStartIndex();
                              superClassRight = ((CommonToken)(fully_qualified_class_name18!=null?((SLAST)fully_qualified_class_name18.tree):null).token).getStopIndex() + 1;
                              superClass = (fully_qualified_class_name18!=null?fully_qualified_class_name18.type:null);
                          }
                          
                          List interfaces = null;
                          int interfacesLeft = 0;
                          int interfacesRight = 0;
                          if ((fully_qualified_class_name_list20!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(fully_qualified_class_name_list20.start),
                      input.getTreeAdaptor().getTokenStopIndex(fully_qualified_class_name_list20.start))):null) != null) {
                              interfacesLeft = ((CommonToken)(fully_qualified_class_name_list20!=null?((SLAST)fully_qualified_class_name_list20.tree):null).token).getStartIndex();
                              interfacesRight = ((CommonToken)(fully_qualified_class_name_list20!=null?((SLAST)fully_qualified_class_name_list20.tree):null).token).getStopIndex() + 1;
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:336:5: ^( INTERFACE_T IDENTIFIER ( ^( EXTENDS_T fully_qualified_class_name_list ) )? ( ^( CLASS_BODY class_statement_list ) )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INTERFACE_T23=(SLAST)match(input,INTERFACE_T,FOLLOW_INTERFACE_T_in_class_declaration_statement295); 
                    INTERFACE_T23_tree = (SLAST)adaptor.dupNode(INTERFACE_T23);

                    root_1 = (SLAST)adaptor.becomeRoot(INTERFACE_T23_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    IDENTIFIER24=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_declaration_statement297); 
                    IDENTIFIER24_tree = (SLAST)adaptor.dupNode(IDENTIFIER24);

                    adaptor.addChild(root_1, IDENTIFIER24_tree);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:336:30: ( ^( EXTENDS_T fully_qualified_class_name_list ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EXTENDS_T) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:336:31: ^( EXTENDS_T fully_qualified_class_name_list )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            EXTENDS_T25=(SLAST)match(input,EXTENDS_T,FOLLOW_EXTENDS_T_in_class_declaration_statement301); 
                            EXTENDS_T25_tree = (SLAST)adaptor.dupNode(EXTENDS_T25);

                            root_2 = (SLAST)adaptor.becomeRoot(EXTENDS_T25_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement303);
                            fully_qualified_class_name_list26=fully_qualified_class_name_list();

                            state._fsp--;

                            adaptor.addChild(root_2, fully_qualified_class_name_list26.getTree());

                            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                            }


                            }
                            break;

                    }

                     
                           PHPDocBlock start = null;
                           int startIndex = INTERFACE_T23.startIndex;
                           int endIndex = INTERFACE_T23.endIndex + 1;
                              
                           CommonToken token = (CommonToken)IDENTIFIER24.token;
                           int classNameLeft = token.getStartIndex();
                           int classNameRight = token.getStopIndex() + 1;
                           String className = (IDENTIFIER24!=null?IDENTIFIER24.getText():null);
                           
                           List interfaces = new LinkedList();
                           int listStartIndex = 0, listEndIndex = 0;
                           if ((fully_qualified_class_name_list26!=null?fully_qualified_class_name_list26.list:null) != null) {
                              interfaces = (fully_qualified_class_name_list26!=null?fully_qualified_class_name_list26.list:null);
                              CommonToken listToken = (CommonToken)(fully_qualified_class_name_list26!=null?((SLAST)fully_qualified_class_name_list26.tree):null).token;
                              listStartIndex = listToken.getStartIndex();
                              listEndIndex = listToken.getStopIndex();
                           }
                              
                           retval.interfaceDeclaration = new InterfaceDeclaration(startIndex ,endIndex, classNameLeft, classNameRight, className, interfaces, new Block(listStartIndex, listEndIndex,null), start);
                           parser.declarations.push(retval.interfaceDeclaration);
                        
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:359:7: ( ^( CLASS_BODY class_statement_list ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==CLASS_BODY) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:359:8: ^( CLASS_BODY class_statement_list )
                            {
                            _last = (SLAST)input.LT(1);
                            {
                            SLAST _save_last_2 = _last;
                            SLAST _first_2 = null;
                            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                            CLASS_BODY27=(SLAST)match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_class_declaration_statement322); 
                            CLASS_BODY27_tree = (SLAST)adaptor.dupNode(CLASS_BODY27);

                            root_2 = (SLAST)adaptor.becomeRoot(CLASS_BODY27_tree, root_2);



                            match(input, Token.DOWN, null); 
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_class_statement_list_in_class_declaration_statement324);
                            class_statement_list28=class_statement_list();

                            state._fsp--;

                            adaptor.addChild(root_2, class_statement_list28.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:365:1: class_entr_type : ( 'abstract' | 'final' );
    public final TreePHP.class_entr_type_return class_entr_type() throws RecognitionException {
        TreePHP.class_entr_type_return retval = new TreePHP.class_entr_type_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST set29=null;

        SLAST set29_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:366:3: ( 'abstract' | 'final' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            set29=(SLAST)input.LT(1);
            if ( (input.LA(1)>=174 && input.LA(1)<=175) ) {
                input.consume();

                set29_tree = (SLAST)adaptor.dupNode(set29);

                adaptor.addChild(root_0, set29_tree);

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:370:1: class_statement_list : ( class_statement )+ ;
    public final TreePHP.class_statement_list_return class_statement_list() throws RecognitionException {
        TreePHP.class_statement_list_return retval = new TreePHP.class_statement_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.class_statement_return class_statement30 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:371:3: ( ( class_statement )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:371:5: ( class_statement )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:371:5: ( class_statement )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:371:5: class_statement
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_class_statement_in_class_statement_list370);
            	    class_statement30=class_statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, class_statement30.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:374:1: class_statement : ( ^( FIELD_DECL variable_modifiers ( static_var_element )+ ) | ^( METHOD_DECL modifier ( REF_T )? IDENTIFIER ( parameter_list )? ( block | EMPTYSTATEMENT ) ) | ^( FIELD_DECL CONST_T ( directive )+ ) );
    public final TreePHP.class_statement_return class_statement() throws RecognitionException {
        class_statement_stack.push(new class_statement_scope());
        TreePHP.class_statement_return retval = new TreePHP.class_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST FIELD_DECL31=null;
        SLAST METHOD_DECL34=null;
        SLAST REF_T36=null;
        SLAST IDENTIFIER37=null;
        SLAST EMPTYSTATEMENT40=null;
        SLAST FIELD_DECL41=null;
        SLAST CONST_T42=null;
        TreePHP.variable_modifiers_return variable_modifiers32 = null;

        TreePHP.static_var_element_return static_var_element33 = null;

        TreePHP.modifier_return modifier35 = null;

        TreePHP.parameter_list_return parameter_list38 = null;

        TreePHP.block_return block39 = null;

        TreePHP.directive_return directive43 = null;


        SLAST FIELD_DECL31_tree=null;
        SLAST METHOD_DECL34_tree=null;
        SLAST REF_T36_tree=null;
        SLAST IDENTIFIER37_tree=null;
        SLAST EMPTYSTATEMENT40_tree=null;
        SLAST FIELD_DECL41_tree=null;
        SLAST CONST_T42_tree=null;


          ((class_statement_scope)class_statement_stack.peek()).constList = new LinkedList();
          ((class_statement_scope)class_statement_stack.peek()).varList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:383:3: ( ^( FIELD_DECL variable_modifiers ( static_var_element )+ ) | ^( METHOD_DECL modifier ( REF_T )? IDENTIFIER ( parameter_list )? ( block | EMPTYSTATEMENT ) ) | ^( FIELD_DECL CONST_T ( directive )+ ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==FIELD_DECL) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==DOWN) ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3==VAR_DECL||LA19_3==STATIC_T||LA19_3==EQUAL_T||(LA19_3>=174 && LA19_3<=179)) ) {
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:383:5: ^( FIELD_DECL variable_modifiers ( static_var_element )+ )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    FIELD_DECL31=(SLAST)match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_class_statement395); 
                    FIELD_DECL31_tree = (SLAST)adaptor.dupNode(FIELD_DECL31);

                    root_1 = (SLAST)adaptor.becomeRoot(FIELD_DECL31_tree, root_1);


                    inClassStatementList = true;

                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_modifiers_in_class_statement399);
                    variable_modifiers32=variable_modifiers();

                    state._fsp--;

                    adaptor.addChild(root_1, variable_modifiers32.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:383:68: ( static_var_element )+
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
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:383:68: static_var_element
                    	    {
                    	    _last = (SLAST)input.LT(1);
                    	    pushFollow(FOLLOW_static_var_element_in_class_statement401);
                    	    static_var_element33=static_var_element();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, static_var_element33.getTree());

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
                        int modifierLeft = ((CommonToken)(variable_modifiers32!=null?((SLAST)variable_modifiers32.tree):null).token).getStartIndex();
                        if ((variable_modifiers32!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(variable_modifiers32.start),
                      input.getTreeAdaptor().getTokenStopIndex(variable_modifiers32.start))):null).equals("var")) {
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:403:5: ^( METHOD_DECL modifier ( REF_T )? IDENTIFIER ( parameter_list )? ( block | EMPTYSTATEMENT ) )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    METHOD_DECL34=(SLAST)match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_class_statement416); 
                    METHOD_DECL34_tree = (SLAST)adaptor.dupNode(METHOD_DECL34);

                    root_1 = (SLAST)adaptor.becomeRoot(METHOD_DECL34_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_modifier_in_class_statement418);
                    modifier35=modifier();

                    state._fsp--;

                    adaptor.addChild(root_1, modifier35.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:403:28: ( REF_T )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==REF_T) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:403:28: REF_T
                            {
                            _last = (SLAST)input.LT(1);
                            REF_T36=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_class_statement420); 
                            REF_T36_tree = (SLAST)adaptor.dupNode(REF_T36);

                            adaptor.addChild(root_1, REF_T36_tree);


                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    IDENTIFIER37=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_class_statement423); 
                    IDENTIFIER37_tree = (SLAST)adaptor.dupNode(IDENTIFIER37);

                    adaptor.addChild(root_1, IDENTIFIER37_tree);


                          ModifierDocPair modifier = (modifier35!=null?modifier35.modifierVar:null);
                          PHPDocBlock start = null;
                          Boolean isReference = false;
                          if ((REF_T36!=null?REF_T36.getText():null) != null) {
                             isReference = true;
                          }
                          int functionNameLeft = ((CommonToken)IDENTIFIER37.token).getStartIndex();
                          int functionNameRight = ((CommonToken)IDENTIFIER37.token).getStopIndex() + 1;
                          String functionName = (IDENTIFIER37!=null?IDENTIFIER37.getText():null);
                      
                          int startIndex = METHOD_DECL34.startIndex;
                          int endIndex = METHOD_DECL34.endIndex + 1;
                          int modifierValue = (modifier == null || modifier.modifier == Modifiers.AccDefault) ? Modifiers.AccPublic : modifier.modifier;
                          
                          PHPDocBlock docBlock = start;
                          if (modifier != null && modifier.doc != null) {
                            docBlock = modifier.doc;
                          }
                          PHPMethodDeclaration methodDeclaration = new PHPMethodDeclaration(startIndex, endIndex, startIndex, endIndex, functionName, modifierValue, null, new Block(startIndex, endIndex, null), isReference.booleanValue(), docBlock);
                          parser.addDeclarationStatement(methodDeclaration);
                          parser.declarations.push(methodDeclaration);
                        
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:427:7: ( parameter_list )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==PARAMETER) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:427:7: parameter_list
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_parameter_list_in_class_statement437);
                            parameter_list38=parameter_list();

                            state._fsp--;

                            adaptor.addChild(root_1, parameter_list38.getTree());

                            }
                            break;

                    }


                            if ((parameter_list38!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(parameter_list38.start),
                      input.getTreeAdaptor().getTokenStopIndex(parameter_list38.start))):null) != null) {
                              PHPMethodDeclaration functionDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
                    				  functionDeclaration.acceptArguments((parameter_list38!=null?parameter_list38.parameterList:null));
                            }
                          
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:434:5: ( block | EMPTYSTATEMENT )
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
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:434:6: block
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_block_in_class_statement453);
                            block39=block();

                            state._fsp--;

                            adaptor.addChild(root_1, block39.getTree());

                                    startIndex = ((CommonToken)(block39!=null?((SLAST)block39.tree):null).token).getStartIndex();
                            		    endIndex = ((CommonToken)(block39!=null?((SLAST)block39.tree):null).token).getStopIndex() + 1;
                            		    
                            		    methodDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
                            			  methodDeclaration.getBody().setStart(startIndex);
                            			  methodDeclaration.getBody().setEnd(endIndex);
                            			  methodDeclaration.getBody().getStatements().clear();
                            			  methodDeclaration.getBody().acceptStatements((block39!=null?block39.statList:null));
                            			  
                            			  methodDeclaration = (PHPMethodDeclaration)parser.declarations.pop();
                            //			  if(body instanceof ASTError) {
                            //			    parser.reportError(new ASTError(methodDeclaration.sourceEnd() - 1, methodDeclaration.sourceEnd()), "syntax error, unfinished method declaration");
                            //			  }
                            			  TypeDeclaration type = (TypeDeclaration)parser.declarations.peek();
                            			  methodDeclaration.setDeclaringTypeName(type.getName()); 
                                 

                            }
                            break;
                        case 2 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:453:5: EMPTYSTATEMENT
                            {
                            _last = (SLAST)input.LT(1);
                            EMPTYSTATEMENT40=(SLAST)match(input,EMPTYSTATEMENT,FOLLOW_EMPTYSTATEMENT_in_class_statement472); 
                            EMPTYSTATEMENT40_tree = (SLAST)adaptor.dupNode(EMPTYSTATEMENT40);

                            adaptor.addChild(root_1, EMPTYSTATEMENT40_tree);

                               
                                    startIndex = ((CommonToken)EMPTYSTATEMENT40.token).getStartIndex();
                                    endIndex = ((CommonToken)EMPTYSTATEMENT40.token).getStopIndex() + 1;
                                    
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:472:5: ^( FIELD_DECL CONST_T ( directive )+ )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    FIELD_DECL41=(SLAST)match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_class_statement495); 
                    FIELD_DECL41_tree = (SLAST)adaptor.dupNode(FIELD_DECL41);

                    root_1 = (SLAST)adaptor.becomeRoot(FIELD_DECL41_tree, root_1);


                    inClassStatementList = true;

                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    CONST_T42=(SLAST)match(input,CONST_T,FOLLOW_CONST_T_in_class_statement499); 
                    CONST_T42_tree = (SLAST)adaptor.dupNode(CONST_T42);

                    adaptor.addChild(root_1, CONST_T42_tree);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:472:57: ( directive )+
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
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:472:57: directive
                    	    {
                    	    _last = (SLAST)input.LT(1);
                    	    pushFollow(FOLLOW_directive_in_class_statement501);
                    	    directive43=directive();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, directive43.getTree());

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


                        int startIndex = FIELD_DECL41.startIndex;
                        int endIndex = FIELD_DECL41.endIndex;
                        Iterator iter = ((class_statement_scope)class_statement_stack.peek()).constList.iterator();
                        while (iter.hasNext()) {
                          ASTNode[] decl = (ASTNode[])iter.next();
                    	    if (decl != null) {
                    		    ConstantReference constant = (ConstantReference)decl[0];
                    		    Expression initializer = (Expression)decl[1];
                    		    int decListLeft = ((CommonToken)(directive43!=null?((SLAST)directive43.tree):null).token).getStartIndex();
                    		      
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:496:1: function_declaration_statement returns [Statement stat] : ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) ;
    public final TreePHP.function_declaration_statement_return function_declaration_statement() throws RecognitionException {
        TreePHP.function_declaration_statement_return retval = new TreePHP.function_declaration_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST METHOD_DECL44=null;
        SLAST REF_T45=null;
        SLAST IDENTIFIER46=null;
        TreePHP.parameter_list_return parameter_list47 = null;

        TreePHP.block_return block48 = null;


        SLAST METHOD_DECL44_tree=null;
        SLAST REF_T45_tree=null;
        SLAST IDENTIFIER46_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:497:3: ( ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:497:5: ^( METHOD_DECL ( REF_T )? IDENTIFIER ( parameter_list )? block )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            METHOD_DECL44=(SLAST)match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_function_declaration_statement527); 
            METHOD_DECL44_tree = (SLAST)adaptor.dupNode(METHOD_DECL44);

            root_1 = (SLAST)adaptor.becomeRoot(METHOD_DECL44_tree, root_1);



            match(input, Token.DOWN, null); 
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:497:19: ( REF_T )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==REF_T) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:497:19: REF_T
                    {
                    _last = (SLAST)input.LT(1);
                    REF_T45=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_function_declaration_statement529); 
                    REF_T45_tree = (SLAST)adaptor.dupNode(REF_T45);

                    adaptor.addChild(root_1, REF_T45_tree);


                    }
                    break;

            }

            _last = (SLAST)input.LT(1);
            IDENTIFIER46=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_function_declaration_statement532); 
            IDENTIFIER46_tree = (SLAST)adaptor.dupNode(IDENTIFIER46);

            adaptor.addChild(root_1, IDENTIFIER46_tree);


                Boolean isReference = false;
                if ((REF_T45!=null?REF_T45.getText():null) != null) {
                   isReference = true;
                }
                int functionNameLeft = ((CommonToken)IDENTIFIER46.token).getStartIndex();
                int functionNameRight = ((CommonToken)IDENTIFIER46.token).getStopIndex() + 1;
                String functionName = (IDENTIFIER46!=null?IDENTIFIER46.getText():null);
              
                int startIndex = METHOD_DECL44.startIndex;
                int endIndex = METHOD_DECL44.endIndex + 1;
                int modifierValue = Modifiers.AccDefault;
                  
                PHPDocBlock docBlock = null;
                
                PHPMethodDeclaration methodDeclaration = new PHPMethodDeclaration(startIndex, endIndex, startIndex, endIndex, functionName, modifierValue, null, new Block(startIndex, endIndex, null), isReference.booleanValue(), docBlock);
                parser.addDeclarationStatement(methodDeclaration);
                parser.declarations.push(methodDeclaration);
              
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:517:4: ( parameter_list )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==PARAMETER) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:517:4: parameter_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_parameter_list_in_function_declaration_statement541);
                    parameter_list47=parameter_list();

                    state._fsp--;

                    adaptor.addChild(root_1, parameter_list47.getTree());

                    }
                    break;

            }


                  if ((parameter_list47!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(parameter_list47.start),
              input.getTreeAdaptor().getTokenStopIndex(parameter_list47.start))):null) != null) {
                    PHPMethodDeclaration functionDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
                    functionDeclaration.acceptArguments((parameter_list47!=null?parameter_list47.parameterList:null));
                  }
               
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_block_in_function_declaration_statement554);
            block48=block();

            state._fsp--;

            adaptor.addChild(root_1, block48.getTree());

                startIndex = ((CommonToken)(block48!=null?((SLAST)block48.tree):null).token).getStartIndex();
                endIndex = ((CommonToken)(block48!=null?((SLAST)block48.tree):null).token).getStopIndex() + 1;
                    
                methodDeclaration = (PHPMethodDeclaration)parser.declarations.peek();
                methodDeclaration.getBody().setStart(startIndex);
                methodDeclaration.getBody().setEnd(endIndex);
                methodDeclaration.getBody().getStatements().clear();
                methodDeclaration.getBody().acceptStatements((block48!=null?block48.statList:null));
                    
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:549:1: block returns [Statement stat, List statList] : ^( BLOCK ( inner_statement_list )? ) ;
    public final TreePHP.block_return block() throws RecognitionException {
        TreePHP.block_return retval = new TreePHP.block_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST BLOCK49=null;
        TreePHP.inner_statement_list_return inner_statement_list50 = null;


        SLAST BLOCK49_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:550:3: ( ^( BLOCK ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:550:5: ^( BLOCK ( inner_statement_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            BLOCK49=(SLAST)match(input,BLOCK,FOLLOW_BLOCK_in_block589); 
            BLOCK49_tree = (SLAST)adaptor.dupNode(BLOCK49);

            root_1 = (SLAST)adaptor.becomeRoot(BLOCK49_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:550:13: ( inner_statement_list )?
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==METHOD_DECL||LA22_0==STATEMENT||LA22_0==CLASS_T||LA22_0==INTERFACE_T||LA22_0==173) ) {
                    alt22=1;
                }
                switch (alt22) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:550:13: inner_statement_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_inner_statement_list_in_block591);
                        inner_statement_list50=inner_statement_list();

                        state._fsp--;

                        adaptor.addChild(root_1, inner_statement_list50.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                  int startIndex = BLOCK49.startIndex;
                  int endIndex = BLOCK49.endIndex + 1;
                  System.out.println("emptystat:" + startIndex + " " + endIndex);
                  Block block = new Block(startIndex, endIndex, new LinkedList());
                  if ((inner_statement_list50!=null?inner_statement_list50.innerStatementList:null) != null) {
                    block.getStatements().clear();
                    block.acceptStatements((inner_statement_list50!=null?inner_statement_list50.innerStatementList:null));
                    retval.statList = (inner_statement_list50!=null?inner_statement_list50.innerStatementList:null);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:568:1: statement returns [Statement stat] : ^( STATEMENT topStatement ) ;
    public final TreePHP.statement_return statement() throws RecognitionException {
        TreePHP.statement_return retval = new TreePHP.statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST STATEMENT51=null;
        TreePHP.topStatement_return topStatement52 = null;


        SLAST STATEMENT51_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:569:3: ( ^( STATEMENT topStatement ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:569:5: ^( STATEMENT topStatement )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            STATEMENT51=(SLAST)match(input,STATEMENT,FOLLOW_STATEMENT_in_statement620); 
            STATEMENT51_tree = (SLAST)adaptor.dupNode(STATEMENT51);

            root_1 = (SLAST)adaptor.becomeRoot(STATEMENT51_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_topStatement_in_statement622);
            topStatement52=topStatement();

            state._fsp--;

            adaptor.addChild(root_1, topStatement52.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                if ((topStatement52!=null?topStatement52.expr:null) != null) {
            //	    int startIndex = STATEMENT51.startIndex;
            //	    int endIndex = STATEMENT51.endIndex + 1;
                  SLAST ast = (topStatement52!=null?((SLAST)topStatement52.start):null);
                  int startIndex = ast.startIndex;
                  int endIndex = ast.endIndex + 1;
            	    retval.stat = new ExpressionStatement(startIndex, endIndex, (topStatement52!=null?topStatement52.expr:null));
            	    System.out.println("retval.stat:" + retval.stat);
            	    quoteExpr = (topStatement52!=null?topStatement52.expr:null);
                }
                else {
                  retval.stat = (topStatement52!=null?topStatement52.stat:null);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:587:1: topStatement returns [Expression expr, Statement stat] : ( block | if_stat | ^( WHILE_T ^( CONDITION e= expression ) while_statement ) | ^( DO_T ^( CONDITION e= expression ) statement ) | ^( FOR_T (e1= expr_list )? ^( CONDITION (e2= expr_list )? ) ^( ITERATE (e3= expr_list )? ) s1= for_statement ) | ^( SWITCH_T ^( CONDITION e= expression ) switch_case_list ) | ^( BREAK_T ( expression )? ) | ^( CONTINUE_T (e= expression )? ) | ^( RETURN_T (e= expression )? ) | ^( GLOBAL_T variable_list ) | ^( STATIC_T static_var_list ) | ^( ECHO_T expr_list ) | ^( EMPTYSTATEMENT SEMI_COLON ) | expression | ^( FOREACH_T ^( AS_T e= expression v1= foreach_variable (v2= foreach_variable )? ) foreach_statement ) | ^( DECLARE_T directive declare_statement ) | ^( TRY_T block catch_branch_list ) | ^( THROW_T e= expression ) | ^( USE_T scalar ) | ^( USE_PARETHESIS_T scalar ) | ^( INCLUDE_T e= expression ) | ^( INCLUDE_ONCE_T e= expression ) | ^( REQUIRE_T e= expression ) | ^( REQUIRE_ONCE_T e= expression ) );
    public final TreePHP.topStatement_return topStatement() throws RecognitionException {
        topStatement_stack.push(new topStatement_scope());
        TreePHP.topStatement_return retval = new TreePHP.topStatement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST WHILE_T55=null;
        SLAST CONDITION56=null;
        SLAST DO_T58=null;
        SLAST CONDITION59=null;
        SLAST FOR_T61=null;
        SLAST CONDITION62=null;
        SLAST ITERATE63=null;
        SLAST SWITCH_T64=null;
        SLAST CONDITION65=null;
        SLAST BREAK_T67=null;
        SLAST CONTINUE_T69=null;
        SLAST RETURN_T70=null;
        SLAST GLOBAL_T71=null;
        SLAST STATIC_T73=null;
        SLAST ECHO_T75=null;
        SLAST EMPTYSTATEMENT77=null;
        SLAST SEMI_COLON78=null;
        SLAST FOREACH_T80=null;
        SLAST AS_T81=null;
        SLAST DECLARE_T83=null;
        SLAST TRY_T86=null;
        SLAST THROW_T89=null;
        SLAST USE_T90=null;
        SLAST USE_PARETHESIS_T92=null;
        SLAST INCLUDE_T94=null;
        SLAST INCLUDE_ONCE_T95=null;
        SLAST REQUIRE_T96=null;
        SLAST REQUIRE_ONCE_T97=null;
        TreePHP.expression_return e = null;

        TreePHP.expr_list_return e1 = null;

        TreePHP.expr_list_return e2 = null;

        TreePHP.expr_list_return e3 = null;

        TreePHP.for_statement_return s1 = null;

        TreePHP.foreach_variable_return v1 = null;

        TreePHP.foreach_variable_return v2 = null;

        TreePHP.block_return block53 = null;

        TreePHP.if_stat_return if_stat54 = null;

        TreePHP.while_statement_return while_statement57 = null;

        TreePHP.statement_return statement60 = null;

        TreePHP.switch_case_list_return switch_case_list66 = null;

        TreePHP.expression_return expression68 = null;

        TreePHP.variable_list_return variable_list72 = null;

        TreePHP.static_var_list_return static_var_list74 = null;

        TreePHP.expr_list_return expr_list76 = null;

        TreePHP.expression_return expression79 = null;

        TreePHP.foreach_statement_return foreach_statement82 = null;

        TreePHP.directive_return directive84 = null;

        TreePHP.declare_statement_return declare_statement85 = null;

        TreePHP.block_return block87 = null;

        TreePHP.catch_branch_list_return catch_branch_list88 = null;

        TreePHP.scalar_return scalar91 = null;

        TreePHP.scalar_return scalar93 = null;


        SLAST WHILE_T55_tree=null;
        SLAST CONDITION56_tree=null;
        SLAST DO_T58_tree=null;
        SLAST CONDITION59_tree=null;
        SLAST FOR_T61_tree=null;
        SLAST CONDITION62_tree=null;
        SLAST ITERATE63_tree=null;
        SLAST SWITCH_T64_tree=null;
        SLAST CONDITION65_tree=null;
        SLAST BREAK_T67_tree=null;
        SLAST CONTINUE_T69_tree=null;
        SLAST RETURN_T70_tree=null;
        SLAST GLOBAL_T71_tree=null;
        SLAST STATIC_T73_tree=null;
        SLAST ECHO_T75_tree=null;
        SLAST EMPTYSTATEMENT77_tree=null;
        SLAST SEMI_COLON78_tree=null;
        SLAST FOREACH_T80_tree=null;
        SLAST AS_T81_tree=null;
        SLAST DECLARE_T83_tree=null;
        SLAST TRY_T86_tree=null;
        SLAST THROW_T89_tree=null;
        SLAST USE_T90_tree=null;
        SLAST USE_PARETHESIS_T92_tree=null;
        SLAST INCLUDE_T94_tree=null;
        SLAST INCLUDE_ONCE_T95_tree=null;
        SLAST REQUIRE_T96_tree=null;
        SLAST REQUIRE_ONCE_T97_tree=null;


          ((topStatement_scope)topStatement_stack.peek()).declareKey = new LinkedList();
          ((topStatement_scope)topStatement_stack.peek()).declareValue = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:596:3: ( block | if_stat | ^( WHILE_T ^( CONDITION e= expression ) while_statement ) | ^( DO_T ^( CONDITION e= expression ) statement ) | ^( FOR_T (e1= expr_list )? ^( CONDITION (e2= expr_list )? ) ^( ITERATE (e3= expr_list )? ) s1= for_statement ) | ^( SWITCH_T ^( CONDITION e= expression ) switch_case_list ) | ^( BREAK_T ( expression )? ) | ^( CONTINUE_T (e= expression )? ) | ^( RETURN_T (e= expression )? ) | ^( GLOBAL_T variable_list ) | ^( STATIC_T static_var_list ) | ^( ECHO_T expr_list ) | ^( EMPTYSTATEMENT SEMI_COLON ) | expression | ^( FOREACH_T ^( AS_T e= expression v1= foreach_variable (v2= foreach_variable )? ) foreach_statement ) | ^( DECLARE_T directive declare_statement ) | ^( TRY_T block catch_branch_list ) | ^( THROW_T e= expression ) | ^( USE_T scalar ) | ^( USE_PARETHESIS_T scalar ) | ^( INCLUDE_T e= expression ) | ^( INCLUDE_ONCE_T e= expression ) | ^( REQUIRE_T e= expression ) | ^( REQUIRE_ONCE_T e= expression ) )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:596:5: block
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_block_in_topStatement653);
                    block53=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block53.getTree());

                        retval.stat = (block53!=null?block53.stat:null);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:600:5: if_stat
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_if_stat_in_topStatement664);
                    if_stat54=if_stat();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stat54.getTree());

                        retval.stat = (if_stat54!=null?if_stat54.stat:null);
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:604:5: ^( WHILE_T ^( CONDITION e= expression ) while_statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    WHILE_T55=(SLAST)match(input,WHILE_T,FOLLOW_WHILE_T_in_topStatement675); 
                    WHILE_T55_tree = (SLAST)adaptor.dupNode(WHILE_T55);

                    root_1 = (SLAST)adaptor.becomeRoot(WHILE_T55_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CONDITION56=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement678); 
                    CONDITION56_tree = (SLAST)adaptor.dupNode(CONDITION56);

                    root_2 = (SLAST)adaptor.becomeRoot(CONDITION56_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement682);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_while_statement_in_topStatement685);
                    while_statement57=while_statement();

                    state._fsp--;

                    adaptor.addChild(root_1, while_statement57.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = WHILE_T55.startIndex;
                        int endIndex = WHILE_T55.endIndex + 1;
                        retval.stat = new WhileStatement(startIndex, endIndex, (e!=null?e.expr:null), (while_statement57!=null?while_statement57.block:null));   
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:611:5: ^( DO_T ^( CONDITION e= expression ) statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DO_T58=(SLAST)match(input,DO_T,FOLLOW_DO_T_in_topStatement700); 
                    DO_T58_tree = (SLAST)adaptor.dupNode(DO_T58);

                    root_1 = (SLAST)adaptor.becomeRoot(DO_T58_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CONDITION59=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement703); 
                    CONDITION59_tree = (SLAST)adaptor.dupNode(CONDITION59);

                    root_2 = (SLAST)adaptor.becomeRoot(CONDITION59_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement707);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_statement_in_topStatement710);
                    statement60=statement();

                    state._fsp--;

                    adaptor.addChild(root_1, statement60.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DO_T58.startIndex;
                        int endIndex = DO_T58.endIndex + 1;
                        retval.stat = new DoStatement(startIndex, endIndex, (e!=null?e.expr:null), (statement60!=null?statement60.stat:null));      
                      

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:617:5: ^( FOR_T (e1= expr_list )? ^( CONDITION (e2= expr_list )? ) ^( ITERATE (e3= expr_list )? ) s1= for_statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    FOR_T61=(SLAST)match(input,FOR_T,FOLLOW_FOR_T_in_topStatement722); 
                    FOR_T61_tree = (SLAST)adaptor.dupNode(FOR_T61);

                    root_1 = (SLAST)adaptor.becomeRoot(FOR_T61_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:617:15: (e1= expr_list )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==VAR_DECL||LA23_0==CALL||LA23_0==EXPR||(LA23_0>=SCALAR && LA23_0<=UNARY_EXPR)||LA23_0==REF_T||LA23_0==EQUAL_T||(LA23_0>=OR_T && LA23_0<=CLONE_T)||(LA23_0>=INSTANCEOF_T && LA23_0<=PRINT_T)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:617:15: e1= expr_list
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_expr_list_in_topStatement726);
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
                    CONDITION62=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement730); 
                    CONDITION62_tree = (SLAST)adaptor.dupNode(CONDITION62);

                    root_2 = (SLAST)adaptor.becomeRoot(CONDITION62_tree, root_2);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:617:41: (e2= expr_list )?
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==VAR_DECL||LA24_0==CALL||LA24_0==EXPR||(LA24_0>=SCALAR && LA24_0<=UNARY_EXPR)||LA24_0==REF_T||LA24_0==EQUAL_T||(LA24_0>=OR_T && LA24_0<=CLONE_T)||(LA24_0>=INSTANCEOF_T && LA24_0<=PRINT_T)) ) {
                            alt24=1;
                        }
                        switch (alt24) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:617:41: e2= expr_list
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expr_list_in_topStatement734);
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
                    ITERATE63=(SLAST)match(input,ITERATE,FOLLOW_ITERATE_in_topStatement739); 
                    ITERATE63_tree = (SLAST)adaptor.dupNode(ITERATE63);

                    root_2 = (SLAST)adaptor.becomeRoot(ITERATE63_tree, root_2);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:617:66: (e3= expr_list )?
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==VAR_DECL||LA25_0==CALL||LA25_0==EXPR||(LA25_0>=SCALAR && LA25_0<=UNARY_EXPR)||LA25_0==REF_T||LA25_0==EQUAL_T||(LA25_0>=OR_T && LA25_0<=CLONE_T)||(LA25_0>=INSTANCEOF_T && LA25_0<=PRINT_T)) ) {
                            alt25=1;
                        }
                        switch (alt25) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:617:66: e3= expr_list
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expr_list_in_topStatement743);
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
                    pushFollow(FOLLOW_for_statement_in_topStatement749);
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
                        int startIndex = FOR_T61.startIndex;
                        int endIndex = FOR_T61.endIndex + 1;
                        retval.stat = new ForStatement(startIndex, endIndex, initList, condList, changeList, (s1!=null?s1.block:null));
                      

                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:629:5: ^( SWITCH_T ^( CONDITION e= expression ) switch_case_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    SWITCH_T64=(SLAST)match(input,SWITCH_T,FOLLOW_SWITCH_T_in_topStatement761); 
                    SWITCH_T64_tree = (SLAST)adaptor.dupNode(SWITCH_T64);

                    root_1 = (SLAST)adaptor.becomeRoot(SWITCH_T64_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CONDITION65=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_topStatement764); 
                    CONDITION65_tree = (SLAST)adaptor.dupNode(CONDITION65);

                    root_2 = (SLAST)adaptor.becomeRoot(CONDITION65_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement768);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_switch_case_list_in_topStatement771);
                    switch_case_list66=switch_case_list();

                    state._fsp--;

                    adaptor.addChild(root_1, switch_case_list66.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = SWITCH_T64.startIndex;
                        int endIndex = SWITCH_T64.endIndex + 1;
                        retval.stat = new SwitchStatement(startIndex, endIndex, (e!=null?e.expr:null), (switch_case_list66!=null?switch_case_list66.block:null));
                      

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:635:5: ^( BREAK_T ( expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    BREAK_T67=(SLAST)match(input,BREAK_T,FOLLOW_BREAK_T_in_topStatement783); 
                    BREAK_T67_tree = (SLAST)adaptor.dupNode(BREAK_T67);

                    root_1 = (SLAST)adaptor.becomeRoot(BREAK_T67_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:635:15: ( expression )?
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==VAR_DECL||LA26_0==CALL||LA26_0==EXPR||(LA26_0>=SCALAR && LA26_0<=UNARY_EXPR)||LA26_0==REF_T||LA26_0==EQUAL_T||(LA26_0>=OR_T && LA26_0<=CLONE_T)||(LA26_0>=INSTANCEOF_T && LA26_0<=PRINT_T)) ) {
                            alt26=1;
                        }
                        switch (alt26) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:635:15: expression
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expression_in_topStatement785);
                                expression68=expression();

                                state._fsp--;

                                adaptor.addChild(root_1, expression68.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = BREAK_T67.startIndex;
                        int endIndex = BREAK_T67.endIndex + 1;
                        retval.stat = new BreakStatement(startIndex, endIndex);
                      

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:641:5: ^( CONTINUE_T (e= expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CONTINUE_T69=(SLAST)match(input,CONTINUE_T,FOLLOW_CONTINUE_T_in_topStatement798); 
                    CONTINUE_T69_tree = (SLAST)adaptor.dupNode(CONTINUE_T69);

                    root_1 = (SLAST)adaptor.becomeRoot(CONTINUE_T69_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:641:19: (e= expression )?
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==VAR_DECL||LA27_0==CALL||LA27_0==EXPR||(LA27_0>=SCALAR && LA27_0<=UNARY_EXPR)||LA27_0==REF_T||LA27_0==EQUAL_T||(LA27_0>=OR_T && LA27_0<=CLONE_T)||(LA27_0>=INSTANCEOF_T && LA27_0<=PRINT_T)) ) {
                            alt27=1;
                        }
                        switch (alt27) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:641:19: e= expression
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expression_in_topStatement802);
                                e=expression();

                                state._fsp--;

                                adaptor.addChild(root_1, e.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = CONTINUE_T69.startIndex;
                        int endIndex = CONTINUE_T69.endIndex + 1;
                        retval.stat = new ContinueStatement(startIndex, endIndex);
                        if ((e!=null?e.expr:null) != null) {
                          retval.stat = new ContinueStatement(startIndex, endIndex, (e!=null?e.expr:null));
                        }
                      

                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:650:5: ^( RETURN_T (e= expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    RETURN_T70=(SLAST)match(input,RETURN_T,FOLLOW_RETURN_T_in_topStatement815); 
                    RETURN_T70_tree = (SLAST)adaptor.dupNode(RETURN_T70);

                    root_1 = (SLAST)adaptor.becomeRoot(RETURN_T70_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:650:17: (e= expression )?
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==VAR_DECL||LA28_0==CALL||LA28_0==EXPR||(LA28_0>=SCALAR && LA28_0<=UNARY_EXPR)||LA28_0==REF_T||LA28_0==EQUAL_T||(LA28_0>=OR_T && LA28_0<=CLONE_T)||(LA28_0>=INSTANCEOF_T && LA28_0<=PRINT_T)) ) {
                            alt28=1;
                        }
                        switch (alt28) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:650:17: e= expression
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_expression_in_topStatement819);
                                e=expression();

                                state._fsp--;

                                adaptor.addChild(root_1, e.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = RETURN_T70.startIndex;
                        int endIndex = RETURN_T70.endIndex + 1;
                        retval.stat = new ReturnStatement(startIndex, endIndex);
                        if ((e!=null?e.expr:null) != null) {
                          retval.stat = new ReturnStatement(startIndex, endIndex, (e!=null?e.expr:null));
                        }
                      

                    }
                    break;
                case 10 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:659:5: ^( GLOBAL_T variable_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    GLOBAL_T71=(SLAST)match(input,GLOBAL_T,FOLLOW_GLOBAL_T_in_topStatement832); 
                    GLOBAL_T71_tree = (SLAST)adaptor.dupNode(GLOBAL_T71);

                    root_1 = (SLAST)adaptor.becomeRoot(GLOBAL_T71_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_list_in_topStatement834);
                    variable_list72=variable_list();

                    state._fsp--;

                    adaptor.addChild(root_1, variable_list72.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = GLOBAL_T71.startIndex;
                        int endIndex = GLOBAL_T71.endIndex + 1;
                        retval.stat = new GlobalStatement(startIndex, endIndex, (variable_list72!=null?variable_list72.variableList:null));
                      

                    }
                    break;
                case 11 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:665:5: ^( STATIC_T static_var_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    STATIC_T73=(SLAST)match(input,STATIC_T,FOLLOW_STATIC_T_in_topStatement846); 
                    STATIC_T73_tree = (SLAST)adaptor.dupNode(STATIC_T73);

                    root_1 = (SLAST)adaptor.becomeRoot(STATIC_T73_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_static_var_list_in_topStatement848);
                    static_var_list74=static_var_list();

                    state._fsp--;

                    adaptor.addChild(root_1, static_var_list74.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = STATIC_T73.startIndex;
                        int endIndex = STATIC_T73.endIndex + 1;
                        retval.stat = new StaticStatement(startIndex, endIndex, (static_var_list74!=null?static_var_list74.staticVarList:null));
                      

                    }
                    break;
                case 12 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:671:5: ^( ECHO_T expr_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ECHO_T75=(SLAST)match(input,ECHO_T,FOLLOW_ECHO_T_in_topStatement860); 
                    ECHO_T75_tree = (SLAST)adaptor.dupNode(ECHO_T75);

                    root_1 = (SLAST)adaptor.becomeRoot(ECHO_T75_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expr_list_in_topStatement862);
                    expr_list76=expr_list();

                    state._fsp--;

                    adaptor.addChild(root_1, expr_list76.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = ECHO_T75.startIndex;
                        int endIndex = ECHO_T75.endIndex + 1;
                        retval.stat = new EchoStatement(startIndex, endIndex, (expr_list76!=null?expr_list76.exprList:null)); 
                      

                    }
                    break;
                case 13 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:677:5: ^( EMPTYSTATEMENT SEMI_COLON )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EMPTYSTATEMENT77=(SLAST)match(input,EMPTYSTATEMENT,FOLLOW_EMPTYSTATEMENT_in_topStatement874); 
                    EMPTYSTATEMENT77_tree = (SLAST)adaptor.dupNode(EMPTYSTATEMENT77);

                    root_1 = (SLAST)adaptor.becomeRoot(EMPTYSTATEMENT77_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    SEMI_COLON78=(SLAST)match(input,SEMI_COLON,FOLLOW_SEMI_COLON_in_topStatement876); 
                    SEMI_COLON78_tree = (SLAST)adaptor.dupNode(SEMI_COLON78);

                    adaptor.addChild(root_1, SEMI_COLON78_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EMPTYSTATEMENT77.startIndex;
                        int endIndex = EMPTYSTATEMENT77.endIndex + 1;
                        retval.stat = new EmptyStatement(startIndex, endIndex); 
                      

                    }
                    break;
                case 14 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:683:5: expression
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement887);
                    expression79=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression79.getTree());

                         retval.expr = (expression79!=null?expression79.expr:null);
                      

                    }
                    break;
                case 15 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:687:5: ^( FOREACH_T ^( AS_T e= expression v1= foreach_variable (v2= foreach_variable )? ) foreach_statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    FOREACH_T80=(SLAST)match(input,FOREACH_T,FOLLOW_FOREACH_T_in_topStatement898); 
                    FOREACH_T80_tree = (SLAST)adaptor.dupNode(FOREACH_T80);

                    root_1 = (SLAST)adaptor.becomeRoot(FOREACH_T80_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    AS_T81=(SLAST)match(input,AS_T,FOLLOW_AS_T_in_topStatement901); 
                    AS_T81_tree = (SLAST)adaptor.dupNode(AS_T81);

                    root_2 = (SLAST)adaptor.becomeRoot(AS_T81_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement905);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_foreach_variable_in_topStatement909);
                    v1=foreach_variable();

                    state._fsp--;

                    adaptor.addChild(root_2, v1.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:687:59: (v2= foreach_variable )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==VAR_DECL||LA29_0==CALL||LA29_0==REF_T) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:687:59: v2= foreach_variable
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_foreach_variable_in_topStatement913);
                            v2=foreach_variable();

                            state._fsp--;

                            adaptor.addChild(root_2, v2.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_foreach_statement_in_topStatement917);
                    foreach_statement82=foreach_statement();

                    state._fsp--;

                    adaptor.addChild(root_1, foreach_statement82.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = FOREACH_T80.startIndex;
                        int endIndex = FOREACH_T80.endIndex + 1;
                        
                        if ((v2!=null?v2.expr:null) == null) {
                          retval.stat = new ForEachStatement(startIndex, endIndex, (e!=null?e.expr:null), (v1!=null?v1.expr:null), (foreach_statement82!=null?foreach_statement82.block:null));
                        }
                        else {
                          retval.stat = new ForEachStatement(startIndex, endIndex, (e!=null?e.expr:null), (v1!=null?v1.expr:null), (v2!=null?v2.expr:null), (foreach_statement82!=null?foreach_statement82.block:null));
                        }
                      

                    }
                    break;
                case 16 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:699:5: ^( DECLARE_T directive declare_statement )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DECLARE_T83=(SLAST)match(input,DECLARE_T,FOLLOW_DECLARE_T_in_topStatement930); 
                    DECLARE_T83_tree = (SLAST)adaptor.dupNode(DECLARE_T83);

                    root_1 = (SLAST)adaptor.becomeRoot(DECLARE_T83_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_directive_in_topStatement932);
                    directive84=directive();

                    state._fsp--;

                    adaptor.addChild(root_1, directive84.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_declare_statement_in_topStatement934);
                    declare_statement85=declare_statement();

                    state._fsp--;

                    adaptor.addChild(root_1, declare_statement85.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    	    int startIndex = DECLARE_T83.startIndex;
                    	    int endIndex = DECLARE_T83.endIndex + 1;
                    	    DeclareStatement declare = new DeclareStatement(startIndex, endIndex, ((topStatement_scope)topStatement_stack.peek()).declareKey, ((topStatement_scope)topStatement_stack.peek()).declareValue, (declare_statement85!=null?declare_statement85.block:null));
                    	    retval.stat = declare;
                    	    System.out.println("declare block");
                    	  

                    }
                    break;
                case 17 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:707:5: ^( TRY_T block catch_branch_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    TRY_T86=(SLAST)match(input,TRY_T,FOLLOW_TRY_T_in_topStatement947); 
                    TRY_T86_tree = (SLAST)adaptor.dupNode(TRY_T86);

                    root_1 = (SLAST)adaptor.becomeRoot(TRY_T86_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_block_in_topStatement949);
                    block87=block();

                    state._fsp--;

                    adaptor.addChild(root_1, block87.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_catch_branch_list_in_topStatement951);
                    catch_branch_list88=catch_branch_list();

                    state._fsp--;

                    adaptor.addChild(root_1, catch_branch_list88.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = TRY_T86.startIndex;
                        int endIndex = TRY_T86.endIndex + 1;
                        
                        TryStatement tryStatement = new TryStatement(startIndex, endIndex, (Block)(block87!=null?block87.stat:null), (catch_branch_list88!=null?catch_branch_list88.catchList:null));
                        retval.stat = tryStatement;
                      

                    }
                    break;
                case 18 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:715:5: ^( THROW_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    THROW_T89=(SLAST)match(input,THROW_T,FOLLOW_THROW_T_in_topStatement963); 
                    THROW_T89_tree = (SLAST)adaptor.dupNode(THROW_T89);

                    root_1 = (SLAST)adaptor.becomeRoot(THROW_T89_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement967);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = THROW_T89.startIndex;
                        int endIndex = THROW_T89.endIndex + 1;
                        retval.stat = new ThrowStatement(startIndex, endIndex, (e!=null?e.expr:null)); 
                      

                    }
                    break;
                case 19 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:721:5: ^( USE_T scalar )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    USE_T90=(SLAST)match(input,USE_T,FOLLOW_USE_T_in_topStatement979); 
                    USE_T90_tree = (SLAST)adaptor.dupNode(USE_T90);

                    root_1 = (SLAST)adaptor.becomeRoot(USE_T90_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_topStatement981);
                    scalar91=scalar();

                    state._fsp--;

                    adaptor.addChild(root_1, scalar91.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = USE_T90.startIndex;
                        int endIndex = USE_T90.endIndex;
                        SimpleReference functionName = new SimpleReference(startIndex, startIndex + "use".length(), "use");
                        
                        PHPCallArgumentsList list = new PHPCallArgumentsList((scalar91!=null?scalar91.expr:null).sourceStart(), (scalar91!=null?scalar91.expr:null).sourceEnd());
                        list.addNode((scalar91!=null?scalar91.expr:null));
                        
                        retval.expr = new PHPCallExpression(startIndex, endIndex, null, functionName, list);
                      

                    }
                    break;
                case 20 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:732:5: ^( USE_PARETHESIS_T scalar )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    USE_PARETHESIS_T92=(SLAST)match(input,USE_PARETHESIS_T,FOLLOW_USE_PARETHESIS_T_in_topStatement993); 
                    USE_PARETHESIS_T92_tree = (SLAST)adaptor.dupNode(USE_PARETHESIS_T92);

                    root_1 = (SLAST)adaptor.becomeRoot(USE_PARETHESIS_T92_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_topStatement995);
                    scalar93=scalar();

                    state._fsp--;

                    adaptor.addChild(root_1, scalar93.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = USE_PARETHESIS_T92.startIndex;
                        int endIndex = USE_PARETHESIS_T92.endIndex;
                        SimpleReference functionName = new SimpleReference(startIndex, startIndex + "use".length(), "use");
                        
                        PHPCallArgumentsList list = new PHPCallArgumentsList((scalar93!=null?scalar93.expr:null).sourceStart() - 1, (scalar93!=null?scalar93.expr:null).sourceEnd() + 1);
                        list.addNode((scalar93!=null?scalar93.expr:null));
                        
                        retval.expr = new PHPCallExpression(startIndex, endIndex, null, functionName, list);
                      

                    }
                    break;
                case 21 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:743:5: ^( INCLUDE_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INCLUDE_T94=(SLAST)match(input,INCLUDE_T,FOLLOW_INCLUDE_T_in_topStatement1007); 
                    INCLUDE_T94_tree = (SLAST)adaptor.dupNode(INCLUDE_T94);

                    root_1 = (SLAST)adaptor.becomeRoot(INCLUDE_T94_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement1011);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = INCLUDE_T94.startIndex;
                        int endIndex = INCLUDE_T94.endIndex;
                        retval.expr = new Include(startIndex, endIndex, (e!=null?e.expr:null), Include.IT_INCLUDE);
                      

                    }
                    break;
                case 22 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:749:5: ^( INCLUDE_ONCE_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INCLUDE_ONCE_T95=(SLAST)match(input,INCLUDE_ONCE_T,FOLLOW_INCLUDE_ONCE_T_in_topStatement1024); 
                    INCLUDE_ONCE_T95_tree = (SLAST)adaptor.dupNode(INCLUDE_ONCE_T95);

                    root_1 = (SLAST)adaptor.becomeRoot(INCLUDE_ONCE_T95_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement1028);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = INCLUDE_ONCE_T95.startIndex;
                        int endIndex = INCLUDE_ONCE_T95.endIndex;
                        retval.expr = new Include(startIndex, endIndex, (e!=null?e.expr:null), Include.IT_INCLUDE_ONCE);
                      

                    }
                    break;
                case 23 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:755:5: ^( REQUIRE_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    REQUIRE_T96=(SLAST)match(input,REQUIRE_T,FOLLOW_REQUIRE_T_in_topStatement1041); 
                    REQUIRE_T96_tree = (SLAST)adaptor.dupNode(REQUIRE_T96);

                    root_1 = (SLAST)adaptor.becomeRoot(REQUIRE_T96_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement1045);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = REQUIRE_T96.startIndex;
                        int endIndex = REQUIRE_T96.endIndex;
                        retval.expr = new Include(startIndex, endIndex, (e!=null?e.expr:null), Include.IT_REQUIRE);
                      

                    }
                    break;
                case 24 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:761:5: ^( REQUIRE_ONCE_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    REQUIRE_ONCE_T97=(SLAST)match(input,REQUIRE_ONCE_T,FOLLOW_REQUIRE_ONCE_T_in_topStatement1058); 
                    REQUIRE_ONCE_T97_tree = (SLAST)adaptor.dupNode(REQUIRE_ONCE_T97);

                    root_1 = (SLAST)adaptor.becomeRoot(REQUIRE_ONCE_T97_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_topStatement1062);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = REQUIRE_ONCE_T97.startIndex;
                        int endIndex = REQUIRE_ONCE_T97.endIndex;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:772:1: foreach_variable returns [Expression expr] : ( REF_T )? variable ;
    public final TreePHP.foreach_variable_return foreach_variable() throws RecognitionException {
        TreePHP.foreach_variable_return retval = new TreePHP.foreach_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST REF_T98=null;
        TreePHP.variable_return variable99 = null;


        SLAST REF_T98_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:778:3: ( ( REF_T )? variable )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:778:5: ( REF_T )? variable
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:778:5: ( REF_T )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==REF_T) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:778:5: REF_T
                    {
                    _last = (SLAST)input.LT(1);
                    REF_T98=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_foreach_variable1093); 
                    REF_T98_tree = (SLAST)adaptor.dupNode(REF_T98);

                    adaptor.addChild(root_0, REF_T98_tree);


                    }
                    break;

            }

            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_variable_in_foreach_variable1096);
            variable99=variable();

            state._fsp--;

            adaptor.addChild(root_0, variable99.getTree());

                retval.expr = (variable99!=null?variable99.var:null);
              

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:785:1: use_filename : ( STRINGLITERAL | QUOTE_STRING );
    public final TreePHP.use_filename_return use_filename() throws RecognitionException {
        TreePHP.use_filename_return retval = new TreePHP.use_filename_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST set100=null;

        SLAST set100_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:786:3: ( STRINGLITERAL | QUOTE_STRING )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            set100=(SLAST)input.LT(1);
            if ( (input.LA(1)>=STRINGLITERAL && input.LA(1)<=QUOTE_STRING) ) {
                input.consume();

                set100_tree = (SLAST)adaptor.dupNode(set100);

                adaptor.addChild(root_0, set100_tree);

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:790:1: variable_list returns [List variableList] : ( variable )+ ;
    public final TreePHP.variable_list_return variable_list() throws RecognitionException {
        variable_list_stack.push(new variable_list_scope());
        TreePHP.variable_list_return retval = new TreePHP.variable_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.variable_return variable101 = null;




          ((variable_list_scope)variable_list_stack.peek()).varList = new LinkedList();
          inVarList = true;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:801:3: ( ( variable )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:801:5: ( variable )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:801:5: ( variable )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:801:5: variable
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_variable_in_variable_list1156);
            	    variable101=variable();

            	    state._fsp--;

            	    adaptor.addChild(root_0, variable101.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:808:1: fully_qualified_class_name_list returns [List list] : ( fully_qualified_class_name )+ ;
    public final TreePHP.fully_qualified_class_name_list_return fully_qualified_class_name_list() throws RecognitionException {
        fully_qualified_class_name_list_stack.push(new fully_qualified_class_name_list_scope());
        TreePHP.fully_qualified_class_name_list_return retval = new TreePHP.fully_qualified_class_name_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name102 = null;




          ((fully_qualified_class_name_list_scope)fully_qualified_class_name_list_stack.peek()).nameList = new LinkedList();
          inNameList = true;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:819:3: ( ( fully_qualified_class_name )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:819:5: ( fully_qualified_class_name )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:819:5: ( fully_qualified_class_name )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:819:5: fully_qualified_class_name
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1194);
            	    fully_qualified_class_name102=fully_qualified_class_name();

            	    state._fsp--;

            	    adaptor.addChild(root_0, fully_qualified_class_name102.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:826:1: fully_qualified_class_name returns [String name, TypeReference type, SimpleReference simpleRef, StaticConstantAccess constant] : ( ^(d= DOMAIN_T f= fully_qualified_class_name IDENTIFIER ) ( DOMAIN_T )? | IDENTIFIER ( DOMAIN_T )? );
    public final TreePHP.fully_qualified_class_name_return fully_qualified_class_name() throws RecognitionException {
        TreePHP.fully_qualified_class_name_return retval = new TreePHP.fully_qualified_class_name_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST d=null;
        SLAST IDENTIFIER103=null;
        SLAST DOMAIN_T104=null;
        SLAST IDENTIFIER105=null;
        SLAST DOMAIN_T106=null;
        TreePHP.fully_qualified_class_name_return f = null;


        SLAST d_tree=null;
        SLAST IDENTIFIER103_tree=null;
        SLAST DOMAIN_T104_tree=null;
        SLAST IDENTIFIER105_tree=null;
        SLAST DOMAIN_T106_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:827:3: ( ^(d= DOMAIN_T f= fully_qualified_class_name IDENTIFIER ) ( DOMAIN_T )? | IDENTIFIER ( DOMAIN_T )? )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:827:5: ^(d= DOMAIN_T f= fully_qualified_class_name IDENTIFIER ) ( DOMAIN_T )?
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    d=(SLAST)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name1221); 
                    d_tree = (SLAST)adaptor.dupNode(d);

                    root_1 = (SLAST)adaptor.becomeRoot(d_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name1225);
                    f=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_1, f.getTree());
                    _last = (SLAST)input.LT(1);
                    IDENTIFIER103=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name1227); 
                    IDENTIFIER103_tree = (SLAST)adaptor.dupNode(IDENTIFIER103);

                    adaptor.addChild(root_1, IDENTIFIER103_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:827:59: ( DOMAIN_T )?
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
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:827:59: DOMAIN_T
                            {
                            _last = (SLAST)input.LT(1);
                            DOMAIN_T104=(SLAST)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name1230); 
                            DOMAIN_T104_tree = (SLAST)adaptor.dupNode(DOMAIN_T104);

                            adaptor.addChild(root_0, DOMAIN_T104_tree);


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
                          CommonToken token = (CommonToken)IDENTIFIER103.token;
                          int varLeft = token.getStartIndex();
                          int varRight = token.getStopIndex() + 1;
                          retval.type = type;
                          retval.simpleRef = new SimpleReference(varLeft, varRight, (IDENTIFIER103!=null?IDENTIFIER103.getText():null));
                        }
                        else {
                          type = retval.type;
                        }
                          
                        CommonToken token = (CommonToken)IDENTIFIER103.token;
                        int varLeft = token.getStartIndex();
                        int varRight = token.getStopIndex() + 1;
                        ConstantReference constRef = new ConstantReference(varLeft, varRight, (IDENTIFIER103!=null?IDENTIFIER103.getText():null));
                        retval.constant = new StaticConstantAccess(startIndex, endIndex, type, constRef);
                        
                        if (inNameList) {
                          ((fully_qualified_class_name_list_scope)fully_qualified_class_name_list_stack.peek()).nameList.add(type);
                        }
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:861:5: IDENTIFIER ( DOMAIN_T )?
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    IDENTIFIER105=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_fully_qualified_class_name1241); 
                    IDENTIFIER105_tree = (SLAST)adaptor.dupNode(IDENTIFIER105);

                    adaptor.addChild(root_0, IDENTIFIER105_tree);

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:861:16: ( DOMAIN_T )?
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
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:861:16: DOMAIN_T
                            {
                            _last = (SLAST)input.LT(1);
                            DOMAIN_T106=(SLAST)match(input,DOMAIN_T,FOLLOW_DOMAIN_T_in_fully_qualified_class_name1243); 
                            DOMAIN_T106_tree = (SLAST)adaptor.dupNode(DOMAIN_T106);

                            adaptor.addChild(root_0, DOMAIN_T106_tree);


                            }
                            break;

                    }


                        retval.name = (IDENTIFIER105!=null?IDENTIFIER105.getText():null);
                        int typeLeft = ((CommonToken)IDENTIFIER105.token).getStartIndex();
                        int typeRight = ((CommonToken)IDENTIFIER105.token).getStopIndex() + 1;

                        retval.type = new TypeReference(typeLeft, typeRight, (IDENTIFIER105!=null?IDENTIFIER105.getText():null));
                        
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:876:1: static_var_list returns [List staticVarList] : ( static_var_element )+ ;
    public final TreePHP.static_var_list_return static_var_list() throws RecognitionException {
        static_var_list_stack.push(new static_var_list_scope());
        TreePHP.static_var_list_return retval = new TreePHP.static_var_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.static_var_element_return static_var_element107 = null;




          ((static_var_list_scope)static_var_list_stack.peek()).varList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:883:3: ( ( static_var_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:883:5: ( static_var_element )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:883:5: ( static_var_element )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:883:5: static_var_element
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_static_var_element_in_static_var_list1277);
            	    static_var_element107=static_var_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, static_var_element107.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:889:1: static_var_element : ( pure_variable | ^( EQUAL_T pure_variable scalar ) );
    public final TreePHP.static_var_element_return static_var_element() throws RecognitionException {
        TreePHP.static_var_element_return retval = new TreePHP.static_var_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST EQUAL_T109=null;
        TreePHP.pure_variable_return pure_variable108 = null;

        TreePHP.pure_variable_return pure_variable110 = null;

        TreePHP.scalar_return scalar111 = null;


        SLAST EQUAL_T109_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:890:3: ( pure_variable | ^( EQUAL_T pure_variable scalar ) )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:890:5: pure_variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_pure_variable_in_static_var_element1295);
                    pure_variable108=pure_variable();

                    state._fsp--;

                    adaptor.addChild(root_0, pure_variable108.getTree());

                        int varNameLeft = (pure_variable108!=null?((SLAST)pure_variable108.tree):null).startIndex;
                        int varNameRight = (pure_variable108!=null?((SLAST)pure_variable108.tree):null).endIndex + 2;
                        String varName = (pure_variable108!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(pure_variable108.start),
                      input.getTreeAdaptor().getTokenStopIndex(pure_variable108.start))):null);
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:906:5: ^( EQUAL_T pure_variable scalar )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EQUAL_T109=(SLAST)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_static_var_element1306); 
                    EQUAL_T109_tree = (SLAST)adaptor.dupNode(EQUAL_T109);

                    root_1 = (SLAST)adaptor.becomeRoot(EQUAL_T109_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_pure_variable_in_static_var_element1308);
                    pure_variable110=pure_variable();

                    state._fsp--;

                    adaptor.addChild(root_1, pure_variable110.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_static_var_element1310);
                    scalar111=scalar();

                    state._fsp--;

                    adaptor.addChild(root_1, scalar111.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EQUAL_T109.startIndex;
                        int endIndex = EQUAL_T109.endIndex + 1;
                        int varNameLeft = (pure_variable110!=null?((SLAST)pure_variable110.tree):null).startIndex;
                        int varNameRight = (pure_variable110!=null?((SLAST)pure_variable110.tree):null).endIndex + 2;
                        String varName = (pure_variable110!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(pure_variable110.start),
                      input.getTreeAdaptor().getTokenStopIndex(pure_variable110.start))):null);
                        Expression expr = (scalar111!=null?scalar111.expr:null);
                        
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:928:1: if_stat returns [Statement stat] : ^( IF_T ^( CONDITION expression ) ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? ) ) ;
    public final TreePHP.if_stat_return if_stat() throws RecognitionException {
        if_stat_stack.push(new if_stat_scope());
        TreePHP.if_stat_return retval = new TreePHP.if_stat_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST IF_T112=null;
        SLAST CONDITION113=null;
        SLAST ELSE_T117=null;
        TreePHP.expression_return expression114 = null;

        TreePHP.inner_statement_list_return inner_statement_list115 = null;

        TreePHP.else_if_stat_return else_if_stat116 = null;

        TreePHP.statement_return statement118 = null;


        SLAST IF_T112_tree=null;
        SLAST CONDITION113_tree=null;
        SLAST ELSE_T117_tree=null;


          ((if_stat_scope)if_stat_stack.peek()).conditionList = new LinkedList();
          ((if_stat_scope)if_stat_stack.peek()).statementList = new LinkedList();
          ((if_stat_scope)if_stat_stack.peek()).tokenList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:939:3: ( ^( IF_T ^( CONDITION expression ) ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? ) ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:939:5: ^( IF_T ^( CONDITION expression ) ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? ) )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            IF_T112=(SLAST)match(input,IF_T,FOLLOW_IF_T_in_if_stat1344); 
            IF_T112_tree = (SLAST)adaptor.dupNode(IF_T112);

            root_1 = (SLAST)adaptor.becomeRoot(IF_T112_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_2 = _last;
            SLAST _first_2 = null;
            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            CONDITION113=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_if_stat1348); 
            CONDITION113_tree = (SLAST)adaptor.dupNode(CONDITION113);

            root_2 = (SLAST)adaptor.becomeRoot(CONDITION113_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_expression_in_if_stat1350);
            expression114=expression();

            state._fsp--;

            adaptor.addChild(root_2, expression114.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:940:5: ( ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:941:7: ( inner_statement_list )? ( else_if_stat )* ( ^( ELSE_T statement ) )?
            {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:941:7: ( inner_statement_list )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==METHOD_DECL||LA39_0==STATEMENT||LA39_0==CLASS_T||LA39_0==INTERFACE_T||LA39_0==173) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:941:7: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_if_stat1366);
                    inner_statement_list115=inner_statement_list();

                    state._fsp--;

                    adaptor.addChild(root_1, inner_statement_list115.getTree());

                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:942:7: ( else_if_stat )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==ELSEIF_T) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:942:7: else_if_stat
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_else_if_stat_in_if_stat1375);
            	    else_if_stat116=else_if_stat();

            	    state._fsp--;

            	    adaptor.addChild(root_1, else_if_stat116.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:942:21: ( ^( ELSE_T statement ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ELSE_T) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:942:22: ^( ELSE_T statement )
                    {
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ELSE_T117=(SLAST)match(input,ELSE_T,FOLLOW_ELSE_T_in_if_stat1380); 
                    ELSE_T117_tree = (SLAST)adaptor.dupNode(ELSE_T117);

                    root_2 = (SLAST)adaptor.becomeRoot(ELSE_T117_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_statement_in_if_stat1382);
                    statement118=statement();

                    state._fsp--;

                    adaptor.addChild(root_2, statement118.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    }
                    break;

            }


            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                  int startIndex = IF_T112.startIndex;
                  int endIndex = IF_T112.endIndex + 1;
                  System.out.println("if:" + startIndex + " " + endIndex);
                  Expression innerCondition = null; 
                  Statement trueStatement = null;
                  Statement falseStatement = (statement118!=null?statement118.stat:null);
                  Iterator iterCond = ((if_stat_scope)if_stat_stack.peek()).conditionList.iterator(),
                          iterIfTrueStat = ((if_stat_scope)if_stat_stack.peek()).statementList.iterator(),
                          iterTokenList = ((if_stat_scope)if_stat_stack.peek()).tokenList.iterator();
                  while (iterCond.hasNext()) {
                     innerCondition = (Expression)iterCond.next();
                     trueStatement = (Statement)iterIfTrueStat.next();
                     int start = (Integer)iterTokenList.next();
                     falseStatement = new IfStatement(start, trueStatement.sourceEnd(), innerCondition, trueStatement, falseStatement);
                  }
                  
                  int sid = ((CommonToken)(inner_statement_list115!=null?((SLAST)inner_statement_list115.tree):null).token).getStartIndex();
                  int eid = ((CommonToken)(inner_statement_list115!=null?((SLAST)inner_statement_list115.tree):null).token).getStopIndex() + 1;
                  Block block = new Block(sid, eid, new LinkedList());
                  if ((inner_statement_list115!=null?inner_statement_list115.innerStatementList:null) != null) {
                    block.getStatements().clear();
                    block.acceptStatements((inner_statement_list115!=null?inner_statement_list115.innerStatementList:null));
                  }
                  retval.stat = new IfStatement(startIndex, endIndex, (expression114!=null?expression114.expr:null), block, falseStatement);  
                

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:972:1: else_if_stat : ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) ;
    public final TreePHP.else_if_stat_return else_if_stat() throws RecognitionException {
        TreePHP.else_if_stat_return retval = new TreePHP.else_if_stat_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST ELSEIF_T119=null;
        SLAST CONDITION120=null;
        TreePHP.expression_return expression121 = null;

        TreePHP.inner_statement_list_return inner_statement_list122 = null;


        SLAST ELSEIF_T119_tree=null;
        SLAST CONDITION120_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:973:3: ( ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:973:5: ^( ELSEIF_T ^( CONDITION expression ) ( inner_statement_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            ELSEIF_T119=(SLAST)match(input,ELSEIF_T,FOLLOW_ELSEIF_T_in_else_if_stat1412); 
            ELSEIF_T119_tree = (SLAST)adaptor.dupNode(ELSEIF_T119);

            root_1 = (SLAST)adaptor.becomeRoot(ELSEIF_T119_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_2 = _last;
            SLAST _first_2 = null;
            SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            CONDITION120=(SLAST)match(input,CONDITION,FOLLOW_CONDITION_in_else_if_stat1415); 
            CONDITION120_tree = (SLAST)adaptor.dupNode(CONDITION120);

            root_2 = (SLAST)adaptor.becomeRoot(CONDITION120_tree, root_2);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_expression_in_else_if_stat1417);
            expression121=expression();

            state._fsp--;

            adaptor.addChild(root_2, expression121.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:973:40: ( inner_statement_list )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==METHOD_DECL||LA42_0==STATEMENT||LA42_0==CLASS_T||LA42_0==INTERFACE_T||LA42_0==173) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:973:40: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_else_if_stat1420);
                    inner_statement_list122=inner_statement_list();

                    state._fsp--;

                    adaptor.addChild(root_1, inner_statement_list122.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                int startIndex = ELSEIF_T119.startIndex;
                int endIndex = ELSEIF_T119.endIndex;
                ((if_stat_scope)if_stat_stack.peek()).conditionList.add((expression121!=null?expression121.expr:null));
                
                Block block = new Block(startIndex, endIndex, new LinkedList());
                if ((inner_statement_list122!=null?inner_statement_list122.innerStatementList:null) != null) {
                  block.getStatements().clear();
                  block.acceptStatements((inner_statement_list122!=null?inner_statement_list122.innerStatementList:null));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:990:1: switch_case_list returns [Block block] : ( case_list )+ ;
    public final TreePHP.switch_case_list_return switch_case_list() throws RecognitionException {
        switch_case_list_stack.push(new switch_case_list_scope());
        TreePHP.switch_case_list_return retval = new TreePHP.switch_case_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.case_list_return case_list123 = null;




          ((switch_case_list_scope)switch_case_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:997:3: ( ( case_list )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:997:5: ( case_list )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:997:5: ( case_list )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:997:5: case_list
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_case_list_in_switch_case_list1454);
            	    case_list123=case_list();

            	    state._fsp--;

            	    adaptor.addChild(root_0, case_list123.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1008:1: case_list : ( ^( CASE_T e= expression ( inner_statement_list )? ) | ^( DEFAULT_T ( inner_statement_list )? ) );
    public final TreePHP.case_list_return case_list() throws RecognitionException {
        TreePHP.case_list_return retval = new TreePHP.case_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CASE_T124=null;
        SLAST DEFAULT_T126=null;
        TreePHP.expression_return e = null;

        TreePHP.inner_statement_list_return inner_statement_list125 = null;

        TreePHP.inner_statement_list_return inner_statement_list127 = null;


        SLAST CASE_T124_tree=null;
        SLAST DEFAULT_T126_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1009:3: ( ^( CASE_T e= expression ( inner_statement_list )? ) | ^( DEFAULT_T ( inner_statement_list )? ) )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1009:5: ^( CASE_T e= expression ( inner_statement_list )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CASE_T124=(SLAST)match(input,CASE_T,FOLLOW_CASE_T_in_case_list1473); 
                    CASE_T124_tree = (SLAST)adaptor.dupNode(CASE_T124);

                    root_1 = (SLAST)adaptor.becomeRoot(CASE_T124_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_case_list1477);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1009:27: ( inner_statement_list )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==METHOD_DECL||LA44_0==STATEMENT||LA44_0==CLASS_T||LA44_0==INTERFACE_T||LA44_0==173) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1009:27: inner_statement_list
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_inner_statement_list_in_case_list1479);
                            inner_statement_list125=inner_statement_list();

                            state._fsp--;

                            adaptor.addChild(root_1, inner_statement_list125.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = CASE_T124.startIndex;
                        int endIndex = CASE_T124.endIndex + 1;
                        List list = new LinkedList();
                        if ((inner_statement_list125!=null?inner_statement_list125.innerStatementList:null) != null) {
                          list = (inner_statement_list125!=null?inner_statement_list125.innerStatementList:null);
                        }
                        SwitchCase switchCase = new SwitchCase(startIndex, endIndex, (e!=null?e.expr:null), list, false);
                        ((switch_case_list_scope)switch_case_list_stack.peek()).list.add(switchCase);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1020:5: ^( DEFAULT_T ( inner_statement_list )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DEFAULT_T126=(SLAST)match(input,DEFAULT_T,FOLLOW_DEFAULT_T_in_case_list1494); 
                    DEFAULT_T126_tree = (SLAST)adaptor.dupNode(DEFAULT_T126);

                    root_1 = (SLAST)adaptor.becomeRoot(DEFAULT_T126_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1020:17: ( inner_statement_list )?
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==METHOD_DECL||LA45_0==STATEMENT||LA45_0==CLASS_T||LA45_0==INTERFACE_T||LA45_0==173) ) {
                            alt45=1;
                        }
                        switch (alt45) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1020:17: inner_statement_list
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_inner_statement_list_in_case_list1496);
                                inner_statement_list127=inner_statement_list();

                                state._fsp--;

                                adaptor.addChild(root_1, inner_statement_list127.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DEFAULT_T126.startIndex;
                        int endIndex = DEFAULT_T126.endIndex + 1;
                        List list = new LinkedList();
                        if ((inner_statement_list127!=null?inner_statement_list127.innerStatementList:null) != null) {
                          list = (inner_statement_list127!=null?inner_statement_list127.innerStatementList:null);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1033:1: catch_branch_list returns [List catchList] : ( catch_branch )+ ;
    public final TreePHP.catch_branch_list_return catch_branch_list() throws RecognitionException {
        catch_branch_list_stack.push(new catch_branch_list_scope());
        TreePHP.catch_branch_list_return retval = new TreePHP.catch_branch_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.catch_branch_return catch_branch128 = null;




          ((catch_branch_list_scope)catch_branch_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1040:3: ( ( catch_branch )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1040:5: ( catch_branch )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1040:5: ( catch_branch )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1040:5: catch_branch
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_catch_branch_in_catch_branch_list1530);
            	    catch_branch128=catch_branch();

            	    state._fsp--;

            	    adaptor.addChild(root_0, catch_branch128.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1046:1: catch_branch : ^( CATCH_T fully_qualified_class_name variable block ) ;
    public final TreePHP.catch_branch_return catch_branch() throws RecognitionException {
        TreePHP.catch_branch_return retval = new TreePHP.catch_branch_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CATCH_T129=null;
        TreePHP.fully_qualified_class_name_return fully_qualified_class_name130 = null;

        TreePHP.variable_return variable131 = null;

        TreePHP.block_return block132 = null;


        SLAST CATCH_T129_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1047:3: ( ^( CATCH_T fully_qualified_class_name variable block ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1047:5: ^( CATCH_T fully_qualified_class_name variable block )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            CATCH_T129=(SLAST)match(input,CATCH_T,FOLLOW_CATCH_T_in_catch_branch1552); 
            CATCH_T129_tree = (SLAST)adaptor.dupNode(CATCH_T129);

            root_1 = (SLAST)adaptor.becomeRoot(CATCH_T129_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_fully_qualified_class_name_in_catch_branch1554);
            fully_qualified_class_name130=fully_qualified_class_name();

            state._fsp--;

            adaptor.addChild(root_1, fully_qualified_class_name130.getTree());
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_variable_in_catch_branch1556);
            variable131=variable();

            state._fsp--;

            adaptor.addChild(root_1, variable131.getTree());
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_block_in_catch_branch1558);
            block132=block();

            state._fsp--;

            adaptor.addChild(root_1, block132.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                int startIndex = CATCH_T129.startIndex;
                int endIndex = CATCH_T129.endIndex + 1;
                CatchClause catchClause = new CatchClause(startIndex, endIndex, (fully_qualified_class_name130!=null?fully_qualified_class_name130.type:null), (VariableReference)(variable131!=null?variable131.var:null), (Block)(block132!=null?block132.stat:null));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1056:1: for_statement returns [Statement block] : ( inner_statement_list )? ;
    public final TreePHP.for_statement_return for_statement() throws RecognitionException {
        TreePHP.for_statement_return retval = new TreePHP.for_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.inner_statement_list_return inner_statement_list133 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1057:2: ( ( inner_statement_list )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1057:4: ( inner_statement_list )?
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1057:4: ( inner_statement_list )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==METHOD_DECL||LA48_0==STATEMENT||LA48_0==CLASS_T||LA48_0==INTERFACE_T||LA48_0==173) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1057:4: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_for_statement1579);
                    inner_statement_list133=inner_statement_list();

                    state._fsp--;

                    adaptor.addChild(root_0, inner_statement_list133.getTree());

                    }
                    break;

            }


                  int startIndex = -1;
                  int endIndex = -1;
                  Block block = new Block(startIndex, endIndex, new LinkedList());
                  if ((inner_statement_list133!=null?inner_statement_list133.innerStatementList:null) != null) {
                    block.getStatements().clear();
                    block.acceptStatements((inner_statement_list133!=null?inner_statement_list133.innerStatementList:null));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1072:1: while_statement returns [Statement block] : ( inner_statement_list )? ;
    public final TreePHP.while_statement_return while_statement() throws RecognitionException {
        TreePHP.while_statement_return retval = new TreePHP.while_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.inner_statement_list_return inner_statement_list134 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1073:3: ( ( inner_statement_list )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1073:5: ( inner_statement_list )?
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1073:5: ( inner_statement_list )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==METHOD_DECL||LA49_0==STATEMENT||LA49_0==CLASS_T||LA49_0==INTERFACE_T||LA49_0==173) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1073:5: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_while_statement1602);
                    inner_statement_list134=inner_statement_list();

                    state._fsp--;

                    adaptor.addChild(root_0, inner_statement_list134.getTree());

                    }
                    break;

            }


                  int startIndex = -1;
                  int endIndex = -1;
                  Block block = new Block(startIndex, endIndex, new LinkedList());
                  if ((inner_statement_list134!=null?inner_statement_list134.innerStatementList:null) != null) {
                    block.getStatements().clear();
                    block.acceptStatements((inner_statement_list134!=null?inner_statement_list134.innerStatementList:null));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1086:1: foreach_statement returns [Statement block] : ( inner_statement_list )? ;
    public final TreePHP.foreach_statement_return foreach_statement() throws RecognitionException {
        TreePHP.foreach_statement_return retval = new TreePHP.foreach_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.inner_statement_list_return inner_statement_list135 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1087:3: ( ( inner_statement_list )? )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1087:5: ( inner_statement_list )?
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1087:5: ( inner_statement_list )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==METHOD_DECL||LA50_0==STATEMENT||LA50_0==CLASS_T||LA50_0==INTERFACE_T||LA50_0==173) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1087:5: inner_statement_list
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_inner_statement_list_in_foreach_statement1627);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1100:1: declare_statement returns [Statement block] : ^( BLOCK ( inner_statement_list )? ) ;
    public final TreePHP.declare_statement_return declare_statement() throws RecognitionException {
        TreePHP.declare_statement_return retval = new TreePHP.declare_statement_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST BLOCK136=null;
        TreePHP.inner_statement_list_return inner_statement_list137 = null;


        SLAST BLOCK136_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1101:3: ( ^( BLOCK ( inner_statement_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1101:5: ^( BLOCK ( inner_statement_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            BLOCK136=(SLAST)match(input,BLOCK,FOLLOW_BLOCK_in_declare_statement1654); 
            BLOCK136_tree = (SLAST)adaptor.dupNode(BLOCK136);

            root_1 = (SLAST)adaptor.becomeRoot(BLOCK136_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1101:13: ( inner_statement_list )?
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==METHOD_DECL||LA51_0==STATEMENT||LA51_0==CLASS_T||LA51_0==INTERFACE_T||LA51_0==173) ) {
                    alt51=1;
                }
                switch (alt51) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1101:13: inner_statement_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_inner_statement_list_in_declare_statement1656);
                        inner_statement_list137=inner_statement_list();

                        state._fsp--;

                        adaptor.addChild(root_1, inner_statement_list137.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1114:1: parameter_list returns [List parameterList] : ( parameter )+ ;
    public final TreePHP.parameter_list_return parameter_list() throws RecognitionException {
        parameter_list_stack.push(new parameter_list_scope());
        TreePHP.parameter_list_return retval = new TreePHP.parameter_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.parameter_return parameter138 = null;




          ((parameter_list_scope)parameter_list_stack.peek()).paramList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1121:3: ( ( parameter )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1121:5: ( parameter )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1121:5: ( parameter )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1121:5: parameter
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_parameter_in_parameter_list1692);
            	    parameter138=parameter();

            	    state._fsp--;

            	    adaptor.addChild(root_0, parameter138.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1127:1: parameter : ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) ;
    public final TreePHP.parameter_return parameter() throws RecognitionException {
        TreePHP.parameter_return retval = new TreePHP.parameter_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST PARAMETER139=null;
        SLAST TYPE140=null;
        SLAST CONST_T142=null;
        TreePHP.parameter_type_return parameter_type141 = null;

        TreePHP.pure_variable_return pure_variable143 = null;

        TreePHP.scalar_return scalar144 = null;


        SLAST PARAMETER139_tree=null;
        SLAST TYPE140_tree=null;
        SLAST CONST_T142_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1128:3: ( ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1128:5: ^( PARAMETER ( ^( TYPE parameter_type ) )? ( CONST_T )? pure_variable ( scalar )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            PARAMETER139=(SLAST)match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter1713); 
            PARAMETER139_tree = (SLAST)adaptor.dupNode(PARAMETER139);

            root_1 = (SLAST)adaptor.becomeRoot(PARAMETER139_tree, root_1);



            match(input, Token.DOWN, null); 
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1128:17: ( ^( TYPE parameter_type ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==TYPE) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1128:18: ^( TYPE parameter_type )
                    {
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    TYPE140=(SLAST)match(input,TYPE,FOLLOW_TYPE_in_parameter1717); 
                    TYPE140_tree = (SLAST)adaptor.dupNode(TYPE140);

                    root_2 = (SLAST)adaptor.becomeRoot(TYPE140_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_parameter_type_in_parameter1719);
                    parameter_type141=parameter_type();

                    state._fsp--;

                    adaptor.addChild(root_2, parameter_type141.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1128:43: ( CONST_T )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==CONST_T) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1128:43: CONST_T
                    {
                    _last = (SLAST)input.LT(1);
                    CONST_T142=(SLAST)match(input,CONST_T,FOLLOW_CONST_T_in_parameter1724); 
                    CONST_T142_tree = (SLAST)adaptor.dupNode(CONST_T142);

                    adaptor.addChild(root_1, CONST_T142_tree);


                    }
                    break;

            }

            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_pure_variable_in_parameter1727);
            pure_variable143=pure_variable();

            state._fsp--;

            adaptor.addChild(root_1, pure_variable143.getTree());
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1128:66: ( scalar )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==SCALAR) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1128:66: scalar
                    {
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_parameter1729);
                    scalar144=scalar();

                    state._fsp--;

                    adaptor.addChild(root_1, scalar144.getTree());

                    }
                    break;

            }


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                FormalParameter RESULT = null;
                TypeReference classType = (parameter_type141!=null?parameter_type141.type:null);
                System.out.println("type:" + classType);
                int varLeft = (pure_variable143!=null?((SLAST)pure_variable143.tree):null).startIndex;
                int varRight = (pure_variable143!=null?((SLAST)pure_variable143.tree):null).endIndex + 1;
                String varName = (pure_variable143!=null?pure_variable143.str:null);
                
                int startIndex = PARAMETER139.startIndex;
                int endIndex = PARAMETER139.endIndex + 1;
                if ((pure_variable143!=null?pure_variable143.isRef:null)) {
                  varLeft++;
                }
                VariableReference var = new VariableReference(varLeft, varRight, varName, PHPVariableKind.LOCAL);
                
                System.out.println("variable par:" + var);
                
                if ((scalar144!=null?scalar144.expr:null) == null) {
                  if ((pure_variable143!=null?pure_variable143.isRef:null)) {
                    ((parameter_list_scope)parameter_list_stack.peek()).paramList.add(new FormalParameterByReference(startIndex, endIndex, classType, var));
                  }
                  else {
                    ((parameter_list_scope)parameter_list_stack.peek()).paramList.add(new FormalParameter(startIndex, endIndex, classType, var));
                  }
                }
                else {
                  if ((pure_variable143!=null?pure_variable143.isRef:null)) {
                    ((parameter_list_scope)parameter_list_stack.peek()).paramList.add(new FormalParameterByReference(startIndex, endIndex, classType, var, (scalar144!=null?scalar144.expr:null)));
                  }
                  else {
                    ((parameter_list_scope)parameter_list_stack.peek()).paramList.add(new FormalParameter(startIndex, endIndex, classType, var, (scalar144!=null?scalar144.expr:null)));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1165:1: parameter_type returns [TypeReference type] : ( fully_qualified_class_name | cast_option );
    public final TreePHP.parameter_type_return parameter_type() throws RecognitionException {
        TreePHP.parameter_type_return retval = new TreePHP.parameter_type_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name145 = null;

        TreePHP.cast_option_return cast_option146 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1166:3: ( fully_qualified_class_name | cast_option )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==IDENTIFIER||LA56_0==DOMAIN_T) ) {
                alt56=1;
            }
            else if ( ((LA56_0>=UNSET_T && LA56_0<=CLONE_T)||(LA56_0>=180 && LA56_0<=188)) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1166:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_parameter_type1754);
                    fully_qualified_class_name145=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_0, fully_qualified_class_name145.getTree());

                        retval.type = (fully_qualified_class_name145!=null?fully_qualified_class_name145.type:null);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1170:5: cast_option
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_cast_option_in_parameter_type1764);
                    cast_option146=cast_option();

                    state._fsp--;

                    adaptor.addChild(root_0, cast_option146.getTree());

                        int startIndex = ((CommonToken)(cast_option146!=null?((SLAST)cast_option146.tree):null).token).getStartIndex();
                        int endIndex = ((CommonToken)(cast_option146!=null?((SLAST)cast_option146.tree):null).token).getStopIndex() + 1;
                        retval.type = new TypeReference(startIndex, endIndex, (cast_option146!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(cast_option146.start),
                      input.getTreeAdaptor().getTokenStopIndex(cast_option146.start))):null));
                      

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1178:1: variable_modifiers : ( 'var' | modifier );
    public final TreePHP.variable_modifiers_return variable_modifiers() throws RecognitionException {
        TreePHP.variable_modifiers_return retval = new TreePHP.variable_modifiers_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST string_literal147=null;
        TreePHP.modifier_return modifier148 = null;


        SLAST string_literal147_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1179:3: ( 'var' | modifier )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==176) ) {
                alt57=1;
            }
            else if ( (LA57_0==VAR_DECL||LA57_0==IDENTIFIER||LA57_0==REF_T||LA57_0==STATIC_T||LA57_0==EQUAL_T||(LA57_0>=174 && LA57_0<=175)||(LA57_0>=177 && LA57_0<=179)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1179:5: 'var'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal147=(SLAST)match(input,176,FOLLOW_176_in_variable_modifiers1782); 
                    string_literal147_tree = (SLAST)adaptor.dupNode(string_literal147);

                    adaptor.addChild(root_0, string_literal147_tree);


                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1180:5: modifier
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_modifier_in_variable_modifiers1788);
                    modifier148=modifier();

                    state._fsp--;

                    adaptor.addChild(root_0, modifier148.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1183:1: modifier returns [ModifierDocPair modifierVar] : ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )* ;
    public final TreePHP.modifier_return modifier() throws RecognitionException {
        modifier_stack.push(new modifier_scope());
        TreePHP.modifier_return retval = new TreePHP.modifier_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST string_literal149=null;
        SLAST string_literal150=null;
        SLAST string_literal151=null;
        SLAST string_literal152=null;
        SLAST string_literal153=null;
        SLAST string_literal154=null;

        SLAST string_literal149_tree=null;
        SLAST string_literal150_tree=null;
        SLAST string_literal151_tree=null;
        SLAST string_literal152_tree=null;
        SLAST string_literal153_tree=null;
        SLAST string_literal154_tree=null;


          ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccDefault, null);

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1190:3: ( ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1190:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )*
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1190:5: ( 'public' | 'protected' | 'private' | 'static' | 'abstract' | 'final' )*
            loop58:
            do {
                int alt58=7;
                switch ( input.LA(1) ) {
                case 177:
                    {
                    alt58=1;
                    }
                    break;
                case 178:
                    {
                    alt58=2;
                    }
                    break;
                case 179:
                    {
                    alt58=3;
                    }
                    break;
                case STATIC_T:
                    {
                    alt58=4;
                    }
                    break;
                case 174:
                    {
                    alt58=5;
                    }
                    break;
                case 175:
                    {
                    alt58=6;
                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1190:6: 'public'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal149=(SLAST)match(input,177,FOLLOW_177_in_modifier1816); 
            	    string_literal149_tree = (SLAST)adaptor.dupNode(string_literal149);

            	    adaptor.addChild(root_0, string_literal149_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccPublic, null);

            	    }
            	    break;
            	case 2 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1191:5: 'protected'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal150=(SLAST)match(input,178,FOLLOW_178_in_modifier1824); 
            	    string_literal150_tree = (SLAST)adaptor.dupNode(string_literal150);

            	    adaptor.addChild(root_0, string_literal150_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccProtected, null);

            	    }
            	    break;
            	case 3 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1192:5: 'private'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal151=(SLAST)match(input,179,FOLLOW_179_in_modifier1832); 
            	    string_literal151_tree = (SLAST)adaptor.dupNode(string_literal151);

            	    adaptor.addChild(root_0, string_literal151_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccPrivate, null);

            	    }
            	    break;
            	case 4 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1193:5: 'static'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal152=(SLAST)match(input,STATIC_T,FOLLOW_STATIC_T_in_modifier1840); 
            	    string_literal152_tree = (SLAST)adaptor.dupNode(string_literal152);

            	    adaptor.addChild(root_0, string_literal152_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccStatic, null);

            	    }
            	    break;
            	case 5 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1194:5: 'abstract'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal153=(SLAST)match(input,174,FOLLOW_174_in_modifier1849); 
            	    string_literal153_tree = (SLAST)adaptor.dupNode(string_literal153);

            	    adaptor.addChild(root_0, string_literal153_tree);

            	    ((modifier_scope)modifier_stack.peek()).m = new ModifierDocPair(Modifiers.AccAbstract, null);

            	    }
            	    break;
            	case 6 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1195:5: 'final'
            	    {
            	    _last = (SLAST)input.LT(1);
            	    string_literal154=(SLAST)match(input,175,FOLLOW_175_in_modifier1858); 
            	    string_literal154_tree = (SLAST)adaptor.dupNode(string_literal154);

            	    adaptor.addChild(root_0, string_literal154_tree);

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1202:1: directive returns [Object astNode] : ^( EQUAL_T IDENTIFIER expression ) ;
    public final TreePHP.directive_return directive() throws RecognitionException {
        TreePHP.directive_return retval = new TreePHP.directive_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST EQUAL_T155=null;
        SLAST IDENTIFIER156=null;
        TreePHP.expression_return expression157 = null;


        SLAST EQUAL_T155_tree=null;
        SLAST IDENTIFIER156_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1203:3: ( ^( EQUAL_T IDENTIFIER expression ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1203:5: ^( EQUAL_T IDENTIFIER expression )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            EQUAL_T155=(SLAST)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_directive1890); 
            EQUAL_T155_tree = (SLAST)adaptor.dupNode(EQUAL_T155);

            root_1 = (SLAST)adaptor.becomeRoot(EQUAL_T155_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            IDENTIFIER156=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_directive1892); 
            IDENTIFIER156_tree = (SLAST)adaptor.dupNode(IDENTIFIER156);

            adaptor.addChild(root_1, IDENTIFIER156_tree);

            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_expression_in_directive1894);
            expression157=expression();

            state._fsp--;

            adaptor.addChild(root_1, expression157.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                if (inClassStatementList) {
            	    int constNameleft = ((CommonToken)IDENTIFIER156.token).getStartIndex();
            	    int constNameright = ((CommonToken)IDENTIFIER156.token).getStopIndex() + 1;
            	    String constName = (IDENTIFIER156!=null?IDENTIFIER156.getText():null);
            	    int exprLeft = ((CommonToken)((expression157!=null?((SLAST)expression157.tree):null).token)).getStartIndex();
            	    int exprRight = ((CommonToken)((expression157!=null?((SLAST)expression157.tree):null).token)).getStopIndex() + 1;
            	    Expression expr = (expression157!=null?expression157.expr:null);
            	    
            	    ConstantReference constId = new ConstantReference(constNameleft, constNameright, constName);
            	    Object obj = new ASTNode[]{constId, expr};
            	    ((class_statement_scope)class_statement_stack.peek()).constList.add(obj);
            	  }
            	  else {
                  ((topStatement_scope)topStatement_stack.peek()).declareKey.add((IDENTIFIER156!=null?IDENTIFIER156.getText():null));
                  ((topStatement_scope)topStatement_stack.peek()).declareValue.add((expression157!=null?expression157.expr:null));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1224:1: expr_list returns [List exprList] : ( expression )+ ;
    public final TreePHP.expr_list_return expr_list() throws RecognitionException {
        expr_list_stack.push(new expr_list_scope());
        TreePHP.expr_list_return retval = new TreePHP.expr_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.expression_return expression158 = null;




          ((expr_list_scope)expr_list_stack.peek()).list = new LinkedList();
          inExprList = true;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1235:2: ( ( expression )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1235:4: ( expression )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1235:4: ( expression )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1235:4: expression
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_expression_in_expr_list1931);
            	    expression158=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression158.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1241:1: expression returns [Expression expr] : ( ^( EXPR etop= expression ) | ^( OR_T e1= expression e2= expression ) | ^( XOR_T e1= expression e2= expression ) | ^( AND_T e1= expression e2= expression ) | ^( EQUAL_T e1= expression e2= expression ) | ^( PLUS_EQ e1= expression e2= expression ) | ^( MINUS_EQ e1= expression e2= expression ) | ^( MUL_EQ e1= expression e2= expression ) | ^( DIV_EQ e1= expression e2= expression ) | ^( DOT_EQ e1= expression e2= expression ) | ^( PERCENT_EQ e1= expression e2= expression ) | ^( BIT_AND_EQ e1= expression e2= expression ) | ^( BIT_OR_EQ e1= expression e2= expression ) | ^( POWER_EQ e1= expression e2= expression ) | ^( LMOVE_EQ e1= expression e2= expression ) | ^( RMOVE_EQ e1= expression e2= expression ) | ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) ) | ^( LOGICAL_OR_T e1= expression e2= expression ) | ^( LOGICAL_AND_T e1= expression e2= expression ) | ^( BIT_OR_T e1= expression e2= expression ) | ^( POWER_T e1= expression e2= expression ) | ^( REF_T e1= expression e2= expression ) | ^( UNARY_EXPR unary_symbol_list e= expression ) | ^( DOT_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( LT_T e1= expression e2= expression ) | ^( MT_T e1= expression e2= expression ) | ^( LE_T e1= expression e2= expression ) | ^( ME_T e1= expression e2= expression ) | ^( LSHIFT_T e1= expression e2= expression ) | ^( RSHIFT_T e1= expression e2= expression ) | ^( PLUS_T e1= expression e2= expression ) | ^( MINUS_T e1= expression e2= expression ) | ^( MUL_T e1= expression e2= expression ) | ^( DIV_T e1= expression e2= expression ) | ^( PERCENT_T e1= expression e2= expression ) | ^( CAST_EXPR cast_option e= expression ) | ^( POSTFIX_EXPR e= expression plus_minus ) | ^( PREFIX_EXPR ( plus_minus )+ e= expression ) | ^( INSTANCEOF_T e= expression class_name_reference ) | ( AT_T )? variable | ( AT_T )? scalar | list_decl | ^( ARRAY_DECL ( array_pair_list )? ) | ^( NEW_T class_name_reference ) | ^( CLONE_T variable ) | ^( UNSET_T variable_list ) | BACKTRICKLITERAL | ^( PRINT_T e= expression ) );
    public final TreePHP.expression_return expression() throws RecognitionException {
        TreePHP.expression_return retval = new TreePHP.expression_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST EXPR159=null;
        SLAST OR_T160=null;
        SLAST XOR_T161=null;
        SLAST AND_T162=null;
        SLAST EQUAL_T163=null;
        SLAST PLUS_EQ164=null;
        SLAST MINUS_EQ165=null;
        SLAST MUL_EQ166=null;
        SLAST DIV_EQ167=null;
        SLAST DOT_EQ168=null;
        SLAST PERCENT_EQ169=null;
        SLAST BIT_AND_EQ170=null;
        SLAST BIT_OR_EQ171=null;
        SLAST POWER_EQ172=null;
        SLAST LMOVE_EQ173=null;
        SLAST RMOVE_EQ174=null;
        SLAST QUESTION_T175=null;
        SLAST COLON_T176=null;
        SLAST LOGICAL_OR_T177=null;
        SLAST LOGICAL_AND_T178=null;
        SLAST BIT_OR_T179=null;
        SLAST POWER_T180=null;
        SLAST REF_T181=null;
        SLAST UNARY_EXPR182=null;
        SLAST DOT_T184=null;
        SLAST EQUAL_EQUAL_T185=null;
        SLAST NOT_EQUAL_T186=null;
        SLAST EQUAL_EQUAL_EQUAL_T187=null;
        SLAST NOT_EQUAL_EQUAL_T188=null;
        SLAST LT_T189=null;
        SLAST MT_T190=null;
        SLAST LE_T191=null;
        SLAST ME_T192=null;
        SLAST LSHIFT_T193=null;
        SLAST RSHIFT_T194=null;
        SLAST PLUS_T195=null;
        SLAST MINUS_T196=null;
        SLAST MUL_T197=null;
        SLAST DIV_T198=null;
        SLAST PERCENT_T199=null;
        SLAST CAST_EXPR200=null;
        SLAST POSTFIX_EXPR202=null;
        SLAST PREFIX_EXPR204=null;
        SLAST INSTANCEOF_T206=null;
        SLAST AT_T208=null;
        SLAST AT_T210=null;
        SLAST ARRAY_DECL213=null;
        SLAST NEW_T215=null;
        SLAST CLONE_T217=null;
        SLAST UNSET_T219=null;
        SLAST BACKTRICKLITERAL221=null;
        SLAST PRINT_T222=null;
        TreePHP.expression_return etop = null;

        TreePHP.expression_return e1 = null;

        TreePHP.expression_return e2 = null;

        TreePHP.expression_return e3 = null;

        TreePHP.expression_return e = null;

        TreePHP.unary_symbol_list_return unary_symbol_list183 = null;

        TreePHP.cast_option_return cast_option201 = null;

        TreePHP.plus_minus_return plus_minus203 = null;

        TreePHP.plus_minus_return plus_minus205 = null;

        TreePHP.class_name_reference_return class_name_reference207 = null;

        TreePHP.variable_return variable209 = null;

        TreePHP.scalar_return scalar211 = null;

        TreePHP.list_decl_return list_decl212 = null;

        TreePHP.array_pair_list_return array_pair_list214 = null;

        TreePHP.class_name_reference_return class_name_reference216 = null;

        TreePHP.variable_return variable218 = null;

        TreePHP.variable_list_return variable_list220 = null;


        SLAST EXPR159_tree=null;
        SLAST OR_T160_tree=null;
        SLAST XOR_T161_tree=null;
        SLAST AND_T162_tree=null;
        SLAST EQUAL_T163_tree=null;
        SLAST PLUS_EQ164_tree=null;
        SLAST MINUS_EQ165_tree=null;
        SLAST MUL_EQ166_tree=null;
        SLAST DIV_EQ167_tree=null;
        SLAST DOT_EQ168_tree=null;
        SLAST PERCENT_EQ169_tree=null;
        SLAST BIT_AND_EQ170_tree=null;
        SLAST BIT_OR_EQ171_tree=null;
        SLAST POWER_EQ172_tree=null;
        SLAST LMOVE_EQ173_tree=null;
        SLAST RMOVE_EQ174_tree=null;
        SLAST QUESTION_T175_tree=null;
        SLAST COLON_T176_tree=null;
        SLAST LOGICAL_OR_T177_tree=null;
        SLAST LOGICAL_AND_T178_tree=null;
        SLAST BIT_OR_T179_tree=null;
        SLAST POWER_T180_tree=null;
        SLAST REF_T181_tree=null;
        SLAST UNARY_EXPR182_tree=null;
        SLAST DOT_T184_tree=null;
        SLAST EQUAL_EQUAL_T185_tree=null;
        SLAST NOT_EQUAL_T186_tree=null;
        SLAST EQUAL_EQUAL_EQUAL_T187_tree=null;
        SLAST NOT_EQUAL_EQUAL_T188_tree=null;
        SLAST LT_T189_tree=null;
        SLAST MT_T190_tree=null;
        SLAST LE_T191_tree=null;
        SLAST ME_T192_tree=null;
        SLAST LSHIFT_T193_tree=null;
        SLAST RSHIFT_T194_tree=null;
        SLAST PLUS_T195_tree=null;
        SLAST MINUS_T196_tree=null;
        SLAST MUL_T197_tree=null;
        SLAST DIV_T198_tree=null;
        SLAST PERCENT_T199_tree=null;
        SLAST CAST_EXPR200_tree=null;
        SLAST POSTFIX_EXPR202_tree=null;
        SLAST PREFIX_EXPR204_tree=null;
        SLAST INSTANCEOF_T206_tree=null;
        SLAST AT_T208_tree=null;
        SLAST AT_T210_tree=null;
        SLAST ARRAY_DECL213_tree=null;
        SLAST NEW_T215_tree=null;
        SLAST CLONE_T217_tree=null;
        SLAST UNSET_T219_tree=null;
        SLAST BACKTRICKLITERAL221_tree=null;
        SLAST PRINT_T222_tree=null;


          SLAST ast = null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1250:3: ( ^( EXPR etop= expression ) | ^( OR_T e1= expression e2= expression ) | ^( XOR_T e1= expression e2= expression ) | ^( AND_T e1= expression e2= expression ) | ^( EQUAL_T e1= expression e2= expression ) | ^( PLUS_EQ e1= expression e2= expression ) | ^( MINUS_EQ e1= expression e2= expression ) | ^( MUL_EQ e1= expression e2= expression ) | ^( DIV_EQ e1= expression e2= expression ) | ^( DOT_EQ e1= expression e2= expression ) | ^( PERCENT_EQ e1= expression e2= expression ) | ^( BIT_AND_EQ e1= expression e2= expression ) | ^( BIT_OR_EQ e1= expression e2= expression ) | ^( POWER_EQ e1= expression e2= expression ) | ^( LMOVE_EQ e1= expression e2= expression ) | ^( RMOVE_EQ e1= expression e2= expression ) | ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) ) | ^( LOGICAL_OR_T e1= expression e2= expression ) | ^( LOGICAL_AND_T e1= expression e2= expression ) | ^( BIT_OR_T e1= expression e2= expression ) | ^( POWER_T e1= expression e2= expression ) | ^( REF_T e1= expression e2= expression ) | ^( UNARY_EXPR unary_symbol_list e= expression ) | ^( DOT_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( LT_T e1= expression e2= expression ) | ^( MT_T e1= expression e2= expression ) | ^( LE_T e1= expression e2= expression ) | ^( ME_T e1= expression e2= expression ) | ^( LSHIFT_T e1= expression e2= expression ) | ^( RSHIFT_T e1= expression e2= expression ) | ^( PLUS_T e1= expression e2= expression ) | ^( MINUS_T e1= expression e2= expression ) | ^( MUL_T e1= expression e2= expression ) | ^( DIV_T e1= expression e2= expression ) | ^( PERCENT_T e1= expression e2= expression ) | ^( CAST_EXPR cast_option e= expression ) | ^( POSTFIX_EXPR e= expression plus_minus ) | ^( PREFIX_EXPR ( plus_minus )+ e= expression ) | ^( INSTANCEOF_T e= expression class_name_reference ) | ( AT_T )? variable | ( AT_T )? scalar | list_decl | ^( ARRAY_DECL ( array_pair_list )? ) | ^( NEW_T class_name_reference ) | ^( CLONE_T variable ) | ^( UNSET_T variable_list ) | BACKTRICKLITERAL | ^( PRINT_T e= expression ) )
            int alt64=52;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1250:5: ^( EXPR etop= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EXPR159=(SLAST)match(input,EXPR,FOLLOW_EXPR_in_expression1965); 
                    EXPR159_tree = (SLAST)adaptor.dupNode(EXPR159);

                    root_1 = (SLAST)adaptor.becomeRoot(EXPR159_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1969);
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1258:5: ^( OR_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    OR_T160=(SLAST)match(input,OR_T,FOLLOW_OR_T_in_expression1981); 
                    OR_T160_tree = (SLAST)adaptor.dupNode(OR_T160);

                    root_1 = (SLAST)adaptor.becomeRoot(OR_T160_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1985);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression1989);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = OR_T160.startIndex;
                        int endIndex = OR_T160.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_STRING_OR, expr2); 
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1266:5: ^( XOR_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    XOR_T161=(SLAST)match(input,XOR_T,FOLLOW_XOR_T_in_expression2001); 
                    XOR_T161_tree = (SLAST)adaptor.dupNode(XOR_T161);

                    root_1 = (SLAST)adaptor.becomeRoot(XOR_T161_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2005);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2009);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = XOR_T161.startIndex;
                        int endIndex = XOR_T161.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_STRING_XOR, expr2);
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1274:5: ^( AND_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    AND_T162=(SLAST)match(input,AND_T,FOLLOW_AND_T_in_expression2021); 
                    AND_T162_tree = (SLAST)adaptor.dupNode(AND_T162);

                    root_1 = (SLAST)adaptor.becomeRoot(AND_T162_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2025);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2029);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = AND_T162.startIndex;
                        int endIndex = AND_T162.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_STRING_AND, expr2);
                      

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1282:5: ^( EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EQUAL_T163=(SLAST)match(input,EQUAL_T,FOLLOW_EQUAL_T_in_expression2041); 
                    EQUAL_T163_tree = (SLAST)adaptor.dupNode(EQUAL_T163);

                    root_1 = (SLAST)adaptor.becomeRoot(EQUAL_T163_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2045);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2049);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EQUAL_T163.startIndex;
                        int endIndex = EQUAL_T163.endIndex + 1;
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1295:5: ^( PLUS_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PLUS_EQ164=(SLAST)match(input,PLUS_EQ,FOLLOW_PLUS_EQ_in_expression2062); 
                    PLUS_EQ164_tree = (SLAST)adaptor.dupNode(PLUS_EQ164);

                    root_1 = (SLAST)adaptor.becomeRoot(PLUS_EQ164_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2066);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2070);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PLUS_EQ164.startIndex;
                        int endIndex = PLUS_EQ164.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_PLUS_EQUAL, expr);
                      

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1303:5: ^( MINUS_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MINUS_EQ165=(SLAST)match(input,MINUS_EQ,FOLLOW_MINUS_EQ_in_expression2082); 
                    MINUS_EQ165_tree = (SLAST)adaptor.dupNode(MINUS_EQ165);

                    root_1 = (SLAST)adaptor.becomeRoot(MINUS_EQ165_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2086);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2090);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MINUS_EQ165.startIndex;
                        int endIndex = MINUS_EQ165.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_MINUS_EQUAL, expr);
                      

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1311:5: ^( MUL_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MUL_EQ166=(SLAST)match(input,MUL_EQ,FOLLOW_MUL_EQ_in_expression2102); 
                    MUL_EQ166_tree = (SLAST)adaptor.dupNode(MUL_EQ166);

                    root_1 = (SLAST)adaptor.becomeRoot(MUL_EQ166_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2106);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2110);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MUL_EQ166.startIndex;
                        int endIndex = MUL_EQ166.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_MUL_EQUAL, expr);
                      

                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1319:5: ^( DIV_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DIV_EQ167=(SLAST)match(input,DIV_EQ,FOLLOW_DIV_EQ_in_expression2122); 
                    DIV_EQ167_tree = (SLAST)adaptor.dupNode(DIV_EQ167);

                    root_1 = (SLAST)adaptor.becomeRoot(DIV_EQ167_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2126);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2130);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DIV_EQ167.startIndex;
                        int endIndex = DIV_EQ167.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_DIV_EQUAL, expr);
                      

                    }
                    break;
                case 10 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1327:5: ^( DOT_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DOT_EQ168=(SLAST)match(input,DOT_EQ,FOLLOW_DOT_EQ_in_expression2142); 
                    DOT_EQ168_tree = (SLAST)adaptor.dupNode(DOT_EQ168);

                    root_1 = (SLAST)adaptor.becomeRoot(DOT_EQ168_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2146);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2150);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DOT_EQ168.startIndex;
                        int endIndex = DOT_EQ168.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_CONCAT_EQUAL, expr);
                      

                    }
                    break;
                case 11 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1335:5: ^( PERCENT_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PERCENT_EQ169=(SLAST)match(input,PERCENT_EQ,FOLLOW_PERCENT_EQ_in_expression2162); 
                    PERCENT_EQ169_tree = (SLAST)adaptor.dupNode(PERCENT_EQ169);

                    root_1 = (SLAST)adaptor.becomeRoot(PERCENT_EQ169_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2166);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2170);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PERCENT_EQ169.startIndex;
                        int endIndex = PERCENT_EQ169.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_MOD_EQUAL, expr);
                      

                    }
                    break;
                case 12 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1343:5: ^( BIT_AND_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    BIT_AND_EQ170=(SLAST)match(input,BIT_AND_EQ,FOLLOW_BIT_AND_EQ_in_expression2182); 
                    BIT_AND_EQ170_tree = (SLAST)adaptor.dupNode(BIT_AND_EQ170);

                    root_1 = (SLAST)adaptor.becomeRoot(BIT_AND_EQ170_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2186);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2190);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = BIT_AND_EQ170.startIndex;
                        int endIndex = BIT_AND_EQ170.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_AND_EQUAL, expr);
                      

                    }
                    break;
                case 13 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1351:5: ^( BIT_OR_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    BIT_OR_EQ171=(SLAST)match(input,BIT_OR_EQ,FOLLOW_BIT_OR_EQ_in_expression2202); 
                    BIT_OR_EQ171_tree = (SLAST)adaptor.dupNode(BIT_OR_EQ171);

                    root_1 = (SLAST)adaptor.becomeRoot(BIT_OR_EQ171_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2206);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2210);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = BIT_OR_EQ171.startIndex;
                        int endIndex = BIT_OR_EQ171.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_OR_EQUAL, expr);
                      

                    }
                    break;
                case 14 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1359:5: ^( POWER_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    POWER_EQ172=(SLAST)match(input,POWER_EQ,FOLLOW_POWER_EQ_in_expression2222); 
                    POWER_EQ172_tree = (SLAST)adaptor.dupNode(POWER_EQ172);

                    root_1 = (SLAST)adaptor.becomeRoot(POWER_EQ172_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2226);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2230);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = POWER_EQ172.startIndex;
                        int endIndex = POWER_EQ172.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_XOR_EQUAL, expr);
                      

                    }
                    break;
                case 15 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1367:5: ^( LMOVE_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LMOVE_EQ173=(SLAST)match(input,LMOVE_EQ,FOLLOW_LMOVE_EQ_in_expression2242); 
                    LMOVE_EQ173_tree = (SLAST)adaptor.dupNode(LMOVE_EQ173);

                    root_1 = (SLAST)adaptor.becomeRoot(LMOVE_EQ173_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2246);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2250);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LMOVE_EQ173.startIndex;
                        int endIndex = LMOVE_EQ173.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_SL_EQUAL, expr);
                      

                    }
                    break;
                case 16 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1375:5: ^( RMOVE_EQ e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    RMOVE_EQ174=(SLAST)match(input,RMOVE_EQ,FOLLOW_RMOVE_EQ_in_expression2262); 
                    RMOVE_EQ174_tree = (SLAST)adaptor.dupNode(RMOVE_EQ174);

                    root_1 = (SLAST)adaptor.becomeRoot(RMOVE_EQ174_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2266);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2270);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = RMOVE_EQ174.startIndex;
                        int endIndex = RMOVE_EQ174.endIndex + 1;
                        Expression var = (e1!=null?e1.expr:null);
                        Expression expr = (e2!=null?e2.expr:null);
                        retval.expr = new Assignment(startIndex, endIndex, var, Assignment.OP_SR_EQUAL, expr);
                      

                    }
                    break;
                case 17 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1383:5: ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    QUESTION_T175=(SLAST)match(input,QUESTION_T,FOLLOW_QUESTION_T_in_expression2282); 
                    QUESTION_T175_tree = (SLAST)adaptor.dupNode(QUESTION_T175);

                    root_1 = (SLAST)adaptor.becomeRoot(QUESTION_T175_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2286);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_2 = _last;
                    SLAST _first_2 = null;
                    SLAST root_2 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    COLON_T176=(SLAST)match(input,COLON_T,FOLLOW_COLON_T_in_expression2289); 
                    COLON_T176_tree = (SLAST)adaptor.dupNode(COLON_T176);

                    root_2 = (SLAST)adaptor.becomeRoot(COLON_T176_tree, root_2);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2293);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e2.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2297);
                    e3=expression();

                    state._fsp--;

                    adaptor.addChild(root_2, e3.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_1, root_2);_last = _save_last_2;
                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = QUESTION_T175.startIndex;
                        int endIndex = QUESTION_T175.endIndex + 1;
                        retval.expr = new ConditionalExpression(startIndex, endIndex, (e1!=null?e1.expr:null), (e2!=null?e2.expr:null), (e3!=null?e3.expr:null)); 
                      

                    }
                    break;
                case 18 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1389:5: ^( LOGICAL_OR_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LOGICAL_OR_T177=(SLAST)match(input,LOGICAL_OR_T,FOLLOW_LOGICAL_OR_T_in_expression2312); 
                    LOGICAL_OR_T177_tree = (SLAST)adaptor.dupNode(LOGICAL_OR_T177);

                    root_1 = (SLAST)adaptor.becomeRoot(LOGICAL_OR_T177_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2316);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2320);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LOGICAL_OR_T177.startIndex;
                        int endIndex = LOGICAL_OR_T177.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_BOOL_OR, expr2); 
                      

                    }
                    break;
                case 19 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1397:5: ^( LOGICAL_AND_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LOGICAL_AND_T178=(SLAST)match(input,LOGICAL_AND_T,FOLLOW_LOGICAL_AND_T_in_expression2332); 
                    LOGICAL_AND_T178_tree = (SLAST)adaptor.dupNode(LOGICAL_AND_T178);

                    root_1 = (SLAST)adaptor.becomeRoot(LOGICAL_AND_T178_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2336);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2340);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LOGICAL_AND_T178.startIndex;
                        int endIndex = LOGICAL_AND_T178.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_BOOL_AND, expr2);
                      

                    }
                    break;
                case 20 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1405:5: ^( BIT_OR_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    BIT_OR_T179=(SLAST)match(input,BIT_OR_T,FOLLOW_BIT_OR_T_in_expression2352); 
                    BIT_OR_T179_tree = (SLAST)adaptor.dupNode(BIT_OR_T179);

                    root_1 = (SLAST)adaptor.becomeRoot(BIT_OR_T179_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2356);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2360);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = BIT_OR_T179.startIndex;
                        int endIndex = BIT_OR_T179.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_OR, expr2); 
                      

                    }
                    break;
                case 21 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1413:5: ^( POWER_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    POWER_T180=(SLAST)match(input,POWER_T,FOLLOW_POWER_T_in_expression2372); 
                    POWER_T180_tree = (SLAST)adaptor.dupNode(POWER_T180);

                    root_1 = (SLAST)adaptor.becomeRoot(POWER_T180_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2376);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2380);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = POWER_T180.startIndex;
                        int endIndex = POWER_T180.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_XOR, expr2); 
                      

                    }
                    break;
                case 22 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1421:5: ^( REF_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    REF_T181=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_expression2392); 
                    REF_T181_tree = (SLAST)adaptor.dupNode(REF_T181);

                    root_1 = (SLAST)adaptor.becomeRoot(REF_T181_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2396);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2400);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = REF_T181.startIndex;
                        int endIndex = REF_T181.endIndex + 1;
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1434:5: ^( UNARY_EXPR unary_symbol_list e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    UNARY_EXPR182=(SLAST)match(input,UNARY_EXPR,FOLLOW_UNARY_EXPR_in_expression2412); 
                    UNARY_EXPR182_tree = (SLAST)adaptor.dupNode(UNARY_EXPR182);

                    root_1 = (SLAST)adaptor.becomeRoot(UNARY_EXPR182_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_unary_symbol_list_in_expression2414);
                    unary_symbol_list183=unary_symbol_list();

                    state._fsp--;

                    adaptor.addChild(root_1, unary_symbol_list183.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2418);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        Iterator iter = (unary_symbol_list183!=null?unary_symbol_list183.symbolList:null).iterator();
                        int symbolIndex;
                        int startIndex = UNARY_EXPR182.startIndex + (unary_symbol_list183!=null?unary_symbol_list183.symbolList:null).size() - 1;
                        int endIndex = UNARY_EXPR182.endIndex + 1;
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1467:5: ^( DOT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DOT_T184=(SLAST)match(input,DOT_T,FOLLOW_DOT_T_in_expression2430); 
                    DOT_T184_tree = (SLAST)adaptor.dupNode(DOT_T184);

                    root_1 = (SLAST)adaptor.becomeRoot(DOT_T184_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2434);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2438);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DOT_T184.startIndex;
                        int endIndex = DOT_T184.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_CONCAT, expr2); 
                      

                    }
                    break;
                case 25 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1475:5: ^( EQUAL_EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EQUAL_EQUAL_T185=(SLAST)match(input,EQUAL_EQUAL_T,FOLLOW_EQUAL_EQUAL_T_in_expression2450); 
                    EQUAL_EQUAL_T185_tree = (SLAST)adaptor.dupNode(EQUAL_EQUAL_T185);

                    root_1 = (SLAST)adaptor.becomeRoot(EQUAL_EQUAL_T185_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2454);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2458);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EQUAL_EQUAL_T185.startIndex;
                        int endIndex = EQUAL_EQUAL_T185.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_EQUAL, expr2);
                      

                    }
                    break;
                case 26 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1483:5: ^( NOT_EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    NOT_EQUAL_T186=(SLAST)match(input,NOT_EQUAL_T,FOLLOW_NOT_EQUAL_T_in_expression2470); 
                    NOT_EQUAL_T186_tree = (SLAST)adaptor.dupNode(NOT_EQUAL_T186);

                    root_1 = (SLAST)adaptor.becomeRoot(NOT_EQUAL_T186_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2474);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2478);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = NOT_EQUAL_T186.startIndex;
                        int endIndex = NOT_EQUAL_T186.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_NOT_EQUAL, expr2);
                      

                    }
                    break;
                case 27 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1491:5: ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    EQUAL_EQUAL_EQUAL_T187=(SLAST)match(input,EQUAL_EQUAL_EQUAL_T,FOLLOW_EQUAL_EQUAL_EQUAL_T_in_expression2490); 
                    EQUAL_EQUAL_EQUAL_T187_tree = (SLAST)adaptor.dupNode(EQUAL_EQUAL_EQUAL_T187);

                    root_1 = (SLAST)adaptor.becomeRoot(EQUAL_EQUAL_EQUAL_T187_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2494);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2498);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = EQUAL_EQUAL_EQUAL_T187.startIndex;
                        int endIndex = EQUAL_EQUAL_EQUAL_T187.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_IDENTICAL, expr2);
                      

                    }
                    break;
                case 28 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1499:5: ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    NOT_EQUAL_EQUAL_T188=(SLAST)match(input,NOT_EQUAL_EQUAL_T,FOLLOW_NOT_EQUAL_EQUAL_T_in_expression2510); 
                    NOT_EQUAL_EQUAL_T188_tree = (SLAST)adaptor.dupNode(NOT_EQUAL_EQUAL_T188);

                    root_1 = (SLAST)adaptor.becomeRoot(NOT_EQUAL_EQUAL_T188_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2514);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2518);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = NOT_EQUAL_EQUAL_T188.startIndex;
                        int endIndex = NOT_EQUAL_EQUAL_T188.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_NOT_IDENTICAL, expr2);
                      

                    }
                    break;
                case 29 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1507:5: ^( LT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LT_T189=(SLAST)match(input,LT_T,FOLLOW_LT_T_in_expression2530); 
                    LT_T189_tree = (SLAST)adaptor.dupNode(LT_T189);

                    root_1 = (SLAST)adaptor.becomeRoot(LT_T189_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2534);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2538);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LT_T189.startIndex;
                        int endIndex = LT_T189.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_RGREATER, expr2); 
                      

                    }
                    break;
                case 30 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1515:5: ^( MT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MT_T190=(SLAST)match(input,MT_T,FOLLOW_MT_T_in_expression2550); 
                    MT_T190_tree = (SLAST)adaptor.dupNode(MT_T190);

                    root_1 = (SLAST)adaptor.becomeRoot(MT_T190_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2554);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2558);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MT_T190.startIndex;
                        int endIndex = MT_T190.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_LGREATER, expr2); 
                      

                    }
                    break;
                case 31 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1523:5: ^( LE_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LE_T191=(SLAST)match(input,LE_T,FOLLOW_LE_T_in_expression2570); 
                    LE_T191_tree = (SLAST)adaptor.dupNode(LE_T191);

                    root_1 = (SLAST)adaptor.becomeRoot(LE_T191_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2574);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2578);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LE_T191.startIndex;
                        int endIndex = LE_T191.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_SMALLER_OR_EQUAL, expr2); 
                      

                    }
                    break;
                case 32 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1531:5: ^( ME_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ME_T192=(SLAST)match(input,ME_T,FOLLOW_ME_T_in_expression2590); 
                    ME_T192_tree = (SLAST)adaptor.dupNode(ME_T192);

                    root_1 = (SLAST)adaptor.becomeRoot(ME_T192_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2594);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2598);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = ME_T192.startIndex;
                        int endIndex = ME_T192.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1 , InfixExpression.OP_IS_GREATER_OR_EQUAL, expr2); 
                      

                    }
                    break;
                case 33 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1539:5: ^( LSHIFT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    LSHIFT_T193=(SLAST)match(input,LSHIFT_T,FOLLOW_LSHIFT_T_in_expression2610); 
                    LSHIFT_T193_tree = (SLAST)adaptor.dupNode(LSHIFT_T193);

                    root_1 = (SLAST)adaptor.becomeRoot(LSHIFT_T193_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2614);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2618);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = LSHIFT_T193.startIndex;
                        int endIndex = LSHIFT_T193.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_SL, expr2); 
                      

                    }
                    break;
                case 34 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1547:5: ^( RSHIFT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    RSHIFT_T194=(SLAST)match(input,RSHIFT_T,FOLLOW_RSHIFT_T_in_expression2630); 
                    RSHIFT_T194_tree = (SLAST)adaptor.dupNode(RSHIFT_T194);

                    root_1 = (SLAST)adaptor.becomeRoot(RSHIFT_T194_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2634);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2638);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = RSHIFT_T194.startIndex;
                        int endIndex = RSHIFT_T194.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_SR, expr2); 
                      

                    }
                    break;
                case 35 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1555:5: ^( PLUS_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PLUS_T195=(SLAST)match(input,PLUS_T,FOLLOW_PLUS_T_in_expression2650); 
                    PLUS_T195_tree = (SLAST)adaptor.dupNode(PLUS_T195);

                    root_1 = (SLAST)adaptor.becomeRoot(PLUS_T195_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2654);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2658);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PLUS_T195.startIndex;
                        int endIndex = PLUS_T195.endIndex + 1;
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1568:5: ^( MINUS_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MINUS_T196=(SLAST)match(input,MINUS_T,FOLLOW_MINUS_T_in_expression2670); 
                    MINUS_T196_tree = (SLAST)adaptor.dupNode(MINUS_T196);

                    root_1 = (SLAST)adaptor.becomeRoot(MINUS_T196_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2674);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2678);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MINUS_T196.startIndex;
                        int endIndex = MINUS_T196.endIndex + 1;
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1581:5: ^( MUL_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    MUL_T197=(SLAST)match(input,MUL_T,FOLLOW_MUL_T_in_expression2690); 
                    MUL_T197_tree = (SLAST)adaptor.dupNode(MUL_T197);

                    root_1 = (SLAST)adaptor.becomeRoot(MUL_T197_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2694);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2698);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = MUL_T197.startIndex;
                        int endIndex = MUL_T197.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_MUL, expr2);
                      

                    }
                    break;
                case 38 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1589:5: ^( DIV_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    DIV_T198=(SLAST)match(input,DIV_T,FOLLOW_DIV_T_in_expression2710); 
                    DIV_T198_tree = (SLAST)adaptor.dupNode(DIV_T198);

                    root_1 = (SLAST)adaptor.becomeRoot(DIV_T198_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2714);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2718);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = DIV_T198.startIndex;
                        int endIndex = DIV_T198.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_DIV, expr2);
                      

                    }
                    break;
                case 39 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1597:5: ^( PERCENT_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PERCENT_T199=(SLAST)match(input,PERCENT_T,FOLLOW_PERCENT_T_in_expression2730); 
                    PERCENT_T199_tree = (SLAST)adaptor.dupNode(PERCENT_T199);

                    root_1 = (SLAST)adaptor.becomeRoot(PERCENT_T199_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2734);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2738);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PERCENT_T199.startIndex;
                        int endIndex = PERCENT_T199.endIndex + 1;
                        Expression expr1 = (e1!=null?e1.expr:null);
                        Expression expr2 = (e2!=null?e2.expr:null);
                        retval.expr = new InfixExpression(startIndex, endIndex, expr1, InfixExpression.OP_MOD, expr2);
                      

                    }
                    break;
                case 40 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1605:5: ^( CAST_EXPR cast_option e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CAST_EXPR200=(SLAST)match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expression2750); 
                    CAST_EXPR200_tree = (SLAST)adaptor.dupNode(CAST_EXPR200);

                    root_1 = (SLAST)adaptor.becomeRoot(CAST_EXPR200_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_cast_option_in_expression2752);
                    cast_option201=cast_option();

                    state._fsp--;

                    adaptor.addChild(root_1, cast_option201.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2756);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int result = (cast_option201!=null?cast_option201.castOption:0);
                        int startIndex = CAST_EXPR200.startIndex;
                        int endIndex = CAST_EXPR200.endIndex + 1;
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1651:5: ^( POSTFIX_EXPR e= expression plus_minus )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    POSTFIX_EXPR202=(SLAST)match(input,POSTFIX_EXPR,FOLLOW_POSTFIX_EXPR_in_expression2780); 
                    POSTFIX_EXPR202_tree = (SLAST)adaptor.dupNode(POSTFIX_EXPR202);

                    root_1 = (SLAST)adaptor.becomeRoot(POSTFIX_EXPR202_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2784);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_plus_minus_in_expression2786);
                    plus_minus203=plus_minus();

                    state._fsp--;

                    adaptor.addChild(root_1, plus_minus203.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          int startIndex = POSTFIX_EXPR202.startIndex;
                          int endIndex = POSTFIX_EXPR202.endIndex + 1;
                          if ((plus_minus203!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(plus_minus203.start),
                      input.getTreeAdaptor().getTokenStopIndex(plus_minus203.start))):null).equals("++")) {
                            retval.expr = new PostfixExpression(startIndex, endIndex, (e!=null?e.expr:null) , PostfixExpression.OP_INC);
                          }
                          else {
                            retval.expr = new PostfixExpression(startIndex, endIndex, (e!=null?e.expr:null) , PostfixExpression.OP_DEC);
                          } 
                      

                    }
                    break;
                case 42 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1662:5: ^( PREFIX_EXPR ( plus_minus )+ e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PREFIX_EXPR204=(SLAST)match(input,PREFIX_EXPR,FOLLOW_PREFIX_EXPR_in_expression2798); 
                    PREFIX_EXPR204_tree = (SLAST)adaptor.dupNode(PREFIX_EXPR204);

                    root_1 = (SLAST)adaptor.becomeRoot(PREFIX_EXPR204_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1662:19: ( plus_minus )+
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
                    	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1662:19: plus_minus
                    	    {
                    	    _last = (SLAST)input.LT(1);
                    	    pushFollow(FOLLOW_plus_minus_in_expression2800);
                    	    plus_minus205=plus_minus();

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, plus_minus205.getTree());

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
                    pushFollow(FOLLOW_expression_in_expression2805);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          int startIndex = PREFIX_EXPR204.startIndex;
                          int endIndex = PREFIX_EXPR204.endIndex + 1;
                          if ((plus_minus205!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(plus_minus205.start),
                      input.getTreeAdaptor().getTokenStopIndex(plus_minus205.start))):null).equals("++")) {
                            retval.expr = new PrefixExpression(startIndex, endIndex, (e!=null?e.expr:null), PrefixExpression.OP_INC);
                          }
                          else {
                            retval.expr = new PrefixExpression(startIndex, endIndex, (e!=null?e.expr:null), PrefixExpression.OP_DEC);
                          }
                      

                    }
                    break;
                case 43 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1673:5: ^( INSTANCEOF_T e= expression class_name_reference )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INSTANCEOF_T206=(SLAST)match(input,INSTANCEOF_T,FOLLOW_INSTANCEOF_T_in_expression2817); 
                    INSTANCEOF_T206_tree = (SLAST)adaptor.dupNode(INSTANCEOF_T206);

                    root_1 = (SLAST)adaptor.becomeRoot(INSTANCEOF_T206_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2821);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_class_name_reference_in_expression2823);
                    class_name_reference207=class_name_reference();

                    state._fsp--;

                    adaptor.addChild(root_1, class_name_reference207.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = INSTANCEOF_T206.startIndex;
                        int endIndex = INSTANCEOF_T206.endIndex + 1;
                        retval.expr = new InstanceOfExpression(startIndex, endIndex, (e!=null?e.expr:null), (class_name_reference207!=null?class_name_reference207.var:null)); 
                      

                    }
                    break;
                case 44 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1679:5: ( AT_T )? variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1679:5: ( AT_T )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==AT_T) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1679:5: AT_T
                            {
                            _last = (SLAST)input.LT(1);
                            AT_T208=(SLAST)match(input,AT_T,FOLLOW_AT_T_in_expression2834); 
                            AT_T208_tree = (SLAST)adaptor.dupNode(AT_T208);

                            adaptor.addChild(root_0, AT_T208_tree);


                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_in_expression2837);
                    variable209=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable209.getTree());

                        retval.expr = (variable209!=null?variable209.var:null);
                      

                    }
                    break;
                case 45 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1683:5: ( AT_T )? scalar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1683:5: ( AT_T )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==AT_T) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1683:5: AT_T
                            {
                            _last = (SLAST)input.LT(1);
                            AT_T210=(SLAST)match(input,AT_T,FOLLOW_AT_T_in_expression2847); 
                            AT_T210_tree = (SLAST)adaptor.dupNode(AT_T210);

                            adaptor.addChild(root_0, AT_T210_tree);


                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_scalar_in_expression2850);
                    scalar211=scalar();

                    state._fsp--;

                    adaptor.addChild(root_0, scalar211.getTree());

                        retval.expr = (scalar211!=null?scalar211.expr:null);
                        ast = (scalar211!=null?((SLAST)scalar211.tree):null);
                      

                    }
                    break;
                case 46 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1688:5: list_decl
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_list_decl_in_expression2860);
                    list_decl212=list_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, list_decl212.getTree());

                        retval.expr = (list_decl212!=null?list_decl212.expr:null);
                      

                    }
                    break;
                case 47 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1692:5: ^( ARRAY_DECL ( array_pair_list )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ARRAY_DECL213=(SLAST)match(input,ARRAY_DECL,FOLLOW_ARRAY_DECL_in_expression2871); 
                    ARRAY_DECL213_tree = (SLAST)adaptor.dupNode(ARRAY_DECL213);

                    root_1 = (SLAST)adaptor.becomeRoot(ARRAY_DECL213_tree, root_1);



                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1692:18: ( array_pair_list )?
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==VAR_DECL||LA63_0==CALL||LA63_0==EXPR||(LA63_0>=SCALAR && LA63_0<=UNARY_EXPR)||LA63_0==REF_T||LA63_0==ARROW_T||LA63_0==EQUAL_T||(LA63_0>=OR_T && LA63_0<=CLONE_T)||(LA63_0>=INSTANCEOF_T && LA63_0<=PRINT_T)) ) {
                            alt63=1;
                        }
                        switch (alt63) {
                            case 1 :
                                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1692:18: array_pair_list
                                {
                                _last = (SLAST)input.LT(1);
                                pushFollow(FOLLOW_array_pair_list_in_expression2873);
                                array_pair_list214=array_pair_list();

                                state._fsp--;

                                adaptor.addChild(root_1, array_pair_list214.getTree());

                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = ARRAY_DECL213.startIndex;
                        int endIndex = ARRAY_DECL213.endIndex + 1;
                        if ((array_pair_list214!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(array_pair_list214.start),
                      input.getTreeAdaptor().getTokenStopIndex(array_pair_list214.start))):null) != null) {
                           retval.expr = new ArrayCreation(startIndex, endIndex, (array_pair_list214!=null?array_pair_list214.arrayList:null));
                        }
                        else {
                           retval.expr = new ArrayCreation(startIndex, endIndex, new LinkedList());
                        }
                      

                    }
                    break;
                case 48 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1703:5: ^( NEW_T class_name_reference )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    NEW_T215=(SLAST)match(input,NEW_T,FOLLOW_NEW_T_in_expression2886); 
                    NEW_T215_tree = (SLAST)adaptor.dupNode(NEW_T215);

                    root_1 = (SLAST)adaptor.becomeRoot(NEW_T215_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_class_name_reference_in_expression2888);
                    class_name_reference216=class_name_reference();

                    state._fsp--;

                    adaptor.addChild(root_1, class_name_reference216.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = NEW_T215.startIndex;
                        int endIndex = NEW_T215.endIndex + 1;
                        Expression className = (class_name_reference216!=null?class_name_reference216.var:null);
                        PHPCallArgumentsList ctor = (class_name_reference216!=null?class_name_reference216.parameterList:null);
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1720:5: ^( CLONE_T variable )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CLONE_T217=(SLAST)match(input,CLONE_T,FOLLOW_CLONE_T_in_expression2903); 
                    CLONE_T217_tree = (SLAST)adaptor.dupNode(CLONE_T217);

                    root_1 = (SLAST)adaptor.becomeRoot(CLONE_T217_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_in_expression2905);
                    variable218=variable();

                    state._fsp--;

                    adaptor.addChild(root_1, variable218.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = CLONE_T217.startIndex;
                        int endIndex = CLONE_T217.endIndex + 1;
                        retval.expr = new CloneExpression(startIndex, endIndex, (variable218!=null?variable218.var:null));
                      

                    }
                    break;
                case 50 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1727:5: ^( UNSET_T variable_list )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    UNSET_T219=(SLAST)match(input,UNSET_T,FOLLOW_UNSET_T_in_expression2918); 
                    UNSET_T219_tree = (SLAST)adaptor.dupNode(UNSET_T219);

                    root_1 = (SLAST)adaptor.becomeRoot(UNSET_T219_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_list_in_expression2920);
                    variable_list220=variable_list();

                    state._fsp--;

                    adaptor.addChild(root_1, variable_list220.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                         int startIndex = UNSET_T219.startIndex;
                         int endIndex = UNSET_T219.endIndex + 1;
                         int startOfVariableList = startIndex + "unset".length() + 1;
                         SimpleReference simpleRef = new SimpleReference(startIndex, startIndex + "unset".length(), "unset");
                         
                         PHPCallArgumentsList list = new PHPCallArgumentsList();
                         List variableList = (variable_list220!=null?variable_list220.variableList:null);
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1747:5: BACKTRICKLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    BACKTRICKLITERAL221=(SLAST)match(input,BACKTRICKLITERAL,FOLLOW_BACKTRICKLITERAL_in_expression2932); 
                    BACKTRICKLITERAL221_tree = (SLAST)adaptor.dupNode(BACKTRICKLITERAL221);

                    adaptor.addChild(root_0, BACKTRICKLITERAL221_tree);


                        int startIndex = BACKTRICKLITERAL221.startIndex;
                        int endIndex = BACKTRICKLITERAL221.endIndex + 1;
                        retval.expr = new BackTickExpression(startIndex, endIndex, new LinkedList());
                      

                    }
                    break;
                case 52 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1753:5: ^( PRINT_T e= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    PRINT_T222=(SLAST)match(input,PRINT_T,FOLLOW_PRINT_T_in_expression2943); 
                    PRINT_T222_tree = (SLAST)adaptor.dupNode(PRINT_T222);

                    root_1 = (SLAST)adaptor.becomeRoot(PRINT_T222_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_expression2947);
                    e=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = PRINT_T222.startIndex;
                        int endIndex = PRINT_T222.endIndex + 1;
                        
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1778:1: unary_symbol_list returns [List symbolList] : ( unary_symbol )+ ;
    public final TreePHP.unary_symbol_list_return unary_symbol_list() throws RecognitionException {
        unary_symbol_list_stack.push(new unary_symbol_list_scope());
        TreePHP.unary_symbol_list_return retval = new TreePHP.unary_symbol_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.unary_symbol_return unary_symbol223 = null;




          ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list = new ArrayList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1785:3: ( ( unary_symbol )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1785:5: ( unary_symbol )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1785:5: ( unary_symbol )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1785:5: unary_symbol
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_unary_symbol_in_unary_symbol_list2981);
            	    unary_symbol223=unary_symbol();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_symbol223.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1791:1: unary_symbol : ( PLUS_T | MINUS_T | REF_T | TILDA_T | EXC_NOT_T );
    public final TreePHP.unary_symbol_return unary_symbol() throws RecognitionException {
        TreePHP.unary_symbol_return retval = new TreePHP.unary_symbol_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST PLUS_T224=null;
        SLAST MINUS_T225=null;
        SLAST REF_T226=null;
        SLAST TILDA_T227=null;
        SLAST EXC_NOT_T228=null;

        SLAST PLUS_T224_tree=null;
        SLAST MINUS_T225_tree=null;
        SLAST REF_T226_tree=null;
        SLAST TILDA_T227_tree=null;
        SLAST EXC_NOT_T228_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1792:3: ( PLUS_T | MINUS_T | REF_T | TILDA_T | EXC_NOT_T )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1792:5: PLUS_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    PLUS_T224=(SLAST)match(input,PLUS_T,FOLLOW_PLUS_T_in_unary_symbol3001); 
                    PLUS_T224_tree = (SLAST)adaptor.dupNode(PLUS_T224);

                    adaptor.addChild(root_0, PLUS_T224_tree);

                    ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list.add(0,1);

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1793:5: MINUS_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    MINUS_T225=(SLAST)match(input,MINUS_T,FOLLOW_MINUS_T_in_unary_symbol3010); 
                    MINUS_T225_tree = (SLAST)adaptor.dupNode(MINUS_T225);

                    adaptor.addChild(root_0, MINUS_T225_tree);

                    ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list.add(0,2);

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1794:5: REF_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    REF_T226=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_unary_symbol3018); 
                    REF_T226_tree = (SLAST)adaptor.dupNode(REF_T226);

                    adaptor.addChild(root_0, REF_T226_tree);

                    ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list.add(0,3);

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1795:5: TILDA_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    TILDA_T227=(SLAST)match(input,TILDA_T,FOLLOW_TILDA_T_in_unary_symbol3028); 
                    TILDA_T227_tree = (SLAST)adaptor.dupNode(TILDA_T227);

                    adaptor.addChild(root_0, TILDA_T227_tree);

                    ((unary_symbol_list_scope)unary_symbol_list_stack.peek()).list.add(0,4);

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1796:5: EXC_NOT_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    EXC_NOT_T228=(SLAST)match(input,EXC_NOT_T,FOLLOW_EXC_NOT_T_in_unary_symbol3036); 
                    EXC_NOT_T228_tree = (SLAST)adaptor.dupNode(EXC_NOT_T228);

                    adaptor.addChild(root_0, EXC_NOT_T228_tree);

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1799:1: plus_minus : ( PLUS_PLUS_T | MINUS_MINUS_T );
    public final TreePHP.plus_minus_return plus_minus() throws RecognitionException {
        TreePHP.plus_minus_return retval = new TreePHP.plus_minus_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST set229=null;

        SLAST set229_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1800:3: ( PLUS_PLUS_T | MINUS_MINUS_T )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            set229=(SLAST)input.LT(1);
            if ( (input.LA(1)>=PLUS_PLUS_T && input.LA(1)<=MINUS_MINUS_T) ) {
                input.consume();

                set229_tree = (SLAST)adaptor.dupNode(set229);

                adaptor.addChild(root_0, set229_tree);

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1804:1: cast_option returns [int castOption] : ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'array' | 'object' | 'real' | 'string' | UNSET_T | CLONE_T );
    public final TreePHP.cast_option_return cast_option() throws RecognitionException {
        TreePHP.cast_option_return retval = new TreePHP.cast_option_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST string_literal230=null;
        SLAST string_literal231=null;
        SLAST string_literal232=null;
        SLAST string_literal233=null;
        SLAST string_literal234=null;
        SLAST string_literal235=null;
        SLAST string_literal236=null;
        SLAST string_literal237=null;
        SLAST string_literal238=null;
        SLAST UNSET_T239=null;
        SLAST CLONE_T240=null;

        SLAST string_literal230_tree=null;
        SLAST string_literal231_tree=null;
        SLAST string_literal232_tree=null;
        SLAST string_literal233_tree=null;
        SLAST string_literal234_tree=null;
        SLAST string_literal235_tree=null;
        SLAST string_literal236_tree=null;
        SLAST string_literal237_tree=null;
        SLAST string_literal238_tree=null;
        SLAST UNSET_T239_tree=null;
        SLAST CLONE_T240_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1805:3: ( 'bool' | 'boolean' | 'int' | 'float' | 'double' | 'array' | 'object' | 'real' | 'string' | UNSET_T | CLONE_T )
            int alt67=11;
            switch ( input.LA(1) ) {
            case 180:
                {
                alt67=1;
                }
                break;
            case 181:
                {
                alt67=2;
                }
                break;
            case 182:
                {
                alt67=3;
                }
                break;
            case 183:
                {
                alt67=4;
                }
                break;
            case 184:
                {
                alt67=5;
                }
                break;
            case 188:
                {
                alt67=6;
                }
                break;
            case 187:
                {
                alt67=7;
                }
                break;
            case 185:
                {
                alt67=8;
                }
                break;
            case 186:
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1805:5: 'bool'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal230=(SLAST)match(input,180,FOLLOW_180_in_cast_option3074); 
                    string_literal230_tree = (SLAST)adaptor.dupNode(string_literal230);

                    adaptor.addChild(root_0, string_literal230_tree);

                    retval.castOption = 1;

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1806:5: 'boolean'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal231=(SLAST)match(input,181,FOLLOW_181_in_cast_option3085); 
                    string_literal231_tree = (SLAST)adaptor.dupNode(string_literal231);

                    adaptor.addChild(root_0, string_literal231_tree);

                    retval.castOption = 2;

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1807:5: 'int'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal232=(SLAST)match(input,182,FOLLOW_182_in_cast_option3093); 
                    string_literal232_tree = (SLAST)adaptor.dupNode(string_literal232);

                    adaptor.addChild(root_0, string_literal232_tree);

                    retval.castOption = 3;

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1808:5: 'float'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal233=(SLAST)match(input,183,FOLLOW_183_in_cast_option3105); 
                    string_literal233_tree = (SLAST)adaptor.dupNode(string_literal233);

                    adaptor.addChild(root_0, string_literal233_tree);

                    retval.castOption = 4;

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1809:5: 'double'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal234=(SLAST)match(input,184,FOLLOW_184_in_cast_option3115); 
                    string_literal234_tree = (SLAST)adaptor.dupNode(string_literal234);

                    adaptor.addChild(root_0, string_literal234_tree);

                    retval.castOption = 5;

                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1810:5: 'array'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal235=(SLAST)match(input,188,FOLLOW_188_in_cast_option3124); 
                    string_literal235_tree = (SLAST)adaptor.dupNode(string_literal235);

                    adaptor.addChild(root_0, string_literal235_tree);

                    retval.castOption = 6;

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1811:5: 'object'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal236=(SLAST)match(input,187,FOLLOW_187_in_cast_option3134); 
                    string_literal236_tree = (SLAST)adaptor.dupNode(string_literal236);

                    adaptor.addChild(root_0, string_literal236_tree);

                    retval.castOption = 7;

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1812:5: 'real'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal237=(SLAST)match(input,185,FOLLOW_185_in_cast_option3143); 
                    string_literal237_tree = (SLAST)adaptor.dupNode(string_literal237);

                    adaptor.addChild(root_0, string_literal237_tree);

                    retval.castOption = 8;

                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1813:5: 'string'
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    string_literal238=(SLAST)match(input,186,FOLLOW_186_in_cast_option3154); 
                    string_literal238_tree = (SLAST)adaptor.dupNode(string_literal238);

                    adaptor.addChild(root_0, string_literal238_tree);

                    retval.castOption = 9;

                    }
                    break;
                case 10 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1814:5: UNSET_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    UNSET_T239=(SLAST)match(input,UNSET_T,FOLLOW_UNSET_T_in_cast_option3163); 
                    UNSET_T239_tree = (SLAST)adaptor.dupNode(UNSET_T239);

                    adaptor.addChild(root_0, UNSET_T239_tree);

                    retval.castOption = 10;

                    }
                    break;
                case 11 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1815:5: CLONE_T
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    CLONE_T240=(SLAST)match(input,CLONE_T,FOLLOW_CLONE_T_in_cast_option3173); 
                    CLONE_T240_tree = (SLAST)adaptor.dupNode(CLONE_T240);

                    adaptor.addChild(root_0, CLONE_T240_tree);

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1823:1: class_name_reference returns [Expression var, PHPCallArgumentsList parameterList] : ( dynamic_name_reference | fully_qualified_class_name );
    public final TreePHP.class_name_reference_return class_name_reference() throws RecognitionException {
        class_name_reference_stack.push(new class_name_reference_scope());
        TreePHP.class_name_reference_return retval = new TreePHP.class_name_reference_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.dynamic_name_reference_return dynamic_name_reference241 = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name242 = null;




          ((class_name_reference_scope)class_name_reference_stack.peek()).list = new LinkedList();
          ((class_name_reference_scope)class_name_reference_stack.peek()).argList = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1832:3: ( dynamic_name_reference | fully_qualified_class_name )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1832:5: dynamic_name_reference
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_dynamic_name_reference_in_class_name_reference3215);
                    dynamic_name_reference241=dynamic_name_reference();

                    state._fsp--;

                    adaptor.addChild(root_0, dynamic_name_reference241.getTree());

                        retval.var = (dynamic_name_reference241!=null?dynamic_name_reference241.var:null);
                        retval.parameterList = (dynamic_name_reference241!=null?dynamic_name_reference241.parameterList:null);
                           
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1846:5: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_class_name_reference3225);
                    fully_qualified_class_name242=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_0, fully_qualified_class_name242.getTree());

                        retval.var = (fully_qualified_class_name242!=null?fully_qualified_class_name242.type:null);
                      

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1852:1: dynamic_name_reference returns [Expression var, PHPCallArgumentsList parameterList] : ( base_variable_with_function_calls | ^( CALL v1= dynamic_name_reference obj= object_property ( ctor_arguments )? ) );
    public final TreePHP.dynamic_name_reference_return dynamic_name_reference() throws RecognitionException {
        TreePHP.dynamic_name_reference_return retval = new TreePHP.dynamic_name_reference_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CALL244=null;
        TreePHP.dynamic_name_reference_return v1 = null;

        TreePHP.object_property_return obj = null;

        TreePHP.base_variable_with_function_calls_return base_variable_with_function_calls243 = null;

        TreePHP.ctor_arguments_return ctor_arguments245 = null;


        SLAST CALL244_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1853:3: ( base_variable_with_function_calls | ^( CALL v1= dynamic_name_reference obj= object_property ( ctor_arguments )? ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==VAR_DECL) ) {
                alt70=1;
            }
            else if ( (LA70_0==CALL) ) {
                int LA70_2 = input.LA(2);

                if ( (LA70_2==DOWN) ) {
                    int LA70_3 = input.LA(3);

                    if ( (LA70_3==VAR_DECL||LA70_3==CALL) ) {
                        alt70=2;
                    }
                    else if ( (LA70_3==IDENTIFIER||LA70_3==DOMAIN_T) ) {
                        alt70=1;
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1853:5: base_variable_with_function_calls
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference3248);
                    base_variable_with_function_calls243=base_variable_with_function_calls();

                    state._fsp--;

                    adaptor.addChild(root_0, base_variable_with_function_calls243.getTree());

                         retval.var = (base_variable_with_function_calls243!=null?base_variable_with_function_calls243.var:null);
                         if ((base_variable_with_function_calls243!=null?base_variable_with_function_calls243.type:null) != null) {
                            retval.var = (base_variable_with_function_calls243!=null?base_variable_with_function_calls243.type:null);
                         }
                         retval.parameterList = (base_variable_with_function_calls243!=null?base_variable_with_function_calls243.parameterList:null);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1861:5: ^( CALL v1= dynamic_name_reference obj= object_property ( ctor_arguments )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CALL244=(SLAST)match(input,CALL,FOLLOW_CALL_in_dynamic_name_reference3260); 
                    CALL244_tree = (SLAST)adaptor.dupNode(CALL244);

                    root_1 = (SLAST)adaptor.becomeRoot(CALL244_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_dynamic_name_reference_in_dynamic_name_reference3264);
                    v1=dynamic_name_reference();

                    state._fsp--;

                    adaptor.addChild(root_1, v1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_dynamic_name_reference3268);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1861:58: ( ctor_arguments )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==ARGU) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1861:58: ctor_arguments
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_ctor_arguments_in_dynamic_name_reference3270);
                            ctor_arguments245=ctor_arguments();

                            state._fsp--;

                            adaptor.addChild(root_1, ctor_arguments245.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          retval.var = (v1!=null?v1.var:null);
                           
                          ((class_name_reference_scope)class_name_reference_stack.peek()).list.add((obj!=null?obj.expr:null));
                          
                          if ((ctor_arguments245!=null?ctor_arguments245.argumentList:null) != null) {
                            retval.parameterList = (ctor_arguments245!=null?ctor_arguments245.argumentList:null);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1873:1: list_decl returns [Expression expr] : ^( LIST_T ( assignment_list )? ) ;
    public final TreePHP.list_decl_return list_decl() throws RecognitionException {
        TreePHP.list_decl_return retval = new TreePHP.list_decl_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST LIST_T246=null;
        TreePHP.assignment_list_return assignment_list247 = null;


        SLAST LIST_T246_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1874:3: ( ^( LIST_T ( assignment_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1874:5: ^( LIST_T ( assignment_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            LIST_T246=(SLAST)match(input,LIST_T,FOLLOW_LIST_T_in_list_decl3294); 
            LIST_T246_tree = (SLAST)adaptor.dupNode(LIST_T246);

            root_1 = (SLAST)adaptor.becomeRoot(LIST_T246_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1874:14: ( assignment_list )?
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==VAR_DECL||LA71_0==CALL||LA71_0==LIST_T) ) {
                    alt71=1;
                }
                switch (alt71) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1874:14: assignment_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_assignment_list_in_list_decl3296);
                        assignment_list247=assignment_list();

                        state._fsp--;

                        adaptor.addChild(root_1, assignment_list247.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                int startIndex = (LIST_T246).startIndex;
                int endIndex = LIST_T246.endIndex + 1;
                retval.expr = new ListVariable(startIndex, endIndex, (assignment_list247!=null?assignment_list247.assignList:null));
              

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1882:1: assignment_list returns [List assignList] : ( assignment_element )+ ;
    public final TreePHP.assignment_list_return assignment_list() throws RecognitionException {
        assignment_list_stack.push(new assignment_list_scope());
        TreePHP.assignment_list_return retval = new TreePHP.assignment_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.assignment_element_return assignment_element248 = null;




          ((assignment_list_scope)assignment_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1889:3: ( ( assignment_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1889:5: ( assignment_element )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1889:5: ( assignment_element )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1889:5: assignment_element
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_assignment_element_in_assignment_list3328);
            	    assignment_element248=assignment_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, assignment_element248.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1895:1: assignment_element : ( variable | list_decl );
    public final TreePHP.assignment_element_return assignment_element() throws RecognitionException {
        TreePHP.assignment_element_return retval = new TreePHP.assignment_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.variable_return variable249 = null;

        TreePHP.list_decl_return list_decl250 = null;



        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1896:3: ( variable | list_decl )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1896:5: variable
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_in_assignment_element3346);
                    variable249=variable();

                    state._fsp--;

                    adaptor.addChild(root_0, variable249.getTree());

                        ((assignment_list_scope)assignment_list_stack.peek()).list.add((variable249!=null?variable249.var:null));
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1900:5: list_decl
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_list_decl_in_assignment_element3356);
                    list_decl250=list_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, list_decl250.getTree());

                        ((assignment_list_scope)assignment_list_stack.peek()).list.add((list_decl250!=null?list_decl250.expr:null));
                      

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1906:1: array_pair_list returns [List arrayList] : ( array_pair_element )+ ;
    public final TreePHP.array_pair_list_return array_pair_list() throws RecognitionException {
        array_pair_list_stack.push(new array_pair_list_scope());
        TreePHP.array_pair_list_return retval = new TreePHP.array_pair_list_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.array_pair_element_return array_pair_element251 = null;




          ((array_pair_list_scope)array_pair_list_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1913:3: ( ( array_pair_element )+ )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1913:5: ( array_pair_element )+
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1913:5: ( array_pair_element )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1913:5: array_pair_element
            	    {
            	    _last = (SLAST)input.LT(1);
            	    pushFollow(FOLLOW_array_pair_element_in_array_pair_list3388);
            	    array_pair_element251=array_pair_element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, array_pair_element251.getTree());

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1919:1: array_pair_element : ( ^( ARROW_T e1= expression e2= expression ) | e= expression );
    public final TreePHP.array_pair_element_return array_pair_element() throws RecognitionException {
        TreePHP.array_pair_element_return retval = new TreePHP.array_pair_element_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST ARROW_T252=null;
        TreePHP.expression_return e1 = null;

        TreePHP.expression_return e2 = null;

        TreePHP.expression_return e = null;


        SLAST ARROW_T252_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1920:3: ( ^( ARROW_T e1= expression e2= expression ) | e= expression )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1920:5: ^( ARROW_T e1= expression e2= expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    ARROW_T252=(SLAST)match(input,ARROW_T,FOLLOW_ARROW_T_in_array_pair_element3409); 
                    ARROW_T252_tree = (SLAST)adaptor.dupNode(ARROW_T252);

                    root_1 = (SLAST)adaptor.becomeRoot(ARROW_T252_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_array_pair_element3413);
                    e1=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_array_pair_element3417);
                    e2=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, e2.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = ARROW_T252.startIndex;
                        int endIndex = ARROW_T252.endIndex + 1;
                        Expression key = (e1!=null?e1.expr:null);
                        Expression value = (e2!=null?e2.expr:null); 
                        ArrayElement element = new ArrayElement(startIndex, endIndex, key, value);
                        ((array_pair_list_scope)array_pair_list_stack.peek()).list.add(element);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1929:5: e= expression
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_array_pair_element3430);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1939:1: variable returns [Expression var, PHPCallArgumentsList parameterList] : variable_temp ;
    public final TreePHP.variable_return variable() throws RecognitionException {
        variable_stack.push(new variable_scope());
        TreePHP.variable_return retval = new TreePHP.variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        TreePHP.variable_temp_return variable_temp253 = null;




          ((variable_scope)variable_stack.peek()).list = new LinkedList();

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1946:3: ( variable_temp )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1946:5: variable_temp
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_variable_temp_in_variable3465);
            variable_temp253=variable_temp();

            state._fsp--;

            adaptor.addChild(root_0, variable_temp253.getTree());

                Iterator iter = ((variable_scope)variable_stack.peek()).list.iterator();
                Expression dispatcher = (variable_temp253!=null?variable_temp253.var:null);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1970:1: variable_temp returns [Expression var, PHPCallArgumentsList parameterList] : ( base_variable_with_function_calls | ^( CALL v1= variable_temp obj= object_property ( ctor_arguments )? ) );
    public final TreePHP.variable_temp_return variable_temp() throws RecognitionException {
        TreePHP.variable_temp_return retval = new TreePHP.variable_temp_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST CALL255=null;
        TreePHP.variable_temp_return v1 = null;

        TreePHP.object_property_return obj = null;

        TreePHP.base_variable_with_function_calls_return base_variable_with_function_calls254 = null;

        TreePHP.ctor_arguments_return ctor_arguments256 = null;


        SLAST CALL255_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1971:3: ( base_variable_with_function_calls | ^( CALL v1= variable_temp obj= object_property ( ctor_arguments )? ) )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1971:5: base_variable_with_function_calls
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_base_variable_with_function_calls_in_variable_temp3488);
                    base_variable_with_function_calls254=base_variable_with_function_calls();

                    state._fsp--;

                    adaptor.addChild(root_0, base_variable_with_function_calls254.getTree());

                         retval.var = (base_variable_with_function_calls254!=null?base_variable_with_function_calls254.var:null);
                         retval.parameterList = (base_variable_with_function_calls254!=null?base_variable_with_function_calls254.parameterList:null);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1976:5: ^( CALL v1= variable_temp obj= object_property ( ctor_arguments )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CALL255=(SLAST)match(input,CALL,FOLLOW_CALL_in_variable_temp3500); 
                    CALL255_tree = (SLAST)adaptor.dupNode(CALL255);

                    root_1 = (SLAST)adaptor.becomeRoot(CALL255_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_variable_temp_in_variable_temp3504);
                    v1=variable_temp();

                    state._fsp--;

                    adaptor.addChild(root_1, v1.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_variable_temp3508);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1976:49: ( ctor_arguments )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==ARGU) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:1976:49: ctor_arguments
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_ctor_arguments_in_variable_temp3510);
                            ctor_arguments256=ctor_arguments();

                            state._fsp--;

                            adaptor.addChild(root_1, ctor_arguments256.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                          retval.var = (v1!=null?v1.var:null);

                          int startIndex = CALL255.startIndex;
                          int endIndex = CALL255.endIndex + 1;

                          Expression firstVarProperty = null;
                          if ((ctor_arguments256!=null?ctor_arguments256.argumentList:null) == null) {
                            firstVarProperty = (obj!=null?obj.expr:null);
                            if ((obj!=null?obj.simpleRef:null) != null) {
                              firstVarProperty = (obj!=null?obj.simpleRef:null);
                            }
                          }
                          else {
                            if ((obj!=null?obj.simpleRef:null).getClass().equals(SimpleReference.class)) {
                    		      firstVarProperty = new PHPCallExpression(startIndex, endIndex, null, (obj!=null?obj.simpleRef:null), (ctor_arguments256!=null?ctor_arguments256.argumentList:null));
                    		    } else {
                    		      firstVarProperty = new ReflectionCallExpression(startIndex, endIndex, null, (SimpleReference)(obj!=null?obj.simpleRef:null), (ctor_arguments256!=null?ctor_arguments256.argumentList:null));
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2003:1: base_variable_with_function_calls returns [Expression var, PHPCallArgumentsList parameterList, TypeReference type, Expression functionInvocation] : ( ^( VAR_DECL ( fully_qualified_class_name )? obj= object_property ( ctor_arguments )? ) | ^( CALL fully_qualified_class_name ctor_arguments ) );
    public final TreePHP.base_variable_with_function_calls_return base_variable_with_function_calls() throws RecognitionException {
        TreePHP.base_variable_with_function_calls_return retval = new TreePHP.base_variable_with_function_calls_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST VAR_DECL257=null;
        SLAST CALL260=null;
        TreePHP.object_property_return obj = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name258 = null;

        TreePHP.ctor_arguments_return ctor_arguments259 = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name261 = null;

        TreePHP.ctor_arguments_return ctor_arguments262 = null;


        SLAST VAR_DECL257_tree=null;
        SLAST CALL260_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2004:3: ( ^( VAR_DECL ( fully_qualified_class_name )? obj= object_property ( ctor_arguments )? ) | ^( CALL fully_qualified_class_name ctor_arguments ) )
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2004:5: ^( VAR_DECL ( fully_qualified_class_name )? obj= object_property ( ctor_arguments )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    VAR_DECL257=(SLAST)match(input,VAR_DECL,FOLLOW_VAR_DECL_in_base_variable_with_function_calls3536); 
                    VAR_DECL257_tree = (SLAST)adaptor.dupNode(VAR_DECL257);

                    root_1 = (SLAST)adaptor.becomeRoot(VAR_DECL257_tree, root_1);



                    match(input, Token.DOWN, null); 
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2004:16: ( fully_qualified_class_name )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==IDENTIFIER||LA78_0==DOMAIN_T) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2004:16: fully_qualified_class_name
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3538);
                            fully_qualified_class_name258=fully_qualified_class_name();

                            state._fsp--;

                            adaptor.addChild(root_1, fully_qualified_class_name258.getTree());

                            }
                            break;

                    }

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_base_variable_with_function_calls3543);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2004:64: ( ctor_arguments )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==ARGU) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2004:64: ctor_arguments
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls3545);
                            ctor_arguments259=ctor_arguments();

                            state._fsp--;

                            adaptor.addChild(root_1, ctor_arguments259.getTree());

                            }
                            break;

                    }


                        int startIndex = VAR_DECL257.startIndex;
                        int endIndex = VAR_DECL257.endIndex + 1;
                        System.out.println("varid: " + startIndex + " " + endIndex);
                        retval.var = (obj!=null?obj.expr:null);
                        TypeReference type = (fully_qualified_class_name258!=null?fully_qualified_class_name258.type:null);
                        
                        System.out.println("vardddd:" + retval.var);
                        
                        if (type != null) {
                            retval.var = new StaticFieldAccess(startIndex, endIndex, (fully_qualified_class_name258!=null?fully_qualified_class_name258.type:null), (obj!=null?obj.expr:null));
                        }
                        
                        if ((ctor_arguments259!=null?ctor_arguments259.argumentList:null) != null) {
                          PHPCallArgumentsList parameters = (ctor_arguments259!=null?ctor_arguments259.argumentList:null);
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
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2034:5: ^( CALL fully_qualified_class_name ctor_arguments )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    CALL260=(SLAST)match(input,CALL,FOLLOW_CALL_in_base_variable_with_function_calls3566); 
                    CALL260_tree = (SLAST)adaptor.dupNode(CALL260);

                    root_1 = (SLAST)adaptor.becomeRoot(CALL260_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3568);
                    fully_qualified_class_name261=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_1, fully_qualified_class_name261.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_ctor_arguments_in_base_variable_with_function_calls3570);
                    ctor_arguments262=ctor_arguments();

                    state._fsp--;

                    adaptor.addChild(root_1, ctor_arguments262.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        int startIndex = CALL260.startIndex;
                        int endIndex = CALL260.endIndex + 1;
                        
                        TypeReference type = (fully_qualified_class_name261!=null?fully_qualified_class_name261.type:null);    
                        PHPCallArgumentsList parameters = (ctor_arguments262!=null?ctor_arguments262.argumentList:null);
                        
                        retval.type = type;
                        retval.parameterList = parameters;
                        
                        if ((fully_qualified_class_name261!=null?fully_qualified_class_name261.simpleRef:null) != null) {
                          retval.var = new StaticMethodInvocation(startIndex, endIndex, (TypeReference)(fully_qualified_class_name261!=null?fully_qualified_class_name261.type:null), (fully_qualified_class_name261!=null?fully_qualified_class_name261.simpleRef:null), parameters);
                        }
                        else {
                        
                    	    int functionNameLeft= ((CommonToken)(fully_qualified_class_name261!=null?((SLAST)fully_qualified_class_name261.tree):null).token).getStartIndex();
                    	    int functionNameRight= ((CommonToken)(fully_qualified_class_name261!=null?((SLAST)fully_qualified_class_name261.tree):null).token).getStopIndex() + 1;
                    	    String functionName = (fully_qualified_class_name261!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(fully_qualified_class_name261.start),
                      input.getTreeAdaptor().getTokenStopIndex(fully_qualified_class_name261.start))):null);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2061:1: dollars returns [int size, String str] : ( DOLLAR_T )* ;
    public final TreePHP.dollars_return dollars() throws RecognitionException {
        TreePHP.dollars_return retval = new TreePHP.dollars_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST DOLLAR_T263=null;

        SLAST DOLLAR_T263_tree=null;


          retval.size = 0;
          retval.str = "";

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2066:3: ( ( DOLLAR_T )* )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2066:5: ( DOLLAR_T )*
            {
            root_0 = (SLAST)adaptor.nil();

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2066:5: ( DOLLAR_T )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==DOLLAR_T) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2066:6: DOLLAR_T
            	    {
            	    _last = (SLAST)input.LT(1);
            	    DOLLAR_T263=(SLAST)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_dollars3602); 
            	    DOLLAR_T263_tree = (SLAST)adaptor.dupNode(DOLLAR_T263);

            	    adaptor.addChild(root_0, DOLLAR_T263_tree);

            	    retval.size++; retval.str += (DOLLAR_T263!=null?DOLLAR_T263.getText():null);

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2069:1: object_property returns [String str, Expression expr, SimpleReference simpleRef] : ( ^( VAR dollars IDENTIFIER ) | ^( VAR dollars expression ) | ^( INDEX obj= object_property ( expression )? ) | ^( HASH_INDEX obj= object_property ( expression )? ) );
    public final TreePHP.object_property_return object_property() throws RecognitionException {
        TreePHP.object_property_return retval = new TreePHP.object_property_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST VAR264=null;
        SLAST IDENTIFIER266=null;
        SLAST VAR267=null;
        SLAST INDEX270=null;
        SLAST HASH_INDEX272=null;
        TreePHP.object_property_return obj = null;

        TreePHP.dollars_return dollars265 = null;

        TreePHP.dollars_return dollars268 = null;

        TreePHP.expression_return expression269 = null;

        TreePHP.expression_return expression271 = null;

        TreePHP.expression_return expression273 = null;


        SLAST VAR264_tree=null;
        SLAST IDENTIFIER266_tree=null;
        SLAST VAR267_tree=null;
        SLAST INDEX270_tree=null;
        SLAST HASH_INDEX272_tree=null;


          int startIndex = -1;
          int endIndex = -1;
          SLAST ast = null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2078:3: ( ^( VAR dollars IDENTIFIER ) | ^( VAR dollars expression ) | ^( INDEX obj= object_property ( expression )? ) | ^( HASH_INDEX obj= object_property ( expression )? ) )
            int alt84=4;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2078:5: ^( VAR dollars IDENTIFIER )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    VAR264=(SLAST)match(input,VAR,FOLLOW_VAR_in_object_property3638); 
                    VAR264_tree = (SLAST)adaptor.dupNode(VAR264);

                    root_1 = (SLAST)adaptor.becomeRoot(VAR264_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_dollars_in_object_property3640);
                    dollars265=dollars();

                    state._fsp--;

                    adaptor.addChild(root_1, dollars265.getTree());
                    _last = (SLAST)input.LT(1);
                    IDENTIFIER266=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_object_property3642); 
                    IDENTIFIER266_tree = (SLAST)adaptor.dupNode(IDENTIFIER266);

                    adaptor.addChild(root_1, IDENTIFIER266_tree);


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                            int size = (dollars265!=null?dollars265.size:0);
                            
                            retval.str = (IDENTIFIER266!=null?IDENTIFIER266.getText():null);
                            startIndex = ((CommonToken)IDENTIFIER266.token).getStartIndex();
                            endIndex = ((CommonToken)IDENTIFIER266.token).getStopIndex() + 1;

                            if (!(dollars265!=null?dollars265.str:null).equals("")) {
                              retval.str = "$" + (IDENTIFIER266!=null?IDENTIFIER266.getText():null);
                              startIndex--;
                            }
                            
                            VariableReference variableRef = new VariableReference(startIndex, endIndex, retval.str ,PHPVariableKind.LOCAL);
                            retval.expr = variableRef;
                            
                            retval.simpleRef = new SimpleReference(startIndex, endIndex, retval.str);
                            ast = VAR264_tree;
                            
                            if ((dollars265!=null?dollars265.size:0) > 1) {
                              for (int i = 0; i < (dollars265!=null?dollars265.size:0) - 1; i++) {
                    				    retval.expr = new ReflectionVariableReference(startIndex - i - 1, endIndex, retval.expr);       
                    				  }
                            }
                        

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2103:5: ^( VAR dollars expression )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    VAR267=(SLAST)match(input,VAR,FOLLOW_VAR_in_object_property3656); 
                    VAR267_tree = (SLAST)adaptor.dupNode(VAR267);

                    root_1 = (SLAST)adaptor.becomeRoot(VAR267_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_dollars_in_object_property3658);
                    dollars268=dollars();

                    state._fsp--;

                    adaptor.addChild(root_1, dollars268.getTree());
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_expression_in_object_property3660);
                    expression269=expression();

                    state._fsp--;

                    adaptor.addChild(root_1, expression269.getTree());

                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        startIndex = VAR267.startIndex;
                        endIndex = VAR267.endIndex + 1;
                        retval.expr = new ReflectionVariableReference(startIndex, endIndex, (expression269!=null?expression269.expr:null));
                        ast = VAR267_tree;
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2110:5: ^( INDEX obj= object_property ( expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    INDEX270=(SLAST)match(input,INDEX,FOLLOW_INDEX_in_object_property3672); 
                    INDEX270_tree = (SLAST)adaptor.dupNode(INDEX270);

                    root_1 = (SLAST)adaptor.becomeRoot(INDEX270_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_object_property3676);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2110:33: ( expression )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==VAR_DECL||LA82_0==CALL||LA82_0==EXPR||(LA82_0>=SCALAR && LA82_0<=UNARY_EXPR)||LA82_0==REF_T||LA82_0==EQUAL_T||(LA82_0>=OR_T && LA82_0<=CLONE_T)||(LA82_0>=INSTANCEOF_T && LA82_0<=PRINT_T)) ) {
                        alt82=1;
                    }
                    switch (alt82) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2110:33: expression
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_expression_in_object_property3678);
                            expression271=expression();

                            state._fsp--;

                            adaptor.addChild(root_1, expression271.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        startIndex = INDEX270.startIndex;
                        endIndex = INDEX270.endIndex + 1;
                       
                       
                        Expression varName = (obj!=null?obj.expr:null);
                        Expression index = (expression271!=null?expression271.expr:null);
                        if ((expression271!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expression271.start),
                      input.getTreeAdaptor().getTokenStopIndex(expression271.start))):null) != null) {
                          if(varName.getKind() == ExpressionConstants.E_IDENTIFIER) {
                             retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableReference.VARIABLE_ARRAY);
                          } else {
                             retval.expr = new ReflectionArrayVariableReference(startIndex, endIndex, varName, index, ReflectionArrayVariableReference.VARIABLE_ARRAY);
                          }
                        }
                        else {
                           retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableReference.VARIABLE_ARRAY);
                        }
                        ast = INDEX270_tree;
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2130:5: ^( HASH_INDEX obj= object_property ( expression )? )
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    {
                    SLAST _save_last_1 = _last;
                    SLAST _first_1 = null;
                    SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
                    HASH_INDEX272=(SLAST)match(input,HASH_INDEX,FOLLOW_HASH_INDEX_in_object_property3691); 
                    HASH_INDEX272_tree = (SLAST)adaptor.dupNode(HASH_INDEX272);

                    root_1 = (SLAST)adaptor.becomeRoot(HASH_INDEX272_tree, root_1);



                    match(input, Token.DOWN, null); 
                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_object_property_in_object_property3695);
                    obj=object_property();

                    state._fsp--;

                    adaptor.addChild(root_1, obj.getTree());
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2130:38: ( expression )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==VAR_DECL||LA83_0==CALL||LA83_0==EXPR||(LA83_0>=SCALAR && LA83_0<=UNARY_EXPR)||LA83_0==REF_T||LA83_0==EQUAL_T||(LA83_0>=OR_T && LA83_0<=CLONE_T)||(LA83_0>=INSTANCEOF_T && LA83_0<=PRINT_T)) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2130:38: expression
                            {
                            _last = (SLAST)input.LT(1);
                            pushFollow(FOLLOW_expression_in_object_property3697);
                            expression273=expression();

                            state._fsp--;

                            adaptor.addChild(root_1, expression273.getTree());

                            }
                            break;

                    }


                    match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                        startIndex = HASH_INDEX272.startIndex;
                        endIndex = HASH_INDEX272.endIndex + 1;
                       
                        if (startIndex == 0 && (expression273!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expression273.start),
                      input.getTreeAdaptor().getTokenStopIndex(expression273.start))):null) != null) {
                           startIndex = (obj!=null?((SLAST)obj.tree):null).startIndex;
                           endIndex = (obj!=null?((SLAST)obj.tree):null).endIndex + (expression273!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expression273.start),
                      input.getTreeAdaptor().getTokenStopIndex(expression273.start))):null).length();
                        }
                        Expression varName = (obj!=null?obj.expr:null);
                        Expression index = (expression273!=null?expression273.expr:null);
                        if ((expression273!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expression273.start),
                      input.getTreeAdaptor().getTokenStopIndex(expression273.start))):null) != null) {
                          if(varName.getKind() == ExpressionConstants.E_IDENTIFIER) {
                             retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableReference.VARIABLE_HASHTABLE);
                          } else {
                             retval.expr = new ReflectionArrayVariableReference(startIndex, endIndex, varName, index, ReflectionArrayVariableReference.VARIABLE_HASHTABLE);
                          }
                        }
                        else {
                           retval.expr = new ArrayVariableReference(startIndex, endIndex, ((SimpleReference)varName).getName(), index, ArrayVariableReference.VARIABLE_HASHTABLE);
                        }
                        ast = HASH_INDEX272_tree;
                      

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2156:1: ctor_arguments returns [PHPCallArgumentsList argumentList] : ^( ARGU ( expr_list )? ) ;
    public final TreePHP.ctor_arguments_return ctor_arguments() throws RecognitionException {
        TreePHP.ctor_arguments_return retval = new TreePHP.ctor_arguments_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST ARGU274=null;
        TreePHP.expr_list_return expr_list275 = null;


        SLAST ARGU274_tree=null;


          SLAST ast = null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2163:3: ( ^( ARGU ( expr_list )? ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2163:6: ^( ARGU ( expr_list )? )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            ARGU274=(SLAST)match(input,ARGU,FOLLOW_ARGU_in_ctor_arguments3737); 
            ARGU274_tree = (SLAST)adaptor.dupNode(ARGU274);

            root_1 = (SLAST)adaptor.becomeRoot(ARGU274_tree, root_1);



            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2163:13: ( expr_list )?
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==VAR_DECL||LA85_0==CALL||LA85_0==EXPR||(LA85_0>=SCALAR && LA85_0<=UNARY_EXPR)||LA85_0==REF_T||LA85_0==EQUAL_T||(LA85_0>=OR_T && LA85_0<=CLONE_T)||(LA85_0>=INSTANCEOF_T && LA85_0<=PRINT_T)) ) {
                    alt85=1;
                }
                switch (alt85) {
                    case 1 :
                        // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2163:13: expr_list
                        {
                        _last = (SLAST)input.LT(1);
                        pushFollow(FOLLOW_expr_list_in_ctor_arguments3739);
                        expr_list275=expr_list();

                        state._fsp--;

                        adaptor.addChild(root_1, expr_list275.getTree());

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                int startIndex = ARGU274.startIndex + 1;
                int endIndex = ARGU274.endIndex;

            	  retval.argumentList = new PHPCallArgumentsList();
            	  retval.argumentList.setStart(startIndex);
            	  retval.argumentList.setEnd(endIndex);
            	  
            	  if ((expr_list275!=null?expr_list275.exprList:null) != null) {
            	    Iterator iter = (expr_list275!=null?expr_list275.exprList:null).iterator();
            	    while (iter.hasNext()) {
            	      retval.argumentList.addNode((Expression)iter.next());
            	    }
            	  }
            	  ast = ARGU274;
              

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2182:1: pure_variable returns [String str, Boolean isRef] : ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) ;
    public final TreePHP.pure_variable_return pure_variable() throws RecognitionException {
        TreePHP.pure_variable_return retval = new TreePHP.pure_variable_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST VAR_DECL276=null;
        SLAST REF_T277=null;
        SLAST DOLLAR_T278=null;
        SLAST IDENTIFIER279=null;

        SLAST VAR_DECL276_tree=null;
        SLAST REF_T277_tree=null;
        SLAST DOLLAR_T278_tree=null;
        SLAST IDENTIFIER279_tree=null;


          SLAST ast;
          retval.isRef = false;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2190:3: ( ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2190:5: ^( VAR_DECL ( REF_T )? ( DOLLAR_T )+ IDENTIFIER )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            VAR_DECL276=(SLAST)match(input,VAR_DECL,FOLLOW_VAR_DECL_in_pure_variable3775); 
            VAR_DECL276_tree = (SLAST)adaptor.dupNode(VAR_DECL276);

            root_1 = (SLAST)adaptor.becomeRoot(VAR_DECL276_tree, root_1);



            match(input, Token.DOWN, null); 
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2190:16: ( REF_T )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==REF_T) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2190:16: REF_T
                    {
                    _last = (SLAST)input.LT(1);
                    REF_T277=(SLAST)match(input,REF_T,FOLLOW_REF_T_in_pure_variable3777); 
                    REF_T277_tree = (SLAST)adaptor.dupNode(REF_T277);

                    adaptor.addChild(root_1, REF_T277_tree);


                    }
                    break;

            }

            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2190:23: ( DOLLAR_T )+
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
            	    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2190:23: DOLLAR_T
            	    {
            	    _last = (SLAST)input.LT(1);
            	    DOLLAR_T278=(SLAST)match(input,DOLLAR_T,FOLLOW_DOLLAR_T_in_pure_variable3780); 
            	    DOLLAR_T278_tree = (SLAST)adaptor.dupNode(DOLLAR_T278);

            	    adaptor.addChild(root_1, DOLLAR_T278_tree);


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
            IDENTIFIER279=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_pure_variable3783); 
            IDENTIFIER279_tree = (SLAST)adaptor.dupNode(IDENTIFIER279);

            adaptor.addChild(root_1, IDENTIFIER279_tree);


            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                if ((REF_T277!=null?REF_T277.getText():null) != null) {
                  retval.isRef = true;
                }
                retval.str = "$" + (IDENTIFIER279!=null?IDENTIFIER279.getText():null);
                ast = VAR_DECL276;
              

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2200:1: scalar returns [Expression expr] : ^( SCALAR constant ) ;
    public final TreePHP.scalar_return scalar() throws RecognitionException {
        TreePHP.scalar_return retval = new TreePHP.scalar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST SCALAR280=null;
        TreePHP.constant_return constant281 = null;


        SLAST SCALAR280_tree=null;


          SLAST ast = null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2207:3: ( ^( SCALAR constant ) )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2207:5: ^( SCALAR constant )
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            {
            SLAST _save_last_1 = _last;
            SLAST _first_1 = null;
            SLAST root_1 = (SLAST)adaptor.nil();_last = (SLAST)input.LT(1);
            SCALAR280=(SLAST)match(input,SCALAR,FOLLOW_SCALAR_in_scalar3816); 
            SCALAR280_tree = (SLAST)adaptor.dupNode(SCALAR280);

            root_1 = (SLAST)adaptor.becomeRoot(SCALAR280_tree, root_1);



            match(input, Token.DOWN, null); 
            _last = (SLAST)input.LT(1);
            pushFollow(FOLLOW_constant_in_scalar3818);
            constant281=constant();

            state._fsp--;

            adaptor.addChild(root_1, constant281.getTree());

            match(input, Token.UP, null); adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


                if ((constant281!=null?constant281.expr:null) != null ) {
                  retval.expr = (constant281!=null?constant281.expr:null);
                }
                else {
                  retval.expr = (constant281!=null?constant281.scalar:null);
                }
                ast = (constant281!=null?((SLAST)constant281.tree):null);
              

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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2219:1: constant returns [Scalar scalar, Expression expr] : ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | REALLITERAL | DOUBLELITERRAL | common_scalar | IDENTIFIER | fully_qualified_class_name | HERE_DOC );
    public final TreePHP.constant_return constant() throws RecognitionException {
        TreePHP.constant_return retval = new TreePHP.constant_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST INTLITERAL282=null;
        SLAST FLOATLITERAL283=null;
        SLAST STRINGLITERAL284=null;
        SLAST REALLITERAL285=null;
        SLAST DOUBLELITERRAL286=null;
        SLAST IDENTIFIER288=null;
        SLAST HERE_DOC290=null;
        TreePHP.common_scalar_return common_scalar287 = null;

        TreePHP.fully_qualified_class_name_return fully_qualified_class_name289 = null;


        SLAST INTLITERAL282_tree=null;
        SLAST FLOATLITERAL283_tree=null;
        SLAST STRINGLITERAL284_tree=null;
        SLAST REALLITERAL285_tree=null;
        SLAST DOUBLELITERRAL286_tree=null;
        SLAST IDENTIFIER288_tree=null;
        SLAST HERE_DOC290_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2220:3: ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | REALLITERAL | DOUBLELITERRAL | common_scalar | IDENTIFIER | fully_qualified_class_name | HERE_DOC )
            int alt88=9;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2220:7: INTLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    INTLITERAL282=(SLAST)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_constant3844); 
                    INTLITERAL282_tree = (SLAST)adaptor.dupNode(INTLITERAL282);

                    adaptor.addChild(root_0, INTLITERAL282_tree);


                        CommonToken token = (CommonToken)INTLITERAL282.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        retval.scalar = new Scalar(startIndex, endIndex, (INTLITERAL282!=null?INTLITERAL282.getText():null), Scalar.TYPE_INT);
                      

                    }
                    break;
                case 2 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2227:7: FLOATLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    FLOATLITERAL283=(SLAST)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_constant3856); 
                    FLOATLITERAL283_tree = (SLAST)adaptor.dupNode(FLOATLITERAL283);

                    adaptor.addChild(root_0, FLOATLITERAL283_tree);


                        CommonToken token = (CommonToken)FLOATLITERAL283.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        retval.scalar = new Scalar(startIndex, endIndex, (FLOATLITERAL283!=null?FLOATLITERAL283.getText():null), Scalar.TYPE_REAL);
                      

                    }
                    break;
                case 3 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2234:7: STRINGLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    STRINGLITERAL284=(SLAST)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_constant3868); 
                    STRINGLITERAL284_tree = (SLAST)adaptor.dupNode(STRINGLITERAL284);

                    adaptor.addChild(root_0, STRINGLITERAL284_tree);


                        CommonToken token = (CommonToken)STRINGLITERAL284.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        retval.scalar = new Scalar(startIndex, endIndex, (STRINGLITERAL284!=null?STRINGLITERAL284.getText():null), Scalar.TYPE_STRING);
                      

                    }
                    break;
                case 4 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2251:7: REALLITERAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    REALLITERAL285=(SLAST)match(input,REALLITERAL,FOLLOW_REALLITERAL_in_constant3890); 
                    REALLITERAL285_tree = (SLAST)adaptor.dupNode(REALLITERAL285);

                    adaptor.addChild(root_0, REALLITERAL285_tree);


                        CommonToken token = (CommonToken)REALLITERAL285.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        System.out.println("real id:" + startIndex + " " + endIndex);
                        retval.scalar = new Scalar(startIndex, endIndex, (REALLITERAL285!=null?REALLITERAL285.getText():null), Scalar.TYPE_REAL);
                      

                    }
                    break;
                case 5 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2260:7: DOUBLELITERRAL
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    DOUBLELITERRAL286=(SLAST)match(input,DOUBLELITERRAL,FOLLOW_DOUBLELITERRAL_in_constant3905); 
                    DOUBLELITERRAL286_tree = (SLAST)adaptor.dupNode(DOUBLELITERRAL286);

                    adaptor.addChild(root_0, DOUBLELITERRAL286_tree);


                        CommonToken token = (CommonToken)DOUBLELITERRAL286.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex() + 1;
                        retval.scalar = new Scalar(startIndex, endIndex, (DOUBLELITERRAL286!=null?DOUBLELITERRAL286.getText():null), Scalar.TYPE_REAL);
                      

                    }
                    break;
                case 6 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2267:7: common_scalar
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_common_scalar_in_constant3917);
                    common_scalar287=common_scalar();

                    state._fsp--;

                    adaptor.addChild(root_0, common_scalar287.getTree());

                          CommonToken token = (CommonToken)(common_scalar287!=null?((SLAST)common_scalar287.tree):null).token;
                          int startIndex = token.getStartIndex();
                          int endIndex = token.getStopIndex() + 1;
                          retval.scalar = new Scalar(startIndex, endIndex, (common_scalar287!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(common_scalar287.start),
                      input.getTreeAdaptor().getTokenStopIndex(common_scalar287.start))):null), Scalar.TYPE_SYSTEM);
                      

                    }
                    break;
                case 7 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2274:7: IDENTIFIER
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    IDENTIFIER288=(SLAST)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_constant3929); 
                    IDENTIFIER288_tree = (SLAST)adaptor.dupNode(IDENTIFIER288);

                    adaptor.addChild(root_0, IDENTIFIER288_tree);


                          CommonToken token = (CommonToken)IDENTIFIER288.token;
                    	    int startIndex = token.getStartIndex();
                    	    int endIndex = token.getStopIndex() + 1;
                    	    retval.scalar = new Scalar(startIndex, endIndex, (IDENTIFIER288!=null?IDENTIFIER288.getText():null), Scalar.TYPE_STRING);
                      

                    }
                    break;
                case 8 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2281:7: fully_qualified_class_name
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    pushFollow(FOLLOW_fully_qualified_class_name_in_constant3941);
                    fully_qualified_class_name289=fully_qualified_class_name();

                    state._fsp--;

                    adaptor.addChild(root_0, fully_qualified_class_name289.getTree());

                          if ((fully_qualified_class_name289!=null?fully_qualified_class_name289.constant:null) != null) {
                            retval.expr = (fully_qualified_class_name289!=null?fully_qualified_class_name289.constant:null);
                          }
                          else {
                            retval.expr = (fully_qualified_class_name289!=null?fully_qualified_class_name289.type:null);
                          }
                      

                    }
                    break;
                case 9 :
                    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2290:6: HERE_DOC
                    {
                    root_0 = (SLAST)adaptor.nil();

                    _last = (SLAST)input.LT(1);
                    HERE_DOC290=(SLAST)match(input,HERE_DOC,FOLLOW_HERE_DOC_in_constant3952); 
                    HERE_DOC290_tree = (SLAST)adaptor.dupNode(HERE_DOC290);

                    adaptor.addChild(root_0, HERE_DOC290_tree);


                        CommonToken token = (CommonToken)HERE_DOC290.token;
                        int startIndex = token.getStartIndex();
                        int endIndex = token.getStopIndex();
                        int index1 = "<<<Heredoc".length() + startIndex + 1;
                        int index2 = (HERE_DOC290!=null?HERE_DOC290.getText():null).lastIndexOf("Heredoc") - "Heredoc;".length();

                        if (index1 < index2) {
                           Scalar scalar = new Scalar(index1, endIndex - 1, (HERE_DOC290!=null?HERE_DOC290.getText():null).substring(index1, index2), Scalar.TYPE_STRING);
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
    // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2310:1: common_scalar : ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' );
    public final TreePHP.common_scalar_return common_scalar() throws RecognitionException {
        TreePHP.common_scalar_return retval = new TreePHP.common_scalar_return();
        retval.start = input.LT(1);

        SLAST root_0 = null;

        SLAST _first_0 = null;
        SLAST _last = null;

        SLAST set291=null;

        SLAST set291_tree=null;

        try {
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:2311:3: ( '__CLASS__' | '__DIR__' | '__FILE__' | '__FUNCTION__' | '__METHOD__' | '__LINE__' | '__NAMESPACE__' )
            // /home/dustin/ws-soc/org.eclipse.php.core/src/org/eclipse/php/internal/core/compiler/ast/parser/php4/TreePHP.g:
            {
            root_0 = (SLAST)adaptor.nil();

            _last = (SLAST)input.LT(1);
            set291=(SLAST)input.LT(1);
            if ( (input.LA(1)>=189 && input.LA(1)<=195) ) {
                input.consume();

                set291_tree = (SLAST)adaptor.dupNode(set291);

                adaptor.addChild(root_0, set291_tree);

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
        "\1\u0092\53\uffff\1\44\11\uffff";
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
            "\1\50\1\27\21\uffff\1\26\32\uffff\1\5\15\uffff\1\2\1\3\1\4\1"+
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
            return "1241:1: expression returns [Expression expr] : ( ^( EXPR etop= expression ) | ^( OR_T e1= expression e2= expression ) | ^( XOR_T e1= expression e2= expression ) | ^( AND_T e1= expression e2= expression ) | ^( EQUAL_T e1= expression e2= expression ) | ^( PLUS_EQ e1= expression e2= expression ) | ^( MINUS_EQ e1= expression e2= expression ) | ^( MUL_EQ e1= expression e2= expression ) | ^( DIV_EQ e1= expression e2= expression ) | ^( DOT_EQ e1= expression e2= expression ) | ^( PERCENT_EQ e1= expression e2= expression ) | ^( BIT_AND_EQ e1= expression e2= expression ) | ^( BIT_OR_EQ e1= expression e2= expression ) | ^( POWER_EQ e1= expression e2= expression ) | ^( LMOVE_EQ e1= expression e2= expression ) | ^( RMOVE_EQ e1= expression e2= expression ) | ^( QUESTION_T e1= expression ^( COLON_T e2= expression e3= expression ) ) | ^( LOGICAL_OR_T e1= expression e2= expression ) | ^( LOGICAL_AND_T e1= expression e2= expression ) | ^( BIT_OR_T e1= expression e2= expression ) | ^( POWER_T e1= expression e2= expression ) | ^( REF_T e1= expression e2= expression ) | ^( UNARY_EXPR unary_symbol_list e= expression ) | ^( DOT_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_T e1= expression e2= expression ) | ^( EQUAL_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( NOT_EQUAL_EQUAL_T e1= expression e2= expression ) | ^( LT_T e1= expression e2= expression ) | ^( MT_T e1= expression e2= expression ) | ^( LE_T e1= expression e2= expression ) | ^( ME_T e1= expression e2= expression ) | ^( LSHIFT_T e1= expression e2= expression ) | ^( RSHIFT_T e1= expression e2= expression ) | ^( PLUS_T e1= expression e2= expression ) | ^( MINUS_T e1= expression e2= expression ) | ^( MUL_T e1= expression e2= expression ) | ^( DIV_T e1= expression e2= expression ) | ^( PERCENT_T e1= expression e2= expression ) | ^( CAST_EXPR cast_option e= expression ) | ^( POSTFIX_EXPR e= expression plus_minus ) | ^( PREFIX_EXPR ( plus_minus )+ e= expression ) | ^( INSTANCEOF_T e= expression class_name_reference ) | ( AT_T )? variable | ( AT_T )? scalar | list_decl | ^( ARRAY_DECL ( array_pair_list )? ) | ^( NEW_T class_name_reference ) | ^( CLONE_T variable ) | ^( UNSET_T variable_list ) | BACKTRICKLITERAL | ^( PRINT_T e= expression ) );";
        }
    }
    static final String DFA84_eotS =
        "\10\uffff";
    static final String DFA84_eofS =
        "\10\uffff";
    static final String DFA84_minS =
        "\1\21\1\2\2\uffff\2\15\2\uffff";
    static final String DFA84_maxS =
        "\1\53\1\2\2\uffff\2\u0096\2\uffff";
    static final String DFA84_acceptS =
        "\2\uffff\1\3\1\4\2\uffff\1\1\1\2";
    static final String DFA84_specialS =
        "\10\uffff}>";
    static final String[] DFA84_transitionS = {
            "\1\2\30\uffff\1\1\1\3",
            "\1\4",
            "",
            "",
            "\1\7\5\uffff\1\7\1\uffff\1\7\16\uffff\6\7\12\uffff\1\6\6\uffff"+
            "\1\7\32\uffff\1\7\15\uffff\45\7\4\uffff\6\7\3\uffff\1\5",
            "\1\7\5\uffff\1\7\1\uffff\1\7\16\uffff\6\7\12\uffff\1\6\6\uffff"+
            "\1\7\32\uffff\1\7\15\uffff\45\7\4\uffff\6\7\3\uffff\1\5",
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
            return "2069:1: object_property returns [String str, Expression expr, SimpleReference simpleRef] : ( ^( VAR dollars IDENTIFIER ) | ^( VAR dollars expression ) | ^( INDEX obj= object_property ( expression )? ) | ^( HASH_INDEX obj= object_property ( expression )? ) );";
        }
    }
    static final String DFA88_eotS =
        "\12\uffff";
    static final String DFA88_eofS =
        "\12\uffff";
    static final String DFA88_minS =
        "\1\64\11\uffff";
    static final String DFA88_maxS =
        "\1\u00c3\11\uffff";
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
            return "2219:1: constant returns [Scalar scalar, Expression expr] : ( INTLITERAL | FLOATLITERAL | STRINGLITERAL | REALLITERAL | DOUBLELITERRAL | common_scalar | IDENTIFIER | fully_qualified_class_name | HERE_DOC );";
        }
    }
 

    public static final BitSet FOLLOW_ModuleDeclaration_in_php_source54 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_top_statement_list_in_php_source56 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_top_statement_in_top_statement_list75 = new BitSet(new long[]{0x0208000000004202L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_statement_in_top_statement89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_statement_in_top_statement99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_declaration_statement_in_top_statement109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_halt_compiler_statement_in_top_statement119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_statement_in_inner_statement_list146 = new BitSet(new long[]{0x0208000000004202L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_statement_in_inner_statement168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_declaration_statement_in_inner_statement178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_declaration_statement_in_inner_statement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_halt_compiler_statement_in_inner_statement198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_halt_compiler_statement213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASS_T_in_class_declaration_statement233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_entr_type_in_class_declaration_statement235 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement238 = new BitSet(new long[]{0x0060000000000088L});
    public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_class_declaration_statement254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPLEMENTS_T_in_class_declaration_statement261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement263 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_BODY_in_class_declaration_statement276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_statement_list_in_class_declaration_statement278 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_T_in_class_declaration_statement295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_declaration_statement297 = new BitSet(new long[]{0x0020000000000088L});
    public static final BitSet FOLLOW_EXTENDS_T_in_class_declaration_statement301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_list_in_class_declaration_statement303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_BODY_in_class_declaration_statement322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_statement_list_in_class_declaration_statement324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_class_entr_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_class_statement_in_class_statement_list370 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_FIELD_DECL_in_class_statement395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_modifiers_in_class_statement399 = new BitSet(new long[]{0x0000000000002000L,0x0000000000400000L});
    public static final BitSet FOLLOW_static_var_element_in_class_statement401 = new BitSet(new long[]{0x0000000000002008L,0x0000000000400000L});
    public static final BitSet FOLLOW_METHOD_DECL_in_class_statement416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_class_statement418 = new BitSet(new long[]{0x0810000000000000L});
    public static final BitSet FOLLOW_REF_T_in_class_statement420 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_class_statement423 = new BitSet(new long[]{0x0000000800001800L});
    public static final BitSet FOLLOW_parameter_list_in_class_statement437 = new BitSet(new long[]{0x0000000800001000L});
    public static final BitSet FOLLOW_block_in_class_statement453 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EMPTYSTATEMENT_in_class_statement472 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_DECL_in_class_statement495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONST_T_in_class_statement499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_directive_in_class_statement501 = new BitSet(new long[]{0x0000000000000008L,0x0000000000400000L});
    public static final BitSet FOLLOW_METHOD_DECL_in_function_declaration_statement527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REF_T_in_function_declaration_statement529 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_function_declaration_statement532 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_parameter_list_in_function_declaration_statement541 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_function_declaration_statement554 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inner_statement_list_in_block591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATEMENT_in_statement620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_topStatement_in_statement622 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_topStatement653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stat_in_topStatement664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_T_in_topStatement675 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_topStatement678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_while_statement_in_topStatement685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_T_in_topStatement700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_topStatement703 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement707 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_statement_in_topStatement710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_T_in_topStatement722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_topStatement726 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CONDITION_in_topStatement730 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_topStatement734 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ITERATE_in_topStatement739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_topStatement743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_for_statement_in_topStatement749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_T_in_topStatement761 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_topStatement764 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement768 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_switch_case_list_in_topStatement771 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_T_in_topStatement783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_T_in_topStatement798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_T_in_topStatement815 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GLOBAL_T_in_topStatement832 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_list_in_topStatement834 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_T_in_topStatement846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_static_var_list_in_topStatement848 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ECHO_T_in_topStatement860 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_topStatement862 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EMPTYSTATEMENT_in_topStatement874 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEMI_COLON_in_topStatement876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_topStatement887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOREACH_T_in_topStatement898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_AS_T_in_topStatement901 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement905 = new BitSet(new long[]{0x0800000000082000L});
    public static final BitSet FOLLOW_foreach_variable_in_topStatement909 = new BitSet(new long[]{0x0800000000082008L});
    public static final BitSet FOLLOW_foreach_variable_in_topStatement913 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_foreach_statement_in_topStatement917 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARE_T_in_topStatement930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_directive_in_topStatement932 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_declare_statement_in_topStatement934 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_T_in_topStatement947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_topStatement949 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_catch_branch_list_in_topStatement951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_T_in_topStatement963 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement967 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_USE_T_in_topStatement979 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scalar_in_topStatement981 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_USE_PARETHESIS_T_in_topStatement993 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_scalar_in_topStatement995 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INCLUDE_T_in_topStatement1007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement1011 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INCLUDE_ONCE_T_in_topStatement1024 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement1028 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUIRE_T_in_topStatement1041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement1045 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REQUIRE_ONCE_T_in_topStatement1058 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_topStatement1062 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REF_T_in_foreach_variable1093 = new BitSet(new long[]{0x0800000000082000L});
    public static final BitSet FOLLOW_variable_in_foreach_variable1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_use_filename0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_variable_list1156 = new BitSet(new long[]{0x0800000000082002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name_list1194 = new BitSet(new long[]{0x0010000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name1221 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_fully_qualified_class_name1225 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name1227 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_fully_qualified_class_name1241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOMAIN_T_in_fully_qualified_class_name1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_static_var_element_in_static_var_list1277 = new BitSet(new long[]{0x0000000000002002L,0x0000000000400000L});
    public static final BitSet FOLLOW_pure_variable_in_static_var_element1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_T_in_static_var_element1306 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_pure_variable_in_static_var_element1308 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_scalar_in_static_var_element1310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_T_in_if_stat1344 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_if_stat1348 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_if_stat1350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inner_statement_list_in_if_stat1366 = new BitSet(new long[]{0x0000000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_else_if_stat_in_if_stat1375 = new BitSet(new long[]{0x0000000000000008L,0x0000000003000000L});
    public static final BitSet FOLLOW_ELSE_T_in_if_stat1380 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_if_stat1382 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSEIF_T_in_else_if_stat1412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_CONDITION_in_else_if_stat1415 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_else_if_stat1417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inner_statement_list_in_else_if_stat1420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_case_list_in_switch_case_list1454 = new BitSet(new long[]{0x0000000000000002L,0x0000000060000000L});
    public static final BitSet FOLLOW_CASE_T_in_case_list1473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_case_list1477 = new BitSet(new long[]{0x0208000000004208L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_inner_statement_list_in_case_list1479 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_T_in_case_list1494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inner_statement_list_in_case_list1496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_catch_branch_in_catch_branch_list1530 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_CATCH_T_in_catch_branch1552 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_catch_branch1554 = new BitSet(new long[]{0x0800000000082000L});
    public static final BitSet FOLLOW_variable_in_catch_branch1556 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_block_in_catch_branch1558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_inner_statement_list_in_for_statement1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_statement_list_in_while_statement1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inner_statement_list_in_foreach_statement1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BLOCK_in_declare_statement1654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inner_statement_list_in_declare_statement1656 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parameter_in_parameter_list1692 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_PARAMETER_in_parameter1713 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TYPE_in_parameter1717 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_type_in_parameter1719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONST_T_in_parameter1724 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_pure_variable_in_parameter1727 = new BitSet(new long[]{0x0000001000000008L});
    public static final BitSet FOLLOW_scalar_in_parameter1729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_parameter_type1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cast_option_in_parameter_type1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_variable_modifiers1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_modifier_in_variable_modifiers1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_modifier1816 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x000EC00000000000L});
    public static final BitSet FOLLOW_178_in_modifier1824 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x000EC00000000000L});
    public static final BitSet FOLLOW_179_in_modifier1832 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x000EC00000000000L});
    public static final BitSet FOLLOW_STATIC_T_in_modifier1840 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x000EC00000000000L});
    public static final BitSet FOLLOW_174_in_modifier1849 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x000EC00000000000L});
    public static final BitSet FOLLOW_175_in_modifier1858 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L,0x000EC00000000000L});
    public static final BitSet FOLLOW_EQUAL_T_in_directive1890 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENTIFIER_in_directive1892 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_directive1894 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_expr_list1931 = new BitSet(new long[]{0x080003F000282002L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_EXPR_in_expression1965 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_T_in_expression1981 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1985 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression1989 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_T_in_expression2001 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2005 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2009 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_T_in_expression2021 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2025 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2029 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_T_in_expression2041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2045 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2049 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_EQ_in_expression2062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2066 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2070 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_EQ_in_expression2082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2086 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2090 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_EQ_in_expression2102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2106 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_EQ_in_expression2122 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2126 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_EQ_in_expression2142 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2146 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PERCENT_EQ_in_expression2162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2166 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_AND_EQ_in_expression2182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2186 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_OR_EQ_in_expression2202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2206 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2210 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POWER_EQ_in_expression2222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2226 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LMOVE_EQ_in_expression2242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2246 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2250 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RMOVE_EQ_in_expression2262 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2266 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_T_in_expression2282 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2286 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLON_T_in_expression2289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2293 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2297 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_T_in_expression2312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2316 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_T_in_expression2332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2336 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_OR_T_in_expression2352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2356 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2360 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POWER_T_in_expression2372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2376 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REF_T_in_expression2392 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2396 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2400 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_EXPR_in_expression2412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unary_symbol_list_in_expression2414 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2418 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOT_T_in_expression2430 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2434 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_EQUAL_T_in_expression2450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2454 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2458 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_T_in_expression2470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2474 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_EQUAL_EQUAL_T_in_expression2490 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2494 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2498 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_EQUAL_T_in_expression2510 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2514 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LT_T_in_expression2530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2534 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2538 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MT_T_in_expression2550 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2554 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2558 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LE_T_in_expression2570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2574 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2578 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ME_T_in_expression2590 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2594 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2598 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LSHIFT_T_in_expression2610 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2614 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2618 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RSHIFT_T_in_expression2630 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2634 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_T_in_expression2650 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2654 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2658 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_T_in_expression2670 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2674 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2678 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_T_in_expression2690 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2694 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_T_in_expression2710 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2714 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PERCENT_T_in_expression2730 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2734 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2738 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expression2750 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_cast_option_in_expression2752 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_expression2756 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSTFIX_EXPR_in_expression2780 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_plus_minus_in_expression2786 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_EXPR_in_expression2798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_plus_minus_in_expression2800 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007F9FFL});
    public static final BitSet FOLLOW_expression_in_expression2805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_T_in_expression2817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2821 = new BitSet(new long[]{0x0010000000082000L,0x0000000000100000L});
    public static final BitSet FOLLOW_class_name_reference_in_expression2823 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_T_in_expression2834 = new BitSet(new long[]{0x0800000000082000L});
    public static final BitSet FOLLOW_variable_in_expression2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_T_in_expression2847 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_scalar_in_expression2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_decl_in_expression2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECL_in_expression2871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_array_pair_list_in_expression2873 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NEW_T_in_expression2886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_class_name_reference_in_expression2888 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLONE_T_in_expression2903 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_in_expression2905 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNSET_T_in_expression2918 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_list_in_expression2920 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BACKTRICKLITERAL_in_expression2932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_T_in_expression2943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2947 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_unary_symbol_in_unary_symbol_list2981 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000000L,0x000000000000060CL});
    public static final BitSet FOLLOW_PLUS_T_in_unary_symbol3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_T_in_unary_symbol3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REF_T_in_unary_symbol3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TILDA_T_in_unary_symbol3028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXC_NOT_T_in_unary_symbol3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_plus_minus0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_cast_option3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_cast_option3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_cast_option3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_cast_option3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_cast_option3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_cast_option3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_cast_option3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_cast_option3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_cast_option3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNSET_T_in_cast_option3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLONE_T_in_cast_option3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dynamic_name_reference_in_class_name_reference3215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_class_name_reference3225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_variable_with_function_calls_in_dynamic_name_reference3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_dynamic_name_reference3260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dynamic_name_reference_in_dynamic_name_reference3264 = new BitSet(new long[]{0x00000C0000020000L});
    public static final BitSet FOLLOW_object_property_in_dynamic_name_reference3268 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_ctor_arguments_in_dynamic_name_reference3270 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_T_in_list_decl3294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_assignment_list_in_list_decl3296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_element_in_assignment_list3328 = new BitSet(new long[]{0x0800000000082002L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_variable_in_assignment_element3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_decl_in_assignment_element3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_pair_element_in_array_pair_list3388 = new BitSet(new long[]{0x080003F000282002L,0xFFFFFFF000400200L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_ARROW_T_in_array_pair_element3409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_array_pair_element3413 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_array_pair_element3417 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_array_pair_element3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_temp_in_variable3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_base_variable_with_function_calls_in_variable_temp3488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_variable_temp3500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_temp_in_variable_temp3504 = new BitSet(new long[]{0x00000C0000020000L});
    public static final BitSet FOLLOW_object_property_in_variable_temp3508 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_ctor_arguments_in_variable_temp3510 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECL_in_base_variable_with_function_calls3536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3538 = new BitSet(new long[]{0x00000C0000020000L});
    public static final BitSet FOLLOW_object_property_in_base_variable_with_function_calls3543 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls3545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CALL_in_base_variable_with_function_calls3566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_base_variable_with_function_calls3568 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ctor_arguments_in_base_variable_with_function_calls3570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOLLAR_T_in_dollars3602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_VAR_in_object_property3638 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dollars_in_object_property3640 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_object_property3642 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_in_object_property3656 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dollars_in_object_property3658 = new BitSet(new long[]{0x080003F000282000L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_object_property3660 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_object_property3672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_property_in_object_property3676 = new BitSet(new long[]{0x080003F000282008L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_object_property3678 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HASH_INDEX_in_object_property3691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_object_property_in_object_property3695 = new BitSet(new long[]{0x080003F000282008L,0xFFFFFFF000400000L,0x000000000007E1FFL});
    public static final BitSet FOLLOW_expression_in_object_property3697 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARGU_in_ctor_arguments3737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_list_in_ctor_arguments3739 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECL_in_pure_variable3775 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_REF_T_in_pure_variable3777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_DOLLAR_T_in_pure_variable3780 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_pure_variable3783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCALAR_in_scalar3816 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_in_scalar3818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTLITERAL_in_constant3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_constant3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_constant3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REALLITERAL_in_constant3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERRAL_in_constant3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_common_scalar_in_constant3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_constant3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fully_qualified_class_name_in_constant3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HERE_DOC_in_constant3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_common_scalar0 = new BitSet(new long[]{0x0000000000000002L});

}