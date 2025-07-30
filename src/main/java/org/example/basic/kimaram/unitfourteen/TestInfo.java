package org.example.basic.kimaram.unitfourteen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 커스텀 어노테이션 정의
@Retention(RetentionPolicy.RUNTIME) // 어노테이션이 런타임까지 유지됨을 의미
@Target(ElementType.METHOD)         // 어노테이션이 메서드에만 적용될 수 있음을 의미

// 어노테이션 이름 : TestInfo - TestInfo 라는 이름의 어노테이션을 정의한 것
public @interface TestInfo {
    String author();
    String date();
}
