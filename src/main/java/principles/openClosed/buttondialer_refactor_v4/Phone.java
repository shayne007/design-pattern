package principles.openClosed.buttondialer_refactor_v4;


/**
 * @author fengsy
 * @date 4/12/20
 * @Description
 */

public class Phone {
    private Dialer dialer;
    private Locker locker;
    private Button[] digitButtons;
    private Button sendButton;

    public Phone() {
        dialer = new Dialer();
        locker = new Locker();
        digitButtons = new Button[10];
        for (int i = 0; i < digitButtons.length; i++) {
            digitButtons[i] = new DigitButton();
            final int digit = i;
            digitButtons[i].addListener(() -> dialer.enterDigit(digit));
        }
        sendButton = new SendButton();
        sendButton.addListener(() -> dialer.dial());
        sendButton.addListener(() -> locker.unlock());

    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.digitButtons[9].press();
        phone.digitButtons[1].press();
        phone.digitButtons[1].press();
        phone.sendButton.press();
    }
}