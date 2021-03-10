package designpattern.principles.dry;

import org.apache.commons.lang3.StringUtils;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */

public class UserAuthenticator {
    public void authenticate(String username, String password) {
        if (!isValidUsername(username)) {
            // ...throw InvalidUsernameException...
        }
        if (!isValidPassword(password)) {
            // ...throw InvalidPasswordException...
        }
        // ...省略其他代码...
    }

    private boolean isValidUsername(String username) {
        // check not null, not empty
        if (StringUtils.isBlank(username)) {
            return false;
        }
        // check length: 4~64
        int length = username.length();
        if (length < 4 || length > 64) {
            return false;
        }
        // contains only lowcase characters
        if (!StringUtils.isAllLowerCase(username)) {
            return false;
        }
        return onlyContains(username);
    }

    private boolean isValidPassword(String password) {
        // check not null, not empty
        if (StringUtils.isBlank(password)) {
            return false;
        }
        // check length: 4~64
        int length = password.length();
        if (length < 4 || length > 64) {
            return false;
        }
        // contains only lowcase characters
        if (!StringUtils.isAllLowerCase(password)) {
            return false;
        }

        return onlyContains(password);
    }

    private boolean onlyContains(String str) {
        // contains only a~z,0~9,dot
        int length = str.length();
        for (int i = 0; i < length; ++i) {
            char c = str.charAt(i);
            if (!(c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '.') {
                return false;
            }
        }
        return true;
    }
}