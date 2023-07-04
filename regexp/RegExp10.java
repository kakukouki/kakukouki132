package com.dreaMTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class RegExp10 {
    public static void main(String[] args) {
        String content = "13588889999";

        //String regStr = "^[\u0391-\uffe5]+$";
        //String regStr = "^[1-9]\\d{5}$";
        //String regStr = "^[1-9]\\d{4,9}$";
        String regStr = "^1[3|4|5|8]\\d{9}$";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }

    }
}
