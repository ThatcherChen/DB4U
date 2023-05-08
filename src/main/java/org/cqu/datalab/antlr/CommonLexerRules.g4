lexer grammar CommonLexerRules;

SELECT  : S E L E C T ;
FROM    : F R O M ;
CREATE  : C R E A T E ;
TABLE   : T A B L E ;
IF      : I F ;
NOT     : N O T ;
EXISTS  : E X I S T S ;

ID          : ID_PART ;

OPEN_P      : '(' ;
CLOSE_P     : ')' ;
COMMA       : ',' ;
SEMICOLON   : ';' ;

T_DATETIME  : D A T E T I M E ;
T_DOUBLE    : D O U B L E ;
T_FLOAT     : F L O A T ;
T_INT       : I N T ;
T_INTEGER   : I N T E G E R ;
T_STRING    : S T R I N G ;
T_TIMESTAMP : T I M E S T A M P ;
T_LONG      : L O N G ;
T_BOOLEAN   : B O O L E A N ;
T_BOOL      : B O O L ;

WS          : [ \t\n] -> skip ;

fragment DIGITAL    : [0-9] ;
fragment ID_PART    : [a-zA-Z] ([a-zA-Z] | DIGITAL | '_')*;

// To support case-insensitive keywords
fragment A : ('a'|'A') ;
fragment B : ('b'|'B') ;
fragment C : ('c'|'C') ;
fragment D : ('d'|'D') ;
fragment E : ('e'|'E') ;
fragment F : ('f'|'F') ;
fragment G : ('g'|'G') ;
fragment H : ('h'|'H') ;
fragment I : ('i'|'I') ;
fragment J : ('j'|'J') ;
fragment K : ('k'|'K') ;
fragment L : ('l'|'L') ;
fragment M : ('m'|'M') ;
fragment N : ('n'|'N') ;
fragment O : ('o'|'O') ;
fragment P : ('p'|'P') ;
fragment Q : ('q'|'Q') ;
fragment R : ('r'|'R') ;
fragment S : ('s'|'S') ;
fragment T : ('t'|'T') ;
fragment U : ('u'|'U') ;
fragment V : ('v'|'V') ;
fragment W : ('w'|'W') ;
fragment X : ('x'|'X') ;
fragment Y : ('y'|'Y') ;
fragment Z : ('z'|'Z') ;