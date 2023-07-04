package com.dreaMTank.regexp;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class Homework02 {

    public static void main(String[] args) {

        String content = "-0.89"; //
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";

        if(content.matches(regStr)) {
            System.out.println("匹配成功 是整数或者小数");
        } else {
            System.out.println("匹配失败");
        }
    }
}
