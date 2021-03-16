package designpattern.patterns.structure.decorator;

import java.io.IOException;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class BufferedInputStream extends FilterInputStream {
    protected volatile InputStream in;

    protected BufferedInputStream(InputStream in) {
        super(in);
        this.in = in;
    }

    // ...实现基于缓存的读数据接口...
    @Override
    public int read() throws IOException {
        System.out.println("read bufferedinput stream...");
        return 0;
    }

}
