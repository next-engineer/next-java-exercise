package org.example.advaned.kimaram.unittwelve;

public abstract class RemoteControl {
    protected TV tv;

    // 생성자
    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setChannel(int channel);
}
