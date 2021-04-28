package designpattern.patterns.behavior.strategy.basic;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengsy
 * @date 3/17/21
 * @Description
 */

public class StrategyFactory {
    private static final Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("A", new ConcreteStrategyA());
        strategies.put("B", new ConcreteStrategyB());
    }

    /**
     * 从缓存的策略对象中获取
     * 
     * @param type
     * @return
     */
    public static Strategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }

    /**
     * 每次重新创建新的策略对象，适合有状态的策略对象
     * 
     * @param type
     * @return
     */
    public static Strategy getStrategy2(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }

        if (type.equals("A")) {
            return new ConcreteStrategyA();
        } else if (type.equals("B")) {
            return new ConcreteStrategyB();
        }

        return null;
    }
}
