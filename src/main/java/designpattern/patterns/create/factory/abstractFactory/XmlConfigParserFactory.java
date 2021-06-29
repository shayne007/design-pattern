package designpattern.patterns.create.factory.abstractFactory;


/**
 * @author fengsy
 * @date 6/28/21
 * @Description
 */
public class XmlConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
