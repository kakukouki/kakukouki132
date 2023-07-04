package com.dreaMTank.poly;

public class Personarr {
    public static void main(String[] args) {
       Person[] pp =  new Person[5];
       pp[0] = new Person("jack" , 20);
       pp[1] = new Student("mac", 30, 100);
       pp[2] = new Student("marry", 28, 99.8);
       pp[3] = new Teacher("ghj", 25, 30000);
       pp[4] = new Teacher("jhg", 26, 29000);
       for (int i = 0; i < pp.length; i++){
           System.out.println(pp[i].say());
           if (pp[i] instanceof Student) {
               ((Student)pp[i]).study();

           } else if (pp[i] instanceof Teacher) {
               ((Teacher)pp[i]).teach();
           } else if (pp[i] instanceof Person) {

           }else {
               System.out.println("erro!");
           }
       }



    }
}
