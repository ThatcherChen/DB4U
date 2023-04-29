package org.cqu.datalab;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cqu.datalab.parser.DBVisitor;
import org.cqu.datalab.parser.SQLSyntaxLexer;
import org.cqu.datalab.parser.SQLSyntaxParser;

public class Main {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream inputStream = new ANTLRInputStream(System.in);
        SQLSyntaxLexer lexer = new SQLSyntaxLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        SQLSyntaxParser parser = new SQLSyntaxParser(tokenStream);
        ParseTree parseTree = parser.prog();
        DBVisitor visitor = new DBVisitor();
        visitor.visit(parseTree);
    }
}