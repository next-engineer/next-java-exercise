package org.example.basic.yunbyeongchang.unitfourteen;

public class BasicAnnotationExample {
    //var

    //method
    @Deprecated                 //로직은 남겨놓지만 사용하지 않을 예정임을 표시
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    @Override                   //상위 클래스의 메서드를 재정의
    public String toString() {
        return "BasicAnnotationExample";
    }

    public static void main(String[] args) {
        new BasicAnnotationExample().oldMethod();

        System.out.println(new BasicAnnotationExample().toString());
    }

}
