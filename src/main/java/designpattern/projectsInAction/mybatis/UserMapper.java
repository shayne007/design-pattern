package designpattern.projectsInAction.mybatis;

// 2. 定义访问接口
public interface UserMapper {
    public UserDo selectById(String id);
}