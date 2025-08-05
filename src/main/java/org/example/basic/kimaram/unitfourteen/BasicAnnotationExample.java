package org.example.basic.kimaram.unitfourteen;

public class BasicAnnotationExample {

    @Deprecated // 미사용 어노테이션 : 빌드할 때 워닝 메시지를 보여준다. 컴파일러에게 이 메소드는 없어질거라는걸알려죽 쓰지 말도록 경고하는 것
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    @Override // 오버라이드 어노테이션 : 부모 메서드 재정의
    public String toString() {
        return "BasicAnnotationExample";
    }

    public static void main(String[] args) {
        new BasicAnnotationExample().oldMethod();
    }
}
