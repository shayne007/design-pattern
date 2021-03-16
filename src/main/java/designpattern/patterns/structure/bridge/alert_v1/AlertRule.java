package designpattern.patterns.structure.bridge.alert_v1;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class AlertRule {
    public Rule getMatchedRule(String api) {
        return new Rule();
    }
}

class Rule {

    public long getMaxTps() {
        return 0;
    }

    public long getMaxErrorCount() {
        return 0;
    }

    public long getMaxTimeoutTps() {
        return 0;
    }
}