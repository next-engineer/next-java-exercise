package org.example.advaned.leejinwoo.unitNine;

public class Slack implements Send{
    @Override
    public void send(String msg) {
        System.out.println("Slack Send : " + msg);
    }
}
