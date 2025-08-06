package org.example.advaned.leehyemin.unitfifteen.homework;

public class Memory {
    public void load(long position, String data) {
        System.out.println("Memory : load data '"+data+"' at position "+position);
    }

    public void clear() {
        System.out.println("Memory : clear all data");
    }
}
