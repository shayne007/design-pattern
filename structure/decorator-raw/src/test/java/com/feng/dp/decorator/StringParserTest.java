package com.feng.dp.decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.htmlparser.util.ParserException;
import org.htmlparser.util.Translate;
import org.junit.jupiter.api.Test;

/**
 * @Description StringParserTest
 * @Author fengsy
 * @Date 8/21/22
 */
public class StringParserTest {
    @Test
    void decoding_ampersand_should_work() throws ParserException {
        String ENCODE_TITLE = "The Testing &amp; Refactoring Workshop\n";
        String DECODE_TITLE = "The Testing & Refactoring Workshop";

        StringBuffer decodedContent = new StringBuffer();

        Parser parser = Parser.createParser(ENCODE_TITLE);
        parser.setNodeDecoding(true);
        parser.setRemoveEscapeCharacters(false);
        NodeIterator nodes = parser.elements();
        while (nodes.hasMoreNodes()) {
            decodedContent.append(Translate.decode(nodes.nextNode().toPlainTextString()));
        }

        assertEquals(DECODE_TITLE, decodedContent.toString(), "decoding test");
    }
}
