package com.dreaMTank.threaduse;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Thread02 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}
class Dog implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫。。。hi" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}