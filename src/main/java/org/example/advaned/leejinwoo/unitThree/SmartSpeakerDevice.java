package org.example.advaned.leejinwoo.unitThree;

public class SmartSpeakerDevice implements PlayMusicDevice, OnOffDevice{

    @Override
    public void turnOn() {
        System.out.println("Speaker On");
    }

    @Override
    public void turnOff() {
        System.out.println("Speaker Off");
    }

    @Override
    public void musicStart() {
        System.out.println("Music Start");
    }

    @Override
    public void musicStop() {
        System.out.println("Music Stop");
    }
}
