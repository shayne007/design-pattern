package com.feng.dp.factory;

/**
 * @Description TODO
 * @Author fengsy
 * @Date 8/19/22
 */
public class Parser {

    public NodeFactory nodeFactory = new NodeFactory();

    public NodeFactory getNodeFactory() {
        return nodeFactory;
    }

    public void setNodeFactory(NodeFactory nodeFactory) {
        this.nodeFactory = nodeFactory;
    }
}
