package org.example.basic.leehyemin.unitfour.SmartHome;

import java.util.Scanner;

public class AirConditionerApp {
    public static void main(String[] args) {

        //온도 변경
        Scanner sc = new Scanner(System.in);
        System.out.println("설정할 온도를 입력해주세요.");
        int temp=sc.nextInt();

        TempControl tempControl = new TempControl();
        tempControl.setTemperature(temp);

        //전원 On/Off
        PowerControl powerControl = new PowerControl();
        //powerControl.powerOn();
        //powerControl.powerOff();
    }
}
