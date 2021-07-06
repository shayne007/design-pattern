package designpattern.patterns.create.factory.coreDIcontainer;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import designpattern.patterns.create.factory.coreDIcontainer.parsers.BeanConfigParser;
import designpattern.patterns.create.factory.coreDIcontainer.parsers.BeanDefinition;
import designpattern.patterns.create.factory.coreDIcontainer.parsers.XmlBeanConfigParser;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */

public class ClassPathXmlApplicationContext implements ApplicationContext {
    private BeansFactory beansFactory;
    private BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext(String configLocation)
        throws BeanCreationFailureException, NoSuchBeanDefinitionException {
        this.beansFactory = new BeansFactory();
        this.beanConfigParser = new XmlBeanConfigParser();
        loadBeanDefinitions(configLocation);
    }

    private void loadBeanDefinitions(String configLocation)
        throws NoSuchBeanDefinitionException, BeanCreationFailureException {
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
    public Object getBean(String beanId) throws BeanCreationFailureException, NoSuchBeanDefinitionException {
        return beansFactory.getBean(beanId);
    }
}