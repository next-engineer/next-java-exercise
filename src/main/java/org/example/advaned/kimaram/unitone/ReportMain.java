package org.example.advaned.kimaram.unitone;

// Report Main
public class ReportMain {
    public static void main(String[] args) {
        Report report = new Report("제목", "내용");

        PrintReport.print(report);

        SaveReport.saveToFile("파일명", report);
    }
}
