package org.example.advaned.leehyemin.uniteight.notification;

public class Main {
    public static void main(String[] args) {
        NotificationFactory SMS = new SMSNotificationFactory();
        SMS.notify("SMS");

        NotificationFactory email = new EmailNotificationFactory();
        email.notify("Email");

        NotificationFactory slack = new SlackNotificationFactory();
        slack.notify("Slack");
    }
}
