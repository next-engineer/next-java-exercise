package org.example.basic.kimyoungji.uniteight.exercise.abstractclass;

// 추상 클래스
abstract class Animal {
    // 추상 메서드 (강제 구현)
    abstract void makeSound();

    // 일반 메서드 (공통 구현)
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}
