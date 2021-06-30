package designpattern.patterns.structure.bridge.alert_better.notification;

import designpattern.patterns.structure.bridge.alert_better.sender.MsgSender;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class SevereNotification extends Notification {
    public SevereNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {

        System.out.println("severe notification prepare to send...");
        msgSender.send(message);
    }
}
