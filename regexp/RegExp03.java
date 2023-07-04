package com.dreaMTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class RegExp03 {
    public static void main(String[] args) {

        String content = "a11c8abc _ABCy @";
//        String regStr = "[a-z]";
//        String regStr = "[A-Z]";
//        String regStr = "abc";
//        String regStr = "(?i)abc";
//        String regStr = "[0-9]";
//        String regStr = "[^a-z]";
//        String regStr = "[^0-9]";
//        String regStr = "[abcd]";
//        String regStr = "\\D";
//        String regStr = "\\w";
//        String regStr = "\\W";
//        String regStr = "\\s";
//        String regStr = "\\S";
        String regStr = ".";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
