package org.example.advaned.kimyoungji.unitthree;

public class SmartSpeaker implements PowerControllable, MusicPlayable {
    @Override
    public void turnOn() {
        System.out.println("스마트 스피커 전원이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트 스피커 전원이 꺼졌습니다.");
    }

    @Override
    public void playMusic(String song) {
        System.out.println("노래 재생: " + song);
    }
}

