package org.example.advaned.yunbyeongchang.unittwo;

import java.util.Scanner;

public class SelectNotification {
    //var
    private EMailNotification emailNoti;
    private SMSNotification smsNoti;
    private PushNotification pushNoti;

    //method
    public SelectNotification()
    {
        this.emailNoti = new EMailNotification();
        this.smsNoti = new SMSNotification();
        this.pushNoti = new PushNotification();
    }

    public void SelectMenu()
    {
        System.out.println("--------------------");
        System.out.println("메뉴를 선택해 주세요.");
        System.out.println("1. 이메일 알림");
        System.out.println("2. SMS 알림");
        System.out.println("3. 푸시 알림");
        System.out.println("--------------------");
        Scanner sc = new Scanner(System.in);
        int inputValue = sc.nextInt();

        switch (inputValue)
        {
            case 1:
                emailNoti.send();
                break;
            case 2:
                smsNoti.send();
                break;
            case 3:
                pushNoti.send();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

    }

}
