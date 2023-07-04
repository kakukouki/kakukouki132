package com.dreaMTank.objectoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception{
        String filePath = "/Users/dreamtank152/test.txt";
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));
            oos.writeInt(520);
            oos.writeBoolean(true);
            oos.writeDouble(13.14);
            oos.writeChar('G');
            oos.writeUTF("good job");
            oos.writeObject(new Dog("jack", 10));
            oos.close();
            System.out.println("finish");
    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}