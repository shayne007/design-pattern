package designpattern.patterns.structure.bridge.alert;

import java.util.List;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class Notification {
    private List<String> emailAddresses;

    private List<String> telephones;
    private List<String> wechartIds;

    public void notify(NotificationEmergencyLevel level, String s) {
        if (level.equals(NotificationEmergencyLevel.SEVERE)) {
            // ...自动语音电话
        } else if (level.equals(NotificationEmergencyLevel.URGENCY)) {
            // ...发微信
        } else if (level.equals(NotificationEmergencyLevel.NORMAL)) {
            // ...发邮件
        } else if (level.equals(NotificationEmergencyLevel.TRIVIAL)) {
            // ...发邮件
        }
    }
}
