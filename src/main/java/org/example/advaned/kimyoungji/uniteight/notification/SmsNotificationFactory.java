package org.example.advaned.kimyoungji.uniteight.notification;

public class SmsNotificationFactory extends NotificationFactory {
    @Override
    protected Notification createNotification() {
        return new SmsNotification();
    }
}
