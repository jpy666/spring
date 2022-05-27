package com.bupt.mybatis;

import com.bupt.mybatis.mapper.UserMapper;
import com.bupt.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 金培源
 * @Date: 2022/4/24 10:52
 * @Version: 1.0
 * @Description:
 */
public class MybatisTest {
    @Test
    public void testInsertUser() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("config/mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
        SqlSession sqlSession = build.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.insertUser();
        System.out.println(i);
    }
    @Test
    public void testGetUserById() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("config/mybatis-config.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(resourceAsStream);
        SqlSession sqlSession = factory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById();
        System.out.println(userById);
    }
}
