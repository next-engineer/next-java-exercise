package org.example.advaned.kimaram.unittwo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NotificationSender {
    private final Notification email = new EmailNotification();
    private final Notification sms = new SMSNotification();
    private final Notification push = new PushNotification();

    public void sender() {
        // 사용자 선택을 받기 위한 스캐너 선언
        Scanner sc = new Scanner(System.in);

        System.out.println("알림 받으실 방식의 번호를 선택하세요. [이메일: 1, SMS: 2, PUSH: 3]");
        String str = sc.nextLine();

        // 숫자인지 아닌지 판별
        if (str.chars().allMatch(Character::isDigit)) {
            // 세 자리 수까지인지 판별
            if (str.length() <= 3) {
                int number = Integer.parseInt(str);
                // 중복된 숫자 거르기 위한 Set 사용
                Set<Integer> used = new HashSet<>();

                for (int i = 0; i < str.length(); i++) {
                    int num = number % 10;
                    number /= 10;

                    //이미 처리한 숫자면 skip
                    if(used.contains(num)){
                        continue;
                    }

                    used.add(num);

                    switch (num) {
                        case 1:
                            email.send();
                            break;
                        case 2:
                            sms.send();
                            break;
                        case 3:
                            push.send();
                            break;
                    }
                }
            } else {
                System.out.println("선택할 수 있는 갯수를 넘겼습니다.");
            }
        } else {
            System.out.println("번호가 아닙니다. 번호를 선택해주세요.");
        }
    }
}
