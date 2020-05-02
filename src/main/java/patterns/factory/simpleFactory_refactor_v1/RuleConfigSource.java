package patterns.factory.simpleFactory_refactor_v1;

import patterns.factory.simpleFactory_bad.IRuleConfigParser;
import patterns.factory.simpleFactory_bad.InvalidRuleConfigException;
import patterns.factory.simpleFactory_bad.JsonRuleConfigParser;
import patterns.factory.simpleFactory_bad.PropertiesRuleConfigParser;
import patterns.factory.simpleFactory_bad.RuleConfig;
import patterns.factory.simpleFactory_bad.XmlRuleConfigParser;
import patterns.factory.simpleFactory_bad.YamlRuleConfigParser;

/**
 * @author fengsy
 * @date 5/1/20
 * @Description Simple Factory pattern demo
 *
 */

public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) throws InvalidRuleConfigException {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension );
        if (parser == null) {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }


    private String getFileExtension(String filePath) {
        //...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}