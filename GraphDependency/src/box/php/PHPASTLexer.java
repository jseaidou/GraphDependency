// $ANTLR 3.5.2 PHPAST.g 2014-06-27 03:51:47

package box.php;
  
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PHPASTLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public PHPASTLexer() {} 
	public PHPASTLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public PHPASTLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "PHPAST.g"; }

	// $ANTLR start "T__176"
	public final void mT__176() throws RecognitionException {
		try {
			int _type = T__176;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:14:8: ( '__CLASS__' )
			// PHPAST.g:14:10: '__CLASS__'
			{
			match("__CLASS__"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__176"

	// $ANTLR start "T__177"
	public final void mT__177() throws RecognitionException {
		try {
			int _type = T__177;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:15:8: ( '__DIR__' )
			// PHPAST.g:15:10: '__DIR__'
			{
			match("__DIR__"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__177"

	// $ANTLR start "T__178"
	public final void mT__178() throws RecognitionException {
		try {
			int _type = T__178;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:16:8: ( '__FILE__' )
			// PHPAST.g:16:10: '__FILE__'
			{
			match("__FILE__"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__178"

	// $ANTLR start "T__179"
	public final void mT__179() throws RecognitionException {
		try {
			int _type = T__179;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:17:8: ( '__FUNCTION__' )
			// PHPAST.g:17:10: '__FUNCTION__'
			{
			match("__FUNCTION__"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__179"

	// $ANTLR start "T__180"
	public final void mT__180() throws RecognitionException {
		try {
			int _type = T__180;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:18:8: ( '__LINE__' )
			// PHPAST.g:18:10: '__LINE__'
			{
			match("__LINE__"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__180"

	// $ANTLR start "T__181"
	public final void mT__181() throws RecognitionException {
		try {
			int _type = T__181;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:19:8: ( '__METHOD__' )
			// PHPAST.g:19:10: '__METHOD__'
			{
			match("__METHOD__"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__181"

	// $ANTLR start "T__182"
	public final void mT__182() throws RecognitionException {
		try {
			int _type = T__182;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:20:8: ( '__NAMESPACE__' )
			// PHPAST.g:20:10: '__NAMESPACE__'
			{
			match("__NAMESPACE__"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__182"

	// $ANTLR start "T__183"
	public final void mT__183() throws RecognitionException {
		try {
			int _type = T__183;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:21:8: ( '__halt_compiler' )
			// PHPAST.g:21:10: '__halt_compiler'
			{
			match("__halt_compiler"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__183"

	// $ANTLR start "T__184"
	public final void mT__184() throws RecognitionException {
		try {
			int _type = T__184;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:22:8: ( 'abstract' )
			// PHPAST.g:22:10: 'abstract'
			{
			match("abstract"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__184"

	// $ANTLR start "T__185"
	public final void mT__185() throws RecognitionException {
		try {
			int _type = T__185;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:23:8: ( 'array' )
			// PHPAST.g:23:10: 'array'
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__185"

	// $ANTLR start "T__186"
	public final void mT__186() throws RecognitionException {
		try {
			int _type = T__186;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:24:8: ( 'bool' )
			// PHPAST.g:24:10: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__186"

	// $ANTLR start "T__187"
	public final void mT__187() throws RecognitionException {
		try {
			int _type = T__187;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:25:8: ( 'boolean' )
			// PHPAST.g:25:10: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__187"

	// $ANTLR start "T__188"
	public final void mT__188() throws RecognitionException {
		try {
			int _type = T__188;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:26:8: ( 'double' )
			// PHPAST.g:26:10: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__188"

	// $ANTLR start "T__189"
	public final void mT__189() throws RecognitionException {
		try {
			int _type = T__189;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:27:8: ( 'final' )
			// PHPAST.g:27:10: 'final'
			{
			match("final"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__189"

	// $ANTLR start "T__190"
	public final void mT__190() throws RecognitionException {
		try {
			int _type = T__190;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:28:8: ( 'float' )
			// PHPAST.g:28:10: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__190"

	// $ANTLR start "T__191"
	public final void mT__191() throws RecognitionException {
		try {
			int _type = T__191;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:29:8: ( 'int' )
			// PHPAST.g:29:10: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__191"

	// $ANTLR start "T__192"
	public final void mT__192() throws RecognitionException {
		try {
			int _type = T__192;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:30:8: ( 'object' )
			// PHPAST.g:30:10: 'object'
			{
			match("object"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__192"

	// $ANTLR start "T__193"
	public final void mT__193() throws RecognitionException {
		try {
			int _type = T__193;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:31:8: ( 'private' )
			// PHPAST.g:31:10: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__193"

	// $ANTLR start "T__194"
	public final void mT__194() throws RecognitionException {
		try {
			int _type = T__194;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:32:8: ( 'protected' )
			// PHPAST.g:32:10: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__194"

	// $ANTLR start "T__195"
	public final void mT__195() throws RecognitionException {
		try {
			int _type = T__195;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:33:8: ( 'public' )
			// PHPAST.g:33:10: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__195"

	// $ANTLR start "T__196"
	public final void mT__196() throws RecognitionException {
		try {
			int _type = T__196;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:34:8: ( 'real' )
			// PHPAST.g:34:10: 'real'
			{
			match("real"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__196"

	// $ANTLR start "T__197"
	public final void mT__197() throws RecognitionException {
		try {
			int _type = T__197;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:35:8: ( 'string' )
			// PHPAST.g:35:10: 'string'
			{
			match("string"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__197"

	// $ANTLR start "T__198"
	public final void mT__198() throws RecognitionException {
		try {
			int _type = T__198;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:36:8: ( 'var' )
			// PHPAST.g:36:10: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__198"

	// $ANTLR start "SOC_T"
	public final void mSOC_T() throws RecognitionException {
		try {
			int _type = SOC_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2227:7: ( '<?' )
			// PHPAST.g:2227:9: '<?'
			{
			match("<?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SOC_T"

	// $ANTLR start "SOC_PHP_T"
	public final void mSOC_PHP_T() throws RecognitionException {
		try {
			int _type = SOC_PHP_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2228:11: ( '<?php' )
			// PHPAST.g:2228:13: '<?php'
			{
			match("<?php"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SOC_PHP_T"

	// $ANTLR start "EOC_T"
	public final void mEOC_T() throws RecognitionException {
		try {
			int _type = EOC_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2229:7: ( '?>' )
			// PHPAST.g:2229:9: '?>'
			{
			match("?>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EOC_T"

	// $ANTLR start "DOLLAR_T"
	public final void mDOLLAR_T() throws RecognitionException {
		try {
			int _type = DOLLAR_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2230:10: ( '$' )
			// PHPAST.g:2230:12: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR_T"

	// $ANTLR start "LEFT_BRACKET"
	public final void mLEFT_BRACKET() throws RecognitionException {
		try {
			int _type = LEFT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2231:14: ( '{' )
			// PHPAST.g:2231:16: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_BRACKET"

	// $ANTLR start "RIGHT_BRACKET"
	public final void mRIGHT_BRACKET() throws RecognitionException {
		try {
			int _type = RIGHT_BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2232:15: ( '}' )
			// PHPAST.g:2232:17: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_BRACKET"

	// $ANTLR start "LEFT_PARETHESIS"
	public final void mLEFT_PARETHESIS() throws RecognitionException {
		try {
			int _type = LEFT_PARETHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2233:17: ( '(' )
			// PHPAST.g:2233:19: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_PARETHESIS"

	// $ANTLR start "RIGHT_PARETHESIS"
	public final void mRIGHT_PARETHESIS() throws RecognitionException {
		try {
			int _type = RIGHT_PARETHESIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2234:18: ( ')' )
			// PHPAST.g:2234:20: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_PARETHESIS"

	// $ANTLR start "LEFT_OPEN_RECT"
	public final void mLEFT_OPEN_RECT() throws RecognitionException {
		try {
			int _type = LEFT_OPEN_RECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2235:16: ( '[' )
			// PHPAST.g:2235:18: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_OPEN_RECT"

	// $ANTLR start "RIGHT_OPEN_RECT"
	public final void mRIGHT_OPEN_RECT() throws RecognitionException {
		try {
			int _type = RIGHT_OPEN_RECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2236:17: ( ']' )
			// PHPAST.g:2236:19: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_OPEN_RECT"

	// $ANTLR start "CLASS_T"
	public final void mCLASS_T() throws RecognitionException {
		try {
			int _type = CLASS_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2237:9: ( 'class' )
			// PHPAST.g:2237:11: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS_T"

	// $ANTLR start "TRAIT_T"
	public final void mTRAIT_T() throws RecognitionException {
		try {
			int _type = TRAIT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2238:9: ( 'trait' )
			// PHPAST.g:2238:11: 'trait'
			{
			match("trait"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRAIT_T"

	// $ANTLR start "FOR_T"
	public final void mFOR_T() throws RecognitionException {
		try {
			int _type = FOR_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2239:6: ( 'for' )
			// PHPAST.g:2239:8: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR_T"

	// $ANTLR start "BREAK_T"
	public final void mBREAK_T() throws RecognitionException {
		try {
			int _type = BREAK_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2240:8: ( 'break' )
			// PHPAST.g:2240:10: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK_T"

	// $ANTLR start "EXTENDS_T"
	public final void mEXTENDS_T() throws RecognitionException {
		try {
			int _type = EXTENDS_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2241:11: ( 'extends' )
			// PHPAST.g:2241:13: 'extends'
			{
			match("extends"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXTENDS_T"

	// $ANTLR start "IMPLEMENTS_T"
	public final void mIMPLEMENTS_T() throws RecognitionException {
		try {
			int _type = IMPLEMENTS_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2242:13: ( 'implements' )
			// PHPAST.g:2242:15: 'implements'
			{
			match("implements"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IMPLEMENTS_T"

	// $ANTLR start "INTERFACE_T"
	public final void mINTERFACE_T() throws RecognitionException {
		try {
			int _type = INTERFACE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2243:12: ( 'interface' )
			// PHPAST.g:2243:14: 'interface'
			{
			match("interface"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTERFACE_T"

	// $ANTLR start "FUNCTION_T"
	public final void mFUNCTION_T() throws RecognitionException {
		try {
			int _type = FUNCTION_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2244:11: ( 'function' )
			// PHPAST.g:2244:13: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION_T"

	// $ANTLR start "DO_T"
	public final void mDO_T() throws RecognitionException {
		try {
			int _type = DO_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2245:5: ( 'do' )
			// PHPAST.g:2245:7: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO_T"

	// $ANTLR start "WHILE_T"
	public final void mWHILE_T() throws RecognitionException {
		try {
			int _type = WHILE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2246:9: ( 'while' )
			// PHPAST.g:2246:11: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_T"

	// $ANTLR start "SWITCH_T"
	public final void mSWITCH_T() throws RecognitionException {
		try {
			int _type = SWITCH_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2247:9: ( 'switch' )
			// PHPAST.g:2247:11: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH_T"

	// $ANTLR start "CONTINUE_T"
	public final void mCONTINUE_T() throws RecognitionException {
		try {
			int _type = CONTINUE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2248:11: ( 'continue' )
			// PHPAST.g:2248:13: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE_T"

	// $ANTLR start "RETURN_T"
	public final void mRETURN_T() throws RecognitionException {
		try {
			int _type = RETURN_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2249:9: ( 'return' )
			// PHPAST.g:2249:11: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN_T"

	// $ANTLR start "GLOBAL_T"
	public final void mGLOBAL_T() throws RecognitionException {
		try {
			int _type = GLOBAL_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2250:9: ( 'global' )
			// PHPAST.g:2250:11: 'global'
			{
			match("global"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GLOBAL_T"

	// $ANTLR start "STATIC_T"
	public final void mSTATIC_T() throws RecognitionException {
		try {
			int _type = STATIC_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2251:9: ( 'static' )
			// PHPAST.g:2251:11: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC_T"

	// $ANTLR start "ECHO_T"
	public final void mECHO_T() throws RecognitionException {
		try {
			int _type = ECHO_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2252:7: ( 'echo' )
			// PHPAST.g:2252:9: 'echo'
			{
			match("echo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ECHO_T"

	// $ANTLR start "FOREACH_T"
	public final void mFOREACH_T() throws RecognitionException {
		try {
			int _type = FOREACH_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2253:10: ( 'foreach' )
			// PHPAST.g:2253:12: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOREACH_T"

	// $ANTLR start "AS_T"
	public final void mAS_T() throws RecognitionException {
		try {
			int _type = AS_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2254:5: ( 'as' )
			// PHPAST.g:2254:7: 'as'
			{
			match("as"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS_T"

	// $ANTLR start "DECLARE_T"
	public final void mDECLARE_T() throws RecognitionException {
		try {
			int _type = DECLARE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2255:10: ( 'declare' )
			// PHPAST.g:2255:12: 'declare'
			{
			match("declare"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DECLARE_T"

	// $ANTLR start "TRY_T"
	public final void mTRY_T() throws RecognitionException {
		try {
			int _type = TRY_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2256:6: ( 'try' )
			// PHPAST.g:2256:8: 'try'
			{
			match("try"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRY_T"

	// $ANTLR start "THROW_T"
	public final void mTHROW_T() throws RecognitionException {
		try {
			int _type = THROW_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2257:8: ( 'throw' )
			// PHPAST.g:2257:10: 'throw'
			{
			match("throw"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THROW_T"

	// $ANTLR start "USE_T"
	public final void mUSE_T() throws RecognitionException {
		try {
			int _type = USE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2258:6: ( 'use' )
			// PHPAST.g:2258:8: 'use'
			{
			match("use"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USE_T"

	// $ANTLR start "ELSEIF_T"
	public final void mELSEIF_T() throws RecognitionException {
		try {
			int _type = ELSEIF_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2259:9: ( 'elseif' )
			// PHPAST.g:2259:11: 'elseif'
			{
			match("elseif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSEIF_T"

	// $ANTLR start "ELSE_T"
	public final void mELSE_T() throws RecognitionException {
		try {
			int _type = ELSE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2260:7: ( 'else' )
			// PHPAST.g:2260:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE_T"

	// $ANTLR start "ENDIF_T"
	public final void mENDIF_T() throws RecognitionException {
		try {
			int _type = ENDIF_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2261:8: ( 'endif' )
			// PHPAST.g:2261:10: 'endif'
			{
			match("endif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDIF_T"

	// $ANTLR start "IF_T"
	public final void mIF_T() throws RecognitionException {
		try {
			int _type = IF_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2262:5: ( 'if' )
			// PHPAST.g:2262:7: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF_T"

	// $ANTLR start "ENDSWITCH_T"
	public final void mENDSWITCH_T() throws RecognitionException {
		try {
			int _type = ENDSWITCH_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2263:12: ( 'endswitch' )
			// PHPAST.g:2263:14: 'endswitch'
			{
			match("endswitch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDSWITCH_T"

	// $ANTLR start "CASE_T"
	public final void mCASE_T() throws RecognitionException {
		try {
			int _type = CASE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2264:7: ( 'case' )
			// PHPAST.g:2264:9: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE_T"

	// $ANTLR start "DEFAULT_T"
	public final void mDEFAULT_T() throws RecognitionException {
		try {
			int _type = DEFAULT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2265:10: ( 'default' )
			// PHPAST.g:2265:12: 'default'
			{
			match("default"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT_T"

	// $ANTLR start "CATCH_T"
	public final void mCATCH_T() throws RecognitionException {
		try {
			int _type = CATCH_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2266:8: ( 'catch' )
			// PHPAST.g:2266:10: 'catch'
			{
			match("catch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CATCH_T"

	// $ANTLR start "ENDFOR_T"
	public final void mENDFOR_T() throws RecognitionException {
		try {
			int _type = ENDFOR_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2267:9: ( 'endfor' )
			// PHPAST.g:2267:11: 'endfor'
			{
			match("endfor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDFOR_T"

	// $ANTLR start "ENDWHILE_T"
	public final void mENDWHILE_T() throws RecognitionException {
		try {
			int _type = ENDWHILE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2268:11: ( 'endwhile' )
			// PHPAST.g:2268:13: 'endwhile'
			{
			match("endwhile"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDWHILE_T"

	// $ANTLR start "ENDFOREACH_T"
	public final void mENDFOREACH_T() throws RecognitionException {
		try {
			int _type = ENDFOREACH_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2269:13: ( 'endforeach' )
			// PHPAST.g:2269:15: 'endforeach'
			{
			match("endforeach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDFOREACH_T"

	// $ANTLR start "ENDDECLARE_T"
	public final void mENDDECLARE_T() throws RecognitionException {
		try {
			int _type = ENDDECLARE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2270:13: ( 'enddeclare' )
			// PHPAST.g:2270:15: 'enddeclare'
			{
			match("enddeclare"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ENDDECLARE_T"

	// $ANTLR start "XOR_T"
	public final void mXOR_T() throws RecognitionException {
		try {
			int _type = XOR_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2271:6: ( 'XOR' )
			// PHPAST.g:2271:8: 'XOR'
			{
			match("XOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "XOR_T"

	// $ANTLR start "OR_T"
	public final void mOR_T() throws RecognitionException {
		try {
			int _type = OR_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2272:5: ( 'OR' )
			// PHPAST.g:2272:7: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_T"

	// $ANTLR start "AND_T"
	public final void mAND_T() throws RecognitionException {
		try {
			int _type = AND_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2273:6: ( 'AND' )
			// PHPAST.g:2273:8: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_T"

	// $ANTLR start "INSTANCEOF_T"
	public final void mINSTANCEOF_T() throws RecognitionException {
		try {
			int _type = INSTANCEOF_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2274:13: ( 'instanceof' )
			// PHPAST.g:2274:15: 'instanceof'
			{
			match("instanceof"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSTANCEOF_T"

	// $ANTLR start "CONST_T"
	public final void mCONST_T() throws RecognitionException {
		try {
			int _type = CONST_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2275:8: ( 'const' )
			// PHPAST.g:2275:10: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST_T"

	// $ANTLR start "LIST_T"
	public final void mLIST_T() throws RecognitionException {
		try {
			int _type = LIST_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2276:7: ( 'list' )
			// PHPAST.g:2276:9: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIST_T"

	// $ANTLR start "NEW_T"
	public final void mNEW_T() throws RecognitionException {
		try {
			int _type = NEW_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2277:6: ( 'new' )
			// PHPAST.g:2277:8: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_T"

	// $ANTLR start "CLONE_T"
	public final void mCLONE_T() throws RecognitionException {
		try {
			int _type = CLONE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2278:8: ( 'clone' )
			// PHPAST.g:2278:10: 'clone'
			{
			match("clone"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLONE_T"

	// $ANTLR start "UNSET_T"
	public final void mUNSET_T() throws RecognitionException {
		try {
			int _type = UNSET_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2280:8: ( 'unset' )
			// PHPAST.g:2280:10: 'unset'
			{
			match("unset"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNSET_T"

	// $ANTLR start "INCLUDE_T"
	public final void mINCLUDE_T() throws RecognitionException {
		try {
			int _type = INCLUDE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2281:10: ( 'include' )
			// PHPAST.g:2281:12: 'include'
			{
			match("include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE_T"

	// $ANTLR start "INCLUDE_ONCE_T"
	public final void mINCLUDE_ONCE_T() throws RecognitionException {
		try {
			int _type = INCLUDE_ONCE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2282:15: ( 'include_once' )
			// PHPAST.g:2282:17: 'include_once'
			{
			match("include_once"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE_ONCE_T"

	// $ANTLR start "REQUIRE_T"
	public final void mREQUIRE_T() throws RecognitionException {
		try {
			int _type = REQUIRE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2283:10: ( 'require' )
			// PHPAST.g:2283:12: 'require'
			{
			match("require"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REQUIRE_T"

	// $ANTLR start "REQUIRE_ONCE_T"
	public final void mREQUIRE_ONCE_T() throws RecognitionException {
		try {
			int _type = REQUIRE_ONCE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2284:15: ( 'require_once' )
			// PHPAST.g:2284:17: 'require_once'
			{
			match("require_once"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REQUIRE_ONCE_T"

	// $ANTLR start "PRINT_T"
	public final void mPRINT_T() throws RecognitionException {
		try {
			int _type = PRINT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2285:8: ( 'print' )
			// PHPAST.g:2285:10: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT_T"

	// $ANTLR start "NAMESPACE_T"
	public final void mNAMESPACE_T() throws RecognitionException {
		try {
			int _type = NAMESPACE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2286:12: ( 'namespace' )
			// PHPAST.g:2286:14: 'namespace'
			{
			match("namespace"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAMESPACE_T"

	// $ANTLR start "AT_T"
	public final void mAT_T() throws RecognitionException {
		try {
			int _type = AT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2287:5: ( '@' )
			// PHPAST.g:2287:7: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT_T"

	// $ANTLR start "PLUS_EQ"
	public final void mPLUS_EQ() throws RecognitionException {
		try {
			int _type = PLUS_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2288:9: ( '+=' )
			// PHPAST.g:2288:11: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS_EQ"

	// $ANTLR start "MINUS_EQ"
	public final void mMINUS_EQ() throws RecognitionException {
		try {
			int _type = MINUS_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2289:10: ( '-=' )
			// PHPAST.g:2289:12: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_EQ"

	// $ANTLR start "MUL_EQ"
	public final void mMUL_EQ() throws RecognitionException {
		try {
			int _type = MUL_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2290:8: ( '*=' )
			// PHPAST.g:2290:10: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_EQ"

	// $ANTLR start "DIV_EQ"
	public final void mDIV_EQ() throws RecognitionException {
		try {
			int _type = DIV_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2291:8: ( '/=' )
			// PHPAST.g:2291:10: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_EQ"

	// $ANTLR start "DOT_EQ"
	public final void mDOT_EQ() throws RecognitionException {
		try {
			int _type = DOT_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2292:8: ( '.=' )
			// PHPAST.g:2292:10: '.='
			{
			match(".="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT_EQ"

	// $ANTLR start "PERCENT_EQ"
	public final void mPERCENT_EQ() throws RecognitionException {
		try {
			int _type = PERCENT_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2293:12: ( '%=' )
			// PHPAST.g:2293:14: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT_EQ"

	// $ANTLR start "BIT_AND_EQ"
	public final void mBIT_AND_EQ() throws RecognitionException {
		try {
			int _type = BIT_AND_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2294:12: ( '&=' )
			// PHPAST.g:2294:14: '&='
			{
			match("&="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_AND_EQ"

	// $ANTLR start "BIT_OR_EQ"
	public final void mBIT_OR_EQ() throws RecognitionException {
		try {
			int _type = BIT_OR_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2295:11: ( '|=' )
			// PHPAST.g:2295:13: '|='
			{
			match("|="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_OR_EQ"

	// $ANTLR start "POWER_EQ"
	public final void mPOWER_EQ() throws RecognitionException {
		try {
			int _type = POWER_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2296:10: ( '^=' )
			// PHPAST.g:2296:12: '^='
			{
			match("^="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POWER_EQ"

	// $ANTLR start "LMOVE_EQ"
	public final void mLMOVE_EQ() throws RecognitionException {
		try {
			int _type = LMOVE_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2297:10: ( '<<=' )
			// PHPAST.g:2297:12: '<<='
			{
			match("<<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LMOVE_EQ"

	// $ANTLR start "RMOVE_EQ"
	public final void mRMOVE_EQ() throws RecognitionException {
		try {
			int _type = RMOVE_EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2298:10: ( '>>=' )
			// PHPAST.g:2298:12: '>>='
			{
			match(">>="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RMOVE_EQ"

	// $ANTLR start "ARROW_T"
	public final void mARROW_T() throws RecognitionException {
		try {
			int _type = ARROW_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2299:8: ( '=>' )
			// PHPAST.g:2299:10: '=>'
			{
			match("=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARROW_T"

	// $ANTLR start "SINGLE_ARROW_T"
	public final void mSINGLE_ARROW_T() throws RecognitionException {
		try {
			int _type = SINGLE_ARROW_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2300:15: ( '->' )
			// PHPAST.g:2300:17: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLE_ARROW_T"

	// $ANTLR start "EQUAL_EQUAL_EQUAL_T"
	public final void mEQUAL_EQUAL_EQUAL_T() throws RecognitionException {
		try {
			int _type = EQUAL_EQUAL_EQUAL_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2301:20: ( '===' )
			// PHPAST.g:2301:22: '==='
			{
			match("==="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL_EQUAL_EQUAL_T"

	// $ANTLR start "NOT_EQUAL_EQUAL_T"
	public final void mNOT_EQUAL_EQUAL_T() throws RecognitionException {
		try {
			int _type = NOT_EQUAL_EQUAL_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2302:18: ( '!==' )
			// PHPAST.g:2302:20: '!=='
			{
			match("!=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_EQUAL_EQUAL_T"

	// $ANTLR start "EQUAL_EQUAL_T"
	public final void mEQUAL_EQUAL_T() throws RecognitionException {
		try {
			int _type = EQUAL_EQUAL_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2303:14: ( '==' )
			// PHPAST.g:2303:16: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL_EQUAL_T"

	// $ANTLR start "NOT_EQUAL_T"
	public final void mNOT_EQUAL_T() throws RecognitionException {
		try {
			int _type = NOT_EQUAL_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2304:12: ( '!=' )
			// PHPAST.g:2304:14: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_EQUAL_T"

	// $ANTLR start "EXC_NOT_T"
	public final void mEXC_NOT_T() throws RecognitionException {
		try {
			int _type = EXC_NOT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2305:10: ( '!' )
			// PHPAST.g:2305:12: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXC_NOT_T"

	// $ANTLR start "DOMAIN_T"
	public final void mDOMAIN_T() throws RecognitionException {
		try {
			int _type = DOMAIN_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2306:9: ( '::' )
			// PHPAST.g:2306:11: '::'
			{
			match("::"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOMAIN_T"

	// $ANTLR start "COMMA_T"
	public final void mCOMMA_T() throws RecognitionException {
		try {
			int _type = COMMA_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2307:8: ( ',' )
			// PHPAST.g:2307:10: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA_T"

	// $ANTLR start "EQUAL_T"
	public final void mEQUAL_T() throws RecognitionException {
		try {
			int _type = EQUAL_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2308:8: ( '=' )
			// PHPAST.g:2308:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL_T"

	// $ANTLR start "COLON_T"
	public final void mCOLON_T() throws RecognitionException {
		try {
			int _type = COLON_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2309:8: ( ':' )
			// PHPAST.g:2309:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON_T"

	// $ANTLR start "QUESTION_T"
	public final void mQUESTION_T() throws RecognitionException {
		try {
			int _type = QUESTION_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2310:11: ( '?' )
			// PHPAST.g:2310:13: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION_T"

	// $ANTLR start "LOGICAL_OR_T"
	public final void mLOGICAL_OR_T() throws RecognitionException {
		try {
			int _type = LOGICAL_OR_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2311:13: ( '||' )
			// PHPAST.g:2311:15: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICAL_OR_T"

	// $ANTLR start "LOGICAL_AND_T"
	public final void mLOGICAL_AND_T() throws RecognitionException {
		try {
			int _type = LOGICAL_AND_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2312:14: ( '&&' )
			// PHPAST.g:2312:16: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICAL_AND_T"

	// $ANTLR start "POWER_T"
	public final void mPOWER_T() throws RecognitionException {
		try {
			int _type = POWER_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2313:8: ( '^' )
			// PHPAST.g:2313:10: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POWER_T"

	// $ANTLR start "BIT_OR_T"
	public final void mBIT_OR_T() throws RecognitionException {
		try {
			int _type = BIT_OR_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2314:9: ( '|' )
			// PHPAST.g:2314:11: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BIT_OR_T"

	// $ANTLR start "REF_T"
	public final void mREF_T() throws RecognitionException {
		try {
			int _type = REF_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2315:6: ( '&' )
			// PHPAST.g:2315:8: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REF_T"

	// $ANTLR start "DOT_T"
	public final void mDOT_T() throws RecognitionException {
		try {
			int _type = DOT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2316:6: ( '.' )
			// PHPAST.g:2316:8: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT_T"

	// $ANTLR start "LSHIFT_T"
	public final void mLSHIFT_T() throws RecognitionException {
		try {
			int _type = LSHIFT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2317:9: ( '<<' )
			// PHPAST.g:2317:11: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_T"

	// $ANTLR start "RSHIFT_T"
	public final void mRSHIFT_T() throws RecognitionException {
		try {
			int _type = RSHIFT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2318:9: ( '>>' )
			// PHPAST.g:2318:11: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_T"

	// $ANTLR start "PERCENT_T"
	public final void mPERCENT_T() throws RecognitionException {
		try {
			int _type = PERCENT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2319:10: ( '%' )
			// PHPAST.g:2319:12: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT_T"

	// $ANTLR start "SEMI_COLON"
	public final void mSEMI_COLON() throws RecognitionException {
		try {
			int _type = SEMI_COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2320:11: ( ';' )
			// PHPAST.g:2320:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI_COLON"

	// $ANTLR start "PLUS_PLUS_T"
	public final void mPLUS_PLUS_T() throws RecognitionException {
		try {
			int _type = PLUS_PLUS_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2321:12: ( '++' )
			// PHPAST.g:2321:14: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS_PLUS_T"

	// $ANTLR start "MINUS_MINUS_T"
	public final void mMINUS_MINUS_T() throws RecognitionException {
		try {
			int _type = MINUS_MINUS_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2322:14: ( '--' )
			// PHPAST.g:2322:16: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_MINUS_T"

	// $ANTLR start "PLUS_T"
	public final void mPLUS_T() throws RecognitionException {
		try {
			int _type = PLUS_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2323:7: ( '+' )
			// PHPAST.g:2323:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS_T"

	// $ANTLR start "MINUS_T"
	public final void mMINUS_T() throws RecognitionException {
		try {
			int _type = MINUS_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2324:8: ( '-' )
			// PHPAST.g:2324:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS_T"

	// $ANTLR start "MUL_T"
	public final void mMUL_T() throws RecognitionException {
		try {
			int _type = MUL_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2325:6: ( '*' )
			// PHPAST.g:2325:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_T"

	// $ANTLR start "DIV_T"
	public final void mDIV_T() throws RecognitionException {
		try {
			int _type = DIV_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2326:6: ( '/' )
			// PHPAST.g:2326:8: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_T"

	// $ANTLR start "TILDA_T"
	public final void mTILDA_T() throws RecognitionException {
		try {
			int _type = TILDA_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2327:8: ( '~' )
			// PHPAST.g:2327:10: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDA_T"

	// $ANTLR start "LE_T"
	public final void mLE_T() throws RecognitionException {
		try {
			int _type = LE_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2328:5: ( '<=' )
			// PHPAST.g:2328:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_T"

	// $ANTLR start "ME_T"
	public final void mME_T() throws RecognitionException {
		try {
			int _type = ME_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2329:5: ( '>=' )
			// PHPAST.g:2329:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ME_T"

	// $ANTLR start "LT_T"
	public final void mLT_T() throws RecognitionException {
		try {
			int _type = LT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2330:5: ( '<' )
			// PHPAST.g:2330:7: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT_T"

	// $ANTLR start "MT_T"
	public final void mMT_T() throws RecognitionException {
		try {
			int _type = MT_T;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2331:5: ( '>' )
			// PHPAST.g:2331:7: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MT_T"

	// $ANTLR start "INTLITERAL"
	public final void mINTLITERAL() throws RecognitionException {
		try {
			int _type = INTLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2336:3: ( IntegerNumber ( LongSuffix )? )
			// PHPAST.g:2336:5: IntegerNumber ( LongSuffix )?
			{
			mIntegerNumber(); 

			// PHPAST.g:2336:19: ( LongSuffix )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='L'||LA1_0=='l') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// PHPAST.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTLITERAL"

	// $ANTLR start "REALLITERAL"
	public final void mREALLITERAL() throws RecognitionException {
		try {
			int _type = REALLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2340:3: ( HexPrefix ( HexDigit )+ ( LongSuffix )? )
			// PHPAST.g:2340:5: HexPrefix ( HexDigit )+ ( LongSuffix )?
			{
			mHexPrefix(); 

			// PHPAST.g:2340:15: ( HexDigit )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'F')||(LA2_0 >= 'a' && LA2_0 <= 'f')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// PHPAST.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// PHPAST.g:2340:26: ( LongSuffix )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='L'||LA3_0=='l') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// PHPAST.g:
					{
					if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REALLITERAL"

	// $ANTLR start "IntegerNumber"
	public final void mIntegerNumber() throws RecognitionException {
		try {
			// PHPAST.g:2346:3: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ )
			int alt6=3;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='0') ) {
				int LA6_1 = input.LA(2);
				if ( ((LA6_1 >= '0' && LA6_1 <= '7')) ) {
					alt6=3;
				}

				else {
					alt6=1;
				}

			}
			else if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// PHPAST.g:2346:7: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// PHPAST.g:2347:7: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// PHPAST.g:2347:16: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					}
					break;
				case 3 :
					// PHPAST.g:2348:7: '0' ( '0' .. '7' )+
					{
					match('0'); 
					// PHPAST.g:2348:11: ( '0' .. '7' )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '7')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegerNumber"

	// $ANTLR start "LongSuffix"
	public final void mLongSuffix() throws RecognitionException {
		try {
			// PHPAST.g:2353:3: ( 'l' | 'L' )
			// PHPAST.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LongSuffix"

	// $ANTLR start "HexPrefix"
	public final void mHexPrefix() throws RecognitionException {
		try {
			// PHPAST.g:2358:3: ( '0x' | '0X' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='0') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='x') ) {
					alt7=1;
				}
				else if ( (LA7_1=='X') ) {
					alt7=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// PHPAST.g:2358:7: '0x'
					{
					match("0x"); 

					}
					break;
				case 2 :
					// PHPAST.g:2358:14: '0X'
					{
					match("0X"); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexPrefix"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// PHPAST.g:2363:3: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// PHPAST.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2366:3: ( '__PHP_Incomplete_Class' )
			// PHPAST.g:2366:5: '__PHP_Incomplete_Class'
			{
			match("__PHP_Incomplete_Class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "FLOATLITERAL"
	public final void mFLOATLITERAL() throws RecognitionException {
		try {
			int _type = FLOATLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2370:3: ( NonIntegerNumber FloatSuffix )
			// PHPAST.g:2370:7: NonIntegerNumber FloatSuffix
			{
			mNonIntegerNumber(); 

			mFloatSuffix(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOATLITERAL"

	// $ANTLR start "DOUBLELITERRAL"
	public final void mDOUBLELITERRAL() throws RecognitionException {
		try {
			int _type = DOUBLELITERRAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2374:3: ( NonIntegerNumber DoubleSuffix )
			// PHPAST.g:2374:7: NonIntegerNumber DoubleSuffix
			{
			mNonIntegerNumber(); 

			mDoubleSuffix(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLELITERRAL"

	// $ANTLR start "NonIntegerNumber"
	public final void mNonIntegerNumber() throws RecognitionException {
		try {
			// PHPAST.g:2382:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '0' .. '9' )+ )
			int alt19=5;
			alt19 = dfa19.predict(input);
			switch (alt19) {
				case 1 :
					// PHPAST.g:2382:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )?
					{
					// PHPAST.g:2382:7: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match('.'); 
					// PHPAST.g:2382:25: ( '0' .. '9' )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop9;
						}
					}

					// PHPAST.g:2382:39: ( Exponent )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0=='E'||LA10_0=='e') ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// PHPAST.g:2382:39: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// PHPAST.g:2383:7: '.' ( '0' .. '9' )+ ( Exponent )?
					{
					match('.'); 
					// PHPAST.g:2383:11: ( '0' .. '9' )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					// PHPAST.g:2383:27: ( Exponent )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0=='E'||LA12_0=='e') ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// PHPAST.g:2383:27: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// PHPAST.g:2384:7: ( '0' .. '9' )+ Exponent
					{
					// PHPAST.g:2384:7: ( '0' .. '9' )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					mExponent(); 

					}
					break;
				case 4 :
					// PHPAST.g:2385:7: ( '0' .. '9' )+
					{
					// PHPAST.g:2385:7: ( '0' .. '9' )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
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
					break;
				case 5 :
					// PHPAST.g:2387:6: HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '0' .. '9' )+
					{
					mHexPrefix(); 

					// PHPAST.g:2387:16: ( HexDigit )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'A' && LA15_0 <= 'F')||(LA15_0 >= 'a' && LA15_0 <= 'f')) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop15;
						}
					}

					// PHPAST.g:2388:6: ( () | ( '.' ( HexDigit )* ) )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='P'||LA17_0=='p') ) {
						alt17=1;
					}
					else if ( (LA17_0=='.') ) {
						alt17=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// PHPAST.g:2388:11: ()
							{
							// PHPAST.g:2388:11: ()
							// PHPAST.g:2388:12: 
							{
							}

							}
							break;
						case 2 :
							// PHPAST.g:2389:12: ( '.' ( HexDigit )* )
							{
							// PHPAST.g:2389:12: ( '.' ( HexDigit )* )
							// PHPAST.g:2389:13: '.' ( HexDigit )*
							{
							match('.'); 
							// PHPAST.g:2389:17: ( HexDigit )*
							loop16:
							while (true) {
								int alt16=2;
								int LA16_0 = input.LA(1);
								if ( ((LA16_0 >= '0' && LA16_0 <= '9')||(LA16_0 >= 'A' && LA16_0 <= 'F')||(LA16_0 >= 'a' && LA16_0 <= 'f')) ) {
									alt16=1;
								}

								switch (alt16) {
								case 1 :
									// PHPAST.g:
									{
									if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
										input.consume();
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										recover(mse);
										throw mse;
									}
									}
									break;

								default :
									break loop16;
								}
							}

							}

							}
							break;

					}

					if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// PHPAST.g:2392:6: ( '0' .. '9' )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NonIntegerNumber"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// PHPAST.g:2397:3: ( ( 'e' | 'E' ) ( PLUS_T | MINUS_T )? ( '0' .. '9' )+ )
			// PHPAST.g:2397:7: ( 'e' | 'E' ) ( PLUS_T | MINUS_T )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// PHPAST.g:2397:21: ( PLUS_T | MINUS_T )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='+'||LA20_0=='-') ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// PHPAST.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// PHPAST.g:2397:43: ( '0' .. '9' )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// PHPAST.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "FloatSuffix"
	public final void mFloatSuffix() throws RecognitionException {
		try {
			// PHPAST.g:2402:3: ( 'f' | 'F' )
			// PHPAST.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FloatSuffix"

	// $ANTLR start "DoubleSuffix"
	public final void mDoubleSuffix() throws RecognitionException {
		try {
			// PHPAST.g:2407:3: ( 'd' | 'D' )
			// PHPAST.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DoubleSuffix"

	// $ANTLR start "BACKTRICKLITERAL"
	public final void mBACKTRICKLITERAL() throws RecognitionException {
		try {
			int _type = BACKTRICKLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2410:3: ( '`' ( . )* '`' )
			// PHPAST.g:2410:5: '`' ( . )* '`'
			{
			match('`'); 
			// PHPAST.g:2411:5: ( . )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0=='`') ) {
					alt22=2;
				}
				else if ( ((LA22_0 >= '\u0000' && LA22_0 <= '_')||(LA22_0 >= 'a' && LA22_0 <= '\uFFFF')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// PHPAST.g:2411:5: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop22;
				}
			}

			match('`'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BACKTRICKLITERAL"

	// $ANTLR start "STRINGLITERAL"
	public final void mSTRINGLITERAL() throws RecognitionException {
		try {
			int _type = STRINGLITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2416:3: ( '\\'' ( . )* '\\'' | '\"' ( . )* '\"' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='\'') ) {
				alt25=1;
			}
			else if ( (LA25_0=='\"') ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// PHPAST.g:2416:7: '\\'' ( . )* '\\''
					{
					match('\''); 
					// PHPAST.g:2417:7: ( . )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0=='\'') ) {
							alt23=2;
						}
						else if ( ((LA23_0 >= '\u0000' && LA23_0 <= '&')||(LA23_0 >= '(' && LA23_0 <= '\uFFFF')) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// PHPAST.g:2417:8: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop23;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// PHPAST.g:2420:7: '\"' ( . )* '\"'
					{
					match('\"'); 
					// PHPAST.g:2421:7: ( . )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0=='\"') ) {
							alt24=2;
						}
						else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '!')||(LA24_0 >= '#' && LA24_0 <= '\uFFFF')) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// PHPAST.g:2421:8: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop24;
						}
					}

					match('\"'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGLITERAL"

	// $ANTLR start "HERE_DOC"
	public final void mHERE_DOC() throws RecognitionException {
		try {
			int _type = HERE_DOC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			CommonToken id1=null;


			    StringBuilder heredoc = new StringBuilder();

			// PHPAST.g:2436:3: ( HEREDOC_START (id1= IDENTIFIER ) )
			// PHPAST.g:2436:5: HEREDOC_START (id1= IDENTIFIER )
			{
			mHEREDOC_START(); 

			// PHPAST.g:2436:18: (id1= IDENTIFIER )
			// PHPAST.g:2436:19: id1= IDENTIFIER
			{
			int id1Start1467 = getCharIndex();
			int id1StartLine1467 = getLine();
			int id1StartCharPos1467 = getCharPositionInLine();
			mIDENTIFIER(); 
			id1 = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, id1Start1467, getCharIndex()-1);
			id1.setLine(id1StartLine1467);
			id1.setCharPositionInLine(id1StartCharPos1467);

			}


			    if ((input.LA(1)=='\r') && (input.LA(2)=='\n')) {
			        match('\r');
			        match('\n');
			    }
			    else if (input.LA(1) == '\r') {
			        match('\r');
			    }
			    else if (input.LA(1) == '\n') {
			        match('\n');
			    }
			    scanHeredoc:
			    while(true) {
			        int index = 0;
			        while( index < (id1!=null?id1.getText():null).length() && (id1!=null?id1.getText():null).charAt(index) == input.LA(1) ) {
			            heredoc.append((char)input.LA(1) );
			            input.consume();
			            index++;
			            if(index == (id1!=null?id1.getText():null).length()) {
			                if(!Character.isLetterOrDigit(input.LA(2) ) && input.LA(2) != '_') {
			                    break scanHeredoc;
			                }
			            }
			        }
			        while(true) {
			            heredoc.append((char)input.LA(1));
			            if(input.LA(1)  == '\r' && input.LA(2) == '\n') {
			                match('\r');
			                match('\n');
			                break;
			            }
			            else if(input.LA(1) == '\r') {
			                match('\r');
			                break;
			            }
			            else if(input.LA(1) == '\n') {
			                match('\n');
			                break;
			            }
			            else {
			                input.consume();
			            }
			        }
			    }
			    id1.setText((id1!=null?id1.getText():null) + heredoc);
			  
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HERE_DOC"

	// $ANTLR start "HEREDOC_START"
	public final void mHEREDOC_START() throws RecognitionException {
		try {
			int _type = HEREDOC_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2487:3: ( '<<<' )
			// PHPAST.g:2487:5: '<<<'
			{
			match("<<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEREDOC_START"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// PHPAST.g:2491:3: ( '\\\\' ( 'b' | 'n' | 'f' | 't' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ) )
			// PHPAST.g:2491:7: '\\\\' ( 'b' | 'n' | 'f' | 't' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
			{
			match('\\'); 
			// PHPAST.g:2491:12: ( 'b' | 'n' | 'f' | 't' | 'r' | '\\\"' | '\\'' | '\\\\' | ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) ( '0' .. '7' ) | ( '0' .. '7' ) )
			int alt26=11;
			switch ( input.LA(1) ) {
			case 'b':
				{
				alt26=1;
				}
				break;
			case 'n':
				{
				alt26=2;
				}
				break;
			case 'f':
				{
				alt26=3;
				}
				break;
			case 't':
				{
				alt26=4;
				}
				break;
			case 'r':
				{
				alt26=5;
				}
				break;
			case '\"':
				{
				alt26=6;
				}
				break;
			case '\'':
				{
				alt26=7;
				}
				break;
			case '\\':
				{
				alt26=8;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
				{
				int LA26_9 = input.LA(2);
				if ( ((LA26_9 >= '0' && LA26_9 <= '7')) ) {
					int LA26_11 = input.LA(3);
					if ( ((LA26_11 >= '0' && LA26_11 <= '7')) ) {
						alt26=9;
					}

					else {
						alt26=10;
					}

				}

				else {
					alt26=11;
				}

				}
				break;
			case '4':
			case '5':
			case '6':
			case '7':
				{
				int LA26_10 = input.LA(2);
				if ( ((LA26_10 >= '0' && LA26_10 <= '7')) ) {
					alt26=10;
				}

				else {
					alt26=11;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// PHPAST.g:2491:16: 'b'
					{
					match('b'); 
					}
					break;
				case 2 :
					// PHPAST.g:2492:16: 'n'
					{
					match('n'); 
					}
					break;
				case 3 :
					// PHPAST.g:2493:16: 'f'
					{
					match('f'); 
					}
					break;
				case 4 :
					// PHPAST.g:2494:16: 't'
					{
					match('t'); 
					}
					break;
				case 5 :
					// PHPAST.g:2495:16: 'r'
					{
					match('r'); 
					}
					break;
				case 6 :
					// PHPAST.g:2496:16: '\\\"'
					{
					match('\"'); 
					}
					break;
				case 7 :
					// PHPAST.g:2497:16: '\\''
					{
					match('\''); 
					}
					break;
				case 8 :
					// PHPAST.g:2498:16: '\\\\'
					{
					match('\\'); 
					}
					break;
				case 9 :
					// PHPAST.g:2499:16: ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 10 :
					// PHPAST.g:2500:16: ( '0' .. '7' ) ( '0' .. '7' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 11 :
					// PHPAST.g:2501:16: ( '0' .. '7' )
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "IDENTIFIER"
	public final void mIDENTIFIER() throws RecognitionException {
		try {
			int _type = IDENTIFIER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:2508:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// PHPAST.g:2508:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// PHPAST.g:2508:28: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( ((LA27_0 >= '0' && LA27_0 <= '9')||(LA27_0 >= 'A' && LA27_0 <= 'Z')||LA27_0=='_'||(LA27_0 >= 'a' && LA27_0 <= 'z')) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// PHPAST.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop27;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENTIFIER"

	// $ANTLR start "IdentifierStart"
	public final void mIdentifierStart() throws RecognitionException {
		try {
			// PHPAST.g:2514:5: ( '\\u005c' | '\\u005f' | '\\u0041' .. '\\u005a' | '\\u0061' .. '\\u007a' | '\\u00a2' .. '\\u00a5' | '\\u00aa' | '\\u00b5' | '\\u00ba' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u0236' | '\\u0250' .. '\\u02c1' | '\\u02c6' .. '\\u02d1' | '\\u02e0' .. '\\u02e4' | '\\u02ee' | '\\u037a' | '\\u0386' | '\\u0388' .. '\\u038a' | '\\u038c' | '\\u038e' .. '\\u03a1' | '\\u03a3' .. '\\u03ce' | '\\u03d0' .. '\\u03f5' | '\\u03f7' .. '\\u03fb' | '\\u0400' .. '\\u0481' | '\\u048a' .. '\\u04ce' | '\\u04d0' .. '\\u04f5' | '\\u04f8' .. '\\u04f9' | '\\u0500' .. '\\u050f' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u05d0' .. '\\u05ea' | '\\u05f0' .. '\\u05f2' | '\\u0621' .. '\\u063a' | '\\u0640' .. '\\u064a' | '\\u066e' .. '\\u066f' | '\\u0671' .. '\\u06d3' | '\\u06d5' | '\\u06e5' .. '\\u06e6' | '\\u06ee' .. '\\u06ef' | '\\u06fa' .. '\\u06fc' | '\\u06ff' | '\\u0710' | '\\u0712' .. '\\u072f' | '\\u074d' .. '\\u074f' | '\\u0780' .. '\\u07a5' | '\\u07b1' | '\\u0904' .. '\\u0939' | '\\u093d' | '\\u0950' | '\\u0958' .. '\\u0961' | '\\u0985' .. '\\u098c' | '\\u098f' .. '\\u0990' | '\\u0993' .. '\\u09a8' | '\\u09aa' .. '\\u09b0' | '\\u09b2' | '\\u09b6' .. '\\u09b9' | '\\u09bd' | '\\u09dc' .. '\\u09dd' | '\\u09df' .. '\\u09e1' | '\\u09f0' .. '\\u09f3' | '\\u0a05' .. '\\u0a0a' | '\\u0a0f' .. '\\u0a10' | '\\u0a13' .. '\\u0a28' | '\\u0a2a' .. '\\u0a30' | '\\u0a32' .. '\\u0a33' | '\\u0a35' .. '\\u0a36' | '\\u0a38' .. '\\u0a39' | '\\u0a59' .. '\\u0a5c' | '\\u0a5e' | '\\u0a72' .. '\\u0a74' | '\\u0a85' .. '\\u0a8d' | '\\u0a8f' .. '\\u0a91' | '\\u0a93' .. '\\u0aa8' | '\\u0aaa' .. '\\u0ab0' | '\\u0ab2' .. '\\u0ab3' | '\\u0ab5' .. '\\u0ab9' | '\\u0abd' | '\\u0ad0' | '\\u0ae0' .. '\\u0ae1' | '\\u0af1' | '\\u0b05' .. '\\u0b0c' | '\\u0b0f' .. '\\u0b10' | '\\u0b13' .. '\\u0b28' | '\\u0b2a' .. '\\u0b30' | '\\u0b32' .. '\\u0b33' | '\\u0b35' .. '\\u0b39' | '\\u0b3d' | '\\u0b5c' .. '\\u0b5d' | '\\u0b5f' .. '\\u0b61' | '\\u0b71' | '\\u0b83' | '\\u0b85' .. '\\u0b8a' | '\\u0b8e' .. '\\u0b90' | '\\u0b92' .. '\\u0b95' | '\\u0b99' .. '\\u0b9a' | '\\u0b9c' | '\\u0b9e' .. '\\u0b9f' | '\\u0ba3' .. '\\u0ba4' | '\\u0ba8' .. '\\u0baa' | '\\u0bae' .. '\\u0bb5' | '\\u0bb7' .. '\\u0bb9' | '\\u0bf9' | '\\u0c05' .. '\\u0c0c' | '\\u0c0e' .. '\\u0c10' | '\\u0c12' .. '\\u0c28' | '\\u0c2a' .. '\\u0c33' | '\\u0c35' .. '\\u0c39' | '\\u0c60' .. '\\u0c61' | '\\u0c85' .. '\\u0c8c' | '\\u0c8e' .. '\\u0c90' | '\\u0c92' .. '\\u0ca8' | '\\u0caa' .. '\\u0cb3' | '\\u0cb5' .. '\\u0cb9' | '\\u0cbd' | '\\u0cde' | '\\u0ce0' .. '\\u0ce1' | '\\u0d05' .. '\\u0d0c' | '\\u0d0e' .. '\\u0d10' | '\\u0d12' .. '\\u0d28' | '\\u0d2a' .. '\\u0d39' | '\\u0d60' .. '\\u0d61' | '\\u0d85' .. '\\u0d96' | '\\u0d9a' .. '\\u0db1' | '\\u0db3' .. '\\u0dbb' | '\\u0dbd' | '\\u0dc0' .. '\\u0dc6' | '\\u0e01' .. '\\u0e30' | '\\u0e32' .. '\\u0e33' | '\\u0e3f' .. '\\u0e46' | '\\u0e81' .. '\\u0e82' | '\\u0e84' | '\\u0e87' .. '\\u0e88' | '\\u0e8a' | '\\u0e8d' | '\\u0e94' .. '\\u0e97' | '\\u0e99' .. '\\u0e9f' | '\\u0ea1' .. '\\u0ea3' | '\\u0ea5' | '\\u0ea7' | '\\u0eaa' .. '\\u0eab' | '\\u0ead' .. '\\u0eb0' | '\\u0eb2' .. '\\u0eb3' | '\\u0ebd' | '\\u0ec0' .. '\\u0ec4' | '\\u0ec6' | '\\u0edc' .. '\\u0edd' | '\\u0f00' | '\\u0f40' .. '\\u0f47' | '\\u0f49' .. '\\u0f6a' | '\\u0f88' .. '\\u0f8b' | '\\u1000' .. '\\u1021' | '\\u1023' .. '\\u1027' | '\\u1029' .. '\\u102a' | '\\u1050' .. '\\u1055' | '\\u10a0' .. '\\u10c5' | '\\u10d0' .. '\\u10f8' | '\\u1100' .. '\\u1159' | '\\u115f' .. '\\u11a2' | '\\u11a8' .. '\\u11f9' | '\\u1200' .. '\\u1206' | '\\u1208' .. '\\u1246' | '\\u1248' | '\\u124a' .. '\\u124d' | '\\u1250' .. '\\u1256' | '\\u1258' | '\\u125a' .. '\\u125d' | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128a' .. '\\u128d' | '\\u1290' .. '\\u12ae' | '\\u12b0' | '\\u12b2' .. '\\u12b5' | '\\u12b8' .. '\\u12be' | '\\u12c0' | '\\u12c2' .. '\\u12c5' | '\\u12c8' .. '\\u12ce' | '\\u12d0' .. '\\u12d6' | '\\u12d8' .. '\\u12ee' | '\\u12f0' .. '\\u130e' | '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u131e' | '\\u1320' .. '\\u1346' | '\\u1348' .. '\\u135a' | '\\u13a0' .. '\\u13f4' | '\\u1401' .. '\\u166c' | '\\u166f' .. '\\u1676' | '\\u1681' .. '\\u169a' | '\\u16a0' .. '\\u16ea' | '\\u16ee' .. '\\u16f0' | '\\u1700' .. '\\u170c' | '\\u170e' .. '\\u1711' | '\\u1720' .. '\\u1731' | '\\u1740' .. '\\u1751' | '\\u1760' .. '\\u176c' | '\\u176e' .. '\\u1770' | '\\u1780' .. '\\u17b3' | '\\u17d7' | '\\u17db' .. '\\u17dc' | '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18a8' | '\\u1900' .. '\\u191c' | '\\u1950' .. '\\u196d' | '\\u1970' .. '\\u1974' | '\\u1d00' .. '\\u1d6b' | '\\u1e00' .. '\\u1e9b' | '\\u1ea0' .. '\\u1ef9' | '\\u1f00' .. '\\u1f15' | '\\u1f18' .. '\\u1f1d' | '\\u1f20' .. '\\u1f45' | '\\u1f48' .. '\\u1f4d' | '\\u1f50' .. '\\u1f57' | '\\u1f59' | '\\u1f5b' | '\\u1f5d' | '\\u1f5f' .. '\\u1f7d' | '\\u1f80' .. '\\u1fb4' | '\\u1fb6' .. '\\u1fbc' | '\\u1fbe' | '\\u1fc2' .. '\\u1fc4' | '\\u1fc6' .. '\\u1fcc' | '\\u1fd0' .. '\\u1fd3' | '\\u1fd6' .. '\\u1fdb' | '\\u1fe0' .. '\\u1fec' | '\\u1ff2' .. '\\u1ff4' | '\\u1ff6' .. '\\u1ffc' | '\\u203f' .. '\\u2040' | '\\u2054' | '\\u2071' | '\\u207f' | '\\u20a0' .. '\\u20b1' | '\\u2102' | '\\u2107' | '\\u210a' .. '\\u2113' | '\\u2115' | '\\u2119' .. '\\u211d' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212a' .. '\\u212d' | '\\u212f' .. '\\u2131' | '\\u2133' .. '\\u2139' | '\\u213d' .. '\\u213f' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u3005' .. '\\u3007' | '\\u3021' .. '\\u3029' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303c' | '\\u3041' .. '\\u3096' | '\\u309d' .. '\\u309f' | '\\u30a1' .. '\\u30ff' | '\\u3105' .. '\\u312c' | '\\u3131' .. '\\u318e' | '\\u31a0' .. '\\u31b7' | '\\u31f0' .. '\\u31ff' | '\\u3400' .. '\\u4db5' | '\\u4e00' .. '\\u9fa5' | '\\ua000' .. '\\ua48c' | '\\uac00' .. '\\ud7a3' | '\\uf900' .. '\\ufa2d' | '\\ufa30' .. '\\ufa6a' | '\\ufb00' .. '\\ufb06' | '\\ufb13' .. '\\ufb17' | '\\ufb1d' | '\\ufb1f' .. '\\ufb28' | '\\ufb2a' .. '\\ufb36' | '\\ufb38' .. '\\ufb3c' | '\\ufb3e' | '\\ufb40' .. '\\ufb41' | '\\ufb43' .. '\\ufb44' | '\\ufb46' .. '\\ufbb1' | '\\ufbd3' .. '\\ufd3d' | '\\ufd50' .. '\\ufd8f' | '\\ufd92' .. '\\ufdc7' | '\\ufdf0' .. '\\ufdfc' | '\\ufe33' .. '\\ufe34' | '\\ufe4d' .. '\\ufe4f' | '\\ufe69' | '\\ufe70' .. '\\ufe74' | '\\ufe76' .. '\\ufefc' | '\\uff04' | '\\uff21' .. '\\uff3a' | '\\uff3f' | '\\uff41' .. '\\uff5a' | '\\uff65' .. '\\uffbe' | '\\uffc2' .. '\\uffc7' | '\\uffca' .. '\\uffcf' | '\\uffd2' .. '\\uffd7' | '\\uffda' .. '\\uffdc' | '\\uffe0' .. '\\uffe1' | '\\uffe5' .. '\\uffe6' )
			// PHPAST.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00A2' && input.LA(1) <= '\u00A5')||input.LA(1)=='\u00AA'||input.LA(1)=='\u00B5'||input.LA(1)=='\u00BA'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u0236')||(input.LA(1) >= '\u0250' && input.LA(1) <= '\u02C1')||(input.LA(1) >= '\u02C6' && input.LA(1) <= '\u02D1')||(input.LA(1) >= '\u02E0' && input.LA(1) <= '\u02E4')||input.LA(1)=='\u02EE'||input.LA(1)=='\u037A'||input.LA(1)=='\u0386'||(input.LA(1) >= '\u0388' && input.LA(1) <= '\u038A')||input.LA(1)=='\u038C'||(input.LA(1) >= '\u038E' && input.LA(1) <= '\u03A1')||(input.LA(1) >= '\u03A3' && input.LA(1) <= '\u03CE')||(input.LA(1) >= '\u03D0' && input.LA(1) <= '\u03F5')||(input.LA(1) >= '\u03F7' && input.LA(1) <= '\u03FB')||(input.LA(1) >= '\u0400' && input.LA(1) <= '\u0481')||(input.LA(1) >= '\u048A' && input.LA(1) <= '\u04CE')||(input.LA(1) >= '\u04D0' && input.LA(1) <= '\u04F5')||(input.LA(1) >= '\u04F8' && input.LA(1) <= '\u04F9')||(input.LA(1) >= '\u0500' && input.LA(1) <= '\u050F')||(input.LA(1) >= '\u0531' && input.LA(1) <= '\u0556')||input.LA(1)=='\u0559'||(input.LA(1) >= '\u0561' && input.LA(1) <= '\u0587')||(input.LA(1) >= '\u05D0' && input.LA(1) <= '\u05EA')||(input.LA(1) >= '\u05F0' && input.LA(1) <= '\u05F2')||(input.LA(1) >= '\u0621' && input.LA(1) <= '\u063A')||(input.LA(1) >= '\u0640' && input.LA(1) <= '\u064A')||(input.LA(1) >= '\u066E' && input.LA(1) <= '\u066F')||(input.LA(1) >= '\u0671' && input.LA(1) <= '\u06D3')||input.LA(1)=='\u06D5'||(input.LA(1) >= '\u06E5' && input.LA(1) <= '\u06E6')||(input.LA(1) >= '\u06EE' && input.LA(1) <= '\u06EF')||(input.LA(1) >= '\u06FA' && input.LA(1) <= '\u06FC')||input.LA(1)=='\u06FF'||input.LA(1)=='\u0710'||(input.LA(1) >= '\u0712' && input.LA(1) <= '\u072F')||(input.LA(1) >= '\u074D' && input.LA(1) <= '\u074F')||(input.LA(1) >= '\u0780' && input.LA(1) <= '\u07A5')||input.LA(1)=='\u07B1'||(input.LA(1) >= '\u0904' && input.LA(1) <= '\u0939')||input.LA(1)=='\u093D'||input.LA(1)=='\u0950'||(input.LA(1) >= '\u0958' && input.LA(1) <= '\u0961')||(input.LA(1) >= '\u0985' && input.LA(1) <= '\u098C')||(input.LA(1) >= '\u098F' && input.LA(1) <= '\u0990')||(input.LA(1) >= '\u0993' && input.LA(1) <= '\u09A8')||(input.LA(1) >= '\u09AA' && input.LA(1) <= '\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1) >= '\u09B6' && input.LA(1) <= '\u09B9')||input.LA(1)=='\u09BD'||(input.LA(1) >= '\u09DC' && input.LA(1) <= '\u09DD')||(input.LA(1) >= '\u09DF' && input.LA(1) <= '\u09E1')||(input.LA(1) >= '\u09F0' && input.LA(1) <= '\u09F3')||(input.LA(1) >= '\u0A05' && input.LA(1) <= '\u0A0A')||(input.LA(1) >= '\u0A0F' && input.LA(1) <= '\u0A10')||(input.LA(1) >= '\u0A13' && input.LA(1) <= '\u0A28')||(input.LA(1) >= '\u0A2A' && input.LA(1) <= '\u0A30')||(input.LA(1) >= '\u0A32' && input.LA(1) <= '\u0A33')||(input.LA(1) >= '\u0A35' && input.LA(1) <= '\u0A36')||(input.LA(1) >= '\u0A38' && input.LA(1) <= '\u0A39')||(input.LA(1) >= '\u0A59' && input.LA(1) <= '\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1) >= '\u0A72' && input.LA(1) <= '\u0A74')||(input.LA(1) >= '\u0A85' && input.LA(1) <= '\u0A8D')||(input.LA(1) >= '\u0A8F' && input.LA(1) <= '\u0A91')||(input.LA(1) >= '\u0A93' && input.LA(1) <= '\u0AA8')||(input.LA(1) >= '\u0AAA' && input.LA(1) <= '\u0AB0')||(input.LA(1) >= '\u0AB2' && input.LA(1) <= '\u0AB3')||(input.LA(1) >= '\u0AB5' && input.LA(1) <= '\u0AB9')||input.LA(1)=='\u0ABD'||input.LA(1)=='\u0AD0'||(input.LA(1) >= '\u0AE0' && input.LA(1) <= '\u0AE1')||input.LA(1)=='\u0AF1'||(input.LA(1) >= '\u0B05' && input.LA(1) <= '\u0B0C')||(input.LA(1) >= '\u0B0F' && input.LA(1) <= '\u0B10')||(input.LA(1) >= '\u0B13' && input.LA(1) <= '\u0B28')||(input.LA(1) >= '\u0B2A' && input.LA(1) <= '\u0B30')||(input.LA(1) >= '\u0B32' && input.LA(1) <= '\u0B33')||(input.LA(1) >= '\u0B35' && input.LA(1) <= '\u0B39')||input.LA(1)=='\u0B3D'||(input.LA(1) >= '\u0B5C' && input.LA(1) <= '\u0B5D')||(input.LA(1) >= '\u0B5F' && input.LA(1) <= '\u0B61')||input.LA(1)=='\u0B71'||input.LA(1)=='\u0B83'||(input.LA(1) >= '\u0B85' && input.LA(1) <= '\u0B8A')||(input.LA(1) >= '\u0B8E' && input.LA(1) <= '\u0B90')||(input.LA(1) >= '\u0B92' && input.LA(1) <= '\u0B95')||(input.LA(1) >= '\u0B99' && input.LA(1) <= '\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1) >= '\u0B9E' && input.LA(1) <= '\u0B9F')||(input.LA(1) >= '\u0BA3' && input.LA(1) <= '\u0BA4')||(input.LA(1) >= '\u0BA8' && input.LA(1) <= '\u0BAA')||(input.LA(1) >= '\u0BAE' && input.LA(1) <= '\u0BB5')||(input.LA(1) >= '\u0BB7' && input.LA(1) <= '\u0BB9')||input.LA(1)=='\u0BF9'||(input.LA(1) >= '\u0C05' && input.LA(1) <= '\u0C0C')||(input.LA(1) >= '\u0C0E' && input.LA(1) <= '\u0C10')||(input.LA(1) >= '\u0C12' && input.LA(1) <= '\u0C28')||(input.LA(1) >= '\u0C2A' && input.LA(1) <= '\u0C33')||(input.LA(1) >= '\u0C35' && input.LA(1) <= '\u0C39')||(input.LA(1) >= '\u0C60' && input.LA(1) <= '\u0C61')||(input.LA(1) >= '\u0C85' && input.LA(1) <= '\u0C8C')||(input.LA(1) >= '\u0C8E' && input.LA(1) <= '\u0C90')||(input.LA(1) >= '\u0C92' && input.LA(1) <= '\u0CA8')||(input.LA(1) >= '\u0CAA' && input.LA(1) <= '\u0CB3')||(input.LA(1) >= '\u0CB5' && input.LA(1) <= '\u0CB9')||input.LA(1)=='\u0CBD'||input.LA(1)=='\u0CDE'||(input.LA(1) >= '\u0CE0' && input.LA(1) <= '\u0CE1')||(input.LA(1) >= '\u0D05' && input.LA(1) <= '\u0D0C')||(input.LA(1) >= '\u0D0E' && input.LA(1) <= '\u0D10')||(input.LA(1) >= '\u0D12' && input.LA(1) <= '\u0D28')||(input.LA(1) >= '\u0D2A' && input.LA(1) <= '\u0D39')||(input.LA(1) >= '\u0D60' && input.LA(1) <= '\u0D61')||(input.LA(1) >= '\u0D85' && input.LA(1) <= '\u0D96')||(input.LA(1) >= '\u0D9A' && input.LA(1) <= '\u0DB1')||(input.LA(1) >= '\u0DB3' && input.LA(1) <= '\u0DBB')||input.LA(1)=='\u0DBD'||(input.LA(1) >= '\u0DC0' && input.LA(1) <= '\u0DC6')||(input.LA(1) >= '\u0E01' && input.LA(1) <= '\u0E30')||(input.LA(1) >= '\u0E32' && input.LA(1) <= '\u0E33')||(input.LA(1) >= '\u0E3F' && input.LA(1) <= '\u0E46')||(input.LA(1) >= '\u0E81' && input.LA(1) <= '\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1) >= '\u0E87' && input.LA(1) <= '\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1) >= '\u0E94' && input.LA(1) <= '\u0E97')||(input.LA(1) >= '\u0E99' && input.LA(1) <= '\u0E9F')||(input.LA(1) >= '\u0EA1' && input.LA(1) <= '\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1) >= '\u0EAA' && input.LA(1) <= '\u0EAB')||(input.LA(1) >= '\u0EAD' && input.LA(1) <= '\u0EB0')||(input.LA(1) >= '\u0EB2' && input.LA(1) <= '\u0EB3')||input.LA(1)=='\u0EBD'||(input.LA(1) >= '\u0EC0' && input.LA(1) <= '\u0EC4')||input.LA(1)=='\u0EC6'||(input.LA(1) >= '\u0EDC' && input.LA(1) <= '\u0EDD')||input.LA(1)=='\u0F00'||(input.LA(1) >= '\u0F40' && input.LA(1) <= '\u0F47')||(input.LA(1) >= '\u0F49' && input.LA(1) <= '\u0F6A')||(input.LA(1) >= '\u0F88' && input.LA(1) <= '\u0F8B')||(input.LA(1) >= '\u1000' && input.LA(1) <= '\u1021')||(input.LA(1) >= '\u1023' && input.LA(1) <= '\u1027')||(input.LA(1) >= '\u1029' && input.LA(1) <= '\u102A')||(input.LA(1) >= '\u1050' && input.LA(1) <= '\u1055')||(input.LA(1) >= '\u10A0' && input.LA(1) <= '\u10C5')||(input.LA(1) >= '\u10D0' && input.LA(1) <= '\u10F8')||(input.LA(1) >= '\u1100' && input.LA(1) <= '\u1159')||(input.LA(1) >= '\u115F' && input.LA(1) <= '\u11A2')||(input.LA(1) >= '\u11A8' && input.LA(1) <= '\u11F9')||(input.LA(1) >= '\u1200' && input.LA(1) <= '\u1206')||(input.LA(1) >= '\u1208' && input.LA(1) <= '\u1246')||input.LA(1)=='\u1248'||(input.LA(1) >= '\u124A' && input.LA(1) <= '\u124D')||(input.LA(1) >= '\u1250' && input.LA(1) <= '\u1256')||input.LA(1)=='\u1258'||(input.LA(1) >= '\u125A' && input.LA(1) <= '\u125D')||(input.LA(1) >= '\u1260' && input.LA(1) <= '\u1286')||input.LA(1)=='\u1288'||(input.LA(1) >= '\u128A' && input.LA(1) <= '\u128D')||(input.LA(1) >= '\u1290' && input.LA(1) <= '\u12AE')||input.LA(1)=='\u12B0'||(input.LA(1) >= '\u12B2' && input.LA(1) <= '\u12B5')||(input.LA(1) >= '\u12B8' && input.LA(1) <= '\u12BE')||input.LA(1)=='\u12C0'||(input.LA(1) >= '\u12C2' && input.LA(1) <= '\u12C5')||(input.LA(1) >= '\u12C8' && input.LA(1) <= '\u12CE')||(input.LA(1) >= '\u12D0' && input.LA(1) <= '\u12D6')||(input.LA(1) >= '\u12D8' && input.LA(1) <= '\u12EE')||(input.LA(1) >= '\u12F0' && input.LA(1) <= '\u130E')||input.LA(1)=='\u1310'||(input.LA(1) >= '\u1312' && input.LA(1) <= '\u1315')||(input.LA(1) >= '\u1318' && input.LA(1) <= '\u131E')||(input.LA(1) >= '\u1320' && input.LA(1) <= '\u1346')||(input.LA(1) >= '\u1348' && input.LA(1) <= '\u135A')||(input.LA(1) >= '\u13A0' && input.LA(1) <= '\u13F4')||(input.LA(1) >= '\u1401' && input.LA(1) <= '\u166C')||(input.LA(1) >= '\u166F' && input.LA(1) <= '\u1676')||(input.LA(1) >= '\u1681' && input.LA(1) <= '\u169A')||(input.LA(1) >= '\u16A0' && input.LA(1) <= '\u16EA')||(input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u1700' && input.LA(1) <= '\u170C')||(input.LA(1) >= '\u170E' && input.LA(1) <= '\u1711')||(input.LA(1) >= '\u1720' && input.LA(1) <= '\u1731')||(input.LA(1) >= '\u1740' && input.LA(1) <= '\u1751')||(input.LA(1) >= '\u1760' && input.LA(1) <= '\u176C')||(input.LA(1) >= '\u176E' && input.LA(1) <= '\u1770')||(input.LA(1) >= '\u1780' && input.LA(1) <= '\u17B3')||input.LA(1)=='\u17D7'||(input.LA(1) >= '\u17DB' && input.LA(1) <= '\u17DC')||(input.LA(1) >= '\u1820' && input.LA(1) <= '\u1877')||(input.LA(1) >= '\u1880' && input.LA(1) <= '\u18A8')||(input.LA(1) >= '\u1900' && input.LA(1) <= '\u191C')||(input.LA(1) >= '\u1950' && input.LA(1) <= '\u196D')||(input.LA(1) >= '\u1970' && input.LA(1) <= '\u1974')||(input.LA(1) >= '\u1D00' && input.LA(1) <= '\u1D6B')||(input.LA(1) >= '\u1E00' && input.LA(1) <= '\u1E9B')||(input.LA(1) >= '\u1EA0' && input.LA(1) <= '\u1EF9')||(input.LA(1) >= '\u1F00' && input.LA(1) <= '\u1F15')||(input.LA(1) >= '\u1F18' && input.LA(1) <= '\u1F1D')||(input.LA(1) >= '\u1F20' && input.LA(1) <= '\u1F45')||(input.LA(1) >= '\u1F48' && input.LA(1) <= '\u1F4D')||(input.LA(1) >= '\u1F50' && input.LA(1) <= '\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1) >= '\u1F5F' && input.LA(1) <= '\u1F7D')||(input.LA(1) >= '\u1F80' && input.LA(1) <= '\u1FB4')||(input.LA(1) >= '\u1FB6' && input.LA(1) <= '\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1) >= '\u1FC2' && input.LA(1) <= '\u1FC4')||(input.LA(1) >= '\u1FC6' && input.LA(1) <= '\u1FCC')||(input.LA(1) >= '\u1FD0' && input.LA(1) <= '\u1FD3')||(input.LA(1) >= '\u1FD6' && input.LA(1) <= '\u1FDB')||(input.LA(1) >= '\u1FE0' && input.LA(1) <= '\u1FEC')||(input.LA(1) >= '\u1FF2' && input.LA(1) <= '\u1FF4')||(input.LA(1) >= '\u1FF6' && input.LA(1) <= '\u1FFC')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||input.LA(1)=='\u2054'||input.LA(1)=='\u2071'||input.LA(1)=='\u207F'||(input.LA(1) >= '\u20A0' && input.LA(1) <= '\u20B1')||input.LA(1)=='\u2102'||input.LA(1)=='\u2107'||(input.LA(1) >= '\u210A' && input.LA(1) <= '\u2113')||input.LA(1)=='\u2115'||(input.LA(1) >= '\u2119' && input.LA(1) <= '\u211D')||input.LA(1)=='\u2124'||input.LA(1)=='\u2126'||input.LA(1)=='\u2128'||(input.LA(1) >= '\u212A' && input.LA(1) <= '\u212D')||(input.LA(1) >= '\u212F' && input.LA(1) <= '\u2131')||(input.LA(1) >= '\u2133' && input.LA(1) <= '\u2139')||(input.LA(1) >= '\u213D' && input.LA(1) <= '\u213F')||(input.LA(1) >= '\u2145' && input.LA(1) <= '\u2149')||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u2183')||(input.LA(1) >= '\u3005' && input.LA(1) <= '\u3007')||(input.LA(1) >= '\u3021' && input.LA(1) <= '\u3029')||(input.LA(1) >= '\u3031' && input.LA(1) <= '\u3035')||(input.LA(1) >= '\u3038' && input.LA(1) <= '\u303C')||(input.LA(1) >= '\u3041' && input.LA(1) <= '\u3096')||(input.LA(1) >= '\u309D' && input.LA(1) <= '\u309F')||(input.LA(1) >= '\u30A1' && input.LA(1) <= '\u30FF')||(input.LA(1) >= '\u3105' && input.LA(1) <= '\u312C')||(input.LA(1) >= '\u3131' && input.LA(1) <= '\u318E')||(input.LA(1) >= '\u31A0' && input.LA(1) <= '\u31B7')||(input.LA(1) >= '\u31F0' && input.LA(1) <= '\u31FF')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u4DB5')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FA5')||(input.LA(1) >= '\uA000' && input.LA(1) <= '\uA48C')||(input.LA(1) >= '\uAC00' && input.LA(1) <= '\uD7A3')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFA2D')||(input.LA(1) >= '\uFA30' && input.LA(1) <= '\uFA6A')||(input.LA(1) >= '\uFB00' && input.LA(1) <= '\uFB06')||(input.LA(1) >= '\uFB13' && input.LA(1) <= '\uFB17')||input.LA(1)=='\uFB1D'||(input.LA(1) >= '\uFB1F' && input.LA(1) <= '\uFB28')||(input.LA(1) >= '\uFB2A' && input.LA(1) <= '\uFB36')||(input.LA(1) >= '\uFB38' && input.LA(1) <= '\uFB3C')||input.LA(1)=='\uFB3E'||(input.LA(1) >= '\uFB40' && input.LA(1) <= '\uFB41')||(input.LA(1) >= '\uFB43' && input.LA(1) <= '\uFB44')||(input.LA(1) >= '\uFB46' && input.LA(1) <= '\uFBB1')||(input.LA(1) >= '\uFBD3' && input.LA(1) <= '\uFD3D')||(input.LA(1) >= '\uFD50' && input.LA(1) <= '\uFD8F')||(input.LA(1) >= '\uFD92' && input.LA(1) <= '\uFDC7')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFDFC')||(input.LA(1) >= '\uFE33' && input.LA(1) <= '\uFE34')||(input.LA(1) >= '\uFE4D' && input.LA(1) <= '\uFE4F')||input.LA(1)=='\uFE69'||(input.LA(1) >= '\uFE70' && input.LA(1) <= '\uFE74')||(input.LA(1) >= '\uFE76' && input.LA(1) <= '\uFEFC')||input.LA(1)=='\uFF04'||(input.LA(1) >= '\uFF21' && input.LA(1) <= '\uFF3A')||input.LA(1)=='\uFF3F'||(input.LA(1) >= '\uFF41' && input.LA(1) <= '\uFF5A')||(input.LA(1) >= '\uFF65' && input.LA(1) <= '\uFFBE')||(input.LA(1) >= '\uFFC2' && input.LA(1) <= '\uFFC7')||(input.LA(1) >= '\uFFCA' && input.LA(1) <= '\uFFCF')||(input.LA(1) >= '\uFFD2' && input.LA(1) <= '\uFFD7')||(input.LA(1) >= '\uFFDA' && input.LA(1) <= '\uFFDC')||(input.LA(1) >= '\uFFE0' && input.LA(1) <= '\uFFE1')||(input.LA(1) >= '\uFFE5' && input.LA(1) <= '\uFFE6') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IdentifierStart"

	// $ANTLR start "IdentifierPart"
	public final void mIdentifierPart() throws RecognitionException {
		try {
			// PHPAST.g:2812:5: ( '\\u0000' .. '\\u0008' | '\\u000e' .. '\\u001b' | '\\u0024' | '\\u0030' .. '\\u0039' | '\\u0041' .. '\\u005a' | '\\u005c' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u007f' .. '\\u009f' | '\\u00a2' .. '\\u00a5' | '\\u00aa' | '\\u00ad' | '\\u00b5' | '\\u00ba' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u0236' | '\\u0250' .. '\\u02c1' | '\\u02c6' .. '\\u02d1' | '\\u02e0' .. '\\u02e4' | '\\u02ee' | '\\u0300' .. '\\u0357' | '\\u035d' .. '\\u036f' | '\\u037a' | '\\u0386' | '\\u0388' .. '\\u038a' | '\\u038c' | '\\u038e' .. '\\u03a1' | '\\u03a3' .. '\\u03ce' | '\\u03d0' .. '\\u03f5' | '\\u03f7' .. '\\u03fb' | '\\u0400' .. '\\u0481' | '\\u0483' .. '\\u0486' | '\\u048a' .. '\\u04ce' | '\\u04d0' .. '\\u04f5' | '\\u04f8' .. '\\u04f9' | '\\u0500' .. '\\u050f' | '\\u0531' .. '\\u0556' | '\\u0559' | '\\u0561' .. '\\u0587' | '\\u0591' .. '\\u05a1' | '\\u05a3' .. '\\u05b9' | '\\u05bb' .. '\\u05bd' | '\\u05bf' | '\\u05c1' .. '\\u05c2' | '\\u05c4' | '\\u05d0' .. '\\u05ea' | '\\u05f0' .. '\\u05f2' | '\\u0600' .. '\\u0603' | '\\u0610' .. '\\u0615' | '\\u0621' .. '\\u063a' | '\\u0640' .. '\\u0658' | '\\u0660' .. '\\u0669' | '\\u066e' .. '\\u06d3' | '\\u06d5' .. '\\u06dd' | '\\u06df' .. '\\u06e8' | '\\u06ea' .. '\\u06fc' | '\\u06ff' | '\\u070f' .. '\\u074a' | '\\u074d' .. '\\u074f' | '\\u0780' .. '\\u07b1' | '\\u0901' .. '\\u0939' | '\\u093c' .. '\\u094d' | '\\u0950' .. '\\u0954' | '\\u0958' .. '\\u0963' | '\\u0966' .. '\\u096f' | '\\u0981' .. '\\u0983' | '\\u0985' .. '\\u098c' | '\\u098f' .. '\\u0990' | '\\u0993' .. '\\u09a8' | '\\u09aa' .. '\\u09b0' | '\\u09b2' | '\\u09b6' .. '\\u09b9' | '\\u09bc' .. '\\u09c4' | '\\u09c7' .. '\\u09c8' | '\\u09cb' .. '\\u09cd' | '\\u09d7' | '\\u09dc' .. '\\u09dd' | '\\u09df' .. '\\u09e3' | '\\u09e6' .. '\\u09f3' | '\\u0a01' .. '\\u0a03' | '\\u0a05' .. '\\u0a0a' | '\\u0a0f' .. '\\u0a10' | '\\u0a13' .. '\\u0a28' | '\\u0a2a' .. '\\u0a30' | '\\u0a32' .. '\\u0a33' | '\\u0a35' .. '\\u0a36' | '\\u0a38' .. '\\u0a39' | '\\u0a3c' | '\\u0a3e' .. '\\u0a42' | '\\u0a47' .. '\\u0a48' | '\\u0a4b' .. '\\u0a4d' | '\\u0a59' .. '\\u0a5c' | '\\u0a5e' | '\\u0a66' .. '\\u0a74' | '\\u0a81' .. '\\u0a83' | '\\u0a85' .. '\\u0a8d' | '\\u0a8f' .. '\\u0a91' | '\\u0a93' .. '\\u0aa8' | '\\u0aaa' .. '\\u0ab0' | '\\u0ab2' .. '\\u0ab3' | '\\u0ab5' .. '\\u0ab9' | '\\u0abc' .. '\\u0ac5' | '\\u0ac7' .. '\\u0ac9' | '\\u0acb' .. '\\u0acd' | '\\u0ad0' | '\\u0ae0' .. '\\u0ae3' | '\\u0ae6' .. '\\u0aef' | '\\u0af1' | '\\u0b01' .. '\\u0b03' | '\\u0b05' .. '\\u0b0c' | '\\u0b0f' .. '\\u0b10' | '\\u0b13' .. '\\u0b28' | '\\u0b2a' .. '\\u0b30' | '\\u0b32' .. '\\u0b33' | '\\u0b35' .. '\\u0b39' | '\\u0b3c' .. '\\u0b43' | '\\u0b47' .. '\\u0b48' | '\\u0b4b' .. '\\u0b4d' | '\\u0b56' .. '\\u0b57' | '\\u0b5c' .. '\\u0b5d' | '\\u0b5f' .. '\\u0b61' | '\\u0b66' .. '\\u0b6f' | '\\u0b71' | '\\u0b82' .. '\\u0b83' | '\\u0b85' .. '\\u0b8a' | '\\u0b8e' .. '\\u0b90' | '\\u0b92' .. '\\u0b95' | '\\u0b99' .. '\\u0b9a' | '\\u0b9c' | '\\u0b9e' .. '\\u0b9f' | '\\u0ba3' .. '\\u0ba4' | '\\u0ba8' .. '\\u0baa' | '\\u0bae' .. '\\u0bb5' | '\\u0bb7' .. '\\u0bb9' | '\\u0bbe' .. '\\u0bc2' | '\\u0bc6' .. '\\u0bc8' | '\\u0bca' .. '\\u0bcd' | '\\u0bd7' | '\\u0be7' .. '\\u0bef' | '\\u0bf9' | '\\u0c01' .. '\\u0c03' | '\\u0c05' .. '\\u0c0c' | '\\u0c0e' .. '\\u0c10' | '\\u0c12' .. '\\u0c28' | '\\u0c2a' .. '\\u0c33' | '\\u0c35' .. '\\u0c39' | '\\u0c3e' .. '\\u0c44' | '\\u0c46' .. '\\u0c48' | '\\u0c4a' .. '\\u0c4d' | '\\u0c55' .. '\\u0c56' | '\\u0c60' .. '\\u0c61' | '\\u0c66' .. '\\u0c6f' | '\\u0c82' .. '\\u0c83' | '\\u0c85' .. '\\u0c8c' | '\\u0c8e' .. '\\u0c90' | '\\u0c92' .. '\\u0ca8' | '\\u0caa' .. '\\u0cb3' | '\\u0cb5' .. '\\u0cb9' | '\\u0cbc' .. '\\u0cc4' | '\\u0cc6' .. '\\u0cc8' | '\\u0cca' .. '\\u0ccd' | '\\u0cd5' .. '\\u0cd6' | '\\u0cde' | '\\u0ce0' .. '\\u0ce1' | '\\u0ce6' .. '\\u0cef' | '\\u0d02' .. '\\u0d03' | '\\u0d05' .. '\\u0d0c' | '\\u0d0e' .. '\\u0d10' | '\\u0d12' .. '\\u0d28' | '\\u0d2a' .. '\\u0d39' | '\\u0d3e' .. '\\u0d43' | '\\u0d46' .. '\\u0d48' | '\\u0d4a' .. '\\u0d4d' | '\\u0d57' | '\\u0d60' .. '\\u0d61' | '\\u0d66' .. '\\u0d6f' | '\\u0d82' .. '\\u0d83' | '\\u0d85' .. '\\u0d96' | '\\u0d9a' .. '\\u0db1' | '\\u0db3' .. '\\u0dbb' | '\\u0dbd' | '\\u0dc0' .. '\\u0dc6' | '\\u0dca' | '\\u0dcf' .. '\\u0dd4' | '\\u0dd6' | '\\u0dd8' .. '\\u0ddf' | '\\u0df2' .. '\\u0df3' | '\\u0e01' .. '\\u0e3a' | '\\u0e3f' .. '\\u0e4e' | '\\u0e50' .. '\\u0e59' | '\\u0e81' .. '\\u0e82' | '\\u0e84' | '\\u0e87' .. '\\u0e88' | '\\u0e8a' | '\\u0e8d' | '\\u0e94' .. '\\u0e97' | '\\u0e99' .. '\\u0e9f' | '\\u0ea1' .. '\\u0ea3' | '\\u0ea5' | '\\u0ea7' | '\\u0eaa' .. '\\u0eab' | '\\u0ead' .. '\\u0eb9' | '\\u0ebb' .. '\\u0ebd' | '\\u0ec0' .. '\\u0ec4' | '\\u0ec6' | '\\u0ec8' .. '\\u0ecd' | '\\u0ed0' .. '\\u0ed9' | '\\u0edc' .. '\\u0edd' | '\\u0f00' | '\\u0f18' .. '\\u0f19' | '\\u0f20' .. '\\u0f29' | '\\u0f35' | '\\u0f37' | '\\u0f39' | '\\u0f3e' .. '\\u0f47' | '\\u0f49' .. '\\u0f6a' | '\\u0f71' .. '\\u0f84' | '\\u0f86' .. '\\u0f8b' | '\\u0f90' .. '\\u0f97' | '\\u0f99' .. '\\u0fbc' | '\\u0fc6' | '\\u1000' .. '\\u1021' | '\\u1023' .. '\\u1027' | '\\u1029' .. '\\u102a' | '\\u102c' .. '\\u1032' | '\\u1036' .. '\\u1039' | '\\u1040' .. '\\u1049' | '\\u1050' .. '\\u1059' | '\\u10a0' .. '\\u10c5' | '\\u10d0' .. '\\u10f8' | '\\u1100' .. '\\u1159' | '\\u115f' .. '\\u11a2' | '\\u11a8' .. '\\u11f9' | '\\u1200' .. '\\u1206' | '\\u1208' .. '\\u1246' | '\\u1248' | '\\u124a' .. '\\u124d' | '\\u1250' .. '\\u1256' | '\\u1258' | '\\u125a' .. '\\u125d' | '\\u1260' .. '\\u1286' | '\\u1288' | '\\u128a' .. '\\u128d' | '\\u1290' .. '\\u12ae' | '\\u12b0' | '\\u12b2' .. '\\u12b5' | '\\u12b8' .. '\\u12be' | '\\u12c0' | '\\u12c2' .. '\\u12c5' | '\\u12c8' .. '\\u12ce' | '\\u12d0' .. '\\u12d6' | '\\u12d8' .. '\\u12ee' | '\\u12f0' .. '\\u130e' | '\\u1310' | '\\u1312' .. '\\u1315' | '\\u1318' .. '\\u131e' | '\\u1320' .. '\\u1346' | '\\u1348' .. '\\u135a' | '\\u1369' .. '\\u1371' | '\\u13a0' .. '\\u13f4' | '\\u1401' .. '\\u166c' | '\\u166f' .. '\\u1676' | '\\u1681' .. '\\u169a' | '\\u16a0' .. '\\u16ea' | '\\u16ee' .. '\\u16f0' | '\\u1700' .. '\\u170c' | '\\u170e' .. '\\u1714' | '\\u1720' .. '\\u1734' | '\\u1740' .. '\\u1753' | '\\u1760' .. '\\u176c' | '\\u176e' .. '\\u1770' | '\\u1772' .. '\\u1773' | '\\u1780' .. '\\u17d3' | '\\u17d7' | '\\u17db' .. '\\u17dd' | '\\u17e0' .. '\\u17e9' | '\\u180b' .. '\\u180d' | '\\u1810' .. '\\u1819' | '\\u1820' .. '\\u1877' | '\\u1880' .. '\\u18a9' | '\\u1900' .. '\\u191c' | '\\u1920' .. '\\u192b' | '\\u1930' .. '\\u193b' | '\\u1946' .. '\\u196d' | '\\u1970' .. '\\u1974' | '\\u1d00' .. '\\u1d6b' | '\\u1e00' .. '\\u1e9b' | '\\u1ea0' .. '\\u1ef9' | '\\u1f00' .. '\\u1f15' | '\\u1f18' .. '\\u1f1d' | '\\u1f20' .. '\\u1f45' | '\\u1f48' .. '\\u1f4d' | '\\u1f50' .. '\\u1f57' | '\\u1f59' | '\\u1f5b' | '\\u1f5d' | '\\u1f5f' .. '\\u1f7d' | '\\u1f80' .. '\\u1fb4' | '\\u1fb6' .. '\\u1fbc' | '\\u1fbe' | '\\u1fc2' .. '\\u1fc4' | '\\u1fc6' .. '\\u1fcc' | '\\u1fd0' .. '\\u1fd3' | '\\u1fd6' .. '\\u1fdb' | '\\u1fe0' .. '\\u1fec' | '\\u1ff2' .. '\\u1ff4' | '\\u1ff6' .. '\\u1ffc' | '\\u200c' .. '\\u200f' | '\\u202a' .. '\\u202e' | '\\u203f' .. '\\u2040' | '\\u2054' | '\\u2060' .. '\\u2063' | '\\u206a' .. '\\u206f' | '\\u2071' | '\\u207f' | '\\u20a0' .. '\\u20b1' | '\\u20d0' .. '\\u20dc' | '\\u20e1' | '\\u20e5' .. '\\u20ea' | '\\u2102' | '\\u2107' | '\\u210a' .. '\\u2113' | '\\u2115' | '\\u2119' .. '\\u211d' | '\\u2124' | '\\u2126' | '\\u2128' | '\\u212a' .. '\\u212d' | '\\u212f' .. '\\u2131' | '\\u2133' .. '\\u2139' | '\\u213d' .. '\\u213f' | '\\u2145' .. '\\u2149' | '\\u2160' .. '\\u2183' | '\\u3005' .. '\\u3007' | '\\u3021' .. '\\u302f' | '\\u3031' .. '\\u3035' | '\\u3038' .. '\\u303c' | '\\u3041' .. '\\u3096' | '\\u3099' .. '\\u309a' | '\\u309d' .. '\\u309f' | '\\u30a1' .. '\\u30ff' | '\\u3105' .. '\\u312c' | '\\u3131' .. '\\u318e' | '\\u31a0' .. '\\u31b7' | '\\u31f0' .. '\\u31ff' | '\\u3400' .. '\\u4db5' | '\\u4e00' .. '\\u9fa5' | '\\ua000' .. '\\ua48c' | '\\uac00' .. '\\ud7a3' | '\\uf900' .. '\\ufa2d' | '\\ufa30' .. '\\ufa6a' | '\\ufb00' .. '\\ufb06' | '\\ufb13' .. '\\ufb17' | '\\ufb1d' .. '\\ufb28' | '\\ufb2a' .. '\\ufb36' | '\\ufb38' .. '\\ufb3c' | '\\ufb3e' | '\\ufb40' .. '\\ufb41' | '\\ufb43' .. '\\ufb44' | '\\ufb46' .. '\\ufbb1' | '\\ufbd3' .. '\\ufd3d' | '\\ufd50' .. '\\ufd8f' | '\\ufd92' .. '\\ufdc7' | '\\ufdf0' .. '\\ufdfc' | '\\ufe00' .. '\\ufe0f' | '\\ufe20' .. '\\ufe23' | '\\ufe33' .. '\\ufe34' | '\\ufe4d' .. '\\ufe4f' | '\\ufe69' | '\\ufe70' .. '\\ufe74' | '\\ufe76' .. '\\ufefc' | '\\ufeff' | '\\uff04' | '\\uff10' .. '\\uff19' | '\\uff21' .. '\\uff3a' | '\\uff3f' | '\\uff41' .. '\\uff5a' | '\\uff65' .. '\\uffbe' | '\\uffc2' .. '\\uffc7' | '\\uffca' .. '\\uffcf' | '\\uffd2' .. '\\uffd7' | '\\uffda' .. '\\uffdc' | '\\uffe0' .. '\\uffe1' | '\\uffe5' .. '\\uffe6' | '\\ufff9' .. '\\ufffb' )
			// PHPAST.g:
			{
			if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001B')||input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u007F' && input.LA(1) <= '\u009F')||(input.LA(1) >= '\u00A2' && input.LA(1) <= '\u00A5')||input.LA(1)=='\u00AA'||input.LA(1)=='\u00AD'||input.LA(1)=='\u00B5'||input.LA(1)=='\u00BA'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u0236')||(input.LA(1) >= '\u0250' && input.LA(1) <= '\u02C1')||(input.LA(1) >= '\u02C6' && input.LA(1) <= '\u02D1')||(input.LA(1) >= '\u02E0' && input.LA(1) <= '\u02E4')||input.LA(1)=='\u02EE'||(input.LA(1) >= '\u0300' && input.LA(1) <= '\u0357')||(input.LA(1) >= '\u035D' && input.LA(1) <= '\u036F')||input.LA(1)=='\u037A'||input.LA(1)=='\u0386'||(input.LA(1) >= '\u0388' && input.LA(1) <= '\u038A')||input.LA(1)=='\u038C'||(input.LA(1) >= '\u038E' && input.LA(1) <= '\u03A1')||(input.LA(1) >= '\u03A3' && input.LA(1) <= '\u03CE')||(input.LA(1) >= '\u03D0' && input.LA(1) <= '\u03F5')||(input.LA(1) >= '\u03F7' && input.LA(1) <= '\u03FB')||(input.LA(1) >= '\u0400' && input.LA(1) <= '\u0481')||(input.LA(1) >= '\u0483' && input.LA(1) <= '\u0486')||(input.LA(1) >= '\u048A' && input.LA(1) <= '\u04CE')||(input.LA(1) >= '\u04D0' && input.LA(1) <= '\u04F5')||(input.LA(1) >= '\u04F8' && input.LA(1) <= '\u04F9')||(input.LA(1) >= '\u0500' && input.LA(1) <= '\u050F')||(input.LA(1) >= '\u0531' && input.LA(1) <= '\u0556')||input.LA(1)=='\u0559'||(input.LA(1) >= '\u0561' && input.LA(1) <= '\u0587')||(input.LA(1) >= '\u0591' && input.LA(1) <= '\u05A1')||(input.LA(1) >= '\u05A3' && input.LA(1) <= '\u05B9')||(input.LA(1) >= '\u05BB' && input.LA(1) <= '\u05BD')||input.LA(1)=='\u05BF'||(input.LA(1) >= '\u05C1' && input.LA(1) <= '\u05C2')||input.LA(1)=='\u05C4'||(input.LA(1) >= '\u05D0' && input.LA(1) <= '\u05EA')||(input.LA(1) >= '\u05F0' && input.LA(1) <= '\u05F2')||(input.LA(1) >= '\u0600' && input.LA(1) <= '\u0603')||(input.LA(1) >= '\u0610' && input.LA(1) <= '\u0615')||(input.LA(1) >= '\u0621' && input.LA(1) <= '\u063A')||(input.LA(1) >= '\u0640' && input.LA(1) <= '\u0658')||(input.LA(1) >= '\u0660' && input.LA(1) <= '\u0669')||(input.LA(1) >= '\u066E' && input.LA(1) <= '\u06D3')||(input.LA(1) >= '\u06D5' && input.LA(1) <= '\u06DD')||(input.LA(1) >= '\u06DF' && input.LA(1) <= '\u06E8')||(input.LA(1) >= '\u06EA' && input.LA(1) <= '\u06FC')||input.LA(1)=='\u06FF'||(input.LA(1) >= '\u070F' && input.LA(1) <= '\u074A')||(input.LA(1) >= '\u074D' && input.LA(1) <= '\u074F')||(input.LA(1) >= '\u0780' && input.LA(1) <= '\u07B1')||(input.LA(1) >= '\u0901' && input.LA(1) <= '\u0939')||(input.LA(1) >= '\u093C' && input.LA(1) <= '\u094D')||(input.LA(1) >= '\u0950' && input.LA(1) <= '\u0954')||(input.LA(1) >= '\u0958' && input.LA(1) <= '\u0963')||(input.LA(1) >= '\u0966' && input.LA(1) <= '\u096F')||(input.LA(1) >= '\u0981' && input.LA(1) <= '\u0983')||(input.LA(1) >= '\u0985' && input.LA(1) <= '\u098C')||(input.LA(1) >= '\u098F' && input.LA(1) <= '\u0990')||(input.LA(1) >= '\u0993' && input.LA(1) <= '\u09A8')||(input.LA(1) >= '\u09AA' && input.LA(1) <= '\u09B0')||input.LA(1)=='\u09B2'||(input.LA(1) >= '\u09B6' && input.LA(1) <= '\u09B9')||(input.LA(1) >= '\u09BC' && input.LA(1) <= '\u09C4')||(input.LA(1) >= '\u09C7' && input.LA(1) <= '\u09C8')||(input.LA(1) >= '\u09CB' && input.LA(1) <= '\u09CD')||input.LA(1)=='\u09D7'||(input.LA(1) >= '\u09DC' && input.LA(1) <= '\u09DD')||(input.LA(1) >= '\u09DF' && input.LA(1) <= '\u09E3')||(input.LA(1) >= '\u09E6' && input.LA(1) <= '\u09F3')||(input.LA(1) >= '\u0A01' && input.LA(1) <= '\u0A03')||(input.LA(1) >= '\u0A05' && input.LA(1) <= '\u0A0A')||(input.LA(1) >= '\u0A0F' && input.LA(1) <= '\u0A10')||(input.LA(1) >= '\u0A13' && input.LA(1) <= '\u0A28')||(input.LA(1) >= '\u0A2A' && input.LA(1) <= '\u0A30')||(input.LA(1) >= '\u0A32' && input.LA(1) <= '\u0A33')||(input.LA(1) >= '\u0A35' && input.LA(1) <= '\u0A36')||(input.LA(1) >= '\u0A38' && input.LA(1) <= '\u0A39')||input.LA(1)=='\u0A3C'||(input.LA(1) >= '\u0A3E' && input.LA(1) <= '\u0A42')||(input.LA(1) >= '\u0A47' && input.LA(1) <= '\u0A48')||(input.LA(1) >= '\u0A4B' && input.LA(1) <= '\u0A4D')||(input.LA(1) >= '\u0A59' && input.LA(1) <= '\u0A5C')||input.LA(1)=='\u0A5E'||(input.LA(1) >= '\u0A66' && input.LA(1) <= '\u0A74')||(input.LA(1) >= '\u0A81' && input.LA(1) <= '\u0A83')||(input.LA(1) >= '\u0A85' && input.LA(1) <= '\u0A8D')||(input.LA(1) >= '\u0A8F' && input.LA(1) <= '\u0A91')||(input.LA(1) >= '\u0A93' && input.LA(1) <= '\u0AA8')||(input.LA(1) >= '\u0AAA' && input.LA(1) <= '\u0AB0')||(input.LA(1) >= '\u0AB2' && input.LA(1) <= '\u0AB3')||(input.LA(1) >= '\u0AB5' && input.LA(1) <= '\u0AB9')||(input.LA(1) >= '\u0ABC' && input.LA(1) <= '\u0AC5')||(input.LA(1) >= '\u0AC7' && input.LA(1) <= '\u0AC9')||(input.LA(1) >= '\u0ACB' && input.LA(1) <= '\u0ACD')||input.LA(1)=='\u0AD0'||(input.LA(1) >= '\u0AE0' && input.LA(1) <= '\u0AE3')||(input.LA(1) >= '\u0AE6' && input.LA(1) <= '\u0AEF')||input.LA(1)=='\u0AF1'||(input.LA(1) >= '\u0B01' && input.LA(1) <= '\u0B03')||(input.LA(1) >= '\u0B05' && input.LA(1) <= '\u0B0C')||(input.LA(1) >= '\u0B0F' && input.LA(1) <= '\u0B10')||(input.LA(1) >= '\u0B13' && input.LA(1) <= '\u0B28')||(input.LA(1) >= '\u0B2A' && input.LA(1) <= '\u0B30')||(input.LA(1) >= '\u0B32' && input.LA(1) <= '\u0B33')||(input.LA(1) >= '\u0B35' && input.LA(1) <= '\u0B39')||(input.LA(1) >= '\u0B3C' && input.LA(1) <= '\u0B43')||(input.LA(1) >= '\u0B47' && input.LA(1) <= '\u0B48')||(input.LA(1) >= '\u0B4B' && input.LA(1) <= '\u0B4D')||(input.LA(1) >= '\u0B56' && input.LA(1) <= '\u0B57')||(input.LA(1) >= '\u0B5C' && input.LA(1) <= '\u0B5D')||(input.LA(1) >= '\u0B5F' && input.LA(1) <= '\u0B61')||(input.LA(1) >= '\u0B66' && input.LA(1) <= '\u0B6F')||input.LA(1)=='\u0B71'||(input.LA(1) >= '\u0B82' && input.LA(1) <= '\u0B83')||(input.LA(1) >= '\u0B85' && input.LA(1) <= '\u0B8A')||(input.LA(1) >= '\u0B8E' && input.LA(1) <= '\u0B90')||(input.LA(1) >= '\u0B92' && input.LA(1) <= '\u0B95')||(input.LA(1) >= '\u0B99' && input.LA(1) <= '\u0B9A')||input.LA(1)=='\u0B9C'||(input.LA(1) >= '\u0B9E' && input.LA(1) <= '\u0B9F')||(input.LA(1) >= '\u0BA3' && input.LA(1) <= '\u0BA4')||(input.LA(1) >= '\u0BA8' && input.LA(1) <= '\u0BAA')||(input.LA(1) >= '\u0BAE' && input.LA(1) <= '\u0BB5')||(input.LA(1) >= '\u0BB7' && input.LA(1) <= '\u0BB9')||(input.LA(1) >= '\u0BBE' && input.LA(1) <= '\u0BC2')||(input.LA(1) >= '\u0BC6' && input.LA(1) <= '\u0BC8')||(input.LA(1) >= '\u0BCA' && input.LA(1) <= '\u0BCD')||input.LA(1)=='\u0BD7'||(input.LA(1) >= '\u0BE7' && input.LA(1) <= '\u0BEF')||input.LA(1)=='\u0BF9'||(input.LA(1) >= '\u0C01' && input.LA(1) <= '\u0C03')||(input.LA(1) >= '\u0C05' && input.LA(1) <= '\u0C0C')||(input.LA(1) >= '\u0C0E' && input.LA(1) <= '\u0C10')||(input.LA(1) >= '\u0C12' && input.LA(1) <= '\u0C28')||(input.LA(1) >= '\u0C2A' && input.LA(1) <= '\u0C33')||(input.LA(1) >= '\u0C35' && input.LA(1) <= '\u0C39')||(input.LA(1) >= '\u0C3E' && input.LA(1) <= '\u0C44')||(input.LA(1) >= '\u0C46' && input.LA(1) <= '\u0C48')||(input.LA(1) >= '\u0C4A' && input.LA(1) <= '\u0C4D')||(input.LA(1) >= '\u0C55' && input.LA(1) <= '\u0C56')||(input.LA(1) >= '\u0C60' && input.LA(1) <= '\u0C61')||(input.LA(1) >= '\u0C66' && input.LA(1) <= '\u0C6F')||(input.LA(1) >= '\u0C82' && input.LA(1) <= '\u0C83')||(input.LA(1) >= '\u0C85' && input.LA(1) <= '\u0C8C')||(input.LA(1) >= '\u0C8E' && input.LA(1) <= '\u0C90')||(input.LA(1) >= '\u0C92' && input.LA(1) <= '\u0CA8')||(input.LA(1) >= '\u0CAA' && input.LA(1) <= '\u0CB3')||(input.LA(1) >= '\u0CB5' && input.LA(1) <= '\u0CB9')||(input.LA(1) >= '\u0CBC' && input.LA(1) <= '\u0CC4')||(input.LA(1) >= '\u0CC6' && input.LA(1) <= '\u0CC8')||(input.LA(1) >= '\u0CCA' && input.LA(1) <= '\u0CCD')||(input.LA(1) >= '\u0CD5' && input.LA(1) <= '\u0CD6')||input.LA(1)=='\u0CDE'||(input.LA(1) >= '\u0CE0' && input.LA(1) <= '\u0CE1')||(input.LA(1) >= '\u0CE6' && input.LA(1) <= '\u0CEF')||(input.LA(1) >= '\u0D02' && input.LA(1) <= '\u0D03')||(input.LA(1) >= '\u0D05' && input.LA(1) <= '\u0D0C')||(input.LA(1) >= '\u0D0E' && input.LA(1) <= '\u0D10')||(input.LA(1) >= '\u0D12' && input.LA(1) <= '\u0D28')||(input.LA(1) >= '\u0D2A' && input.LA(1) <= '\u0D39')||(input.LA(1) >= '\u0D3E' && input.LA(1) <= '\u0D43')||(input.LA(1) >= '\u0D46' && input.LA(1) <= '\u0D48')||(input.LA(1) >= '\u0D4A' && input.LA(1) <= '\u0D4D')||input.LA(1)=='\u0D57'||(input.LA(1) >= '\u0D60' && input.LA(1) <= '\u0D61')||(input.LA(1) >= '\u0D66' && input.LA(1) <= '\u0D6F')||(input.LA(1) >= '\u0D82' && input.LA(1) <= '\u0D83')||(input.LA(1) >= '\u0D85' && input.LA(1) <= '\u0D96')||(input.LA(1) >= '\u0D9A' && input.LA(1) <= '\u0DB1')||(input.LA(1) >= '\u0DB3' && input.LA(1) <= '\u0DBB')||input.LA(1)=='\u0DBD'||(input.LA(1) >= '\u0DC0' && input.LA(1) <= '\u0DC6')||input.LA(1)=='\u0DCA'||(input.LA(1) >= '\u0DCF' && input.LA(1) <= '\u0DD4')||input.LA(1)=='\u0DD6'||(input.LA(1) >= '\u0DD8' && input.LA(1) <= '\u0DDF')||(input.LA(1) >= '\u0DF2' && input.LA(1) <= '\u0DF3')||(input.LA(1) >= '\u0E01' && input.LA(1) <= '\u0E3A')||(input.LA(1) >= '\u0E3F' && input.LA(1) <= '\u0E4E')||(input.LA(1) >= '\u0E50' && input.LA(1) <= '\u0E59')||(input.LA(1) >= '\u0E81' && input.LA(1) <= '\u0E82')||input.LA(1)=='\u0E84'||(input.LA(1) >= '\u0E87' && input.LA(1) <= '\u0E88')||input.LA(1)=='\u0E8A'||input.LA(1)=='\u0E8D'||(input.LA(1) >= '\u0E94' && input.LA(1) <= '\u0E97')||(input.LA(1) >= '\u0E99' && input.LA(1) <= '\u0E9F')||(input.LA(1) >= '\u0EA1' && input.LA(1) <= '\u0EA3')||input.LA(1)=='\u0EA5'||input.LA(1)=='\u0EA7'||(input.LA(1) >= '\u0EAA' && input.LA(1) <= '\u0EAB')||(input.LA(1) >= '\u0EAD' && input.LA(1) <= '\u0EB9')||(input.LA(1) >= '\u0EBB' && input.LA(1) <= '\u0EBD')||(input.LA(1) >= '\u0EC0' && input.LA(1) <= '\u0EC4')||input.LA(1)=='\u0EC6'||(input.LA(1) >= '\u0EC8' && input.LA(1) <= '\u0ECD')||(input.LA(1) >= '\u0ED0' && input.LA(1) <= '\u0ED9')||(input.LA(1) >= '\u0EDC' && input.LA(1) <= '\u0EDD')||input.LA(1)=='\u0F00'||(input.LA(1) >= '\u0F18' && input.LA(1) <= '\u0F19')||(input.LA(1) >= '\u0F20' && input.LA(1) <= '\u0F29')||input.LA(1)=='\u0F35'||input.LA(1)=='\u0F37'||input.LA(1)=='\u0F39'||(input.LA(1) >= '\u0F3E' && input.LA(1) <= '\u0F47')||(input.LA(1) >= '\u0F49' && input.LA(1) <= '\u0F6A')||(input.LA(1) >= '\u0F71' && input.LA(1) <= '\u0F84')||(input.LA(1) >= '\u0F86' && input.LA(1) <= '\u0F8B')||(input.LA(1) >= '\u0F90' && input.LA(1) <= '\u0F97')||(input.LA(1) >= '\u0F99' && input.LA(1) <= '\u0FBC')||input.LA(1)=='\u0FC6'||(input.LA(1) >= '\u1000' && input.LA(1) <= '\u1021')||(input.LA(1) >= '\u1023' && input.LA(1) <= '\u1027')||(input.LA(1) >= '\u1029' && input.LA(1) <= '\u102A')||(input.LA(1) >= '\u102C' && input.LA(1) <= '\u1032')||(input.LA(1) >= '\u1036' && input.LA(1) <= '\u1039')||(input.LA(1) >= '\u1040' && input.LA(1) <= '\u1049')||(input.LA(1) >= '\u1050' && input.LA(1) <= '\u1059')||(input.LA(1) >= '\u10A0' && input.LA(1) <= '\u10C5')||(input.LA(1) >= '\u10D0' && input.LA(1) <= '\u10F8')||(input.LA(1) >= '\u1100' && input.LA(1) <= '\u1159')||(input.LA(1) >= '\u115F' && input.LA(1) <= '\u11A2')||(input.LA(1) >= '\u11A8' && input.LA(1) <= '\u11F9')||(input.LA(1) >= '\u1200' && input.LA(1) <= '\u1206')||(input.LA(1) >= '\u1208' && input.LA(1) <= '\u1246')||input.LA(1)=='\u1248'||(input.LA(1) >= '\u124A' && input.LA(1) <= '\u124D')||(input.LA(1) >= '\u1250' && input.LA(1) <= '\u1256')||input.LA(1)=='\u1258'||(input.LA(1) >= '\u125A' && input.LA(1) <= '\u125D')||(input.LA(1) >= '\u1260' && input.LA(1) <= '\u1286')||input.LA(1)=='\u1288'||(input.LA(1) >= '\u128A' && input.LA(1) <= '\u128D')||(input.LA(1) >= '\u1290' && input.LA(1) <= '\u12AE')||input.LA(1)=='\u12B0'||(input.LA(1) >= '\u12B2' && input.LA(1) <= '\u12B5')||(input.LA(1) >= '\u12B8' && input.LA(1) <= '\u12BE')||input.LA(1)=='\u12C0'||(input.LA(1) >= '\u12C2' && input.LA(1) <= '\u12C5')||(input.LA(1) >= '\u12C8' && input.LA(1) <= '\u12CE')||(input.LA(1) >= '\u12D0' && input.LA(1) <= '\u12D6')||(input.LA(1) >= '\u12D8' && input.LA(1) <= '\u12EE')||(input.LA(1) >= '\u12F0' && input.LA(1) <= '\u130E')||input.LA(1)=='\u1310'||(input.LA(1) >= '\u1312' && input.LA(1) <= '\u1315')||(input.LA(1) >= '\u1318' && input.LA(1) <= '\u131E')||(input.LA(1) >= '\u1320' && input.LA(1) <= '\u1346')||(input.LA(1) >= '\u1348' && input.LA(1) <= '\u135A')||(input.LA(1) >= '\u1369' && input.LA(1) <= '\u1371')||(input.LA(1) >= '\u13A0' && input.LA(1) <= '\u13F4')||(input.LA(1) >= '\u1401' && input.LA(1) <= '\u166C')||(input.LA(1) >= '\u166F' && input.LA(1) <= '\u1676')||(input.LA(1) >= '\u1681' && input.LA(1) <= '\u169A')||(input.LA(1) >= '\u16A0' && input.LA(1) <= '\u16EA')||(input.LA(1) >= '\u16EE' && input.LA(1) <= '\u16F0')||(input.LA(1) >= '\u1700' && input.LA(1) <= '\u170C')||(input.LA(1) >= '\u170E' && input.LA(1) <= '\u1714')||(input.LA(1) >= '\u1720' && input.LA(1) <= '\u1734')||(input.LA(1) >= '\u1740' && input.LA(1) <= '\u1753')||(input.LA(1) >= '\u1760' && input.LA(1) <= '\u176C')||(input.LA(1) >= '\u176E' && input.LA(1) <= '\u1770')||(input.LA(1) >= '\u1772' && input.LA(1) <= '\u1773')||(input.LA(1) >= '\u1780' && input.LA(1) <= '\u17D3')||input.LA(1)=='\u17D7'||(input.LA(1) >= '\u17DB' && input.LA(1) <= '\u17DD')||(input.LA(1) >= '\u17E0' && input.LA(1) <= '\u17E9')||(input.LA(1) >= '\u180B' && input.LA(1) <= '\u180D')||(input.LA(1) >= '\u1810' && input.LA(1) <= '\u1819')||(input.LA(1) >= '\u1820' && input.LA(1) <= '\u1877')||(input.LA(1) >= '\u1880' && input.LA(1) <= '\u18A9')||(input.LA(1) >= '\u1900' && input.LA(1) <= '\u191C')||(input.LA(1) >= '\u1920' && input.LA(1) <= '\u192B')||(input.LA(1) >= '\u1930' && input.LA(1) <= '\u193B')||(input.LA(1) >= '\u1946' && input.LA(1) <= '\u196D')||(input.LA(1) >= '\u1970' && input.LA(1) <= '\u1974')||(input.LA(1) >= '\u1D00' && input.LA(1) <= '\u1D6B')||(input.LA(1) >= '\u1E00' && input.LA(1) <= '\u1E9B')||(input.LA(1) >= '\u1EA0' && input.LA(1) <= '\u1EF9')||(input.LA(1) >= '\u1F00' && input.LA(1) <= '\u1F15')||(input.LA(1) >= '\u1F18' && input.LA(1) <= '\u1F1D')||(input.LA(1) >= '\u1F20' && input.LA(1) <= '\u1F45')||(input.LA(1) >= '\u1F48' && input.LA(1) <= '\u1F4D')||(input.LA(1) >= '\u1F50' && input.LA(1) <= '\u1F57')||input.LA(1)=='\u1F59'||input.LA(1)=='\u1F5B'||input.LA(1)=='\u1F5D'||(input.LA(1) >= '\u1F5F' && input.LA(1) <= '\u1F7D')||(input.LA(1) >= '\u1F80' && input.LA(1) <= '\u1FB4')||(input.LA(1) >= '\u1FB6' && input.LA(1) <= '\u1FBC')||input.LA(1)=='\u1FBE'||(input.LA(1) >= '\u1FC2' && input.LA(1) <= '\u1FC4')||(input.LA(1) >= '\u1FC6' && input.LA(1) <= '\u1FCC')||(input.LA(1) >= '\u1FD0' && input.LA(1) <= '\u1FD3')||(input.LA(1) >= '\u1FD6' && input.LA(1) <= '\u1FDB')||(input.LA(1) >= '\u1FE0' && input.LA(1) <= '\u1FEC')||(input.LA(1) >= '\u1FF2' && input.LA(1) <= '\u1FF4')||(input.LA(1) >= '\u1FF6' && input.LA(1) <= '\u1FFC')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200F')||(input.LA(1) >= '\u202A' && input.LA(1) <= '\u202E')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||input.LA(1)=='\u2054'||(input.LA(1) >= '\u2060' && input.LA(1) <= '\u2063')||(input.LA(1) >= '\u206A' && input.LA(1) <= '\u206F')||input.LA(1)=='\u2071'||input.LA(1)=='\u207F'||(input.LA(1) >= '\u20A0' && input.LA(1) <= '\u20B1')||(input.LA(1) >= '\u20D0' && input.LA(1) <= '\u20DC')||input.LA(1)=='\u20E1'||(input.LA(1) >= '\u20E5' && input.LA(1) <= '\u20EA')||input.LA(1)=='\u2102'||input.LA(1)=='\u2107'||(input.LA(1) >= '\u210A' && input.LA(1) <= '\u2113')||input.LA(1)=='\u2115'||(input.LA(1) >= '\u2119' && input.LA(1) <= '\u211D')||input.LA(1)=='\u2124'||input.LA(1)=='\u2126'||input.LA(1)=='\u2128'||(input.LA(1) >= '\u212A' && input.LA(1) <= '\u212D')||(input.LA(1) >= '\u212F' && input.LA(1) <= '\u2131')||(input.LA(1) >= '\u2133' && input.LA(1) <= '\u2139')||(input.LA(1) >= '\u213D' && input.LA(1) <= '\u213F')||(input.LA(1) >= '\u2145' && input.LA(1) <= '\u2149')||(input.LA(1) >= '\u2160' && input.LA(1) <= '\u2183')||(input.LA(1) >= '\u3005' && input.LA(1) <= '\u3007')||(input.LA(1) >= '\u3021' && input.LA(1) <= '\u302F')||(input.LA(1) >= '\u3031' && input.LA(1) <= '\u3035')||(input.LA(1) >= '\u3038' && input.LA(1) <= '\u303C')||(input.LA(1) >= '\u3041' && input.LA(1) <= '\u3096')||(input.LA(1) >= '\u3099' && input.LA(1) <= '\u309A')||(input.LA(1) >= '\u309D' && input.LA(1) <= '\u309F')||(input.LA(1) >= '\u30A1' && input.LA(1) <= '\u30FF')||(input.LA(1) >= '\u3105' && input.LA(1) <= '\u312C')||(input.LA(1) >= '\u3131' && input.LA(1) <= '\u318E')||(input.LA(1) >= '\u31A0' && input.LA(1) <= '\u31B7')||(input.LA(1) >= '\u31F0' && input.LA(1) <= '\u31FF')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u4DB5')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FA5')||(input.LA(1) >= '\uA000' && input.LA(1) <= '\uA48C')||(input.LA(1) >= '\uAC00' && input.LA(1) <= '\uD7A3')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFA2D')||(input.LA(1) >= '\uFA30' && input.LA(1) <= '\uFA6A')||(input.LA(1) >= '\uFB00' && input.LA(1) <= '\uFB06')||(input.LA(1) >= '\uFB13' && input.LA(1) <= '\uFB17')||(input.LA(1) >= '\uFB1D' && input.LA(1) <= '\uFB28')||(input.LA(1) >= '\uFB2A' && input.LA(1) <= '\uFB36')||(input.LA(1) >= '\uFB38' && input.LA(1) <= '\uFB3C')||input.LA(1)=='\uFB3E'||(input.LA(1) >= '\uFB40' && input.LA(1) <= '\uFB41')||(input.LA(1) >= '\uFB43' && input.LA(1) <= '\uFB44')||(input.LA(1) >= '\uFB46' && input.LA(1) <= '\uFBB1')||(input.LA(1) >= '\uFBD3' && input.LA(1) <= '\uFD3D')||(input.LA(1) >= '\uFD50' && input.LA(1) <= '\uFD8F')||(input.LA(1) >= '\uFD92' && input.LA(1) <= '\uFDC7')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFDFC')||(input.LA(1) >= '\uFE00' && input.LA(1) <= '\uFE0F')||(input.LA(1) >= '\uFE20' && input.LA(1) <= '\uFE23')||(input.LA(1) >= '\uFE33' && input.LA(1) <= '\uFE34')||(input.LA(1) >= '\uFE4D' && input.LA(1) <= '\uFE4F')||input.LA(1)=='\uFE69'||(input.LA(1) >= '\uFE70' && input.LA(1) <= '\uFE74')||(input.LA(1) >= '\uFE76' && input.LA(1) <= '\uFEFC')||input.LA(1)=='\uFEFF'||input.LA(1)=='\uFF04'||(input.LA(1) >= '\uFF10' && input.LA(1) <= '\uFF19')||(input.LA(1) >= '\uFF21' && input.LA(1) <= '\uFF3A')||input.LA(1)=='\uFF3F'||(input.LA(1) >= '\uFF41' && input.LA(1) <= '\uFF5A')||(input.LA(1) >= '\uFF65' && input.LA(1) <= '\uFFBE')||(input.LA(1) >= '\uFFC2' && input.LA(1) <= '\uFFC7')||(input.LA(1) >= '\uFFCA' && input.LA(1) <= '\uFFCF')||(input.LA(1) >= '\uFFD2' && input.LA(1) <= '\uFFD7')||(input.LA(1) >= '\uFFDA' && input.LA(1) <= '\uFFDC')||(input.LA(1) >= '\uFFE0' && input.LA(1) <= '\uFFE1')||(input.LA(1) >= '\uFFE5' && input.LA(1) <= '\uFFE6')||(input.LA(1) >= '\uFFF9' && input.LA(1) <= '\uFFFB') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IdentifierPart"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:3201:3: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// PHPAST.g:3201:7: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}

			              _channel = HIDDEN;
			          
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;

			            boolean isPHPDoc = false;
			        
			// PHPAST.g:3217:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// PHPAST.g:3217:9: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 


			                if((char)input.LA(1) == '*'){
			                    isPHPDoc = true;
			                }
			            
			// PHPAST.g:3223:9: ( options {greedy=false; } : . )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0=='*') ) {
					int LA28_1 = input.LA(2);
					if ( (LA28_1=='/') ) {
						alt28=2;
					}
					else if ( ((LA28_1 >= '\u0000' && LA28_1 <= '.')||(LA28_1 >= '0' && LA28_1 <= '\uFFFF')) ) {
						alt28=1;
					}

				}
				else if ( ((LA28_0 >= '\u0000' && LA28_0 <= ')')||(LA28_0 >= '+' && LA28_0 <= '\uFFFF')) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// PHPAST.g:3223:36: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop28;
				}
			}

			match("*/"); 


			                if(isPHPDoc==true){
			                    _channel = COMMENT;
			                }else{
			                    _channel = COMMENT;
			                }
			            
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// PHPAST.g:3235:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '#' (~ ( '\\n' | '\\r' ) )* | '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* )
			int alt35=4;
			alt35 = dfa35.predict(input);
			switch (alt35) {
				case 1 :
					// PHPAST.g:3235:9: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' )
					{
					match('#'); 
					// PHPAST.g:3235:13: (~ ( '\\n' | '\\r' ) )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( ((LA29_0 >= '\u0000' && LA29_0 <= '\t')||(LA29_0 >= '\u000B' && LA29_0 <= '\f')||(LA29_0 >= '\u000E' && LA29_0 <= '\uFFFF')) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop29;
						}
					}

					// PHPAST.g:3235:27: ( '\\r\\n' | '\\r' | '\\n' )
					int alt30=3;
					int LA30_0 = input.LA(1);
					if ( (LA30_0=='\r') ) {
						int LA30_1 = input.LA(2);
						if ( (LA30_1=='\n') ) {
							alt30=1;
						}

						else {
							alt30=2;
						}

					}
					else if ( (LA30_0=='\n') ) {
						alt30=3;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// PHPAST.g:3235:28: '\\r\\n'
							{
							match("\r\n"); 

							}
							break;
						case 2 :
							// PHPAST.g:3235:37: '\\r'
							{
							match('\r'); 
							}
							break;
						case 3 :
							// PHPAST.g:3235:44: '\\n'
							{
							match('\n'); 
							}
							break;

					}

					skip();
					}
					break;
				case 2 :
					// PHPAST.g:3236:9: '#' (~ ( '\\n' | '\\r' ) )*
					{
					match('#'); 
					// PHPAST.g:3236:13: (~ ( '\\n' | '\\r' ) )*
					loop31:
					while (true) {
						int alt31=2;
						int LA31_0 = input.LA(1);
						if ( ((LA31_0 >= '\u0000' && LA31_0 <= '\t')||(LA31_0 >= '\u000B' && LA31_0 <= '\f')||(LA31_0 >= '\u000E' && LA31_0 <= '\uFFFF')) ) {
							alt31=1;
						}

						switch (alt31) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop31;
						}
					}


					                _channel = COMMENT;
					            
					}
					break;
				case 3 :
					// PHPAST.g:3240:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' )
					{
					match("//"); 

					// PHPAST.g:3240:14: (~ ( '\\n' | '\\r' ) )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( ((LA32_0 >= '\u0000' && LA32_0 <= '\t')||(LA32_0 >= '\u000B' && LA32_0 <= '\f')||(LA32_0 >= '\u000E' && LA32_0 <= '\uFFFF')) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop32;
						}
					}

					// PHPAST.g:3240:29: ( '\\r\\n' | '\\r' | '\\n' )
					int alt33=3;
					int LA33_0 = input.LA(1);
					if ( (LA33_0=='\r') ) {
						int LA33_1 = input.LA(2);
						if ( (LA33_1=='\n') ) {
							alt33=1;
						}

						else {
							alt33=2;
						}

					}
					else if ( (LA33_0=='\n') ) {
						alt33=3;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 33, 0, input);
						throw nvae;
					}

					switch (alt33) {
						case 1 :
							// PHPAST.g:3240:30: '\\r\\n'
							{
							match("\r\n"); 

							}
							break;
						case 2 :
							// PHPAST.g:3240:39: '\\r'
							{
							match('\r'); 
							}
							break;
						case 3 :
							// PHPAST.g:3240:46: '\\n'
							{
							match('\n'); 
							}
							break;

					}

					skip();
					}
					break;
				case 4 :
					// PHPAST.g:3241:9: '//' (~ ( '\\n' | '\\r' ) )*
					{
					match("//"); 

					// PHPAST.g:3241:14: (~ ( '\\n' | '\\r' ) )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( ((LA34_0 >= '\u0000' && LA34_0 <= '\t')||(LA34_0 >= '\u000B' && LA34_0 <= '\f')||(LA34_0 >= '\u000E' && LA34_0 <= '\uFFFF')) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// PHPAST.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop34;
						}
					}


					                _channel = COMMENT;
					            
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// PHPAST.g:1:8: ( T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | SOC_T | SOC_PHP_T | EOC_T | DOLLAR_T | LEFT_BRACKET | RIGHT_BRACKET | LEFT_PARETHESIS | RIGHT_PARETHESIS | LEFT_OPEN_RECT | RIGHT_OPEN_RECT | CLASS_T | TRAIT_T | FOR_T | BREAK_T | EXTENDS_T | IMPLEMENTS_T | INTERFACE_T | FUNCTION_T | DO_T | WHILE_T | SWITCH_T | CONTINUE_T | RETURN_T | GLOBAL_T | STATIC_T | ECHO_T | FOREACH_T | AS_T | DECLARE_T | TRY_T | THROW_T | USE_T | ELSEIF_T | ELSE_T | ENDIF_T | IF_T | ENDSWITCH_T | CASE_T | DEFAULT_T | CATCH_T | ENDFOR_T | ENDWHILE_T | ENDFOREACH_T | ENDDECLARE_T | XOR_T | OR_T | AND_T | INSTANCEOF_T | CONST_T | LIST_T | NEW_T | CLONE_T | UNSET_T | INCLUDE_T | INCLUDE_ONCE_T | REQUIRE_T | REQUIRE_ONCE_T | PRINT_T | NAMESPACE_T | AT_T | PLUS_EQ | MINUS_EQ | MUL_EQ | DIV_EQ | DOT_EQ | PERCENT_EQ | BIT_AND_EQ | BIT_OR_EQ | POWER_EQ | LMOVE_EQ | RMOVE_EQ | ARROW_T | SINGLE_ARROW_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T | EQUAL_EQUAL_T | NOT_EQUAL_T | EXC_NOT_T | DOMAIN_T | COMMA_T | EQUAL_T | COLON_T | QUESTION_T | LOGICAL_OR_T | LOGICAL_AND_T | POWER_T | BIT_OR_T | REF_T | DOT_T | LSHIFT_T | RSHIFT_T | PERCENT_T | SEMI_COLON | PLUS_PLUS_T | MINUS_MINUS_T | PLUS_T | MINUS_T | MUL_T | DIV_T | TILDA_T | LE_T | ME_T | LT_T | MT_T | INTLITERAL | REALLITERAL | STATIC | FLOATLITERAL | DOUBLELITERRAL | BACKTRICKLITERAL | STRINGLITERAL | HERE_DOC | HEREDOC_START | IDENTIFIER | WS | COMMENT | LINE_COMMENT )
		int alt36=140;
		alt36 = dfa36.predict(input);
		switch (alt36) {
			case 1 :
				// PHPAST.g:1:10: T__176
				{
				mT__176(); 

				}
				break;
			case 2 :
				// PHPAST.g:1:17: T__177
				{
				mT__177(); 

				}
				break;
			case 3 :
				// PHPAST.g:1:24: T__178
				{
				mT__178(); 

				}
				break;
			case 4 :
				// PHPAST.g:1:31: T__179
				{
				mT__179(); 

				}
				break;
			case 5 :
				// PHPAST.g:1:38: T__180
				{
				mT__180(); 

				}
				break;
			case 6 :
				// PHPAST.g:1:45: T__181
				{
				mT__181(); 

				}
				break;
			case 7 :
				// PHPAST.g:1:52: T__182
				{
				mT__182(); 

				}
				break;
			case 8 :
				// PHPAST.g:1:59: T__183
				{
				mT__183(); 

				}
				break;
			case 9 :
				// PHPAST.g:1:66: T__184
				{
				mT__184(); 

				}
				break;
			case 10 :
				// PHPAST.g:1:73: T__185
				{
				mT__185(); 

				}
				break;
			case 11 :
				// PHPAST.g:1:80: T__186
				{
				mT__186(); 

				}
				break;
			case 12 :
				// PHPAST.g:1:87: T__187
				{
				mT__187(); 

				}
				break;
			case 13 :
				// PHPAST.g:1:94: T__188
				{
				mT__188(); 

				}
				break;
			case 14 :
				// PHPAST.g:1:101: T__189
				{
				mT__189(); 

				}
				break;
			case 15 :
				// PHPAST.g:1:108: T__190
				{
				mT__190(); 

				}
				break;
			case 16 :
				// PHPAST.g:1:115: T__191
				{
				mT__191(); 

				}
				break;
			case 17 :
				// PHPAST.g:1:122: T__192
				{
				mT__192(); 

				}
				break;
			case 18 :
				// PHPAST.g:1:129: T__193
				{
				mT__193(); 

				}
				break;
			case 19 :
				// PHPAST.g:1:136: T__194
				{
				mT__194(); 

				}
				break;
			case 20 :
				// PHPAST.g:1:143: T__195
				{
				mT__195(); 

				}
				break;
			case 21 :
				// PHPAST.g:1:150: T__196
				{
				mT__196(); 

				}
				break;
			case 22 :
				// PHPAST.g:1:157: T__197
				{
				mT__197(); 

				}
				break;
			case 23 :
				// PHPAST.g:1:164: T__198
				{
				mT__198(); 

				}
				break;
			case 24 :
				// PHPAST.g:1:171: SOC_T
				{
				mSOC_T(); 

				}
				break;
			case 25 :
				// PHPAST.g:1:177: SOC_PHP_T
				{
				mSOC_PHP_T(); 

				}
				break;
			case 26 :
				// PHPAST.g:1:187: EOC_T
				{
				mEOC_T(); 

				}
				break;
			case 27 :
				// PHPAST.g:1:193: DOLLAR_T
				{
				mDOLLAR_T(); 

				}
				break;
			case 28 :
				// PHPAST.g:1:202: LEFT_BRACKET
				{
				mLEFT_BRACKET(); 

				}
				break;
			case 29 :
				// PHPAST.g:1:215: RIGHT_BRACKET
				{
				mRIGHT_BRACKET(); 

				}
				break;
			case 30 :
				// PHPAST.g:1:229: LEFT_PARETHESIS
				{
				mLEFT_PARETHESIS(); 

				}
				break;
			case 31 :
				// PHPAST.g:1:245: RIGHT_PARETHESIS
				{
				mRIGHT_PARETHESIS(); 

				}
				break;
			case 32 :
				// PHPAST.g:1:262: LEFT_OPEN_RECT
				{
				mLEFT_OPEN_RECT(); 

				}
				break;
			case 33 :
				// PHPAST.g:1:277: RIGHT_OPEN_RECT
				{
				mRIGHT_OPEN_RECT(); 

				}
				break;
			case 34 :
				// PHPAST.g:1:293: CLASS_T
				{
				mCLASS_T(); 

				}
				break;
			case 35 :
				// PHPAST.g:1:301: TRAIT_T
				{
				mTRAIT_T(); 

				}
				break;
			case 36 :
				// PHPAST.g:1:309: FOR_T
				{
				mFOR_T(); 

				}
				break;
			case 37 :
				// PHPAST.g:1:315: BREAK_T
				{
				mBREAK_T(); 

				}
				break;
			case 38 :
				// PHPAST.g:1:323: EXTENDS_T
				{
				mEXTENDS_T(); 

				}
				break;
			case 39 :
				// PHPAST.g:1:333: IMPLEMENTS_T
				{
				mIMPLEMENTS_T(); 

				}
				break;
			case 40 :
				// PHPAST.g:1:346: INTERFACE_T
				{
				mINTERFACE_T(); 

				}
				break;
			case 41 :
				// PHPAST.g:1:358: FUNCTION_T
				{
				mFUNCTION_T(); 

				}
				break;
			case 42 :
				// PHPAST.g:1:369: DO_T
				{
				mDO_T(); 

				}
				break;
			case 43 :
				// PHPAST.g:1:374: WHILE_T
				{
				mWHILE_T(); 

				}
				break;
			case 44 :
				// PHPAST.g:1:382: SWITCH_T
				{
				mSWITCH_T(); 

				}
				break;
			case 45 :
				// PHPAST.g:1:391: CONTINUE_T
				{
				mCONTINUE_T(); 

				}
				break;
			case 46 :
				// PHPAST.g:1:402: RETURN_T
				{
				mRETURN_T(); 

				}
				break;
			case 47 :
				// PHPAST.g:1:411: GLOBAL_T
				{
				mGLOBAL_T(); 

				}
				break;
			case 48 :
				// PHPAST.g:1:420: STATIC_T
				{
				mSTATIC_T(); 

				}
				break;
			case 49 :
				// PHPAST.g:1:429: ECHO_T
				{
				mECHO_T(); 

				}
				break;
			case 50 :
				// PHPAST.g:1:436: FOREACH_T
				{
				mFOREACH_T(); 

				}
				break;
			case 51 :
				// PHPAST.g:1:446: AS_T
				{
				mAS_T(); 

				}
				break;
			case 52 :
				// PHPAST.g:1:451: DECLARE_T
				{
				mDECLARE_T(); 

				}
				break;
			case 53 :
				// PHPAST.g:1:461: TRY_T
				{
				mTRY_T(); 

				}
				break;
			case 54 :
				// PHPAST.g:1:467: THROW_T
				{
				mTHROW_T(); 

				}
				break;
			case 55 :
				// PHPAST.g:1:475: USE_T
				{
				mUSE_T(); 

				}
				break;
			case 56 :
				// PHPAST.g:1:481: ELSEIF_T
				{
				mELSEIF_T(); 

				}
				break;
			case 57 :
				// PHPAST.g:1:490: ELSE_T
				{
				mELSE_T(); 

				}
				break;
			case 58 :
				// PHPAST.g:1:497: ENDIF_T
				{
				mENDIF_T(); 

				}
				break;
			case 59 :
				// PHPAST.g:1:505: IF_T
				{
				mIF_T(); 

				}
				break;
			case 60 :
				// PHPAST.g:1:510: ENDSWITCH_T
				{
				mENDSWITCH_T(); 

				}
				break;
			case 61 :
				// PHPAST.g:1:522: CASE_T
				{
				mCASE_T(); 

				}
				break;
			case 62 :
				// PHPAST.g:1:529: DEFAULT_T
				{
				mDEFAULT_T(); 

				}
				break;
			case 63 :
				// PHPAST.g:1:539: CATCH_T
				{
				mCATCH_T(); 

				}
				break;
			case 64 :
				// PHPAST.g:1:547: ENDFOR_T
				{
				mENDFOR_T(); 

				}
				break;
			case 65 :
				// PHPAST.g:1:556: ENDWHILE_T
				{
				mENDWHILE_T(); 

				}
				break;
			case 66 :
				// PHPAST.g:1:567: ENDFOREACH_T
				{
				mENDFOREACH_T(); 

				}
				break;
			case 67 :
				// PHPAST.g:1:580: ENDDECLARE_T
				{
				mENDDECLARE_T(); 

				}
				break;
			case 68 :
				// PHPAST.g:1:593: XOR_T
				{
				mXOR_T(); 

				}
				break;
			case 69 :
				// PHPAST.g:1:599: OR_T
				{
				mOR_T(); 

				}
				break;
			case 70 :
				// PHPAST.g:1:604: AND_T
				{
				mAND_T(); 

				}
				break;
			case 71 :
				// PHPAST.g:1:610: INSTANCEOF_T
				{
				mINSTANCEOF_T(); 

				}
				break;
			case 72 :
				// PHPAST.g:1:623: CONST_T
				{
				mCONST_T(); 

				}
				break;
			case 73 :
				// PHPAST.g:1:631: LIST_T
				{
				mLIST_T(); 

				}
				break;
			case 74 :
				// PHPAST.g:1:638: NEW_T
				{
				mNEW_T(); 

				}
				break;
			case 75 :
				// PHPAST.g:1:644: CLONE_T
				{
				mCLONE_T(); 

				}
				break;
			case 76 :
				// PHPAST.g:1:652: UNSET_T
				{
				mUNSET_T(); 

				}
				break;
			case 77 :
				// PHPAST.g:1:660: INCLUDE_T
				{
				mINCLUDE_T(); 

				}
				break;
			case 78 :
				// PHPAST.g:1:670: INCLUDE_ONCE_T
				{
				mINCLUDE_ONCE_T(); 

				}
				break;
			case 79 :
				// PHPAST.g:1:685: REQUIRE_T
				{
				mREQUIRE_T(); 

				}
				break;
			case 80 :
				// PHPAST.g:1:695: REQUIRE_ONCE_T
				{
				mREQUIRE_ONCE_T(); 

				}
				break;
			case 81 :
				// PHPAST.g:1:710: PRINT_T
				{
				mPRINT_T(); 

				}
				break;
			case 82 :
				// PHPAST.g:1:718: NAMESPACE_T
				{
				mNAMESPACE_T(); 

				}
				break;
			case 83 :
				// PHPAST.g:1:730: AT_T
				{
				mAT_T(); 

				}
				break;
			case 84 :
				// PHPAST.g:1:735: PLUS_EQ
				{
				mPLUS_EQ(); 

				}
				break;
			case 85 :
				// PHPAST.g:1:743: MINUS_EQ
				{
				mMINUS_EQ(); 

				}
				break;
			case 86 :
				// PHPAST.g:1:752: MUL_EQ
				{
				mMUL_EQ(); 

				}
				break;
			case 87 :
				// PHPAST.g:1:759: DIV_EQ
				{
				mDIV_EQ(); 

				}
				break;
			case 88 :
				// PHPAST.g:1:766: DOT_EQ
				{
				mDOT_EQ(); 

				}
				break;
			case 89 :
				// PHPAST.g:1:773: PERCENT_EQ
				{
				mPERCENT_EQ(); 

				}
				break;
			case 90 :
				// PHPAST.g:1:784: BIT_AND_EQ
				{
				mBIT_AND_EQ(); 

				}
				break;
			case 91 :
				// PHPAST.g:1:795: BIT_OR_EQ
				{
				mBIT_OR_EQ(); 

				}
				break;
			case 92 :
				// PHPAST.g:1:805: POWER_EQ
				{
				mPOWER_EQ(); 

				}
				break;
			case 93 :
				// PHPAST.g:1:814: LMOVE_EQ
				{
				mLMOVE_EQ(); 

				}
				break;
			case 94 :
				// PHPAST.g:1:823: RMOVE_EQ
				{
				mRMOVE_EQ(); 

				}
				break;
			case 95 :
				// PHPAST.g:1:832: ARROW_T
				{
				mARROW_T(); 

				}
				break;
			case 96 :
				// PHPAST.g:1:840: SINGLE_ARROW_T
				{
				mSINGLE_ARROW_T(); 

				}
				break;
			case 97 :
				// PHPAST.g:1:855: EQUAL_EQUAL_EQUAL_T
				{
				mEQUAL_EQUAL_EQUAL_T(); 

				}
				break;
			case 98 :
				// PHPAST.g:1:875: NOT_EQUAL_EQUAL_T
				{
				mNOT_EQUAL_EQUAL_T(); 

				}
				break;
			case 99 :
				// PHPAST.g:1:893: EQUAL_EQUAL_T
				{
				mEQUAL_EQUAL_T(); 

				}
				break;
			case 100 :
				// PHPAST.g:1:907: NOT_EQUAL_T
				{
				mNOT_EQUAL_T(); 

				}
				break;
			case 101 :
				// PHPAST.g:1:919: EXC_NOT_T
				{
				mEXC_NOT_T(); 

				}
				break;
			case 102 :
				// PHPAST.g:1:929: DOMAIN_T
				{
				mDOMAIN_T(); 

				}
				break;
			case 103 :
				// PHPAST.g:1:938: COMMA_T
				{
				mCOMMA_T(); 

				}
				break;
			case 104 :
				// PHPAST.g:1:946: EQUAL_T
				{
				mEQUAL_T(); 

				}
				break;
			case 105 :
				// PHPAST.g:1:954: COLON_T
				{
				mCOLON_T(); 

				}
				break;
			case 106 :
				// PHPAST.g:1:962: QUESTION_T
				{
				mQUESTION_T(); 

				}
				break;
			case 107 :
				// PHPAST.g:1:973: LOGICAL_OR_T
				{
				mLOGICAL_OR_T(); 

				}
				break;
			case 108 :
				// PHPAST.g:1:986: LOGICAL_AND_T
				{
				mLOGICAL_AND_T(); 

				}
				break;
			case 109 :
				// PHPAST.g:1:1000: POWER_T
				{
				mPOWER_T(); 

				}
				break;
			case 110 :
				// PHPAST.g:1:1008: BIT_OR_T
				{
				mBIT_OR_T(); 

				}
				break;
			case 111 :
				// PHPAST.g:1:1017: REF_T
				{
				mREF_T(); 

				}
				break;
			case 112 :
				// PHPAST.g:1:1023: DOT_T
				{
				mDOT_T(); 

				}
				break;
			case 113 :
				// PHPAST.g:1:1029: LSHIFT_T
				{
				mLSHIFT_T(); 

				}
				break;
			case 114 :
				// PHPAST.g:1:1038: RSHIFT_T
				{
				mRSHIFT_T(); 

				}
				break;
			case 115 :
				// PHPAST.g:1:1047: PERCENT_T
				{
				mPERCENT_T(); 

				}
				break;
			case 116 :
				// PHPAST.g:1:1057: SEMI_COLON
				{
				mSEMI_COLON(); 

				}
				break;
			case 117 :
				// PHPAST.g:1:1068: PLUS_PLUS_T
				{
				mPLUS_PLUS_T(); 

				}
				break;
			case 118 :
				// PHPAST.g:1:1080: MINUS_MINUS_T
				{
				mMINUS_MINUS_T(); 

				}
				break;
			case 119 :
				// PHPAST.g:1:1094: PLUS_T
				{
				mPLUS_T(); 

				}
				break;
			case 120 :
				// PHPAST.g:1:1101: MINUS_T
				{
				mMINUS_T(); 

				}
				break;
			case 121 :
				// PHPAST.g:1:1109: MUL_T
				{
				mMUL_T(); 

				}
				break;
			case 122 :
				// PHPAST.g:1:1115: DIV_T
				{
				mDIV_T(); 

				}
				break;
			case 123 :
				// PHPAST.g:1:1121: TILDA_T
				{
				mTILDA_T(); 

				}
				break;
			case 124 :
				// PHPAST.g:1:1129: LE_T
				{
				mLE_T(); 

				}
				break;
			case 125 :
				// PHPAST.g:1:1134: ME_T
				{
				mME_T(); 

				}
				break;
			case 126 :
				// PHPAST.g:1:1139: LT_T
				{
				mLT_T(); 

				}
				break;
			case 127 :
				// PHPAST.g:1:1144: MT_T
				{
				mMT_T(); 

				}
				break;
			case 128 :
				// PHPAST.g:1:1149: INTLITERAL
				{
				mINTLITERAL(); 

				}
				break;
			case 129 :
				// PHPAST.g:1:1160: REALLITERAL
				{
				mREALLITERAL(); 

				}
				break;
			case 130 :
				// PHPAST.g:1:1172: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 131 :
				// PHPAST.g:1:1179: FLOATLITERAL
				{
				mFLOATLITERAL(); 

				}
				break;
			case 132 :
				// PHPAST.g:1:1192: DOUBLELITERRAL
				{
				mDOUBLELITERRAL(); 

				}
				break;
			case 133 :
				// PHPAST.g:1:1207: BACKTRICKLITERAL
				{
				mBACKTRICKLITERAL(); 

				}
				break;
			case 134 :
				// PHPAST.g:1:1224: STRINGLITERAL
				{
				mSTRINGLITERAL(); 

				}
				break;
			case 135 :
				// PHPAST.g:1:1238: HERE_DOC
				{
				mHERE_DOC(); 

				}
				break;
			case 136 :
				// PHPAST.g:1:1247: HEREDOC_START
				{
				mHEREDOC_START(); 

				}
				break;
			case 137 :
				// PHPAST.g:1:1261: IDENTIFIER
				{
				mIDENTIFIER(); 

				}
				break;
			case 138 :
				// PHPAST.g:1:1272: WS
				{
				mWS(); 

				}
				break;
			case 139 :
				// PHPAST.g:1:1275: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 140 :
				// PHPAST.g:1:1283: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA19 dfa19 = new DFA19(this);
	protected DFA35 dfa35 = new DFA35(this);
	protected DFA36 dfa36 = new DFA36(this);
	static final String DFA19_eotS =
		"\1\uffff\1\7\1\uffff\1\7\4\uffff";
	static final String DFA19_eofS =
		"\10\uffff";
	static final String DFA19_minS =
		"\2\56\1\uffff\1\56\4\uffff";
	static final String DFA19_maxS =
		"\1\71\1\170\1\uffff\1\145\4\uffff";
	static final String DFA19_acceptS =
		"\2\uffff\1\2\1\uffff\1\5\1\1\1\3\1\4";
	static final String DFA19_specialS =
		"\10\uffff}>";
	static final String[] DFA19_transitionS = {
			"\1\2\1\uffff\1\1\11\3",
			"\1\5\1\uffff\12\3\13\uffff\1\6\22\uffff\1\4\14\uffff\1\6\22\uffff\1"+
			"\4",
			"",
			"\1\5\1\uffff\12\3\13\uffff\1\6\37\uffff\1\6",
			"",
			"",
			"",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "2381:1: fragment NonIntegerNumber : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '0' .. '9' )+ );";
		}
	}

	static final String DFA35_eotS =
		"\1\uffff\1\5\1\uffff\1\5\2\uffff\2\11\2\uffff";
	static final String DFA35_eofS =
		"\12\uffff";
	static final String DFA35_minS =
		"\1\43\1\0\1\57\1\0\2\uffff\2\0\2\uffff";
	static final String DFA35_maxS =
		"\1\57\1\uffff\1\57\1\uffff\2\uffff\2\uffff\2\uffff";
	static final String DFA35_acceptS =
		"\4\uffff\1\1\1\2\2\uffff\1\3\1\4";
	static final String DFA35_specialS =
		"\1\uffff\1\0\1\uffff\1\2\2\uffff\1\3\1\1\2\uffff}>";
	static final String[] DFA35_transitionS = {
			"\1\1\13\uffff\1\2",
			"\12\3\1\4\2\3\1\4\ufff2\3",
			"\1\6",
			"\12\3\1\4\2\3\1\4\ufff2\3",
			"",
			"",
			"\12\7\1\10\2\7\1\10\ufff2\7",
			"\12\7\1\10\2\7\1\10\ufff2\7",
			"",
			""
	};

	static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
	static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
	static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
	static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
	static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
	static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
	static final short[][] DFA35_transition;

	static {
		int numStates = DFA35_transitionS.length;
		DFA35_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
		}
	}

	protected class DFA35 extends DFA {

		public DFA35(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 35;
			this.eot = DFA35_eot;
			this.eof = DFA35_eof;
			this.min = DFA35_min;
			this.max = DFA35_max;
			this.accept = DFA35_accept;
			this.special = DFA35_special;
			this.transition = DFA35_transition;
		}
		@Override
		public String getDescription() {
			return "3234:1: LINE_COMMENT : ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '#' (~ ( '\\n' | '\\r' ) )* | '//' (~ ( '\\n' | '\\r' ) )* ( '\\r\\n' | '\\r' | '\\n' ) | '//' (~ ( '\\n' | '\\r' ) )* );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA35_1 = input.LA(1);
						s = -1;
						if ( ((LA35_1 >= '\u0000' && LA35_1 <= '\t')||(LA35_1 >= '\u000B' && LA35_1 <= '\f')||(LA35_1 >= '\u000E' && LA35_1 <= '\uFFFF')) ) {s = 3;}
						else if ( (LA35_1=='\n'||LA35_1=='\r') ) {s = 4;}
						else s = 5;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA35_7 = input.LA(1);
						s = -1;
						if ( (LA35_7=='\n'||LA35_7=='\r') ) {s = 8;}
						else if ( ((LA35_7 >= '\u0000' && LA35_7 <= '\t')||(LA35_7 >= '\u000B' && LA35_7 <= '\f')||(LA35_7 >= '\u000E' && LA35_7 <= '\uFFFF')) ) {s = 7;}
						else s = 9;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA35_3 = input.LA(1);
						s = -1;
						if ( (LA35_3=='\n'||LA35_3=='\r') ) {s = 4;}
						else if ( ((LA35_3 >= '\u0000' && LA35_3 <= '\t')||(LA35_3 >= '\u000B' && LA35_3 <= '\f')||(LA35_3 >= '\u000E' && LA35_3 <= '\uFFFF')) ) {s = 3;}
						else s = 5;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA35_6 = input.LA(1);
						s = -1;
						if ( ((LA35_6 >= '\u0000' && LA35_6 <= '\t')||(LA35_6 >= '\u000B' && LA35_6 <= '\f')||(LA35_6 >= '\u000E' && LA35_6 <= '\uFFFF')) ) {s = 7;}
						else if ( (LA35_6=='\n'||LA35_6=='\r') ) {s = 8;}
						else s = 9;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 35, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA36_eotS =
		"\1\uffff\13\65\1\121\1\123\7\uffff\13\65\1\uffff\1\151\1\155\1\157\1\162"+
		"\1\164\1\167\1\172\1\175\1\177\1\u0082\1\u0085\1\u0087\1\u0089\3\uffff"+
		"\2\u008c\5\uffff\3\65\1\u009e\2\65\1\u00a2\7\65\1\u00ad\7\65\1\u00ba\1"+
		"\u00bd\4\uffff\16\65\1\u00cf\4\65\31\uffff\1\u00d6\3\uffff\1\u00d8\1\uffff"+
		"\1\u00da\6\uffff\1\u008c\5\uffff\1\u008c\12\65\1\uffff\3\65\1\uffff\4"+
		"\65\1\u00f5\1\65\1\u00f8\3\65\1\uffff\12\65\1\u0107\3\uffff\1\u0108\1"+
		"\uffff\6\65\1\u0111\7\65\1\u011d\1\65\1\u011f\1\uffff\1\u0120\1\65\1\u0122"+
		"\1\65\7\uffff\1\u0126\6\uffff\13\65\1\u0137\7\65\1\uffff\2\65\1\uffff"+
		"\10\65\1\u0149\5\65\3\uffff\4\65\1\u0153\2\65\1\uffff\2\65\1\u0158\1\u015a"+
		"\7\65\1\uffff\1\65\2\uffff\1\u0163\1\uffff\1\65\7\uffff\12\65\1\u016f"+
		"\1\65\1\uffff\1\u0171\3\65\1\u0175\1\u0176\10\65\1\u017f\2\65\1\uffff"+
		"\5\65\1\u0187\1\u0188\1\65\1\u018a\1\uffff\1\u018b\1\u018c\1\u018d\1\65"+
		"\1\uffff\1\65\1\uffff\1\u0190\4\65\1\u0195\1\65\1\u0197\1\uffff\13\65"+
		"\1\uffff\1\65\1\uffff\1\u01a4\2\65\2\uffff\6\65\1\u01ad\1\65\1\uffff\1"+
		"\65\1\u01b0\1\u01b1\1\65\1\u01b3\1\u01b4\1\u01b5\2\uffff\1\65\4\uffff"+
		"\1\65\1\u01b8\1\uffff\1\65\1\u01bb\2\65\1\uffff\1\u01be\1\uffff\2\65\1"+
		"\u01c1\10\65\1\u01ca\1\uffff\1\u01cb\1\u01cc\1\u01cd\3\65\1\u01d2\1\65"+
		"\1\uffff\1\u01d4\1\65\2\uffff\1\u01d7\3\uffff\1\65\1\u01d9\1\uffff\2\65"+
		"\1\uffff\2\65\1\uffff\2\65\1\uffff\1\u01e0\1\65\1\u01e2\4\65\1\u01e7\4"+
		"\uffff\1\u01e8\3\65\1\uffff\1\65\1\uffff\2\65\1\uffff\1\u01ef\1\uffff"+
		"\2\65\1\u01f2\2\65\1\u01f5\1\uffff\1\65\1\uffff\4\65\2\uffff\1\u01fb\3"+
		"\65\1\u01ff\1\65\1\uffff\1\u0201\1\65\1\uffff\1\65\1\u0204\1\uffff\1\65"+
		"\1\u0206\3\65\1\uffff\1\u020a\1\65\1\u020c\1\uffff\1\65\1\uffff\1\u020e"+
		"\1\u020f\1\uffff\1\65\1\uffff\3\65\1\uffff\1\65\1\uffff\1\65\2\uffff\1"+
		"\u0216\3\65\1\u021a\1\u021b\1\uffff\1\u021c\2\65\3\uffff\2\65\1\u0221"+
		"\1\65\1\uffff\6\65\1\u0229\1\uffff";
	static final String DFA36_eofS =
		"\u022a\uffff";
	static final String DFA36_minS =
		"\1\11\1\137\1\142\1\157\1\145\1\151\1\146\1\142\1\162\1\145\1\164\1\141"+
		"\1\74\1\76\7\uffff\1\141\1\150\1\143\1\150\1\154\1\156\1\117\1\122\1\116"+
		"\1\151\1\141\1\uffff\1\53\1\55\1\75\1\52\1\60\1\75\1\46\5\75\1\72\3\uffff"+
		"\2\56\5\uffff\1\103\1\163\1\162\1\60\1\157\1\145\1\60\1\143\1\156\1\157"+
		"\1\162\1\156\1\143\1\160\1\60\1\152\1\151\1\142\2\141\1\151\1\162\1\160"+
		"\1\74\4\uffff\1\141\1\156\1\163\1\141\1\162\1\164\1\150\1\163\1\144\1"+
		"\151\1\157\1\145\1\163\1\122\1\60\1\104\1\163\1\167\1\155\16\uffff\1\60"+
		"\12\uffff\1\75\3\uffff\1\75\1\uffff\1\75\3\uffff\2\56\1\uffff\1\56\1\60"+
		"\1\56\1\53\2\uffff\1\56\1\114\3\111\1\105\1\101\1\141\1\110\1\164\1\141"+
		"\1\uffff\1\154\1\141\1\142\1\uffff\1\154\3\141\1\60\1\143\1\60\1\164\2"+
		"\154\1\uffff\1\145\1\156\1\164\2\154\2\165\1\151\2\164\1\60\3\uffff\1"+
		"\101\1\uffff\1\163\1\156\1\163\1\145\1\143\1\151\1\60\1\157\1\145\1\157"+
		"\1\145\1\144\1\154\1\142\1\60\1\145\1\60\1\uffff\1\60\1\164\1\60\1\145"+
		"\1\53\6\uffff\1\56\3\60\1\53\2\60\1\101\1\122\1\114\2\116\1\124\1\115"+
		"\1\154\1\120\1\162\1\171\1\60\1\153\1\154\1\141\1\165\1\154\1\164\1\141"+
		"\1\uffff\1\164\1\162\1\uffff\1\141\1\165\1\145\1\143\1\141\1\164\1\145"+
		"\1\151\1\60\1\162\1\151\1\156\1\151\1\143\3\uffff\1\163\1\145\1\151\1"+
		"\164\1\60\1\150\1\164\1\uffff\1\167\1\156\2\60\1\146\1\167\1\157\1\150"+
		"\2\145\1\141\1\uffff\1\164\2\uffff\1\60\1\uffff\1\163\2\60\1\uffff\4\60"+
		"\1\123\1\137\1\105\1\103\1\105\1\110\1\105\1\164\1\137\1\141\1\60\1\141"+
		"\1\uffff\1\60\1\145\1\162\1\154\2\60\1\143\1\151\1\146\1\156\1\144\1\155"+
		"\2\164\1\60\2\143\1\uffff\1\156\1\162\1\147\1\143\1\150\2\60\1\156\1\60"+
		"\1\uffff\3\60\1\144\1\uffff\1\146\1\uffff\1\60\1\151\1\162\1\151\1\143"+
		"\1\60\1\154\1\60\1\uffff\1\160\1\123\2\137\1\124\1\137\1\117\1\123\1\137"+
		"\1\111\1\143\1\uffff\1\156\1\uffff\1\60\1\145\1\164\2\uffff\1\150\1\157"+
		"\1\141\1\143\2\145\1\60\1\145\1\uffff\1\164\2\60\1\145\3\60\2\uffff\1"+
		"\165\4\uffff\1\163\1\60\1\uffff\1\164\1\60\2\154\1\uffff\1\60\1\uffff"+
		"\1\141\1\137\1\60\1\137\1\111\1\137\1\104\1\120\1\143\1\156\1\164\1\60"+
		"\1\uffff\3\60\1\156\1\143\1\145\1\60\1\156\1\uffff\1\60\1\145\2\uffff"+
		"\1\60\3\uffff\1\145\1\60\1\uffff\1\143\1\141\1\uffff\1\145\1\141\1\uffff"+
		"\1\143\1\137\1\uffff\1\60\1\117\1\60\1\137\1\101\1\157\1\143\1\60\4\uffff"+
		"\1\60\1\145\2\157\1\uffff\1\164\1\uffff\1\144\1\157\1\uffff\1\60\1\uffff"+
		"\1\150\1\143\1\60\1\162\1\145\1\60\1\uffff\1\116\1\uffff\1\137\1\103\1"+
		"\155\1\157\2\uffff\1\60\1\146\1\156\1\163\1\60\1\156\1\uffff\1\60\1\150"+
		"\1\uffff\1\145\1\60\1\uffff\1\137\1\60\1\105\1\160\1\155\1\uffff\1\60"+
		"\1\143\1\60\1\uffff\1\143\1\uffff\2\60\1\uffff\1\137\1\uffff\1\137\1\151"+
		"\1\160\1\uffff\1\145\1\uffff\1\145\2\uffff\1\60\1\137\2\154\2\60\1\uffff"+
		"\1\60\2\145\3\uffff\1\162\1\164\1\60\1\145\1\uffff\1\137\1\103\1\154\1"+
		"\141\2\163\1\60\1\uffff";
	static final String DFA36_maxS =
		"\1\176\1\137\1\163\1\162\1\157\1\165\1\156\1\142\1\165\1\145\1\167\1\141"+
		"\1\77\1\76\7\uffff\1\157\1\162\1\170\1\150\1\154\1\163\1\117\1\122\1\116"+
		"\1\151\1\145\1\uffff\1\75\1\76\5\75\1\174\1\75\2\76\1\75\1\72\3\uffff"+
		"\1\170\1\146\5\uffff\1\150\1\163\1\162\1\172\1\157\1\145\1\172\1\146\1"+
		"\156\1\157\1\162\1\156\1\164\1\160\1\172\1\152\1\157\1\142\1\164\1\162"+
		"\1\151\1\162\1\160\1\75\4\uffff\1\157\1\156\1\164\1\171\1\162\1\164\1"+
		"\150\1\163\1\144\1\151\1\157\1\145\1\163\1\122\1\172\1\104\1\163\1\167"+
		"\1\155\16\uffff\1\146\12\uffff\1\75\3\uffff\1\75\1\uffff\1\75\3\uffff"+
		"\2\160\1\uffff\3\146\1\71\2\uffff\1\146\1\114\1\111\1\125\1\111\1\105"+
		"\1\101\1\141\1\110\1\164\1\141\1\uffff\1\154\1\141\1\142\1\uffff\1\154"+
		"\3\141\1\172\1\143\1\172\1\164\2\154\1\uffff\1\145\1\166\1\164\2\154\2"+
		"\165\1\151\2\164\1\172\3\uffff\1\172\1\uffff\1\163\1\156\1\164\1\145\1"+
		"\143\1\151\1\172\1\157\1\145\1\157\1\145\1\167\1\154\1\142\1\172\1\145"+
		"\1\172\1\uffff\1\172\1\164\1\172\1\145\1\71\6\uffff\1\160\1\71\1\160\1"+
		"\146\2\71\1\146\1\101\1\122\1\114\2\116\1\124\1\115\1\154\1\120\1\162"+
		"\1\171\1\172\1\153\1\154\1\141\1\165\1\154\1\164\1\141\1\uffff\1\164\1"+
		"\162\1\uffff\1\141\1\165\1\145\1\143\1\141\1\164\1\145\1\151\1\172\1\162"+
		"\1\151\1\156\1\151\1\143\3\uffff\1\163\1\145\1\151\1\164\1\172\1\150\1"+
		"\164\1\uffff\1\167\1\156\2\172\1\146\1\167\1\157\1\150\2\145\1\141\1\uffff"+
		"\1\164\2\uffff\1\172\1\uffff\1\163\1\71\1\146\1\uffff\1\146\1\160\1\71"+
		"\1\146\1\123\1\137\1\105\1\103\1\105\1\110\1\105\1\164\1\137\1\141\1\172"+
		"\1\141\1\uffff\1\172\1\145\1\162\1\154\2\172\1\143\1\151\1\146\1\156\1"+
		"\144\1\155\2\164\1\172\2\143\1\uffff\1\156\1\162\1\147\1\143\1\150\2\172"+
		"\1\156\1\172\1\uffff\3\172\1\144\1\uffff\1\146\1\uffff\1\172\1\151\1\162"+
		"\1\151\1\143\1\172\1\154\1\172\1\uffff\1\160\1\123\2\137\1\124\1\137\1"+
		"\117\1\123\1\137\1\111\1\143\1\uffff\1\156\1\uffff\1\172\1\145\1\164\2"+
		"\uffff\1\150\1\157\1\141\1\143\2\145\1\172\1\145\1\uffff\1\164\2\172\1"+
		"\145\3\172\2\uffff\1\165\4\uffff\1\163\1\172\1\uffff\1\164\1\172\2\154"+
		"\1\uffff\1\172\1\uffff\1\141\1\137\1\172\1\137\1\111\1\137\1\104\1\120"+
		"\1\143\1\156\1\164\1\172\1\uffff\3\172\1\156\1\143\1\145\1\172\1\156\1"+
		"\uffff\1\172\1\145\2\uffff\1\172\3\uffff\1\145\1\172\1\uffff\1\143\1\141"+
		"\1\uffff\1\145\1\141\1\uffff\1\143\1\137\1\uffff\1\172\1\117\1\172\1\137"+
		"\1\101\1\157\1\143\1\172\4\uffff\1\172\1\145\2\157\1\uffff\1\164\1\uffff"+
		"\1\144\1\157\1\uffff\1\172\1\uffff\1\150\1\143\1\172\1\162\1\145\1\172"+
		"\1\uffff\1\116\1\uffff\1\137\1\103\1\155\1\157\2\uffff\1\172\1\146\1\156"+
		"\1\163\1\172\1\156\1\uffff\1\172\1\150\1\uffff\1\145\1\172\1\uffff\1\137"+
		"\1\172\1\105\1\160\1\155\1\uffff\1\172\1\143\1\172\1\uffff\1\143\1\uffff"+
		"\2\172\1\uffff\1\137\1\uffff\1\137\1\151\1\160\1\uffff\1\145\1\uffff\1"+
		"\145\2\uffff\1\172\1\137\2\154\2\172\1\uffff\1\172\2\145\3\uffff\1\162"+
		"\1\164\1\172\1\145\1\uffff\1\137\1\103\1\154\1\141\2\163\1\172\1\uffff";
	static final String DFA36_acceptS =
		"\16\uffff\1\33\1\34\1\35\1\36\1\37\1\40\1\41\13\uffff\1\123\15\uffff\1"+
		"\147\1\164\1\173\2\uffff\1\u0085\1\u0086\1\u0089\1\u008a\1\u008c\30\uffff"+
		"\1\174\1\176\1\32\1\152\23\uffff\1\124\1\165\1\167\1\125\1\140\1\166\1"+
		"\170\1\126\1\171\1\127\1\u008b\1\172\1\130\1\160\1\uffff\1\131\1\163\1"+
		"\132\1\154\1\157\1\133\1\153\1\156\1\134\1\155\1\uffff\1\175\1\177\1\137"+
		"\1\uffff\1\150\1\uffff\1\145\1\146\1\151\2\uffff\1\u0080\4\uffff\1\u0083"+
		"\1\u0084\13\uffff\1\63\3\uffff\1\52\12\uffff\1\73\13\uffff\1\31\1\30\1"+
		"\135\1\uffff\1\161\21\uffff\1\105\5\uffff\1\136\1\162\1\141\1\143\1\142"+
		"\1\144\32\uffff\1\44\2\uffff\1\20\16\uffff\1\27\1\u0088\1\u0087\7\uffff"+
		"\1\65\13\uffff\1\67\1\uffff\1\104\1\106\1\uffff\1\112\3\uffff\1\u0081"+
		"\20\uffff\1\13\21\uffff\1\25\11\uffff\1\75\4\uffff\1\61\1\uffff\1\71\10"+
		"\uffff\1\111\13\uffff\1\12\1\uffff\1\45\3\uffff\1\16\1\17\10\uffff\1\121"+
		"\7\uffff\1\42\1\113\1\uffff\1\110\1\77\1\43\1\66\2\uffff\1\72\4\uffff"+
		"\1\53\1\uffff\1\114\14\uffff\1\15\10\uffff\1\21\2\uffff\1\24\1\56\1\uffff"+
		"\1\26\1\60\1\54\2\uffff\1\70\2\uffff\1\100\2\uffff\1\57\2\uffff\1\2\10"+
		"\uffff\1\14\1\64\1\76\1\62\4\uffff\1\115\1\uffff\1\22\2\uffff\1\117\1"+
		"\uffff\1\46\6\uffff\1\3\1\uffff\1\5\4\uffff\1\11\1\51\6\uffff\1\55\2\uffff"+
		"\1\101\2\uffff\1\1\5\uffff\1\50\3\uffff\1\23\1\uffff\1\74\2\uffff\1\122"+
		"\1\uffff\1\6\3\uffff\1\107\1\uffff\1\47\1\uffff\1\102\1\103\6\uffff\1"+
		"\4\3\uffff\1\116\1\120\1\7\4\uffff\1\10\7\uffff\1\u0082";
	static final String DFA36_specialS =
		"\u022a\uffff}>";
	static final String[] DFA36_transitionS = {
			"\2\66\1\uffff\2\66\22\uffff\1\66\1\54\1\64\1\67\1\16\1\46\1\47\1\64\1"+
			"\21\1\22\1\43\1\41\1\56\1\42\1\45\1\44\1\61\11\62\1\55\1\57\1\14\1\53"+
			"\1\52\1\15\1\40\1\35\15\65\1\34\10\65\1\33\2\65\1\23\1\uffff\1\24\1\51"+
			"\1\1\1\63\1\2\1\3\1\25\1\4\1\27\1\5\1\31\1\65\1\6\2\65\1\36\1\65\1\37"+
			"\1\7\1\10\1\65\1\11\1\12\1\26\1\32\1\13\1\30\3\65\1\17\1\50\1\20\1\60",
			"\1\70",
			"\1\71\17\uffff\1\72\1\73",
			"\1\74\2\uffff\1\75",
			"\1\77\11\uffff\1\76",
			"\1\100\2\uffff\1\101\2\uffff\1\102\5\uffff\1\103",
			"\1\106\6\uffff\1\105\1\104",
			"\1\107",
			"\1\110\2\uffff\1\111",
			"\1\112",
			"\1\113\2\uffff\1\114",
			"\1\115",
			"\1\117\1\120\1\uffff\1\116",
			"\1\122",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\126\12\uffff\1\124\2\uffff\1\125",
			"\1\130\11\uffff\1\127",
			"\1\132\10\uffff\1\133\1\uffff\1\134\11\uffff\1\131",
			"\1\135",
			"\1\136",
			"\1\140\4\uffff\1\137",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\146\3\uffff\1\145",
			"",
			"\1\150\21\uffff\1\147",
			"\1\154\17\uffff\1\152\1\153",
			"\1\156",
			"\1\161\4\uffff\1\67\15\uffff\1\160",
			"\12\165\3\uffff\1\163",
			"\1\166",
			"\1\171\26\uffff\1\170",
			"\1\173\76\uffff\1\174",
			"\1\176",
			"\1\u0081\1\u0080",
			"\1\u0084\1\u0083",
			"\1\u0086",
			"\1\u0088",
			"",
			"",
			"",
			"\1\u008e\1\uffff\10\u008d\2\u008f\12\uffff\1\u0092\1\u0090\1\u0091\21"+
			"\uffff\1\u008b\13\uffff\1\u0092\1\u0090\1\u0091\21\uffff\1\u008a",
			"\1\u008e\1\uffff\12\u0093\12\uffff\1\u0092\1\u0090\1\u0091\35\uffff"+
			"\1\u0092\1\u0090\1\u0091",
			"",
			"",
			"",
			"",
			"",
			"\1\u0094\1\u0095\1\uffff\1\u0096\5\uffff\1\u0097\1\u0098\1\u0099\1\uffff"+
			"\1\u009b\27\uffff\1\u009a",
			"\1\u009c",
			"\1\u009d",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u009f",
			"\1\u00a0",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\24\65\1\u00a1\5\65",
			"\1\u00a3\2\uffff\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00ab\17\uffff\1\u00aa\1\u00a9",
			"\1\u00ac",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00ae",
			"\1\u00af\5\uffff\1\u00b0",
			"\1\u00b1",
			"\1\u00b2\17\uffff\1\u00b4\2\uffff\1\u00b3",
			"\1\u00b6\20\uffff\1\u00b5",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00b9",
			"\1\u00bc\1\u00bb",
			"",
			"",
			"",
			"",
			"\1\u00be\15\uffff\1\u00bf",
			"\1\u00c0",
			"\1\u00c1\1\u00c2",
			"\1\u00c3\27\uffff\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\12\165\12\uffff\1\u0092\1\u00d4\1\u0091\35\uffff\1\u0092\1\u00d4\1"+
			"\u0091",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00d5",
			"",
			"",
			"",
			"\1\u00d7",
			"",
			"\1\u00d9",
			"",
			"",
			"",
			"\1\u00dd\1\uffff\12\u00db\7\uffff\6\u00db\11\uffff\1\u00dc\20\uffff"+
			"\6\u00db\11\uffff\1\u00dc",
			"\1\u00dd\1\uffff\12\u00db\7\uffff\6\u00db\11\uffff\1\u00dc\20\uffff"+
			"\6\u00db\11\uffff\1\u00dc",
			"",
			"\1\u008e\1\uffff\10\u008d\2\u008f\12\uffff\1\u0092\1\u0090\1\u0091\35"+
			"\uffff\1\u0092\1\u0090\1\u0091",
			"\12\u00de\12\uffff\1\u0092\1\u00df\1\u0091\35\uffff\1\u0092\1\u00df"+
			"\1\u0091",
			"\1\u008e\1\uffff\12\u008f\12\uffff\1\u0092\1\u0090\1\u0091\35\uffff"+
			"\1\u0092\1\u0090\1\u0091",
			"\1\u00e0\1\uffff\1\u00e0\2\uffff\12\u00e1",
			"",
			"",
			"\1\u008e\1\uffff\12\u0093\12\uffff\1\u0092\1\u0090\1\u0091\35\uffff"+
			"\1\u0092\1\u0090\1\u0091",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4\13\uffff\1\u00e5",
			"\1\u00e6",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00eb",
			"\1\u00ec",
			"",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00f4\25\65",
			"\1\u00f6",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u00f7\25\65",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"",
			"\1\u00fc",
			"\1\u00fe\7\uffff\1\u00fd",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"\32\u0109\4\uffff\1\u0109\1\uffff\32\u0109",
			"",
			"\1\u010a",
			"\1\u010b",
			"\1\u010d\1\u010c",
			"\1\u010e",
			"\1\u010f",
			"\1\u0110",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"\1\u011a\1\uffff\1\u0118\2\uffff\1\u0116\11\uffff\1\u0117\3\uffff\1"+
			"\u0119",
			"\1\u011b",
			"\1\u011c",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u011e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0121",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0123",
			"\1\u0124\1\uffff\1\u0124\2\uffff\12\u0125",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00dd\1\uffff\12\u00db\7\uffff\6\u00db\11\uffff\1\u00dc\20\uffff"+
			"\6\u00db\11\uffff\1\u00dc",
			"\12\u0127",
			"\12\u0128\7\uffff\6\u0128\11\uffff\1\u00dc\20\uffff\6\u0128\11\uffff"+
			"\1\u00dc",
			"\12\u00de\12\uffff\1\u0092\1\u00df\1\u0091\35\uffff\1\u0092\1\u00df"+
			"\1\u0091",
			"\1\u0129\1\uffff\1\u0129\2\uffff\12\u012a",
			"\12\u00e1",
			"\12\u00e1\12\uffff\1\u0092\1\uffff\1\u0091\35\uffff\1\u0092\1\uffff"+
			"\1\u0091",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\1\u0131",
			"\1\u0132",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u0136\25\65",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"",
			"\1\u013f",
			"\1\u0140",
			"",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\1\u0145",
			"\1\u0146",
			"\1\u0147",
			"\1\u0148",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"",
			"",
			"",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0154",
			"\1\u0155",
			"",
			"\1\u0156",
			"\1\u0157",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\10\65\1\u0159\21\65",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"",
			"\1\u0162",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0164",
			"\12\u0125",
			"\12\u0125\12\uffff\1\u0092\1\uffff\1\u0091\35\uffff\1\u0092\1\uffff"+
			"\1\u0091",
			"",
			"\12\u0127\12\uffff\1\u0092\1\uffff\1\u0091\35\uffff\1\u0092\1\uffff"+
			"\1\u0091",
			"\12\u0128\7\uffff\6\u0128\11\uffff\1\u00dc\20\uffff\6\u0128\11\uffff"+
			"\1\u00dc",
			"\12\u012a",
			"\12\u012a\12\uffff\1\u0092\1\uffff\1\u0091\35\uffff\1\u0092\1\uffff"+
			"\1\u0091",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0170",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u017d",
			"\1\u017e",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0180",
			"\1\u0181",
			"",
			"\1\u0182",
			"\1\u0183",
			"\1\u0184",
			"\1\u0185",
			"\1\u0186",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0189",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u018e",
			"",
			"\1\u018f",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0191",
			"\1\u0192",
			"\1\u0193",
			"\1\u0194",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0196",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0198",
			"\1\u0199",
			"\1\u019a",
			"\1\u019b",
			"\1\u019c",
			"\1\u019d",
			"\1\u019e",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\1\u01a2",
			"",
			"\1\u01a3",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01a5",
			"\1\u01a6",
			"",
			"",
			"\1\u01a7",
			"\1\u01a8",
			"\1\u01a9",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01ae",
			"",
			"\1\u01af",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01b2",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"\1\u01b6",
			"",
			"",
			"",
			"",
			"\1\u01b7",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01b9",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\4\65\1\u01ba\25\65",
			"\1\u01bc",
			"\1\u01bd",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01bf",
			"\1\u01c0",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\12\65\7\uffff\32\65\4\uffff\1\u01d1\1\uffff\32\65",
			"\1\u01d3",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01d5",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\u01d6\1\uffff\32\65",
			"",
			"",
			"",
			"\1\u01d8",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01da",
			"\1\u01db",
			"",
			"\1\u01dc",
			"\1\u01dd",
			"",
			"\1\u01de",
			"\1\u01df",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01e1",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01e3",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01e9",
			"\1\u01ea",
			"\1\u01eb",
			"",
			"\1\u01ec",
			"",
			"\1\u01ed",
			"\1\u01ee",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01f0",
			"\1\u01f1",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01f3",
			"\1\u01f4",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u01f6",
			"",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0200",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0202",
			"",
			"\1\u0203",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0205",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u020b",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u020d",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\1\u0210",
			"",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"",
			"\1\u0214",
			"",
			"\1\u0215",
			"",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u021d",
			"\1\u021e",
			"",
			"",
			"",
			"\1\u021f",
			"\1\u0220",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			"\1\u0222",
			"",
			"\1\u0223",
			"\1\u0224",
			"\1\u0225",
			"\1\u0226",
			"\1\u0227",
			"\1\u0228",
			"\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
			""
	};

	static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
	static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
	static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
	static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
	static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
	static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
	static final short[][] DFA36_transition;

	static {
		int numStates = DFA36_transitionS.length;
		DFA36_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
		}
	}

	protected class DFA36 extends DFA {

		public DFA36(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 36;
			this.eot = DFA36_eot;
			this.eof = DFA36_eof;
			this.min = DFA36_min;
			this.max = DFA36_max;
			this.accept = DFA36_accept;
			this.special = DFA36_special;
			this.transition = DFA36_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | SOC_T | SOC_PHP_T | EOC_T | DOLLAR_T | LEFT_BRACKET | RIGHT_BRACKET | LEFT_PARETHESIS | RIGHT_PARETHESIS | LEFT_OPEN_RECT | RIGHT_OPEN_RECT | CLASS_T | TRAIT_T | FOR_T | BREAK_T | EXTENDS_T | IMPLEMENTS_T | INTERFACE_T | FUNCTION_T | DO_T | WHILE_T | SWITCH_T | CONTINUE_T | RETURN_T | GLOBAL_T | STATIC_T | ECHO_T | FOREACH_T | AS_T | DECLARE_T | TRY_T | THROW_T | USE_T | ELSEIF_T | ELSE_T | ENDIF_T | IF_T | ENDSWITCH_T | CASE_T | DEFAULT_T | CATCH_T | ENDFOR_T | ENDWHILE_T | ENDFOREACH_T | ENDDECLARE_T | XOR_T | OR_T | AND_T | INSTANCEOF_T | CONST_T | LIST_T | NEW_T | CLONE_T | UNSET_T | INCLUDE_T | INCLUDE_ONCE_T | REQUIRE_T | REQUIRE_ONCE_T | PRINT_T | NAMESPACE_T | AT_T | PLUS_EQ | MINUS_EQ | MUL_EQ | DIV_EQ | DOT_EQ | PERCENT_EQ | BIT_AND_EQ | BIT_OR_EQ | POWER_EQ | LMOVE_EQ | RMOVE_EQ | ARROW_T | SINGLE_ARROW_T | EQUAL_EQUAL_EQUAL_T | NOT_EQUAL_EQUAL_T | EQUAL_EQUAL_T | NOT_EQUAL_T | EXC_NOT_T | DOMAIN_T | COMMA_T | EQUAL_T | COLON_T | QUESTION_T | LOGICAL_OR_T | LOGICAL_AND_T | POWER_T | BIT_OR_T | REF_T | DOT_T | LSHIFT_T | RSHIFT_T | PERCENT_T | SEMI_COLON | PLUS_PLUS_T | MINUS_MINUS_T | PLUS_T | MINUS_T | MUL_T | DIV_T | TILDA_T | LE_T | ME_T | LT_T | MT_T | INTLITERAL | REALLITERAL | STATIC | FLOATLITERAL | DOUBLELITERRAL | BACKTRICKLITERAL | STRINGLITERAL | HERE_DOC | HEREDOC_START | IDENTIFIER | WS | COMMENT | LINE_COMMENT );";
		}
	}

}
