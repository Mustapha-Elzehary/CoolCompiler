// Generated from C:/Users/Admin/IdeaProjects/Intellij_ANTLR1/src\Cool.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Cool extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INHERITS=1, CLASS=2, IF=3, THEN=4, ELSE=5, FI=6, WHILE=7, LOOP=8, POOL=9, 
		LET=10, IN=11, CASE=12, OF=13, ESAC=14, ISVOID=15, NOT=16, NEW=17, TRUE=18, 
		FALSE=19, INTEGER=20, LITERAL=21, TYPE=22, ID=23, ASSIGN_OPERATOR=24, 
		CASE_ARROW=25, EQUAL=26, SMALLER_THAN=27, BIGGER_THAN=28, LESS_THAN_OR_EQUAL=29, 
		PLUS=30, MINUS=31, DIVIDE=32, MULTIPLY=33, INTEGER_NEGATIVE=34, WHITESPACE=35, 
		NEWLINE=36, OPEN_COMMENT=37, CLOSE_COMMENT=38, COMMENT=39, ONE_LINE_COMMENT=40, 
		OPEN_CURLY=41, CLOSE_CURLY=42, OPENP_PRANSIS=43, CLOSE_PRANSIS=44, OPEN_SQUARE=45, 
		CLOSE_SQUARE=46, SEMICOLUN=47, COLUN=48, COMMA=49, DOT=50, AT=51, ERROR=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INHERITS", "CLASS", "IF", "THEN", "ELSE", "FI", "WHILE", "LOOP", "POOL", 
			"LET", "IN", "CASE", "OF", "ESAC", "ISVOID", "NOT", "NEW", "TRUE", "FALSE", 
			"INTEGER", "LITERAL", "TYPE", "ID", "ASSIGN_OPERATOR", "CASE_ARROW", 
			"EQUAL", "SMALLER_THAN", "BIGGER_THAN", "LESS_THAN_OR_EQUAL", "PLUS", 
			"MINUS", "DIVIDE", "MULTIPLY", "INTEGER_NEGATIVE", "WHITESPACE", "NEWLINE", 
			"OPEN_COMMENT", "CLOSE_COMMENT", "COMMENT", "ONE_LINE_COMMENT", "OPEN_CURLY", 
			"CLOSE_CURLY", "OPENP_PRANSIS", "CLOSE_PRANSIS", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"SEMICOLUN", "COLUN", "COMMA", "DOT", "AT", "ERROR", "A", "C", "D", "E", 
			"F", "H", "I", "L", "N", "O", "P", "R", "S", "T", "U", "V", "W"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'<-'", "'=>'", "'='", "'<'", "'>'", "'<='", "'+'", "'-'", "'/'", "'*'", 
			"'~'", null, null, "'(*'", "'*)'", null, null, "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "';'", "':'", "','", "'.'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INHERITS", "CLASS", "IF", "THEN", "ELSE", "FI", "WHILE", "LOOP", 
			"POOL", "LET", "IN", "CASE", "OF", "ESAC", "ISVOID", "NOT", "NEW", "TRUE", 
			"FALSE", "INTEGER", "LITERAL", "TYPE", "ID", "ASSIGN_OPERATOR", "CASE_ARROW", 
			"EQUAL", "SMALLER_THAN", "BIGGER_THAN", "LESS_THAN_OR_EQUAL", "PLUS", 
			"MINUS", "DIVIDE", "MULTIPLY", "INTEGER_NEGATIVE", "WHITESPACE", "NEWLINE", 
			"OPEN_COMMENT", "CLOSE_COMMENT", "COMMENT", "ONE_LINE_COMMENT", "OPEN_CURLY", 
			"CLOSE_CURLY", "OPENP_PRANSIS", "CLOSE_PRANSIS", "OPEN_SQUARE", "CLOSE_SQUARE", 
			"SEMICOLUN", "COLUN", "COMMA", "DOT", "AT", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public Cool(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0186\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\6\25\u00ec\n\25\r\25"+
		"\16\25\u00ed\3\26\3\26\7\26\u00f2\n\26\f\26\16\26\u00f5\13\26\3\26\3\26"+
		"\3\27\3\27\7\27\u00fb\n\27\f\27\16\27\u00fe\13\27\3\30\3\30\7\30\u0102"+
		"\n\30\f\30\16\30\u0105\13\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3$\3$\3$\3$\3%\5%\u0125\n%\3%\3%\5%\u0129\n%\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3(\7(\u0136\n(\f(\16(\u0139\13(\3(\3(\3(\3(\3)\3)\3)\3)\7)\u0143"+
		"\n)\f)\16)\u0146\13)\3)\5)\u0149\n)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3"+
		"\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@"+
		"\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3\u0137\2G\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\2q\2s\2u\2w\2y\2{"+
		"\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\3\2\32\3\2"+
		"\62;\f\2\"#%\'))--/\60\62<B\\^^``c|\3\2C\\\6\2\62;C\\aac|\4\2C\\c|\4\2"+
		"\13\13\"\"\3\2\f\f\4\2CCcc\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2JJjj\4\2"+
		"KKkk\4\2NNnn\4\2PPpp\4\2QQqq\4\2RRrr\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\2\u017e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2"+
		"\2\3\u008d\3\2\2\2\5\u0096\3\2\2\2\7\u009c\3\2\2\2\t\u009f\3\2\2\2\13"+
		"\u00a4\3\2\2\2\r\u00a9\3\2\2\2\17\u00ac\3\2\2\2\21\u00b2\3\2\2\2\23\u00b7"+
		"\3\2\2\2\25\u00bc\3\2\2\2\27\u00c0\3\2\2\2\31\u00c3\3\2\2\2\33\u00c8\3"+
		"\2\2\2\35\u00cb\3\2\2\2\37\u00d0\3\2\2\2!\u00d7\3\2\2\2#\u00db\3\2\2\2"+
		"%\u00df\3\2\2\2\'\u00e4\3\2\2\2)\u00eb\3\2\2\2+\u00ef\3\2\2\2-\u00f8\3"+
		"\2\2\2/\u00ff\3\2\2\2\61\u0106\3\2\2\2\63\u0109\3\2\2\2\65\u010c\3\2\2"+
		"\2\67\u010e\3\2\2\29\u0110\3\2\2\2;\u0112\3\2\2\2=\u0115\3\2\2\2?\u0117"+
		"\3\2\2\2A\u0119\3\2\2\2C\u011b\3\2\2\2E\u011d\3\2\2\2G\u011f\3\2\2\2I"+
		"\u0128\3\2\2\2K\u012c\3\2\2\2M\u012f\3\2\2\2O\u0132\3\2\2\2Q\u013e\3\2"+
		"\2\2S\u014c\3\2\2\2U\u014e\3\2\2\2W\u0150\3\2\2\2Y\u0152\3\2\2\2[\u0154"+
		"\3\2\2\2]\u0156\3\2\2\2_\u0158\3\2\2\2a\u015a\3\2\2\2c\u015c\3\2\2\2e"+
		"\u015e\3\2\2\2g\u0160\3\2\2\2i\u0162\3\2\2\2k\u0164\3\2\2\2m\u0166\3\2"+
		"\2\2o\u0168\3\2\2\2q\u016a\3\2\2\2s\u016c\3\2\2\2u\u016e\3\2\2\2w\u0170"+
		"\3\2\2\2y\u0172\3\2\2\2{\u0174\3\2\2\2}\u0176\3\2\2\2\177\u0178\3\2\2"+
		"\2\u0081\u017a\3\2\2\2\u0083\u017c\3\2\2\2\u0085\u017e\3\2\2\2\u0087\u0180"+
		"\3\2\2\2\u0089\u0182\3\2\2\2\u008b\u0184\3\2\2\2\u008d\u008e\5w<\2\u008e"+
		"\u008f\5{>\2\u008f\u0090\5u;\2\u0090\u0091\5q9\2\u0091\u0092\5\u0081A"+
		"\2\u0092\u0093\5w<\2\u0093\u0094\5\u0085C\2\u0094\u0095\5\u0083B\2\u0095"+
		"\4\3\2\2\2\u0096\u0097\5m\67\2\u0097\u0098\5y=\2\u0098\u0099\5k\66\2\u0099"+
		"\u009a\5\u0083B\2\u009a\u009b\5\u0083B\2\u009b\6\3\2\2\2\u009c\u009d\5"+
		"w<\2\u009d\u009e\5s:\2\u009e\b\3\2\2\2\u009f\u00a0\5\u0085C\2\u00a0\u00a1"+
		"\5u;\2\u00a1\u00a2\5q9\2\u00a2\u00a3\5{>\2\u00a3\n\3\2\2\2\u00a4\u00a5"+
		"\5q9\2\u00a5\u00a6\5y=\2\u00a6\u00a7\5\u0083B\2\u00a7\u00a8\5q9\2\u00a8"+
		"\f\3\2\2\2\u00a9\u00aa\5s:\2\u00aa\u00ab\5w<\2\u00ab\16\3\2\2\2\u00ac"+
		"\u00ad\5\u008bF\2\u00ad\u00ae\5u;\2\u00ae\u00af\5w<\2\u00af\u00b0\5y="+
		"\2\u00b0\u00b1\5q9\2\u00b1\20\3\2\2\2\u00b2\u00b3\5y=\2\u00b3\u00b4\5"+
		"}?\2\u00b4\u00b5\5}?\2\u00b5\u00b6\5\177@\2\u00b6\22\3\2\2\2\u00b7\u00b8"+
		"\5\177@\2\u00b8\u00b9\5}?\2\u00b9\u00ba\5}?\2\u00ba\u00bb\5y=\2\u00bb"+
		"\24\3\2\2\2\u00bc\u00bd\5y=\2\u00bd\u00be\5q9\2\u00be\u00bf\5\u0085C\2"+
		"\u00bf\26\3\2\2\2\u00c0\u00c1\5w<\2\u00c1\u00c2\5{>\2\u00c2\30\3\2\2\2"+
		"\u00c3\u00c4\5m\67\2\u00c4\u00c5\5k\66\2\u00c5\u00c6\5\u0083B\2\u00c6"+
		"\u00c7\5q9\2\u00c7\32\3\2\2\2\u00c8\u00c9\5}?\2\u00c9\u00ca\5s:\2\u00ca"+
		"\34\3\2\2\2\u00cb\u00cc\5q9\2\u00cc\u00cd\5\u0083B\2\u00cd\u00ce\5k\66"+
		"\2\u00ce\u00cf\5m\67\2\u00cf\36\3\2\2\2\u00d0\u00d1\5w<\2\u00d1\u00d2"+
		"\5\u0083B\2\u00d2\u00d3\5\u0089E\2\u00d3\u00d4\5}?\2\u00d4\u00d5\5w<\2"+
		"\u00d5\u00d6\5o8\2\u00d6 \3\2\2\2\u00d7\u00d8\5{>\2\u00d8\u00d9\5}?\2"+
		"\u00d9\u00da\5\u0085C\2\u00da\"\3\2\2\2\u00db\u00dc\5{>\2\u00dc\u00dd"+
		"\5q9\2\u00dd\u00de\5\u008bF\2\u00de$\3\2\2\2\u00df\u00e0\7v\2\2\u00e0"+
		"\u00e1\5\u0081A\2\u00e1\u00e2\5\u0087D\2\u00e2\u00e3\5q9\2\u00e3&\3\2"+
		"\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\5k\66\2\u00e6\u00e7\5y=\2\u00e7\u00e8"+
		"\5\u0083B\2\u00e8\u00e9\5q9\2\u00e9(\3\2\2\2\u00ea\u00ec\t\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee*\3\2\2\2\u00ef\u00f3\7$\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0"+
		"\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7$\2\2\u00f7,\3\2\2\2\u00f8"+
		"\u00fc\t\4\2\2\u00f9\u00fb\t\5\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd.\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00ff\u0103\t\6\2\2\u0100\u0102\t\5\2\2\u0101\u0100\3\2\2\2\u0102"+
		"\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\60\3\2\2"+
		"\2\u0105\u0103\3\2\2\2\u0106\u0107\7>\2\2\u0107\u0108\7/\2\2\u0108\62"+
		"\3\2\2\2\u0109\u010a\7?\2\2\u010a\u010b\7@\2\2\u010b\64\3\2\2\2\u010c"+
		"\u010d\7?\2\2\u010d\66\3\2\2\2\u010e\u010f\7>\2\2\u010f8\3\2\2\2\u0110"+
		"\u0111\7@\2\2\u0111:\3\2\2\2\u0112\u0113\7>\2\2\u0113\u0114\7?\2\2\u0114"+
		"<\3\2\2\2\u0115\u0116\7-\2\2\u0116>\3\2\2\2\u0117\u0118\7/\2\2\u0118@"+
		"\3\2\2\2\u0119\u011a\7\61\2\2\u011aB\3\2\2\2\u011b\u011c\7,\2\2\u011c"+
		"D\3\2\2\2\u011d\u011e\7\u0080\2\2\u011eF\3\2\2\2\u011f\u0120\t\7\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\b$\2\2\u0122H\3\2\2\2\u0123\u0125\7\17\2\2"+
		"\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0129"+
		"\7\f\2\2\u0127\u0129\7\17\2\2\u0128\u0124\3\2\2\2\u0128\u0127\3\2\2\2"+
		"\u0129\u012a\3\2\2\2\u012a\u012b\b%\2\2\u012bJ\3\2\2\2\u012c\u012d\7*"+
		"\2\2\u012d\u012e\7,\2\2\u012eL\3\2\2\2\u012f\u0130\7,\2\2\u0130\u0131"+
		"\7+\2\2\u0131N\3\2\2\2\u0132\u0137\5K&\2\u0133\u0136\5O(\2\u0134\u0136"+
		"\13\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013b\5M\'\2\u013b\u013c\3\2\2\2\u013c\u013d\b(\2\2\u013d"+
		"P\3\2\2\2\u013e\u013f\7/\2\2\u013f\u0140\7/\2\2\u0140\u0144\3\2\2\2\u0141"+
		"\u0143\n\b\2\2\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0144\u0145\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0147"+
		"\u0149\7\f\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2"+
		"\2\2\u014a\u014b\b)\2\2\u014bR\3\2\2\2\u014c\u014d\7}\2\2\u014dT\3\2\2"+
		"\2\u014e\u014f\7\177\2\2\u014fV\3\2\2\2\u0150\u0151\7*\2\2\u0151X\3\2"+
		"\2\2\u0152\u0153\7+\2\2\u0153Z\3\2\2\2\u0154\u0155\7]\2\2\u0155\\\3\2"+
		"\2\2\u0156\u0157\7_\2\2\u0157^\3\2\2\2\u0158\u0159\7=\2\2\u0159`\3\2\2"+
		"\2\u015a\u015b\7<\2\2\u015bb\3\2\2\2\u015c\u015d\7.\2\2\u015dd\3\2\2\2"+
		"\u015e\u015f\7\60\2\2\u015ff\3\2\2\2\u0160\u0161\7B\2\2\u0161h\3\2\2\2"+
		"\u0162\u0163\13\2\2\2\u0163j\3\2\2\2\u0164\u0165\t\t\2\2\u0165l\3\2\2"+
		"\2\u0166\u0167\t\n\2\2\u0167n\3\2\2\2\u0168\u0169\t\13\2\2\u0169p\3\2"+
		"\2\2\u016a\u016b\t\f\2\2\u016br\3\2\2\2\u016c\u016d\t\r\2\2\u016dt\3\2"+
		"\2\2\u016e\u016f\t\16\2\2\u016fv\3\2\2\2\u0170\u0171\t\17\2\2\u0171x\3"+
		"\2\2\2\u0172\u0173\t\20\2\2\u0173z\3\2\2\2\u0174\u0175\t\21\2\2\u0175"+
		"|\3\2\2\2\u0176\u0177\t\22\2\2\u0177~\3\2\2\2\u0178\u0179\t\23\2\2\u0179"+
		"\u0080\3\2\2\2\u017a\u017b\t\24\2\2\u017b\u0082\3\2\2\2\u017c\u017d\t"+
		"\25\2\2\u017d\u0084\3\2\2\2\u017e\u017f\t\26\2\2\u017f\u0086\3\2\2\2\u0180"+
		"\u0181\t\27\2\2\u0181\u0088\3\2\2\2\u0182\u0183\t\30\2\2\u0183\u008a\3"+
		"\2\2\2\u0184\u0185\t\31\2\2\u0185\u008c\3\2\2\2\16\2\u00ed\u00f1\u00f3"+
		"\u00fc\u0103\u0124\u0128\u0135\u0137\u0144\u0148\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}