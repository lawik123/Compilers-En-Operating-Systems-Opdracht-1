import javax.xml.crypto.Data;

/**
 * Created by lars on 2/21/2017.
 */
public class TypeEvaluator extends LangBaseVisitor<DataType> {

    @Override
    public DataType visitProg(LangParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public DataType visitVarDecl(LangParser.VarDeclContext ctx) throws EvaluateException {
        DataType type = visit(ctx.type);
        DataType identifier = visit(ctx.identifier);
        DataType value = visit(ctx.value);      //variable
        DataType value2 = visit(ctx.value2);    //read expr
        DataType value3 = visit(ctx.value3);    //math expr
        if (type.equals("int")) {
            if ((identifier == DataType.STRING && value == DataType.INT) || (identifier == DataType.STRING && value2 == DataType.INT || (identifier == DataType.STRING && value3 == DataType.INT))) {
                return DataType.INT;
            }
            throw new EvaluateException("Incompatible types");

        } else if (type.equals("string")) {
            if ((identifier == DataType.STRING && value == DataType.STRING) || (identifier == DataType.STRING && value2 == DataType.STRING)) {
                return DataType.STRING;
            }
            throw new EvaluateException("Incompatible types");
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitVarMod(LangParser.VarModContext ctx) {
        DataType identifier = visit(ctx.identifier);
        DataType value = visit(ctx.value);
        DataType value2 = visit(ctx.value2);
        if ((identifier == DataType.STRING && value == DataType.INT) || (identifier == DataType.STRING && value2 == DataType.INT)) {
            return DataType.INT;
        } else if ((identifier == DataType.STRING && value == DataType.STRING) || (identifier == DataType.STRING && value2 == DataType.STRING)) {
            return DataType.STRING;
        }
        throw new EvaluateException("Incompatible types");

}

    @Override
    public DataType visitCondition(LangParser.ConditionContext ctx) throws EvaluateException {
        DataType identifierLeft = visit(ctx.identifierLeft);
        DataType identifierRight = visit(ctx.identifierRight);

        if (identifierLeft == DataType.INT && identifierRight == DataType.INT) {
            return DataType.BOOL;
        }
        throw new EvaluateException("Incompatible types");
    }

    @Override
    public DataType visitMethodDecl(LangParser.MethodDeclContext ctx) throws EvaluateException {
        DataType returnType = visit(ctx.returntype);
        DataType voidReturnType = visit(ctx.voidreturntype);

        DataType returnvalue = visit(ctx.returnvalue);

        if (returnType.equals("int")) {
            if (returnvalue == DataType.INT) {
                return DataType.INT;
            }
            throw new EvaluateException("Return Type is not an Integer");
        } else if (returnType.equals("string")) {
            if (returnvalue == DataType.STRING) {
                return DataType.STRING;
            }
            throw new EvaluateException("Return Type is not a String");
        } else if (voidReturnType.equals("void")) {
            if (returnvalue == null) {
                return DataType.NULL;
            }
            throw new EvaluateException("Method declaration is void, no return type needed");
        }

        throw new EvaluateException("Incompatible types");
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
