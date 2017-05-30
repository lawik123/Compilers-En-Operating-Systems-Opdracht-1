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
	 * Visit a parse tree produced by {@link LangParser#methodnames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodnames(LangParser.MethodnamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#nonGlobalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonGlobalExpr(LangParser.NonGlobalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareIntGlobalVariable}
	 * labeled alternative in {@link LangParser#varGlobalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareIntGlobalVariable(LangParser.DeclareIntGlobalVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declareStringGlobalVariable}
	 * labeled alternative in {@link LangParser#varGlobalDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareStringGlobalVariable(LangParser.DeclareStringGlobalVariableContext ctx);
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
	 * Visit a parse tree produced by the {@code intVarModify}
	 * labeled alternative in {@link LangParser#varMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVarModify(LangParser.IntVarModifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringVarModify}
	 * labeled alternative in {@link LangParser#varMod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVarModify(LangParser.StringVarModifyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidMethodDecl}
	 * labeled alternative in {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidMethodDecl(LangParser.VoidMethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intMethodDecl}
	 * labeled alternative in {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntMethodDecl(LangParser.IntMethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringMethodDecl}
	 * labeled alternative in {@link LangParser#methodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringMethodDecl(LangParser.StringMethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#runMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRunMethod(LangParser.RunMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#callMethodExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethodExpr(LangParser.CallMethodExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifStm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStm(LangParser.IfStmContext ctx);
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
	 * Visit a parse tree produced by the {@code writeMath}
	 * labeled alternative in {@link LangParser#writevalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteMath(LangParser.WriteMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeString}
	 * labeled alternative in {@link LangParser#writevalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteString(LangParser.WriteStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#readIntExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadIntExpr(LangParser.ReadIntExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#readStringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStringExpr(LangParser.ReadStringExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifExprsensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExprsensions(LangParser.IfExprsensionsContext ctx);
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
	 * Visit a parse tree produced by the {@code restExpression}
	 * labeled alternative in {@link LangParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestExpression(LangParser.RestExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#mathComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathComparison(LangParser.MathComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(LangParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#ifConditionMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionMore(LangParser.IfConditionMoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(LangParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#forConditionMore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForConditionMore(LangParser.ForConditionMoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intParamMethodDecl}
	 * labeled alternative in {@link LangParser#methodDeclParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntParamMethodDecl(LangParser.IntParamMethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringParamMethodDecl}
	 * labeled alternative in {@link LangParser#methodDeclParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringParamMethodDecl(LangParser.StringParamMethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intCallParamMethodCall}
	 * labeled alternative in {@link LangParser#methodCallParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCallParamMethodCall(LangParser.IntCallParamMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringCallParamMethodCall}
	 * labeled alternative in {@link LangParser#methodCallParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCallParamMethodCall(LangParser.StringCallParamMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#intCallParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCallParam(LangParser.IntCallParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#stringCallParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCallParam(LangParser.StringCallParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#intParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntParam(LangParser.IntParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangParser#stringParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringParam(LangParser.StringParamContext ctx);
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
	 * Visit a parse tree produced by {@link LangParser#nameClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameClass(LangParser.NameClassContext ctx);
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
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(LangParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringVariable}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVariable(LangParser.StringVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringRead}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringRead(LangParser.StringReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringCallMethod}
	 * labeled alternative in {@link LangParser#stringvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringCallMethod(LangParser.StringCallMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intvariable}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntvariable(LangParser.IntvariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intlitteral}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntlitteral(LangParser.IntlitteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intread}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntread(LangParser.IntreadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intCallMethod}
	 * labeled alternative in {@link LangParser#mathvalues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntCallMethod(LangParser.IntCallMethodContext ctx);
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