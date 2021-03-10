package designpattern.patterns.behavior.mediator;

import java.awt.*;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class LandingPageDialog implements Mediator {
    private Button loginButton;
    private Button regButton;
    private Button selection;
    private Button usernameInput;
    private Button passwordInput;
    private Button repeatedPswdInput;
    private Button hintText;

    void setLoginButton(Button loginButton) {

    }

    void setRegButton(Button regButton) {

    }

    void setPasswordInput(Button passwordInput) {

    }

    void setHintText(Button hintText) {

    }

    void setUsernameInput(Button usernameInput) {

    }

    void setRepeatedPswdInput(Button repeatedPswdInput) {

    }

    void setSelection(Button selection) {

    }

    @Override
    public void handleEvent(Component component, String event) {
        if (component.equals(loginButton)) {
            String username = usernameInput.getLabel();
            String password = passwordInput.getLabel();
            //校验数据...
            //做业务处理...
        } else if (component.equals(regButton)) {
            //获取usernameInput、passwordInput、repeatedPswdInput数据...
            //校验数据...
            //做业务处理...
        } else if (component.equals(selection)) {
            String selectedItem = selection.getLabel();
            if (selectedItem.equals("login")) {
                usernameInput.show();
                passwordInput.show();
                repeatedPswdInput.hide();
                hintText.hide();
                //...省略其他代码
            } else if (selectedItem.equals("register")) {
                //....
            }
        }
    }
}

