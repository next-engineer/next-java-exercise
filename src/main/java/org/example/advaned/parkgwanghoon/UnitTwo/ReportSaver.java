package org.example.advaned.parkgwanghoon.UnitTwo;

import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
    public void save(Report report, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Title: " + report.getTitle() + "\n");
            writer.write("Content: " + report.getContent() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
