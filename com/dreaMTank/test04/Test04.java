package com.dreaMTank.test04;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Test04 {
    public static void main(String[] args) {
        Car car = new Car(41.1);
        car.new Air().flow();
        new Car(-1.3).new Air().flow();
        new Car(25).new Air().flow();
    }
}

class Car{
    private double tem;
    public Car(double tem) {
        this.tem = tem;
    }
    class Air{
        public void flow(){
            if (tem > 40.0){
                System.out.println("正在吹冷气。。。");
            }else if(tem < 0){
                System.out.println("正在吹暖气。。。");
            } else {
                System.out.println("关闭空调");
            }

        }
    }


}