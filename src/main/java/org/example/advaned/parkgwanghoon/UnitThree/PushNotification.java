package org.example.advaned.parkgwanghoon.UnitThree;

public class PushNotification implements Notification {
    @Override
    public void send() {
        System.out.println("푸시 알림 전송 완료");
    }
}
