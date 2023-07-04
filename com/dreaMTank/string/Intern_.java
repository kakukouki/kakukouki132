package com.dreaMTank.string;

import java.util.Arrays;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Intern_ {
    public static void main(String[] args) {
        String s1 = "ghjghj";
        Animal a = new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a == b);   //false
        System.out.println(a.equals(b));   //false
        System.out.println(a.name == b.name);    //true
        String s4 = new String("ghjghj");
        String s5 = "ghjghj";
        System.out.println(s1 == s4);  //false
        System.out.println(s4 == s5);  //false
        String t1 = "hello" + s1;
        String t2 = "helloghjghj";
        System.out.println(t1.intern() == t2);  //true
    }
}
class Animal{
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Integer[] arr1 = Arrays.copyOf(arr, arr.length);
        for (Integer num:arr1
        ) {
            System.out.println(num);
        }

        Integer[] num = new Integer[]{9,3,2};
        Arrays.fill(num, 99);
        for (Integer p:num
             ) {
            System.out.println(p);
        }



    }
    String name;
    public Animal(String name){
        this.name = name;
        

        
    }
}