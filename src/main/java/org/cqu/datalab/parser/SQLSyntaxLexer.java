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
		TABLES=17, DATABASE=18, USE=19, DATABASES=20, DATETIME=21, DOUBLE=22, 
		FLOAT=23, INT=24, INTEGER=25, STRING=26, TIMESTAMP=27, LONG=28, BOOLEAN=29, 
		BOOL=30, ID=31, LESS=32, LARGER=33, EQUAL=34, OPEN_P=35, CLOSE_P=36, COMMA=37, 
		SEMICOLON=38, STAR=39, METAHEAD=40, LESSEQUAL=41, LARGEREQUAL=42, INT_T=43, 
		L_S_STRING=44, L_D_STRING=45, WS=46;
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
			"DATABASE", "USE", "DATABASES", "DATETIME", "DOUBLE", "FLOAT", "INT", 
			"INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", "BOOL", "ID", "LESS", 
			"LARGER", "EQUAL", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", "STAR", 
			"METAHEAD", "LESSEQUAL", "LARGEREQUAL", "INT_T", "L_S_STRING", "L_D_STRING", 
			"WS", "DIGITAL", "ID_PART", "L_STR_ESC_D", "A", "B", "C", "D", "E", "F", 
			"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
			"U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'<'", "'>'", "'='", 
			"'('", "')'", "','", "';'", "'*'", "'!'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "TABLE", "DROP", "INSERT", "VALUES", 
			"UPDATE", "SET", "INTO", "IF", "NOT", "EXISTS", "WHERE", "DELETE", "SHOW", 
			"TABLES", "DATABASE", "USE", "DATABASES", "DATETIME", "DOUBLE", "FLOAT", 
			"INT", "INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", "BOOL", "ID", 
			"LESS", "LARGER", "EQUAL", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", 
			"STAR", "METAHEAD", "LESSEQUAL", "LARGEREQUAL", "INT_T", "L_S_STRING", 
			"L_D_STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u01d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3*\3+\3+\3+\3,\6,\u0174\n,\r,\16,\u0175\3-\3-\3-\3-\3-\3-\7-\u017e"+
		"\n-\f-\16-\u0181\13-\3-\3-\3.\3.\3.\7.\u0188\n.\f.\16.\u018b\13.\3.\3"+
		".\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u0199\n\61\f\61\16\61"+
		"\u019c\13\61\3\62\3\62\3\62\3\62\5\62\u01a2\n\62\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3"+
		"J\3J\3K\3K\3L\3L\3\u0189\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2"+
		"c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097"+
		"\2\3\2 \3\2))\4\2\13\f\"\"\3\2\62;\4\2C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4"+
		"\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNn"+
		"n\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2"+
		"WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u01c3\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3\u0099\3\2\2\2\5\u00a0\3\2\2\2"+
		"\7\u00a5\3\2\2\2\t\u00ac\3\2\2\2\13\u00b2\3\2\2\2\r\u00b7\3\2\2\2\17\u00be"+
		"\3\2\2\2\21\u00c5\3\2\2\2\23\u00cc\3\2\2\2\25\u00d0\3\2\2\2\27\u00d5\3"+
		"\2\2\2\31\u00d8\3\2\2\2\33\u00dc\3\2\2\2\35\u00e3\3\2\2\2\37\u00e9\3\2"+
		"\2\2!\u00f0\3\2\2\2#\u00f5\3\2\2\2%\u00fc\3\2\2\2\'\u0105\3\2\2\2)\u0109"+
		"\3\2\2\2+\u0113\3\2\2\2-\u011c\3\2\2\2/\u0123\3\2\2\2\61\u0129\3\2\2\2"+
		"\63\u012d\3\2\2\2\65\u0135\3\2\2\2\67\u013c\3\2\2\29\u0146\3\2\2\2;\u014b"+
		"\3\2\2\2=\u0153\3\2\2\2?\u0158\3\2\2\2A\u015a\3\2\2\2C\u015c\3\2\2\2E"+
		"\u015e\3\2\2\2G\u0160\3\2\2\2I\u0162\3\2\2\2K\u0164\3\2\2\2M\u0166\3\2"+
		"\2\2O\u0168\3\2\2\2Q\u016a\3\2\2\2S\u016c\3\2\2\2U\u016f\3\2\2\2W\u0173"+
		"\3\2\2\2Y\u0177\3\2\2\2[\u0184\3\2\2\2]\u018e\3\2\2\2_\u0192\3\2\2\2a"+
		"\u0194\3\2\2\2c\u01a1\3\2\2\2e\u01a3\3\2\2\2g\u01a5\3\2\2\2i\u01a7\3\2"+
		"\2\2k\u01a9\3\2\2\2m\u01ab\3\2\2\2o\u01ad\3\2\2\2q\u01af\3\2\2\2s\u01b1"+
		"\3\2\2\2u\u01b3\3\2\2\2w\u01b5\3\2\2\2y\u01b7\3\2\2\2{\u01b9\3\2\2\2}"+
		"\u01bb\3\2\2\2\177\u01bd\3\2\2\2\u0081\u01bf\3\2\2\2\u0083\u01c1\3\2\2"+
		"\2\u0085\u01c3\3\2\2\2\u0087\u01c5\3\2\2\2\u0089\u01c7\3\2\2\2\u008b\u01c9"+
		"\3\2\2\2\u008d\u01cb\3\2\2\2\u008f\u01cd\3\2\2\2\u0091\u01cf\3\2\2\2\u0093"+
		"\u01d1\3\2\2\2\u0095\u01d3\3\2\2\2\u0097\u01d5\3\2\2\2\u0099\u009a\5\u0089"+
		"E\2\u009a\u009b\5m\67\2\u009b\u009c\5{>\2\u009c\u009d\5m\67\2\u009d\u009e"+
		"\5i\65\2\u009e\u009f\5\u008bF\2\u009f\4\3\2\2\2\u00a0\u00a1\5o8\2\u00a1"+
		"\u00a2\5\u0087D\2\u00a2\u00a3\5\u0081A\2\u00a3\u00a4\5}?\2\u00a4\6\3\2"+
		"\2\2\u00a5\u00a6\5i\65\2\u00a6\u00a7\5\u0087D\2\u00a7\u00a8\5m\67\2\u00a8"+
		"\u00a9\5e\63\2\u00a9\u00aa\5\u008bF\2\u00aa\u00ab\5m\67\2\u00ab\b\3\2"+
		"\2\2\u00ac\u00ad\5\u008bF\2\u00ad\u00ae\5e\63\2\u00ae\u00af\5g\64\2\u00af"+
		"\u00b0\5{>\2\u00b0\u00b1\5m\67\2\u00b1\n\3\2\2\2\u00b2\u00b3\5k\66\2\u00b3"+
		"\u00b4\5\u0087D\2\u00b4\u00b5\5\u0081A\2\u00b5\u00b6\5\u0083B\2\u00b6"+
		"\f\3\2\2\2\u00b7\u00b8\5u;\2\u00b8\u00b9\5\177@\2\u00b9\u00ba\5\u0089"+
		"E\2\u00ba\u00bb\5m\67\2\u00bb\u00bc\5\u0087D\2\u00bc\u00bd\5\u008bF\2"+
		"\u00bd\16\3\2\2\2\u00be\u00bf\5\u008fH\2\u00bf\u00c0\5e\63\2\u00c0\u00c1"+
		"\5{>\2\u00c1\u00c2\5\u008dG\2\u00c2\u00c3\5m\67\2\u00c3\u00c4\5\u0089"+
		"E\2\u00c4\20\3\2\2\2\u00c5\u00c6\5\u008dG\2\u00c6\u00c7\5\u0083B\2\u00c7"+
		"\u00c8\5k\66\2\u00c8\u00c9\5e\63\2\u00c9\u00ca\5\u008bF\2\u00ca\u00cb"+
		"\5m\67\2\u00cb\22\3\2\2\2\u00cc\u00cd\5\u0089E\2\u00cd\u00ce\5m\67\2\u00ce"+
		"\u00cf\5\u008bF\2\u00cf\24\3\2\2\2\u00d0\u00d1\5u;\2\u00d1\u00d2\5\177"+
		"@\2\u00d2\u00d3\5\u008bF\2\u00d3\u00d4\5\u0081A\2\u00d4\26\3\2\2\2\u00d5"+
		"\u00d6\5u;\2\u00d6\u00d7\5o8\2\u00d7\30\3\2\2\2\u00d8\u00d9\5\177@\2\u00d9"+
		"\u00da\5\u0081A\2\u00da\u00db\5\u008bF\2\u00db\32\3\2\2\2\u00dc\u00dd"+
		"\5m\67\2\u00dd\u00de\5\u0093J\2\u00de\u00df\5u;\2\u00df\u00e0\5\u0089"+
		"E\2\u00e0\u00e1\5\u008bF\2\u00e1\u00e2\5\u0089E\2\u00e2\34\3\2\2\2\u00e3"+
		"\u00e4\5\u0091I\2\u00e4\u00e5\5s:\2\u00e5\u00e6\5m\67\2\u00e6\u00e7\5"+
		"\u0087D\2\u00e7\u00e8\5m\67\2\u00e8\36\3\2\2\2\u00e9\u00ea\5k\66\2\u00ea"+
		"\u00eb\5m\67\2\u00eb\u00ec\5{>\2\u00ec\u00ed\5m\67\2\u00ed\u00ee\5\u008b"+
		"F\2\u00ee\u00ef\5m\67\2\u00ef \3\2\2\2\u00f0\u00f1\5\u0089E\2\u00f1\u00f2"+
		"\5s:\2\u00f2\u00f3\5\u0081A\2\u00f3\u00f4\5\u0091I\2\u00f4\"\3\2\2\2\u00f5"+
		"\u00f6\5\u008bF\2\u00f6\u00f7\5e\63\2\u00f7\u00f8\5g\64\2\u00f8\u00f9"+
		"\5{>\2\u00f9\u00fa\5m\67\2\u00fa\u00fb\5\u0089E\2\u00fb$\3\2\2\2\u00fc"+
		"\u00fd\5k\66\2\u00fd\u00fe\5e\63\2\u00fe\u00ff\5\u008bF\2\u00ff\u0100"+
		"\5e\63\2\u0100\u0101\5g\64\2\u0101\u0102\5e\63\2\u0102\u0103\5\u0089E"+
		"\2\u0103\u0104\5m\67\2\u0104&\3\2\2\2\u0105\u0106\5\u008dG\2\u0106\u0107"+
		"\5\u0089E\2\u0107\u0108\5m\67\2\u0108(\3\2\2\2\u0109\u010a\5k\66\2\u010a"+
		"\u010b\5e\63\2\u010b\u010c\5\u008bF\2\u010c\u010d\5e\63\2\u010d\u010e"+
		"\5g\64\2\u010e\u010f\5e\63\2\u010f\u0110\5\u0089E\2\u0110\u0111\5m\67"+
		"\2\u0111\u0112\5\u0089E\2\u0112*\3\2\2\2\u0113\u0114\5k\66\2\u0114\u0115"+
		"\5e\63\2\u0115\u0116\5\u008bF\2\u0116\u0117\5m\67\2\u0117\u0118\5\u008b"+
		"F\2\u0118\u0119\5u;\2\u0119\u011a\5}?\2\u011a\u011b\5m\67\2\u011b,\3\2"+
		"\2\2\u011c\u011d\5k\66\2\u011d\u011e\5\u0081A\2\u011e\u011f\5\u008dG\2"+
		"\u011f\u0120\5g\64\2\u0120\u0121\5{>\2\u0121\u0122\5m\67\2\u0122.\3\2"+
		"\2\2\u0123\u0124\5o8\2\u0124\u0125\5{>\2\u0125\u0126\5\u0081A\2\u0126"+
		"\u0127\5e\63\2\u0127\u0128\5\u008bF\2\u0128\60\3\2\2\2\u0129\u012a\5u"+
		";\2\u012a\u012b\5\177@\2\u012b\u012c\5\u008bF\2\u012c\62\3\2\2\2\u012d"+
		"\u012e\5u;\2\u012e\u012f\5\177@\2\u012f\u0130\5\u008bF\2\u0130\u0131\5"+
		"m\67\2\u0131\u0132\5q9\2\u0132\u0133\5m\67\2\u0133\u0134\5\u0087D\2\u0134"+
		"\64\3\2\2\2\u0135\u0136\5\u0089E\2\u0136\u0137\5\u008bF\2\u0137\u0138"+
		"\5\u0087D\2\u0138\u0139\5u;\2\u0139\u013a\5\177@\2\u013a\u013b\5q9\2\u013b"+
		"\66\3\2\2\2\u013c\u013d\5\u008bF\2\u013d\u013e\5u;\2\u013e\u013f\5}?\2"+
		"\u013f\u0140\5m\67\2\u0140\u0141\5\u0089E\2\u0141\u0142\5\u008bF\2\u0142"+
		"\u0143\5e\63\2\u0143\u0144\5}?\2\u0144\u0145\5\u0083B\2\u01458\3\2\2\2"+
		"\u0146\u0147\5{>\2\u0147\u0148\5\u0081A\2\u0148\u0149\5\177@\2\u0149\u014a"+
		"\5q9\2\u014a:\3\2\2\2\u014b\u014c\5g\64\2\u014c\u014d\5\u0081A\2\u014d"+
		"\u014e\5\u0081A\2\u014e\u014f\5{>\2\u014f\u0150\5m\67\2\u0150\u0151\5"+
		"e\63\2\u0151\u0152\5\177@\2\u0152<\3\2\2\2\u0153\u0154\5g\64\2\u0154\u0155"+
		"\5\u0081A\2\u0155\u0156\5\u0081A\2\u0156\u0157\5{>\2\u0157>\3\2\2\2\u0158"+
		"\u0159\5a\61\2\u0159@\3\2\2\2\u015a\u015b\7>\2\2\u015bB\3\2\2\2\u015c"+
		"\u015d\7@\2\2\u015dD\3\2\2\2\u015e\u015f\7?\2\2\u015fF\3\2\2\2\u0160\u0161"+
		"\7*\2\2\u0161H\3\2\2\2\u0162\u0163\7+\2\2\u0163J\3\2\2\2\u0164\u0165\7"+
		".\2\2\u0165L\3\2\2\2\u0166\u0167\7=\2\2\u0167N\3\2\2\2\u0168\u0169\7,"+
		"\2\2\u0169P\3\2\2\2\u016a\u016b\7#\2\2\u016bR\3\2\2\2\u016c\u016d\7>\2"+
		"\2\u016d\u016e\7?\2\2\u016eT\3\2\2\2\u016f\u0170\7@\2\2\u0170\u0171\7"+
		"?\2\2\u0171V\3\2\2\2\u0172\u0174\5_\60\2\u0173\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176X\3\2\2\2\u0177"+
		"\u017f\7)\2\2\u0178\u0179\7)\2\2\u0179\u017e\7)\2\2\u017a\u017b\7^\2\2"+
		"\u017b\u017e\7)\2\2\u017c\u017e\n\2\2\2\u017d\u0178\3\2\2\2\u017d\u017a"+
		"\3\2\2\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\7)"+
		"\2\2\u0183Z\3\2\2\2\u0184\u0189\7$\2\2\u0185\u0188\5c\62\2\u0186\u0188"+
		"\13\2\2\2\u0187\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189"+
		"\3\2\2\2\u018c\u018d\7$\2\2\u018d\\\3\2\2\2\u018e\u018f\t\3\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\b/\2\2\u0191^\3\2\2\2\u0192\u0193\t\4\2\2\u0193"+
		"`\3\2\2\2\u0194\u019a\t\5\2\2\u0195\u0199\t\5\2\2\u0196\u0199\5_\60\2"+
		"\u0197\u0199\7a\2\2\u0198\u0195\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0197"+
		"\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"b\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7$\2\2\u019e\u01a2\7$\2\2\u019f"+
		"\u01a0\7^\2\2\u01a0\u01a2\7$\2\2\u01a1\u019d\3\2\2\2\u01a1\u019f\3\2\2"+
		"\2\u01a2d\3\2\2\2\u01a3\u01a4\t\6\2\2\u01a4f\3\2\2\2\u01a5\u01a6\t\7\2"+
		"\2\u01a6h\3\2\2\2\u01a7\u01a8\t\b\2\2\u01a8j\3\2\2\2\u01a9\u01aa\t\t\2"+
		"\2\u01aal\3\2\2\2\u01ab\u01ac\t\n\2\2\u01acn\3\2\2\2\u01ad\u01ae\t\13"+
		"\2\2\u01aep\3\2\2\2\u01af\u01b0\t\f\2\2\u01b0r\3\2\2\2\u01b1\u01b2\t\r"+
		"\2\2\u01b2t\3\2\2\2\u01b3\u01b4\t\16\2\2\u01b4v\3\2\2\2\u01b5\u01b6\t"+
		"\17\2\2\u01b6x\3\2\2\2\u01b7\u01b8\t\20\2\2\u01b8z\3\2\2\2\u01b9\u01ba"+
		"\t\21\2\2\u01ba|\3\2\2\2\u01bb\u01bc\t\22\2\2\u01bc~\3\2\2\2\u01bd\u01be"+
		"\t\23\2\2\u01be\u0080\3\2\2\2\u01bf\u01c0\t\24\2\2\u01c0\u0082\3\2\2\2"+
		"\u01c1\u01c2\t\25\2\2\u01c2\u0084\3\2\2\2\u01c3\u01c4\t\26\2\2\u01c4\u0086"+
		"\3\2\2\2\u01c5\u01c6\t\27\2\2\u01c6\u0088\3\2\2\2\u01c7\u01c8\t\30\2\2"+
		"\u01c8\u008a\3\2\2\2\u01c9\u01ca\t\31\2\2\u01ca\u008c\3\2\2\2\u01cb\u01cc"+
		"\t\32\2\2\u01cc\u008e\3\2\2\2\u01cd\u01ce\t\33\2\2\u01ce\u0090\3\2\2\2"+
		"\u01cf\u01d0\t\34\2\2\u01d0\u0092\3\2\2\2\u01d1\u01d2\t\35\2\2\u01d2\u0094"+
		"\3\2\2\2\u01d3\u01d4\t\36\2\2\u01d4\u0096\3\2\2\2\u01d5\u01d6\t\37\2\2"+
		"\u01d6\u0098\3\2\2\2\13\2\u0175\u017d\u017f\u0187\u0189\u0198\u019a\u01a1"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}