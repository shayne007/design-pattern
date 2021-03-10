package designpattern.patterns.create.singleton.param;

/**
 * @author fengsy
 * @date 3/8/21
 * @Description
 */

class Config {
    public static final int PARAM_A = 123;
    public static final int PARAM_B = 245;
}

public class Singleton3 {
    private static Singleton3 instance = null;
    private final int paramA;
    private final int paramB;

    private Singleton3() {
        this.paramA = Config.PARAM_A;
        this.paramB = Config.PARAM_B;
    }

    public synchronized static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}