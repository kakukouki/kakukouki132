package com.dreaMTank.interfaces;

public class test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(AA.a);
        System.out.println(B.a);
    }
}

interface AA{
    int a = 23;
}
class B implements AA{}
