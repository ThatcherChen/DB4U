package org.cqu.datalab.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.cqu.datalab.executor.CreateTableExecutor;
import org.cqu.datalab.executor.SelectExecutor;
import org.cqu.datalab.parser.SQLSyntaxBaseVisitor;
import org.cqu.datalab.parser.SQLSyntaxParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBVisitor extends SQLSyntaxBaseVisitor<String> {
    @Override
    public String visitIdentifierGroup(SQLSyntaxParser.IdentifierGroupContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (TerminalNode node : ctx.ID()) {
            builder.append(node.getText());
            builder.append(" ");
        }
        return builder.toString();
    }

    @Override
    public String visitDtype(SQLSyntaxParser.DtypeContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTableName(SQLSyntaxParser.TableNameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitColumnName(SQLSyntaxParser.ColumnNameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTableColumnItem(SQLSyntaxParser.TableColumnItemContext ctx) {
        return visitColumnName(ctx.columnName()) + ":" + visitDtype(ctx.dtype());
    }

    @Override
    public String visitTableColumns(SQLSyntaxParser.TableColumnsContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (SQLSyntaxParser.TableColumnItemContext t_ctx : ctx.tableColumnItem()) {
            builder.append(visitTableColumnItem(t_ctx));
            builder.append("/");
        }
        return builder.toString();
    }

    @Override
    public String visitTableDefinition(SQLSyntaxParser.TableDefinitionContext ctx) {
        return visitTableColumns(ctx.tableColumns());
    }

    @Override
    public String visitCreateTableStmt(SQLSyntaxParser.CreateTableStmtContext ctx) {
        List<String> columns = Arrays.asList(visitTableDefinition(ctx.tableDefinition()).split("/"));
        new CreateTableExecutor(visitTableName(ctx.tableName()), columns).execute();
        return null;
    }

    @Override
    public String visitSelectStmt(SQLSyntaxParser.SelectStmtContext ctx) {
        List<String> identifiers = new ArrayList<>(Arrays.asList(visitIdentifierGroup(ctx.identifierGroup()).split(" ")));
        new SelectExecutor(visitTableName(ctx.tableName()), identifiers).execute();
        return super.visitSelectStmt(ctx);
    }
}