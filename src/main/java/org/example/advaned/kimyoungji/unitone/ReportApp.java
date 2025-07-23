package org.example.advaned.kimyoungji.unitone;

public class ReportApp {
    public static void main(String[] args) {
        Report report = new Report("업무 보고서", "오늘도 열심히 일했습니다.");

        ReportPrinter printer = new ReportPrinter();
        printer.print(report);

        ReportSaver saver = new ReportSaver();
        saver.saveToFile(report, "report.txt");
    }
}
