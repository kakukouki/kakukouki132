package com.dreaMTank.test04;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {

    }
}
class Frock{
    private int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    private static int currentNum = 100000;
    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }
}
class TestFrock{
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());

        System.out.println(new Frock().getSerialNumber());
        System.out.println(new Frock().getSerialNumber());
        System.out.println(new Frock().getSerialNumber());

    }
}