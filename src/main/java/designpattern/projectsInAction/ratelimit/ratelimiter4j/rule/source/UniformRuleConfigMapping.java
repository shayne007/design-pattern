package designpattern.projectsInAction.ratelimit.ratelimiter4j.rule.source;

import designpattern.projectsInAction.ratelimit.ratelimiter4j.rule.ApiLimit;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author fengsy
 * @date 7/6/21
 * @Description
 */
public class UniformRuleConfigMapping {
    @Getter
    @Setter
    private List<UniformRuleConfig> configs;

    public static class UniformRuleConfig {
        @Getter
        @Setter
        private String appId;
        @Getter
        @Setter
        private List<ApiLimit> limits;

        public UniformRuleConfig() {
        }

        public UniformRuleConfig(String appId, List<ApiLimit> limits) {
            this.appId = appId;
            this.limits = limits;
        }

    }
}
