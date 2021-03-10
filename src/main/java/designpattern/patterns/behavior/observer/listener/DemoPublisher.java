package designpattern.patterns.behavior.observer.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author fengsy
 * @date 2/23/21
 * @Description
 */
@Component
public class DemoPublisher {
    @Autowired
    private ApplicationContext applicationContext;

    public void publishEvent(DemoEvent demoEvent) {
        this.applicationContext.publishEvent(demoEvent);
    }
}
