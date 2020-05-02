package patterns.factory.simpleFactory_refactor_v2;

import patterns.factory.simpleFactory_bad.IRuleConfigParser;
import patterns.factory.simpleFactory_bad.JsonRuleConfigParser;
import patterns.factory.simpleFactory_bad.PropertiesRuleConfigParser;
import patterns.factory.simpleFactory_bad.XmlRuleConfigParser;
import patterns.factory.simpleFactory_bad.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengsy
 * @date 5/1/20
 * @Description
 */


public class RuleConfigParserFactory {
    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();

    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
        cachedParsers.put("yaml", new YamlRuleConfigParser());
        cachedParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;//返回null还是IllegalArgumentException全凭你自己说了算
        }
        IRuleConfigParser parser = cachedParsers.get(configFormat.toLowerCase());
        return parser;
    }
}