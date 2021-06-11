package designpattern.patterns.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengsy
 * @date 6/12/21
 * @Description
 */


interface Flyweight {
    public void operation(String name);

    public String getType();

}

class ConcreteFlyweight implements Flyweight {
    private String type;

    public ConcreteFlyweight(String type) {
        this.type = type;
    }

    @Override
    public void operation(String name) {
        System.out.printf("instrinsic state: %s,extrinsic state: %s \n", type, name);
    }

    @Override
    public String getType() {
        return type;
    }
}


class FlyweightFactory {
    private static final Map<String, Flyweight> FLYWEIGHT_MAP = new HashMap<>();

    public static Flyweight getFlyweight(String type) {
        System.out.println(FLYWEIGHT_MAP.size());
        if (FLYWEIGHT_MAP.containsKey(type)) {
            return FLYWEIGHT_MAP.get(type);
        } else {
            ConcreteFlyweight flyweight = new ConcreteFlyweight(type);
            FLYWEIGHT_MAP.put(type, flyweight);
            return flyweight;
        }
    }
}

public class Client {
    public static void main(String[] agrs) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("aaa");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("bbb");
        Flyweight flyweight3 = FlyweightFactory.getFlyweight("aaa");
        Flyweight flyweight4 = FlyweightFactory.getFlyweight("bbb");
        flyweight2.operation("111");
        System.out.printf("object compare: %s \n", flyweight1 == flyweight3);
        System.out.println("object instinsic state: " + flyweight3.getType());
        System.out.println("object instinsic state: " + flyweight4.getType());

    }
}