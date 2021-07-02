package designpattern.inactions.ratelimit.v2.rule.datasource;

import designpattern.inactions.ratelimit.v2.rule.RuleConfig;

public interface RuleConfigSource {
    public RuleConfig load();
}
