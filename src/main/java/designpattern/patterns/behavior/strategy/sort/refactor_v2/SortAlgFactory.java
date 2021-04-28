package designpattern.patterns.behavior.strategy.sort.refactor_v2;

import designpattern.patterns.behavior.strategy.sort.refactor_v1.ConcurrentExternalSort;
import designpattern.patterns.behavior.strategy.sort.refactor_v1.ExternalSort;
import designpattern.patterns.behavior.strategy.sort.refactor_v1.ISortAlg;
import designpattern.patterns.behavior.strategy.sort.refactor_v1.MapReduceSort;
import designpattern.patterns.behavior.strategy.sort.refactor_v1.QuickSort;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengsy
 * @date 3/17/21
 * @Description
 */

public class SortAlgFactory {
    private static final Map<String, ISortAlg> algs = new HashMap<>();

    static {
        algs.put("QuickSort", new QuickSort());
        algs.put("ExternalSort", new ExternalSort());
        algs.put("ConcurrentExternalSort", new ConcurrentExternalSort());
        algs.put("MapReduceSort", new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return algs.get(type);
    }
}

