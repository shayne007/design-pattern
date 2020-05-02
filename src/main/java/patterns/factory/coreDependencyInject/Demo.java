package patterns.factory.coreDependencyInject;

import patterns.factory.coreDependencyInject.beans.RateLimiter;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */

public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beans.xml");
        RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
        rateLimiter.test();
        //...
    }
}
