package org.example.advaned.leejinwoo.unitThree;

public class SmartAirConditionerDevice implements TemperatureDevice, OnOffDevice{
    @Override
    public void TemperatureUp() {
        System.out.println("AirConditioner Temperature UP");
    }

    @Override
    public void TemperatureDown() {
        System.out.println("AirConditioner Temperature Down");
    }

    @Override
    public void turnOn() {
        System.out.println("AirConditioner On");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioner Off");
    }
}
