package designpattern.patterns.behavior.observer.listener;

import org.springframework.context.ApplicationEvent;

/**
 * @author fengsy
 * @date 2/23/21
 * @Description
 */
public class DemoEvent extends ApplicationEvent {

    private String message;

    public DemoEvent(Object source, String message) {
        super(source);
    }

    public String getMessage() {
        return this.message;
    }
}
