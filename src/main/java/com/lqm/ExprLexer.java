// Generated from java-escape by ANTLR 4.11.1
package com.lqm;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, NEWLINE = 8, WS = 9,
            INT = 10, ANY = 11, OP = 12;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\u0004\u0000\fR\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
                    "\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003" +
                    "\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006" +
                    "\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007.\b\u0007\u000b\u0007" +
                    "\f\u0007/\u0001\u0007\u0001\u0007\u0001\b\u0004\b5\b\b\u000b\b\f\b6\u0001" +
                    "\b\u0001\b\u0001\t\u0004\t<\b\t\u000b\t\f\t=\u0001\n\u0004\nA\b\n\u000b" +
                    "\n\f\nB\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001" +
                    "\u000b\u0003\u000bQ\b\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005" +
                    "\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n" +
                    "\u0015\u000b\u0017\f\u0001\u0000\u0005\u0003\u0000\t\n\r\r\'\'\u0003\u0000" +
                    "\t\n\r\r  \u0001\u000009\u0003\u000009AZaz\u0003\u0000*+--//[\u0000\u0001" +
                    "\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005" +
                    "\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001" +
                    "\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000" +
                    "\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000" +
                    "\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000" +
                    "\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000" +
                    "\u0000\u0000\u0003\u001d\u0001\u0000\u0000\u0000\u0005 \u0001\u0000\u0000" +
                    "\u0000\u0007\"\u0001\u0000\u0000\u0000\t$\u0001\u0000\u0000\u0000\u000b" +
                    "&\u0001\u0000\u0000\u0000\r)\u0001\u0000\u0000\u0000\u000f-\u0001\u0000" +
                    "\u0000\u0000\u00114\u0001\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000" +
                    "\u0015@\u0001\u0000\u0000\u0000\u0017P\u0001\u0000\u0000\u0000\u0019\u001a" +
                    "\u0005a\u0000\u0000\u001a\u001b\u0005n\u0000\u0000\u001b\u001c\u0005d" +
                    "\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005o\u0000" +
                    "\u0000\u001e\u001f\u0005r\u0000\u0000\u001f\u0004\u0001\u0000\u0000\u0000" +
                    " !\u0005(\u0000\u0000!\u0006\u0001\u0000\u0000\u0000\"#\u0005)\u0000\u0000" +
                    "#\b\u0001\u0000\u0000\u0000$%\u0005,\u0000\u0000%\n\u0001\u0000\u0000" +
                    "\u0000&\'\u0005i\u0000\u0000\'(\u0005n\u0000\u0000(\f\u0001\u0000\u0000" +
                    "\u0000)*\u0005I\u0000\u0000*+\u0005N\u0000\u0000+\u000e\u0001\u0000\u0000" +
                    "\u0000,.\u0007\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000" +
                    "\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001" +
                    "\u0000\u0000\u000012\u0006\u0007\u0000\u00002\u0010\u0001\u0000\u0000" +
                    "\u000035\u0007\u0001\u0000\u000043\u0001\u0000\u0000\u000056\u0001\u0000" +
                    "\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0001" +
                    "\u0000\u0000\u000089\u0006\b\u0000\u00009\u0012\u0001\u0000\u0000\u0000" +
                    ":<\u0007\u0002\u0000\u0000;:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000" +
                    "\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>\u0014\u0001" +
                    "\u0000\u0000\u0000?A\u0007\u0003\u0000\u0000@?\u0001\u0000\u0000\u0000" +
                    "AB\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000" +
                    "\u0000C\u0016\u0001\u0000\u0000\u0000DQ\u0007\u0004\u0000\u0000EF\u0005" +
                    ">\u0000\u0000FQ\u0005=\u0000\u0000GQ\u0002<>\u0000HI\u0005<\u0000\u0000" +
                    "IQ\u0005=\u0000\u0000JK\u0005<\u0000\u0000KQ\u0005>\u0000\u0000LM\u0005" +
                    "i\u0000\u0000MQ\u0005n\u0000\u0000NO\u0005I\u0000\u0000OQ\u0005N\u0000" +
                    "\u0000PD\u0001\u0000\u0000\u0000PE\u0001\u0000\u0000\u0000PG\u0001\u0000" +
                    "\u0000\u0000PH\u0001\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000PL\u0001" +
                    "\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000Q\u0018\u0001\u0000\u0000" +
                    "\u0000\u0006\u0000/6=BP\u0001\u0006\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

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

    public ExprLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NEWLINE", "WS",
                "INT", "ANY", "OP"
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
        return "Expr.g4";
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}