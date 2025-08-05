package org.example.advaned.leejinwoo.unitThirteen;

public class File implements FileComponent{
    @Override
    public void showInfo(String indent) {
        System.out.println(indent + "- 파일: " + name);
    }

    private String name;

    public File(String name) {
        this.name = name;
    }
}
