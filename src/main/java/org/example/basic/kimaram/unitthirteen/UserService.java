package org.example.basic.kimaram.unitthirteen;

import java.util.Optional;

// Optional 예제 4 : 함수 리턴값에서 사용
public class UserService {
    public static void main(String[] args) {
        Optional<String> email = findEmailByUsername("admin");

        String result = email.orElse("이메일 없음");
        System.out.println("결과 : " + result);
    }

    public static Optional<String> findEmailByUsername(String username) {
        if ("admin".equals(username)) {
            return Optional.of("admin@carrot.com");
        } else {
            return Optional.empty();
        }
    }
}
