grammar SQLSyntax;
// Use common lexer rules
import CommonLexerRules;

prog    : stat SEMICOLON? EOF;

stat    : selectStmt
        | createTableStmt
        ;

dtype :
       T_DATETIME
     | T_DOUBLE
     | T_FLOAT
     | T_INT
     | T_INTEGER
     | T_STRING
     | T_TIMESTAMP
     | T_LONG
     | T_BOOLEAN
     | T_BOOL
     ;

tableName       : ID ;
columnName      : ID ;

identifierGroup : ID (COMMA ID)* ;
tableColumnItem : columnName dtype;
tableColumns    : tableColumnItem (COMMA tableColumnItem)* ;

tableDefinition : OPEN_P tableColumns CLOSE_P ;

selectStmt      : SELECT identifierGroup FROM tableName ;
createTableStmt : CREATE TABLE tableName tableDefinition ;