package org.example.basic.parkgwanghoon.UnitOne;

public class Main {
    public static void main(String[] args) {
        // Library 객체 생성
        Library library = new Library();

        // Book 추가
        library.addBook(new Book("자바의 정석", "김철수", 2021));
        library.addBook(new Book("Effective Java", "Joseph Lee", 2018));

        // Member 추가
        library.addMember(new Member("김영희", 30, 20250001));
        library.addMember(new Member("박철수", 27, 20250002));

        // 출력
        library.printAllBooks();
        library.printAllMembers();

    }
}