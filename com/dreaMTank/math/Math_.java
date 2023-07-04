package com.dreaMTank.math;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Math_ {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++){
//            System.out.println((int)(2 + Math.random()*(7-2+1)));
//
//            System.out.println(Math.min(67, 90));
//            int max = Math.max(8, 6);
//
//        }


//        int[] ints = {1,78,-8,89,-2,6};
//        System.out.println(Arrays.toString(ints));
//        Arrays.sort(ints);
//        System.exit(0);
//        System.out.println(Arrays.toString(ints));
//
//        System.out.println(Arrays.toString(ints));
//        Arrays.sort(ints);
//        System.out.println(Arrays.toString(ints));
//
//        int ine = Arrays.binarySearch(ints,6);
//        System.out.println(ine);
//
//        int[] newint = Arrays.copyOf(ints,8);
//        System.out.println(Arrays.toString(newint));

        BigInteger bigInteger = new BigInteger("567782348279");
        BigInteger bigInteger1 = new BigInteger("21");
         bigInteger = bigInteger.add(bigInteger1);
        System.out.println(bigInteger);

    }
}
