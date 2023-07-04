package com.dreaMTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class RegExp05 {
    public static void main(String[] args) {
        String content = "a211111aaaaaahello";

//        a{3},1{4},\\d{2}
//        String regStr = "a{3}";
//        String regStr = "1{4}";
//        String regStr = "\\d{2}";
//
//        a{3,4},1{4,5},\\d{2,5}
//
//
//        String regStr = "a{3,4}";
//        String regStr = "1{4,5}";
//        String regStr = "\\d{2,5}";
//
//
//        1+
//        String regStr = "1+";
//        String regStr = "\\d+";
//
//        1*
//        String regStr = "1*";


        String regStr = "a1?";
        Pattern pattern = Pattern.compile(regStr/*, Pattern.CASE_INSENSITIVE*/);
        Matcher matcher = pattern.matcher(content);


        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
