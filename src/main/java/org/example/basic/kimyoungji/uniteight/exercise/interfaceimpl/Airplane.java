package org.example.basic.kimyoungji.uniteight.exercise.interfaceimpl;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane is flying!");
    }
}