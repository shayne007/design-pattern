package designpattern.patterns.behavior.observer.register.refactor_v1;

import designpattern.patterns.behavior.observer.register.NotificationService;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}