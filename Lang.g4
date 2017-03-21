grammar Lang;
prog:'#'className=STRING 'BEGIN' expression* 'END';

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
varDecl:(isGlobal='global')? '~' type='int' identifier=variableName 'IS' value=mathExpr ';' #declareIntVariable|
(isGlobal='global')? '~' type='string' identifier=variableName 'IS' value=stringvalues ';' #declareStringVariable;
varMod: identifier=variableName 'IS' value=mathExpr';' #intVarModify |
identifier=variableName 'IS' value=stringvalues';' #stringVarModify;
methodDecl:'~' type=methodType '(' (params params2*)? ')' methodIdentifier=methodName opener nonGlobalExpr* 'return' (returnvalue=returnvalues)?';' closer;
ifStm:'if' '(' ifCondition ')' opener ifBlock=nonGlobalExpr* closer (('?' '(' ifCondition ')' opener ifElseBlock=nonGlobalExpr* closer)* ('?' opener elseBlock=nonGlobalExpr* closer)?)?;
whileStm: 'REPEAT' opener nonGlobalExpr* closer 'UNTIL' '(' whileCondition ')';
forStm: 'for' '(' varDecl forCondition (';' idCrement=IDcrement '(' idValue=variableName ')')? ')' opener nonGlobalExpr* closer;
writeExpr: 'WRITE(' (mathExpr|stringvalues) ( '+' (mathExpr|stringvalues)*)? ');';
callMethodExpr: '('(params3 params4*)?')'methodIdentifier=methodName ';';
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
whileCondition: identifierLeft=mathExpr lop=LOP identifierRight=mathExpr;
forCondition: identifierLeft=mathExpr lop=LOP identifierRight=mathExpr;
ifCondition: identifierLeft=mathExpr lop=LOP identifierRight=mathExpr;

params: '~' methodParamType=dataType variableName;
params2: ',' '~' methodParamType2=dataType variableName;
variableName2: ',' variableName;

params3: stringvalues | mathExpr;
params4:',' (stringvalues | mathExpr);

//types
IDcrement: 'incr'|'decr';
dataType: 'int'|'string';
methodType:'int'|'string'|'void';

//names
methodName: STRING;
variableName: STRING;
stringvalues: STRINGVALUE #stringLiteral
| variableName  #stringVariable
| readStringExpr    #stringRead;
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