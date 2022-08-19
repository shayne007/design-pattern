package com.feng.dp.factory;

/**
 * @Description TODO
 * @Author fengsy
 * @Date 8/19/22
 */
public class StringNode extends Node {
    private StringBuilder textBuffer;
    private int textBegin;
    private int textEnd;

    public StringNode(StringBuilder textBuffer, int textBegin, int textEnd) {
        this.textBuffer = textBuffer;
        this.textBegin = textBegin;
        this.textEnd = textEnd;
    }

}
