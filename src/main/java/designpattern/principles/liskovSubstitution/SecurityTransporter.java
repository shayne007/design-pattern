package designpattern.principles.liskovSubstitution;

import org.apache.commons.lang3.StringUtils;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class SecurityTransporter extends Transporter {
    private String appId;
    private String appToken;

    public SecurityTransporter(HttpClient httpClient, String appId, String appToken) {
        super(httpClient);
        this.appId = appId;
        this.appToken = appToken;
    }

    public SecurityTransporter() {
        super();
    }

    @Override
    public Response sendRequest(Request request) throws ParentRuntimeException {
        if (StringUtils.isBlank(appId) || StringUtils.isBlank(appToken)) {
            // 子类中抛出异常，不满足里氏替换原则
            // 子类替换父类传递进 demoFunction 函数之后，整个程序的逻辑行为有了改变。
            throw new NoAuthorizationRuntimeException();
        }
        if (StringUtils.isNotBlank(appId) && StringUtils.isNotBlank(appToken)) {
            request.addPayload("app-id", appId);
            request.addPayload("app-token", appToken);
        }
        return super.sendRequest(request);
    }
}
