package patterns.create.factory.coreDependencyInject;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */


public interface ApplicationContext {
    Object getBean(String beanId) throws BeanCreationFailureException, NoSuchBeanDefinitionException;
}

