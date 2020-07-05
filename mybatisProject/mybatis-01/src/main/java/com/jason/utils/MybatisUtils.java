package com.jason.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname MybatisUtils
 * @Description TODO
 * @Date 2020/5/11 17:44
 * @Created by ASUS
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
//    静态初始块
    static {

        InputStream inputStream ;
//        获取sqlSessionFactory对象
        try {
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
        既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
        SqlSession 提供了在数据库执行 SQL 命令所需的所有方法。你可以通过 SqlSession
        实例来直接执行已映射的 SQL 语句
     */
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
