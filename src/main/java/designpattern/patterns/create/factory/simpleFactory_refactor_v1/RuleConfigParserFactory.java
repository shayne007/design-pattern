package designpattern.patterns.create.factory.simpleFactory_refactor_v1;

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
    public static IRuleConfigParser createParser(String configFormat){
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return  parser;
    }
}
