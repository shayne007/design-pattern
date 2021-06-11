package designpattern.patterns;

import java.util.Arrays;
import java.util.Random;

/**
 * @author fengsy
 * @date 6/12/21
 * @Description
 */

class Package {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void execute() {
        System.out.println(Thread.currentThread().getName() + " executed " + this);
    }
}

class PackageChannel {
    private final static int MAX_PACKAGE_SIZE = 100;
    private final Package[] packageQueue;
    private final Worker[] workerPool;
    private int head;
    private int tail;
    private int count;

    public PackageChannel(int workers) {
        this.workerPool = new Worker[workers];
        this.packageQueue = new Package[MAX_PACKAGE_SIZE];
        this.count = 0;
        this.tail = 0;
        this.head = 0;
        this.init();
    }

    private void init() {
        for (int i = 0; i < workerPool.length; i++) {
            workerPool[i] = new Worker("Worker-" + i, this);
        }
    }

    public void startWork() {
        Arrays.asList(workerPool).forEach(Worker::start);
    }

    public synchronized void put(Package packagereq) {
        while (count >= packageQueue.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.packageQueue[tail] = packagereq;
        this.tail = (tail + 1) % packageQueue.length;
        this.count++;
        this.notifyAll();
    }

    public synchronized Package take() {
        while (count <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Package request = this.packageQueue[head];
        this.head = (this.head + 1) % this.packageQueue.length;
        this.count--;
        this.notifyAll();
        return request;
    }
}

class Worker extends Thread {
    private static final Random random = new Random(System.currentTimeMillis());
    private final PackageChannel channel;

    public Worker(String name, PackageChannel channel) {
        super(name);
        this.channel = channel;
    }

    @Override
    public void run() {
        while (true) {
            channel.take().execute();

            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class WorkerThreadTest {
    public static void main(String[] args) {
        final PackageChannel packageChannel = new PackageChannel(10);
        packageChannel.startWork();
        for (int i = 0; i < 100; i++) {
            Package packagereq = new Package();
            packagereq.setAddress("testaddress");
            packagereq.setName("testname");
            packageChannel.put(packagereq);
        }
    }
}