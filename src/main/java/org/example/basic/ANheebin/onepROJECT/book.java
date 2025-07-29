package main.java.org.example.basic.ANheebin.onepROJECT;

class book {
    public String title;
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
        book book1 = new book("오리엔트 특급 살인사건", "애거서 크리스티", "11111", false);
        book book2 = new book("피터팬", "J.M. 배리", "22222", false);
        book book3 = new book("그리고 아무도 없었다", "애거서 크리스티", "33333", false);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        book1.borrow();
        book2.borrow();
        book3.borrow();
               
    }
}