import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by lars on 3/12/2017.
 */
public class CodeGenerator extends LangBaseVisitor<ArrayList<String>> {
    //variables
    private MethodFrame currentMethodFrame;
    private MethodFrame globalFrame;

    private int ifStmCounter = 0;
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
    private HashMap<String, String> returnTypes = new HashMap<>();

    private boolean hasElse;



    @Override
    public ArrayList<String> visitProg(LangParser.ProgContext ctx) {
        globalFrame = new MethodFrame(); //declare the global frame
        ArrayList<String> code = new ArrayList<>();
        className = ctx.className.getText();
        if(ctx.methodnames()!=null) {
            for (int i = 0; i < ctx.methodnames().getChildCount(); i++) { //loop through all the methods
                currentMethodFrame = new MethodFrame(globalFrame); //set the current method frame to the global frame
                currentMethodFrame.getJasminPosition().put("placeholder", "0"); //add a placeholder jasmin position

                //split the method to get the name, return type and parameters
                String[] split = ctx.methodnames().getChild(i).getText().split("/");
                String[] split2 = split[0].split("\\)");
                String[] split3 = split[0].split("\\(");

                ArrayList<String> paramTypes = new ArrayList<>();
                currentMethod = split2[1]; //set the current method

                try {
                    String child = "";
                    int counter = 2;
                    while (!child.equals(")")) { //loop through the parameters and declare their jasmin position
                        child = ctx.methodnames().getChild(i).getChild(counter).getText();
                        if (!child.equals(",")) {
                            if (child.contains("~int")) { //int parameter
                                paramTypes.add("I");
                                currentMethodFrame.declareJasminPosition(child.substring(4), (currentMethodFrame.getJasminPosition().size()), "I");
                            } else if (child.contains("~string")) { //string parameter
                                paramTypes.add("Ljava/lang/String;");
                                currentMethodFrame.declareJasminPosition(child.substring(7), (currentMethodFrame.getJasminPosition().size()), "Ljava/lang/String;");
                            }
                        }
                        counter++;
                    }
                } catch (NullPointerException npe) {
                    System.err.println(npe.getMessage());
                }

                //create a new string consisting of the parameter types and add it to the methodTypes
                String params = "";
                for (int x = 0; x < paramTypes.size(); x++) {
                    params = params + paramTypes.get(x);
                }
                methodTypes.put(currentMethod, params);

                //get the return types and add it to the returnTypes
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
                //add the method to the methodFrames
                methodFrames.put(currentMethod, currentMethodFrame);
            }
        }

        code.add(".class public " + className);
        code.add(".super java/lang/Object");
        code.add("\n");
        //visit the global variable declaration(s) visitor
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

        //visit the methods
        if(ctx.methodnames()!=null) {
            allOtherMethods.addAll(visit(ctx.methodnames()));
        }

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
        //visit the expressions
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

        //declare global jasmin variable
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

       //declare global jasmin variable
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

        //declare jasmin position
        currentMethodFrame.declareJasminPosition(identifier, currentMethodFrame.getJasminPosition().size(), "I");

        code.addAll(visit(ctx.mathExpr()));
        code.add("istore " + (currentMethodFrame.getJasminPosition().size() - 1));

        return code;
    }

    @Override
    public ArrayList<String> visitDeclareStringVariable(LangParser.DeclareStringVariableContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String identifier = ctx.identifier.getText();

        //declare jasmin position
        currentMethodFrame.declareJasminPosition(identifier, currentMethodFrame.getJasminPosition().size(), "Ljava/lang/String;");

        code.addAll(visit(ctx.stringvalues()));
        code.add("astore " + (currentMethodFrame.getJasminPosition().size()-1));
        return code;
    }

