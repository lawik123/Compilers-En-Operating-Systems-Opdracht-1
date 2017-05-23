import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by lars on 3/12/2017.
 */
public class CodeGenerator extends LangBaseVisitor<ArrayList<String>> {
    //variables
    private MethodFrame currentMethodFrame;
    private MethodFrame globalFrame;

    private int ifStmCounter = 0;
    private int whileStmCounter = 0;
    private int forStmCounter = 0;
    private int conditionCounter = 0;
    private ArrayList<String> ifLabels = new ArrayList<>();
    private ArrayList<String> globalDeclarations = new ArrayList<>();
    private ArrayList<String> allOtherMethods = new ArrayList<>();

    private boolean inRun = false;

    private String currentMethod;
    private String className;
    private HashMap<String, String> methodTypes = new HashMap<>();
    private HashMap<String, MethodFrame> methodFrames = new HashMap<>();
    private HashMap<String, ArrayList<String>> parameterNames = new HashMap<>();
    private HashMap<String, String> returnTypes = new HashMap<>();

    private boolean hasElse;

    @Override
    public ArrayList<String> visitProg(LangParser.ProgContext ctx) {
        globalFrame = new MethodFrame();
        ArrayList<String> code = new ArrayList<>();
        className = ctx.className.getText();
        for (int i = 0; i < ctx.methodnames().getChildCount(); i++) {
            currentMethodFrame = new MethodFrame(globalFrame);
            currentMethodFrame.getJasminPosition().put("placeholder", "0");
            String[] split = ctx.methodnames().getChild(i).getText().split("/");
            String[] split2 = split[0].split("\\)");
            String[] split3 = split[0].split("\\(");

            ArrayList<String> paramTypes = new ArrayList<>();
            currentMethod = split2[1];
            parameterNames.put(currentMethod, new ArrayList<>());

            try {
                String child = "";
                int counter = 2;
                while (!child.equals(")")) {
                    child = ctx.methodnames().getChild(i).getChild(counter).getText();
                    if (!child.equals(",")) {
                        if (child.contains("~int")) {
                            paramTypes.add("I");
                            currentMethodFrame.declareJasminPosition(child.substring(4), (currentMethodFrame.getJasminPosition().size()),"I");
                        } else if (child.contains("~string")) {
                            paramTypes.add("Ljava/lang/String;");
                            currentMethodFrame.declareJasminPosition(child.substring(7), (currentMethodFrame.getJasminPosition().size()),"Ljava/lang/String;");
                        }
                    }
                    counter++;
                }
//                for (int y = 2; y < ctx.methodnames().getChild(i).getChild(y).; y++) {
//                    paramTypes.addAll(visit(ctx.methodDeclParams(y)));
//                }
            } catch (NullPointerException npe) {

            }

            String params = "";
            for (int x = 0; x < paramTypes.size(); x++) {
                params = params + paramTypes.get(x);
            }
            methodTypes.put(currentMethod, params);

//            for (int i = 0; i < parameterNames.get(currentMethod).size(); i++) {
//                currentMethodFrame.getJasminPosition().put(parameterNames.get(currentMethod).get(i), "" + i + "");
//            }

            switch (split3[0]) {
                case "~void":
                    returnTypes.put(currentMethod, "V");
                    break;
                case "~int":
                    returnTypes.put(currentMethod, "I");
                    break;
                case "~string":
                    returnTypes.put(currentMethod, "Ljava/lang/String;");
                    break;
            }
            methodFrames.put(currentMethod, currentMethodFrame);
        }

        code.add(".class public " + className);
        code.add(".super java/lang/Object");
        code.add("\n");
        if (ctx.varGlobalDecl().size() > 0) {
            for (int i = 0; i < ctx.varGlobalDecl().size(); i++) {
                code.addAll(visit(ctx.varGlobalDecl(i)));
            }
        }
        code.add("\n");
        code.add(".method public <init>()V");
        if (ctx.varGlobalDecl().size() > 0) {
            code.add(".limit stack 99");
            code.add(".limit locals 99");
        }

        code.add("aload_0");
        code.add("invokespecial java/lang/Object/<init>()V");
        code.addAll(globalDeclarations);
        code.add("return");
        code.add(".end method");
        code.add("\n");

        allOtherMethods.addAll(visit(ctx.methodnames()));

        code.add("\n");
        code.add(".method public static main([Ljava/lang/String;)V");
        code.add(".limit stack 99");
        code.add(".limit locals 99");
        code.add("new " + className);
        code.add("dup");
        code.add("invokespecial " + className + "/<init>()V");

        code.addAll(visit(ctx.runMethod()));
        code.add("return");
        code.add(".end method");
        code.add("\n");
        code.addAll(allOtherMethods);
        return code;
    }

