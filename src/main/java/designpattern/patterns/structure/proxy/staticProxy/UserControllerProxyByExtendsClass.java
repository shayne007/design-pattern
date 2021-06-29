package designpattern.patterns.structure.proxy.staticProxy;

import designpattern.inactions.metrics.v4.RequestInfo;
import designpattern.patterns.structure.proxy.dynamicProxy.MetricsCollector;

/**
 * @author fengsy
 * @date 3/9/21
 * @Description
 */

public class UserControllerProxyByExtendsClass extends UserController {
    private MetricsCollector metricsCollector;

    public UserControllerProxyByExtendsClass() {
        this.metricsCollector = new MetricsCollector();
    }

    @Override
    public String login(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        String userVo = super.login(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("login", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }

    @Override
    public String register(String telephone, String password) {
        long startTimestamp = System.currentTimeMillis();

        String userVo = super.register(telephone, password);

        long endTimeStamp = System.currentTimeMillis();
        long responseTime = endTimeStamp - startTimestamp;
        RequestInfo requestInfo = new RequestInfo("register", responseTime, startTimestamp);
        metricsCollector.recordRequest(requestInfo);

        return userVo;
    }
}
