package org.example.basic.yunbyeongchang.uniteight.example;

abstract class Animal {
    // 추상 메서드 (구현 없음)
    abstract void makeSound();

    // 일반 메서드 (구현 있음)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}
