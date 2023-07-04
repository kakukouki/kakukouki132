package com.dreaMTank.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 郭鴻基
 * @version 1.0
 */
public class HashMap_ {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1, new Employee("jack", 30000, 1));
        map.put(2, new Employee("john", 1000,2));
        map.put(3, new Employee("mike", 12000, 3));
        map.put(4, new Employee("ghj", 40000, 4));

        Set set = map.keySet();
        for (Object key :
                set) {
            Employee emp = (Employee) map.get(key);
            if (emp.getPrice() > 18000){
                System.out.println(emp);
            }
        }


    }
}
class Employee{
    private String name;
    private double price;
    private int id;

    public Employee(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}