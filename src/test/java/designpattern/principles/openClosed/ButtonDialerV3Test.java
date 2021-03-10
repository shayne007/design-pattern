package designpattern.principles.openClosed;

import org.junit.Test;

import designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v3.Button;
import designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v3.Dialer;

/**
 * @author fengsy
 * @date 4/12/20
 * @Description
 */
public class ButtonDialerV3Test {

    @Test
    public void testV3Digit() {
        Dialer dialer = new Dialer();
        final int digit = 9;
        Button digit9 = new Button();
        digit9.addListener(() -> dialer.enterDigit(digit));
        digit9.press();

    }

    @Test
    public void testV3Send() {
        Dialer dialer = new Dialer();
        Button sendButton = new Button();
        sendButton.addListener(() -> dialer.dial());
        sendButton.press();
    }
}
