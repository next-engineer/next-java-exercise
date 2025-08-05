package org.example.advaned.sangyoonlee.unittwelve;

public class BasicRemote extends RemoteControl {

    public BasicRemote(TV tv) {
        super(tv);
    }

    @Override
    public void turnOn() {
        tv.turnOn();
    }

    @Override
    public void turnOff() {
        tv.turnOff();
    }

    @Override
    public void setChannel(int channel) {
        tv.setChannel(channel);
    }
}
