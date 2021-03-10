package designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v1;

/**
 * @author fengsy
 * @date 4/12/20
 */
public class Dialer implements ButtonServer {
    public final static int SEND_BUTTON = -99;

    public void enterDigit(int token) {
        System.out.println("enter dial digit: " + token);
    }

    public void dial() {
        System.out.println("dialing...");
    }

    @Override
    public void buttonPress(int token) {
        switch (token) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                enterDigit(token);
                break;
            case SEND_BUTTON:
                dial();
                break;
            default:
                throw new UnsupportedOperationException("Unknown button pressed");
        }
    }
}
