package designpattern.projects.ratelimit.v2.rule;

/**
 * @author fengsy
 * @date 11/18/20
 * @Description
 */

public class TrieRateLimitRule implements RateLimitRule {
    public TrieRateLimitRule(RuleConfig ruleConfig) {
        //...
    }

    @Override
    public ApiLimit getLimit(String appId, String api) {
        //...

        return new ApiLimit();
    }
}
