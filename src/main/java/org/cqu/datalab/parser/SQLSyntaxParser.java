// Generated from SQLSyntax.g4 by ANTLR 4.9.2
package org.cqu.datalab.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLSyntaxParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_dtype = 2, RULE_int_t = 3, RULE_string_t = 4, 
		RULE_exprAtom = 5, RULE_tableName = 6, RULE_databaseName = 7, RULE_columnName = 8, 
		RULE_command = 9, RULE_identifierGroup = 10, RULE_logicalOperator = 11, 
		RULE_tableColumnItem = 12, RULE_tableColumns = 13, RULE_valueCols = 14, 
		RULE_assignItem = 15, RULE_updateAssignment = 16, RULE_boolExpr = 17, 
		RULE_whereClause = 18, RULE_tableDefinition = 19, RULE_valueDefinition = 20, 
		RULE_metaCommand = 21, RULE_selectStmt = 22, RULE_createTableStmt = 23, 
		RULE_dropTableStmt = 24, RULE_insertStmt = 25, RULE_updateStmt = 26, RULE_deleteStmt = 27, 
		RULE_showTablesStmt = 28, RULE_createDbStmt = 29, RULE_useStmt = 30, RULE_showDatabaseStmt = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "dtype", "int_t", "string_t", "exprAtom", "tableName", 
			"databaseName", "columnName", "command", "identifierGroup", "logicalOperator", 
			"tableColumnItem", "tableColumns", "valueCols", "assignItem", "updateAssignment", 
			"boolExpr", "whereClause", "tableDefinition", "valueDefinition", "metaCommand", 
			"selectStmt", "createTableStmt", "dropTableStmt", "insertStmt", "updateStmt", 
			"deleteStmt", "showTablesStmt", "createDbStmt", "useStmt", "showDatabaseStmt"
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

	@Override
	public String getGrammarFileName() { return "SQLSyntax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLSyntaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SQLSyntaxParser.EOF, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLSyntaxParser.SEMICOLON, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			stat();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(65);
				match(SEMICOLON);
				}
			}

			setState(68);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public CreateTableStmtContext createTableStmt() {
			return getRuleContext(CreateTableStmtContext.class,0);
		}
		public DropTableStmtContext dropTableStmt() {
			return getRuleContext(DropTableStmtContext.class,0);
		}
		public InsertStmtContext insertStmt() {
			return getRuleContext(InsertStmtContext.class,0);
		}
		public UpdateStmtContext updateStmt() {
			return getRuleContext(UpdateStmtContext.class,0);
		}
		public DeleteStmtContext deleteStmt() {
			return getRuleContext(DeleteStmtContext.class,0);
		}
		public ShowTablesStmtContext showTablesStmt() {
			return getRuleContext(ShowTablesStmtContext.class,0);
		}
		public CreateDbStmtContext createDbStmt() {
			return getRuleContext(CreateDbStmtContext.class,0);
		}
		public MetaCommandContext metaCommand() {
			return getRuleContext(MetaCommandContext.class,0);
		}
		public UseStmtContext useStmt() {
			return getRuleContext(UseStmtContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				selectStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				createTableStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				dropTableStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				insertStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(74);
				updateStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				deleteStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				showTablesStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				createDbStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(78);
				metaCommand();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(79);
				useStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode DATETIME() { return getToken(SQLSyntaxParser.DATETIME, 0); }
		public TerminalNode DOUBLE() { return getToken(SQLSyntaxParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(SQLSyntaxParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(SQLSyntaxParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(SQLSyntaxParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(SQLSyntaxParser.STRING, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLSyntaxParser.TIMESTAMP, 0); }
		public TerminalNode LONG() { return getToken(SQLSyntaxParser.LONG, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLSyntaxParser.BOOLEAN, 0); }
		public TerminalNode BOOL() { return getToken(SQLSyntaxParser.BOOL, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DATETIME) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << INTEGER) | (1L << STRING) | (1L << TIMESTAMP) | (1L << LONG) | (1L << BOOLEAN) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_tContext extends ParserRuleContext {
		public TerminalNode INT_T() { return getToken(SQLSyntaxParser.INT_T, 0); }
		public Int_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitInt_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_tContext int_t() throws RecognitionException {
		Int_tContext _localctx = new Int_tContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_int_t);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(INT_T);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_tContext extends ParserRuleContext {
		public TerminalNode L_S_STRING() { return getToken(SQLSyntaxParser.L_S_STRING, 0); }
		public TerminalNode L_D_STRING() { return getToken(SQLSyntaxParser.L_D_STRING, 0); }
		public String_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_t; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitString_t(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_tContext string_t() throws RecognitionException {
		String_tContext _localctx = new String_tContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string_t);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==L_S_STRING || _la==L_D_STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAtomContext extends ParserRuleContext {
		public String_tContext string_t() {
			return getRuleContext(String_tContext.class,0);
		}
		public Int_tContext int_t() {
			return getRuleContext(Int_tContext.class,0);
		}
		public ExprAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAtom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitExprAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtomContext exprAtom() throws RecognitionException {
		ExprAtomContext _localctx = new ExprAtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exprAtom);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
			case L_D_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				string_t();
				}
				break;
			case INT_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				int_t();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLSyntaxParser.ID, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLSyntaxParser.ID, 0); }
		public DatabaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitDatabaseName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseNameContext databaseName() throws RecognitionException {
		DatabaseNameContext _localctx = new DatabaseNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_databaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLSyntaxParser.ID, 0); }
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLSyntaxParser.ID, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierGroupContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SQLSyntaxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLSyntaxParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLSyntaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLSyntaxParser.COMMA, i);
		}
		public TerminalNode STAR() { return getToken(SQLSyntaxParser.STAR, 0); }
		public IdentifierGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierGroup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitIdentifierGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierGroupContext identifierGroup() throws RecognitionException {
		IdentifierGroupContext _localctx = new IdentifierGroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_identifierGroup);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(ID);
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(101);
					match(COMMA);
					setState(102);
					match(ID);
					}
					}
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(SQLSyntaxParser.LESS, 0); }
		public TerminalNode LARGER() { return getToken(SQLSyntaxParser.LARGER, 0); }
		public TerminalNode LESSEQUAL() { return getToken(SQLSyntaxParser.LESSEQUAL, 0); }
		public TerminalNode LARGEREQUAL() { return getToken(SQLSyntaxParser.LARGEREQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(SQLSyntaxParser.EQUAL, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitLogicalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LARGER) | (1L << EQUAL) | (1L << LESSEQUAL) | (1L << LARGEREQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnItemContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TableColumnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumnItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitTableColumnItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnItemContext tableColumnItem() throws RecognitionException {
		TableColumnItemContext _localctx = new TableColumnItemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableColumnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			columnName();
			setState(114);
			dtype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableColumnsContext extends ParserRuleContext {
		public List<TableColumnItemContext> tableColumnItem() {
			return getRuleContexts(TableColumnItemContext.class);
		}
		public TableColumnItemContext tableColumnItem(int i) {
			return getRuleContext(TableColumnItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLSyntaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLSyntaxParser.COMMA, i);
		}
		public TableColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableColumns; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableColumnsContext tableColumns() throws RecognitionException {
		TableColumnsContext _localctx = new TableColumnsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tableColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			tableColumnItem();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(117);
				match(COMMA);
				setState(118);
				tableColumnItem();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueColsContext extends ParserRuleContext {
		public List<ExprAtomContext> exprAtom() {
			return getRuleContexts(ExprAtomContext.class);
		}
		public ExprAtomContext exprAtom(int i) {
			return getRuleContext(ExprAtomContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLSyntaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLSyntaxParser.COMMA, i);
		}
		public ValueColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueCols; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitValueCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueColsContext valueCols() throws RecognitionException {
		ValueColsContext _localctx = new ValueColsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valueCols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			exprAtom();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(125);
				match(COMMA);
				setState(126);
				exprAtom();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignItemContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLSyntaxParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(SQLSyntaxParser.EQUAL, 0); }
		public ExprAtomContext exprAtom() {
			return getRuleContext(ExprAtomContext.class,0);
		}
		public AssignItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitAssignItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignItemContext assignItem() throws RecognitionException {
		AssignItemContext _localctx = new AssignItemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ID);
			setState(133);
			match(EQUAL);
			setState(134);
			exprAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateAssignmentContext extends ParserRuleContext {
		public List<AssignItemContext> assignItem() {
			return getRuleContexts(AssignItemContext.class);
		}
		public AssignItemContext assignItem(int i) {
			return getRuleContext(AssignItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLSyntaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLSyntaxParser.COMMA, i);
		}
		public UpdateAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitUpdateAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateAssignmentContext updateAssignment() throws RecognitionException {
		UpdateAssignmentContext _localctx = new UpdateAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_updateAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			assignItem();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(137);
				match(COMMA);
				setState(138);
				assignItem();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SQLSyntaxParser.ID, 0); }
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public ExprAtomContext exprAtom() {
			return getRuleContext(ExprAtomContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		BoolExprContext _localctx = new BoolExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ID);
			setState(145);
			logicalOperator();
			setState(146);
			exprAtom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLSyntaxParser.WHERE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(WHERE);
			setState(149);
			boolExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableDefinitionContext extends ParserRuleContext {
		public TerminalNode OPEN_P() { return getToken(SQLSyntaxParser.OPEN_P, 0); }
		public TableColumnsContext tableColumns() {
			return getRuleContext(TableColumnsContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(SQLSyntaxParser.CLOSE_P, 0); }
		public TableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitTableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableDefinitionContext tableDefinition() throws RecognitionException {
		TableDefinitionContext _localctx = new TableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(OPEN_P);
			setState(152);
			tableColumns();
			setState(153);
			match(CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueDefinitionContext extends ParserRuleContext {
		public TerminalNode OPEN_P() { return getToken(SQLSyntaxParser.OPEN_P, 0); }
		public ValueColsContext valueCols() {
			return getRuleContext(ValueColsContext.class,0);
		}
		public TerminalNode CLOSE_P() { return getToken(SQLSyntaxParser.CLOSE_P, 0); }
		public ValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitValueDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueDefinitionContext valueDefinition() throws RecognitionException {
		ValueDefinitionContext _localctx = new ValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valueDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(OPEN_P);
			setState(156);
			valueCols();
			setState(157);
			match(CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetaCommandContext extends ParserRuleContext {
		public TerminalNode METAHEAD() { return getToken(SQLSyntaxParser.METAHEAD, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public MetaCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaCommand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitMetaCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaCommandContext metaCommand() throws RecognitionException {
		MetaCommandContext _localctx = new MetaCommandContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_metaCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(METAHEAD);
			setState(160);
			command();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLSyntaxParser.SELECT, 0); }
		public IdentifierGroupContext identifierGroup() {
			return getRuleContext(IdentifierGroupContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLSyntaxParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitSelectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(SELECT);
			setState(163);
			identifierGroup();
			setState(164);
			match(FROM);
			setState(165);
			tableName();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(166);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLSyntaxParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLSyntaxParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TableDefinitionContext tableDefinition() {
			return getRuleContext(TableDefinitionContext.class,0);
		}
		public CreateTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitCreateTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableStmtContext createTableStmt() throws RecognitionException {
		CreateTableStmtContext _localctx = new CreateTableStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_createTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(CREATE);
			setState(170);
			match(TABLE);
			setState(171);
			tableName();
			setState(172);
			tableDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropTableStmtContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLSyntaxParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLSyntaxParser.TABLE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public DropTableStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropTableStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitDropTableStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropTableStmtContext dropTableStmt() throws RecognitionException {
		DropTableStmtContext _localctx = new DropTableStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dropTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(DROP);
			setState(175);
			match(TABLE);
			setState(176);
			tableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertStmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQLSyntaxParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLSyntaxParser.INTO, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(SQLSyntaxParser.VALUES, 0); }
		public ValueDefinitionContext valueDefinition() {
			return getRuleContext(ValueDefinitionContext.class,0);
		}
		public InsertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitInsertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertStmtContext insertStmt() throws RecognitionException {
		InsertStmtContext _localctx = new InsertStmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(INSERT);
			setState(179);
			match(INTO);
			setState(180);
			tableName();
			setState(181);
			match(VALUES);
			setState(182);
			valueDefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateStmtContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLSyntaxParser.UPDATE, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(SQLSyntaxParser.SET, 0); }
		public UpdateAssignmentContext updateAssignment() {
			return getRuleContext(UpdateAssignmentContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitUpdateStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateStmtContext updateStmt() throws RecognitionException {
		UpdateStmtContext _localctx = new UpdateStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(UPDATE);
			setState(185);
			tableName();
			setState(186);
			match(SET);
			setState(187);
			updateAssignment();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(188);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteStmtContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQLSyntaxParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SQLSyntaxParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitDeleteStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteStmtContext deleteStmt() throws RecognitionException {
		DeleteStmtContext _localctx = new DeleteStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_deleteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(DELETE);
			setState(192);
			match(FROM);
			setState(193);
			tableName();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(194);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowTablesStmtContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SQLSyntaxParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SQLSyntaxParser.TABLES, 0); }
		public ShowTablesStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showTablesStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitShowTablesStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowTablesStmtContext showTablesStmt() throws RecognitionException {
		ShowTablesStmtContext _localctx = new ShowTablesStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_showTablesStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(SHOW);
			setState(198);
			match(TABLES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateDbStmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLSyntaxParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(SQLSyntaxParser.DATABASE, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public CreateDbStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDbStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitCreateDbStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateDbStmtContext createDbStmt() throws RecognitionException {
		CreateDbStmtContext _localctx = new CreateDbStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_createDbStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(CREATE);
			setState(201);
			match(DATABASE);
			setState(202);
			databaseName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseStmtContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(SQLSyntaxParser.USE, 0); }
		public DatabaseNameContext databaseName() {
			return getRuleContext(DatabaseNameContext.class,0);
		}
		public UseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitUseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStmtContext useStmt() throws RecognitionException {
		UseStmtContext _localctx = new UseStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_useStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(USE);
			setState(205);
			databaseName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowDatabaseStmtContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SQLSyntaxParser.SHOW, 0); }
		public TerminalNode DATABASES() { return getToken(SQLSyntaxParser.DATABASES, 0); }
		public ShowDatabaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_showDatabaseStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLSyntaxVisitor ) return ((SQLSyntaxVisitor<? extends T>)visitor).visitShowDatabaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowDatabaseStmtContext showDatabaseStmt() throws RecognitionException {
		ShowDatabaseStmtContext _localctx = new ShowDatabaseStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_showDatabaseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(SHOW);
			setState(208);
			match(DATABASES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\5\2E\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3S\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7]\n\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\7\fj\n\f\f\f\16\fm\13\f\3\f\5\fp\n\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\7\17z\n\17\f\17\16\17}\13\17\3\20\3\20"+
		"\3\20\7\20\u0082\n\20\f\20\16\20\u0085\13\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\7\22\u008e\n\22\f\22\16\22\u0091\13\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00aa\n\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u00c0\n\34\3\35\3\35\3\35\3\35\5\35\u00c6\n\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\5\3\2\27 \3\2./\4\2\"$+,\2"+
		"\u00c7\2B\3\2\2\2\4R\3\2\2\2\6T\3\2\2\2\bV\3\2\2\2\nX\3\2\2\2\f\\\3\2"+
		"\2\2\16^\3\2\2\2\20`\3\2\2\2\22b\3\2\2\2\24d\3\2\2\2\26o\3\2\2\2\30q\3"+
		"\2\2\2\32s\3\2\2\2\34v\3\2\2\2\36~\3\2\2\2 \u0086\3\2\2\2\"\u008a\3\2"+
		"\2\2$\u0092\3\2\2\2&\u0096\3\2\2\2(\u0099\3\2\2\2*\u009d\3\2\2\2,\u00a1"+
		"\3\2\2\2.\u00a4\3\2\2\2\60\u00ab\3\2\2\2\62\u00b0\3\2\2\2\64\u00b4\3\2"+
		"\2\2\66\u00ba\3\2\2\28\u00c1\3\2\2\2:\u00c7\3\2\2\2<\u00ca\3\2\2\2>\u00ce"+
		"\3\2\2\2@\u00d1\3\2\2\2BD\5\4\3\2CE\7(\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2"+
		"\2FG\7\2\2\3G\3\3\2\2\2HS\5.\30\2IS\5\60\31\2JS\5\62\32\2KS\5\64\33\2"+
		"LS\5\66\34\2MS\58\35\2NS\5:\36\2OS\5<\37\2PS\5,\27\2QS\5> \2RH\3\2\2\2"+
		"RI\3\2\2\2RJ\3\2\2\2RK\3\2\2\2RL\3\2\2\2RM\3\2\2\2RN\3\2\2\2RO\3\2\2\2"+
		"RP\3\2\2\2RQ\3\2\2\2S\5\3\2\2\2TU\t\2\2\2U\7\3\2\2\2VW\7-\2\2W\t\3\2\2"+
		"\2XY\t\3\2\2Y\13\3\2\2\2Z]\5\n\6\2[]\5\b\5\2\\Z\3\2\2\2\\[\3\2\2\2]\r"+
		"\3\2\2\2^_\7!\2\2_\17\3\2\2\2`a\7!\2\2a\21\3\2\2\2bc\7!\2\2c\23\3\2\2"+
		"\2de\7!\2\2e\25\3\2\2\2fk\7!\2\2gh\7\'\2\2hj\7!\2\2ig\3\2\2\2jm\3\2\2"+
		"\2ki\3\2\2\2kl\3\2\2\2lp\3\2\2\2mk\3\2\2\2np\7)\2\2of\3\2\2\2on\3\2\2"+
		"\2p\27\3\2\2\2qr\t\4\2\2r\31\3\2\2\2st\5\22\n\2tu\5\6\4\2u\33\3\2\2\2"+
		"v{\5\32\16\2wx\7\'\2\2xz\5\32\16\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2"+
		"\2\2|\35\3\2\2\2}{\3\2\2\2~\u0083\5\f\7\2\177\u0080\7\'\2\2\u0080\u0082"+
		"\5\f\7\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\37\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7!\2\2"+
		"\u0087\u0088\7$\2\2\u0088\u0089\5\f\7\2\u0089!\3\2\2\2\u008a\u008f\5 "+
		"\21\2\u008b\u008c\7\'\2\2\u008c\u008e\5 \21\2\u008d\u008b\3\2\2\2\u008e"+
		"\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090#\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0092\u0093\7!\2\2\u0093\u0094\5\30\r\2\u0094\u0095"+
		"\5\f\7\2\u0095%\3\2\2\2\u0096\u0097\7\20\2\2\u0097\u0098\5$\23\2\u0098"+
		"\'\3\2\2\2\u0099\u009a\7%\2\2\u009a\u009b\5\34\17\2\u009b\u009c\7&\2\2"+
		"\u009c)\3\2\2\2\u009d\u009e\7%\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7"+
		"&\2\2\u00a0+\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2\u00a3\5\24\13\2\u00a3-\3"+
		"\2\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5\26\f\2\u00a6\u00a7\7\4\2\2\u00a7"+
		"\u00a9\5\16\b\2\u00a8\u00aa\5&\24\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa/\3\2\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00ae"+
		"\5\16\b\2\u00ae\u00af\5(\25\2\u00af\61\3\2\2\2\u00b0\u00b1\7\7\2\2\u00b1"+
		"\u00b2\7\6\2\2\u00b2\u00b3\5\16\b\2\u00b3\63\3\2\2\2\u00b4\u00b5\7\b\2"+
		"\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\5\16\b\2\u00b7\u00b8\7\t\2\2\u00b8"+
		"\u00b9\5*\26\2\u00b9\65\3\2\2\2\u00ba\u00bb\7\n\2\2\u00bb\u00bc\5\16\b"+
		"\2\u00bc\u00bd\7\13\2\2\u00bd\u00bf\5\"\22\2\u00be\u00c0\5&\24\2\u00bf"+
		"\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\67\3\2\2\2\u00c1\u00c2\7\21\2"+
		"\2\u00c2\u00c3\7\4\2\2\u00c3\u00c5\5\16\b\2\u00c4\u00c6\5&\24\2\u00c5"+
		"\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c69\3\2\2\2\u00c7\u00c8\7\22\2\2"+
		"\u00c8\u00c9\7\23\2\2\u00c9;\3\2\2\2\u00ca\u00cb\7\5\2\2\u00cb\u00cc\7"+
		"\24\2\2\u00cc\u00cd\5\20\t\2\u00cd=\3\2\2\2\u00ce\u00cf\7\25\2\2\u00cf"+
		"\u00d0\5\20\t\2\u00d0?\3\2\2\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\7\26\2"+
		"\2\u00d3A\3\2\2\2\rDR\\ko{\u0083\u008f\u00a9\u00bf\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}