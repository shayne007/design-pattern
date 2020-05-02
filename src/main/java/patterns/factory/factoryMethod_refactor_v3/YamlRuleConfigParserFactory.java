package patterns.factory.factoryMethod_refactor_v3;

import patterns.factory.simpleFactory_bad.IRuleConfigParser;
import patterns.factory.simpleFactory_bad.XmlRuleConfigParser;
import patterns.factory.simpleFactory_bad.YamlRuleConfigParser;

/**
 * @author fengsy
 * @date 5/1/20
 * @Description
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
