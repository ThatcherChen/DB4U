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
    public static final String VER = "1.2";
    public static final String COMPILE_PLATFORM = System.getProperty("os.name");
    public static final String JAVA_VER = System.getProperty("java.version");
    public static final String COMPILE_USER = System.getProperty("user.name");
    public static void main(String[] args) {
        DBVisitor visitor = new DBVisitor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to DB4U!");
        System.out.printf("Server version: DB4U-%s-%s-%s-%s\n", VER, COMPILE_PLATFORM, COMPILE_USER, JAVA_VER);
        System.out.println("Copyright (c) 2023, cc0de and others.");
        System.out.println("Type !help for more information.");
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