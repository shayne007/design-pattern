package designpattern.patterns.create.builder.builder_refactor;

import org.apache.commons.lang3.StringUtils;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */
public  class ResourcePoolConfigBuilder {

    private static final int DEFAULT_MAX_TOTAL = 8;
    private static final int DEFAULT_MAX_IDLE = 8;
    private static final int DEFAULT_MIN_IDLE = 0;

     String name;
     int maxTotal = DEFAULT_MAX_TOTAL;
     int maxIdle = DEFAULT_MAX_IDLE;
     int minIdle = DEFAULT_MIN_IDLE;

    public ResourcePoolConfig build() {
        // 校验逻辑放到这里来做，包括必填项校验、依赖关系校验、约束条件校验等
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("...");
        }
        if (maxIdle > maxTotal) {
            throw new IllegalArgumentException("...");
        }
        if (minIdle > maxTotal || minIdle > maxIdle) {
            throw new IllegalArgumentException("...");
        }

        return new ResourcePoolConfig(this);
    }

    public ResourcePoolConfigBuilder setName(String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("...");
        }
        this.name = name;
        return this;
    }

    public ResourcePoolConfigBuilder setMaxTotal(int maxTotal) {
        if (maxTotal <= 0) {
            throw new IllegalArgumentException("...");
        }
        this.maxTotal = maxTotal;
        return this;
    }

    public ResourcePoolConfigBuilder setMaxIdle(int maxIdle) {
        if (maxIdle < 0) {
            throw new IllegalArgumentException("...");
        }
        this.maxIdle = maxIdle;
        return this;
    }

    public ResourcePoolConfigBuilder setMinIdle(int minIdle) {
        if (minIdle < 0) {
            throw new IllegalArgumentException("...");
        }
        this.minIdle = minIdle;
        return this;
    }
}