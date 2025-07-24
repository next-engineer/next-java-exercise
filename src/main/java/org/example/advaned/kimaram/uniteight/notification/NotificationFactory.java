package org.example.advaned.kimaram.uniteight.notification;

// 3. 추상 클래스 (Factory Method)
public abstract class NotificationFactory {
    public void process() {
        Notification notification = createNotification(); // 팩토리 메서드 호출
        notification.send();
    }

    protected abstract Notification createNotification(); // 팩토리 메서드
}
