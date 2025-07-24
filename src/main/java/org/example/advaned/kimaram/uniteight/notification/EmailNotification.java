package org.example.advaned.kimaram.uniteight.notification;

// 2. 구체적인 알림 클래스 - email
public class EmailNotification implements Notification{
    @Override
    public void send() {
        System.out.println("이메일 전송 완료");
    }
}
