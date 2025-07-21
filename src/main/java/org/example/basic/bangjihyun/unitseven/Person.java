package org.example.basic.bangjihyun.unitseven;

// 1. Person 클래스 (부모)
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("안녕하세요, 저는 " + name + "이고 나이는 " + age + "살입니다.");
    }
}