package org.example.advaned.yunbyeongchang.unitfifteen.homework;

public class Memory {
    //method
    public void load(long position, String data) {
        System.out.println("Memory: load data '" + data + "' at position " + position);
    }

    public void unload() {
        System.out.println("Memory: unload data");
    }
}
