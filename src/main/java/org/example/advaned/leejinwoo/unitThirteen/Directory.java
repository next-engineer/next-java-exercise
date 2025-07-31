package org.example.advaned.leejinwoo.unitThirteen;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent{
    @Override
    public void showInfo(String indent) {
        System.out.println(indent + "+ 폴더: " + name);
        for (FileComponent child : children) {
            child.showInfo(indent + "  ");
        }
    }

    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

}
