package designpattern.objectoriented.interfaces;

public interface Filter {
    void doFilter(RpcRequest request) throws RpcException;

}

class RpcRequest {
}

class RpcException extends Throwable {
}