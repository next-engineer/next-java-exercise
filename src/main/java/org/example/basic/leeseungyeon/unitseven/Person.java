package org.example.basic.leeseungyeon.unitseven;

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
