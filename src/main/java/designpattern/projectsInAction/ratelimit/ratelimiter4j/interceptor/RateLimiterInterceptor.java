package designpattern.projectsInAction.ratelimit.ratelimiter4j.interceptor;

import designpattern.projectsInAction.ratelimit.ratelimiter4j.rule.ApiLimit;

/**
 * @author fengsy
 * @date 7/6/21
 * @Description
 */
public interface RateLimiterInterceptor {
    void beforeLimit(String appId, String api);

    /**
     * @param appId
     * @param api
     * @param apiLimit
     * @param result
     * @param ex
     */
    void afterLimit(String appId, String api, ApiLimit apiLimit, boolean result, Exception ex);
}
