package org.example.advaned.yunbyeongchang.uniteight.homework;

public class SMSNotificationFactory extends NotificationFactory {
    //var

    //method

    @Override
    protected Notification createNotification() {
        return new SMSNotification();
    }
}
