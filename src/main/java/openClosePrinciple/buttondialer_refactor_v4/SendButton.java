package openClosePrinciple.buttondialer_refactor_v4;

import java.util.LinkedList;
import java.util.List;

/**
 * @author fengsy
 * @date 4/12/20
 *
 */
public class SendButton extends Button{

    @Override
    void onPress() {
        System.out.println("specific structure for send button");
    }

}
