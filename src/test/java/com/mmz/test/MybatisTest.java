package com.mmz.test;

import com.mmz.dao.UserDao;
import com.mmz.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Classname MybatisTest
 * @Description TODO
 * @Date 2020/5/4 21:35
 * @Created by mmz
 */
public class MybatisTest {
    @Test
    public void testFindAll() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder   sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.findAll();
        for(User user : users){
            System.out.println(user);
        }
        sqlSession.close();
        inputStream.close();
    }
}
