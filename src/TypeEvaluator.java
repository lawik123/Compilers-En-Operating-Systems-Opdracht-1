import javax.xml.crypto.Data;
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


    @Override
    public DataType visitDeclareIntVariable(LangParser.DeclareIntVariableContext ctx) {
        String globalizer = ctx.isGlobal.getText();
        String identifier = ctx.identifier.getText();
        DataType value = visit(ctx.mathExpr());
        if(value==DataType.INT){
            if(globalizer.equals("global")) {
                globalScope.declareVariable(identifier, DataType.INT, true);
                return DataType.INT;
            } else {
                //todo add variable to current scope
            }
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitDeclareStringVariable(LangParser.DeclareStringVariableContext ctx) {
        String globalizer = ctx.isGlobal.getText();
        String identifier = ctx.identifier.getText();
        DataType value = visit(ctx.stringvalues());
        if(value==DataType.STRING){
            if(globalizer.equals("global")) {
                globalScope.declareVariable(identifier, DataType.STRING, true);
                return DataType.STRING;
            } else {
                //todo add variable to current scope
            }
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitVariableValue(LangParser.VariableValueContext ctx) {
        return super.visitVariableValue(ctx);
    }

    @Override
    public DataType visitStringvalues(LangParser.StringvaluesContext ctx) {
        return DataType.STRING;
    }

    @Override
    public DataType visitVarMod(LangParser.VarModContext ctx) {
//        DataType identifier = visit(ctx.identifier);
        DataType value = visit(ctx.value);
//        DataType value2 = visit(ctx.value2);
        if (value == DataType.INT) {
            return DataType.INT;
        } else if (value == DataType.STRING) {
            return DataType.STRING;
        }
        throw new EvaluateException("Incompatible types");
}

    @Override
    public DataType visitCloser(LangParser.CloserContext ctx) {
        return super.visitCloser(ctx);
    }



    @Override
    public DataType visitMethodDecl(LangParser.MethodDeclContext ctx) throws EvaluateException {
        String methodType = ctx.type.getText();
        String methodIdentifier = ctx.methodIdentifier.getText();
        String methodParamType = ctx.methodParamType.getText();

        DataType returnvalue = visit(ctx.returnvalue);

        currentScope = globalScope.openScope();

        if (methodType.equals("int")) {
            if (returnvalue == DataType.INT) {
                MethodType newMethod = new MethodType(DataType.INT);
                if(methodParamType.equals("int")) {
                    newMethod.addParameter(DataType.INT);
                } else if(methodParamType.equals("string")){
                    newMethod.addParameter(DataType.STRING);
                }
                globalScope.declareMethod(methodIdentifier, newMethod);
                //todo visit children
                currentScope.closeScope();
                return DataType.INT;
            }
            throw new EvaluateException("Return Type is not an Integer");
        } else if (methodType.equals("string")) {
            if (returnvalue == DataType.STRING) {
                MethodType newMethod = new MethodType(DataType.STRING);
                if(methodParamType.equals("int")) {
                    newMethod.addParameter(DataType.INT);
                } else if(methodParamType.equals("string")){
                    newMethod.addParameter(DataType.STRING);
                }
                globalScope.declareMethod(methodIdentifier, newMethod);
                currentScope.closeScope();
                return DataType.STRING;
            }
            throw new EvaluateException("Return Type is not a String");
        } else if (methodType.equals("void")) {
            if (returnvalue == null) {
                MethodType newMethod = new MethodType(DataType.VOID);
                if(methodParamType.equals("int")) {
                    newMethod.addParameter(DataType.INT);
                } else if(methodParamType.equals("string")){
                    newMethod.addParameter(DataType.STRING);
                }
                globalScope.declareMethod(methodIdentifier, newMethod);
                currentScope.closeScope();
                return DataType.NULL;
            }
            throw new EvaluateException("Method declaration is void, no return type needed");
        }

        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitReturnvalues(LangParser.ReturnvaluesContext ctx) {
        return super.visitReturnvalues(ctx);
    }

    //mathExpression visitors
    @Override
    public DataType visitMathValuesExpression(LangParser.MathValuesExpressionContext ctx) {
        return DataType.INT;
    }

    @Override
    public DataType visitMinusFirstMathExpression(LangParser.MinusFirstMathExpressionContext ctx) {
        DataType expression  = visit(ctx.mathExpr());
        if(expression== DataType.INT) {
            return DataType.INT;
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx) {
        DataType left = visit(ctx.leftExpr);
        DataType right = visit(ctx.rightExpr);
        if(left== DataType.INT&&right== DataType.INT) {
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
        if(left== DataType.INT&&right== DataType.INT) {
            return DataType.INT;
        }
        throw new EvaluateException("Incompatible types");
    }



}
