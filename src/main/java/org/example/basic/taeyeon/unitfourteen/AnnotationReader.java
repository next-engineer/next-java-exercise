package org.example.basic.taeyeon.unitfourteen;

import java.lang.reflect.Method;

class AnnotationReader {
    public static void main(String[] args) throws Exception {
        Method method = AnnotatedClass.class.getMethod("sampleTest");
        if (method.isAnnotationPresent(TestInfo.class)) {
            TestInfo info = method.getAnnotation(TestInfo.class);
            System.out.println("Author: " + info.author());
            System.out.println("Date: " + info.date());
        }
    }
}
