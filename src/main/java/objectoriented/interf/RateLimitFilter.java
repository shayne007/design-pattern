package objectoriented.interf;

/**
 * @author fengsy
 * @date 3/2/21
 * @Description
 */
public class RateLimitFilter implements Filter {
    @Override
    public void doFilter(RpcRequest request) throws RpcException {
        // 限流逻辑
    }
}
