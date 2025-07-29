package org.example.advaned.sangyoonlee.uniteight;

public class EmailNotification implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("이메일 알림");
        System.out.println(message);
    }
}
