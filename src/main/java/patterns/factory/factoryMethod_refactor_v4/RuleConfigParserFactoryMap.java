package patterns.factory.factoryMethod_refactor_v4;

import patterns.factory.factoryMethod_refactor_v3.IRuleConfigParserFactory;
import patterns.factory.factoryMethod_refactor_v3.JsonRuleConfigParserFactory;
import patterns.factory.factoryMethod_refactor_v3.PropertiesRuleConfigParserFactory;
import patterns.factory.factoryMethod_refactor_v3.XmlRuleConfigParserFactory;
import patterns.factory.factoryMethod_refactor_v3.YamlRuleConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengsy
 * @date 5/1/20
 * @Description
 */

//因为工厂类只包含方法，不包含成员变量，完全可以复用，
// 不需要每次都创建新的工厂类对象，所以，简单工厂模式的第二种实现思路更加合适。
public class RuleConfigParserFactoryMap { //工厂的工厂
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
        cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
        cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        IRuleConfigParserFactory parserFactory = cachedFactories.get(type.toLowerCase());
        return parserFactory;
    }
}