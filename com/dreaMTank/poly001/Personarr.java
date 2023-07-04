package com.dreaMTank.poly001;

public class Personarr {
    public static void main(String[] args) {
        Person[] pp = new Person[5];
        pp[0] = new Person("jack" ,20);
        pp[1] = new Student("mike" , 27,99);
        pp[2] = new Student("marry" , 39, 89.9);
        pp[3] = new Teacher("may", 67, 60000);
        pp[4] = new Teacher("kite", 56, 50000);
        for (int i = 0; i < pp.length; i++){
           System.out.println( pp[i].say());
           if (pp[i] instanceof Student){
               ((Student)pp[i]).study();
           }else if (pp[i] instanceof Teacher){
               ((Teacher)pp[i]).teach();
           } else if (pp[i] instanceof Person) {

           }else {
               System.out.println("erro! ");
           }
        }

    }
}
