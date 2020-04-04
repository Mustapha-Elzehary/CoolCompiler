// Generated from C:/Users/Admin/IdeaProjects/Intellij_ANTLR1/src\Cool.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CoolParser}.
 */
public interface CoolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CoolParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CoolParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classes}
	 * labeled alternative in {@link CoolParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterClasses(CoolParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link CoolParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitClasses(CoolParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eof}
	 * labeled alternative in {@link CoolParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterEof(CoolParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eof}
	 * labeled alternative in {@link CoolParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitEof(CoolParser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(CoolParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(CoolParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(CoolParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(CoolParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method}
	 * labeled alternative in {@link CoolParser#function}.
	 * @param ctx the parse tree
	 */
	void enterMethod(CoolParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method}
	 * labeled alternative in {@link CoolParser#function}.
	 * @param ctx the parse tree
	 */
	void exitMethod(CoolParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CoolParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CoolParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code property}
	 * labeled alternative in {@link CoolParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CoolParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code property}
	 * labeled alternative in {@link CoolParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CoolParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(CoolParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(CoolParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(CoolParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(CoolParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CoolParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CoolParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CoolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CoolParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#assigmentstmt}.
	 * @param ctx the parse tree
	 */
	void enterAssigmentstmt(CoolParser.AssigmentstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#assigmentstmt}.
	 * @param ctx the parse tree
	 */
	void exitAssigmentstmt(CoolParser.AssigmentstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link CoolParser#methodOwnCall}.
	 * @param ctx the parse tree
	 */
	void enterOwnMethodCall(CoolParser.OwnMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link CoolParser#methodOwnCall}.
	 * @param ctx the parse tree
	 */
	void exitOwnMethodCall(CoolParser.OwnMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(CoolParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(CoolParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link CoolParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodcall(CoolParser.MethodcallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodcall}
	 * labeled alternative in {@link CoolParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodcall(CoolParser.MethodcallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIf(CoolParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CoolParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIf(CoolParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoolParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CoolParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link CoolParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CoolParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(CoolParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(CoolParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CoolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CoolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void enterCaseStmt(CoolParser.CaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#caseStmt}.
	 * @param ctx the parse tree
	 */
	void exitCaseStmt(CoolParser.CaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link CoolParser#negativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(CoolParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link CoolParser#negativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(CoolParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CoolParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(CoolParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CoolParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(CoolParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link CoolParser#isvoidExpr}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(CoolParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link CoolParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(CoolParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link CoolParser#notExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(CoolParser.BoolNotContext ctx);
}