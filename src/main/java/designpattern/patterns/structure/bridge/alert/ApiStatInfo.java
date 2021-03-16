package designpattern.patterns.structure.bridge.alert;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class ApiStatInfo {// 省略constructor/getter/setter方法
    private String api;
    private long requestCount;
    private long errorCount;
    private long durationOfSeconds;

    private long timeout;

    public long getRequestCount() {
        return 0;
    }

    public long getDurationOfSeconds() {
        return 0;
    }

    public String getApi() {
        return this.api;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long l) {
        this.timeout = l;
    }
}
