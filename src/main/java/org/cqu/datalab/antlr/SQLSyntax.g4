grammar SQLSyntax;
// Use common lexer rules
import CommonLexerRules;

prog    : stat SEMICOLON? EOF;

stat    : selectStmt
        | createTableStmt
        | dropTableStmt
        | insertStmt
        | updateStmt
        | metaCommand
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

int_t   : INT_T;
string_t: L_S_STRING
        | L_D_STRING
        ;

exprAtom: string_t
        | int_t
        ;

tableName       : ID ;
columnName      : ID ;
command         : ID ;

identifierGroup : ID (COMMA ID)*
                | STAR
                ;
tableColumnItem : columnName dtype;
tableColumns    : tableColumnItem (COMMA tableColumnItem)* ;
valueCols       : exprAtom (COMMA exprAtom)* ;
assignItem      : ID EQUAL ID;
updateAssignment: assignItem (COMMA assignItem)* ;

tableDefinition : OPEN_P tableColumns CLOSE_P ;
valueDefinition : OPEN_P valueCols CLOSE_P ;

metaCommand     : METAHEAD command;
selectStmt      : SELECT identifierGroup FROM tableName ;
createTableStmt : CREATE TABLE tableName tableDefinition ;
dropTableStmt   : DROP TABLE tableName ;
insertStmt      : INSERT INTO tableName VALUES valueDefinition ;
updateStmt      : UPDATE tableName SET updateAssignment ;