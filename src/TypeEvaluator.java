import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lars on 2/21/2017.
 */
public class TypeEvaluator extends LangBaseVisitor<DataType> {

    //variables
    private Scope globalScope;
    private Scope currentScope;

    //open "class" declare global scope
    @Override
    public DataType visitProg(LangParser.ProgContext ctx) {
        globalScope = new Scope();
        for (int i = 0; i < ctx.methodnames().getChildCount(); i++) {
            String[] split = ctx.methodnames().getChild(i).getText().split("/");
            String[] split2 = split[0].split("\\)");
            String[] split3 = split[0].split("\\(");
            Symbol lookUpMethod = globalScope.lookupMethod(split2[1]);
            if (lookUpMethod == null) {
                MethodType newMethod = null;
                switch (split3[0]) {
                    case "~void":
                        newMethod = new MethodType(DataType.VOID);
                        break;
                    case "~int":
                        newMethod = new MethodType(DataType.INT);
                        break;
                    case "~string":
                        newMethod = new MethodType(DataType.STRING);
                        break;
                }
                try {
                    String child = "";
                    int counter = 2;
                    while (!child.equals(")")) {
                        child = ctx.methodnames().getChild(i).getChild(counter).getText();
                        if (!child.equals(",")) {
                            if (child.contains("~int")) {

                                newMethod.addParameter(DataType.INT);
                            } else if (child.contains("~string")) {
                                newMethod.addParameter(DataType.STRING);
                            }
                        }
                        counter++;
                    }

                } catch (NullPointerException npe) {

                }
                globalScope.declareMethod(split2[1], newMethod);
            } else {
                throw new EvaluateException("Method already exists");
            }

        }
        return super.visitProg(ctx);
    }

