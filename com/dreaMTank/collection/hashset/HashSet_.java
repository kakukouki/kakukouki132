package com.dreaMTank.collection.hashset;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack", 23));
        hashSet.add(new Employee("john", 21));
        hashSet.add(new Employee("smith", 22));
        hashSet.add(new Employee("jack", 23));
        System.out.println(hashSet);
    }
}
class Employee{
     private String name;
     private int age;

    public Employee(String name, int age) {
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
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
