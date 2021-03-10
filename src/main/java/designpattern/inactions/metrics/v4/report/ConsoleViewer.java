package designpattern.inactions.metrics.v4.report;

import java.util.Map;

import com.google.gson.Gson;

import designpattern.inactions.metrics.v4.RequestStat;

/**
 * @author fengsy
 * @date 3/7/21
 * @Description
 */
public class ConsoleViewer implements StatViewer {
    @Override
    public void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {
        System.out.println("Time Span: [" + startTimeInMillis + ", " + endTimeInMills + "]");
        Gson gson = new Gson();
        System.out.println(gson.toJson(requestStats));
    }
}
