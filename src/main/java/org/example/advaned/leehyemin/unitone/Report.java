package org.example.advaned.leehyemin.unitone;

import java.util.ArrayList;
import java.util.List;

//보고서 작성
public class Report {
    private String title;
    private String content;

    //생성자
    public Report(String title, String content) {
        this.title = title;
        this.content = content;
    }
    //getter setter 메소드
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    //    public void printReport() {
//        System.out.println("Title: " + title);
//        System.out.println("Content: " + content);
//    }

//    public void saveToFile(String fileName) {
//        try {
//            java.io.FileWriter writer = new java.io.FileWriter(fileName);
//            writer.write("Title: " + title + "\\n");
//            writer.write("Content: " + content + "\\n");
//            writer.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
