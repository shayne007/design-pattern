package designpattern.projectsInAction.spring.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * AbstractApplicationContext实现事件的发布
 * 
 * @author fengsy
 * @date 7/4/21
 * @Description
 */
// Publisher发送者
@Component
public class DemoPublisher {
    @Autowired
    private ApplicationContext applicationContext;

    public void publishEvent(DemoEvent demoEvent) {
        this.applicationContext.publishEvent(demoEvent);
    }
}