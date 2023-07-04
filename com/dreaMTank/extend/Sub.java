package com.dreaMTank.extend;

public class Sub extends Extend01{
    public Sub(){
        System.out.println("sub()....");
    }

    public void sayOk(){
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        callTest400();
        System.out.println("n4=" + getN4());
    }
}
