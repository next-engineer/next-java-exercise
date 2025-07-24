package org.example.advaned.yunbyeongchang.uniteight.homework;

public class EmailNotificationFactory extends NotificationFactory{
    //var

    //method

    @Override
    protected Notification createNotification() {
        return new EmailNotification();
    }
}
