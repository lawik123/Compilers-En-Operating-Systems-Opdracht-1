/**
 * Created by Lawik Ayoub on 15-Feb-17.
 */
public class Evaluator extends LangBaseVisitor<Integer> {































    //mathmetics
    @Override
    public Integer visitProg(LangParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Integer visitIntLitteralExpression(LangParser.IntLitteralExpressionContext ctx) {
        return Integer.parseInt(ctx.INT().getText());
    }

    @Override
    public Integer visitMinusFirstExpression(LangParser.MinusFirstExpressionContext ctx) {
        return -visit(ctx.mathExpr());
    }

    @Override
    public Integer visitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx) {
        int left = visit(ctx.leftExpr);
        int right = visit(ctx.rightExpr);

        if(ctx.op.getText().equals("*")){
            return left*right;
        }
        return left/right;
    }

    @Override
    public Integer visitParenthesisExpression(LangParser.ParenthesisExpressionContext ctx) {
        return visit(ctx.mathExpr());
    }

    @Override
    public Integer visitAddSubstractExpression(LangParser.AddSubstractExpressionContext ctx) {
        int left = visit(ctx.leftExpr);
        int right = visit(ctx.rightExpr);

        if(ctx.op.getText().equals("+")){
            return left+right;
        }
        return left-right;
    }

    @Override
    public Integer visitCompareExpression(LangParser.CompareExpressionContext ctx) {
        int left = visit(ctx.leftExpr);
        int right = visit(ctx.rightExpr);

        if(ctx.op.getText().equals("<")){
            if(left<right){
                return 1;
            }
            return 0;
        }
        else if(ctx.op.getText().equals("<=")){
            if(left<=right){
                return 1;
            }
            return 0;
        }
        else if(ctx.op.getText().equals(">")){
            if(left>right){
                return 1;
            }
            return 0;
        }
        else{
            if(left>=right){
                return 1;
            }
            return 0;
        }
    }
}
