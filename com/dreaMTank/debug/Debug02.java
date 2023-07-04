package com.dreaMTank.debug;

import java.util.Arrays;

public class Debug02 {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 7, 9, -46,-299};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
             System.out.println(arr[i] + "\t");
        }
    }
}
