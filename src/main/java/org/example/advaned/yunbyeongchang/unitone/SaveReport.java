package org.example.advanced.yunbyeongchang.unitone;

public class SaveReport {
    //var

    //method
    public void saveToFile(Report report, String fileName)
    {
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
