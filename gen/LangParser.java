// Generated from D:/school/jaar2/kwartiel3/Compilers&OperatingSystems/Compilers-En-Operating-Systems-Opdracht-1\Lang.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, IDcrement=34, OP=35, LOP=36, INT=37, STRING=38, STRINGVALUE=39, 
		WL=40, WS=41;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_nonGlobalExpr = 2, RULE_varDecl = 3, 
		RULE_varMod = 4, RULE_methodDecl = 5, RULE_runMethod = 6, RULE_callMethodExpr = 7, 
		RULE_ifStm = 8, RULE_whileStm = 9, RULE_forStm = 10, RULE_writeExpr = 11, 
		RULE_readIntExpr = 12, RULE_readStringExpr = 13, RULE_mathExpr = 14, RULE_whileCondition = 15, 
		RULE_forCondition = 16, RULE_ifCondition = 17, RULE_methodDeclParams = 18, 
		RULE_methodCallParams = 19, RULE_intCallParam = 20, RULE_stringCallParam = 21, 
		RULE_intParam = 22, RULE_stringParam = 23, RULE_dataType = 24, RULE_methodType = 25, 
		RULE_methodName = 26, RULE_variableName = 27, RULE_stringvalues = 28, 
		RULE_mathvalues = 29, RULE_opener = 30, RULE_closer = 31;
	public static final String[] ruleNames = {
		"prog", "expression", "nonGlobalExpr", "varDecl", "varMod", "methodDecl", 
		"runMethod", "callMethodExpr", "ifStm", "whileStm", "forStm", "writeExpr", 
		"readIntExpr", "readStringExpr", "mathExpr", "whileCondition", "forCondition", 
		"ifCondition", "methodDeclParams", "methodCallParams", "intCallParam", 
		"stringCallParam", "intParam", "stringParam", "dataType", "methodType", 
		"methodName", "variableName", "stringvalues", "mathvalues", "opener", 
		"closer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'BEGIN'", "'END'", "'global'", "'~int'", "'IS'", "';'", 
		"'~string'", "'~void'", "'('", "','", "')'", "'return;'", "'return'", 
		"'()run'", "'if'", "'?'", "'REPEAT'", "'UNTIL'", "'for'", "'WRITE('", 
		"'+'", "');'", "'READINT'", "'READSTRING'", "'-'", "'*'", "':'", "'int'", 
		"'string'", "'void'", "'/'", "'\\'", null, null, null, null, null, null, 
		null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "IDcrement", 
		"OP", "LOP", "INT", "STRING", "STRINGVALUE", "WL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Token className;
		public RunMethodContext runMethod() {
			return getRuleContext(RunMethodContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(65);
			((ProgContext)_localctx).className = match(STRING);
			setState(66);
			match(T__1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					expression();
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(73);
			runMethod();
			setState(74);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public MethodDeclContext methodDecl() {
			return getRuleContext(MethodDeclContext.class,0);
		}
		public VarModContext varMod() {
			return getRuleContext(VarModContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				methodDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				varMod();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				mathExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonGlobalExprContext extends ParserRuleContext {
		public IfStmContext ifStm() {
			return getRuleContext(IfStmContext.class,0);
		}
		public WhileStmContext whileStm() {
			return getRuleContext(WhileStmContext.class,0);
		}
		public ForStmContext forStm() {
			return getRuleContext(ForStmContext.class,0);
		}
		public WriteExprContext writeExpr() {
			return getRuleContext(WriteExprContext.class,0);
		}
		public VarModContext varMod() {
			return getRuleContext(VarModContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public CallMethodExprContext callMethodExpr() {
			return getRuleContext(CallMethodExprContext.class,0);
		}
		public NonGlobalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonGlobalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNonGlobalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNonGlobalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNonGlobalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonGlobalExprContext nonGlobalExpr() throws RecognitionException {
		NonGlobalExprContext _localctx = new NonGlobalExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nonGlobalExpr);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				ifStm();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				whileStm();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				forStm();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				writeExpr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				varMod();
				}
				break;
			case T__3:
			case T__4:
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				varDecl();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				callMethodExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	 
		public VarDeclContext() { }
		public void copyFrom(VarDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareStringVariableContext extends VarDeclContext {
		public Token isGlobal;
		public VariableNameContext identifier;
		public StringvaluesContext value;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public StringvaluesContext stringvalues() {
			return getRuleContext(StringvaluesContext.class,0);
		}
		public DeclareStringVariableContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDeclareStringVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDeclareStringVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDeclareStringVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareIntVariableContext extends VarDeclContext {
		public Token isGlobal;
		public VariableNameContext identifier;
		public MathExprContext value;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public DeclareIntVariableContext(VarDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDeclareIntVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDeclareIntVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDeclareIntVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DeclareIntVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(91);
					((DeclareIntVariableContext)_localctx).isGlobal = match(T__3);
					}
				}

				setState(94);
				match(T__4);
				setState(95);
				((DeclareIntVariableContext)_localctx).identifier = variableName();
				setState(96);
				match(T__5);
				setState(97);
				((DeclareIntVariableContext)_localctx).value = mathExpr(0);
				setState(98);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new DeclareStringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(100);
					((DeclareStringVariableContext)_localctx).isGlobal = match(T__3);
					}
				}

				setState(103);
				match(T__7);
				setState(104);
				((DeclareStringVariableContext)_localctx).identifier = variableName();
				setState(105);
				match(T__5);
				setState(106);
				((DeclareStringVariableContext)_localctx).value = stringvalues();
				setState(107);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarModContext extends ParserRuleContext {
		public VarModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varMod; }
	 
		public VarModContext() { }
		public void copyFrom(VarModContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntVarModifyContext extends VarModContext {
		public VariableNameContext identifier;
		public MathExprContext value;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public IntVarModifyContext(VarModContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntVarModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntVarModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntVarModify(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringVarModifyContext extends VarModContext {
		public VariableNameContext identifier;
		public StringvaluesContext value;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public StringvaluesContext stringvalues() {
			return getRuleContext(StringvaluesContext.class,0);
		}
		public StringVarModifyContext(VarModContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringVarModify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringVarModify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringVarModify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModContext varMod() throws RecognitionException {
		VarModContext _localctx = new VarModContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varMod);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IntVarModifyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				((IntVarModifyContext)_localctx).identifier = variableName();
				setState(112);
				match(T__5);
				setState(113);
				((IntVarModifyContext)_localctx).value = mathExpr(0);
				setState(114);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new StringVarModifyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((StringVarModifyContext)_localctx).identifier = variableName();
				setState(117);
				match(T__5);
				setState(118);
				((StringVarModifyContext)_localctx).value = stringvalues();
				setState(119);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclContext extends ParserRuleContext {
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
	 
		public MethodDeclContext() { }
		public void copyFrom(MethodDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntMethodDeclContext extends MethodDeclContext {
		public MethodNameContext methodIdentifier;
		public MathExprContext returnvalue;
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<MethodDeclParamsContext> methodDeclParams() {
			return getRuleContexts(MethodDeclParamsContext.class);
		}
		public MethodDeclParamsContext methodDeclParams(int i) {
			return getRuleContext(MethodDeclParamsContext.class,i);
		}
		public List<NonGlobalExprContext> nonGlobalExpr() {
			return getRuleContexts(NonGlobalExprContext.class);
		}
		public NonGlobalExprContext nonGlobalExpr(int i) {
			return getRuleContext(NonGlobalExprContext.class,i);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public IntMethodDeclContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringMethodDeclContext extends MethodDeclContext {
		public MethodNameContext methodIdentifier;
		public StringvaluesContext returnvalue;
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<MethodDeclParamsContext> methodDeclParams() {
			return getRuleContexts(MethodDeclParamsContext.class);
		}
		public MethodDeclParamsContext methodDeclParams(int i) {
			return getRuleContext(MethodDeclParamsContext.class,i);
		}
		public List<NonGlobalExprContext> nonGlobalExpr() {
			return getRuleContexts(NonGlobalExprContext.class);
		}
		public NonGlobalExprContext nonGlobalExpr(int i) {
			return getRuleContext(NonGlobalExprContext.class,i);
		}
		public StringvaluesContext stringvalues() {
			return getRuleContext(StringvaluesContext.class,0);
		}
		public StringMethodDeclContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VoidMethodDeclContext extends MethodDeclContext {
		public MethodNameContext methodIdentifier;
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<MethodDeclParamsContext> methodDeclParams() {
			return getRuleContexts(MethodDeclParamsContext.class);
		}
		public MethodDeclParamsContext methodDeclParams(int i) {
			return getRuleContext(MethodDeclParamsContext.class,i);
		}
		public List<NonGlobalExprContext> nonGlobalExpr() {
			return getRuleContexts(NonGlobalExprContext.class);
		}
		public NonGlobalExprContext nonGlobalExpr(int i) {
			return getRuleContext(NonGlobalExprContext.class,i);
		}
		public VoidMethodDeclContext(MethodDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVoidMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVoidMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVoidMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDecl);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new VoidMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__8);
				setState(124);
				match(T__9);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(125);
					methodDeclParams();
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(126);
						match(T__10);
						setState(127);
						methodDeclParams();
						}
						}
						setState(132);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(135);
				match(T__11);
				setState(136);
				((VoidMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(137);
				opener();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(138);
					nonGlobalExpr();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(T__12);
				setState(145);
				closer();
				}
				break;
			case T__4:
				_localctx = new IntMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__4);
				setState(148);
				match(T__9);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(149);
					methodDeclParams();
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(150);
						match(T__10);
						setState(151);
						methodDeclParams();
						}
						}
						setState(156);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(159);
				match(T__11);
				setState(160);
				((IntMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(161);
				opener();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(162);
					nonGlobalExpr();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(T__13);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__25) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(169);
					((IntMethodDeclContext)_localctx).returnvalue = mathExpr(0);
					}
				}

				setState(172);
				match(T__6);
				setState(173);
				closer();
				}
				break;
			case T__7:
				_localctx = new StringMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__7);
				setState(176);
				match(T__9);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(177);
					methodDeclParams();
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(178);
						match(T__10);
						setState(179);
						methodDeclParams();
						}
						}
						setState(184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(187);
				match(T__11);
				setState(188);
				((StringMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(189);
				opener();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(190);
					nonGlobalExpr();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(T__13);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
					{
					setState(197);
					((StringMethodDeclContext)_localctx).returnvalue = stringvalues();
					}
				}

				setState(200);
				match(T__6);
				setState(201);
				closer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunMethodContext extends ParserRuleContext {
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
		}
		public List<NonGlobalExprContext> nonGlobalExpr() {
			return getRuleContexts(NonGlobalExprContext.class);
		}
		public NonGlobalExprContext nonGlobalExpr(int i) {
			return getRuleContext(NonGlobalExprContext.class,i);
		}
		public RunMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterRunMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitRunMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitRunMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunMethodContext runMethod() throws RecognitionException {
		RunMethodContext _localctx = new RunMethodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_runMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__8);
			setState(206);
			match(T__14);
			setState(207);
			opener();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(208);
				nonGlobalExpr();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(T__12);
			setState(215);
			closer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallMethodExprContext extends ParserRuleContext {
		public MethodNameContext methodIdentifier;
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<MethodCallParamsContext> methodCallParams() {
			return getRuleContexts(MethodCallParamsContext.class);
		}
		public MethodCallParamsContext methodCallParams(int i) {
			return getRuleContext(MethodCallParamsContext.class,i);
		}
		public CallMethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callMethodExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCallMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCallMethodExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCallMethodExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallMethodExprContext callMethodExpr() throws RecognitionException {
		CallMethodExprContext _localctx = new CallMethodExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callMethodExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__9);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << INT) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
				{
				setState(218);
				methodCallParams();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(219);
					match(T__10);
					setState(220);
					methodCallParams();
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(228);
			match(T__11);
			setState(229);
			((CallMethodExprContext)_localctx).methodIdentifier = methodName();
			setState(230);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStmContext extends ParserRuleContext {
		public NonGlobalExprContext ifBlock;
		public NonGlobalExprContext ifElseBlock;
		public NonGlobalExprContext elseBlock;
		public List<IfConditionContext> ifCondition() {
			return getRuleContexts(IfConditionContext.class);
		}
		public IfConditionContext ifCondition(int i) {
			return getRuleContext(IfConditionContext.class,i);
		}
		public List<OpenerContext> opener() {
			return getRuleContexts(OpenerContext.class);
		}
		public OpenerContext opener(int i) {
			return getRuleContext(OpenerContext.class,i);
		}
		public List<CloserContext> closer() {
			return getRuleContexts(CloserContext.class);
		}
		public CloserContext closer(int i) {
			return getRuleContext(CloserContext.class,i);
		}
		public List<NonGlobalExprContext> nonGlobalExpr() {
			return getRuleContexts(NonGlobalExprContext.class);
		}
		public NonGlobalExprContext nonGlobalExpr(int i) {
			return getRuleContext(NonGlobalExprContext.class,i);
		}
		public IfStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmContext ifStm() throws RecognitionException {
		IfStmContext _localctx = new IfStmContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__15);
			setState(233);
			match(T__9);
			setState(234);
			ifCondition();
			setState(235);
			match(T__11);
			setState(236);
			opener();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(237);
				((IfStmContext)_localctx).ifBlock = nonGlobalExpr();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			closer();
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(244);
						match(T__16);
						setState(245);
						match(T__9);
						setState(246);
						ifCondition();
						setState(247);
						match(T__11);
						setState(248);
						opener();
						setState(252);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
							{
							{
							setState(249);
							((IfStmContext)_localctx).ifElseBlock = nonGlobalExpr();
							}
							}
							setState(254);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(255);
						closer();
						}
						} 
					}
					setState(261);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(262);
					match(T__16);
					setState(263);
					opener();
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
						{
						{
						setState(264);
						((IfStmContext)_localctx).elseBlock = nonGlobalExpr();
						}
						}
						setState(269);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(270);
					closer();
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStmContext extends ParserRuleContext {
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
		}
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public List<NonGlobalExprContext> nonGlobalExpr() {
			return getRuleContexts(NonGlobalExprContext.class);
		}
		public NonGlobalExprContext nonGlobalExpr(int i) {
			return getRuleContext(NonGlobalExprContext.class,i);
		}
		public WhileStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWhileStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWhileStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWhileStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmContext whileStm() throws RecognitionException {
		WhileStmContext _localctx = new WhileStmContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__17);
			setState(277);
			opener();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(278);
				nonGlobalExpr();
				}
				}
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
			closer();
			setState(285);
			match(T__18);
			setState(286);
			match(T__9);
			setState(287);
			whileCondition();
			setState(288);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStmContext extends ParserRuleContext {
		public Token idCrement;
		public VariableNameContext idValue;
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
		}
		public TerminalNode IDcrement() { return getToken(LangParser.IDcrement, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public List<NonGlobalExprContext> nonGlobalExpr() {
			return getRuleContexts(NonGlobalExprContext.class);
		}
		public NonGlobalExprContext nonGlobalExpr(int i) {
			return getRuleContext(NonGlobalExprContext.class,i);
		}
		public ForStmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterForStm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitForStm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitForStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmContext forStm() throws RecognitionException {
		ForStmContext _localctx = new ForStmContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__19);
			setState(291);
			match(T__9);
			setState(292);
			varDecl();
			setState(293);
			forCondition();
			setState(294);
			match(T__6);
			setState(295);
			((ForStmContext)_localctx).idCrement = match(IDcrement);
			setState(296);
			match(T__9);
			setState(297);
			((ForStmContext)_localctx).idValue = variableName();
			setState(298);
			match(T__11);
			setState(299);
			match(T__11);
			setState(300);
			opener();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(301);
				nonGlobalExpr();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			closer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteExprContext extends ParserRuleContext {
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public List<StringvaluesContext> stringvalues() {
			return getRuleContexts(StringvaluesContext.class);
		}
		public StringvaluesContext stringvalues(int i) {
			return getRuleContext(StringvaluesContext.class,i);
		}
		public WriteExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWriteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWriteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWriteExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteExprContext writeExpr() throws RecognitionException {
		WriteExprContext _localctx = new WriteExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_writeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__20);
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(310);
				mathExpr(0);
				}
				break;
			case 2:
				{
				setState(311);
				stringvalues();
				}
				break;
			}
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(314);
				match(T__21);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << INT) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						setState(315);
						mathExpr(0);
						}
						break;
					case 2:
						{
						setState(316);
						stringvalues();
						}
						break;
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(324);
			match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadIntExprContext extends ParserRuleContext {
		public ReadIntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readIntExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterReadIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitReadIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReadIntExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadIntExprContext readIntExpr() throws RecognitionException {
		ReadIntExprContext _localctx = new ReadIntExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_readIntExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStringExprContext extends ParserRuleContext {
		public ReadStringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStringExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterReadStringExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitReadStringExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReadStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStringExprContext readStringExpr() throws RecognitionException {
		ReadStringExprContext _localctx = new ReadStringExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_readStringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathExprContext extends ParserRuleContext {
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
	 
		public MathExprContext() { }
		public void copyFrom(MathExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusFirstMathExpressionContext extends MathExprContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public MinusFirstMathExpressionContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMinusFirstMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMinusFirstMathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMinusFirstMathExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyDivideExpressionContext extends MathExprContext {
		public MathExprContext leftExpr;
		public Token op;
		public MathExprContext rightExpr;
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public MultiplyDivideExpressionContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMultiplyDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMultiplyDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMultiplyDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathValuesExpressionContext extends MathExprContext {
		public MathvaluesContext value;
		public MathvaluesContext mathvalues() {
			return getRuleContext(MathvaluesContext.class,0);
		}
		public MathValuesExpressionContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMathValuesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMathValuesExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMathValuesExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionContext extends MathExprContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public ParenthesisExpressionContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubstractExpressionContext extends MathExprContext {
		public MathExprContext leftExpr;
		public Token op;
		public MathExprContext rightExpr;
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public AddSubstractExpressionContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAddSubstractExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAddSubstractExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAddSubstractExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		return mathExpr(0);
	}

	private MathExprContext mathExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathExprContext _localctx = new MathExprContext(_ctx, _parentState);
		MathExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_mathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(331);
				match(T__9);
				setState(332);
				mathExpr(0);
				setState(333);
				match(T__11);
				}
				break;
			case T__25:
				{
				_localctx = new MinusFirstMathExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(T__25);
				setState(336);
				mathExpr(4);
				}
				break;
			case T__23:
			case INT:
			case STRING:
				{
				_localctx = new MathValuesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				((MathValuesExpressionContext)_localctx).value = mathvalues();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(346);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyDivideExpressionContext(new MathExprContext(_parentctx, _parentState));
						((MultiplyDivideExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(340);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(341);
						((MultiplyDivideExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((MultiplyDivideExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(342);
						((MultiplyDivideExpressionContext)_localctx).rightExpr = mathExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubstractExpressionContext(new MathExprContext(_parentctx, _parentState));
						((AddSubstractExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(343);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(344);
						((AddSubstractExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__25) ) {
							((AddSubstractExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(345);
						((AddSubstractExpressionContext)_localctx).rightExpr = mathExpr(3);
						}
						break;
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WhileConditionContext extends ParserRuleContext {
		public MathExprContext identifierLeft;
		public Token lop;
		public MathExprContext identifierRight;
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public TerminalNode LOP() { return getToken(LangParser.LOP, 0); }
		public WhileConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			((WhileConditionContext)_localctx).identifierLeft = mathExpr(0);
			setState(352);
			((WhileConditionContext)_localctx).lop = match(LOP);
			setState(353);
			((WhileConditionContext)_localctx).identifierRight = mathExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public MathExprContext identifierLeft;
		public Token lop;
		public MathExprContext identifierRight;
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public TerminalNode LOP() { return getToken(LangParser.LOP, 0); }
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			((ForConditionContext)_localctx).identifierLeft = mathExpr(0);
			setState(356);
			((ForConditionContext)_localctx).lop = match(LOP);
			setState(357);
			((ForConditionContext)_localctx).identifierRight = mathExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public MathExprContext identifierLeft;
		public Token lop;
		public MathExprContext identifierRight;
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public TerminalNode LOP() { return getToken(LangParser.LOP, 0); }
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			((IfConditionContext)_localctx).identifierLeft = mathExpr(0);
			setState(360);
			((IfConditionContext)_localctx).lop = match(LOP);
			setState(361);
			((IfConditionContext)_localctx).identifierRight = mathExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclParamsContext extends ParserRuleContext {
		public MethodDeclParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclParams; }
	 
		public MethodDeclParamsContext() { }
		public void copyFrom(MethodDeclParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringParamMethodDeclContext extends MethodDeclParamsContext {
		public StringParamContext stringParam() {
			return getRuleContext(StringParamContext.class,0);
		}
		public StringParamMethodDeclContext(MethodDeclParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringParamMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringParamMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringParamMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntParamMethodDeclContext extends MethodDeclParamsContext {
		public IntParamContext intParam() {
			return getRuleContext(IntParamContext.class,0);
		}
		public IntParamMethodDeclContext(MethodDeclParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntParamMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntParamMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntParamMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclParamsContext methodDeclParams() throws RecognitionException {
		MethodDeclParamsContext _localctx = new MethodDeclParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodDeclParams);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new IntParamMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				intParam();
				}
				break;
			case T__7:
				_localctx = new StringParamMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				stringParam();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodCallParamsContext extends ParserRuleContext {
		public MethodCallParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallParams; }
	 
		public MethodCallParamsContext() { }
		public void copyFrom(MethodCallParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntCallParamMethodCallContext extends MethodCallParamsContext {
		public IntCallParamContext intCallParam() {
			return getRuleContext(IntCallParamContext.class,0);
		}
		public IntCallParamMethodCallContext(MethodCallParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntCallParamMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntCallParamMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntCallParamMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringCallParamMethodCallContext extends MethodCallParamsContext {
		public StringCallParamContext stringCallParam() {
			return getRuleContext(StringCallParamContext.class,0);
		}
		public StringCallParamMethodCallContext(MethodCallParamsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringCallParamMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringCallParamMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringCallParamMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallParamsContext methodCallParams() throws RecognitionException {
		MethodCallParamsContext _localctx = new MethodCallParamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodCallParams);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new IntCallParamMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				intCallParam();
				}
				break;
			case 2:
				_localctx = new StringCallParamMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				stringCallParam();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntCallParamContext extends ParserRuleContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public IntCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intCallParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntCallParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntCallParamContext intCallParam() throws RecognitionException {
		IntCallParamContext _localctx = new IntCallParamContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_intCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			mathExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringCallParamContext extends ParserRuleContext {
		public StringvaluesContext stringvalues() {
			return getRuleContext(StringvaluesContext.class,0);
		}
		public StringCallParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringCallParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringCallParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringCallParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringCallParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringCallParamContext stringCallParam() throws RecognitionException {
		StringCallParamContext _localctx = new StringCallParamContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_stringCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			stringvalues();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntParamContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public IntParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntParamContext intParam() throws RecognitionException {
		IntParamContext _localctx = new IntParamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_intParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(T__4);
			setState(376);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringParamContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public StringParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringParamContext stringParam() throws RecognitionException {
		StringParamContext _localctx = new StringParamContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stringParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__7);
			setState(379);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodTypeContext extends ParserRuleContext {
		public MethodTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMethodType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMethodType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMethodType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodTypeContext methodType() throws RecognitionException {
		MethodTypeContext _localctx = new MethodTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_methodType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMethodName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringvaluesContext extends ParserRuleContext {
		public StringvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringvalues; }
	 
		public StringvaluesContext() { }
		public void copyFrom(StringvaluesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringVariableContext extends StringvaluesContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public StringVariableContext(StringvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends StringvaluesContext {
		public TerminalNode STRINGVALUE() { return getToken(LangParser.STRINGVALUE, 0); }
		public StringLiteralContext(StringvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringReadContext extends StringvaluesContext {
		public ReadStringExprContext readStringExpr() {
			return getRuleContext(ReadStringExprContext.class,0);
		}
		public StringReadContext(StringvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringvaluesContext stringvalues() throws RecognitionException {
		StringvaluesContext _localctx = new StringvaluesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_stringvalues);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGVALUE:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				match(STRINGVALUE);
				}
				break;
			case STRING:
				_localctx = new StringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				variableName();
				}
				break;
			case T__24:
				_localctx = new StringReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				readStringExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathvaluesContext extends ParserRuleContext {
		public MathvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathvalues; }
	 
		public MathvaluesContext() { }
		public void copyFrom(MathvaluesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntvariableContext extends MathvaluesContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public IntvariableContext(MathvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntvariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntvariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntlitteralContext extends MathvaluesContext {
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public IntlitteralContext(MathvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntlitteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntlitteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntlitteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntreadContext extends MathvaluesContext {
		public ReadIntExprContext readIntExpr() {
			return getRuleContext(ReadIntExprContext.class,0);
		}
		public IntreadContext(MathvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntread(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntread(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathvaluesContext mathvalues() throws RecognitionException {
		MathvaluesContext _localctx = new MathvaluesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mathvalues);
		try {
			setState(397);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new IntvariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				variableName();
				}
				break;
			case INT:
				_localctx = new IntlitteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(INT);
				}
				break;
			case T__23:
				_localctx = new IntreadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				readIntExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenerContext extends ParserRuleContext {
		public OpenerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opener; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterOpener(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitOpener(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitOpener(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenerContext opener() throws RecognitionException {
		OpenerContext _localctx = new OpenerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_opener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloserContext extends ParserRuleContext {
		public CloserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCloser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCloser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCloser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloserContext closer() throws RecognitionException {
		CloserContext _localctx = new CloserContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return mathExpr_sempred((MathExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathExpr_sempred(MathExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0196\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\5\3S\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\\\n\4\3\5\5\5_\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5p\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\7\3\7\3\7\7\7\u0083"+
		"\n\7\f\7\16\7\u0086\13\7\5\7\u0088\n\7\3\7\3\7\3\7\3\7\7\7\u008e\n\7\f"+
		"\7\16\7\u0091\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009b\n\7\f\7\16"+
		"\7\u009e\13\7\5\7\u00a0\n\7\3\7\3\7\3\7\3\7\7\7\u00a6\n\7\f\7\16\7\u00a9"+
		"\13\7\3\7\3\7\5\7\u00ad\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b7"+
		"\n\7\f\7\16\7\u00ba\13\7\5\7\u00bc\n\7\3\7\3\7\3\7\3\7\7\7\u00c2\n\7\f"+
		"\7\16\7\u00c5\13\7\3\7\3\7\5\7\u00c9\n\7\3\7\3\7\3\7\5\7\u00ce\n\7\3\b"+
		"\3\b\3\b\3\b\7\b\u00d4\n\b\f\b\16\b\u00d7\13\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\7\t\u00e0\n\t\f\t\16\t\u00e3\13\t\5\t\u00e5\n\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f1\n\n\f\n\16\n\u00f4\13\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00fd\n\n\f\n\16\n\u0100\13\n\3\n\3\n\7\n\u0104\n\n"+
		"\f\n\16\n\u0107\13\n\3\n\3\n\3\n\7\n\u010c\n\n\f\n\16\n\u010f\13\n\3\n"+
		"\3\n\5\n\u0113\n\n\5\n\u0115\n\n\3\13\3\13\3\13\7\13\u011a\n\13\f\13\16"+
		"\13\u011d\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0131\n\f\f\f\16\f\u0134\13\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u013b\n\r\3\r\3\r\3\r\7\r\u0140\n\r\f\r\16\r\u0143\13\r\5"+
		"\r\u0145\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0155\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u015d\n"+
		"\20\f\20\16\20\u0160\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\5\24\u0170\n\24\3\25\3\25\5\25\u0174\n\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\5\36\u018b\n\36\3\37\3\37\3\37\5\37"+
		"\u0190\n\37\3 \3 \3!\3!\3!\2\3\36\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@\2\6\3\2\35\36\4\2\30\30\34\34\3\2\37 \3"+
		"\2\37!\u01a9\2B\3\2\2\2\4R\3\2\2\2\6[\3\2\2\2\bo\3\2\2\2\n{\3\2\2\2\f"+
		"\u00cd\3\2\2\2\16\u00cf\3\2\2\2\20\u00db\3\2\2\2\22\u00ea\3\2\2\2\24\u0116"+
		"\3\2\2\2\26\u0124\3\2\2\2\30\u0137\3\2\2\2\32\u0148\3\2\2\2\34\u014a\3"+
		"\2\2\2\36\u0154\3\2\2\2 \u0161\3\2\2\2\"\u0165\3\2\2\2$\u0169\3\2\2\2"+
		"&\u016f\3\2\2\2(\u0173\3\2\2\2*\u0175\3\2\2\2,\u0177\3\2\2\2.\u0179\3"+
		"\2\2\2\60\u017c\3\2\2\2\62\u017f\3\2\2\2\64\u0181\3\2\2\2\66\u0183\3\2"+
		"\2\28\u0185\3\2\2\2:\u018a\3\2\2\2<\u018f\3\2\2\2>\u0191\3\2\2\2@\u0193"+
		"\3\2\2\2BC\7\3\2\2CD\7(\2\2DH\7\4\2\2EG\5\4\3\2FE\3\2\2\2GJ\3\2\2\2HF"+
		"\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\5\16\b\2LM\7\5\2\2M\3\3\2\2\2"+
		"NS\5\b\5\2OS\5\f\7\2PS\5\n\6\2QS\5\36\20\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2"+
		"\2RQ\3\2\2\2S\5\3\2\2\2T\\\5\22\n\2U\\\5\24\13\2V\\\5\26\f\2W\\\5\30\r"+
		"\2X\\\5\n\6\2Y\\\5\b\5\2Z\\\5\20\t\2[T\3\2\2\2[U\3\2\2\2[V\3\2\2\2[W\3"+
		"\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\7\3\2\2\2]_\7\6\2\2^]\3\2\2\2^"+
		"_\3\2\2\2_`\3\2\2\2`a\7\7\2\2ab\58\35\2bc\7\b\2\2cd\5\36\20\2de\7\t\2"+
		"\2ep\3\2\2\2fh\7\6\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\n\2\2jk\58\35"+
		"\2kl\7\b\2\2lm\5:\36\2mn\7\t\2\2np\3\2\2\2o^\3\2\2\2og\3\2\2\2p\t\3\2"+
		"\2\2qr\58\35\2rs\7\b\2\2st\5\36\20\2tu\7\t\2\2u|\3\2\2\2vw\58\35\2wx\7"+
		"\b\2\2xy\5:\36\2yz\7\t\2\2z|\3\2\2\2{q\3\2\2\2{v\3\2\2\2|\13\3\2\2\2}"+
		"~\7\13\2\2~\u0087\7\f\2\2\177\u0084\5&\24\2\u0080\u0081\7\r\2\2\u0081"+
		"\u0083\5&\24\2\u0082\u0080\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087"+
		"\177\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\16"+
		"\2\2\u008a\u008b\5\66\34\2\u008b\u008f\5> \2\u008c\u008e\5\6\4\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\17\2\2\u0093"+
		"\u0094\5@!\2\u0094\u00ce\3\2\2\2\u0095\u0096\7\7\2\2\u0096\u009f\7\f\2"+
		"\2\u0097\u009c\5&\24\2\u0098\u0099\7\r\2\2\u0099\u009b\5&\24\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u0097\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\5\66\34\2\u00a3"+
		"\u00a7\5> \2\u00a4\u00a6\5\6\4\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ac\7\20\2\2\u00ab\u00ad\5\36\20\2\u00ac\u00ab\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\7\t\2\2\u00af\u00b0"+
		"\5@!\2\u00b0\u00ce\3\2\2\2\u00b1\u00b2\7\n\2\2\u00b2\u00bb\7\f\2\2\u00b3"+
		"\u00b8\5&\24\2\u00b4\u00b5\7\r\2\2\u00b5\u00b7\5&\24\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\16\2\2\u00be\u00bf\5\66\34\2\u00bf"+
		"\u00c3\5> \2\u00c0\u00c2\5\6\4\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2"+
		"\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\u00c8\7\20\2\2\u00c7\u00c9\5:\36\2\u00c8\u00c7\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\t\2\2\u00cb\u00cc"+
		"\5@!\2\u00cc\u00ce\3\2\2\2\u00cd}\3\2\2\2\u00cd\u0095\3\2\2\2\u00cd\u00b1"+
		"\3\2\2\2\u00ce\r\3\2\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d1\7\21\2\2\u00d1"+
		"\u00d5\5> \2\u00d2\u00d4\5\6\4\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2"+
		"\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5"+
		"\3\2\2\2\u00d8\u00d9\7\17\2\2\u00d9\u00da\5@!\2\u00da\17\3\2\2\2\u00db"+
		"\u00e4\7\f\2\2\u00dc\u00e1\5(\25\2\u00dd\u00de\7\r\2\2\u00de\u00e0\5("+
		"\25\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00dc\3\2"+
		"\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\16\2\2\u00e7"+
		"\u00e8\5\66\34\2\u00e8\u00e9\7\t\2\2\u00e9\21\3\2\2\2\u00ea\u00eb\7\22"+
		"\2\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\5$\23\2\u00ed\u00ee\7\16\2\2\u00ee"+
		"\u00f2\5> \2\u00ef\u00f1\5\6\4\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2"+
		"\3\2\2\2\u00f5\u0114\5@!\2\u00f6\u00f7\7\23\2\2\u00f7\u00f8\7\f\2\2\u00f8"+
		"\u00f9\5$\23\2\u00f9\u00fa\7\16\2\2\u00fa\u00fe\5> \2\u00fb\u00fd\5\6"+
		"\4\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\5@"+
		"!\2\u0102\u0104\3\2\2\2\u0103\u00f6\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0112\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u0109\7\23\2\2\u0109\u010d\5> \2\u010a\u010c\5\6\4\2\u010b"+
		"\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2"+
		"\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\5@!\2\u0111\u0113"+
		"\3\2\2\2\u0112\u0108\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0105\3\2\2\2\u0114\u0115\3\2\2\2\u0115\23\3\2\2\2\u0116\u0117\7\24\2"+
		"\2\u0117\u011b\5> \2\u0118\u011a\5\6\4\2\u0119\u0118\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\5@!\2\u011f\u0120\7\25\2\2\u0120\u0121\7\f"+
		"\2\2\u0121\u0122\5 \21\2\u0122\u0123\7\16\2\2\u0123\25\3\2\2\2\u0124\u0125"+
		"\7\26\2\2\u0125\u0126\7\f\2\2\u0126\u0127\5\b\5\2\u0127\u0128\5\"\22\2"+
		"\u0128\u0129\7\t\2\2\u0129\u012a\7$\2\2\u012a\u012b\7\f\2\2\u012b\u012c"+
		"\58\35\2\u012c\u012d\7\16\2\2\u012d\u012e\7\16\2\2\u012e\u0132\5> \2\u012f"+
		"\u0131\5\6\4\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135"+
		"\u0136\5@!\2\u0136\27\3\2\2\2\u0137\u013a\7\27\2\2\u0138\u013b\5\36\20"+
		"\2\u0139\u013b\5:\36\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u0144"+
		"\3\2\2\2\u013c\u0141\7\30\2\2\u013d\u0140\5\36\20\2\u013e\u0140\5:\36"+
		"\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f"+
		"\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0144"+
		"\u013c\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\31"+
		"\2\2\u0147\31\3\2\2\2\u0148\u0149\7\32\2\2\u0149\33\3\2\2\2\u014a\u014b"+
		"\7\33\2\2\u014b\35\3\2\2\2\u014c\u014d\b\20\1\2\u014d\u014e\7\f\2\2\u014e"+
		"\u014f\5\36\20\2\u014f\u0150\7\16\2\2\u0150\u0155\3\2\2\2\u0151\u0152"+
		"\7\34\2\2\u0152\u0155\5\36\20\6\u0153\u0155\5<\37\2\u0154\u014c\3\2\2"+
		"\2\u0154\u0151\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u015e\3\2\2\2\u0156\u0157"+
		"\f\5\2\2\u0157\u0158\t\2\2\2\u0158\u015d\5\36\20\6\u0159\u015a\f\4\2\2"+
		"\u015a\u015b\t\3\2\2\u015b\u015d\5\36\20\5\u015c\u0156\3\2\2\2\u015c\u0159"+
		"\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f"+
		"\37\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0162\5\36\20\2\u0162\u0163\7&\2"+
		"\2\u0163\u0164\5\36\20\2\u0164!\3\2\2\2\u0165\u0166\5\36\20\2\u0166\u0167"+
		"\7&\2\2\u0167\u0168\5\36\20\2\u0168#\3\2\2\2\u0169\u016a\5\36\20\2\u016a"+
		"\u016b\7&\2\2\u016b\u016c\5\36\20\2\u016c%\3\2\2\2\u016d\u0170\5.\30\2"+
		"\u016e\u0170\5\60\31\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\'"+
		"\3\2\2\2\u0171\u0174\5*\26\2\u0172\u0174\5,\27\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0172\3\2\2\2\u0174)\3\2\2\2\u0175\u0176\5\36\20\2\u0176+\3\2\2\2\u0177"+
		"\u0178\5:\36\2\u0178-\3\2\2\2\u0179\u017a\7\7\2\2\u017a\u017b\58\35\2"+
		"\u017b/\3\2\2\2\u017c\u017d\7\n\2\2\u017d\u017e\58\35\2\u017e\61\3\2\2"+
		"\2\u017f\u0180\t\4\2\2\u0180\63\3\2\2\2\u0181\u0182\t\5\2\2\u0182\65\3"+
		"\2\2\2\u0183\u0184\7(\2\2\u0184\67\3\2\2\2\u0185\u0186\7(\2\2\u01869\3"+
		"\2\2\2\u0187\u018b\7)\2\2\u0188\u018b\58\35\2\u0189\u018b\5\34\17\2\u018a"+
		"\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b;\3\2\2\2"+
		"\u018c\u0190\58\35\2\u018d\u0190\7\'\2\2\u018e\u0190\5\32\16\2\u018f\u018c"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190=\3\2\2\2\u0191"+
		"\u0192\7\"\2\2\u0192?\3\2\2\2\u0193\u0194\7#\2\2\u0194A\3\2\2\2+HR[^g"+
		"o{\u0084\u0087\u008f\u009c\u009f\u00a7\u00ac\u00b8\u00bb\u00c3\u00c8\u00cd"+
		"\u00d5\u00e1\u00e4\u00f2\u00fe\u0105\u010d\u0112\u0114\u011b\u0132\u013a"+
		"\u013f\u0141\u0144\u0154\u015c\u015e\u016f\u0173\u018a\u018f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}