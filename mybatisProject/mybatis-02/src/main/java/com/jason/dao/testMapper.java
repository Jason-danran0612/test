package com.jason.dao;

import com.jason.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname testMapper
 * @Description TODO
 * @Date 2020/5/13 17:01
 * @Created by ASUS
 */
public interface testMapper {
    /*
    本质：java反射机制
    原理：动态代理Proxy
    可以编辑简单的sql语句，实现简单的增删改查
    @Param("name")定义获取数据#{name}:基本类型和String 类型一定要加上，引用类型可以不加
    ${}:可以获取数据，但是不安全，容易sql注入
    #{}：可以防止sql注入
    */
    @Select("select * from mybatis.user where id = #{id}")
    User getUserById(@Param("id") int id);
    @Select("select * from mybatis.user where id = #{id} and name = #{name}")
    User getUserByName(@Param("id") int id,@Param("name") String name);
}
