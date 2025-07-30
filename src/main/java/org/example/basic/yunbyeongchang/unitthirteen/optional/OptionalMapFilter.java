package org.example.basic.yunbyeongchang.unitthirteen.optional;

import java.util.Optional;

public class OptionalMapFilter {
    //var

    //method
    public static void main(String[] args) {
        Optional<String> name = Optional.of("carrot");

        name.filter(n->n.startsWith("c"))                                   //name에 값이 있고 c로 시작할 떄
                .map(String::toUpperCase)                                         //소문자를 대문자로 변환
                .ifPresent(n-> System.out.println("변환된 이름: " + n));     //값이 존재한다면 이름 출력(CARROT)

    }
}
