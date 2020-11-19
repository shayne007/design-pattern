package projects.ratelimit.v2.rule.parser;

import projects.ratelimit.v2.rule.RuleConfig;

import java.io.InputStream;

public interface RuleConfigParser {
    RuleConfig parse(InputStream in);
}
