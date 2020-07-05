package com.jason.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @Classname IDUtils
 * @Description TODO
 * @Date 2020/5/26 19:10
 * @Created by ASUS
 */
public class IDUtils {
    public static String getRandomID(){
        return UUID.randomUUID().toString().replace("-","");
    }
    @Test
    public void test(){
        System.out.println(IDUtils.getRandomID());
        System.out.println(IDUtils.getRandomID());
        System.out.println(IDUtils.getRandomID());
        System.out.println(IDUtils.getRandomID());
    }
}
