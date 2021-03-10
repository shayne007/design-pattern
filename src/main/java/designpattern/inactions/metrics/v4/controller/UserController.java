package designpattern.inactions.metrics.v4.controller;

import designpattern.patterns.structure.proxy.staticProxy.IUserController;

/**
 * @author fengsy
 * @date 5/2/20
 * @Description
 */

public class UserController implements IUserController {
    // ...省略其他属性和方法...
    @Override
    public String login(String telephone, String password) {
        // ... 省略login逻辑...
        System.out.println("login");
        // ...返回UserVo数据...
        return "login userVo";

    }

    @Override
    public String register(String telephone, String password) {
        // ... 省略register逻辑...

        System.out.println("register");
        // ...返回UserVo数据...
        return "register userVo";
    }
}
