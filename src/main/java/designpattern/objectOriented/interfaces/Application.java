package designpattern.objectOriented.interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengsy
 * @date 3/2/21
 * @Description
 */
// 过滤器使用Demo
public class Application {

    private List<Filter> filters = new ArrayList<>();

//    filters.add(neww AuthencationFilter());
//    filters.add(new RateLimitFilter());

    public void handleRpcRequest(RpcRequest req) {


        try {
            for (Filter filter : filters) {
                filter.doFilter(req);
            }
        } catch (RpcException e) {
            // ...处理过滤结果...
        }
        // ...省略其他处理逻辑...
    }
}