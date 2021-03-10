package designpattern.principles.interfaceSegregation.user.backend;

public interface RestrictUserService {
    boolean deleteUserByCellphone(String cellphone);

    boolean deleteUserById(long id);
}
