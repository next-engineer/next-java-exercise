package org.example.advaned.limjeongwoo.unitthree;

public class Light implements PowerControllable{
    @Override
    public void turnOn() {
        System.out.println("조명 켜기");
    }

    @Override
    public void turnOff() {
        System.out.println("조명 끄기");
    }
}
