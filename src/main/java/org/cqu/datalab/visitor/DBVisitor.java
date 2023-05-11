package org.cqu.datalab.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.cqu.datalab.executor.*;
import org.cqu.datalab.parser.SQLSyntaxBaseVisitor;
import org.cqu.datalab.parser.SQLSyntaxParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBVisitor extends SQLSyntaxBaseVisitor<String> {
    @Override
    public String visitIdentifierGroup(SQLSyntaxParser.IdentifierGroupContext ctx) {
        if (ctx.STAR() != null) return "*";
        StringBuilder builder = new StringBuilder();
        for (TerminalNode node : ctx.ID()) {
            builder.append(node.getText());
            builder.append(" ");
        }
        return builder.toString();
    }

    @Override
    public String visitCommand(SQLSyntaxParser.CommandContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLogicalOperator(SQLSyntaxParser.LogicalOperatorContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBoolExpr(SQLSyntaxParser.BoolExprContext ctx) {
        return ctx.ID().getText() + "," + visitLogicalOperator(ctx.logicalOperator()) + "," + visitExprAtom(ctx.exprAtom()).split(":")[0];
    }

    @Override
    public String visitWhereClause(SQLSyntaxParser.WhereClauseContext ctx) {
        return visitBoolExpr(ctx.boolExpr());
    }

    @Override
    public String visitDtype(SQLSyntaxParser.DtypeContext ctx) {
        return ctx.getText().toLowerCase();
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
    public String visitValueCols(SQLSyntaxParser.ValueColsContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (SQLSyntaxParser.ExprAtomContext ctx_t : ctx.exprAtom()) {
            builder.append(visitExprAtom(ctx_t));
            builder.append(",");
        }
        return builder.toString();
    }

    @Override
    public String visitExprAtom(SQLSyntaxParser.ExprAtomContext ctx) {
        if (ctx.int_t() != null) return visitInt_t(ctx.int_t()) + ":int";
        else if (ctx.string_t() != null) {
            String rowString = visitString_t(ctx.string_t());
            return rowString.substring(1, rowString.length()-1) + ":string";
        }
        else return "";
    }

    @Override
    public String visitInt_t(SQLSyntaxParser.Int_tContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitString_t(SQLSyntaxParser.String_tContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitValueDefinition(SQLSyntaxParser.ValueDefinitionContext ctx) {
        return visitValueCols(ctx.valueCols());
    }

    @Override
    public String visitAssignItem(SQLSyntaxParser.AssignItemContext ctx) {
        return ctx.ID().getText() + "," + visitExprAtom(ctx.exprAtom());
    }

    @Override
    public String visitUpdateAssignment(SQLSyntaxParser.UpdateAssignmentContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (SQLSyntaxParser.AssignItemContext ctx_t : ctx.assignItem()) {
            builder.append(visitAssignItem(ctx_t));
            builder.append("/");
        }
        return builder.toString();
    }

    @Override
    public String visitInsertStmt(SQLSyntaxParser.InsertStmtContext ctx) {
        String rowData = visitValueDefinition(ctx.valueDefinition());
        List<String> valueList = Arrays.asList(rowData.split(","));
        new InsertExecutor(visitTableName(ctx.tableName()), valueList).execute();
        return super.visitInsertStmt(ctx);
    }

    @Override
    public String visitSelectStmt(SQLSyntaxParser.SelectStmtContext ctx) {
        List<String> identifiers = new ArrayList<>(Arrays.asList(visitIdentifierGroup(ctx.identifierGroup()).split(" ")));
        if (ctx.whereClause() == null) new SelectExecutor(visitTableName(ctx.tableName()), identifiers, "").execute();
        else new SelectExecutor(visitTableName(ctx.tableName()), identifiers, visitWhereClause(ctx.whereClause())).execute();
        return super.visitSelectStmt(ctx);
    }

    @Override
    public String visitDropTableStmt(SQLSyntaxParser.DropTableStmtContext ctx) {
        new DropTableExecutor(visitTableName(ctx.tableName())).execute();
        return super.visitDropTableStmt(ctx);
    }

    @Override
    public String visitMetaCommand(SQLSyntaxParser.MetaCommandContext ctx) {
        new CommandExecutor(visitCommand(ctx.command())).execute();
        return null;
    }

    @Override
    public String visitDeleteStmt(SQLSyntaxParser.DeleteStmtContext ctx) {
        new DeleteExecutor(visitTableName(ctx.tableName()), ctx.whereClause() == null ? "" : visitWhereClause(ctx.whereClause())).execute();
        return super.visitDeleteStmt(ctx);
    }

    @Override
    public String visitUpdateStmt(SQLSyntaxParser.UpdateStmtContext ctx) {
        new UpdateExecutor(visitTableName(ctx.tableName()), visitUpdateAssignment(ctx.updateAssignment()), visitWhereClause(ctx.whereClause())).execute();
        return super.visitUpdateStmt(ctx);
    }
}