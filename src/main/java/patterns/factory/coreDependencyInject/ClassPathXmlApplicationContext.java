package patterns.factory.coreDependencyInject;

import patterns.factory.coreDependencyInject.parsers.BeanConfigParser;
import patterns.factory.coreDependencyInject.parsers.BeanDefinition;
import patterns.factory.coreDependencyInject.parsers.XmlBeanConfigParser;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */

public class ClassPathXmlApplicationContext implements ApplicationContext {
    private BeansFactory beansFactory;
    private BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext(String configLocation) {
        this.beansFactory = new BeansFactory();
        this.beanConfigParser = new XmlBeanConfigParser();
        loadBeanDefinitions(configLocation);
    }

    private void loadBeanDefinitions(String configLocation) {
        InputStream in = null;
        try {
            in = this.getClass().getResourceAsStream("/" + configLocation);
            if (in == null) {
                throw new RuntimeException("Can not find config file: " + configLocation);
            }
            List<BeanDefinition> beanDefinitions = beanConfigParser.parse(in);
            beansFactory.addBeanDefinitions(beanDefinitions);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO: log error
                }
            }
        }
    }

    @Override
    public Object getBean(String beanId) {
        return beansFactory.getBean(beanId);
    }
}