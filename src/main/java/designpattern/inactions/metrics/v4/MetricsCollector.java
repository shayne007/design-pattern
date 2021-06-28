package designpattern.inactions.metrics.v4;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import designpattern.inactions.metrics.v4.storage.MetricsStorage;
import designpattern.inactions.metrics.v4.storage.RedisMetricsStorage;
import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.Executors;

/**
 * @author fengsy
 * @date 3/5/21
 * @Description
 */

public class MetricsCollector {
    private MetricsStorage metricsStorage;// 基于接口而非实现编程
    private static final int DEFAULT_STORAGE_THREAD_POOL_SIZE = 20;

    private EventBus eventBus;

    public MetricsCollector(MetricsStorage metricsStorage, int threadNumToSaveData) {
        this.metricsStorage = metricsStorage;
        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(threadNumToSaveData));
        this.eventBus.register(new EventListener());
    }

    public MetricsCollector(MetricsStorage metricsStorage) {
        this(metricsStorage, DEFAULT_STORAGE_THREAD_POOL_SIZE);
    }

    // 兼顾代码的易用性，新增一个封装了默认依赖的构造函数
    public MetricsCollector() {
        this(new RedisMetricsStorage());
    }

    // 用一个函数代替了最小原型中的两个函数
    public void recordRequest(RequestInfo requestInfo) {
        if (requestInfo == null || StringUtils.isBlank(requestInfo.getApiName())) {
            return;
        }
        eventBus.post(requestInfo);
    }

    public class EventListener {
        @Subscribe
        public void saveRequestInfo(RequestInfo requestInfo) {
            metricsStorage.saveRequestInfo(requestInfo);
        }
    }
}
