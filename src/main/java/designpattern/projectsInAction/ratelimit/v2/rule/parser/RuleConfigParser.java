package designpattern.projectsInAction.ratelimit.v2.rule.parser;

import designpattern.projectsInAction.ratelimit.v2.rule.RuleConfig;

import java.io.InputStream;

public interface RuleConfigParser {
    RuleConfig parse(InputStream in);

    RuleConfig parse(String configText);

}
