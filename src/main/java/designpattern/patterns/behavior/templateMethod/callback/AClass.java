package designpattern.patterns.behavior.templateMethod.callback;

/**
 * @author fengsy
 * @date 6/30/21
 * @Description
 */
public class AClass {
    public static void main(String[] args) {
        BClass b = new BClass();
        b.process(new ICallback() { //回调对象
            @Override
            public void methodToCallback() {
                System.out.println("Call back me.");
            }
        });
    }
}