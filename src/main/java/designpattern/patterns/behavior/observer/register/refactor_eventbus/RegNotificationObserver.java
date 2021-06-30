package designpattern.patterns.behavior.observer.register.refactor_eventbus;

import designpattern.patterns.behavior.observer.eventbus.Subscribe;
import designpattern.patterns.behavior.observer.register.NotificationService;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class RegNotificationObserver {
    private NotificationService notificationService;

    RegNotificationObserver() {
        notificationService = (userId, s) -> System.out.println("发送通知给用户，userid: " + userId + " msg：" + s);
    }

    @Subscribe
    public void handleRegSuccess(Long userId) {
        System.out.println("观察者RegNotificationObserver成功收到订阅消息！");
        notificationService.sendInboxMessage(userId, "注册成功！");
    }

    @Subscribe
    public void handleRegSuccess(SubUser user) {
        System.out.println("观察者RegNotificationObserver成功收到订阅消息SubUser: " + user.getName());
        notificationService.sendInboxMessage(user.getUserid(), "注册成功！");
    }
}
