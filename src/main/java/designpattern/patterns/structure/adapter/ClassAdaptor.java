package designpattern.patterns.structure.adapter;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class ClassAdaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        // ...重新实现f2()...
    }

    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}