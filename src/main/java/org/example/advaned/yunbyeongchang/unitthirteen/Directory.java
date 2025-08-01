package org.example.advaned.yunbyeongchang.unitthirteen;

import java.util.*;

public class Directory implements FileComponent{
    //var
    private String name;
    private List<FileComponent> children = new ArrayList<>();

    //method
    public Directory(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    @Override
    public void showInfo(String indent) {
        System.out.println(indent + "+Folder: " + name);
        for(FileComponent child:children) {
            child.showInfo(indent + " ");
        }
    }

}
