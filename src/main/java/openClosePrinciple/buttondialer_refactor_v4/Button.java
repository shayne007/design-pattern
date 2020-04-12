package openClosePrinciple.buttondialer_refactor_v4;

import java.util.LinkedList;
import java.util.List;

/**
 * @author fengsy
 * @date 4/12/20
 *
 */
abstract class Button {

    private List<ButtonListener> buttonListenerList;

    public Button(){
        this.buttonListenerList = new LinkedList<>();
    }

    public void addListener(ButtonListener buttonListener){
        assert buttonListener != null;
        buttonListenerList.add(buttonListener);
    }

    /** subclass implements this method to expand
     * */
    abstract void onPress();

    /** template method
     * */
    public void press(){
        onPress();
        for (ButtonListener buttonListener : buttonListenerList){
            buttonListener.buttonPress();
        }
    }

}
