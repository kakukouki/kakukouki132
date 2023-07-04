package com.dreaMTank.regexp;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {

        String content = "hsp@tsinghua.org.cn kkk";
        String regStr = "^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";


        if (content.matches(regStr)) {
            System.out.println("匹配成功");
        } else {
            System.out.println("匹配失败");
        }

    }
}
