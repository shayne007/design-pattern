package designpattern.patterns.behavior.templateMethod;

import java.io.IOException;

/**
 * @author fengsy
 * @date 6/30/21
 * @Description
 */

public class ByteArrayInputStream extends InputStream {
    //...省略其他代码...

    @Override
    public synchronized int read() {
//        return (pos < count) ? (buf[pos++] & 0xff) : -1;
        return -1;
    }

    @Override
    public void close() throws IOException {

    }
}