package com.dreaMTank.test02;

public class manager extends staff{

    @Override
    public void dayin() {
        System.out.println(getSalary() + 1000);
    }

    public manager(String name, double daysalary, int day, double level, double salary) {
        super(name, daysalary, day, level, salary);
    }
}
