package designpattern.inactions.metrics.v4;

import java.util.ArrayList;
import java.util.List;

import designpattern.inactions.metrics.v4.controller.IUserController;
import designpattern.inactions.metrics.v4.controller.UserController;
import designpattern.inactions.metrics.v4.report.ConsoleReporter;
import designpattern.inactions.metrics.v4.report.EmailReporter;
import designpattern.patterns.structure.proxy.dynamicProxy.MetricsCollectorProxy;

/**
 * @author fengsy
 * @date 3/5/21
 * @Description
 */

public class UserControllerTest {
    public static void main(String[] args) {
        ConsoleReporter consoleReporter = new ConsoleReporter();
        consoleReporter.startRepeatedReport(60, 60);

        List<String> emailToAddresses = new ArrayList<>();
        emailToAddresses.add("wangzheng@xzg.com");
        EmailReporter emailReporter = new EmailReporter(emailToAddresses);
        emailReporter.startDailyReport();

        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController = (IUserController)proxy.createProxy(new UserController());
        userController.login("137", "abc");
        userController.register("137", "abc");

        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}