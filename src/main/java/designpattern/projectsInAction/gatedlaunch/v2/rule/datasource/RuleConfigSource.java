package designpattern.projectsInAction.gatedlaunch.v2.rule.datasource;


import designpattern.projectsInAction.gatedlaunch.v2.rule.DarkRuleConfig;

public interface RuleConfigSource {
    public DarkRuleConfig load();
}
