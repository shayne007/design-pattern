package designpattern.patterns.behavior.observer.basic;

/**
 * @author fengsy
 * @date 3/16/21
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObservers(new Message());
    }
}
