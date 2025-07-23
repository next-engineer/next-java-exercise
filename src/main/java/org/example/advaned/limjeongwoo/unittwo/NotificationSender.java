package org.example.advaned.limjeongwoo.unittwo;

public class NotificationSender {

    private final Notification notification;

    public NotificationSender(Notification notification){
        this.notification = notification;
    }

    public void sendNotification(){
        notification.send();
    }

}
