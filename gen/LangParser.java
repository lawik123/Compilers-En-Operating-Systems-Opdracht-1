// Generated from D:/school/jaar2/kwartiel3/Compilers&OperatingSystems/Opdracht-1/Compilers-En-Operating-Systems-Opdracht-1\Lang.g4 by ANTLR 4.6
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
		T__24=25, T__25=26, T__26=27, IDcrement=28, OP=29, LOP=30, INT=31, STRING=32, 
		STRINGVALUE=33, WL=34, WS=35;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_varDecl = 2, RULE_varMod = 3, 
		RULE_methodDecl = 4, RULE_ifExpr = 5, RULE_whileExpr = 6, RULE_forExpr = 7, 
		RULE_writeExpr = 8, RULE_readExpr = 9, RULE_mathExpr = 10, RULE_condition = 11, 
		RULE_dataType = 12, RULE_voidType = 13, RULE_methodName = 14, RULE_variableName = 15, 
		RULE_variable = 16, RULE_opener = 17, RULE_closer = 18, RULE_returnvalues = 19;
	public static final String[] ruleNames = {
		"prog", "expression", "varDecl", "varMod", "methodDecl", "ifExpr", "whileExpr", 
		"forExpr", "writeExpr", "readExpr", "mathExpr", "condition", "dataType", 
		"voidType", "methodName", "variableName", "variable", "opener", "closer", 
		"returnvalues"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'BEGIN'", "'END'", "'global'", "'~'", "'IS'", "';'", "'('", 
		"','", "')'", "'return'", "'if'", "'?'", "'REPEAT'", "'UNTILL'", "'for'", 
		"'WRITE('", "'+'", "');'", "'READ'", "'-'", "'*'", "'/'", "'int'", "'string'", 
		"'void'", "'\\'", null, null, null, null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "IDcrement", "OP", "LOP", "INT", "STRING", "STRINGVALUE", 
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
			setState(40);
			match(T__0);
			setState(41);
			match(STRING);
			setState(42);
			match(T__1);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(43);
				expression();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public ForExprContext forExpr() {
			return getRuleContext(ForExprContext.class,0);
		}
		public WriteExprContext writeExpr() {
			return getRuleContext(WriteExprContext.class,0);
		}
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				methodDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				ifExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				whileExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				forExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				writeExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				readExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(58);
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

	public static class VarDeclContext extends ParserRuleContext {
		public DataTypeContext type;
		public VariableNameContext identifier;
		public VariableContext value;
		public ReadExprContext value2;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(61);
				match(T__3);
				}
			}

			setState(64);
			match(T__4);
			setState(65);
			((VarDeclContext)_localctx).type = dataType();
			setState(66);
			((VarDeclContext)_localctx).identifier = variableName();
			setState(67);
			match(T__5);
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGVALUE:
				{
				setState(68);
				((VarDeclContext)_localctx).value = variable();
				}
				break;
			case T__19:
				{
				setState(69);
				((VarDeclContext)_localctx).value2 = readExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(72);
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

	public static class VarModContext extends ParserRuleContext {
		public VariableNameContext identifier;
		public VariableContext value;
		public ReadExprContext value2;
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ReadExprContext readExpr() {
			return getRuleContext(ReadExprContext.class,0);
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
		enterRule(_localctx, 6, RULE_varMod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			((VarModContext)_localctx).identifier = variableName();
			setState(75);
			match(T__5);
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRINGVALUE:
				{
				setState(76);
				((VarModContext)_localctx).value = variable();
				}
				break;
			case T__19:
				{
				setState(77);
				((VarModContext)_localctx).value2 = readExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(80);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public VoidTypeContext voidreturntype;
		public DataTypeContext returntype;
		public ReturnvaluesContext returnvalue;
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
		}
		public VoidTypeContext voidType() {
			return getRuleContext(VoidTypeContext.class,0);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ReturnvaluesContext returnvalues() {
			return getRuleContext(ReturnvaluesContext.class,0);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
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
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__4);
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(83);
				((MethodDeclContext)_localctx).voidreturntype = voidType();
				}
				break;
			case T__23:
			case T__24:
				{
				setState(84);
				((MethodDeclContext)_localctx).returntype = dataType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
			match(T__7);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				{
				setState(88);
				match(T__4);
				setState(89);
				dataType();
				setState(90);
				variableName();
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(92);
					match(T__8);
					setState(93);
					match(T__4);
					setState(94);
					dataType();
					setState(95);
					variableName();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(104);
			match(T__9);
			setState(105);
			methodName();
			setState(106);
			opener();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(107);
				expression();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__10);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==STRING) {
				{
				setState(114);
				((MethodDeclContext)_localctx).returnvalue = returnvalues();
				}
			}

			setState(117);
			match(T__6);
			setState(118);
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

	public static class IfExprContext extends ParserRuleContext {
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__11);
			setState(121);
			match(T__7);
			setState(122);
			condition();
			setState(123);
			match(T__9);
			setState(124);
			opener();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(125);
				expression();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			closer();
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						match(T__12);
						setState(133);
						match(T__7);
						setState(134);
						condition();
						setState(135);
						match(T__9);
						setState(136);
						opener();
						setState(140);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << INT) | (1L << STRING))) != 0)) {
							{
							{
							setState(137);
							expression();
							}
							}
							setState(142);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(143);
						closer();
						}
						} 
					}
					setState(149);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(150);
					match(T__12);
					setState(151);
					opener();
					setState(155);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << INT) | (1L << STRING))) != 0)) {
						{
						{
						setState(152);
						expression();
						}
						}
						setState(157);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(158);
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

	public static class WhileExprContext extends ParserRuleContext {
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWhileExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__13);
			setState(165);
			opener();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(166);
				expression();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(172);
			closer();
			setState(173);
			match(T__14);
			setState(174);
			match(T__7);
			setState(175);
			condition();
			setState(176);
			match(T__9);
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

	public static class ForExprContext extends ParserRuleContext {
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterForExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitForExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitForExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__15);
			setState(179);
			match(T__7);
			setState(180);
			varDecl();
			setState(181);
			condition();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(182);
				match(T__6);
				setState(183);
				match(IDcrement);
				setState(184);
				match(T__7);
				setState(185);
				variableName();
				setState(186);
				match(T__9);
				}
			}

			setState(190);
			match(T__9);
			setState(191);
			opener();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				{
				setState(192);
				expression();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
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
		public List<TerminalNode> STRING() { return getTokens(LangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LangParser.STRING, i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
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
		enterRule(_localctx, 16, RULE_writeExpr);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(T__16);
				setState(201);
				match(STRING);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				variableName();
				setState(211);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__17 || _la==STRING) {
						{
						setState(206);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__17:
							{
							setState(203);
							match(T__17);
							setState(204);
							match(STRING);
							}
							break;
						case STRING:
							{
							setState(205);
							variableName();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(213);
				match(T__18);
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
		enterRule(_localctx, 18, RULE_readExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
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
	public static class CompareExpressionContext extends MathExprContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CompareExpressionContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCompareExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCompareExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCompareExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLitteralExpressionContext extends MathExprContext {
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public IntLitteralExpressionContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntLitteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntLitteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntLitteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusFirstExpressionContext extends MathExprContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public MinusFirstExpressionContext(MathExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMinusFirstExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMinusFirstExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMinusFirstExpression(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_mathExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(220);
				match(T__7);
				setState(221);
				mathExpr(0);
				setState(222);
				match(T__9);
				}
				break;
			case 2:
				{
				_localctx = new MinusFirstExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(T__20);
				setState(225);
				mathExpr(5);
				}
				break;
			case 3:
				{
				_localctx = new CompareExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				condition();
				}
				break;
			case 4:
				{
				_localctx = new IntLitteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(INT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyDivideExpressionContext(new MathExprContext(_parentctx, _parentState));
						((MultiplyDivideExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(230);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(231);
						((MultiplyDivideExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
							((MultiplyDivideExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						((MultiplyDivideExpressionContext)_localctx).rightExpr = mathExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new AddSubstractExpressionContext(new MathExprContext(_parentctx, _parentState));
						((AddSubstractExpressionContext)_localctx).leftExpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_mathExpr);
						setState(233);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(234);
						((AddSubstractExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__20) ) {
							((AddSubstractExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						((AddSubstractExpressionContext)_localctx).rightExpr = mathExpr(4);
						}
						break;
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public VariableNameContext identifierLeft;
		public Token lop;
		public VariableNameContext identifierRight;
		public TerminalNode LOP() { return getToken(LangParser.LOP, 0); }
		public List<TerminalNode> INT() { return getTokens(LangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LangParser.INT, i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
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
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(241);
				((ConditionContext)_localctx).identifierLeft = variableName();
				}
				break;
			case INT:
				{
				setState(242);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			((ConditionContext)_localctx).lop = match(LOP);
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(246);
				((ConditionContext)_localctx).identifierRight = variableName();
				}
				break;
			case INT:
				{
				setState(247);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 24, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
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

	public static class VoidTypeContext extends ParserRuleContext {
		public VoidTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVoidType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVoidType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVoidType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidTypeContext voidType() throws RecognitionException {
		VoidTypeContext _localctx = new VoidTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_voidType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__25);
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
		enterRule(_localctx, 28, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
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
		enterRule(_localctx, 30, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode STRINGVALUE() { return getToken(LangParser.STRINGVALUE, 0); }
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRINGVALUE) ) {
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
		enterRule(_localctx, 34, RULE_opener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
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
		enterRule(_localctx, 36, RULE_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
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

	public static class ReturnvaluesContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
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
		enterRule(_localctx, 38, RULE_returnvalues);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				variableName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(STRING);
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
		case 10:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u0110\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\5\4A\n\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5Q\n\5\3\5\3\5\3"+
		"\6\3\6\3\6\5\6X\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6d\n\6\f"+
		"\6\16\6g\13\6\5\6i\n\6\3\6\3\6\3\6\3\6\7\6o\n\6\f\6\16\6r\13\6\3\6\3\6"+
		"\5\6v\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0081\n\7\f\7\16\7\u0084"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\3"+
		"\7\3\7\7\7\u0094\n\7\f\7\16\7\u0097\13\7\3\7\3\7\3\7\7\7\u009c\n\7\f\7"+
		"\16\7\u009f\13\7\3\7\3\7\5\7\u00a3\n\7\5\7\u00a5\n\7\3\b\3\b\3\b\7\b\u00aa"+
		"\n\b\f\b\16\b\u00ad\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00bf\n\t\3\t\3\t\3\t\7\t\u00c4\n\t\f\t\16\t\u00c7"+
		"\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d1\n\n\f\n\16\n\u00d4\13"+
		"\n\5\n\u00d6\n\n\3\n\3\n\5\n\u00da\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00e7\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ef\n\f\f\f"+
		"\16\f\u00f2\13\f\3\r\3\r\5\r\u00f6\n\r\3\r\3\r\3\r\5\r\u00fb\n\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\5\25\u010e\n\25\3\25\2\3\26\26\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(\2\6\3\2\30\31\4\2\24\24\27\27\3\2\32\33\4\2!!##\u0121"+
		"\2*\3\2\2\2\4=\3\2\2\2\6@\3\2\2\2\bL\3\2\2\2\nT\3\2\2\2\fz\3\2\2\2\16"+
		"\u00a6\3\2\2\2\20\u00b4\3\2\2\2\22\u00d9\3\2\2\2\24\u00db\3\2\2\2\26\u00e6"+
		"\3\2\2\2\30\u00f5\3\2\2\2\32\u00fc\3\2\2\2\34\u00fe\3\2\2\2\36\u0100\3"+
		"\2\2\2 \u0102\3\2\2\2\"\u0104\3\2\2\2$\u0106\3\2\2\2&\u0108\3\2\2\2(\u010d"+
		"\3\2\2\2*+\7\3\2\2+,\7\"\2\2,\60\7\4\2\2-/\5\4\3\2.-\3\2\2\2/\62\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\5\2\2"+
		"\64\3\3\2\2\2\65>\5\6\4\2\66>\5\n\6\2\67>\5\f\7\28>\5\16\b\29>\5\20\t"+
		"\2:>\5\22\n\2;>\5\24\13\2<>\5\26\f\2=\65\3\2\2\2=\66\3\2\2\2=\67\3\2\2"+
		"\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2=<\3\2\2\2>\5\3\2\2\2?A\7\6"+
		"\2\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\7\2\2CD\5\32\16\2DE\5 \21\2EH\7"+
		"\b\2\2FI\5\"\22\2GI\5\24\13\2HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\7\t\2\2"+
		"K\7\3\2\2\2LM\5 \21\2MP\7\b\2\2NQ\5\"\22\2OQ\5\24\13\2PN\3\2\2\2PO\3\2"+
		"\2\2QR\3\2\2\2RS\7\t\2\2S\t\3\2\2\2TW\7\7\2\2UX\5\34\17\2VX\5\32\16\2"+
		"WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2Yh\7\n\2\2Z[\7\7\2\2[\\\5\32\16\2\\]\5 "+
		"\21\2]e\3\2\2\2^_\7\13\2\2_`\7\7\2\2`a\5\32\16\2ab\5 \21\2bd\3\2\2\2c"+
		"^\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hZ\3\2\2\2"+
		"hi\3\2\2\2ij\3\2\2\2jk\7\f\2\2kl\5\36\20\2lp\5$\23\2mo\5\4\3\2nm\3\2\2"+
		"\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2su\7\r\2\2tv\5(\25"+
		"\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\t\2\2xy\5&\24\2y\13\3\2\2\2z{\7\16"+
		"\2\2{|\7\n\2\2|}\5\30\r\2}~\7\f\2\2~\u0082\5$\23\2\177\u0081\5\4\3\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u00a4\5&\24\2\u0086\u0087"+
		"\7\17\2\2\u0087\u0088\7\n\2\2\u0088\u0089\5\30\r\2\u0089\u008a\7\f\2\2"+
		"\u008a\u008e\5$\23\2\u008b\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d\u0090"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\5&\24\2\u0092\u0094\3\2\2\2\u0093\u0086\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u00a2\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\17\2\2\u0099\u009d\5"+
		"$\23\2\u009a\u009c\5\4\3\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2"+
		"\2\2\u00a0\u00a1\5&\24\2\u00a1\u00a3\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\r\3\2\2\2\u00a6\u00a7\7\20\2\2\u00a7\u00ab\5$\23\2\u00a8\u00aa"+
		"\5\4\3\2\u00a9\u00a8\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\5&"+
		"\24\2\u00af\u00b0\7\21\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b2\5\30\r\2\u00b2"+
		"\u00b3\7\f\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\7\n\2"+
		"\2\u00b6\u00b7\5\6\4\2\u00b7\u00be\5\30\r\2\u00b8\u00b9\7\t\2\2\u00b9"+
		"\u00ba\7\36\2\2\u00ba\u00bb\7\n\2\2\u00bb\u00bc\5 \21\2\u00bc\u00bd\7"+
		"\f\2\2\u00bd\u00bf\3\2\2\2\u00be\u00b8\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\7\f\2\2\u00c1\u00c5\5$\23\2\u00c2\u00c4\5\4"+
		"\3\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5&"+
		"\24\2\u00c9\21\3\2\2\2\u00ca\u00cb\7\23\2\2\u00cb\u00da\7\"\2\2\u00cc"+
		"\u00d5\5 \21\2\u00cd\u00ce\7\24\2\2\u00ce\u00d1\7\"\2\2\u00cf\u00d1\5"+
		" \21\2\u00d0\u00cd\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\7\25\2\2\u00d8\u00da\3\2\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00cc\3"+
		"\2\2\2\u00da\23\3\2\2\2\u00db\u00dc\7\26\2\2\u00dc\25\3\2\2\2\u00dd\u00de"+
		"\b\f\1\2\u00de\u00df\7\n\2\2\u00df\u00e0\5\26\f\2\u00e0\u00e1\7\f\2\2"+
		"\u00e1\u00e7\3\2\2\2\u00e2\u00e3\7\27\2\2\u00e3\u00e7\5\26\f\7\u00e4\u00e7"+
		"\5\30\r\2\u00e5\u00e7\7!\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e2\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00f0\3\2\2\2\u00e8\u00e9\f\6"+
		"\2\2\u00e9\u00ea\t\2\2\2\u00ea\u00ef\5\26\f\7\u00eb\u00ec\f\5\2\2\u00ec"+
		"\u00ed\t\3\2\2\u00ed\u00ef\5\26\f\6\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\27\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\5 \21\2\u00f4\u00f6\7!\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fa"+
		"\7 \2\2\u00f8\u00fb\5 \21\2\u00f9\u00fb\7!\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\t\4\2\2\u00fd\33\3\2\2\2\u00fe"+
		"\u00ff\7\34\2\2\u00ff\35\3\2\2\2\u0100\u0101\7\"\2\2\u0101\37\3\2\2\2"+
		"\u0102\u0103\7\"\2\2\u0103!\3\2\2\2\u0104\u0105\t\5\2\2\u0105#\3\2\2\2"+
		"\u0106\u0107\7\31\2\2\u0107%\3\2\2\2\u0108\u0109\7\35\2\2\u0109\'\3\2"+
		"\2\2\u010a\u010e\5 \21\2\u010b\u010e\7!\2\2\u010c\u010e\7\"\2\2\u010d"+
		"\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e)\3\2\2\2"+
		"\37\60=@HPWehpu\u0082\u008e\u0095\u009d\u00a2\u00a4\u00ab\u00be\u00c5"+
		"\u00d0\u00d2\u00d5\u00d9\u00e6\u00ee\u00f0\u00f5\u00fa\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}