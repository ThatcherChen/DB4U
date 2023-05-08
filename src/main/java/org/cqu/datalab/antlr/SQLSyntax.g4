grammar SQLSyntax;
// Use common lexer rules
import CommonLexerRules;

prog    : stat SEMICOLON? EOF;

stat    : selectStmt
        | createTableStmt
        ;

identifierGroup : ID (COMMA ID)* ;

tableDefinition : OPEN_P identifierGroup CLOSE_P ;
tableName       : ID ;

selectStmt      : SELECT identifierGroup FROM tableName ;
createTableStmt : CREATE TABLE tableName tableDefinition ;