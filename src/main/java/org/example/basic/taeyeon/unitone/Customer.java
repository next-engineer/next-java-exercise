package org.example.basic.taeyeon.unitone;

public class Customer {
    private String name;
    private String grade;
    private int point;

    public Customer(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    // 할인된 가격 계산: BASIC 0%, SILVER 5%, GOLD 10%
    public int calculateDiscountPrice(int price) {
        if ("GOLD".equalsIgnoreCase(grade)) {
            return price - price * 10 / 100;
        } else if ("SILVER".equalsIgnoreCase(grade)) {
            return price - price * 5 / 100;
        } else {
            return price; // BASIC 또는 그 외
        }
    }

    // 고객 정보 출력
    public void showCustomerInfo() {
        System.out.println("이름: " + name);
        System.out.println("등급: " + grade);
        System.out.println("포인트: " + point);
    }

    // 추가 과제: 구매 금액의 1% 적립 (GOLD는 추가 2%, SILVER는 1%)
    public void earnPoints(int price) {
        int percent = 1; // 기본 1%
        if ("GOLD".equalsIgnoreCase(grade)) {
            percent += 2;  // GOLD는 총 3%
        } else if ("SILVER".equalsIgnoreCase(grade)) {
            percent += 1;  // SILVER는 총 2%
        }
        int earned = price * percent / 100;
        point += earned;
        System.out.printf("적립 포인트: %d원 (등급: %s, %d%%)\n", earned, grade, percent);
    }

    // getter, setter (필요시)
    public String getName() { return name; }
    public String getGrade() { return grade; }
    public int getPoint() { return point; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setPoint(int point) { this.point = point; }
}
