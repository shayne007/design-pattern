package openClosePrinciple.buttondialer_refactor_v3;


/**
 * @author fengsy
 * @date 4/12/20
 * @Description
 */

public class Phone {
    private Dialer   dialer;
    private Button[] digitButtons;
    private Button   sendButton;

    public Phone() {
        dialer = new Dialer();
        digitButtons = new Button[10];
        for (int i = 0; i < digitButtons.length; i++) {
            digitButtons[i] = new Button();
            final int digit = i;
            digitButtons[i].addListener(() -> dialer.enterDigit(digit));
        }
        sendButton = new Button();
        sendButton.addListener(() -> dialer.dial());

    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.digitButtons[9].press();
        phone.digitButtons[1].press();
        phone.digitButtons[1].press();
        phone.sendButton.press();
    }
}