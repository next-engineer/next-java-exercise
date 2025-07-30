package org.example.basic.mindongil.unitfourteen;

public class AnnotatedClass {

    //TestInfo 내에 있는 author,date를 다시 쓰며 정보를 저장
    @TestInfo(author = "DongIl", date = "2025-07-30")
    public void sampleTest() {
        System.out.println("Running sample test...");
    }

}
