package org.example.advaned.anheebin.unitseven;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("홍길동", "hong@example.com")
                            .age(30)
                            .address("서울시 강남구")
                            .build();

        System.out.println("이름: " + user1.getName());
        System.out.println("이메일: " + user1.getEmail());
        System.out.println("나이: " + user1.getAge());
        System.out.println("주소: " + user1.getAddress());
    }
}
