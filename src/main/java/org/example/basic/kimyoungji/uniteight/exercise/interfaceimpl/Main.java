package org.example.basic.kimyoungji.uniteight.exercise.interfaceimpl;

public class Main {
    public static void main(String[] args) {
        Flyable myPlane = new Airplane();
        myPlane.fly();  // 출력: Airplane is flying!
    }
}