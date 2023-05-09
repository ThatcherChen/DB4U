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
		ID=24, EQUAL=25, OPEN_P=26, CLOSE_P=27, COMMA=28, SEMICOLON=29, STAR=30, 
		METAHEAD=31, INT_T=32, L_S_STRING=33, L_D_STRING=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_dtype = 2, RULE_int_t = 3, RULE_string_t = 4, 
		RULE_exprAtom = 5, RULE_tableName = 6, RULE_columnName = 7, RULE_command = 8, 
		RULE_identifierGroup = 9, RULE_tableColumnItem = 10, RULE_tableColumns = 11, 
		RULE_valueCols = 12, RULE_assignItem = 13, RULE_updateAssignment = 14, 
		RULE_tableDefinition = 15, RULE_valueDefinition = 16, RULE_metaCommand = 17, 
		RULE_selectStmt = 18, RULE_createTableStmt = 19, RULE_dropTableStmt = 20, 
		RULE_insertStmt = 21, RULE_updateStmt = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "dtype", "int_t", "string_t", "exprAtom", "tableName", 
			"columnName", "command", "identifierGroup", "tableColumnItem", "tableColumns", 
			"valueCols", "assignItem", "updateAssignment", "tableDefinition", "valueDefinition", 
			"metaCommand", "selectStmt", "createTableStmt", "dropTableStmt", "insertStmt", 
			"updateStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'='", "'('", "')'", "','", "';'", "'*'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "CREATE", "TABLE", "DROP", "INSERT", "VALUES", 
			"UPDATE", "SET", "INTO", "IF", "NOT", "EXISTS", "DATETIME", "DOUBLE", 
			"FLOAT", "INT", "INTEGER", "STRING", "TIMESTAMP", "LONG", "BOOLEAN", 
			"BOOL", "ID", "EQUAL", "OPEN_P", "CLOSE_P", "COMMA", "SEMICOLON", "STAR", 
			"METAHEAD", "INT_T", "L_S_STRING", "L_D_STRING", "WS"
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
			setState(46);
			stat();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(47);
				match(SEMICOLON);
				}
			}

			setState(50);
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
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				selectStmt();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				createTableStmt();
				}
				break;
			case DROP:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				dropTableStmt();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				insertStmt();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				updateStmt();
				}
				break;
			case METAHEAD:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
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
			setState(60);
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
			setState(62);
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
			setState(64);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
			case L_D_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				string_t();
				}
				break;
			case INT_T:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
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
			setState(70);
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
			setState(72);
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
			setState(74);
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(ID);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					match(ID);
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
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
		enterRule(_localctx, 20, RULE_tableColumnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			columnName();
			setState(88);
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
		enterRule(_localctx, 22, RULE_tableColumns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			tableColumnItem();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				tableColumnItem();
				}
				}
				setState(97);
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
		enterRule(_localctx, 24, RULE_valueCols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			exprAtom();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(99);
				match(COMMA);
				setState(100);
				exprAtom();
				}
				}
				setState(105);
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
		enterRule(_localctx, 26, RULE_assignItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(EQUAL);
			setState(108);
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
		enterRule(_localctx, 28, RULE_updateAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			assignItem();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(111);
				match(COMMA);
				setState(112);
				assignItem();
				}
				}
				setState(117);
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
		enterRule(_localctx, 30, RULE_tableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(OPEN_P);
			setState(119);
			tableColumns();
			setState(120);
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
		enterRule(_localctx, 32, RULE_valueDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(OPEN_P);
			setState(123);
			valueCols();
			setState(124);
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
		enterRule(_localctx, 34, RULE_metaCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(METAHEAD);
			setState(127);
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
		enterRule(_localctx, 36, RULE_selectStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(SELECT);
			setState(130);
			identifierGroup();
			setState(131);
			match(FROM);
			setState(132);
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
		enterRule(_localctx, 38, RULE_createTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CREATE);
			setState(135);
			match(TABLE);
			setState(136);
			tableName();
			setState(137);
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
		enterRule(_localctx, 40, RULE_dropTableStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(DROP);
			setState(140);
			match(TABLE);
			setState(141);
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
		enterRule(_localctx, 42, RULE_insertStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(INSERT);
			setState(144);
			match(INTO);
			setState(145);
			tableName();
			setState(146);
			match(VALUES);
			setState(147);
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
		enterRule(_localctx, 44, RULE_updateStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(UPDATE);
			setState(150);
			tableName();
			setState(151);
			match(SET);
			setState(152);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u009d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\5\7G\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\7\13R\n\13"+
		"\f\13\16\13U\13\13\3\13\5\13X\n\13\3\f\3\f\3\f\3\r\3\r\3\r\7\r`\n\r\f"+
		"\r\16\rc\13\r\3\16\3\16\3\16\7\16h\n\16\f\16\16\16k\13\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\7\20t\n\20\f\20\16\20w\13\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\2\4\3\2\20\31\3\2#$\2\u0091\2\60\3\2\2\2\4<\3\2\2\2\6>\3"+
		"\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fF\3\2\2\2\16H\3\2\2\2\20J\3\2\2\2\22L\3"+
		"\2\2\2\24W\3\2\2\2\26Y\3\2\2\2\30\\\3\2\2\2\32d\3\2\2\2\34l\3\2\2\2\36"+
		"p\3\2\2\2 x\3\2\2\2\"|\3\2\2\2$\u0080\3\2\2\2&\u0083\3\2\2\2(\u0088\3"+
		"\2\2\2*\u008d\3\2\2\2,\u0091\3\2\2\2.\u0097\3\2\2\2\60\62\5\4\3\2\61\63"+
		"\7\37\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\2\2\3\65\3"+
		"\3\2\2\2\66=\5&\24\2\67=\5(\25\28=\5*\26\29=\5,\27\2:=\5.\30\2;=\5$\23"+
		"\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\5"+
		"\3\2\2\2>?\t\2\2\2?\7\3\2\2\2@A\7\"\2\2A\t\3\2\2\2BC\t\3\2\2C\13\3\2\2"+
		"\2DG\5\n\6\2EG\5\b\5\2FD\3\2\2\2FE\3\2\2\2G\r\3\2\2\2HI\7\32\2\2I\17\3"+
		"\2\2\2JK\7\32\2\2K\21\3\2\2\2LM\7\32\2\2M\23\3\2\2\2NS\7\32\2\2OP\7\36"+
		"\2\2PR\7\32\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TX\3\2\2\2US\3"+
		"\2\2\2VX\7 \2\2WN\3\2\2\2WV\3\2\2\2X\25\3\2\2\2YZ\5\20\t\2Z[\5\6\4\2["+
		"\27\3\2\2\2\\a\5\26\f\2]^\7\36\2\2^`\5\26\f\2_]\3\2\2\2`c\3\2\2\2a_\3"+
		"\2\2\2ab\3\2\2\2b\31\3\2\2\2ca\3\2\2\2di\5\f\7\2ef\7\36\2\2fh\5\f\7\2"+
		"ge\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\33\3\2\2\2ki\3\2\2\2lm\7\32"+
		"\2\2mn\7\33\2\2no\7\32\2\2o\35\3\2\2\2pu\5\34\17\2qr\7\36\2\2rt\5\34\17"+
		"\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\37\3\2\2\2wu\3\2\2\2xy\7\34"+
		"\2\2yz\5\30\r\2z{\7\35\2\2{!\3\2\2\2|}\7\34\2\2}~\5\32\16\2~\177\7\35"+
		"\2\2\177#\3\2\2\2\u0080\u0081\7!\2\2\u0081\u0082\5\22\n\2\u0082%\3\2\2"+
		"\2\u0083\u0084\7\3\2\2\u0084\u0085\5\24\13\2\u0085\u0086\7\4\2\2\u0086"+
		"\u0087\5\16\b\2\u0087\'\3\2\2\2\u0088\u0089\7\5\2\2\u0089\u008a\7\6\2"+
		"\2\u008a\u008b\5\16\b\2\u008b\u008c\5 \21\2\u008c)\3\2\2\2\u008d\u008e"+
		"\7\7\2\2\u008e\u008f\7\6\2\2\u008f\u0090\5\16\b\2\u0090+\3\2\2\2\u0091"+
		"\u0092\7\b\2\2\u0092\u0093\7\f\2\2\u0093\u0094\5\16\b\2\u0094\u0095\7"+
		"\t\2\2\u0095\u0096\5\"\22\2\u0096-\3\2\2\2\u0097\u0098\7\n\2\2\u0098\u0099"+
		"\5\16\b\2\u0099\u009a\7\13\2\2\u009a\u009b\5\36\20\2\u009b/\3\2\2\2\n"+
		"\62<FSWaiu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}