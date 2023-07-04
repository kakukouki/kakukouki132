package com.dreaMTank.reflection;

import com.dreaMTank.test01.Professor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Reflection_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/dreamtank152/Desktop/java/com/dreaMTank01/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println("classfullpath= " + classfullpath);
        System.out.println("meythod= " + method);

        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        System.out.println("o的运行类型是= " + o.getClass());
        Method method1 = cls.getMethod(method);
        method1.invoke(o);



    }
}
