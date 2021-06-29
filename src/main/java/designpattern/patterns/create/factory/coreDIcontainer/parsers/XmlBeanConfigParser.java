package designpattern.patterns.create.factory.coreDIcontainer.parsers;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */
public class XmlBeanConfigParser implements BeanConfigParser {
    @Override
    public List<BeanDefinition> parse(InputStream inputStream) {
        String content = null;
        // TODO:
        return parse(content);
    }

    @Override
    public List<BeanDefinition> parse(String configContent) {
        List<BeanDefinition> beanDefinitions = new ArrayList<>();
        BeanDefinition.ConstructorArg constructorArg = new BeanDefinition.Builder().setRef(false).setArg(1).build();
        List<BeanDefinition.ConstructorArg> list = new ArrayList<>();
        list.add(constructorArg);
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setConstructorArgs(list);
        return beanDefinitions;
    }
}
