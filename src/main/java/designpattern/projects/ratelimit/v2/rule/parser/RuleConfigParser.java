package designpattern.projects.ratelimit.v2.rule.parser;

import designpattern.projects.ratelimit.v2.rule.RuleConfig;

import java.io.InputStream;

public interface RuleConfigParser {
    RuleConfig parse(InputStream in);
}
