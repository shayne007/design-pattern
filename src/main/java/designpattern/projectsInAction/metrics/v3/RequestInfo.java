package designpattern.projectsInAction.metrics.v3;

/**
 * @author fengsy
 * @date 3/5/21
 * @Description
 */
public class RequestInfo {
    private String apiName;
    private double responseTime;
    private long timestamp;

    public RequestInfo(String apiName, double responseTime, long timestamp) {
        this.apiName = apiName;
        this.responseTime = responseTime;
        this.timestamp = timestamp;
    }

    public String getApiName() {
        return apiName;
    }

    public double getResponseTime() {
        return responseTime;
    }
}