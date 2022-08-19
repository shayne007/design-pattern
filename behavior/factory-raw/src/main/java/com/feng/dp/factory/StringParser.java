package com.feng.dp.factory;

/**
 * @Description TODO
 * @Author fengsy
 * @Date 8/19/22
 */
public class StringParser {
    Parser parser;

    public Node find() {
        StringBuilder textBuffer = new StringBuilder();
        int textBegin = 0;
        int textEnd = 0;
        return StringNode.createStringNode(textBuffer, textBegin, textEnd, parser.shouldDecodeNodes());
    }
}
