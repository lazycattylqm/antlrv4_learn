package com.lqm;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class App {
    public static void main(String[] args) {
        final String s = "a32d in (1a, 2b) and w=2";
        final CodePointCharStream input = CharStreams.fromString(s);
        final ExprLexer exprLexer = new ExprLexer(input);
        final CommonTokenStream token = new CommonTokenStream(exprLexer);
        final ExprParser parser = new ExprParser(token);
        final ExprParser.ProgContext prog = parser.prog();
        final ExprListenerImpl exprListener = new ExprListenerImpl();
        ParseTreeWalker.DEFAULT.walk(exprListener, prog);

    }
}
