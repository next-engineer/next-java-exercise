package org.example.advaned.leehyemin.unitone;

import java.util.ArrayList;
import java.util.List;

//Report 등록, 검색 메소드
public class ReportStorage {
    private List<Report> reports;

    public ReportStorage(List<Report> reports) {
        this.reports = reports;
    }

    public ReportStorage(String title, String contents) {
        this.reports = new ArrayList<Report>();
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public void addReport(Report report) {
        this.reports.add(report);
        System.out.println(report.getTitle()+"(이)가 정상적으로 등록되었습니다.");
    }

    public void selectAllReports() {
        for (Report report : reports) {
            System.out.println(report.getTitle());
        }
    }

    public void selectReportByTitle(String title) {
        for (Report report : reports) {
            if (report.getTitle().equals(title)) {
                System.out.println("제목 : "+report.getTitle());
                System.out.println("내용 : "+report.getContent());
            }
        }
    }

}
