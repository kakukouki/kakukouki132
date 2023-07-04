package com.dreaMTank.interfaces;

public class jiekoubijiao {
    public static void main(String[] args) {
        SmallDog pocky = new SmallDog("pocky");
        pocky.swim();
        pocky.climb();
        pocky.swim();
    }
}
class Dod{
    private String name;

    public Dod(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void climb(){
        System.out.println(getName() + "can climbing");
    }
}
class SmallDog extends Dod implements A,BB{
    public SmallDog(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(getName() + "can swimming!!");
    }

    @Override
    public void climb() {
        super.climb();
    }

    @Override
    public void fly() {
        System.out.println(getName() + "can fly!!!!");
    }
}
interface A{
    void swim();
}
interface BB{
    void fly();
}
