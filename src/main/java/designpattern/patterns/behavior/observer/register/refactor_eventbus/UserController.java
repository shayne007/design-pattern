package designpattern.patterns.behavior.observer.register.refactor_eventbus;

import designpattern.patterns.behavior.observer.eventbus.AsyncEventBus;
import designpattern.patterns.behavior.observer.eventbus.EventBus;
import designpattern.patterns.behavior.observer.register.UserService;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */

public class UserController {
    private UserService userService; // 依赖注入

    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController() {
        userService = (telephone, password) -> new Random().nextLong();
        // eventBus = new EventBus(); // 同步阻塞模式
        eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE)); // 异步非阻塞模式
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long userRegister(String telephone, String password) {
        // 省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        System.out.println("用户准备注册...");
        long userId = userService.register(telephone, password);
        User user = new User();
        SubUser subUser = new SubUser();
        user.setUserid(userId);
        user.setName("username");
        subUser.setName("subusername");
        subUser.setUserid(userId);

        System.out.println("用户注册成功！");

        eventBus.post(userId);
        eventBus.post(user);
        eventBus.post(subUser);

        return userId;
    }
}
