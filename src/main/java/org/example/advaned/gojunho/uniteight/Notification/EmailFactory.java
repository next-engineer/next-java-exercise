package org.example.advaned.gojunho.uniteight.Notification;

public class EmailFactory extends NotificationFactory {
    @Override
    protected Notification send() {
        return new Email();
    }
}
