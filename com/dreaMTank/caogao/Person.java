package com.dreaMTank.caogao;

public class Person  {
    public static void main(String[] args) {
        Animal pig = new pig();
        pig.say("lll");


    }
}

class Animal{
    public Animal() {
    }
    public void say( String jkl){
        System.out.println(jkl);
    }
}

class pig extends Animal{
    public pig() {
    }

    @Override
    public void say(String jkl) {
        super.say(jkl);
    }
}