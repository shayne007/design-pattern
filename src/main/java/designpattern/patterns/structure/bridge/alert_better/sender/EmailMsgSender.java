package designpattern.patterns.structure.bridge.alert_better.sender;

import java.util.List;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class EmailMsgSender implements MsgSender {
    private List<String> telephones;

    public EmailMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        // ...
    }

}