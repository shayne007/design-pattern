package designpattern.patterns.structure.bridge.alert_v1.sender;

/**
 * @author fengsy
 * @date 3/11/21
 * @Description
 */

public interface MsgSender {
    void send(String message);
}