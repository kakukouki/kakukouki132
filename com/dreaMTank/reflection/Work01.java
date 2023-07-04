package com.dreaMTank.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Work01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {

        Class priclass = Class.forName("com.dreaMTank.reflection.PrivateTest");
//        Class<PrivateTest> privateTestClass = PrivateTest.class;
        Object o = priclass.newInstance();
        Field name = priclass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "marry");

        Method getName = priclass.getMethod("getName");
        System.out.println(getName.invoke(o));
    }
}

class PrivateTest{
    private String name = "hellokitty";
    public String getName(){
        return name;
    }
}