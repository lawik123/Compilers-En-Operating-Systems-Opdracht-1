import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by lars on 3/12/2017.
 */
public class CodeGenerator extends LangBaseVisitor<ArrayList<String>> {
    private MethodFrame currentMethodFrame;
    private MethodFrame globalFrame;
    private int labelCount = 1;

    private int ifStmConditionCounter = 0;
    private int whileStmCounter = 0;
    private int forStmCounter = 0;
    private int conditionCounter = 0;

    private String currentMethod;
    private HashMap<String, String> methodTypes = new HashMap<>();
    private HashMap<String, ArrayList<String>> parameterNames = new HashMap<>();
    private HashMap<String, String> returnTypes = new HashMap<>();

    private boolean hasElse;

    @Override
    public ArrayList<String> visitProg(LangParser.ProgContext ctx) {
        globalFrame = new MethodFrame();
        ArrayList<String> code = new ArrayList<>();
        code.add(".class public " + ctx.className.getText());
        code.add(".super java/lang/Object");
        code.add(".method public <init>()V\n" +
                "\taload_0\n" +
                "\tinvokenonvirtual java/lang/Object/<init>()V\n" +
                "\treturn\n" +
                ".end method");
        code.add(".method public static main([Ljava/lang/String;)V");
        for (int i = 0; i < ctx.expression().size(); i++) {
            code.addAll(visit(ctx.expression(i)));
        }
        return code;
    }

    @Override
    public ArrayList<String> visitCallMethodExpr(LangParser.CallMethodExprContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        for (int i = ctx.params4().size(); i > 0; i--) {
            code.addAll(visit(ctx.params4(i)));
        }
        code.addAll(visit(ctx.params3()));
        String dataTypes = methodTypes.get(ctx.methodIdentifier.getText());
        code.add("invokevirtual " + ctx.methodIdentifier.getText() + "(" + dataTypes + ")" + returnTypes.get(ctx.methodIdentifier.getText()));
        currentMethodFrame = new MethodFrame();
        for (int i = 0; i < parameterNames.get(currentMethod).size(); i++) {
            currentMethodFrame.getJasminPosition().put(parameterNames.get(currentMethod).get(i), "" + i + "");
        }


        return code;
    }

