package designpattern.principles.openClosed.buttondialer.buttondialer_bad;

/**
 * @author fengsy
 * @date 4/12/20
 */
public class Dialer {

    public void enterDigit(int token) {
        System.out.println("enter digit: " + token);
    }

    public void dial() {
        System.out.println("dialing...");
    }
}
