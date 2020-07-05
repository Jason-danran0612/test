package com.jason.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Classname Blog
 * @Description TODO
 * @Date 2020/5/26 19:14
 * @Created by ASUS
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date create_time;
    private int views;
}
