package com.feng.dp.decorator;

/**
 * @Description StringParser
 * @Description StringParser
 * @Author fengsy
 * @Date 8/21/22
 */
public class StringParser {

    StringNode find(String text, boolean shouldDecode, boolean shouldRemoveEscapeCharacters) {
        return new StringNode(new StringBuffer(text), 0, 0, shouldDecode, shouldRemoveEscapeCharacters);
    }
}
