// Generated from D:/Desktop/Saxion/Jaar 2/Kwartiel 3/Compilers en Operating Systems/Practicum/Opdracht1(2)/Compilers-En-Operating-Systems-Opdracht-1\Lang.g4 by ANTLR 4.6
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
	 * Visit a parse tree produced by {@link LangParser#nonGlobalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonGlobalExpr(LangParser.NonGlobalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareIntVariable}
	 * labeled alternative in {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareIntVariable(LangParser.DeclareIntVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareStringVariable}
	 * labeled alternative in {@link LangParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStringVariable(LangParser.DeclareStringVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#varMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarMod(LangParser.VarModContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDecl(LangParser.MethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStm(LangParser.IfStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#whileStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStm(LangParser.WhileStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#forStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStm(LangParser.ForStmContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#writeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteExpr(LangParser.WriteExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#callMethodExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethodExpr(LangParser.CallMethodExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#readExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadExpr(LangParser.ReadExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusFirstMathExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusFirstMathExpression(LangParser.MinusFirstMathExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyDivideExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDivideExpression(LangParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathValuesExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathValuesExpression(LangParser.MathValuesExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathvalues(LangParser.MathvaluesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(LangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(LangParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#params2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams2(LangParser.Params2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#variableName2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName2(LangParser.VariableName2Context ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(LangParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(LangParser.MethodTypeContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringvalues(LangParser.StringvaluesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#variableValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValue(LangParser.VariableValueContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link LangParser#returnvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnvalues(LangParser.ReturnvaluesContext ctx);
}