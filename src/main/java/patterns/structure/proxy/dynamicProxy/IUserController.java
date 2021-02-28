package patterns.structure.proxy.dynamicProxy;

/**
 * @author fengsy
 * @date 1/19/21
 * @Description
 */
public interface IUserController {
     String login(String telephone, String password);
     String register(String telephone, String password);

}
