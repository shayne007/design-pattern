package designpattern.projectsInAction.ratelimit.v2.rule.datasource;

import designpattern.projectsInAction.ratelimit.v2.rule.RuleConfig;

public interface RuleConfigSource {
    public RuleConfig load();
}
