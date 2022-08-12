package designpattern.projectsInAction.gatedlaunch.v2.rule.parser;


import designpattern.projectsInAction.gatedlaunch.v2.rule.DarkRuleConfig;

import java.io.InputStream;

public interface RuleConfigParser {
    DarkRuleConfig parse(InputStream in);

    DarkRuleConfig parse(String configText);

}
