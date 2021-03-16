package designpattern.patterns.structure.bridge.alert;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
