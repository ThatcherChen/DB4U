package org.cqu.datalab.parser;

import org.antlr.v4.runtime.tree.TerminalNode;

public class DBVisitor extends SQLSyntaxBaseVisitor<String> {
    @Override
    public String visitIdentifierGroup(SQLSyntaxParser.IdentifierGroupContext ctx) {
        StringBuilder builder = new StringBuilder();
        for (TerminalNode node : ctx.ID()) {
            builder.append(node.getText());
            builder.append(",");
        }
        return builder.toString();
    }

    @Override
    public String visitTableName(SQLSyntaxParser.TableNameContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitSelectStmt(SQLSyntaxParser.SelectStmtContext ctx) {
        System.out.println("What to select: " + visitIdentifierGroup(ctx.identifierGroup()));
        return null;
    }
}