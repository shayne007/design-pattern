package designpattern.patterns.create.singleton.innerclass;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author fengsy
 * @date 3/7/21
 * @Description
 */

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private static class IdGeneratorHolder {
        private static final IdGenerator instance = new IdGenerator();
    }

    private IdGenerator() {}

    public static IdGenerator getInstance() {
        return IdGeneratorHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
