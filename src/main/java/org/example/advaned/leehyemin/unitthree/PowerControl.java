package org.example.advaned.leehyemin.unitthree;

public class PowerControl implements PowerControllable{
    @Override
    public void powerOn() {
        System.out.println("전원이 켜졌습니다.");
    }

    @Override
    public void powerOff() {
        System.out.println("전원이 꺼졌습니다.");
    }
}
