package org.example.basic.ANheebin.unitfourteen;

import java.lang.reflect.Method;

public class AnnotationReader {
    public static void main(String[] args) throws Exception {
        Method method = AnnotatedClass.class.getMethod("sampleTest");
               if (method.isAnnotationPresent(TestInfo.class)) {
                TestInfo info = method.getAnnotation(TestInfo.class);
                System.out.println("Author: " + info.autjor());
                System.out.println("Date: " + info.date());
               }
    }
}
