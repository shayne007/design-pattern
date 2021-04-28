package designpattern.patterns.behavior.observer.register.refactor_v1;

import designpattern.patterns.behavior.observer.register.PromotionService;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}