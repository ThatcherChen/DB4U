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
		SET=9, INTO=10, IF=11, NOT=12, EXISTS=13, WHERE=14, DELETE=15, DATETIME=16, 
		DOUBLE=17, FLOAT=18, INT=19, INTEGER=20, STRING=21, TIMESTAMP=22, LONG=23, 
		BOOLEAN=24, BOOL=25, ID=26, LESS=27, LARGER=28, EQUAL=29, OPEN_P=30, CLOSE_P=31, 
		COMMA=32, SEMICOLON=33, STAR=34, METAHEAD=35, LESSEQUAL=36, LARGEREQUAL=37, 
		INT_T=38, L_S_STRING=39, L_D_STRING=40, WS=41;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_dtype = 2, RULE_int_t = 3, RULE_string_t = 4, 
		RULE_exprAtom = 5, RULE_tableName = 6, RULE_columnName = 7, RULE_command = 8, 
		RULE_identifierGroup = 9, RULE_logicalOperator = 10, RULE_tableColumnItem = 11, 
		RULE_tableColumns = 12, RULE_valueCols = 13, RULE_assignItem = 14, RULE_updateAssignment = 15, 
		RULE_boolExpr = 16, RULE_whereClause = 17, RULE_tableDefinition = 18, 
		RULE_valueDefinition = 19, RULE_metaCommand = 20, RULE_selectStmt = 21, 
		RULE_createTableStmt = 22, RULE_dropTableStmt = 23, RULE_insertStmt = 24, 
		RULE_updateStmt = 25, RULE_deleteStmt = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "dtype", "int_t", "string_t", "exprAtom", "tableName", 
			"columnName", "command", "identifierGroup", "logicalOperator", "tableColumnItem", 
			"tableColumns", "valueCols", "assignItem", "updateAssignment", "boolExpr", 
			"whereClause", "tableDefinition", "valueDefinition", "metaCommand", "selectStmt", 
			"createTableStmt", "dropTableStmt", "insertStmt", "updateStmt", "deleteStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'<'", "'>'", "'='", "'('", "')'", "','", "';'", "'*'", 
			"'!'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "TABLE", "DROP", "INSERT", "VALUES", 
			"UPDATE", "SET", "INTO", "IF", "NOT", "EXISTS", "WHERE", "DELETE", "DATETIME", 
			"DOUBLE", "FLOAT", "INT", "INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", 
			"BOOL", "ID", "LESS", "LARGER", "EQUAL", "OPEN_P", "CLOSE_P", "COMMA", 
			"SEMICOLON", "STAR", "METAHEAD", "LESSEQUAL", "LARGEREQUAL", "INT_T", 
			"L_S_STRING", "L_D_STRING", "WS"
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
			setState(54);
			stat();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(55);
				match(SEMICOLON);
				}
			}

			setState(58);
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
		public MetaCommandContext metaCommand() {
			return getRuleContext(MetaCommandContext.class,0);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				selectStmt();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				createTableStmt();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				dropTableStmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				insertStmt();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				updateStmt();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				deleteStmt();
				}
				break;
			case METAHEAD:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				metaCommand();
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
			setState(69);
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
			setState(71);
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
			setState(73);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
			case L_D_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				string_t();
				}
				break;
			case INT_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
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
			setState(79);
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
		enterRule(_localctx, 14, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
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
		enterRule(_localctx, 16, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
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
		enterRule(_localctx, 18, RULE_identifierGroup);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(ID);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(86);
					match(COMMA);
					setState(87);
					match(ID);
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
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
		enterRule(_localctx, 20, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
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
		enterRule(_localctx, 22, RULE_tableColumnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			columnName();
			setState(99);
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
		enterRule(_localctx, 24, RULE_tableColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			tableColumnItem();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(103);
				tableColumnItem();
				}
				}
				setState(108);
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
		enterRule(_localctx, 26, RULE_valueCols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			exprAtom();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(110);
				match(COMMA);
				setState(111);
				exprAtom();
				}
				}
				setState(116);
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
		enterRule(_localctx, 28, RULE_assignItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ID);
			setState(118);
			match(EQUAL);
			setState(119);
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
		enterRule(_localctx, 30, RULE_updateAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			assignItem();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				assignItem();
				}
				}
				setState(128);
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
		enterRule(_localctx, 32, RULE_boolExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ID);
			setState(130);
			logicalOperator();
			setState(131);
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
		enterRule(_localctx, 34, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(WHERE);
			setState(134);
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
		enterRule(_localctx, 36, RULE_tableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(OPEN_P);
			setState(137);
			tableColumns();
			setState(138);
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
		enterRule(_localctx, 38, RULE_valueDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(OPEN_P);
			setState(141);
			valueCols();
			setState(142);
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
		enterRule(_localctx, 40, RULE_metaCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(METAHEAD);
			setState(145);
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
		enterRule(_localctx, 42, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(SELECT);
			setState(148);
			identifierGroup();
			setState(149);
			match(FROM);
			setState(150);
			tableName();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(151);
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
		enterRule(_localctx, 44, RULE_createTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(CREATE);
			setState(155);
			match(TABLE);
			setState(156);
			tableName();
			setState(157);
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
		enterRule(_localctx, 46, RULE_dropTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DROP);
			setState(160);
			match(TABLE);
			setState(161);
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
		enterRule(_localctx, 48, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(INSERT);
			setState(164);
			match(INTO);
			setState(165);
			tableName();
			setState(166);
			match(VALUES);
			setState(167);
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
		enterRule(_localctx, 50, RULE_updateStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(UPDATE);
			setState(170);
			tableName();
			setState(171);
			match(SET);
			setState(172);
			updateAssignment();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(173);
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
		enterRule(_localctx, 52, RULE_deleteStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(DELETE);
			setState(177);
			match(FROM);
			setState(178);
			tableName();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(179);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3F\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7P\n\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13[\n\13\f\13\16\13^\13\13\3\13\5"+
		"\13a\n\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\7\16k\n\16\f\16\16\16n\13"+
		"\16\3\17\3\17\3\17\7\17s\n\17\f\17\16\17v\13\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\7\21\177\n\21\f\21\16\21\u0082\13\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u009b\n\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00b1\n\33\3\34\3\34\3\34\3\34\5\34\u00b7\n\34\3\34\2\2\35\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\5\3\2\22\33\3"+
		"\2)*\4\2\35\37&\'\2\u00ad\28\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bI\3\2\2\2"+
		"\nK\3\2\2\2\fO\3\2\2\2\16Q\3\2\2\2\20S\3\2\2\2\22U\3\2\2\2\24`\3\2\2\2"+
		"\26b\3\2\2\2\30d\3\2\2\2\32g\3\2\2\2\34o\3\2\2\2\36w\3\2\2\2 {\3\2\2\2"+
		"\"\u0083\3\2\2\2$\u0087\3\2\2\2&\u008a\3\2\2\2(\u008e\3\2\2\2*\u0092\3"+
		"\2\2\2,\u0095\3\2\2\2.\u009c\3\2\2\2\60\u00a1\3\2\2\2\62\u00a5\3\2\2\2"+
		"\64\u00ab\3\2\2\2\66\u00b2\3\2\2\28:\5\4\3\29;\7#\2\2:9\3\2\2\2:;\3\2"+
		"\2\2;<\3\2\2\2<=\7\2\2\3=\3\3\2\2\2>F\5,\27\2?F\5.\30\2@F\5\60\31\2AF"+
		"\5\62\32\2BF\5\64\33\2CF\5\66\34\2DF\5*\26\2E>\3\2\2\2E?\3\2\2\2E@\3\2"+
		"\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\5\3\2\2\2GH\t\2\2\2H\7\3"+
		"\2\2\2IJ\7(\2\2J\t\3\2\2\2KL\t\3\2\2L\13\3\2\2\2MP\5\n\6\2NP\5\b\5\2O"+
		"M\3\2\2\2ON\3\2\2\2P\r\3\2\2\2QR\7\34\2\2R\17\3\2\2\2ST\7\34\2\2T\21\3"+
		"\2\2\2UV\7\34\2\2V\23\3\2\2\2W\\\7\34\2\2XY\7\"\2\2Y[\7\34\2\2ZX\3\2\2"+
		"\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]a\3\2\2\2^\\\3\2\2\2_a\7$\2\2`W\3\2"+
		"\2\2`_\3\2\2\2a\25\3\2\2\2bc\t\4\2\2c\27\3\2\2\2de\5\20\t\2ef\5\6\4\2"+
		"f\31\3\2\2\2gl\5\30\r\2hi\7\"\2\2ik\5\30\r\2jh\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2m\33\3\2\2\2nl\3\2\2\2ot\5\f\7\2pq\7\"\2\2qs\5\f\7\2rp\3"+
		"\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\35\3\2\2\2vt\3\2\2\2wx\7\34\2\2"+
		"xy\7\37\2\2yz\5\f\7\2z\37\3\2\2\2{\u0080\5\36\20\2|}\7\"\2\2}\177\5\36"+
		"\20\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"!\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\34\2\2\u0084\u0085\5\26\f"+
		"\2\u0085\u0086\5\f\7\2\u0086#\3\2\2\2\u0087\u0088\7\20\2\2\u0088\u0089"+
		"\5\"\22\2\u0089%\3\2\2\2\u008a\u008b\7 \2\2\u008b\u008c\5\32\16\2\u008c"+
		"\u008d\7!\2\2\u008d\'\3\2\2\2\u008e\u008f\7 \2\2\u008f\u0090\5\34\17\2"+
		"\u0090\u0091\7!\2\2\u0091)\3\2\2\2\u0092\u0093\7%\2\2\u0093\u0094\5\22"+
		"\n\2\u0094+\3\2\2\2\u0095\u0096\7\3\2\2\u0096\u0097\5\24\13\2\u0097\u0098"+
		"\7\4\2\2\u0098\u009a\5\16\b\2\u0099\u009b\5$\23\2\u009a\u0099\3\2\2\2"+
		"\u009a\u009b\3\2\2\2\u009b-\3\2\2\2\u009c\u009d\7\5\2\2\u009d\u009e\7"+
		"\6\2\2\u009e\u009f\5\16\b\2\u009f\u00a0\5&\24\2\u00a0/\3\2\2\2\u00a1\u00a2"+
		"\7\7\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\5\16\b\2\u00a4\61\3\2\2\2\u00a5"+
		"\u00a6\7\b\2\2\u00a6\u00a7\7\f\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\7"+
		"\t\2\2\u00a9\u00aa\5(\25\2\u00aa\63\3\2\2\2\u00ab\u00ac\7\n\2\2\u00ac"+
		"\u00ad\5\16\b\2\u00ad\u00ae\7\13\2\2\u00ae\u00b0\5 \21\2\u00af\u00b1\5"+
		"$\23\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\65\3\2\2\2\u00b2"+
		"\u00b3\7\21\2\2\u00b3\u00b4\7\4\2\2\u00b4\u00b6\5\16\b\2\u00b5\u00b7\5"+
		"$\23\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\67\3\2\2\2\r:EO\\"+
		"`lt\u0080\u009a\u00b0\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}