package org.example.basic.ANheebin.onepROJECT.unitseven;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("이름 : " + name + ", 나이 : " + age+"살입니다");
    }
}
