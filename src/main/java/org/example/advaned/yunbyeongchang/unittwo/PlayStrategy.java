package org.example.advaned.yunbyeongchang.unittwo;

public class PlayStrategy {
    //var
    Notification notificationStrategy;      // 알림 인터페이스

    //method
    void setNotificationStrategy(Notification Strategy)
    {
        this.notificationStrategy = Strategy;
    }

    void send()
    {
        this.notificationStrategy.send();
    }
}
