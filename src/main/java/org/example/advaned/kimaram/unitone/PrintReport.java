package org.example.advaned.kimaram.unitone;

// 데이터 출력
public class PrintReport {
    public static void print(Report report) {
        System.out.println("Title: " + report.getTitle());
        System.out.println("Content: " + report.getContent());
    }
}
