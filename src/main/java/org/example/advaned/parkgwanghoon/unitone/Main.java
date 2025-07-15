package org.example.advaned.parkgwanghoon.unitone;

public class Main {
    public static void main(String[] args) {
        Report report = new Report("Supernova", "잔인한 퀸이며 씬이자 종결 \n 이토록 거대한 내 안의 익스플로전 \n 내 모든 세포 별로부터 만들어져");

        ReportPrinter printer = new ReportPrinter();
        printer.print(report);  // 출력

        ReportSaver saver = new ReportSaver();
        saver.save(report, "report.txt");  // 파일 저장
    }
}
