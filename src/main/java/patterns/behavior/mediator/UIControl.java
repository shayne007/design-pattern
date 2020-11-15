package patterns.behavior.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author fengsy
 * @date 11/12/20
 * @Description
 */
public class UIControl {
    private static final String LOGIN_BTN_ID = "login_btn";
    private static final String REG_BTN_ID = "reg_btn";
    private static final String USERNAME_INPUT_ID = "username_input";
    private static final String PASSWORD_INPUT_ID = "pswd_input";
    private static final String REPEATED_PASSWORD_INPUT_ID = "repeated_pswd_input";
    private static final String HINT_TEXT_ID = "hint_text";
    private static final String SELECTION_ID = "selection";

    public static void main(String[] args) {
        Button loginButton = (Button) findViewById(LOGIN_BTN_ID);
        Button regButton = (Button) findViewById(REG_BTN_ID);
        Button usernameInput = (Button) findViewById(USERNAME_INPUT_ID);
        Button passwordInput = (Button) findViewById(PASSWORD_INPUT_ID);
        Button repeatedPswdInput = (Button) findViewById(REPEATED_PASSWORD_INPUT_ID);
        Button hintText = (Button) findViewById(HINT_TEXT_ID);
        Button selection = (Button) findViewById(SELECTION_ID);

        Mediator dialog = new LandingPageDialog();
        ((LandingPageDialog) dialog).setLoginButton(loginButton);
        ((LandingPageDialog) dialog).setRegButton(regButton);
        ((LandingPageDialog) dialog).setUsernameInput(usernameInput);
        ((LandingPageDialog) dialog).setPasswordInput(passwordInput);
        ((LandingPageDialog) dialog).setRepeatedPswdInput(repeatedPswdInput);
        ((LandingPageDialog) dialog).setHintText(hintText);
        ((LandingPageDialog) dialog).setSelection(selection);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.handleEvent(loginButton, "click");
            }
        });
        regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.handleEvent(regButton, "click");
            }
        });

        //....
    }

    private static Object findViewById(String loginBtnId) {
        return new Button();
    }
}
