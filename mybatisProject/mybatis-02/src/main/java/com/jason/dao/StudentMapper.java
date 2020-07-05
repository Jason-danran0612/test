package com.jason.dao;

import com.jason.pojo.Student;

import java.util.List;

/**
 * @Classname StudentMapper
 * @Description TODO
 * @Date 2020/5/13 19:16
 * @Created by ASUS
 */
public interface StudentMapper {
//    get the student list with the teacher's information
    List<Student> getStudentList() ;
    List<Student> getStudentList_1() ;
}
