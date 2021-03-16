package designpattern.patterns.structure.bridge.alert_v1.notification;

import designpattern.patterns.structure.bridge.alert_v1.sender.MsgSender;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class TrivialNotification extends Notification {
    public TrivialNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
