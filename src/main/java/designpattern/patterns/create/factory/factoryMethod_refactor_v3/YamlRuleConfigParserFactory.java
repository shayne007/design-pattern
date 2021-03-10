package designpattern.patterns.create.factory.factoryMethod_refactor_v3;

import designpattern.patterns.create.factory.simpleFactory_bad.IRuleConfigParser;
import designpattern.patterns.create.factory.simpleFactory_bad.YamlRuleConfigParser;

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
