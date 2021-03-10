package designpattern.principles.openClosed.buttondialer.buttondialer_refactor_v3;

import java.util.LinkedList;
import java.util.List;

/**
 * @author fengsy
 * @date 4/12/20
 */
public class Button {

    private List<ButtonListener> buttonListenerList;

    public Button() {
        this.buttonListenerList = new LinkedList<>();
    }

    public void addListener(ButtonListener buttonListener) {
        assert buttonListener != null;
        buttonListenerList.add(buttonListener);
    }

    public void press() {
        for (ButtonListener buttonListener : buttonListenerList) {
            buttonListener.buttonPress();
        }
    }

}
