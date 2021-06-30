package designpattern.patterns.behavior.observer.eventbus;

import com.google.common.util.concurrent.MoreExecutors;

import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */

public class EventBus {
    private Executor executor;
    private ObserverRegistry registry = new ObserverRegistry();

    public EventBus() {
        this(MoreExecutors.directExecutor());
    }

    protected EventBus(Executor executor) {
        System.out.println("初始化事件总线EventBus");
        this.executor = executor;
    }

    public void register(Object object) {
        System.out.println("注册观察者对象：" + object);
        registry.register(object);
    }

    public void post(Object event) {
        System.out.println("发布事件消息至EventBus...");
        List<ObserverAction> observerActions = registry.getMatchedObserverActions(event);
        for (ObserverAction observerAction : observerActions) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    observerAction.execute(event);
                }
            });
        }
    }
}
