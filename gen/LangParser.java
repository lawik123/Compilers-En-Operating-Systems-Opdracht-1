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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, IDcrement=37, OP=38, 
		LOP=39, INT=40, STRING=41, CLASSNAME=42, STRINGVALUE=43, WL=44, WS=45;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_methodnames = 2, RULE_nonGlobalExpr = 3, 
		RULE_varGlobalDecl = 4, RULE_varDecl = 5, RULE_varMod = 6, RULE_methodDecl = 7, 
		RULE_runMethod = 8, RULE_callMethodExpr = 9, RULE_ifStm = 10, RULE_whileStm = 11, 
		RULE_forStm = 12, RULE_writeExpr = 13, RULE_writevalues = 14, RULE_readIntExpr = 15, 
		RULE_readStringExpr = 16, RULE_ifExprsensions = 17, RULE_mathExpr = 18, 
		RULE_mathComparison = 19, RULE_ifCondition = 20, RULE_ifConditionMore = 21, 
		RULE_forCondition = 22, RULE_forConditionMore = 23, RULE_methodDeclParams = 24, 
		RULE_methodCallParams = 25, RULE_intCallParam = 26, RULE_stringCallParam = 27, 
		RULE_intParam = 28, RULE_stringParam = 29, RULE_dataType = 30, RULE_methodType = 31, 
		RULE_nameClass = 32, RULE_methodName = 33, RULE_variableName = 34, RULE_stringvalues = 35, 
		RULE_mathvalues = 36, RULE_opener = 37, RULE_closer = 38;
	public static final String[] ruleNames = {
		"prog", "expression", "methodnames", "nonGlobalExpr", "varGlobalDecl", 
		"varDecl", "varMod", "methodDecl", "runMethod", "callMethodExpr", "ifStm", 
		"whileStm", "forStm", "writeExpr", "writevalues", "readIntExpr", "readStringExpr", 
		"ifExprsensions", "mathExpr", "mathComparison", "ifCondition", "ifConditionMore", 
		"forCondition", "forConditionMore", "methodDeclParams", "methodCallParams", 
		"intCallParam", "stringCallParam", "intParam", "stringParam", "dataType", 
		"methodType", "nameClass", "methodName", "variableName", "stringvalues", 
		"mathvalues", "opener", "closer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'BEGIN'", "'END'", "'global'", "'~int'", "'IS'", "';'", 
		"'~string'", "'~void'", "'('", "','", "')'", "'return;'", "'return'", 
		"'()run'", "'if'", "'?'", "'REPEAT'", "'UNTIL'", "'for'", "'WRITE('", 
		"'+'", "');'", "'READINT'", "'READSTRING'", "'-'", "'*'", "':'", "'%'", 
		"'||'", "'&&'", "'int'", "'string'", "'void'", "'/'", "'\\'", null, null, 
		null, null, null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IDcrement", "OP", "LOP", "INT", "STRING", "CLASSNAME", "STRINGVALUE", 
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
		public MethodnamesContext methodnames() {
			return getRuleContext(MethodnamesContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			((ProgContext)_localctx).className = nameClass();
			setState(80);
			match(T__1);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(81);
				varGlobalDecl();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(87);
					expression();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(93);
				methodnames();
				}
				break;
			}
			setState(96);
			runMethod();
			setState(97);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			varMod();
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

	public static class MethodnamesContext extends ParserRuleContext {
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public MethodnamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodnames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMethodnames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMethodnames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMethodnames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodnamesContext methodnames() throws RecognitionException {
		MethodnamesContext _localctx = new MethodnamesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodnames);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					methodDecl();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		enterRule(_localctx, 6, RULE_nonGlobalExpr);
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				ifStm();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				whileStm();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				forStm();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				writeExpr();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				varMod();
				}
				break;
			case T__4:
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
				varDecl();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
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
		enterRule(_localctx, 8, RULE_varGlobalDecl);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DeclareIntGlobalVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(116);
				((DeclareIntGlobalVariableContext)_localctx).isGlobal = match(T__3);
				}
				setState(117);
				match(T__4);
				setState(118);
				((DeclareIntGlobalVariableContext)_localctx).identifier = variableName();
				setState(119);
				match(T__5);
				setState(120);
				((DeclareIntGlobalVariableContext)_localctx).value = mathExpr(0);
				setState(121);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new DeclareStringGlobalVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(123);
				((DeclareStringGlobalVariableContext)_localctx).isGlobal = match(T__3);
				}
				setState(124);
				match(T__7);
				setState(125);
				((DeclareStringGlobalVariableContext)_localctx).identifier = variableName();
				setState(126);
				match(T__5);
				setState(127);
				((DeclareStringGlobalVariableContext)_localctx).value = stringvalues();
				setState(128);
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
		enterRule(_localctx, 10, RULE_varDecl);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new DeclareIntVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__4);
				setState(133);
				((DeclareIntVariableContext)_localctx).identifier = variableName();
				setState(134);
				match(T__5);
				setState(135);
				((DeclareIntVariableContext)_localctx).value = mathExpr(0);
				setState(136);
				match(T__6);
				}
				break;
			case T__7:
				_localctx = new DeclareStringVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__7);
				setState(139);
				((DeclareStringVariableContext)_localctx).identifier = variableName();
				setState(140);
				match(T__5);
				setState(141);
				((DeclareStringVariableContext)_localctx).value = stringvalues();
				setState(142);
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
		enterRule(_localctx, 12, RULE_varMod);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IntVarModifyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((IntVarModifyContext)_localctx).identifier = variableName();
				setState(147);
				match(T__5);
				setState(148);
				((IntVarModifyContext)_localctx).value = mathExpr(0);
				setState(149);
				match(T__6);
				}
				break;
			case 2:
				_localctx = new StringVarModifyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				((StringVarModifyContext)_localctx).identifier = variableName();
				setState(152);
				match(T__5);
				setState(153);
				((StringVarModifyContext)_localctx).value = stringvalues();
				setState(154);
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
		enterRule(_localctx, 14, RULE_methodDecl);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new VoidMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__8);
				setState(159);
				match(T__9);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(160);
					methodDeclParams();
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(161);
						match(T__10);
						setState(162);
						methodDeclParams();
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(170);
				match(T__11);
				setState(171);
				((VoidMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(172);
				opener();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(173);
					nonGlobalExpr();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179);
				match(T__12);
				setState(180);
				closer();
				}
				break;
			case T__4:
				_localctx = new IntMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__4);
				setState(183);
				match(T__9);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(184);
					methodDeclParams();
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(185);
						match(T__10);
						setState(186);
						methodDeclParams();
						}
						}
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(194);
				match(T__11);
				setState(195);
				((IntMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(196);
				opener();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(197);
					nonGlobalExpr();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203);
				match(T__13);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__25) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(204);
					((IntMethodDeclContext)_localctx).returnvalue = mathExpr(0);
					}
				}

				setState(207);
				match(T__6);
				setState(208);
				closer();
				}
				break;
			case T__7:
				_localctx = new StringMethodDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(T__7);
				setState(211);
				match(T__9);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4 || _la==T__7) {
					{
					setState(212);
					methodDeclParams();
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(213);
						match(T__10);
						setState(214);
						methodDeclParams();
						}
						}
						setState(219);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(222);
				match(T__11);
				setState(223);
				((StringMethodDeclContext)_localctx).methodIdentifier = methodName();
				setState(224);
				opener();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
					{
					{
					setState(225);
					nonGlobalExpr();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(231);
				match(T__13);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__24) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
					{
					setState(232);
					((StringMethodDeclContext)_localctx).returnvalue = stringvalues();
					}
				}

				setState(235);
				match(T__6);
				setState(236);
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
		enterRule(_localctx, 16, RULE_runMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__8);
			setState(241);
			match(T__14);
			setState(242);
			opener();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(243);
				nonGlobalExpr();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__12);
			setState(250);
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
		enterRule(_localctx, 18, RULE_callMethodExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__9);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << INT) | (1L << STRING) | (1L << STRINGVALUE))) != 0)) {
				{
				setState(253);
				methodCallParams();
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(254);
					match(T__10);
					setState(255);
					methodCallParams();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(263);
			match(T__11);
			setState(264);
			((CallMethodExprContext)_localctx).methodIdentifier = methodName();
			setState(265);
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
		public IfExprsensionsContext ifBlock;
		public IfExprsensionsContext ifElseBlock;
		public IfExprsensionsContext elseBlock;
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
		public List<IfExprsensionsContext> ifExprsensions() {
			return getRuleContexts(IfExprsensionsContext.class);
		}
		public IfExprsensionsContext ifExprsensions(int i) {
			return getRuleContext(IfExprsensionsContext.class,i);
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
		enterRule(_localctx, 20, RULE_ifStm);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__15);
			setState(268);
			match(T__9);
			setState(269);
			ifCondition();
			setState(270);
			match(T__11);
			setState(271);
			opener();
			setState(272);
			((IfStmContext)_localctx).ifBlock = ifExprsensions();
			setState(273);
			closer();
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(274);
						match(T__16);
						setState(275);
						match(T__9);
						setState(276);
						ifCondition();
						setState(277);
						match(T__11);
						setState(278);
						opener();
						setState(279);
						((IfStmContext)_localctx).ifElseBlock = ifExprsensions();
						setState(280);
						closer();
						}
						} 
					}
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__16) {
					{
					setState(287);
					match(T__16);
					setState(288);
					opener();
					setState(289);
					((IfStmContext)_localctx).elseBlock = ifExprsensions();
					setState(290);
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
		enterRule(_localctx, 22, RULE_whileStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__17);
			setState(297);
			opener();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(298);
				nonGlobalExpr();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			closer();
			setState(305);
			match(T__18);
			setState(306);
			match(T__9);
			setState(307);
			ifCondition();
			setState(308);
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
		enterRule(_localctx, 24, RULE_forStm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__19);
			setState(311);
			match(T__9);
			setState(312);
			varDecl();
			setState(313);
			forCondition();
			setState(314);
			match(T__6);
			setState(315);
			((ForStmContext)_localctx).idCrement = match(IDcrement);
			setState(316);
			match(T__9);
			setState(317);
			((ForStmContext)_localctx).idValue = variableName();
			setState(318);
			match(T__11);
			setState(319);
			match(T__11);
			setState(320);
			opener();
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(321);
				nonGlobalExpr();
				}
				}
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
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
		enterRule(_localctx, 26, RULE_writeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__20);
			{
			setState(330);
			writevalues();
			}
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(331);
				match(T__21);
				setState(332);
				writevalues();
				}
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(338);
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
		enterRule(_localctx, 28, RULE_writevalues);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new WriteMathContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				mathExpr(0);
				}
				break;
			case 2:
				_localctx = new WriteStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
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
		enterRule(_localctx, 30, RULE_readIntExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
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
		enterRule(_localctx, 32, RULE_readStringExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
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

	public static class IfExprsensionsContext extends ParserRuleContext {
		public List<NonGlobalExprContext> nonGlobalExpr() {
			return getRuleContexts(NonGlobalExprContext.class);
		}
		public NonGlobalExprContext nonGlobalExpr(int i) {
			return getRuleContext(NonGlobalExprContext.class,i);
		}
		public IfExprsensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExprsensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfExprsensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfExprsensions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfExprsensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprsensionsContext ifExprsensions() throws RecognitionException {
		IfExprsensionsContext _localctx = new IfExprsensionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifExprsensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__7) | (1L << T__9) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << STRING))) != 0)) {
				{
				{
				setState(348);
				nonGlobalExpr();
				}
				}
				setState(353);
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
	public static class RestExpressionContext extends MathExprContext {
		public MathExprContext leftExpr;
		public Token op;
		public MathExprContext rightExpr;
		public List<MathExprContext> mathExpr() {
			return getRuleContexts(MathExprContext.class);
		}
		public MathExprContext mathExpr(int i) {
			return getRuleContext(MathExprContext.class,i);
		}
		public RestExpressionContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterRestExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitRestExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitRestExpression(this);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_mathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(355);
				match(T__9);
				setState(356);
				mathExpr(0);
				setState(357);
				match(T__11);
				}
				break;
			case 2:
				{
				_localctx = new MinusFirstMathExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				match(T__25);
				setState(360);
				mathExpr(5);
				}
				break;
			case 3:
				{
				_localctx = new MathValuesExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(361);
				((MathValuesExpressionContext)_localctx).value = mathvalues();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(373);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyDivideExpressionContext(new MathExprContext(_parentctx, _parentState));
						((MultiplyDivideExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(364);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(365);
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
						setState(366);
						((MultiplyDivideExpressionContext)_localctx).rightExpr = mathExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubstractExpressionContext(new MathExprContext(_parentctx, _parentState));
						((AddSubstractExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(367);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(368);
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
						setState(369);
						((AddSubstractExpressionContext)_localctx).rightExpr = mathExpr(4);
						}
						break;
					case 3:
						{
						_localctx = new RestExpressionContext(new MathExprContext(_parentctx, _parentState));
						((RestExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(370);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(371);
						((RestExpressionContext)_localctx).op = match(T__28);
						setState(372);
						((RestExpressionContext)_localctx).rightExpr = mathExpr(3);
						}
						break;
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 38, RULE_mathComparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			((MathComparisonContext)_localctx).identifierLeft = mathExpr(0);
			setState(379);
			((MathComparisonContext)_localctx).lop = match(LOP);
			setState(380);
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
		enterRule(_localctx, 40, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((IfConditionContext)_localctx).first = mathComparison();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				{
				setState(383);
				((IfConditionContext)_localctx).more = ifConditionMore();
				}
				}
				setState(388);
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
		enterRule(_localctx, 42, RULE_ifConditionMore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(389);
			((IfConditionMoreContext)_localctx).andOR = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
				((IfConditionMoreContext)_localctx).andOR = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(390);
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
		enterRule(_localctx, 44, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			((ForConditionContext)_localctx).first = mathComparison();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29 || _la==T__30) {
				{
				{
				setState(393);
				((ForConditionContext)_localctx).more = forConditionMore();
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
		enterRule(_localctx, 46, RULE_forConditionMore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(399);
			((ForConditionMoreContext)_localctx).andOR = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
				((ForConditionMoreContext)_localctx).andOR = (Token)_errHandler.recoverInline(this);
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
		enterRule(_localctx, 48, RULE_methodDeclParams);
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
		enterRule(_localctx, 50, RULE_methodCallParams);
		try {
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
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
		enterRule(_localctx, 52, RULE_intCallParam);
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
		enterRule(_localctx, 54, RULE_stringCallParam);
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
		enterRule(_localctx, 56, RULE_intParam);
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
		enterRule(_localctx, 58, RULE_stringParam);
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
		enterRule(_localctx, 60, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
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
		enterRule(_localctx, 62, RULE_methodType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_nameClass);
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
		enterRule(_localctx, 66, RULE_methodName);
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
		enterRule(_localctx, 68, RULE_variableName);
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
	public static class StringCallMethodContext extends StringvaluesContext {
		public CallMethodExprContext callMethodExpr() {
			return getRuleContext(CallMethodExprContext.class,0);
		}
		public StringCallMethodContext(StringvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStringCallMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStringCallMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStringCallMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringvaluesContext stringvalues() throws RecognitionException {
		StringvaluesContext _localctx = new StringvaluesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_stringvalues);
		try {
			setState(434);
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
			case T__9:
				_localctx = new StringCallMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
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
	public static class IntCallMethodContext extends MathvaluesContext {
		public CallMethodExprContext callMethodExpr() {
			return getRuleContext(CallMethodExprContext.class,0);
		}
		public IntCallMethodContext(MathvaluesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntCallMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntCallMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntCallMethod(this);
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
		enterRule(_localctx, 72, RULE_mathvalues);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new IntvariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				variableName();
				}
				break;
			case INT:
				_localctx = new IntlitteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(INT);
				}
				break;
			case T__23:
				_localctx = new IntreadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				readIntExpr();
				}
				break;
			case T__9:
				_localctx = new IntCallMethodContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
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
		enterRule(_localctx, 74, RULE_opener);
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
		enterRule(_localctx, 76, RULE_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(T__35);
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
		case 18:
			return mathExpr_sempred((MathExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathExpr_sempred(MathExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3/\u01c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\7\2"+
		"U\n\2\f\2\16\2X\13\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\5\2a\n\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\7\4i\n\4\f\4\16\4l\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5u\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0085"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0093\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009f\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00a6\n\t\f\t\16\t\u00a9\13\t\5\t\u00ab\n\t\3\t\3\t\3\t\3\t\7\t\u00b1"+
		"\n\t\f\t\16\t\u00b4\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00be\n\t"+
		"\f\t\16\t\u00c1\13\t\5\t\u00c3\n\t\3\t\3\t\3\t\3\t\7\t\u00c9\n\t\f\t\16"+
		"\t\u00cc\13\t\3\t\3\t\5\t\u00d0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u00da\n\t\f\t\16\t\u00dd\13\t\5\t\u00df\n\t\3\t\3\t\3\t\3\t\7\t\u00e5"+
		"\n\t\f\t\16\t\u00e8\13\t\3\t\3\t\5\t\u00ec\n\t\3\t\3\t\3\t\5\t\u00f1\n"+
		"\t\3\n\3\n\3\n\3\n\7\n\u00f7\n\n\f\n\16\n\u00fa\13\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\7\13\u0103\n\13\f\13\16\13\u0106\13\13\5\13\u0108\n\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u011d\n\f\f\f\16\f\u0120\13\f\3\f\3\f\3\f\3\f\3\f\5\f\u0127"+
		"\n\f\5\f\u0129\n\f\3\r\3\r\3\r\7\r\u012e\n\r\f\r\16\r\u0131\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u0145\n\16\f\16\16\16\u0148\13\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\7\17\u0150\n\17\f\17\16\17\u0153\13\17\3\17\3\17\3\20\3\20\5"+
		"\20\u0159\n\20\3\21\3\21\3\22\3\22\3\23\7\23\u0160\n\23\f\23\16\23\u0163"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u016d\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0178\n\24\f\24\16\24\u017b"+
		"\13\24\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u0183\n\26\f\26\16\26\u0186"+
		"\13\26\3\27\3\27\3\27\3\30\3\30\7\30\u018d\n\30\f\30\16\30\u0190\13\30"+
		"\3\31\3\31\3\31\3\32\3\32\5\32\u0197\n\32\3\33\3\33\5\33\u019b\n\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"#\3#\3$\3$\3%\3%\3%\3%\5%\u01b5\n%\3&\3&\3&\3&\5&\u01bb\n&\3\'\3\'\3("+
		"\3(\3(\2\3&)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLN\2\7\3\2\35\36\4\2\30\30\34\34\3\2 !\3\2\"#\3\2\"$\u01cd"+
		"\2P\3\2\2\2\4e\3\2\2\2\6j\3\2\2\2\bt\3\2\2\2\n\u0084\3\2\2\2\f\u0092\3"+
		"\2\2\2\16\u009e\3\2\2\2\20\u00f0\3\2\2\2\22\u00f2\3\2\2\2\24\u00fe\3\2"+
		"\2\2\26\u010d\3\2\2\2\30\u012a\3\2\2\2\32\u0138\3\2\2\2\34\u014b\3\2\2"+
		"\2\36\u0158\3\2\2\2 \u015a\3\2\2\2\"\u015c\3\2\2\2$\u0161\3\2\2\2&\u016c"+
		"\3\2\2\2(\u017c\3\2\2\2*\u0180\3\2\2\2,\u0187\3\2\2\2.\u018a\3\2\2\2\60"+
		"\u0191\3\2\2\2\62\u0196\3\2\2\2\64\u019a\3\2\2\2\66\u019c\3\2\2\28\u019e"+
		"\3\2\2\2:\u01a0\3\2\2\2<\u01a3\3\2\2\2>\u01a6\3\2\2\2@\u01a8\3\2\2\2B"+
		"\u01aa\3\2\2\2D\u01ac\3\2\2\2F\u01ae\3\2\2\2H\u01b4\3\2\2\2J\u01ba\3\2"+
		"\2\2L\u01bc\3\2\2\2N\u01be\3\2\2\2PQ\7\3\2\2QR\5B\"\2RV\7\4\2\2SU\5\n"+
		"\6\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W`\3\2\2\2XV\3\2\2\2Y[\5\4"+
		"\3\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]a\3\2\2\2^\\\3\2\2\2_a"+
		"\5\6\4\2`\\\3\2\2\2`_\3\2\2\2ab\3\2\2\2bc\5\22\n\2cd\7\5\2\2d\3\3\2\2"+
		"\2ef\5\16\b\2f\5\3\2\2\2gi\5\20\t\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3"+
		"\2\2\2k\7\3\2\2\2lj\3\2\2\2mu\5\26\f\2nu\5\30\r\2ou\5\32\16\2pu\5\34\17"+
		"\2qu\5\16\b\2ru\5\f\7\2su\5\24\13\2tm\3\2\2\2tn\3\2\2\2to\3\2\2\2tp\3"+
		"\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\t\3\2\2\2vw\7\6\2\2wx\7\7\2\2xy"+
		"\5F$\2yz\7\b\2\2z{\5&\24\2{|\7\t\2\2|\u0085\3\2\2\2}~\7\6\2\2~\177\7\n"+
		"\2\2\177\u0080\5F$\2\u0080\u0081\7\b\2\2\u0081\u0082\5H%\2\u0082\u0083"+
		"\7\t\2\2\u0083\u0085\3\2\2\2\u0084v\3\2\2\2\u0084}\3\2\2\2\u0085\13\3"+
		"\2\2\2\u0086\u0087\7\7\2\2\u0087\u0088\5F$\2\u0088\u0089\7\b\2\2\u0089"+
		"\u008a\5&\24\2\u008a\u008b\7\t\2\2\u008b\u0093\3\2\2\2\u008c\u008d\7\n"+
		"\2\2\u008d\u008e\5F$\2\u008e\u008f\7\b\2\2\u008f\u0090\5H%\2\u0090\u0091"+
		"\7\t\2\2\u0091\u0093\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u008c\3\2\2\2\u0093"+
		"\r\3\2\2\2\u0094\u0095\5F$\2\u0095\u0096\7\b\2\2\u0096\u0097\5&\24\2\u0097"+
		"\u0098\7\t\2\2\u0098\u009f\3\2\2\2\u0099\u009a\5F$\2\u009a\u009b\7\b\2"+
		"\2\u009b\u009c\5H%\2\u009c\u009d\7\t\2\2\u009d\u009f\3\2\2\2\u009e\u0094"+
		"\3\2\2\2\u009e\u0099\3\2\2\2\u009f\17\3\2\2\2\u00a0\u00a1\7\13\2\2\u00a1"+
		"\u00aa\7\f\2\2\u00a2\u00a7\5\62\32\2\u00a3\u00a4\7\r\2\2\u00a4\u00a6\5"+
		"\62\32\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00a2\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\16\2\2\u00ad"+
		"\u00ae\5D#\2\u00ae\u00b2\5L\'\2\u00af\u00b1\5\b\5\2\u00b0\u00af\3\2\2"+
		"\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\17\2\2\u00b6\u00b7\5N(\2\u00b7"+
		"\u00f1\3\2\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00c2\7\f\2\2\u00ba\u00bf\5\62"+
		"\32\2\u00bb\u00bc\7\r\2\2\u00bc\u00be\5\62\32\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c3\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\7\16\2\2\u00c5\u00c6\5D#\2\u00c6\u00ca\5L\'"+
		"\2\u00c7\u00c9\5\b\5\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00cf\7\20\2\2\u00ce\u00d0\5&\24\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\5N(\2\u00d3"+
		"\u00f1\3\2\2\2\u00d4\u00d5\7\n\2\2\u00d5\u00de\7\f\2\2\u00d6\u00db\5\62"+
		"\32\2\u00d7\u00d8\7\r\2\2\u00d8\u00da\5\62\32\2\u00d9\u00d7\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\7\16\2\2\u00e1\u00e2\5D#\2\u00e2\u00e6\5L\'"+
		"\2\u00e3\u00e5\5\b\5\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9"+
		"\u00eb\7\20\2\2\u00ea\u00ec\5H%\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\t\2\2\u00ee\u00ef\5N(\2\u00ef\u00f1"+
		"\3\2\2\2\u00f0\u00a0\3\2\2\2\u00f0\u00b8\3\2\2\2\u00f0\u00d4\3\2\2\2\u00f1"+
		"\21\3\2\2\2\u00f2\u00f3\7\13\2\2\u00f3\u00f4\7\21\2\2\u00f4\u00f8\5L\'"+
		"\2\u00f5\u00f7\5\b\5\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fc\7\17\2\2\u00fc\u00fd\5N(\2\u00fd\23\3\2\2\2\u00fe\u0107\7\f\2\2"+
		"\u00ff\u0104\5\64\33\2\u0100\u0101\7\r\2\2\u0101\u0103\5\64\33\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u00ff\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\16\2\2\u010a\u010b\5"+
		"D#\2\u010b\u010c\7\t\2\2\u010c\25\3\2\2\2\u010d\u010e\7\22\2\2\u010e\u010f"+
		"\7\f\2\2\u010f\u0110\5*\26\2\u0110\u0111\7\16\2\2\u0111\u0112\5L\'\2\u0112"+
		"\u0113\5$\23\2\u0113\u0128\5N(\2\u0114\u0115\7\23\2\2\u0115\u0116\7\f"+
		"\2\2\u0116\u0117\5*\26\2\u0117\u0118\7\16\2\2\u0118\u0119\5L\'\2\u0119"+
		"\u011a\5$\23\2\u011a\u011b\5N(\2\u011b\u011d\3\2\2\2\u011c\u0114\3\2\2"+
		"\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0126"+
		"\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7\23\2\2\u0122\u0123\5L\'\2\u0123"+
		"\u0124\5$\23\2\u0124\u0125\5N(\2\u0125\u0127\3\2\2\2\u0126\u0121\3\2\2"+
		"\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u011e\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\27\3\2\2\2\u012a\u012b\7\24\2\2\u012b\u012f\5L\'\2\u012c"+
		"\u012e\5\b\5\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2\2\2\u0132"+
		"\u0133\5N(\2\u0133\u0134\7\25\2\2\u0134\u0135\7\f\2\2\u0135\u0136\5*\26"+
		"\2\u0136\u0137\7\16\2\2\u0137\31\3\2\2\2\u0138\u0139\7\26\2\2\u0139\u013a"+
		"\7\f\2\2\u013a\u013b\5\f\7\2\u013b\u013c\5.\30\2\u013c\u013d\7\t\2\2\u013d"+
		"\u013e\7\'\2\2\u013e\u013f\7\f\2\2\u013f\u0140\5F$\2\u0140\u0141\7\16"+
		"\2\2\u0141\u0142\7\16\2\2\u0142\u0146\5L\'\2\u0143\u0145\5\b\5\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\5N(\2\u014a\33"+
		"\3\2\2\2\u014b\u014c\7\27\2\2\u014c\u0151\5\36\20\2\u014d\u014e\7\30\2"+
		"\2\u014e\u0150\5\36\20\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0154\u0155\7\31\2\2\u0155\35\3\2\2\2\u0156\u0159\5&\24\2\u0157\u0159"+
		"\5H%\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159\37\3\2\2\2\u015a"+
		"\u015b\7\32\2\2\u015b!\3\2\2\2\u015c\u015d\7\33\2\2\u015d#\3\2\2\2\u015e"+
		"\u0160\5\b\5\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162%\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165"+
		"\b\24\1\2\u0165\u0166\7\f\2\2\u0166\u0167\5&\24\2\u0167\u0168\7\16\2\2"+
		"\u0168\u016d\3\2\2\2\u0169\u016a\7\34\2\2\u016a\u016d\5&\24\7\u016b\u016d"+
		"\5J&\2\u016c\u0164\3\2\2\2\u016c\u0169\3\2\2\2\u016c\u016b\3\2\2\2\u016d"+
		"\u0179\3\2\2\2\u016e\u016f\f\6\2\2\u016f\u0170\t\2\2\2\u0170\u0178\5&"+
		"\24\7\u0171\u0172\f\5\2\2\u0172\u0173\t\3\2\2\u0173\u0178\5&\24\6\u0174"+
		"\u0175\f\4\2\2\u0175\u0176\7\37\2\2\u0176\u0178\5&\24\5\u0177\u016e\3"+
		"\2\2\2\u0177\u0171\3\2\2\2\u0177\u0174\3\2\2\2\u0178\u017b\3\2\2\2\u0179"+
		"\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\'\3\2\2\2\u017b\u0179\3\2\2\2"+
		"\u017c\u017d\5&\24\2\u017d\u017e\7)\2\2\u017e\u017f\5&\24\2\u017f)\3\2"+
		"\2\2\u0180\u0184\5(\25\2\u0181\u0183\5,\27\2\u0182\u0181\3\2\2\2\u0183"+
		"\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185+\3\2\2\2"+
		"\u0186\u0184\3\2\2\2\u0187\u0188\t\4\2\2\u0188\u0189\5(\25\2\u0189-\3"+
		"\2\2\2\u018a\u018e\5(\25\2\u018b\u018d\5\60\31\2\u018c\u018b\3\2\2\2\u018d"+
		"\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f/\3\2\2\2"+
		"\u0190\u018e\3\2\2\2\u0191\u0192\t\4\2\2\u0192\u0193\5(\25\2\u0193\61"+
		"\3\2\2\2\u0194\u0197\5:\36\2\u0195\u0197\5<\37\2\u0196\u0194\3\2\2\2\u0196"+
		"\u0195\3\2\2\2\u0197\63\3\2\2\2\u0198\u019b\5\66\34\2\u0199\u019b\58\35"+
		"\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b\65\3\2\2\2\u019c\u019d"+
		"\5&\24\2\u019d\67\3\2\2\2\u019e\u019f\5H%\2\u019f9\3\2\2\2\u01a0\u01a1"+
		"\7\7\2\2\u01a1\u01a2\5F$\2\u01a2;\3\2\2\2\u01a3\u01a4\7\n\2\2\u01a4\u01a5"+
		"\5F$\2\u01a5=\3\2\2\2\u01a6\u01a7\t\5\2\2\u01a7?\3\2\2\2\u01a8\u01a9\t"+
		"\6\2\2\u01a9A\3\2\2\2\u01aa\u01ab\7,\2\2\u01abC\3\2\2\2\u01ac\u01ad\7"+
		"+\2\2\u01adE\3\2\2\2\u01ae\u01af\7+\2\2\u01afG\3\2\2\2\u01b0\u01b5\7-"+
		"\2\2\u01b1\u01b5\5F$\2\u01b2\u01b5\5\"\22\2\u01b3\u01b5\5\24\13\2\u01b4"+
		"\u01b0\3\2\2\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2"+
		"\2\2\u01b5I\3\2\2\2\u01b6\u01bb\5F$\2\u01b7\u01bb\7*\2\2\u01b8\u01bb\5"+
		" \21\2\u01b9\u01bb\5\24\13\2\u01ba\u01b6\3\2\2\2\u01ba\u01b7\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bbK\3\2\2\2\u01bc\u01bd\7%\2\2\u01bd"+
		"M\3\2\2\2\u01be\u01bf\7&\2\2\u01bfO\3\2\2\2*V\\`jt\u0084\u0092\u009e\u00a7"+
		"\u00aa\u00b2\u00bf\u00c2\u00ca\u00cf\u00db\u00de\u00e6\u00eb\u00f0\u00f8"+
		"\u0104\u0107\u011e\u0126\u0128\u012f\u0146\u0151\u0158\u0161\u016c\u0177"+
		"\u0179\u0184\u018e\u0196\u019a\u01b4\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}