package designpattern.patterns.create.factory.coreDependencyInject;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */
public class BeanCreationFailureException extends Throwable {
    public BeanCreationFailureException(String s, ReflectiveOperationException e) {
    }
}
