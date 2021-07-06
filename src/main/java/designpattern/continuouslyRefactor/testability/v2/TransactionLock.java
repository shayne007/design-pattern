package designpattern.continuouslyRefactor.testability.v2;

import designpattern.continuouslyRefactor.testability.RedisDistributedLock;

/**
 * @author fengsy
 * @date 3/6/21
 * @Description
 */

public class TransactionLock {
    public boolean lock(String id) {
        return RedisDistributedLock.getSingletonIntance().lockTransction(id);
    }

    public void unlock(String id) {
        RedisDistributedLock.getSingletonIntance().unlockTransction(id);
    }
}