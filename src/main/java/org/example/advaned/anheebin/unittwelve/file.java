package org.example.advaned.anheebin.unittwelve;

public class file implements FileComponent {
    private String name;

    public file(String name) {
        this.name = name;
    }

    @Override
    public void showInfo(String indent) {
        System.out.println(indent + "- 파일: " + name);
    }

    @Override
    public void add(FileComponent component) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void remove(FileComponent component) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
