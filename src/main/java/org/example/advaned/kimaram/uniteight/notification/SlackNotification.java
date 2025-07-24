package org.example.advaned.kimaram.uniteight.notification;

// 2. 구체적인 알림 클래스 - slack
public class SlackNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Slack 전송 완료");
    }
}
