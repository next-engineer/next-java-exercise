package org.example.basic.sangyoonlee.unitfourteen.sangyoonannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AllowedWords {
    String[] value(); // 허용된 단어들
}