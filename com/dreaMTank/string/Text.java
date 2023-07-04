package com.dreaMTank.string;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Text {
    public static void main(String[] args) {
//        String str = null;
//        java.lang.StringBuffer sb = new java.lang.StringBuffer();
//        sb.append(str);
//        System.out.println(sb.length());
//        System.out.println(sb);
//        java.lang.StringBuffer sb1 = new java.lang.StringBuffer(str);
//        System.out.println(sb1);
        String price = "877988989.45";
        StringBuffer sb = new StringBuffer();
        for (int i = sb.lastIndexOf(".")-3;i > 0; i -= 3){
            sb = sb.insert(i,",");
        }
        System.out.println(sb);
    }
}
class AA{
    public static void main(String[] args) {
        String price = "877988989.45";
        StringBuffer sb = new StringBuffer();
        for (int i = sb.lastIndexOf(".")-3;i > 0; i -= 3){
            sb = sb.insert(i,",");
        }
        System.out.println(sb);
    }


}
