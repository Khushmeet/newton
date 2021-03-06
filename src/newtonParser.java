// Generated from newton.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class newtonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DASH=1, COLON=2, CLOSED_PAR=3, BOOLEAN=4, ID=5, NUMBER=6, REAL=7, HEX=8, 
		OCTAL=9, NL=10, COMMENT=11, WS=12, INDENT=13, DEDENT=14;
	public static final int
		RULE_file = 0, RULE_structures = 1, RULE_array = 2, RULE_value = 3, RULE_object = 4, 
		RULE_pair = 5, RULE_data = 6;
	public static final String[] ruleNames = {
		"file", "structures", "array", "value", "object", "pair", "data"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "': '", "'{}'", null, null, null, null, null, null, null, 
		null, "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DASH", "COLON", "CLOSED_PAR", "BOOLEAN", "ID", "NUMBER", "REAL", 
		"HEX", "OCTAL", "NL", "COMMENT", "WS", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "newton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public newtonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public StructuresContext structures() {
			return getRuleContext(StructuresContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			structures();
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

	public static class StructuresContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public StructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitStructures(this);
		}
	}

	public final StructuresContext structures() throws RecognitionException {
		StructuresContext _localctx = new StructuresContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_structures);
		try {
			setState(18);
			switch (_input.LA(1)) {
			case DASH:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				array();
				}
				break;
			case ID:
			case INDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				object();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<TerminalNode> DASH() { return getTokens(newtonParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(newtonParser.DASH, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> INDENT() { return getTokens(newtonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(newtonParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(newtonParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(newtonParser.DEDENT, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(20);
					match(DASH);
					setState(21);
					value();
					setState(23);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(22);
						match(INDENT);
						}
						break;
					}
					setState(26);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(25);
						match(DEDENT);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ValueContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode NL() { return getToken(newtonParser.NL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			data();
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(33);
				match(NL);
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

	public static class ObjectContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(newtonParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(newtonParser.NL, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_object);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(36);
					pair();
					setState(38);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(37);
						match(NL);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(42); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(newtonParser.ID, 0); }
		public TerminalNode COLON() { return getToken(newtonParser.COLON, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public List<TerminalNode> INDENT() { return getTokens(newtonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(newtonParser.INDENT, i);
		}
		public TerminalNode DEDENT() { return getToken(newtonParser.DEDENT, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(44);
				match(INDENT);
				}
			}

			setState(47);
			match(ID);
			setState(48);
			match(COLON);
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(49);
				match(INDENT);
				}
				break;
			}
			setState(52);
			data();
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(53);
				match(DEDENT);
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

	public static class DataContext extends ParserRuleContext {
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	 
		public DataContext() { }
		public void copyFrom(DataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjectValueContext extends DataContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectValueContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitObjectValue(this);
		}
	}
	public static class EmptyObjectContext extends DataContext {
		public TerminalNode CLOSED_PAR() { return getToken(newtonParser.CLOSED_PAR, 0); }
		public EmptyObjectContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterEmptyObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitEmptyObject(this);
		}
	}
	public static class BooleanValueContext extends DataContext {
		public TerminalNode BOOLEAN() { return getToken(newtonParser.BOOLEAN, 0); }
		public BooleanValueContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitBooleanValue(this);
		}
	}
	public static class StringValueContext extends DataContext {
		public TerminalNode ID() { return getToken(newtonParser.ID, 0); }
		public StringValueContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitStringValue(this);
		}
	}
	public static class NumericValueContext extends DataContext {
		public TerminalNode NUMBER() { return getToken(newtonParser.NUMBER, 0); }
		public NumericValueContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterNumericValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitNumericValue(this);
		}
	}
	public static class ArrayValueContext extends DataContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValueContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof newtonListener ) ((newtonListener)listener).exitArrayValue(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_data);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(ID);
				}
				break;
			case 2:
				_localctx = new NumericValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(NUMBER);
				}
				break;
			case 3:
				_localctx = new BooleanValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				match(BOOLEAN);
				}
				break;
			case 4:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				object();
				}
				break;
			case 5:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				array();
				}
				break;
			case 6:
				_localctx = new EmptyObjectContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				match(CLOSED_PAR);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\5\3\25\n\3"+
		"\3\4\3\4\3\4\5\4\32\n\4\3\4\5\4\35\n\4\6\4\37\n\4\r\4\16\4 \3\5\3\5\5"+
		"\5%\n\5\3\6\3\6\5\6)\n\6\6\6+\n\6\r\6\16\6,\3\7\5\7\60\n\7\3\7\3\7\3\7"+
		"\5\7\65\n\7\3\7\3\7\5\79\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bA\n\b\3\b\2\2"+
		"\t\2\4\6\b\n\f\16\2\2J\2\20\3\2\2\2\4\24\3\2\2\2\6\36\3\2\2\2\b\"\3\2"+
		"\2\2\n*\3\2\2\2\f/\3\2\2\2\16@\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\25"+
		"\5\6\4\2\23\25\5\n\6\2\24\22\3\2\2\2\24\23\3\2\2\2\25\5\3\2\2\2\26\27"+
		"\7\3\2\2\27\31\5\b\5\2\30\32\7\17\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\34"+
		"\3\2\2\2\33\35\7\20\2\2\34\33\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\26"+
		"\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\"$\5\16\b\2#%\7"+
		"\f\2\2$#\3\2\2\2$%\3\2\2\2%\t\3\2\2\2&(\5\f\7\2\')\7\f\2\2(\'\3\2\2\2"+
		"()\3\2\2\2)+\3\2\2\2*&\3\2\2\2+,\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\13\3\2\2"+
		"\2.\60\7\17\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\7\2\2\62\64"+
		"\7\4\2\2\63\65\7\17\2\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\668"+
		"\5\16\b\2\679\7\20\2\28\67\3\2\2\289\3\2\2\29\r\3\2\2\2:A\7\7\2\2;A\7"+
		"\b\2\2<A\7\6\2\2=A\5\n\6\2>A\5\6\4\2?A\7\5\2\2@:\3\2\2\2@;\3\2\2\2@<\3"+
		"\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\17\3\2\2\2\r\24\31\34 $(,/\648@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}