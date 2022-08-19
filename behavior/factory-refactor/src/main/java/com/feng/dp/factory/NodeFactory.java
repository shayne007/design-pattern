package com.feng.dp.factory;

/**
 * @author mac
 */
public class NodeFactory {
    public boolean shouldDecodeNodes = false;

    public NodeFactory() {}

    public Node createStringNode(StringBuilder textBuffer, int textBegin, int textEnd) {
        if (shouldDecodeNodes) {
            return new DecodingStringNode(new StringNode(textBuffer, textBegin, textEnd));
        }
        return new StringNode(textBuffer, textBegin, textEnd);
    }

    public void setShouldDecodeNodes(boolean shouldDecodeNodes) {
        this.shouldDecodeNodes = shouldDecodeNodes;
    }

}