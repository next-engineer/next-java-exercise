package org.example.advaned.limjeongwoo.unitthree;

public class SmartDeviceProcessor {

    public static void main(String[] args) {
        PowerControllable light = new Light();

        PowerControllable acPower = new AirConditioner();
        TemperatureControllable acTemp = (TemperatureControllable) acPower;

        PowerControllable speakerPower = new SmartSpeaker();
        MusicPlayable speakerMusic = (MusicPlayable) speakerPower;


        light.turnOn();
        light.turnOff();

        acPower.turnOn();
        acTemp.setTemperature(25);
        acPower.turnOff();

        speakerPower.turnOn();
        speakerMusic.playMusic("Song~");
        speakerPower.turnOff();

    }
}
