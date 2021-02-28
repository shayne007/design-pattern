package patterns.structure.proxy.dynamicProxy;
/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */


public class UserController implements IUserController{
    //...省略其他属性和方法...
    private MetricsCollector metricsCollector; // 依赖注入

    @Override
    public String login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // ... 省略login逻辑...

        System.out.println("login");
        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
//        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
//        metricsCollector.recordRequest(requestInfo);

        //...返回UserVo数据...
        return "login userVo";

    }

    @Override
    public String register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // ... 省略register逻辑...

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
//        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
//        metricsCollector.recordRequest(requestInfo);

        //...返回UserVo数据...
        return "register userVo";
    }
}
