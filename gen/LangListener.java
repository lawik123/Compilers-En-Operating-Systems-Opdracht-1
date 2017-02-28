// Generated from D:/school/jaar2/kwartiel3/Compilers&OperatingSystems/Opdracht-1/Compilers-En-Operating-Systems-Opdracht-1\Lang.g4 by ANTLR 4.6
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
	 * Enter a parse tree produced by {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(LangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(LangParser.VarDeclContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(LangParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(LangParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(LangParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(LangParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void enterForExpr(LangParser.ForExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#forExpr}.
	 * @param ctx the parse tree
	 */
	void exitForExpr(LangParser.ForExprContext ctx);
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
	 * Enter a parse tree produced by the {@code intLitteralExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntLitteralExpression(LangParser.IntLitteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLitteralExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntLitteralExpression(LangParser.IntLitteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(LangParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(LangParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusFirstExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusFirstExpression(LangParser.MinusFirstExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusFirstExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusFirstExpression(LangParser.MinusFirstExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link LangParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LangParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LangParser.VariableContext ctx);
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