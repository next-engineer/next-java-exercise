package org.example.advaned.yunbyeongchang.unitthree;

public class SmartSpeaker implements PowerControllable, MusicPlayable{
    //var

    //method
    @Override
    public void turnOn()
    {
        System.out.println("스피커를 켭니다.");
    }

    @Override
    public void turnOff()
    {
        System.out.println("스피커를 끕니다.");
    }

    @Override
    public void playMusic(String song)
    {
        System.out.println("스피커에서 " + song + "을(를) 재생합니다.");
    }
}
