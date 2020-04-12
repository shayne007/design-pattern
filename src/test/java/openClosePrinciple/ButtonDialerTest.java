package openClosePrinciple;

import openClosePrinciple.buttondialer_refactor_v1.Button;
import openClosePrinciple.buttondialer_refactor_v1.ButtonServer;
import openClosePrinciple.buttondialer_refactor_v1.Dialer;
import openClosePrinciple.buttondialer_refactor_v1.Locker;
import openClosePrinciple.buttondialer_refactor_v2.DigitButtonDailerAdapter;
import org.junit.Test;

/**
 * @author fengsy
 * @date 4/12/20
 * @Description
 */
public class ButtonDialerTest {
    @Test
    public void testV1(){
        ButtonServer buttonServer = new Dialer();
        Button button1= new Button(1,buttonServer);
        button1.press();

    }
    @Test
    public void testV1Locker(){
        ButtonServer buttonServer = new Locker();
        Button button1= new Button(1,buttonServer);
        button1.press();

    }


}
