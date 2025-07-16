package org.example.advaned.kimaram.unitone;

import java.io.FileWriter;

// 파일 저장
public class SaveReport {
    public static void saveToFile(String fileName, Report report){
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("Title: " + report.getTitle()  + "\\n");
            writer.write("Content: " + report.getContent() + "\\n");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
