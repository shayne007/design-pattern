package designpattern.patterns.behavior.responsibilityChain;

/**
 * @author fengsy
 * @date 7/2/21
 * @Description
 */
public class Application {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.addHandler(new HandlerA());
        chain.addHandler(new HandlerB());
        chain.handle();
    }
}