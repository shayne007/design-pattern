package designpattern.patterns.create.singleton.distribute;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author fengsy
 * @date 6/28/21
 * @Description
 */


public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private static SharedObjectStorage<IdGenerator> storage = new FileSharedObjectStorage(/*入参省略，比如文件地址*/);
    private static DistributedLock lock = new DistributedLock();

    private IdGenerator() {
    }

    public synchronized static IdGenerator getInstance() {
        if (instance == null) {
            lock.lock();
            instance = storage.load(IdGenerator.class);
        }
        return instance;
    }

    public synchronized void freeInstance() {
        storage.save(this, IdGenerator.class);
        instance = null; //释放对象
        lock.unlock();
    }

    public long getId() {
        return id.incrementAndGet();
    }
}

//      //IdGenerator使用举例
//      IdGenerator idGeneator = IdGenerator.getInstance();
//      long id = idGenerator.getId();
//      IdGenerator.freeInstance();