import javafx.scene.control.PasswordField;

import java.util.ArrayList;

/**
 * Created by lars on 3/12/2017.
 */
public class CodeGenerator extends LangBaseVisitor<ArrayList<String>> {
    Scope currentScope = null;

    @Override
    public ArrayList<String> visitProg(LangParser.ProgContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add(".class public " + ctx.className.getText());
        code.add(".super java/lang/Object");
        code.add(".method public <init>()V\n" +
                "\taload_0\n" +
                "\tinvokenonvirtual java/lang/Object/<init>()V\n" +
                "\treturn\n" +
                ".end method");
        code.add(".method public static main([Ljava/lang/String;)V");
        for(int i =0; i<ctx.expression().size();i++){
            code.addAll(visit(ctx.expression(i)));
        }
        return code;
    }


    @Override
    public ArrayList<String> visitMathValuesExpression(LangParser.MathValuesExpressionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.value));
        return code;
    }

    @Override
    public ArrayList<String> visitParenthesisExpression(LangParser.ParenthesisExpressionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.mathExpr()));
        return code;
    }

    @Override
    public ArrayList<String> visitMinusFirstMathExpression(LangParser.MinusFirstMathExpressionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        ArrayList<String> visits = new ArrayList<>();
        visits.addAll(visit(ctx.mathExpr()));
        String[] splitter = (visits.get(0)).split(" ");
        String output = splitter[0] + " -" + splitter[1];
        code.add(output);
        for(int i =1; i<visits.size();i++){
            code.add(visits.get(i));
        }

        return code;
    }

    @Override
    public ArrayList<String> visitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        if(ctx.op.getText().equals("*")){
            code.addAll(visit(ctx.leftExpr));
            code.addAll(visit(ctx.rightExpr));
            code.add("imul");
            return code;
        }
        else if(ctx.op.getText().equals(":")){
            code.addAll(visit(ctx.leftExpr));
            code.addAll(visit(ctx.rightExpr));
            code.add("idiv");
            return code;
        }
        return code;
    }

    @Override
    public ArrayList<String> visitAddSubstractExpression(LangParser.AddSubstractExpressionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        if(ctx.op.getText().equals("+")){
            code.addAll(visit(ctx.leftExpr));
            code.addAll(visit(ctx.rightExpr));
            code.add("iadd");
            return code;
        }
        else if(ctx.op.getText().equals("-")){
                code.addAll(visit(ctx.leftExpr));
                code.addAll(visit(ctx.rightExpr));
                code.add("isub");
                return code;
            }
        return code;
    }

    @Override
    public ArrayList<String> visitIntvariable(LangParser.IntvariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("iload "+currentScope.lookupJasminPosition(ctx.getText()));
        return code;
    }

    @Override
    public ArrayList<String> visitIntlitteral(LangParser.IntlitteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc "+ ctx.getText());
        return code;
    }

//    @Override
//    public ArrayList<String> visitIntread(LangParser.IntreadContext ctx) {
//        ArrayList<String> code = new ArrayList<>();
//
//    }
}
