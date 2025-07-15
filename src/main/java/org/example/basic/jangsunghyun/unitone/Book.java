package org.example.basic.jangsunghyun.unitone;
 main

public class Book {
String title;
String author;
String isbn;
boolean isBorrowed = false;

public Book(String title, String author, String isbn){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
}

public void BorrowedBook(){
    if (isBorrowed == true) System.out.println("이미 대여 중입니다");
    else {
        isBorrowed = true;
        System.out.println("대여 하였습니다");
    }
}

public  void returnBook(){
    if (isBorrowed == false) System.out.println("이미 반납된 책입니다");
    else {
        isBorrowed = false;{
            System.out.println("반납 하였습니다");
        }
    }
}
public String toString() {
    return "제목: " + title + "저자: " + author + "대여현황: " + isBorrowed;
}
}
