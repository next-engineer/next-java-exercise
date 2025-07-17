package org.example.advaned.parkjoohyung.unittfour;

import org.example.advaned.parkjoohyung.unittfour.TemperatureControllable;

public class AirConditioner implements PowerControllable, TemperatureControllable {
    @Override
    public void turnOn() {
        System.out.println("에어컨이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨이 꺼졌습니다.");
    }

    @Override
    public void   setTemperature(int temp) {
        System.out.println("에어컨 온도를 " + temp + "도로 설정했습니다.");
    }
}