// Generated from D:/school/jaar2/kwartiel3/Compilers&OperatingSystems/Opdracht-1/Compilers-En-Operating-Systems-Opdracht-1/src\Lang.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		IDcrement=25, OP=26, LOP=27, INT=28, STRING=29, WL=30, WS=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "IDcrement", 
		"OP", "LOP", "INT", "STRING", "WL", "WS"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2!\u00cc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00ab"+
		"\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00b9\n\34\3\35\6\35\u00bc\n\35\r\35\16\35\u00bd\3\36\6\36\u00c1\n\36"+
		"\r\36\16\36\u00c2\3\37\3\37\3\37\3\37\3 \3 \3 \3 \2\2!\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\6\5\2,-"+
		"//<<\3\2\62;\4\2C\\c|\4\2\13\f\17\17\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\3A\3\2\2\2\5C\3\2\2\2\7I\3\2\2\2\tM\3\2\2\2\13T\3\2\2\2\rV\3\2\2\2\17"+
		"Y\3\2\2\2\21[\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2"+
		"\33m\3\2\2\2\35p\3\2\2\2\37r\3\2\2\2!y\3\2\2\2#\u0080\3\2\2\2%\u0084\3"+
		"\2\2\2\'\u008b\3\2\2\2)\u008e\3\2\2\2+\u0093\3\2\2\2-\u0097\3\2\2\2/\u009e"+
		"\3\2\2\2\61\u00a0\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac\3\2\2\2\67\u00b8\3"+
		"\2\2\29\u00bb\3\2\2\2;\u00c0\3\2\2\2=\u00c4\3\2\2\2?\u00c8\3\2\2\2AB\7"+
		"%\2\2B\4\3\2\2\2CD\7D\2\2DE\7G\2\2EF\7I\2\2FG\7K\2\2GH\7P\2\2H\6\3\2\2"+
		"\2IJ\7G\2\2JK\7P\2\2KL\7F\2\2L\b\3\2\2\2MN\7i\2\2NO\7n\2\2OP\7q\2\2PQ"+
		"\7d\2\2QR\7c\2\2RS\7n\2\2S\n\3\2\2\2TU\7\u0080\2\2U\f\3\2\2\2VW\7K\2\2"+
		"WX\7U\2\2X\16\3\2\2\2YZ\7=\2\2Z\20\3\2\2\2[\\\7x\2\2\\]\7q\2\2]^\7k\2"+
		"\2^_\7f\2\2_\22\3\2\2\2`a\7*\2\2a\24\3\2\2\2bc\7.\2\2c\26\3\2\2\2de\7"+
		"+\2\2e\30\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7v\2\2ij\7w\2\2jk\7t\2\2kl\7p\2"+
		"\2l\32\3\2\2\2mn\7k\2\2no\7h\2\2o\34\3\2\2\2pq\7A\2\2q\36\3\2\2\2rs\7"+
		"T\2\2st\7G\2\2tu\7R\2\2uv\7G\2\2vw\7C\2\2wx\7V\2\2x \3\2\2\2yz\7W\2\2"+
		"z{\7P\2\2{|\7V\2\2|}\7K\2\2}~\7N\2\2~\177\7N\2\2\177\"\3\2\2\2\u0080\u0081"+
		"\7h\2\2\u0081\u0082\7q\2\2\u0082\u0083\7t\2\2\u0083$\3\2\2\2\u0084\u0085"+
		"\7Y\2\2\u0085\u0086\7T\2\2\u0086\u0087\7K\2\2\u0087\u0088\7V\2\2\u0088"+
		"\u0089\7G\2\2\u0089\u008a\7*\2\2\u008a&\3\2\2\2\u008b\u008c\7+\2\2\u008c"+
		"\u008d\7=\2\2\u008d(\3\2\2\2\u008e\u008f\7T\2\2\u008f\u0090\7G\2\2\u0090"+
		"\u0091\7C\2\2\u0091\u0092\7F\2\2\u0092*\3\2\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096,\3\2\2\2\u0097\u0098\7u\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2"+
		"\u009c\u009d\7i\2\2\u009d.\3\2\2\2\u009e\u009f\7\61\2\2\u009f\60\3\2\2"+
		"\2\u00a0\u00a1\7^\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4"+
		"\7p\2\2\u00a4\u00a5\7e\2\2\u00a5\u00ab\7t\2\2\u00a6\u00a7\7f\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7e\2\2\u00a9\u00ab\7t\2\2\u00aa\u00a2\3\2\2"+
		"\2\u00aa\u00a6\3\2\2\2\u00ab\64\3\2\2\2\u00ac\u00ad\t\2\2\2\u00ad\66\3"+
		"\2\2\2\u00ae\u00b9\7>\2\2\u00af\u00b0\7>\2\2\u00b0\u00b9\7?\2\2\u00b1"+
		"\u00b9\7@\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b9\7?\2\2\u00b4\u00b5\7?\2\2"+
		"\u00b5\u00b9\7?\2\2\u00b6\u00b7\7#\2\2\u00b7\u00b9\7?\2\2\u00b8\u00ae"+
		"\3\2\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8"+
		"\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b98\3\2\2\2\u00ba\u00bc\t\3\2\2"+
		"\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be:\3\2\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3<\3\2\2\2"+
		"\u00c4\u00c5\t\5\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\37\2\2\u00c7>\3"+
		"\2\2\2\u00c8\u00c9\7\"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\b \2\2\u00cb"+
		"@\3\2\2\2\7\2\u00aa\u00b8\u00bd\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}