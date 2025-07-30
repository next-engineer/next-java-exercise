package org.example.advaned.yunbyeongchang.unittwelve;

//Abstraction
abstract class RemoteControl {
    //var
    protected TV tv;

    //method
    public RemoteControl(TV tv) {
        this.tv = tv;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setChannel(int channel);

}
