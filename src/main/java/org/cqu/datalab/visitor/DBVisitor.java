package org.cqu.datalab.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.cqu.datalab.executor.CreateTableExecutor;
import org.cqu.datalab.parser.SQLSyntaxBaseVisitor;
import org.cqu.datalab.parser.SQLSyntaxParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
}