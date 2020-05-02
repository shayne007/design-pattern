package patterns.create.factory.coreDependencyInject.beans;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */


public class RateLimiter {
    private RedisCounter redisCounter;
    public RateLimiter(RedisCounter redisCounter) {
        this.redisCounter = redisCounter;
    }
    public void test() {
        System.out.println("Hello World!");
    }
    //...
}


