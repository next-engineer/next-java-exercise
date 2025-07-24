package org.example.advaned.yunbyeongchang.uniteight.homework;

public class EmailNotification implements Notification {
    //var

    //method
    public void notification(String message)
    {
        System.out.println("이메일이 도착했습니다. 내용: " + message);
    }
}
