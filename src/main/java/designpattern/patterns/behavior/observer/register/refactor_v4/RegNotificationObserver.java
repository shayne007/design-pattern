package designpattern.patterns.behavior.observer.register.refactor_v4;

import com.google.common.eventbus.Subscribe;

import designpattern.patterns.behavior.observer.register.NotificationService;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class RegNotificationObserver {
    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(Long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }
}
