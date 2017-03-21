import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lars on 2/21/2017.
 */
public class TypeEvaluator extends LangBaseVisitor<DataType> {

    private Scope globalScope;
    private Scope currentScope;

    @Override
    public DataType visitProg(LangParser.ProgContext ctx) {
        globalScope = new Scope();
        return super.visitProg(ctx);
    }

//    @Override
//    public DataType visitVarDecl(LangParser.VarDeclContext ctx) throws EvaluateException {
//        String type = ctx.type.getText();
////        DataType identifier = visit(ctx.identifier);
//        DataType value = visit(ctx.value);      //variable
////        DataType value2 = visit(ctx.value2);    //read expr
////        DataType value3 = visit(ctx.value3);    //math expr
//        if (type.equals("int")) {
//            if (value == DataType.INT) {
//                return DataType.INT;
//            }
//            throw new EvaluateException("Incompatible types");
//
//        } else if (type.equals("string")) {
//            if (value==DataType.STRING) {
//                return DataType.STRING;
//            }
//            throw new EvaluateException("Incompatible types");
//        }
//        throw new EvaluateException("Incompatible types");
//    }


    //variable visitors
    @Override
    public DataType visitDeclareIntVariable(LangParser.DeclareIntVariableContext ctx) {
        String globalizer = null;
        try {
            globalizer = ctx.isGlobal.getText();
        } catch (NullPointerException npe) {

        }

        String identifier = ctx.identifier.getText();
        DataType value = visit(ctx.mathExpr());
        if (value == DataType.INT) {
            if (globalizer != null && globalizer.equals("global")) {
                globalScope.declareVariable(identifier, DataType.INT);
                return DataType.INT;
            } else {
                currentScope.declareVariable(identifier, DataType.INT);
                return DataType.INT;
            }
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitDeclareStringVariable(LangParser.DeclareStringVariableContext ctx) {
        String globalizer = null;
        try {
            globalizer = ctx.isGlobal.getText();
        } catch (NullPointerException npe) {

        }

        String identifier = ctx.identifier.getText();
        DataType value = visit(ctx.stringvalues());
        if (value == DataType.STRING) {
            if (globalizer != null && globalizer.equals("global")) {
                globalScope.declareVariable(identifier, DataType.STRING);
                return DataType.STRING;
            } else {
                currentScope.declareVariable(identifier, DataType.STRING);
                return DataType.STRING;
            }
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitVariableValue(LangParser.VariableValueContext ctx) {
        return super.visitVariableValue(ctx);
    }

    @Override
    public DataType visitIntVarModify(LangParser.IntVarModifyContext ctx) {
        String identifier = ctx.identifier.getText();

        //get the variable from the scope
        Symbol variableSymbol = currentScope.lookupVariable(identifier);
        //get the DataType from the variable
        VariableType variableToModify = (VariableType) variableSymbol.getType();

        DataType value = visit(ctx.value);
        if (variableToModify.getDataType() == DataType.INT) {        //check variable DataType with values DataType
            if (value == DataType.INT) {
                return DataType.INT;
            }
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitStringVarModify(LangParser.StringVarModifyContext ctx) {
        String identifier = ctx.identifier.getText();

        //get the variable from the scope
        Symbol variableSymbol = currentScope.lookupVariable(identifier);
        //get the DataType from the variable
        VariableType variableToModify = (VariableType) variableSymbol.getType();

        DataType value = visit(ctx.value);

        if (variableToModify.getDataType() == DataType.STRING) {
            if (value == DataType.STRING) {
                return DataType.STRING;
            }
        }

        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitCloser(LangParser.CloserContext ctx) {
        return super.visitCloser(ctx);
    }


    //method visitors
    @Override
    public DataType visitMethodDecl(LangParser.MethodDeclContext ctx) throws EvaluateException {

        String methodType = ctx.type.getText();
        String methodIdentifier = ctx.methodIdentifier.getText();
        String params = null;
        Symbol lookupMethod = globalScope.lookupMethod(methodIdentifier);
        DataType returnvalue = null;
        try {
            params = ctx.params().getText();
        } catch (NullPointerException npe) {

        }
        try {
            returnvalue = visit(ctx.returnvalue);
        } catch (NullPointerException npe) {

        }

        currentScope = globalScope.openScope();
        if (lookupMethod == null) {
            if (methodType.equals("int")) {
                if (returnvalue == DataType.INT) {
                    MethodType newMethod = new MethodType(DataType.INT);
                    if (params != null) {
                        newMethod.addParameter(visit(ctx.params()));
                    }
                    for (int i = 0; i < ctx.params2().size(); i++) {
                        newMethod.addParameter(visit(ctx.params2(i)));
                    }
                    globalScope.declareMethod(methodIdentifier, newMethod);
                    for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
                        visit(ctx.nonGlobalExpr(i));
                    }
                    currentScope = currentScope.closeScope();
                    return DataType.INT;
                }
                throw new EvaluateException("Return Type is not an Integer");
            } else if (methodType.equals("string")) {
                if (returnvalue == DataType.STRING) {
                    MethodType newMethod = new MethodType(DataType.STRING);
                    if (params != null) {
                        newMethod.addParameter(visit(ctx.params()));
                    }
                    for (int i = 0; i < ctx.params2().size(); i++) {
                        newMethod.addParameter(visit(ctx.params2(i)));
                    }
                    globalScope.declareMethod(methodIdentifier, newMethod);
                    for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
                        visit(ctx.nonGlobalExpr(i));
                    }
                    currentScope = currentScope.closeScope();
                    return DataType.STRING;
                }
                throw new EvaluateException("Return Type is not a String");
            } else if (methodType.equals("void")) {
                if (ctx.returnvalue == null) {
                    MethodType newMethod = new MethodType(DataType.VOID);
                    if (params != null) {
                        newMethod.addParameter(visit(ctx.params()));
                    }
                    for (int i = 0; i < ctx.params2().size(); i++) {
                        newMethod.addParameter(visit(ctx.params2(i)));
                    }
                    globalScope.declareMethod(methodIdentifier, newMethod);
                    for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
                        visit(ctx.nonGlobalExpr(i));
                    }
                    currentScope = currentScope.closeScope();
                    return DataType.VOID;
                }
                throw new EvaluateException("Method declaration is void, no return type needed");
            }
        }
        throw new EvaluateException("Method already exists");
    }

    @Override
    public DataType visitParams(LangParser.ParamsContext ctx) {
        String type = ctx.methodParamType.getText();
        if (type.equals("int")) {
            return DataType.INT;
        } else if (type.equals("string")) {
            return DataType.STRING;
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitParams2(LangParser.Params2Context ctx) {
        String type = ctx.methodParamType2.getText();
        if (type.equals("int")) {
            return DataType.INT;
        } else if (type.equals("string")) {
            return DataType.STRING;
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitReturnvalues(LangParser.ReturnvaluesContext ctx) {
        return super.visitReturnvalues(ctx);
    }

    //statement visitors
    @Override
    public DataType visitIfStm(LangParser.IfStmContext ctx) {
        currentScope = currentScope.openScope();
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            visit(ctx.nonGlobalExpr(i));
        }
        currentScope = currentScope.closeScope();
        return super.visitIfStm(ctx);
    }

    @Override
    public DataType visitWhileStm(LangParser.WhileStmContext ctx) {
        currentScope = currentScope.openScope();
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            visit(ctx.nonGlobalExpr(i));
        }
        currentScope = currentScope.closeScope();
        return super.visitWhileStm(ctx);
    }

    @Override
    public DataType visitForStm(LangParser.ForStmContext ctx) {
        currentScope = currentScope.openScope();
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            visit(ctx.nonGlobalExpr(i));
        }
        currentScope = currentScope.closeScope();
        return super.visitForStm(ctx);
    }

    @Override
    public DataType visitCallMethodExpr(LangParser.CallMethodExprContext ctx) {
        String methodName = ctx.methodIdentifier.getText();
        Symbol methodSymbol = globalScope.lookupMethod(methodName);
        if (methodSymbol != null) {
            MethodType calledMethod = (MethodType) methodSymbol.getType();
            ArrayList<DataType> dataTypes = new ArrayList<>();
            try {
                dataTypes.add(visit(ctx.params3()));
                for (int i = 0; i < ctx.params4().size(); i++) {
                    dataTypes.add(visit(ctx.params4(i)));
                }
            } catch (NullPointerException npe) {

            }
            if (dataTypes.size() == calledMethod.getParameters().size()) {
                for (int i = 0; i < dataTypes.size(); i++) {
                    if (dataTypes.get(i) != calledMethod.getParameters().get(i)) {
                        throw new EvaluateException("Parameters do not match");
                    }
                }
            } else {
                throw new EvaluateException("Parameters do not match");
            }
            return calledMethod.getReturnType();
        } else {
            throw new EvaluateException("method does not exist");
        }
    }

    @Override
    public DataType visitParams3(LangParser.Params3Context ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public DataType visitParams4(LangParser.Params4Context ctx) {
        return visit(ctx.getChild(0));
    }

    //mathExpression visitors
    @Override
    public DataType visitMinusFirstMathExpression(LangParser.MinusFirstMathExpressionContext ctx) {
        DataType expression = visit(ctx.mathExpr());
        if (expression == DataType.INT) {
            return DataType.INT;
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx) {
        DataType left = visit(ctx.leftExpr);
        DataType right = visit(ctx.rightExpr);
        if (left == DataType.INT && right == DataType.INT) {
            return DataType.INT;
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitParenthesisExpression(LangParser.ParenthesisExpressionContext ctx) {
        return visit(ctx.mathExpr());
    }

    @Override
    public DataType visitAddSubstractExpression(LangParser.AddSubstractExpressionContext ctx) {
        DataType left = visit(ctx.leftExpr);
        DataType right = visit(ctx.rightExpr);
        if (left == DataType.INT && right == DataType.INT) {
            return DataType.INT;
        }
        throw new EvaluateException("Incompatible types");
    }

    //Getters for the DataType control
    @Override
    public DataType visitStringLiteral(LangParser.StringLiteralContext ctx) {
        return DataType.STRING;
    }

    @Override
    public DataType visitStringVariable(LangParser.StringVariableContext ctx) {
        return DataType.STRING;
    }

    @Override
    public DataType visitStringRead(LangParser.StringReadContext ctx) {
        return DataType.STRING;
    }

    @Override
    public DataType visitMathValuesExpression(LangParser.MathValuesExpressionContext ctx) {
        return DataType.INT;
    }

    @Override
    public DataType visitReadIntExpr(LangParser.ReadIntExprContext ctx) {
        return DataType.INT;
    }

    @Override
    public DataType visitReadStringExpr(LangParser.ReadStringExprContext ctx) {
        return DataType.STRING;
    }
}
