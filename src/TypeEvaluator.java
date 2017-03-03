import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by lars on 2/21/2017.
 */
public class TypeEvaluator extends LangBaseVisitor<Type> {

    @Override
    public Type visitProg(LangParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Type visitVarDecl(LangParser.VarDeclContext ctx) throws EvaluateException {
        Type type = visit(ctx.type);
        Type identifier = visit(ctx.identifier);
        Type value = visit(ctx.value);
        Type value2 = visit(ctx.value2);
        if (type.equals("int")) {
            if ((identifier == Type.STRING && value == Type.INT) || (identifier == Type.STRING && value2 == Type.INT)) {
                return Type.INT;
            }
        } else if (type.equals("string")) {
            if ((identifier == Type.STRING && value == Type.STRING) || (identifier == Type.STRING && value2 == Type.STRING)) {
                return Type.STRING;
            }
        }
        throw new EvaluateException("Incompatible type");
    }

    @Override
    public Type visitVarMod(LangParser.VarModContext ctx) {
        Type identifier = visit(ctx.identifier);
        Type value = visit(ctx.value);
        Type value2 = visit(ctx.value2);
        if ((identifier == Type.STRING && value == Type.INT) || (identifier == Type.STRING && value2 == Type.INT)) {
            return Type.INT;
        } else if ((identifier == Type.STRING && value == Type.STRING) || (identifier == Type.STRING && value2 == Type.STRING)) {
            return Type.STRING;
        }

        throw new EvaluateException("Incompatible type");

}

    @Override
    public Type visitCondition(LangParser.ConditionContext ctx) throws EvaluateException {
        Type identifierLeft = visit(ctx.identifierLeft);
        Type identifierRight = visit(ctx.identifierRight);

        if (identifierLeft == Type.INT && identifierRight == Type.INT) {
            return Type.BOOL;
        }
        throw new EvaluateException("Incompatible type");
    }

    @Override
    public Type visitMethodDecl(LangParser.MethodDeclContext ctx) throws EvaluateException {
        Type returnType = visit(ctx.returntype);
        Type voidReturnType = visit(ctx.voidreturntype);

        Type returnvalue = visit(ctx.returnvalue);

        if (returnType.equals("int")) {
            if (returnvalue == Type.INT) {
                return Type.INT;
            }
            throw new EvaluateException("Incompatible Type");
        } else if (returnType.equals("string")) {
            if (returnvalue == Type.STRING) {
                return Type.STRING;
            }
            throw new EvaluateException("Incompatible Type");
        } else if (voidReturnType.equals("void")) {
            if (returnvalue == null) {
                return Type.NULL;
            }
            throw new EvaluateException("Incompatible Type");
        }

        throw new EvaluateException("Incompatible Type");
    }

    //mathmetics
    @Override
    public Type visitIntLitteralExpression(LangParser.IntLitteralExpressionContext ctx) {
        return Type.INT;
    }

    @Override
    public Type visitMinusFirstExpression(LangParser.MinusFirstExpressionContext ctx) {
        Type expression = visit(ctx.mathExpr());
        if (expression == Type.INT) {
            return Type.INT;
        }
        throw new EvaluateException("Incompatible type");
    }

    @Override
    public Type visitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx) {
        Type left = visit(ctx.leftExpr);
        Type right = visit(ctx.rightExpr);
        if (left == Type.INT && right == Type.INT) {
            return Type.INT;
        }
        throw new EvaluateException("Incompatible type");
    }

    @Override
    public Type visitParenthesisExpression(LangParser.ParenthesisExpressionContext ctx) {
        return visit(ctx.mathExpr());
    }

    @Override
    public Type visitAddSubstractExpression(LangParser.AddSubstractExpressionContext ctx) {
        Type left = visit(ctx.leftExpr);
        Type right = visit(ctx.rightExpr);
        if (left == Type.INT && right == Type.INT) {
            return Type.INT;
        }
        throw new EvaluateException("Incompatible type");
    }
}