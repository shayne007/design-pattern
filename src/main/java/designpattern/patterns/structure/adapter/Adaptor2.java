package designpattern.patterns.structure.adapter;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class Adaptor2 implements ITarget {
    private Adaptee adaptee;

    public Adaptor2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void f1() {
        adaptee.fa(); // 委托给Adaptee
    }

    @Override
    public void f2() {
        // ...重新实现f2()...
    }

    @Override
    public void fc() {
        adaptee.fc();
    }
}