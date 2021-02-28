package patterns.structure.proxy.dynamicProxy.cglib;

/**
 * @author fengsy
 * @date 1/20/21
 * @Description
 */
public class AliSmsService {
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}