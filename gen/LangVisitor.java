// Generated from D:/school/jaar2/kwartiel3/Compilers&OperatingSystems/Opdracht-1/Compilers-En-Operating-Systems-Opdracht-1\Lang.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(LangParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(LangParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(LangParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#whileExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(LangParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#forExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpr(LangParser.ForExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#writeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteExpr(LangParser.WriteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#readExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpr(LangParser.ReadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLitteralExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLitteralExpression(LangParser.IntLitteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(LangParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusFirstExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusFirstExpression(LangParser.MinusFirstExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyDivideExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(LangParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubstractExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubstractExpression(LangParser.AddSubstractExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(LangParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(LangParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(LangParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LangParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#opener}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpener(LangParser.OpenerContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#closer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloser(LangParser.CloserContext ctx);
}