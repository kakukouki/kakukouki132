package com.dreaMTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 郭鸿基
 * @version 1.0
 */
public class RegExp04 {
    public static void main(String[] args) {

        String content = "hanshunping 韩 寒冷";
        String regStr = "han|韩|寒";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);


        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
