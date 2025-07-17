package org.example.advaned.parkgwanghoon.UnitThree;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("SMS 전송 완료");
    }
}
