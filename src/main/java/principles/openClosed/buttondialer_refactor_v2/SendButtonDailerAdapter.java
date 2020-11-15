package principles.openClosed.buttondialer_refactor_v2;

/**
 * @author fengsy
 * @date 4/12/20
 * @Description
 */
public class SendButtonDailerAdapter implements ButtonServer {

    private Dialer dialer;

    public SendButtonDailerAdapter(Dialer dialer) {
        this.dialer = dialer;
    }

    @Override
    public void buttonPress(int token) {
        dialer.dial();
    }
}
