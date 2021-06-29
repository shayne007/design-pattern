package designpattern.patterns.structure.bridge.alert_better.notification;

import designpattern.patterns.structure.bridge.alert_better.sender.MsgSender;

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
