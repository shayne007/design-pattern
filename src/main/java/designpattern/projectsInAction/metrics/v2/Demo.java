package designpattern.projectsInAction.metrics.v2;

import designpattern.projectsInAction.metrics.v2.report.ConsoleReporter;
import designpattern.projectsInAction.metrics.v2.report.EmailReporter;
import designpattern.projectsInAction.metrics.v2.storage.MetricsStorage;
import designpattern.projectsInAction.metrics.v2.storage.RedisMetricsStorage;

/**
 * @author fengsy
 * @date 3/5/21
 * @Description
 */

public class Demo {
    public static void main(String[] args) {
        MetricsStorage storage = new RedisMetricsStorage();
        ConsoleReporter consoleReporter = new ConsoleReporter(storage);
        consoleReporter.startRepeatedReport(60, 60);

        EmailReporter emailReporter = new EmailReporter(storage);
        emailReporter.addToAddress("wangzheng@xzg.com");
        emailReporter.startDailyReport();

        MetricsCollector collector = new MetricsCollector(storage);
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