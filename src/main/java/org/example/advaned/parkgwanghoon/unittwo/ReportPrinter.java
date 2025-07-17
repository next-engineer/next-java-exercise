package org.example.advaned.parkgwanghoon.unittwo;

public class ReportPrinter {
    public void print(Report report) {
        System.out.println("Title: " + report.getTitle());
        System.out.println("Content: " + report.getContent());
    }
}
