package designpattern.projectsInAction.spring.observer;

import org.springframework.context.ApplicationEvent;

/**
 * @author fengsy
 * @date 7/4/21
 * @Description
 */

// Event事件
public class DemoEvent extends ApplicationEvent {
    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
    }

    public String getMessage() {
        return this.message;
    }
}