    //declare main method
    @Override
    public ArrayList<String> visitRunMethod(LangParser.RunMethodContext ctx) {
        currentMethodFrame = new MethodFrame(globalFrame);
        ArrayList<String> code = new ArrayList<>();
        inRun = true;
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            code.addAll(visit(ctx.nonGlobalExpr(i)));
        }
        return code;
    }

    //global variable declarations
    @Override
    public ArrayList<String> visitDeclareIntGlobalVariable(LangParser.DeclareIntGlobalVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String identifier = ctx.identifier.getText();

        globalFrame.declareGlobalJasminVariable(identifier, className + "/" + identifier + " " + "I", "I");
        globalDeclarations.add("aload 0");
        globalDeclarations.addAll(visit(ctx.mathExpr()));
        globalDeclarations.add("putfield " + className + "/" + identifier + " " + "I");

        code.add(".field " + identifier + " I");

        return code;
    }

    @Override
    public ArrayList<String> visitDeclareStringGlobalVariable(LangParser.DeclareStringGlobalVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String identifier = ctx.identifier.getText();
        globalFrame.declareGlobalJasminVariable(identifier, className + "/" + identifier + " " + "Ljava/lang/String;", "Ljava/lang/String;");
        globalDeclarations.add("aload 0");
        globalDeclarations.addAll(visit(ctx.stringvalues()));
        globalDeclarations.add("putfield " + className + "/" + identifier + " " + "Ljava/lang/String;");

        code.add(".field " + identifier + " Ljava/lang/String;");

        return code;
    }

    //variable declarations
    @Override
    public ArrayList<String> visitDeclareIntVariable(LangParser.DeclareIntVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String identifier = ctx.identifier.getText();
        currentMethodFrame.declareJasminPosition(identifier, currentMethodFrame.getJasminPosition().size(), "I");
        code.addAll(visit(ctx.mathExpr()));
        code.add("istore " + (currentMethodFrame.getJasminPosition().size() - 1));

        return code;
    }

    @Override
    public ArrayList<String> visitDeclareStringVariable(LangParser.DeclareStringVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String identifier = ctx.identifier.getText();
        currentMethodFrame.declareJasminPosition(identifier, currentMethodFrame.getJasminPosition().size(), "Ljava/lang/String;");
        code.addAll(visit(ctx.stringvalues()));
        code.add("astore " + currentMethodFrame.getJasminPosition().size());
        return code;
    }

    //variable modifications
    @Override
    public ArrayList<String> visitIntVarModify(LangParser.IntVarModifyContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        if (globalFrame.lookupGlobalCode(ctx.identifier.getText()).isEmpty()) {
            code.add("iload " + currentMethodFrame.lookupJasminPosition(ctx.identifier.getText()));
            code.add("pop");
            code.addAll(visit(ctx.mathExpr()));
            currentMethodFrame.declareJasminPosition(ctx.identifier.getText(), Integer.parseInt(currentMethodFrame.lookupJasminPosition(ctx.identifier.getText())), "I");      //create new position
            code.add("istore " + currentMethodFrame.lookupJasminPosition(ctx.identifier.getText()));
            return code;
        } else {
            code.add("aload 0");
            code.addAll(visit(ctx.mathExpr()));
            code.add("putfield " + className + "/" + ctx.identifier.getText() + " I");
            return code;
        }
    }

    //TODO!!!
    @Override
    public ArrayList<String> visitStringVarModify(LangParser.StringVarModifyContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        if (globalFrame.lookupGlobalCode(ctx.identifier.getText()).isEmpty()) {
            code.add("aload " + currentMethodFrame.getJasminPosition().size());
            currentMethodFrame.declareJasminPosition(ctx.identifier.getText(), currentMethodFrame.getJasminPosition().size(), "Ljava/lang/String;");      //create new position
            code.add("pop");
            code.addAll(visit(ctx.stringvalues()));
            code.add("astore " + currentMethodFrame.getJasminPosition().size());
            return code;
        } else {
            code.add("aload 0");
            code.addAll(visit(ctx.stringvalues()));
            code.add("putfield " + className + "/" + ctx.identifier.getText() + " Ljava/lang/String;");
            return code;
        }
    }

    //method declarations


    @Override
    public ArrayList<String> visitMethodnames(LangParser.MethodnamesContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            code.addAll(visit(ctx.getChild(i)));
        }
        return code;
    }

    @Override
    public ArrayList<String> visitVoidMethodDecl(LangParser.VoidMethodDeclContext ctx) {
        currentMethodFrame = methodFrames.get(ctx.methodIdentifier.getText());
        ArrayList<String> code = new ArrayList<>();

        code.add(".method public " + ctx.methodIdentifier.getText() + "(" + methodTypes.get(ctx.methodIdentifier.getText()) + ")V");

        code.add(".limit stack 99");
        code.add(".limit locals 99");

        //visit the method statements
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            code.addAll(visit(ctx.nonGlobalExpr(i)));
        }

        code.add("return");
        code.add(".end method");
        code.add("\n");

        return code;
    }

    @Override
    public ArrayList<String> visitIntMethodDecl(LangParser.IntMethodDeclContext ctx) {
        currentMethodFrame = methodFrames.get(ctx.methodIdentifier.getText());
        ArrayList<String> code = new ArrayList<>();

        code.add(".method public " + ctx.methodIdentifier.getText() + "(" + methodTypes.get(ctx.methodIdentifier.getText()) + ")I");

        code.add(".limit stack 99");
        code.add(".limit locals 99");
//        code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
//        code.add("new java/util/Scanner");
//        code.add("dup");
//        code.add("getstatic java/lang/System/in Ljava/io/InputStream;");
//        code.add("invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V");
//        code.add("astore " + currentMethodFrame.getJasminPosition().size());
//        currentMethodFrame.declareJasminPosition("Scanner", currentMethodFrame.getJasminPosition().size());

        //visit the method statements
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            code.addAll(visit(ctx.nonGlobalExpr(i)));
        }

        code.add("ldc " + ctx.returnvalue.getText());
        code.add("ireturn");
        code.add(".end method");
        code.add("\n");
        return code;
    }

    @Override
    public ArrayList<String> visitStringMethodDecl(LangParser.StringMethodDeclContext ctx) {
        currentMethodFrame = methodFrames.get(ctx.methodIdentifier.getText());
        ArrayList<String> code = new ArrayList<>();

        code.add(".method public " + ctx.methodIdentifier.getText() + "(" + ctx.methodIdentifier.getText() + ")Ljava/lang/String;");

        code.add(".limit stack 99");
        code.add(".limit locals 99");
//        code.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
//        code.add("new java/util/Scanner");
//        code.add("dup");
//        code.add("getstatic java/lang/System/in Ljava/io/InputStream;");
//        code.add("invokespecial java/util/Scanner/<init>(Ljava/io/InputStream;)V");
//        code.add("astore " + currentMethodFrame.getJasminPosition().size());
//        currentMethodFrame.declareJasminPosition("Scanner", currentMethodFrame.getJasminPosition().size());

        //visit the method statements
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            code.addAll(visit(ctx.nonGlobalExpr(i)));
        }

        code.add("ldc " + ctx.returnvalue.getText());
        code.add("areturn");
        code.add(".end method");
        code.add("\n");
        return code;
    }

    //method declaration parameters
    @Override
    public ArrayList<String> visitIntParamMethodDecl(LangParser.IntParamMethodDeclContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.intParam()));
        return code;
    }

    @Override
    public ArrayList<String> visitStringParamMethodDecl(LangParser.StringParamMethodDeclContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.stringParam()));
        return code;
    }

    //call method visitor
    @Override
    public ArrayList<String> visitCallMethodExpr(LangParser.CallMethodExprContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        if (!inRun) {
            code.add("aload_0");
        }
        for (int i =0;i<ctx.methodCallParams().size();i++) {
            code.addAll(visit(ctx.methodCallParams(i)));

        }
        String dataTypes = methodTypes.get(ctx.methodIdentifier.getText());
        code.add("invokevirtual " + className + "/" + ctx.methodIdentifier.getText() + "(" + dataTypes + ")" + returnTypes.get(ctx.methodIdentifier.getText()));
        return code;
    }


    //method call parameters
    @Override
    public ArrayList<String> visitIntCallParamMethodCall(LangParser.IntCallParamMethodCallContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.intCallParam()));
        return code;
    }

    @Override
    public ArrayList<String> visitStringCallParamMethodCall(LangParser.StringCallParamMethodCallContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.stringCallParam()));
        return code;
    }

    //statement visitors
    @Override
    public ArrayList<String> visitIfStm(LangParser.IfStmContext ctx) {
        ifStmCounter++;
        ArrayList<String> code = new ArrayList<>();
        int sizeElseChildren = 0;
        int conditionSize;
        conditionSize = ctx.ifCondition().size();
        try {
            //else block
            sizeElseChildren = ctx.elseBlock.children.size();
            hasElse = true;
        } catch (NullPointerException npe) {
            hasElse = false;
        }

        for (int i = 0; i <= conditionSize; i++) {
            if (i == 0) {
                ifLabels.add("#_" + ifStmCounter + "_" + "IF");
            } else if (i < conditionSize) {
                ifLabels.add("#_" + ifStmCounter + "_" + "ELSE_IF_" + i);

            } else {
                if (hasElse) {
                    ifLabels.add("#_" + ifStmCounter + "_" + "ELSE");
                } else {
                    ifLabels.add("endif_" + ifStmCounter);
                }
            }
        }


        int counter = 0;
        for (int i = 0; i < ctx.ifCondition().size(); i++) {

            if (i == 0) {
                conditionCounter = 1;
                code.addAll(visit(ctx.ifCondition(i)));

                code.add("#_" + ifStmCounter + "_" + "code_block_1: ");
                for (int y = 0; y < ctx.ifBlock.getChildCount(); y++) {      //if block
                    code.addAll(visit(ctx.ifBlock.getChild(y)));
                }
                counter = ctx.ifBlock.children.size();
            } else if (i < ctx.ifCondition().size()) {     //if else block
                conditionCounter = i + 1;
                code.add(ifLabels.get(i) + ":");
                code.addAll(visit(ctx.ifCondition(i)));

                code.add("#_" + ifStmCounter + "_" + "code_block_" + (i + 1) + ":");
                for (int y = 0; y < ctx.ifElseBlock.children.size(); y++) {
                    code.addAll(visit(ctx.ifElseBlock.getChild(y + counter)));
                }
                counter += ctx.ifElseBlock.children.size();
            }
            if (i < ctx.ifCondition().size()) {
                code.add("goto " + "endif_" + (ifStmCounter));
            }
            if (sizeElseChildren > 0 && i == ctx.ifCondition().size() - 1) {
                code.add("#_" + ifStmCounter + "_" + "ELSE: ");
                for (int y = 0; y < sizeElseChildren; y++) {
                    code.addAll(visit(ctx.elseBlock.getChild(y + counter)));
                }
            }

        }

        String label = "endif_" + (ifStmCounter);

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
        code.addAll(visit(ctx.ifCondition()));
        code.add("endWhile_" + whileStmCounter + ":");
        return code;

    }

    @Override
    public ArrayList<String> visitForStm(LangParser.ForStmContext ctx) {
        forStmCounter++;
        int currentFor = forStmCounter;
//        String idValue = null;
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.varDecl()));
        code.add("goto forCondition_" + forStmCounter);


        code.add("forIDCrement_" + forStmCounter + ":");
        if (ctx.idCrement.getText().equals("incr")) {
            code.add("iinc " + currentMethodFrame.lookupJasminPosition(ctx.idValue.getText()) + " 1");
        } else {
            code.add("iinc " + currentMethodFrame.lookupJasminPosition(ctx.idValue.getText()) + " -1");
        }

        code.add("forCondition_" + forStmCounter + ":");
        code.addAll(visit(ctx.forCondition()));
        code.add("beginFor_" + forStmCounter + ":");
        for (int i = 0; i < ctx.nonGlobalExpr().size(); i++) {
            code.addAll(visit(ctx.nonGlobalExpr(i)));
        }
        code.add("goto forIDCrement_" + forStmCounter);
