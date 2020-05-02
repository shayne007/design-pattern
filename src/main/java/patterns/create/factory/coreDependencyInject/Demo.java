package patterns.create.factory.coreDependencyInject;

import patterns.create.factory.coreDependencyInject.beans.RateLimiter;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */

public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = null;
        try {
            applicationContext = new ClassPathXmlApplicationContext(
                    "beans.xml");
        } catch (BeanCreationFailureException e) {
            e.printStackTrace();
        } catch (NoSuchBeanDefinitionException e) {
            e.printStackTrace();
        }
        RateLimiter rateLimiter = null;
        try {
            rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
        } catch (BeanCreationFailureException e) {
            e.printStackTrace();
        } catch (NoSuchBeanDefinitionException e) {
            e.printStackTrace();
        }
        rateLimiter.test();
        //...
    }
}
