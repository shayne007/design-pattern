package designpattern.patterns.create.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 6/12/21
 * @Description
 */

public final class SingletonDoubleCheck {
    private List<String> list = null;
    public volatile static SingletonDoubleCheck instance = null;

    private SingletonDoubleCheck() {
        list = new ArrayList<String>();
    }

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }

        }
        return instance;
    }
}