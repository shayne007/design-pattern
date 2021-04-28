package designpattern.patterns.behavior.observer.register.refactor_v2;

import designpattern.patterns.behavior.observer.register.PromotionService;
import designpattern.patterns.behavior.observer.register.refactor_v1.RegObserver;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
// 异步非阻塞
// 第一种实现方式，其他类代码不变，就没有再重复罗列
public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(long userId) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                promotionService.issueNewUserExperienceCash(userId);
            }
        });
        thread.start();
    }
}
