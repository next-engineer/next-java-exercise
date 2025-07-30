package org.example.advaned.yunbyeongchang.unittwelve;

//ConcreteImplementor A
public class SamsungTV implements TV{
    //var

    //method
    public void turnOn() {
        System.out.println("Turn on Samsung TV");
    }

    public void turnOff() {
        System.out.println("Turn off Samsung TV");
    }

    public void setChannel(int channel) {
        System.out.println("Samsung TV Channel: " + channel);
    }
}
