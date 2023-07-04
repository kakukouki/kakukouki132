package com.dreaMTank.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Collection_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("jjj", 12));
        list.add(new Dog("hhh", 6));
        list.add(new Dog("yyy",7));
        for (Object o :
                list) {
            System.out.println("dog = " + o);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println("dog = " + o);
        }
    }
}
class Dog{
    private String name ;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

