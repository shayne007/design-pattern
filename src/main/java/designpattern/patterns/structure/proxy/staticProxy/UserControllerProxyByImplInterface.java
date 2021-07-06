package designpattern.patterns.structure.proxy.staticProxy;

import designpattern.projectsInAction.metrics.v4.RequestInfo;
import designpattern.patterns.structure.proxy.dynamicProxy.MetricsCollector;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */

public class UserControllerProxyByImplInterface implements IUserController {
    // ...省略其他属性和方法...
    private MetricsCollector metricsCollector; // 依赖注入
    private UserController userController;

    public UserControllerProxyByImplInterface(UserController userController) {
        this.userController = userController;
        this.metricsCollector = new MetricsCollector();
    }

    @Override

    public String login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 委托
        userController.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        // ...返回UserVo数据...
        return "login userVo";

    }

    @Override
    public String register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        // 委托
        userController.register(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        // ...返回UserVo数据...
        return "register userVo";
    }
}
