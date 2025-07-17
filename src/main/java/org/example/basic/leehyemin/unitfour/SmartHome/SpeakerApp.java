package org.example.basic.leehyemin.unitfour.SmartHome;

import java.util.Scanner;

public class SpeakerApp {
    public static void main(String[] args) {
        //볼륨 조절
        VolumeControl volumeControl = new VolumeControl();
        volumeControl.volumeDown();
        volumeControl.volumeUp();

        //전원 조절
        PowerControl powerControl = new PowerControl();
        powerControl.powerOff();
        powerControl.powerOn();

        //재생 조절
        MusicPlay musicPlay = new MusicPlay();
        musicPlay.play();
        musicPlay.pause();
        musicPlay.stop();
        musicPlay.nextSong();
        musicPlay.previousSong();

        //시간 조절
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 시간 후에 종료할까요?");
        int time = sc.nextInt();

        TimeControl timeControl = new TimeControl();
        timeControl.timerControl(time);
    }
}
