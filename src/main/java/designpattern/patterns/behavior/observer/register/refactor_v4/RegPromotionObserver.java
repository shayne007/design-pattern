package designpattern.patterns.behavior.observer.register.refactor_v4;

import com.google.common.eventbus.Subscribe;

import designpattern.patterns.behavior.observer.register.PromotionService;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class RegPromotionObserver {
    private PromotionService promotionService; // 依赖注入

    @Subscribe
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}