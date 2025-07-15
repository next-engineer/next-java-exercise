package org.example.basic.taebinlee.unittwo;

public class Account {

    // 필드 (private 여기 필드명은 해당 클래스 안에서만 사용가능)
    private String accountNumber;
    private String ownerName;
    private double balance;

    // 생성자 (인스턴스 초기화 작업 수행)
    public Account(String accountNumber, String ownerName, double balance){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    // 입금 메서드 (특정 기능을 하는 코드를 묶어서 나타내는 것)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount+" 원 입금");
        }
        else {
            System.out.println("0 또는 0보다 작은 수는 입금할 수 없습니다");
        }
    }

    // 출금 메서드 (잔액보다 큰 금액은 출금이 불가능)
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금완료");
        }
        else {
            System.out.println("잔액부족 or 0보다 작거나 같은 금액으로 인한 오류");
        }
    }

    // 계좌 정보 출력 메서드
    public void printAccountInfo() {
        System.out.println("---------↓계좌 정보 출력↓---------");
        System.out.println("계좌번호: "+ accountNumber);
        System.out.println("사용자 명: "+ ownerName);
        System.out.println("잔액: "+ balance + "원");
    }

}
