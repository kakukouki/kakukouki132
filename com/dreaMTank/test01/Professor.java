package com.dreaMTank.test01;

public class Professor extends Teacher {

    public Professor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }

    @Override
    public void introduce() {
        System.out.println("这是教授的信息：");
        super.introduce();
    }
}
