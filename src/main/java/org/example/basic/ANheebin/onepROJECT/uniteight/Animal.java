package org.example.basic.ANheebin.onepROJECT.uniteight;

public abstract class Animal {
    abstract void makesound();

    void sleep(){
        System.out.println("동물 잠자는소리");
    }
}

class Dog extends Animal {

    @Override
    void makesound() {
        System.out.println("멍멍");
    }


}
