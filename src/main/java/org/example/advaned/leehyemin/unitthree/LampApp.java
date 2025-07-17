package org.example.advaned.leehyemin.unitthree;

import java.util.Scanner;

public class LampApp {
    public static void main(String[] args) {
        PowerControl powerControl = new PowerControl();
        //powerControl.powerOff();
        //powerControl.powerOn();

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 시간 후에 종료할까요?");
        int time = sc.nextInt();
        TimeControl timeControl = new TimeControl();
        timeControl.timerControl(time);
    }
}
