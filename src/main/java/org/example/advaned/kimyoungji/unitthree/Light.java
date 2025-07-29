package org.example.advaned.kimyoungji.unitthree;

public class Light implements PowerControllable {
    @Override
    public void turnOn() {
        System.out.println("조명이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("조명이 꺼졌습니다.");
    }
}
