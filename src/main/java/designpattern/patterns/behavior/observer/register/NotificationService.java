package designpattern.patterns.behavior.observer.register;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public interface NotificationService {
    public void sendInboxMessage(long userId, String s);
}
