package org.example.advaned.kimaram.unittwelve;

// ConcreteImplementor A : 구현 역할을 실제로 구현한 클래스 A - Samsung TV
public class SamsungTV implements TV{
    @Override
    public void turnOn() {
        System.out.println("Samsung TV 켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung TV 꺼짐");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Samsung TV 채널: " + channel);
    }
}
