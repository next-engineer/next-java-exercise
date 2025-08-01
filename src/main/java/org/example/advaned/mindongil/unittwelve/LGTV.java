package org.example.advaned.mindongil.unittwelve;

public class LGTV implements TV {
    public void turnOn() {
        System.out.println("LG TV 켜짐");
    }
    public void turnOff() {
        System.out.println("LG TV 꺼짐");
    }
    public void setChannel(int channel) {
        System.out.println("LG TV 채널: " + channel);
    }
}
