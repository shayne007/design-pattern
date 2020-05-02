package patterns.create.builder.builder_bad;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        // 参数太多，导致可读性差、参数可能传递错误
        new ResourcePoolConfig("",11,11,11);


        // ResourcePoolConfigV2使用举例
        ResourcePoolConfigV2 config = new ResourcePoolConfigV2("dbconnectionpool");
        config.setMaxTotal(16);
        config.setMaxIdle(8);

    }
}
