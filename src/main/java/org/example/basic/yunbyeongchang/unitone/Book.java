package org.example.basic.yunbyeongchang.unitone;

public class Book {
    //var
    private String title;           // 제목
    private String author;          // 저자
    private String isbn;            // 도서번호
    private boolean isBorrowed;     // 대여 여부

    //method
    public Book(String title, String author, String isbn, boolean isBorrowed)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    public void borrowBook() // 대여 처리
    {
        this.isBorrowed = true;
        System.out.println(this.title + "이(가) 대여되었습니다.");
    }

    public void returnBook() // 반납 처리
    {
        this.isBorrowed = false;
        System.out.println(this.title + "이(가) 반납되었습니다.");
    }

    public String toString() // 책 정보 문자열 반환
    {
        return this.title + ", " + this.author + ", " + this.isbn;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public String getIsbn()
    {
        return this.isbn;
    }

    public boolean getIsBorrowed()
    {
        return this.isBorrowed;
    }
}
