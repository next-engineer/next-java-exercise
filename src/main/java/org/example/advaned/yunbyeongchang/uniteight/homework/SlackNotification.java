package org.example.advaned.yunbyeongchang.uniteight.homework;

public class SlackNotification implements Notification{
    //var

    //method
    public void notification(String message)
    {
        System.out.println("Slack 메시지가 도착했습니다. 내용: " + message);
    }
}
