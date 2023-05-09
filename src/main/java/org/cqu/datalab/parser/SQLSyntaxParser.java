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
		SET=9, INTO=10, IF=11, NOT=12, EXISTS=13, DATETIME=14, DOUBLE=15, FLOAT=16, 
		INT=17, INTEGER=18, STRING=19, TIMESTAMP=20, LONG=21, BOOLEAN=22, BOOL=23, 
		ID=24, VALUE=25, EQUAL=26, OPEN_P=27, CLOSE_P=28, COMMA=29, SEMICOLON=30, 
		WS=31;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_dtype = 2, RULE_tableName = 3, RULE_columnName = 4, 
		RULE_identifierGroup = 5, RULE_tableColumnItem = 6, RULE_tableColumns = 7, 
		RULE_valueCols = 8, RULE_assignItem = 9, RULE_updateAssignment = 10, RULE_tableDefinition = 11, 
		RULE_valueDefinition = 12, RULE_selectStmt = 13, RULE_createTableStmt = 14, 
		RULE_dropTableStmt = 15, RULE_insertStmt = 16, RULE_updateStmt = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "dtype", "tableName", "columnName", "identifierGroup", 
			"tableColumnItem", "tableColumns", "valueCols", "assignItem", "updateAssignment", 
			"tableDefinition", "valueDefinition", "selectStmt", "createTableStmt", 
			"dropTableStmt", "insertStmt", "updateStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'='", "'('", "')'", "','", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "TABLE", "DROP", "INSERT", "VALUES", 
			"UPDATE", "SET", "INTO", "IF", "NOT", "EXISTS", "DATETIME", "DOUBLE", 
			"FLOAT", "INT", "INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", 
			"BOOL", "ID", "VALUE", "EQUAL", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", 
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
			setState(36);
			stat();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(37);
				match(SEMICOLON);
				}
			}

			setState(40);
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
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				selectStmt();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				createTableStmt();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				dropTableStmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				insertStmt();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				updateStmt();
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
			setState(49);
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
			setState(51);
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
			setState(53);
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
			setState(55);
			match(ID);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(56);
				match(COMMA);
				setState(57);
				match(ID);
				}
				}
				setState(62);
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
			setState(63);
			columnName();
			setState(64);
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
			setState(66);
			tableColumnItem();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(67);
				match(COMMA);
				setState(68);
				tableColumnItem();
				}
				}
				setState(73);
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
		public List<TerminalNode> VALUE() { return getTokens(SQLSyntaxParser.VALUE); }
		public TerminalNode VALUE(int i) {
			return getToken(SQLSyntaxParser.VALUE, i);
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
			setState(74);
			match(VALUE);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				match(VALUE);
				}
				}
				setState(81);
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
		public List<TerminalNode> ID() { return getTokens(SQLSyntaxParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLSyntaxParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(SQLSyntaxParser.EQUAL, 0); }
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
		enterRule(_localctx, 18, RULE_assignItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(EQUAL);
			setState(84);
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
		enterRule(_localctx, 20, RULE_updateAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			assignItem();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(87);
				match(COMMA);
				setState(88);
				assignItem();
				}
				}
				setState(93);
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
		enterRule(_localctx, 22, RULE_tableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(OPEN_P);
			setState(95);
			tableColumns();
			setState(96);
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
		enterRule(_localctx, 24, RULE_valueDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(OPEN_P);
			setState(99);
			valueCols();
			setState(100);
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
		enterRule(_localctx, 26, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(SELECT);
			setState(103);
			identifierGroup();
			setState(104);
			match(FROM);
			setState(105);
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
		enterRule(_localctx, 28, RULE_createTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(CREATE);
			setState(108);
			match(TABLE);
			setState(109);
			tableName();
			setState(110);
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
		enterRule(_localctx, 30, RULE_dropTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(DROP);
			setState(113);
			match(TABLE);
			setState(114);
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
		enterRule(_localctx, 32, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(INSERT);
			setState(117);
			match(INTO);
			setState(118);
			tableName();
			setState(119);
			match(VALUES);
			setState(120);
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
		enterRule(_localctx, 34, RULE_updateStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(UPDATE);
			setState(123);
			tableName();
			setState(124);
			match(SET);
			setState(125);
			updateAssignment();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0082\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7=\n\7\f\7\16\7@\13\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\tH\n\t\f\t\16\tK\13\t\3\n\3\n\3\n\7\nP\n\n\f\n\16\nS\13\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\\\n\f\f\f\16\f_\13\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3"+
		"\3\2\20\31\2x\2&\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n\67\3"+
		"\2\2\2\f9\3\2\2\2\16A\3\2\2\2\20D\3\2\2\2\22L\3\2\2\2\24T\3\2\2\2\26X"+
		"\3\2\2\2\30`\3\2\2\2\32d\3\2\2\2\34h\3\2\2\2\36m\3\2\2\2 r\3\2\2\2\"v"+
		"\3\2\2\2$|\3\2\2\2&(\5\4\3\2\')\7 \2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2"+
		"*+\7\2\2\3+\3\3\2\2\2,\62\5\34\17\2-\62\5\36\20\2.\62\5 \21\2/\62\5\""+
		"\22\2\60\62\5$\23\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61"+
		"\60\3\2\2\2\62\5\3\2\2\2\63\64\t\2\2\2\64\7\3\2\2\2\65\66\7\32\2\2\66"+
		"\t\3\2\2\2\678\7\32\2\28\13\3\2\2\29>\7\32\2\2:;\7\37\2\2;=\7\32\2\2<"+
		":\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\r\3\2\2\2@>\3\2\2\2AB\5\n\6\2"+
		"BC\5\6\4\2C\17\3\2\2\2DI\5\16\b\2EF\7\37\2\2FH\5\16\b\2GE\3\2\2\2HK\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2J\21\3\2\2\2KI\3\2\2\2LQ\7\33\2\2MN\7\37\2\2"+
		"NP\7\33\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\23\3\2\2\2SQ\3\2"+
		"\2\2TU\7\32\2\2UV\7\34\2\2VW\7\32\2\2W\25\3\2\2\2X]\5\24\13\2YZ\7\37\2"+
		"\2Z\\\5\24\13\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\27\3\2\2\2_"+
		"]\3\2\2\2`a\7\35\2\2ab\5\20\t\2bc\7\36\2\2c\31\3\2\2\2de\7\35\2\2ef\5"+
		"\22\n\2fg\7\36\2\2g\33\3\2\2\2hi\7\3\2\2ij\5\f\7\2jk\7\4\2\2kl\5\b\5\2"+
		"l\35\3\2\2\2mn\7\5\2\2no\7\6\2\2op\5\b\5\2pq\5\30\r\2q\37\3\2\2\2rs\7"+
		"\7\2\2st\7\6\2\2tu\5\b\5\2u!\3\2\2\2vw\7\b\2\2wx\7\f\2\2xy\5\b\5\2yz\7"+
		"\t\2\2z{\5\32\16\2{#\3\2\2\2|}\7\n\2\2}~\5\b\5\2~\177\7\13\2\2\177\u0080"+
		"\5\26\f\2\u0080%\3\2\2\2\b(\61>IQ]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}