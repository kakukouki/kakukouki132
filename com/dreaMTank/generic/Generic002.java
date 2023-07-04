package com.dreaMTank.generic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Generic002 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Employee jack = new Employee("jack", 3000, new MyDate(1998, 02, 07));
        Employee john = new Employee("john", 4000, new MyDate(1997, 03, 17));
        Employee marry = new Employee("marry", 5000, new MyDate(1988, 12, 13));
        employees.add(jack);
        employees.add(john);
        employees.add(marry);
        System.out.println(employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    System.out.println("类型不正确");
                    return  0;
                }
                int i = emp1.getName().compareTo(emp2.getName
                        ());
                if (i != 0){
                    return i;
                }
                 return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });

    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
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
class MyDate{
    private int year;
    private int month;
    private int day;

    public int compareTo(MyDate o){
        int yearMinus = year - o.getYear();
        if (yearMinus != 0){
            return yearMinus;
        }
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0){
            return monthMinus;
        }
        return day - o.getDay();
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
