// Generated from D:/School projecten/Compilers\Lang.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, IDcrement=36, OP=37, LOP=38, INT=39, 
		STRING=40, CLASSNAME=41, STRINGVALUE=42, WL=43, WS=44;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_nonGlobalExpr = 2, RULE_varGlobalDecl = 3, 
		RULE_varDecl = 4, RULE_varMod = 5, RULE_methodDecl = 6, RULE_runMethod = 7, 
		RULE_callMethodExpr = 8, RULE_ifStm = 9, RULE_whileStm = 10, RULE_forStm = 11, 
		RULE_writeExpr = 12, RULE_writevalues = 13, RULE_readIntExpr = 14, RULE_readStringExpr = 15, 
		RULE_mathExpr = 16, RULE_mathComparison = 17, RULE_ifCondition = 18, RULE_ifConditionMore = 19, 
		RULE_forCondition = 20, RULE_forConditionMore = 21, RULE_methodDeclParams = 22, 
		RULE_methodCallParams = 23, RULE_intCallParam = 24, RULE_stringCallParam = 25, 
		RULE_intParam = 26, RULE_stringParam = 27, RULE_dataType = 28, RULE_methodType = 29, 
		RULE_nameClass = 30, RULE_methodName = 31, RULE_variableName = 32, RULE_stringvalues = 33, 
		RULE_mathvalues = 34, RULE_opener = 35, RULE_closer = 36;
	public static final String[] ruleNames = {
		"prog", "expression", "nonGlobalExpr", "varGlobalDecl", "varDecl", "varMod", 
		"methodDecl", "runMethod", "callMethodExpr", "ifStm", "whileStm", "forStm", 
		"writeExpr", "writevalues", "readIntExpr", "readStringExpr", "mathExpr", 
		"mathComparison", "ifCondition", "ifConditionMore", "forCondition", "forConditionMore", 
		"methodDeclParams", "methodCallParams", "intCallParam", "stringCallParam", 
		"intParam", "stringParam", "dataType", "methodType", "nameClass", "methodName", 
		"variableName", "stringvalues", "mathvalues", "opener", "closer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'BEGIN'", "'END'", "'global'", "'~int'", "'IS'", "';'", 
		"'~string'", "'~void'", "'('", "','", "')'", "'return;'", "'return'", 
		"'()run'", "'if'", "'?'", "'REPEAT'", "'UNTIL'", "'for'", "'WRITE('", 
		"'+'", "');'", "'READINT'", "'READSTRING'", "'-'", "'*'", "':'", "'||'", 
		"'&&'", "'int'", "'string'", "'void'", "'/'", "'\\'", null, null, null, 
		null, null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDcrement", "OP", "LOP", "INT", "STRING", "CLASSNAME", "STRINGVALUE", 
		"WL", "WS"
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
		public NameClassContext className;
		public RunMethodContext runMethod() {
			return getRuleContext(RunMethodContext.class,0);
		}
		public NameClassContext nameClass() {
			return getRuleContext(NameClassContext.class,0);
		}
		public List<VarGlobalDeclContext> varGlobalDecl() {
			return getRuleContexts(VarGlobalDeclContext.class);
		}
		public VarGlobalDeclContext varGlobalDecl(int i) {
			return getRuleContext(VarGlobalDeclContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__0);
			setState(75);
			((ProgContext)_localctx).className = nameClass();
			setState(76);
			match(T__1);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(77);
				varGlobalDecl();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					expression();
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(89);
			runMethod();
			setState(90);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				methodDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				varMod();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				ifStm();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				whileStm();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				forStm();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				writeExpr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				varMod();
				}
				break;
			case T__4:
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				varDecl();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(103);
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

	public static class VarGlobalDeclContext extends ParserRuleContext {
		public VarGlobalDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varGlobalDecl; }
	 
		public VarGlobalDeclContext() { }
		public void copyFrom(VarGlobalDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareIntGlobalVariableContext extends VarGlobalDeclContext {
		public Token isGlobal;
		public VariableNameContext identifier;
		public MathExprContext value;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public DeclareIntGlobalVariableContext(VarGlobalDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDeclareIntGlobalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDeclareIntGlobalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDeclareIntGlobalVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareStringGlobalVariableContext extends VarGlobalDeclContext {
		public Token isGlobal;
		public VariableNameContext identifier;
		public StringvaluesContext value;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public StringvaluesContext stringvalues() {
			return getRuleContext(StringvaluesContext.class,0);
		}
		public DeclareStringGlobalVariableContext(VarGlobalDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDeclareStringGlobalVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDeclareStringGlobalVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDeclareStringGlobalVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarGlobalDeclContext varGlobalDecl() throws RecognitionException {
		VarGlobalDeclContext _localctx = new VarGlobalDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varGlobalDecl);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DeclareIntGlobalVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(106);
				((DeclareIntGlobalVariableContext)_localctx).isGlobal = match(T__3);
				}
				setState(107);
				match(T__4);
				setState(108);
				((DeclareIntGlobalVariableContext)_localctx).identifier = variableName();
				setState(109);
				match(T__5);
				setState(110);
				((DeclareIntGlobalVariableContext)_localctx).value = mathExpr(0);
				setState(111);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new DeclareStringGlobalVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(113);
				((DeclareStringGlobalVariableContext)_localctx).isGlobal = match(T__3);
				}
				setState(114);
				match(T__7);
				setState(115);
				((DeclareStringGlobalVariableContext)_localctx).identifier = variableName();
				setState(116);
				match(T__5);
				setState(117);
				((DeclareStringGlobalVariableContext)_localctx).value = stringvalues();
				setState(118);
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
		enterRule(_localctx, 8, RULE_varDecl);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new DeclareIntVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__4);
				setState(123);
				((DeclareIntVariableContext)_localctx).identifier = variableName();
				setState(124);
				match(T__5);
				setState(125);
				((DeclareIntVariableContext)_localctx).value = mathExpr(0);
				setState(126);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new DeclareStringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__7);
				setState(129);
				((DeclareStringVariableContext)_localctx).identifier = variableName();
				setState(130);
				match(T__5);
				setState(131);
				((DeclareStringVariableContext)_localctx).value = stringvalues();
				setState(132);
				match(T__6);
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
		enterRule(_localctx, 10, RULE_varMod);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IntVarModifyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((IntVarModifyContext)_localctx).identifier = variableName();
				setState(137);
				match(T__5);
				setState(138);
				((IntVarModifyContext)_localctx).value = mathExpr(0);
				setState(139);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new StringVarModifyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((StringVarModifyContext)_localctx).identifier = variableName();
				setState(142);
				match(T__5);
				setState(143);
				((StringVarModifyContext)_localctx).value = stringvalues();
				setState(144);
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
		enterRule(_localctx, 12, RULE_methodDecl);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new VoidMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__8);
				setState(149);
				match(T__9);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(150);
					methodDeclParams();
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(151);
						match(T__10);
						setState(152);
						methodDeclParams();
						}
						}
						setState(157);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(160);
				match(T__11);
				setState(161);
				((VoidMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(162);
				opener();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(163);
					nonGlobalExpr();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(T__12);
				setState(170);
				closer();
				}
				break;
			case T__4:
				_localctx = new IntMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__4);
				setState(173);
				match(T__9);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(174);
					methodDeclParams();
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(175);
						match(T__10);
						setState(176);
						methodDeclParams();
						}
						}
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(184);
				match(T__11);
				setState(185);
				((IntMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(186);
				opener();
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(187);
					nonGlobalExpr();
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				match(T__13);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__25) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(194);
					((IntMethodDeclContext)_localctx).returnvalue = mathExpr(0);
					}
				}

				setState(197);
				match(T__6);
				setState(198);
				closer();
				}
				break;
			case T__7:
				_localctx = new StringMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__7);
				setState(201);
				match(T__9);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(202);
					methodDeclParams();
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(203);
						match(T__10);
						setState(204);
						methodDeclParams();
						}
						}
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(212);
				match(T__11);
				setState(213);
				((StringMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(214);
				opener();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(215);
					nonGlobalExpr();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(T__13);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
					{
					setState(222);
					((StringMethodDeclContext)_localctx).returnvalue = stringvalues();
					}
				}

				setState(225);
				match(T__6);
				setState(226);
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
		enterRule(_localctx, 14, RULE_runMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__8);
			setState(231);
			match(T__14);
			setState(232);
			opener();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(233);
				nonGlobalExpr();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(T__12);
			setState(240);
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
		enterRule(_localctx, 16, RULE_callMethodExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__9);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << INT) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
				{
				setState(243);
				methodCallParams();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(244);
					match(T__10);
					setState(245);
					methodCallParams();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(253);
			match(T__11);
			setState(254);
			((CallMethodExprContext)_localctx).methodIdentifier = methodName();
			setState(255);
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
		enterRule(_localctx, 18, RULE_ifStm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(T__15);
			setState(258);
			match(T__9);
			setState(259);
			ifCondition();
			setState(260);
			match(T__11);
			setState(261);
			opener();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(262);
				((IfStmContext)_localctx).ifBlock = nonGlobalExpr();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			closer();
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269);
						match(T__16);
						setState(270);
						match(T__9);
						setState(271);
						ifCondition();
						setState(272);
						match(T__11);
						setState(273);
						opener();
						setState(277);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
							{
							{
							setState(274);
							((IfStmContext)_localctx).ifElseBlock = nonGlobalExpr();
							}
							}
							setState(279);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(280);
						closer();
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(287);
					match(T__16);
					setState(288);
					opener();
					setState(292);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
						{
						{
						setState(289);
						((IfStmContext)_localctx).elseBlock = nonGlobalExpr();
						}
						}
						setState(294);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(295);
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
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
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
		enterRule(_localctx, 20, RULE_whileStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__17);
			setState(302);
			opener();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(303);
				nonGlobalExpr();
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			closer();
			setState(310);
			match(T__18);
			setState(311);
			match(T__9);
			setState(312);
			ifCondition();
			setState(313);
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
		enterRule(_localctx, 22, RULE_forStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__19);
			setState(316);
			match(T__9);
			setState(317);
			varDecl();
			setState(318);
			forCondition();
			setState(319);
			match(T__6);
			setState(320);
			((ForStmContext)_localctx).idCrement = match(IDcrement);
			setState(321);
			match(T__9);
			setState(322);
			((ForStmContext)_localctx).idValue = variableName();
			setState(323);
			match(T__11);
			setState(324);
			match(T__11);
			setState(325);
			opener();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(326);
				nonGlobalExpr();
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
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
		public List<WritevaluesContext> writevalues() {
			return getRuleContexts(WritevaluesContext.class);
		}
		public WritevaluesContext writevalues(int i) {
			return getRuleContext(WritevaluesContext.class,i);
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
		enterRule(_localctx, 24, RULE_writeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__20);
			{
			setState(335);
			writevalues();
			}
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(336);
				match(T__21);
				setState(337);
				writevalues();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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

	public static class WritevaluesContext extends ParserRuleContext {
		public WritevaluesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writevalues; }
	 
		public WritevaluesContext() { }
		public void copyFrom(WritevaluesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WriteStringContext extends WritevaluesContext {
		public StringvaluesContext stringvalues() {
			return getRuleContext(StringvaluesContext.class,0);
		}
		public WriteStringContext(WritevaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWriteString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWriteString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWriteString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteMathContext extends WritevaluesContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public WriteMathContext(WritevaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWriteMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWriteMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWriteMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritevaluesContext writevalues() throws RecognitionException {
		WritevaluesContext _localctx = new WritevaluesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_writevalues);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new WriteMathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				mathExpr(0);
				}
				break;
			case 2:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				stringvalues();
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
		enterRule(_localctx, 28, RULE_readIntExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
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
		enterRule(_localctx, 30, RULE_readStringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_mathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(354);
				match(T__9);
				setState(355);
				mathExpr(0);
				setState(356);
				match(T__11);
				}
				break;
			case T__25:
				{
				_localctx = new MinusFirstMathExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358);
				match(T__25);
				setState(359);
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
				setState(360);
				((MathValuesExpressionContext)_localctx).value = mathvalues();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyDivideExpressionContext(new MathExprContext(_parentctx, _parentState));
						((MultiplyDivideExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(363);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(364);
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
						setState(365);
						((MultiplyDivideExpressionContext)_localctx).rightExpr = mathExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubstractExpressionContext(new MathExprContext(_parentctx, _parentState));
						((AddSubstractExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(366);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(367);
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
						setState(368);
						((AddSubstractExpressionContext)_localctx).rightExpr = mathExpr(3);
						}
						break;
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class MathComparisonContext extends ParserRuleContext {
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
		public MathComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMathComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMathComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMathComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathComparisonContext mathComparison() throws RecognitionException {
		MathComparisonContext _localctx = new MathComparisonContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mathComparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			((MathComparisonContext)_localctx).identifierLeft = mathExpr(0);
			setState(375);
			((MathComparisonContext)_localctx).lop = match(LOP);
			setState(376);
			((MathComparisonContext)_localctx).identifierRight = mathExpr(0);
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
		public MathComparisonContext first;
		public IfConditionMoreContext more;
		public MathComparisonContext mathComparison() {
			return getRuleContext(MathComparisonContext.class,0);
		}
		public List<IfConditionMoreContext> ifConditionMore() {
			return getRuleContexts(IfConditionMoreContext.class);
		}
		public IfConditionMoreContext ifConditionMore(int i) {
			return getRuleContext(IfConditionMoreContext.class,i);
		}
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
		enterRule(_localctx, 36, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			((IfConditionContext)_localctx).first = mathComparison();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28 || _la==T__29) {
				{
				{
				setState(379);
				((IfConditionContext)_localctx).more = ifConditionMore();
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IfConditionMoreContext extends ParserRuleContext {
		public Token andOR;
		public MathComparisonContext mathComparison() {
			return getRuleContext(MathComparisonContext.class,0);
		}
		public IfConditionMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifConditionMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfConditionMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfConditionMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfConditionMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionMoreContext ifConditionMore() throws RecognitionException {
		IfConditionMoreContext _localctx = new IfConditionMoreContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifConditionMore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(385);
			((IfConditionMoreContext)_localctx).andOR = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
				((IfConditionMoreContext)_localctx).andOR = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(386);
			mathComparison();
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

	public static class ForConditionContext extends ParserRuleContext {
		public MathComparisonContext first;
		public ForConditionMoreContext more;
		public MathComparisonContext mathComparison() {
			return getRuleContext(MathComparisonContext.class,0);
		}
		public List<ForConditionMoreContext> forConditionMore() {
			return getRuleContexts(ForConditionMoreContext.class);
		}
		public ForConditionMoreContext forConditionMore(int i) {
			return getRuleContext(ForConditionMoreContext.class,i);
		}
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
		enterRule(_localctx, 40, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			((ForConditionContext)_localctx).first = mathComparison();
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28 || _la==T__29) {
				{
				{
				setState(389);
				((ForConditionContext)_localctx).more = forConditionMore();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ForConditionMoreContext extends ParserRuleContext {
		public Token andOR;
		public MathComparisonContext mathComparison() {
			return getRuleContext(MathComparisonContext.class,0);
		}
		public ForConditionMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forConditionMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterForConditionMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitForConditionMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitForConditionMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionMoreContext forConditionMore() throws RecognitionException {
		ForConditionMoreContext _localctx = new ForConditionMoreContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forConditionMore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(395);
			((ForConditionMoreContext)_localctx).andOR = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
				((ForConditionMoreContext)_localctx).andOR = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(396);
			mathComparison();
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
		enterRule(_localctx, 44, RULE_methodDeclParams);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new IntParamMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				intParam();
				}
				break;
			case T__7:
				_localctx = new StringParamMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
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
		enterRule(_localctx, 46, RULE_methodCallParams);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new IntCallParamMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				intCallParam();
				}
				break;
			case 2:
				_localctx = new StringCallParamMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
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
		enterRule(_localctx, 48, RULE_intCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
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
		enterRule(_localctx, 50, RULE_stringCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
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
		enterRule(_localctx, 52, RULE_intParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(T__4);
			setState(411);
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
		enterRule(_localctx, 54, RULE_stringParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__7);
			setState(414);
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
		enterRule(_localctx, 56, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
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
		enterRule(_localctx, 58, RULE_methodType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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

	public static class NameClassContext extends ParserRuleContext {
		public TerminalNode CLASSNAME() { return getToken(LangParser.CLASSNAME, 0); }
		public NameClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNameClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNameClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNameClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameClassContext nameClass() throws RecognitionException {
		NameClassContext _localctx = new NameClassContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nameClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(CLASSNAME);
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
		enterRule(_localctx, 62, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		enterRule(_localctx, 64, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 66, RULE_stringvalues);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGVALUE:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				match(STRINGVALUE);
				}
				break;
			case STRING:
				_localctx = new StringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				variableName();
				}
				break;
			case T__24:
				_localctx = new StringReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(428);
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
		enterRule(_localctx, 68, RULE_mathvalues);
		try {
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new IntvariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				variableName();
				}
				break;
			case INT:
				_localctx = new IntlitteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(INT);
				}
				break;
			case T__23:
				_localctx = new IntreadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
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
		enterRule(_localctx, 70, RULE_opener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			match(T__33);
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
		enterRule(_localctx, 72, RULE_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__34);
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2Q\n\2\f\2\16\2"+
		"T\13\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3b\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4k\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5{\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u0089\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0095"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\5\b\u00a1\n"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00a7\n\b\f\b\16\b\u00aa\13\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u00b4\n\b\f\b\16\b\u00b7\13\b\5\b\u00b9\n\b\3\b\3\b"+
		"\3\b\3\b\7\b\u00bf\n\b\f\b\16\b\u00c2\13\b\3\b\3\b\5\b\u00c6\n\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00d0\n\b\f\b\16\b\u00d3\13\b\5\b\u00d5"+
		"\n\b\3\b\3\b\3\b\3\b\7\b\u00db\n\b\f\b\16\b\u00de\13\b\3\b\3\b\5\b\u00e2"+
		"\n\b\3\b\3\b\3\b\5\b\u00e7\n\b\3\t\3\t\3\t\3\t\7\t\u00ed\n\t\f\t\16\t"+
		"\u00f0\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00f9\n\n\f\n\16\n\u00fc\13"+
		"\n\5\n\u00fe\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u010a"+
		"\n\13\f\13\16\13\u010d\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0116"+
		"\n\13\f\13\16\13\u0119\13\13\3\13\3\13\7\13\u011d\n\13\f\13\16\13\u0120"+
		"\13\13\3\13\3\13\3\13\7\13\u0125\n\13\f\13\16\13\u0128\13\13\3\13\3\13"+
		"\5\13\u012c\n\13\5\13\u012e\n\13\3\f\3\f\3\f\7\f\u0133\n\f\f\f\16\f\u0136"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u014a\n\r\f\r\16\r\u014d\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\7\16\u0155\n\16\f\16\16\16\u0158\13\16\3\16\3\16\3\17\3\17\5\17\u015e"+
		"\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u016c\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0174\n\22\f\22\16\22\u0177"+
		"\13\22\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u017f\n\24\f\24\16\24\u0182"+
		"\13\24\3\25\3\25\3\25\3\26\3\26\7\26\u0189\n\26\f\26\16\26\u018c\13\26"+
		"\3\27\3\27\3\27\3\30\3\30\5\30\u0193\n\30\3\31\3\31\5\31\u0197\n\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3#\5#\u01b0\n#\3$\3$\3$\5$\u01b5\n$\3%\3%\3&"+
		"\3&\3&\2\3\"\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJ\2\7\3\2\35\36\4\2\30\30\34\34\3\2\37 \3\2!\"\3\2!#\2\u01c8"+
		"\2L\3\2\2\2\4a\3\2\2\2\6j\3\2\2\2\bz\3\2\2\2\n\u0088\3\2\2\2\f\u0094\3"+
		"\2\2\2\16\u00e6\3\2\2\2\20\u00e8\3\2\2\2\22\u00f4\3\2\2\2\24\u0103\3\2"+
		"\2\2\26\u012f\3\2\2\2\30\u013d\3\2\2\2\32\u0150\3\2\2\2\34\u015d\3\2\2"+
		"\2\36\u015f\3\2\2\2 \u0161\3\2\2\2\"\u016b\3\2\2\2$\u0178\3\2\2\2&\u017c"+
		"\3\2\2\2(\u0183\3\2\2\2*\u0186\3\2\2\2,\u018d\3\2\2\2.\u0192\3\2\2\2\60"+
		"\u0196\3\2\2\2\62\u0198\3\2\2\2\64\u019a\3\2\2\2\66\u019c\3\2\2\28\u019f"+
		"\3\2\2\2:\u01a2\3\2\2\2<\u01a4\3\2\2\2>\u01a6\3\2\2\2@\u01a8\3\2\2\2B"+
		"\u01aa\3\2\2\2D\u01af\3\2\2\2F\u01b4\3\2\2\2H\u01b6\3\2\2\2J\u01b8\3\2"+
		"\2\2LM\7\3\2\2MN\5> \2NR\7\4\2\2OQ\5\b\5\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2"+
		"\2RS\3\2\2\2SX\3\2\2\2TR\3\2\2\2UW\5\4\3\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\5\20\t\2\\]\7\5\2\2]\3\3\2\2\2^b\5"+
		"\16\b\2_b\5\f\7\2`b\5\"\22\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\5\3\2\2\2"+
		"ck\5\24\13\2dk\5\26\f\2ek\5\30\r\2fk\5\32\16\2gk\5\f\7\2hk\5\n\6\2ik\5"+
		"\22\n\2jc\3\2\2\2jd\3\2\2\2je\3\2\2\2jf\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji"+
		"\3\2\2\2k\7\3\2\2\2lm\7\6\2\2mn\7\7\2\2no\5B\"\2op\7\b\2\2pq\5\"\22\2"+
		"qr\7\t\2\2r{\3\2\2\2st\7\6\2\2tu\7\n\2\2uv\5B\"\2vw\7\b\2\2wx\5D#\2xy"+
		"\7\t\2\2y{\3\2\2\2zl\3\2\2\2zs\3\2\2\2{\t\3\2\2\2|}\7\7\2\2}~\5B\"\2~"+
		"\177\7\b\2\2\177\u0080\5\"\22\2\u0080\u0081\7\t\2\2\u0081\u0089\3\2\2"+
		"\2\u0082\u0083\7\n\2\2\u0083\u0084\5B\"\2\u0084\u0085\7\b\2\2\u0085\u0086"+
		"\5D#\2\u0086\u0087\7\t\2\2\u0087\u0089\3\2\2\2\u0088|\3\2\2\2\u0088\u0082"+
		"\3\2\2\2\u0089\13\3\2\2\2\u008a\u008b\5B\"\2\u008b\u008c\7\b\2\2\u008c"+
		"\u008d\5\"\22\2\u008d\u008e\7\t\2\2\u008e\u0095\3\2\2\2\u008f\u0090\5"+
		"B\"\2\u0090\u0091\7\b\2\2\u0091\u0092\5D#\2\u0092\u0093\7\t\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u008a\3\2\2\2\u0094\u008f\3\2\2\2\u0095\r\3\2\2\2"+
		"\u0096\u0097\7\13\2\2\u0097\u00a0\7\f\2\2\u0098\u009d\5.\30\2\u0099\u009a"+
		"\7\r\2\2\u009a\u009c\5.\30\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u0098\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\7\16\2\2\u00a3\u00a4\5@!\2\u00a4\u00a8\5H%\2\u00a5\u00a7\5\6\4"+
		"\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7\17\2\2"+
		"\u00ac\u00ad\5J&\2\u00ad\u00e7\3\2\2\2\u00ae\u00af\7\7\2\2\u00af\u00b8"+
		"\7\f\2\2\u00b0\u00b5\5.\30\2\u00b1\u00b2\7\r\2\2\u00b2\u00b4\5.\30\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8"+
		"\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\16\2\2\u00bb\u00bc\5"+
		"@!\2\u00bc\u00c0\5H%\2\u00bd\u00bf\5\6\4\2\u00be\u00bd\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c5\7\20\2\2\u00c4\u00c6\5\"\22\2\u00c5\u00c4\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\t\2\2\u00c8"+
		"\u00c9\5J&\2\u00c9\u00e7\3\2\2\2\u00ca\u00cb\7\n\2\2\u00cb\u00d4\7\f\2"+
		"\2\u00cc\u00d1\5.\30\2\u00cd\u00ce\7\r\2\2\u00ce\u00d0\5.\30\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\16\2\2\u00d7\u00d8\5@!\2\u00d8"+
		"\u00dc\5H%\2\u00d9\u00db\5\6\4\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e1\7\20\2\2\u00e0\u00e2\5D#\2\u00e1\u00e0\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\t\2\2\u00e4\u00e5\5J"+
		"&\2\u00e5\u00e7\3\2\2\2\u00e6\u0096\3\2\2\2\u00e6\u00ae\3\2\2\2\u00e6"+
		"\u00ca\3\2\2\2\u00e7\17\3\2\2\2\u00e8\u00e9\7\13\2\2\u00e9\u00ea\7\21"+
		"\2\2\u00ea\u00ee\5H%\2\u00eb\u00ed\5\6\4\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\7\17\2\2\u00f2\u00f3\5J&\2\u00f3\21\3\2\2\2"+
		"\u00f4\u00fd\7\f\2\2\u00f5\u00fa\5\60\31\2\u00f6\u00f7\7\r\2\2\u00f7\u00f9"+
		"\5\60\31\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2"+
		"\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00f5"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\16\2\2"+
		"\u0100\u0101\5@!\2\u0101\u0102\7\t\2\2\u0102\23\3\2\2\2\u0103\u0104\7"+
		"\22\2\2\u0104\u0105\7\f\2\2\u0105\u0106\5&\24\2\u0106\u0107\7\16\2\2\u0107"+
		"\u010b\5H%\2\u0108\u010a\5\6\4\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2"+
		"\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010e\u012d\5J&\2\u010f\u0110\7\23\2\2\u0110\u0111\7\f\2\2\u0111"+
		"\u0112\5&\24\2\u0112\u0113\7\16\2\2\u0113\u0117\5H%\2\u0114\u0116\5\6"+
		"\4\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\5J"+
		"&\2\u011b\u011d\3\2\2\2\u011c\u010f\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u012b\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\7\23\2\2\u0122\u0126\5H%\2\u0123\u0125\5\6\4\2\u0124"+
		"\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\5J&\2\u012a\u012c"+
		"\3\2\2\2\u012b\u0121\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d"+
		"\u011e\3\2\2\2\u012d\u012e\3\2\2\2\u012e\25\3\2\2\2\u012f\u0130\7\24\2"+
		"\2\u0130\u0134\5H%\2\u0131\u0133\5\6\4\2\u0132\u0131\3\2\2\2\u0133\u0136"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u0134\3\2\2\2\u0137\u0138\5J&\2\u0138\u0139\7\25\2\2\u0139\u013a\7\f"+
		"\2\2\u013a\u013b\5&\24\2\u013b\u013c\7\16\2\2\u013c\27\3\2\2\2\u013d\u013e"+
		"\7\26\2\2\u013e\u013f\7\f\2\2\u013f\u0140\5\n\6\2\u0140\u0141\5*\26\2"+
		"\u0141\u0142\7\t\2\2\u0142\u0143\7&\2\2\u0143\u0144\7\f\2\2\u0144\u0145"+
		"\5B\"\2\u0145\u0146\7\16\2\2\u0146\u0147\7\16\2\2\u0147\u014b\5H%\2\u0148"+
		"\u014a\5\6\4\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u014f\5J&\2\u014f\31\3\2\2\2\u0150\u0151\7\27\2\2\u0151\u0156\5\34\17"+
		"\2\u0152\u0153\7\30\2\2\u0153\u0155\5\34\17\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2"+
		"\2\2\u0158\u0156\3\2\2\2\u0159\u015a\7\31\2\2\u015a\33\3\2\2\2\u015b\u015e"+
		"\5\"\22\2\u015c\u015e\5D#\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\35\3\2\2\2\u015f\u0160\7\32\2\2\u0160\37\3\2\2\2\u0161\u0162\7\33\2\2"+
		"\u0162!\3\2\2\2\u0163\u0164\b\22\1\2\u0164\u0165\7\f\2\2\u0165\u0166\5"+
		"\"\22\2\u0166\u0167\7\16\2\2\u0167\u016c\3\2\2\2\u0168\u0169\7\34\2\2"+
		"\u0169\u016c\5\"\22\6\u016a\u016c\5F$\2\u016b\u0163\3\2\2\2\u016b\u0168"+
		"\3\2\2\2\u016b\u016a\3\2\2\2\u016c\u0175\3\2\2\2\u016d\u016e\f\5\2\2\u016e"+
		"\u016f\t\2\2\2\u016f\u0174\5\"\22\6\u0170\u0171\f\4\2\2\u0171\u0172\t"+
		"\3\2\2\u0172\u0174\5\"\22\5\u0173\u016d\3\2\2\2\u0173\u0170\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176#\3\2\2\2"+
		"\u0177\u0175\3\2\2\2\u0178\u0179\5\"\22\2\u0179\u017a\7(\2\2\u017a\u017b"+
		"\5\"\22\2\u017b%\3\2\2\2\u017c\u0180\5$\23\2\u017d\u017f\5(\25\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\'\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\t\4\2\2\u0184\u0185"+
		"\5$\23\2\u0185)\3\2\2\2\u0186\u018a\5$\23\2\u0187\u0189\5,\27\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b+\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\t\4\2\2\u018e\u018f"+
		"\5$\23\2\u018f-\3\2\2\2\u0190\u0193\5\66\34\2\u0191\u0193\58\35\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193/\3\2\2\2\u0194\u0197\5\62\32"+
		"\2\u0195\u0197\5\64\33\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197"+
		"\61\3\2\2\2\u0198\u0199\5\"\22\2\u0199\63\3\2\2\2\u019a\u019b\5D#\2\u019b"+
		"\65\3\2\2\2\u019c\u019d\7\7\2\2\u019d\u019e\5B\"\2\u019e\67\3\2\2\2\u019f"+
		"\u01a0\7\n\2\2\u01a0\u01a1\5B\"\2\u01a19\3\2\2\2\u01a2\u01a3\t\5\2\2\u01a3"+
		";\3\2\2\2\u01a4\u01a5\t\6\2\2\u01a5=\3\2\2\2\u01a6\u01a7\7+\2\2\u01a7"+
		"?\3\2\2\2\u01a8\u01a9\7*\2\2\u01a9A\3\2\2\2\u01aa\u01ab\7*\2\2\u01abC"+
		"\3\2\2\2\u01ac\u01b0\7,\2\2\u01ad\u01b0\5B\"\2\u01ae\u01b0\5 \21\2\u01af"+
		"\u01ac\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0E\3\2\2\2"+
		"\u01b1\u01b5\5B\"\2\u01b2\u01b5\7)\2\2\u01b3\u01b5\5\36\20\2\u01b4\u01b1"+
		"\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5G\3\2\2\2\u01b6"+
		"\u01b7\7$\2\2\u01b7I\3\2\2\2\u01b8\u01b9\7%\2\2\u01b9K\3\2\2\2+RXajz\u0088"+
		"\u0094\u009d\u00a0\u00a8\u00b5\u00b8\u00c0\u00c5\u00d1\u00d4\u00dc\u00e1"+
		"\u00e6\u00ee\u00fa\u00fd\u010b\u0117\u011e\u0126\u012b\u012d\u0134\u014b"+
		"\u0156\u015d\u016b\u0173\u0175\u0180\u018a\u0192\u0196\u01af\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}