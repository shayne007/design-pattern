package designpattern.patterns.behavior.responsibilityChain.sentitive;

/**
 * @author fengsy
 * @date 7/2/21
 * @Description
 */

public interface SensitiveWordFilter {
    boolean doFilter(Content content);
}