package org.example.advaned.gojunho.uniteight.Notification;

public class SlackFactory extends NotificationFactory {
    @Override
    protected Notification send() {
        return new Slack();
    }
}
