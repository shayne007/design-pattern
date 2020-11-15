package principles.openClosed.buttondialer_refactor_v2;

/**
 * @author fengsy
 * @date 4/12/20
 */
public class Button {

    /**
     * 按键的标记属性：数字0-9，*，#，拨号send(-99)，等
     */
    private int token;

    public ButtonServer buttonServer;

    public Button(int token, ButtonServer buttonServer) {
        this.token = token;
        this.buttonServer = buttonServer;
    }

    public void press() {
        buttonServer.buttonPress(token);
    }

}
