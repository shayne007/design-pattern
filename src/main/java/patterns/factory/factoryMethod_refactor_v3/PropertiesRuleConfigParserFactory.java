package patterns.factory.factoryMethod_refactor_v3;

import patterns.factory.simpleFactory_bad.IRuleConfigParser;
import patterns.factory.simpleFactory_bad.PropertiesRuleConfigParser;
import patterns.factory.simpleFactory_bad.YamlRuleConfigParser;

/**
 * @author fengsy
 * @date 5/1/20
 * @Description
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
