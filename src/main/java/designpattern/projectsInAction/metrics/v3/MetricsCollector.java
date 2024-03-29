package designpattern.projectsInAction.metrics.v3;

import org.apache.commons.lang3.StringUtils;

import designpattern.projectsInAction.metrics.v3.storage.MetricsStorage;

/**
 * @author fengsy
 * @date 3/5/21
 * @Description
 */

public class MetricsCollector {
    private MetricsStorage metricsStorage;// 基于接口而非实现编程

    // 依赖注入
    public MetricsCollector(MetricsStorage metricsStorage) {
        this.metricsStorage = metricsStorage;
    }

    // 用一个函数代替了最小原型中的两个函数
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        metricsStorage.saveRequestInfo(requestInfo);
    }
}
