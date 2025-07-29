package org.example.advaned.kimaram.unitthree;

public class AirConditioner implements PowerControllable, TemperatureControllable{

    @Override
    public void turnOn() {
        System.out.println("에어컨 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨 전원을 끕니다.");
    }

    @Override
    public void setTemperature(int temp) {
        System.out.printf("에어컨 온도를 %d도로 설정합니다.", temp);
    }
}
