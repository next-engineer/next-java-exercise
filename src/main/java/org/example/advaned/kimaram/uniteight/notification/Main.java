package org.example.advaned.kimaram.uniteight.notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.process();

        NotificationFactory smsFactory = new SMSNotificationFactory();
        smsFactory.process();

        NotificationFactory slackFactory = new SlackNotificationFactory();
        slackFactory.process();
    }
}
