package org.example.advaned.sangyoonlee.unitone;

public class File {
    private final String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void saveToFile(String fileName, String title, String content) {
        try {
            java.io.FileWriter writer = new java.io.FileWriter(fileName);
            writer.write("Title: " + title + "\\n");
            writer.write("Content: " + content + "\\n");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
