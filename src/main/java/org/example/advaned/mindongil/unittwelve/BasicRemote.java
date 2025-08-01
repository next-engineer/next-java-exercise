package org.example.advaned.mindongil.unittwelve;


public class BasicRemote extends RemoteControl {
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
