package org.example.basic.yunbyeongchang.unitthirteen.optional;

import java.util.Optional;

public class UserService {
    //var

    //method
    public static void main(String[] args) {
        Optional<String> email = findEmailByUsername("admin");

        String result = email.orElse("Unknown Email");
        System.out.println("Result: " + result);

    }

    public static Optional<String> findEmailByUsername(String username) {
        if("admin".equals(username))
            return Optional.of("admin@carrot.com");
        else
            return Optional.empty();
    }
}
