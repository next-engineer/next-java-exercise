# java Basic

## 1. 클래스 와 객체

## 🧑‍💻 **과제 개요**

- **주제**: "간단한 도서 관리 시스템(Book Management System)" 만들기

---

## 📚 **과제 상세 내용**

### 1️⃣ 기본 클래스 설계

아래 클래스들을 설계하고 구현합니다.

### ✅ `Book` 클래스

- **필드**
    - `String title`
    - `String author`
    - `String isbn`
    - `boolean isBorrowed`
- **메서드**
    - 생성자
    - `borrowBook()` — 대여 처리
    - `returnBook()` — 반납 처리
    - `toString()` — 책 정보 문자열 반환

---

### ✅ `Member` 클래스

- **필드**
    - `String name`
    - `String memberId`
    - `ArrayList<Book> borrowedBooks`
- **메서드**
    - 생성자
    - `borrow(Book book)` — 책 대여
    - `returnBook(Book book)` — 책 반납
    - `listBorrowedBooks()` — 대여 중인 책 목록 출력

---

### ✅ `Library` 클래스

- **필드**
    - `ArrayList<Book> books`
    - `ArrayList<Member> members`
- **메서드**
    - `addBook(Book book)`
    - `addMember(Member member)`
    - `findBookByTitle(String title)`
    - `listAllBooks()`
    - `listAvailableBooks()`

# java advanced

## 1. 객체지향 프로그래밍
   - 상속, 다형성, 추상화
   - 인터페이스와 구현






   
