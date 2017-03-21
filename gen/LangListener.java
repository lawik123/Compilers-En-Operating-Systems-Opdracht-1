// Generated from D:/school/jaar2/kwartiel3/Compilers&OperatingSystems/Compilers-En-Operating-Systems-Opdracht-1\Lang.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangParser}.
 */
public interface LangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#nonGlobalExpr}.
	 * @param ctx the parse tree
	 */
	void enterNonGlobalExpr(LangParser.NonGlobalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#nonGlobalExpr}.
	 * @param ctx the parse tree
	 */
	void exitNonGlobalExpr(LangParser.NonGlobalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareIntVariable}
	 * labeled alternative in {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterDeclareIntVariable(LangParser.DeclareIntVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareIntVariable}
	 * labeled alternative in {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitDeclareIntVariable(LangParser.DeclareIntVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declareStringVariable}
	 * labeled alternative in {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStringVariable(LangParser.DeclareStringVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declareStringVariable}
	 * labeled alternative in {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStringVariable(LangParser.DeclareStringVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intVarModify}
	 * labeled alternative in {@link LangParser#varMod}.
	 * @param ctx the parse tree
	 */
	void enterIntVarModify(LangParser.IntVarModifyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intVarModify}
	 * labeled alternative in {@link LangParser#varMod}.
	 * @param ctx the parse tree
	 */
	void exitIntVarModify(LangParser.IntVarModifyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringVarModify}
	 * labeled alternative in {@link LangParser#varMod}.
	 * @param ctx the parse tree
	 */
	void enterStringVarModify(LangParser.StringVarModifyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringVarModify}
	 * labeled alternative in {@link LangParser#varMod}.
	 * @param ctx the parse tree
	 */
	void exitStringVarModify(LangParser.StringVarModifyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidMethodDecl}
	 * labeled alternative in {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterVoidMethodDecl(LangParser.VoidMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidMethodDecl}
	 * labeled alternative in {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitVoidMethodDecl(LangParser.VoidMethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intMethodDecl}
	 * labeled alternative in {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterIntMethodDecl(LangParser.IntMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intMethodDecl}
	 * labeled alternative in {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitIntMethodDecl(LangParser.IntMethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringMethodDecl}
	 * labeled alternative in {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterStringMethodDecl(LangParser.StringMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringMethodDecl}
	 * labeled alternative in {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitStringMethodDecl(LangParser.StringMethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#callMethodExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallMethodExpr(LangParser.CallMethodExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#callMethodExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallMethodExpr(LangParser.CallMethodExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifStm}.
	 * @param ctx the parse tree
	 */
	void enterIfStm(LangParser.IfStmContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifStm}.
	 * @param ctx the parse tree
	 */
	void exitIfStm(LangParser.IfStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#whileStm}.
	 * @param ctx the parse tree
	 */
	void enterWhileStm(LangParser.WhileStmContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#whileStm}.
	 * @param ctx the parse tree
	 */
	void exitWhileStm(LangParser.WhileStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#forStm}.
	 * @param ctx the parse tree
	 */
	void enterForStm(LangParser.ForStmContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#forStm}.
	 * @param ctx the parse tree
	 */
	void exitForStm(LangParser.ForStmContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#writeExpr}.
	 * @param ctx the parse tree
	 */
	void enterWriteExpr(LangParser.WriteExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#writeExpr}.
	 * @param ctx the parse tree
	 */
	void exitWriteExpr(LangParser.WriteExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#readIntExpr}.
	 * @param ctx the parse tree
	 */
	void enterReadIntExpr(LangParser.ReadIntExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#readIntExpr}.
	 * @param ctx the parse tree
	 */
	void exitReadIntExpr(LangParser.ReadIntExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#readStringExpr}.
	 * @param ctx the parse tree
	 */
	void enterReadStringExpr(LangParser.ReadStringExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#readStringExpr}.
	 * @param ctx the parse tree
	 */
	void exitReadStringExpr(LangParser.ReadStringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusFirstMathExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusFirstMathExpression(LangParser.MinusFirstMathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusFirstMathExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusFirstMathExpression(LangParser.MinusFirstMathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyDivideExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyDivideExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathValuesExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathValuesExpression(LangParser.MathValuesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathValuesExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathValuesExpression(LangParser.MathValuesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(LangParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(LangParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubstractExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubstractExpression(LangParser.AddSubstractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubstractExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubstractExpression(LangParser.AddSubstractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(LangParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(LangParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(LangParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(LangParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(LangParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(LangParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intParamMethodDecl}
	 * labeled alternative in {@link LangParser#methodDeclParams}.
	 * @param ctx the parse tree
	 */
	void enterIntParamMethodDecl(LangParser.IntParamMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intParamMethodDecl}
	 * labeled alternative in {@link LangParser#methodDeclParams}.
	 * @param ctx the parse tree
	 */
	void exitIntParamMethodDecl(LangParser.IntParamMethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringParamMethodDecl}
	 * labeled alternative in {@link LangParser#methodDeclParams}.
	 * @param ctx the parse tree
	 */
	void enterStringParamMethodDecl(LangParser.StringParamMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringParamMethodDecl}
	 * labeled alternative in {@link LangParser#methodDeclParams}.
	 * @param ctx the parse tree
	 */
	void exitStringParamMethodDecl(LangParser.StringParamMethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intCallParamMethodCall}
	 * labeled alternative in {@link LangParser#methodCallParams}.
	 * @param ctx the parse tree
	 */
	void enterIntCallParamMethodCall(LangParser.IntCallParamMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intCallParamMethodCall}
	 * labeled alternative in {@link LangParser#methodCallParams}.
	 * @param ctx the parse tree
	 */
	void exitIntCallParamMethodCall(LangParser.IntCallParamMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringCallParamMethodCall}
	 * labeled alternative in {@link LangParser#methodCallParams}.
	 * @param ctx the parse tree
	 */
	void enterStringCallParamMethodCall(LangParser.StringCallParamMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringCallParamMethodCall}
	 * labeled alternative in {@link LangParser#methodCallParams}.
	 * @param ctx the parse tree
	 */
	void exitStringCallParamMethodCall(LangParser.StringCallParamMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#intCallParam}.
	 * @param ctx the parse tree
	 */
	void enterIntCallParam(LangParser.IntCallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#intCallParam}.
	 * @param ctx the parse tree
	 */
	void exitIntCallParam(LangParser.IntCallParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#stringCallParam}.
	 * @param ctx the parse tree
	 */
	void enterStringCallParam(LangParser.StringCallParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#stringCallParam}.
	 * @param ctx the parse tree
	 */
	void exitStringCallParam(LangParser.StringCallParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#intParam}.
	 * @param ctx the parse tree
	 */
	void enterIntParam(LangParser.IntParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#intParam}.
	 * @param ctx the parse tree
	 */
	void exitIntParam(LangParser.IntParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#stringParam}.
	 * @param ctx the parse tree
	 */
	void enterStringParam(LangParser.StringParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#stringParam}.
	 * @param ctx the parse tree
	 */
	void exitStringParam(LangParser.StringParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(LangParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(LangParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(LangParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(LangParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(LangParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(LangParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(LangParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(LangParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(LangParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(LangParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringVariable}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 */
	void enterStringVariable(LangParser.StringVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringVariable}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 */
	void exitStringVariable(LangParser.StringVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringRead}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 */
	void enterStringRead(LangParser.StringReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringRead}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 */
	void exitStringRead(LangParser.StringReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intvariable}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 */
	void enterIntvariable(LangParser.IntvariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intvariable}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 */
	void exitIntvariable(LangParser.IntvariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intlitteral}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 */
	void enterIntlitteral(LangParser.IntlitteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intlitteral}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 */
	void exitIntlitteral(LangParser.IntlitteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intread}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 */
	void enterIntread(LangParser.IntreadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intread}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 */
	void exitIntread(LangParser.IntreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#opener}.
	 * @param ctx the parse tree
	 */
	void enterOpener(LangParser.OpenerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#opener}.
	 * @param ctx the parse tree
	 */
	void exitOpener(LangParser.OpenerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#closer}.
	 * @param ctx the parse tree
	 */
	void enterCloser(LangParser.CloserContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#closer}.
	 * @param ctx the parse tree
	 */
	void exitCloser(LangParser.CloserContext ctx);
}