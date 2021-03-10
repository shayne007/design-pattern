package designpattern.patterns.behavior.observer.listener;

import org.springframework.context.ApplicationListener;

/**
 * @author fengsy
 * @date 2/23/21
 * @Description
 */
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String message = demoEvent.getMessage();
        System.out.println(message);
    }
}
