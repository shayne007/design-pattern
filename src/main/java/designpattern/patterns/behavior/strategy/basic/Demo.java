package designpattern.patterns.behavior.strategy.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 运行时动态确定，根据配置文件的配置决定使用哪种策略
 * 
 * @author fengsy
 * @date 3/17/21
 * @Description
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        Strategy strategy = null;
        Properties props = new Properties();
        props.load(new FileInputStream("./config.properties"));
        String type = props.getProperty("type");
        strategy = StrategyFactory.getStrategy(type);
        UserCache userCache = new UserCache(strategy);
    }
}
