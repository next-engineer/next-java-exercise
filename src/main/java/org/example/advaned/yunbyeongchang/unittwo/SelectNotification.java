//package org.example.advaned.yunbyeongchang.unittwo;
//
//import java.util.Scanner;
//
//public class SelectNotification {
//    //var
//    PlayStrategy strategy;
//
//    //method
//    public SelectNotification()
//    {
//        this.strategy = new PlayStrategy();
//    }
//
//    public void selectMenu()
//    {
//        System.out.println("--------------------");
//        System.out.println("메뉴를 선택해 주세요.");
//        System.out.println("1. Email 알림");
//        System.out.println("2. SMS 알림");
//        System.out.println("3. 푸시 알림");
//        System.out.println("4. 종료");
//        System.out.println("--------------------");
//        Scanner sc = new Scanner(System.in);
//        int inputValue = sc.nextInt();
//
//        confirmValue(inputValue);
//    }
//
//    public void confirmValue(int inputValue)
//    {
//        switch (inputValue)
//        {
//            case 1:     // Email
//                this.strategy.setNotificationStrategy(new EMailNotification());
//                break;
//            case 2:     // SMS
//                this.strategy.setNotificationStrategy(new SMSNotification());
//                break;
//            case 3:     // 푸시
//                this.strategy.setNotificationStrategy(new PushNotification());
//                break;
//            case 4:     // 종료
//                System.out.println("프로그램을 종료합니다.");
//                System.exit(0);
//            default:
//                this.strategy = null;
//                System.out.println("잘못된 입력입니다.");
//        }
//
//        if(this.strategy != null) this.strategy.send();
//    }
//
//}
