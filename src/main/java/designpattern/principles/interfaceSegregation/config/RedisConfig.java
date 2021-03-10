package designpattern.principles.interfaceSegregation.config;

import java.util.Map;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */

public class RedisConfig implements Updater, Viewer {
    // 配置中心（比如zookeeper）
    private ConfigSource configSource;
    private String address;
    private int timeout;
    private int maxTotal;
    // 省略其他配置: maxWaitMillis,maxIdle,minIdle...

    public RedisConfig(ConfigSource configSource) {
        this.configSource = configSource;
    }

    public String getAddress() {
        return this.address;
    }

    // ...省略其他get()、init()方法...
    @Override
    public void update() {
        // 从configSource加载配置到address/timeout/maxTotal...
        this.address = configSource.getRedifConfig().getAddress();
    }

    @Override
    public String outputInPlainText() {
        return null;
    }

    @Override
    public Map<String, String> output() {
        return null;
    }
}