//        try {
//            idValue = ctx.idValue.getText();
//        } catch (NullPointerException npe) {
//
//        }
        code.add("endFor_" + currentFor + ":");
        return code;
    }

    //statement conditions
    @Override
    public ArrayList<String> visitForCondition(LangParser.ForConditionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String lop = ctx.mathComparison().lop.getText();
        for (int i = 0; i < ctx.mathComparison().mathExpr().size(); i++) {
            code.addAll(visit(ctx.mathComparison().mathExpr(i)));
        }
        if (ctx.forConditionMore().size() > 0) {
            ArrayList<String> labels = new ArrayList<>();
            for (int i = 0; i < ctx.forConditionMore().size(); i++) {
                if (i < ctx.forConditionMore().size() - 1 && ctx.forConditionMore(i).andOR.getText().equals("&&") && ctx.forConditionMore(i + 1).andOR.getText().equals("||")) {
                    labels.add(forStmCounter + "_label_" + i);
                } else if (i == ctx.forConditionMore().size() - 1) {
                    labels.add("endFor_" + forStmCounter);
                }
            }
            for (int i = 0; i < ctx.forConditionMore().size(); i++) {
                String currentAndOr = ctx.forConditionMore(i).andOR.getText();
                String cop = ctx.forConditionMore(i).mathComparison().lop.getText();

                if (ctx.forConditionMore().size() == 1) {
                    if (currentAndOr.equals("&&")) {
                        code.addAll(addCodeConditionReverse(lop));
//                        switch (lop) {
//                            case "==":
//                                code.add("if_icmpne");
//                                break;
//                            case "!=":
//                                code.add("if_icmpeq");
//                                break;
//                            case "<":
//                                code.add("if_icmpge");
//                                break;
//                            case "<=":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">":
//                                code.add("if_icmple");
//                                break;
//                            case ">=":
//                                code.add("if_icmplt");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "endFor_" + forStmCounter);


                        for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                        }
                        code.addAll(addCodeConditionReverse(lop));
//                        switch (cop) {
//                            case "==":
//                                code.add("if_icmpne");
//                                break;
//                            case "!=":
//                                code.add("if_icmpeq");
//                                break;
//                            case "<":
//                                code.add("if_icmpge");
//                                break;
//                            case "<=":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">":
//                                code.add("if_icmple");
//                                break;
//                            case ">=":
//                                code.add("if_icmplt");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "endFor_" + forStmCounter);
                    } else {
                        code.addAll(addCodeCondition(lop));
//                        switch (lop) {
//                            case "==":
//                                code.add("if_icmpeq");
//                                break;
//                            case "!=":
//                                code.add("if_icmpne");
//                                break;
//                            case "<":
//                                code.add("if_icmple");
//                                break;
//                            case "<=":
//                                code.add("if_icmplt");
//                                break;
//                            case ">":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">=":
//                                code.add("if_icmpge");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);

                        for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                        }
                        code.addAll(addCodeCondition(lop));
//                        switch (cop) {
//                            case "==":
//                                code.add("if_icmpeq");
//                                break;
//                            case "!=":
//                                code.add("if_icmpne");
//                                break;
//                            case "<":
//                                code.add("if_icmplt");
//                                break;
//                            case "<=":
//                                code.add("if_icmple");
//                                break;
//                            case ">":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">=":
//                                code.add("if_icmpge");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);
                    }

                } else {
                    if (i < ctx.forConditionMore().size() - 1) {
                        String nextAndOr = ctx.forConditionMore(i + 1).andOR.getText();
                        if (currentAndOr.equals("&&") && nextAndOr.equals("&&")) {
                            if (i == 0) {
                                code.addAll(addCodeConditionReverse(lop));
//                                switch (lop) {
//                                    case "==":
//                                        code.add("if_icmpne");
//                                        break;
//                                    case "!=":
//                                        code.add("if_icmpeq");
//                                        break;
//                                    case "<":
//                                        code.add("if_icmpge");
//                                        break;
//                                    case "<=":
//                                        code.add("if_icmpgt");
//                                        break;
//                                    case ">":
//                                        code.add("if_icmple");
//                                        break;
//                                    case ">=":
//                                        code.add("if_icmplt");
//                                        break;
//                                }

                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.get(0));
                            }


                            for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                            }
                            code.addAll(addCodeConditionReverse(lop));
//                            switch (cop) {
//
//                                case "==":
//                                    code.add("if_icmpne");
//                                    break;
//                                case "!=":
//                                    code.add("if_icmpeq");
//                                    break;
//                                case "<":
//                                    code.add("if_icmpge");
//                                    break;
//                                case "<=":
//                                    code.add("if_icmpgt");
//                                    break;
//                                case ">":
//                                    code.add("if_icmple");
//                                    break;
//                                case ">=":
//                                    code.add("if_icmplt");
//                                    break;
//                            }

                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.get(0));

                        } else if (currentAndOr.equals("&&") && nextAndOr.equals("||")) {
                            if (i == 0) {
                                code.addAll(addCodeConditionReverse(lop));
//                                switch (lop) {
//                                    case "==":
//                                        code.add("if_icmpne");
//                                        break;
//                                    case "!=":
//                                        code.add("if_icmpeq");
//                                        break;
//                                    case "<":
//                                        code.add("if_icmpge");
//                                        break;
//                                    case "<=":
//                                        code.add("if_icmpgt");
//                                        break;
//                                    case ">":
//                                        code.add("if_icmple");
//                                        break;
//                                    case ">=":
//                                        code.add("if_icmplt");
//                                        break;
//                                }

                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.get(0));
                            }


                            for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                            }
                            code.addAll(addCodeCondition(lop));
