package designpattern.inactions.metrics.v2.storage;

import java.util.List;
import java.util.Map;

import designpattern.inactions.metrics.v2.RequestInfo;

public interface MetricsStorage {
    void saveRequestInfo(RequestInfo requestInfo);

    List<RequestInfo> getRequestInfos(String apiName, long startTimeInMillis, long endTimeInMillis);

    Map<String, List<RequestInfo>> getRequestInfos(long startTimeInMillis, long endTimeInMillis);
}
