package com.dreaMTank.anonymous;

public class Anonymous {
    public static void main(String[] args) {
        new Outer05().f1();
        new Outer06().f1();

    }
}

class Outer05{
    private int n1 = 99;

    public void f1(){
//       class Outer05$1 extends Person{}
        er p = new er();
        p.say();
        p.say2();



    }
}

class Outer06{
    private int n1 = 99;

    public void f1(){
//       class Outer05$1 extends Person{}
        Persons p = new Persons(){
            @Override
            public void say() {
                System.out.println("new say2....");
            }

            @Override
            public void hello() {
                System.out.println("new say3....");

            }
        };

        p.say();
    }
}
interface Persons {
    void say();
    void  hello();
}

interface Persons2 {
    void say2();
    void  hello2();
}
class er implements Persons,Persons2{

    @Override
    public void say() {

    }

    @Override
    public void hello() {

    }

    @Override
    public void say2() {

    }

    @Override
    public void hello2() {

    }
}
