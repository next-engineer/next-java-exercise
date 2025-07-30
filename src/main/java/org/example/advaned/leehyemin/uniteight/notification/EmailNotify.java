package org.example.advaned.leehyemin.uniteight.notification;

public class EmailNotify implements Notification {
    @Override
    public void notify(String alarm) {
        System.out.println(alarm+" 알림이 있습니다.");
    }
}
