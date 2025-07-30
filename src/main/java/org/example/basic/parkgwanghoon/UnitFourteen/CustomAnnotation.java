package org.example.basic.parkgwanghoon.UnitFourteen;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CustomAnnotation {
    String author();
    String date();
}
