package designpattern.patterns.structure.bridge.alert_v1;

import java.util.Arrays;

import designpattern.patterns.structure.bridge.alert_v1.notification.NormalNotification;
import designpattern.patterns.structure.bridge.alert_v1.notification.SevereNotification;
import designpattern.patterns.structure.bridge.alert_v1.notification.UrgentNotification;
import designpattern.patterns.structure.bridge.alert_v1.sender.EmailMsgSender;
import designpattern.patterns.structure.bridge.alert_v1.sender.TelephoneMsgSender;
import designpattern.patterns.structure.bridge.alert_v1.sender.WechartMsgSender;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */

public class ApplicationContext {
    private AlertRule alertRule;
    private Alert alert;

    public void initializeBeans() {
        alertRule = new AlertRule(/*.省略参数.*/); // 省略一些初始化代码
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule,
            new SevereNotification(new WechartMsgSender(Arrays.asList("fengshiyi007")))));
        String[] emails = {"shayne007@sina.cn", "fengshiyi007@gmail.com"};
        alert.addAlertHandler(
            new ErrorAlertHandler(alertRule, new NormalNotification(new EmailMsgSender(Arrays.asList(emails)))));
        alert.addAlertHandler(
            new TimeoutHandler(alertRule, new UrgentNotification(new TelephoneMsgSender(Arrays.asList(emails)))));
    }

    public Alert getAlert() {
        return alert;
    }

    // 饿汉式单例
    private static final ApplicationContext instance = new ApplicationContext();

    private ApplicationContext() {
        initializeBeans();
    }

    public static ApplicationContext getInstance() {
        return instance;
    }
}
