package designpattern.patterns.structure.composite;

/**
 * @author fengsy
 * @date 6/24/20
 * @Description
 */
public class Client {
    public static void main(String[] args) {
        Button loginButton = new Button("登录");
        Button registerButton = new Button("注册");
        Picture logo = new Picture("LOGO图片");
        Label usernameLabel = new Label("用户名");
        Label passwordLabel = new Label("密码");
        TextBox textBox = new TextBox("文本框");
        TextBox rememberUsername = new TextBox("记住用户名");
        PasswordBox passwordBox = new PasswordBox("密码框");
        CheckBox checkBox = new CheckBox("复选框");
        Linkable forgotPassword = new Linkable("忘记密码");
        Frame frame = new Frame("FRAME1");
        frame.addComponent(usernameLabel);
        frame.addComponent(textBox);
        frame.addComponent(passwordLabel);
        frame.addComponent(passwordBox);
        frame.addComponent(checkBox);
        frame.addComponent(rememberUsername);
        frame.addComponent(forgotPassword);

        Frame win = new Frame("WINDOW窗口");
        win.addComponent(logo);
        win.addComponent(frame);
        win.addComponent(loginButton);
        win.addComponent(registerButton);

        win.print();
    }
}
