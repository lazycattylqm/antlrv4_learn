grammar Expr;
@header{package com.lqm;}
prog:	expr EOF ;
expr:	key op value
//    |   key ('in'|'IN') value
//    |   ANY
//    |   INT
//    | key
//    | value
//    | op
    | expr ('and'|'or') expr
    | '(' expr ')'
    ;
key:  ANY
    | INT
    ;
value:  ANY
        | INT
        | '(' value ')'
        | value (',') value
        ;
op: OP
    | 'in'
    | 'IN'
    ;
NEWLINE : [\r\n\t']+ -> skip;
WS : [\r\n\t ]+ -> skip;
INT     : [0-9]+ ;
ANY  : [A-Za-z0-9]+ ;
OP: ('+'|'-'|'*'|'/'|'>='|'>'|'='|'<'|'<='|'<>'|'in'|'IN') ;