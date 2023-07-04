package com.dreaMTank.interfaces;

public class JieKou {
    public static void main(String[] args) {
     int n1 = IA.n1;

    }
}

interface IA extends IB{
    int n1 = 10;
    public static final int n2 = 20;
    void say();
    void hi();
}
abstract class Animal implements IA{

}
class Cat implements IA{

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}