grammar Lang;
prog:'#' className=STRING 'BEGIN' expression* 'END';
expression: varDecl
|methodDecl
|varMod
|mathExpr
;

nonGlobalExpr:ifStm
            |whileStm
            |forStm
            |writeExpr
            |varMod
            |varDecl
            |callMethodExpr
            ;

//expressions
varDecl:(isGlobal='global')? '~' type='int' identifier=variableName 'IS' mathExpr ';' #declareIntVariable|
(isGlobal='global')? '~' type='string' identifier=variableName 'IS' stringvalues ';' #declareStringVariable;
varMod: identifier=variableName 'IS' value=variableValue';';
methodDecl:'~' type=methodType '(' (params params2*)? ')' methodIdentifier=methodName opener nonGlobalExpr* 'return' (returnvalue=returnvalues)?';' closer;
ifStm:'if' '(' condition ')' opener nonGlobalExpr* closer (('?' '(' condition ')' opener nonGlobalExpr* closer)* ('?' opener nonGlobalExpr* closer)?)?;
whileStm: 'REPEAT' opener nonGlobalExpr* closer 'UNTIL' '(' condition ')';
forStm: 'for' '(' varDecl condition (';' IDcrement '(' variableName ')')? ')' opener nonGlobalExpr* closer;
writeExpr: 'WRITE(' (mathExpr|stringvalues) ( '+' (mathExpr|stringvalues)*)? ');';
callMethodExpr: '('(variableName variableName2*)?')'methodIdentifier=methodName ';';
readIntExpr: 'READINT';
readStringExpr: 'READSTRING';

//mathmetic expressions
mathExpr: '(' mathExpr ')'                            #parenthesisExpression
                    | '-' mathExpr                      #minusFirstMathExpression
                    |	leftExpr=mathExpr	op=('*'	|	':')	rightExpr=mathExpr #multiplyDivideExpression
                    |	leftExpr=mathExpr	op=('+'	|	'-')	rightExpr=mathExpr #addSubstractExpression
          		    |   value=mathvalues #mathValuesExpression
           			;

mathvalues:  variableName #intvariable
|INT #intlitteral
| readIntExpr#intread;

//condition form
condition: (identifierLeft=mathExpr) lop=LOP (identifierRight=mathExpr);

params: '~' methodParamType=dataType variableName;
params2: ',' '~' methodParamType2=dataType variableName;
variableName2: ',' variableName;
//types
IDcrement: 'incr'|'decr';
dataType: 'int'|'string';
methodType:'int'|'string'|'void';

//names
methodName: STRING;
variableName: STRING;
stringvalues:STRINGVALUE | variableName | readStringExpr;
variableValue:
stringvalues
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