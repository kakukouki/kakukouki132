package com.dreaMTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class RegExp09 {
    public static void main(String[] args) {
        String content = "hello111111 ok";
//        String regStr = "\\d+";
//        String regStr = "\\d+?";
        String regStr = "\\d+?";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
