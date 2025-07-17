package main.java.org.example.basic.leeseungyeon.unitfive;

public class MyBook {

    // Book 클래스 정의
    static class Book {
        private final String title;
        private final String author;
        private final int price;

        // 기본 생성자: 초기값을 "제목없음", "저자미상", 0원으로 설정
        public Book() {
            this.title = "제목없음";
            this.author = "저자미상";
            this.price = 0;
        }

        // 매개변수 2개 생성자
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.price = 0;
        }

        // 매개변수 3개 생성자
        public Book(String title, String author, int price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        // 출력용 메서드
        public void printInfo() {
            System.out.printf("제목: %s / 저자: %s / 가격: %d원%n", title, author, price);
        }
    }

    // main 메서드
    public static void main(String[] args) {
        Book book1 = new Book();  // 기본 생성자 사용

        book1.printInfo();  // 제목없음 / 저자미상 / 0원 출력
    }
}