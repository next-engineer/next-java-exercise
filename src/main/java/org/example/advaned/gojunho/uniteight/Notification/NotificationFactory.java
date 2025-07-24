package org.example.advaned.gojunho.uniteight.Notification;

public abstract class NotificationFactory {
    public void process(String message){
        Notification notification = send();

        notification.alert(message);
    }

    protected abstract Notification send();
}
