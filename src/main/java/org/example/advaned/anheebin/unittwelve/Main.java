package org.example.advaned.anheebin.unittwelve;

public class Main {
    public static void main(String[] args) {
        FileComponent file1 = new file("hello.txt");
        FileComponent file2 = new file("readme.md");
        FileComponent file3 = new file("logo.png");

        Directory imgFolder = new Directory("images");
        imgFolder.add(file3);

        Directory root =new Directory("root");
        root.add(file1);
        root.add(file2);
        root.add(imgFolder);

        root.showInfo("");
    }
}
