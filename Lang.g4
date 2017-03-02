grammar Lang;
prog:'#'STRING 'BEGIN' expression* 'END';
expression: varDecl
|methodDecl
|ifExpr
|whileExpr
|forExpr
|writeExpr
|readExpr
|mathExpr;

//expressions
varDecl:('global')? '~' type=dataType identifier=variableName 'IS' (value=variable | value2=readExpr)';';
varMod: identifier=variableName 'IS' (value=variable | value2=readExpr | mathExpr)';';
methodDecl:'~' (voidreturntype=voidType |returntype=dataType) '('(('~' dataType variableName)(',' '~' dataType variableName)*)? ')' methodName opener expression* 'return' (returnvalue=returnvalues)?';' closer;
ifExpr:'if' '(' condition ')' opener expression* closer (('?' '(' condition ')' opener expression* closer)* ('?' opener expression* closer)?)?;
whileExpr: 'REPEAT' opener expression* closer 'UNTILL' '(' condition ')';
forExpr: 'for' '(' varDecl condition (';' IDcrement '(' variableName ')')? ')' opener expression* closer;
writeExpr: 'WRITE(' STRING | variableName (( '+' STRING | variableName)*)? ');';
readExpr: 'READ';

//mathmetic expressions
mathExpr: '('	mathExpr	')'                            #parenthesisExpression
          		    |	leftExpr=mathvalues	(op=OP	rightExpr=mathvalues)+ #mathExpression
           			;

mathvalues: variableName | INT;

//condition form
condition: (identifierLeft=variableName|INT) lop=LOP (identifierRight=variableName|INT);

//types
IDcrement: 'incr'|'decr';
dataType: 'int'|'string';
voidType: 'void';

//names
methodName: STRING;
variableName: STRING;
variable: STRINGVALUE|INT;

//openers and closers
opener: '/';
closer: '\\';

//operators
OP:'+'|'-'|'*'|':';
LOP:'<'|'<='|'>'|'>='|'=='|'!=';

//datatype
INT: [0-9]+;
STRING: [a-z] [a-zA-Z0-9]*;
STRINGVALUE: '"' [a-zA-Z0-9]* '"';

//return types
returnvalues: variableName | INT | STRING;

//skippers
WL:	[\n\t\r] ->	skip;       //skip enter or tabs
WS: ' ' -> skip;           //skip whitespace