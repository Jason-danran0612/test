package com.jason.dao;

import com.jason.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2020/5/11 18:20
 * @Created by ASUS
 */
public interface UserMapper {
    /**
     *功能描述：get all the users in the database
     *@Date 2020-05-11 18:20
     */
    List<User> getAllUsers() ;
//    以id获得用户
    User getUserById(int id);
//    添加用户
    int addUser(User user);
    int addUser_1(Map<String,Object> map);
//    修改
    int updateUser(User user);
//    删除
    int deleteUserById(int id);
}
