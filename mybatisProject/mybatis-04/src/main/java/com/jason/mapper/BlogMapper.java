package com.jason.mapper;

import com.jason.pojo.Blog;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Classname BlogMapper
 * @Description TODO
 * @Date 2020/5/26 19:16
 * @Created by ASUS
 */
public interface BlogMapper {
//    add a blog
    void addBlog(Blog blog);
//    get the blog with the info that given
    List<Blog> getBlog(Map map);
}
