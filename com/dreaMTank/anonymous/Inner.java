package com.dreaMTank.anonymous;

public class Inner {
    public static void main(String[] args) {

        f1(new A(){
            @Override
            public void show() {
                System.out.println("okok...");
            }
        });




    }
    public static void f1(A a){
        a.show();
    }
}

interface A{
    void show();
}

