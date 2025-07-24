package org.example.advaned.leejinwoo.unitNine;

public class Email implements Send{
    @Override
    public void send(String msg) {
       System.out.println("Email Send : " + msg);
    }
}
