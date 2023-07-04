package com.dreaMTank.collection.hashset;

import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee_("jack", 5000, new MyDate(1998, 2, 7)));
        hashSet.add(new Employee_("jack", 5000, new MyDate(1998, 2, 7)));
        System.out.println(hashSet);
    }
}


class Employee_ {

    private String name;
    private double sal;
    private MyDate birthday;

    public Employee_(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee_{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_ employee = (Employee_) o;
        return Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}