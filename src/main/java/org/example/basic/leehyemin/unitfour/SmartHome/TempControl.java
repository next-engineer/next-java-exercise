package org.example.basic.leehyemin.unitfour.SmartHome;

public class TempControl implements TempControllable{
    @Override
    public void setTemperature(int temp) {
        System.out.println(temp+"도로 온도 변경");
    }
}
