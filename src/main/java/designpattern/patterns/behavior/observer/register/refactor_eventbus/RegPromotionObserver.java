package designpattern.patterns.behavior.observer.register.refactor_eventbus;

import designpattern.patterns.behavior.observer.eventbus.Subscribe;
import designpattern.patterns.behavior.observer.register.PromotionService;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class RegPromotionObserver {
    private PromotionService promotionService; // 依赖注入

    RegPromotionObserver() {
        this.promotionService = userId -> System.out.println("发送促销活动给用户，userid: " + userId);
    }

    @Subscribe
    public void handleRegSuccess(Long userId) {
        System.out.println("观察者RegPromotionObserver成功收到订阅消息！");
        promotionService.issueNewUserExperienceCash(userId);
    }

    @Subscribe
    public void handleRegSuccess2(User user) {
        System.out.println("观察者RegPromotionObserver成功收到订阅消息User: " + user.getName());
        promotionService.issueNewUserExperienceCash(user.getUserid());
    }
}