package org.example.basic.leejinwoo.unitone;

import java.util.ArrayList;

public class Library {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Member> members = new ArrayList<>();

    public static void addBook(Book book, ArrayList<Book> books){
        books.add(book);
    }

    public static void addMember(Member member, ArrayList<Member> members){
        members.add(member);
    }

    public static boolean fineBookByTitle(String title){
        boolean result = false;

        if(title.equals("EFGH")){
            return true;
        }
        return false;
    }

    public static void listAllBooks(ArrayList<Book> books){
        for(Book list : books){
            System.out.println("책 목록 : " + list.getTitle());
        }
    }

    public static void listAvailableBooks(ArrayList<Book> books){

        for(Book list : books){
            if(!list.isBorrowed()){
                System.out.println("대여 가능 목록 : " + list.getTitle());
            }
        }

    }

    public static void main(String[] args){

        Book book1 = new Book();
        book1.setTitle("ABCD");
        book1.setAuthor("A");
        book1.setIsbn("O");
        book1.setBorrowed(false);

        addBook(book1, books);  //책 추가

        Book book2 = new Book();
        book2.setTitle("EFGH");
        book2.setAuthor("V");
        book2.setIsbn("O");
        book2.setBorrowed(false);

        addBook(book2, books); // 책 추가

        Member member = new Member();
        member.setMemberId("Rr");
        member.setName("이진우");
        member.setBorrowedBooks(new ArrayList<>());

        addMember(member, members); //회원 추가

        for(Book list : books){
            if(fineBookByTitle(list.getTitle())){   //책 타이틀 검색
                System.out.println(list.getTitle());
            }
        }

        listAllBooks(books); //책목록
        listAvailableBooks(books); //대여 가능 목록
    }
}
