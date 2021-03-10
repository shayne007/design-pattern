package designpattern.patterns.create.singleton.param;

/**
 * @author fengsy
 * @date 3/8/21
 * @Description
 */

public class Singleton2 {
    private static Singleton2 instance = null;
    private final int paramA;
    private final int paramB;

    private Singleton2(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public synchronized static Singleton2 getInstance(int paramA, int paramB) {
        if (instance == null) {
            instance = new Singleton2(paramA, paramB);
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance(10, 50);
        System.out.println(singleton1.paramA);
        // 第二次的参数（20，30）没有起作用,而构建的过程也没有给与提示，这样就会误导用户。
        Singleton2 singleton2 = Singleton2.getInstance(20, 30);
        System.out.println(singleton2.paramA);
    }
}
