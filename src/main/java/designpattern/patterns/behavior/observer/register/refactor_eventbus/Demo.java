package designpattern.patterns.behavior.observer.register.refactor_eventbus;

import java.util.Arrays;

/**
 * @author fengsy
 * @date 6/30/21
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.setRegObservers(Arrays.asList(new RegNotificationObserver(), new RegPromotionObserver()));

        controller.userRegister("13777778888", "123456");


    }
}
