package org.example.basic.sangyoonlee.unitthirteen.optional;

import java.util.Optional;

public class OptionalMapFilter {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("carrot");

        name.filter(n -> n.startsWith("c"))
                .map(String::toUpperCase)
                .ifPresent(n -> System.out.println("변환된 이름: " + n));
    }
}
