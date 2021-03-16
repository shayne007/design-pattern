package designpattern.patterns.structure.decorator;

import java.io.IOException;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */

public abstract class InputStream {
    // ...
    public int read(byte b[]) throws IOException {
        return read(b, 0, b.length);
    }

    public int read(byte b[], int off, int len) throws IOException {
        // ...
        return 0;
    }

    public long skip(long n) throws IOException {
        // ...
        return 0;
    }

    public int available() throws IOException {
        return 0;
    }

    public void close() throws IOException {}

    public synchronized void mark(int readlimit) {}

    public synchronized void reset() throws IOException {
        throw new IOException("mark/reset not supported");
    }

    public boolean markSupported() {
        return false;
    }

    protected abstract int read() throws IOException;

}
