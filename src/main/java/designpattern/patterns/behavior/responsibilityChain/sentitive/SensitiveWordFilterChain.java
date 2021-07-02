package designpattern.patterns.behavior.responsibilityChain.sentitive;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 7/2/21
 * @Description
 */

public class SensitiveWordFilterChain {
    private List<SensitiveWordFilter> filters = new ArrayList<>();

    public void addFilter(SensitiveWordFilter filter) {
        this.filters.add(filter);
    }

    // return true if content doesn't contain sensitive words.
    public boolean filter(Content content) {
        for (SensitiveWordFilter filter : filters) {
            if (!filter.doFilter(content)) {
                return false;
            }
        }
        return true;
    }
}