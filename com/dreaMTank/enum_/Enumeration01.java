package com.dreaMTank.enum_;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {

        System.out.println(Season.AUTUMN);
    }
}
class Season{
    private String name;
    private String des;

    public final static Season SPRING = new Season("春天","温暖");
    public final static Season SUMMER = new Season("夏天","炎热");
    public final static Season AUTUMN = new Season("秋天","凉爽");
    public final static Season WINTER = new Season("冬天","寒冷");

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    private Season(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }
}
