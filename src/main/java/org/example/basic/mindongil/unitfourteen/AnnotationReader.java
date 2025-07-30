package org.example.basic.mindongil.unitfourteen;
import java.lang.reflect.Method;

public class AnnotationReader {
    public static void main(String[] args) throws Exception {
        //어노테이션 메소드를 가져와 사용
        Method method = AnnotatedClass.class.getMethod("sampleTest");
        if (method.isAnnotationPresent(TestInfo.class)) {
            //TestInfo 객체를 만들어서 사용
            TestInfo info = method.getAnnotation(TestInfo.class);
            System.out.println("Author: " + info.author());
            System.out.println("Date: " + info.date());
        }
    }
}
