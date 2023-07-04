package com.dreaMTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class MatcherMethod {
    public static void main(String[] args) {
        String content = "hello edu jack hspedutom hello smith hello hspedu hspedu";
        String regStr = "hello";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("=================");
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println("找到: " + content.substring(matcher.start(), matcher.end()));
        }


        System.out.println("整体匹配=" + matcher.matches());

        regStr = "hspedu";
        pattern = Pattern.compile(regStr);
        matcher = pattern.matcher(content);

        String newContent = matcher.replaceAll("韩顺平教育");
        System.out.println("newContent=" + newContent);
        System.out.println("content=" + content);

    }
}
