package org.example.basic.kimdonghyun.unitTwelve;
public class StringToNumber {
    public static void main(String[] args) {
        String input = "123a";  // 잘못된 숫자

        try {
            int number = Integer.parseInt(input);
            System.out.println("변환된 숫자: " + number);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 잘못되었습니다.");
        }
    }
}
