package com.dreaMTank.test04;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Test05 {
    public static void main(String[] args) {

    }
}
enum Color implements AA{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
    @Override
    public void show() {
        System.out.println("属性值为" + redValue + "," + greenValue + "," + blueValue);
    }
}
interface AA{
    public void show();
}
