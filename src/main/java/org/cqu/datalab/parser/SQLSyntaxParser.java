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
		SELECT=1, FROM=2, CREATE=3, TABLE=4, DROP=5, INSERT=6, VALUES=7, INTO=8, 
		IF=9, NOT=10, EXISTS=11, DATETIME=12, DOUBLE=13, FLOAT=14, INT=15, INTEGER=16, 
		STRING=17, TIMESTAMP=18, LONG=19, BOOLEAN=20, BOOL=21, ID=22, OPEN_P=23, 
		CLOSE_P=24, COMMA=25, SEMICOLON=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_dtype = 2, RULE_tableName = 3, RULE_columnName = 4, 
		RULE_identifierGroup = 5, RULE_tableColumnItem = 6, RULE_tableColumns = 7, 
		RULE_valueCols = 8, RULE_tableDefinition = 9, RULE_valueDefinition = 10, 
		RULE_selectStmt = 11, RULE_createTableStmt = 12, RULE_dropTableStmt = 13, 
		RULE_insertStmt = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "dtype", "tableName", "columnName", "identifierGroup", 
			"tableColumnItem", "tableColumns", "valueCols", "tableDefinition", "valueDefinition", 
			"selectStmt", "createTableStmt", "dropTableStmt", "insertStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'('", 
			"')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "TABLE", "DROP", "INSERT", "VALUES", 
			"INTO", "IF", "NOT", "EXISTS", "DATETIME", "DOUBLE", "FLOAT", "INT", 
			"INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", "BOOL", "ID", "OPEN_P", 
			"CLOSE_P", "COMMA", "SEMICOLON", "WS"
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
			setState(30);
			stat();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(31);
				match(SEMICOLON);
				}
			}

			setState(34);
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				selectStmt();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				createTableStmt();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				dropTableStmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				insertStmt();
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
			setState(42);
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
		enterRule(_localctx, 6, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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
		enterRule(_localctx, 8, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
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
		enterRule(_localctx, 10, RULE_identifierGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(49);
				match(COMMA);
				setState(50);
				match(ID);
				}
				}
				setState(55);
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
		enterRule(_localctx, 12, RULE_tableColumnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			columnName();
			setState(57);
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
		enterRule(_localctx, 14, RULE_tableColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			tableColumnItem();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60);
				match(COMMA);
				setState(61);
				tableColumnItem();
				}
				}
				setState(66);
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
		public List<TerminalNode> ID() { return getTokens(SQLSyntaxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLSyntaxParser.ID, i);
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
		enterRule(_localctx, 16, RULE_valueCols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(68);
				match(COMMA);
				setState(69);
				match(ID);
				}
				}
				setState(74);
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
		enterRule(_localctx, 18, RULE_tableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(OPEN_P);
			setState(76);
			tableColumns();
			setState(77);
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
		enterRule(_localctx, 20, RULE_valueDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(OPEN_P);
			setState(80);
			valueCols();
			setState(81);
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

	public static class SelectStmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLSyntaxParser.SELECT, 0); }
		public IdentifierGroupContext identifierGroup() {
			return getRuleContext(IdentifierGroupContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLSyntaxParser.FROM, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
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
		enterRule(_localctx, 22, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(SELECT);
			setState(84);
			identifierGroup();
			setState(85);
			match(FROM);
			setState(86);
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
		enterRule(_localctx, 24, RULE_createTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(CREATE);
			setState(89);
			match(TABLE);
			setState(90);
			tableName();
			setState(91);
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
		enterRule(_localctx, 26, RULE_dropTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(DROP);
			setState(94);
			match(TABLE);
			setState(95);
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
		enterRule(_localctx, 28, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(INSERT);
			setState(98);
			match(INTO);
			setState(99);
			tableName();
			setState(100);
			match(VALUES);
			setState(101);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7\66\n"+
		"\7\f\7\16\79\13\7\3\b\3\b\3\b\3\t\3\t\3\t\7\tA\n\t\f\t\16\tD\13\t\3\n"+
		"\3\n\3\n\7\nI\n\n\f\n\16\nL\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\3\3\2\16\27\2a\2 \3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2\n\60"+
		"\3\2\2\2\f\62\3\2\2\2\16:\3\2\2\2\20=\3\2\2\2\22E\3\2\2\2\24M\3\2\2\2"+
		"\26Q\3\2\2\2\30U\3\2\2\2\32Z\3\2\2\2\34_\3\2\2\2\36c\3\2\2\2 \"\5\4\3"+
		"\2!#\7\34\2\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\2\2\3%\3\3\2\2\2&+\5"+
		"\30\r\2\'+\5\32\16\2(+\5\34\17\2)+\5\36\20\2*&\3\2\2\2*\'\3\2\2\2*(\3"+
		"\2\2\2*)\3\2\2\2+\5\3\2\2\2,-\t\2\2\2-\7\3\2\2\2./\7\30\2\2/\t\3\2\2\2"+
		"\60\61\7\30\2\2\61\13\3\2\2\2\62\67\7\30\2\2\63\64\7\33\2\2\64\66\7\30"+
		"\2\2\65\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\r\3\2\2\29\67"+
		"\3\2\2\2:;\5\n\6\2;<\5\6\4\2<\17\3\2\2\2=B\5\16\b\2>?\7\33\2\2?A\5\16"+
		"\b\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\21\3\2\2\2DB\3\2\2\2EJ\7"+
		"\30\2\2FG\7\33\2\2GI\7\30\2\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"K\23\3\2\2\2LJ\3\2\2\2MN\7\31\2\2NO\5\20\t\2OP\7\32\2\2P\25\3\2\2\2QR"+
		"\7\31\2\2RS\5\22\n\2ST\7\32\2\2T\27\3\2\2\2UV\7\3\2\2VW\5\f\7\2WX\7\4"+
		"\2\2XY\5\b\5\2Y\31\3\2\2\2Z[\7\5\2\2[\\\7\6\2\2\\]\5\b\5\2]^\5\24\13\2"+
		"^\33\3\2\2\2_`\7\7\2\2`a\7\6\2\2ab\5\b\5\2b\35\3\2\2\2cd\7\b\2\2de\7\n"+
		"\2\2ef\5\b\5\2fg\7\t\2\2gh\5\26\f\2h\37\3\2\2\2\7\"*\67BJ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}