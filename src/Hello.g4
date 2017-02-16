grammar Hello;
r  :OP? NUMBER+ (DASH NUMBER+)?;
DASH: '-';
OP: '+';
NUMBER : [0-9]+;
WS: [ \n\t\r]+ -> skip ;