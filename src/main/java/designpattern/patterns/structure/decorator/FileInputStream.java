package designpattern.patterns.structure.decorator;

import java.io.IOException;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class FileInputStream extends InputStream {
    FileInputStream(String file) {}

    @Override
    protected int read() throws IOException {
        System.out.println("read file...");
        return 0;
    }

}
