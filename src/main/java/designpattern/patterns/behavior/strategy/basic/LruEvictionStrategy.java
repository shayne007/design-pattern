package designpattern.patterns.behavior.strategy.basic;

/**
 * @author fengsy
 * @date 3/17/21
 * @Description
 */
public class LruEvictionStrategy implements EvictionStrategy {
    @Override
    public void algorithmInterface() {
        // 具体的算法...
        System.out.println("execute lru cache eviction strategy...");
    }
}