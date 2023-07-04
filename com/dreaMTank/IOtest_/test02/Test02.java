package com.dreaMTank.IOtest_.test02;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {

        String filePath = "date530/dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        String name = properties.get("name") + "";
        int age = Integer.parseInt(properties.get("age") + "");
        String color = properties.get("color") + "";

        Dog dog = new Dog(name, age, color);
        System.out.println(dog);

        String serFilePath = "/Users/dreamtank152/Dogdog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);
        oos.close();
        System.out.println("finish...");
    }
    @Test
    public void m1() throws Exception{
        String serFilePath = "/Users/dreamtank152/Dogdog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog) ois.readObject();
        System.out.println(dog);
        ois.close();
    }

}
class  Dog implements Serializable{
    private String name;
    private int age;
    private String color;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}