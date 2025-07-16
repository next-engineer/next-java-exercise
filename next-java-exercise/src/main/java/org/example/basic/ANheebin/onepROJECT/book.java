package org.example.basic.ANheebin;

class book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public book(String title, String author, String isbn, boolean isBorrowed ) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = isBorrowed;
    }

    public boolean isBorrowed(){
        return this.isBorrowed;
    }

    public boolean borrow(){
        if (!this.isBorrowed){
            this.isBorrowed = true;
            System.out.println("책이 대여됐습니다");
        }else{
            System.out.println("책이 이미 대여중입니다");
        }
        return this.isBorrowed;
    }

    public boolean returnBook(){
        if (this.isBorrowed){
            this.isBorrowed = false;
            System.out.println("책이 반납됐습니다");
        }else{
            System.out.println("책이 이미 반납되었습니다");
        }
        return this.isBorrowed;
    }

    @Override
    public String toString(){
        return "책 제목: " + title + ", 저자: " + author + ", ISBN: " + isbn + ", 대여 상태: " + (isBorrowed ? "대여중" : "대여 가능");
        
    }
    public static void main(String[] args) {

        
       

    }
}