package designpattern.patterns.behavior.strategy.basic;

/**
 * @author fengsy
 * @date 3/17/21
 * @Description
 */
public class UserCache {
    private EvictionStrategy strategy;

    public UserCache(EvictionStrategy strategy) {
        this.strategy = strategy;
    }

    public void performEviction() {
        this.strategy.algorithmInterface();
    }
}
