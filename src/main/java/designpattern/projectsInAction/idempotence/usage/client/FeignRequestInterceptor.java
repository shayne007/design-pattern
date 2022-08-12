package designpattern.projectsInAction.idempotence.usage.client;

import designpattern.projectsInAction.idempotence.v2.IdempotenceIdGenerator;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * @author fengsy
 * @date 7/12/21
 * @Description
 */

@Configuration
public class FeignRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("idempotenceId", IdempotenceIdGenerator.generateId());
    }

}
