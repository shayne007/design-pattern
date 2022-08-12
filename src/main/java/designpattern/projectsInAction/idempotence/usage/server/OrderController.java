package designpattern.projectsInAction.idempotence.usage.server;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */
public class OrderController {
    @IdempotenceRequired
    public Order createOrder() {
        return new Order();
    }
}
