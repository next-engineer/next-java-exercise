package org.example.advaned.yunbyeongchang.unittwelve;

//ConcreteImplementor B
public class LGTV implements TV{
    //var

    //method
    public void turnOn() {
        System.out.println("Turn on LG TV");
    }

    public void turnOff() {
        System.out.println("Turn off LG TV");
    }

    public void setChannel(int channel) {
        System.out.println("LG TV Channel: " + channel);
    }
}
