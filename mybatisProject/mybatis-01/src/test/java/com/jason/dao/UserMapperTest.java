package com.jason.dao;

import com.jason.pojo.User;
import com.jason.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname UserMapperTest
 * @Description TODO
 * @Date 2020/5/11 20:03
 * @Created by ASUS
 */
public class UserMapperTest {
    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUsers = mapper.getAllUsers();
        for (User user : allUsers) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void geUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(101);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(102,"胡浩","1234566")) ;
        sqlSession.commit();//提交事务
        sqlSession.close();
    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(101,"com.jason","123")) ;
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserById(102);
        sqlSession.commit();
        sqlSession.close();
    }
}