//                            switch (cop) {
//                                case "==":
//                                    code.add("if_icmpeq");
//                                    break;
//                                case "!=":
//                                    code.add("if_icmpne");
//                                    break;
//                                case "<":
//                                    code.add("if_icmplt");
//                                    break;
//                                case "<=":
//                                    code.add("if_icmple");
//                                    break;
//                                case ">":
//                                    code.add("if_icmpgt");
//                                    break;
//                                case ">=":
//                                    code.add("if_icmpge");
//                                    break;
//                            }

                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);
                            code.add(labels.get(0) + ":");
                            labels.remove(0);

                        } else if (currentAndOr.equals("||") && nextAndOr.equals("||")) {
                            if (i == 0) {
                                code.addAll(addCodeCondition(lop));
//                                switch (lop) {
//                                    case "==":
//                                        code.add("if_icmpeq");
//                                        break;
//                                    case "!=":
//                                        code.add("if_icmpne");
//                                        break;
//                                    case "<":
//                                        code.add("if_icmplt");
//                                        break;
//                                    case "<=":
//                                        code.add("if_icmple");
//                                        break;
//                                    case ">":
//                                        code.add("if_icmpgt");
//                                        break;
//                                    case ">=":
//                                        code.add("if_icmpge");
//                                        break;
//                                }

                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);
                            }


                            for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                            }
                            code.addAll(addCodeCondition(lop));
