package com.dreaMTank.threaduse.test;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class ThreadTest01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new T());
        t.setDaemon(true);
        t.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("hi " + i);
            Thread.sleep(1000);
//            if (i ==5){
//                t.start();
//                t.join();
//            }
        }
        System.out.println("主线程结束");
    }
}
class T implements Runnable{

    private int num = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("hello" + (++num));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (num == 15){
                break;
            }
        }
        System.out.println("子线程结束");
    }
}

