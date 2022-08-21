package com.feng.dp.decorator;

/**
 * @Description HTML Parser
 * @Author fengsy
 * @Date 8/21/22
 */
public class Parser {
    private boolean hasMoreNodes = true;

    private boolean decoding;

    private boolean removeEscapeCharacters;

    private static String text;

    public static Parser createParser(String encodeText) {
        text = encodeText;
        return new Parser();
    }

    public void setNodeDecoding(boolean shouldDecodeNodes) {
        this.decoding = shouldDecodeNodes;
    }

    public void setRemoveEscapeCharacters(boolean removeEscapeCharacters) {
        this.removeEscapeCharacters = removeEscapeCharacters;
    }

    public NodeIterator elements() {
        return new NodeIterator() {

            @Override
            public boolean hasMoreNodes() {
                return hasMoreNodes;
            }

            @Override
            public Node nextNode() {
                hasMoreNodes = false;
                return new StringNode(new StringBuffer(text), 0, 0, decoding, removeEscapeCharacters);
            }
        };
    }
}
