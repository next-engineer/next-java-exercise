package org.example.advaned.leejinwoo.unitone;

public class SaveToFile {

    public static void main(String[] args) {
        Report report = new Report("보고서", "보고서 내용");
        saveToFile(report);
    }

    public static void saveToFile(Report report){
        try {
            java.io.FileWriter writer = new java.io.FileWriter(report.getTitle());
            writer.write("Title: " + report.getTitle() + "\\n");
            writer.write("Content: " + report.getContent() + "\\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
