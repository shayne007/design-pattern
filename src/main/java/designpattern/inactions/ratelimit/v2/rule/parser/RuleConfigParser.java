package designpattern.inactions.ratelimit.v2.rule.parser;

import designpattern.inactions.ratelimit.v2.rule.RuleConfig;

import java.io.InputStream;

public interface RuleConfigParser {
    RuleConfig parse(InputStream in);
}
