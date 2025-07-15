package org.example.advaned.sangyoonlee.unittwo;

public class NotificationSender {
    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();
        Notification pushNotification = new PushNotification();

        emailNotification.send();
        smsNotification.send();
        pushNotification.send();
    }
}
