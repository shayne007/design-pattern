package designpattern.inactions.metrics.v4.report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import designpattern.inactions.metrics.v4.RequestStat;

/**
 * @author fengsy
 * @date 3/7/21
 * @Description
 */
public class EmailViewer implements StatViewer {
    private EmailSender emailSender;
    private List<String> toAddresses = new ArrayList<>();

    public EmailViewer() {
        this.emailSender = new EmailSender(/*省略参数*/);
    }

    public EmailViewer(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public EmailViewer(List<String> toAddresses) {
        this.toAddresses = toAddresses;
    }

    public void addToAddress(String address) {
        toAddresses.add(address);
    }

    @Override
    public void output(Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {
        // format the requestStats to HTML style.
        // send it to email toAddresses.
    }
}