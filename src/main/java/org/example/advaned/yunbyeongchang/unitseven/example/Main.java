package org.example.advaned.yunbyeongchang.unitseven.example;

public class Main {
    //var

    //method
    public static void main(String[] args)
    {
        User user = new User.UserBuilder("홍길동", "hong@example.com")
                .age(30)
                .address("산")
                .build();

        System.out.println("이름: " + user.getName());
        System.out.println("이메일: " + user.getEmail());
        System.out.println("나이: " + user.getAge());
        System.out.println("주소: " + user.getAddress());

    }
}
