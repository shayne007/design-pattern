package patterns.create.factory.factoryMethod_refactor_v3;

import patterns.create.factory.simpleFactory_bad.IRuleConfigParser;
import patterns.create.factory.simpleFactory_bad.JsonRuleConfigParser;
import patterns.create.factory.simpleFactory_bad.XmlRuleConfigParser;

/**
 * @author fengsy
 * @date 5/1/20
 * @Description
 */
public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}