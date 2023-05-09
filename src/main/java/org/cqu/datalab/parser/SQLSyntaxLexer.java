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
		SELECT=1, FROM=2, CREATE=3, TABLE=4, DROP=5, IF=6, NOT=7, EXISTS=8, DATETIME=9, 
		DOUBLE=10, FLOAT=11, INT=12, INTEGER=13, STRING=14, TIMESTAMP=15, LONG=16, 
		BOOLEAN=17, BOOL=18, ID=19, OPEN_P=20, CLOSE_P=21, COMMA=22, SEMICOLON=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "CREATE", "TABLE", "DROP", "IF", "NOT", "EXISTS", "DATETIME", 
			"DOUBLE", "FLOAT", "INT", "INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", 
			"BOOL", "ID", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", "WS", "DIGITAL", 
			"ID_PART", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
			"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'('", "')'", "','", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "TABLE", "DROP", "IF", "NOT", "EXISTS", 
			"DATETIME", "DOUBLE", "FLOAT", "INT", "INTEGER", "STRING", "TIMESTAMP", 
			"LONG", "BOOLEAN", "BOOL", "ID", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0129\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u00f1"+
		"\n\33\f\33\16\33\u00f4\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\2\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2"+
		"]\2_\2a\2c\2e\2g\2i\2\3\2\37\4\2\13\f\"\"\3\2\62;\4\2C\\c|\4\2CCcc\4\2"+
		"DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4"+
		"\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUu"+
		"u\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u010f\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\3k\3\2\2\2\5r\3\2\2\2\7w\3\2\2\2\t~\3\2\2\2\13\u0084\3\2"+
		"\2\2\r\u0089\3\2\2\2\17\u008c\3\2\2\2\21\u0090\3\2\2\2\23\u0097\3\2\2"+
		"\2\25\u00a0\3\2\2\2\27\u00a7\3\2\2\2\31\u00ad\3\2\2\2\33\u00b1\3\2\2\2"+
		"\35\u00b9\3\2\2\2\37\u00c0\3\2\2\2!\u00ca\3\2\2\2#\u00cf\3\2\2\2%\u00d7"+
		"\3\2\2\2\'\u00dc\3\2\2\2)\u00de\3\2\2\2+\u00e0\3\2\2\2-\u00e2\3\2\2\2"+
		"/\u00e4\3\2\2\2\61\u00e6\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67"+
		"\u00f5\3\2\2\29\u00f7\3\2\2\2;\u00f9\3\2\2\2=\u00fb\3\2\2\2?\u00fd\3\2"+
		"\2\2A\u00ff\3\2\2\2C\u0101\3\2\2\2E\u0103\3\2\2\2G\u0105\3\2\2\2I\u0107"+
		"\3\2\2\2K\u0109\3\2\2\2M\u010b\3\2\2\2O\u010d\3\2\2\2Q\u010f\3\2\2\2S"+
		"\u0111\3\2\2\2U\u0113\3\2\2\2W\u0115\3\2\2\2Y\u0117\3\2\2\2[\u0119\3\2"+
		"\2\2]\u011b\3\2\2\2_\u011d\3\2\2\2a\u011f\3\2\2\2c\u0121\3\2\2\2e\u0123"+
		"\3\2\2\2g\u0125\3\2\2\2i\u0127\3\2\2\2kl\5[.\2lm\5? \2mn\5M\'\2no\5? "+
		"\2op\5;\36\2pq\5]/\2q\4\3\2\2\2rs\5A!\2st\5Y-\2tu\5S*\2uv\5O(\2v\6\3\2"+
		"\2\2wx\5;\36\2xy\5Y-\2yz\5? \2z{\5\67\34\2{|\5]/\2|}\5? \2}\b\3\2\2\2"+
		"~\177\5]/\2\177\u0080\5\67\34\2\u0080\u0081\59\35\2\u0081\u0082\5M\'\2"+
		"\u0082\u0083\5? \2\u0083\n\3\2\2\2\u0084\u0085\5=\37\2\u0085\u0086\5Y"+
		"-\2\u0086\u0087\5S*\2\u0087\u0088\5U+\2\u0088\f\3\2\2\2\u0089\u008a\5"+
		"G$\2\u008a\u008b\5A!\2\u008b\16\3\2\2\2\u008c\u008d\5Q)\2\u008d\u008e"+
		"\5S*\2\u008e\u008f\5]/\2\u008f\20\3\2\2\2\u0090\u0091\5? \2\u0091\u0092"+
		"\5e\63\2\u0092\u0093\5G$\2\u0093\u0094\5[.\2\u0094\u0095\5]/\2\u0095\u0096"+
		"\5[.\2\u0096\22\3\2\2\2\u0097\u0098\5=\37\2\u0098\u0099\5\67\34\2\u0099"+
		"\u009a\5]/\2\u009a\u009b\5? \2\u009b\u009c\5]/\2\u009c\u009d\5G$\2\u009d"+
		"\u009e\5O(\2\u009e\u009f\5? \2\u009f\24\3\2\2\2\u00a0\u00a1\5=\37\2\u00a1"+
		"\u00a2\5S*\2\u00a2\u00a3\5_\60\2\u00a3\u00a4\59\35\2\u00a4\u00a5\5M\'"+
		"\2\u00a5\u00a6\5? \2\u00a6\26\3\2\2\2\u00a7\u00a8\5A!\2\u00a8\u00a9\5"+
		"M\'\2\u00a9\u00aa\5S*\2\u00aa\u00ab\5\67\34\2\u00ab\u00ac\5]/\2\u00ac"+
		"\30\3\2\2\2\u00ad\u00ae\5G$\2\u00ae\u00af\5Q)\2\u00af\u00b0\5]/\2\u00b0"+
		"\32\3\2\2\2\u00b1\u00b2\5G$\2\u00b2\u00b3\5Q)\2\u00b3\u00b4\5]/\2\u00b4"+
		"\u00b5\5? \2\u00b5\u00b6\5C\"\2\u00b6\u00b7\5? \2\u00b7\u00b8\5Y-\2\u00b8"+
		"\34\3\2\2\2\u00b9\u00ba\5[.\2\u00ba\u00bb\5]/\2\u00bb\u00bc\5Y-\2\u00bc"+
		"\u00bd\5G$\2\u00bd\u00be\5Q)\2\u00be\u00bf\5C\"\2\u00bf\36\3\2\2\2\u00c0"+
		"\u00c1\5]/\2\u00c1\u00c2\5G$\2\u00c2\u00c3\5O(\2\u00c3\u00c4\5? \2\u00c4"+
		"\u00c5\5[.\2\u00c5\u00c6\5]/\2\u00c6\u00c7\5\67\34\2\u00c7\u00c8\5O(\2"+
		"\u00c8\u00c9\5U+\2\u00c9 \3\2\2\2\u00ca\u00cb\5M\'\2\u00cb\u00cc\5S*\2"+
		"\u00cc\u00cd\5Q)\2\u00cd\u00ce\5C\"\2\u00ce\"\3\2\2\2\u00cf\u00d0\59\35"+
		"\2\u00d0\u00d1\5S*\2\u00d1\u00d2\5S*\2\u00d2\u00d3\5M\'\2\u00d3\u00d4"+
		"\5? \2\u00d4\u00d5\5\67\34\2\u00d5\u00d6\5Q)\2\u00d6$\3\2\2\2\u00d7\u00d8"+
		"\59\35\2\u00d8\u00d9\5S*\2\u00d9\u00da\5S*\2\u00da\u00db\5M\'\2\u00db"+
		"&\3\2\2\2\u00dc\u00dd\5\65\33\2\u00dd(\3\2\2\2\u00de\u00df\7*\2\2\u00df"+
		"*\3\2\2\2\u00e0\u00e1\7+\2\2\u00e1,\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3."+
		"\3\2\2\2\u00e4\u00e5\7=\2\2\u00e5\60\3\2\2\2\u00e6\u00e7\t\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\b\31\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\t\3\2"+
		"\2\u00eb\64\3\2\2\2\u00ec\u00f2\t\4\2\2\u00ed\u00f1\t\4\2\2\u00ee\u00f1"+
		"\5\63\32\2\u00ef\u00f1\7a\2\2\u00f0\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2"+
		"\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\66\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\t\5\2\2\u00f6"+
		"8\3\2\2\2\u00f7\u00f8\t\6\2\2\u00f8:\3\2\2\2\u00f9\u00fa\t\7\2\2\u00fa"+
		"<\3\2\2\2\u00fb\u00fc\t\b\2\2\u00fc>\3\2\2\2\u00fd\u00fe\t\t\2\2\u00fe"+
		"@\3\2\2\2\u00ff\u0100\t\n\2\2\u0100B\3\2\2\2\u0101\u0102\t\13\2\2\u0102"+
		"D\3\2\2\2\u0103\u0104\t\f\2\2\u0104F\3\2\2\2\u0105\u0106\t\r\2\2\u0106"+
		"H\3\2\2\2\u0107\u0108\t\16\2\2\u0108J\3\2\2\2\u0109\u010a\t\17\2\2\u010a"+
		"L\3\2\2\2\u010b\u010c\t\20\2\2\u010cN\3\2\2\2\u010d\u010e\t\21\2\2\u010e"+
		"P\3\2\2\2\u010f\u0110\t\22\2\2\u0110R\3\2\2\2\u0111\u0112\t\23\2\2\u0112"+
		"T\3\2\2\2\u0113\u0114\t\24\2\2\u0114V\3\2\2\2\u0115\u0116\t\25\2\2\u0116"+
		"X\3\2\2\2\u0117\u0118\t\26\2\2\u0118Z\3\2\2\2\u0119\u011a\t\27\2\2\u011a"+
		"\\\3\2\2\2\u011b\u011c\t\30\2\2\u011c^\3\2\2\2\u011d\u011e\t\31\2\2\u011e"+
		"`\3\2\2\2\u011f\u0120\t\32\2\2\u0120b\3\2\2\2\u0121\u0122\t\33\2\2\u0122"+
		"d\3\2\2\2\u0123\u0124\t\34\2\2\u0124f\3\2\2\2\u0125\u0126\t\35\2\2\u0126"+
		"h\3\2\2\2\u0127\u0128\t\36\2\2\u0128j\3\2\2\2\5\2\u00f0\u00f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}