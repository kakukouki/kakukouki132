package com.dreaMTank.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Listtest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", 33.4, "hlm"));
        list.add(new Book("西游记", 29.8, "xyj"));
        list.add(new Book("水浒传", 67.9, "shz"));


        for (Object o:list
             ) {
            System.out.println(o);
        }
        System.out.println("----------------------------");
        sort(list);
        for (Object o :
                list) {
            System.out.println(o);
        }
    }
    public static void sort(List list){

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - j; j++) {
                Book book1 = (Book)list.get(j);
                Book book2 = (Book)list.get(j+1);
                if (book1.getPrice() > book2.getPrice()){
                    list.set(j,book2);
                    list.set(j + 1, book1);
                }

            }
        }
    }
}
class Book{
    private String name;
    private Double price;
    private String person;

    public Book(String name, Double price, String person) {
        this.name = name;
        this.price = price;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return
                "名称： " + name + "\t" +
                "价格： " + price +"\t" +
                "作者： " + person + "\t";
    }
}
