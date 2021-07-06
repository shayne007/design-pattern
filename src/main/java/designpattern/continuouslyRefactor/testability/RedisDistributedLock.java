package designpattern.continuouslyRefactor.testability;

/**
 * @author fengsy
 * @date 3/6/21
 * @Description
 */
public class RedisDistributedLock {
    private static final RedisDistributedLock lock = new RedisDistributedLock();

    private RedisDistributedLock() {
    }

    public static RedisDistributedLock getSingletonIntance() {
        return lock;
    }

    public boolean lockTransction(String id) {
        return false;
    }

    public void unlockTransction(String id) {
    }
}
