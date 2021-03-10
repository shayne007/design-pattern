package designpattern.principles.openClosed.alert.alert_better;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class TimeoutHandler extends AlertHandler {
    public TimeoutHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {

        long timeoutTps = apiStatInfo.getTimeout() / apiStatInfo.getDurationOfSeconds();
        if (timeoutTps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTimeoutTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
    }
}
