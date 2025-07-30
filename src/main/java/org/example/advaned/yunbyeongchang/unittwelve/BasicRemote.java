package org.example.advaned.yunbyeongchang.unittwelve;

//Refined Abstraction
public class BasicRemote extends RemoteControl{
    //var

    //method
    public BasicRemote(TV tv) {
        super(tv);
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void setChannel(int channel) {
        tv.setChannel(channel);
    }

}
