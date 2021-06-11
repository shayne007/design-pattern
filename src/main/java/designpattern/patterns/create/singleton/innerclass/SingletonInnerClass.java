package designpattern.patterns.create.singleton.innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 6/11/21
 * @Description
 */
public final class SingletonInnerClass {
    public List<String> list;
    private SingletonInnerClass(){
        list = new ArrayList<>();
    }
    private static class SingletonInnerClassInstance{
        private static SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }
    public static SingletonInnerClass getInstance(){
        return SingletonInnerClassInstance.INSTANCE;
    }
}
