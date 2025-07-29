package org.example.advaned.kimyoungji.uniteight.notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.notifyUser("user@example.com", "이메일 알림입니다.");

        NotificationFactory smsFactory = new SmsNotificationFactory();
        smsFactory.notifyUser("010-1234-5678", "SMS 알림입니다.");

        NotificationFactory slackFactory = new SlackNotificationFactory();
        slackFactory.notifyUser("#general", "슬랙 알림입니다.");
    }
}