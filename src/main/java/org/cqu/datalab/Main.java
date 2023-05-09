package org.cqu.datalab;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.cqu.datalab.error.ErrorHandler;
import org.cqu.datalab.visitor.DBVisitor;
import org.cqu.datalab.parser.SQLSyntaxLexer;
import org.cqu.datalab.parser.SQLSyntaxParser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        DBVisitor visitor = new DBVisitor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to DB4U! Ver1.0beta cc0de");
        System.out.print("> ");
        while (true) {
            if (scanner.hasNext()) {
                SQLSyntaxLexer lexer = new SQLSyntaxLexer(CharStreams.fromString(scanner.nextLine()));
                CommonTokenStream tokenStream = new CommonTokenStream(lexer);
                SQLSyntaxParser parser = new SQLSyntaxParser(tokenStream);
                parser.removeErrorListeners();
                parser.addErrorListener(new ErrorHandler());
                ParseTree parseTree = parser.prog();
                visitor.visit(parseTree);
                System.out.print("> ");
            }
        }
    }
}