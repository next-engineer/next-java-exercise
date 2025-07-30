package org.example.basic.taeyeon.unitfourteen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Annotation {

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    @Override
    public String toString() {
        return "BasicAnnotationExample";
    }

    public static void main(String[] args) {
        new Annotation().oldMethod();
    }
}
