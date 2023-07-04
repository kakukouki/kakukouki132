package com.dreaMTank.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {

        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String details = "------------------------零钱通明细----------------------------";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String note = "";


        public void detail(){
            System.out.println(details);
        }
        public void income(){
            System.out.print("收益入账金额：");
            money = scanner.nextDouble();
            if (money <= 0){
                System.out.println("收益入账金额需要大于 0");
                return;
            }
            balance += money;
            date = new Date();
            details += "\n" + "收益入账" + "\t+" + money + "\t" + sdf.format(date) + "\t" +  "余额：" + balance;
        }
        public void pay(){
            System.out.println("消费金额： ");
            money = scanner.nextDouble();
            if (money > balance || money <= 0){
                System.out.println("消费金额应该在0-" + balance);
                return;
            }
            System.out.println("消费说明： ");
            note = scanner.next();
            balance -= money;
            date = new Date();
            details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" +  "余额：" + balance;
        }
        public void exit(){
            String choice ="";
            while(true){
                System.out.println("您确定要退出吗？ y/n");
                choice = scanner.next();
                if("y".equals(choice) || "n".equals(choice)){
                    break;
                }
            }
            if (choice.equals("y")){
                loop = false;
            }


        }

        public void mainMenu(){
            do {
                System.out.println("========================零钱通菜单=========================");
                System.out.println("\t\t\t   1  零钱通明细" );
                System.out.println("\t\t\t   2  收益入账" );
                System.out.println("\t\t\t   3  消费" );
                System.out.println("\t\t\t   4  退     出" );

                System.out.print("请选择（1-4）： ");
                key = scanner.next();

                switch (key){
                    case "1" :
                        this.detail();
                        break;
                    case "2" :
                        this.income();
                        break;
                    case "3" :
                        this.pay();
                       break;
                    case "4" :
                        this.exit();
                       break;
                    default:
                        System.out.println("选择有误，请重新选择");

                }

            }while(loop);
            System.out.println("==========退出了零钱通项目==========");

        }


}
