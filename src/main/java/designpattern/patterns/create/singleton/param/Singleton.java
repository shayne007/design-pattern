package designpattern.patterns.create.singleton.param;

/**
 * @author fengsy
 * @date 3/8/21
 * @Description
 */

public class Singleton {
    private static Singleton instance = null;
    private final int paramA;
    private final int paramB;

    private Singleton(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            throw new RuntimeException("Run init() first.");
        }
        return instance;
    }

    public synchronized static Singleton init(int paramA, int paramB) {
        if (instance != null) {
            throw new RuntimeException("Singleton has been created!");
        }
        instance = new Singleton(paramA, paramB);
        return instance;
    }

    public static void main(String[] args) {
        // 先init，再使用
        Singleton.init(10, 50);
        Singleton singleton = Singleton.getInstance();
    }
}
