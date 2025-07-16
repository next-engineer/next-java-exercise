package org.example.basic.leehyemin.unitfour.SmartHome;

import java.util.Scanner;

public class TempControl implements TempControllable{
    @Override
    public void setTemperature(int temp) {
        Scanner sc = new Scanner(System.in);
        temp=sc.nextInt();
    }
}
