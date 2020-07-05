package com.jason.dao;

import com.jason.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname TeacherMapper
 * @Description TODO
 * @Date 2020/5/13 19:13
 * @Created by ASUS
 */
public interface TeacherMapper {
//    get the list of the teachers in the databases;
    List<Teacher> getTeacherList();
//    get the specialized teacher with the primary key id
    Teacher getTeacherById(@Param("id") int id);
}
