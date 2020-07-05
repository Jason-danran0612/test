package com.jason;

import com.jason.mapper.BlogMapper;
import com.jason.pojo.Blog;
import com.jason.pojo.Student;
import com.jason.utils.IDUtils;
import com.jason.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @Classname MyTest
 * @Date 2020/5/26 19:28
 * @Created by ASUS
 */
public class MyTest {

    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog1 = new Blog(IDUtils.getRandomID(),"java","jason",new Date(),999);
        Blog blog2 = new Blog(IDUtils.getRandomID(),"javaEE","jason1",new Date(),1999);
        Blog blog3 = new Blog(IDUtils.getRandomID(),"javaWeb","jason1",new Date(),9199);
        Blog blog4 = new Blog(IDUtils.getRandomID(),"javaSpring","jason",new Date(),9919);
        mapper.addBlog(blog1);
        mapper.addBlog(blog2);
        mapper.addBlog(blog3);
        mapper.addBlog(blog4);
        sqlSession.commit();//提交事务
        sqlSession.close();
    }

    @Test
    public void getBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map<String , Object> map = new HashMap<>();
        map.put("views",1999);
        List<Blog> blogs = mapper.getBlog(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    
    @Test
    public void studentTest(){
        Student student = new Student("123","123");
        Student student1 = new Student("123","1234");
        Student student2 = new Student("1234","123");
        Student student3 = new Student("123","12345");
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        System.out.println(list.contains(student3));
    }
    
    
    
}
