package org.example.advaned.kimyoungji.unitthree;

public class Main {
    public static void main(String[] args) {
        PowerControllable light = new Light();
        PowerControllable ac = new AirConditioner();
        PowerControllable speaker = new SmartSpeaker();

        light.turnOn();
        ac.turnOn();
        ((TemperatureControllable) ac).setTemperature(24);

        speaker.turnOn();
        ((MusicPlayable) speaker).playMusic("Imagine - John Lennon");
    }
}
