package designpattern.patterns.behavior.observer.eventbus;

import java.util.concurrent.Executor;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */

public class AsyncEventBus extends EventBus {
    public AsyncEventBus(Executor executor) {
        super(executor);
        System.out.println("初始化异步事件总线AsyncEventBus");
    }
}
