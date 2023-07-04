package com.dreaMTank.test02;

public class staff {
    private String name;
    private double daysalary;
    private int day;
    private double level;
    private double salary = daysalary*day*level;

    public void dayin(){
        System.out.println(getName() + ":" + salary );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaysalary() {
        return daysalary;
    }

    public void setDaysalary(double daysalary) {
        this.daysalary = daysalary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public staff(String name, double daysalary, int day, double level, double salary) {
        this.name = name;
        this.daysalary = daysalary;
        this.day = day;
        this.level = level;
        this.salary = salary;
    }
}
