// Generated from java-escape by ANTLR 4.11.1
package com.lqm;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, NEWLINE = 8, WS = 9,
            INT = 10, ANY = 11, OP = 12;
    public static final int
            RULE_prog = 0, RULE_expr = 1, RULE_key = 2, RULE_value = 3, RULE_op = 4;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0001\f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001" +
                    "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003" +
                    "\u0001\u0017\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001c" +
                    "\b\u0001\n\u0001\f\u0001\u001f\t\u0001\u0001\u0002\u0001\u0002\u0001\u0003" +
                    "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003" +
                    "\u0003\u0003*\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003" +
                    "/\b\u0003\n\u0003\f\u00032\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0000\u0002\u0002\u0006\u0005\u0000\u0002\u0004\u0006\b\u0000\u0003\u0001" +
                    "\u0000\u0001\u0002\u0001\u0000\n\u000b\u0002\u0000\u0006\u0007\f\f5\u0000" +
                    "\n\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000\u0000\u0004 " +
                    "\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b3\u0001\u0000" +
                    "\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000" +
                    "\u0001\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0006\u0001\uffff\uffff" +
                    "\u0000\u000e\u000f\u0003\u0004\u0002\u0000\u000f\u0010\u0003\b\u0004\u0000" +
                    "\u0010\u0011\u0003\u0006\u0003\u0000\u0011\u0017\u0001\u0000\u0000\u0000" +
                    "\u0012\u0013\u0005\u0003\u0000\u0000\u0013\u0014\u0003\u0002\u0001\u0000" +
                    "\u0014\u0015\u0005\u0004\u0000\u0000\u0015\u0017\u0001\u0000\u0000\u0000" +
                    "\u0016\r\u0001\u0000\u0000\u0000\u0016\u0012\u0001\u0000\u0000\u0000\u0017" +
                    "\u001d\u0001\u0000\u0000\u0000\u0018\u0019\n\u0002\u0000\u0000\u0019\u001a" +
                    "\u0007\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0003\u001b\u0018" +
                    "\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b" +
                    "\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0003" +
                    "\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0007\u0001" +
                    "\u0000\u0000!\u0005\u0001\u0000\u0000\u0000\"#\u0006\u0003\uffff\uffff" +
                    "\u0000#*\u0005\u000b\u0000\u0000$*\u0005\n\u0000\u0000%&\u0005\u0003\u0000" +
                    "\u0000&\'\u0003\u0006\u0003\u0000\'(\u0005\u0004\u0000\u0000(*\u0001\u0000" +
                    "\u0000\u0000)\"\u0001\u0000\u0000\u0000)$\u0001\u0000\u0000\u0000)%\u0001" +
                    "\u0000\u0000\u0000*0\u0001\u0000\u0000\u0000+,\n\u0001\u0000\u0000,-\u0005" +
                    "\u0005\u0000\u0000-/\u0003\u0006\u0003\u0002.+\u0001\u0000\u0000\u0000" +
                    "/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000" +
                    "\u00001\u0007\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0007" +
                    "\u0002\u0000\u00004\t\u0001\u0000\u0000\u0000\u0004\u0016\u001d)0";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public ExprParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "prog", "expr", "key", "value", "op"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'and'", "'or'", "'('", "')'", "','", "'in'", "'IN'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, "NEWLINE", "WS", "INT",
                "ANY", "OP"
        };
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
    public String getGrammarFileName() {
        return "java-escape";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(10);
                expr(0);
                setState(11);
                match(EOF);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 2;
        enterRecursionRule(_localctx, 2, RULE_expr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(22);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case INT:
                    case ANY: {
                        setState(14);
                        key();
                        setState(15);
                        op();
                        setState(16);
                        value(0);
                    }
                    break;
                    case T__2: {
                        setState(18);
                        match(T__2);
                        setState(19);
                        expr(0);
                        setState(20);
                        match(T__3);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(29);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new ExprContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                setState(24);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(25);
                                _la = _input.LA(1);
                                if (!(_la == T__0 || _la == T__1)) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                                    _errHandler.reportMatch(this);
                                    consume();
                                }
                                setState(26);
                                expr(3);
                            }
                        }
                    }
                    setState(31);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 1, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final KeyContext key() throws RecognitionException {
        KeyContext _localctx = new KeyContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_key);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(32);
                _la = _input.LA(1);
                if (!(_la == INT || _la == ANY)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ValueContext value() throws RecognitionException {
        return value(0);
    }

    private ValueContext value(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ValueContext _localctx = new ValueContext(_ctx, _parentState);
        ValueContext _prevctx = _localctx;
        int _startState = 6;
        enterRecursionRule(_localctx, 6, RULE_value, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(41);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case ANY: {
                        setState(35);
                        match(ANY);
                    }
                    break;
                    case INT: {
                        setState(36);
                        match(INT);
                    }
                    break;
                    case T__2: {
                        setState(37);
                        match(T__2);
                        setState(38);
                        value(0);
                        setState(39);
                        match(T__3);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(48);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new ValueContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_value);
                                setState(43);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                {
                                    setState(44);
                                    match(T__4);
                                }
                                setState(45);
                                value(2);
                            }
                        }
                    }
                    setState(50);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final OpContext op() throws RecognitionException {
        OpContext _localctx = new OpContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_op);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(51);
                _la = _input.LA(1);
                if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 4288L) != 0)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 1:
                return expr_sempred((ExprContext) _localctx, predIndex);
            case 3:
                return value_sempred((ValueContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 2);
        }
        return true;
    }

    private boolean value_sempred(ValueContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 1);
        }
        return true;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ProgContext extends ParserRuleContext {
        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode EOF() {
            return getToken(ExprParser.EOF, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitProg(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public KeyContext key() {
            return getRuleContext(KeyContext.class, 0);
        }

        public OpContext op() {
            return getRuleContext(OpContext.class, 0);
        }

        public ValueContext value() {
            return getRuleContext(ValueContext.class, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitExpr(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class KeyContext extends ParserRuleContext {
        public KeyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ANY() {
            return getToken(ExprParser.ANY, 0);
        }

        public TerminalNode INT() {
            return getToken(ExprParser.INT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_key;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterKey(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitKey(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ValueContext extends ParserRuleContext {
        public ValueContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ANY() {
            return getToken(ExprParser.ANY, 0);
        }

        public TerminalNode INT() {
            return getToken(ExprParser.INT, 0);
        }

        public List<ValueContext> value() {
            return getRuleContexts(ValueContext.class);
        }

        public ValueContext value(int i) {
            return getRuleContext(ValueContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_value;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterValue(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitValue(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OpContext extends ParserRuleContext {
        public OpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode OP() {
            return getToken(ExprParser.OP, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_op;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).enterOp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExprListener) ((ExprListener) listener).exitOp(this);
        }
    }
}