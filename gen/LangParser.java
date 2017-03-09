// Generated from D:/Desktop/Saxion/Jaar 2/Kwartiel 3/Compilers en Operating Systems/Practicum/Opdracht1(2)/Compilers-En-Operating-Systems-Opdracht-1\Lang.g4 by ANTLR 4.6
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
		T__24=25, T__25=26, T__26=27, T__27=28, IDcrement=29, OP=30, LOP=31, INT=32, 
		STRING=33, STRINGVALUE=34, WL=35, WS=36;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_nonGlobalExpr = 2, RULE_varDecl = 3, 
		RULE_varMod = 4, RULE_methodDecl = 5, RULE_ifStm = 6, RULE_whileStm = 7, 
		RULE_forStm = 8, RULE_writeExpr = 9, RULE_readExpr = 10, RULE_mathExpr = 11, 
		RULE_mathvalues = 12, RULE_condition = 13, RULE_params = 14, RULE_params2 = 15, 
		RULE_dataType = 16, RULE_methodType = 17, RULE_methodName = 18, RULE_variableName = 19, 
		RULE_stringvalues = 20, RULE_variableValue = 21, RULE_opener = 22, RULE_closer = 23, 
		RULE_returnvalues = 24;
	public static final String[] ruleNames = {
		"prog", "expression", "nonGlobalExpr", "varDecl", "varMod", "methodDecl", 
		"ifStm", "whileStm", "forStm", "writeExpr", "readExpr", "mathExpr", "mathvalues", 
		"condition", "params", "params2", "dataType", "methodType", "methodName", 
		"variableName", "stringvalues", "variableValue", "opener", "closer", "returnvalues"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'BEGIN'", "'END'", "'global'", "'~'", "'int'", "'IS'", "';'", 
		"'string'", "'('", "')'", "'return'", "'if'", "'?'", "'REPEAT'", "'UNTILL'", 
		"'for'", "'WRITE('", "'+'", "');'", "'READ'", "'-'", "'*'", "':'", "','", 
		"'void'", "'/'", "'\\'", null, null, null, null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "IDcrement", "OP", "LOP", "INT", "STRING", 
		"STRINGVALUE", "WL", "WS"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			match(STRING);
			setState(52);
			match(T__1);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << STRING))) != 0)) {
				{
				{
				setState(53);
				expression();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				methodDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				varMod();
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
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
		}
		public VarModContext varMod() {
			return getRuleContext(VarModContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				ifStm();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				whileStm();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				forStm();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				writeExpr();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				readExpr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				varMod();
				}
				break;
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				varDecl();
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
		public Token type;
		public VariableNameContext identifier;
		public StringvaluesContext stringvalues() {
			return getRuleContext(StringvaluesContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
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
		public Token type;
		public VariableNameContext identifier;
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DeclareIntVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(75);
					((DeclareIntVariableContext)_localctx).isGlobal = match(T__3);
					}
				}

				setState(78);
				match(T__4);
				setState(79);
				((DeclareIntVariableContext)_localctx).type = match(T__5);
				setState(80);
				((DeclareIntVariableContext)_localctx).identifier = variableName();
				setState(81);
				match(T__6);
				setState(82);
				mathExpr(0);
				setState(83);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new DeclareStringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(85);
					((DeclareStringVariableContext)_localctx).isGlobal = match(T__3);
					}
				}

				setState(88);
				match(T__4);
				setState(89);
				((DeclareStringVariableContext)_localctx).type = match(T__8);
				setState(90);
				((DeclareStringVariableContext)_localctx).identifier = variableName();
				setState(91);
				match(T__6);
				setState(92);
				stringvalues();
				setState(93);
				match(T__7);
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
		public VariableNameContext identifier;
		public VariableValueContext value;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public VarModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVarMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVarMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVarMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarModContext varMod() throws RecognitionException {
		VarModContext _localctx = new VarModContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varMod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((VarModContext)_localctx).identifier = variableName();
			setState(98);
			match(T__6);
			setState(99);
			((VarModContext)_localctx).value = variableValue();
			setState(100);
			match(T__7);
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
		public MethodTypeContext type;
		public MethodNameContext methodIdentifier;
		public ReturnvaluesContext returnvalue;
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
		}
		public MethodTypeContext methodType() {
			return getRuleContext(MethodTypeContext.class,0);
		}
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public List<Params2Context> params2() {
			return getRuleContexts(Params2Context.class);
		}
		public Params2Context params2(int i) {
			return getRuleContext(Params2Context.class,i);
		}
		public List<NonGlobalExprContext> nonGlobalExpr() {
			return getRuleContexts(NonGlobalExprContext.class);
		}
		public NonGlobalExprContext nonGlobalExpr(int i) {
			return getRuleContext(NonGlobalExprContext.class,i);
		}
		public ReturnvaluesContext returnvalues() {
			return getRuleContext(ReturnvaluesContext.class,0);
		}
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMethodDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMethodDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__4);
			setState(103);
			((MethodDeclContext)_localctx).type = methodType();
			setState(104);
			match(T__9);
			setState(105);
			params();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(106);
				params2();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__10);
			setState(113);
			((MethodDeclContext)_localctx).methodIdentifier = methodName();
			setState(114);
			opener();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(115);
				nonGlobalExpr();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(T__11);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__21) | (1L << INT) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
				{
				setState(122);
				((MethodDeclContext)_localctx).returnvalue = returnvalues();
				}
			}

			setState(125);
			match(T__7);
			setState(126);
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

	public static class IfStmContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
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
		enterRule(_localctx, 12, RULE_ifStm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__12);
			setState(129);
			match(T__9);
			setState(130);
			condition();
			setState(131);
			match(T__10);
			setState(132);
			opener();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(133);
				nonGlobalExpr();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			closer();
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(140);
						match(T__13);
						setState(141);
						match(T__9);
						setState(142);
						condition();
						setState(143);
						match(T__10);
						setState(144);
						opener();
						setState(148);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << STRING))) != 0)) {
							{
							{
							setState(145);
							nonGlobalExpr();
							}
							}
							setState(150);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(151);
						closer();
						}
						} 
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(158);
					match(T__13);
					setState(159);
					opener();
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << STRING))) != 0)) {
						{
						{
						setState(160);
						nonGlobalExpr();
						}
						}
						setState(165);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(166);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		enterRule(_localctx, 14, RULE_whileStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__14);
			setState(173);
			opener();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(174);
				nonGlobalExpr();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			closer();
			setState(181);
			match(T__15);
			setState(182);
			match(T__9);
			setState(183);
			condition();
			setState(184);
			match(T__10);
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
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
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
		enterRule(_localctx, 16, RULE_forStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__16);
			setState(187);
			match(T__9);
			setState(188);
			varDecl();
			setState(189);
			condition();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(190);
				match(T__7);
				setState(191);
				match(IDcrement);
				setState(192);
				match(T__9);
				setState(193);
				variableName();
				setState(194);
				match(T__10);
				}
			}

			setState(198);
			match(T__10);
			setState(199);
			opener();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(200);
				nonGlobalExpr();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
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
		enterRule(_localctx, 18, RULE_writeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(T__17);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(209);
				mathExpr(0);
				}
				break;
			case 2:
				{
				setState(210);
				stringvalues();
				}
				break;
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(213);
				match(T__18);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__21) | (1L << INT) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(214);
						mathExpr(0);
						}
						break;
					case 2:
						{
						setState(215);
						stringvalues();
						}
						break;
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(223);
			match(T__19);
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

	public static class ReadExprContext extends ParserRuleContext {
		public ReadExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterReadExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitReadExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReadExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadExprContext readExpr() throws RecognitionException {
		ReadExprContext _localctx = new ReadExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_readExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__20);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_mathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(228);
				match(T__9);
				setState(229);
				mathExpr(0);
				setState(230);
				match(T__10);
				}
				break;
			case T__21:
				{
				_localctx = new MinusFirstMathExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				match(T__21);
				setState(233);
				mathExpr(4);
				}
				break;
			case INT:
			case STRING:
				{
				_localctx = new MathValuesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				((MathValuesExpressionContext)_localctx).value = mathvalues();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyDivideExpressionContext(new MathExprContext(_parentctx, _parentState));
						((MultiplyDivideExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(237);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(238);
						((MultiplyDivideExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((MultiplyDivideExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(239);
						((MultiplyDivideExpressionContext)_localctx).rightExpr = mathExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubstractExpressionContext(new MathExprContext(_parentctx, _parentState));
						((AddSubstractExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						((AddSubstractExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__21) ) {
							((AddSubstractExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(242);
						((AddSubstractExpressionContext)_localctx).rightExpr = mathExpr(3);
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class MathvaluesContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public MathvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathvalues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMathvalues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMathvalues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMathvalues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathvaluesContext mathvalues() throws RecognitionException {
		MathvaluesContext _localctx = new MathvaluesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mathvalues);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				variableName();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(INT);
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

	public static class ConditionContext extends ParserRuleContext {
		public MathExprContext identifierLeft;
		public Token lop;
		public MathExprContext identifierRight;
		public TerminalNode LOP() { return getToken(LangParser.LOP, 0); }
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(252);
			((ConditionContext)_localctx).identifierLeft = mathExpr(0);
			}
			setState(253);
			((ConditionContext)_localctx).lop = match(LOP);
			{
			setState(254);
			((ConditionContext)_localctx).identifierRight = mathExpr(0);
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

	public static class ParamsContext extends ParserRuleContext {
		public DataTypeContext methodParamType;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__4);
			setState(257);
			((ParamsContext)_localctx).methodParamType = dataType();
			setState(258);
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

	public static class Params2Context extends ParserRuleContext {
		public DataTypeContext methodParamType2;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public Params2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterParams2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitParams2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitParams2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Params2Context params2() throws RecognitionException {
		Params2Context _localctx = new Params2Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_params2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__24);
			setState(261);
			match(T__4);
			setState(262);
			((Params2Context)_localctx).methodParamType2 = dataType();
			setState(263);
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
		enterRule(_localctx, 32, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__8) ) {
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
		enterRule(_localctx, 34, RULE_methodType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__8) | (1L << T__25))) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
		enterRule(_localctx, 38, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		public TerminalNode STRINGVALUE() { return getToken(LangParser.STRINGVALUE, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public StringvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringvalues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringvalues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringvalues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringvalues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringvaluesContext stringvalues() throws RecognitionException {
		StringvaluesContext _localctx = new StringvaluesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_stringvalues);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGVALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(STRINGVALUE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				variableName();
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

	public static class VariableValueContext extends ParserRuleContext {
		public StringvaluesContext stringvalues() {
			return getRuleContext(StringvaluesContext.class,0);
		}
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableValue);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				stringvalues();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				readExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
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
		enterRule(_localctx, 44, RULE_opener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__26);
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
		enterRule(_localctx, 46, RULE_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__27);
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

	public static class ReturnvaluesContext extends ParserRuleContext {
		public StringvaluesContext stringvalues() {
			return getRuleContext(StringvaluesContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public ReturnvaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnvalues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterReturnvalues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitReturnvalues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReturnvalues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnvaluesContext returnvalues() throws RecognitionException {
		ReturnvaluesContext _localctx = new ReturnvaluesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_returnvalues);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				stringvalues();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\5\3C\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4L\n\4\3\5\5\5O\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5b\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7n\n\7\f\7\16\7q\13\7\3\7\3\7"+
		"\3\7\3\7\7\7w\n\7\f\7\16\7z\13\7\3\7\3\7\5\7~\n\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\b\u0095\n\b\f\b\16\b\u0098\13\b\3\b\3\b\7\b\u009c\n\b\f\b\16"+
		"\b\u009f\13\b\3\b\3\b\3\b\7\b\u00a4\n\b\f\b\16\b\u00a7\13\b\3\b\3\b\5"+
		"\b\u00ab\n\b\5\b\u00ad\n\b\3\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00c7\n\n\3\n\3\n\3\n\7\n\u00cc\n\n\f\n\16\n\u00cf\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\5\13\u00d6\n\13\3\13\3\13\3\13\7\13\u00db\n\13\f\13\16\13\u00de"+
		"\13\13\5\13\u00e0\n\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00ee\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9"+
		"\13\r\3\16\3\16\5\16\u00fd\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\5\26\u0116\n\26\3\27\3\27\3\27\5\27\u011b\n\27\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\5\32\u0123\n\32\3\32\2\3\30\33\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\2\6\3\2\31\32\4\2\25\25\30\30\4\2\b\b\13\13"+
		"\5\2\b\b\13\13\34\34\u0130\2\64\3\2\2\2\4B\3\2\2\2\6K\3\2\2\2\ba\3\2\2"+
		"\2\nc\3\2\2\2\fh\3\2\2\2\16\u0082\3\2\2\2\20\u00ae\3\2\2\2\22\u00bc\3"+
		"\2\2\2\24\u00d2\3\2\2\2\26\u00e3\3\2\2\2\30\u00ed\3\2\2\2\32\u00fc\3\2"+
		"\2\2\34\u00fe\3\2\2\2\36\u0102\3\2\2\2 \u0106\3\2\2\2\"\u010b\3\2\2\2"+
		"$\u010d\3\2\2\2&\u010f\3\2\2\2(\u0111\3\2\2\2*\u0115\3\2\2\2,\u011a\3"+
		"\2\2\2.\u011c\3\2\2\2\60\u011e\3\2\2\2\62\u0122\3\2\2\2\64\65\7\3\2\2"+
		"\65\66\7#\2\2\66:\7\4\2\2\679\5\4\3\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2"+
		":;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\5\2\2>\3\3\2\2\2?C\5\b\5\2@C\5\f\7"+
		"\2AC\5\n\6\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\5\3\2\2\2DL\5\16\b\2EL\5\20"+
		"\t\2FL\5\22\n\2GL\5\24\13\2HL\5\26\f\2IL\5\n\6\2JL\5\b\5\2KD\3\2\2\2K"+
		"E\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\7\3\2\2\2"+
		"MO\7\6\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\7\7\2\2QR\7\b\2\2RS\5(\25\2"+
		"ST\7\t\2\2TU\5\30\r\2UV\7\n\2\2Vb\3\2\2\2WY\7\6\2\2XW\3\2\2\2XY\3\2\2"+
		"\2YZ\3\2\2\2Z[\7\7\2\2[\\\7\13\2\2\\]\5(\25\2]^\7\t\2\2^_\5*\26\2_`\7"+
		"\n\2\2`b\3\2\2\2aN\3\2\2\2aX\3\2\2\2b\t\3\2\2\2cd\5(\25\2de\7\t\2\2ef"+
		"\5,\27\2fg\7\n\2\2g\13\3\2\2\2hi\7\7\2\2ij\5$\23\2jk\7\f\2\2ko\5\36\20"+
		"\2ln\5 \21\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2"+
		"\2rs\7\r\2\2st\5&\24\2tx\5.\30\2uw\5\6\4\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{}\7\16\2\2|~\5\62\32\2}|\3\2\2\2}~\3"+
		"\2\2\2~\177\3\2\2\2\177\u0080\7\n\2\2\u0080\u0081\5\60\31\2\u0081\r\3"+
		"\2\2\2\u0082\u0083\7\17\2\2\u0083\u0084\7\f\2\2\u0084\u0085\5\34\17\2"+
		"\u0085\u0086\7\r\2\2\u0086\u008a\5.\30\2\u0087\u0089\5\6\4\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u00ac\5\60\31\2\u008e\u008f\7"+
		"\20\2\2\u008f\u0090\7\f\2\2\u0090\u0091\5\34\17\2\u0091\u0092\7\r\2\2"+
		"\u0092\u0096\5.\30\2\u0093\u0095\5\6\4\2\u0094\u0093\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\5\60\31\2\u009a\u009c\3\2\2\2\u009b\u008e\3"+
		"\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00aa\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00a5\5"+
		".\30\2\u00a2\u00a4\5\6\4\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a8\u00a9\5\60\31\2\u00a9\u00ab\3\2\2\2\u00aa\u00a0\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u009d\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\17\3\2\2\2\u00ae\u00af\7\21\2\2\u00af\u00b3\5.\30\2\u00b0\u00b2"+
		"\5\6\4\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\5\60"+
		"\31\2\u00b7\u00b8\7\22\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\5\34\17\2\u00ba"+
		"\u00bb\7\r\2\2\u00bb\21\3\2\2\2\u00bc\u00bd\7\23\2\2\u00bd\u00be\7\f\2"+
		"\2\u00be\u00bf\5\b\5\2\u00bf\u00c6\5\34\17\2\u00c0\u00c1\7\n\2\2\u00c1"+
		"\u00c2\7\37\2\2\u00c2\u00c3\7\f\2\2\u00c3\u00c4\5(\25\2\u00c4\u00c5\7"+
		"\r\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\7\r\2\2\u00c9\u00cd\5.\30\2\u00ca\u00cc\5\6"+
		"\4\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\5\60"+
		"\31\2\u00d1\23\3\2\2\2\u00d2\u00d5\7\24\2\2\u00d3\u00d6\5\30\r\2\u00d4"+
		"\u00d6\5*\26\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00df\3\2"+
		"\2\2\u00d7\u00dc\7\25\2\2\u00d8\u00db\5\30\r\2\u00d9\u00db\5*\26\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00d7\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\26"+
		"\2\2\u00e2\25\3\2\2\2\u00e3\u00e4\7\27\2\2\u00e4\27\3\2\2\2\u00e5\u00e6"+
		"\b\r\1\2\u00e6\u00e7\7\f\2\2\u00e7\u00e8\5\30\r\2\u00e8\u00e9\7\r\2\2"+
		"\u00e9\u00ee\3\2\2\2\u00ea\u00eb\7\30\2\2\u00eb\u00ee\5\30\r\6\u00ec\u00ee"+
		"\5\32\16\2\u00ed\u00e5\3\2\2\2\u00ed\u00ea\3\2\2\2\u00ed\u00ec\3\2\2\2"+
		"\u00ee\u00f7\3\2\2\2\u00ef\u00f0\f\5\2\2\u00f0\u00f1\t\2\2\2\u00f1\u00f6"+
		"\5\30\r\6\u00f2\u00f3\f\4\2\2\u00f3\u00f4\t\3\2\2\u00f4\u00f6\5\30\r\5"+
		"\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\31\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fd\5(\25\2\u00fb\u00fd\7\"\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2"+
		"\2\2\u00fd\33\3\2\2\2\u00fe\u00ff\5\30\r\2\u00ff\u0100\7!\2\2\u0100\u0101"+
		"\5\30\r\2\u0101\35\3\2\2\2\u0102\u0103\7\7\2\2\u0103\u0104\5\"\22\2\u0104"+
		"\u0105\5(\25\2\u0105\37\3\2\2\2\u0106\u0107\7\33\2\2\u0107\u0108\7\7\2"+
		"\2\u0108\u0109\5\"\22\2\u0109\u010a\5(\25\2\u010a!\3\2\2\2\u010b\u010c"+
		"\t\4\2\2\u010c#\3\2\2\2\u010d\u010e\t\5\2\2\u010e%\3\2\2\2\u010f\u0110"+
		"\7#\2\2\u0110\'\3\2\2\2\u0111\u0112\7#\2\2\u0112)\3\2\2\2\u0113\u0116"+
		"\7$\2\2\u0114\u0116\5(\25\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"+\3\2\2\2\u0117\u011b\5*\26\2\u0118\u011b\5\26\f\2\u0119\u011b\5\30\r"+
		"\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b-"+
		"\3\2\2\2\u011c\u011d\7\35\2\2\u011d/\3\2\2\2\u011e\u011f\7\36\2\2\u011f"+
		"\61\3\2\2\2\u0120\u0123\5*\26\2\u0121\u0123\5\30\r\2\u0122\u0120\3\2\2"+
		"\2\u0122\u0121\3\2\2\2\u0123\63\3\2\2\2\37:BKNXaox}\u008a\u0096\u009d"+
		"\u00a5\u00aa\u00ac\u00b3\u00c6\u00cd\u00d5\u00da\u00dc\u00df\u00ed\u00f5"+
		"\u00f7\u00fc\u0115\u011a\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}