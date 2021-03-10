package designpattern.principles.dry;

/**
 * @author fengsy
 * @date 3/4/21
 * @Description
 */
public class UserServiceV2 {
    private UserRepoV2 userRepo;// 通过依赖注入或者IOC框架注入

    public User login(String email, String password) {
        if (!EmailValidation.validate(email)) {
            // ... throw InvalidEmailException...
        }

        if (!PasswordValidation.validate(password)) {
            // ... throw InvalidPasswordException...
        }

        User user = userRepo.getUserByEmail(email);

        if (user == null || !password.equals(user.getPassword())) {
            // ... throw AuthenticationFailureException...
        }
        return user;
    }
}

class UserRepoV2 {
    public boolean checkIfUserExisted(String email, String password) {

        // ...query db to check if email&password exists...
        return false;
    }

    public User getUserByEmail(String email) {

        // ...query db to get user by email...
        return new User();
    }
}
