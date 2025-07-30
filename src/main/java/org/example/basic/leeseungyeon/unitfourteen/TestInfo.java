package org.example.basic.leeseungyeon.unitfourteen;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestInfo {
    String author();
    String date();
}

