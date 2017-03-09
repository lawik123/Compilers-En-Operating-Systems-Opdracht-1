grammar Lang;
prog:'#'STRING 'BEGIN' expression* 'END';
expression: varDecl
|methodDecl
|ifStm
|whileStm
|forStm
|writeExpr
|readExpr
|varMod
;

//expressions
varDecl:(isGlobal='global')? '~' type='int' identifier=variableName 'IS' mathExpr';' #declareIntVariable|
(isGlobal='global')? '~' type='string' identifier=variableName 'IS' stringvalues';' #declareStringVariable;
varMod: identifier=variableName 'IS' value=variableValue';';
methodDecl:'~' type=methodType '('('~' methodParamType=dataType variableName (',')?)* ')' methodIdentifier=methodName opener expression* 'return' (returnvalue=returnvalues)?';' closer;
ifStm:'if' '(' condition ')' opener expression* closer (('?' '(' condition ')' opener expression* closer)* ('?' opener expression* closer)?)?;
whileStm: 'REPEAT' opener expression* closer 'UNTILL' '(' condition ')';
forStm: 'for' '(' varDecl condition (';' IDcrement '(' variableName ')')? ')' opener expression* closer;
writeExpr: 'WRITE(' (mathExpr|stringvalues) (( '+' (mathExpr|stringvalues))*)? ');';
readExpr: 'READ';

//mathmetic expressions
mathExpr: '(' mathExpr ')'                            #parenthesisExpression
                    | '-' mathExpr                      #minusFirstMathExpression
                    |	leftExpr=mathExpr	op=('*'	|	':')	rightExpr=mathExpr #multiplyDivideExpression
                    |	leftExpr=mathExpr	op=('+'	|	'-')	rightExpr=mathExpr #addSubstractExpression
          		    |   value=mathvalues #mathValuesExpression
           			;

mathvalues:  variableName |INT;

//condition form
condition: (identifierLeft=mathExpr) lop=LOP (identifierRight=mathExpr);

//types
IDcrement: 'incr'|'decr';
dataType: 'int'|'string';
methodType:'int'|'string'|'void';
//names
methodName: STRING;
variableName: STRING;
stringvalues:STRINGVALUE | variableName;
variableValue:
stringvalues
| readExpr
| mathExpr;

//openers and closers
opener: '/';
closer: '\\';

//operators
OP:'+'|'-'|'*'|':';
LOP:'<'|'<='|'>'|'>='|'=='|'!=';

//datatype
INT: '0'	|	[1-9][0-9]*;
STRING: [a-z] [a-zA-Z0-9]*;
STRINGVALUE: '"' [a-zA-Z0-9]* '"';

//return types
returnvalues: stringvalues | mathExpr;

//skippers
WL:	[\n\t\r] ->	skip;       //skip enter or tabs
WS: ' ' -> skip;           //skip whitespace