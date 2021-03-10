package designpattern.inactions.metrics.v4.report;

import java.util.Map;

import designpattern.inactions.metrics.v4.RequestStat;

public interface StatViewer {
    void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills);
}
