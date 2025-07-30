package org.example.basic.kimaram.unitthirteen;

import java.util.Optional;

// Optional : null 값을 감싸는 Wrapper 클래스, null을 직접 다루지 않고 명시적으로 API를 통해 처리하게 유도
// Optional 예제 1 : 기본 사용
public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Carrot");

        System.out.println(name.isPresent());           // true
        System.out.println(name.get());                 // Carrot
        System.out.println(name.orElse("default"));// Carrot
    }
}
