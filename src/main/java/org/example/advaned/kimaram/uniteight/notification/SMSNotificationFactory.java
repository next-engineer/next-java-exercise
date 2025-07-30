package org.example.advaned.kimaram.uniteight.notification;

// 4. 구체적인 팩토리 클래스 - email
public class SMSNotificationFactory extends NotificationFactory{
    @Override
    protected Notification createNotification() {
        return new SMSNotification();
    }
}
