package org.example.advaned.gojunho.unitthirteen;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent{
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    public Directory(String name){
        this.name=name;
    }

    public void add(FileComponent component){
        children.add(component);
    }

    @Override
    public void showInfo(String indent) {
        System.out.println(indent + "+ 폴더: " + name);
        for (FileComponent child : children){
            child.showInfo(indent + " ");
        }
    }
}
