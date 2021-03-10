package designpattern.principles.interfaceSegregation.user.backend;

import designpattern.principles.interfaceSegregation.user.api.UserService;

/**
 * @author fengsy
 * @date 3/3/21
 * @Description
 */
public class UserServiceImpl implements UserService, RestrictUserService {
    @Override
    public boolean deleteUserByCellphone(String cellphone) {
        return false;
    }

    @Override
    public boolean deleteUserById(long id) {
        return false;
    }

    @Override
    public boolean register(String cellphone, String password) {
        return false;
    }

    @Override
    public boolean login(String cellphone, String password) {
        return false;
    }

    @Override
    public UserInfo getUserInfoById(long id) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByCellphone(String cellphone) {
        return null;
    }
}
