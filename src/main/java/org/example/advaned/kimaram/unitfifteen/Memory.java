package org.example.advaned.kimaram.unitfifteen;

// 서브 시스템 3 - Memory
public class Memory {
    public void load(long position, String data) {
        System.out.println("Memory: load data '" + data + "' at position " + position);
    }

    public void clear() {System.out.println("Memory: clear");}
}
