package designpattern.projectsInAction.gatedlaunch.v2;

import designpattern.projectsInAction.gatedlaunch.v1.rule.DarkRuleConfig;
import designpattern.projectsInAction.gatedlaunch.v1.rule.datasource.FileRuleConfigSource;
import designpattern.projectsInAction.gatedlaunch.v1.rule.datasource.RuleConfigSource;
import designpattern.projectsInAction.gatedlaunch.v2.rule.DarkFeature;
import designpattern.projectsInAction.gatedlaunch.v2.rule.DarkRule;
import designpattern.projectsInAction.gatedlaunch.v2.rule.IDarkFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */

public class DarkLaunch {
    private static final Logger log = LoggerFactory.getLogger(DarkLaunch.class);
    private static final int DEFAULT_RULE_UPDATE_TIME_INTERVAL = 60; // in seconds
    private DarkRule rule = new DarkRule();
    private ScheduledExecutorService executor;

    public DarkLaunch(int ruleUpdateTimeInterval) {
        RuleConfigSource configSource = new FileRuleConfigSource();
        DarkRuleConfig ruleConfig = configSource.load();
        // 修改：单独更新从配置文件中得到的灰度规则，不覆盖编程实现的灰度规则
        Map<String, IDarkFeature> darkFeatures = new HashMap<>();
        List<DarkRuleConfig.DarkFeatureConfig> darkFeatureConfigs = ruleConfig.getFeatures();
        for (DarkRuleConfig.DarkFeatureConfig darkFeatureConfig : darkFeatureConfigs) {
            darkFeatures.put(darkFeatureConfig.getKey(), new DarkFeature(darkFeatureConfig));
        }
        this.rule.setDarkFeatures(darkFeatures);
        
        this.executor = Executors.newSingleThreadScheduledExecutor();
        this.executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                configSource.load();
            }
        }, ruleUpdateTimeInterval, ruleUpdateTimeInterval, TimeUnit.SECONDS);
    }

    public DarkLaunch() {
        this(DEFAULT_RULE_UPDATE_TIME_INTERVAL);
    }

    // 新增：添加编程实现的灰度规则的接口
    public void addProgrammedDarkFeature(String featureKey, IDarkFeature darkFeature) {
        this.rule.addProgrammedDarkFeature(featureKey, darkFeature);
    }

    public IDarkFeature getDarkFeature(String featureKey) {
        IDarkFeature darkFeature = this.rule.getDarkFeature(featureKey);
        return darkFeature;
    }
}