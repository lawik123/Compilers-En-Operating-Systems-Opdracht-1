import java.util.ArrayList;

/**
 * Created by lars on 3/12/2017.
 */
public class CodeGenerator extends LangBaseVisitor<ArrayList<String>> {

    @Override
    public ArrayList<String> visitProg(LangParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }


    @Override
    public ArrayList<String> visitMathValuesExpression(LangParser.MathValuesExpressionContext ctx) {
        return super.visitMathValuesExpression(ctx);
    }

    @Override
    public ArrayList<String> visitParenthesisExpression(LangParser.ParenthesisExpressionContext ctx) {
        return super.visitParenthesisExpression(ctx);
    }

    @Override
    public ArrayList<String> visitMinusFirstMathExpression(LangParser.MinusFirstMathExpressionContext ctx) {
        return super.visitMinusFirstMathExpression(ctx);
    }

    @Override
    public ArrayList<String> visitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx) {
        return super.visitMultiplyDivideExpression(ctx);
    }

    @Override
    public ArrayList<String> visitAddSubstractExpression(LangParser.AddSubstractExpressionContext ctx) {
        return super.visitAddSubstractExpression(ctx);
    }
}