//                            switch (cop) {
//                                case "==":
//                                    code.add("if_icmpeq");
//                                    break;
//                                case "!=":
//                                    code.add("if_icmpne");
//                                    break;
//                                case "<":
//                                    code.add("if_icmplt");
//                                    break;
//                                case "<=":
//                                    code.add("if_icmple");
//                                    break;
//                                case ">":
//                                    code.add("if_icmpgt");
//                                    break;
//                                case ">=":
//                                    code.add("if_icmpge");
//                                    break;
//                            }

                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);

                        } else if (currentAndOr.equals("||") && nextAndOr.equals("&&")) {
                            if (i == 0) {
                                code.addAll(addCodeCondition(lop));
//                                switch (lop) {
//                                    case "==":
//                                        code.add("if_icmpeq");
//                                        break;
//                                    case "!=":
//                                        code.add("if_icmpne");
//                                        break;
//                                    case "<":
//                                        code.add("if_icmplt");
//                                        break;
//                                    case "<=":
//                                        code.add("if_icmple");
//                                        break;
//                                    case ">":
//                                        code.add("if_icmpgt");
//                                        break;
//                                    case ">=":
//                                        code.add("if_icmpge");
//                                        break;
//                                }

                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);
                            }


                            for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                            }
                            code.addAll(addCodeConditionReverse(cop));
//                            switch (cop) {
//                                case "==":
//                                    code.add("if_icmpne");
//                                    break;
//                                case "!=":
//                                    code.add("if_icmpeq");
//                                    break;
//                                case "<":
//                                    code.add("if_icmpge");
//                                    break;
//                                case "<=":
//                                    code.add("if_icmpgt");
//                                    break;
//                                case ">":
//                                    code.add("if_icmple");
//                                    break;
//                                case ">=":
//                                    code.add("if_icmplt");
//                                    break;
//                            }

                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.get(0));


                        }
                    } else if (i == ctx.forConditionMore().size() - 1) {
                        for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                        }
                        code.addAll(addCodeConditionReverse(cop));
