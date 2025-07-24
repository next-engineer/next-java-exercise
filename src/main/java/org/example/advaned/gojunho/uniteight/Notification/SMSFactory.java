package org.example.advaned.gojunho.uniteight.Notification;

public class SMSFactory extends NotificationFactory {
    @Override
    protected Notification send() {
        return new SMS();
    }
}
