package org.example.advaned.kimaram.unitthree;

public class Light implements PowerControllable{
    @Override
    public void turnOn() {
        System.out.println("조명을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("조명을 끕니다.");
    }
}
