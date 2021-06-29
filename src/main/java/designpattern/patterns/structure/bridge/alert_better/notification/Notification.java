package designpattern.patterns.structure.bridge.alert_better.notification;

import designpattern.patterns.structure.bridge.alert_better.sender.MsgSender;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */

public abstract class Notification {
    protected MsgSender msgSender;

    public Notification(MsgSender msgSender) {
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);
}
