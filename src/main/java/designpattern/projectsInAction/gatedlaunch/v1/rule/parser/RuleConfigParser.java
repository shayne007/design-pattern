package designpattern.projectsInAction.gatedlaunch.v1.rule.parser;


import designpattern.projectsInAction.gatedlaunch.v1.rule.DarkRuleConfig;

import java.io.InputStream;

public interface RuleConfigParser {
    DarkRuleConfig parse(InputStream in);

    DarkRuleConfig parse(String configText);

}
