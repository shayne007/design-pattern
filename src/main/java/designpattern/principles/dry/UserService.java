package designpattern.principles.dry;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */
public class UserService {
    private UserRepo userRepo;// 通过依赖注入或者IOC框架注入

    public User login(String email, String password) {
        boolean existed = userRepo.checkIfUserExisted(email, password);
        if (!existed) {
            // ... throw AuthenticationFailureException...
        }
        User user = userRepo.getUserByEmail(email);
        return user;
    }
}

class UserRepo {
    public boolean checkIfUserExisted(String email, String password) {
        if (!EmailValidation.validate(email)) {
            // ... throw InvalidEmailException...
        }

        if (!PasswordValidation.validate(password)) {
            // ... throw InvalidPasswordException...
        }

        // ...query db to check if email&password exists...
        return false;
    }

    public User getUserByEmail(String email) {
        if (!EmailValidation.validate(email)) {
            // ... throw InvalidEmailException...
        }
        // ...query db to get user by email...
        return new User();
    }
}


//
class EmailValidation {
    static boolean validate(String str) {
        return false;
    }
}

class PasswordValidation {
    static boolean validate(String str) {
        return false;
    }
}

class User {
    private String password;

    public String getPassword() {
        return this.password;
    }
}