grammar SQLSyntax;
// Use common lexer rules
import CommonLexerRules;

prog    : stat SEMICOLON? EOF;

stat    : selectStmt;

identifierGroup : ID (COMMA ID)* ;

tableName       : ID ;

selectStmt      : SELECT identifierGroup FROM tableName ;