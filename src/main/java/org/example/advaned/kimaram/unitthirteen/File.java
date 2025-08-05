package org.example.advaned.kimaram.unitthirteen;

// Leaf : 단일 객체
public class File implements FileComponent{
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showInfo(String indent) {
        System.out.println(indent + "-파일: " + name);
    }
}
