package org.example.advaned.limjeongwoo.unitone;

public class SaveToFile {

    public void save(String fileName, Report report) {
        try {
            java.io.FileWriter writer = new java.io.FileWriter(fileName);
            writer.write("Title: " + report.getTitle() + "\\n");
            writer.write("Content: " + report.getContent() + "\\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
