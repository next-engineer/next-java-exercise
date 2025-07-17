package org.example.advaned.kimyoungji.unitone;

import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
    public void saveToFile(Report report, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Title: " + report.getTitle() + "\n");
            writer.write("Content: " + report.getContent() + "\n");
            System.out.println("파일 저장 완료: " + fileName);
        } catch (IOException e) {
            System.out.println("파일 저장 실패:");
            e.printStackTrace();
        }
    }
}
