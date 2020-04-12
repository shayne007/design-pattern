package openClosePrinciple.buttondialer_refactor_v1;

/**
 * @author fengsy
 * @date 4/12/20
 *
 */
public interface ButtonServer {
    /**
     * purpose not null
     *
     * @param token 按键标记
     * */
    void buttonPress(int token);
}
