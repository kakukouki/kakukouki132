package com.dreaMTank.threaduse.test;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class ThreadText03 {
    public static void main(String[] args) {
        CashCard cashCard = new CashCard();
//        CashCard cashCard1 = new CashCard();
        Thread thread1 = new Thread(cashCard);
        thread1.setName("t1");
        Thread thread2 = new Thread(cashCard);
        thread2.setName("t2");
        thread1.start();
        thread2.start();
    }
}
class CashCard implements Runnable{
    private int money = 10000;
    @Override
    public  void run() {
        while(true){

            synchronized (this) {

                if (money < 1000) {
                    System.out.println("余额不足。。。");
                    break;
                }

                money -= 1000;
                System.out.println( Thread.currentThread().getName() + "取出1000元..." + " 余额： " + money);
            }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }


        }
    }
}
