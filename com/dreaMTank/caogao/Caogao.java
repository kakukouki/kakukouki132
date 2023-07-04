package com.dreaMTank.caogao;

public class Caogao {
    public static void main(String[] args) {
        Employee manager = new Manager("ghj", 0536, 30000, 150000);
        manager.work();

    }

}
 /*
 Person pp = new Student();
 Student ss = (Student) pp;

// 父类的方法被重写，向上转型向下转型都无法调用，因为转型的是编译类型 ，运行类型一直是子类；

// == 和 equal：       用于基本数据类型               用于引用类型
  ==：   比较运算符     可以，判断值是否相等           可以，判断两个对象是否相等
equal： object类的方法     不可以                   可以，默认判断两个对象是否相等；子类一般重写来比较属性是否相等（String，integer）






  */

    abstract class Employee {
        private String name;
        private int id;
        private double salary;

        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        abstract public void work();
    }


class Manager extends Employee{
        private  double bonus;

    @Override
    public void work() {
        System.out.println("经理" + "\nname: " + getName() + "\nis working.......");
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}