package designpattern.patterns.create.factory.abstractFactory;


/**
 * @author fengsy
 * @date 6/28/21
 * @Description
 */
public class JsonConfigParserFactory implements IConfigParserFactory {
    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}