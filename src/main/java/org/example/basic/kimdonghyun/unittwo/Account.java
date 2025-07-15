package org.example.basic.kimdonghyun.unittwo;

// 클래스 생성
public class Account {
    private String AN;
    private String ON;
    private double BAL;



    //생성자
    public Account(String AN, String ON, double BAL){
        this.AN = AN;
        this.ON = ON;
        this.BAL = BAL;}




    //입금 메소드
    public void deposit(double amount){
        if (amount > 0) {
            BAL += amount;
            System.out.println(amount + "원이 입금 되었습니다.");

            System.out.println("잔액은" + BAL + amount + "입니다.");
        }
        else {
            System.out.println("입금액을 확인하십시오.");
        }
    }

    //출금 메소드
    public void withdraw(double amount){
        if (amount > BAL){
            System.out.println("잔액이 부족합니다.");
        } else if (amount <= 0){
            System.out.println("출금액을 확인하십시오.");
        } else{
            BAL -= amount;
            System.out.println(amount + "원이 출금 되었습니다.");
        }


    // 계좌 정보 조회
    }
    public void printAccountInfo(){
        System.out.println("계좌번호:" + AN);
        System.out.println("예금주명:" + ON);
        System.out.println("잔액:" + BAL + "원");
    }

}
