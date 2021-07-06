package designpattern.projectsInAction.ratelimit.v2;

import designpattern.projectsInAction.ratelimit.v2.alg.FixedTimeWinRateLimitAlg;
import designpattern.projectsInAction.ratelimit.v2.alg.RateLimitAlg;
import designpattern.projectsInAction.ratelimit.v2.rule.ApiLimit;
import designpattern.projectsInAction.ratelimit.v2.rule.RateLimitRule;
import designpattern.projectsInAction.ratelimit.v2.rule.RuleConfig;
import designpattern.projectsInAction.ratelimit.v2.rule.TrieRateLimitRule;
import designpattern.projectsInAction.ratelimit.v2.rule.datasource.FileRuleConfigSource;
import designpattern.projectsInAction.ratelimit.v2.rule.datasource.RuleConfigSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fengsy
 * @date 11/18/20
 * @Description
 */

public class RateLimiterV2 {
    private static final Logger log = LoggerFactory.getLogger(RateLimiterV2.class);
    // 为每个api在内存中存储限流计数器
    private ConcurrentHashMap<String, RateLimitAlg> counters = new ConcurrentHashMap<>();
    private RateLimitRule rule;

    public RateLimiterV2() {
        //改动主要在这里：调用RuleConfigSource类来实现配置加载
        RuleConfigSource configSource = new FileRuleConfigSource();
        RuleConfig ruleConfig = configSource.load();
        this.rule = new TrieRateLimitRule(ruleConfig);
    }


    public boolean limit(String appId, String url) throws FixedTimeWinRateLimitAlg.InternalErrorException {
        ApiLimit apiLimit = rule.getLimit(appId, url);
        if (apiLimit == null) {
            return true;
        }

        // 获取api对应在内存中的限流计数器（rateLimitCounter）
        String counterKey = appId + ":" + apiLimit.getApi();
        RateLimitAlg rateLimitCounter = counters.get(counterKey);
        if (rateLimitCounter == null) {
            FixedTimeWinRateLimitAlg newRateLimitCounter = new FixedTimeWinRateLimitAlg(apiLimit.getLimit());
            rateLimitCounter = counters.putIfAbsent(counterKey, newRateLimitCounter);
            if (rateLimitCounter == null) {
                rateLimitCounter = newRateLimitCounter;
            }
        }

        // 判断是否限流
        return rateLimitCounter.tryAcquire();
    }
}