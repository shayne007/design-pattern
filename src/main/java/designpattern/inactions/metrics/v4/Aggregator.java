package designpattern.inactions.metrics.v4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fengsy
 * @date 3/5/21
 * @Description
 */

public class Aggregator {
    public Map<String, RequestStat> aggregate(Map<String, List<RequestInfo>> requestInfos, long durationInMillis) {
        Map<String, RequestStat> requestStats = new HashMap<>();
        for (Map.Entry<String, List<RequestInfo>> entry : requestInfos.entrySet()) {
            String apiName = entry.getKey();
            List<RequestInfo> requestInfosPerApi = entry.getValue();
            RequestStat requestStat = doAggregate(requestInfosPerApi, durationInMillis);
            requestStats.put(apiName, requestStat);
        }
        return requestStats;
    }

    private RequestStat doAggregate(List<RequestInfo> requestInfos, long durationInMillis) {
        List<Double> respTimes = new ArrayList<>();
        for (RequestInfo requestInfo : requestInfos) {
            double respTime = requestInfo.getResponseTime();
            respTimes.add(respTime);
        }

        RequestStat requestStat = new RequestStat();
        requestStat.setMaxResponseTime(max(respTimes));
        requestStat.setMinResponseTime(min(respTimes));
        requestStat.setAvgResponseTime(avg(respTimes));
        requestStat.setP999ResponseTime(percentile999(respTimes));
        requestStat.setP99ResponseTime(percentile99(respTimes));
        requestStat.setCount(respTimes.size());
        requestStat.setTps((long)tps(respTimes.size(), durationInMillis / 1000));
        return requestStat;
    }

    // 以下的函数的代码实现均省略...
    private double max(List<Double> dataset) {
        double maxRespTime = Double.MIN_VALUE;
        for (Double respTime : dataset) {
            if (maxRespTime < respTime) {
                maxRespTime = respTime;
            }
        }
        return maxRespTime;
    }

    private double min(List<Double> dataset) {
        double minRespTime = Double.MAX_VALUE;
        for (Double respTime : dataset) {
            if (minRespTime > respTime) {
                minRespTime = respTime;
            }
        }
        return minRespTime;
    }

    private double avg(List<Double> dataset) {
        double avgRespTime = -1;
        double sumRespTime = 0;
        long count = 0;
        for (Double respTime : dataset) {
            ++count;
            sumRespTime += respTime;
        }
        if (count != 0) {
            avgRespTime = sumRespTime / count;
        }
        return avgRespTime;
    }

    private double tps(int count, double duration) {
        long tps = (long)(count / duration * 1000);
        return tps;
    }

    private double percentile999(List<Double> dataset) {
        long count = dataset.size();
        double p999RespTime = -1;
        int idx999 = (int)(count * 0.999);
        sortInc(dataset);

        if (count != 0) {
            p999RespTime = dataset.get(idx999);
        }
        return p999RespTime;
    }

    private double percentile99(List<Double> dataset) {
        long count = dataset.size();
        double p99RespTime = -1;
        int idx99 = (int)(count * 0.999);
        sortInc(dataset);

        if (count != 0) {
            p99RespTime = dataset.get(idx99);
        }
        return p99RespTime;
    }

    private void sortInc(List<Double> dataset) {
        Collections.sort(dataset, new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                double diff = o1 - o2;
                if (diff < 0.0) {
                    return -1;
                } else if (diff > 0.0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

}