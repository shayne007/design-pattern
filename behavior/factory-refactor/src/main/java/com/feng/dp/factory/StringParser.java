package com.feng.dp.factory;

/**
 * @Description TODO
 * @Author fengsy
 * @Date 8/19/22
 */
public class StringParser {
    Parser parser;
    StringBuilder textBuffer = new StringBuilder();
    int textBegin = 0;
    int textEnd = 0;

    public Node find() {
        return parser.getNodeFactory().createStringNode(textBuffer, textBegin, textEnd);
    }
}
