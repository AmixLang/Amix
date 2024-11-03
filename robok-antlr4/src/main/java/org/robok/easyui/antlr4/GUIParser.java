// Generated from GUI.g4 by ANTLR 4.13.2
package org.robok.easyui.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GUIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DEFAULT=7, IDENTIFIER=8, 
		IDENTIFIER_COLON=9, STRING=10, NUMBER=11, IDENTIFIER_DOT=12, WS=13, LINE_COMMENT=14, 
		BLOCK_COMMENT=15, HASH_COMMENT=16;
	public static final int
		RULE_guiFile = 0, RULE_attributeDefault = 1, RULE_attributeScope = 2, 
		RULE_component = 3, RULE_argumentList = 4, RULE_argument = 5, RULE_value = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"guiFile", "attributeDefault", "attributeScope", "component", "argumentList", 
			"argument", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "'='", "'default'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "DEFAULT", "IDENTIFIER", "IDENTIFIER_COLON", 
			"STRING", "NUMBER", "IDENTIFIER_DOT", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
			"HASH_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "GUI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GUIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuiFileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GUIParser.EOF, 0); }
		public List<AttributeDefaultContext> attributeDefault() {
			return getRuleContexts(AttributeDefaultContext.class);
		}
		public AttributeDefaultContext attributeDefault(int i) {
			return getRuleContext(AttributeDefaultContext.class,i);
		}
		public List<AttributeScopeContext> attributeScope() {
			return getRuleContexts(AttributeScopeContext.class);
		}
		public AttributeScopeContext attributeScope(int i) {
			return getRuleContext(AttributeScopeContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public GuiFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guiFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterGuiFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitGuiFile(this);
		}
	}

	public final GuiFileContext guiFile() throws RecognitionException {
		GuiFileContext _localctx = new GuiFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_guiFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFAULT || _la==IDENTIFIER) {
				{
				setState(17);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(14);
					attributeDefault();
					}
					break;
				case 2:
					{
					setState(15);
					attributeScope();
					}
					break;
				case 3:
					{
					setState(16);
					component();
					}
					break;
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeDefaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(GUIParser.DEFAULT, 0); }
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public AttributeDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterAttributeDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitAttributeDefault(this);
		}
	}

	public final AttributeDefaultContext attributeDefault() throws RecognitionException {
		AttributeDefaultContext _localctx = new AttributeDefaultContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_attributeDefault);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(DEFAULT);
				setState(25);
				match(T__0);
				setState(26);
				argumentList();
				setState(27);
				match(T__1);
				setState(28);
				match(T__2);
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==IDENTIFIER_COLON) {
					{
					setState(31);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(29);
						component();
						}
						break;
					case 2:
						{
						setState(30);
						argumentList();
						}
						break;
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(DEFAULT);
				setState(39);
				match(T__0);
				setState(40);
				argumentList();
				setState(41);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeScopeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GUIParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(GUIParser.STRING, 0); }
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public AttributeScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterAttributeScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitAttributeScope(this);
		}
	}

	public final AttributeScopeContext attributeScope() throws RecognitionException {
		AttributeScopeContext _localctx = new AttributeScopeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attributeScope);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(IDENTIFIER);
				setState(46);
				match(T__0);
				setState(47);
				match(STRING);
				setState(48);
				match(T__1);
				setState(49);
				match(T__2);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER || _la==IDENTIFIER_COLON) {
					{
					setState(52);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(50);
						component();
						}
						break;
					case 2:
						{
						setState(51);
						argumentList();
						}
						break;
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(IDENTIFIER);
				setState(59);
				match(T__0);
				setState(60);
				match(STRING);
				setState(61);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GUIParser.IDENTIFIER, 0); }
		public List<ArgumentListContext> argumentList() {
			return getRuleContexts(ArgumentListContext.class);
		}
		public ArgumentListContext argumentList(int i) {
			return getRuleContext(ArgumentListContext.class,i);
		}
		public List<ComponentContext> component() {
			return getRuleContexts(ComponentContext.class);
		}
		public ComponentContext component(int i) {
			return getRuleContext(ComponentContext.class,i);
		}
		public List<AttributeDefaultContext> attributeDefault() {
			return getRuleContexts(AttributeDefaultContext.class);
		}
		public AttributeDefaultContext attributeDefault(int i) {
			return getRuleContext(AttributeDefaultContext.class,i);
		}
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitComponent(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_component);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(IDENTIFIER);
				setState(65);
				match(T__0);
				setState(66);
				argumentList();
				setState(67);
				match(T__1);
				setState(68);
				match(T__2);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
					{
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(69);
						component();
						}
						break;
					case 2:
						{
						setState(70);
						attributeDefault();
						}
						break;
					case 3:
						{
						setState(71);
						argumentList();
						}
						break;
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(77);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(IDENTIFIER);
				setState(80);
				match(T__2);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) {
					{
					setState(84);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						setState(81);
						component();
						}
						break;
					case 2:
						{
						setState(82);
						attributeDefault();
						}
						break;
					case 3:
						{
						setState(83);
						argumentList();
						}
						break;
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(T__3);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(IDENTIFIER);
				setState(91);
				match(T__0);
				setState(92);
				argumentList();
				setState(93);
				match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			argument();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(98);
				match(T__4);
				setState(99);
				argument();
				}
				}
				setState(104);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GUIParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFIER_COLON() { return getToken(GUIParser.IDENTIFIER_COLON, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argument);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(IDENTIFIER);
				setState(106);
				match(T__5);
				setState(107);
				value();
				}
				break;
			case IDENTIFIER_COLON:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(IDENTIFIER_COLON);
				setState(109);
				match(T__5);
				setState(110);
				value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GUIParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(GUIParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER_DOT() { return getToken(GUIParser.IDENTIFIER_DOT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GUIListener ) ((GUIListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7168L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0010t\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001#\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00025\b\u0002"+
		"\n\u0002\f\u00028\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002?\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"I\b\u0003\n\u0003\f\u0003L\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003U\b\u0003"+
		"\n\u0003\f\u0003X\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004e\b\u0004\n\u0004\f\u0004h\t\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"p\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000"+
		"\u0002\u0004\u0006\b\n\f\u0000\u0001\u0001\u0000\n\f\u007f\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004>\u0001\u0000"+
		"\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\ba\u0001\u0000\u0000\u0000"+
		"\no\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000e\u0012\u0003"+
		"\u0002\u0001\u0000\u000f\u0012\u0003\u0004\u0002\u0000\u0010\u0012\u0003"+
		"\u0006\u0003\u0000\u0011\u000e\u0001\u0000\u0000\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0015\u0001"+
		"\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014\u0001"+
		"\u0000\u0000\u0000\u0014\u0016\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0005\u0000\u0000\u0001\u0017\u0001\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0005\u0007\u0000\u0000\u0019\u001a\u0005"+
		"\u0001\u0000\u0000\u001a\u001b\u0003\b\u0004\u0000\u001b\u001c\u0005\u0002"+
		"\u0000\u0000\u001c!\u0005\u0003\u0000\u0000\u001d \u0003\u0006\u0003\u0000"+
		"\u001e \u0003\b\u0004\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		"\u001e\u0001\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000$%\u0005\u0004\u0000\u0000%,\u0001\u0000\u0000"+
		"\u0000&\'\u0005\u0007\u0000\u0000\'(\u0005\u0001\u0000\u0000()\u0003\b"+
		"\u0004\u0000)*\u0005\u0002\u0000\u0000*,\u0001\u0000\u0000\u0000+\u0018"+
		"\u0001\u0000\u0000\u0000+&\u0001\u0000\u0000\u0000,\u0003\u0001\u0000"+
		"\u0000\u0000-.\u0005\b\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0005\n"+
		"\u0000\u000001\u0005\u0002\u0000\u000016\u0005\u0003\u0000\u000025\u0003"+
		"\u0006\u0003\u000035\u0003\b\u0004\u000042\u0001\u0000\u0000\u000043\u0001"+
		"\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u00009?\u0005\u0004\u0000\u0000:;\u0005\b\u0000\u0000;<\u0005\u0001\u0000"+
		"\u0000<=\u0005\n\u0000\u0000=?\u0005\u0002\u0000\u0000>-\u0001\u0000\u0000"+
		"\u0000>:\u0001\u0000\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@A\u0005"+
		"\b\u0000\u0000AB\u0005\u0001\u0000\u0000BC\u0003\b\u0004\u0000CD\u0005"+
		"\u0002\u0000\u0000DJ\u0005\u0003\u0000\u0000EI\u0003\u0006\u0003\u0000"+
		"FI\u0003\u0002\u0001\u0000GI\u0003\b\u0004\u0000HE\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000"+
		"\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u0004\u0000\u0000N`\u0001"+
		"\u0000\u0000\u0000OP\u0005\b\u0000\u0000PV\u0005\u0003\u0000\u0000QU\u0003"+
		"\u0006\u0003\u0000RU\u0003\u0002\u0001\u0000SU\u0003\b\u0004\u0000TQ\u0001"+
		"\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000"+
		"UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000"+
		"\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y`\u0005\u0004"+
		"\u0000\u0000Z[\u0005\b\u0000\u0000[\\\u0005\u0001\u0000\u0000\\]\u0003"+
		"\b\u0004\u0000]^\u0005\u0002\u0000\u0000^`\u0001\u0000\u0000\u0000_@\u0001"+
		"\u0000\u0000\u0000_O\u0001\u0000\u0000\u0000_Z\u0001\u0000\u0000\u0000"+
		"`\u0007\u0001\u0000\u0000\u0000af\u0003\n\u0005\u0000bc\u0005\u0005\u0000"+
		"\u0000ce\u0003\n\u0005\u0000db\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000"+
		"\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\t\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\b\u0000\u0000jk\u0005\u0006"+
		"\u0000\u0000kp\u0003\f\u0006\u0000lm\u0005\t\u0000\u0000mn\u0005\u0006"+
		"\u0000\u0000np\u0003\f\u0006\u0000oi\u0001\u0000\u0000\u0000ol\u0001\u0000"+
		"\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qr\u0007\u0000\u0000\u0000"+
		"r\r\u0001\u0000\u0000\u0000\u000f\u0011\u0013\u001f!+46>HJTV_fo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}