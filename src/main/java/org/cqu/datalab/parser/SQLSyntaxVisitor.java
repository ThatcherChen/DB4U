// Generated from SQLSyntax.g4 by ANTLR 4.9.2
package org.cqu.datalab.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLSyntaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLSyntaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLSyntaxParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SQLSyntaxParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSyntaxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(SQLSyntaxParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSyntaxParser#identifierGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierGroup(SQLSyntaxParser.IdentifierGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSyntaxParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SQLSyntaxParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLSyntaxParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(SQLSyntaxParser.SelectStmtContext ctx);
}