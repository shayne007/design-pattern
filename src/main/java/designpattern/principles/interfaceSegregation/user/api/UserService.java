package designpattern.principles.interfaceSegregation.user.api;

import designpattern.principles.interfaceSegregation.user.backend.UserInfo;

public interface UserService {
    boolean register(String cellphone, String password);

    boolean login(String cellphone, String password);

    UserInfo getUserInfoById(long id);

    UserInfo getUserInfoByCellphone(String cellphone);
}
