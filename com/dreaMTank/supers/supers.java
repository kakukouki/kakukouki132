package com.dreaMTank.supers;

public class supers {
    public static void main(String[] args){
        Person jack = new Person("jack" , 10);
        jack.setName("ghj");//setName依旧可以在类外部修改private属性，那set get意义是什么？
        jack.setAge(50);
        System.out.println(jack.callSay());

        Student marry = new Student("marry" , 29 , "ghj" ,100);
        System.out.println(marry.callSay());

    }
}
class Person{//class类都写在一个class里
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String say(){
        return "name: " + name + "age: " + age;
    }
    public String callSay(){
       return this.say();
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
class Student extends Person{
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    private String say(){
        return super.callSay() + "id: " + id + "score: " + score;
    }
    public String callSay(){
        return this.say();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }


}
