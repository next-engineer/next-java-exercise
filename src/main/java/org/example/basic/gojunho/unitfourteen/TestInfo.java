package org.example.basic.gojunho.unitfourteen;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestInfo {
    String author();
    String date();
}
