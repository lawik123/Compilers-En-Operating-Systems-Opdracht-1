// Generated from D:/school/jaar2/kwartiel3/Compilers&OperatingSystems/Opdracht-1/Compilers-En-Operating-Systems-Opdracht-1/src\Lang.g4 by ANTLR 4.6
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
		IDcrement=25, OP=26, LOP=27, INT=28, STRING=29, WL=30, WS=31;
	public static final int
		RULE_prog = 0, RULE_expression = 1, RULE_varDecl = 2, RULE_methodDecl = 3, 
		RULE_ifExpr = 4, RULE_whileExpr = 5, RULE_forExpr = 6, RULE_writeExpr = 7, 
		RULE_readExpr = 8, RULE_condition = 9, RULE_dataType = 10, RULE_methodName = 11, 
		RULE_variableName = 12, RULE_variable = 13, RULE_opener = 14, RULE_closer = 15;
	public static final String[] ruleNames = {
		"prog", "expression", "varDecl", "methodDecl", "ifExpr", "whileExpr", 
		"forExpr", "writeExpr", "readExpr", "condition", "dataType", "methodName", 
		"variableName", "variable", "opener", "closer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#'", "'BEGIN'", "'END'", "'global'", "'~'", "'IS'", "';'", "'void'", 
		"'('", "','", "')'", "'return'", "'if'", "'?'", "'REPEAT'", "'UNTILL'", 
		"'for'", "'WRITE('", "');'", "'READ'", "'int'", "'string'", "'/'", "'\\'", 
		null, null, null, null, null, null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "IDcrement", "OP", "LOP", "INT", "STRING", "WL", "WS"
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
			setState(32);
			match(T__0);
			setState(33);
			match(STRING);
			setState(34);
			match(T__1);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19))) != 0)) {
				{
				{
				setState(35);
				expression();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
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
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				methodDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				ifExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				whileExpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				forExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				writeExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(49);
				readExpr();
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(52);
				match(T__3);
				}
			}

			setState(55);
			match(T__4);
			setState(56);
			dataType();
			setState(57);
			variableName();
			setState(58);
			match(T__5);
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
				{
				setState(59);
				variable();
				}
				break;
			case T__19:
				{
				setState(60);
				readExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(63);
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
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public OpenerContext opener() {
			return getRuleContext(OpenerContext.class,0);
		}
		public CloserContext closer() {
			return getRuleContext(CloserContext.class,0);
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
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__4);
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(66);
				match(T__7);
				}
				break;
			case T__20:
			case T__21:
				{
				setState(67);
				dataType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			match(T__8);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				{
				setState(71);
				match(T__4);
				setState(72);
				dataType();
				setState(73);
				variableName();
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(75);
					match(T__9);
					setState(76);
					match(T__4);
					setState(77);
					dataType();
					setState(78);
					variableName();
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(87);
			match(T__10);
			setState(88);
			methodName();
			setState(89);
			opener();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19))) != 0)) {
				{
				{
				setState(90);
				expression();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
			match(T__11);
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(97);
				variableName();
				}
				break;
			case 2:
				{
				setState(98);
				match(INT);
				}
				break;
			case 3:
				{
				setState(99);
				match(STRING);
				}
				break;
			}
			setState(102);
			match(T__6);
			setState(103);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__12);
			setState(106);
			match(T__8);
			setState(107);
			condition();
			setState(108);
			match(T__10);
			setState(109);
			opener();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19))) != 0)) {
				{
				{
				setState(110);
				expression();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			closer();
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(117);
						match(T__13);
						setState(118);
						match(T__8);
						setState(119);
						condition();
						setState(120);
						match(T__10);
						setState(121);
						opener();
						setState(125);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19))) != 0)) {
							{
							{
							setState(122);
							expression();
							}
							}
							setState(127);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(128);
						closer();
						}
						} 
					}
					setState(134);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(135);
					match(T__13);
					setState(136);
					opener();
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19))) != 0)) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__14);
			setState(150);
			opener();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__12) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << T__19))) != 0)) {
				{
				{
				setState(151);
				expression();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			closer();
			setState(158);
			match(T__15);
			setState(159);
			match(T__8);
			setState(160);
			condition();
			setState(161);
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
		public TerminalNode IDcrement() { return getToken(LangParser.IDcrement, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ForExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitForExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExprContext forExpr() throws RecognitionException {
		ForExprContext _localctx = new ForExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_forExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__16);
			setState(164);
			match(T__8);
			setState(165);
			varDecl();
			setState(166);
			condition();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(167);
				match(T__6);
				setState(168);
				match(IDcrement);
				setState(169);
				match(T__8);
				setState(170);
				variable();
				setState(171);
				match(T__10);
				}
			}

			setState(175);
			match(T__10);
			setState(176);
			opener();
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
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public WriteExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWriteExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteExprContext writeExpr() throws RecognitionException {
		WriteExprContext _localctx = new WriteExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_writeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(T__17);
			setState(179);
			match(STRING);
			setState(180);
			match(T__18);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReadExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadExprContext readExpr() throws RecognitionException {
		ReadExprContext _localctx = new ReadExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_readExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode LOP() { return getToken(LangParser.LOP, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(LangParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LangParser.INT, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(184);
				variableName();
				}
				break;
			case INT:
				{
				setState(185);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(188);
			match(LOP);
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(189);
				variableName();
				}
				break;
			case INT:
				{
				setState(190);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==STRING) ) {
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitOpener(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenerContext opener() throws RecognitionException {
		OpenerContext _localctx = new OpenerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opener);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCloser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloserContext closer() throws RecognitionException {
		CloserContext _localctx = new CloserContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_closer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00d0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\65\n\3\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\5\5G\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5S\n\5\f\5\16"+
		"\5V\13\5\5\5X\n\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3\5\3\5\3\5"+
		"\3\5\5\5g\n\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081\13\6\3\6\3\6\7"+
		"\6\u0085\n\6\f\6\16\6\u0088\13\6\3\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090"+
		"\13\6\3\6\3\6\5\6\u0094\n\6\5\6\u0096\n\6\3\7\3\7\3\7\7\7\u009b\n\7\f"+
		"\7\16\7\u009e\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u00b0\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\5\13\u00bd\n\13\3\13\3\13\3\13\5\13\u00c2\n\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\4\3\2\27\30\3\2\36\37\u00d9\2\"\3\2\2\2\4\64\3\2\2"+
		"\2\6\67\3\2\2\2\bC\3\2\2\2\nk\3\2\2\2\f\u0097\3\2\2\2\16\u00a5\3\2\2\2"+
		"\20\u00b4\3\2\2\2\22\u00b8\3\2\2\2\24\u00bc\3\2\2\2\26\u00c3\3\2\2\2\30"+
		"\u00c5\3\2\2\2\32\u00c7\3\2\2\2\34\u00c9\3\2\2\2\36\u00cb\3\2\2\2 \u00cd"+
		"\3\2\2\2\"#\7\3\2\2#$\7\37\2\2$(\7\4\2\2%\'\5\4\3\2&%\3\2\2\2\'*\3\2\2"+
		"\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\5\2\2,\3\3\2\2\2-\65\5"+
		"\6\4\2.\65\5\b\5\2/\65\5\n\6\2\60\65\5\f\7\2\61\65\5\16\b\2\62\65\5\20"+
		"\t\2\63\65\5\22\n\2\64-\3\2\2\2\64.\3\2\2\2\64/\3\2\2\2\64\60\3\2\2\2"+
		"\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\668\7\6\2\2\67"+
		"\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\7\2\2:;\5\26\f\2;<\5\32\16\2<?\7"+
		"\b\2\2=@\5\34\17\2>@\5\22\n\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2AB\7\t\2\2"+
		"B\7\3\2\2\2CF\7\7\2\2DG\7\n\2\2EG\5\26\f\2FD\3\2\2\2FE\3\2\2\2GH\3\2\2"+
		"\2HW\7\13\2\2IJ\7\7\2\2JK\5\26\f\2KL\5\32\16\2LT\3\2\2\2MN\7\f\2\2NO\7"+
		"\7\2\2OP\5\26\f\2PQ\5\32\16\2QS\3\2\2\2RM\3\2\2\2SV\3\2\2\2TR\3\2\2\2"+
		"TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WI\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\r\2\2"+
		"Z[\5\30\r\2[_\5\36\20\2\\^\5\4\3\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3"+
		"\2\2\2`b\3\2\2\2a_\3\2\2\2bf\7\16\2\2cg\5\32\16\2dg\7\36\2\2eg\7\37\2"+
		"\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\t\2\2ij\5 \21"+
		"\2j\t\3\2\2\2kl\7\17\2\2lm\7\13\2\2mn\5\24\13\2no\7\r\2\2os\5\36\20\2"+
		"pr\5\4\3\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2"+
		"v\u0095\5 \21\2wx\7\20\2\2xy\7\13\2\2yz\5\24\13\2z{\7\r\2\2{\177\5\36"+
		"\20\2|~\5\4\3\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5 \21\2\u0083\u0085"+
		"\3\2\2\2\u0084w\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0093\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\20"+
		"\2\2\u008a\u008e\5\36\20\2\u008b\u008d\5\4\3\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0092\5 \21\2\u0092\u0094\3\2\2\2\u0093"+
		"\u0089\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0086\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\13\3\2\2\2\u0097\u0098\7\21\2\2\u0098\u009c"+
		"\5\36\20\2\u0099\u009b\5\4\3\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2"+
		"\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a0\5 \21\2\u00a0\u00a1\7\22\2\2\u00a1\u00a2\7\13\2\2"+
		"\u00a2\u00a3\5\24\13\2\u00a3\u00a4\7\r\2\2\u00a4\r\3\2\2\2\u00a5\u00a6"+
		"\7\23\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8\5\6\4\2\u00a8\u00af\5\24\13"+
		"\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ac\7\13\2\2\u00ac"+
		"\u00ad\5\34\17\2\u00ad\u00ae\7\r\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a9\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7\r\2\2\u00b2"+
		"\u00b3\5\36\20\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\7\37"+
		"\2\2\u00b6\u00b7\7\25\2\2\u00b7\21\3\2\2\2\u00b8\u00b9\7\26\2\2\u00b9"+
		"\23\3\2\2\2\u00ba\u00bd\5\32\16\2\u00bb\u00bd\7\36\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\7\35\2\2\u00bf"+
		"\u00c2\5\32\16\2\u00c0\u00c2\7\36\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\25\3\2\2\2\u00c3\u00c4\t\2\2\2\u00c4\27\3\2\2\2\u00c5\u00c6"+
		"\7\37\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\7\37\2\2\u00c8\33\3\2\2\2\u00c9"+
		"\u00ca\t\3\2\2\u00ca\35\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc\37\3\2\2\2"+
		"\u00cd\u00ce\7\32\2\2\u00ce!\3\2\2\2\25(\64\67?FTW_fs\177\u0086\u008e"+
		"\u0093\u0095\u009c\u00af\u00bc\u00c1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}