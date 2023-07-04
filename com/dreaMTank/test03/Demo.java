package com.dreaMTank.test03;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("ghj", '男', 25, 10289);
        student.studentInfo();

        System.out.println("--------------------------------");
        Teacher teacher = new Teacher("jack", '女', 38, 20);
        teacher.teacherInfo();


        Person[] person = new Person[4];
        person[0] = new Student("ghj", '男', 25, 00001);
        person[1] = new Student("jack", '男', 35, 0002);
        person[2] = new Teacher("marry", '女', 56, 10);
        person[3] = new Teacher("mark", '女', 46, 12);

        Demo demo = new Demo();
        demo.bubbleSort(person);

        System.out.println("--------排序后的数组-------");
        for (int i = 0; i < person.length; i++){
            System.out.println(person[i].toString());
        }

        System.out.println("-------------------------------");
        for (int i = 0; i < person.length; i++) {
            demo.test(person[i]);
        }


    }
    public void bubbleSort(Person[] person) {
        Person temp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j + 1] = temp;
                }
            }
        }
    }
    public void test(Person p){
        if (p instanceof Student){
            ((Student) p).study();
        }else if (p instanceof Teacher){
            ((Teacher) p).teach();
        }else {
            System.out.println("do nothing......");
        }
    }
}
