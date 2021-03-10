package designpattern.principles.interfaceSegregation.config;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class ZookeeperConfigSource implements ConfigSource {
    @Override
    public RedisInfo getRedifConfig() {
        return null;
    }

    @Override
    public KafkaInfo getKafkaConfig() {
        return null;
    }
}
