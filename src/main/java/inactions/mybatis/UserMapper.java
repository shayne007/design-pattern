package inactions.mybatis;

// 2. 定义访问接口
public interface UserMapper {
    public UserDo selectById(long id);
}