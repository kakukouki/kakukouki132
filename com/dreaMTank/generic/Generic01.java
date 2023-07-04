package com.dreaMTank.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Generic01 {
    public static void main(String[] args) {
        HashMap<String, Student> stringStudentHashMap = new HashMap<String, Student>( );
        stringStudentHashMap.put(new Student("jack", 23).getName(),new Student("jack", 23));
        stringStudentHashMap.put(new Student("john", 22).getName(),new Student("john", 22));
        stringStudentHashMap.put(new Student("marry", 24).getName(),new Student("marry", 24));

        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next = iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }

    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}