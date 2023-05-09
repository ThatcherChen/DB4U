grammar SQLSyntax;
// Use common lexer rules
import CommonLexerRules;

prog    : stat SEMICOLON? EOF;

stat    : selectStmt
        | createTableStmt
        | dropTableStmt
        | insertStmt
        | updateStmt
        ;

dtype   : DATETIME
        | DOUBLE
        | FLOAT
        | INT
        | INTEGER
        | STRING
        | TIMESTAMP
        | LONG
        | BOOLEAN
        | BOOL
        ;

tableName       : ID ;
columnName      : ID ;

identifierGroup : ID (COMMA ID)* ;
tableColumnItem : columnName dtype;
tableColumns    : tableColumnItem (COMMA tableColumnItem)* ;
valueCols       : VALUE (COMMA VALUE)* ;
assignItem      : ID EQUAL ID;
updateAssignment: assignItem (COMMA assignItem)* ;

tableDefinition : OPEN_P tableColumns CLOSE_P ;
valueDefinition : OPEN_P valueCols CLOSE_P ;

selectStmt      : SELECT identifierGroup FROM tableName ;
createTableStmt : CREATE TABLE tableName tableDefinition ;
dropTableStmt   : DROP TABLE tableName ;
insertStmt      : INSERT INTO tableName VALUES valueDefinition ;
updateStmt      : UPDATE tableName SET updateAssignment ;