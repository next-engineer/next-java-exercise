package org.example.basic.jeongyonghun.unitone;

import java.util.ArrayList;
import java.util.List;

public class Member {
    public String name;
    public String memberId;
    public ArrayList<Book> borrowedBooks;

    public void borrow(Book book) {

    }

    public void returnBook(Book book) {

    }
    
    public List<Book> listBorrwedBooks() {

        return borrowedBooks;
        
    }
}
