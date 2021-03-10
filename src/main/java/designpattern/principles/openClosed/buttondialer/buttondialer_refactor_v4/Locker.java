package designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v4;

/**
 * @author fengsy
 * @date 4/12/20
 */
public class Locker {

    public void enterDigit(int token) {
        System.out.println("enter lock digit: " + token);
    }

    public void unlock() {
        System.out.println("unlocking...");
    }

}
