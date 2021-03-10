package designpattern.patterns.create.singleton.threadsingle;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author fengsy
 * @date 3/8/21
 * @Description
 */

public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);

    private static final ConcurrentHashMap<Long, IdGenerator> instances = new ConcurrentHashMap<>();

    private IdGenerator() {}

    public static IdGenerator getInstance() {
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new IdGenerator());
        return instances.get(currentThreadId);
    }

    public long getId() {
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor =
            new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(10));
        threadPoolExecutor.execute(() -> {
            long id = IdGenerator.getInstance().getId();
            System.out.println(IdGenerator.getInstance());
            System.out.println(id);

        });
        threadPoolExecutor.execute(() -> {
            long id = IdGenerator.getInstance().getId();
            System.out.println(IdGenerator.getInstance());
            System.out.println(id);
        });

    }
}
