package com.dreaMTank.regexp;

import java.util.regex.Pattern;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class PatternMethod {

    public static void main(String[] args) {
        String content = "hello abc hello, 韩顺平教育";
        //String regStr = "hello";
        String regStr = "hello.*";

        boolean matches = Pattern.matches(regStr, content);
        System.out.println("整体匹配= " + matches);
    }
}
