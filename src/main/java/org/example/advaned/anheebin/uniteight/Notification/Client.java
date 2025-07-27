package org.example.advaned.anheebin.uniteight.Notification;

public class Client {
    public static void main(String[] args) {
        NotificationFactory factory = new EmailNotificationFactory(); // Email 알림 생성
        factory.sendNotification("안녕하세요, 고객님!"); // 메시지 전송
    }
}
