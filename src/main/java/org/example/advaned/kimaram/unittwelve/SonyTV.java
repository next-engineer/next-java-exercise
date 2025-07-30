package org.example.advaned.kimaram.unittwelve;

public class SonyTV implements TV{
    @Override
    public void turnOn() {
        System.out.println("Sony TV 켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony TV 꺼짐");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Sony TV 채널: " + channel);
    }
}
