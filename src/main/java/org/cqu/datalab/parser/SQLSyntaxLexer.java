// Generated from SQLSyntax.g4 by ANTLR 4.9.2
package org.cqu.datalab.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLSyntaxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, CREATE=3, TABLE=4, DROP=5, INSERT=6, VALUES=7, UPDATE=8, 
		SET=9, INTO=10, IF=11, NOT=12, EXISTS=13, WHERE=14, DELETE=15, SHOW=16, 
		TABLES=17, DATABASE=18, DATETIME=19, DOUBLE=20, FLOAT=21, INT=22, INTEGER=23, 
		STRING=24, TIMESTAMP=25, LONG=26, BOOLEAN=27, BOOL=28, ID=29, LESS=30, 
		LARGER=31, EQUAL=32, OPEN_P=33, CLOSE_P=34, COMMA=35, SEMICOLON=36, STAR=37, 
		METAHEAD=38, LESSEQUAL=39, LARGEREQUAL=40, INT_T=41, L_S_STRING=42, L_D_STRING=43, 
		WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "CREATE", "TABLE", "DROP", "INSERT", "VALUES", "UPDATE", 
			"SET", "INTO", "IF", "NOT", "EXISTS", "WHERE", "DELETE", "SHOW", "TABLES", 
			"DATABASE", "DATETIME", "DOUBLE", "FLOAT", "INT", "INTEGER", "STRING", 
			"TIMESTAMP", "LONG", "BOOLEAN", "BOOL", "ID", "LESS", "LARGER", "EQUAL", 
			"OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", "STAR", "METAHEAD", "LESSEQUAL", 
			"LARGEREQUAL", "INT_T", "L_S_STRING", "L_D_STRING", "WS", "DIGITAL", 
			"ID_PART", "L_STR_ESC_D", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
			"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
			"X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'<'", "'>'", "'='", "'('", "')'", 
			"','", "';'", "'*'", "'!'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "TABLE", "DROP", "INSERT", "VALUES", 
			"UPDATE", "SET", "INTO", "IF", "NOT", "EXISTS", "WHERE", "DELETE", "SHOW", 
			"TABLES", "DATABASE", "DATETIME", "DOUBLE", "FLOAT", "INT", "INTEGER", 
			"STRING", "TIMESTAMP", "LONG", "BOOLEAN", "BOOL", "ID", "LESS", "LARGER", 
			"EQUAL", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", "STAR", "METAHEAD", 
			"LESSEQUAL", "LARGEREQUAL", "INT_T", "L_S_STRING", "L_D_STRING", "WS"
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


	public SQLSyntaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLSyntax.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u01c5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3*\6*\u0162\n*\r*\16*\u0163\3+\3+\3+\3+\3+\3+\7+\u016c"+
		"\n+\f+\16+\u016f\13+\3+\3+\3,\3,\3,\7,\u0176\n,\f,\16,\u0179\13,\3,\3"+
		",\3-\3-\3-\3-\3.\3.\3/\3/\3/\3/\7/\u0187\n/\f/\16/\u018a\13/\3\60\3\60"+
		"\3\60\3\60\5\60\u0190\n\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3"+
		"J\3\u0177\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2_\2a\2c\2e\2g\2i\2"+
		"k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089"+
		"\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\3\2 \3\2))\4\2\13\f\"\"\3\2"+
		"\62;\4\2C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii"+
		"\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2R"+
		"Rrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\2\u01b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3\u0095\3\2\2\2"+
		"\5\u009c\3\2\2\2\7\u00a1\3\2\2\2\t\u00a8\3\2\2\2\13\u00ae\3\2\2\2\r\u00b3"+
		"\3\2\2\2\17\u00ba\3\2\2\2\21\u00c1\3\2\2\2\23\u00c8\3\2\2\2\25\u00cc\3"+
		"\2\2\2\27\u00d1\3\2\2\2\31\u00d4\3\2\2\2\33\u00d8\3\2\2\2\35\u00df\3\2"+
		"\2\2\37\u00e5\3\2\2\2!\u00ec\3\2\2\2#\u00f1\3\2\2\2%\u00f8\3\2\2\2\'\u0101"+
		"\3\2\2\2)\u010a\3\2\2\2+\u0111\3\2\2\2-\u0117\3\2\2\2/\u011b\3\2\2\2\61"+
		"\u0123\3\2\2\2\63\u012a\3\2\2\2\65\u0134\3\2\2\2\67\u0139\3\2\2\29\u0141"+
		"\3\2\2\2;\u0146\3\2\2\2=\u0148\3\2\2\2?\u014a\3\2\2\2A\u014c\3\2\2\2C"+
		"\u014e\3\2\2\2E\u0150\3\2\2\2G\u0152\3\2\2\2I\u0154\3\2\2\2K\u0156\3\2"+
		"\2\2M\u0158\3\2\2\2O\u015a\3\2\2\2Q\u015d\3\2\2\2S\u0161\3\2\2\2U\u0165"+
		"\3\2\2\2W\u0172\3\2\2\2Y\u017c\3\2\2\2[\u0180\3\2\2\2]\u0182\3\2\2\2_"+
		"\u018f\3\2\2\2a\u0191\3\2\2\2c\u0193\3\2\2\2e\u0195\3\2\2\2g\u0197\3\2"+
		"\2\2i\u0199\3\2\2\2k\u019b\3\2\2\2m\u019d\3\2\2\2o\u019f\3\2\2\2q\u01a1"+
		"\3\2\2\2s\u01a3\3\2\2\2u\u01a5\3\2\2\2w\u01a7\3\2\2\2y\u01a9\3\2\2\2{"+
		"\u01ab\3\2\2\2}\u01ad\3\2\2\2\177\u01af\3\2\2\2\u0081\u01b1\3\2\2\2\u0083"+
		"\u01b3\3\2\2\2\u0085\u01b5\3\2\2\2\u0087\u01b7\3\2\2\2\u0089\u01b9\3\2"+
		"\2\2\u008b\u01bb\3\2\2\2\u008d\u01bd\3\2\2\2\u008f\u01bf\3\2\2\2\u0091"+
		"\u01c1\3\2\2\2\u0093\u01c3\3\2\2\2\u0095\u0096\5\u0085C\2\u0096\u0097"+
		"\5i\65\2\u0097\u0098\5w<\2\u0098\u0099\5i\65\2\u0099\u009a\5e\63\2\u009a"+
		"\u009b\5\u0087D\2\u009b\4\3\2\2\2\u009c\u009d\5k\66\2\u009d\u009e\5\u0083"+
		"B\2\u009e\u009f\5}?\2\u009f\u00a0\5y=\2\u00a0\6\3\2\2\2\u00a1\u00a2\5"+
		"e\63\2\u00a2\u00a3\5\u0083B\2\u00a3\u00a4\5i\65\2\u00a4\u00a5\5a\61\2"+
		"\u00a5\u00a6\5\u0087D\2\u00a6\u00a7\5i\65\2\u00a7\b\3\2\2\2\u00a8\u00a9"+
		"\5\u0087D\2\u00a9\u00aa\5a\61\2\u00aa\u00ab\5c\62\2\u00ab\u00ac\5w<\2"+
		"\u00ac\u00ad\5i\65\2\u00ad\n\3\2\2\2\u00ae\u00af\5g\64\2\u00af\u00b0\5"+
		"\u0083B\2\u00b0\u00b1\5}?\2\u00b1\u00b2\5\177@\2\u00b2\f\3\2\2\2\u00b3"+
		"\u00b4\5q9\2\u00b4\u00b5\5{>\2\u00b5\u00b6\5\u0085C\2\u00b6\u00b7\5i\65"+
		"\2\u00b7\u00b8\5\u0083B\2\u00b8\u00b9\5\u0087D\2\u00b9\16\3\2\2\2\u00ba"+
		"\u00bb\5\u008bF\2\u00bb\u00bc\5a\61\2\u00bc\u00bd\5w<\2\u00bd\u00be\5"+
		"\u0089E\2\u00be\u00bf\5i\65\2\u00bf\u00c0\5\u0085C\2\u00c0\20\3\2\2\2"+
		"\u00c1\u00c2\5\u0089E\2\u00c2\u00c3\5\177@\2\u00c3\u00c4\5g\64\2\u00c4"+
		"\u00c5\5a\61\2\u00c5\u00c6\5\u0087D\2\u00c6\u00c7\5i\65\2\u00c7\22\3\2"+
		"\2\2\u00c8\u00c9\5\u0085C\2\u00c9\u00ca\5i\65\2\u00ca\u00cb\5\u0087D\2"+
		"\u00cb\24\3\2\2\2\u00cc\u00cd\5q9\2\u00cd\u00ce\5{>\2\u00ce\u00cf\5\u0087"+
		"D\2\u00cf\u00d0\5}?\2\u00d0\26\3\2\2\2\u00d1\u00d2\5q9\2\u00d2\u00d3\5"+
		"k\66\2\u00d3\30\3\2\2\2\u00d4\u00d5\5{>\2\u00d5\u00d6\5}?\2\u00d6\u00d7"+
		"\5\u0087D\2\u00d7\32\3\2\2\2\u00d8\u00d9\5i\65\2\u00d9\u00da\5\u008fH"+
		"\2\u00da\u00db\5q9\2\u00db\u00dc\5\u0085C\2\u00dc\u00dd\5\u0087D\2\u00dd"+
		"\u00de\5\u0085C\2\u00de\34\3\2\2\2\u00df\u00e0\5\u008dG\2\u00e0\u00e1"+
		"\5o8\2\u00e1\u00e2\5i\65\2\u00e2\u00e3\5\u0083B\2\u00e3\u00e4\5i\65\2"+
		"\u00e4\36\3\2\2\2\u00e5\u00e6\5g\64\2\u00e6\u00e7\5i\65\2\u00e7\u00e8"+
		"\5w<\2\u00e8\u00e9\5i\65\2\u00e9\u00ea\5\u0087D\2\u00ea\u00eb\5i\65\2"+
		"\u00eb \3\2\2\2\u00ec\u00ed\5\u0085C\2\u00ed\u00ee\5o8\2\u00ee\u00ef\5"+
		"}?\2\u00ef\u00f0\5\u008dG\2\u00f0\"\3\2\2\2\u00f1\u00f2\5\u0087D\2\u00f2"+
		"\u00f3\5a\61\2\u00f3\u00f4\5c\62\2\u00f4\u00f5\5w<\2\u00f5\u00f6\5i\65"+
		"\2\u00f6\u00f7\5\u0085C\2\u00f7$\3\2\2\2\u00f8\u00f9\5g\64\2\u00f9\u00fa"+
		"\5a\61\2\u00fa\u00fb\5\u0087D\2\u00fb\u00fc\5a\61\2\u00fc\u00fd\5c\62"+
		"\2\u00fd\u00fe\5a\61\2\u00fe\u00ff\5\u0085C\2\u00ff\u0100\5i\65\2\u0100"+
		"&\3\2\2\2\u0101\u0102\5g\64\2\u0102\u0103\5a\61\2\u0103\u0104\5\u0087"+
		"D\2\u0104\u0105\5i\65\2\u0105\u0106\5\u0087D\2\u0106\u0107\5q9\2\u0107"+
		"\u0108\5y=\2\u0108\u0109\5i\65\2\u0109(\3\2\2\2\u010a\u010b\5g\64\2\u010b"+
		"\u010c\5}?\2\u010c\u010d\5\u0089E\2\u010d\u010e\5c\62\2\u010e\u010f\5"+
		"w<\2\u010f\u0110\5i\65\2\u0110*\3\2\2\2\u0111\u0112\5k\66\2\u0112\u0113"+
		"\5w<\2\u0113\u0114\5}?\2\u0114\u0115\5a\61\2\u0115\u0116\5\u0087D\2\u0116"+
		",\3\2\2\2\u0117\u0118\5q9\2\u0118\u0119\5{>\2\u0119\u011a\5\u0087D\2\u011a"+
		".\3\2\2\2\u011b\u011c\5q9\2\u011c\u011d\5{>\2\u011d\u011e\5\u0087D\2\u011e"+
		"\u011f\5i\65\2\u011f\u0120\5m\67\2\u0120\u0121\5i\65\2\u0121\u0122\5\u0083"+
		"B\2\u0122\60\3\2\2\2\u0123\u0124\5\u0085C\2\u0124\u0125\5\u0087D\2\u0125"+
		"\u0126\5\u0083B\2\u0126\u0127\5q9\2\u0127\u0128\5{>\2\u0128\u0129\5m\67"+
		"\2\u0129\62\3\2\2\2\u012a\u012b\5\u0087D\2\u012b\u012c\5q9\2\u012c\u012d"+
		"\5y=\2\u012d\u012e\5i\65\2\u012e\u012f\5\u0085C\2\u012f\u0130\5\u0087"+
		"D\2\u0130\u0131\5a\61\2\u0131\u0132\5y=\2\u0132\u0133\5\177@\2\u0133\64"+
		"\3\2\2\2\u0134\u0135\5w<\2\u0135\u0136\5}?\2\u0136\u0137\5{>\2\u0137\u0138"+
		"\5m\67\2\u0138\66\3\2\2\2\u0139\u013a\5c\62\2\u013a\u013b\5}?\2\u013b"+
		"\u013c\5}?\2\u013c\u013d\5w<\2\u013d\u013e\5i\65\2\u013e\u013f\5a\61\2"+
		"\u013f\u0140\5{>\2\u01408\3\2\2\2\u0141\u0142\5c\62\2\u0142\u0143\5}?"+
		"\2\u0143\u0144\5}?\2\u0144\u0145\5w<\2\u0145:\3\2\2\2\u0146\u0147\5]/"+
		"\2\u0147<\3\2\2\2\u0148\u0149\7>\2\2\u0149>\3\2\2\2\u014a\u014b\7@\2\2"+
		"\u014b@\3\2\2\2\u014c\u014d\7?\2\2\u014dB\3\2\2\2\u014e\u014f\7*\2\2\u014f"+
		"D\3\2\2\2\u0150\u0151\7+\2\2\u0151F\3\2\2\2\u0152\u0153\7.\2\2\u0153H"+
		"\3\2\2\2\u0154\u0155\7=\2\2\u0155J\3\2\2\2\u0156\u0157\7,\2\2\u0157L\3"+
		"\2\2\2\u0158\u0159\7#\2\2\u0159N\3\2\2\2\u015a\u015b\7>\2\2\u015b\u015c"+
		"\7?\2\2\u015cP\3\2\2\2\u015d\u015e\7@\2\2\u015e\u015f\7?\2\2\u015fR\3"+
		"\2\2\2\u0160\u0162\5[.\2\u0161\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164T\3\2\2\2\u0165\u016d\7)\2\2\u0166"+
		"\u0167\7)\2\2\u0167\u016c\7)\2\2\u0168\u0169\7^\2\2\u0169\u016c\7)\2\2"+
		"\u016a\u016c\n\2\2\2\u016b\u0166\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u016a"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7)\2\2\u0171V\3\2\2\2\u0172"+
		"\u0177\7$\2\2\u0173\u0176\5_\60\2\u0174\u0176\13\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0178\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\7$"+
		"\2\2\u017bX\3\2\2\2\u017c\u017d\t\3\2\2\u017d\u017e\3\2\2\2\u017e\u017f"+
		"\b-\2\2\u017fZ\3\2\2\2\u0180\u0181\t\4\2\2\u0181\\\3\2\2\2\u0182\u0188"+
		"\t\5\2\2\u0183\u0187\t\5\2\2\u0184\u0187\5[.\2\u0185\u0187\7a\2\2\u0186"+
		"\u0183\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189^\3\2\2\2\u018a\u0188"+
		"\3\2\2\2\u018b\u018c\7$\2\2\u018c\u0190\7$\2\2\u018d\u018e\7^\2\2\u018e"+
		"\u0190\7$\2\2\u018f\u018b\3\2\2\2\u018f\u018d\3\2\2\2\u0190`\3\2\2\2\u0191"+
		"\u0192\t\6\2\2\u0192b\3\2\2\2\u0193\u0194\t\7\2\2\u0194d\3\2\2\2\u0195"+
		"\u0196\t\b\2\2\u0196f\3\2\2\2\u0197\u0198\t\t\2\2\u0198h\3\2\2\2\u0199"+
		"\u019a\t\n\2\2\u019aj\3\2\2\2\u019b\u019c\t\13\2\2\u019cl\3\2\2\2\u019d"+
		"\u019e\t\f\2\2\u019en\3\2\2\2\u019f\u01a0\t\r\2\2\u01a0p\3\2\2\2\u01a1"+
		"\u01a2\t\16\2\2\u01a2r\3\2\2\2\u01a3\u01a4\t\17\2\2\u01a4t\3\2\2\2\u01a5"+
		"\u01a6\t\20\2\2\u01a6v\3\2\2\2\u01a7\u01a8\t\21\2\2\u01a8x\3\2\2\2\u01a9"+
		"\u01aa\t\22\2\2\u01aaz\3\2\2\2\u01ab\u01ac\t\23\2\2\u01ac|\3\2\2\2\u01ad"+
		"\u01ae\t\24\2\2\u01ae~\3\2\2\2\u01af\u01b0\t\25\2\2\u01b0\u0080\3\2\2"+
		"\2\u01b1\u01b2\t\26\2\2\u01b2\u0082\3\2\2\2\u01b3\u01b4\t\27\2\2\u01b4"+
		"\u0084\3\2\2\2\u01b5\u01b6\t\30\2\2\u01b6\u0086\3\2\2\2\u01b7\u01b8\t"+
		"\31\2\2\u01b8\u0088\3\2\2\2\u01b9\u01ba\t\32\2\2\u01ba\u008a\3\2\2\2\u01bb"+
		"\u01bc\t\33\2\2\u01bc\u008c\3\2\2\2\u01bd\u01be\t\34\2\2\u01be\u008e\3"+
		"\2\2\2\u01bf\u01c0\t\35\2\2\u01c0\u0090\3\2\2\2\u01c1\u01c2\t\36\2\2\u01c2"+
		"\u0092\3\2\2\2\u01c3\u01c4\t\37\2\2\u01c4\u0094\3\2\2\2\13\2\u0163\u016b"+
		"\u016d\u0175\u0177\u0186\u0188\u018f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}