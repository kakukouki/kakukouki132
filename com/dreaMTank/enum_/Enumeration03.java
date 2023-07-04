package com.dreaMTank.enum_;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
//   Gender2.BOY 和 Gender2.GIRL 是 Gender2 类的两个枚举常量。
//   它们在编译时就被实例化为 Gender2 类的对象，并且在程序运行时可以直接使用。
//   所以，当我们使用 Gender2.BOY 和 Gender2.GIRL 这样的枚举常量时，
//   实际上是在引用已经存在的对象，而不需要显式地使用 new 关键字创建对象。
     Gender2 pp = Gender2.BOY;
     Gender2 pp2 = Gender2.BOY;
        System.out.println(pp);
        System.out.println(pp == pp2);
    }
}
enum Gender2{
    BOY,GIRL;
}