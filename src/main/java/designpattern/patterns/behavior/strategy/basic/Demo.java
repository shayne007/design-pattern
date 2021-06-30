package designpattern.patterns.behavior.strategy.basic;

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
        EvictionStrategy strategy = null;
        Properties props = new Properties();
        props.load(Demo.class.getResourceAsStream("/config.properties"));
        String type = props.getProperty("cache.type");
        strategy = StrategyFactory.getStrategy(type);
        // 运行时动态确定，根据配置文件的配置决定使用哪种策略
        UserCache userCache = new UserCache(strategy);
        userCache.performEviction();
        // 非运行时动态确定，在代码中指定使用哪种策略,
        // 这种方式并不能发挥策略模式的优势,退化成了“面向对象的多态特性”或“基于接口而非实现编程原则”
        UserCache userCache2 = new UserCache(new LruEvictionStrategy());
        userCache2.performEviction();
    }
}
