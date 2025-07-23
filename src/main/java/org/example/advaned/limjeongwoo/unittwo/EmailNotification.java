package org.example.advaned.limjeongwoo.unittwo;

public class EmailNotification implements Notification{

    @Override
    public void send() {
        System.out.println("Email");
    }

}
