package designpattern.patterns.create.singleton.enumclass;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author fengsy
 * @date 3/7/21
 * @Description
 */

public enum IdGenerator {
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}