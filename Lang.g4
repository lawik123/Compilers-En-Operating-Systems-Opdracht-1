grammar Lang;
prog:'#'className=nameClass 'BEGIN' varGlobalDecl* (expression*|methodnames) runMethod 'END';

expression:
varMod
;

methodnames:methodDecl*;

nonGlobalExpr:ifStm
            |whileStm
            |forStm
            |writeExpr
            |varMod
            |varDecl
            |callMethodExpr
            ;

//variable global declarations
varGlobalDecl:(isGlobal='global') '~int' identifier=variableName 'IS' value=mathExpr ';'         #declareIntGlobalVariable|
(isGlobal='global') '~string' identifier=variableName 'IS' value=stringvalues ';'          #declareStringGlobalVariable;

//variable declarations
varDecl:'~int' identifier=variableName 'IS' value=mathExpr ';'         #declareIntVariable|
'~string' identifier=variableName 'IS' value=stringvalues ';'          #declareStringVariable;

//variable modifications
varMod: identifier=variableName 'IS' value=mathExpr';'              #intVarModify
| identifier=variableName 'IS' value=stringvalues';'                #stringVarModify;

//method declerations
methodDecl:'~void' '(' (methodDeclParams (',' methodDeclParams)*)? ')' methodIdentifier=methodName opener nonGlobalExpr* 'return;' closer                               #voidMethodDecl
| '~int' '(' (methodDeclParams (',' methodDeclParams)*)?')' methodIdentifier=methodName opener nonGlobalExpr* 'return' (returnvalue=mathExpr)?';' closer                #intMethodDecl
| '~string' '(' (methodDeclParams (',' methodDeclParams)*)? ')' methodIdentifier=methodName opener nonGlobalExpr* 'return' (returnvalue=stringvalues)?';' closer        #stringMethodDecl;

//main method
runMethod: '~void' '()run'  opener nonGlobalExpr* 'return;' closer;

//call method
callMethodExpr: '('(methodCallParams (',' methodCallParams)*)?')'methodIdentifier=methodName ';';

//statements
ifStm:'if' '(' ifCondition ')' opener ifBlock=ifExprsensions closer (('?' '(' ifCondition ')' opener ifElseBlock=ifExprsensions closer)* ('?' opener elseBlock=ifExprsensions closer)?)?;
whileStm: 'REPEAT' opener nonGlobalExpr* closer 'UNTIL' '(' ifCondition ')';
forStm: 'for' '(' varDecl forCondition ';' idCrement=IDcrement '(' idValue=variableName ')' ')' opener nonGlobalExpr* closer;

//user input/output
writeExpr: 'WRITE(' (writevalues) ( '+' writevalues)* ');';
writevalues: mathExpr       #writeMath
|stringvalues               #writeString;
readIntExpr: 'READINT';
readStringExpr: 'READSTRING';

ifExprsensions:nonGlobalExpr*;



//mathmetic expressions
mathExpr: '(' mathExpr ')'                                                               #parenthesisExpression
                    | '-' mathExpr                                                       #minusFirstMathExpression
                    |	leftExpr=mathExpr	op=('*'	|	':')	rightExpr=mathExpr       #multiplyDivideExpression
                    |	leftExpr=mathExpr	op=('+'	|	'-')	rightExpr=mathExpr       #addSubstractExpression
          		    |   value=mathvalues                                                 #mathValuesExpression
           			;



//condition form
mathComparison: identifierLeft=mathExpr lop=LOP identifierRight=mathExpr;


ifCondition: first=mathComparison more=ifConditionMore*;
ifConditionMore: (andOR=('||' | '&&') mathComparison);

forCondition: first=mathComparison more=forConditionMore*;
forConditionMore: (andOR=('||' | '&&') mathComparison);

//parameters
methodDeclParams: intParam          #intParamMethodDecl
| stringParam                       #stringParamMethodDecl;

methodCallParams: intCallParam      #intCallParamMethodCall
| stringCallParam                   #stringCallParamMethodCall;

intCallParam: mathExpr;
stringCallParam: stringvalues;
intParam: '~int' variableName;
stringParam: '~string' variableName;

//types
IDcrement: 'incr'|'decr';
dataType: 'int'|'string';
methodType:'int'|'string'|'void';

//names
nameClass: CLASSNAME;
methodName: STRING;
variableName: STRING;

//values
stringvalues: STRINGVALUE           #stringLiteral
| variableName                      #stringVariable
| readStringExpr                    #stringRead;

mathvalues:  variableName           #intvariable
|INT                                #intlitteral
| readIntExpr                       #intread;

//openers and closers
opener: '/';
closer: '\\';

//operators
OP:'+'|'-'|'*'|':';
LOP:'<'|'<='|'>'|'>='|'=='|'!=';

//datatype
INT: '0'	|	[1-9][0-9]*;
STRING: [a-z] [a-zA-Z0-9]*;
CLASSNAME: [A-Z] [a-zA-Z0-9]*;
STRINGVALUE: '"' [a-zA-Z0-9]* '"';

//skippers
WL:	[\n\t\r] ->	skip;       //skip enter or tabs
WS: ' ' -> skip;           //skip whitespace