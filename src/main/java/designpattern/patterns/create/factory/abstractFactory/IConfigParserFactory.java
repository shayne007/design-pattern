package designpattern.patterns.create.factory.abstractFactory;


/**
 * @author fengsy
 * @date 6/28/21
 * @Description
 */

public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();

    ISystemConfigParser createSystemParser();
    //此处可以扩展新的parser类型，比如IBizConfigParser
}
