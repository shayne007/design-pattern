package designpattern.projects.ratelimit.v1.rule;

/**
 * @author fengsy
 * @date 11/18/20
 * @Description
 */

public class RateLimitRule {
    public RateLimitRule(RuleConfig ruleConfig) {
        //...
    }

    public ApiLimit getLimit(String appId, String api) {
        //...

        return new ApiLimit();
    }
}
