package org.example.basic.kimaram.unitseven.inheritance;

public class Dog extends Animal{

    // sound 구현
    @Override
    void sound() {
        super.sound();
//        System.out.println("개가 짖습니다.");
    }

    void bark() {
        System.out.println("멍멍!");
    }
}
