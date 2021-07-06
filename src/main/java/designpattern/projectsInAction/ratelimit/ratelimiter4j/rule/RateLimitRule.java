package designpattern.projectsInAction.ratelimit.ratelimiter4j.rule;

import designpattern.projectsInAction.ratelimit.ratelimiter4j.rule.source.UniformRuleConfigMapping;

import java.util.List;

/**
 * @author fengsy
 * @date 7/6/21
 * @Description
 */
public interface RateLimitRule {
    /**
     * get limit info for one url
     *
     * @param appId
     * @param api
     * @return
     */
    ApiLimit getLimit(String appId, String api);

    /**
     * add a limit for one app
     *
     * @param api
     * @param apiLimit
     */
    void addLimit(String api, ApiLimit apiLimit);

    /**
     * add limits for one app
     *
     * @param api
     * @param limits
     */
    void addLimits(String api, List<ApiLimit> limits);

    /**
     * override old rule
     *
     * @param uniformRuleConfigMapping
     */
    void rebuildRule(UniformRuleConfigMapping uniformRuleConfigMapping);

    /**
     * add new rules to thr existing rule
     *
     * @param uniformRuleConfigMapping
     */
    void addRule(UniformRuleConfigMapping uniformRuleConfigMapping);
}
