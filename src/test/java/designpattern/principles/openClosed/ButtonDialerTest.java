package designpattern.principles.openClosed;

import org.junit.Test;

import designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v1.Button;
import designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v1.ButtonServer;
import designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v1.Dialer;
import designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v1.Locker;

/**
 * @author fengsy
 * @date 4/12/20
 * @Description
 */
public class ButtonDialerTest {
    @Test
    public void testV1() {
        ButtonServer buttonServer = new Dialer();
        Button button1 = new Button(1, buttonServer);
        button1.press();

    }

    @Test
    public void testV1Locker() {
        ButtonServer buttonServer = new Locker();
        Button button1 = new Button(1, buttonServer);
        button1.press();

    }

}
