package designpattern.projectsInAction.metrics.v4.storage;

import java.util.List;
import java.util.Map;

import designpattern.projectsInAction.metrics.v4.RequestInfo;

public interface MetricsStorage {
    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}
