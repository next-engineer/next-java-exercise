package main.java.org.example.basic.ANheebin.onepROJECT;

import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<String> borrowedBooks = new ArrayList<>();

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName(){
        if (name == null){
            System.out.println("이름을 입력해주세요");
        } else {
            System.out.println("이름: " + name);
        }
        return name;
    }


    public String memberId(String memberId){
        if (memberId == null){
            System.out.println("회원 아이디를 입력해주세요");
        } else {
            System.out.println("회원 아이디: " + memberId);
        }
        return memberId;
    }

    public ArrayList<String> borrowedBooks(ArrayList<String> borrowedBooks){
        if (borrowedBooks == null){
            System.out.println("대여한 책이 없습니다");
        } else {
            System.out.println("대여한 책: " + borrowedBooks);
        }
        return borrowedBooks;
    }

    public static void main(String[] args) {
        Member m = new Member("안희빈", "M001");
        
        System.out.println("회원 이름: " + m.getName());
        System.out.println("회원 ID: " + m.memberId(m.memberId));
    }

}
