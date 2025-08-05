package org.example.advaned.yunbyeongchang.unitthirteen;

public class File implements FileComponent {
    //var
    private String name;

    //method
    public File(String name) {
        this.name = name;
    }

    @Override
    public void showInfo(String indent) {
        System.out.println(indent + "-File: " + name);
    }

}
