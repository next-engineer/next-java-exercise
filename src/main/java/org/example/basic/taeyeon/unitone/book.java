package org.example.basic.taeyeon.unitone;

public class book {
        private String title;
        private String author;
        private String isbn;
        private boolean isBorrowed;

        // 생성자
        public void Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
            this.isBorrowed = false;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public void setAuthor(String author){
            this.author = author;
        }

        public void setIsbn(String isbn){
            this.isbn = isbn;
        }

        public void setBorrowed(boolean isBorrowed){
            this.isBorrowed = isBorrowed;
        }

        public String getTitle(){
            return this.title;
        }

        public String getAuthor() {
            return this.author;
        }

        public String getIsbn() {
            return this.isbn;
        }

        public boolean isBorrowed() {
            return this.isBorrowed;
        }

        // 대여 처리
        public boolean borrowBook() {
            if (!isBorrowed) {
                isBorrowed = true;
                return true; // 대여 성공
            }
            return false; // 이미 대여 중
        }

        // 반납 처리
        public boolean returnBook() {
            if (isBorrowed) {
                isBorrowed = false;
                return true; // 반납 성공
            }
            return false; // 이미 반납됨
        }
    }
