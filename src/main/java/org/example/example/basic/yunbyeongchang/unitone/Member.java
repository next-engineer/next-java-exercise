package org.example.basic.yunbyeongchang.unitone;

import java.util.ArrayList;

public class Member {
    //var
    private String name;                        // 멤버 이름
    private String memberId;                    // 멤버 ID
    private ArrayList<Book> borrowedBooks;      // 대여한 책 리스트
    
    //method
    public Member(String name, String memberId)
    {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrow(Book book)        // 책 대여
    {
        this.borrowedBooks.add(book);
        book.borrowBook();
    }
    
    public void returnBook(Book book)    // 책 반납
    {
        for(int i = 0; i < borrowedBooks.size(); i++)
        {
            if(this.borrowedBooks.get(i) == book)
            {
                this.borrowedBooks.remove(i);
                book.returnBook();
                break;
            }
        }
    }
    
    public void listBorrowedBooks()      // 대여 중인 책 리스트 출력
    {
        System.out.print(this.name + "님께서 빌린 책 : ");
        for (Book borrowedBook : this.borrowedBooks)
            System.out.print(borrowedBook.getTitle() + " ");

        System.out.println();
    }


    public String getName()
    {
        return this.name;
    }

    public String getMemberId()
    {
        return this.memberId;
    }

    public ArrayList<Book> getBorrowedBooks()
    {
        return this.borrowedBooks;
    }
    
}
