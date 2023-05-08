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
		SELECT=1, FROM=2, CREATE=3, TABLE=4, IF=5, NOT=6, EXISTS=7, DATETIME=8, 
		DOUBLE=9, FLOAT=10, INT=11, INTEGER=12, STRING=13, TIMESTAMP=14, LONG=15, 
		BOOLEAN=16, BOOL=17, ID=18, OPEN_P=19, CLOSE_P=20, COMMA=21, SEMICOLON=22, 
		WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "CREATE", "TABLE", "IF", "NOT", "EXISTS", "DATETIME", 
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
			null, null, null, null, null, null, null, "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "TABLE", "IF", "NOT", "EXISTS", "DATETIME", 
			"DOUBLE", "FLOAT", "INT", "INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", 
			"BOOL", "ID", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0122\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\7\32\u00ea\n\32\f\32\16\32\u00ed\13\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\2\2\65\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2"+
		"I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2\3\2\37\4\2\13\f\"\"\3"+
		"\2\62;\4\2C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2II"+
		"ii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2"+
		"RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4"+
		"\2[[{{\4\2\\\\||\2\u0108\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\3i\3\2\2\2\5p\3\2\2\2\7u\3\2\2\2\t|\3\2\2\2\13"+
		"\u0082\3\2\2\2\r\u0085\3\2\2\2\17\u0089\3\2\2\2\21\u0090\3\2\2\2\23\u0099"+
		"\3\2\2\2\25\u00a0\3\2\2\2\27\u00a6\3\2\2\2\31\u00aa\3\2\2\2\33\u00b2\3"+
		"\2\2\2\35\u00b9\3\2\2\2\37\u00c3\3\2\2\2!\u00c8\3\2\2\2#\u00d0\3\2\2\2"+
		"%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00d9\3\2\2\2+\u00db\3\2\2\2-\u00dd\3"+
		"\2\2\2/\u00df\3\2\2\2\61\u00e3\3\2\2\2\63\u00e5\3\2\2\2\65\u00ee\3\2\2"+
		"\2\67\u00f0\3\2\2\29\u00f2\3\2\2\2;\u00f4\3\2\2\2=\u00f6\3\2\2\2?\u00f8"+
		"\3\2\2\2A\u00fa\3\2\2\2C\u00fc\3\2\2\2E\u00fe\3\2\2\2G\u0100\3\2\2\2I"+
		"\u0102\3\2\2\2K\u0104\3\2\2\2M\u0106\3\2\2\2O\u0108\3\2\2\2Q\u010a\3\2"+
		"\2\2S\u010c\3\2\2\2U\u010e\3\2\2\2W\u0110\3\2\2\2Y\u0112\3\2\2\2[\u0114"+
		"\3\2\2\2]\u0116\3\2\2\2_\u0118\3\2\2\2a\u011a\3\2\2\2c\u011c\3\2\2\2e"+
		"\u011e\3\2\2\2g\u0120\3\2\2\2ij\5Y-\2jk\5=\37\2kl\5K&\2lm\5=\37\2mn\5"+
		"9\35\2no\5[.\2o\4\3\2\2\2pq\5? \2qr\5W,\2rs\5Q)\2st\5M\'\2t\6\3\2\2\2"+
		"uv\59\35\2vw\5W,\2wx\5=\37\2xy\5\65\33\2yz\5[.\2z{\5=\37\2{\b\3\2\2\2"+
		"|}\5[.\2}~\5\65\33\2~\177\5\67\34\2\177\u0080\5K&\2\u0080\u0081\5=\37"+
		"\2\u0081\n\3\2\2\2\u0082\u0083\5E#\2\u0083\u0084\5? \2\u0084\f\3\2\2\2"+
		"\u0085\u0086\5O(\2\u0086\u0087\5Q)\2\u0087\u0088\5[.\2\u0088\16\3\2\2"+
		"\2\u0089\u008a\5=\37\2\u008a\u008b\5c\62\2\u008b\u008c\5E#\2\u008c\u008d"+
		"\5Y-\2\u008d\u008e\5[.\2\u008e\u008f\5Y-\2\u008f\20\3\2\2\2\u0090\u0091"+
		"\5;\36\2\u0091\u0092\5\65\33\2\u0092\u0093\5[.\2\u0093\u0094\5=\37\2\u0094"+
		"\u0095\5[.\2\u0095\u0096\5E#\2\u0096\u0097\5M\'\2\u0097\u0098\5=\37\2"+
		"\u0098\22\3\2\2\2\u0099\u009a\5;\36\2\u009a\u009b\5Q)\2\u009b\u009c\5"+
		"]/\2\u009c\u009d\5\67\34\2\u009d\u009e\5K&\2\u009e\u009f\5=\37\2\u009f"+
		"\24\3\2\2\2\u00a0\u00a1\5? \2\u00a1\u00a2\5K&\2\u00a2\u00a3\5Q)\2\u00a3"+
		"\u00a4\5\65\33\2\u00a4\u00a5\5[.\2\u00a5\26\3\2\2\2\u00a6\u00a7\5E#\2"+
		"\u00a7\u00a8\5O(\2\u00a8\u00a9\5[.\2\u00a9\30\3\2\2\2\u00aa\u00ab\5E#"+
		"\2\u00ab\u00ac\5O(\2\u00ac\u00ad\5[.\2\u00ad\u00ae\5=\37\2\u00ae\u00af"+
		"\5A!\2\u00af\u00b0\5=\37\2\u00b0\u00b1\5W,\2\u00b1\32\3\2\2\2\u00b2\u00b3"+
		"\5Y-\2\u00b3\u00b4\5[.\2\u00b4\u00b5\5W,\2\u00b5\u00b6\5E#\2\u00b6\u00b7"+
		"\5O(\2\u00b7\u00b8\5A!\2\u00b8\34\3\2\2\2\u00b9\u00ba\5[.\2\u00ba\u00bb"+
		"\5E#\2\u00bb\u00bc\5M\'\2\u00bc\u00bd\5=\37\2\u00bd\u00be\5Y-\2\u00be"+
		"\u00bf\5[.\2\u00bf\u00c0\5\65\33\2\u00c0\u00c1\5M\'\2\u00c1\u00c2\5S*"+
		"\2\u00c2\36\3\2\2\2\u00c3\u00c4\5K&\2\u00c4\u00c5\5Q)\2\u00c5\u00c6\5"+
		"O(\2\u00c6\u00c7\5A!\2\u00c7 \3\2\2\2\u00c8\u00c9\5\67\34\2\u00c9\u00ca"+
		"\5Q)\2\u00ca\u00cb\5Q)\2\u00cb\u00cc\5K&\2\u00cc\u00cd\5=\37\2\u00cd\u00ce"+
		"\5\65\33\2\u00ce\u00cf\5O(\2\u00cf\"\3\2\2\2\u00d0\u00d1\5\67\34\2\u00d1"+
		"\u00d2\5Q)\2\u00d2\u00d3\5Q)\2\u00d3\u00d4\5K&\2\u00d4$\3\2\2\2\u00d5"+
		"\u00d6\5\63\32\2\u00d6&\3\2\2\2\u00d7\u00d8\7*\2\2\u00d8(\3\2\2\2\u00d9"+
		"\u00da\7+\2\2\u00da*\3\2\2\2\u00db\u00dc\7.\2\2\u00dc,\3\2\2\2\u00dd\u00de"+
		"\7=\2\2\u00de.\3\2\2\2\u00df\u00e0\t\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2"+
		"\b\30\2\2\u00e2\60\3\2\2\2\u00e3\u00e4\t\3\2\2\u00e4\62\3\2\2\2\u00e5"+
		"\u00eb\t\4\2\2\u00e6\u00ea\t\4\2\2\u00e7\u00ea\5\61\31\2\u00e8\u00ea\7"+
		"a\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\64\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\t\5\2\2\u00ef\66\3\2\2\2\u00f0\u00f1"+
		"\t\6\2\2\u00f18\3\2\2\2\u00f2\u00f3\t\7\2\2\u00f3:\3\2\2\2\u00f4\u00f5"+
		"\t\b\2\2\u00f5<\3\2\2\2\u00f6\u00f7\t\t\2\2\u00f7>\3\2\2\2\u00f8\u00f9"+
		"\t\n\2\2\u00f9@\3\2\2\2\u00fa\u00fb\t\13\2\2\u00fbB\3\2\2\2\u00fc\u00fd"+
		"\t\f\2\2\u00fdD\3\2\2\2\u00fe\u00ff\t\r\2\2\u00ffF\3\2\2\2\u0100\u0101"+
		"\t\16\2\2\u0101H\3\2\2\2\u0102\u0103\t\17\2\2\u0103J\3\2\2\2\u0104\u0105"+
		"\t\20\2\2\u0105L\3\2\2\2\u0106\u0107\t\21\2\2\u0107N\3\2\2\2\u0108\u0109"+
		"\t\22\2\2\u0109P\3\2\2\2\u010a\u010b\t\23\2\2\u010bR\3\2\2\2\u010c\u010d"+
		"\t\24\2\2\u010dT\3\2\2\2\u010e\u010f\t\25\2\2\u010fV\3\2\2\2\u0110\u0111"+
		"\t\26\2\2\u0111X\3\2\2\2\u0112\u0113\t\27\2\2\u0113Z\3\2\2\2\u0114\u0115"+
		"\t\30\2\2\u0115\\\3\2\2\2\u0116\u0117\t\31\2\2\u0117^\3\2\2\2\u0118\u0119"+
		"\t\32\2\2\u0119`\3\2\2\2\u011a\u011b\t\33\2\2\u011bb\3\2\2\2\u011c\u011d"+
		"\t\34\2\2\u011dd\3\2\2\2\u011e\u011f\t\35\2\2\u011ff\3\2\2\2\u0120\u0121"+
		"\t\36\2\2\u0121h\3\2\2\2\5\2\u00e9\u00eb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}