//                        switch (cop) {
//                            case "==":
//                                code.add("if_icmpne");
//                                break;
//                            case "!=":
//                                code.add("if_icmpeq");
//                                break;
//                            case "<":
//                                code.add("if_icmpge");
//                                break;
//                            case "<=":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">":
//                                code.add("if_icmple");
//                                break;
//                            case ">=":
//                                code.add("if_icmplt");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "endFor_" + forStmCounter);


                    }

                }
            }

        } else {
            code.addAll(addCodeConditionReverse(lop));
//            switch (lop) {
//                case "==":
//                    code.add("if_icmpne");
//                    break;
//                case "!=":
//                    code.add("if_icmpeq");
//                    break;
//                case "<":
//                    code.add("if_icmpge");
//                    break;
//                case "<=":
//                    code.add("if_icmpgt");
//                    break;
//                case ">":
//                    code.add("if_icmple");
//                    break;
//                case ">=":
//                    code.add("if_icmplt");
//                    break;
//            }

            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "endFor_" + forStmCounter);

        }

        return code;

    }

    @Override
    public ArrayList<String> visitIfCondition(LangParser.IfConditionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String lop = ctx.mathComparison().lop.getText();
        for (int i = 0; i < ctx.mathComparison().mathExpr().size(); i++) {
            code.addAll(visit(ctx.mathComparison().mathExpr(i)));
        }

        if (ctx.ifConditionMore().size() > 0) {
            ArrayList<String> labels = new ArrayList<>();
            for (int i = 0; i < ctx.ifConditionMore().size(); i++) {
                if (i < ctx.ifConditionMore().size() - 1 && ctx.ifConditionMore(i).andOR.getText().equals("&&") && ctx.ifConditionMore(i + 1).andOR.getText().equals("||")) {
                    labels.add("#_" + ifStmCounter + "_" + conditionCounter + "_label_" + i);
                } else if (i == ctx.ifConditionMore().size() - 1) {
                    labels.add(ifLabels.get(conditionCounter));
                }
            }
            for (int i = 0; i < ctx.ifConditionMore().size(); i++) {
                String currentAndOr = ctx.ifConditionMore(i).andOR.getText();
                String cop = ctx.ifConditionMore(i).mathComparison().lop.getText();

                if (ctx.ifConditionMore().size() == 1) {
                    if (currentAndOr.equals("&&")) {
                        code.addAll(addCodeConditionReverse(lop));
//                        switch (lop) {
//                            case "==":
//                                code.add("if_icmpne");
//                                break;
//                            case "!=":
//                                code.add("if_icmpeq");
//                                break;
//                            case "<":
//                                code.add("if_icmpge");
//                                break;
//                            case "<=":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">":
//                                code.add("if_icmple");
//                                break;
//                            case ">=":
//                                code.add("if_icmplt");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + ifLabels.get(conditionCounter));


                        for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                        }
                        code.addAll(addCodeConditionReverse(cop));
//                        switch (cop) {
//                            case "==":
//                                code.add("if_icmpne");
//                                break;
//                            case "!=":
//                                code.add("if_icmpeq");
//                                break;
//                            case "<":
//                                code.add("if_icmpge");
//                                break;
//                            case "<=":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">":
//                                code.add("if_icmple");
//                                break;
//                            case ">=":
//                                code.add("if_icmplt");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + ifLabels.get(conditionCounter));
                    } else {
                        code.addAll(addCodeCondition(lop));
//                        switch (lop) {
//                            case "==":
//                                code.add("if_icmpeq");
//                                break;
//                            case "!=":
//                                code.add("if_icmpne");
//                                break;
//                            case "<":
//                                code.add("if_icmple");
//                                break;
//                            case "<=":
//                                code.add("if_icmplt");
//                                break;
//                            case ">":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">=":
//                                code.add("if_icmpge");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);

                        for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                        }
                        code.addAll(addCodeCondition(cop));
//                        switch (cop) {
//                            case "==":
//                                code.add("if_icmpeq");
//                                break;
//                            case "!=":
//                                code.add("if_icmpne");
//                                break;
//                            case "<":
//                                code.add("if_icmplt");
//                                break;
//                            case "<=":
//                                code.add("if_icmple");
//                                break;
//                            case ">":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">=":
//                                code.add("if_icmpge");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);
                    }

                } else {
                    if (i < ctx.ifConditionMore().size() - 1) {
                        String nextAndOr = ctx.ifConditionMore(i + 1).andOR.getText();
                        if (currentAndOr.equals("&&") && nextAndOr.equals("&&")) {
                            if (i == 0) {
                                code.addAll(addCodeConditionReverse(lop));
//                                switch (lop) {
//                                    case "==":
//                                        code.add("if_icmpne");
//                                        break;
//                                    case "!=":
//                                        code.add("if_icmpeq");
//                                        break;
//                                    case "<":
//                                        code.add("if_icmpge");
//                                        break;
//                                    case "<=":
//                                        code.add("if_icmpgt");
//                                        break;
//                                    case ">":
//                                        code.add("if_icmple");
//                                        break;
//                                    case ">=":
//                                        code.add("if_icmplt");
//                                        break;
//                                }

                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.get(0));
                            }


                            for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                            }
                            code.addAll(addCodeConditionReverse(cop));
//                            switch (cop) {
//                                case "==":
//                                    code.add("if_icmpne");
//                                    break;
//                                case "!=":
//                                    code.add("if_icmpeq");
//                                    break;
//                                case "<":
//                                    code.add("if_icmpge");
//                                    break;
//                                case "<=":
//                                    code.add("if_icmpgt");
//                                    break;
//                                case ">":
//                                    code.add("if_icmple");
//                                    break;
//                                case ">=":
//                                    code.add("if_icmplt");
//                                    break;
//                            }

                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.get(0));

                        } else if (currentAndOr.equals("&&") && nextAndOr.equals("||")) {
                            if (i == 0) {
                                code.addAll(addCodeConditionReverse(lop));
//                                switch (lop) {
//                                    case "==":
//                                        code.add("if_icmpne");
//                                        break;
//                                    case "!=":
//                                        code.add("if_icmpeq");
//                                        break;
//                                    case "<":
//                                        code.add("if_icmpge");
//                                        break;
//                                    case "<=":
//                                        code.add("if_icmpgt");
//                                        break;
//                                    case ">":
//                                        code.add("if_icmple");
//                                        break;
//                                    case ">=":
//                                        code.add("if_icmplt");
//                                        break;
//                                }

                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.get(0));
                            }


                            for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                            }
                            code.addAll(addCodeCondition(cop));
