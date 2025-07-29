package org.example.advaned.leehyemin.uniteight.notification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new SMSNotify();
    }
}
