package com.dreaMTank.test03;

public class Student extends Person{
    private int stuid;
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return super.play() + "足球";
    }
    public void studentInfo(){
        System.out.println("学生信息如下：");
        System.out.println(basicInfo());
        System.out.println("学号：" + getStuid());
        study();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuid=" + stuid +
                '}' + super.toString();
    }

    public Student(String name, char sex, int age, int stuid) {
        super(name, sex, age);
        this.stuid = stuid;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }
}
