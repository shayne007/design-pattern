package designpattern.projectsInAction.metrics.v4;

import java.util.ArrayList;
import java.util.List;

import designpattern.projectsInAction.metrics.v4.report.ConsoleReporter;
import designpattern.projectsInAction.metrics.v4.report.EmailReporter;

/**
 * @author fengsy
 * @date 3/5/21
 * @Description
 */

public class PerfCounterTest {
    public static void main(String[] args) {
        ConsoleReporter consoleReporter = new ConsoleReporter();
        consoleReporter.startRepeatedReport(60, 60);

        List<String> emailToAddresses = new ArrayList<>();
        emailToAddresses.add("wangzheng@xzg.com");
        EmailReporter emailReporter = new EmailReporter(emailToAddresses);
        emailReporter.startDailyReport();

        MetricsCollector collector = new MetricsCollector();
        collector.recordRequest(new RequestInfo("register", 123, 10234));
        collector.recordRequest(new RequestInfo("register", 223, 11234));
        collector.recordRequest(new RequestInfo("register", 323, 12334));
        collector.recordRequest(new RequestInfo("login", 23, 12434));
        collector.recordRequest(new RequestInfo("login", 1223, 14234));

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}