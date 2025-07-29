package org.example.advaned.kimaram.unitthree;

public class SmartSpeaker implements PowerControllable, MusicPlayable{
    @Override
    public void playMusic(String song) {
        System.out.println(song + " 재생 합니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("스마트 스피커를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트 스피커를 끕니다.");
    }
}
