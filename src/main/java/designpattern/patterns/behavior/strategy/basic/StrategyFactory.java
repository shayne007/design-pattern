package designpattern.patterns.behavior.strategy.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengsy
 * @date 3/17/21
 * @Description
 */

public class StrategyFactory {
    private static final Map<String, EvictionStrategy> strategies = new HashMap<>();

    static {
        strategies.put("LRU", new LruEvictionStrategy());
        strategies.put("FIFO", new FifoEvictionStrategy());
    }

    /**
     * 从缓存的策略对象中获取
     *
     * @param type
     * @return
     */
    public static EvictionStrategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }


}
