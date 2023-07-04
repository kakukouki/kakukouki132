package com.dreaMTank.enum_;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Enumeration04 {
    public static void main(String[] args) {
       Week[] pp = Week.values();
        for (Week i : pp) {
            System.out.println(i);
        }
    }
}
enum Week{
     SUNDAY("zhouri"), MONDAY("zhouyi") , SATDAY("zhouliu");
    private String name;

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
