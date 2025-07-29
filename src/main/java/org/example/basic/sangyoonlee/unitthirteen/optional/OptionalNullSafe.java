package org.example.basic.sangyoonlee.unitthirteen.optional;

import java.util.Optional;

public class OptionalNullSafe {
    public static void main(String[] args) {
        String name = null;

        Optional<String> optionalName = Optional.ofNullable(name);

        String result = optionalName.orElse("기본이름");
        System.out.println("결과: " + result); // 기본이름
    }
}

