package designpattern.objectOriented.interfaces;

/**
 * @author fengsy
 * @date 3/2/21
 * @Description
 */
public class AuthencationFilter implements Filter {
    @Override
    public void doFilter(RpcRequest request) throws RpcException {
        // 鉴权逻辑
    }
}
