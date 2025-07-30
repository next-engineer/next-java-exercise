package org.example.basic.yunbyeongchang.unitfourteen.customannotation;

public class AnnotatedClass {
    //var

    //method
    @TestInfo(author = "like98100", date = "2025-07-30")        //sampleTest method에 TestInfo 적용
    public void sampleTest() {
        System.out.println("Running sample test...");
    }
}
