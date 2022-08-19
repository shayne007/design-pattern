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

    private StringNode(StringBuilder textBuffer, int textBegin, int textEnd) {
        this.textBuffer = textBuffer;
        this.textBegin = textBegin;
        this.textEnd = textEnd;
    }

    public static Node createStringNode(StringBuilder textBuffer, int textBegin, int textEnd, boolean shouldDecode) {
        if (shouldDecode) {
            return new DecodingStringNode(new StringNode(textBuffer, textBegin, textEnd));
        }
        return new StringNode(textBuffer, textBegin, textEnd);
    }
}
