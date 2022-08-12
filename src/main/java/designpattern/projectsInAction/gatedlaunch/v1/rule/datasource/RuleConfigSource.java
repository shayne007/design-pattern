package designpattern.projectsInAction.gatedlaunch.v1.rule.datasource;

import designpattern.projectsInAction.gatedlaunch.v1.rule.DarkRuleConfig;

public interface RuleConfigSource {
    public DarkRuleConfig load();
}
