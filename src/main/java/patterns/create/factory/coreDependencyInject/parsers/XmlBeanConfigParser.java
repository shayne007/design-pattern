package patterns.create.factory.coreDependencyInject.parsers;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */
public class XmlBeanConfigParser implements BeanConfigParser{
    @Override
    public List<BeanDefinition> parse(InputStream inputStream) {
        String content = null;
        //TODO:
        return parse(content);
    }

    @Override
    public List<BeanDefinition> parse(String configContent) {
        List<BeanDefinition> beanDefinitions = new ArrayList<>();
        return beanDefinitions;
    }
}
