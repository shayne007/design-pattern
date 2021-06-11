package designpattern.patterns.create.singleton.enumclass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 6/11/21
 * @Description
 */
public final class SingletonEnum {
    private List<String> list = null;

    private SingletonEnum() {
        list = new ArrayList<>();
    }

    private static SingletonEnum instance = null;

    public static SingletonEnum getInstance() {
        return Singleton.SINGLETON.instance;
    }

    private enum Singleton {
        SINGLETON;

        private SingletonEnum instance;

        Singleton() {
            instance = new SingletonEnum();
        }

        public SingletonEnum getInstance() {
            return instance;
        }
    }

}
