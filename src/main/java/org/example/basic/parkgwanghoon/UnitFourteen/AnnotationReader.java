package org.example.basic.parkgwanghoon.UnitFourteen;

import java.lang.reflect.Method;

public class AnnotationReader {
    public static void main(String[] args) throws Exception {
        Method method = AnnotatedClass.class.getMethod("sampleTest");
        if (method.isAnnotationPresent(CustomAnnotation.class)){
            CustomAnnotation info = method.getAnnotation(CustomAnnotation.class);
            System.out.println("Author: " + info.author());
            System.out.println("Date: " + info.date());
        }
    }
}
