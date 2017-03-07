// Generated from D:/Desktop/Saxion/Jaar 2/Kwartiel 3/Compilers en Operating Systems/Practicum/Opdracht1(2)/Compilers-En-Operating-Systems-Opdracht-1\Lang.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link LangParser#varMod}.
	 * @param ctx the parse tree
	 */
	void enterVarMod(LangParser.VarModContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#varMod}.
	 * @param ctx the parse tree
	 */
	void exitVarMod(LangParser.VarModContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDecl(LangParser.MethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDecl(LangParser.MethodDeclContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void enterReadExpr(LangParser.ReadExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#readExpr}.
	 * @param ctx the parse tree
	 */
	void exitReadExpr(LangParser.ReadExprContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 */
	void enterMathvalues(LangParser.MathvaluesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 */
	void exitMathvalues(LangParser.MathvaluesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(LangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(LangParser.ConditionContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 */
	void enterStringvalues(LangParser.StringvaluesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 */
	void exitStringvalues(LangParser.StringvaluesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void enterVariableValue(LangParser.VariableValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#variableValue}.
	 * @param ctx the parse tree
	 */
	void exitVariableValue(LangParser.VariableValueContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link LangParser#returnvalues}.
	 * @param ctx the parse tree
	 */
	void enterReturnvalues(LangParser.ReturnvaluesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#returnvalues}.
	 * @param ctx the parse tree
	 */
	void exitReturnvalues(LangParser.ReturnvaluesContext ctx);
}