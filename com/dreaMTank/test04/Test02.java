package com.dreaMTank.test04;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new A() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 90);
        cellphone.testWork(new A() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 10, 90);
    }
}
interface A{
    double work(double n1, double n2);

}
class Cellphone {
    public void testWork(A a,double n1, double n2){
        double result = a.work(n1, n2);
        System.out.println("计算后的结果 = " + result);
    }



}

