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
methodDecl:'~' ('void'|dataType) '('(('~' returntype=dataType variableName)(',' '~' dataType variableName)*)? ')' methodName opener expression* 'return' (variableName|INT|STRING)?';' closer;
ifExpr:'if' '(' condition ')' opener expression* closer (('?' '(' condition ')' opener expression* closer)* ('?' opener expression* closer)?)?;
whileExpr: 'REPEAT' opener expression* closer 'UNTILL' '(' condition ')';
forExpr: 'for' '(' varDecl condition (';' IDcrement '(' variable ')')? ')' opener;
writeExpr: 'WRITE(' STRING ');';
readExpr: 'READ';

//mathmetic expressions
mathExpr: '('	mathExpr	')'                            #parenthesisExpression
          		    |   '-'	mathExpr                             #minusFirstExpression
          		    |	leftExpr=mathExpr	op=('*'	|	'/')	rightExpr=mathExpr #multiplyDivideExpression
          			|	leftExpr=mathExpr	op=('+'	|	'-')	rightExpr=mathExpr #addSubstractExpression
          			|	leftExpr=mathExpr	op=('<'	|	'<='|	'>'|	'>=')	rightExpr=mathExpr #compareExpression
          			|	INT                                        #intLitteralExpression
          			;

//condition form
condition: (identifierLeft=variableName|INT) lop=LOP (identifierRight=variableName|INT);

//types
IDcrement: 'incr'|'decr';
dataType: 'int'|'string';

//names
methodName: STRING;
variableName: STRING;
variable: STRING|INT;

//openers and closers
opener: '/';
closer: '\\';

//operators
OP:'+'|'-'|'*'|':';
LOP:'<'|'<='|'>'|'>='|'=='|'!=';

//datatype
INT: [0-9]+;
STRING: [a-zA-Z]+;

//skippers
WL:	[\n\t\r] ->	skip;       //skip enter or tabs
WS: ' ' -> skip;           //skip whitespace