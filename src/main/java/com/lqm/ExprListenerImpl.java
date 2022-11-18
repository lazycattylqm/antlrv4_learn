package com.lqm;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ExprListenerImpl implements ExprListener {

    @Override
    public void enterProg(ExprParser.ProgContext ctx) {

    }

    @Override
    public void exitProg(ExprParser.ProgContext ctx) {

    }

    @Override
    public void enterExpr(ExprParser.ExprContext ctx) {
        System.out.println("expr is " + ctx.getText());
    }

    @Override
    public void exitExpr(ExprParser.ExprContext ctx) {

    }

    @Override
    public void enterKey(ExprParser.KeyContext ctx) {
        System.out.println("key is " + ctx.getText());
    }

    @Override
    public void exitKey(ExprParser.KeyContext ctx) {

    }

    @Override
    public void enterValue(ExprParser.ValueContext ctx) {
        if (ctx.children.size() == 1) {
            System.out.println("value is " + ctx.getText());
        }

    }

    @Override
    public void exitValue(ExprParser.ValueContext ctx) {

    }

    @Override
    public void enterOp(ExprParser.OpContext ctx) {
        System.out.println("op is " + ctx.getText());
    }

    @Override
    public void exitOp(ExprParser.OpContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
