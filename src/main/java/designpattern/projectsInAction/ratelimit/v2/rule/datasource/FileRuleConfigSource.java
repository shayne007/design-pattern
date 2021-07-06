package designpattern.projectsInAction.ratelimit.v2.rule.datasource;

import designpattern.projectsInAction.ratelimit.v2.rule.RuleConfig;
import designpattern.projectsInAction.ratelimit.v2.rule.parser.JsonRuleConfigParser;
import designpattern.projectsInAction.ratelimit.v2.rule.parser.RuleConfigParser;
import designpattern.projectsInAction.ratelimit.v2.rule.parser.YamlRuleConfigParser;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * 从本地文件读取配置
 *
 * @author fengsy
 * @date 11/19/20
 * @Description
 */
public class FileRuleConfigSource implements RuleConfigSource {
    private static final Logger log = LoggerFactory.getLogger(FileRuleConfigSource.class);

    public static final String API_LIMIT_CONFIG_NAME = "ratelimiter-rule";
    private String configName;
    public static final String YAML_EXTENSION = "yaml";
    public static final String YML_EXTENSION = "yml";
    public static final String JSON_EXTENSION = "json";


    private static final String[] SUPPORT_EXTENSIONS = new String[]{YAML_EXTENSION, YML_EXTENSION, JSON_EXTENSION};

    private static final Map<String, RuleConfigParser> PARSER_MAP = new HashMap<>();

    static {
        PARSER_MAP.put(YAML_EXTENSION, new YamlRuleConfigParser());
        PARSER_MAP.put(YML_EXTENSION, new YamlRuleConfigParser());
        PARSER_MAP.put(JSON_EXTENSION, new JsonRuleConfigParser());
    }

    FileRuleConfigSource(String customConfigName) {
        configName = customConfigName;
    }

    @Override
    public RuleConfig load() {
        for (String extension : SUPPORT_EXTENSIONS) {
            InputStream in = null;
            try {
                in = this.getClass().getResourceAsStream("/" + getFileNameByExt(extension));
                if (in == null) {
                    continue;
                }
                RuleConfigParser parser = PARSER_MAP.get(extension);
                return parser.parse(in);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        log.error("close file error:{}", e);
                    }
                }
            }
        }
        return null;
    }

    private String getFileNameByExt(String extension) {
        return StringUtils.isEmpty(configName) ? API_LIMIT_CONFIG_NAME : configName + "." + extension;
    }
}
