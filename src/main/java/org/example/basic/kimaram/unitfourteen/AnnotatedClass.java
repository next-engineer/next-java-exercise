package org.example.basic.kimaram.unitfourteen;

// 어노테이션 사용
public class AnnotatedClass {
    // Reflection : 프로그램이 실행 중에 클래스, 메서드, 필드, 어노테이션 등에 대한 정보를 읽고 조작하는 기술
    @TestInfo(author = "aram", date = "2025-07-30")  // 이 정보는 런타임까지 보존되며 Reflection을 통해 조회된다
    public void sampleTest() {
        System.out.println("Running sample test...");
    }
}
