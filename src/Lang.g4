grammar Lang;
prog:'#'STRING 'BEGIN' expression* 'END';
expression: varDecl|methodDecl|ifExpr;


varDecl:('global')? '~' dataType variableName 'IS' variable';';
methodDecl:'~' ('void'|dataType) '('(('~' dataType variableName)(',' '~' dataType variableName)*)? ')' methodName opener expression* 'return' (variableName|INT|STRING)?';' closer;
ifExpr:'if(' condition ')' opener expression* closer (('?' '(' condition ')' opener expression* closer)* ('?' opener expression* closer)?)?;


condition: (variableName|INT) LOP (variableName|INT);
dataType: 'int'|'string';
methodName: STRING;
variableName: STRING;
variable: STRING|INT;
opener: '/';
closer: '\\';
OP:'+'|'-'|'*'|':';
LOP:'<'|'<='|'>'|'>='|'=='|'!=';
INT: [0-9]+;
STRING: [a-zA-Z]+;
WS:	' '	->	skip;
