package designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v3;

/**
 * @author fengsy
 * @date 4/12/20
 */
public class Dialer {
    public void enterDigit(int token) {
        System.out.println("enter dial digit: " + token);
    }

    public void dial() {
        System.out.println("dialing...");
    }

}
