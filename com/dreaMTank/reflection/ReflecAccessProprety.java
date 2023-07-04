package com.dreaMTank.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class ReflecAccessProprety {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class stuClass = Class.forName("com.dreaMTank.reflection.Student");
        Object o = stuClass.newInstance();
        Field age = stuClass.getField("age");
        age.set(o, 88);
        System.out.println(o);
        System.out.println(age.get(o));

        Field name = stuClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o, "ghj");
        System.out.println(o);
        name.set(null, "jhg");
        System.out.println(name.get(null));

        Method hi = stuClass.getDeclaredMethod("hi", String.class);
        hi.invoke(o, "ghjghj");
        Method say = stuClass.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);
//        System.out.println(say.invoke(o, 12, "ghj", 'm'));
        System.out.println(say.invoke(null, 12, "ghj", 'm'));
    }
}
class Student{
    public int age;
    private static String name;

    public Student(){
    }

    @Override
    public String toString() {
        return "Student{ age=" + age + ", name=" + name + "}";
    }

    private static String say(int n, String s, char c){
        return n + " " + s + " " + c;
    }

    public void hi(String s){
        System.out.println("hi " + s);
    }
}