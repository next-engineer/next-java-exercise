package org.example.basic.parkgwanghoon.UnitOne;

public class Member {
    String name;
    int age;
    int num;
    public Member() {
        this("성명", 35, 20250001);
    }
    public Member(String name) {
        this(name, 35, 20250001);
    }
    public Member(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }
    public void printInfo() {
        System.out.println("회원명: " + name + ", 나이: " + age + ", 회원번호: " + num);
    }
}
