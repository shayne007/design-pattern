package patterns.singleton;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author fengsy
 * @date 4/20/20
 * @Description
 */
public class SingleLogger {
    private Logger logger = new Logger();

    public SingleLogger() throws IOException {
    }

    public void login(String username, String password) throws IOException {
        // ...省略业务逻辑代码...
        logger.log(username + " logined!");
    }

}

 class Logger {
    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("log/log.txt");
        //true表示追加写入
        writer = new FileWriter(file, true);
    }

    public void log(String message) throws IOException {
        writer.write(message);
    }
}
