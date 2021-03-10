package designpattern.principles.openClosed.buttondialer.buttondialer_bad;

/**
 * @author fengsy
 * @date 4/12/20
 */
public class Button {
    public final static int SEND_BUTTON = -99;

    /**
     * 拨号器依赖
     */
    private Dialer dialer;
    /**
     * 按键的标记属性：数字0-9，*，#，拨号send，等
     */
    private int token;

    public Button(int token, Dialer dialer) {
        this.token = token;
        this.dialer = dialer;
    }

    public void press() {
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
                dialer.enterDigit(token);
                break;
            case SEND_BUTTON:
                dialer.dial();
                break;
            default:
                throw new UnsupportedOperationException("Unknown button pressed");
        }

    }
}
