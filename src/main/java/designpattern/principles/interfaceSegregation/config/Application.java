package designpattern.principles.interfaceSegregation.config;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class Application {
    static ConfigSource configSource = new ZookeeperConfigSource();
    public static final RedisConfig redisConfig = new RedisConfig(configSource);
    public static final KafkaConfig kafkaConfig = new KafkaConfig(configSource);
    public static final MysqlConfig mysqlConfig = new MysqlConfig(configSource);

    public static final ApiMetrics apiMetrix = new ApiMetrics();
    public static final DbMetrics dbMetrix = new DbMetrics();

    public static void main(String[] args) {
        ScheduledUpdater redisConfigUpdater = new ScheduledUpdater(redisConfig, 300, 300);
        redisConfigUpdater.run();

        ScheduledUpdater kafkaConfigUpdater = new ScheduledUpdater(kafkaConfig, 60, 60);
        kafkaConfigUpdater.run();

        SimpleHttpServer simpleHttpServer = new SimpleHttpServer("127.0.0.1", 2389);
        simpleHttpServer.addViewers("/config", redisConfig);
        simpleHttpServer.addViewers("/config", mysqlConfig);

        simpleHttpServer.addViewers("/metrix", apiMetrix);
        simpleHttpServer.addViewers("/metrix", dbMetrix);

        simpleHttpServer.run();
    }
}
