package designpattern.projectsInAction.gatedlaunch.v1.rule.parser;

import designpattern.projectsInAction.gatedlaunch.v1.rule.DarkRuleConfig;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author fengsy
 * @date 11/19/20
 * @Description
 */
@Slf4j
public class YamlRuleConfigParser implements RuleConfigParser {
    @Override
    public DarkRuleConfig parse(InputStream in) {
        DarkRuleConfig ruleConfig = null;
        try {
            if (in != null) {
                Yaml yaml = new Yaml();
                ruleConfig = yaml.loadAs(in, DarkRuleConfig.class);
            }
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    log.error("close file error:{}", e);
                }
            }
        }

        return ruleConfig;
    }

    @Override
    public DarkRuleConfig parse(String yamlText) {
        if (StringUtils.isEmpty(yamlText)) {
            return null;
        }

        Yaml yaml = new Yaml();
        try {
            return yaml.loadAs(yamlText, DarkRuleConfig.class);
        } catch (Exception e) {
            log.error("parse yaml failed.", e);
            return null;
        }

    }
}
