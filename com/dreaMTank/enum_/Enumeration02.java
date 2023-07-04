package com.dreaMTank.enum_;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {

        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.SUMMER);

    }
}
enum Seasons{
    SPRING("spring","worm"),
    SUMMER("summer", "hot");
    private String name;
    private String des;

//    public final static Season SPRING = new Seasons("春天","温暖");
//    public final static Season SUMMER = new Seasons("夏天","炎热");
//    public final static Season AUTUMN = new Seasons("秋天","凉爽");
//    public final static Season WINTER = new Seasons("冬天","寒冷");

    @Override
    public String toString() {
        return "Seasons{" +
                "name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    private Seasons(String name, String des) {
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

