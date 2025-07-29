package org.example.advaned.kimaram.unitseven.user;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("홍길동", "hong@example.com")
                             .age(30)
                             .address("서울시 강남구")
                             .build();

        System.out.printf("이름: %s, 이메일: %s, 나이: %d, 주소: %s%n",
                user1.getName(), user1.getEmail(), user1.getAge(), user1.getAddress());
    }
}
