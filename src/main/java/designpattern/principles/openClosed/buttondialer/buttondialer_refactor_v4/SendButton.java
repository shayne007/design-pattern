package designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v4;

/**
 * @author fengsy
 * @date 4/12/20
 */
public class SendButton extends Button {

    @Override
    void onPress() {
        System.out.println("specific structure for send button");
    }

}
