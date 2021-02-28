package inactions.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author fengsy
 * @date 2/23/21
 * @Description
 */

public class MyBatisDemo {
    public static void main(String[] args) throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        UserDo userDo = userMapper.selectById(8);
        // ...
    }
}
