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
		RULE_mathExpr = 16, RULE_mathComparison = 17, RULE_condition = 18, RULE_nCondition = 19, 
		RULE_nConditionMore = 20, RULE_methodDeclParams = 21, RULE_methodCallParams = 22, 
		RULE_intCallParam = 23, RULE_stringCallParam = 24, RULE_intParam = 25, 
		RULE_stringParam = 26, RULE_dataType = 27, RULE_methodType = 28, RULE_nameClass = 29, 
		RULE_methodName = 30, RULE_variableName = 31, RULE_stringvalues = 32, 
		RULE_mathvalues = 33, RULE_opener = 34, RULE_closer = 35;
	public static final String[] ruleNames = {
		"prog", "expression", "nonGlobalExpr", "varGlobalDecl", "varDecl", "varMod", 
		"methodDecl", "runMethod", "callMethodExpr", "ifStm", "whileStm", "forStm", 
		"writeExpr", "writevalues", "readIntExpr", "readStringExpr", "mathExpr", 
		"mathComparison", "condition", "nCondition", "nConditionMore", "methodDeclParams", 
		"methodCallParams", "intCallParam", "stringCallParam", "intParam", "stringParam", 
		"dataType", "methodType", "nameClass", "methodName", "variableName", "stringvalues", 
		"mathvalues", "opener", "closer"
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
			setState(72);
			match(T__0);
			setState(73);
			((ProgContext)_localctx).className = nameClass();
			setState(74);
			match(T__1);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(75);
				varGlobalDecl();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(81);
					expression();
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(87);
			runMethod();
			setState(88);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				methodDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				varMod();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
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
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				ifStm();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				whileStm();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				forStm();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				writeExpr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				varMod();
				}
				break;
			case T__4:
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				varDecl();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
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
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DeclareIntGlobalVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(104);
				((DeclareIntGlobalVariableContext)_localctx).isGlobal = match(T__3);
				}
				setState(105);
				match(T__4);
				setState(106);
				((DeclareIntGlobalVariableContext)_localctx).identifier = variableName();
				setState(107);
				match(T__5);
				setState(108);
				((DeclareIntGlobalVariableContext)_localctx).value = mathExpr(0);
				setState(109);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new DeclareStringGlobalVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(111);
				((DeclareStringGlobalVariableContext)_localctx).isGlobal = match(T__3);
				}
				setState(112);
				match(T__7);
				setState(113);
				((DeclareStringGlobalVariableContext)_localctx).identifier = variableName();
				setState(114);
				match(T__5);
				setState(115);
				((DeclareStringGlobalVariableContext)_localctx).value = stringvalues();
				setState(116);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new DeclareIntVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(T__4);
				setState(121);
				((DeclareIntVariableContext)_localctx).identifier = variableName();
				setState(122);
				match(T__5);
				setState(123);
				((DeclareIntVariableContext)_localctx).value = mathExpr(0);
				setState(124);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new DeclareStringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__7);
				setState(127);
				((DeclareStringVariableContext)_localctx).identifier = variableName();
				setState(128);
				match(T__5);
				setState(129);
				((DeclareStringVariableContext)_localctx).value = stringvalues();
				setState(130);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new IntVarModifyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				((IntVarModifyContext)_localctx).identifier = variableName();
				setState(135);
				match(T__5);
				setState(136);
				((IntVarModifyContext)_localctx).value = mathExpr(0);
				setState(137);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new StringVarModifyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((StringVarModifyContext)_localctx).identifier = variableName();
				setState(140);
				match(T__5);
				setState(141);
				((StringVarModifyContext)_localctx).value = stringvalues();
				setState(142);
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
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new VoidMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__8);
				setState(147);
				match(T__9);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(148);
					methodDeclParams();
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(149);
						match(T__10);
						setState(150);
						methodDeclParams();
						}
						}
						setState(155);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(158);
				match(T__11);
				setState(159);
				((VoidMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(160);
				opener();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(161);
					nonGlobalExpr();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(T__12);
				setState(168);
				closer();
				}
				break;
			case T__4:
				_localctx = new IntMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__4);
				setState(171);
				match(T__9);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(172);
					methodDeclParams();
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(173);
						match(T__10);
						setState(174);
						methodDeclParams();
						}
						}
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(182);
				match(T__11);
				setState(183);
				((IntMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(184);
				opener();
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(185);
					nonGlobalExpr();
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(191);
				match(T__13);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__25) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(192);
					((IntMethodDeclContext)_localctx).returnvalue = mathExpr(0);
					}
				}

				setState(195);
				match(T__6);
				setState(196);
				closer();
				}
				break;
			case T__7:
				_localctx = new StringMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				match(T__7);
				setState(199);
				match(T__9);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(200);
					methodDeclParams();
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(201);
						match(T__10);
						setState(202);
						methodDeclParams();
						}
						}
						setState(207);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(210);
				match(T__11);
				setState(211);
				((StringMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(212);
				opener();
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(213);
					nonGlobalExpr();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(T__13);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
					{
					setState(220);
					((StringMethodDeclContext)_localctx).returnvalue = stringvalues();
					}
				}

				setState(223);
				match(T__6);
				setState(224);
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
			setState(228);
			match(T__8);
			setState(229);
			match(T__14);
			setState(230);
			opener();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(231);
				nonGlobalExpr();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
			match(T__12);
			setState(238);
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
			setState(240);
			match(T__9);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << INT) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
				{
				setState(241);
				methodCallParams();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(242);
					match(T__10);
					setState(243);
					methodCallParams();
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(251);
			match(T__11);
			setState(252);
			((CallMethodExprContext)_localctx).methodIdentifier = methodName();
			setState(253);
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
		public List<NConditionContext> nCondition() {
			return getRuleContexts(NConditionContext.class);
		}
		public NConditionContext nCondition(int i) {
			return getRuleContext(NConditionContext.class,i);
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
			setState(255);
			match(T__15);
			setState(256);
			match(T__9);
			setState(257);
			nCondition();
			setState(258);
			match(T__11);
			setState(259);
			opener();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(260);
				((IfStmContext)_localctx).ifBlock = nonGlobalExpr();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			closer();
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(267);
						match(T__16);
						setState(268);
						match(T__9);
						setState(269);
						nCondition();
						setState(270);
						match(T__11);
						setState(271);
						opener();
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
							{
							{
							setState(272);
							((IfStmContext)_localctx).ifElseBlock = nonGlobalExpr();
							}
							}
							setState(277);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(278);
						closer();
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(285);
					match(T__16);
					setState(286);
					opener();
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
						{
						{
						setState(287);
						((IfStmContext)_localctx).elseBlock = nonGlobalExpr();
						}
						}
						setState(292);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(293);
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
		enterRule(_localctx, 20, RULE_whileStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__17);
			setState(300);
			opener();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
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
			setState(308);
			match(T__18);
			setState(309);
			match(T__9);
			setState(310);
			condition(0);
			setState(311);
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
		enterRule(_localctx, 22, RULE_forStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__19);
			setState(314);
			match(T__9);
			setState(315);
			varDecl();
			setState(316);
			condition(0);
			setState(317);
			match(T__6);
			setState(318);
			((ForStmContext)_localctx).idCrement = match(IDcrement);
			setState(319);
			match(T__9);
			setState(320);
			((ForStmContext)_localctx).idValue = variableName();
			setState(321);
			match(T__11);
			setState(322);
			match(T__11);
			setState(323);
			opener();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(324);
				nonGlobalExpr();
				}
				}
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(330);
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
			setState(332);
			match(T__20);
			{
			setState(333);
			writevalues();
			}
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(334);
				match(T__21);
				setState(335);
				writevalues();
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
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
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new WriteMathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				mathExpr(0);
				}
				break;
			case 2:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
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
			setState(347);
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
			setState(349);
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
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(352);
				match(T__9);
				setState(353);
				mathExpr(0);
				setState(354);
				match(T__11);
				}
				break;
			case T__25:
				{
				_localctx = new MinusFirstMathExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				match(T__25);
				setState(357);
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
				setState(358);
				((MathValuesExpressionContext)_localctx).value = mathvalues();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(367);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyDivideExpressionContext(new MathExprContext(_parentctx, _parentState));
						((MultiplyDivideExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(361);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(362);
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
						setState(363);
						((MultiplyDivideExpressionContext)_localctx).rightExpr = mathExpr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddSubstractExpressionContext(new MathExprContext(_parentctx, _parentState));
						((AddSubstractExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(364);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(365);
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
						setState(366);
						((AddSubstractExpressionContext)_localctx).rightExpr = mathExpr(3);
						}
						break;
					}
					} 
				}
				setState(371);
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
			setState(372);
			((MathComparisonContext)_localctx).identifierLeft = mathExpr(0);
			setState(373);
			((MathComparisonContext)_localctx).lop = match(LOP);
			setState(374);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionValueContext extends ConditionContext {
		public MathComparisonContext mathComparison() {
			return getRuleContext(MathComparisonContext.class,0);
		}
		public ConditionValueContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterConditionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitConditionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitConditionValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisCondtionContext extends ConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ParenthesisCondtionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterParenthesisCondtion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitParenthesisCondtion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitParenthesisCondtion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipleConditionContext extends ConditionContext {
		public ConditionContext leftCondition;
		public Token andOR;
		public ConditionContext rightCondtion;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public MultipleConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMultipleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMultipleCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMultipleCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisCondtionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(377);
				match(T__9);
				setState(378);
				condition(0);
				setState(379);
				match(T__11);
				}
				break;
			case 2:
				{
				_localctx = new ConditionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(381);
				mathComparison();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleConditionContext(new ConditionContext(_parentctx, _parentState));
					((MultipleConditionContext)_localctx).leftCondition = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(384);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(385);
					((MultipleConditionContext)_localctx).andOR = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__28 || _la==T__29) ) {
						((MultipleConditionContext)_localctx).andOR = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(386);
					((MultipleConditionContext)_localctx).rightCondtion = condition(3);
					}
					} 
				}
				setState(391);
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

	public static class NConditionContext extends ParserRuleContext {
		public MathComparisonContext first;
		public NConditionMoreContext more;
		public MathComparisonContext mathComparison() {
			return getRuleContext(MathComparisonContext.class,0);
		}
		public List<NConditionMoreContext> nConditionMore() {
			return getRuleContexts(NConditionMoreContext.class);
		}
		public NConditionMoreContext nConditionMore(int i) {
			return getRuleContext(NConditionMoreContext.class,i);
		}
		public NConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NConditionContext nCondition() throws RecognitionException {
		NConditionContext _localctx = new NConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			((NConditionContext)_localctx).first = mathComparison();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28 || _la==T__29) {
				{
				{
				setState(393);
				((NConditionContext)_localctx).more = nConditionMore();
				}
				}
				setState(398);
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

	public static class NConditionMoreContext extends ParserRuleContext {
		public Token andOR;
		public MathComparisonContext mathComparison() {
			return getRuleContext(MathComparisonContext.class,0);
		}
		public NConditionMoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nConditionMore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNConditionMore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNConditionMore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNConditionMore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NConditionMoreContext nConditionMore() throws RecognitionException {
		NConditionMoreContext _localctx = new NConditionMoreContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nConditionMore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(399);
			((NConditionMoreContext)_localctx).andOR = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
				((NConditionMoreContext)_localctx).andOR = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(400);
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
		enterRule(_localctx, 42, RULE_methodDeclParams);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new IntParamMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				intParam();
				}
				break;
			case T__7:
				_localctx = new StringParamMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
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
		enterRule(_localctx, 44, RULE_methodCallParams);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new IntCallParamMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				intCallParam();
				}
				break;
			case 2:
				_localctx = new StringCallParamMethodCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
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
		enterRule(_localctx, 46, RULE_intCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
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
		enterRule(_localctx, 48, RULE_stringCallParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		enterRule(_localctx, 50, RULE_intParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(T__4);
			setState(415);
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
		enterRule(_localctx, 52, RULE_stringParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(T__7);
			setState(418);
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
		enterRule(_localctx, 54, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
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
		enterRule(_localctx, 56, RULE_methodType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
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
		enterRule(_localctx, 58, RULE_nameClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
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
		enterRule(_localctx, 62, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
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
		enterRule(_localctx, 64, RULE_stringvalues);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRINGVALUE:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(STRINGVALUE);
				}
				break;
			case STRING:
				_localctx = new StringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				variableName();
				}
				break;
			case T__24:
				_localctx = new StringReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
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
		enterRule(_localctx, 66, RULE_mathvalues);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new IntvariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				variableName();
				}
				break;
			case INT:
				_localctx = new IntlitteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(INT);
				}
				break;
			case T__23:
				_localctx = new IntreadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
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
		enterRule(_localctx, 68, RULE_opener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
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
		enterRule(_localctx, 70, RULE_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
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
		case 18:
			return condition_sempred((ConditionContext)_localctx, predIndex);
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
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u01bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\7\2O\n\2\f\2\16\2R\13\2"+
		"\3\2\7\2U\n\2\f\2\16\2X\13\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3`\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4i\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5y\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u0087\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0093\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\7\b\u009a\n\b\f\b\16\b\u009d\13\b\5\b\u009f\n\b"+
		"\3\b\3\b\3\b\3\b\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u00b2\n\b\f\b\16\b\u00b5\13\b\5\b\u00b7\n\b\3\b\3\b\3"+
		"\b\3\b\7\b\u00bd\n\b\f\b\16\b\u00c0\13\b\3\b\3\b\5\b\u00c4\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ce\n\b\f\b\16\b\u00d1\13\b\5\b\u00d3\n"+
		"\b\3\b\3\b\3\b\3\b\7\b\u00d9\n\b\f\b\16\b\u00dc\13\b\3\b\3\b\5\b\u00e0"+
		"\n\b\3\b\3\b\3\b\5\b\u00e5\n\b\3\t\3\t\3\t\3\t\7\t\u00eb\n\t\f\t\16\t"+
		"\u00ee\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00f7\n\n\f\n\16\n\u00fa\13"+
		"\n\5\n\u00fc\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0108"+
		"\n\13\f\13\16\13\u010b\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0114"+
		"\n\13\f\13\16\13\u0117\13\13\3\13\3\13\7\13\u011b\n\13\f\13\16\13\u011e"+
		"\13\13\3\13\3\13\3\13\7\13\u0123\n\13\f\13\16\13\u0126\13\13\3\13\3\13"+
		"\5\13\u012a\n\13\5\13\u012c\n\13\3\f\3\f\3\f\7\f\u0131\n\f\f\f\16\f\u0134"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0148\n\r\f\r\16\r\u014b\13\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\7\16\u0153\n\16\f\16\16\16\u0156\13\16\3\16\3\16\3\17\3\17\5\17\u015c"+
		"\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u016a\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0172\n\22\f\22\16\22\u0175"+
		"\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0181\n"+
		"\24\3\24\3\24\3\24\7\24\u0186\n\24\f\24\16\24\u0189\13\24\3\25\3\25\7"+
		"\25\u018d\n\25\f\25\16\25\u0190\13\25\3\26\3\26\3\26\3\27\3\27\5\27\u0197"+
		"\n\27\3\30\3\30\5\30\u019b\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\5\"\u01b4"+
		"\n\"\3#\3#\3#\5#\u01b9\n#\3$\3$\3%\3%\3%\2\4\"&&\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\7\3\2\35\36\4\2\30"+
		"\30\34\34\3\2\37 \3\2!\"\3\2!#\u01ce\2J\3\2\2\2\4_\3\2\2\2\6h\3\2\2\2"+
		"\bx\3\2\2\2\n\u0086\3\2\2\2\f\u0092\3\2\2\2\16\u00e4\3\2\2\2\20\u00e6"+
		"\3\2\2\2\22\u00f2\3\2\2\2\24\u0101\3\2\2\2\26\u012d\3\2\2\2\30\u013b\3"+
		"\2\2\2\32\u014e\3\2\2\2\34\u015b\3\2\2\2\36\u015d\3\2\2\2 \u015f\3\2\2"+
		"\2\"\u0169\3\2\2\2$\u0176\3\2\2\2&\u0180\3\2\2\2(\u018a\3\2\2\2*\u0191"+
		"\3\2\2\2,\u0196\3\2\2\2.\u019a\3\2\2\2\60\u019c\3\2\2\2\62\u019e\3\2\2"+
		"\2\64\u01a0\3\2\2\2\66\u01a3\3\2\2\28\u01a6\3\2\2\2:\u01a8\3\2\2\2<\u01aa"+
		"\3\2\2\2>\u01ac\3\2\2\2@\u01ae\3\2\2\2B\u01b3\3\2\2\2D\u01b8\3\2\2\2F"+
		"\u01ba\3\2\2\2H\u01bc\3\2\2\2JK\7\3\2\2KL\5<\37\2LP\7\4\2\2MO\5\b\5\2"+
		"NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QV\3\2\2\2RP\3\2\2\2SU\5\4\3\2"+
		"TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\5\20\t"+
		"\2Z[\7\5\2\2[\3\3\2\2\2\\`\5\16\b\2]`\5\f\7\2^`\5\"\22\2_\\\3\2\2\2_]"+
		"\3\2\2\2_^\3\2\2\2`\5\3\2\2\2ai\5\24\13\2bi\5\26\f\2ci\5\30\r\2di\5\32"+
		"\16\2ei\5\f\7\2fi\5\n\6\2gi\5\22\n\2ha\3\2\2\2hb\3\2\2\2hc\3\2\2\2hd\3"+
		"\2\2\2he\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\7\3\2\2\2jk\7\6\2\2kl\7\7\2\2lm"+
		"\5@!\2mn\7\b\2\2no\5\"\22\2op\7\t\2\2py\3\2\2\2qr\7\6\2\2rs\7\n\2\2st"+
		"\5@!\2tu\7\b\2\2uv\5B\"\2vw\7\t\2\2wy\3\2\2\2xj\3\2\2\2xq\3\2\2\2y\t\3"+
		"\2\2\2z{\7\7\2\2{|\5@!\2|}\7\b\2\2}~\5\"\22\2~\177\7\t\2\2\177\u0087\3"+
		"\2\2\2\u0080\u0081\7\n\2\2\u0081\u0082\5@!\2\u0082\u0083\7\b\2\2\u0083"+
		"\u0084\5B\"\2\u0084\u0085\7\t\2\2\u0085\u0087\3\2\2\2\u0086z\3\2\2\2\u0086"+
		"\u0080\3\2\2\2\u0087\13\3\2\2\2\u0088\u0089\5@!\2\u0089\u008a\7\b\2\2"+
		"\u008a\u008b\5\"\22\2\u008b\u008c\7\t\2\2\u008c\u0093\3\2\2\2\u008d\u008e"+
		"\5@!\2\u008e\u008f\7\b\2\2\u008f\u0090\5B\"\2\u0090\u0091\7\t\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0088\3\2\2\2\u0092\u008d\3\2\2\2\u0093\r\3\2\2\2"+
		"\u0094\u0095\7\13\2\2\u0095\u009e\7\f\2\2\u0096\u009b\5,\27\2\u0097\u0098"+
		"\7\r\2\2\u0098\u009a\5,\27\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009e\u0096\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\7\16\2\2\u00a1\u00a2\5> \2\u00a2\u00a6\5F$\2\u00a3\u00a5\5\6\4"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\17\2\2"+
		"\u00aa\u00ab\5H%\2\u00ab\u00e5\3\2\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00b6"+
		"\7\f\2\2\u00ae\u00b3\5,\27\2\u00af\u00b0\7\r\2\2\u00b0\u00b2\5,\27\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\16\2\2\u00b9\u00ba\5"+
		"> \2\u00ba\u00be\5F$\2\u00bb\u00bd\5\6\4\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0"+
		"\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c3\7\20\2\2\u00c2\u00c4\5\"\22\2\u00c3\u00c2\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\t\2\2\u00c6"+
		"\u00c7\5H%\2\u00c7\u00e5\3\2\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00d2\7\f\2"+
		"\2\u00ca\u00cf\5,\27\2\u00cb\u00cc\7\r\2\2\u00cc\u00ce\5,\27\2\u00cd\u00cb"+
		"\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\5> \2\u00d6"+
		"\u00da\5F$\2\u00d7\u00d9\5\6\4\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00df\7\20\2\2\u00de\u00e0\5B\"\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7\t\2\2\u00e2\u00e3\5H"+
		"%\2\u00e3\u00e5\3\2\2\2\u00e4\u0094\3\2\2\2\u00e4\u00ac\3\2\2\2\u00e4"+
		"\u00c8\3\2\2\2\u00e5\17\3\2\2\2\u00e6\u00e7\7\13\2\2\u00e7\u00e8\7\21"+
		"\2\2\u00e8\u00ec\5F$\2\u00e9\u00eb\5\6\4\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee"+
		"\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00f0\7\17\2\2\u00f0\u00f1\5H%\2\u00f1\21\3\2\2\2"+
		"\u00f2\u00fb\7\f\2\2\u00f3\u00f8\5.\30\2\u00f4\u00f5\7\r\2\2\u00f5\u00f7"+
		"\5.\30\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00f3\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\16\2\2\u00fe"+
		"\u00ff\5> \2\u00ff\u0100\7\t\2\2\u0100\23\3\2\2\2\u0101\u0102\7\22\2\2"+
		"\u0102\u0103\7\f\2\2\u0103\u0104\5(\25\2\u0104\u0105\7\16\2\2\u0105\u0109"+
		"\5F$\2\u0106\u0108\5\6\4\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010c\u012b\5H%\2\u010d\u010e\7\23\2\2\u010e\u010f\7\f\2\2\u010f"+
		"\u0110\5(\25\2\u0110\u0111\7\16\2\2\u0111\u0115\5F$\2\u0112\u0114\5\6"+
		"\4\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\5H"+
		"%\2\u0119\u011b\3\2\2\2\u011a\u010d\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0129\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0120\7\23\2\2\u0120\u0124\5F$\2\u0121\u0123\5\6\4\2\u0122"+
		"\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\5H%\2\u0128\u012a"+
		"\3\2\2\2\u0129\u011f\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b"+
		"\u011c\3\2\2\2\u012b\u012c\3\2\2\2\u012c\25\3\2\2\2\u012d\u012e\7\24\2"+
		"\2\u012e\u0132\5F$\2\u012f\u0131\5\6\4\2\u0130\u012f\3\2\2\2\u0131\u0134"+
		"\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u0136\5H%\2\u0136\u0137\7\25\2\2\u0137\u0138\7\f"+
		"\2\2\u0138\u0139\5&\24\2\u0139\u013a\7\16\2\2\u013a\27\3\2\2\2\u013b\u013c"+
		"\7\26\2\2\u013c\u013d\7\f\2\2\u013d\u013e\5\n\6\2\u013e\u013f\5&\24\2"+
		"\u013f\u0140\7\t\2\2\u0140\u0141\7&\2\2\u0141\u0142\7\f\2\2\u0142\u0143"+
		"\5@!\2\u0143\u0144\7\16\2\2\u0144\u0145\7\16\2\2\u0145\u0149\5F$\2\u0146"+
		"\u0148\5\6\4\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014d\5H%\2\u014d\31\3\2\2\2\u014e\u014f\7\27\2\2\u014f\u0154\5\34\17"+
		"\2\u0150\u0151\7\30\2\2\u0151\u0153\5\34\17\2\u0152\u0150\3\2\2\2\u0153"+
		"\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0157\3\2"+
		"\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\31\2\2\u0158\33\3\2\2\2\u0159\u015c"+
		"\5\"\22\2\u015a\u015c\5B\"\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"\35\3\2\2\2\u015d\u015e\7\32\2\2\u015e\37\3\2\2\2\u015f\u0160\7\33\2\2"+
		"\u0160!\3\2\2\2\u0161\u0162\b\22\1\2\u0162\u0163\7\f\2\2\u0163\u0164\5"+
		"\"\22\2\u0164\u0165\7\16\2\2\u0165\u016a\3\2\2\2\u0166\u0167\7\34\2\2"+
		"\u0167\u016a\5\"\22\6\u0168\u016a\5D#\2\u0169\u0161\3\2\2\2\u0169\u0166"+
		"\3\2\2\2\u0169\u0168\3\2\2\2\u016a\u0173\3\2\2\2\u016b\u016c\f\5\2\2\u016c"+
		"\u016d\t\2\2\2\u016d\u0172\5\"\22\6\u016e\u016f\f\4\2\2\u016f\u0170\t"+
		"\3\2\2\u0170\u0172\5\"\22\5\u0171\u016b\3\2\2\2\u0171\u016e\3\2\2\2\u0172"+
		"\u0175\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174#\3\2\2\2"+
		"\u0175\u0173\3\2\2\2\u0176\u0177\5\"\22\2\u0177\u0178\7(\2\2\u0178\u0179"+
		"\5\"\22\2\u0179%\3\2\2\2\u017a\u017b\b\24\1\2\u017b\u017c\7\f\2\2\u017c"+
		"\u017d\5&\24\2\u017d\u017e\7\16\2\2\u017e\u0181\3\2\2\2\u017f\u0181\5"+
		"$\23\2\u0180\u017a\3\2\2\2\u0180\u017f\3\2\2\2\u0181\u0187\3\2\2\2\u0182"+
		"\u0183\f\4\2\2\u0183\u0184\t\4\2\2\u0184\u0186\5&\24\5\u0185\u0182\3\2"+
		"\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188"+
		"\'\3\2\2\2\u0189\u0187\3\2\2\2\u018a\u018e\5$\23\2\u018b\u018d\5*\26\2"+
		"\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f"+
		"\3\2\2\2\u018f)\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\t\4\2\2\u0192"+
		"\u0193\5$\23\2\u0193+\3\2\2\2\u0194\u0197\5\64\33\2\u0195\u0197\5\66\34"+
		"\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197-\3\2\2\2\u0198\u019b"+
		"\5\60\31\2\u0199\u019b\5\62\32\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2"+
		"\2\u019b/\3\2\2\2\u019c\u019d\5\"\22\2\u019d\61\3\2\2\2\u019e\u019f\5"+
		"B\"\2\u019f\63\3\2\2\2\u01a0\u01a1\7\7\2\2\u01a1\u01a2\5@!\2\u01a2\65"+
		"\3\2\2\2\u01a3\u01a4\7\n\2\2\u01a4\u01a5\5@!\2\u01a5\67\3\2\2\2\u01a6"+
		"\u01a7\t\5\2\2\u01a79\3\2\2\2\u01a8\u01a9\t\6\2\2\u01a9;\3\2\2\2\u01aa"+
		"\u01ab\7+\2\2\u01ab=\3\2\2\2\u01ac\u01ad\7*\2\2\u01ad?\3\2\2\2\u01ae\u01af"+
		"\7*\2\2\u01afA\3\2\2\2\u01b0\u01b4\7,\2\2\u01b1\u01b4\5@!\2\u01b2\u01b4"+
		"\5 \21\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2\2\2\u01b4"+
		"C\3\2\2\2\u01b5\u01b9\5@!\2\u01b6\u01b9\7)\2\2\u01b7\u01b9\5\36\20\2\u01b8"+
		"\u01b5\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9E\3\2\2\2"+
		"\u01ba\u01bb\7$\2\2\u01bbG\3\2\2\2\u01bc\u01bd\7%\2\2\u01bdI\3\2\2\2,"+
		"PV_hx\u0086\u0092\u009b\u009e\u00a6\u00b3\u00b6\u00be\u00c3\u00cf\u00d2"+
		"\u00da\u00df\u00e4\u00ec\u00f8\u00fb\u0109\u0115\u011c\u0124\u0129\u012b"+
		"\u0132\u0149\u0154\u015b\u0169\u0171\u0173\u0180\u0187\u018e\u0196\u019a"+
		"\u01b3\u01b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}