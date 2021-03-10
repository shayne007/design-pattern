package designpattern.patterns.create.factory.simpleFactory_bad;

import org.springframework.stereotype.Component;

/**
 * @author fengsy
 * @date 5/1/20
 * @Description
 */
@Component("XmlRuleConfigParser")
public class XmlRuleConfigParser implements IRuleConfigParser {
    @Override
    public RuleConfig parse(String text) {
        return null;
    }
}
