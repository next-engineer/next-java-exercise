package org.example.basic.yunbyeongchang.unitfourteen.customannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)     //런타임 단계까지 정의가 유지됨
@Target(ElementType.METHOD)             //method 타입에 붙일 수 있음
public @interface TestInfo {            //커스텀 어노테이션 생성(author, date가 필수 요소로 들어감)
    //method
    String author();
    String date();
}
