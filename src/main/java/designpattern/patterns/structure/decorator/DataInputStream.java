package designpattern.patterns.structure.decorator;

import java.io.IOException;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class DataInputStream extends FilterInputStream {
    protected volatile InputStream in;

    protected DataInputStream(InputStream in) {
        super(in);
        this.in = in;
    }

    // ...实现读取基本类型数据的接口
    @Override
    public int read() throws IOException {
        System.out.println("read datainputstream...");
        return 0;
    }

    public final int readInt() throws IOException {
        int ch1 = in.read();
        return ch1;
    }
}
