package com.jason.dao;

import com.jason.pojo.Student;
import com.jason.pojo.User;
import com.jason.utils.MybatisUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void startGame(){

    }
//    使用的是注解进行查询，注解开发的底层是反射机制
    @Test
    public void getUserById_1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        testMapper mapper = sqlSession.getMapper(testMapper.class);
//        mapper 是动态代理对象
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
//    map的方式进行使用mybatis
    @Test
    public void addUser_1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id",104);
        map.put("name","mike");
        map.put("pwd","sldhgl") ;
        mapper.addUser_1(map);
        sqlSession.commit();
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
    @Test
    public void getStudentList() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
    @Test
    public void getStudentList_1() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList_1();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }


}
