package designpattern.patterns.behavior.responsibilityChain.sentitive;

/**
 * @author fengsy
 * @date 7/2/21
 * @Description
 */
public class PoliticalWordFilter implements SensitiveWordFilter {
    @Override
    public boolean doFilter(Content content) {
        boolean legal = true;
        //...
        return legal;
    }
}