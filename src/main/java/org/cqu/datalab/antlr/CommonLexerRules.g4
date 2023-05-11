lexer grammar CommonLexerRules;

SELECT      : S E L E C T ;
FROM        : F R O M ;
CREATE      : C R E A T E ;
TABLE       : T A B L E ;
DROP        : D R O P ;
INSERT      : I N S E R T ;
VALUES      : V A L U E S ;
UPDATE      : U P D A T E ;
SET         : S E T ;
INTO        : I N T O ;
IF          : I F ;
NOT         : N O T ;
EXISTS      : E X I S T S ;
WHERE       : W H E R E ;
DELETE      : D E L E T E ;
SHOWTABLES  : S H O W T A B L E S ;

DATETIME  : D A T E T I M E ;
DOUBLE    : D O U B L E ;
FLOAT     : F L O A T ;
INT       : I N T ;
INTEGER   : I N T E G E R ;
STRING    : S T R I N G ;
TIMESTAMP : T I M E S T A M P ;
LONG      : L O N G ;
BOOLEAN   : B O O L E A N ;
BOOL      : B O O L ;

ID          : ID_PART ;

LESS        : '<' ;
LARGER      : '>' ;
EQUAL       : '=' ;
OPEN_P      : '(' ;
CLOSE_P     : ')' ;
COMMA       : ',' ;
SEMICOLON   : ';' ;
STAR        : '*' ;
METAHEAD    : '!' ;
LESSEQUAL   : '<=';
LARGEREQUAL : '>=';

INT_T       : DIGITAL+;
L_S_STRING  : '\'' (('\'' '\'') | ('\\' '\'') | ~('\''))* '\'';
L_D_STRING  : '"' (L_STR_ESC_D | .)*? '"';

WS          : [ \t\n] -> skip ;

fragment DIGITAL    : [0-9] ;
fragment ID_PART    : [a-zA-Z] ([a-zA-Z] | DIGITAL | '_')*;
fragment L_STR_ESC_D: '""' | '\\"' ;

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