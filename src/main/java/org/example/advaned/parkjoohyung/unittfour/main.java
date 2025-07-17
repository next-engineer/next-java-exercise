package org.example.advaned.parkjoohyung.unittfour;

public class main {
    public static void main(String[] args) {
        PowerControllable light = new Light();
        PowerControllable aircon = new AirConditioner();
        PowerControllable speaker = new SmartSpeaker();

        light.turnOn();
        light.turnOff();

        aircon.turnOn();
        ((TemperatureControllable) aircon).setTemperature(22);
        aircon.turnOff();

        speaker.turnOn();
        ((MusicPlayable) speaker).playMusic("아이유 - 밤편지");
        speaker.turnOff();
    }
}
