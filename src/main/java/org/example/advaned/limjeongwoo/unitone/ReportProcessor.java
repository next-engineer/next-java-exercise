package org.example.advaned.limjeongwoo.unitone;

public class ReportProcessor {

    public static void main(String[] args) {

        Report report = new Report("리포트 제목", "리포트 내용");

        PrintReport.print(report);

        SaveToFile saveToFile = new SaveToFile();
        saveToFile.save("report.txt", report);

    }
}
