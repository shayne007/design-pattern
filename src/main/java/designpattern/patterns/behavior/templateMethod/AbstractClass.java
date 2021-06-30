package designpattern.patterns.behavior.templateMethod;

/**
 * @author fengsy
 * @date 6/30/21
 * @Description
 */
public abstract class AbstractClass {
    public final void templateMethod() {
        //...
        method1();
        //...
        method2();
        //...
    }

    protected abstract void method1();

    protected abstract void method2();
}