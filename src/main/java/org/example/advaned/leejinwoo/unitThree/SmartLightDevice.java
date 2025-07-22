package org.example.advaned.leejinwoo.unitThree;

public class SmartLightDevice implements OnOffDevice{

    @Override
    public void turnOn() {
        System.out.println("Light On");
    }

    @Override
    public void turnOff() {
        System.out.println("Light Off");
    }
}
