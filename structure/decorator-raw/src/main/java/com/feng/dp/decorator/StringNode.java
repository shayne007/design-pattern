package com.feng.dp.decorator;

import org.htmlparser.util.ParserUtils;
import org.htmlparser.util.Translate;

/**
 * @Description html标签文本内容
 * @Author fengsy
 * @Date 8/21/22
 */
public class StringNode implements Node {
    private StringBuffer textBuffer;
    private int textBegin;
    private int textEnd;
    private boolean shouldDecode = false;
    private boolean shouldRemoveEscapeCharacters = false;

    public StringNode(StringBuffer textBuffer, int textBegin, int textEnd) {
        this.textBuffer = textBuffer;
        this.textBegin = textBegin;
        this.textEnd = textEnd;
    }

    public StringNode(StringBuffer textBuffer, int textBegin, int textEnd, boolean shouldDecode,
        boolean shouldRemoveEscapeCharacters) {
        this(textBuffer, textBegin, textEnd);
        this.shouldDecode = shouldDecode;
        this.shouldRemoveEscapeCharacters = shouldRemoveEscapeCharacters;
    }

    @Override
    public String toPlainTextString() {
        String result = textBuffer.toString();
        if (shouldDecode) {
            result = Translate.decode(result);
        }
        if (shouldRemoveEscapeCharacters) {
            result = ParserUtils.removeEscapeCharacters(result);
        }
        return result;
    }
}
