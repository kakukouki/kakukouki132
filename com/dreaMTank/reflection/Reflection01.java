package com.dreaMTank.reflection;

import java.lang.reflect.Method;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Reflection01 {
    public static void main(String[] args) throws Exception {

        m1();
        m2();
        m3();
    }

    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            cat.hi();
            
        }
        long end = System.currentTimeMillis();
        System.out.println("m1耗时 = " + (end - start));
    }

    public static void m2() throws Exception{

        Class cls = Class.forName("com.dreaMTank.reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
//        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
           hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2耗时 = " + (end - start));


    }

    public static void m3() throws Exception{

        Class cls = Class.forName("com.dreaMTank.reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m3耗时 = " + (end - start));

    }
}


