package com.lagou.test;

import com.lagou.dao.IUserDao;
import  com.lagou.io.Resources;
import com.lagou.pojo.User;
import com.lagou.sqlSession.SqlSession;
import com.lagou.sqlSession.SqlSessionFactory;
import com.lagou.sqlSession.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class IPersistenceTest {
    @Test
    public void test() throws Exception {

        InputStream resourceAsSteam = Resources.getResourceAsSteam("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //调用
        User user = new User();
        user.setId(1);
        user.setUsername("aaa");

//
//        List<User> user2 = sqlSession.selectList("user.selectList");
//        for (User user1 : user2) {
//
//            System.out.println(user1);
//        }
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> all = userDao.findAll();
        User user2 = userDao.findByCondition(user);
        System.out.println(all);

    }
}
