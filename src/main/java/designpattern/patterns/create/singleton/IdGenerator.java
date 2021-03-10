package designpattern.patterns.create.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author fengsy
 * @date 3/7/21
 * @Description
 */

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;

    private IdGenerator() {}

    public static IdGenerator getInstance() {
        if (instance == null) {
            // 此处为类级别的锁
            synchronized (IdGenerator.class) {
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }

}

class Test {
    // 1. 老的使用方式
    public void demofunction() {
        // ...
        long id = IdGenerator.getInstance().getId();
        // ...
    }

    // 2. 新的使用方式：依赖注入
    public void demofunction(IdGenerator idGenerator) {
        long id = idGenerator.getId();
    }

    public static void main(String[] args) {
        // 外部调用demofunction()的时候，传入idGenerator
        IdGenerator idGenerator = IdGenerator.getInstance();

        new Test().demofunction(idGenerator);
    }
}