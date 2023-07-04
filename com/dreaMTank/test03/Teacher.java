package com.dreaMTank.test03;

public class Teacher extends Person {
    private int workage;
    public void teach(){
        System.out.println("我承诺，我会认真教学");
    }
    @Override
    public String play() {
        return super.play() + "象棋";
    }
    public void teacherInfo(){
        System.out.println("老师信息如下：");
        System.out.println(basicInfo());
        System.out.println("教龄：" + getWorkage());
        teach();
        System.out.println(play());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "workage=" + workage +
                '}' + super.toString();
    }

    public Teacher(String name, char sex, int age, int workage) {
        super(name, sex, age);
        this.workage = workage;
    }

    public int getWorkage() {
        return workage;
    }

    public void setWorkage(int workage) {
        this.workage = workage;
    }
}