//                            switch (cop) {
//                                case "==":
//                                    code.add("if_icmpeq");
//                                    break;
//                                case "!=":
//                                    code.add("if_icmpne");
//                                    break;
//                                case "<":
//                                    code.add("if_icmplt");
//                                    break;
//                                case "<=":
//                                    code.add("if_icmple");
//                                    break;
//                                case ">":
//                                    code.add("if_icmpgt");
//                                    break;
//                                case ">=":
//                                    code.add("if_icmpge");
//                                    break;
//                            }

                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);
                            code.add(labels.get(0) + ":");
                            labels.remove(0);

                        } else if (currentAndOr.equals("||") && nextAndOr.equals("||")) {
                            if (i == 0) {
                                code.addAll(addCodeCondition(lop));
//                                switch (lop) {
//                                    case "==":
//                                        code.add("if_icmpeq");
//                                        break;
//                                    case "!=":
//                                        code.add("if_icmpne");
//                                        break;
//                                    case "<":
//                                        code.add("if_icmplt");
//                                        break;
//                                    case "<=":
//                                        code.add("if_icmple");
//                                        break;
//                                    case ">":
//                                        code.add("if_icmpgt");
//                                        break;
//                                    case ">=":
//                                        code.add("if_icmpge");
//                                        break;
//                                }

                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);
                            }


                            for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                            }
                            code.addAll(addCodeCondition(cop));
//                            switch (cop) {
//                                case "==":
//                                    code.add("if_icmpeq");
//                                    break;
//                                case "!=":
//                                    code.add("if_icmpne");
//                                    break;
//                                case "<":
//                                    code.add("if_icmplt");
//                                    break;
//                                case "<=":
//                                    code.add("if_icmple");
//                                    break;
//                                case ">":
//                                    code.add("if_icmpgt");
//                                    break;
//                                case ">=":
//                                    code.add("if_icmpge");
//                                    break;
//                            }

                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);

                        } else if (currentAndOr.equals("||") && nextAndOr.equals("&&")) {
                            if (i == 0) {
                                code.addAll(addCodeCondition(lop));
//                                switch (lop) {
//                                    case "==":
//                                        code.add("if_icmpeq");
//                                        break;
//                                    case "!=":
//                                        code.add("if_icmpne");
//                                        break;
//                                    case "<":
//                                        code.add("if_icmplt");
//                                        break;
//                                    case "<=":
//                                        code.add("if_icmple");
//                                        break;
//                                    case ">":
//                                        code.add("if_icmpgt");
//                                        break;
//                                    case ">=":
//                                        code.add("if_icmpge");
//                                        break;
//                                }

                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);
                            }


                            for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                            }
                            code.addAll(addCodeConditionReverse(cop));
//                            switch (cop) {
//                                case "==":
//                                    code.add("if_icmpne");
//                                    break;
//                                case "!=":
//                                    code.add("if_icmpeq");
//                                    break;
//                                case "<":
//                                    code.add("if_icmpge");
//                                    break;
//                                case "<=":
//                                    code.add("if_icmpgt");
//                                    break;
//                                case ">":
//                                    code.add("if_icmple");
//                                    break;
//                                case ">=":
//                                    code.add("if_icmplt");
//                                    break;
//                            }

                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.get(0));


                        }
                    } else if (i == ctx.ifConditionMore().size() - 1) {
                        for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                        }
                        code.addAll(addCodeConditionReverse(cop));
