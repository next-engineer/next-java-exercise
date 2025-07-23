package org.example.advaned.limjeongwoo.unitthree;

public class AirConditioner implements PowerControllable, TemperatureControllable{
    @Override
    public void turnOn() {
        System.out.println("에어컨 키기");
    }

    @Override
    public void turnOff() {
        System.out.println("에어컨 끄기");
    }

    @Override
    public void setTemperature(int temp) {
        System.out.println("온도 조절: " + temp);
    }
}
