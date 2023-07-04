package com.dreaMTank.threaduse.ticket;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Ticket extends Thread {
    public static void main(String[] args) {
//        SellTicket01 sellTicket01 = new SellTicket01();
//        SellTicket01 sellTicket02 = new SellTicket01();
//        SellTicket01 sellTicket03 = new SellTicket01();
//        sellTicket01.start();
//        sellTicket02.start();
//        sellTicket03.start();
//        SellTicket02 sellTicket01 = new SellTicket02();
//        SellTicket02 sellTicket02 = new SellTicket02();
//        SellTicket02 sellTicket03 = new SellTicket02();
//        Thread thread01 = new Thread(sellTicket01);
//        Thread thread02 = new Thread(sellTicket02);
//        Thread thread03 = new Thread(sellTicket03);
//        thread01.start();
//        thread02.start();
//        thread03.start();
//        try {
//            Thread.sleep(3 * 1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        sellTicket01.setLoop(false);
//        sellTicket02.setLoop(false);
//        sellTicket03.setLoop(false);
        SellTicket03 sellTicket03 = new SellTicket03();
        SellTicket03 sellTicket04 = new SellTicket03();
        SellTicket03 sellTicket05 = new SellTicket03();
        new Thread(sellTicket03).start();
        new Thread(sellTicket04).start();
        new Thread(sellTicket05).start();

    }
}
class SellTicket03 implements Runnable{
    private  int ticketNum = 100;
    private  boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    public  synchronized void sell(){
        while(loop){
            if (ticketNum <= 0){
                System.out.println("售票结束。。。");
                loop = false;
                return;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" + " 剩余票数" + (--ticketNum));
        }
    }
    @Override
    public  void  run() {
       sell();
    }
}
class SellTicket01 extends Thread{
    private static int ticketNum = 100;
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(loop){
            if (ticketNum <= 0){
                System.out.println("售票结束。。。");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" + " 剩余票数" + (--ticketNum));
        }
    }
}
class SellTicket02 implements Runnable{
    private  int ticketNum = 100;
    private  boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while(loop){
            if (ticketNum <= 0){
                System.out.println("售票结束。。。");
                break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + "售出一张票" + " 剩余票数" + (--ticketNum));
        }
    }
}