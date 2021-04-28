package designpattern.patterns.behavior.strategy.basic;

/**
 * @author fengsy
 * @date 3/17/21
 * @Description
 */
public class UserCache {
    private Strategy strategy;

    public UserCache(Strategy strategy) {
        this.strategy = strategy;
    }
}
