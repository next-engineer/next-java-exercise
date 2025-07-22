package org.example.basic.yunbyeongchang.unitseven.example;

public class InheritanceExample {
    //method
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // 부모 클래스 메서드 사용
        dog.bark();  // 자식 클래스 고유 메서드
    }
}
