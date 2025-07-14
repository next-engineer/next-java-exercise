package org.example.basic.yunbyeongchang.unitone;

public class Main {
    //var
    public static Library library;
    public static Book book1;
    public static Book book2;
    public static Member member;

    //method
    public static void main(String[] args)
    {
        library = new Library();
        book1 = new Book("책 이름", "작가", "번호", false);
        book2 = new Book("책 이름2", "작가2", "번호2", false);
        member = new Member("멤버 이름", "멤버_ID");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member);

        member.borrow(book1);
        member.listBorrowedBooks();

        library.listAllBooks();
        library.listAvailableBooks();

        member.returnBook(book1);
        library.listAvailableBooks();

        System.out.print("책 이름으로 검색한 결과 : ");
        library.findBookByTitle("책 이름");

    }
}
