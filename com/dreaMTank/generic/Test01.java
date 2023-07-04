package com.dreaMTank.generic;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class Test01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<user> dao = new DAO<>();
        dao.save("001", new user(1, 10, "jack"));
        dao.save("002", new user(2, 18, "king"));
        dao.save("003", new user(3, 38, "smith"));

        List<user> list = dao.list();
        System.out.println(list);

        dao.update("003", new user(3, 58, "milan"));
        list = dao.list();
        System.out.println(list);
    }

}
class user{
    private int id;
    private int age;
    private String name;

    public user(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
