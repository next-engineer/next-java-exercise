package org.example.advaned.leejinwoo.unitThirteen;

public class Main {
    public static void main(String[] args) {
        FileComponent file1 = new File("hello.txt");
        FileComponent file2 = new File("readme.md");
        FileComponent file3 = new File("logo.png");

        Directory imgFolder = new Directory("images");
        imgFolder.add(file3);

        Directory root = new Directory("root");
        root.add(file1);
        root.add(file2);
        root.add(imgFolder);

        root.showInfo("");
    }
}
