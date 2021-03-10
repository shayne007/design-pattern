package designpattern.principles.interfaceSegregation.config;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public interface ConfigSource {
    RedisInfo getRedifConfig();

    KafkaInfo getKafkaConfig();
}

class RedisInfo {
    String getAddress() {
        return "";
    }
}

class KafkaInfo {
    String getAddress() {
        return "";
    }
}