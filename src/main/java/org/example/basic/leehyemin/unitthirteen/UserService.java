package org.example.basic.leehyemin.unitthirteen;

import java.util.Optional;

public class UserService {
    public static void main(String[] args) {
        Optional<String> email = findEmailByUsername("user1");

        String result = email.orElse("이메일 없음");
        System.out.println("결과 : "+result);
    }

    public static Optional<String> findEmailByUsername(String username) {
        if("admin".equals(username)) {
            return Optional.of("admin@carrot.com");
        } else {
            return Optional.empty();
        }
    }
}
