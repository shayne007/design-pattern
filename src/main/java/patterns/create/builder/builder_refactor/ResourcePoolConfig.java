package patterns.create.builder.builder_refactor;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */

public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

     ResourcePoolConfig(ResourcePoolConfigBuilder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }


}

