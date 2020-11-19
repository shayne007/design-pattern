package projects.ratelimit.v2.rule.datasource;

import projects.ratelimit.v2.rule.RuleConfig;

public interface RuleConfigSource {
    public RuleConfig load();
}
