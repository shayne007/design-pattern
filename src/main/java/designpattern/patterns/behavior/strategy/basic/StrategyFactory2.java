package designpattern.patterns.behavior.strategy.basic;

/**
 * @author fengsy
 * @date 6/30/21
 * @Description
 */

public class StrategyFactory2 {
    /**
     * 每次重新创建新的策略对象，适合有状态的策略对象
     *
     * @param type
     * @return
     */
    public static EvictionStrategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        if (type.equals("LRU")) {
            return new LruEvictionStrategy();
        } else if (type.equals("FIFO")) {
            return new FifoEvictionStrategy();
        }

        return null;
    }
}