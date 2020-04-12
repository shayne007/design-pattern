package openClosePrinciple;

import openClosePrinciple.buttondialer_refactor_v2.Button;
import openClosePrinciple.buttondialer_refactor_v2.ButtonServer;
import openClosePrinciple.buttondialer_refactor_v2.Dialer;
import openClosePrinciple.buttondialer_refactor_v2.DigitButtonDailerAdapter;
import openClosePrinciple.buttondialer_refactor_v2.SendButtonDailerAdapter;
import org.junit.Test;

/**
 * @author fengsy
 * @date 4/12/20
 * @Description
 */
public class ButtonDialerV2Test {


    @Test
    public void testV2Digit(){
        ButtonServer buttonServer = new DigitButtonDailerAdapter(new Dialer());
        Button button1= new Button(1,buttonServer);
        button1.press();

    }
    @Test
    public void testV2Send(){
        ButtonServer buttonServer = new SendButtonDailerAdapter(new Dialer());
        Button button1= new Button(-99,buttonServer);
        button1.press();
        new Button(10,new DigitButtonDailerAdapter(new Dialer())).buttonServer.buttonPress(10);

    }
}