    @Override
    public ArrayList<String> visitParams3(LangParser.Params3Context ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.getChild(0)));
        return code;
    }

    @Override
    public ArrayList<String> visitParams4(LangParser.Params4Context ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.getChild(0)));
        return code;
    }

    //declarations
    @Override
    public ArrayList<String> visitMethodDecl(LangParser.MethodDeclContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        ArrayList<String> paramTypes = new ArrayList<>();
        currentMethod = ctx.methodIdentifier.getText();
        parameterNames.put(ctx.methodIdentifier.getText(), new ArrayList<>());

        try {
            paramTypes.addAll(visit(ctx.params()));
            for (int i = 0; i < ctx.params2().size(); i++) {
                paramTypes.addAll(visit(ctx.params2(i)));
            }
        } catch (NullPointerException npe) {

        }
        String params = "";
        for (int i = 0; i < paramTypes.size(); i++) {
            params = params + paramTypes.get(i);
        }
        methodTypes.put(ctx.methodIdentifier.getText(), params);

        //declare method
        switch (ctx.type.getText()) {
            case "int":
                code.add(".method public " + ctx.methodIdentifier.getText() + "(" + params + ")I");
                returnTypes.put(ctx.methodIdentifier.getText(), "I");
                break;
            case "string":
                code.add(".method public " + ctx.methodIdentifier.getText() + "(" + params + ")Str");
                returnTypes.put(ctx.methodIdentifier.getText(), "Str");
                break;
            case "void":
                code.add(".method public " + ctx.methodIdentifier.getText() + "(" + params + ")V");
                returnTypes.put(ctx.methodIdentifier.getText(), "V");
                break;
        }
        code.add(".limit stack 99");
        code.add(".limit locals 99");
        //TODO stack limits

        //visit the method statements
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            code.addAll(visit(ctx.nonGlobalExpr(i)));
        }

        //end method and return
        switch (ctx.type.getText()) {
            case "int":
                code.add(ctx.returnvalue.getText());
                code.add("ireturn");
                code.add(".end method");
                break;

            case "string":
                code.add(ctx.returnvalue.getText());
                code.add("Strreturn");
                code.add(".end method");
                break;
            case "void":
                code.add("return");
                code.add(".end method");
                break;
        }
        return code;
    }

    @Override
    public ArrayList<String> visitParams(LangParser.ParamsContext ctx) {
        ArrayList<String> dataTypes = new ArrayList<>();
        parameterNames.get(currentMethod).add(ctx.variableName().getText());
        if (ctx.dataType().getText().equals("int")) {
            dataTypes.add(", I");
        } else {
            dataTypes.add(", Str");
        }
        return dataTypes;
    }

    @Override
    public ArrayList<String> visitParams2(LangParser.Params2Context ctx) {
        ArrayList<String> dataTypes = new ArrayList<>();
        parameterNames.get(currentMethod).add(ctx.variableName().getText());
        if (ctx.dataType().getText().equals("int")) {
            dataTypes.add("I");
        } else {
            dataTypes.add("Str");
        }
        return dataTypes;
    }

    @Override
    public ArrayList<String> visitDeclareIntVariable(LangParser.DeclareIntVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String globalizer = null;
        try {
            globalizer = ctx.isGlobal.getText();
        } catch (NullPointerException npe) {

        }

        String identifier = ctx.identifier.getText();
        if (globalizer != null) {
            globalFrame.declareJasminPosition(identifier, globalFrame.getJasminPosition().size());
            code.addAll(visit(ctx.mathExpr()));
            code.add("istore " + globalFrame.getJasminPosition().size());
        } else {
            currentMethodFrame.declareJasminPosition(identifier, currentMethodFrame.getJasminPosition().size());
            code.addAll(visit(ctx.mathExpr()));
            code.add("istore " + globalFrame.getJasminPosition().size());
        }
        return code;
    }

    @Override
    public ArrayList<String> visitDeclareStringVariable(LangParser.DeclareStringVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String globalizer = null;
        try {
            globalizer = ctx.isGlobal.getText();
        } catch (NullPointerException npe) {

        }

        String identifier = ctx.identifier.getText();
        if (globalizer != null) {
            globalFrame.declareJasminPosition(identifier, globalFrame.getJasminPosition().size());
            code.addAll(visit(ctx.stringvalues()));
            code.add("istore " + globalFrame.getJasminPosition().size());
        } else {
            currentMethodFrame.declareJasminPosition(identifier, currentMethodFrame.getJasminPosition().size());
            code.addAll(visit(ctx.stringvalues()));
            code.add("istore " + currentMethodFrame.getJasminPosition().size());
        }
        return code;
    }

    @Override
    public ArrayList<String> visitIntVarModify(LangParser.IntVarModifyContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        currentMethodFrame.getJasminPosition().remove(ctx.identifier.getText());    //remove last position
        code.add("iload " + currentMethodFrame.getJasminPosition().size());
        currentMethodFrame.declareJasminPosition(ctx.identifier.getText(), currentMethodFrame.getJasminPosition().size());      //create new position
        code.addAll(visit(ctx.mathExpr()));
        code.add("istore " + currentMethodFrame.getJasminPosition().size());
        return code;
    }

    @Override
    public ArrayList<String> visitStringVarModify(LangParser.StringVarModifyContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        currentMethodFrame.getJasminPosition().remove(ctx.identifier.getText());    //remove last position
        code.add("iload " + currentMethodFrame.getJasminPosition().size());
        currentMethodFrame.declareJasminPosition(ctx.identifier.getText(), currentMethodFrame.getJasminPosition().size());      //create new position
        code.addAll(visit(ctx.stringvalues()));
        code.add("Strstore " + currentMethodFrame.getJasminPosition().size());
        return code;
    }

    //statements
    @Override
    public ArrayList<String> visitIfStm(LangParser.IfStmContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        int sizeElseChildren = 0;
        ifStmConditionCounter = ctx.ifCondition().size();
        try {
            //else block
            sizeElseChildren = ctx.elseBlock.children.size();
            hasElse = true;
        } catch (NullPointerException npe) {
            hasElse = false;
        }

        int counter = 0;
        for (int i = 0; i < ctx.ifCondition().size(); i++) {
            if (i == 0) {
                code.addAll(visit(ctx.ifCondition(i)));
                code.add("then: ");
                for (int y = 0; y < ctx.ifBlock.children.size(); y++) {      //if block
                    code.addAll(visit(ctx.nonGlobalExpr(y)));
                }
                counter = ctx.ifBlock.children.size();
            } else if (i < ctx.ifCondition().size()) {     //if else block
                code.add("then_" + i + ":");
                code.addAll(visit(ctx.ifCondition(i)));
                for (int y = 0; y < ctx.ifElseBlock.children.size(); y++) {
                    code.addAll(visit(ctx.nonGlobalExpr(y + counter)));
                }
                counter += ctx.ifElseBlock.children.size();
            }
            if (i == ctx.ifCondition().size() - 1) {
                code.add("goto endif_" + (labelCount));
            }
            if (sizeElseChildren > 0 && i == ctx.ifCondition().size() - 1) {
                code.add("else: ");
                for (int y = 0; y < sizeElseChildren; y++) {
                    code.addAll(visit(ctx.nonGlobalExpr(y + counter)));
                }
            }

        }

        String label = "endif_" + (labelCount++);

        code.add(label + ":");
        return code;
    }

    @Override
    public ArrayList<String> visitWhileStm(LangParser.WhileStmContext ctx) {
        whileStmCounter++;
        ArrayList<String> code = new ArrayList<>();
        code.add("goto whileCondition_" + whileStmCounter);
        code.add("beginWhile_" + whileStmCounter + ":");
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            code.addAll(visit(ctx.nonGlobalExpr(i)));
        }
        code.add("whileCondition_" + whileStmCounter + ":");
        code.addAll(visit(ctx.whileCondition()));
        code.add("endWhile_" + whileStmCounter + ":");
        return code;

    }

    @Override
    public ArrayList<String> visitForStm(LangParser.ForStmContext ctx) {
        forStmCounter++;
        String idValue = null;
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.varDecl()));
        code.add("goto forCondition_" + forStmCounter);
        code.add("beginFor_" + forStmCounter + ":");
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            code.addAll(visit(ctx.nonGlobalExpr(i)));
        }
        code.add("goto forIDCrement_" + forStmCounter);
        try {
            idValue = ctx.idValue.getText();
        } catch (NullPointerException npe) {

        }

        code.add("forIDCrement_" + forStmCounter);
        if (ctx.idCrement.getText().equals("incr")) {
            code.add("iinc " + currentMethodFrame.lookupJasminPosition(ctx.idValue.getText()) + " 1");
        } else {
            code.add("iinc " + currentMethodFrame.lookupJasminPosition(ctx.idValue.getText()) + " -1");
        }

        code.add("forCondition_" + forStmCounter + ":");
        code.addAll(visit(ctx.forCondition()));
        code.add("endFor_" + forStmCounter + ":");
        return code;
    }

    @Override
    public ArrayList<String> visitWhileCondition(LangParser.WhileConditionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String lop = ctx.lop.getText();
        for (int i = 0; i < ctx.mathExpr().size(); i++) {
            code.addAll(visit(ctx.mathExpr(i)));
        }

        switch (lop) {
            case "==":
                code.add("if_icmpqe beginWhile_" + whileStmCounter);
                break;
            case "!=":
                code.add("if_icmpne beginWhile_" + whileStmCounter);
                break;
            case "<":
                code.add("if_icmplt beginWhile_" + whileStmCounter);
                break;
            case "<=":
                code.add("if_icmple beginWhile_" + whileStmCounter);
                break;
            case ">":
                code.add("if_icmpgt beginWhile_" + whileStmCounter);
                break;
            case ">=":
                code.add("if_icmpge beginWhile_" + whileStmCounter);
                break;
        }
        return code;
    }

    @Override
    public ArrayList<String> visitIfCondition(LangParser.IfConditionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String lop = ctx.lop.getText();
        for (int i = 0; i < ctx.mathExpr().size(); i++) {
            code.addAll(visit(ctx.mathExpr(i)));
        }

        if (ifStmConditionCounter == 1 && hasElse || conditionCounter == ifStmConditionCounter - 1) {
            switch (lop) {
                case "==":
                    code.add("if_icmpne else");
                    break;
                case "!=":
                    code.add("if_icmpqe else");
                    break;
                case "<":
                    code.add("if_icmpgt else");
                    break;
                case "<=":
                    code.add("if_icmpge else");
                    break;
                case ">":
                    code.add("if_icmplt else");
                    break;
                case ">=":
                    code.add("if_icmple else");
                    break;
            }
        } else {
            conditionCounter++;
            switch (lop) {
                case "==":
                    code.add("if_icmpne then_" + conditionCounter);
                    break;
                case "!=":
                    code.add("if_icmpqe then_" + conditionCounter);
                    break;
                case "<":
                    code.add("if_icmpgt then_" + conditionCounter);
                    break;
                case "<=":
                    code.add("if_icmpge then_" + conditionCounter);
                    break;
                case ">":
                    code.add("if_icmplt then_" + conditionCounter);
                    break;
                case ">=":
                    code.add("if_icmple then_" + conditionCounter);
                    break;
            }

        }
        return code;
    }

    @Override
    public ArrayList<String> visitForCondition(LangParser.ForConditionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String lop = ctx.lop.getText();
        for (int i = 0; i < ctx.mathExpr().size(); i++) {
            code.addAll(visit(ctx.mathExpr(i)));
        }

        switch (lop) {
            case "==":
                code.add("if_icmpqe beginFor_" + forStmCounter);
                break;
            case "!=":
                code.add("if_icmpne beginFor_" + forStmCounter);
                break;
            case "<":
                code.add("if_icmplt beginFor_" + forStmCounter);
                break;
            case "<=":
                code.add("if_icmple beginFor_" + forStmCounter);
                break;
            case ">":
                code.add("if_icmpgt beginFor_" + forStmCounter);
                break;
            case ">=":
                code.add("if_icmpge beginFor_" + forStmCounter);
                break;
        }
        return code;
    }

    //mathmetics
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
        code.add("ldc 0");
        code.addAll(visit(ctx.mathExpr()));
        code.add("isub");

        return code;
    }

    @Override
    public ArrayList<String> visitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        if (ctx.op.getText().equals("*")) {
            code.addAll(visit(ctx.leftExpr));
            code.addAll(visit(ctx.rightExpr));
            code.add("imul");
            return code;
        } else if (ctx.op.getText().equals(":")) {
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
        if (ctx.op.getText().equals("+")) {
            code.addAll(visit(ctx.leftExpr));
            code.addAll(visit(ctx.rightExpr));
            code.add("iadd");
            return code;
        } else if (ctx.op.getText().equals("-")) {
            code.addAll(visit(ctx.leftExpr));
            code.addAll(visit(ctx.rightExpr));
            code.add("isub");
            return code;
        }
        return code;
    }

    //variables
    @Override
    public ArrayList<String> visitIntvariable(LangParser.IntvariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("iload " + currentMethodFrame.lookupJasminPosition(ctx.getText()));
        return code;
    }

    @Override
    public ArrayList<String> visitStringVariable(LangParser.StringVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("Strload " + currentMethodFrame.lookupJasminPosition(ctx.getText()));
        return code;
    }

    //literals
    @Override
    public ArrayList<String> visitIntlitteral(LangParser.IntlitteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc " + ctx.getText());
        return code;
    }

    @Override
    public ArrayList<String> visitStringLiteral(LangParser.StringLiteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc " + ctx.getText());
        return code;
    }

    @Override
    public ArrayList<String> visitIntread(LangParser.IntreadContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        code.add("invokevirtual java/io/InputStream/read()I ");
        return code;
    }

    @Override
    public ArrayList<String> visitStringRead(LangParser.StringReadContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("getstatic java/lang/System/in Ljava/io/InputStream;");
        code.add("invokevirtual java/io/InputStream/read()Str ");
        return code;
    }
}
