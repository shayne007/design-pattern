package designpattern.patterns.create.factory.coreDependencyInject.beans;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */

public class RedisCounter {
    private String ipAddress;
    private int port;
    public RedisCounter(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }
    //...
}