    @Override
    public DataType visitRunMethod(LangParser.RunMethodContext ctx) {
        currentScope = globalScope.openScope();
        Symbol lookupMethod = globalScope.lookupMethod("run");
        if (lookupMethod == null) {
            MethodType newMethod = new MethodType(DataType.VOID);
            globalScope.declareMethod("run", newMethod);
            for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
                visit(ctx.nonGlobalExpr(i));
            }
            currentScope = currentScope.closeScope();
            return DataType.VOID;
        }
        throw new EvaluateException("Method already exists");
    }

    @Override
    public DataType visitDeclareIntGlobalVariable(LangParser.DeclareIntGlobalVariableContext ctx) {
        String identifier = ctx.identifier.getText();
        DataType value = visit(ctx.mathExpr());
        if (value == DataType.INT) {
            globalScope.declareVariable(identifier, DataType.INT);
            return DataType.INT;

        }
        throw new EvaluateException("value is not an int");
    }

    @Override
    public DataType visitDeclareStringGlobalVariable(LangParser.DeclareStringGlobalVariableContext ctx) {
        String identifier = ctx.identifier.getText();
        DataType value = visit(ctx.stringvalues());
        if (value == DataType.STRING) {
            globalScope.declareVariable(identifier, DataType.STRING);
            return DataType.STRING;

        }
        throw new EvaluateException("value is not a string");
    }

    //variable declarations
    @Override
    public DataType visitDeclareIntVariable(LangParser.DeclareIntVariableContext ctx) {
        String identifier = ctx.identifier.getText();
        DataType value = visit(ctx.mathExpr());
        if (value == DataType.INT) {
            currentScope.declareVariable(identifier, DataType.INT);
            return DataType.INT;

        }
        throw new EvaluateException("value is not an int");
    }

    @Override
    public DataType visitDeclareStringVariable(LangParser.DeclareStringVariableContext ctx) {
        String identifier = ctx.identifier.getText();
        DataType value = visit(ctx.stringvalues());
        if (value == DataType.STRING) {
            currentScope.declareVariable(identifier, DataType.STRING);
            return DataType.STRING;

        }
        throw new EvaluateException("value is not a string");
    }

    //variable modifications
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
        throw new EvaluateException("value is not an int");
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

        throw new EvaluateException("value is not a string");
    }

    //method declarations
    @Override
    public DataType visitVoidMethodDecl(LangParser.VoidMethodDeclContext ctx) {
        currentScope = globalScope.openScope();
        String methodIdentifier = ctx.methodIdentifier.getText();
        Symbol method = globalScope.lookupMethod(methodIdentifier);
        MethodType methodType = (MethodType) method.getType();
//        for (int i = 0; i < ctx.methodDeclParams().size(); i++) {
//            methodType.addParameter(visit(ctx.methodDeclParams(i)));
//        }
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            visit(ctx.nonGlobalExpr(i));
        }
        currentScope = currentScope.closeScope();
        return DataType.VOID;

    }

    @Override
    public DataType visitIntMethodDecl(LangParser.IntMethodDeclContext ctx) {
        currentScope = globalScope.openScope();
        String methodIdentifier = ctx.methodIdentifier.getText();
        Symbol lookupMethod = globalScope.lookupMethod(methodIdentifier);
        DataType returnvalue = null;
        try {
            returnvalue = visit(ctx.mathExpr());
        } catch (NullPointerException npe) {

        }
        if (returnvalue == DataType.INT) {
            MethodType newMethod = (MethodType) lookupMethod.getType();
//            for (int i = 0; i < ctx.methodDeclParams().size(); i++) {
//                newMethod.addParameter(visit(ctx.methodDeclParams(i)));
//            }

            for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
                visit(ctx.nonGlobalExpr(i));
            }
            currentScope = currentScope.closeScope();
            return DataType.INT;
        }
        throw new EvaluateException("Return type is not an int");
    }

    @Override
    public DataType visitStringMethodDecl(LangParser.StringMethodDeclContext ctx) {
        currentScope = globalScope.openScope();
        String methodIdentifier = ctx.methodIdentifier.getText();
        Symbol lookupMethod = globalScope.lookupMethod(methodIdentifier);
        DataType returnvalue = null;
        try {
            returnvalue = visit(ctx.stringvalues());
        } catch (NullPointerException npe) {

        }
        if (returnvalue == DataType.STRING) {
            MethodType newMethod = (MethodType) lookupMethod.getType();
//            for (int i = 0; i < ctx.methodDeclParams().size(); i++) {
//                newMethod.addParameter(visit(ctx.methodDeclParams(i)));
//            }

            for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
                visit(ctx.nonGlobalExpr(i));
            }
            currentScope = currentScope.closeScope();
            return DataType.STRING;
        }
        throw new EvaluateException("Return type is not a string");

    }

    //method declaration parameters
    @Override
    public DataType visitIntParamMethodDecl(LangParser.IntParamMethodDeclContext ctx) {
        return visit(ctx.intParam());
    }

    @Override
    public DataType visitStringParamMethodDecl(LangParser.StringParamMethodDeclContext ctx) {
        return visit(ctx.stringParam());
    }

    //call method visitor
    @Override
    public DataType visitCallMethodExpr(LangParser.CallMethodExprContext ctx) {
        String methodName = ctx.methodIdentifier.getText();
        Symbol methodSymbol = globalScope.lookupMethod(methodName);
        if (methodSymbol != null) {
            MethodType calledMethod = (MethodType) methodSymbol.getType();

            ArrayList<DataType> dataTypes = new ArrayList<>();
            for (int i = 0; i < ctx.methodCallParams().size(); i++) {
                dataTypes.add(visit(ctx.methodCallParams(i)));
            }
            if (dataTypes.size() == calledMethod.getParameters().size()) {
                for (int i = 0; i < dataTypes.size(); i++) {
                    if (dataTypes.get(i) != calledMethod.getParameters().get(i)) {
                        throw new EvaluateException("Parameters types do not match");
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

    //method call parameters
    @Override
    public DataType visitIntCallParamMethodCall(LangParser.IntCallParamMethodCallContext ctx) {
        return visit(ctx.intCallParam());
    }

    @Override
    public DataType visitStringCallParamMethodCall(LangParser.StringCallParamMethodCallContext ctx) {
        return visit(ctx.stringCallParam());
    }

    //statement visitors
    @Override
    public DataType visitIfStm(LangParser.IfStmContext ctx) {
        currentScope = currentScope.openScope();
        for (int i = 0; i < ctx.ifExprsensions().size(); i++) {
            visit(ctx.ifExprsensions(i));
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
    //String
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
    public DataType visitStringParam(LangParser.StringParamContext ctx) {
        return DataType.STRING;
    }

    @Override
    public DataType visitStringCallParam(LangParser.StringCallParamContext ctx) {
        return DataType.STRING;
    }

    //Int
    @Override
    public DataType visitIntvariable(LangParser.IntvariableContext ctx) {
        return DataType.INT;
    }

    @Override
    public DataType visitIntread(LangParser.IntreadContext ctx) {
        return DataType.INT;
    }

    @Override
    public DataType visitIntlitteral(LangParser.IntlitteralContext ctx) {
        return DataType.INT;
    }

    @Override
    public DataType visitIntParam(LangParser.IntParamContext ctx) {
        return DataType.INT;
    }

    @Override
    public DataType visitIntCallParam(LangParser.IntCallParamContext ctx) {
        return DataType.INT;
    }
}
