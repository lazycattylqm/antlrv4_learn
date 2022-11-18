// Generated from java-escape by ANTLR 4.11.1
package com.lqm;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ExprParser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(ExprParser.ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(ExprParser.ProgContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterExpr(ExprParser.ExprContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitExpr(ExprParser.ExprContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#key}.
     *
     * @param ctx the parse tree
     */
    void enterKey(ExprParser.KeyContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#key}.
     *
     * @param ctx the parse tree
     */
    void exitKey(ExprParser.KeyContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#value}.
     *
     * @param ctx the parse tree
     */
    void enterValue(ExprParser.ValueContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#value}.
     *
     * @param ctx the parse tree
     */
    void exitValue(ExprParser.ValueContext ctx);

    /**
     * Enter a parse tree produced by {@link ExprParser#op}.
     *
     * @param ctx the parse tree
     */
    void enterOp(ExprParser.OpContext ctx);

    /**
     * Exit a parse tree produced by {@link ExprParser#op}.
     *
     * @param ctx the parse tree
     */
    void exitOp(ExprParser.OpContext ctx);
}