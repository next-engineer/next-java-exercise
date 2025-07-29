package org.example.advaned.kimaram.uniteight.notification;

// 2. 구체적인 알림 클래스 - SMS
public class SMSNotification implements Notification{

    @Override
    public void send() {
        System.out.println("SMS 전송 완료");
    }
}
