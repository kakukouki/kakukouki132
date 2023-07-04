package com.dreaMTank.collectionworks.a01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        News new1 = new News("新冠确诊病例超千万，数百万印度信徒赴恒河\"圣浴\"引民众担忧");
        News new2 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        List list = new ArrayList();
        list.add(new1);
        list.add(new2);

        int size = list.size();
        for (int i = size - 1; i >= 0 ; i--) {
//            System.out.println(list.get(i));
            News new3 = (News)list.get(i);
            System.out.println(processTitle(new3.getTitle()));
        }


    }
    public static String processTitle(String title){
        if (title == null){
            return "";
        }
        if (title.length() > 15){
            return title.substring(0,15) + "...";
        }else {
            return title;
        }
    }
}
class News{
    private String title;
    private String real;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
