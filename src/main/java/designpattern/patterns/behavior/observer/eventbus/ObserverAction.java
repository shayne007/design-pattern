package designpattern.patterns.behavior.observer.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.google.common.base.Preconditions;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */

public class ObserverAction {
    private Object target;
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = Preconditions.checkNotNull(target);
        this.method = method;
        this.method.setAccessible(true);
    }

    public void execute(Object event) { // event是method方法的参数
        try {
            method.invoke(target, event);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}