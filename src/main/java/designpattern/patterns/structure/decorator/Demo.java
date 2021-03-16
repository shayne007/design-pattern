package designpattern.patterns.structure.decorator;

import java.io.IOException;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class Demo {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("/user/wangzheng/test.txt");
        InputStream bin = new BufferedInputStream(in);
        DataInputStream din = new DataInputStream(bin);
        int data = din.readInt();
        System.out.println(data);
    }
}
