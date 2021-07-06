package designpattern.projectsInAction.ratelimit.v1.rule;

/**
 * 有了RuleConfig，为什么还要 RateLimitRule 类呢？这是因为，限流过程中会频繁地查询接口对应的限流规则，
 * 为了尽可能地提高查询速度，我们需要将限流规则组织成一种支持按照 URL 快速查询的数据结构。考虑到 URL
 * 的重复度比较高，且需要按照前缀来匹配，我们这里选择使用 Trie 树这种数据结构。
 *
 * @author fengsy
 * @date 11/18/20
 * @Description
 */

public class RateLimitRule {
    private RuleConfig ruleConfig;

    public RateLimitRule(RuleConfig ruleConfig) {
        this.ruleConfig = ruleConfig;
    }

    public ApiLimit getLimit(String appId, String api) {
        return ruleConfig.getConfigs().stream()
                .filter(config -> config.getAppId().equals(appId)).findFirst().get()
                .getLimits().stream().filter(a -> a.getApi().equals(api)).findFirst().get();

    }
}
