package designpattern.projectsInAction.metrics.v4.storage;

import java.util.List;
import java.util.Map;

import designpattern.projectsInAction.metrics.v4.RequestInfo;

/**
 * @author fengsy
 * @date 3/5/21
 * @Description
 */
public class RedisMetricsStorage implements MetricsStorage {
    // ...省略属性和构造函数等...
    @Override
    public void saveRequestInfo(RequestInfo requestInfo) {
        // ...
    }

    @Override
    public List<RequestInfo> getRequestInfos(String apiName, long startTimestamp, long endTimestamp) {
        // ...
        return null;
    }

    @Override
    public Map<String, List<RequestInfo>> getRequestInfos(long startTimestamp, long endTimestamp) {
        // ...
        return null;
    }
}