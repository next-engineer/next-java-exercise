package org.example.advaned.gojunho.unittwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String args[]) {

        EmailNotification email = new EmailNotification();
        SMSNotification sms = new SMSNotification();
        PushNotification push = new PushNotification();
        int num = 1;
        if(num==1) {
            List<Notification> combo1 = Arrays.asList(email, sms);
            for (Notification No1 : combo1) {
                No1.send();
            }
        }
        else if(num==2) {
            List<Notification> combo2 = Arrays.asList(email, push);
            for (Notification No2 : combo2) {
                No2.send();
            }
        }
        else if(num==3) {
            List<Notification> combo3 = Arrays.asList(sms, email, push);
            for (Notification No3 : combo3) {
                No3.send();
            }
        }
    }
}