//                        switch (cop) {
//                            case "==":
//                                code.add("if_icmpne");
//                                break;
//                            case "!=":
//                                code.add("if_icmpeq");
//                                break;
//                            case "<":
//                                code.add("if_icmpge");
//                                break;
//                            case "<=":
//                                code.add("if_icmpgt");
//                                break;
//                            case ">":
//                                code.add("if_icmple");
//                                break;
//                            case ">=":
//                                code.add("if_icmplt");
//                                break;
//                        }

                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + ifLabels.get(conditionCounter));


                    }

                }

                //check if the last condition is an ||
                if (currentAndOr.equals("||") && i == ctx.ifConditionMore().size() - 1) {
                    //flip statement
                    code.set(code.size() - 1, code.get(code.size() - 1).replaceAll("code_block_" + conditionCounter, ifLabels.get(conditionCounter)));
                    String lopr = code.get(code.size() - 1).substring(7, 9);
//                    switch (lopr) {
//                        case "eq":
//                            code.set(code.size() - 1, code.get(code.size() - 1).replaceAll(lopr, "ne"));
//                            break;
//                        case "ne":
//                            code.set(code.size() - 1, code.get(code.size() - 1).replaceAll(lopr, "eq"));
//                            break;
//                        case "lt":
//                            code.set(code.size() - 1, code.get(code.size() - 1).replaceAll(lopr, "ge"));
//                            break;
//                        case "le":
//                            code.set(code.size() - 1, code.get(code.size() - 1).replaceAll(lopr, "gt"));
//                            break;
//                        case "gt":
//                            code.set(code.size() - 1, code.get(code.size() - 1).replaceAll(lopr, "le"));
//                            break;
//                        case "ge":
//                            code.set(code.size() - 1, code.get(code.size() - 1).replaceAll(lopr, "lt"));
//                            break;
//
//                    }
                }
            }

        } else {
            code.addAll(addCodeConditionReverse(lop));
//            switch (lop) {
//
//                case "==":
//                    code.add("if_icmpne");
//                    break;
//                case "!=":
//                    code.add("if_icmpeq");
//                    break;
//                case "<":
//                    code.add("if_icmpge");
//                    break;
//                case "<=":
//                    code.add("if_icmpgt");
//                    break;
//                case ">":
//                    code.add("if_icmple");
//                    break;
//                case ">=":
//                    code.add("if_icmplt");
//                    break;
//            }

            code.set(code.size() - 1, code.get(code.size() - 1) + " " + ifLabels.get(conditionCounter));

        }

        return code;
    }

    //methods for adding the if comparison to the code
    public ArrayList<String> addCodeCondition(String lop) {
        ArrayList<String> code = new ArrayList<>();
        switch (lop) {
            case "==":
                code.add("if_icmpeq");
                break;
            case "!=":
                code.add("if_icmpne");
                break;
            case "<":
                code.add("if_icmplt");
                break;
            case "<=":
                code.add("if_icmple");
                break;
            case ">":
                code.add("if_icmpgt");
                break;
            case ">=":
                code.add("if_icmpge");
                break;
        }
        return code;

    }

    public ArrayList<String> addCodeConditionReverse(String lop) {
        ArrayList<String> code = new ArrayList<>();
        switch (lop) {
            case "==":
                code.add("if_icmpne");
                break;
            case "!=":
                code.add("if_icmpeq");
                break;
            case "<":
                code.add("if_icmpge");
                break;
            case "<=":
                code.add("if_icmpgt");
                break;
            case ">":
                code.add("if_icmple");
                break;
            case ">=":
                code.add("if_icmplt");
                break;
        }
        return code;

    }


    //write expression
    @Override
    public ArrayList<String> visitWriteExpr(LangParser.WriteExprContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("getstatic java/lang/System.out Ljava/io/PrintStream;");
        code.add("new java/lang/StringBuilder\n" +
                "dup\n" +
                "invokespecial java/lang/StringBuilder/<init>()V");

        for (int i = 0; i < ctx.writevalues().size(); i++) {
            code.addAll(visit(ctx.writevalues(i)));
        }
        code.add("invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;");

        code.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");
        return code;
    }

    @Override
    public ArrayList<String> visitWriteMath(LangParser.WriteMathContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.mathExpr()));
        if (currentMethodFrame.lookupType(ctx.getText()).equals("I")) {
            code.add("invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
        } else {
            code.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
        }
        return code;
    }

    @Override
    public ArrayList<String> visitWriteString(LangParser.WriteStringContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.stringvalues()));
        if (currentMethodFrame.lookupType(ctx.getText()).equals("I")) {
            code.add("invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;");
        } else {
            code.add("invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;");
        }
        return code;
    }

    //mathExpression visitors
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
    public ArrayList<String> visitParenthesisExpression(LangParser.ParenthesisExpressionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.mathExpr()));
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

    @Override
    public ArrayList<String> visitMathValuesExpression(LangParser.MathValuesExpressionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.value));
        return code;
    }

    //Getters for the values
    //String
    @Override
    public ArrayList<String> visitStringLiteral(LangParser.StringLiteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc " + ctx.getText());
        return code;
    }

    @Override
    public ArrayList<String> visitStringVariable(LangParser.StringVariableContext ctx) {

        ArrayList<String> code = new ArrayList<>();
        if (!currentMethodFrame.lookupJasminPosition(ctx.getText()).isEmpty()) {
            if (currentMethodFrame.lookupType(ctx.getText()).equals("I")) {
                code.add("iload " + currentMethodFrame.lookupJasminPosition(ctx.getText()));
            }else{
                code.add("aload " + currentMethodFrame.lookupJasminPosition(ctx.getText()));
            }
        } else {
            code.add("aload 0");
            code.add("getfield " + globalFrame.lookupGlobalCode(ctx.getText()));
        }
        return code;
    }

    @Override
    public ArrayList<String> visitStringRead(LangParser.StringReadContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("new java/util/Scanner\ndup\n");
        code.add("getstatic\tjava/lang/System.in Ljava/io/InputStream;\n");
        code.add("invokespecial\tjava/util/Scanner/<init>(Ljava/io/InputStream;)V\n");
        code.add("invokevirtual java/util/Scanner/nextLine()Ljava/lang/String;");
        return code;
    }

    @Override
    public ArrayList<String> visitStringCallParam(LangParser.StringCallParamContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.stringvalues()));
        return code;
    }

    //int
    @Override
    public ArrayList<String> visitIntlitteral(LangParser.IntlitteralContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("ldc " + ctx.getText());
        return code;
    }

    @Override
    public ArrayList<String> visitIntvariable(LangParser.IntvariableContext ctx) {

        ArrayList<String> code = new ArrayList<>();
        if (!currentMethodFrame.lookupJasminPosition(ctx.getText()).isEmpty()) {
            if (currentMethodFrame.lookupType(ctx.getText()).equals("I")) {
                code.add("iload " + currentMethodFrame.lookupJasminPosition(ctx.getText()));
            }else{
                code.add("aload " + currentMethodFrame.lookupJasminPosition(ctx.getText()));
            }
        } else {
            code.add("aload 0");
            code.add("getfield " + globalFrame.lookupGlobalCode(ctx.getText()));
        }
        return code;
    }

    @Override
    public ArrayList<String> visitIntread(LangParser.IntreadContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.add("new java/util/Scanner\ndup\n");
        code.add("getstatic\tjava/lang/System.in Ljava/io/InputStream;\n");
        code.add("invokespecial\tjava/util/Scanner/<init>(Ljava/io/InputStream;)V\n");
        code.add("invokevirtual java/util/Scanner/nextInt()I");
        return code;
    }

    @Override
    public ArrayList<String> visitIntCallParam(LangParser.IntCallParamContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.mathExpr()));
        return code;
    }
}
