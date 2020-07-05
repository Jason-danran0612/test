package com.jason;

import com.jason.mapper.TeacherMapper;
import com.jason.pojo.Student;
import com.jason.pojo.Teacher;
import com.jason.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname MyTest
 * @Description TODO
 * @Date 2020/5/26 17:46
 * @Created by ASUS
 */
public class MyTest {
    
    @Test
    public void getTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(100);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void getTeacherWithStu(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        List<Student> teacherWithStu = mapper.getTeacherWithStu(100);
        System.out.println(teacherWithStu);
        sqlSession.close();
    }
}
