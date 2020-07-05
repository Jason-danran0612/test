package com.jason.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Classname Teacher
 * @Description TODO
 * @Date 2020/5/13 19:12
 * @Created by ASUS
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
