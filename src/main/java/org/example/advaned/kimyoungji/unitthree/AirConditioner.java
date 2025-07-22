package org.example.advaned.kimyoungji.unitthree;

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
    public void setTemperature(int temp) {
        System.out.println("에어컨 온도를 " + temp + "도로 설정합니다.");
    }
}
