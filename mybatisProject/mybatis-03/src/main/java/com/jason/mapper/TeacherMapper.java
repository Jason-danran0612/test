package com.jason.mapper;

import com.jason.pojo.Student;
import com.jason.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Classname TeacherMapper
 * @Description TODO
 * @Date 2020/5/26 17:47
 * @Created by ASUS
 */
public interface TeacherMapper {
//    获得老师的基本信息
    Teacher getTeacher(@Param("tid") int id);
//    获得老师的信息以及所教的学生的集合列表
    List<Student> getTeacherWithStu(@Param("tid") int id);
}
