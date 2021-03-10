package designpattern.projects.ratelimit.v2.rule.datasource;

import designpattern.projects.ratelimit.v2.rule.RuleConfig;

public interface RuleConfigSource {
    public RuleConfig load();
}
