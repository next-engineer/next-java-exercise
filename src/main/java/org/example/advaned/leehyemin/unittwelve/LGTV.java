package org.example.advaned.leehyemin.unittwelve;

public class LGTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("LG TV 켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println("LG TV 꺼짐");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("LG TV 채널 : "+channel);
    }
}
