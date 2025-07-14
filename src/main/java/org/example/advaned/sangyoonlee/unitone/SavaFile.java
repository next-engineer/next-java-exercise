package org.example.advaned.sangyoonlee.unitone;

public class SavaFile {

    public static void main(String[] args) {
        File file = new File("file_name");
        Report report = new Report("title", "content");

        file.saveToFile(file.getFileName(), report.getTitle(), report.getContent());
    }
}
