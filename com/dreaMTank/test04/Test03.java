package com.dreaMTank.test04;
//not perfect!!
/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Test03 {
    public static void main(String[] args) {

    }
}
interface Vehicles{
    public void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况下使用马儿");
    }
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("遇到大河使用船");
    }
}
class Gongjuchang{
    private static Horse horse = new Horse();
    private Gongjuchang(){}
    public static Horse horse_(){
        return new Horse();
    }
    public static Boat boat_(){
        return  new Boat();
    }
}
class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void river(){
        if (!(vehicles instanceof Boat)){
            vehicles = Gongjuchang.boat_();
        }
        vehicles.work();
    }
    public void common(){
        if (!(vehicles instanceof Horse)){
            vehicles = Gongjuchang.horse_();
        }
        vehicles.work();
    }


}
class Demo{
    public static void main(String[] args) {
        Person ts = new Person("唐僧", new Horse() );
        ts.common();
        ts.river();
    }
}
