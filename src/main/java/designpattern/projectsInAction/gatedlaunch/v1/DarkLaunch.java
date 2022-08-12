package designpattern.projectsInAction.gatedlaunch.v1;

import designpattern.projectsInAction.gatedlaunch.v1.rule.DarkFeature;
import designpattern.projectsInAction.gatedlaunch.v1.rule.DarkRule;
import designpattern.projectsInAction.gatedlaunch.v1.rule.DarkRuleConfig;
import designpattern.projectsInAction.gatedlaunch.v1.rule.datasource.FileRuleConfigSource;
import designpattern.projectsInAction.gatedlaunch.v1.rule.datasource.RuleConfigSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private DarkRule rule;
    private ScheduledExecutorService executor;

    public DarkLaunch(int ruleUpdateTimeInterval) {
        RuleConfigSource configSource = new FileRuleConfigSource();
        DarkRuleConfig config = configSource.load();
        // 更新规则并非直接在this.rule上进行，
        // 而是通过创建一个新的DarkRule，然后赋值给this.rule，
        // 来避免更新规则和规则查询的并发冲突问题
        rule = new DarkRule(config);

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


    public DarkFeature getDarkFeature(String featureKey) {
        DarkFeature darkFeature = this.rule.getDarkFeature(featureKey);
        return darkFeature;
    }


}