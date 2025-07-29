package org.example.advaned.limjeongwoo.unitthree;

public class SmartSpeaker implements PowerControllable, MusicPlayable{
    @Override
    public void playMusic(String song) {
        System.out.println("음악 재생: " + song);
    }

    @Override
    public void turnOn() {
        System.out.println("음악 켜기");
    }

    @Override
    public void turnOff() {
        System.out.println("음악 끄기");
    }
}
