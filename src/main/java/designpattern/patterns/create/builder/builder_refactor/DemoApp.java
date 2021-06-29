package designpattern.patterns.create.builder.builder_refactor;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */
public class DemoApp {
    public static void main(String[] args) {

        // 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
        ResourcePoolConfig config = new ResourcePoolConfig.Builder()
                .setName("dbconnectionpool")
                .setMaxTotal(16)
                .setMaxIdle(10)
                .setMinIdle(12)
                .build();

    }
}
