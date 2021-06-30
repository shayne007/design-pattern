package designpattern.patterns.behavior.templateMethod.callback;

/**
 * @author fengsy
 * @date 6/30/21
 * @Description
 */
public class BClass {
    public void process(ICallback callback) {
        //...
        callback.methodToCallback();
        //...
    }
}