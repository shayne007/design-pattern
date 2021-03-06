package designpattern.patterns.structure.bridge.alert_v1;

import designpattern.patterns.structure.bridge.alert_v1.notification.Notification;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class TpsAlertHandler extends AlertHandler {
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify("...");
        }
    }
}
