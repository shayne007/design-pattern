package designpattern.patterns.structure.bridge.alert_v1;

import designpattern.patterns.structure.bridge.alert_v1.notification.Notification;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify("");
        }
    }
}
