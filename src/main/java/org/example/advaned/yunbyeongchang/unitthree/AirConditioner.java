package org.example.advaned.yunbyeongchang.unitthree;

public class AirConditioner implements PowerControllable, TemperatureControllable{
    //var

    //method
    @Override
    public void turnOn()
    {
        System.out.println("에어컨을 켭니다.");
    }

    @Override
    public void turnOff()
    {
        System.out.println("에어컨을 끕니다.");
    }

    @Override
    public void setTemperature(int temp)
    {
        System.out.println("에어컨 온도를 " + temp + "도로 변환합니다.");
    }
}
