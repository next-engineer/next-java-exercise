package org.example.advaned.kimaram.unittwelve;

// 확장된 추상 계층 (RefinedAbstraction)
public class BasicRemote extends RemoteControl{
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
