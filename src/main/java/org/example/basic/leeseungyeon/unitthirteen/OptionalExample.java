package org.example.basic.leeseungyeon.unitthirteen;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Carrot");

        System.out.println(name.isPresent());         // true
        System.out.println(name.get());               // Carrot
        System.out.println(name.orElse("default"));   // Carrot
    }
}

// 예제 1: 기본 사용
