package org.example.basic.leehyemin.unitfour.SmartHome;

public interface SmartDevice {
    void turnOn();
    void turnOff();
    void setTemperature(int temp);
    void setTimer(int seconds);
    void playMusic(String song);
}
