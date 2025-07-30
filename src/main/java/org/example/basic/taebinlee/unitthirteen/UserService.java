package org.example.basic.taebinlee.unitthirteen;


import java.util.Optional;

public class UserService {
    public static void main(String[] args) {
        Optional<String> email = findEmailByUsername("admin");

        String result = email.orElse("이메일 없음");
        System.out.println("결과: " + result);
    }

    public static Optional<String> findEmailByUsername(String username) {
        if ("admin".equals(username)) {
            return Optional.of("taebin@carrot.com");
        } else {
            return Optional.empty();
        }
    }
}
