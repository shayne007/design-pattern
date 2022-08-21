package com.feng.dp.decorator;

import org.htmlparser.util.ParserException;

/**
 * @Description NodeIterator
 * @Author fengsy
 * @Date 8/21/22
 */
public interface NodeIterator {

    boolean hasMoreNodes() throws ParserException;

    Node nextNode() throws ParserException;
}
