package org.example.advaned.yunbyeongchang.uniteight.homework;

public class SlackNotificationFactory extends NotificationFactory{
    //var

    //method

    @Override
    protected Notification createNotification() {
        return new SlackNotification();
    }
}
