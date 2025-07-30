package org.example.basic.yunbyeongchang.unitfourteen.customannotation;

import java.lang.reflect.Method;

public class AnnotationReader {
    //var

    //method
    public static void main(String[] args) throws Exception {
        Method method = AnnotatedClass.class.getMethod("sampleTest");   //sampleTest라는 method를 탐색하여 정의

        if(method.isAnnotationPresent(TestInfo.class)) {                      //method에 @TestInfo가 적용되어 있다면
            TestInfo info = method.getAnnotation(TestInfo.class);             //method에 적용되어 있는 어노테이션을 불러옴
            System.out.println("Author: " + info.author());
            System.out.println("Date: " + info.date());
        }

    }

}
