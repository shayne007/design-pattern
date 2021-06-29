package designpattern.patterns.structure.bridge.alert_better.sender;

import java.util.List;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */
public class WechartMsgSender implements MsgSender {
    private List<String> wechartIds;

    public WechartMsgSender(List<String> wechartIds) {
        this.wechartIds = wechartIds;
    }

    @Override
    public void send(String message) {
        // ...
    }

}