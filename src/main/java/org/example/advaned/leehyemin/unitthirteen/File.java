package org.example.advaned.leehyemin.unitthirteen;

public class File implements FileComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showInfo(String indent) {
        System.out.println(indent+"- 파일 : "+name);
    }
}
