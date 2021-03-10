package designpattern.patterns.create.factory.simpleFactory_refactor_v2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import designpattern.patterns.create.factory.simpleFactory_bad.IRuleConfigParser;
import designpattern.patterns.create.factory.simpleFactory_bad.JsonRuleConfigParser;
import designpattern.patterns.create.factory.simpleFactory_bad.PropertiesRuleConfigParser;
import designpattern.patterns.create.factory.simpleFactory_bad.XmlRuleConfigParser;
import designpattern.patterns.create.factory.simpleFactory_bad.YamlRuleConfigParser;

/**
 * @author fengsy
 * @date 5/1/20
 * @Description
 */

public class RuleConfigParserFactory {
    private static final Map<String, Supplier<IRuleConfigParser>> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", JsonRuleConfigParser::new);
        cachedParsers.put("xml", XmlRuleConfigParser::new);
        cachedParsers.put("yaml", YamlRuleConfigParser::new);
        cachedParsers.put("properties", PropertiesRuleConfigParser::new);
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            throw new IllegalArgumentException("No parser configuration");
        }
        Supplier<IRuleConfigParser> parser = cachedParsers.get(configFormat);
        if (parser != null) {
            return parser.get();
        }
        throw new IllegalArgumentException("Wrong parser configuration :" + configFormat);
    }
}