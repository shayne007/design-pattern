package designpattern.projectsInAction.idempotence.usage.client;

import designpattern.projectsInAction.idempotence.usage.server.Order;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author fengsy
 * @date 7/7/21
 * @Description
 */
@FeignClient(name = "order-service", path = "/v1/order", configuration = FeignRequestInterceptor.class)
@Headers({"Content-Type: application/json;charset=UTF-8", "IdempotenceId: {idempotenceId}"})
public interface OrderFeignClient {
    @PostMapping()
    public Order create();
}