    //variable modifications
    @Override
    public ArrayList<String> visitIntVarModify(LangParser.IntVarModifyContext ctx) {
        ArrayList<String> code = new ArrayList<>();

        //check if there is a global variable with the same name
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
        currentMethodFrame = methodFrames.get(ctx.methodIdentifier.getText()); //set the current method frame
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
        currentMethodFrame = methodFrames.get(ctx.methodIdentifier.getText()); //set the current method frame
        ArrayList<String> code = new ArrayList<>();

        code.add(".method public " + ctx.methodIdentifier.getText() + "(" + methodTypes.get(ctx.methodIdentifier.getText()) + ")I");

        code.add(".limit stack 99");
        code.add(".limit locals 99");

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
        currentMethodFrame = methodFrames.get(ctx.methodIdentifier.getText()); //set the current method frame
        ArrayList<String> code = new ArrayList<>();

        code.add(".method public " + ctx.methodIdentifier.getText() + "(" + methodTypes.get(ctx.methodIdentifier.getText()) + ")Ljava/lang/String;");

        code.add(".limit stack 99");
        code.add(".limit locals 99");

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
        if (!inRun) { //check if the method is being called in the run method
            code.add("aload_0");
        }
        for (int i =0;i<ctx.methodCallParams().size();i++) {
            code.addAll(visit(ctx.methodCallParams(i)));

        }
        String dataTypes = methodTypes.get(ctx.methodIdentifier.getText()); //get the parameter data types
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
        ifStmCounter++; //increment the counter which keeps track of (if/else if/else) blocks
        ArrayList<String> code = new ArrayList<>();
        //declare the needed variables
        int sizeElseChildren = 0;
        int conditionSize;
        conditionSize = ctx.ifCondition().size(); //get the amount of if/else if/else blocks
        try { //check if there is an else block
            sizeElseChildren = ctx.elseBlock.children.size();
            hasElse = true;
        } catch (NullPointerException npe) {
            hasElse = false;
        }

        //create labels for the if/else if/else blocks
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
        //loop through if statement and visit all blocks
        for (int i = 0; i < ctx.ifCondition().size(); i++) {

            if (i == 0) {
                conditionCounter = 1;
                code.addAll(visit(ctx.ifCondition(i))); //condition(s)

                code.add("#_" + ifStmCounter + "_" + "code_block_1: ");
                for (int y = 0; y < ctx.ifBlock.getChildCount(); y++) {      //if block
                    code.addAll(visit(ctx.ifBlock.getChild(y)));
                }
                counter = ctx.ifBlock.children.size()-1;
            } else if (i < ctx.ifCondition().size()) {     //else if block
                conditionCounter = i + 1;
                code.add(ifLabels.get(i) + ":");
                code.addAll(visit(ctx.ifCondition(i))); //condition(s)

                code.add("#_" + ifStmCounter + "_" + "code_block_" + (i + 1) + ":");
                for (int y = 0; y < ctx.ifElseBlock.children.size(); y++) {
                    code.addAll(visit(ctx.ifElseBlock.getChild(y + counter)));
                }
                counter += ctx.ifElseBlock.children.size()-1;
            }
            if (i < ctx.ifCondition().size()) {
                code.add("goto " + "endif_" + (ifStmCounter));
            }
            if (sizeElseChildren > 0 && i == ctx.ifCondition().size() - 1) {        //else block
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
    public ArrayList<String> visitForStm(LangParser.ForStmContext ctx) {
        forStmCounter++; //increment the counter which keeps track of for blocks
        int currentFor = forStmCounter;
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.varDecl()));
        code.add("goto forCondition_" + forStmCounter);


        code.add("forIDCrement_" + forStmCounter + ":");
        if (ctx.idCrement.getText().equals("incr")) { //check if the value in the for loop should be incremented
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
        code.add("endFor_" + currentFor + ":");
        return code;
    }

    //statement conditions
    @Override
    public ArrayList<String> visitForCondition(LangParser.ForConditionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String lop = ctx.mathComparison().lop.getText(); //get the logical operator

        //add the math values
        for (int i = 0; i < ctx.mathComparison().mathExpr().size(); i++) {
            code.addAll(visit(ctx.mathComparison().mathExpr(i)));
        }
        if (ctx.forConditionMore().size() > 0) { //check if there is more than one condition
            Queue<String> labels = new LinkedList<>();
            //create labels for the conditions
            for (int i = 0; i < ctx.forConditionMore().size(); i++) {
                if (i < ctx.forConditionMore().size() - 1 && ctx.forConditionMore(i).andOR.getText().equals("&&") && ctx.forConditionMore(i + 1).andOR.getText().equals("||")) {
                    labels.add(forStmCounter + "_label_" + i);
                } else if (i == ctx.forConditionMore().size() - 1) {
                    labels.add("endFor_" + forStmCounter);
                }
            }
            for (int i = 0; i < ctx.forConditionMore().size(); i++) { //loop through the conditions
                String currentAndOr = ctx.forConditionMore(i).andOR.getText(); //check if condition is && or ||
                String cop = ctx.forConditionMore(i).mathComparison().lop.getText(); //get the logical operator of the current condition

                if (ctx.forConditionMore().size() == 1) {//check if there only 1 extra condition
                    if (currentAndOr.equals("&&")) {
                        //add the comparison
                        code.addAll(addCodeConditionReverse(lop));
                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "endFor_" + forStmCounter);

                        //add the math values
                        for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                        }
                        //add the comparison
                        code.addAll(addCodeConditionReverse(lop));

                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "endFor_" + forStmCounter);
                    } else {
                        //add the comparison
                        code.addAll(addCodeCondition(lop));

                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);

                        //add the math values
                        for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                        }

                        //add the comparison
                        code.addAll(addCodeCondition(lop));

                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);
                    }

                } else {
                    if (i < ctx.forConditionMore().size() - 1) { //loop through all the conditions except for the last one
                        String nextAndOr = ctx.forConditionMore(i + 1).andOR.getText(); //check if next condition is && or ||
                        if (currentAndOr.equals("&&") && nextAndOr.equals("&&")) {
                            if (i == 0) {
                                //add the comparison
                                code.addAll(addCodeConditionReverse(lop));
                                //set the correct label to jump to
                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.peek());
                            }

                            //add the math values
                            for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                            }

                            //add the comparison
                            code.addAll(addCodeConditionReverse(lop));

                            //set the label to jump to
                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.peek());

                        } else if (currentAndOr.equals("&&") && nextAndOr.equals("||")) {
                            if (i == 0) {
                                //add the comparison
                                code.addAll(addCodeConditionReverse(lop));
                                //set the label to jump to
                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.peek());
                            }

                            //add the math values
                            for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                            }

                            //add the comparison
                            code.addAll(addCodeCondition(lop));

                            //set the label to jump to
                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);
                            //add the label from the labels queue
                            code.add(labels.remove() + ":");

                        } else if (currentAndOr.equals("||") && nextAndOr.equals("||")) {
                            if (i == 0) {
                                //add the comparison
                                code.addAll(addCodeCondition(lop));
                                //set the label to jump to
                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);
                            }

                            //add the math values
                            for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                            }

                            //add the comparison
                            code.addAll(addCodeCondition(lop));

                            //set the label to jump to
                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);

                        } else if (currentAndOr.equals("||") && nextAndOr.equals("&&")) {
                            if (i == 0) {
                                //add the comparison
                                code.addAll(addCodeCondition(lop));
                                //set the label to jump to
                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + "beginFor_" + forStmCounter);
                            }


                            //add the math vlaues
                            for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                            }
                            //add the comparison
                            code.addAll(addCodeConditionReverse(cop));

                            //set the label to jump to
                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.peek());

                        }
                     
                    } else if (i == ctx.forConditionMore().size() - 1) { //last condition

                        //add the math values
                        for (int y = 0; y < ctx.forConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.forConditionMore(i).mathComparison().mathExpr(y)));
                        }

                        //add the comparison
                        code.addAll(addCodeConditionReverse(cop));

                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "endFor_" + forStmCounter);
                    }
                }
            }

        } else {
            //add the comparison
            code.addAll(addCodeConditionReverse(lop));
            //set the label to jump to
            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "endFor_" + forStmCounter);
        }
        return code;
    }

    @Override
    public ArrayList<String> visitIfCondition(LangParser.IfConditionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        String lop = ctx.mathComparison().lop.getText(); //get the logical operator
        //add the math values
        for (int i = 0; i < ctx.mathComparison().mathExpr().size(); i++) {
            code.addAll(visit(ctx.mathComparison().mathExpr(i)));
        }

        if (ctx.ifConditionMore().size() > 0) { //check if there is more than one condition
            Queue<String> labels = new LinkedList<>();
            //create labels for the conditions
            for (int i = 0; i < ctx.ifConditionMore().size(); i++) {
                if (i < ctx.ifConditionMore().size() - 1 && ctx.ifConditionMore(i).andOR.getText().equals("&&") && ctx.ifConditionMore(i + 1).andOR.getText().equals("||")) {
                    labels.add("#_" + ifStmCounter + "_" + conditionCounter + "_label_" + i);
                } else if (i == ctx.ifConditionMore().size() - 1) {
                    labels.add(ifLabels.get(conditionCounter));
                }
            }
            for (int i = 0; i < ctx.ifConditionMore().size(); i++) { //loop through the conditions
                String currentAndOr = ctx.ifConditionMore(i).andOR.getText(); // check if condition is && or ||
                String cop = ctx.ifConditionMore(i).mathComparison().lop.getText(); //get the logical operator

                if (ctx.ifConditionMore().size() == 1) { //check if there is only one extra condition
                    if (currentAndOr.equals("&&")) {
                        //add the comparison
                        code.addAll(addCodeConditionReverse(lop));

                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + ifLabels.get(conditionCounter));

                        //add the math values
                        for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                        }

                        //add the comparison
                        code.addAll(addCodeConditionReverse(cop));

                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + ifLabels.get(conditionCounter));
                    } else {
                        //add the comparison
                        code.addAll(addCodeCondition(lop));

                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);

                        //add the math values
                        for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                        }

                        //add the comparison
                        code.addAll(addCodeCondition(cop));

                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);
                    }

                } else {
                    if (i < ctx.ifConditionMore().size() - 1) {//loop through all conditions except the last one
                        String nextAndOr = ctx.ifConditionMore(i + 1).andOR.getText(); //check if next condition is && or ||
                        if (currentAndOr.equals("&&") && nextAndOr.equals("&&")) {
                            if (i == 0) {
                                //add the comparison
                                code.addAll(addCodeConditionReverse(lop));
                                //set the label to jump to
                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.peek());
                            }

                            //add the math values
                            for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                            }

                            //add the comparison
                            code.addAll(addCodeConditionReverse(cop));

                            //set the label to jump to
                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.peek());

                        } else if (currentAndOr.equals("&&") && nextAndOr.equals("||")) {
                            if (i == 0) {
                                //add the comparison
                                code.addAll(addCodeConditionReverse(lop));

                                //set the label to jump to
                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.peek());
                            }

                            //add the math values
                            for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                            }

                            //add the condition
                            code.addAll(addCodeCondition(cop));

                            //set the label to jump to
                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);

                            //add the label from the labels queue
                            code.add(labels.remove() + ":");

                        } else if (currentAndOr.equals("||") && nextAndOr.equals("||")) {
                            if (i == 0) {
                                //add the comparison
                                code.addAll(addCodeCondition(lop));

                                //set the label to jump
                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);
                            }

                            //add the math values
                            for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                            }

                            //add the comparison
                            code.addAll(addCodeCondition(cop));

                            //set the label to jump to
                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);

                        } else if (currentAndOr.equals("||") && nextAndOr.equals("&&")) {
                            if (i == 0) {
                                //add the comparison
                                code.addAll(addCodeCondition(lop));

                                //set the label to jump
                                code.set(code.size() - 1, code.get(code.size() - 1) + " " + "#_" + +ifStmCounter + "_" + "code_block_" + conditionCounter);
                            }

                            //add the math values
                            for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                                code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                            }

                            //add the comparison
                            code.addAll(addCodeConditionReverse(cop));

                            //set the label to jump to
                            code.set(code.size() - 1, code.get(code.size() - 1) + " " + labels.peek());


                        }
                    } else if (i == ctx.ifConditionMore().size() - 1) { //last condition
                        //add the math values
                        for (int y = 0; y < ctx.ifConditionMore(i).mathComparison().mathExpr().size(); y++) {
                            code.addAll(visit(ctx.ifConditionMore(i).mathComparison().mathExpr(y)));
                        }

                        //add the comparison
                        code.addAll(addCodeConditionReverse(cop));

                        //set the label to jump to
                        code.set(code.size() - 1, code.get(code.size() - 1) + " " + ifLabels.get(conditionCounter));


                    }

                }

                //check if the last condition is an ||
                if (currentAndOr.equals("||") && i == ctx.ifConditionMore().size() - 1) {
                    //set the label to jump to
                    code.set(code.size() - 1, code.get(code.size() - 1).replaceAll("code_block_" + conditionCounter, ifLabels.get(conditionCounter)));
                }
            }

        } else {
            //add the comparison
            code.addAll(addCodeConditionReverse(lop));
            //set the label to jump to
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

        //visit all writevalues
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
        //check if the variable is an integer
        if (currentMethodFrame.lookupType(ctx.getText()).equals("I")||code.get(code.size()-1).startsWith("i")) {
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
        //check if the variable is an integer
        if (currentMethodFrame.lookupType(ctx.getText()).equals("I")||code.get(code.size()-1).startsWith("i")) {
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
    public ArrayList<String> visitRestExpression(LangParser.RestExpressionContext ctx) {
        ArrayList<String> code = new ArrayList<>();
        code.addAll(visit(ctx.leftExpr));
        code.addAll(visit(ctx.rightExpr));
        code.add("irem");
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
        //check if variable is a global variable
        if (!currentMethodFrame.lookupJasminPositionNonGlobal(ctx.getText()).isEmpty()) {
            //checks if variable is Type int
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
        //check if variable is a global variable
        if (!currentMethodFrame.lookupJasminPositionNonGlobal(ctx.getText()).isEmpty()) {
            //checks if variable is Type int
            if (currentMethodFrame.lookupType(ctx.getText()).equals("I")) {
                code.add("iload " + currentMethodFrame.lookupJasminPosition(ctx.getText()));
            }else{
                System.err.println("check: "+ctx.getText());
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
