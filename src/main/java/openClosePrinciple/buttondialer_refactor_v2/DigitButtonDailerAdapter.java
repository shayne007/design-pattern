package openClosePrinciple.buttondialer_refactor_v2;

/**
 * @author fengsy
 * @date 4/12/20
 * @Description
 */
public class DigitButtonDailerAdapter implements ButtonServer{

    private Dialer dialer;

    public DigitButtonDailerAdapter(Dialer dialer){
        this.dialer = dialer;
    }

    @Override
    public void buttonPress(int token) {
        dialer.enterDigit(token);
    }
}
