package org.example.advaned.leehyemin.unitthree;

public class TimeControl implements TimerControllable {
    @Override
    public void timerControl(int time) {
        System.out.println(time+"시간 후에 종료됩니다.");
    }
}
