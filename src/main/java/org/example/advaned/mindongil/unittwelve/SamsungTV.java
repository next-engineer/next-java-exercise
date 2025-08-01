package org.example.advaned.mindongil.unittwelve;

public class SamsungTV  implements TV {
    public void turnOn() {
        System.out.println("Samsung TV 켜짐");
    }
    public void turnOff() {
        System.out.println("Samsung TV 꺼짐");
    }
    public void setChannel(int channel) {
        System.out.println("Samsung TV 채널: " + channel);
    }
}
